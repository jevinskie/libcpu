NAME: "OpenBSD 4.1"
NAMESPACE: obsd41
LIMIT: 306
BAE: EFAULT

CALLS

0 word syscall (word, ...)
1 word exit (word)
2 word fork (void)
3 word read (word, ptr, word)
4 word write (word, ptr, word)
5 word open (ptr, word, word)
6 word close (word)
7 word wait4 (word, ptr, word, word)
8 word creat_compat43 (ptr, word)
9 word link (ptr, ptr)
10 word unlink (ptr)
11 word oexecve (ptr, ptr, ptr)
12 word chdir (ptr)
13 word fchdir (word)
14 word mknod (ptr, word, word)
15 word chmod (ptr, word)
16 word chown (ptr, word, word)
17 ptr brk (intptr)
18 word getfsstat_compat25 (ptr)
19 word lseek_compat43 (word, word, word)
20 word getpid (void)
21 word mount (ptr, ptr, word, ptr)
22 word umount (ptr, word)
23 word setuid (word)
24 word getuid (void)
25 word geteuid (void)
26 word ptrace (word, word, ptr, word)
27 word recvmsg (word, ptr, word)
28 word sendmsg (word, ptr, word)
29 word recvfrom (word, ptr, word, word, ptr, ptr)
30 word accept (word, ptr, ptr)
31 word getpeername (word, ptr, ptr)
32 word getsockname (word, ptr, ptr)
33 word access (ptr, word)
34 word chflags (ptr, word)
35 word fchflags (word, word)
36 word sync (void)
37 word kill (word, word)
38 word stat_compat43 (ptr, ptr)
39 word getppid (void)
40 word lstat_compat43 (ptr, ptr)
41 word dup (word)
42 word opipe (void)
43 word getegid (void)
44 word profil (ptr, word, word, word)
45 word ktrace (ptr, word, word, word)
46 word sigaction (word, ptr, ptr)
47 word getgid (void)
48 word sigprocmask (word, word)
49 word getlogin (ptr, word)
50 word setlogin (ptr)
51 word acct (ptr)
52 word sigpending (void)
53 word osigaltstack (word, ptr, ptr)
54 word ioctl (word, intptr, intptr)
55 word reboot (word)
56 word revoke (ptr)
57 word symlink (ptr, ptr)
58 word readlink (ptr, ptr, word)
59 word execve (ptr, ptr, ptr)
60 word umask (word)
61 word chroot (ptr)
62 word fstat_compat43 (word, ptr)
63 word getkerninfo_compat43 (void)
64 word getpagesize_compat43 (void)
65 word msync_compat43 (void)
66 word vfork (void)
67 word ovread (word, ptr, word)
68 word ovwrite (word, ptr, word)
69 ptr sbrk (word)
70 ptr sstk (word)
71 word mmap_compat43 (void)
72 word vadvise (word)
73 word munmap (ptr, word)
74 word mprotect (ptr, word, word)
75 word madvise (ptr, word, word)
76 word ovhangup (void)
77 word ovlimit (void)
78 word mincore (ptr, word, ptr)
79 word getgroups (word, ptr)
80 word setgroups (word, ptr)
81 word getpgrp (void)
82 word setpgid (word, word)
83 word setitimer (word, ptr, ptr)
84 word wait_compat43 (word)
85 word swapon_compat25 (ptr)
86 word getitimer (word, ptr)
87 word gethostname_compat43 (ptr, word)
88 word sethostname_compat43 (ptr, word)
89 word getdtablesize_compat43 (void)
90 word dup2 (word, word)

92 word fcntl (word, word, intptr)
93 word select (word, ptr, ptr, ptr, ptr)

95 word fsync (word)
96 word setpriority (word, word, word)
97 word socket (word, word, word)
98 word connect (word, ptr, word)
99 word accept_compat43 (word, ptr, ptr)
100 word getpriority (word, word)
101 word send_compat43 (word, ptr, word)
102 word recv_compat43 (word, ptr, word)
103 word sigreturn (word, ptr, word)
104 word bind (word, ptr, word)
105 word setsockopt (word, word, word, ptr, word)
106 word listen (word, word)
107 word ovtimes (void)
108 word sigvec_compat43 (word, ptr, ptr)
109 word sigblock_compat43 (word)
110 word sigsetmask_compat43 (word)
111 word sigsuspend (word)
112 word sigstack_compat43 (void)
113 word recvmsg_compat43 (word, ptr, word)
114 word sendmsg_compat43 (word, ptr, word)
115 word ovtrace (void)
116 word gettimeofday (ptr, ptr)
117 word getrusage (word, ptr)
118 word getsockopt (word, word, word, ptr, ptr)
119 word oresuba (void)
120 word readv (word, ptr, word)
121 word writev (word, ptr, word)
122 word settimeofday (ptr, ptr)
123 word fchown (word, word, word)
124 word fchmod (word, word)
125 word recvfrom_compat43 (word, ptr, word, word, ptr, ptr)
126 word setreuid (word, word)
127 word setregid (word, word)
128 word rename (ptr, ptr)
129 word truncate_compat43 (ptr, word)
130 word ftruncate_compat43 (word, word)
131 word flock (word, word)
132 word mkfifo (ptr, word)
133 word sendto (word, ptr, word, word, ptr, word)
134 word shutdown (word, word)
135 word socketpair (word, word, word, ptr)
136 word mkdir (ptr, word)
137 word rmdir (ptr)
138 word utimes (ptr, ptr)
139 word sigreturn_compat42 (ptr)
140 word adjtime (ptr, ptr)
141 word getpeername_compat43 (ptr, word)
142 word gethostid_compat43 (ptr, word)
143 word sethostid_compat43 (ptr)
144 word getrlimit_compat43 (word, ptr)
145 word setrlimit_compat43 (word, ptr)
146 word killpg_compat43 (word, word)
147 word setsid (void)
148 word quotactl (ptr, word, word, ptr)
149 word quota_compat43 (void)
150 word getsockname_compat43 (ptr, word)




155 word nfssvc (word, ptr)
156 word getdirentries_compat43 (void)
157 word statfs_compat25 (void)
158 word statfs_compat26 (void)


161 word getfh (ptr, ptr)
162 word getdomainname_compat09 (ptr, word)
163 word setdomainname_compat09 (ptr, word)
164 word uname_compat09 (ptr)
165 word sysarch (word, ptr)



169 word semsys_compat10 (void)
170 word msgsys_compat10 (void)
171 word shmsys_compat10 (void)

173 word pread (word, ptr, word, word, dword)
174 word pwrite (word, ptr, word, word, dword)





181 word setgid (word)
182 word setegid (word)
183 word seteuid (word)
184 word lfs_bmapv (ptr, ptr, word)
185 word lfs_markv (ptr, ptr, word)
186 word lfs_segclean (ptr, intptr)
187 word lfs_segwait (ptr, ptr)
188 word stat_compat35 (word, ptr)
189 word fstat_compat35 (word, ptr)
190 word lstat_compat35 (word, ptr)
191 intptr pathconf (ptr, word)
192 intptr fpathconf (word, word)
193 word swapctl (word, ptr, word)
194 word getrlimit (word, ptr)
195 word setrlimit (word, ptr)
196 word getdirentries (word, ptr, word, ptr)
197 intptr mmap (intptr, word, word, word, word, intptr, dword)
198 dword __syscall (dword, ...)
199 dword lseek (word, word, dword, word)
200 word truncate (ptr, dword)
201 word ftruncate (word, dword)
202 word __sysctl (ptr, word, ptr, ptr, ptr, word)
203 word mlock (ptr, word)
204 word munlock (ptr, word)

206 word futimes (word, ptr)
207 word getpgid (word)
208 word xfspioctl (word, ptr, word, ptr, word)

220 word semctl_compat23 (void)
221 word semget (word, word, word)
222 word semop_compat35 (void)
223 word osys_semconfig (void)
224 word msgctl_compat23 (void)
225 word msgget (word, word)
226 word msgsnd (word, ptr, word, word)
227 word msgrcv (word, ptr, word, intptr, word)
228 ptr shmat (word, ptr, word)
229 word shmctl_compat23 (void)
230 word shmdt (ptr)
231 word shmget_compat35 (void)
232 word clock_gettime (word, ptr)
233 word clock_settime (word, ptr)
234 word clock_getres (word, ptr)

240 word nanosleep (ptr, ptr)

250 word minherit (ptr, word, word)
251 word rfork (word)
252 word poll (ptr, word, word)
253 word issetugid (void)
254 word lchown (ptr, word, word)
255 word getsid (word)
256 word msync (ptr, word, word)
257 word semctl_compat35 (void)
258 word shmctl_compat35 (void)
259 word msgctl_compat35 (void)
260 word getfsstat (ptr, word, word)
261 word statfs (ptr, ptr)
262 word fstatfs (word, ptr)
263 word pipe (ptr)
264 word fhopen (ptr, word)
265 word fhstat_compat35 (void)
266 word fhstatfs (ptr, ptr)
267 word preadv (word, ptr, word, word, dword)
268 word pwritev (word, ptr, word, word, dword)
269 word kqueue (void)
270 word kevent (word, ptr, word, ptr, word, ptr)
271 word mlockall (word)
272 word munlockall (word)
273 word getpeereid (word, ptr, ptr)

281 word getresuid (ptr, ptr, ptr)
282 word setresuid (word, word, word)
283 word getresgid (ptr, ptr, ptr)
284 word setresgid (word, word, word)
285 word osys_mquery (void)
286 ptr mquery (ptr, word, word, word, intptr, dword)
287 word closefrom (word)
288 word sigaltstack (ptr, ptr)
289 word shmget (word, word)
290 word semop (word, ptr, word)
291 word stat (ptr, ptr)
292 word fstat (word, ptr)
293 word lstat (ptr, ptr)
294 word fhstat (ptr, ptr)
295 word __semctl (word, word, word, ptr)
296 word shmctl (word, word, ptr)
297 word msgctl (word, word, ptr)
298 word sched_yield (void)
299 word getthrid (void)
300 word thrsleep (ptr, word, ptr)
301 word thrwakeup (ptr, word)
302 word threxit (word)
303 word thrsigdivert (word, word)
304 word __getcwd (ptr, word)
305 word adjfreq (ptr, ptr)

