/* * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. * */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
tools	TokenNameIdentifier	 tools
.	TokenNameDOT	
ant	TokenNameIdentifier	 ant
.	TokenNameDOT	
taskdefs	TokenNameIdentifier	 taskdefs
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
BufferedReader	TokenNameIdentifier	 Buffered Reader
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
BufferedWriter	TokenNameIdentifier	 Buffered Writer
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
File	TokenNameIdentifier	 File
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
FileReader	TokenNameIdentifier	 File Reader
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
FileWriter	TokenNameIdentifier	 File Writer
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
IOException	TokenNameIdentifier	 IO Exception
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
tools	TokenNameIdentifier	 tools
.	TokenNameDOT	
ant	TokenNameIdentifier	 ant
.	TokenNameDOT	
BuildException	TokenNameIdentifier	 Build Exception
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
tools	TokenNameIdentifier	 tools
.	TokenNameDOT	
ant	TokenNameIdentifier	 ant
.	TokenNameDOT	
Project	TokenNameIdentifier	 Project
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
tools	TokenNameIdentifier	 tools
.	TokenNameDOT	
ant	TokenNameIdentifier	 ant
.	TokenNameDOT	
Task	TokenNameIdentifier	 Task
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
tools	TokenNameIdentifier	 tools
.	TokenNameDOT	
ant	TokenNameIdentifier	 ant
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
FileUtils	TokenNameIdentifier	 File Utils
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
tools	TokenNameIdentifier	 tools
.	TokenNameDOT	
ant	TokenNameIdentifier	 ant
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
StringUtils	TokenNameIdentifier	 String Utils
;	TokenNameSEMICOLON	
/** * Adds an new entry to a CVS password file. * * * @since Ant 1.4 * * @ant.task category="scm" */	TokenNameCOMMENT_JAVADOC	 Adds an new entry to a CVS password file. * @since Ant 1.4 * @ant.task category="scm" 
public	TokenNamepublic	
class	TokenNameclass	
CVSPass	TokenNameIdentifier	 CVS Pass
extends	TokenNameextends	
Task	TokenNameIdentifier	 Task
{	TokenNameLBRACE	
/** CVS Root */	TokenNameCOMMENT_JAVADOC	 CVS Root 
private	TokenNameprivate	
String	TokenNameIdentifier	 String
cvsRoot	TokenNameIdentifier	 cvs Root
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
/** Password file to add password to */	TokenNameCOMMENT_JAVADOC	 Password file to add password to 
private	TokenNameprivate	
File	TokenNameIdentifier	 File
passFile	TokenNameIdentifier	 pass File
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
/** Password to add to file */	TokenNameCOMMENT_JAVADOC	 Password to add to file 
private	TokenNameprivate	
String	TokenNameIdentifier	 String
password	TokenNameIdentifier	 password
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
/** Array contain char conversion data */	TokenNameCOMMENT_JAVADOC	 Array contain char conversion data 
private	TokenNameprivate	
final	TokenNamefinal	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
shifts	TokenNameIdentifier	 shifts
=	TokenNameEQUAL	
{	TokenNameLBRACE	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
3	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
4	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
5	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
6	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
7	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
8	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
9	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
10	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
11	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
12	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
13	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
14	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
15	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
16	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
17	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
18	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
19	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
20	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
21	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
22	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
23	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
24	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
25	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
26	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
27	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
28	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
29	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
30	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
31	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
114	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
120	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
53	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
79	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
96	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
109	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
72	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
108	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
70	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
64	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
76	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
67	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
116	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
74	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
68	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
87	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
111	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
52	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
75	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
119	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
49	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
34	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
82	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
81	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
95	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
65	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
112	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
86	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
118	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
110	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
122	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
105	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
41	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
57	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
83	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
43	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
46	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
102	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
40	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
89	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
38	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
103	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
45	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
50	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
42	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
123	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
91	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
35	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
125	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
55	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
54	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
66	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
124	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
126	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
59	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
47	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
92	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
71	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
115	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
78	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
88	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
107	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
106	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
56	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
36	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
121	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
117	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
104	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
101	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
100	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
69	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
73	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
99	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
63	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
94	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
93	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
39	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
37	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
61	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
48	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
58	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
113	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
32	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
90	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
44	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
98	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
60	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
51	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
33	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
97	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
62	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
77	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
84	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
80	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
85	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
223	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
225	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
216	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
187	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
166	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
229	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
189	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
222	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
188	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
141	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
249	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
148	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
200	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
184	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
136	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
248	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
190	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
199	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
170	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
181	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
204	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
138	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
232	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
218	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
183	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
255	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
234	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
220	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
247	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
213	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
203	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
226	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
193	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
174	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
172	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
228	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
252	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
217	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
201	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
131	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
230	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
197	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
211	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
145	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
238	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
161	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
179	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
160	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
212	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
207	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
221	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
254	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
173	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
202	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
146	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
224	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
151	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
140	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
196	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
205	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
130	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
135	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
133	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
143	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
246	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
192	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
159	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
244	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
239	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
185	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
168	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
215	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
144	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
139	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
165	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
180	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
157	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
147	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
186	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
214	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
176	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
227	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
231	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
219	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
169	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
175	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
156	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
206	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
198	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
129	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
164	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
150	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
210	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
154	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
177	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
134	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
127	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
182	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
128	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
158	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
208	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
162	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
132	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
167	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
209	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
149	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
241	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
153	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
251	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
237	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
236	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
171	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
195	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
243	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
233	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
253	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
240	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
194	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
250	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
191	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
155	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
142	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
137	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
245	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
235	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
163	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
242	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
178	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
152	TokenNameIntegerLiteral	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
/** * Create a CVS task using the default cvspass file location. */	TokenNameCOMMENT_JAVADOC	 Create a CVS task using the default cvspass file location. 
public	TokenNamepublic	
CVSPass	TokenNameIdentifier	 CVS Pass
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
passFile	TokenNameIdentifier	 pass File
=	TokenNameEQUAL	
new	TokenNamenew	
File	TokenNameIdentifier	 File
(	TokenNameLPAREN	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
getProperty	TokenNameIdentifier	 get Property
(	TokenNameLPAREN	
"cygwin.user.home"	TokenNameStringLiteral	cygwin.user.home
,	TokenNameCOMMA	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
getProperty	TokenNameIdentifier	 get Property
(	TokenNameLPAREN	
"user.home"	TokenNameStringLiteral	user.home
)	TokenNameRPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
File	TokenNameIdentifier	 File
.	TokenNameDOT	
separatorChar	TokenNameIdentifier	 separator Char
+	TokenNamePLUS	
".cvspass"	TokenNameStringLiteral	.cvspass
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Does the work. * * @exception BuildException if something goes wrong with the build */	TokenNameCOMMENT_JAVADOC	 Does the work. * @exception BuildException if something goes wrong with the build 
public	TokenNamepublic	
final	TokenNamefinal	
void	TokenNamevoid	
execute	TokenNameIdentifier	 execute
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
BuildException	TokenNameIdentifier	 Build Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
cvsRoot	TokenNameIdentifier	 cvs Root
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
"cvsroot is required"	TokenNameStringLiteral	cvsroot is required
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
password	TokenNameIdentifier	 password
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
"password is required"	TokenNameStringLiteral	password is required
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
"cvsRoot: "	TokenNameStringLiteral	cvsRoot: 
+	TokenNamePLUS	
cvsRoot	TokenNameIdentifier	 cvs Root
,	TokenNameCOMMA	
Project	TokenNameIdentifier	 Project
.	TokenNameDOT	
MSG_DEBUG	TokenNameIdentifier	 MSG  DEBUG
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
"password: "	TokenNameStringLiteral	password: 
+	TokenNamePLUS	
password	TokenNameIdentifier	 password
,	TokenNameCOMMA	
Project	TokenNameIdentifier	 Project
.	TokenNameDOT	
MSG_DEBUG	TokenNameIdentifier	 MSG  DEBUG
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
"passFile: "	TokenNameStringLiteral	passFile: 
+	TokenNamePLUS	
passFile	TokenNameIdentifier	 pass File
,	TokenNameCOMMA	
Project	TokenNameIdentifier	 Project
.	TokenNameDOT	
MSG_DEBUG	TokenNameIdentifier	 MSG  DEBUG
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
BufferedReader	TokenNameIdentifier	 Buffered Reader
reader	TokenNameIdentifier	 reader
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
BufferedWriter	TokenNameIdentifier	 Buffered Writer
writer	TokenNameIdentifier	 writer
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
StringBuffer	TokenNameIdentifier	 String Buffer
buf	TokenNameIdentifier	 buf
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuffer	TokenNameIdentifier	 String Buffer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
passFile	TokenNameIdentifier	 pass File
.	TokenNameDOT	
exists	TokenNameIdentifier	 exists
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
reader	TokenNameIdentifier	 reader
=	TokenNameEQUAL	
new	TokenNamenew	
BufferedReader	TokenNameIdentifier	 Buffered Reader
(	TokenNameLPAREN	
new	TokenNamenew	
FileReader	TokenNameIdentifier	 File Reader
(	TokenNameLPAREN	
passFile	TokenNameIdentifier	 pass File
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
line	TokenNameIdentifier	 line
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
line	TokenNameIdentifier	 line
=	TokenNameEQUAL	
reader	TokenNameIdentifier	 reader
.	TokenNameDOT	
readLine	TokenNameIdentifier	 read Line
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
line	TokenNameIdentifier	 line
.	TokenNameDOT	
startsWith	TokenNameIdentifier	 starts With
(	TokenNameLPAREN	
cvsRoot	TokenNameIdentifier	 cvs Root
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
line	TokenNameIdentifier	 line
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
StringUtils	TokenNameIdentifier	 String Utils
.	TokenNameDOT	
LINE_SEP	TokenNameIdentifier	 LINE  SEP
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
String	TokenNameIdentifier	 String
pwdfile	TokenNameIdentifier	 pwdfile
=	TokenNameEQUAL	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
cvsRoot	TokenNameIdentifier	 cvs Root
+	TokenNamePLUS	
" A"	TokenNameStringLiteral	 A
+	TokenNamePLUS	
mangle	TokenNameIdentifier	 mangle
(	TokenNameLPAREN	
password	TokenNameIdentifier	 password
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
"Writing -> "	TokenNameStringLiteral	Writing -> 
+	TokenNamePLUS	
pwdfile	TokenNameIdentifier	 pwdfile
,	TokenNameCOMMA	
Project	TokenNameIdentifier	 Project
.	TokenNameDOT	
MSG_DEBUG	TokenNameIdentifier	 MSG  DEBUG
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
writer	TokenNameIdentifier	 writer
=	TokenNameEQUAL	
new	TokenNamenew	
BufferedWriter	TokenNameIdentifier	 Buffered Writer
(	TokenNameLPAREN	
new	TokenNamenew	
FileWriter	TokenNameIdentifier	 File Writer
(	TokenNameLPAREN	
passFile	TokenNameIdentifier	 pass File
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
pwdfile	TokenNameIdentifier	 pwdfile
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
newLine	TokenNameIdentifier	 new Line
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
IOException	TokenNameIdentifier	 IO Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
finally	TokenNamefinally	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
reader	TokenNameIdentifier	 reader
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
reader	TokenNameIdentifier	 reader
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
IOException	TokenNameIdentifier	 IO Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// ignore 	TokenNameCOMMENT_LINE	ignore 
}	TokenNameRBRACE	
}	TokenNameRBRACE	
FileUtils	TokenNameIdentifier	 File Utils
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
writer	TokenNameIdentifier	 writer
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
private	TokenNameprivate	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
mangle	TokenNameIdentifier	 mangle
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
password	TokenNameIdentifier	 password
)	TokenNameRPAREN	
{	TokenNameLBRACE	
StringBuffer	TokenNameIdentifier	 String Buffer
buf	TokenNameIdentifier	 buf
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuffer	TokenNameIdentifier	 String Buffer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
password	TokenNameIdentifier	 password
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
shifts	TokenNameIdentifier	 shifts
[	TokenNameLBRACKET	
password	TokenNameIdentifier	 password
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * The CVS repository to add an entry for. * * @param cvsRoot the CVS repository */	TokenNameCOMMENT_JAVADOC	 The CVS repository to add an entry for. * @param cvsRoot the CVS repository 
public	TokenNamepublic	
void	TokenNamevoid	
setCvsroot	TokenNameIdentifier	 set Cvsroot
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
cvsRoot	TokenNameIdentifier	 cvs Root
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
cvsRoot	TokenNameIdentifier	 cvs Root
=	TokenNameEQUAL	
cvsRoot	TokenNameIdentifier	 cvs Root
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Password file to add the entry to. * * @param passFile the password file. */	TokenNameCOMMENT_JAVADOC	 Password file to add the entry to. * @param passFile the password file. 
public	TokenNamepublic	
void	TokenNamevoid	
setPassfile	TokenNameIdentifier	 set Passfile
(	TokenNameLPAREN	
File	TokenNameIdentifier	 File
passFile	TokenNameIdentifier	 pass File
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
passFile	TokenNameIdentifier	 pass File
=	TokenNameEQUAL	
passFile	TokenNameIdentifier	 pass File
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Password to be added to the password file. * * @param password the password. */	TokenNameCOMMENT_JAVADOC	 Password to be added to the password file. * @param password the password. 
public	TokenNamepublic	
void	TokenNamevoid	
setPassword	TokenNameIdentifier	 set Password
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
password	TokenNameIdentifier	 password
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
password	TokenNameIdentifier	 password
=	TokenNameEQUAL	
password	TokenNameIdentifier	 password
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
