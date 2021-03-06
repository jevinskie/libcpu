project(upcl)

include(FindFLEX)
include(FindBISON)

# Don't use -Werror
REMOVE_DEFINITIONS(-Werror)
ADD_DEFINITIONS(-DYYDEBUG=1)

include_directories(BEFORE
  ${PROJECT_SOURCE_DIR}
  ${CMAKE_CURRENT_BINARY_DIR})

bison_target(UpccParser ast/parser.y
  ${CMAKE_CURRENT_BINARY_DIR}/parser.cpp)
flex_target(UpccLexer ast/lexer.l
  ${CMAKE_CURRENT_BINARY_DIR}/lexer.cpp)
add_flex_bison_dependency(UpccLexer UpccParser)

set_source_files_properties(ast/parser.cpp ast/lexer.cpp
  OBJECT_DEPENDS ast/ast.h)

add_executable(upcc
  strnatcmp.c
  main.cpp
  ast/parse.cpp
  ast/dumper.cpp
  sema/simple_expr_evaluator.cpp
  sema/register_dep_tracker.cpp
  sema/convert.cpp
  sema/expr_convert.cpp
  sema/register_file_builder.cpp
  c/sema_analyzer.cpp
  c/register_def.cpp
  c/sub_register_def.cpp
  c/decoder_operand_def.cpp
  c/temp_value_def.cpp
  c/expression.cpp
  c/cast_expression.cpp
  c/unary_expression.cpp
  c/binary_expression.cpp
  c/bit_slice_expression.cpp
  c/bit_combine_expression.cpp
  c/register_expression.cpp
  c/decoder_operand_expression.cpp
  c/memory_ref_expression.cpp
  c/temp_value_expression.cpp
  c/expression_dumper.cpp
  c/statement.cpp
  c/store_statement.cpp
  c/assign_statement.cpp
  cg/generate.cpp
  cg/libcpu_expression_generator.cpp
  ${FLEX_UpccLexer_OUTPUTS}
  ${BISON_UpccParser_OUTPUTS}
  )
