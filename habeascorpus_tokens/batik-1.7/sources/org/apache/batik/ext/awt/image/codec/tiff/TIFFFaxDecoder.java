/* Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
batik	TokenNameIdentifier	 batik
.	TokenNameDOT	
ext	TokenNameIdentifier	 ext
.	TokenNameDOT	
awt	TokenNameIdentifier	 awt
.	TokenNameDOT	
image	TokenNameIdentifier	 image
.	TokenNameDOT	
codec	TokenNameIdentifier	 codec
.	TokenNameDOT	
tiff	TokenNameIdentifier	 tiff
;	TokenNameSEMICOLON	
/** * * @version $Id: TIFFFaxDecoder.java 498740 2007-01-22 18:35:57Z dvholten $ */	TokenNameCOMMENT_JAVADOC	 * @version $Id: TIFFFaxDecoder.java 498740 2007-01-22 18:35:57Z dvholten $ 
class	TokenNameclass	
TIFFFaxDecoder	TokenNameIdentifier	 TIFF Fax Decoder
{	TokenNameLBRACE	
private	TokenNameprivate	
int	TokenNameint	
bitPointer	TokenNameIdentifier	 bit Pointer
,	TokenNameCOMMA	
bytePointer	TokenNameIdentifier	 byte Pointer
;	TokenNameSEMICOLON	
private	TokenNameprivate	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
data	TokenNameIdentifier	 data
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
w	TokenNameIdentifier	 w
,	TokenNameCOMMA	
h	TokenNameIdentifier	 h
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
fillOrder	TokenNameIdentifier	 fill Order
;	TokenNameSEMICOLON	
// Data structures needed to store changing elements for the previous 	TokenNameCOMMENT_LINE	Data structures needed to store changing elements for the previous 
// and the current scanline 	TokenNameCOMMENT_LINE	and the current scanline 
private	TokenNameprivate	
int	TokenNameint	
changingElemSize	TokenNameIdentifier	 changing Elem Size
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
prevChangingElems	TokenNameIdentifier	 prev Changing Elems
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
currChangingElems	TokenNameIdentifier	 curr Changing Elems
;	TokenNameSEMICOLON	
// Element at which to start search in getNextChangingElement 	TokenNameCOMMENT_LINE	Element at which to start search in getNextChangingElement 
private	TokenNameprivate	
int	TokenNameint	
lastChangingElement	TokenNameIdentifier	 last Changing Element
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
compression	TokenNameIdentifier	 compression
=	TokenNameEQUAL	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// Variables set by T4Options 	TokenNameCOMMENT_LINE	Variables set by T4Options 
private	TokenNameprivate	
int	TokenNameint	
uncompressedMode	TokenNameIdentifier	 uncompressed Mode
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
fillBits	TokenNameIdentifier	 fill Bits
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
oneD	TokenNameIdentifier	 one D
;	TokenNameSEMICOLON	
static	TokenNamestatic	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
table1	TokenNameIdentifier	 table1
=	TokenNameEQUAL	
{	TokenNameLBRACE	
0x00	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
// 0 bits are left in first byte - SHOULD NOT HAPPEN 	TokenNameCOMMENT_LINE	0 bits are left in first byte - SHOULD NOT HAPPEN 
0x01	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
// 1 bits are left in first byte 	TokenNameCOMMENT_LINE	1 bits are left in first byte 
0x03	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
// 2 bits are left in first byte 	TokenNameCOMMENT_LINE	2 bits are left in first byte 
0x07	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
// 3 bits are left in first byte 	TokenNameCOMMENT_LINE	3 bits are left in first byte 
0x0f	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
// 4 bits are left in first byte 	TokenNameCOMMENT_LINE	4 bits are left in first byte 
0x1f	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
// 5 bits are left in first byte 	TokenNameCOMMENT_LINE	5 bits are left in first byte 
0x3f	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
// 6 bits are left in first byte 	TokenNameCOMMENT_LINE	6 bits are left in first byte 
0x7f	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
// 7 bits are left in first byte 	TokenNameCOMMENT_LINE	7 bits are left in first byte 
0xff	TokenNameIntegerLiteral	
// 8 bits are left in first byte 	TokenNameCOMMENT_LINE	8 bits are left in first byte 
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
static	TokenNamestatic	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
table2	TokenNameIdentifier	 table2
=	TokenNameEQUAL	
{	TokenNameLBRACE	
0x00	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
// 0 	TokenNameCOMMENT_LINE	0 
0x80	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
// 1 	TokenNameCOMMENT_LINE	1 
0xc0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
// 2 	TokenNameCOMMENT_LINE	2 
0xe0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
// 3 	TokenNameCOMMENT_LINE	3 
0xf0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
// 4 	TokenNameCOMMENT_LINE	4 
0xf8	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
// 5 	TokenNameCOMMENT_LINE	5 
0xfc	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
// 6 	TokenNameCOMMENT_LINE	6 
0xfe	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
// 7 	TokenNameCOMMENT_LINE	7 
0xff	TokenNameIntegerLiteral	
// 8 	TokenNameCOMMENT_LINE	8 
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
// Table to be used when fillOrder = 2, for flipping bytes. 	TokenNameCOMMENT_LINE	Table to be used when fillOrder = 2, for flipping bytes. 
static	TokenNamestatic	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
flipTable	TokenNameIdentifier	 flip Table
=	TokenNameEQUAL	
{	TokenNameLBRACE	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
-	TokenNameMINUS	
128	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
64	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
-	TokenNameMINUS	
64	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
32	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
-	TokenNameMINUS	
96	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
96	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
-	TokenNameMINUS	
32	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
16	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
-	TokenNameMINUS	
112	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
80	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
-	TokenNameMINUS	
48	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
48	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
-	TokenNameMINUS	
80	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
112	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
-	TokenNameMINUS	
16	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
8	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
-	TokenNameMINUS	
120	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
72	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
-	TokenNameMINUS	
56	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
40	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
-	TokenNameMINUS	
88	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
104	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
-	TokenNameMINUS	
24	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
24	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
-	TokenNameMINUS	
104	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
88	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
-	TokenNameMINUS	
40	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
56	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
-	TokenNameMINUS	
72	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
120	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
-	TokenNameMINUS	
8	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
4	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
-	TokenNameMINUS	
124	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
68	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
-	TokenNameMINUS	
60	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
36	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
-	TokenNameMINUS	
92	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
100	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
-	TokenNameMINUS	
28	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
20	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
-	TokenNameMINUS	
108	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
84	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
-	TokenNameMINUS	
44	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
52	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
-	TokenNameMINUS	
76	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
116	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
-	TokenNameMINUS	
12	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
12	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
-	TokenNameMINUS	
116	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
76	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
-	TokenNameMINUS	
52	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
44	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
-	TokenNameMINUS	
84	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
108	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
-	TokenNameMINUS	
20	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
28	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
-	TokenNameMINUS	
100	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
92	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
-	TokenNameMINUS	
36	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
60	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
-	TokenNameMINUS	
68	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
124	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
-	TokenNameMINUS	
4	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
-	TokenNameMINUS	
126	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
66	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
-	TokenNameMINUS	
62	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
34	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
-	TokenNameMINUS	
94	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
98	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
-	TokenNameMINUS	
30	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
18	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
-	TokenNameMINUS	
110	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
82	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
-	TokenNameMINUS	
46	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
50	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
-	TokenNameMINUS	
78	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
114	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
-	TokenNameMINUS	
14	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
10	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
-	TokenNameMINUS	
118	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
74	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
-	TokenNameMINUS	
54	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
42	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
-	TokenNameMINUS	
86	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
106	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
-	TokenNameMINUS	
22	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
26	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
-	TokenNameMINUS	
102	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
90	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
-	TokenNameMINUS	
38	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
58	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
-	TokenNameMINUS	
70	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
122	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
-	TokenNameMINUS	
6	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
6	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
-	TokenNameMINUS	
122	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
70	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
-	TokenNameMINUS	
58	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
38	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
-	TokenNameMINUS	
90	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
102	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
-	TokenNameMINUS	
26	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
22	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
-	TokenNameMINUS	
106	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
86	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
-	TokenNameMINUS	
42	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
54	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
-	TokenNameMINUS	
74	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
118	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
-	TokenNameMINUS	
10	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
14	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
-	TokenNameMINUS	
114	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
78	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
-	TokenNameMINUS	
50	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
46	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
-	TokenNameMINUS	
82	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
110	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
-	TokenNameMINUS	
18	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
30	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
-	TokenNameMINUS	
98	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
94	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
-	TokenNameMINUS	
34	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
62	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
-	TokenNameMINUS	
66	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
126	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
-	TokenNameMINUS	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
-	TokenNameMINUS	
127	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
65	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
-	TokenNameMINUS	
63	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
33	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
-	TokenNameMINUS	
95	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
97	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
-	TokenNameMINUS	
31	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
17	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
-	TokenNameMINUS	
111	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
81	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
-	TokenNameMINUS	
47	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
49	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
-	TokenNameMINUS	
79	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
113	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
-	TokenNameMINUS	
15	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
9	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
-	TokenNameMINUS	
119	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
73	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
-	TokenNameMINUS	
55	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
41	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
-	TokenNameMINUS	
87	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
105	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
-	TokenNameMINUS	
23	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
25	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
-	TokenNameMINUS	
103	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
89	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
-	TokenNameMINUS	
39	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
57	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
-	TokenNameMINUS	
71	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
121	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
-	TokenNameMINUS	
7	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
5	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
-	TokenNameMINUS	
123	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
69	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
-	TokenNameMINUS	
59	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
37	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
-	TokenNameMINUS	
91	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
101	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
-	TokenNameMINUS	
27	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
21	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
-	TokenNameMINUS	
107	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
85	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
-	TokenNameMINUS	
43	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
53	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
-	TokenNameMINUS	
75	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
117	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
-	TokenNameMINUS	
11	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
13	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
-	TokenNameMINUS	
115	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
77	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
-	TokenNameMINUS	
51	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
45	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
-	TokenNameMINUS	
83	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
109	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
-	TokenNameMINUS	
19	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
29	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
-	TokenNameMINUS	
99	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
93	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
-	TokenNameMINUS	
35	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
61	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
-	TokenNameMINUS	
67	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
125	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
-	TokenNameMINUS	
3	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
3	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
-	TokenNameMINUS	
125	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
67	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
-	TokenNameMINUS	
61	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
35	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
-	TokenNameMINUS	
93	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
99	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
-	TokenNameMINUS	
29	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
19	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
-	TokenNameMINUS	
109	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
83	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
-	TokenNameMINUS	
45	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
51	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
-	TokenNameMINUS	
77	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
115	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
-	TokenNameMINUS	
13	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
11	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
-	TokenNameMINUS	
117	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
75	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
-	TokenNameMINUS	
53	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
43	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
-	TokenNameMINUS	
85	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
107	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
-	TokenNameMINUS	
21	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
27	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
-	TokenNameMINUS	
101	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
91	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
-	TokenNameMINUS	
37	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
59	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
-	TokenNameMINUS	
69	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
123	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
-	TokenNameMINUS	
5	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
7	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
-	TokenNameMINUS	
121	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
71	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
-	TokenNameMINUS	
57	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
39	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
-	TokenNameMINUS	
89	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
103	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
-	TokenNameMINUS	
25	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
23	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
-	TokenNameMINUS	
105	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
87	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
-	TokenNameMINUS	
41	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
55	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
-	TokenNameMINUS	
73	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
119	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
-	TokenNameMINUS	
9	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
15	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
-	TokenNameMINUS	
113	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
79	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
-	TokenNameMINUS	
49	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
47	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
-	TokenNameMINUS	
81	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
111	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
-	TokenNameMINUS	
17	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
31	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
-	TokenNameMINUS	
97	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
95	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
-	TokenNameMINUS	
33	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
63	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
-	TokenNameMINUS	
65	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
127	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
// The main 10 bit white runs lookup table 	TokenNameCOMMENT_LINE	The main 10 bit white runs lookup table 
static	TokenNamestatic	
short	TokenNameshort	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
white	TokenNameIdentifier	 white
=	TokenNameEQUAL	
{	TokenNameLBRACE	
// 0 - 7 	TokenNameCOMMENT_LINE	0 - 7 
6430	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
6400	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
6400	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
6400	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
3225	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
3225	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
3225	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
3225	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
// 8 - 15 	TokenNameCOMMENT_LINE	8 - 15 
944	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
944	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
944	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
944	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
976	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
976	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
976	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
976	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
// 16 - 23 	TokenNameCOMMENT_LINE	16 - 23 
1456	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1456	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1456	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1456	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1488	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1488	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1488	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1488	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
// 24 - 31 	TokenNameCOMMENT_LINE	24 - 31 
718	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
718	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
718	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
718	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
718	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
718	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
718	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
718	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
// 32 - 39 	TokenNameCOMMENT_LINE	32 - 39 
750	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
750	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
750	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
750	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
750	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
750	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
750	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
750	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
// 40 - 47 	TokenNameCOMMENT_LINE	40 - 47 
1520	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1520	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1520	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1520	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1552	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1552	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1552	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1552	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
// 48 - 55 	TokenNameCOMMENT_LINE	48 - 55 
428	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
428	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
428	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
428	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
428	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
428	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
428	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
428	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
// 56 - 63 	TokenNameCOMMENT_LINE	56 - 63 
428	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
428	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
428	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
428	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
428	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
428	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
428	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
428	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
// 64 - 71 	TokenNameCOMMENT_LINE	64 - 71 
654	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
654	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
654	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
654	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
654	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
654	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
654	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
654	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
// 72 - 79 	TokenNameCOMMENT_LINE	72 - 79 
1072	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1072	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1072	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1072	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1104	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1104	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1104	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1104	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
// 80 - 87 	TokenNameCOMMENT_LINE	80 - 87 
1136	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1136	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1136	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1136	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1168	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1168	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1168	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1168	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
// 88 - 95 	TokenNameCOMMENT_LINE	88 - 95 
1200	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1200	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1200	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1200	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1232	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1232	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1232	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1232	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
// 96 - 103 	TokenNameCOMMENT_LINE	96 - 103 
622	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
622	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
622	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
622	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
622	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
622	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
622	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
622	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
// 104 - 111 	TokenNameCOMMENT_LINE	104 - 111 
1008	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1008	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1008	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1008	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1040	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1040	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1040	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1040	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
// 112 - 119 	TokenNameCOMMENT_LINE	112 - 119 
44	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
44	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
44	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
44	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
44	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
44	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
44	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
44	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
// 120 - 127 	TokenNameCOMMENT_LINE	120 - 127 
44	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
44	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
44	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
44	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
44	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
44	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
44	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
44	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
// 128 - 135 	TokenNameCOMMENT_LINE	128 - 135 
396	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
396	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
396	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
396	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
396	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
396	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
396	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
396	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
// 136 - 143 	TokenNameCOMMENT_LINE	136 - 143 
396	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
396	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
396	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
396	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
396	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
396	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
396	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
396	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
// 144 - 151 	TokenNameCOMMENT_LINE	144 - 151 
1712	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1712	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1712	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1712	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1744	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1744	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1744	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1744	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
// 152 - 159 	TokenNameCOMMENT_LINE	152 - 159 
846	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
846	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
846	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
846	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
846	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
846	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
846	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
846	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
// 160 - 167 	TokenNameCOMMENT_LINE	160 - 167 
1264	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1264	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1264	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1264	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1296	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1296	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1296	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1296	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
// 168 - 175 	TokenNameCOMMENT_LINE	168 - 175 
1328	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1328	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1328	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1328	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1360	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1360	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1360	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1360	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
// 176 - 183 	TokenNameCOMMENT_LINE	176 - 183 
1392	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1392	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1392	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1392	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1424	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1424	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1424	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1424	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
// 184 - 191 	TokenNameCOMMENT_LINE	184 - 191 
686	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
686	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
686	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
686	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
686	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
686	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
686	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
686	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
// 192 - 199 	TokenNameCOMMENT_LINE	192 - 199 
910	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
910	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
910	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
910	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
910	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
910	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
910	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
910	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
// 200 - 207 	TokenNameCOMMENT_LINE	200 - 207 
1968	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1968	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1968	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1968	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
2000	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
2000	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
2000	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
2000	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
// 208 - 215 	TokenNameCOMMENT_LINE	208 - 215 
2032	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
2032	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
2032	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
2032	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
16	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
16	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
16	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
16	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
// 216 - 223 	TokenNameCOMMENT_LINE	216 - 223 
10257	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
10257	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
10257	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
10257	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
12305	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
12305	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
12305	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
12305	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
// 224 - 231 	TokenNameCOMMENT_LINE	224 - 231 
330	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
330	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
330	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
330	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
330	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
330	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
330	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
330	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
// 232 - 239 	TokenNameCOMMENT_LINE	232 - 239 
330	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
330	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
330	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
330	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
330	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
330	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
330	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
330	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
// 240 - 247 	TokenNameCOMMENT_LINE	240 - 247 
330	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
330	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
330	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
330	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
330	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
330	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
330	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
330	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
// 248 - 255 	TokenNameCOMMENT_LINE	248 - 255 
330	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
330	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
330	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
330	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
330	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
330	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
330	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
330	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
// 256 - 263 	TokenNameCOMMENT_LINE	256 - 263 
362	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
362	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
362	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
362	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
362	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
362	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
362	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
362	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
// 264 - 271 	TokenNameCOMMENT_LINE	264 - 271 
362	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
362	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
362	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
362	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
362	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
362	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
362	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
362	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
// 272 - 279 	TokenNameCOMMENT_LINE	272 - 279 
362	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
362	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
362	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
362	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
362	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
362	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
362	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
362	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
// 280 - 287 	TokenNameCOMMENT_LINE	280 - 287 
362	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
362	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
362	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
362	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
362	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
362	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
362	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
362	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
// 288 - 295 	TokenNameCOMMENT_LINE	288 - 295 
878	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
878	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
878	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
878	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
878	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
878	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
878	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
878	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
// 296 - 303 	TokenNameCOMMENT_LINE	296 - 303 
1904	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1904	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1904	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1904	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1936	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1936	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1936	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1936	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
// 304 - 311 	TokenNameCOMMENT_LINE	304 - 311 
-	TokenNameMINUS	
18413	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
-	TokenNameMINUS	
18413	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
-	TokenNameMINUS	
16365	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
-	TokenNameMINUS	
16365	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
-	TokenNameMINUS	
14317	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
-	TokenNameMINUS	
14317	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
-	TokenNameMINUS	
10221	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
-	TokenNameMINUS	
10221	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
// 312 - 319 	TokenNameCOMMENT_LINE	312 - 319 
590	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
590	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
590	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
590	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
590	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
590	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
590	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
590	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
// 320 - 327 	TokenNameCOMMENT_LINE	320 - 327 
782	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
782	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
782	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
782	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
782	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
782	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
782	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
782	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
// 328 - 335 	TokenNameCOMMENT_LINE	328 - 335 
1584	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1584	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1584	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1584	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1616	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1616	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1616	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1616	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
// 336 - 343 	TokenNameCOMMENT_LINE	336 - 343 
1648	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1648	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1648	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1648	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1680	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1680	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1680	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1680	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
// 344 - 351 	TokenNameCOMMENT_LINE	344 - 351 
814	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
814	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
814	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
814	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
814	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
814	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
814	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
814	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
// 352 - 359 	TokenNameCOMMENT_LINE	352 - 359 
1776	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1776	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1776	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1776	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1808	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1808	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1808	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1808	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
// 360 - 367 	TokenNameCOMMENT_LINE	360 - 367 
1840	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1840	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1840	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1840	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1872	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1872	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1872	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1872	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
// 368 - 375 	TokenNameCOMMENT_LINE	368 - 375 
6157	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
6157	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
6157	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
6157	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
6157	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
6157	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
6157	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
6157	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
// 376 - 383 	TokenNameCOMMENT_LINE	376 - 383 
6157	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
6157	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
6157	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
6157	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
6157	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
6157	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
6157	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
6157	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
// 384 - 391 	TokenNameCOMMENT_LINE	384 - 391 
-	TokenNameMINUS	
12275	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
-	TokenNameMINUS	
12275	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
-	TokenNameMINUS	
12275	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
-	TokenNameMINUS	
12275	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
-	TokenNameMINUS	
12275	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
-	TokenNameMINUS	
12275	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
-	TokenNameMINUS	
12275	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
-	TokenNameMINUS	
12275	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
// 392 - 399 	TokenNameCOMMENT_LINE	392 - 399 
-	TokenNameMINUS	
12275	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
-	TokenNameMINUS	
12275	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
-	TokenNameMINUS	
12275	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
-	TokenNameMINUS	
12275	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
-	TokenNameMINUS	
12275	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
-	TokenNameMINUS	
12275	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
-	TokenNameMINUS	
12275	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
-	TokenNameMINUS	
12275	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
// 400 - 407 	TokenNameCOMMENT_LINE	400 - 407 
14353	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
14353	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
14353	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
14353	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
16401	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
16401	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
16401	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
16401	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
// 408 - 415 	TokenNameCOMMENT_LINE	408 - 415 
22547	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
22547	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
24595	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
24595	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
20497	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
20497	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
20497	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
20497	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
// 416 - 423 	TokenNameCOMMENT_LINE	416 - 423 
18449	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
18449	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
18449	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
18449	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
26643	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
26643	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
28691	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
28691	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
// 424 - 431 	TokenNameCOMMENT_LINE	424 - 431 
30739	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
30739	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
-	TokenNameMINUS	
32749	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
-	TokenNameMINUS	
32749	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
-	TokenNameMINUS	
30701	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
-	TokenNameMINUS	
30701	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
-	TokenNameMINUS	
28653	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
-	TokenNameMINUS	
28653	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
// 432 - 439 	TokenNameCOMMENT_LINE	432 - 439 
-	TokenNameMINUS	
26605	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
-	TokenNameMINUS	
26605	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
-	TokenNameMINUS	
24557	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
-	TokenNameMINUS	
24557	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
-	TokenNameMINUS	
22509	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
-	TokenNameMINUS	
22509	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
-	TokenNameMINUS	
20461	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
-	TokenNameMINUS	
20461	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
// 440 - 447 	TokenNameCOMMENT_LINE	440 - 447 
8207	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
8207	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
8207	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
8207	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
8207	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
8207	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
8207	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
8207	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
// 448 - 455 	TokenNameCOMMENT_LINE	448 - 455 
72	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
72	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
72	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
72	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
72	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
72	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
72	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
72	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
// 456 - 463 	TokenNameCOMMENT_LINE	456 - 463 
72	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
72	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
72	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
72	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
72	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
72	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
72	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
72	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
// 464 - 471 	TokenNameCOMMENT_LINE	464 - 471 
72	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
72	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
72	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
72	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
72	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
72	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
72	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
72	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
// 472 - 479 	TokenNameCOMMENT_LINE	472 - 479 
72	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
72	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
72	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
72	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
72	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
72	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
72	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
72	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
// 480 - 487 	TokenNameCOMMENT_LINE	480 - 487 
72	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
72	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
72	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
72	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
72	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
72	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
72	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
72	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
// 488 - 495 	TokenNameCOMMENT_LINE	488 - 495 
72	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
72	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
72	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
72	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
72	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
72	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
72	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
72	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
// 496 - 503 	TokenNameCOMMENT_LINE	496 - 503 
72	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
72	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
72	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
72	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
72	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
72	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
72	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
72	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
// 504 - 511 	TokenNameCOMMENT_LINE	504 - 511 
72	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
72	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
72	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
72	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
72	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
72	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
72	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
72	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
// 512 - 519 	TokenNameCOMMENT_LINE	512 - 519 
104	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
104	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
104	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
104	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
104	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
104	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
104	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
104	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
// 520 - 527 	TokenNameCOMMENT_LINE	520 - 527 
104	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
104	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
104	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
104	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
104	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
104	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
104	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
104	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
// 528 - 535 	TokenNameCOMMENT_LINE	528 - 535 
104	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
104	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
104	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
104	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
104	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
104	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
104	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
104	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
// 536 - 543 	TokenNameCOMMENT_LINE	536 - 543 
104	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
104	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
104	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
104	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
104	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
104	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
104	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
104	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
// 544 - 551 	TokenNameCOMMENT_LINE	544 - 551 
104	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
104	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
104	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
104	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
104	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
104	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
104	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
104	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
// 552 - 559 	TokenNameCOMMENT_LINE	552 - 559 
104	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
104	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
104	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
104	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
104	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
104	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
104	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
104	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
// 560 - 567 	TokenNameCOMMENT_LINE	560 - 567 
104	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
104	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
104	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
104	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
104	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
104	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
104	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
104	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
// 568 - 575 	TokenNameCOMMENT_LINE	568 - 575 
104	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
104	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
104	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
104	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
104	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
104	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
104	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
104	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
// 576 - 583 	TokenNameCOMMENT_LINE	576 - 583 
4107	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
4107	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
4107	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
4107	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
4107	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
4107	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
4107	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
4107	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
// 584 - 591 	TokenNameCOMMENT_LINE	584 - 591 
4107	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
4107	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
4107	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
4107	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
4107	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
4107	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
4107	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
4107	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
// 592 - 599 	TokenNameCOMMENT_LINE	592 - 599 
4107	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
4107	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
4107	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
4107	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
4107	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
4107	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
4107	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
4107	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
// 600 - 607 	TokenNameCOMMENT_LINE	600 - 607 
4107	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
4107	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
4107	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
4107	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
4107	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
4107	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
4107	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
4107	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
// 608 - 615 	TokenNameCOMMENT_LINE	608 - 615 
266	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
266	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
266	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
266	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
266	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
266	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
266	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
266	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
// 616 - 623 	TokenNameCOMMENT_LINE	616 - 623 
266	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
266	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
266	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
266	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
266	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
266	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
266	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
266	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
// 624 - 631 	TokenNameCOMMENT_LINE	624 - 631 
266	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
266	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
266	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
266	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
266	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
266	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
266	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
266	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
// 632 - 639 	TokenNameCOMMENT_LINE	632 - 639 
266	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
266	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
266	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
266	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
266	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
266	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
266	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
266	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
// 640 - 647 	TokenNameCOMMENT_LINE	640 - 647 
298	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
298	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
298	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
298	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
298	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
298	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
298	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
298	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
// 648 - 655 	TokenNameCOMMENT_LINE	648 - 655 
298	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
298	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
298	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
298	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
298	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
298	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
298	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
298	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
// 656 - 663 	TokenNameCOMMENT_LINE	656 - 663 
298	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
298	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
298	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
298	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
298	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
298	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
298	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
298	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
// 664 - 671 	TokenNameCOMMENT_LINE	664 - 671 
298	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
298	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
298	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
298	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
298	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
298	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
298	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
298	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
// 672 - 679 	TokenNameCOMMENT_LINE	672 - 679 
524	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
524	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
524	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
524	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
524	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
524	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
524	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
524	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
// 680 - 687 	TokenNameCOMMENT_LINE	680 - 687 
524	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
524	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
524	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
524	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
524	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
524	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
524	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
524	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
// 688 - 695 	TokenNameCOMMENT_LINE	688 - 695 
556	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
556	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
556	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
556	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
556	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
556	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
556	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
556	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
// 696 - 703 	TokenNameCOMMENT_LINE	696 - 703 
556	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
556	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
556	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
556	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
556	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
556	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
556	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
556	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
// 704 - 711 	TokenNameCOMMENT_LINE	704 - 711 
136	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
136	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
136	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
136	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
136	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
136	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
136	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
136	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
// 712 - 719 	TokenNameCOMMENT_LINE	712 - 719 
136	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
136	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
136	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
136	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
136	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
136	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
136	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
136	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
// 720 - 727 	TokenNameCOMMENT_LINE	720 - 727 
136	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
136	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
136	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
136	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
136	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
136	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
136	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
136	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
// 728 - 735 	TokenNameCOMMENT_LINE	728 - 735 
136	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
136	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
136	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
136	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
136	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
136	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
136	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
136	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
// 736 - 743 	TokenNameCOMMENT_LINE	736 - 743 
136	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
136	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
136	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
136	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
136	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
136	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
136	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
136	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
// 744 - 751 	TokenNameCOMMENT_LINE	744 - 751 
136	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
136	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
136	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
136	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
136	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
136	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
136	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
136	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
// 752 - 759 	TokenNameCOMMENT_LINE	752 - 759 
136	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
136	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
136	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
136	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
136	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
136	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
136	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
136	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
// 760 - 767 	TokenNameCOMMENT_LINE	760 - 767 
136	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
136	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
136	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
136	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
136	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
136	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
136	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
136	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
// 768 - 775 	TokenNameCOMMENT_LINE	768 - 775 
168	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
168	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
168	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
168	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
168	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
168	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
168	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
168	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
// 776 - 783 	TokenNameCOMMENT_LINE	776 - 783 
168	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
168	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
168	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
168	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
168	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
168	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
168	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
168	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
// 784 - 791 	TokenNameCOMMENT_LINE	784 - 791 
168	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
168	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
168	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
168	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
168	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
168	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
168	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
168	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
// 792 - 799 	TokenNameCOMMENT_LINE	792 - 799 
168	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
168	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
168	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
168	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
168	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
168	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
168	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
168	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
// 800 - 807 	TokenNameCOMMENT_LINE	800 - 807 
168	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
168	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
168	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
168	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
168	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
168	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
168	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
168	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
// 808 - 815 	TokenNameCOMMENT_LINE	808 - 815 
168	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
168	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
168	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
168	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
168	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
168	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
168	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
168	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
// 816 - 823 	TokenNameCOMMENT_LINE	816 - 823 
168	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
168	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
168	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
168	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
168	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
168	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
168	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
168	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
// 824 - 831 	TokenNameCOMMENT_LINE	824 - 831 
168	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
168	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
168	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
168	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
168	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
168	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
168	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
168	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
// 832 - 839 	TokenNameCOMMENT_LINE	832 - 839 
460	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
460	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
460	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
460	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
460	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
460	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
460	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
460	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
// 840 - 847 	TokenNameCOMMENT_LINE	840 - 847 
460	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
460	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
460	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
460	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
460	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
460	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
460	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
460	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
// 848 - 855 	TokenNameCOMMENT_LINE	848 - 855 
492	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
492	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
492	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
492	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
492	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
492	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
492	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
492	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
// 856 - 863 	TokenNameCOMMENT_LINE	856 - 863 
492	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
492	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
492	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
492	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
492	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
492	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
492	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
492	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
// 864 - 871 	TokenNameCOMMENT_LINE	864 - 871 
2059	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
2059	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
2059	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
2059	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
2059	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
2059	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
2059	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
2059	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
// 872 - 879 	TokenNameCOMMENT_LINE	872 - 879 
2059	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
2059	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
2059	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
2059	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
2059	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
2059	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
2059	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
2059	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
// 880 - 887 	TokenNameCOMMENT_LINE	880 - 887 
2059	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
2059	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
2059	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
2059	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
2059	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
2059	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
2059	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
2059	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
// 888 - 895 	TokenNameCOMMENT_LINE	888 - 895 
2059	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
2059	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
2059	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
2059	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
2059	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
2059	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
2059	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
2059	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
// 896 - 903 	TokenNameCOMMENT_LINE	896 - 903 
200	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
200	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
200	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
200	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
200	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
200	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
200	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
200	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
// 904 - 911 	TokenNameCOMMENT_LINE	904 - 911 
200	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
200	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
200	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
200	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
200	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
200	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
200	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
200	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
// 912 - 919 	TokenNameCOMMENT_LINE	912 - 919 
200	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
200	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
200	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
200	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
200	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
200	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
200	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
200	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
// 920 - 927 	TokenNameCOMMENT_LINE	920 - 927 
200	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
200	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
200	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
200	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
200	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
200	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
200	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
200	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
// 928 - 935 	TokenNameCOMMENT_LINE	928 - 935 
200	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
200	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
200	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
200	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
200	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
200	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
200	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
200	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
// 936 - 943 	TokenNameCOMMENT_LINE	936 - 943 
200	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
200	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
200	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
200	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
200	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
200	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
200	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
200	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
// 944 - 951 	TokenNameCOMMENT_LINE	944 - 951 
200	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
200	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
200	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
200	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
200	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
200	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
200	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
200	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
// 952 - 959 	TokenNameCOMMENT_LINE	952 - 959 
200	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
200	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
200	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
200	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
200	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
200	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
200	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
200	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
// 960 - 967 	TokenNameCOMMENT_LINE	960 - 967 
232	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
232	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
232	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
232	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
232	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
232	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
232	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
232	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
// 968 - 975 	TokenNameCOMMENT_LINE	968 - 975 
232	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
232	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
232	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
232	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
232	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
232	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
232	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
232	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
// 976 - 983 	TokenNameCOMMENT_LINE	976 - 983 
232	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
232	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
232	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
232	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
232	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
232	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
232	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
232	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
// 984 - 991 	TokenNameCOMMENT_LINE	984 - 991 
232	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
232	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
232	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
232	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
232	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
232	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
232	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
232	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
// 992 - 999 	TokenNameCOMMENT_LINE	992 - 999 
232	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
232	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
232	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
232	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
232	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
232	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
232	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
232	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
// 1000 - 1007 	TokenNameCOMMENT_LINE	1000 - 1007 
232	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
232	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
232	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
232	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
232	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
232	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
232	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
232	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
// 1008 - 1015 	TokenNameCOMMENT_LINE	1008 - 1015 
232	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
232	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
232	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
232	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
232	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
232	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
232	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
232	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
// 1016 - 1023 	TokenNameCOMMENT_LINE	1016 - 1023 
232	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
232	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
232	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
232	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
232	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
232	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
232	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
232	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
// Additional make up codes for both White and Black runs 	TokenNameCOMMENT_LINE	Additional make up codes for both White and Black runs 
static	TokenNamestatic	
short	TokenNameshort	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
additionalMakeup	TokenNameIdentifier	 additional Makeup
=	TokenNameEQUAL	
{	TokenNameLBRACE	
28679	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
28679	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
31752	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
(	TokenNameLPAREN	
short	TokenNameshort	
)	TokenNameRPAREN	
32777	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
(	TokenNameLPAREN	
short	TokenNameshort	
)	TokenNameRPAREN	
33801	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
(	TokenNameLPAREN	
short	TokenNameshort	
)	TokenNameRPAREN	
34825	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
(	TokenNameLPAREN	
short	TokenNameshort	
)	TokenNameRPAREN	
35849	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
(	TokenNameLPAREN	
short	TokenNameshort	
)	TokenNameRPAREN	
36873	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
(	TokenNameLPAREN	
short	TokenNameshort	
)	TokenNameRPAREN	
29703	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
(	TokenNameLPAREN	
short	TokenNameshort	
)	TokenNameRPAREN	
29703	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
(	TokenNameLPAREN	
short	TokenNameshort	
)	TokenNameRPAREN	
30727	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
(	TokenNameLPAREN	
short	TokenNameshort	
)	TokenNameRPAREN	
30727	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
(	TokenNameLPAREN	
short	TokenNameshort	
)	TokenNameRPAREN	
37897	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
(	TokenNameLPAREN	
short	TokenNameshort	
)	TokenNameRPAREN	
38921	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
(	TokenNameLPAREN	
short	TokenNameshort	
)	TokenNameRPAREN	
39945	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
(	TokenNameLPAREN	
short	TokenNameshort	
)	TokenNameRPAREN	
40969	TokenNameIntegerLiteral	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
// Initial black run look up table, uses the first 4 bits of a code 	TokenNameCOMMENT_LINE	Initial black run look up table, uses the first 4 bits of a code 
static	TokenNamestatic	
short	TokenNameshort	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
initBlack	TokenNameIdentifier	 init Black
=	TokenNameEQUAL	
{	TokenNameLBRACE	
// 0 - 7 	TokenNameCOMMENT_LINE	0 - 7 
3226	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
6412	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
200	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
168	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
38	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
38	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
134	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
134	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
// 8 - 15 	TokenNameCOMMENT_LINE	8 - 15 
100	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
100	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
100	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
100	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
68	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
68	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
68	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
68	TokenNameIntegerLiteral	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
// 	TokenNameCOMMENT_LINE	 
static	TokenNamestatic	
short	TokenNameshort	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
twoBitBlack	TokenNameIdentifier	 two Bit Black
=	TokenNameEQUAL	
{	TokenNameLBRACE	
292	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
260	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
226	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
226	TokenNameIntegerLiteral	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
// 0 - 3 	TokenNameCOMMENT_LINE	0 - 3 
// Main black run table, using the last 9 bits of possible 13 bit code 	TokenNameCOMMENT_LINE	Main black run table, using the last 9 bits of possible 13 bit code 
static	TokenNamestatic	
short	TokenNameshort	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
black	TokenNameIdentifier	 black
=	TokenNameEQUAL	
{	TokenNameLBRACE	
// 0 - 7 	TokenNameCOMMENT_LINE	0 - 7 
62	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
62	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
30	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
30	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
// 8 - 15 	TokenNameCOMMENT_LINE	8 - 15 
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
// 16 - 23 	TokenNameCOMMENT_LINE	16 - 23 
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
// 24 - 31 	TokenNameCOMMENT_LINE	24 - 31 
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
// 32 - 39 	TokenNameCOMMENT_LINE	32 - 39 
3225	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
3225	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
3225	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
3225	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
3225	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
3225	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
3225	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
3225	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
// 40 - 47 	TokenNameCOMMENT_LINE	40 - 47 
3225	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
3225	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
3225	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
3225	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
3225	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
3225	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
3225	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
3225	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
// 48 - 55 	TokenNameCOMMENT_LINE	48 - 55 
3225	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
3225	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
3225	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
3225	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
3225	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
3225	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
3225	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
3225	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
// 56 - 63 	TokenNameCOMMENT_LINE	56 - 63 
3225	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
3225	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
3225	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
3225	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
3225	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
3225	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
3225	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
3225	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
// 64 - 71 	TokenNameCOMMENT_LINE	64 - 71 
588	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
588	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
588	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
588	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
588	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
588	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
588	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
588	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
// 72 - 79 	TokenNameCOMMENT_LINE	72 - 79 
1680	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1680	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
20499	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
22547	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
24595	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
26643	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1776	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1776	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
// 80 - 87 	TokenNameCOMMENT_LINE	80 - 87 
1808	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1808	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
-	TokenNameMINUS	
24557	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
-	TokenNameMINUS	
22509	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
-	TokenNameMINUS	
20461	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
-	TokenNameMINUS	
18413	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1904	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1904	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
// 88 - 95 	TokenNameCOMMENT_LINE	88 - 95 
1936	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1936	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
-	TokenNameMINUS	
16365	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
-	TokenNameMINUS	
14317	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
782	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
782	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
782	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
782	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
// 96 - 103 	TokenNameCOMMENT_LINE	96 - 103 
814	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
814	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
814	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
814	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
-	TokenNameMINUS	
12269	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
-	TokenNameMINUS	
10221	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
10257	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
10257	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
// 104 - 111 	TokenNameCOMMENT_LINE	104 - 111 
12305	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
12305	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
14353	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
14353	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
16403	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
18451	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1712	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1712	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
// 112 - 119 	TokenNameCOMMENT_LINE	112 - 119 
1744	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1744	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
28691	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
30739	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
-	TokenNameMINUS	
32749	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
-	TokenNameMINUS	
30701	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
-	TokenNameMINUS	
28653	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
-	TokenNameMINUS	
26605	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
// 120 - 127 	TokenNameCOMMENT_LINE	120 - 127 
2061	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
2061	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
2061	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
2061	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
2061	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
2061	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
2061	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
2061	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
// 128 - 135 	TokenNameCOMMENT_LINE	128 - 135 
424	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
424	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
424	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
424	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
424	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
424	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
424	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
424	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
// 136 - 143 	TokenNameCOMMENT_LINE	136 - 143 
424	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
424	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
424	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
424	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
424	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
424	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
424	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
424	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
// 144 - 151 	TokenNameCOMMENT_LINE	144 - 151 
424	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
424	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
424	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
424	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
424	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
424	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
424	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
424	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
// 152 - 159 	TokenNameCOMMENT_LINE	152 - 159 
424	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
424	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
424	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
424	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
424	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
424	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
424	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
424	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
// 160 - 167 	TokenNameCOMMENT_LINE	160 - 167 
750	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
750	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
750	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
750	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1616	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1616	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1648	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1648	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
// 168 - 175 	TokenNameCOMMENT_LINE	168 - 175 
1424	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1424	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1456	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1456	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1488	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1488	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1520	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1520	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
// 176 - 183 	TokenNameCOMMENT_LINE	176 - 183 
1840	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1840	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1872	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1872	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1968	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1968	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
8209	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
8209	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
// 184 - 191 	TokenNameCOMMENT_LINE	184 - 191 
524	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
524	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
524	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
524	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
524	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
524	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
524	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
524	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
// 192 - 199 	TokenNameCOMMENT_LINE	192 - 199 
556	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
556	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
556	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
556	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
556	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
556	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
556	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
556	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
// 200 - 207 	TokenNameCOMMENT_LINE	200 - 207 
1552	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1552	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1584	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1584	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
2000	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
2000	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
2032	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
2032	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
// 208 - 215 	TokenNameCOMMENT_LINE	208 - 215 
976	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
976	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1008	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1008	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1040	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1040	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1072	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1072	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
// 216 - 223 	TokenNameCOMMENT_LINE	216 - 223 
1296	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1296	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1328	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1328	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
718	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
718	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
718	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
718	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
// 224 - 231 	TokenNameCOMMENT_LINE	224 - 231 
456	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
456	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
456	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
456	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
456	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
456	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
456	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
456	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
// 232 - 239 	TokenNameCOMMENT_LINE	232 - 239 
456	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
456	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
456	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
456	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
456	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
456	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
456	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
456	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
// 240 - 247 	TokenNameCOMMENT_LINE	240 - 247 
456	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
456	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
456	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
456	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
456	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
456	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
456	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
456	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
// 248 - 255 	TokenNameCOMMENT_LINE	248 - 255 
456	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
456	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
456	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
456	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
456	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
456	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
456	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
456	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
// 256 - 263 	TokenNameCOMMENT_LINE	256 - 263 
326	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
326	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
326	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
326	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
326	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
326	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
326	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
326	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
// 264 - 271 	TokenNameCOMMENT_LINE	264 - 271 
326	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
326	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
326	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
326	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
326	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
326	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
326	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
326	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
// 272 - 279 	TokenNameCOMMENT_LINE	272 - 279 
326	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
326	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
326	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
326	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
326	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
326	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
326	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
326	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
// 280 - 287 	TokenNameCOMMENT_LINE	280 - 287 
326	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
326	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
326	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
326	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
326	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
326	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
326	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
326	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
// 288 - 295 	TokenNameCOMMENT_LINE	288 - 295 
326	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
326	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
326	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
326	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
326	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
326	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
326	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
326	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
// 296 - 303 	TokenNameCOMMENT_LINE	296 - 303 
326	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
326	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
326	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
326	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
326	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
326	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
326	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
326	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
// 304 - 311 	TokenNameCOMMENT_LINE	304 - 311 
326	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
326	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
326	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
326	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
326	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
326	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
326	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
326	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
// 312 - 319 	TokenNameCOMMENT_LINE	312 - 319 
326	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
326	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
326	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
326	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
326	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
326	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
326	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
326	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
// 320 - 327 	TokenNameCOMMENT_LINE	320 - 327 
358	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
358	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
358	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
358	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
358	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
358	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
358	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
358	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
// 328 - 335 	TokenNameCOMMENT_LINE	328 - 335 
358	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
358	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
358	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
358	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
358	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
358	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
358	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
358	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
// 336 - 343 	TokenNameCOMMENT_LINE	336 - 343 
358	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
358	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
358	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
358	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
358	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
358	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
358	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
358	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
// 344 - 351 	TokenNameCOMMENT_LINE	344 - 351 
358	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
358	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
358	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
358	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
358	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
358	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
358	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
358	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
// 352 - 359 	TokenNameCOMMENT_LINE	352 - 359 
358	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
358	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
358	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
358	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
358	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
358	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
358	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
358	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
// 360 - 367 	TokenNameCOMMENT_LINE	360 - 367 
358	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
358	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
358	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
358	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
358	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
358	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
358	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
358	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
// 368 - 375 	TokenNameCOMMENT_LINE	368 - 375 
358	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
358	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
358	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
358	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
358	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
358	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
358	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
358	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
// 376 - 383 	TokenNameCOMMENT_LINE	376 - 383 
358	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
358	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
358	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
358	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
358	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
358	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
358	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
358	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
// 384 - 391 	TokenNameCOMMENT_LINE	384 - 391 
490	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
490	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
490	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
490	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
490	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
490	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
490	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
490	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
// 392 - 399 	TokenNameCOMMENT_LINE	392 - 399 
490	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
490	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
490	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
490	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
490	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
490	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
490	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
490	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
// 400 - 407 	TokenNameCOMMENT_LINE	400 - 407 
4113	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
4113	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
6161	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
6161	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
848	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
848	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
880	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
880	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
// 408 - 415 	TokenNameCOMMENT_LINE	408 - 415 
912	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
912	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
944	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
944	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
622	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
622	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
622	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
622	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
// 416 - 423 	TokenNameCOMMENT_LINE	416 - 423 
654	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
654	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
654	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
654	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1104	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1104	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1136	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1136	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
// 424 - 431 	TokenNameCOMMENT_LINE	424 - 431 
1168	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1168	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1200	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1200	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1232	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1232	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1264	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1264	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
// 432 - 439 	TokenNameCOMMENT_LINE	432 - 439 
686	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
686	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
686	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
686	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1360	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1360	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1392	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1392	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
// 440 - 447 	TokenNameCOMMENT_LINE	440 - 447 
12	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
12	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
12	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
12	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
12	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
12	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
12	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
12	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
// 448 - 455 	TokenNameCOMMENT_LINE	448 - 455 
390	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
390	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
390	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
390	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
390	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
390	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
390	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
390	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
// 456 - 463 	TokenNameCOMMENT_LINE	456 - 463 
390	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
390	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
390	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
390	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
390	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
390	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
390	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
390	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
// 464 - 471 	TokenNameCOMMENT_LINE	464 - 471 
390	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
390	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
390	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
390	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
390	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
390	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
390	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
390	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
// 472 - 479 	TokenNameCOMMENT_LINE	472 - 479 
390	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
390	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
390	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
390	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
390	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
390	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
390	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
390	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
// 480 - 487 	TokenNameCOMMENT_LINE	480 - 487 
390	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
390	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
390	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
390	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
390	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
390	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
390	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
390	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
// 488 - 495 	TokenNameCOMMENT_LINE	488 - 495 
390	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
390	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
390	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
390	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
390	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
390	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
390	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
390	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
// 496 - 503 	TokenNameCOMMENT_LINE	496 - 503 
390	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
390	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
390	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
390	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
390	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
390	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
390	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
390	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
// 504 - 511 	TokenNameCOMMENT_LINE	504 - 511 
390	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
390	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
390	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
390	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
390	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
390	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
390	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
390	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
static	TokenNamestatic	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
twoDCodes	TokenNameIdentifier	 two D Codes
=	TokenNameEQUAL	
{	TokenNameLBRACE	
// 0 - 7 	TokenNameCOMMENT_LINE	0 - 7 
80	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
88	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
23	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
71	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
30	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
30	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
62	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
62	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
// 8 - 15 	TokenNameCOMMENT_LINE	8 - 15 
4	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
4	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
4	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
4	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
4	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
4	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
4	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
4	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
// 16 - 23 	TokenNameCOMMENT_LINE	16 - 23 
11	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
11	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
11	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
11	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
11	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
11	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
11	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
11	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
// 24 - 31 	TokenNameCOMMENT_LINE	24 - 31 
11	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
11	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
11	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
11	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
11	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
11	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
11	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
11	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
// 32 - 39 	TokenNameCOMMENT_LINE	32 - 39 
35	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
35	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
35	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
35	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
35	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
35	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
35	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
35	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
// 40 - 47 	TokenNameCOMMENT_LINE	40 - 47 
35	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
35	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
35	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
35	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
35	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
35	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
35	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
35	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
// 48 - 55 	TokenNameCOMMENT_LINE	48 - 55 
51	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
51	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
51	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
51	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
51	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
51	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
51	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
51	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
// 56 - 63 	TokenNameCOMMENT_LINE	56 - 63 
51	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
51	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
51	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
51	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
51	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
51	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
51	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
51	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
// 64 - 71 	TokenNameCOMMENT_LINE	64 - 71 
41	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
41	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
41	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
41	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
41	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
41	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
41	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
41	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
// 72 - 79 	TokenNameCOMMENT_LINE	72 - 79 
41	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
41	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
41	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
41	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
41	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
41	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
41	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
41	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
// 80 - 87 	TokenNameCOMMENT_LINE	80 - 87 
41	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
41	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
41	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
41	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
41	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
41	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
41	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
41	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
// 88 - 95 	TokenNameCOMMENT_LINE	88 - 95 
41	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
41	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
41	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
41	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
41	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
41	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
41	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
41	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
// 96 - 103 	TokenNameCOMMENT_LINE	96 - 103 
41	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
41	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
41	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
41	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
41	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
41	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
41	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
41	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
// 104 - 111 	TokenNameCOMMENT_LINE	104 - 111 
41	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
41	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
41	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
41	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
41	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
41	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
41	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
41	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
// 112 - 119 	TokenNameCOMMENT_LINE	112 - 119 
41	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
41	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
41	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
41	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
41	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
41	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
41	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
41	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
// 120 - 127 	TokenNameCOMMENT_LINE	120 - 127 
41	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
41	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
41	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
41	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
41	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
41	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
41	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
41	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
/** * @param fillOrder The fill order of the compressed data bytes. */	TokenNameCOMMENT_JAVADOC	 @param fillOrder The fill order of the compressed data bytes. 
public	TokenNamepublic	
TIFFFaxDecoder	TokenNameIdentifier	 TIFF Fax Decoder
(	TokenNameLPAREN	
int	TokenNameint	
fillOrder	TokenNameIdentifier	 fill Order
,	TokenNameCOMMA	
int	TokenNameint	
w	TokenNameIdentifier	 w
,	TokenNameCOMMA	
int	TokenNameint	
h	TokenNameIdentifier	 h
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
fillOrder	TokenNameIdentifier	 fill Order
=	TokenNameEQUAL	
fillOrder	TokenNameIdentifier	 fill Order
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
w	TokenNameIdentifier	 w
=	TokenNameEQUAL	
w	TokenNameIdentifier	 w
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
h	TokenNameIdentifier	 h
=	TokenNameEQUAL	
h	TokenNameIdentifier	 h
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
bitPointer	TokenNameIdentifier	 bit Pointer
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
bytePointer	TokenNameIdentifier	 byte Pointer
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
prevChangingElems	TokenNameIdentifier	 prev Changing Elems
=	TokenNameEQUAL	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
w	TokenNameIdentifier	 w
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
currChangingElems	TokenNameIdentifier	 curr Changing Elems
=	TokenNameEQUAL	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
w	TokenNameIdentifier	 w
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// One-dimensional decoding methods 	TokenNameCOMMENT_LINE	One-dimensional decoding methods 
public	TokenNamepublic	
void	TokenNamevoid	
decode1D	TokenNameIdentifier	 decode1 D
(	TokenNameLPAREN	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
buffer	TokenNameIdentifier	 buffer
,	TokenNameCOMMA	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
compData	TokenNameIdentifier	 comp Data
,	TokenNameCOMMA	
int	TokenNameint	
startX	TokenNameIdentifier	 start X
,	TokenNameCOMMA	
int	TokenNameint	
height	TokenNameIdentifier	 height
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
data	TokenNameIdentifier	 data
=	TokenNameEQUAL	
compData	TokenNameIdentifier	 comp Data
;	TokenNameSEMICOLON	
int	TokenNameint	
lineOffset	TokenNameIdentifier	 line Offset
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
scanlineStride	TokenNameIdentifier	 scanline Stride
=	TokenNameEQUAL	
(	TokenNameLPAREN	
w	TokenNameIdentifier	 w
+	TokenNamePLUS	
7	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
/	TokenNameDIVIDE	
8	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
bitPointer	TokenNameIdentifier	 bit Pointer
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
bytePointer	TokenNameIdentifier	 byte Pointer
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
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
height	TokenNameIdentifier	 height
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
decodeNextScanline	TokenNameIdentifier	 decode Next Scanline
(	TokenNameLPAREN	
buffer	TokenNameIdentifier	 buffer
,	TokenNameCOMMA	
lineOffset	TokenNameIdentifier	 line Offset
,	TokenNameCOMMA	
startX	TokenNameIdentifier	 start X
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
lineOffset	TokenNameIdentifier	 line Offset
+=	TokenNamePLUS_EQUAL	
scanlineStride	TokenNameIdentifier	 scanline Stride
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
decodeNextScanline	TokenNameIdentifier	 decode Next Scanline
(	TokenNameLPAREN	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
buffer	TokenNameIdentifier	 buffer
,	TokenNameCOMMA	
int	TokenNameint	
lineOffset	TokenNameIdentifier	 line Offset
,	TokenNameCOMMA	
int	TokenNameint	
bitOffset	TokenNameIdentifier	 bit Offset
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
bits	TokenNameIdentifier	 bits
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
code	TokenNameIdentifier	 code
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
isT	TokenNameIdentifier	 is T
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
current	TokenNameIdentifier	 current
,	TokenNameCOMMA	
entry	TokenNameIdentifier	 entry
,	TokenNameCOMMA	
twoBits	TokenNameIdentifier	 two Bits
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
isWhite	TokenNameIdentifier	 is White
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
// Initialize starting of the changing elements array 	TokenNameCOMMENT_LINE	Initialize starting of the changing elements array 
changingElemSize	TokenNameIdentifier	 changing Elem Size
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// While scanline not complete 	TokenNameCOMMENT_LINE	While scanline not complete 
while	TokenNamewhile	
(	TokenNameLPAREN	
bitOffset	TokenNameIdentifier	 bit Offset
<	TokenNameLESS	
w	TokenNameIdentifier	 w
)	TokenNameRPAREN	
{	TokenNameLBRACE	
while	TokenNamewhile	
(	TokenNameLPAREN	
isWhite	TokenNameIdentifier	 is White
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// White run 	TokenNameCOMMENT_LINE	White run 
current	TokenNameIdentifier	 current
=	TokenNameEQUAL	
nextNBits	TokenNameIdentifier	 next N Bits
(	TokenNameLPAREN	
10	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
entry	TokenNameIdentifier	 entry
=	TokenNameEQUAL	
white	TokenNameIdentifier	 white
[	TokenNameLBRACKET	
current	TokenNameIdentifier	 current
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
// Get the 3 fields from the entry 	TokenNameCOMMENT_LINE	Get the 3 fields from the entry 
isT	TokenNameIdentifier	 is T
=	TokenNameEQUAL	
entry	TokenNameIdentifier	 entry
&	TokenNameAND	
0x0001	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
bits	TokenNameIdentifier	 bits
=	TokenNameEQUAL	
(	TokenNameLPAREN	
entry	TokenNameIdentifier	 entry
>>>	TokenNameUNSIGNED_RIGHT_SHIFT	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
&	TokenNameAND	
0x0f	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
bits	TokenNameIdentifier	 bits
==	TokenNameEQUAL_EQUAL	
12	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Additional Make up code 	TokenNameCOMMENT_LINE	Additional Make up code 
// Get the next 2 bits 	TokenNameCOMMENT_LINE	Get the next 2 bits 
twoBits	TokenNameIdentifier	 two Bits
=	TokenNameEQUAL	
nextLesserThan8Bits	TokenNameIdentifier	 next Lesser Than8 Bits
(	TokenNameLPAREN	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Consolidate the 2 new bits and last 2 bits into 4 bits 	TokenNameCOMMENT_LINE	Consolidate the 2 new bits and last 2 bits into 4 bits 
current	TokenNameIdentifier	 current
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
<<	TokenNameLEFT_SHIFT	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
&	TokenNameAND	
0x000c	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
|	TokenNameOR	
twoBits	TokenNameIdentifier	 two Bits
;	TokenNameSEMICOLON	
entry	TokenNameIdentifier	 entry
=	TokenNameEQUAL	
additionalMakeup	TokenNameIdentifier	 additional Makeup
[	TokenNameLBRACKET	
current	TokenNameIdentifier	 current
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
bits	TokenNameIdentifier	 bits
=	TokenNameEQUAL	
(	TokenNameLPAREN	
entry	TokenNameIdentifier	 entry
>>>	TokenNameUNSIGNED_RIGHT_SHIFT	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
&	TokenNameAND	
0x07	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// 3 bits 0000 0111 	TokenNameCOMMENT_LINE	3 bits 0000 0111 
code	TokenNameIdentifier	 code
=	TokenNameEQUAL	
(	TokenNameLPAREN	
entry	TokenNameIdentifier	 entry
>>>	TokenNameUNSIGNED_RIGHT_SHIFT	
4	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
&	TokenNameAND	
0x0fff	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// 12 bits 	TokenNameCOMMENT_LINE	12 bits 
bitOffset	TokenNameIdentifier	 bit Offset
+=	TokenNamePLUS_EQUAL	
code	TokenNameIdentifier	 code
;	TokenNameSEMICOLON	
// Skip white run 	TokenNameCOMMENT_LINE	Skip white run 
updatePointer	TokenNameIdentifier	 update Pointer
(	TokenNameLPAREN	
4	TokenNameIntegerLiteral	
-	TokenNameMINUS	
bits	TokenNameIdentifier	 bits
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
bits	TokenNameIdentifier	 bits
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// ERROR 	TokenNameCOMMENT_LINE	ERROR 
throw	TokenNamethrow	
new	TokenNamenew	
Error	TokenNameIdentifier	 Error
(	TokenNameLPAREN	
"TIFFFaxDecoder0"	TokenNameStringLiteral	TIFFFaxDecoder0
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
bits	TokenNameIdentifier	 bits
==	TokenNameEQUAL_EQUAL	
15	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// EOL 	TokenNameCOMMENT_LINE	EOL 
throw	TokenNamethrow	
new	TokenNamenew	
Error	TokenNameIdentifier	 Error
(	TokenNameLPAREN	
"TIFFFaxDecoder1"	TokenNameStringLiteral	TIFFFaxDecoder1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// 11 bits - 0000 0111 1111 1111 = 0x07ff 	TokenNameCOMMENT_LINE	11 bits - 0000 0111 1111 1111 = 0x07ff 
code	TokenNameIdentifier	 code
=	TokenNameEQUAL	
(	TokenNameLPAREN	
entry	TokenNameIdentifier	 entry
>>>	TokenNameUNSIGNED_RIGHT_SHIFT	
5	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
&	TokenNameAND	
0x07ff	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
bitOffset	TokenNameIdentifier	 bit Offset
+=	TokenNamePLUS_EQUAL	
code	TokenNameIdentifier	 code
;	TokenNameSEMICOLON	
updatePointer	TokenNameIdentifier	 update Pointer
(	TokenNameLPAREN	
10	TokenNameIntegerLiteral	
-	TokenNameMINUS	
bits	TokenNameIdentifier	 bits
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
isT	TokenNameIdentifier	 is T
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
isWhite	TokenNameIdentifier	 is White
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
currChangingElems	TokenNameIdentifier	 curr Changing Elems
[	TokenNameLBRACKET	
changingElemSize	TokenNameIdentifier	 changing Elem Size
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
bitOffset	TokenNameIdentifier	 bit Offset
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// Check whether this run completed one width, if so 	TokenNameCOMMENT_LINE	Check whether this run completed one width, if so 
// advance to next byte boundary for compression = 2. 	TokenNameCOMMENT_LINE	advance to next byte boundary for compression = 2. 
if	TokenNameif	
(	TokenNameLPAREN	
bitOffset	TokenNameIdentifier	 bit Offset
==	TokenNameEQUAL_EQUAL	
w	TokenNameIdentifier	 w
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
compression	TokenNameIdentifier	 compression
==	TokenNameEQUAL_EQUAL	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
advancePointer	TokenNameIdentifier	 advance Pointer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
while	TokenNamewhile	
(	TokenNameLPAREN	
!	TokenNameNOT	
isWhite	TokenNameIdentifier	 is White
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Black run 	TokenNameCOMMENT_LINE	Black run 
current	TokenNameIdentifier	 current
=	TokenNameEQUAL	
nextLesserThan8Bits	TokenNameIdentifier	 next Lesser Than8 Bits
(	TokenNameLPAREN	
4	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
entry	TokenNameIdentifier	 entry
=	TokenNameEQUAL	
initBlack	TokenNameIdentifier	 init Black
[	TokenNameLBRACKET	
current	TokenNameIdentifier	 current
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
// Get the 3 fields from the entry 	TokenNameCOMMENT_LINE	Get the 3 fields from the entry 
isT	TokenNameIdentifier	 is T
=	TokenNameEQUAL	
entry	TokenNameIdentifier	 entry
&	TokenNameAND	
0x0001	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
bits	TokenNameIdentifier	 bits
=	TokenNameEQUAL	
(	TokenNameLPAREN	
entry	TokenNameIdentifier	 entry
>>>	TokenNameUNSIGNED_RIGHT_SHIFT	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
&	TokenNameAND	
0x000f	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
code	TokenNameIdentifier	 code
=	TokenNameEQUAL	
(	TokenNameLPAREN	
entry	TokenNameIdentifier	 entry
>>>	TokenNameUNSIGNED_RIGHT_SHIFT	
5	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
&	TokenNameAND	
0x07ff	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
code	TokenNameIdentifier	 code
==	TokenNameEQUAL_EQUAL	
100	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
current	TokenNameIdentifier	 current
=	TokenNameEQUAL	
nextNBits	TokenNameIdentifier	 next N Bits
(	TokenNameLPAREN	
9	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
entry	TokenNameIdentifier	 entry
=	TokenNameEQUAL	
black	TokenNameIdentifier	 black
[	TokenNameLBRACKET	
current	TokenNameIdentifier	 current
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
// Get the 3 fields from the entry 	TokenNameCOMMENT_LINE	Get the 3 fields from the entry 
isT	TokenNameIdentifier	 is T
=	TokenNameEQUAL	
entry	TokenNameIdentifier	 entry
&	TokenNameAND	
0x0001	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
bits	TokenNameIdentifier	 bits
=	TokenNameEQUAL	
(	TokenNameLPAREN	
entry	TokenNameIdentifier	 entry
>>>	TokenNameUNSIGNED_RIGHT_SHIFT	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
&	TokenNameAND	
0x000f	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
code	TokenNameIdentifier	 code
=	TokenNameEQUAL	
(	TokenNameLPAREN	
entry	TokenNameIdentifier	 entry
>>>	TokenNameUNSIGNED_RIGHT_SHIFT	
5	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
&	TokenNameAND	
0x07ff	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
bits	TokenNameIdentifier	 bits
==	TokenNameEQUAL_EQUAL	
12	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Additional makeup codes 	TokenNameCOMMENT_LINE	Additional makeup codes 
updatePointer	TokenNameIdentifier	 update Pointer
(	TokenNameLPAREN	
5	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
current	TokenNameIdentifier	 current
=	TokenNameEQUAL	
nextLesserThan8Bits	TokenNameIdentifier	 next Lesser Than8 Bits
(	TokenNameLPAREN	
4	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
entry	TokenNameIdentifier	 entry
=	TokenNameEQUAL	
additionalMakeup	TokenNameIdentifier	 additional Makeup
[	TokenNameLBRACKET	
current	TokenNameIdentifier	 current
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
bits	TokenNameIdentifier	 bits
=	TokenNameEQUAL	
(	TokenNameLPAREN	
entry	TokenNameIdentifier	 entry
>>>	TokenNameUNSIGNED_RIGHT_SHIFT	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
&	TokenNameAND	
0x07	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// 3 bits 0000 0111 	TokenNameCOMMENT_LINE	3 bits 0000 0111 
code	TokenNameIdentifier	 code
=	TokenNameEQUAL	
(	TokenNameLPAREN	
entry	TokenNameIdentifier	 entry
>>>	TokenNameUNSIGNED_RIGHT_SHIFT	
4	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
&	TokenNameAND	
0x0fff	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// 12 bits 	TokenNameCOMMENT_LINE	12 bits 
setToBlack	TokenNameIdentifier	 set To Black
(	TokenNameLPAREN	
buffer	TokenNameIdentifier	 buffer
,	TokenNameCOMMA	
lineOffset	TokenNameIdentifier	 line Offset
,	TokenNameCOMMA	
bitOffset	TokenNameIdentifier	 bit Offset
,	TokenNameCOMMA	
code	TokenNameIdentifier	 code
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
bitOffset	TokenNameIdentifier	 bit Offset
+=	TokenNamePLUS_EQUAL	
code	TokenNameIdentifier	 code
;	TokenNameSEMICOLON	
updatePointer	TokenNameIdentifier	 update Pointer
(	TokenNameLPAREN	
4	TokenNameIntegerLiteral	
-	TokenNameMINUS	
bits	TokenNameIdentifier	 bits
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
bits	TokenNameIdentifier	 bits
==	TokenNameEQUAL_EQUAL	
15	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// EOL code 	TokenNameCOMMENT_LINE	EOL code 
throw	TokenNamethrow	
new	TokenNamenew	
Error	TokenNameIdentifier	 Error
(	TokenNameLPAREN	
"TIFFFaxDecoder2"	TokenNameStringLiteral	TIFFFaxDecoder2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
setToBlack	TokenNameIdentifier	 set To Black
(	TokenNameLPAREN	
buffer	TokenNameIdentifier	 buffer
,	TokenNameCOMMA	
lineOffset	TokenNameIdentifier	 line Offset
,	TokenNameCOMMA	
bitOffset	TokenNameIdentifier	 bit Offset
,	TokenNameCOMMA	
code	TokenNameIdentifier	 code
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
bitOffset	TokenNameIdentifier	 bit Offset
+=	TokenNamePLUS_EQUAL	
code	TokenNameIdentifier	 code
;	TokenNameSEMICOLON	
updatePointer	TokenNameIdentifier	 update Pointer
(	TokenNameLPAREN	
9	TokenNameIntegerLiteral	
-	TokenNameMINUS	
bits	TokenNameIdentifier	 bits
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
isT	TokenNameIdentifier	 is T
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
isWhite	TokenNameIdentifier	 is White
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
currChangingElems	TokenNameIdentifier	 curr Changing Elems
[	TokenNameLBRACKET	
changingElemSize	TokenNameIdentifier	 changing Elem Size
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
bitOffset	TokenNameIdentifier	 bit Offset
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
code	TokenNameIdentifier	 code
==	TokenNameEQUAL_EQUAL	
200	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Is a Terminating code 	TokenNameCOMMENT_LINE	Is a Terminating code 
current	TokenNameIdentifier	 current
=	TokenNameEQUAL	
nextLesserThan8Bits	TokenNameIdentifier	 next Lesser Than8 Bits
(	TokenNameLPAREN	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
entry	TokenNameIdentifier	 entry
=	TokenNameEQUAL	
twoBitBlack	TokenNameIdentifier	 two Bit Black
[	TokenNameLBRACKET	
current	TokenNameIdentifier	 current
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
code	TokenNameIdentifier	 code
=	TokenNameEQUAL	
(	TokenNameLPAREN	
entry	TokenNameIdentifier	 entry
>>>	TokenNameUNSIGNED_RIGHT_SHIFT	
5	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
&	TokenNameAND	
0x07ff	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
bits	TokenNameIdentifier	 bits
=	TokenNameEQUAL	
(	TokenNameLPAREN	
entry	TokenNameIdentifier	 entry
>>>	TokenNameUNSIGNED_RIGHT_SHIFT	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
&	TokenNameAND	
0x0f	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
setToBlack	TokenNameIdentifier	 set To Black
(	TokenNameLPAREN	
buffer	TokenNameIdentifier	 buffer
,	TokenNameCOMMA	
lineOffset	TokenNameIdentifier	 line Offset
,	TokenNameCOMMA	
bitOffset	TokenNameIdentifier	 bit Offset
,	TokenNameCOMMA	
code	TokenNameIdentifier	 code
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
bitOffset	TokenNameIdentifier	 bit Offset
+=	TokenNamePLUS_EQUAL	
code	TokenNameIdentifier	 code
;	TokenNameSEMICOLON	
updatePointer	TokenNameIdentifier	 update Pointer
(	TokenNameLPAREN	
2	TokenNameIntegerLiteral	
-	TokenNameMINUS	
bits	TokenNameIdentifier	 bits
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
isWhite	TokenNameIdentifier	 is White
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
currChangingElems	TokenNameIdentifier	 curr Changing Elems
[	TokenNameLBRACKET	
changingElemSize	TokenNameIdentifier	 changing Elem Size
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
bitOffset	TokenNameIdentifier	 bit Offset
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// Is a Terminating code 	TokenNameCOMMENT_LINE	Is a Terminating code 
setToBlack	TokenNameIdentifier	 set To Black
(	TokenNameLPAREN	
buffer	TokenNameIdentifier	 buffer
,	TokenNameCOMMA	
lineOffset	TokenNameIdentifier	 line Offset
,	TokenNameCOMMA	
bitOffset	TokenNameIdentifier	 bit Offset
,	TokenNameCOMMA	
code	TokenNameIdentifier	 code
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
bitOffset	TokenNameIdentifier	 bit Offset
+=	TokenNamePLUS_EQUAL	
code	TokenNameIdentifier	 code
;	TokenNameSEMICOLON	
updatePointer	TokenNameIdentifier	 update Pointer
(	TokenNameLPAREN	
4	TokenNameIntegerLiteral	
-	TokenNameMINUS	
bits	TokenNameIdentifier	 bits
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
isWhite	TokenNameIdentifier	 is White
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
currChangingElems	TokenNameIdentifier	 curr Changing Elems
[	TokenNameLBRACKET	
changingElemSize	TokenNameIdentifier	 changing Elem Size
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
bitOffset	TokenNameIdentifier	 bit Offset
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// Check whether this run completed one width 	TokenNameCOMMENT_LINE	Check whether this run completed one width 
if	TokenNameif	
(	TokenNameLPAREN	
bitOffset	TokenNameIdentifier	 bit Offset
==	TokenNameEQUAL_EQUAL	
w	TokenNameIdentifier	 w
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
compression	TokenNameIdentifier	 compression
==	TokenNameEQUAL_EQUAL	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
advancePointer	TokenNameIdentifier	 advance Pointer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
currChangingElems	TokenNameIdentifier	 curr Changing Elems
[	TokenNameLBRACKET	
changingElemSize	TokenNameIdentifier	 changing Elem Size
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
bitOffset	TokenNameIdentifier	 bit Offset
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Two-dimensional decoding methods 	TokenNameCOMMENT_LINE	Two-dimensional decoding methods 
public	TokenNamepublic	
void	TokenNamevoid	
decode2D	TokenNameIdentifier	 decode2 D
(	TokenNameLPAREN	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
buffer	TokenNameIdentifier	 buffer
,	TokenNameCOMMA	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
compData	TokenNameIdentifier	 comp Data
,	TokenNameCOMMA	
int	TokenNameint	
startX	TokenNameIdentifier	 start X
,	TokenNameCOMMA	
int	TokenNameint	
height	TokenNameIdentifier	 height
,	TokenNameCOMMA	
long	TokenNamelong	
tiffT4Options	TokenNameIdentifier	 tiff T4 Options
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
data	TokenNameIdentifier	 data
=	TokenNameEQUAL	
compData	TokenNameIdentifier	 comp Data
;	TokenNameSEMICOLON	
compression	TokenNameIdentifier	 compression
=	TokenNameEQUAL	
3	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
bitPointer	TokenNameIdentifier	 bit Pointer
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
bytePointer	TokenNameIdentifier	 byte Pointer
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
scanlineStride	TokenNameIdentifier	 scanline Stride
=	TokenNameEQUAL	
(	TokenNameLPAREN	
w	TokenNameIdentifier	 w
+	TokenNamePLUS	
7	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
/	TokenNameDIVIDE	
8	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
a0	TokenNameIdentifier	 a0
,	TokenNameCOMMA	
a1	TokenNameIdentifier	 a1
,	TokenNameCOMMA	
b1	TokenNameIdentifier	 b1
,	TokenNameCOMMA	
b2	TokenNameIdentifier	 b2
;	TokenNameSEMICOLON	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
b	TokenNameIdentifier	 b
=	TokenNameEQUAL	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
int	TokenNameint	
entry	TokenNameIdentifier	 entry
,	TokenNameCOMMA	
code	TokenNameIdentifier	 code
,	TokenNameCOMMA	
bits	TokenNameIdentifier	 bits
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
isWhite	TokenNameIdentifier	 is White
;	TokenNameSEMICOLON	
int	TokenNameint	
currIndex	TokenNameIdentifier	 curr Index
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
temp	TokenNameIdentifier	 temp
;	TokenNameSEMICOLON	
// fillBits - dealt with this in readEOL 	TokenNameCOMMENT_LINE	fillBits - dealt with this in readEOL 
// 1D/2D encoding - dealt with this in readEOL 	TokenNameCOMMENT_LINE	1D/2D encoding - dealt with this in readEOL 
// uncompressedMode - haven't dealt with this yet. 	TokenNameCOMMENT_LINE	uncompressedMode - haven't dealt with this yet. 
oneD	TokenNameIdentifier	 one D
=	TokenNameEQUAL	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
tiffT4Options	TokenNameIdentifier	 tiff T4 Options
&	TokenNameAND	
0x01	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
uncompressedMode	TokenNameIdentifier	 uncompressed Mode
=	TokenNameEQUAL	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
tiffT4Options	TokenNameIdentifier	 tiff T4 Options
&	TokenNameAND	
0x02	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
>>	TokenNameRIGHT_SHIFT	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fillBits	TokenNameIdentifier	 fill Bits
=	TokenNameEQUAL	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
tiffT4Options	TokenNameIdentifier	 tiff T4 Options
&	TokenNameAND	
0x04	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
>>	TokenNameRIGHT_SHIFT	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// The data must start with an EOL code 	TokenNameCOMMENT_LINE	The data must start with an EOL code 
if	TokenNameif	
(	TokenNameLPAREN	
readEOL	TokenNameIdentifier	 read EOL
(	TokenNameLPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
Error	TokenNameIdentifier	 Error
(	TokenNameLPAREN	
"TIFFFaxDecoder3"	TokenNameStringLiteral	TIFFFaxDecoder3
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
int	TokenNameint	
lineOffset	TokenNameIdentifier	 line Offset
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
bitOffset	TokenNameIdentifier	 bit Offset
;	TokenNameSEMICOLON	
// Then the 1D encoded scanline data will occur, changing elements 	TokenNameCOMMENT_LINE	Then the 1D encoded scanline data will occur, changing elements 
// array gets set. 	TokenNameCOMMENT_LINE	array gets set. 
decodeNextScanline	TokenNameIdentifier	 decode Next Scanline
(	TokenNameLPAREN	
buffer	TokenNameIdentifier	 buffer
,	TokenNameCOMMA	
lineOffset	TokenNameIdentifier	 line Offset
,	TokenNameCOMMA	
startX	TokenNameIdentifier	 start X
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
lineOffset	TokenNameIdentifier	 line Offset
+=	TokenNamePLUS_EQUAL	
scanlineStride	TokenNameIdentifier	 scanline Stride
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
lines	TokenNameIdentifier	 lines
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
lines	TokenNameIdentifier	 lines
<	TokenNameLESS	
height	TokenNameIdentifier	 height
;	TokenNameSEMICOLON	
lines	TokenNameIdentifier	 lines
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Every line must begin with an EOL followed by a bit which 	TokenNameCOMMENT_LINE	Every line must begin with an EOL followed by a bit which 
// indicates whether the following scanline is 1D or 2D encoded. 	TokenNameCOMMENT_LINE	indicates whether the following scanline is 1D or 2D encoded. 
if	TokenNameif	
(	TokenNameLPAREN	
readEOL	TokenNameIdentifier	 read EOL
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// 2D encoded scanline follows 	TokenNameCOMMENT_LINE	2D encoded scanline follows 
// Initialize previous scanlines changing elements, and 	TokenNameCOMMENT_LINE	Initialize previous scanlines changing elements, and 
// initialize current scanline's changing elements array 	TokenNameCOMMENT_LINE	initialize current scanline's changing elements array 
temp	TokenNameIdentifier	 temp
=	TokenNameEQUAL	
prevChangingElems	TokenNameIdentifier	 prev Changing Elems
;	TokenNameSEMICOLON	
prevChangingElems	TokenNameIdentifier	 prev Changing Elems
=	TokenNameEQUAL	
currChangingElems	TokenNameIdentifier	 curr Changing Elems
;	TokenNameSEMICOLON	
currChangingElems	TokenNameIdentifier	 curr Changing Elems
=	TokenNameEQUAL	
temp	TokenNameIdentifier	 temp
;	TokenNameSEMICOLON	
currIndex	TokenNameIdentifier	 curr Index
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// a0 has to be set just before the start of this scanline. 	TokenNameCOMMENT_LINE	a0 has to be set just before the start of this scanline. 
a0	TokenNameIdentifier	 a0
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
isWhite	TokenNameIdentifier	 is White
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
bitOffset	TokenNameIdentifier	 bit Offset
=	TokenNameEQUAL	
startX	TokenNameIdentifier	 start X
;	TokenNameSEMICOLON	
lastChangingElement	TokenNameIdentifier	 last Changing Element
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
bitOffset	TokenNameIdentifier	 bit Offset
<	TokenNameLESS	
w	TokenNameIdentifier	 w
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Get the next changing element 	TokenNameCOMMENT_LINE	Get the next changing element 
getNextChangingElement	TokenNameIdentifier	 get Next Changing Element
(	TokenNameLPAREN	
a0	TokenNameIdentifier	 a0
,	TokenNameCOMMA	
isWhite	TokenNameIdentifier	 is White
,	TokenNameCOMMA	
b	TokenNameIdentifier	 b
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
b1	TokenNameIdentifier	 b1
=	TokenNameEQUAL	
b	TokenNameIdentifier	 b
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
b2	TokenNameIdentifier	 b2
=	TokenNameEQUAL	
b	TokenNameIdentifier	 b
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
// Get the next seven bits 	TokenNameCOMMENT_LINE	Get the next seven bits 
entry	TokenNameIdentifier	 entry
=	TokenNameEQUAL	
nextLesserThan8Bits	TokenNameIdentifier	 next Lesser Than8 Bits
(	TokenNameLPAREN	
7	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Run these through the 2DCodes table 	TokenNameCOMMENT_LINE	Run these through the 2DCodes table 
entry	TokenNameIdentifier	 entry
=	TokenNameEQUAL	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
twoDCodes	TokenNameIdentifier	 two D Codes
[	TokenNameLBRACKET	
entry	TokenNameIdentifier	 entry
]	TokenNameRBRACKET	
&	TokenNameAND	
0xff	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Get the code and the number of bits used up 	TokenNameCOMMENT_LINE	Get the code and the number of bits used up 
code	TokenNameIdentifier	 code
=	TokenNameEQUAL	
(	TokenNameLPAREN	
entry	TokenNameIdentifier	 entry
&	TokenNameAND	
0x78	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
>>>	TokenNameUNSIGNED_RIGHT_SHIFT	
3	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
bits	TokenNameIdentifier	 bits
=	TokenNameEQUAL	
entry	TokenNameIdentifier	 entry
&	TokenNameAND	
0x07	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
code	TokenNameIdentifier	 code
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
isWhite	TokenNameIdentifier	 is White
)	TokenNameRPAREN	
{	TokenNameLBRACE	
setToBlack	TokenNameIdentifier	 set To Black
(	TokenNameLPAREN	
buffer	TokenNameIdentifier	 buffer
,	TokenNameCOMMA	
lineOffset	TokenNameIdentifier	 line Offset
,	TokenNameCOMMA	
bitOffset	TokenNameIdentifier	 bit Offset
,	TokenNameCOMMA	
b2	TokenNameIdentifier	 b2
-	TokenNameMINUS	
bitOffset	TokenNameIdentifier	 bit Offset
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
bitOffset	TokenNameIdentifier	 bit Offset
=	TokenNameEQUAL	
a0	TokenNameIdentifier	 a0
=	TokenNameEQUAL	
b2	TokenNameIdentifier	 b2
;	TokenNameSEMICOLON	
// Set pointer to consume the correct number of bits. 	TokenNameCOMMENT_LINE	Set pointer to consume the correct number of bits. 
updatePointer	TokenNameIdentifier	 update Pointer
(	TokenNameLPAREN	
7	TokenNameIntegerLiteral	
-	TokenNameMINUS	
bits	TokenNameIdentifier	 bits
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
code	TokenNameIdentifier	 code
==	TokenNameEQUAL_EQUAL	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Horizontal 	TokenNameCOMMENT_LINE	Horizontal 
updatePointer	TokenNameIdentifier	 update Pointer
(	TokenNameLPAREN	
7	TokenNameIntegerLiteral	
-	TokenNameMINUS	
bits	TokenNameIdentifier	 bits
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// identify the next 2 codes. 	TokenNameCOMMENT_LINE	identify the next 2 codes. 
int	TokenNameint	
number	TokenNameIdentifier	 number
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
isWhite	TokenNameIdentifier	 is White
)	TokenNameRPAREN	
{	TokenNameLBRACE	
number	TokenNameIdentifier	 number
=	TokenNameEQUAL	
decodeWhiteCodeWord	TokenNameIdentifier	 decode White Code Word
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
bitOffset	TokenNameIdentifier	 bit Offset
+=	TokenNamePLUS_EQUAL	
number	TokenNameIdentifier	 number
;	TokenNameSEMICOLON	
currChangingElems	TokenNameIdentifier	 curr Changing Elems
[	TokenNameLBRACKET	
currIndex	TokenNameIdentifier	 curr Index
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
bitOffset	TokenNameIdentifier	 bit Offset
;	TokenNameSEMICOLON	
number	TokenNameIdentifier	 number
=	TokenNameEQUAL	
decodeBlackCodeWord	TokenNameIdentifier	 decode Black Code Word
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
setToBlack	TokenNameIdentifier	 set To Black
(	TokenNameLPAREN	
buffer	TokenNameIdentifier	 buffer
,	TokenNameCOMMA	
lineOffset	TokenNameIdentifier	 line Offset
,	TokenNameCOMMA	
bitOffset	TokenNameIdentifier	 bit Offset
,	TokenNameCOMMA	
number	TokenNameIdentifier	 number
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
bitOffset	TokenNameIdentifier	 bit Offset
+=	TokenNamePLUS_EQUAL	
number	TokenNameIdentifier	 number
;	TokenNameSEMICOLON	
currChangingElems	TokenNameIdentifier	 curr Changing Elems
[	TokenNameLBRACKET	
currIndex	TokenNameIdentifier	 curr Index
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
bitOffset	TokenNameIdentifier	 bit Offset
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
number	TokenNameIdentifier	 number
=	TokenNameEQUAL	
decodeBlackCodeWord	TokenNameIdentifier	 decode Black Code Word
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
setToBlack	TokenNameIdentifier	 set To Black
(	TokenNameLPAREN	
buffer	TokenNameIdentifier	 buffer
,	TokenNameCOMMA	
lineOffset	TokenNameIdentifier	 line Offset
,	TokenNameCOMMA	
bitOffset	TokenNameIdentifier	 bit Offset
,	TokenNameCOMMA	
number	TokenNameIdentifier	 number
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
bitOffset	TokenNameIdentifier	 bit Offset
+=	TokenNamePLUS_EQUAL	
number	TokenNameIdentifier	 number
;	TokenNameSEMICOLON	
currChangingElems	TokenNameIdentifier	 curr Changing Elems
[	TokenNameLBRACKET	
currIndex	TokenNameIdentifier	 curr Index
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
bitOffset	TokenNameIdentifier	 bit Offset
;	TokenNameSEMICOLON	
number	TokenNameIdentifier	 number
=	TokenNameEQUAL	
decodeWhiteCodeWord	TokenNameIdentifier	 decode White Code Word
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
bitOffset	TokenNameIdentifier	 bit Offset
+=	TokenNamePLUS_EQUAL	
number	TokenNameIdentifier	 number
;	TokenNameSEMICOLON	
currChangingElems	TokenNameIdentifier	 curr Changing Elems
[	TokenNameLBRACKET	
currIndex	TokenNameIdentifier	 curr Index
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
bitOffset	TokenNameIdentifier	 bit Offset
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
a0	TokenNameIdentifier	 a0
=	TokenNameEQUAL	
bitOffset	TokenNameIdentifier	 bit Offset
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
code	TokenNameIdentifier	 code
<=	TokenNameLESS_EQUAL	
8	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Vertical 	TokenNameCOMMENT_LINE	Vertical 
a1	TokenNameIdentifier	 a1
=	TokenNameEQUAL	
b1	TokenNameIdentifier	 b1
+	TokenNamePLUS	
(	TokenNameLPAREN	
code	TokenNameIdentifier	 code
-	TokenNameMINUS	
5	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
currChangingElems	TokenNameIdentifier	 curr Changing Elems
[	TokenNameLBRACKET	
currIndex	TokenNameIdentifier	 curr Index
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
a1	TokenNameIdentifier	 a1
;	TokenNameSEMICOLON	
// We write the current color till a1 - 1 pos, 	TokenNameCOMMENT_LINE	We write the current color till a1 - 1 pos, 
// since a1 is where the next color starts 	TokenNameCOMMENT_LINE	since a1 is where the next color starts 
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
isWhite	TokenNameIdentifier	 is White
)	TokenNameRPAREN	
{	TokenNameLBRACE	
setToBlack	TokenNameIdentifier	 set To Black
(	TokenNameLPAREN	
buffer	TokenNameIdentifier	 buffer
,	TokenNameCOMMA	
lineOffset	TokenNameIdentifier	 line Offset
,	TokenNameCOMMA	
bitOffset	TokenNameIdentifier	 bit Offset
,	TokenNameCOMMA	
a1	TokenNameIdentifier	 a1
-	TokenNameMINUS	
bitOffset	TokenNameIdentifier	 bit Offset
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
bitOffset	TokenNameIdentifier	 bit Offset
=	TokenNameEQUAL	
a0	TokenNameIdentifier	 a0
=	TokenNameEQUAL	
a1	TokenNameIdentifier	 a1
;	TokenNameSEMICOLON	
isWhite	TokenNameIdentifier	 is White
=	TokenNameEQUAL	
!	TokenNameNOT	
isWhite	TokenNameIdentifier	 is White
;	TokenNameSEMICOLON	
updatePointer	TokenNameIdentifier	 update Pointer
(	TokenNameLPAREN	
7	TokenNameIntegerLiteral	
-	TokenNameMINUS	
bits	TokenNameIdentifier	 bits
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
Error	TokenNameIdentifier	 Error
(	TokenNameLPAREN	
"TIFFFaxDecoder4"	TokenNameStringLiteral	TIFFFaxDecoder4
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// Add the changing element beyond the current scanline for the 	TokenNameCOMMENT_LINE	Add the changing element beyond the current scanline for the 
// other color too 	TokenNameCOMMENT_LINE	other color too 
currChangingElems	TokenNameIdentifier	 curr Changing Elems
[	TokenNameLBRACKET	
currIndex	TokenNameIdentifier	 curr Index
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
bitOffset	TokenNameIdentifier	 bit Offset
;	TokenNameSEMICOLON	
changingElemSize	TokenNameIdentifier	 changing Elem Size
=	TokenNameEQUAL	
currIndex	TokenNameIdentifier	 curr Index
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// 1D encoded scanline follows 	TokenNameCOMMENT_LINE	1D encoded scanline follows 
decodeNextScanline	TokenNameIdentifier	 decode Next Scanline
(	TokenNameLPAREN	
buffer	TokenNameIdentifier	 buffer
,	TokenNameCOMMA	
lineOffset	TokenNameIdentifier	 line Offset
,	TokenNameCOMMA	
startX	TokenNameIdentifier	 start X
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
lineOffset	TokenNameIdentifier	 line Offset
+=	TokenNamePLUS_EQUAL	
scanlineStride	TokenNameIdentifier	 scanline Stride
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
synchronized	TokenNamesynchronized	
void	TokenNamevoid	
decodeT6	TokenNameIdentifier	 decode T6
(	TokenNameLPAREN	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
buffer	TokenNameIdentifier	 buffer
,	TokenNameCOMMA	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
compData	TokenNameIdentifier	 comp Data
,	TokenNameCOMMA	
int	TokenNameint	
startX	TokenNameIdentifier	 start X
,	TokenNameCOMMA	
int	TokenNameint	
height	TokenNameIdentifier	 height
,	TokenNameCOMMA	
long	TokenNamelong	
tiffT6Options	TokenNameIdentifier	 tiff T6 Options
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
data	TokenNameIdentifier	 data
=	TokenNameEQUAL	
compData	TokenNameIdentifier	 comp Data
;	TokenNameSEMICOLON	
compression	TokenNameIdentifier	 compression
=	TokenNameEQUAL	
4	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
bitPointer	TokenNameIdentifier	 bit Pointer
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
bytePointer	TokenNameIdentifier	 byte Pointer
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
scanlineStride	TokenNameIdentifier	 scanline Stride
=	TokenNameEQUAL	
(	TokenNameLPAREN	
w	TokenNameIdentifier	 w
+	TokenNamePLUS	
7	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
/	TokenNameDIVIDE	
8	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
a0	TokenNameIdentifier	 a0
,	TokenNameCOMMA	
a1	TokenNameIdentifier	 a1
,	TokenNameCOMMA	
b1	TokenNameIdentifier	 b1
,	TokenNameCOMMA	
b2	TokenNameIdentifier	 b2
;	TokenNameSEMICOLON	
int	TokenNameint	
entry	TokenNameIdentifier	 entry
,	TokenNameCOMMA	
code	TokenNameIdentifier	 code
,	TokenNameCOMMA	
bits	TokenNameIdentifier	 bits
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
isWhite	TokenNameIdentifier	 is White
;	TokenNameSEMICOLON	
int	TokenNameint	
currIndex	TokenNameIdentifier	 curr Index
;	TokenNameSEMICOLON	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
temp	TokenNameIdentifier	 temp
;	TokenNameSEMICOLON	
// Return values from getNextChangingElement 	TokenNameCOMMENT_LINE	Return values from getNextChangingElement 
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
b	TokenNameIdentifier	 b
=	TokenNameEQUAL	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
// uncompressedMode - have written some code for this, but this 	TokenNameCOMMENT_LINE	uncompressedMode - have written some code for this, but this 
// has not been tested due to lack of test images using this optional 	TokenNameCOMMENT_LINE	has not been tested due to lack of test images using this optional 
uncompressedMode	TokenNameIdentifier	 uncompressed Mode
=	TokenNameEQUAL	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
tiffT6Options	TokenNameIdentifier	 tiff T6 Options
&	TokenNameAND	
0x02	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
>>	TokenNameRIGHT_SHIFT	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Local cached reference 	TokenNameCOMMENT_LINE	Local cached reference 
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
cce	TokenNameIdentifier	 cce
=	TokenNameEQUAL	
currChangingElems	TokenNameIdentifier	 curr Changing Elems
;	TokenNameSEMICOLON	
// Assume invisible preceding row of all white pixels and insert 	TokenNameCOMMENT_LINE	Assume invisible preceding row of all white pixels and insert 
// both black and white changing elements beyond the end of this 	TokenNameCOMMENT_LINE	both black and white changing elements beyond the end of this 
// imaginary scanline. 	TokenNameCOMMENT_LINE	imaginary scanline. 
changingElemSize	TokenNameIdentifier	 changing Elem Size
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
cce	TokenNameIdentifier	 cce
[	TokenNameLBRACKET	
changingElemSize	TokenNameIdentifier	 changing Elem Size
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
w	TokenNameIdentifier	 w
;	TokenNameSEMICOLON	
cce	TokenNameIdentifier	 cce
[	TokenNameLBRACKET	
changingElemSize	TokenNameIdentifier	 changing Elem Size
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
w	TokenNameIdentifier	 w
;	TokenNameSEMICOLON	
int	TokenNameint	
lineOffset	TokenNameIdentifier	 line Offset
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
bitOffset	TokenNameIdentifier	 bit Offset
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
lines	TokenNameIdentifier	 lines
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
lines	TokenNameIdentifier	 lines
<	TokenNameLESS	
height	TokenNameIdentifier	 height
;	TokenNameSEMICOLON	
lines	TokenNameIdentifier	 lines
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// a0 has to be set just before the start of the scanline. 	TokenNameCOMMENT_LINE	a0 has to be set just before the start of the scanline. 
a0	TokenNameIdentifier	 a0
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
isWhite	TokenNameIdentifier	 is White
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
// Assign the changing elements of the previous scanline to 	TokenNameCOMMENT_LINE	Assign the changing elements of the previous scanline to 
// prevChangingElems and start putting this new scanline's 	TokenNameCOMMENT_LINE	prevChangingElems and start putting this new scanline's 
// changing elements into the currChangingElems. 	TokenNameCOMMENT_LINE	changing elements into the currChangingElems. 
temp	TokenNameIdentifier	 temp
=	TokenNameEQUAL	
prevChangingElems	TokenNameIdentifier	 prev Changing Elems
;	TokenNameSEMICOLON	
prevChangingElems	TokenNameIdentifier	 prev Changing Elems
=	TokenNameEQUAL	
currChangingElems	TokenNameIdentifier	 curr Changing Elems
;	TokenNameSEMICOLON	
cce	TokenNameIdentifier	 cce
=	TokenNameEQUAL	
currChangingElems	TokenNameIdentifier	 curr Changing Elems
=	TokenNameEQUAL	
temp	TokenNameIdentifier	 temp
;	TokenNameSEMICOLON	
currIndex	TokenNameIdentifier	 curr Index
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// Start decoding the scanline at startX in the raster 	TokenNameCOMMENT_LINE	Start decoding the scanline at startX in the raster 
bitOffset	TokenNameIdentifier	 bit Offset
=	TokenNameEQUAL	
startX	TokenNameIdentifier	 start X
;	TokenNameSEMICOLON	
// Reset search start position for getNextChangingElement 	TokenNameCOMMENT_LINE	Reset search start position for getNextChangingElement 
lastChangingElement	TokenNameIdentifier	 last Changing Element
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// Till one whole scanline is decoded 	TokenNameCOMMENT_LINE	Till one whole scanline is decoded 
while	TokenNamewhile	
(	TokenNameLPAREN	
bitOffset	TokenNameIdentifier	 bit Offset
<	TokenNameLESS	
w	TokenNameIdentifier	 w
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Get the next changing element 	TokenNameCOMMENT_LINE	Get the next changing element 
getNextChangingElement	TokenNameIdentifier	 get Next Changing Element
(	TokenNameLPAREN	
a0	TokenNameIdentifier	 a0
,	TokenNameCOMMA	
isWhite	TokenNameIdentifier	 is White
,	TokenNameCOMMA	
b	TokenNameIdentifier	 b
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
b1	TokenNameIdentifier	 b1
=	TokenNameEQUAL	
b	TokenNameIdentifier	 b
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
b2	TokenNameIdentifier	 b2
=	TokenNameEQUAL	
b	TokenNameIdentifier	 b
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
// Get the next seven bits 	TokenNameCOMMENT_LINE	Get the next seven bits 
entry	TokenNameIdentifier	 entry
=	TokenNameEQUAL	
nextLesserThan8Bits	TokenNameIdentifier	 next Lesser Than8 Bits
(	TokenNameLPAREN	
7	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Run these through the 2DCodes table 	TokenNameCOMMENT_LINE	Run these through the 2DCodes table 
entry	TokenNameIdentifier	 entry
=	TokenNameEQUAL	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
twoDCodes	TokenNameIdentifier	 two D Codes
[	TokenNameLBRACKET	
entry	TokenNameIdentifier	 entry
]	TokenNameRBRACKET	
&	TokenNameAND	
0xff	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Get the code and the number of bits used up 	TokenNameCOMMENT_LINE	Get the code and the number of bits used up 
code	TokenNameIdentifier	 code
=	TokenNameEQUAL	
(	TokenNameLPAREN	
entry	TokenNameIdentifier	 entry
&	TokenNameAND	
0x78	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
>>>	TokenNameUNSIGNED_RIGHT_SHIFT	
3	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
bits	TokenNameIdentifier	 bits
=	TokenNameEQUAL	
entry	TokenNameIdentifier	 entry
&	TokenNameAND	
0x07	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
code	TokenNameIdentifier	 code
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Pass 	TokenNameCOMMENT_LINE	Pass 
// We always assume WhiteIsZero format for fax. 	TokenNameCOMMENT_LINE	We always assume WhiteIsZero format for fax. 
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
isWhite	TokenNameIdentifier	 is White
)	TokenNameRPAREN	
{	TokenNameLBRACE	
setToBlack	TokenNameIdentifier	 set To Black
(	TokenNameLPAREN	
buffer	TokenNameIdentifier	 buffer
,	TokenNameCOMMA	
lineOffset	TokenNameIdentifier	 line Offset
,	TokenNameCOMMA	
bitOffset	TokenNameIdentifier	 bit Offset
,	TokenNameCOMMA	
b2	TokenNameIdentifier	 b2
-	TokenNameMINUS	
bitOffset	TokenNameIdentifier	 bit Offset
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
bitOffset	TokenNameIdentifier	 bit Offset
=	TokenNameEQUAL	
a0	TokenNameIdentifier	 a0
=	TokenNameEQUAL	
b2	TokenNameIdentifier	 b2
;	TokenNameSEMICOLON	
// Set pointer to only consume the correct number of bits. 	TokenNameCOMMENT_LINE	Set pointer to only consume the correct number of bits. 
updatePointer	TokenNameIdentifier	 update Pointer
(	TokenNameLPAREN	
7	TokenNameIntegerLiteral	
-	TokenNameMINUS	
bits	TokenNameIdentifier	 bits
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
code	TokenNameIdentifier	 code
==	TokenNameEQUAL_EQUAL	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Horizontal 	TokenNameCOMMENT_LINE	Horizontal 
// Set pointer to only consume the correct number of bits. 	TokenNameCOMMENT_LINE	Set pointer to only consume the correct number of bits. 
updatePointer	TokenNameIdentifier	 update Pointer
(	TokenNameLPAREN	
7	TokenNameIntegerLiteral	
-	TokenNameMINUS	
bits	TokenNameIdentifier	 bits
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// identify the next 2 alternating color codes. 	TokenNameCOMMENT_LINE	identify the next 2 alternating color codes. 
int	TokenNameint	
number	TokenNameIdentifier	 number
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
isWhite	TokenNameIdentifier	 is White
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Following are white and black runs 	TokenNameCOMMENT_LINE	Following are white and black runs 
number	TokenNameIdentifier	 number
=	TokenNameEQUAL	
decodeWhiteCodeWord	TokenNameIdentifier	 decode White Code Word
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
bitOffset	TokenNameIdentifier	 bit Offset
+=	TokenNamePLUS_EQUAL	
number	TokenNameIdentifier	 number
;	TokenNameSEMICOLON	
cce	TokenNameIdentifier	 cce
[	TokenNameLBRACKET	
currIndex	TokenNameIdentifier	 curr Index
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
bitOffset	TokenNameIdentifier	 bit Offset
;	TokenNameSEMICOLON	
number	TokenNameIdentifier	 number
=	TokenNameEQUAL	
decodeBlackCodeWord	TokenNameIdentifier	 decode Black Code Word
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
setToBlack	TokenNameIdentifier	 set To Black
(	TokenNameLPAREN	
buffer	TokenNameIdentifier	 buffer
,	TokenNameCOMMA	
lineOffset	TokenNameIdentifier	 line Offset
,	TokenNameCOMMA	
bitOffset	TokenNameIdentifier	 bit Offset
,	TokenNameCOMMA	
number	TokenNameIdentifier	 number
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
bitOffset	TokenNameIdentifier	 bit Offset
+=	TokenNamePLUS_EQUAL	
number	TokenNameIdentifier	 number
;	TokenNameSEMICOLON	
cce	TokenNameIdentifier	 cce
[	TokenNameLBRACKET	
currIndex	TokenNameIdentifier	 curr Index
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
bitOffset	TokenNameIdentifier	 bit Offset
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// First a black run and then a white run follows 	TokenNameCOMMENT_LINE	First a black run and then a white run follows 
number	TokenNameIdentifier	 number
=	TokenNameEQUAL	
decodeBlackCodeWord	TokenNameIdentifier	 decode Black Code Word
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
setToBlack	TokenNameIdentifier	 set To Black
(	TokenNameLPAREN	
buffer	TokenNameIdentifier	 buffer
,	TokenNameCOMMA	
lineOffset	TokenNameIdentifier	 line Offset
,	TokenNameCOMMA	
bitOffset	TokenNameIdentifier	 bit Offset
,	TokenNameCOMMA	
number	TokenNameIdentifier	 number
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
bitOffset	TokenNameIdentifier	 bit Offset
+=	TokenNamePLUS_EQUAL	
number	TokenNameIdentifier	 number
;	TokenNameSEMICOLON	
cce	TokenNameIdentifier	 cce
[	TokenNameLBRACKET	
currIndex	TokenNameIdentifier	 curr Index
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
bitOffset	TokenNameIdentifier	 bit Offset
;	TokenNameSEMICOLON	
number	TokenNameIdentifier	 number
=	TokenNameEQUAL	
decodeWhiteCodeWord	TokenNameIdentifier	 decode White Code Word
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
bitOffset	TokenNameIdentifier	 bit Offset
+=	TokenNamePLUS_EQUAL	
number	TokenNameIdentifier	 number
;	TokenNameSEMICOLON	
cce	TokenNameIdentifier	 cce
[	TokenNameLBRACKET	
currIndex	TokenNameIdentifier	 curr Index
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
bitOffset	TokenNameIdentifier	 bit Offset
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
a0	TokenNameIdentifier	 a0
=	TokenNameEQUAL	
bitOffset	TokenNameIdentifier	 bit Offset
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
code	TokenNameIdentifier	 code
<=	TokenNameLESS_EQUAL	
8	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Vertical 	TokenNameCOMMENT_LINE	Vertical 
a1	TokenNameIdentifier	 a1
=	TokenNameEQUAL	
b1	TokenNameIdentifier	 b1
+	TokenNamePLUS	
(	TokenNameLPAREN	
code	TokenNameIdentifier	 code
-	TokenNameMINUS	
5	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
cce	TokenNameIdentifier	 cce
[	TokenNameLBRACKET	
currIndex	TokenNameIdentifier	 curr Index
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
a1	TokenNameIdentifier	 a1
;	TokenNameSEMICOLON	
// We write the current color till a1 - 1 pos, 	TokenNameCOMMENT_LINE	We write the current color till a1 - 1 pos, 
// since a1 is where the next color starts 	TokenNameCOMMENT_LINE	since a1 is where the next color starts 
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
isWhite	TokenNameIdentifier	 is White
)	TokenNameRPAREN	
{	TokenNameLBRACE	
setToBlack	TokenNameIdentifier	 set To Black
(	TokenNameLPAREN	
buffer	TokenNameIdentifier	 buffer
,	TokenNameCOMMA	
lineOffset	TokenNameIdentifier	 line Offset
,	TokenNameCOMMA	
bitOffset	TokenNameIdentifier	 bit Offset
,	TokenNameCOMMA	
a1	TokenNameIdentifier	 a1
-	TokenNameMINUS	
bitOffset	TokenNameIdentifier	 bit Offset
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
bitOffset	TokenNameIdentifier	 bit Offset
=	TokenNameEQUAL	
a0	TokenNameIdentifier	 a0
=	TokenNameEQUAL	
a1	TokenNameIdentifier	 a1
;	TokenNameSEMICOLON	
isWhite	TokenNameIdentifier	 is White
=	TokenNameEQUAL	
!	TokenNameNOT	
isWhite	TokenNameIdentifier	 is White
;	TokenNameSEMICOLON	
updatePointer	TokenNameIdentifier	 update Pointer
(	TokenNameLPAREN	
7	TokenNameIntegerLiteral	
-	TokenNameMINUS	
bits	TokenNameIdentifier	 bits
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
code	TokenNameIdentifier	 code
==	TokenNameEQUAL_EQUAL	
11	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
nextLesserThan8Bits	TokenNameIdentifier	 next Lesser Than8 Bits
(	TokenNameLPAREN	
3	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
7	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
Error	TokenNameIdentifier	 Error
(	TokenNameLPAREN	
"TIFFFaxDecoder5"	TokenNameStringLiteral	TIFFFaxDecoder5
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
int	TokenNameint	
zeros	TokenNameIdentifier	 zeros
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
exit	TokenNameIdentifier	 exit
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
!	TokenNameNOT	
exit	TokenNameIdentifier	 exit
)	TokenNameRPAREN	
{	TokenNameLBRACE	
while	TokenNamewhile	
(	TokenNameLPAREN	
nextLesserThan8Bits	TokenNameIdentifier	 next Lesser Than8 Bits
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
zeros	TokenNameIdentifier	 zeros
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
zeros	TokenNameIdentifier	 zeros
>	TokenNameGREATER	
5	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Exit code 	TokenNameCOMMENT_LINE	Exit code 
// Zeros before exit code 	TokenNameCOMMENT_LINE	Zeros before exit code 
zeros	TokenNameIdentifier	 zeros
=	TokenNameEQUAL	
zeros	TokenNameIdentifier	 zeros
-	TokenNameMINUS	
6	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
isWhite	TokenNameIdentifier	 is White
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
zeros	TokenNameIdentifier	 zeros
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
cce	TokenNameIdentifier	 cce
[	TokenNameLBRACKET	
currIndex	TokenNameIdentifier	 curr Index
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
bitOffset	TokenNameIdentifier	 bit Offset
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Zeros before the exit code 	TokenNameCOMMENT_LINE	Zeros before the exit code 
bitOffset	TokenNameIdentifier	 bit Offset
+=	TokenNamePLUS_EQUAL	
zeros	TokenNameIdentifier	 zeros
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
zeros	TokenNameIdentifier	 zeros
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Some zeros have been written 	TokenNameCOMMENT_LINE	Some zeros have been written 
isWhite	TokenNameIdentifier	 is White
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Read in the bit which specifies the color of 	TokenNameCOMMENT_LINE	Read in the bit which specifies the color of 
// the following run 	TokenNameCOMMENT_LINE	the following run 
if	TokenNameif	
(	TokenNameLPAREN	
nextLesserThan8Bits	TokenNameIdentifier	 next Lesser Than8 Bits
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
isWhite	TokenNameIdentifier	 is White
)	TokenNameRPAREN	
{	TokenNameLBRACE	
cce	TokenNameIdentifier	 cce
[	TokenNameLBRACKET	
currIndex	TokenNameIdentifier	 curr Index
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
bitOffset	TokenNameIdentifier	 bit Offset
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
isWhite	TokenNameIdentifier	 is White
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
isWhite	TokenNameIdentifier	 is White
)	TokenNameRPAREN	
{	TokenNameLBRACE	
cce	TokenNameIdentifier	 cce
[	TokenNameLBRACKET	
currIndex	TokenNameIdentifier	 curr Index
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
bitOffset	TokenNameIdentifier	 bit Offset
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
isWhite	TokenNameIdentifier	 is White
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
exit	TokenNameIdentifier	 exit
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
zeros	TokenNameIdentifier	 zeros
==	TokenNameEQUAL_EQUAL	
5	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
isWhite	TokenNameIdentifier	 is White
)	TokenNameRPAREN	
{	TokenNameLBRACE	
cce	TokenNameIdentifier	 cce
[	TokenNameLBRACKET	
currIndex	TokenNameIdentifier	 curr Index
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
bitOffset	TokenNameIdentifier	 bit Offset
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
bitOffset	TokenNameIdentifier	 bit Offset
+=	TokenNamePLUS_EQUAL	
zeros	TokenNameIdentifier	 zeros
;	TokenNameSEMICOLON	
// Last thing written was white 	TokenNameCOMMENT_LINE	Last thing written was white 
isWhite	TokenNameIdentifier	 is White
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
bitOffset	TokenNameIdentifier	 bit Offset
+=	TokenNamePLUS_EQUAL	
zeros	TokenNameIdentifier	 zeros
;	TokenNameSEMICOLON	
cce	TokenNameIdentifier	 cce
[	TokenNameLBRACKET	
currIndex	TokenNameIdentifier	 curr Index
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
bitOffset	TokenNameIdentifier	 bit Offset
;	TokenNameSEMICOLON	
setToBlack	TokenNameIdentifier	 set To Black
(	TokenNameLPAREN	
buffer	TokenNameIdentifier	 buffer
,	TokenNameCOMMA	
lineOffset	TokenNameIdentifier	 line Offset
,	TokenNameCOMMA	
bitOffset	TokenNameIdentifier	 bit Offset
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
++	TokenNamePLUS_PLUS	
bitOffset	TokenNameIdentifier	 bit Offset
;	TokenNameSEMICOLON	
// Last thing written was black 	TokenNameCOMMENT_LINE	Last thing written was black 
isWhite	TokenNameIdentifier	 is White
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
Error	TokenNameIdentifier	 Error
(	TokenNameLPAREN	
"TIFFFaxDecoder5"	TokenNameStringLiteral	TIFFFaxDecoder5
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// Add the changing element beyond the current scanline for the 	TokenNameCOMMENT_LINE	Add the changing element beyond the current scanline for the 
// other color too 	TokenNameCOMMENT_LINE	other color too 
cce	TokenNameIdentifier	 cce
[	TokenNameLBRACKET	
currIndex	TokenNameIdentifier	 curr Index
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
bitOffset	TokenNameIdentifier	 bit Offset
;	TokenNameSEMICOLON	
// Number of changing elements in this scanline. 	TokenNameCOMMENT_LINE	Number of changing elements in this scanline. 
changingElemSize	TokenNameIdentifier	 changing Elem Size
=	TokenNameEQUAL	
currIndex	TokenNameIdentifier	 curr Index
;	TokenNameSEMICOLON	
lineOffset	TokenNameIdentifier	 line Offset
+=	TokenNamePLUS_EQUAL	
scanlineStride	TokenNameIdentifier	 scanline Stride
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
private	TokenNameprivate	
void	TokenNamevoid	
setToBlack	TokenNameIdentifier	 set To Black
(	TokenNameLPAREN	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
buffer	TokenNameIdentifier	 buffer
,	TokenNameCOMMA	
int	TokenNameint	
lineOffset	TokenNameIdentifier	 line Offset
,	TokenNameCOMMA	
int	TokenNameint	
bitOffset	TokenNameIdentifier	 bit Offset
,	TokenNameCOMMA	
int	TokenNameint	
numBits	TokenNameIdentifier	 num Bits
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
bitNum	TokenNameIdentifier	 bit Num
=	TokenNameEQUAL	
8	TokenNameIntegerLiteral	
*	TokenNameMULTIPLY	
lineOffset	TokenNameIdentifier	 line Offset
+	TokenNamePLUS	
bitOffset	TokenNameIdentifier	 bit Offset
;	TokenNameSEMICOLON	
int	TokenNameint	
lastBit	TokenNameIdentifier	 last Bit
=	TokenNameEQUAL	
bitNum	TokenNameIdentifier	 bit Num
+	TokenNamePLUS	
numBits	TokenNameIdentifier	 num Bits
;	TokenNameSEMICOLON	
int	TokenNameint	
byteNum	TokenNameIdentifier	 byte Num
=	TokenNameEQUAL	
bitNum	TokenNameIdentifier	 bit Num
>>	TokenNameRIGHT_SHIFT	
3	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// Handle bits in first byte 	TokenNameCOMMENT_LINE	Handle bits in first byte 
int	TokenNameint	
shift	TokenNameIdentifier	 shift
=	TokenNameEQUAL	
bitNum	TokenNameIdentifier	 bit Num
&	TokenNameAND	
0x7	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
shift	TokenNameIdentifier	 shift
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
maskVal	TokenNameIdentifier	 mask Val
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
<<	TokenNameLEFT_SHIFT	
(	TokenNameLPAREN	
7	TokenNameIntegerLiteral	
-	TokenNameMINUS	
shift	TokenNameIdentifier	 shift
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
byte	TokenNamebyte	
val	TokenNameIdentifier	 val
=	TokenNameEQUAL	
buffer	TokenNameIdentifier	 buffer
[	TokenNameLBRACKET	
byteNum	TokenNameIdentifier	 byte Num
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
maskVal	TokenNameIdentifier	 mask Val
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
bitNum	TokenNameIdentifier	 bit Num
<	TokenNameLESS	
lastBit	TokenNameIdentifier	 last Bit
)	TokenNameRPAREN	
{	TokenNameLBRACE	
val	TokenNameIdentifier	 val
|=	TokenNameOR_EQUAL	
maskVal	TokenNameIdentifier	 mask Val
;	TokenNameSEMICOLON	
maskVal	TokenNameIdentifier	 mask Val
>>=	TokenNameRIGHT_SHIFT_EQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
++	TokenNamePLUS_PLUS	
bitNum	TokenNameIdentifier	 bit Num
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
buffer	TokenNameIdentifier	 buffer
[	TokenNameLBRACKET	
byteNum	TokenNameIdentifier	 byte Num
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
val	TokenNameIdentifier	 val
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Fill in 8 bits at a time 	TokenNameCOMMENT_LINE	Fill in 8 bits at a time 
byteNum	TokenNameIdentifier	 byte Num
=	TokenNameEQUAL	
bitNum	TokenNameIdentifier	 bit Num
>>	TokenNameRIGHT_SHIFT	
3	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
bitNum	TokenNameIdentifier	 bit Num
<	TokenNameLESS	
lastBit	TokenNameIdentifier	 last Bit
-	TokenNameMINUS	
7	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
buffer	TokenNameIdentifier	 buffer
[	TokenNameLBRACKET	
byteNum	TokenNameIdentifier	 byte Num
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
255	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
bitNum	TokenNameIdentifier	 bit Num
+=	TokenNamePLUS_EQUAL	
8	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Fill in remaining bits 	TokenNameCOMMENT_LINE	Fill in remaining bits 
while	TokenNamewhile	
(	TokenNameLPAREN	
bitNum	TokenNameIdentifier	 bit Num
<	TokenNameLESS	
lastBit	TokenNameIdentifier	 last Bit
)	TokenNameRPAREN	
{	TokenNameLBRACE	
byteNum	TokenNameIdentifier	 byte Num
=	TokenNameEQUAL	
bitNum	TokenNameIdentifier	 bit Num
>>	TokenNameRIGHT_SHIFT	
3	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
buffer	TokenNameIdentifier	 buffer
[	TokenNameLBRACKET	
byteNum	TokenNameIdentifier	 byte Num
]	TokenNameRBRACKET	
|=	TokenNameOR_EQUAL	
1	TokenNameIntegerLiteral	
<<	TokenNameLEFT_SHIFT	
(	TokenNameLPAREN	
7	TokenNameIntegerLiteral	
-	TokenNameMINUS	
(	TokenNameLPAREN	
bitNum	TokenNameIdentifier	 bit Num
&	TokenNameAND	
0x7	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
++	TokenNamePLUS_PLUS	
bitNum	TokenNameIdentifier	 bit Num
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// Returns run length 	TokenNameCOMMENT_LINE	Returns run length 
private	TokenNameprivate	
int	TokenNameint	
decodeWhiteCodeWord	TokenNameIdentifier	 decode White Code Word
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
current	TokenNameIdentifier	 current
,	TokenNameCOMMA	
entry	TokenNameIdentifier	 entry
,	TokenNameCOMMA	
bits	TokenNameIdentifier	 bits
,	TokenNameCOMMA	
isT	TokenNameIdentifier	 is T
,	TokenNameCOMMA	
twoBits	TokenNameIdentifier	 two Bits
,	TokenNameCOMMA	
code	TokenNameIdentifier	 code
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
runLength	TokenNameIdentifier	 run Length
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
isWhite	TokenNameIdentifier	 is White
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
isWhite	TokenNameIdentifier	 is White
)	TokenNameRPAREN	
{	TokenNameLBRACE	
current	TokenNameIdentifier	 current
=	TokenNameEQUAL	
nextNBits	TokenNameIdentifier	 next N Bits
(	TokenNameLPAREN	
10	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
entry	TokenNameIdentifier	 entry
=	TokenNameEQUAL	
white	TokenNameIdentifier	 white
[	TokenNameLBRACKET	
current	TokenNameIdentifier	 current
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
// Get the 3 fields from the entry 	TokenNameCOMMENT_LINE	Get the 3 fields from the entry 
isT	TokenNameIdentifier	 is T
=	TokenNameEQUAL	
entry	TokenNameIdentifier	 entry
&	TokenNameAND	
0x0001	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
bits	TokenNameIdentifier	 bits
=	TokenNameEQUAL	
(	TokenNameLPAREN	
entry	TokenNameIdentifier	 entry
>>>	TokenNameUNSIGNED_RIGHT_SHIFT	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
&	TokenNameAND	
0x0f	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
bits	TokenNameIdentifier	 bits
==	TokenNameEQUAL_EQUAL	
12	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Additional Make up code 	TokenNameCOMMENT_LINE	Additional Make up code 
// Get the next 2 bits 	TokenNameCOMMENT_LINE	Get the next 2 bits 
twoBits	TokenNameIdentifier	 two Bits
=	TokenNameEQUAL	
nextLesserThan8Bits	TokenNameIdentifier	 next Lesser Than8 Bits
(	TokenNameLPAREN	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Consolidate the 2 new bits and last 2 bits into 4 bits 	TokenNameCOMMENT_LINE	Consolidate the 2 new bits and last 2 bits into 4 bits 
current	TokenNameIdentifier	 current
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
<<	TokenNameLEFT_SHIFT	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
&	TokenNameAND	
0x000c	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
|	TokenNameOR	
twoBits	TokenNameIdentifier	 two Bits
;	TokenNameSEMICOLON	
entry	TokenNameIdentifier	 entry
=	TokenNameEQUAL	
additionalMakeup	TokenNameIdentifier	 additional Makeup
[	TokenNameLBRACKET	
current	TokenNameIdentifier	 current
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
bits	TokenNameIdentifier	 bits
=	TokenNameEQUAL	
(	TokenNameLPAREN	
entry	TokenNameIdentifier	 entry
>>>	TokenNameUNSIGNED_RIGHT_SHIFT	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
&	TokenNameAND	
0x07	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// 3 bits 0000 0111 	TokenNameCOMMENT_LINE	3 bits 0000 0111 
code	TokenNameIdentifier	 code
=	TokenNameEQUAL	
(	TokenNameLPAREN	
entry	TokenNameIdentifier	 entry
>>>	TokenNameUNSIGNED_RIGHT_SHIFT	
4	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
&	TokenNameAND	
0x0fff	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// 12 bits 	TokenNameCOMMENT_LINE	12 bits 
runLength	TokenNameIdentifier	 run Length
+=	TokenNamePLUS_EQUAL	
code	TokenNameIdentifier	 code
;	TokenNameSEMICOLON	
updatePointer	TokenNameIdentifier	 update Pointer
(	TokenNameLPAREN	
4	TokenNameIntegerLiteral	
-	TokenNameMINUS	
bits	TokenNameIdentifier	 bits
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
bits	TokenNameIdentifier	 bits
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// ERROR 	TokenNameCOMMENT_LINE	ERROR 
throw	TokenNamethrow	
new	TokenNamenew	
Error	TokenNameIdentifier	 Error
(	TokenNameLPAREN	
"TIFFFaxDecoder0"	TokenNameStringLiteral	TIFFFaxDecoder0
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
bits	TokenNameIdentifier	 bits
==	TokenNameEQUAL_EQUAL	
15	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// EOL 	TokenNameCOMMENT_LINE	EOL 
throw	TokenNamethrow	
new	TokenNamenew	
Error	TokenNameIdentifier	 Error
(	TokenNameLPAREN	
"TIFFFaxDecoder1"	TokenNameStringLiteral	TIFFFaxDecoder1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// 11 bits - 0000 0111 1111 1111 = 0x07ff 	TokenNameCOMMENT_LINE	11 bits - 0000 0111 1111 1111 = 0x07ff 
code	TokenNameIdentifier	 code
=	TokenNameEQUAL	
(	TokenNameLPAREN	
entry	TokenNameIdentifier	 entry
>>>	TokenNameUNSIGNED_RIGHT_SHIFT	
5	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
&	TokenNameAND	
0x07ff	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
runLength	TokenNameIdentifier	 run Length
+=	TokenNamePLUS_EQUAL	
code	TokenNameIdentifier	 code
;	TokenNameSEMICOLON	
updatePointer	TokenNameIdentifier	 update Pointer
(	TokenNameLPAREN	
10	TokenNameIntegerLiteral	
-	TokenNameMINUS	
bits	TokenNameIdentifier	 bits
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
isT	TokenNameIdentifier	 is T
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
isWhite	TokenNameIdentifier	 is White
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
runLength	TokenNameIdentifier	 run Length
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Returns run length 	TokenNameCOMMENT_LINE	Returns run length 
private	TokenNameprivate	
int	TokenNameint	
decodeBlackCodeWord	TokenNameIdentifier	 decode Black Code Word
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
current	TokenNameIdentifier	 current
,	TokenNameCOMMA	
entry	TokenNameIdentifier	 entry
,	TokenNameCOMMA	
bits	TokenNameIdentifier	 bits
,	TokenNameCOMMA	
isT	TokenNameIdentifier	 is T
,	TokenNameCOMMA	
code	TokenNameIdentifier	 code
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
runLength	TokenNameIdentifier	 run Length
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
isWhite	TokenNameIdentifier	 is White
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
!	TokenNameNOT	
isWhite	TokenNameIdentifier	 is White
)	TokenNameRPAREN	
{	TokenNameLBRACE	
current	TokenNameIdentifier	 current
=	TokenNameEQUAL	
nextLesserThan8Bits	TokenNameIdentifier	 next Lesser Than8 Bits
(	TokenNameLPAREN	
4	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
entry	TokenNameIdentifier	 entry
=	TokenNameEQUAL	
initBlack	TokenNameIdentifier	 init Black
[	TokenNameLBRACKET	
current	TokenNameIdentifier	 current
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
// Get the 3 fields from the entry 	TokenNameCOMMENT_LINE	Get the 3 fields from the entry 
isT	TokenNameIdentifier	 is T
=	TokenNameEQUAL	
entry	TokenNameIdentifier	 entry
&	TokenNameAND	
0x0001	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
bits	TokenNameIdentifier	 bits
=	TokenNameEQUAL	
(	TokenNameLPAREN	
entry	TokenNameIdentifier	 entry
>>>	TokenNameUNSIGNED_RIGHT_SHIFT	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
&	TokenNameAND	
0x000f	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
code	TokenNameIdentifier	 code
=	TokenNameEQUAL	
(	TokenNameLPAREN	
entry	TokenNameIdentifier	 entry
>>>	TokenNameUNSIGNED_RIGHT_SHIFT	
5	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
&	TokenNameAND	
0x07ff	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
code	TokenNameIdentifier	 code
==	TokenNameEQUAL_EQUAL	
100	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
current	TokenNameIdentifier	 current
=	TokenNameEQUAL	
nextNBits	TokenNameIdentifier	 next N Bits
(	TokenNameLPAREN	
9	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
entry	TokenNameIdentifier	 entry
=	TokenNameEQUAL	
black	TokenNameIdentifier	 black
[	TokenNameLBRACKET	
current	TokenNameIdentifier	 current
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
// Get the 3 fields from the entry 	TokenNameCOMMENT_LINE	Get the 3 fields from the entry 
isT	TokenNameIdentifier	 is T
=	TokenNameEQUAL	
entry	TokenNameIdentifier	 entry
&	TokenNameAND	
0x0001	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
bits	TokenNameIdentifier	 bits
=	TokenNameEQUAL	
(	TokenNameLPAREN	
entry	TokenNameIdentifier	 entry
>>>	TokenNameUNSIGNED_RIGHT_SHIFT	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
&	TokenNameAND	
0x000f	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
code	TokenNameIdentifier	 code
=	TokenNameEQUAL	
(	TokenNameLPAREN	
entry	TokenNameIdentifier	 entry
>>>	TokenNameUNSIGNED_RIGHT_SHIFT	
5	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
&	TokenNameAND	
0x07ff	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
bits	TokenNameIdentifier	 bits
==	TokenNameEQUAL_EQUAL	
12	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Additional makeup codes 	TokenNameCOMMENT_LINE	Additional makeup codes 
updatePointer	TokenNameIdentifier	 update Pointer
(	TokenNameLPAREN	
5	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
current	TokenNameIdentifier	 current
=	TokenNameEQUAL	
nextLesserThan8Bits	TokenNameIdentifier	 next Lesser Than8 Bits
(	TokenNameLPAREN	
4	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
entry	TokenNameIdentifier	 entry
=	TokenNameEQUAL	
additionalMakeup	TokenNameIdentifier	 additional Makeup
[	TokenNameLBRACKET	
current	TokenNameIdentifier	 current
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
bits	TokenNameIdentifier	 bits
=	TokenNameEQUAL	
(	TokenNameLPAREN	
entry	TokenNameIdentifier	 entry
>>>	TokenNameUNSIGNED_RIGHT_SHIFT	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
&	TokenNameAND	
0x07	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// 3 bits 0000 0111 	TokenNameCOMMENT_LINE	3 bits 0000 0111 
code	TokenNameIdentifier	 code
=	TokenNameEQUAL	
(	TokenNameLPAREN	
entry	TokenNameIdentifier	 entry
>>>	TokenNameUNSIGNED_RIGHT_SHIFT	
4	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
&	TokenNameAND	
0x0fff	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// 12 bits 	TokenNameCOMMENT_LINE	12 bits 
runLength	TokenNameIdentifier	 run Length
+=	TokenNamePLUS_EQUAL	
code	TokenNameIdentifier	 code
;	TokenNameSEMICOLON	
updatePointer	TokenNameIdentifier	 update Pointer
(	TokenNameLPAREN	
4	TokenNameIntegerLiteral	
-	TokenNameMINUS	
bits	TokenNameIdentifier	 bits
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
bits	TokenNameIdentifier	 bits
==	TokenNameEQUAL_EQUAL	
15	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// EOL code 	TokenNameCOMMENT_LINE	EOL code 
throw	TokenNamethrow	
new	TokenNamenew	
Error	TokenNameIdentifier	 Error
(	TokenNameLPAREN	
"TIFFFaxDecoder2"	TokenNameStringLiteral	TIFFFaxDecoder2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
runLength	TokenNameIdentifier	 run Length
+=	TokenNamePLUS_EQUAL	
code	TokenNameIdentifier	 code
;	TokenNameSEMICOLON	
updatePointer	TokenNameIdentifier	 update Pointer
(	TokenNameLPAREN	
9	TokenNameIntegerLiteral	
-	TokenNameMINUS	
bits	TokenNameIdentifier	 bits
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
isT	TokenNameIdentifier	 is T
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
isWhite	TokenNameIdentifier	 is White
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
code	TokenNameIdentifier	 code
==	TokenNameEQUAL_EQUAL	
200	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Is a Terminating code 	TokenNameCOMMENT_LINE	Is a Terminating code 
current	TokenNameIdentifier	 current
=	TokenNameEQUAL	
nextLesserThan8Bits	TokenNameIdentifier	 next Lesser Than8 Bits
(	TokenNameLPAREN	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
entry	TokenNameIdentifier	 entry
=	TokenNameEQUAL	
twoBitBlack	TokenNameIdentifier	 two Bit Black
[	TokenNameLBRACKET	
current	TokenNameIdentifier	 current
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
code	TokenNameIdentifier	 code
=	TokenNameEQUAL	
(	TokenNameLPAREN	
entry	TokenNameIdentifier	 entry
>>>	TokenNameUNSIGNED_RIGHT_SHIFT	
5	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
&	TokenNameAND	
0x07ff	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
runLength	TokenNameIdentifier	 run Length
+=	TokenNamePLUS_EQUAL	
code	TokenNameIdentifier	 code
;	TokenNameSEMICOLON	
bits	TokenNameIdentifier	 bits
=	TokenNameEQUAL	
(	TokenNameLPAREN	
entry	TokenNameIdentifier	 entry
>>>	TokenNameUNSIGNED_RIGHT_SHIFT	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
&	TokenNameAND	
0x0f	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
updatePointer	TokenNameIdentifier	 update Pointer
(	TokenNameLPAREN	
2	TokenNameIntegerLiteral	
-	TokenNameMINUS	
bits	TokenNameIdentifier	 bits
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
isWhite	TokenNameIdentifier	 is White
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// Is a Terminating code 	TokenNameCOMMENT_LINE	Is a Terminating code 
runLength	TokenNameIdentifier	 run Length
+=	TokenNamePLUS_EQUAL	
code	TokenNameIdentifier	 code
;	TokenNameSEMICOLON	
updatePointer	TokenNameIdentifier	 update Pointer
(	TokenNameLPAREN	
4	TokenNameIntegerLiteral	
-	TokenNameMINUS	
bits	TokenNameIdentifier	 bits
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
isWhite	TokenNameIdentifier	 is White
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
runLength	TokenNameIdentifier	 run Length
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
int	TokenNameint	
readEOL	TokenNameIdentifier	 read EOL
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
fillBits	TokenNameIdentifier	 fill Bits
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
nextNBits	TokenNameIdentifier	 next N Bits
(	TokenNameLPAREN	
12	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
Error	TokenNameIdentifier	 Error
(	TokenNameLPAREN	
"TIFFFaxDecoder6"	TokenNameStringLiteral	TIFFFaxDecoder6
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
fillBits	TokenNameIdentifier	 fill Bits
==	TokenNameEQUAL_EQUAL	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// First EOL code word xxxx 0000 0000 0001 will occur 	TokenNameCOMMENT_LINE	First EOL code word xxxx 0000 0000 0001 will occur 
// As many fill bits will be present as required to make 	TokenNameCOMMENT_LINE	As many fill bits will be present as required to make 
// the EOL code of 12 bits end on a byte boundary. 	TokenNameCOMMENT_LINE	the EOL code of 12 bits end on a byte boundary. 
int	TokenNameint	
bitsLeft	TokenNameIdentifier	 bits Left
=	TokenNameEQUAL	
8	TokenNameIntegerLiteral	
-	TokenNameMINUS	
bitPointer	TokenNameIdentifier	 bit Pointer
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
nextNBits	TokenNameIdentifier	 next N Bits
(	TokenNameLPAREN	
bitsLeft	TokenNameIdentifier	 bits Left
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
Error	TokenNameIdentifier	 Error
(	TokenNameLPAREN	
"TIFFFaxDecoder8"	TokenNameStringLiteral	TIFFFaxDecoder8
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// If the number of bitsLeft is less than 8, then to have a 12 	TokenNameCOMMENT_LINE	If the number of bitsLeft is less than 8, then to have a 12 
// bit EOL sequence, two more bytes are certainly going to be 	TokenNameCOMMENT_LINE	bit EOL sequence, two more bytes are certainly going to be 
// required. The first of them has to be all zeros, so ensure 	TokenNameCOMMENT_LINE	required. The first of them has to be all zeros, so ensure 
// that. 	TokenNameCOMMENT_LINE	that. 
if	TokenNameif	
(	TokenNameLPAREN	
bitsLeft	TokenNameIdentifier	 bits Left
<	TokenNameLESS	
4	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
nextNBits	TokenNameIdentifier	 next N Bits
(	TokenNameLPAREN	
8	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
Error	TokenNameIdentifier	 Error
(	TokenNameLPAREN	
"TIFFFaxDecoder8"	TokenNameStringLiteral	TIFFFaxDecoder8
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// There might be a random number of fill bytes with 0s, so 	TokenNameCOMMENT_LINE	There might be a random number of fill bytes with 0s, so 
// loop till the EOL of 0000 0001 is found, as long as all 	TokenNameCOMMENT_LINE	loop till the EOL of 0000 0001 is found, as long as all 
// the bytes preceding it are 0's. 	TokenNameCOMMENT_LINE	the bytes preceding it are 0's. 
int	TokenNameint	
n	TokenNameIdentifier	 n
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
n	TokenNameIdentifier	 n
=	TokenNameEQUAL	
nextNBits	TokenNameIdentifier	 next N Bits
(	TokenNameLPAREN	
8	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// If not all zeros 	TokenNameCOMMENT_LINE	If not all zeros 
if	TokenNameif	
(	TokenNameLPAREN	
n	TokenNameIdentifier	 n
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
Error	TokenNameIdentifier	 Error
(	TokenNameLPAREN	
"TIFFFaxDecoder8"	TokenNameStringLiteral	TIFFFaxDecoder8
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// If one dimensional encoding mode, then always return 1 	TokenNameCOMMENT_LINE	If one dimensional encoding mode, then always return 1 
if	TokenNameif	
(	TokenNameLPAREN	
oneD	TokenNameIdentifier	 one D
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// Otherwise for 2D encoding mode, 	TokenNameCOMMENT_LINE	Otherwise for 2D encoding mode, 
// The next one bit signifies 1D/2D encoding of next line. 	TokenNameCOMMENT_LINE	The next one bit signifies 1D/2D encoding of next line. 
return	TokenNamereturn	
nextLesserThan8Bits	TokenNameIdentifier	 next Lesser Than8 Bits
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
private	TokenNameprivate	
void	TokenNamevoid	
getNextChangingElement	TokenNameIdentifier	 get Next Changing Element
(	TokenNameLPAREN	
int	TokenNameint	
a0	TokenNameIdentifier	 a0
,	TokenNameCOMMA	
boolean	TokenNameboolean	
isWhite	TokenNameIdentifier	 is White
,	TokenNameCOMMA	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
ret	TokenNameIdentifier	 ret
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Local copies of instance variables 	TokenNameCOMMENT_LINE	Local copies of instance variables 
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
pce	TokenNameIdentifier	 pce
=	TokenNameEQUAL	
this	TokenNamethis	
.	TokenNameDOT	
prevChangingElems	TokenNameIdentifier	 prev Changing Elems
;	TokenNameSEMICOLON	
int	TokenNameint	
ces	TokenNameIdentifier	 ces
=	TokenNameEQUAL	
this	TokenNamethis	
.	TokenNameDOT	
changingElemSize	TokenNameIdentifier	 changing Elem Size
;	TokenNameSEMICOLON	
// If the previous match was at an odd element, we still 	TokenNameCOMMENT_LINE	If the previous match was at an odd element, we still 
// have to search the preceeding element. 	TokenNameCOMMENT_LINE	have to search the preceeding element. 
// int start = lastChangingElement & ~0x1; 	TokenNameCOMMENT_LINE	int start = lastChangingElement & ~0x1; 
int	TokenNameint	
start	TokenNameIdentifier	 start
=	TokenNameEQUAL	
lastChangingElement	TokenNameIdentifier	 last Changing Element
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
?	TokenNameQUESTION	
lastChangingElement	TokenNameIdentifier	 last Changing Element
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
:	TokenNameCOLON	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
isWhite	TokenNameIdentifier	 is White
)	TokenNameRPAREN	
{	TokenNameLBRACE	
start	TokenNameIdentifier	 start
&=	TokenNameAND_EQUAL	
~	TokenNameTWIDDLE	
0x1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// Search even numbered elements 	TokenNameCOMMENT_LINE	Search even numbered elements 
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
start	TokenNameIdentifier	 start
|=	TokenNameOR_EQUAL	
0x1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// Search odd numbered elements 	TokenNameCOMMENT_LINE	Search odd numbered elements 
}	TokenNameRBRACE	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
start	TokenNameIdentifier	 start
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
ces	TokenNameIdentifier	 ces
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
+=	TokenNamePLUS_EQUAL	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
temp	TokenNameIdentifier	 temp
=	TokenNameEQUAL	
pce	TokenNameIdentifier	 pce
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
temp	TokenNameIdentifier	 temp
>	TokenNameGREATER	
a0	TokenNameIdentifier	 a0
)	TokenNameRPAREN	
{	TokenNameLBRACE	
lastChangingElement	TokenNameIdentifier	 last Changing Element
=	TokenNameEQUAL	
i	TokenNameIdentifier	 i
;	TokenNameSEMICOLON	
ret	TokenNameIdentifier	 ret
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
temp	TokenNameIdentifier	 temp
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
<	TokenNameLESS	
ces	TokenNameIdentifier	 ces
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ret	TokenNameIdentifier	 ret
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
pce	TokenNameIdentifier	 pce
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
private	TokenNameprivate	
int	TokenNameint	
nextNBits	TokenNameIdentifier	 next N Bits
(	TokenNameLPAREN	
int	TokenNameint	
bitsToGet	TokenNameIdentifier	 bits To Get
)	TokenNameRPAREN	
{	TokenNameLBRACE	
byte	TokenNamebyte	
b	TokenNameIdentifier	 b
,	TokenNameCOMMA	
next	TokenNameIdentifier	 next
,	TokenNameCOMMA	
next2next	TokenNameIdentifier	 next2next
;	TokenNameSEMICOLON	
int	TokenNameint	
l	TokenNameIdentifier	 l
=	TokenNameEQUAL	
data	TokenNameIdentifier	 data
.	TokenNameDOT	
length	TokenNameIdentifier	 length
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
bp	TokenNameIdentifier	 bp
=	TokenNameEQUAL	
this	TokenNamethis	
.	TokenNameDOT	
bytePointer	TokenNameIdentifier	 byte Pointer
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
fillOrder	TokenNameIdentifier	 fill Order
==	TokenNameEQUAL_EQUAL	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
b	TokenNameIdentifier	 b
=	TokenNameEQUAL	
data	TokenNameIdentifier	 data
[	TokenNameLBRACKET	
bp	TokenNameIdentifier	 bp
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
bp	TokenNameIdentifier	 bp
==	TokenNameEQUAL_EQUAL	
l	TokenNameIdentifier	 l
)	TokenNameRPAREN	
{	TokenNameLBRACE	
next	TokenNameIdentifier	 next
=	TokenNameEQUAL	
0x00	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
next2next	TokenNameIdentifier	 next2next
=	TokenNameEQUAL	
0x00	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
bp	TokenNameIdentifier	 bp
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
l	TokenNameIdentifier	 l
)	TokenNameRPAREN	
{	TokenNameLBRACE	
next	TokenNameIdentifier	 next
=	TokenNameEQUAL	
data	TokenNameIdentifier	 data
[	TokenNameLBRACKET	
bp	TokenNameIdentifier	 bp
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
next2next	TokenNameIdentifier	 next2next
=	TokenNameEQUAL	
0x00	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
next	TokenNameIdentifier	 next
=	TokenNameEQUAL	
data	TokenNameIdentifier	 data
[	TokenNameLBRACKET	
bp	TokenNameIdentifier	 bp
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
next2next	TokenNameIdentifier	 next2next
=	TokenNameEQUAL	
data	TokenNameIdentifier	 data
[	TokenNameLBRACKET	
bp	TokenNameIdentifier	 bp
+	TokenNamePLUS	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
fillOrder	TokenNameIdentifier	 fill Order
==	TokenNameEQUAL_EQUAL	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
b	TokenNameIdentifier	 b
=	TokenNameEQUAL	
flipTable	TokenNameIdentifier	 flip Table
[	TokenNameLBRACKET	
data	TokenNameIdentifier	 data
[	TokenNameLBRACKET	
bp	TokenNameIdentifier	 bp
]	TokenNameRBRACKET	
&	TokenNameAND	
0xff	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
bp	TokenNameIdentifier	 bp
==	TokenNameEQUAL_EQUAL	
l	TokenNameIdentifier	 l
)	TokenNameRPAREN	
{	TokenNameLBRACE	
next	TokenNameIdentifier	 next
=	TokenNameEQUAL	
0x00	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
next2next	TokenNameIdentifier	 next2next
=	TokenNameEQUAL	
0x00	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
bp	TokenNameIdentifier	 bp
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
l	TokenNameIdentifier	 l
)	TokenNameRPAREN	
{	TokenNameLBRACE	
next	TokenNameIdentifier	 next
=	TokenNameEQUAL	
flipTable	TokenNameIdentifier	 flip Table
[	TokenNameLBRACKET	
data	TokenNameIdentifier	 data
[	TokenNameLBRACKET	
bp	TokenNameIdentifier	 bp
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
&	TokenNameAND	
0xff	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
next2next	TokenNameIdentifier	 next2next
=	TokenNameEQUAL	
0x00	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
next	TokenNameIdentifier	 next
=	TokenNameEQUAL	
flipTable	TokenNameIdentifier	 flip Table
[	TokenNameLBRACKET	
data	TokenNameIdentifier	 data
[	TokenNameLBRACKET	
bp	TokenNameIdentifier	 bp
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
&	TokenNameAND	
0xff	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
next2next	TokenNameIdentifier	 next2next
=	TokenNameEQUAL	
flipTable	TokenNameIdentifier	 flip Table
[	TokenNameLBRACKET	
data	TokenNameIdentifier	 data
[	TokenNameLBRACKET	
bp	TokenNameIdentifier	 bp
+	TokenNamePLUS	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
&	TokenNameAND	
0xff	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
Error	TokenNameIdentifier	 Error
(	TokenNameLPAREN	
"TIFFFaxDecoder7"	TokenNameStringLiteral	TIFFFaxDecoder7
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
int	TokenNameint	
bitsLeft	TokenNameIdentifier	 bits Left
=	TokenNameEQUAL	
8	TokenNameIntegerLiteral	
-	TokenNameMINUS	
bitPointer	TokenNameIdentifier	 bit Pointer
;	TokenNameSEMICOLON	
int	TokenNameint	
bitsFromNextByte	TokenNameIdentifier	 bits From Next Byte
=	TokenNameEQUAL	
bitsToGet	TokenNameIdentifier	 bits To Get
-	TokenNameMINUS	
bitsLeft	TokenNameIdentifier	 bits Left
;	TokenNameSEMICOLON	
int	TokenNameint	
bitsFromNext2NextByte	TokenNameIdentifier	 bits From Next2 Next Byte
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
bitsFromNextByte	TokenNameIdentifier	 bits From Next Byte
>	TokenNameGREATER	
8	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
bitsFromNext2NextByte	TokenNameIdentifier	 bits From Next2 Next Byte
=	TokenNameEQUAL	
bitsFromNextByte	TokenNameIdentifier	 bits From Next Byte
-	TokenNameMINUS	
8	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
bitsFromNextByte	TokenNameIdentifier	 bits From Next Byte
=	TokenNameEQUAL	
8	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
bytePointer	TokenNameIdentifier	 byte Pointer
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
int	TokenNameint	
i1	TokenNameIdentifier	 i1
=	TokenNameEQUAL	
(	TokenNameLPAREN	
b	TokenNameIdentifier	 b
&	TokenNameAND	
table1	TokenNameIdentifier	 table1
[	TokenNameLBRACKET	
bitsLeft	TokenNameIdentifier	 bits Left
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
<<	TokenNameLEFT_SHIFT	
(	TokenNameLPAREN	
bitsToGet	TokenNameIdentifier	 bits To Get
-	TokenNameMINUS	
bitsLeft	TokenNameIdentifier	 bits Left
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
i2	TokenNameIdentifier	 i2
=	TokenNameEQUAL	
(	TokenNameLPAREN	
next	TokenNameIdentifier	 next
&	TokenNameAND	
table2	TokenNameIdentifier	 table2
[	TokenNameLBRACKET	
bitsFromNextByte	TokenNameIdentifier	 bits From Next Byte
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
>>>	TokenNameUNSIGNED_RIGHT_SHIFT	
(	TokenNameLPAREN	
8	TokenNameIntegerLiteral	
-	TokenNameMINUS	
bitsFromNextByte	TokenNameIdentifier	 bits From Next Byte
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
i3	TokenNameIdentifier	 i3
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
bitsFromNext2NextByte	TokenNameIdentifier	 bits From Next2 Next Byte
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
i2	TokenNameIdentifier	 i2
<<=	TokenNameLEFT_SHIFT_EQUAL	
bitsFromNext2NextByte	TokenNameIdentifier	 bits From Next2 Next Byte
;	TokenNameSEMICOLON	
i3	TokenNameIdentifier	 i3
=	TokenNameEQUAL	
(	TokenNameLPAREN	
next2next	TokenNameIdentifier	 next2next
&	TokenNameAND	
table2	TokenNameIdentifier	 table2
[	TokenNameLBRACKET	
bitsFromNext2NextByte	TokenNameIdentifier	 bits From Next2 Next Byte
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
>>>	TokenNameUNSIGNED_RIGHT_SHIFT	
(	TokenNameLPAREN	
8	TokenNameIntegerLiteral	
-	TokenNameMINUS	
bitsFromNext2NextByte	TokenNameIdentifier	 bits From Next2 Next Byte
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
i2	TokenNameIdentifier	 i2
|=	TokenNameOR_EQUAL	
i3	TokenNameIdentifier	 i3
;	TokenNameSEMICOLON	
bytePointer	TokenNameIdentifier	 byte Pointer
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
bitPointer	TokenNameIdentifier	 bit Pointer
=	TokenNameEQUAL	
bitsFromNext2NextByte	TokenNameIdentifier	 bits From Next2 Next Byte
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
bitsFromNextByte	TokenNameIdentifier	 bits From Next Byte
==	TokenNameEQUAL_EQUAL	
8	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
bitPointer	TokenNameIdentifier	 bit Pointer
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
bytePointer	TokenNameIdentifier	 byte Pointer
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
bitPointer	TokenNameIdentifier	 bit Pointer
=	TokenNameEQUAL	
bitsFromNextByte	TokenNameIdentifier	 bits From Next Byte
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
i1	TokenNameIdentifier	 i1
|	TokenNameOR	
i2	TokenNameIdentifier	 i2
;	TokenNameSEMICOLON	
return	TokenNamereturn	
i	TokenNameIdentifier	 i
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
int	TokenNameint	
nextLesserThan8Bits	TokenNameIdentifier	 next Lesser Than8 Bits
(	TokenNameLPAREN	
int	TokenNameint	
bitsToGet	TokenNameIdentifier	 bits To Get
)	TokenNameRPAREN	
{	TokenNameLBRACE	
byte	TokenNamebyte	
b	TokenNameIdentifier	 b
,	TokenNameCOMMA	
next	TokenNameIdentifier	 next
;	TokenNameSEMICOLON	
int	TokenNameint	
l	TokenNameIdentifier	 l
=	TokenNameEQUAL	
data	TokenNameIdentifier	 data
.	TokenNameDOT	
length	TokenNameIdentifier	 length
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
bp	TokenNameIdentifier	 bp
=	TokenNameEQUAL	
this	TokenNamethis	
.	TokenNameDOT	
bytePointer	TokenNameIdentifier	 byte Pointer
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
fillOrder	TokenNameIdentifier	 fill Order
==	TokenNameEQUAL_EQUAL	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
b	TokenNameIdentifier	 b
=	TokenNameEQUAL	
data	TokenNameIdentifier	 data
[	TokenNameLBRACKET	
bp	TokenNameIdentifier	 bp
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
bp	TokenNameIdentifier	 bp
==	TokenNameEQUAL_EQUAL	
l	TokenNameIdentifier	 l
)	TokenNameRPAREN	
{	TokenNameLBRACE	
next	TokenNameIdentifier	 next
=	TokenNameEQUAL	
0x00	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
next	TokenNameIdentifier	 next
=	TokenNameEQUAL	
data	TokenNameIdentifier	 data
[	TokenNameLBRACKET	
bp	TokenNameIdentifier	 bp
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
fillOrder	TokenNameIdentifier	 fill Order
==	TokenNameEQUAL_EQUAL	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
b	TokenNameIdentifier	 b
=	TokenNameEQUAL	
flipTable	TokenNameIdentifier	 flip Table
[	TokenNameLBRACKET	
data	TokenNameIdentifier	 data
[	TokenNameLBRACKET	
bp	TokenNameIdentifier	 bp
]	TokenNameRBRACKET	
&	TokenNameAND	
0xff	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
bp	TokenNameIdentifier	 bp
==	TokenNameEQUAL_EQUAL	
l	TokenNameIdentifier	 l
)	TokenNameRPAREN	
{	TokenNameLBRACE	
next	TokenNameIdentifier	 next
=	TokenNameEQUAL	
0x00	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
next	TokenNameIdentifier	 next
=	TokenNameEQUAL	
flipTable	TokenNameIdentifier	 flip Table
[	TokenNameLBRACKET	
data	TokenNameIdentifier	 data
[	TokenNameLBRACKET	
bp	TokenNameIdentifier	 bp
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
&	TokenNameAND	
0xff	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
Error	TokenNameIdentifier	 Error
(	TokenNameLPAREN	
"TIFFFaxDecoder7"	TokenNameStringLiteral	TIFFFaxDecoder7
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
int	TokenNameint	
bitsLeft	TokenNameIdentifier	 bits Left
=	TokenNameEQUAL	
8	TokenNameIntegerLiteral	
-	TokenNameMINUS	
bitPointer	TokenNameIdentifier	 bit Pointer
;	TokenNameSEMICOLON	
int	TokenNameint	
bitsFromNextByte	TokenNameIdentifier	 bits From Next Byte
=	TokenNameEQUAL	
bitsToGet	TokenNameIdentifier	 bits To Get
-	TokenNameMINUS	
bitsLeft	TokenNameIdentifier	 bits Left
;	TokenNameSEMICOLON	
int	TokenNameint	
shift	TokenNameIdentifier	 shift
=	TokenNameEQUAL	
bitsLeft	TokenNameIdentifier	 bits Left
-	TokenNameMINUS	
bitsToGet	TokenNameIdentifier	 bits To Get
;	TokenNameSEMICOLON	
int	TokenNameint	
i1	TokenNameIdentifier	 i1
,	TokenNameCOMMA	
i2	TokenNameIdentifier	 i2
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
shift	TokenNameIdentifier	 shift
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
i1	TokenNameIdentifier	 i1
=	TokenNameEQUAL	
(	TokenNameLPAREN	
b	TokenNameIdentifier	 b
&	TokenNameAND	
table1	TokenNameIdentifier	 table1
[	TokenNameLBRACKET	
bitsLeft	TokenNameIdentifier	 bits Left
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
>>>	TokenNameUNSIGNED_RIGHT_SHIFT	
shift	TokenNameIdentifier	 shift
;	TokenNameSEMICOLON	
bitPointer	TokenNameIdentifier	 bit Pointer
+=	TokenNamePLUS_EQUAL	
bitsToGet	TokenNameIdentifier	 bits To Get
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
bitPointer	TokenNameIdentifier	 bit Pointer
==	TokenNameEQUAL_EQUAL	
8	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
bitPointer	TokenNameIdentifier	 bit Pointer
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
bytePointer	TokenNameIdentifier	 byte Pointer
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
i1	TokenNameIdentifier	 i1
=	TokenNameEQUAL	
(	TokenNameLPAREN	
b	TokenNameIdentifier	 b
&	TokenNameAND	
table1	TokenNameIdentifier	 table1
[	TokenNameLBRACKET	
bitsLeft	TokenNameIdentifier	 bits Left
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
<<	TokenNameLEFT_SHIFT	
(	TokenNameLPAREN	
-	TokenNameMINUS	
shift	TokenNameIdentifier	 shift
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
i2	TokenNameIdentifier	 i2
=	TokenNameEQUAL	
(	TokenNameLPAREN	
next	TokenNameIdentifier	 next
&	TokenNameAND	
table2	TokenNameIdentifier	 table2
[	TokenNameLBRACKET	
bitsFromNextByte	TokenNameIdentifier	 bits From Next Byte
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
>>>	TokenNameUNSIGNED_RIGHT_SHIFT	
(	TokenNameLPAREN	
8	TokenNameIntegerLiteral	
-	TokenNameMINUS	
bitsFromNextByte	TokenNameIdentifier	 bits From Next Byte
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
i1	TokenNameIdentifier	 i1
|=	TokenNameOR_EQUAL	
i2	TokenNameIdentifier	 i2
;	TokenNameSEMICOLON	
bytePointer	TokenNameIdentifier	 byte Pointer
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
bitPointer	TokenNameIdentifier	 bit Pointer
=	TokenNameEQUAL	
bitsFromNextByte	TokenNameIdentifier	 bits From Next Byte
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
i1	TokenNameIdentifier	 i1
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Move pointer backwards by given amount of bits 	TokenNameCOMMENT_LINE	Move pointer backwards by given amount of bits 
private	TokenNameprivate	
void	TokenNamevoid	
updatePointer	TokenNameIdentifier	 update Pointer
(	TokenNameLPAREN	
int	TokenNameint	
bitsToMoveBack	TokenNameIdentifier	 bits To Move Back
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
bitPointer	TokenNameIdentifier	 bit Pointer
-	TokenNameMINUS	
bitsToMoveBack	TokenNameIdentifier	 bits To Move Back
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
bytePointer	TokenNameIdentifier	 byte Pointer
--	TokenNameMINUS_MINUS	
;	TokenNameSEMICOLON	
bitPointer	TokenNameIdentifier	 bit Pointer
=	TokenNameEQUAL	
8	TokenNameIntegerLiteral	
+	TokenNamePLUS	
i	TokenNameIdentifier	 i
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
bitPointer	TokenNameIdentifier	 bit Pointer
=	TokenNameEQUAL	
i	TokenNameIdentifier	 i
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// Move to the next byte boundary 	TokenNameCOMMENT_LINE	Move to the next byte boundary 
private	TokenNameprivate	
boolean	TokenNameboolean	
advancePointer	TokenNameIdentifier	 advance Pointer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
bitPointer	TokenNameIdentifier	 bit Pointer
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
bytePointer	TokenNameIdentifier	 byte Pointer
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
bitPointer	TokenNameIdentifier	 bit Pointer
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
