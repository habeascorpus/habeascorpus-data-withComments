// $ANTLR 3.2 Sep 23, 2009 12:02:23 /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g 2013-01-24 15:45:49 	TokenNameCOMMENT_LINE	$ANTLR 3.2 Sep 23, 2009 12:02:23 /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g 2013-01-24 15:45:49 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
cql3	TokenNameIdentifier	 cql3
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
exceptions	TokenNameIdentifier	 exceptions
.	TokenNameDOT	
SyntaxException	TokenNameIdentifier	 Syntax Exception
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
antlr	TokenNameIdentifier	 antlr
.	TokenNameDOT	
runtime	TokenNameIdentifier	 runtime
.	TokenNameDOT	
*	TokenNameMULTIPLY	
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Stack	TokenNameIdentifier	 Stack
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
List	TokenNameIdentifier	 List
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
ArrayList	TokenNameIdentifier	 Array List
;	TokenNameSEMICOLON	
public	TokenNamepublic	
class	TokenNameclass	
CqlLexer	TokenNameIdentifier	 Cql Lexer
extends	TokenNameextends	
Lexer	TokenNameIdentifier	 Lexer
{	TokenNameLBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
K_FALSE	TokenNameIdentifier	 K  FALSE
=	TokenNameEQUAL	
74	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
K_PERMISSIONS	TokenNameIdentifier	 K  PERMISSIONS
=	TokenNameEQUAL	
60	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
K_TRUE	TokenNameIdentifier	 K  TRUE
=	TokenNameEQUAL	
73	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
LETTER	TokenNameIdentifier	 LETTER
=	TokenNameEQUAL	
119	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
K_INT	TokenNameIdentifier	 K  INT
=	TokenNameEQUAL	
85	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
K_PERMISSION	TokenNameIdentifier	 K  PERMISSION
=	TokenNameEQUAL	
61	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
K_CREATE	TokenNameIdentifier	 K  CREATE
=	TokenNameEQUAL	
33	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
K_CLUSTERING	TokenNameIdentifier	 K  CLUSTERING
=	TokenNameEQUAL	
41	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
K_WRITETIME	TokenNameIdentifier	 K  WRITETIME
=	TokenNameEQUAL	
15	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
EOF	TokenNameIdentifier	 EOF
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
K_PRIMARY	TokenNameIdentifier	 K  PRIMARY
=	TokenNameEQUAL	
37	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
K_AUTHORIZE	TokenNameIdentifier	 K  AUTHORIZE
=	TokenNameEQUAL	
58	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
K_VALUES	TokenNameIdentifier	 K  VALUES
=	TokenNameEQUAL	
22	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
K_USE	TokenNameIdentifier	 K  USE
=	TokenNameEQUAL	
4	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
STRING_LITERAL	TokenNameIdentifier	 STRING  LITERAL
=	TokenNameEQUAL	
68	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
K_GRANT	TokenNameIdentifier	 K  GRANT
=	TokenNameEQUAL	
52	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
K_ON	TokenNameIdentifier	 K  ON
=	TokenNameEQUAL	
44	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
K_USING	TokenNameIdentifier	 K  USING
=	TokenNameEQUAL	
23	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
K_ADD	TokenNameIdentifier	 K  ADD
=	TokenNameEQUAL	
47	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
K_ASC	TokenNameIdentifier	 K  ASC
=	TokenNameEQUAL	
18	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
K_KEY	TokenNameIdentifier	 K  KEY
=	TokenNameEQUAL	
38	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
K_TRUNCATE	TokenNameIdentifier	 K  TRUNCATE
=	TokenNameEQUAL	
51	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
COMMENT	TokenNameIdentifier	 COMMENT
=	TokenNameEQUAL	
122	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
K_ORDER	TokenNameIdentifier	 K  ORDER
=	TokenNameEQUAL	
9	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
K_ALL	TokenNameIdentifier	 K  ALL
=	TokenNameEQUAL	
59	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
K_OF	TokenNameIdentifier	 K  OF
=	TokenNameEQUAL	
55	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
T__139	TokenNameIdentifier	 T  139
=	TokenNameEQUAL	
139	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
D	TokenNameIdentifier	 D
=	TokenNameEQUAL	
105	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
T__138	TokenNameIdentifier	 T  138
=	TokenNameEQUAL	
138	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
E	TokenNameIdentifier	 E
=	TokenNameEQUAL	
93	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
T__137	TokenNameIdentifier	 T  137
=	TokenNameEQUAL	
137	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
F	TokenNameIdentifier	 F
=	TokenNameEQUAL	
97	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
T__136	TokenNameIdentifier	 T  136
=	TokenNameEQUAL	
136	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
G	TokenNameIdentifier	 G
=	TokenNameEQUAL	
111	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
K_TYPE	TokenNameIdentifier	 K  TYPE
=	TokenNameEQUAL	
46	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
K_KEYSPACE	TokenNameIdentifier	 K  KEYSPACE
=	TokenNameEQUAL	
34	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
K_COUNT	TokenNameIdentifier	 K  COUNT
=	TokenNameEQUAL	
6	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
A	TokenNameIdentifier	 A
=	TokenNameEQUAL	
103	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
B	TokenNameIdentifier	 B
=	TokenNameEQUAL	
112	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
C	TokenNameIdentifier	 C
=	TokenNameEQUAL	
95	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
L	TokenNameIdentifier	 L
=	TokenNameEQUAL	
94	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
M	TokenNameIdentifier	 M
=	TokenNameEQUAL	
100	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
N	TokenNameIdentifier	 N
=	TokenNameEQUAL	
104	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
O	TokenNameIdentifier	 O
=	TokenNameEQUAL	
99	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
H	TokenNameIdentifier	 H
=	TokenNameEQUAL	
102	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
I	TokenNameIdentifier	 I
=	TokenNameEQUAL	
108	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
J	TokenNameIdentifier	 J
=	TokenNameEQUAL	
116	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
K_UPDATE	TokenNameIdentifier	 K  UPDATE
=	TokenNameEQUAL	
25	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
K	TokenNameIdentifier	 K
=	TokenNameEQUAL	
106	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
K_FILTERING	TokenNameIdentifier	 K  FILTERING
=	TokenNameEQUAL	
14	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
U	TokenNameIdentifier	 U
=	TokenNameEQUAL	
109	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
T	TokenNameIdentifier	 T
=	TokenNameEQUAL	
96	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
W	TokenNameIdentifier	 W
=	TokenNameEQUAL	
101	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
K_TEXT	TokenNameIdentifier	 K  TEXT
=	TokenNameEQUAL	
86	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
V	TokenNameIdentifier	 V
=	TokenNameEQUAL	
114	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
Q	TokenNameIdentifier	 Q
=	TokenNameEQUAL	
117	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
P	TokenNameIdentifier	 P
=	TokenNameEQUAL	
110	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
K_COMPACT	TokenNameIdentifier	 K  COMPACT
=	TokenNameEQUAL	
39	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
S	TokenNameIdentifier	 S
=	TokenNameEQUAL	
92	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
R	TokenNameIdentifier	 R
=	TokenNameEQUAL	
98	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
T__141	TokenNameIdentifier	 T  141
=	TokenNameEQUAL	
141	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
K_TTL	TokenNameIdentifier	 K  TTL
=	TokenNameEQUAL	
16	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
T__140	TokenNameIdentifier	 T  140
=	TokenNameEQUAL	
140	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
Y	TokenNameIdentifier	 Y
=	TokenNameEQUAL	
107	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
X	TokenNameIdentifier	 X
=	TokenNameEQUAL	
113	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
Z	TokenNameIdentifier	 Z
=	TokenNameEQUAL	
115	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
T__126	TokenNameIdentifier	 T  126
=	TokenNameEQUAL	
126	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
T__125	TokenNameIdentifier	 T  125
=	TokenNameEQUAL	
125	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
K_INDEX	TokenNameIdentifier	 K  INDEX
=	TokenNameEQUAL	
42	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
T__128	TokenNameIdentifier	 T  128
=	TokenNameEQUAL	
128	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
K_INSERT	TokenNameIdentifier	 K  INSERT
=	TokenNameEQUAL	
20	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
T__127	TokenNameIdentifier	 T  127
=	TokenNameEQUAL	
127	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
WS	TokenNameIdentifier	 WS
=	TokenNameEQUAL	
121	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
T__129	TokenNameIdentifier	 T  129
=	TokenNameEQUAL	
129	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
K_RENAME	TokenNameIdentifier	 K  RENAME
=	TokenNameEQUAL	
48	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
K_APPLY	TokenNameIdentifier	 K  APPLY
=	TokenNameEQUAL	
32	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
K_INET	TokenNameIdentifier	 K  INET
=	TokenNameEQUAL	
84	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
K_STORAGE	TokenNameIdentifier	 K  STORAGE
=	TokenNameEQUAL	
40	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
K_TIMESTAMP	TokenNameIdentifier	 K  TIMESTAMP
=	TokenNameEQUAL	
24	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
K_AND	TokenNameIdentifier	 K  AND
=	TokenNameEQUAL	
17	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
K_DESC	TokenNameIdentifier	 K  DESC
=	TokenNameEQUAL	
19	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
T__130	TokenNameIdentifier	 T  130
=	TokenNameEQUAL	
130	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
K_TOKEN	TokenNameIdentifier	 K  TOKEN
=	TokenNameEQUAL	
75	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
T__131	TokenNameIdentifier	 T  131
=	TokenNameEQUAL	
131	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
QMARK	TokenNameIdentifier	 QMARK
=	TokenNameEQUAL	
70	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
T__132	TokenNameIdentifier	 T  132
=	TokenNameEQUAL	
132	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
T__133	TokenNameIdentifier	 T  133
=	TokenNameEQUAL	
133	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
T__134	TokenNameIdentifier	 T  134
=	TokenNameEQUAL	
134	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
K_BATCH	TokenNameIdentifier	 K  BATCH
=	TokenNameEQUAL	
31	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
T__135	TokenNameIdentifier	 T  135
=	TokenNameEQUAL	
135	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
K_UUID	TokenNameIdentifier	 K  UUID
=	TokenNameEQUAL	
87	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
K_ASCII	TokenNameIdentifier	 K  ASCII
=	TokenNameEQUAL	
77	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
UUID	TokenNameIdentifier	 UUID
=	TokenNameEQUAL	
71	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
K_LIST	TokenNameIdentifier	 K  LIST
=	TokenNameEQUAL	
54	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
K_DELETE	TokenNameIdentifier	 K  DELETE
=	TokenNameEQUAL	
27	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
T__124	TokenNameIdentifier	 T  124
=	TokenNameEQUAL	
124	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
K_TO	TokenNameIdentifier	 K  TO
=	TokenNameEQUAL	
49	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
K_BY	TokenNameIdentifier	 K  BY
=	TokenNameEQUAL	
10	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
FLOAT	TokenNameIdentifier	 FLOAT
=	TokenNameEQUAL	
72	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
K_SUPERUSER	TokenNameIdentifier	 K  SUPERUSER
=	TokenNameEQUAL	
64	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
K_FLOAT	TokenNameIdentifier	 K  FLOAT
=	TokenNameEQUAL	
83	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
K_VARINT	TokenNameIdentifier	 K  VARINT
=	TokenNameEQUAL	
89	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
K_DOUBLE	TokenNameIdentifier	 K  DOUBLE
=	TokenNameEQUAL	
82	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
K_SELECT	TokenNameIdentifier	 K  SELECT
=	TokenNameEQUAL	
5	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
K_LIMIT	TokenNameIdentifier	 K  LIMIT
=	TokenNameEQUAL	
11	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
K_ALTER	TokenNameIdentifier	 K  ALTER
=	TokenNameEQUAL	
45	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
K_BOOLEAN	TokenNameIdentifier	 K  BOOLEAN
=	TokenNameEQUAL	
80	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
K_SET	TokenNameIdentifier	 K  SET
=	TokenNameEQUAL	
26	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
K_WHERE	TokenNameIdentifier	 K  WHERE
=	TokenNameEQUAL	
8	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
QUOTED_NAME	TokenNameIdentifier	 QUOTED  NAME
=	TokenNameEQUAL	
69	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
MULTILINE_COMMENT	TokenNameIdentifier	 MULTILINE  COMMENT
=	TokenNameEQUAL	
123	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
K_UNLOGGED	TokenNameIdentifier	 K  UNLOGGED
=	TokenNameEQUAL	
29	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
K_BLOB	TokenNameIdentifier	 K  BLOB
=	TokenNameEQUAL	
79	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
K_INTO	TokenNameIdentifier	 K  INTO
=	TokenNameEQUAL	
21	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
HEX	TokenNameIdentifier	 HEX
=	TokenNameEQUAL	
120	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
K_PASSWORD	TokenNameIdentifier	 K  PASSWORD
=	TokenNameEQUAL	
67	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
K_REVOKE	TokenNameIdentifier	 K  REVOKE
=	TokenNameEQUAL	
53	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
K_ALLOW	TokenNameIdentifier	 K  ALLOW
=	TokenNameEQUAL	
13	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
K_VARCHAR	TokenNameIdentifier	 K  VARCHAR
=	TokenNameEQUAL	
88	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
IDENT	TokenNameIdentifier	 IDENT
=	TokenNameEQUAL	
43	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
DIGIT	TokenNameIdentifier	 DIGIT
=	TokenNameEQUAL	
118	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
K_USERS	TokenNameIdentifier	 K  USERS
=	TokenNameEQUAL	
66	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
K_BEGIN	TokenNameIdentifier	 K  BEGIN
=	TokenNameEQUAL	
28	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
INTEGER	TokenNameIdentifier	 INTEGER
=	TokenNameEQUAL	
12	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
K_KEYSPACES	TokenNameIdentifier	 K  KEYSPACES
=	TokenNameEQUAL	
62	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
K_COUNTER	TokenNameIdentifier	 K  COUNTER
=	TokenNameEQUAL	
30	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
K_DECIMAL	TokenNameIdentifier	 K  DECIMAL
=	TokenNameEQUAL	
81	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
K_WITH	TokenNameIdentifier	 K  WITH
=	TokenNameEQUAL	
35	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
K_IN	TokenNameIdentifier	 K  IN
=	TokenNameEQUAL	
76	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
K_NORECURSIVE	TokenNameIdentifier	 K  NORECURSIVE
=	TokenNameEQUAL	
56	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
K_MAP	TokenNameIdentifier	 K  MAP
=	TokenNameEQUAL	
91	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
K_FROM	TokenNameIdentifier	 K  FROM
=	TokenNameEQUAL	
7	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
K_COLUMNFAMILY	TokenNameIdentifier	 K  COLUMNFAMILY
=	TokenNameEQUAL	
36	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
K_MODIFY	TokenNameIdentifier	 K  MODIFY
=	TokenNameEQUAL	
57	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
K_DROP	TokenNameIdentifier	 K  DROP
=	TokenNameEQUAL	
50	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
K_NOSUPERUSER	TokenNameIdentifier	 K  NOSUPERUSER
=	TokenNameEQUAL	
65	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
K_BIGINT	TokenNameIdentifier	 K  BIGINT
=	TokenNameEQUAL	
78	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
K_TIMEUUID	TokenNameIdentifier	 K  TIMEUUID
=	TokenNameEQUAL	
90	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
K_USER	TokenNameIdentifier	 K  USER
=	TokenNameEQUAL	
63	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
Token	TokenNameIdentifier	 Token
>	TokenNameGREATER	
tokens	TokenNameIdentifier	 tokens
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
Token	TokenNameIdentifier	 Token
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
void	TokenNamevoid	
emit	TokenNameIdentifier	 emit
(	TokenNameLPAREN	
Token	TokenNameIdentifier	 Token
token	TokenNameIdentifier	 token
)	TokenNameRPAREN	
{	TokenNameLBRACE	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
token	TokenNameIdentifier	 token
=	TokenNameEQUAL	
token	TokenNameIdentifier	 token
;	TokenNameSEMICOLON	
tokens	TokenNameIdentifier	 tokens
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
token	TokenNameIdentifier	 token
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
Token	TokenNameIdentifier	 Token
nextToken	TokenNameIdentifier	 next Token
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
.	TokenNameDOT	
nextToken	TokenNameIdentifier	 next Token
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
tokens	TokenNameIdentifier	 tokens
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
return	TokenNamereturn	
Token	TokenNameIdentifier	 Token
.	TokenNameDOT	
EOF_TOKEN	TokenNameIdentifier	 EOF  TOKEN
;	TokenNameSEMICOLON	
return	TokenNamereturn	
tokens	TokenNameIdentifier	 tokens
.	TokenNameDOT	
remove	TokenNameIdentifier	 remove
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
recognitionErrors	TokenNameIdentifier	 recognition Errors
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
void	TokenNamevoid	
displayRecognitionError	TokenNameIdentifier	 display Recognition Error
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
tokenNames	TokenNameIdentifier	 token Names
,	TokenNameCOMMA	
RecognitionException	TokenNameIdentifier	 Recognition Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
hdr	TokenNameIdentifier	 hdr
=	TokenNameEQUAL	
getErrorHeader	TokenNameIdentifier	 get Error Header
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
msg	TokenNameIdentifier	 msg
=	TokenNameEQUAL	
getErrorMessage	TokenNameIdentifier	 get Error Message
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
,	TokenNameCOMMA	
tokenNames	TokenNameIdentifier	 token Names
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
recognitionErrors	TokenNameIdentifier	 recognition Errors
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
hdr	TokenNameIdentifier	 hdr
+	TokenNamePLUS	
" "	TokenNameStringLiteral	 
+	TokenNamePLUS	
msg	TokenNameIdentifier	 msg
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
getRecognitionErrors	TokenNameIdentifier	 get Recognition Errors
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
recognitionErrors	TokenNameIdentifier	 recognition Errors
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
throwLastRecognitionError	TokenNameIdentifier	 throw Last Recognition Error
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
SyntaxException	TokenNameIdentifier	 Syntax Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
recognitionErrors	TokenNameIdentifier	 recognition Errors
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
SyntaxException	TokenNameIdentifier	 Syntax Exception
(	TokenNameLPAREN	
recognitionErrors	TokenNameIdentifier	 recognition Errors
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
(	TokenNameLPAREN	
recognitionErrors	TokenNameIdentifier	 recognition Errors
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// delegates 	TokenNameCOMMENT_LINE	delegates 
// delegators 	TokenNameCOMMENT_LINE	delegators 
public	TokenNamepublic	
CqlLexer	TokenNameIdentifier	 Cql Lexer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
CqlLexer	TokenNameIdentifier	 Cql Lexer
(	TokenNameLPAREN	
CharStream	TokenNameIdentifier	 Char Stream
input	TokenNameIdentifier	 input
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
input	TokenNameIdentifier	 input
,	TokenNameCOMMA	
new	TokenNamenew	
RecognizerSharedState	TokenNameIdentifier	 Recognizer Shared State
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
CqlLexer	TokenNameIdentifier	 Cql Lexer
(	TokenNameLPAREN	
CharStream	TokenNameIdentifier	 Char Stream
input	TokenNameIdentifier	 input
,	TokenNameCOMMA	
RecognizerSharedState	TokenNameIdentifier	 Recognizer Shared State
state	TokenNameIdentifier	 state
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
input	TokenNameIdentifier	 input
,	TokenNameCOMMA	
state	TokenNameIdentifier	 state
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getGrammarFileName	TokenNameIdentifier	 get Grammar File Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
"/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g"	TokenNameStringLiteral	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// $ANTLR start "T__124" 	TokenNameCOMMENT_LINE	$ANTLR start "T__124" 
public	TokenNamepublic	
final	TokenNamefinal	
void	TokenNamevoid	
mT__124	TokenNameIdentifier	 m T  124
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
RecognitionException	TokenNameIdentifier	 Recognition Exception
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
int	TokenNameint	
_type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
T__124	TokenNameIdentifier	 T  124
;	TokenNameSEMICOLON	
int	TokenNameint	
_channel	TokenNameIdentifier	 channel
=	TokenNameEQUAL	
DEFAULT_TOKEN_CHANNEL	TokenNameIdentifier	 DEFAULT  TOKEN  CHANNEL
;	TokenNameSEMICOLON	
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:50:8: ( ';' ) 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:50:8: ( ';' ) 
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:50:10: ';' 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:50:10: ';' 
{	TokenNameLBRACE	
match	TokenNameIdentifier	 match
(	TokenNameLPAREN	
';'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
_type	TokenNameIdentifier	 type
;	TokenNameSEMICOLON	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
channel	TokenNameIdentifier	 channel
=	TokenNameEQUAL	
_channel	TokenNameIdentifier	 channel
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
finally	TokenNamefinally	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// $ANTLR end "T__124" 	TokenNameCOMMENT_LINE	$ANTLR end "T__124" 
// $ANTLR start "T__125" 	TokenNameCOMMENT_LINE	$ANTLR start "T__125" 
public	TokenNamepublic	
final	TokenNamefinal	
void	TokenNamevoid	
mT__125	TokenNameIdentifier	 m T  125
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
RecognitionException	TokenNameIdentifier	 Recognition Exception
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
int	TokenNameint	
_type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
T__125	TokenNameIdentifier	 T  125
;	TokenNameSEMICOLON	
int	TokenNameint	
_channel	TokenNameIdentifier	 channel
=	TokenNameEQUAL	
DEFAULT_TOKEN_CHANNEL	TokenNameIdentifier	 DEFAULT  TOKEN  CHANNEL
;	TokenNameSEMICOLON	
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:51:8: ( '(' ) 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:51:8: ( '(' ) 
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:51:10: '(' 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:51:10: '(' 
{	TokenNameLBRACE	
match	TokenNameIdentifier	 match
(	TokenNameLPAREN	
'('	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
_type	TokenNameIdentifier	 type
;	TokenNameSEMICOLON	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
channel	TokenNameIdentifier	 channel
=	TokenNameEQUAL	
_channel	TokenNameIdentifier	 channel
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
finally	TokenNamefinally	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// $ANTLR end "T__125" 	TokenNameCOMMENT_LINE	$ANTLR end "T__125" 
// $ANTLR start "T__126" 	TokenNameCOMMENT_LINE	$ANTLR start "T__126" 
public	TokenNamepublic	
final	TokenNamefinal	
void	TokenNamevoid	
mT__126	TokenNameIdentifier	 m T  126
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
RecognitionException	TokenNameIdentifier	 Recognition Exception
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
int	TokenNameint	
_type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
T__126	TokenNameIdentifier	 T  126
;	TokenNameSEMICOLON	
int	TokenNameint	
_channel	TokenNameIdentifier	 channel
=	TokenNameEQUAL	
DEFAULT_TOKEN_CHANNEL	TokenNameIdentifier	 DEFAULT  TOKEN  CHANNEL
;	TokenNameSEMICOLON	
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:52:8: ( ')' ) 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:52:8: ( ')' ) 
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:52:10: ')' 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:52:10: ')' 
{	TokenNameLBRACE	
match	TokenNameIdentifier	 match
(	TokenNameLPAREN	
')'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
_type	TokenNameIdentifier	 type
;	TokenNameSEMICOLON	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
channel	TokenNameIdentifier	 channel
=	TokenNameEQUAL	
_channel	TokenNameIdentifier	 channel
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
finally	TokenNamefinally	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// $ANTLR end "T__126" 	TokenNameCOMMENT_LINE	$ANTLR end "T__126" 
// $ANTLR start "T__127" 	TokenNameCOMMENT_LINE	$ANTLR start "T__127" 
public	TokenNamepublic	
final	TokenNamefinal	
void	TokenNamevoid	
mT__127	TokenNameIdentifier	 m T  127
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
RecognitionException	TokenNameIdentifier	 Recognition Exception
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
int	TokenNameint	
_type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
T__127	TokenNameIdentifier	 T  127
;	TokenNameSEMICOLON	
int	TokenNameint	
_channel	TokenNameIdentifier	 channel
=	TokenNameEQUAL	
DEFAULT_TOKEN_CHANNEL	TokenNameIdentifier	 DEFAULT  TOKEN  CHANNEL
;	TokenNameSEMICOLON	
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:53:8: ( ',' ) 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:53:8: ( ',' ) 
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:53:10: ',' 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:53:10: ',' 
{	TokenNameLBRACE	
match	TokenNameIdentifier	 match
(	TokenNameLPAREN	
','	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
_type	TokenNameIdentifier	 type
;	TokenNameSEMICOLON	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
channel	TokenNameIdentifier	 channel
=	TokenNameEQUAL	
_channel	TokenNameIdentifier	 channel
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
finally	TokenNamefinally	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// $ANTLR end "T__127" 	TokenNameCOMMENT_LINE	$ANTLR end "T__127" 
// $ANTLR start "T__128" 	TokenNameCOMMENT_LINE	$ANTLR start "T__128" 
public	TokenNamepublic	
final	TokenNamefinal	
void	TokenNamevoid	
mT__128	TokenNameIdentifier	 m T  128
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
RecognitionException	TokenNameIdentifier	 Recognition Exception
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
int	TokenNameint	
_type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
T__128	TokenNameIdentifier	 T  128
;	TokenNameSEMICOLON	
int	TokenNameint	
_channel	TokenNameIdentifier	 channel
=	TokenNameEQUAL	
DEFAULT_TOKEN_CHANNEL	TokenNameIdentifier	 DEFAULT  TOKEN  CHANNEL
;	TokenNameSEMICOLON	
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:54:8: ( '\\*' ) 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:54:8: ( '\\*' ) 
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:54:10: '\\*' 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:54:10: '\\*' 
{	TokenNameLBRACE	
match	TokenNameIdentifier	 match
(	TokenNameLPAREN	
'*'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
_type	TokenNameIdentifier	 type
;	TokenNameSEMICOLON	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
channel	TokenNameIdentifier	 channel
=	TokenNameEQUAL	
_channel	TokenNameIdentifier	 channel
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
finally	TokenNamefinally	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// $ANTLR end "T__128" 	TokenNameCOMMENT_LINE	$ANTLR end "T__128" 
// $ANTLR start "T__129" 	TokenNameCOMMENT_LINE	$ANTLR start "T__129" 
public	TokenNamepublic	
final	TokenNamefinal	
void	TokenNamevoid	
mT__129	TokenNameIdentifier	 m T  129
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
RecognitionException	TokenNameIdentifier	 Recognition Exception
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
int	TokenNameint	
_type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
T__129	TokenNameIdentifier	 T  129
;	TokenNameSEMICOLON	
int	TokenNameint	
_channel	TokenNameIdentifier	 channel
=	TokenNameEQUAL	
DEFAULT_TOKEN_CHANNEL	TokenNameIdentifier	 DEFAULT  TOKEN  CHANNEL
;	TokenNameSEMICOLON	
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:55:8: ( '[' ) 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:55:8: ( '[' ) 
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:55:10: '[' 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:55:10: '[' 
{	TokenNameLBRACE	
match	TokenNameIdentifier	 match
(	TokenNameLPAREN	
'['	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
_type	TokenNameIdentifier	 type
;	TokenNameSEMICOLON	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
channel	TokenNameIdentifier	 channel
=	TokenNameEQUAL	
_channel	TokenNameIdentifier	 channel
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
finally	TokenNamefinally	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// $ANTLR end "T__129" 	TokenNameCOMMENT_LINE	$ANTLR end "T__129" 
// $ANTLR start "T__130" 	TokenNameCOMMENT_LINE	$ANTLR start "T__130" 
public	TokenNamepublic	
final	TokenNamefinal	
void	TokenNamevoid	
mT__130	TokenNameIdentifier	 m T  130
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
RecognitionException	TokenNameIdentifier	 Recognition Exception
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
int	TokenNameint	
_type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
T__130	TokenNameIdentifier	 T  130
;	TokenNameSEMICOLON	
int	TokenNameint	
_channel	TokenNameIdentifier	 channel
=	TokenNameEQUAL	
DEFAULT_TOKEN_CHANNEL	TokenNameIdentifier	 DEFAULT  TOKEN  CHANNEL
;	TokenNameSEMICOLON	
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:56:8: ( ']' ) 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:56:8: ( ']' ) 
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:56:10: ']' 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:56:10: ']' 
{	TokenNameLBRACE	
match	TokenNameIdentifier	 match
(	TokenNameLPAREN	
']'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
_type	TokenNameIdentifier	 type
;	TokenNameSEMICOLON	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
channel	TokenNameIdentifier	 channel
=	TokenNameEQUAL	
_channel	TokenNameIdentifier	 channel
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
finally	TokenNamefinally	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// $ANTLR end "T__130" 	TokenNameCOMMENT_LINE	$ANTLR end "T__130" 
// $ANTLR start "T__131" 	TokenNameCOMMENT_LINE	$ANTLR start "T__131" 
public	TokenNamepublic	
final	TokenNamefinal	
void	TokenNamevoid	
mT__131	TokenNameIdentifier	 m T  131
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
RecognitionException	TokenNameIdentifier	 Recognition Exception
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
int	TokenNameint	
_type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
T__131	TokenNameIdentifier	 T  131
;	TokenNameSEMICOLON	
int	TokenNameint	
_channel	TokenNameIdentifier	 channel
=	TokenNameEQUAL	
DEFAULT_TOKEN_CHANNEL	TokenNameIdentifier	 DEFAULT  TOKEN  CHANNEL
;	TokenNameSEMICOLON	
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:57:8: ( '.' ) 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:57:8: ( '.' ) 
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:57:10: '.' 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:57:10: '.' 
{	TokenNameLBRACE	
match	TokenNameIdentifier	 match
(	TokenNameLPAREN	
'.'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
_type	TokenNameIdentifier	 type
;	TokenNameSEMICOLON	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
channel	TokenNameIdentifier	 channel
=	TokenNameEQUAL	
_channel	TokenNameIdentifier	 channel
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
finally	TokenNamefinally	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// $ANTLR end "T__131" 	TokenNameCOMMENT_LINE	$ANTLR end "T__131" 
// $ANTLR start "T__132" 	TokenNameCOMMENT_LINE	$ANTLR start "T__132" 
public	TokenNamepublic	
final	TokenNamefinal	
void	TokenNamevoid	
mT__132	TokenNameIdentifier	 m T  132
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
RecognitionException	TokenNameIdentifier	 Recognition Exception
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
int	TokenNameint	
_type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
T__132	TokenNameIdentifier	 T  132
;	TokenNameSEMICOLON	
int	TokenNameint	
_channel	TokenNameIdentifier	 channel
=	TokenNameEQUAL	
DEFAULT_TOKEN_CHANNEL	TokenNameIdentifier	 DEFAULT  TOKEN  CHANNEL
;	TokenNameSEMICOLON	
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:58:8: ( '{' ) 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:58:8: ( '{' ) 
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:58:10: '{' 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:58:10: '{' 
{	TokenNameLBRACE	
match	TokenNameIdentifier	 match
(	TokenNameLPAREN	
'{'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
_type	TokenNameIdentifier	 type
;	TokenNameSEMICOLON	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
channel	TokenNameIdentifier	 channel
=	TokenNameEQUAL	
_channel	TokenNameIdentifier	 channel
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
finally	TokenNamefinally	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// $ANTLR end "T__132" 	TokenNameCOMMENT_LINE	$ANTLR end "T__132" 
// $ANTLR start "T__133" 	TokenNameCOMMENT_LINE	$ANTLR start "T__133" 
public	TokenNamepublic	
final	TokenNamefinal	
void	TokenNamevoid	
mT__133	TokenNameIdentifier	 m T  133
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
RecognitionException	TokenNameIdentifier	 Recognition Exception
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
int	TokenNameint	
_type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
T__133	TokenNameIdentifier	 T  133
;	TokenNameSEMICOLON	
int	TokenNameint	
_channel	TokenNameIdentifier	 channel
=	TokenNameEQUAL	
DEFAULT_TOKEN_CHANNEL	TokenNameIdentifier	 DEFAULT  TOKEN  CHANNEL
;	TokenNameSEMICOLON	
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:59:8: ( '}' ) 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:59:8: ( '}' ) 
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:59:10: '}' 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:59:10: '}' 
{	TokenNameLBRACE	
match	TokenNameIdentifier	 match
(	TokenNameLPAREN	
'}'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
_type	TokenNameIdentifier	 type
;	TokenNameSEMICOLON	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
channel	TokenNameIdentifier	 channel
=	TokenNameEQUAL	
_channel	TokenNameIdentifier	 channel
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
finally	TokenNamefinally	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// $ANTLR end "T__133" 	TokenNameCOMMENT_LINE	$ANTLR end "T__133" 
// $ANTLR start "T__134" 	TokenNameCOMMENT_LINE	$ANTLR start "T__134" 
public	TokenNamepublic	
final	TokenNamefinal	
void	TokenNamevoid	
mT__134	TokenNameIdentifier	 m T  134
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
RecognitionException	TokenNameIdentifier	 Recognition Exception
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
int	TokenNameint	
_type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
T__134	TokenNameIdentifier	 T  134
;	TokenNameSEMICOLON	
int	TokenNameint	
_channel	TokenNameIdentifier	 channel
=	TokenNameEQUAL	
DEFAULT_TOKEN_CHANNEL	TokenNameIdentifier	 DEFAULT  TOKEN  CHANNEL
;	TokenNameSEMICOLON	
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:60:8: ( ':' ) 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:60:8: ( ':' ) 
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:60:10: ':' 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:60:10: ':' 
{	TokenNameLBRACE	
match	TokenNameIdentifier	 match
(	TokenNameLPAREN	
':'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
_type	TokenNameIdentifier	 type
;	TokenNameSEMICOLON	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
channel	TokenNameIdentifier	 channel
=	TokenNameEQUAL	
_channel	TokenNameIdentifier	 channel
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
finally	TokenNamefinally	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// $ANTLR end "T__134" 	TokenNameCOMMENT_LINE	$ANTLR end "T__134" 
// $ANTLR start "T__135" 	TokenNameCOMMENT_LINE	$ANTLR start "T__135" 
public	TokenNamepublic	
final	TokenNamefinal	
void	TokenNamevoid	
mT__135	TokenNameIdentifier	 m T  135
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
RecognitionException	TokenNameIdentifier	 Recognition Exception
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
int	TokenNameint	
_type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
T__135	TokenNameIdentifier	 T  135
;	TokenNameSEMICOLON	
int	TokenNameint	
_channel	TokenNameIdentifier	 channel
=	TokenNameEQUAL	
DEFAULT_TOKEN_CHANNEL	TokenNameIdentifier	 DEFAULT  TOKEN  CHANNEL
;	TokenNameSEMICOLON	
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:61:8: ( '=' ) 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:61:8: ( '=' ) 
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:61:10: '=' 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:61:10: '=' 
{	TokenNameLBRACE	
match	TokenNameIdentifier	 match
(	TokenNameLPAREN	
'='	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
_type	TokenNameIdentifier	 type
;	TokenNameSEMICOLON	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
channel	TokenNameIdentifier	 channel
=	TokenNameEQUAL	
_channel	TokenNameIdentifier	 channel
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
finally	TokenNamefinally	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// $ANTLR end "T__135" 	TokenNameCOMMENT_LINE	$ANTLR end "T__135" 
// $ANTLR start "T__136" 	TokenNameCOMMENT_LINE	$ANTLR start "T__136" 
public	TokenNamepublic	
final	TokenNamefinal	
void	TokenNamevoid	
mT__136	TokenNameIdentifier	 m T  136
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
RecognitionException	TokenNameIdentifier	 Recognition Exception
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
int	TokenNameint	
_type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
T__136	TokenNameIdentifier	 T  136
;	TokenNameSEMICOLON	
int	TokenNameint	
_channel	TokenNameIdentifier	 channel
=	TokenNameEQUAL	
DEFAULT_TOKEN_CHANNEL	TokenNameIdentifier	 DEFAULT  TOKEN  CHANNEL
;	TokenNameSEMICOLON	
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:62:8: ( '+' ) 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:62:8: ( '+' ) 
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:62:10: '+' 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:62:10: '+' 
{	TokenNameLBRACE	
match	TokenNameIdentifier	 match
(	TokenNameLPAREN	
'+'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
_type	TokenNameIdentifier	 type
;	TokenNameSEMICOLON	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
channel	TokenNameIdentifier	 channel
=	TokenNameEQUAL	
_channel	TokenNameIdentifier	 channel
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
finally	TokenNamefinally	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// $ANTLR end "T__136" 	TokenNameCOMMENT_LINE	$ANTLR end "T__136" 
// $ANTLR start "T__137" 	TokenNameCOMMENT_LINE	$ANTLR start "T__137" 
public	TokenNamepublic	
final	TokenNamefinal	
void	TokenNamevoid	
mT__137	TokenNameIdentifier	 m T  137
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
RecognitionException	TokenNameIdentifier	 Recognition Exception
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
int	TokenNameint	
_type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
T__137	TokenNameIdentifier	 T  137
;	TokenNameSEMICOLON	
int	TokenNameint	
_channel	TokenNameIdentifier	 channel
=	TokenNameEQUAL	
DEFAULT_TOKEN_CHANNEL	TokenNameIdentifier	 DEFAULT  TOKEN  CHANNEL
;	TokenNameSEMICOLON	
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:63:8: ( '-' ) 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:63:8: ( '-' ) 
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:63:10: '-' 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:63:10: '-' 
{	TokenNameLBRACE	
match	TokenNameIdentifier	 match
(	TokenNameLPAREN	
'-'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
_type	TokenNameIdentifier	 type
;	TokenNameSEMICOLON	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
channel	TokenNameIdentifier	 channel
=	TokenNameEQUAL	
_channel	TokenNameIdentifier	 channel
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
finally	TokenNamefinally	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// $ANTLR end "T__137" 	TokenNameCOMMENT_LINE	$ANTLR end "T__137" 
// $ANTLR start "T__138" 	TokenNameCOMMENT_LINE	$ANTLR start "T__138" 
public	TokenNamepublic	
final	TokenNamefinal	
void	TokenNamevoid	
mT__138	TokenNameIdentifier	 m T  138
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
RecognitionException	TokenNameIdentifier	 Recognition Exception
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
int	TokenNameint	
_type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
T__138	TokenNameIdentifier	 T  138
;	TokenNameSEMICOLON	
int	TokenNameint	
_channel	TokenNameIdentifier	 channel
=	TokenNameEQUAL	
DEFAULT_TOKEN_CHANNEL	TokenNameIdentifier	 DEFAULT  TOKEN  CHANNEL
;	TokenNameSEMICOLON	
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:64:8: ( '<' ) 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:64:8: ( '<' ) 
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:64:10: '<' 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:64:10: '<' 
{	TokenNameLBRACE	
match	TokenNameIdentifier	 match
(	TokenNameLPAREN	
'<'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
_type	TokenNameIdentifier	 type
;	TokenNameSEMICOLON	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
channel	TokenNameIdentifier	 channel
=	TokenNameEQUAL	
_channel	TokenNameIdentifier	 channel
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
finally	TokenNamefinally	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// $ANTLR end "T__138" 	TokenNameCOMMENT_LINE	$ANTLR end "T__138" 
// $ANTLR start "T__139" 	TokenNameCOMMENT_LINE	$ANTLR start "T__139" 
public	TokenNamepublic	
final	TokenNamefinal	
void	TokenNamevoid	
mT__139	TokenNameIdentifier	 m T  139
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
RecognitionException	TokenNameIdentifier	 Recognition Exception
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
int	TokenNameint	
_type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
T__139	TokenNameIdentifier	 T  139
;	TokenNameSEMICOLON	
int	TokenNameint	
_channel	TokenNameIdentifier	 channel
=	TokenNameEQUAL	
DEFAULT_TOKEN_CHANNEL	TokenNameIdentifier	 DEFAULT  TOKEN  CHANNEL
;	TokenNameSEMICOLON	
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:65:8: ( '<=' ) 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:65:8: ( '<=' ) 
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:65:10: '<=' 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:65:10: '<=' 
{	TokenNameLBRACE	
match	TokenNameIdentifier	 match
(	TokenNameLPAREN	
"<="	TokenNameStringLiteral	<=
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
_type	TokenNameIdentifier	 type
;	TokenNameSEMICOLON	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
channel	TokenNameIdentifier	 channel
=	TokenNameEQUAL	
_channel	TokenNameIdentifier	 channel
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
finally	TokenNamefinally	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// $ANTLR end "T__139" 	TokenNameCOMMENT_LINE	$ANTLR end "T__139" 
// $ANTLR start "T__140" 	TokenNameCOMMENT_LINE	$ANTLR start "T__140" 
public	TokenNamepublic	
final	TokenNamefinal	
void	TokenNamevoid	
mT__140	TokenNameIdentifier	 m T  140
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
RecognitionException	TokenNameIdentifier	 Recognition Exception
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
int	TokenNameint	
_type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
T__140	TokenNameIdentifier	 T  140
;	TokenNameSEMICOLON	
int	TokenNameint	
_channel	TokenNameIdentifier	 channel
=	TokenNameEQUAL	
DEFAULT_TOKEN_CHANNEL	TokenNameIdentifier	 DEFAULT  TOKEN  CHANNEL
;	TokenNameSEMICOLON	
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:66:8: ( '>=' ) 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:66:8: ( '>=' ) 
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:66:10: '>=' 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:66:10: '>=' 
{	TokenNameLBRACE	
match	TokenNameIdentifier	 match
(	TokenNameLPAREN	
">="	TokenNameStringLiteral	>=
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
_type	TokenNameIdentifier	 type
;	TokenNameSEMICOLON	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
channel	TokenNameIdentifier	 channel
=	TokenNameEQUAL	
_channel	TokenNameIdentifier	 channel
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
finally	TokenNamefinally	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// $ANTLR end "T__140" 	TokenNameCOMMENT_LINE	$ANTLR end "T__140" 
// $ANTLR start "T__141" 	TokenNameCOMMENT_LINE	$ANTLR start "T__141" 
public	TokenNamepublic	
final	TokenNamefinal	
void	TokenNamevoid	
mT__141	TokenNameIdentifier	 m T  141
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
RecognitionException	TokenNameIdentifier	 Recognition Exception
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
int	TokenNameint	
_type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
T__141	TokenNameIdentifier	 T  141
;	TokenNameSEMICOLON	
int	TokenNameint	
_channel	TokenNameIdentifier	 channel
=	TokenNameEQUAL	
DEFAULT_TOKEN_CHANNEL	TokenNameIdentifier	 DEFAULT  TOKEN  CHANNEL
;	TokenNameSEMICOLON	
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:67:8: ( '>' ) 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:67:8: ( '>' ) 
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:67:10: '>' 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:67:10: '>' 
{	TokenNameLBRACE	
match	TokenNameIdentifier	 match
(	TokenNameLPAREN	
'>'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
_type	TokenNameIdentifier	 type
;	TokenNameSEMICOLON	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
channel	TokenNameIdentifier	 channel
=	TokenNameEQUAL	
_channel	TokenNameIdentifier	 channel
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
finally	TokenNamefinally	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// $ANTLR end "T__141" 	TokenNameCOMMENT_LINE	$ANTLR end "T__141" 
// $ANTLR start "K_SELECT" 	TokenNameCOMMENT_LINE	$ANTLR start "K_SELECT" 
public	TokenNamepublic	
final	TokenNamefinal	
void	TokenNamevoid	
mK_SELECT	TokenNameIdentifier	 m K  SELECT
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
RecognitionException	TokenNameIdentifier	 Recognition Exception
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
int	TokenNameint	
_type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
K_SELECT	TokenNameIdentifier	 K  SELECT
;	TokenNameSEMICOLON	
int	TokenNameint	
_channel	TokenNameIdentifier	 channel
=	TokenNameEQUAL	
DEFAULT_TOKEN_CHANNEL	TokenNameIdentifier	 DEFAULT  TOKEN  CHANNEL
;	TokenNameSEMICOLON	
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:852:9: ( S E L E C T ) 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:852:9: ( S E L E C T ) 
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:852:16: S E L E C T 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:852:16: S E L E C T 
{	TokenNameLBRACE	
mS	TokenNameIdentifier	 m S
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mE	TokenNameIdentifier	 m E
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mL	TokenNameIdentifier	 m L
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mE	TokenNameIdentifier	 m E
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mC	TokenNameIdentifier	 m C
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mT	TokenNameIdentifier	 m T
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
_type	TokenNameIdentifier	 type
;	TokenNameSEMICOLON	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
channel	TokenNameIdentifier	 channel
=	TokenNameEQUAL	
_channel	TokenNameIdentifier	 channel
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
finally	TokenNamefinally	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// $ANTLR end "K_SELECT" 	TokenNameCOMMENT_LINE	$ANTLR end "K_SELECT" 
// $ANTLR start "K_FROM" 	TokenNameCOMMENT_LINE	$ANTLR start "K_FROM" 
public	TokenNamepublic	
final	TokenNamefinal	
void	TokenNamevoid	
mK_FROM	TokenNameIdentifier	 m K  FROM
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
RecognitionException	TokenNameIdentifier	 Recognition Exception
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
int	TokenNameint	
_type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
K_FROM	TokenNameIdentifier	 K  FROM
;	TokenNameSEMICOLON	
int	TokenNameint	
_channel	TokenNameIdentifier	 channel
=	TokenNameEQUAL	
DEFAULT_TOKEN_CHANNEL	TokenNameIdentifier	 DEFAULT  TOKEN  CHANNEL
;	TokenNameSEMICOLON	
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:853:7: ( F R O M ) 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:853:7: ( F R O M ) 
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:853:16: F R O M 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:853:16: F R O M 
{	TokenNameLBRACE	
mF	TokenNameIdentifier	 m F
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mR	TokenNameIdentifier	 m R
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mO	TokenNameIdentifier	 m O
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mM	TokenNameIdentifier	 m M
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
_type	TokenNameIdentifier	 type
;	TokenNameSEMICOLON	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
channel	TokenNameIdentifier	 channel
=	TokenNameEQUAL	
_channel	TokenNameIdentifier	 channel
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
finally	TokenNamefinally	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// $ANTLR end "K_FROM" 	TokenNameCOMMENT_LINE	$ANTLR end "K_FROM" 
// $ANTLR start "K_WHERE" 	TokenNameCOMMENT_LINE	$ANTLR start "K_WHERE" 
public	TokenNamepublic	
final	TokenNamefinal	
void	TokenNamevoid	
mK_WHERE	TokenNameIdentifier	 m K  WHERE
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
RecognitionException	TokenNameIdentifier	 Recognition Exception
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
int	TokenNameint	
_type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
K_WHERE	TokenNameIdentifier	 K  WHERE
;	TokenNameSEMICOLON	
int	TokenNameint	
_channel	TokenNameIdentifier	 channel
=	TokenNameEQUAL	
DEFAULT_TOKEN_CHANNEL	TokenNameIdentifier	 DEFAULT  TOKEN  CHANNEL
;	TokenNameSEMICOLON	
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:854:8: ( W H E R E ) 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:854:8: ( W H E R E ) 
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:854:16: W H E R E 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:854:16: W H E R E 
{	TokenNameLBRACE	
mW	TokenNameIdentifier	 m W
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mH	TokenNameIdentifier	 m H
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mE	TokenNameIdentifier	 m E
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mR	TokenNameIdentifier	 m R
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mE	TokenNameIdentifier	 m E
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
_type	TokenNameIdentifier	 type
;	TokenNameSEMICOLON	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
channel	TokenNameIdentifier	 channel
=	TokenNameEQUAL	
_channel	TokenNameIdentifier	 channel
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
finally	TokenNamefinally	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// $ANTLR end "K_WHERE" 	TokenNameCOMMENT_LINE	$ANTLR end "K_WHERE" 
// $ANTLR start "K_AND" 	TokenNameCOMMENT_LINE	$ANTLR start "K_AND" 
public	TokenNamepublic	
final	TokenNamefinal	
void	TokenNamevoid	
mK_AND	TokenNameIdentifier	 m K  AND
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
RecognitionException	TokenNameIdentifier	 Recognition Exception
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
int	TokenNameint	
_type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
K_AND	TokenNameIdentifier	 K  AND
;	TokenNameSEMICOLON	
int	TokenNameint	
_channel	TokenNameIdentifier	 channel
=	TokenNameEQUAL	
DEFAULT_TOKEN_CHANNEL	TokenNameIdentifier	 DEFAULT  TOKEN  CHANNEL
;	TokenNameSEMICOLON	
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:855:6: ( A N D ) 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:855:6: ( A N D ) 
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:855:16: A N D 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:855:16: A N D 
{	TokenNameLBRACE	
mA	TokenNameIdentifier	 m A
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mN	TokenNameIdentifier	 m N
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mD	TokenNameIdentifier	 m D
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
_type	TokenNameIdentifier	 type
;	TokenNameSEMICOLON	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
channel	TokenNameIdentifier	 channel
=	TokenNameEQUAL	
_channel	TokenNameIdentifier	 channel
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
finally	TokenNamefinally	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// $ANTLR end "K_AND" 	TokenNameCOMMENT_LINE	$ANTLR end "K_AND" 
// $ANTLR start "K_KEY" 	TokenNameCOMMENT_LINE	$ANTLR start "K_KEY" 
public	TokenNamepublic	
final	TokenNamefinal	
void	TokenNamevoid	
mK_KEY	TokenNameIdentifier	 m K  KEY
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
RecognitionException	TokenNameIdentifier	 Recognition Exception
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
int	TokenNameint	
_type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
K_KEY	TokenNameIdentifier	 K  KEY
;	TokenNameSEMICOLON	
int	TokenNameint	
_channel	TokenNameIdentifier	 channel
=	TokenNameEQUAL	
DEFAULT_TOKEN_CHANNEL	TokenNameIdentifier	 DEFAULT  TOKEN  CHANNEL
;	TokenNameSEMICOLON	
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:856:6: ( K E Y ) 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:856:6: ( K E Y ) 
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:856:16: K E Y 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:856:16: K E Y 
{	TokenNameLBRACE	
mK	TokenNameIdentifier	 m K
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mE	TokenNameIdentifier	 m E
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mY	TokenNameIdentifier	 m Y
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
_type	TokenNameIdentifier	 type
;	TokenNameSEMICOLON	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
channel	TokenNameIdentifier	 channel
=	TokenNameEQUAL	
_channel	TokenNameIdentifier	 channel
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
finally	TokenNamefinally	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// $ANTLR end "K_KEY" 	TokenNameCOMMENT_LINE	$ANTLR end "K_KEY" 
// $ANTLR start "K_INSERT" 	TokenNameCOMMENT_LINE	$ANTLR start "K_INSERT" 
public	TokenNamepublic	
final	TokenNamefinal	
void	TokenNamevoid	
mK_INSERT	TokenNameIdentifier	 m K  INSERT
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
RecognitionException	TokenNameIdentifier	 Recognition Exception
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
int	TokenNameint	
_type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
K_INSERT	TokenNameIdentifier	 K  INSERT
;	TokenNameSEMICOLON	
int	TokenNameint	
_channel	TokenNameIdentifier	 channel
=	TokenNameEQUAL	
DEFAULT_TOKEN_CHANNEL	TokenNameIdentifier	 DEFAULT  TOKEN  CHANNEL
;	TokenNameSEMICOLON	
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:857:9: ( I N S E R T ) 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:857:9: ( I N S E R T ) 
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:857:16: I N S E R T 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:857:16: I N S E R T 
{	TokenNameLBRACE	
mI	TokenNameIdentifier	 m I
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mN	TokenNameIdentifier	 m N
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mS	TokenNameIdentifier	 m S
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mE	TokenNameIdentifier	 m E
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mR	TokenNameIdentifier	 m R
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mT	TokenNameIdentifier	 m T
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
_type	TokenNameIdentifier	 type
;	TokenNameSEMICOLON	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
channel	TokenNameIdentifier	 channel
=	TokenNameEQUAL	
_channel	TokenNameIdentifier	 channel
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
finally	TokenNamefinally	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// $ANTLR end "K_INSERT" 	TokenNameCOMMENT_LINE	$ANTLR end "K_INSERT" 
// $ANTLR start "K_UPDATE" 	TokenNameCOMMENT_LINE	$ANTLR start "K_UPDATE" 
public	TokenNamepublic	
final	TokenNamefinal	
void	TokenNamevoid	
mK_UPDATE	TokenNameIdentifier	 m K  UPDATE
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
RecognitionException	TokenNameIdentifier	 Recognition Exception
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
int	TokenNameint	
_type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
K_UPDATE	TokenNameIdentifier	 K  UPDATE
;	TokenNameSEMICOLON	
int	TokenNameint	
_channel	TokenNameIdentifier	 channel
=	TokenNameEQUAL	
DEFAULT_TOKEN_CHANNEL	TokenNameIdentifier	 DEFAULT  TOKEN  CHANNEL
;	TokenNameSEMICOLON	
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:858:9: ( U P D A T E ) 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:858:9: ( U P D A T E ) 
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:858:16: U P D A T E 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:858:16: U P D A T E 
{	TokenNameLBRACE	
mU	TokenNameIdentifier	 m U
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mP	TokenNameIdentifier	 m P
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mD	TokenNameIdentifier	 m D
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mA	TokenNameIdentifier	 m A
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mT	TokenNameIdentifier	 m T
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mE	TokenNameIdentifier	 m E
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
_type	TokenNameIdentifier	 type
;	TokenNameSEMICOLON	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
channel	TokenNameIdentifier	 channel
=	TokenNameEQUAL	
_channel	TokenNameIdentifier	 channel
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
finally	TokenNamefinally	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// $ANTLR end "K_UPDATE" 	TokenNameCOMMENT_LINE	$ANTLR end "K_UPDATE" 
// $ANTLR start "K_WITH" 	TokenNameCOMMENT_LINE	$ANTLR start "K_WITH" 
public	TokenNamepublic	
final	TokenNamefinal	
void	TokenNamevoid	
mK_WITH	TokenNameIdentifier	 m K  WITH
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
RecognitionException	TokenNameIdentifier	 Recognition Exception
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
int	TokenNameint	
_type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
K_WITH	TokenNameIdentifier	 K  WITH
;	TokenNameSEMICOLON	
int	TokenNameint	
_channel	TokenNameIdentifier	 channel
=	TokenNameEQUAL	
DEFAULT_TOKEN_CHANNEL	TokenNameIdentifier	 DEFAULT  TOKEN  CHANNEL
;	TokenNameSEMICOLON	
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:859:7: ( W I T H ) 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:859:7: ( W I T H ) 
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:859:16: W I T H 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:859:16: W I T H 
{	TokenNameLBRACE	
mW	TokenNameIdentifier	 m W
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mI	TokenNameIdentifier	 m I
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mT	TokenNameIdentifier	 m T
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mH	TokenNameIdentifier	 m H
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
_type	TokenNameIdentifier	 type
;	TokenNameSEMICOLON	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
channel	TokenNameIdentifier	 channel
=	TokenNameEQUAL	
_channel	TokenNameIdentifier	 channel
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
finally	TokenNamefinally	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// $ANTLR end "K_WITH" 	TokenNameCOMMENT_LINE	$ANTLR end "K_WITH" 
// $ANTLR start "K_LIMIT" 	TokenNameCOMMENT_LINE	$ANTLR start "K_LIMIT" 
public	TokenNamepublic	
final	TokenNamefinal	
void	TokenNamevoid	
mK_LIMIT	TokenNameIdentifier	 m K  LIMIT
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
RecognitionException	TokenNameIdentifier	 Recognition Exception
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
int	TokenNameint	
_type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
K_LIMIT	TokenNameIdentifier	 K  LIMIT
;	TokenNameSEMICOLON	
int	TokenNameint	
_channel	TokenNameIdentifier	 channel
=	TokenNameEQUAL	
DEFAULT_TOKEN_CHANNEL	TokenNameIdentifier	 DEFAULT  TOKEN  CHANNEL
;	TokenNameSEMICOLON	
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:860:8: ( L I M I T ) 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:860:8: ( L I M I T ) 
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:860:16: L I M I T 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:860:16: L I M I T 
{	TokenNameLBRACE	
mL	TokenNameIdentifier	 m L
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mI	TokenNameIdentifier	 m I
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mM	TokenNameIdentifier	 m M
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mI	TokenNameIdentifier	 m I
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mT	TokenNameIdentifier	 m T
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
_type	TokenNameIdentifier	 type
;	TokenNameSEMICOLON	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
channel	TokenNameIdentifier	 channel
=	TokenNameEQUAL	
_channel	TokenNameIdentifier	 channel
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
finally	TokenNamefinally	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// $ANTLR end "K_LIMIT" 	TokenNameCOMMENT_LINE	$ANTLR end "K_LIMIT" 
// $ANTLR start "K_USING" 	TokenNameCOMMENT_LINE	$ANTLR start "K_USING" 
public	TokenNamepublic	
final	TokenNamefinal	
void	TokenNamevoid	
mK_USING	TokenNameIdentifier	 m K  USING
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
RecognitionException	TokenNameIdentifier	 Recognition Exception
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
int	TokenNameint	
_type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
K_USING	TokenNameIdentifier	 K  USING
;	TokenNameSEMICOLON	
int	TokenNameint	
_channel	TokenNameIdentifier	 channel
=	TokenNameEQUAL	
DEFAULT_TOKEN_CHANNEL	TokenNameIdentifier	 DEFAULT  TOKEN  CHANNEL
;	TokenNameSEMICOLON	
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:861:8: ( U S I N G ) 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:861:8: ( U S I N G ) 
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:861:16: U S I N G 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:861:16: U S I N G 
{	TokenNameLBRACE	
mU	TokenNameIdentifier	 m U
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mS	TokenNameIdentifier	 m S
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mI	TokenNameIdentifier	 m I
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mN	TokenNameIdentifier	 m N
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mG	TokenNameIdentifier	 m G
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
_type	TokenNameIdentifier	 type
;	TokenNameSEMICOLON	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
channel	TokenNameIdentifier	 channel
=	TokenNameEQUAL	
_channel	TokenNameIdentifier	 channel
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
finally	TokenNamefinally	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// $ANTLR end "K_USING" 	TokenNameCOMMENT_LINE	$ANTLR end "K_USING" 
// $ANTLR start "K_USE" 	TokenNameCOMMENT_LINE	$ANTLR start "K_USE" 
public	TokenNamepublic	
final	TokenNamefinal	
void	TokenNamevoid	
mK_USE	TokenNameIdentifier	 m K  USE
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
RecognitionException	TokenNameIdentifier	 Recognition Exception
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
int	TokenNameint	
_type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
K_USE	TokenNameIdentifier	 K  USE
;	TokenNameSEMICOLON	
int	TokenNameint	
_channel	TokenNameIdentifier	 channel
=	TokenNameEQUAL	
DEFAULT_TOKEN_CHANNEL	TokenNameIdentifier	 DEFAULT  TOKEN  CHANNEL
;	TokenNameSEMICOLON	
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:862:6: ( U S E ) 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:862:6: ( U S E ) 
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:862:16: U S E 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:862:16: U S E 
{	TokenNameLBRACE	
mU	TokenNameIdentifier	 m U
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mS	TokenNameIdentifier	 m S
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mE	TokenNameIdentifier	 m E
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
_type	TokenNameIdentifier	 type
;	TokenNameSEMICOLON	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
channel	TokenNameIdentifier	 channel
=	TokenNameEQUAL	
_channel	TokenNameIdentifier	 channel
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
finally	TokenNamefinally	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// $ANTLR end "K_USE" 	TokenNameCOMMENT_LINE	$ANTLR end "K_USE" 
// $ANTLR start "K_COUNT" 	TokenNameCOMMENT_LINE	$ANTLR start "K_COUNT" 
public	TokenNamepublic	
final	TokenNamefinal	
void	TokenNamevoid	
mK_COUNT	TokenNameIdentifier	 m K  COUNT
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
RecognitionException	TokenNameIdentifier	 Recognition Exception
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
int	TokenNameint	
_type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
K_COUNT	TokenNameIdentifier	 K  COUNT
;	TokenNameSEMICOLON	
int	TokenNameint	
_channel	TokenNameIdentifier	 channel
=	TokenNameEQUAL	
DEFAULT_TOKEN_CHANNEL	TokenNameIdentifier	 DEFAULT  TOKEN  CHANNEL
;	TokenNameSEMICOLON	
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:863:8: ( C O U N T ) 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:863:8: ( C O U N T ) 
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:863:16: C O U N T 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:863:16: C O U N T 
{	TokenNameLBRACE	
mC	TokenNameIdentifier	 m C
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mO	TokenNameIdentifier	 m O
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mU	TokenNameIdentifier	 m U
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mN	TokenNameIdentifier	 m N
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mT	TokenNameIdentifier	 m T
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
_type	TokenNameIdentifier	 type
;	TokenNameSEMICOLON	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
channel	TokenNameIdentifier	 channel
=	TokenNameEQUAL	
_channel	TokenNameIdentifier	 channel
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
finally	TokenNamefinally	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// $ANTLR end "K_COUNT" 	TokenNameCOMMENT_LINE	$ANTLR end "K_COUNT" 
// $ANTLR start "K_SET" 	TokenNameCOMMENT_LINE	$ANTLR start "K_SET" 
public	TokenNamepublic	
final	TokenNamefinal	
void	TokenNamevoid	
mK_SET	TokenNameIdentifier	 m K  SET
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
RecognitionException	TokenNameIdentifier	 Recognition Exception
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
int	TokenNameint	
_type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
K_SET	TokenNameIdentifier	 K  SET
;	TokenNameSEMICOLON	
int	TokenNameint	
_channel	TokenNameIdentifier	 channel
=	TokenNameEQUAL	
DEFAULT_TOKEN_CHANNEL	TokenNameIdentifier	 DEFAULT  TOKEN  CHANNEL
;	TokenNameSEMICOLON	
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:864:6: ( S E T ) 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:864:6: ( S E T ) 
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:864:16: S E T 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:864:16: S E T 
{	TokenNameLBRACE	
mS	TokenNameIdentifier	 m S
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mE	TokenNameIdentifier	 m E
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mT	TokenNameIdentifier	 m T
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
_type	TokenNameIdentifier	 type
;	TokenNameSEMICOLON	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
channel	TokenNameIdentifier	 channel
=	TokenNameEQUAL	
_channel	TokenNameIdentifier	 channel
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
finally	TokenNamefinally	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// $ANTLR end "K_SET" 	TokenNameCOMMENT_LINE	$ANTLR end "K_SET" 
// $ANTLR start "K_BEGIN" 	TokenNameCOMMENT_LINE	$ANTLR start "K_BEGIN" 
public	TokenNamepublic	
final	TokenNamefinal	
void	TokenNamevoid	
mK_BEGIN	TokenNameIdentifier	 m K  BEGIN
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
RecognitionException	TokenNameIdentifier	 Recognition Exception
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
int	TokenNameint	
_type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
K_BEGIN	TokenNameIdentifier	 K  BEGIN
;	TokenNameSEMICOLON	
int	TokenNameint	
_channel	TokenNameIdentifier	 channel
=	TokenNameEQUAL	
DEFAULT_TOKEN_CHANNEL	TokenNameIdentifier	 DEFAULT  TOKEN  CHANNEL
;	TokenNameSEMICOLON	
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:865:8: ( B E G I N ) 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:865:8: ( B E G I N ) 
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:865:16: B E G I N 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:865:16: B E G I N 
{	TokenNameLBRACE	
mB	TokenNameIdentifier	 m B
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mE	TokenNameIdentifier	 m E
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mG	TokenNameIdentifier	 m G
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mI	TokenNameIdentifier	 m I
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mN	TokenNameIdentifier	 m N
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
_type	TokenNameIdentifier	 type
;	TokenNameSEMICOLON	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
channel	TokenNameIdentifier	 channel
=	TokenNameEQUAL	
_channel	TokenNameIdentifier	 channel
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
finally	TokenNamefinally	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// $ANTLR end "K_BEGIN" 	TokenNameCOMMENT_LINE	$ANTLR end "K_BEGIN" 
// $ANTLR start "K_UNLOGGED" 	TokenNameCOMMENT_LINE	$ANTLR start "K_UNLOGGED" 
public	TokenNamepublic	
final	TokenNamefinal	
void	TokenNamevoid	
mK_UNLOGGED	TokenNameIdentifier	 m K  UNLOGGED
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
RecognitionException	TokenNameIdentifier	 Recognition Exception
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
int	TokenNameint	
_type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
K_UNLOGGED	TokenNameIdentifier	 K  UNLOGGED
;	TokenNameSEMICOLON	
int	TokenNameint	
_channel	TokenNameIdentifier	 channel
=	TokenNameEQUAL	
DEFAULT_TOKEN_CHANNEL	TokenNameIdentifier	 DEFAULT  TOKEN  CHANNEL
;	TokenNameSEMICOLON	
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:866:11: ( U N L O G G E D ) 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:866:11: ( U N L O G G E D ) 
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:866:16: U N L O G G E D 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:866:16: U N L O G G E D 
{	TokenNameLBRACE	
mU	TokenNameIdentifier	 m U
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mN	TokenNameIdentifier	 m N
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mL	TokenNameIdentifier	 m L
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mO	TokenNameIdentifier	 m O
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mG	TokenNameIdentifier	 m G
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mG	TokenNameIdentifier	 m G
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mE	TokenNameIdentifier	 m E
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mD	TokenNameIdentifier	 m D
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
_type	TokenNameIdentifier	 type
;	TokenNameSEMICOLON	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
channel	TokenNameIdentifier	 channel
=	TokenNameEQUAL	
_channel	TokenNameIdentifier	 channel
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
finally	TokenNamefinally	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// $ANTLR end "K_UNLOGGED" 	TokenNameCOMMENT_LINE	$ANTLR end "K_UNLOGGED" 
// $ANTLR start "K_BATCH" 	TokenNameCOMMENT_LINE	$ANTLR start "K_BATCH" 
public	TokenNamepublic	
final	TokenNamefinal	
void	TokenNamevoid	
mK_BATCH	TokenNameIdentifier	 m K  BATCH
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
RecognitionException	TokenNameIdentifier	 Recognition Exception
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
int	TokenNameint	
_type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
K_BATCH	TokenNameIdentifier	 K  BATCH
;	TokenNameSEMICOLON	
int	TokenNameint	
_channel	TokenNameIdentifier	 channel
=	TokenNameEQUAL	
DEFAULT_TOKEN_CHANNEL	TokenNameIdentifier	 DEFAULT  TOKEN  CHANNEL
;	TokenNameSEMICOLON	
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:867:8: ( B A T C H ) 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:867:8: ( B A T C H ) 
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:867:16: B A T C H 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:867:16: B A T C H 
{	TokenNameLBRACE	
mB	TokenNameIdentifier	 m B
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mA	TokenNameIdentifier	 m A
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mT	TokenNameIdentifier	 m T
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mC	TokenNameIdentifier	 m C
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mH	TokenNameIdentifier	 m H
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
_type	TokenNameIdentifier	 type
;	TokenNameSEMICOLON	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
channel	TokenNameIdentifier	 channel
=	TokenNameEQUAL	
_channel	TokenNameIdentifier	 channel
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
finally	TokenNamefinally	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// $ANTLR end "K_BATCH" 	TokenNameCOMMENT_LINE	$ANTLR end "K_BATCH" 
// $ANTLR start "K_APPLY" 	TokenNameCOMMENT_LINE	$ANTLR start "K_APPLY" 
public	TokenNamepublic	
final	TokenNamefinal	
void	TokenNamevoid	
mK_APPLY	TokenNameIdentifier	 m K  APPLY
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
RecognitionException	TokenNameIdentifier	 Recognition Exception
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
int	TokenNameint	
_type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
K_APPLY	TokenNameIdentifier	 K  APPLY
;	TokenNameSEMICOLON	
int	TokenNameint	
_channel	TokenNameIdentifier	 channel
=	TokenNameEQUAL	
DEFAULT_TOKEN_CHANNEL	TokenNameIdentifier	 DEFAULT  TOKEN  CHANNEL
;	TokenNameSEMICOLON	
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:868:8: ( A P P L Y ) 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:868:8: ( A P P L Y ) 
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:868:16: A P P L Y 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:868:16: A P P L Y 
{	TokenNameLBRACE	
mA	TokenNameIdentifier	 m A
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mP	TokenNameIdentifier	 m P
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mP	TokenNameIdentifier	 m P
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mL	TokenNameIdentifier	 m L
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mY	TokenNameIdentifier	 m Y
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
_type	TokenNameIdentifier	 type
;	TokenNameSEMICOLON	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
channel	TokenNameIdentifier	 channel
=	TokenNameEQUAL	
_channel	TokenNameIdentifier	 channel
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
finally	TokenNamefinally	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// $ANTLR end "K_APPLY" 	TokenNameCOMMENT_LINE	$ANTLR end "K_APPLY" 
// $ANTLR start "K_TRUNCATE" 	TokenNameCOMMENT_LINE	$ANTLR start "K_TRUNCATE" 
public	TokenNamepublic	
final	TokenNamefinal	
void	TokenNamevoid	
mK_TRUNCATE	TokenNameIdentifier	 m K  TRUNCATE
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
RecognitionException	TokenNameIdentifier	 Recognition Exception
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
int	TokenNameint	
_type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
K_TRUNCATE	TokenNameIdentifier	 K  TRUNCATE
;	TokenNameSEMICOLON	
int	TokenNameint	
_channel	TokenNameIdentifier	 channel
=	TokenNameEQUAL	
DEFAULT_TOKEN_CHANNEL	TokenNameIdentifier	 DEFAULT  TOKEN  CHANNEL
;	TokenNameSEMICOLON	
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:869:11: ( T R U N C A T E ) 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:869:11: ( T R U N C A T E ) 
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:869:16: T R U N C A T E 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:869:16: T R U N C A T E 
{	TokenNameLBRACE	
mT	TokenNameIdentifier	 m T
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mR	TokenNameIdentifier	 m R
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mU	TokenNameIdentifier	 m U
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mN	TokenNameIdentifier	 m N
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mC	TokenNameIdentifier	 m C
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mA	TokenNameIdentifier	 m A
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mT	TokenNameIdentifier	 m T
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mE	TokenNameIdentifier	 m E
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
_type	TokenNameIdentifier	 type
;	TokenNameSEMICOLON	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
channel	TokenNameIdentifier	 channel
=	TokenNameEQUAL	
_channel	TokenNameIdentifier	 channel
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
finally	TokenNamefinally	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// $ANTLR end "K_TRUNCATE" 	TokenNameCOMMENT_LINE	$ANTLR end "K_TRUNCATE" 
// $ANTLR start "K_DELETE" 	TokenNameCOMMENT_LINE	$ANTLR start "K_DELETE" 
public	TokenNamepublic	
final	TokenNamefinal	
void	TokenNamevoid	
mK_DELETE	TokenNameIdentifier	 m K  DELETE
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
RecognitionException	TokenNameIdentifier	 Recognition Exception
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
int	TokenNameint	
_type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
K_DELETE	TokenNameIdentifier	 K  DELETE
;	TokenNameSEMICOLON	
int	TokenNameint	
_channel	TokenNameIdentifier	 channel
=	TokenNameEQUAL	
DEFAULT_TOKEN_CHANNEL	TokenNameIdentifier	 DEFAULT  TOKEN  CHANNEL
;	TokenNameSEMICOLON	
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:870:9: ( D E L E T E ) 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:870:9: ( D E L E T E ) 
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:870:16: D E L E T E 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:870:16: D E L E T E 
{	TokenNameLBRACE	
mD	TokenNameIdentifier	 m D
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mE	TokenNameIdentifier	 m E
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mL	TokenNameIdentifier	 m L
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mE	TokenNameIdentifier	 m E
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mT	TokenNameIdentifier	 m T
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mE	TokenNameIdentifier	 m E
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
_type	TokenNameIdentifier	 type
;	TokenNameSEMICOLON	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
channel	TokenNameIdentifier	 channel
=	TokenNameEQUAL	
_channel	TokenNameIdentifier	 channel
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
finally	TokenNamefinally	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// $ANTLR end "K_DELETE" 	TokenNameCOMMENT_LINE	$ANTLR end "K_DELETE" 
// $ANTLR start "K_IN" 	TokenNameCOMMENT_LINE	$ANTLR start "K_IN" 
public	TokenNamepublic	
final	TokenNamefinal	
void	TokenNamevoid	
mK_IN	TokenNameIdentifier	 m K  IN
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
RecognitionException	TokenNameIdentifier	 Recognition Exception
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
int	TokenNameint	
_type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
K_IN	TokenNameIdentifier	 K  IN
;	TokenNameSEMICOLON	
int	TokenNameint	
_channel	TokenNameIdentifier	 channel
=	TokenNameEQUAL	
DEFAULT_TOKEN_CHANNEL	TokenNameIdentifier	 DEFAULT  TOKEN  CHANNEL
;	TokenNameSEMICOLON	
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:871:5: ( I N ) 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:871:5: ( I N ) 
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:871:16: I N 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:871:16: I N 
{	TokenNameLBRACE	
mI	TokenNameIdentifier	 m I
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mN	TokenNameIdentifier	 m N
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
_type	TokenNameIdentifier	 type
;	TokenNameSEMICOLON	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
channel	TokenNameIdentifier	 channel
=	TokenNameEQUAL	
_channel	TokenNameIdentifier	 channel
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
finally	TokenNamefinally	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// $ANTLR end "K_IN" 	TokenNameCOMMENT_LINE	$ANTLR end "K_IN" 
// $ANTLR start "K_CREATE" 	TokenNameCOMMENT_LINE	$ANTLR start "K_CREATE" 
public	TokenNamepublic	
final	TokenNamefinal	
void	TokenNamevoid	
mK_CREATE	TokenNameIdentifier	 m K  CREATE
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
RecognitionException	TokenNameIdentifier	 Recognition Exception
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
int	TokenNameint	
_type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
K_CREATE	TokenNameIdentifier	 K  CREATE
;	TokenNameSEMICOLON	
int	TokenNameint	
_channel	TokenNameIdentifier	 channel
=	TokenNameEQUAL	
DEFAULT_TOKEN_CHANNEL	TokenNameIdentifier	 DEFAULT  TOKEN  CHANNEL
;	TokenNameSEMICOLON	
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:872:9: ( C R E A T E ) 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:872:9: ( C R E A T E ) 
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:872:16: C R E A T E 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:872:16: C R E A T E 
{	TokenNameLBRACE	
mC	TokenNameIdentifier	 m C
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mR	TokenNameIdentifier	 m R
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mE	TokenNameIdentifier	 m E
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mA	TokenNameIdentifier	 m A
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mT	TokenNameIdentifier	 m T
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mE	TokenNameIdentifier	 m E
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
_type	TokenNameIdentifier	 type
;	TokenNameSEMICOLON	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
channel	TokenNameIdentifier	 channel
=	TokenNameEQUAL	
_channel	TokenNameIdentifier	 channel
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
finally	TokenNamefinally	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// $ANTLR end "K_CREATE" 	TokenNameCOMMENT_LINE	$ANTLR end "K_CREATE" 
// $ANTLR start "K_KEYSPACE" 	TokenNameCOMMENT_LINE	$ANTLR start "K_KEYSPACE" 
public	TokenNamepublic	
final	TokenNamefinal	
void	TokenNamevoid	
mK_KEYSPACE	TokenNameIdentifier	 m K  KEYSPACE
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
RecognitionException	TokenNameIdentifier	 Recognition Exception
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
int	TokenNameint	
_type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
K_KEYSPACE	TokenNameIdentifier	 K  KEYSPACE
;	TokenNameSEMICOLON	
int	TokenNameint	
_channel	TokenNameIdentifier	 channel
=	TokenNameEQUAL	
DEFAULT_TOKEN_CHANNEL	TokenNameIdentifier	 DEFAULT  TOKEN  CHANNEL
;	TokenNameSEMICOLON	
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:873:11: ( ( K E Y S P A C E | S C H E M A ) ) 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:873:11: ( ( K E Y S P A C E | S C H E M A ) ) 
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:873:16: ( K E Y S P A C E | S C H E M A ) 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:873:16: ( K E Y S P A C E | S C H E M A ) 
{	TokenNameLBRACE	
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:873:16: ( K E Y S P A C E | S C H E M A ) 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:873:16: ( K E Y S P A C E | S C H E M A ) 
int	TokenNameint	
alt1	TokenNameIdentifier	 alt1
=	TokenNameEQUAL	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
LA1_0	TokenNameIdentifier	 L A1 0
=	TokenNameEQUAL	
input	TokenNameIdentifier	 input
.	TokenNameDOT	
LA	TokenNameIdentifier	 LA
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
LA1_0	TokenNameIdentifier	 L A1 0
==	TokenNameEQUAL_EQUAL	
'K'	TokenNameCharacterLiteral	
||	TokenNameOR_OR	
LA1_0	TokenNameIdentifier	 L A1 0
==	TokenNameEQUAL_EQUAL	
'k'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
alt1	TokenNameIdentifier	 alt1
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
LA1_0	TokenNameIdentifier	 L A1 0
==	TokenNameEQUAL_EQUAL	
'S'	TokenNameCharacterLiteral	
||	TokenNameOR_OR	
LA1_0	TokenNameIdentifier	 L A1 0
==	TokenNameEQUAL_EQUAL	
's'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
alt1	TokenNameIdentifier	 alt1
=	TokenNameEQUAL	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
NoViableAltException	TokenNameIdentifier	 No Viable Alt Exception
nvae	TokenNameIdentifier	 nvae
=	TokenNameEQUAL	
new	TokenNamenew	
NoViableAltException	TokenNameIdentifier	 No Viable Alt Exception
(	TokenNameLPAREN	
""	TokenNameStringLiteral	 
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
input	TokenNameIdentifier	 input
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
throw	TokenNamethrow	
nvae	TokenNameIdentifier	 nvae
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
switch	TokenNameswitch	
(	TokenNameLPAREN	
alt1	TokenNameIdentifier	 alt1
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
1	TokenNameIntegerLiteral	
:	TokenNameCOLON	
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:873:18: K E Y S P A C E 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:873:18: K E Y S P A C E 
{	TokenNameLBRACE	
mK	TokenNameIdentifier	 m K
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mE	TokenNameIdentifier	 m E
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mY	TokenNameIdentifier	 m Y
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mS	TokenNameIdentifier	 m S
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mP	TokenNameIdentifier	 m P
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mA	TokenNameIdentifier	 m A
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mC	TokenNameIdentifier	 m C
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mE	TokenNameIdentifier	 m E
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
2	TokenNameIntegerLiteral	
:	TokenNameCOLON	
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:874:20: S C H E M A 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:874:20: S C H E M A 
{	TokenNameLBRACE	
mS	TokenNameIdentifier	 m S
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mC	TokenNameIdentifier	 m C
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mH	TokenNameIdentifier	 m H
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mE	TokenNameIdentifier	 m E
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mM	TokenNameIdentifier	 m M
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mA	TokenNameIdentifier	 m A
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
_type	TokenNameIdentifier	 type
;	TokenNameSEMICOLON	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
channel	TokenNameIdentifier	 channel
=	TokenNameEQUAL	
_channel	TokenNameIdentifier	 channel
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
finally	TokenNamefinally	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// $ANTLR end "K_KEYSPACE" 	TokenNameCOMMENT_LINE	$ANTLR end "K_KEYSPACE" 
// $ANTLR start "K_KEYSPACES" 	TokenNameCOMMENT_LINE	$ANTLR start "K_KEYSPACES" 
public	TokenNamepublic	
final	TokenNamefinal	
void	TokenNamevoid	
mK_KEYSPACES	TokenNameIdentifier	 m K  KEYSPACES
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
RecognitionException	TokenNameIdentifier	 Recognition Exception
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
int	TokenNameint	
_type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
K_KEYSPACES	TokenNameIdentifier	 K  KEYSPACES
;	TokenNameSEMICOLON	
int	TokenNameint	
_channel	TokenNameIdentifier	 channel
=	TokenNameEQUAL	
DEFAULT_TOKEN_CHANNEL	TokenNameIdentifier	 DEFAULT  TOKEN  CHANNEL
;	TokenNameSEMICOLON	
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:875:12: ( K E Y S P A C E S ) 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:875:12: ( K E Y S P A C E S ) 
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:875:16: K E Y S P A C E S 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:875:16: K E Y S P A C E S 
{	TokenNameLBRACE	
mK	TokenNameIdentifier	 m K
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mE	TokenNameIdentifier	 m E
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mY	TokenNameIdentifier	 m Y
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mS	TokenNameIdentifier	 m S
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mP	TokenNameIdentifier	 m P
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mA	TokenNameIdentifier	 m A
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mC	TokenNameIdentifier	 m C
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mE	TokenNameIdentifier	 m E
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mS	TokenNameIdentifier	 m S
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
_type	TokenNameIdentifier	 type
;	TokenNameSEMICOLON	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
channel	TokenNameIdentifier	 channel
=	TokenNameEQUAL	
_channel	TokenNameIdentifier	 channel
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
finally	TokenNamefinally	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// $ANTLR end "K_KEYSPACES" 	TokenNameCOMMENT_LINE	$ANTLR end "K_KEYSPACES" 
// $ANTLR start "K_COLUMNFAMILY" 	TokenNameCOMMENT_LINE	$ANTLR start "K_COLUMNFAMILY" 
public	TokenNamepublic	
final	TokenNamefinal	
void	TokenNamevoid	
mK_COLUMNFAMILY	TokenNameIdentifier	 m K  COLUMNFAMILY
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
RecognitionException	TokenNameIdentifier	 Recognition Exception
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
int	TokenNameint	
_type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
K_COLUMNFAMILY	TokenNameIdentifier	 K  COLUMNFAMILY
;	TokenNameSEMICOLON	
int	TokenNameint	
_channel	TokenNameIdentifier	 channel
=	TokenNameEQUAL	
DEFAULT_TOKEN_CHANNEL	TokenNameIdentifier	 DEFAULT  TOKEN  CHANNEL
;	TokenNameSEMICOLON	
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:876:15: ( ( C O L U M N F A M I L Y | T A B L E ) ) 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:876:15: ( ( C O L U M N F A M I L Y | T A B L E ) ) 
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:876:16: ( C O L U M N F A M I L Y | T A B L E ) 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:876:16: ( C O L U M N F A M I L Y | T A B L E ) 
{	TokenNameLBRACE	
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:876:16: ( C O L U M N F A M I L Y | T A B L E ) 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:876:16: ( C O L U M N F A M I L Y | T A B L E ) 
int	TokenNameint	
alt2	TokenNameIdentifier	 alt2
=	TokenNameEQUAL	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
LA2_0	TokenNameIdentifier	 L A2 0
=	TokenNameEQUAL	
input	TokenNameIdentifier	 input
.	TokenNameDOT	
LA	TokenNameIdentifier	 LA
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
LA2_0	TokenNameIdentifier	 L A2 0
==	TokenNameEQUAL_EQUAL	
'C'	TokenNameCharacterLiteral	
||	TokenNameOR_OR	
LA2_0	TokenNameIdentifier	 L A2 0
==	TokenNameEQUAL_EQUAL	
'c'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
alt2	TokenNameIdentifier	 alt2
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
LA2_0	TokenNameIdentifier	 L A2 0
==	TokenNameEQUAL_EQUAL	
'T'	TokenNameCharacterLiteral	
||	TokenNameOR_OR	
LA2_0	TokenNameIdentifier	 L A2 0
==	TokenNameEQUAL_EQUAL	
't'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
alt2	TokenNameIdentifier	 alt2
=	TokenNameEQUAL	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
NoViableAltException	TokenNameIdentifier	 No Viable Alt Exception
nvae	TokenNameIdentifier	 nvae
=	TokenNameEQUAL	
new	TokenNamenew	
NoViableAltException	TokenNameIdentifier	 No Viable Alt Exception
(	TokenNameLPAREN	
""	TokenNameStringLiteral	 
,	TokenNameCOMMA	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
input	TokenNameIdentifier	 input
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
throw	TokenNamethrow	
nvae	TokenNameIdentifier	 nvae
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
switch	TokenNameswitch	
(	TokenNameLPAREN	
alt2	TokenNameIdentifier	 alt2
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
1	TokenNameIntegerLiteral	
:	TokenNameCOLON	
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:876:18: C O L U M N F A M I L Y 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:876:18: C O L U M N F A M I L Y 
{	TokenNameLBRACE	
mC	TokenNameIdentifier	 m C
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mO	TokenNameIdentifier	 m O
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mL	TokenNameIdentifier	 m L
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mU	TokenNameIdentifier	 m U
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mM	TokenNameIdentifier	 m M
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mN	TokenNameIdentifier	 m N
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mF	TokenNameIdentifier	 m F
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mA	TokenNameIdentifier	 m A
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mM	TokenNameIdentifier	 m M
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mI	TokenNameIdentifier	 m I
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mL	TokenNameIdentifier	 m L
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mY	TokenNameIdentifier	 m Y
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
2	TokenNameIntegerLiteral	
:	TokenNameCOLON	
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:877:20: T A B L E 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:877:20: T A B L E 
{	TokenNameLBRACE	
mT	TokenNameIdentifier	 m T
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mA	TokenNameIdentifier	 m A
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mB	TokenNameIdentifier	 m B
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mL	TokenNameIdentifier	 m L
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mE	TokenNameIdentifier	 m E
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
_type	TokenNameIdentifier	 type
;	TokenNameSEMICOLON	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
channel	TokenNameIdentifier	 channel
=	TokenNameEQUAL	
_channel	TokenNameIdentifier	 channel
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
finally	TokenNamefinally	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// $ANTLR end "K_COLUMNFAMILY" 	TokenNameCOMMENT_LINE	$ANTLR end "K_COLUMNFAMILY" 
// $ANTLR start "K_INDEX" 	TokenNameCOMMENT_LINE	$ANTLR start "K_INDEX" 
public	TokenNamepublic	
final	TokenNamefinal	
void	TokenNamevoid	
mK_INDEX	TokenNameIdentifier	 m K  INDEX
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
RecognitionException	TokenNameIdentifier	 Recognition Exception
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
int	TokenNameint	
_type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
K_INDEX	TokenNameIdentifier	 K  INDEX
;	TokenNameSEMICOLON	
int	TokenNameint	
_channel	TokenNameIdentifier	 channel
=	TokenNameEQUAL	
DEFAULT_TOKEN_CHANNEL	TokenNameIdentifier	 DEFAULT  TOKEN  CHANNEL
;	TokenNameSEMICOLON	
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:878:8: ( I N D E X ) 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:878:8: ( I N D E X ) 
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:878:16: I N D E X 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:878:16: I N D E X 
{	TokenNameLBRACE	
mI	TokenNameIdentifier	 m I
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mN	TokenNameIdentifier	 m N
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mD	TokenNameIdentifier	 m D
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mE	TokenNameIdentifier	 m E
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mX	TokenNameIdentifier	 m X
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
_type	TokenNameIdentifier	 type
;	TokenNameSEMICOLON	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
channel	TokenNameIdentifier	 channel
=	TokenNameEQUAL	
_channel	TokenNameIdentifier	 channel
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
finally	TokenNamefinally	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// $ANTLR end "K_INDEX" 	TokenNameCOMMENT_LINE	$ANTLR end "K_INDEX" 
// $ANTLR start "K_ON" 	TokenNameCOMMENT_LINE	$ANTLR start "K_ON" 
public	TokenNamepublic	
final	TokenNamefinal	
void	TokenNamevoid	
mK_ON	TokenNameIdentifier	 m K  ON
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
RecognitionException	TokenNameIdentifier	 Recognition Exception
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
int	TokenNameint	
_type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
K_ON	TokenNameIdentifier	 K  ON
;	TokenNameSEMICOLON	
int	TokenNameint	
_channel	TokenNameIdentifier	 channel
=	TokenNameEQUAL	
DEFAULT_TOKEN_CHANNEL	TokenNameIdentifier	 DEFAULT  TOKEN  CHANNEL
;	TokenNameSEMICOLON	
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:879:5: ( O N ) 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:879:5: ( O N ) 
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:879:16: O N 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:879:16: O N 
{	TokenNameLBRACE	
mO	TokenNameIdentifier	 m O
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mN	TokenNameIdentifier	 m N
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
_type	TokenNameIdentifier	 type
;	TokenNameSEMICOLON	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
channel	TokenNameIdentifier	 channel
=	TokenNameEQUAL	
_channel	TokenNameIdentifier	 channel
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
finally	TokenNamefinally	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// $ANTLR end "K_ON" 	TokenNameCOMMENT_LINE	$ANTLR end "K_ON" 
// $ANTLR start "K_TO" 	TokenNameCOMMENT_LINE	$ANTLR start "K_TO" 
public	TokenNamepublic	
final	TokenNamefinal	
void	TokenNamevoid	
mK_TO	TokenNameIdentifier	 m K  TO
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
RecognitionException	TokenNameIdentifier	 Recognition Exception
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
int	TokenNameint	
_type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
K_TO	TokenNameIdentifier	 K  TO
;	TokenNameSEMICOLON	
int	TokenNameint	
_channel	TokenNameIdentifier	 channel
=	TokenNameEQUAL	
DEFAULT_TOKEN_CHANNEL	TokenNameIdentifier	 DEFAULT  TOKEN  CHANNEL
;	TokenNameSEMICOLON	
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:880:5: ( T O ) 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:880:5: ( T O ) 
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:880:16: T O 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:880:16: T O 
{	TokenNameLBRACE	
mT	TokenNameIdentifier	 m T
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mO	TokenNameIdentifier	 m O
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
_type	TokenNameIdentifier	 type
;	TokenNameSEMICOLON	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
channel	TokenNameIdentifier	 channel
=	TokenNameEQUAL	
_channel	TokenNameIdentifier	 channel
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
finally	TokenNamefinally	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// $ANTLR end "K_TO" 	TokenNameCOMMENT_LINE	$ANTLR end "K_TO" 
// $ANTLR start "K_DROP" 	TokenNameCOMMENT_LINE	$ANTLR start "K_DROP" 
public	TokenNamepublic	
final	TokenNamefinal	
void	TokenNamevoid	
mK_DROP	TokenNameIdentifier	 m K  DROP
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
RecognitionException	TokenNameIdentifier	 Recognition Exception
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
int	TokenNameint	
_type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
K_DROP	TokenNameIdentifier	 K  DROP
;	TokenNameSEMICOLON	
int	TokenNameint	
_channel	TokenNameIdentifier	 channel
=	TokenNameEQUAL	
DEFAULT_TOKEN_CHANNEL	TokenNameIdentifier	 DEFAULT  TOKEN  CHANNEL
;	TokenNameSEMICOLON	
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:881:7: ( D R O P ) 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:881:7: ( D R O P ) 
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:881:16: D R O P 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:881:16: D R O P 
{	TokenNameLBRACE	
mD	TokenNameIdentifier	 m D
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mR	TokenNameIdentifier	 m R
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mO	TokenNameIdentifier	 m O
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mP	TokenNameIdentifier	 m P
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
_type	TokenNameIdentifier	 type
;	TokenNameSEMICOLON	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
channel	TokenNameIdentifier	 channel
=	TokenNameEQUAL	
_channel	TokenNameIdentifier	 channel
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
finally	TokenNamefinally	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// $ANTLR end "K_DROP" 	TokenNameCOMMENT_LINE	$ANTLR end "K_DROP" 
// $ANTLR start "K_PRIMARY" 	TokenNameCOMMENT_LINE	$ANTLR start "K_PRIMARY" 
public	TokenNamepublic	
final	TokenNamefinal	
void	TokenNamevoid	
mK_PRIMARY	TokenNameIdentifier	 m K  PRIMARY
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
RecognitionException	TokenNameIdentifier	 Recognition Exception
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
int	TokenNameint	
_type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
K_PRIMARY	TokenNameIdentifier	 K  PRIMARY
;	TokenNameSEMICOLON	
int	TokenNameint	
_channel	TokenNameIdentifier	 channel
=	TokenNameEQUAL	
DEFAULT_TOKEN_CHANNEL	TokenNameIdentifier	 DEFAULT  TOKEN  CHANNEL
;	TokenNameSEMICOLON	
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:882:10: ( P R I M A R Y ) 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:882:10: ( P R I M A R Y ) 
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:882:16: P R I M A R Y 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:882:16: P R I M A R Y 
{	TokenNameLBRACE	
mP	TokenNameIdentifier	 m P
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mR	TokenNameIdentifier	 m R
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mI	TokenNameIdentifier	 m I
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mM	TokenNameIdentifier	 m M
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mA	TokenNameIdentifier	 m A
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mR	TokenNameIdentifier	 m R
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mY	TokenNameIdentifier	 m Y
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
_type	TokenNameIdentifier	 type
;	TokenNameSEMICOLON	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
channel	TokenNameIdentifier	 channel
=	TokenNameEQUAL	
_channel	TokenNameIdentifier	 channel
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
finally	TokenNamefinally	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// $ANTLR end "K_PRIMARY" 	TokenNameCOMMENT_LINE	$ANTLR end "K_PRIMARY" 
// $ANTLR start "K_INTO" 	TokenNameCOMMENT_LINE	$ANTLR start "K_INTO" 
public	TokenNamepublic	
final	TokenNamefinal	
void	TokenNamevoid	
mK_INTO	TokenNameIdentifier	 m K  INTO
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
RecognitionException	TokenNameIdentifier	 Recognition Exception
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
int	TokenNameint	
_type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
K_INTO	TokenNameIdentifier	 K  INTO
;	TokenNameSEMICOLON	
int	TokenNameint	
_channel	TokenNameIdentifier	 channel
=	TokenNameEQUAL	
DEFAULT_TOKEN_CHANNEL	TokenNameIdentifier	 DEFAULT  TOKEN  CHANNEL
;	TokenNameSEMICOLON	
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:883:7: ( I N T O ) 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:883:7: ( I N T O ) 
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:883:16: I N T O 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:883:16: I N T O 
{	TokenNameLBRACE	
mI	TokenNameIdentifier	 m I
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mN	TokenNameIdentifier	 m N
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mT	TokenNameIdentifier	 m T
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mO	TokenNameIdentifier	 m O
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
_type	TokenNameIdentifier	 type
;	TokenNameSEMICOLON	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
channel	TokenNameIdentifier	 channel
=	TokenNameEQUAL	
_channel	TokenNameIdentifier	 channel
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
finally	TokenNamefinally	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// $ANTLR end "K_INTO" 	TokenNameCOMMENT_LINE	$ANTLR end "K_INTO" 
// $ANTLR start "K_VALUES" 	TokenNameCOMMENT_LINE	$ANTLR start "K_VALUES" 
public	TokenNamepublic	
final	TokenNamefinal	
void	TokenNamevoid	
mK_VALUES	TokenNameIdentifier	 m K  VALUES
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
RecognitionException	TokenNameIdentifier	 Recognition Exception
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
int	TokenNameint	
_type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
K_VALUES	TokenNameIdentifier	 K  VALUES
;	TokenNameSEMICOLON	
int	TokenNameint	
_channel	TokenNameIdentifier	 channel
=	TokenNameEQUAL	
DEFAULT_TOKEN_CHANNEL	TokenNameIdentifier	 DEFAULT  TOKEN  CHANNEL
;	TokenNameSEMICOLON	
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:884:9: ( V A L U E S ) 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:884:9: ( V A L U E S ) 
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:884:16: V A L U E S 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:884:16: V A L U E S 
{	TokenNameLBRACE	
mV	TokenNameIdentifier	 m V
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mA	TokenNameIdentifier	 m A
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mL	TokenNameIdentifier	 m L
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mU	TokenNameIdentifier	 m U
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mE	TokenNameIdentifier	 m E
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mS	TokenNameIdentifier	 m S
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
_type	TokenNameIdentifier	 type
;	TokenNameSEMICOLON	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
channel	TokenNameIdentifier	 channel
=	TokenNameEQUAL	
_channel	TokenNameIdentifier	 channel
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
finally	TokenNamefinally	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// $ANTLR end "K_VALUES" 	TokenNameCOMMENT_LINE	$ANTLR end "K_VALUES" 
// $ANTLR start "K_TIMESTAMP" 	TokenNameCOMMENT_LINE	$ANTLR start "K_TIMESTAMP" 
public	TokenNamepublic	
final	TokenNamefinal	
void	TokenNamevoid	
mK_TIMESTAMP	TokenNameIdentifier	 m K  TIMESTAMP
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
RecognitionException	TokenNameIdentifier	 Recognition Exception
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
int	TokenNameint	
_type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
K_TIMESTAMP	TokenNameIdentifier	 K  TIMESTAMP
;	TokenNameSEMICOLON	
int	TokenNameint	
_channel	TokenNameIdentifier	 channel
=	TokenNameEQUAL	
DEFAULT_TOKEN_CHANNEL	TokenNameIdentifier	 DEFAULT  TOKEN  CHANNEL
;	TokenNameSEMICOLON	
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:885:12: ( T I M E S T A M P ) 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:885:12: ( T I M E S T A M P ) 
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:885:16: T I M E S T A M P 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:885:16: T I M E S T A M P 
{	TokenNameLBRACE	
mT	TokenNameIdentifier	 m T
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mI	TokenNameIdentifier	 m I
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mM	TokenNameIdentifier	 m M
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mE	TokenNameIdentifier	 m E
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mS	TokenNameIdentifier	 m S
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mT	TokenNameIdentifier	 m T
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mA	TokenNameIdentifier	 m A
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mM	TokenNameIdentifier	 m M
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mP	TokenNameIdentifier	 m P
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
_type	TokenNameIdentifier	 type
;	TokenNameSEMICOLON	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
channel	TokenNameIdentifier	 channel
=	TokenNameEQUAL	
_channel	TokenNameIdentifier	 channel
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
finally	TokenNamefinally	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// $ANTLR end "K_TIMESTAMP" 	TokenNameCOMMENT_LINE	$ANTLR end "K_TIMESTAMP" 
// $ANTLR start "K_TTL" 	TokenNameCOMMENT_LINE	$ANTLR start "K_TTL" 
public	TokenNamepublic	
final	TokenNamefinal	
void	TokenNamevoid	
mK_TTL	TokenNameIdentifier	 m K  TTL
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
RecognitionException	TokenNameIdentifier	 Recognition Exception
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
int	TokenNameint	
_type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
K_TTL	TokenNameIdentifier	 K  TTL
;	TokenNameSEMICOLON	
int	TokenNameint	
_channel	TokenNameIdentifier	 channel
=	TokenNameEQUAL	
DEFAULT_TOKEN_CHANNEL	TokenNameIdentifier	 DEFAULT  TOKEN  CHANNEL
;	TokenNameSEMICOLON	
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:886:6: ( T T L ) 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:886:6: ( T T L ) 
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:886:16: T T L 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:886:16: T T L 
{	TokenNameLBRACE	
mT	TokenNameIdentifier	 m T
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mT	TokenNameIdentifier	 m T
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mL	TokenNameIdentifier	 m L
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
_type	TokenNameIdentifier	 type
;	TokenNameSEMICOLON	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
channel	TokenNameIdentifier	 channel
=	TokenNameEQUAL	
_channel	TokenNameIdentifier	 channel
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
finally	TokenNamefinally	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// $ANTLR end "K_TTL" 	TokenNameCOMMENT_LINE	$ANTLR end "K_TTL" 
// $ANTLR start "K_ALTER" 	TokenNameCOMMENT_LINE	$ANTLR start "K_ALTER" 
public	TokenNamepublic	
final	TokenNamefinal	
void	TokenNamevoid	
mK_ALTER	TokenNameIdentifier	 m K  ALTER
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
RecognitionException	TokenNameIdentifier	 Recognition Exception
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
int	TokenNameint	
_type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
K_ALTER	TokenNameIdentifier	 K  ALTER
;	TokenNameSEMICOLON	
int	TokenNameint	
_channel	TokenNameIdentifier	 channel
=	TokenNameEQUAL	
DEFAULT_TOKEN_CHANNEL	TokenNameIdentifier	 DEFAULT  TOKEN  CHANNEL
;	TokenNameSEMICOLON	
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:887:8: ( A L T E R ) 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:887:8: ( A L T E R ) 
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:887:16: A L T E R 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:887:16: A L T E R 
{	TokenNameLBRACE	
mA	TokenNameIdentifier	 m A
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mL	TokenNameIdentifier	 m L
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mT	TokenNameIdentifier	 m T
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mE	TokenNameIdentifier	 m E
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mR	TokenNameIdentifier	 m R
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
_type	TokenNameIdentifier	 type
;	TokenNameSEMICOLON	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
channel	TokenNameIdentifier	 channel
=	TokenNameEQUAL	
_channel	TokenNameIdentifier	 channel
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
finally	TokenNamefinally	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// $ANTLR end "K_ALTER" 	TokenNameCOMMENT_LINE	$ANTLR end "K_ALTER" 
// $ANTLR start "K_RENAME" 	TokenNameCOMMENT_LINE	$ANTLR start "K_RENAME" 
public	TokenNamepublic	
final	TokenNamefinal	
void	TokenNamevoid	
mK_RENAME	TokenNameIdentifier	 m K  RENAME
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
RecognitionException	TokenNameIdentifier	 Recognition Exception
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
int	TokenNameint	
_type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
K_RENAME	TokenNameIdentifier	 K  RENAME
;	TokenNameSEMICOLON	
int	TokenNameint	
_channel	TokenNameIdentifier	 channel
=	TokenNameEQUAL	
DEFAULT_TOKEN_CHANNEL	TokenNameIdentifier	 DEFAULT  TOKEN  CHANNEL
;	TokenNameSEMICOLON	
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:888:9: ( R E N A M E ) 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:888:9: ( R E N A M E ) 
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:888:16: R E N A M E 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:888:16: R E N A M E 
{	TokenNameLBRACE	
mR	TokenNameIdentifier	 m R
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mE	TokenNameIdentifier	 m E
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mN	TokenNameIdentifier	 m N
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mA	TokenNameIdentifier	 m A
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mM	TokenNameIdentifier	 m M
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mE	TokenNameIdentifier	 m E
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
_type	TokenNameIdentifier	 type
;	TokenNameSEMICOLON	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
channel	TokenNameIdentifier	 channel
=	TokenNameEQUAL	
_channel	TokenNameIdentifier	 channel
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
finally	TokenNamefinally	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// $ANTLR end "K_RENAME" 	TokenNameCOMMENT_LINE	$ANTLR end "K_RENAME" 
// $ANTLR start "K_ADD" 	TokenNameCOMMENT_LINE	$ANTLR start "K_ADD" 
public	TokenNamepublic	
final	TokenNamefinal	
void	TokenNamevoid	
mK_ADD	TokenNameIdentifier	 m K  ADD
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
RecognitionException	TokenNameIdentifier	 Recognition Exception
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
int	TokenNameint	
_type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
K_ADD	TokenNameIdentifier	 K  ADD
;	TokenNameSEMICOLON	
int	TokenNameint	
_channel	TokenNameIdentifier	 channel
=	TokenNameEQUAL	
DEFAULT_TOKEN_CHANNEL	TokenNameIdentifier	 DEFAULT  TOKEN  CHANNEL
;	TokenNameSEMICOLON	
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:889:6: ( A D D ) 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:889:6: ( A D D ) 
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:889:16: A D D 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:889:16: A D D 
{	TokenNameLBRACE	
mA	TokenNameIdentifier	 m A
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mD	TokenNameIdentifier	 m D
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mD	TokenNameIdentifier	 m D
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
_type	TokenNameIdentifier	 type
;	TokenNameSEMICOLON	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
channel	TokenNameIdentifier	 channel
=	TokenNameEQUAL	
_channel	TokenNameIdentifier	 channel
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
finally	TokenNamefinally	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// $ANTLR end "K_ADD" 	TokenNameCOMMENT_LINE	$ANTLR end "K_ADD" 
// $ANTLR start "K_TYPE" 	TokenNameCOMMENT_LINE	$ANTLR start "K_TYPE" 
public	TokenNamepublic	
final	TokenNamefinal	
void	TokenNamevoid	
mK_TYPE	TokenNameIdentifier	 m K  TYPE
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
RecognitionException	TokenNameIdentifier	 Recognition Exception
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
int	TokenNameint	
_type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
K_TYPE	TokenNameIdentifier	 K  TYPE
;	TokenNameSEMICOLON	
int	TokenNameint	
_channel	TokenNameIdentifier	 channel
=	TokenNameEQUAL	
DEFAULT_TOKEN_CHANNEL	TokenNameIdentifier	 DEFAULT  TOKEN  CHANNEL
;	TokenNameSEMICOLON	
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:890:7: ( T Y P E ) 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:890:7: ( T Y P E ) 
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:890:16: T Y P E 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:890:16: T Y P E 
{	TokenNameLBRACE	
mT	TokenNameIdentifier	 m T
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mY	TokenNameIdentifier	 m Y
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mP	TokenNameIdentifier	 m P
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mE	TokenNameIdentifier	 m E
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
_type	TokenNameIdentifier	 type
;	TokenNameSEMICOLON	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
channel	TokenNameIdentifier	 channel
=	TokenNameEQUAL	
_channel	TokenNameIdentifier	 channel
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
finally	TokenNamefinally	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// $ANTLR end "K_TYPE" 	TokenNameCOMMENT_LINE	$ANTLR end "K_TYPE" 
// $ANTLR start "K_COMPACT" 	TokenNameCOMMENT_LINE	$ANTLR start "K_COMPACT" 
public	TokenNamepublic	
final	TokenNamefinal	
void	TokenNamevoid	
mK_COMPACT	TokenNameIdentifier	 m K  COMPACT
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
RecognitionException	TokenNameIdentifier	 Recognition Exception
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
int	TokenNameint	
_type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
K_COMPACT	TokenNameIdentifier	 K  COMPACT
;	TokenNameSEMICOLON	
int	TokenNameint	
_channel	TokenNameIdentifier	 channel
=	TokenNameEQUAL	
DEFAULT_TOKEN_CHANNEL	TokenNameIdentifier	 DEFAULT  TOKEN  CHANNEL
;	TokenNameSEMICOLON	
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:891:10: ( C O M P A C T ) 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:891:10: ( C O M P A C T ) 
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:891:16: C O M P A C T 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:891:16: C O M P A C T 
{	TokenNameLBRACE	
mC	TokenNameIdentifier	 m C
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mO	TokenNameIdentifier	 m O
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mM	TokenNameIdentifier	 m M
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mP	TokenNameIdentifier	 m P
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mA	TokenNameIdentifier	 m A
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mC	TokenNameIdentifier	 m C
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mT	TokenNameIdentifier	 m T
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
_type	TokenNameIdentifier	 type
;	TokenNameSEMICOLON	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
channel	TokenNameIdentifier	 channel
=	TokenNameEQUAL	
_channel	TokenNameIdentifier	 channel
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
finally	TokenNamefinally	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// $ANTLR end "K_COMPACT" 	TokenNameCOMMENT_LINE	$ANTLR end "K_COMPACT" 
// $ANTLR start "K_STORAGE" 	TokenNameCOMMENT_LINE	$ANTLR start "K_STORAGE" 
public	TokenNamepublic	
final	TokenNamefinal	
void	TokenNamevoid	
mK_STORAGE	TokenNameIdentifier	 m K  STORAGE
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
RecognitionException	TokenNameIdentifier	 Recognition Exception
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
int	TokenNameint	
_type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
K_STORAGE	TokenNameIdentifier	 K  STORAGE
;	TokenNameSEMICOLON	
int	TokenNameint	
_channel	TokenNameIdentifier	 channel
=	TokenNameEQUAL	
DEFAULT_TOKEN_CHANNEL	TokenNameIdentifier	 DEFAULT  TOKEN  CHANNEL
;	TokenNameSEMICOLON	
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:892:10: ( S T O R A G E ) 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:892:10: ( S T O R A G E ) 
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:892:16: S T O R A G E 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:892:16: S T O R A G E 
{	TokenNameLBRACE	
mS	TokenNameIdentifier	 m S
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mT	TokenNameIdentifier	 m T
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mO	TokenNameIdentifier	 m O
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mR	TokenNameIdentifier	 m R
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mA	TokenNameIdentifier	 m A
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mG	TokenNameIdentifier	 m G
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mE	TokenNameIdentifier	 m E
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
_type	TokenNameIdentifier	 type
;	TokenNameSEMICOLON	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
channel	TokenNameIdentifier	 channel
=	TokenNameEQUAL	
_channel	TokenNameIdentifier	 channel
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
finally	TokenNamefinally	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// $ANTLR end "K_STORAGE" 	TokenNameCOMMENT_LINE	$ANTLR end "K_STORAGE" 
// $ANTLR start "K_ORDER" 	TokenNameCOMMENT_LINE	$ANTLR start "K_ORDER" 
public	TokenNamepublic	
final	TokenNamefinal	
void	TokenNamevoid	
mK_ORDER	TokenNameIdentifier	 m K  ORDER
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
RecognitionException	TokenNameIdentifier	 Recognition Exception
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
int	TokenNameint	
_type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
K_ORDER	TokenNameIdentifier	 K  ORDER
;	TokenNameSEMICOLON	
int	TokenNameint	
_channel	TokenNameIdentifier	 channel
=	TokenNameEQUAL	
DEFAULT_TOKEN_CHANNEL	TokenNameIdentifier	 DEFAULT  TOKEN  CHANNEL
;	TokenNameSEMICOLON	
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:893:8: ( O R D E R ) 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:893:8: ( O R D E R ) 
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:893:16: O R D E R 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:893:16: O R D E R 
{	TokenNameLBRACE	
mO	TokenNameIdentifier	 m O
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mR	TokenNameIdentifier	 m R
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mD	TokenNameIdentifier	 m D
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mE	TokenNameIdentifier	 m E
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mR	TokenNameIdentifier	 m R
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
_type	TokenNameIdentifier	 type
;	TokenNameSEMICOLON	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
channel	TokenNameIdentifier	 channel
=	TokenNameEQUAL	
_channel	TokenNameIdentifier	 channel
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
finally	TokenNamefinally	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// $ANTLR end "K_ORDER" 	TokenNameCOMMENT_LINE	$ANTLR end "K_ORDER" 
// $ANTLR start "K_BY" 	TokenNameCOMMENT_LINE	$ANTLR start "K_BY" 
public	TokenNamepublic	
final	TokenNamefinal	
void	TokenNamevoid	
mK_BY	TokenNameIdentifier	 m K  BY
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
RecognitionException	TokenNameIdentifier	 Recognition Exception
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
int	TokenNameint	
_type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
K_BY	TokenNameIdentifier	 K  BY
;	TokenNameSEMICOLON	
int	TokenNameint	
_channel	TokenNameIdentifier	 channel
=	TokenNameEQUAL	
DEFAULT_TOKEN_CHANNEL	TokenNameIdentifier	 DEFAULT  TOKEN  CHANNEL
;	TokenNameSEMICOLON	
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:894:5: ( B Y ) 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:894:5: ( B Y ) 
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:894:16: B Y 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:894:16: B Y 
{	TokenNameLBRACE	
mB	TokenNameIdentifier	 m B
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mY	TokenNameIdentifier	 m Y
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
_type	TokenNameIdentifier	 type
;	TokenNameSEMICOLON	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
channel	TokenNameIdentifier	 channel
=	TokenNameEQUAL	
_channel	TokenNameIdentifier	 channel
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
finally	TokenNamefinally	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// $ANTLR end "K_BY" 	TokenNameCOMMENT_LINE	$ANTLR end "K_BY" 
// $ANTLR start "K_ASC" 	TokenNameCOMMENT_LINE	$ANTLR start "K_ASC" 
public	TokenNamepublic	
final	TokenNamefinal	
void	TokenNamevoid	
mK_ASC	TokenNameIdentifier	 m K  ASC
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
RecognitionException	TokenNameIdentifier	 Recognition Exception
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
int	TokenNameint	
_type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
K_ASC	TokenNameIdentifier	 K  ASC
;	TokenNameSEMICOLON	
int	TokenNameint	
_channel	TokenNameIdentifier	 channel
=	TokenNameEQUAL	
DEFAULT_TOKEN_CHANNEL	TokenNameIdentifier	 DEFAULT  TOKEN  CHANNEL
;	TokenNameSEMICOLON	
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:895:6: ( A S C ) 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:895:6: ( A S C ) 
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:895:16: A S C 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:895:16: A S C 
{	TokenNameLBRACE	
mA	TokenNameIdentifier	 m A
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mS	TokenNameIdentifier	 m S
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mC	TokenNameIdentifier	 m C
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
_type	TokenNameIdentifier	 type
;	TokenNameSEMICOLON	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
channel	TokenNameIdentifier	 channel
=	TokenNameEQUAL	
_channel	TokenNameIdentifier	 channel
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
finally	TokenNamefinally	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// $ANTLR end "K_ASC" 	TokenNameCOMMENT_LINE	$ANTLR end "K_ASC" 
// $ANTLR start "K_DESC" 	TokenNameCOMMENT_LINE	$ANTLR start "K_DESC" 
public	TokenNamepublic	
final	TokenNamefinal	
void	TokenNamevoid	
mK_DESC	TokenNameIdentifier	 m K  DESC
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
RecognitionException	TokenNameIdentifier	 Recognition Exception
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
int	TokenNameint	
_type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
K_DESC	TokenNameIdentifier	 K  DESC
;	TokenNameSEMICOLON	
int	TokenNameint	
_channel	TokenNameIdentifier	 channel
=	TokenNameEQUAL	
DEFAULT_TOKEN_CHANNEL	TokenNameIdentifier	 DEFAULT  TOKEN  CHANNEL
;	TokenNameSEMICOLON	
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:896:7: ( D E S C ) 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:896:7: ( D E S C ) 
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:896:16: D E S C 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:896:16: D E S C 
{	TokenNameLBRACE	
mD	TokenNameIdentifier	 m D
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mE	TokenNameIdentifier	 m E
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mS	TokenNameIdentifier	 m S
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mC	TokenNameIdentifier	 m C
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
_type	TokenNameIdentifier	 type
;	TokenNameSEMICOLON	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
channel	TokenNameIdentifier	 channel
=	TokenNameEQUAL	
_channel	TokenNameIdentifier	 channel
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
finally	TokenNamefinally	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// $ANTLR end "K_DESC" 	TokenNameCOMMENT_LINE	$ANTLR end "K_DESC" 
// $ANTLR start "K_ALLOW" 	TokenNameCOMMENT_LINE	$ANTLR start "K_ALLOW" 
public	TokenNamepublic	
final	TokenNamefinal	
void	TokenNamevoid	
mK_ALLOW	TokenNameIdentifier	 m K  ALLOW
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
RecognitionException	TokenNameIdentifier	 Recognition Exception
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
int	TokenNameint	
_type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
K_ALLOW	TokenNameIdentifier	 K  ALLOW
;	TokenNameSEMICOLON	
int	TokenNameint	
_channel	TokenNameIdentifier	 channel
=	TokenNameEQUAL	
DEFAULT_TOKEN_CHANNEL	TokenNameIdentifier	 DEFAULT  TOKEN  CHANNEL
;	TokenNameSEMICOLON	
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:897:8: ( A L L O W ) 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:897:8: ( A L L O W ) 
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:897:16: A L L O W 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:897:16: A L L O W 
{	TokenNameLBRACE	
mA	TokenNameIdentifier	 m A
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mL	TokenNameIdentifier	 m L
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mL	TokenNameIdentifier	 m L
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mO	TokenNameIdentifier	 m O
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mW	TokenNameIdentifier	 m W
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
_type	TokenNameIdentifier	 type
;	TokenNameSEMICOLON	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
channel	TokenNameIdentifier	 channel
=	TokenNameEQUAL	
_channel	TokenNameIdentifier	 channel
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
finally	TokenNamefinally	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// $ANTLR end "K_ALLOW" 	TokenNameCOMMENT_LINE	$ANTLR end "K_ALLOW" 
// $ANTLR start "K_FILTERING" 	TokenNameCOMMENT_LINE	$ANTLR start "K_FILTERING" 
public	TokenNamepublic	
final	TokenNamefinal	
void	TokenNamevoid	
mK_FILTERING	TokenNameIdentifier	 m K  FILTERING
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
RecognitionException	TokenNameIdentifier	 Recognition Exception
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
int	TokenNameint	
_type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
K_FILTERING	TokenNameIdentifier	 K  FILTERING
;	TokenNameSEMICOLON	
int	TokenNameint	
_channel	TokenNameIdentifier	 channel
=	TokenNameEQUAL	
DEFAULT_TOKEN_CHANNEL	TokenNameIdentifier	 DEFAULT  TOKEN  CHANNEL
;	TokenNameSEMICOLON	
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:898:12: ( F I L T E R I N G ) 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:898:12: ( F I L T E R I N G ) 
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:898:16: F I L T E R I N G 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:898:16: F I L T E R I N G 
{	TokenNameLBRACE	
mF	TokenNameIdentifier	 m F
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mI	TokenNameIdentifier	 m I
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mL	TokenNameIdentifier	 m L
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mT	TokenNameIdentifier	 m T
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mE	TokenNameIdentifier	 m E
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mR	TokenNameIdentifier	 m R
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mI	TokenNameIdentifier	 m I
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mN	TokenNameIdentifier	 m N
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mG	TokenNameIdentifier	 m G
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
_type	TokenNameIdentifier	 type
;	TokenNameSEMICOLON	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
channel	TokenNameIdentifier	 channel
=	TokenNameEQUAL	
_channel	TokenNameIdentifier	 channel
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
finally	TokenNamefinally	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// $ANTLR end "K_FILTERING" 	TokenNameCOMMENT_LINE	$ANTLR end "K_FILTERING" 
// $ANTLR start "K_GRANT" 	TokenNameCOMMENT_LINE	$ANTLR start "K_GRANT" 
public	TokenNamepublic	
final	TokenNamefinal	
void	TokenNamevoid	
mK_GRANT	TokenNameIdentifier	 m K  GRANT
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
RecognitionException	TokenNameIdentifier	 Recognition Exception
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
int	TokenNameint	
_type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
K_GRANT	TokenNameIdentifier	 K  GRANT
;	TokenNameSEMICOLON	
int	TokenNameint	
_channel	TokenNameIdentifier	 channel
=	TokenNameEQUAL	
DEFAULT_TOKEN_CHANNEL	TokenNameIdentifier	 DEFAULT  TOKEN  CHANNEL
;	TokenNameSEMICOLON	
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:900:8: ( G R A N T ) 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:900:8: ( G R A N T ) 
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:900:16: G R A N T 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:900:16: G R A N T 
{	TokenNameLBRACE	
mG	TokenNameIdentifier	 m G
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mR	TokenNameIdentifier	 m R
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mA	TokenNameIdentifier	 m A
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mN	TokenNameIdentifier	 m N
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mT	TokenNameIdentifier	 m T
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
_type	TokenNameIdentifier	 type
;	TokenNameSEMICOLON	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
channel	TokenNameIdentifier	 channel
=	TokenNameEQUAL	
_channel	TokenNameIdentifier	 channel
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
finally	TokenNamefinally	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// $ANTLR end "K_GRANT" 	TokenNameCOMMENT_LINE	$ANTLR end "K_GRANT" 
// $ANTLR start "K_ALL" 	TokenNameCOMMENT_LINE	$ANTLR start "K_ALL" 
public	TokenNamepublic	
final	TokenNamefinal	
void	TokenNamevoid	
mK_ALL	TokenNameIdentifier	 m K  ALL
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
RecognitionException	TokenNameIdentifier	 Recognition Exception
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
int	TokenNameint	
_type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
K_ALL	TokenNameIdentifier	 K  ALL
;	TokenNameSEMICOLON	
int	TokenNameint	
_channel	TokenNameIdentifier	 channel
=	TokenNameEQUAL	
DEFAULT_TOKEN_CHANNEL	TokenNameIdentifier	 DEFAULT  TOKEN  CHANNEL
;	TokenNameSEMICOLON	
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:901:6: ( A L L ) 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:901:6: ( A L L ) 
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:901:16: A L L 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:901:16: A L L 
{	TokenNameLBRACE	
mA	TokenNameIdentifier	 m A
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mL	TokenNameIdentifier	 m L
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mL	TokenNameIdentifier	 m L
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
_type	TokenNameIdentifier	 type
;	TokenNameSEMICOLON	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
channel	TokenNameIdentifier	 channel
=	TokenNameEQUAL	
_channel	TokenNameIdentifier	 channel
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
finally	TokenNamefinally	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// $ANTLR end "K_ALL" 	TokenNameCOMMENT_LINE	$ANTLR end "K_ALL" 
// $ANTLR start "K_PERMISSION" 	TokenNameCOMMENT_LINE	$ANTLR start "K_PERMISSION" 
public	TokenNamepublic	
final	TokenNamefinal	
void	TokenNamevoid	
mK_PERMISSION	TokenNameIdentifier	 m K  PERMISSION
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
RecognitionException	TokenNameIdentifier	 Recognition Exception
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
int	TokenNameint	
_type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
K_PERMISSION	TokenNameIdentifier	 K  PERMISSION
;	TokenNameSEMICOLON	
int	TokenNameint	
_channel	TokenNameIdentifier	 channel
=	TokenNameEQUAL	
DEFAULT_TOKEN_CHANNEL	TokenNameIdentifier	 DEFAULT  TOKEN  CHANNEL
;	TokenNameSEMICOLON	
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:902:13: ( P E R M I S S I O N ) 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:902:13: ( P E R M I S S I O N ) 
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:902:16: P E R M I S S I O N 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:902:16: P E R M I S S I O N 
{	TokenNameLBRACE	
mP	TokenNameIdentifier	 m P
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mE	TokenNameIdentifier	 m E
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mR	TokenNameIdentifier	 m R
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mM	TokenNameIdentifier	 m M
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mI	TokenNameIdentifier	 m I
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mS	TokenNameIdentifier	 m S
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mS	TokenNameIdentifier	 m S
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mI	TokenNameIdentifier	 m I
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mO	TokenNameIdentifier	 m O
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mN	TokenNameIdentifier	 m N
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
_type	TokenNameIdentifier	 type
;	TokenNameSEMICOLON	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
channel	TokenNameIdentifier	 channel
=	TokenNameEQUAL	
_channel	TokenNameIdentifier	 channel
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
finally	TokenNamefinally	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// $ANTLR end "K_PERMISSION" 	TokenNameCOMMENT_LINE	$ANTLR end "K_PERMISSION" 
// $ANTLR start "K_PERMISSIONS" 	TokenNameCOMMENT_LINE	$ANTLR start "K_PERMISSIONS" 
public	TokenNamepublic	
final	TokenNamefinal	
void	TokenNamevoid	
mK_PERMISSIONS	TokenNameIdentifier	 m K  PERMISSIONS
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
RecognitionException	TokenNameIdentifier	 Recognition Exception
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
int	TokenNameint	
_type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
K_PERMISSIONS	TokenNameIdentifier	 K  PERMISSIONS
;	TokenNameSEMICOLON	
int	TokenNameint	
_channel	TokenNameIdentifier	 channel
=	TokenNameEQUAL	
DEFAULT_TOKEN_CHANNEL	TokenNameIdentifier	 DEFAULT  TOKEN  CHANNEL
;	TokenNameSEMICOLON	
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:903:14: ( P E R M I S S I O N S ) 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:903:14: ( P E R M I S S I O N S ) 
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:903:16: P E R M I S S I O N S 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:903:16: P E R M I S S I O N S 
{	TokenNameLBRACE	
mP	TokenNameIdentifier	 m P
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mE	TokenNameIdentifier	 m E
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mR	TokenNameIdentifier	 m R
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mM	TokenNameIdentifier	 m M
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mI	TokenNameIdentifier	 m I
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mS	TokenNameIdentifier	 m S
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mS	TokenNameIdentifier	 m S
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mI	TokenNameIdentifier	 m I
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mO	TokenNameIdentifier	 m O
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mN	TokenNameIdentifier	 m N
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mS	TokenNameIdentifier	 m S
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
_type	TokenNameIdentifier	 type
;	TokenNameSEMICOLON	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
channel	TokenNameIdentifier	 channel
=	TokenNameEQUAL	
_channel	TokenNameIdentifier	 channel
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
finally	TokenNamefinally	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// $ANTLR end "K_PERMISSIONS" 	TokenNameCOMMENT_LINE	$ANTLR end "K_PERMISSIONS" 
// $ANTLR start "K_OF" 	TokenNameCOMMENT_LINE	$ANTLR start "K_OF" 
public	TokenNamepublic	
final	TokenNamefinal	
void	TokenNamevoid	
mK_OF	TokenNameIdentifier	 m K  OF
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
RecognitionException	TokenNameIdentifier	 Recognition Exception
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
int	TokenNameint	
_type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
K_OF	TokenNameIdentifier	 K  OF
;	TokenNameSEMICOLON	
int	TokenNameint	
_channel	TokenNameIdentifier	 channel
=	TokenNameEQUAL	
DEFAULT_TOKEN_CHANNEL	TokenNameIdentifier	 DEFAULT  TOKEN  CHANNEL
;	TokenNameSEMICOLON	
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:904:5: ( O F ) 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:904:5: ( O F ) 
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:904:16: O F 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:904:16: O F 
{	TokenNameLBRACE	
mO	TokenNameIdentifier	 m O
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mF	TokenNameIdentifier	 m F
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
_type	TokenNameIdentifier	 type
;	TokenNameSEMICOLON	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
channel	TokenNameIdentifier	 channel
=	TokenNameEQUAL	
_channel	TokenNameIdentifier	 channel
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
finally	TokenNamefinally	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// $ANTLR end "K_OF" 	TokenNameCOMMENT_LINE	$ANTLR end "K_OF" 
// $ANTLR start "K_REVOKE" 	TokenNameCOMMENT_LINE	$ANTLR start "K_REVOKE" 
public	TokenNamepublic	
final	TokenNamefinal	
void	TokenNamevoid	
mK_REVOKE	TokenNameIdentifier	 m K  REVOKE
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
RecognitionException	TokenNameIdentifier	 Recognition Exception
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
int	TokenNameint	
_type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
K_REVOKE	TokenNameIdentifier	 K  REVOKE
;	TokenNameSEMICOLON	
int	TokenNameint	
_channel	TokenNameIdentifier	 channel
=	TokenNameEQUAL	
DEFAULT_TOKEN_CHANNEL	TokenNameIdentifier	 DEFAULT  TOKEN  CHANNEL
;	TokenNameSEMICOLON	
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:905:9: ( R E V O K E ) 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:905:9: ( R E V O K E ) 
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:905:16: R E V O K E 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:905:16: R E V O K E 
{	TokenNameLBRACE	
mR	TokenNameIdentifier	 m R
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mE	TokenNameIdentifier	 m E
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mV	TokenNameIdentifier	 m V
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mO	TokenNameIdentifier	 m O
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mK	TokenNameIdentifier	 m K
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mE	TokenNameIdentifier	 m E
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
_type	TokenNameIdentifier	 type
;	TokenNameSEMICOLON	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
channel	TokenNameIdentifier	 channel
=	TokenNameEQUAL	
_channel	TokenNameIdentifier	 channel
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
finally	TokenNamefinally	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// $ANTLR end "K_REVOKE" 	TokenNameCOMMENT_LINE	$ANTLR end "K_REVOKE" 
// $ANTLR start "K_MODIFY" 	TokenNameCOMMENT_LINE	$ANTLR start "K_MODIFY" 
public	TokenNamepublic	
final	TokenNamefinal	
void	TokenNamevoid	
mK_MODIFY	TokenNameIdentifier	 m K  MODIFY
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
RecognitionException	TokenNameIdentifier	 Recognition Exception
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
int	TokenNameint	
_type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
K_MODIFY	TokenNameIdentifier	 K  MODIFY
;	TokenNameSEMICOLON	
int	TokenNameint	
_channel	TokenNameIdentifier	 channel
=	TokenNameEQUAL	
DEFAULT_TOKEN_CHANNEL	TokenNameIdentifier	 DEFAULT  TOKEN  CHANNEL
;	TokenNameSEMICOLON	
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:906:9: ( M O D I F Y ) 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:906:9: ( M O D I F Y ) 
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:906:16: M O D I F Y 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:906:16: M O D I F Y 
{	TokenNameLBRACE	
mM	TokenNameIdentifier	 m M
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mO	TokenNameIdentifier	 m O
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mD	TokenNameIdentifier	 m D
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mI	TokenNameIdentifier	 m I
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mF	TokenNameIdentifier	 m F
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mY	TokenNameIdentifier	 m Y
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
_type	TokenNameIdentifier	 type
;	TokenNameSEMICOLON	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
channel	TokenNameIdentifier	 channel
=	TokenNameEQUAL	
_channel	TokenNameIdentifier	 channel
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
finally	TokenNamefinally	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// $ANTLR end "K_MODIFY" 	TokenNameCOMMENT_LINE	$ANTLR end "K_MODIFY" 
// $ANTLR start "K_AUTHORIZE" 	TokenNameCOMMENT_LINE	$ANTLR start "K_AUTHORIZE" 
public	TokenNamepublic	
final	TokenNamefinal	
void	TokenNamevoid	
mK_AUTHORIZE	TokenNameIdentifier	 m K  AUTHORIZE
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
RecognitionException	TokenNameIdentifier	 Recognition Exception
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
int	TokenNameint	
_type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
K_AUTHORIZE	TokenNameIdentifier	 K  AUTHORIZE
;	TokenNameSEMICOLON	
int	TokenNameint	
_channel	TokenNameIdentifier	 channel
=	TokenNameEQUAL	
DEFAULT_TOKEN_CHANNEL	TokenNameIdentifier	 DEFAULT  TOKEN  CHANNEL
;	TokenNameSEMICOLON	
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:907:12: ( A U T H O R I Z E ) 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:907:12: ( A U T H O R I Z E ) 
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:907:16: A U T H O R I Z E 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:907:16: A U T H O R I Z E 
{	TokenNameLBRACE	
mA	TokenNameIdentifier	 m A
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mU	TokenNameIdentifier	 m U
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mT	TokenNameIdentifier	 m T
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mH	TokenNameIdentifier	 m H
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mO	TokenNameIdentifier	 m O
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mR	TokenNameIdentifier	 m R
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mI	TokenNameIdentifier	 m I
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mZ	TokenNameIdentifier	 m Z
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mE	TokenNameIdentifier	 m E
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
_type	TokenNameIdentifier	 type
;	TokenNameSEMICOLON	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
channel	TokenNameIdentifier	 channel
=	TokenNameEQUAL	
_channel	TokenNameIdentifier	 channel
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
finally	TokenNamefinally	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// $ANTLR end "K_AUTHORIZE" 	TokenNameCOMMENT_LINE	$ANTLR end "K_AUTHORIZE" 
// $ANTLR start "K_NORECURSIVE" 	TokenNameCOMMENT_LINE	$ANTLR start "K_NORECURSIVE" 
public	TokenNamepublic	
final	TokenNamefinal	
void	TokenNamevoid	
mK_NORECURSIVE	TokenNameIdentifier	 m K  NORECURSIVE
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
RecognitionException	TokenNameIdentifier	 Recognition Exception
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
int	TokenNameint	
_type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
K_NORECURSIVE	TokenNameIdentifier	 K  NORECURSIVE
;	TokenNameSEMICOLON	
int	TokenNameint	
_channel	TokenNameIdentifier	 channel
=	TokenNameEQUAL	
DEFAULT_TOKEN_CHANNEL	TokenNameIdentifier	 DEFAULT  TOKEN  CHANNEL
;	TokenNameSEMICOLON	
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:908:14: ( N O R E C U R S I V E ) 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:908:14: ( N O R E C U R S I V E ) 
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:908:16: N O R E C U R S I V E 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:908:16: N O R E C U R S I V E 
{	TokenNameLBRACE	
mN	TokenNameIdentifier	 m N
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mO	TokenNameIdentifier	 m O
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mR	TokenNameIdentifier	 m R
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mE	TokenNameIdentifier	 m E
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mC	TokenNameIdentifier	 m C
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mU	TokenNameIdentifier	 m U
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mR	TokenNameIdentifier	 m R
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mS	TokenNameIdentifier	 m S
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mI	TokenNameIdentifier	 m I
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mV	TokenNameIdentifier	 m V
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mE	TokenNameIdentifier	 m E
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
_type	TokenNameIdentifier	 type
;	TokenNameSEMICOLON	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
channel	TokenNameIdentifier	 channel
=	TokenNameEQUAL	
_channel	TokenNameIdentifier	 channel
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
finally	TokenNamefinally	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// $ANTLR end "K_NORECURSIVE" 	TokenNameCOMMENT_LINE	$ANTLR end "K_NORECURSIVE" 
// $ANTLR start "K_USER" 	TokenNameCOMMENT_LINE	$ANTLR start "K_USER" 
public	TokenNamepublic	
final	TokenNamefinal	
void	TokenNamevoid	
mK_USER	TokenNameIdentifier	 m K  USER
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
RecognitionException	TokenNameIdentifier	 Recognition Exception
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
int	TokenNameint	
_type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
K_USER	TokenNameIdentifier	 K  USER
;	TokenNameSEMICOLON	
int	TokenNameint	
_channel	TokenNameIdentifier	 channel
=	TokenNameEQUAL	
DEFAULT_TOKEN_CHANNEL	TokenNameIdentifier	 DEFAULT  TOKEN  CHANNEL
;	TokenNameSEMICOLON	
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:910:7: ( U S E R ) 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:910:7: ( U S E R ) 
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:910:16: U S E R 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:910:16: U S E R 
{	TokenNameLBRACE	
mU	TokenNameIdentifier	 m U
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mS	TokenNameIdentifier	 m S
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mE	TokenNameIdentifier	 m E
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mR	TokenNameIdentifier	 m R
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
_type	TokenNameIdentifier	 type
;	TokenNameSEMICOLON	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
channel	TokenNameIdentifier	 channel
=	TokenNameEQUAL	
_channel	TokenNameIdentifier	 channel
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
finally	TokenNamefinally	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// $ANTLR end "K_USER" 	TokenNameCOMMENT_LINE	$ANTLR end "K_USER" 
// $ANTLR start "K_USERS" 	TokenNameCOMMENT_LINE	$ANTLR start "K_USERS" 
public	TokenNamepublic	
final	TokenNamefinal	
void	TokenNamevoid	
mK_USERS	TokenNameIdentifier	 m K  USERS
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
RecognitionException	TokenNameIdentifier	 Recognition Exception
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
int	TokenNameint	
_type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
K_USERS	TokenNameIdentifier	 K  USERS
;	TokenNameSEMICOLON	
int	TokenNameint	
_channel	TokenNameIdentifier	 channel
=	TokenNameEQUAL	
DEFAULT_TOKEN_CHANNEL	TokenNameIdentifier	 DEFAULT  TOKEN  CHANNEL
;	TokenNameSEMICOLON	
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:911:8: ( U S E R S ) 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:911:8: ( U S E R S ) 
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:911:16: U S E R S 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:911:16: U S E R S 
{	TokenNameLBRACE	
mU	TokenNameIdentifier	 m U
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mS	TokenNameIdentifier	 m S
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mE	TokenNameIdentifier	 m E
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mR	TokenNameIdentifier	 m R
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mS	TokenNameIdentifier	 m S
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
_type	TokenNameIdentifier	 type
;	TokenNameSEMICOLON	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
channel	TokenNameIdentifier	 channel
=	TokenNameEQUAL	
_channel	TokenNameIdentifier	 channel
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
finally	TokenNamefinally	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// $ANTLR end "K_USERS" 	TokenNameCOMMENT_LINE	$ANTLR end "K_USERS" 
// $ANTLR start "K_SUPERUSER" 	TokenNameCOMMENT_LINE	$ANTLR start "K_SUPERUSER" 
public	TokenNamepublic	
final	TokenNamefinal	
void	TokenNamevoid	
mK_SUPERUSER	TokenNameIdentifier	 m K  SUPERUSER
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
RecognitionException	TokenNameIdentifier	 Recognition Exception
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
int	TokenNameint	
_type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
K_SUPERUSER	TokenNameIdentifier	 K  SUPERUSER
;	TokenNameSEMICOLON	
int	TokenNameint	
_channel	TokenNameIdentifier	 channel
=	TokenNameEQUAL	
DEFAULT_TOKEN_CHANNEL	TokenNameIdentifier	 DEFAULT  TOKEN  CHANNEL
;	TokenNameSEMICOLON	
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:912:12: ( S U P E R U S E R ) 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:912:12: ( S U P E R U S E R ) 
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:912:16: S U P E R U S E R 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:912:16: S U P E R U S E R 
{	TokenNameLBRACE	
mS	TokenNameIdentifier	 m S
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mU	TokenNameIdentifier	 m U
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mP	TokenNameIdentifier	 m P
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mE	TokenNameIdentifier	 m E
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mR	TokenNameIdentifier	 m R
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mU	TokenNameIdentifier	 m U
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mS	TokenNameIdentifier	 m S
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mE	TokenNameIdentifier	 m E
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mR	TokenNameIdentifier	 m R
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
_type	TokenNameIdentifier	 type
;	TokenNameSEMICOLON	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
channel	TokenNameIdentifier	 channel
=	TokenNameEQUAL	
_channel	TokenNameIdentifier	 channel
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
finally	TokenNamefinally	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// $ANTLR end "K_SUPERUSER" 	TokenNameCOMMENT_LINE	$ANTLR end "K_SUPERUSER" 
// $ANTLR start "K_NOSUPERUSER" 	TokenNameCOMMENT_LINE	$ANTLR start "K_NOSUPERUSER" 
public	TokenNamepublic	
final	TokenNamefinal	
void	TokenNamevoid	
mK_NOSUPERUSER	TokenNameIdentifier	 m K  NOSUPERUSER
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
RecognitionException	TokenNameIdentifier	 Recognition Exception
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
int	TokenNameint	
_type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
K_NOSUPERUSER	TokenNameIdentifier	 K  NOSUPERUSER
;	TokenNameSEMICOLON	
int	TokenNameint	
_channel	TokenNameIdentifier	 channel
=	TokenNameEQUAL	
DEFAULT_TOKEN_CHANNEL	TokenNameIdentifier	 DEFAULT  TOKEN  CHANNEL
;	TokenNameSEMICOLON	
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:913:14: ( N O S U P E R U S E R ) 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:913:14: ( N O S U P E R U S E R ) 
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:913:16: N O S U P E R U S E R 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:913:16: N O S U P E R U S E R 
{	TokenNameLBRACE	
mN	TokenNameIdentifier	 m N
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mO	TokenNameIdentifier	 m O
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mS	TokenNameIdentifier	 m S
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mU	TokenNameIdentifier	 m U
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mP	TokenNameIdentifier	 m P
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mE	TokenNameIdentifier	 m E
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mR	TokenNameIdentifier	 m R
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mU	TokenNameIdentifier	 m U
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mS	TokenNameIdentifier	 m S
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mE	TokenNameIdentifier	 m E
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mR	TokenNameIdentifier	 m R
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
_type	TokenNameIdentifier	 type
;	TokenNameSEMICOLON	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
channel	TokenNameIdentifier	 channel
=	TokenNameEQUAL	
_channel	TokenNameIdentifier	 channel
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
finally	TokenNamefinally	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// $ANTLR end "K_NOSUPERUSER" 	TokenNameCOMMENT_LINE	$ANTLR end "K_NOSUPERUSER" 
// $ANTLR start "K_PASSWORD" 	TokenNameCOMMENT_LINE	$ANTLR start "K_PASSWORD" 
public	TokenNamepublic	
final	TokenNamefinal	
void	TokenNamevoid	
mK_PASSWORD	TokenNameIdentifier	 m K  PASSWORD
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
RecognitionException	TokenNameIdentifier	 Recognition Exception
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
int	TokenNameint	
_type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
K_PASSWORD	TokenNameIdentifier	 K  PASSWORD
;	TokenNameSEMICOLON	
int	TokenNameint	
_channel	TokenNameIdentifier	 channel
=	TokenNameEQUAL	
DEFAULT_TOKEN_CHANNEL	TokenNameIdentifier	 DEFAULT  TOKEN  CHANNEL
;	TokenNameSEMICOLON	
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:914:11: ( P A S S W O R D ) 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:914:11: ( P A S S W O R D ) 
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:914:16: P A S S W O R D 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:914:16: P A S S W O R D 
{	TokenNameLBRACE	
mP	TokenNameIdentifier	 m P
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mA	TokenNameIdentifier	 m A
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mS	TokenNameIdentifier	 m S
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mS	TokenNameIdentifier	 m S
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mW	TokenNameIdentifier	 m W
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mO	TokenNameIdentifier	 m O
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mR	TokenNameIdentifier	 m R
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mD	TokenNameIdentifier	 m D
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
_type	TokenNameIdentifier	 type
;	TokenNameSEMICOLON	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
channel	TokenNameIdentifier	 channel
=	TokenNameEQUAL	
_channel	TokenNameIdentifier	 channel
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
finally	TokenNamefinally	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// $ANTLR end "K_PASSWORD" 	TokenNameCOMMENT_LINE	$ANTLR end "K_PASSWORD" 
// $ANTLR start "K_CLUSTERING" 	TokenNameCOMMENT_LINE	$ANTLR start "K_CLUSTERING" 
public	TokenNamepublic	
final	TokenNamefinal	
void	TokenNamevoid	
mK_CLUSTERING	TokenNameIdentifier	 m K  CLUSTERING
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
RecognitionException	TokenNameIdentifier	 Recognition Exception
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
int	TokenNameint	
_type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
K_CLUSTERING	TokenNameIdentifier	 K  CLUSTERING
;	TokenNameSEMICOLON	
int	TokenNameint	
_channel	TokenNameIdentifier	 channel
=	TokenNameEQUAL	
DEFAULT_TOKEN_CHANNEL	TokenNameIdentifier	 DEFAULT  TOKEN  CHANNEL
;	TokenNameSEMICOLON	
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:916:13: ( C L U S T E R I N G ) 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:916:13: ( C L U S T E R I N G ) 
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:916:16: C L U S T E R I N G 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:916:16: C L U S T E R I N G 
{	TokenNameLBRACE	
mC	TokenNameIdentifier	 m C
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mL	TokenNameIdentifier	 m L
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mU	TokenNameIdentifier	 m U
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mS	TokenNameIdentifier	 m S
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mT	TokenNameIdentifier	 m T
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mE	TokenNameIdentifier	 m E
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mR	TokenNameIdentifier	 m R
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mI	TokenNameIdentifier	 m I
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mN	TokenNameIdentifier	 m N
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mG	TokenNameIdentifier	 m G
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
_type	TokenNameIdentifier	 type
;	TokenNameSEMICOLON	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
channel	TokenNameIdentifier	 channel
=	TokenNameEQUAL	
_channel	TokenNameIdentifier	 channel
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
finally	TokenNamefinally	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// $ANTLR end "K_CLUSTERING" 	TokenNameCOMMENT_LINE	$ANTLR end "K_CLUSTERING" 
// $ANTLR start "K_ASCII" 	TokenNameCOMMENT_LINE	$ANTLR start "K_ASCII" 
public	TokenNamepublic	
final	TokenNamefinal	
void	TokenNamevoid	
mK_ASCII	TokenNameIdentifier	 m K  ASCII
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
RecognitionException	TokenNameIdentifier	 Recognition Exception
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
int	TokenNameint	
_type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
K_ASCII	TokenNameIdentifier	 K  ASCII
;	TokenNameSEMICOLON	
int	TokenNameint	
_channel	TokenNameIdentifier	 channel
=	TokenNameEQUAL	
DEFAULT_TOKEN_CHANNEL	TokenNameIdentifier	 DEFAULT  TOKEN  CHANNEL
;	TokenNameSEMICOLON	
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:917:8: ( A S C I I ) 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:917:8: ( A S C I I ) 
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:917:16: A S C I I 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:917:16: A S C I I 
{	TokenNameLBRACE	
mA	TokenNameIdentifier	 m A
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mS	TokenNameIdentifier	 m S
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mC	TokenNameIdentifier	 m C
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mI	TokenNameIdentifier	 m I
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mI	TokenNameIdentifier	 m I
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
_type	TokenNameIdentifier	 type
;	TokenNameSEMICOLON	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
channel	TokenNameIdentifier	 channel
=	TokenNameEQUAL	
_channel	TokenNameIdentifier	 channel
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
finally	TokenNamefinally	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// $ANTLR end "K_ASCII" 	TokenNameCOMMENT_LINE	$ANTLR end "K_ASCII" 
// $ANTLR start "K_BIGINT" 	TokenNameCOMMENT_LINE	$ANTLR start "K_BIGINT" 
public	TokenNamepublic	
final	TokenNamefinal	
void	TokenNamevoid	
mK_BIGINT	TokenNameIdentifier	 m K  BIGINT
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
RecognitionException	TokenNameIdentifier	 Recognition Exception
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
int	TokenNameint	
_type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
K_BIGINT	TokenNameIdentifier	 K  BIGINT
;	TokenNameSEMICOLON	
int	TokenNameint	
_channel	TokenNameIdentifier	 channel
=	TokenNameEQUAL	
DEFAULT_TOKEN_CHANNEL	TokenNameIdentifier	 DEFAULT  TOKEN  CHANNEL
;	TokenNameSEMICOLON	
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:918:9: ( B I G I N T ) 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:918:9: ( B I G I N T ) 
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:918:16: B I G I N T 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:918:16: B I G I N T 
{	TokenNameLBRACE	
mB	TokenNameIdentifier	 m B
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mI	TokenNameIdentifier	 m I
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mG	TokenNameIdentifier	 m G
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mI	TokenNameIdentifier	 m I
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mN	TokenNameIdentifier	 m N
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mT	TokenNameIdentifier	 m T
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
_type	TokenNameIdentifier	 type
;	TokenNameSEMICOLON	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
channel	TokenNameIdentifier	 channel
=	TokenNameEQUAL	
_channel	TokenNameIdentifier	 channel
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
finally	TokenNamefinally	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// $ANTLR end "K_BIGINT" 	TokenNameCOMMENT_LINE	$ANTLR end "K_BIGINT" 
// $ANTLR start "K_BLOB" 	TokenNameCOMMENT_LINE	$ANTLR start "K_BLOB" 
public	TokenNamepublic	
final	TokenNamefinal	
void	TokenNamevoid	
mK_BLOB	TokenNameIdentifier	 m K  BLOB
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
RecognitionException	TokenNameIdentifier	 Recognition Exception
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
int	TokenNameint	
_type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
K_BLOB	TokenNameIdentifier	 K  BLOB
;	TokenNameSEMICOLON	
int	TokenNameint	
_channel	TokenNameIdentifier	 channel
=	TokenNameEQUAL	
DEFAULT_TOKEN_CHANNEL	TokenNameIdentifier	 DEFAULT  TOKEN  CHANNEL
;	TokenNameSEMICOLON	
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:919:7: ( B L O B ) 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:919:7: ( B L O B ) 
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:919:16: B L O B 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:919:16: B L O B 
{	TokenNameLBRACE	
mB	TokenNameIdentifier	 m B
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mL	TokenNameIdentifier	 m L
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mO	TokenNameIdentifier	 m O
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mB	TokenNameIdentifier	 m B
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
_type	TokenNameIdentifier	 type
;	TokenNameSEMICOLON	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
channel	TokenNameIdentifier	 channel
=	TokenNameEQUAL	
_channel	TokenNameIdentifier	 channel
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
finally	TokenNamefinally	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// $ANTLR end "K_BLOB" 	TokenNameCOMMENT_LINE	$ANTLR end "K_BLOB" 
// $ANTLR start "K_BOOLEAN" 	TokenNameCOMMENT_LINE	$ANTLR start "K_BOOLEAN" 
public	TokenNamepublic	
final	TokenNamefinal	
void	TokenNamevoid	
mK_BOOLEAN	TokenNameIdentifier	 m K  BOOLEAN
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
RecognitionException	TokenNameIdentifier	 Recognition Exception
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
int	TokenNameint	
_type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
K_BOOLEAN	TokenNameIdentifier	 K  BOOLEAN
;	TokenNameSEMICOLON	
int	TokenNameint	
_channel	TokenNameIdentifier	 channel
=	TokenNameEQUAL	
DEFAULT_TOKEN_CHANNEL	TokenNameIdentifier	 DEFAULT  TOKEN  CHANNEL
;	TokenNameSEMICOLON	
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:920:10: ( B O O L E A N ) 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:920:10: ( B O O L E A N ) 
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:920:16: B O O L E A N 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:920:16: B O O L E A N 
{	TokenNameLBRACE	
mB	TokenNameIdentifier	 m B
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mO	TokenNameIdentifier	 m O
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mO	TokenNameIdentifier	 m O
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mL	TokenNameIdentifier	 m L
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mE	TokenNameIdentifier	 m E
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mA	TokenNameIdentifier	 m A
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mN	TokenNameIdentifier	 m N
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
_type	TokenNameIdentifier	 type
;	TokenNameSEMICOLON	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
channel	TokenNameIdentifier	 channel
=	TokenNameEQUAL	
_channel	TokenNameIdentifier	 channel
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
finally	TokenNamefinally	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// $ANTLR end "K_BOOLEAN" 	TokenNameCOMMENT_LINE	$ANTLR end "K_BOOLEAN" 
// $ANTLR start "K_COUNTER" 	TokenNameCOMMENT_LINE	$ANTLR start "K_COUNTER" 
public	TokenNamepublic	
final	TokenNamefinal	
void	TokenNamevoid	
mK_COUNTER	TokenNameIdentifier	 m K  COUNTER
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
RecognitionException	TokenNameIdentifier	 Recognition Exception
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
int	TokenNameint	
_type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
K_COUNTER	TokenNameIdentifier	 K  COUNTER
;	TokenNameSEMICOLON	
int	TokenNameint	
_channel	TokenNameIdentifier	 channel
=	TokenNameEQUAL	
DEFAULT_TOKEN_CHANNEL	TokenNameIdentifier	 DEFAULT  TOKEN  CHANNEL
;	TokenNameSEMICOLON	
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:921:10: ( C O U N T E R ) 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:921:10: ( C O U N T E R ) 
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:921:16: C O U N T E R 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:921:16: C O U N T E R 
{	TokenNameLBRACE	
mC	TokenNameIdentifier	 m C
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mO	TokenNameIdentifier	 m O
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mU	TokenNameIdentifier	 m U
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mN	TokenNameIdentifier	 m N
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mT	TokenNameIdentifier	 m T
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mE	TokenNameIdentifier	 m E
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mR	TokenNameIdentifier	 m R
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
_type	TokenNameIdentifier	 type
;	TokenNameSEMICOLON	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
channel	TokenNameIdentifier	 channel
=	TokenNameEQUAL	
_channel	TokenNameIdentifier	 channel
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
finally	TokenNamefinally	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// $ANTLR end "K_COUNTER" 	TokenNameCOMMENT_LINE	$ANTLR end "K_COUNTER" 
// $ANTLR start "K_DECIMAL" 	TokenNameCOMMENT_LINE	$ANTLR start "K_DECIMAL" 
public	TokenNamepublic	
final	TokenNamefinal	
void	TokenNamevoid	
mK_DECIMAL	TokenNameIdentifier	 m K  DECIMAL
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
RecognitionException	TokenNameIdentifier	 Recognition Exception
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
int	TokenNameint	
_type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
K_DECIMAL	TokenNameIdentifier	 K  DECIMAL
;	TokenNameSEMICOLON	
int	TokenNameint	
_channel	TokenNameIdentifier	 channel
=	TokenNameEQUAL	
DEFAULT_TOKEN_CHANNEL	TokenNameIdentifier	 DEFAULT  TOKEN  CHANNEL
;	TokenNameSEMICOLON	
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:922:10: ( D E C I M A L ) 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:922:10: ( D E C I M A L ) 
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:922:16: D E C I M A L 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:922:16: D E C I M A L 
{	TokenNameLBRACE	
mD	TokenNameIdentifier	 m D
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mE	TokenNameIdentifier	 m E
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mC	TokenNameIdentifier	 m C
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mI	TokenNameIdentifier	 m I
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mM	TokenNameIdentifier	 m M
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mA	TokenNameIdentifier	 m A
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mL	TokenNameIdentifier	 m L
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
_type	TokenNameIdentifier	 type
;	TokenNameSEMICOLON	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
channel	TokenNameIdentifier	 channel
=	TokenNameEQUAL	
_channel	TokenNameIdentifier	 channel
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
finally	TokenNamefinally	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// $ANTLR end "K_DECIMAL" 	TokenNameCOMMENT_LINE	$ANTLR end "K_DECIMAL" 
// $ANTLR start "K_DOUBLE" 	TokenNameCOMMENT_LINE	$ANTLR start "K_DOUBLE" 
public	TokenNamepublic	
final	TokenNamefinal	
void	TokenNamevoid	
mK_DOUBLE	TokenNameIdentifier	 m K  DOUBLE
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
RecognitionException	TokenNameIdentifier	 Recognition Exception
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
int	TokenNameint	
_type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
K_DOUBLE	TokenNameIdentifier	 K  DOUBLE
;	TokenNameSEMICOLON	
int	TokenNameint	
_channel	TokenNameIdentifier	 channel
=	TokenNameEQUAL	
DEFAULT_TOKEN_CHANNEL	TokenNameIdentifier	 DEFAULT  TOKEN  CHANNEL
;	TokenNameSEMICOLON	
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:923:9: ( D O U B L E ) 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:923:9: ( D O U B L E ) 
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:923:16: D O U B L E 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:923:16: D O U B L E 
{	TokenNameLBRACE	
mD	TokenNameIdentifier	 m D
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mO	TokenNameIdentifier	 m O
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mU	TokenNameIdentifier	 m U
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mB	TokenNameIdentifier	 m B
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mL	TokenNameIdentifier	 m L
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mE	TokenNameIdentifier	 m E
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
_type	TokenNameIdentifier	 type
;	TokenNameSEMICOLON	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
channel	TokenNameIdentifier	 channel
=	TokenNameEQUAL	
_channel	TokenNameIdentifier	 channel
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
finally	TokenNamefinally	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// $ANTLR end "K_DOUBLE" 	TokenNameCOMMENT_LINE	$ANTLR end "K_DOUBLE" 
// $ANTLR start "K_FLOAT" 	TokenNameCOMMENT_LINE	$ANTLR start "K_FLOAT" 
public	TokenNamepublic	
final	TokenNamefinal	
void	TokenNamevoid	
mK_FLOAT	TokenNameIdentifier	 m K  FLOAT
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
RecognitionException	TokenNameIdentifier	 Recognition Exception
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
int	TokenNameint	
_type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
K_FLOAT	TokenNameIdentifier	 K  FLOAT
;	TokenNameSEMICOLON	
int	TokenNameint	
_channel	TokenNameIdentifier	 channel
=	TokenNameEQUAL	
DEFAULT_TOKEN_CHANNEL	TokenNameIdentifier	 DEFAULT  TOKEN  CHANNEL
;	TokenNameSEMICOLON	
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:924:8: ( F L O A T ) 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:924:8: ( F L O A T ) 
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:924:16: F L O A T 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:924:16: F L O A T 
{	TokenNameLBRACE	
mF	TokenNameIdentifier	 m F
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mL	TokenNameIdentifier	 m L
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mO	TokenNameIdentifier	 m O
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mA	TokenNameIdentifier	 m A
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mT	TokenNameIdentifier	 m T
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
_type	TokenNameIdentifier	 type
;	TokenNameSEMICOLON	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
channel	TokenNameIdentifier	 channel
=	TokenNameEQUAL	
_channel	TokenNameIdentifier	 channel
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
finally	TokenNamefinally	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// $ANTLR end "K_FLOAT" 	TokenNameCOMMENT_LINE	$ANTLR end "K_FLOAT" 
// $ANTLR start "K_INET" 	TokenNameCOMMENT_LINE	$ANTLR start "K_INET" 
public	TokenNamepublic	
final	TokenNamefinal	
void	TokenNamevoid	
mK_INET	TokenNameIdentifier	 m K  INET
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
RecognitionException	TokenNameIdentifier	 Recognition Exception
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
int	TokenNameint	
_type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
K_INET	TokenNameIdentifier	 K  INET
;	TokenNameSEMICOLON	
int	TokenNameint	
_channel	TokenNameIdentifier	 channel
=	TokenNameEQUAL	
DEFAULT_TOKEN_CHANNEL	TokenNameIdentifier	 DEFAULT  TOKEN  CHANNEL
;	TokenNameSEMICOLON	
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:925:7: ( I N E T ) 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:925:7: ( I N E T ) 
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:925:16: I N E T 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:925:16: I N E T 
{	TokenNameLBRACE	
mI	TokenNameIdentifier	 m I
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mN	TokenNameIdentifier	 m N
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mE	TokenNameIdentifier	 m E
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mT	TokenNameIdentifier	 m T
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
_type	TokenNameIdentifier	 type
;	TokenNameSEMICOLON	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
channel	TokenNameIdentifier	 channel
=	TokenNameEQUAL	
_channel	TokenNameIdentifier	 channel
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
finally	TokenNamefinally	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// $ANTLR end "K_INET" 	TokenNameCOMMENT_LINE	$ANTLR end "K_INET" 
// $ANTLR start "K_INT" 	TokenNameCOMMENT_LINE	$ANTLR start "K_INT" 
public	TokenNamepublic	
final	TokenNamefinal	
void	TokenNamevoid	
mK_INT	TokenNameIdentifier	 m K  INT
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
RecognitionException	TokenNameIdentifier	 Recognition Exception
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
int	TokenNameint	
_type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
K_INT	TokenNameIdentifier	 K  INT
;	TokenNameSEMICOLON	
int	TokenNameint	
_channel	TokenNameIdentifier	 channel
=	TokenNameEQUAL	
DEFAULT_TOKEN_CHANNEL	TokenNameIdentifier	 DEFAULT  TOKEN  CHANNEL
;	TokenNameSEMICOLON	
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:926:6: ( I N T ) 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:926:6: ( I N T ) 
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:926:16: I N T 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:926:16: I N T 
{	TokenNameLBRACE	
mI	TokenNameIdentifier	 m I
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mN	TokenNameIdentifier	 m N
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mT	TokenNameIdentifier	 m T
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
_type	TokenNameIdentifier	 type
;	TokenNameSEMICOLON	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
channel	TokenNameIdentifier	 channel
=	TokenNameEQUAL	
_channel	TokenNameIdentifier	 channel
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
finally	TokenNamefinally	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// $ANTLR end "K_INT" 	TokenNameCOMMENT_LINE	$ANTLR end "K_INT" 
// $ANTLR start "K_TEXT" 	TokenNameCOMMENT_LINE	$ANTLR start "K_TEXT" 
public	TokenNamepublic	
final	TokenNamefinal	
void	TokenNamevoid	
mK_TEXT	TokenNameIdentifier	 m K  TEXT
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
RecognitionException	TokenNameIdentifier	 Recognition Exception
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
int	TokenNameint	
_type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
K_TEXT	TokenNameIdentifier	 K  TEXT
;	TokenNameSEMICOLON	
int	TokenNameint	
_channel	TokenNameIdentifier	 channel
=	TokenNameEQUAL	
DEFAULT_TOKEN_CHANNEL	TokenNameIdentifier	 DEFAULT  TOKEN  CHANNEL
;	TokenNameSEMICOLON	
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:927:7: ( T E X T ) 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:927:7: ( T E X T ) 
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:927:16: T E X T 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:927:16: T E X T 
{	TokenNameLBRACE	
mT	TokenNameIdentifier	 m T
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mE	TokenNameIdentifier	 m E
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mX	TokenNameIdentifier	 m X
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mT	TokenNameIdentifier	 m T
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
_type	TokenNameIdentifier	 type
;	TokenNameSEMICOLON	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
channel	TokenNameIdentifier	 channel
=	TokenNameEQUAL	
_channel	TokenNameIdentifier	 channel
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
finally	TokenNamefinally	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// $ANTLR end "K_TEXT" 	TokenNameCOMMENT_LINE	$ANTLR end "K_TEXT" 
// $ANTLR start "K_UUID" 	TokenNameCOMMENT_LINE	$ANTLR start "K_UUID" 
public	TokenNamepublic	
final	TokenNamefinal	
void	TokenNamevoid	
mK_UUID	TokenNameIdentifier	 m K  UUID
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
RecognitionException	TokenNameIdentifier	 Recognition Exception
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
int	TokenNameint	
_type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
K_UUID	TokenNameIdentifier	 K  UUID
;	TokenNameSEMICOLON	
int	TokenNameint	
_channel	TokenNameIdentifier	 channel
=	TokenNameEQUAL	
DEFAULT_TOKEN_CHANNEL	TokenNameIdentifier	 DEFAULT  TOKEN  CHANNEL
;	TokenNameSEMICOLON	
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:928:7: ( U U I D ) 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:928:7: ( U U I D ) 
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:928:16: U U I D 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:928:16: U U I D 
{	TokenNameLBRACE	
mU	TokenNameIdentifier	 m U
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mU	TokenNameIdentifier	 m U
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mI	TokenNameIdentifier	 m I
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mD	TokenNameIdentifier	 m D
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
_type	TokenNameIdentifier	 type
;	TokenNameSEMICOLON	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
channel	TokenNameIdentifier	 channel
=	TokenNameEQUAL	
_channel	TokenNameIdentifier	 channel
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
finally	TokenNamefinally	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// $ANTLR end "K_UUID" 	TokenNameCOMMENT_LINE	$ANTLR end "K_UUID" 
// $ANTLR start "K_VARCHAR" 	TokenNameCOMMENT_LINE	$ANTLR start "K_VARCHAR" 
public	TokenNamepublic	
final	TokenNamefinal	
void	TokenNamevoid	
mK_VARCHAR	TokenNameIdentifier	 m K  VARCHAR
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
RecognitionException	TokenNameIdentifier	 Recognition Exception
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
int	TokenNameint	
_type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
K_VARCHAR	TokenNameIdentifier	 K  VARCHAR
;	TokenNameSEMICOLON	
int	TokenNameint	
_channel	TokenNameIdentifier	 channel
=	TokenNameEQUAL	
DEFAULT_TOKEN_CHANNEL	TokenNameIdentifier	 DEFAULT  TOKEN  CHANNEL
;	TokenNameSEMICOLON	
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:929:10: ( V A R C H A R ) 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:929:10: ( V A R C H A R ) 
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:929:16: V A R C H A R 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:929:16: V A R C H A R 
{	TokenNameLBRACE	
mV	TokenNameIdentifier	 m V
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mA	TokenNameIdentifier	 m A
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mR	TokenNameIdentifier	 m R
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mC	TokenNameIdentifier	 m C
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mH	TokenNameIdentifier	 m H
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mA	TokenNameIdentifier	 m A
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mR	TokenNameIdentifier	 m R
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
_type	TokenNameIdentifier	 type
;	TokenNameSEMICOLON	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
channel	TokenNameIdentifier	 channel
=	TokenNameEQUAL	
_channel	TokenNameIdentifier	 channel
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
finally	TokenNamefinally	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// $ANTLR end "K_VARCHAR" 	TokenNameCOMMENT_LINE	$ANTLR end "K_VARCHAR" 
// $ANTLR start "K_VARINT" 	TokenNameCOMMENT_LINE	$ANTLR start "K_VARINT" 
public	TokenNamepublic	
final	TokenNamefinal	
void	TokenNamevoid	
mK_VARINT	TokenNameIdentifier	 m K  VARINT
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
RecognitionException	TokenNameIdentifier	 Recognition Exception
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
int	TokenNameint	
_type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
K_VARINT	TokenNameIdentifier	 K  VARINT
;	TokenNameSEMICOLON	
int	TokenNameint	
_channel	TokenNameIdentifier	 channel
=	TokenNameEQUAL	
DEFAULT_TOKEN_CHANNEL	TokenNameIdentifier	 DEFAULT  TOKEN  CHANNEL
;	TokenNameSEMICOLON	
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:930:9: ( V A R I N T ) 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:930:9: ( V A R I N T ) 
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:930:16: V A R I N T 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:930:16: V A R I N T 
{	TokenNameLBRACE	
mV	TokenNameIdentifier	 m V
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mA	TokenNameIdentifier	 m A
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mR	TokenNameIdentifier	 m R
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mI	TokenNameIdentifier	 m I
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mN	TokenNameIdentifier	 m N
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mT	TokenNameIdentifier	 m T
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
_type	TokenNameIdentifier	 type
;	TokenNameSEMICOLON	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
channel	TokenNameIdentifier	 channel
=	TokenNameEQUAL	
_channel	TokenNameIdentifier	 channel
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
finally	TokenNamefinally	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// $ANTLR end "K_VARINT" 	TokenNameCOMMENT_LINE	$ANTLR end "K_VARINT" 
// $ANTLR start "K_TIMEUUID" 	TokenNameCOMMENT_LINE	$ANTLR start "K_TIMEUUID" 
public	TokenNamepublic	
final	TokenNamefinal	
void	TokenNamevoid	
mK_TIMEUUID	TokenNameIdentifier	 m K  TIMEUUID
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
RecognitionException	TokenNameIdentifier	 Recognition Exception
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
int	TokenNameint	
_type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
K_TIMEUUID	TokenNameIdentifier	 K  TIMEUUID
;	TokenNameSEMICOLON	
int	TokenNameint	
_channel	TokenNameIdentifier	 channel
=	TokenNameEQUAL	
DEFAULT_TOKEN_CHANNEL	TokenNameIdentifier	 DEFAULT  TOKEN  CHANNEL
;	TokenNameSEMICOLON	
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:931:11: ( T I M E U U I D ) 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:931:11: ( T I M E U U I D ) 
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:931:16: T I M E U U I D 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:931:16: T I M E U U I D 
{	TokenNameLBRACE	
mT	TokenNameIdentifier	 m T
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mI	TokenNameIdentifier	 m I
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mM	TokenNameIdentifier	 m M
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mE	TokenNameIdentifier	 m E
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mU	TokenNameIdentifier	 m U
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mU	TokenNameIdentifier	 m U
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mI	TokenNameIdentifier	 m I
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mD	TokenNameIdentifier	 m D
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
_type	TokenNameIdentifier	 type
;	TokenNameSEMICOLON	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
channel	TokenNameIdentifier	 channel
=	TokenNameEQUAL	
_channel	TokenNameIdentifier	 channel
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
finally	TokenNamefinally	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// $ANTLR end "K_TIMEUUID" 	TokenNameCOMMENT_LINE	$ANTLR end "K_TIMEUUID" 
// $ANTLR start "K_TOKEN" 	TokenNameCOMMENT_LINE	$ANTLR start "K_TOKEN" 
public	TokenNamepublic	
final	TokenNamefinal	
void	TokenNamevoid	
mK_TOKEN	TokenNameIdentifier	 m K  TOKEN
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
RecognitionException	TokenNameIdentifier	 Recognition Exception
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
int	TokenNameint	
_type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
K_TOKEN	TokenNameIdentifier	 K  TOKEN
;	TokenNameSEMICOLON	
int	TokenNameint	
_channel	TokenNameIdentifier	 channel
=	TokenNameEQUAL	
DEFAULT_TOKEN_CHANNEL	TokenNameIdentifier	 DEFAULT  TOKEN  CHANNEL
;	TokenNameSEMICOLON	
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:932:8: ( T O K E N ) 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:932:8: ( T O K E N ) 
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:932:16: T O K E N 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:932:16: T O K E N 
{	TokenNameLBRACE	
mT	TokenNameIdentifier	 m T
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mO	TokenNameIdentifier	 m O
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mK	TokenNameIdentifier	 m K
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mE	TokenNameIdentifier	 m E
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mN	TokenNameIdentifier	 m N
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
_type	TokenNameIdentifier	 type
;	TokenNameSEMICOLON	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
channel	TokenNameIdentifier	 channel
=	TokenNameEQUAL	
_channel	TokenNameIdentifier	 channel
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
finally	TokenNamefinally	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// $ANTLR end "K_TOKEN" 	TokenNameCOMMENT_LINE	$ANTLR end "K_TOKEN" 
// $ANTLR start "K_WRITETIME" 	TokenNameCOMMENT_LINE	$ANTLR start "K_WRITETIME" 
public	TokenNamepublic	
final	TokenNamefinal	
void	TokenNamevoid	
mK_WRITETIME	TokenNameIdentifier	 m K  WRITETIME
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
RecognitionException	TokenNameIdentifier	 Recognition Exception
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
int	TokenNameint	
_type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
K_WRITETIME	TokenNameIdentifier	 K  WRITETIME
;	TokenNameSEMICOLON	
int	TokenNameint	
_channel	TokenNameIdentifier	 channel
=	TokenNameEQUAL	
DEFAULT_TOKEN_CHANNEL	TokenNameIdentifier	 DEFAULT  TOKEN  CHANNEL
;	TokenNameSEMICOLON	
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:933:12: ( W R I T E T I M E ) 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:933:12: ( W R I T E T I M E ) 
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:933:16: W R I T E T I M E 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:933:16: W R I T E T I M E 
{	TokenNameLBRACE	
mW	TokenNameIdentifier	 m W
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mR	TokenNameIdentifier	 m R
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mI	TokenNameIdentifier	 m I
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mT	TokenNameIdentifier	 m T
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mE	TokenNameIdentifier	 m E
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mT	TokenNameIdentifier	 m T
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mI	TokenNameIdentifier	 m I
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mM	TokenNameIdentifier	 m M
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mE	TokenNameIdentifier	 m E
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
_type	TokenNameIdentifier	 type
;	TokenNameSEMICOLON	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
channel	TokenNameIdentifier	 channel
=	TokenNameEQUAL	
_channel	TokenNameIdentifier	 channel
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
finally	TokenNamefinally	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// $ANTLR end "K_WRITETIME" 	TokenNameCOMMENT_LINE	$ANTLR end "K_WRITETIME" 
// $ANTLR start "K_MAP" 	TokenNameCOMMENT_LINE	$ANTLR start "K_MAP" 
public	TokenNamepublic	
final	TokenNamefinal	
void	TokenNamevoid	
mK_MAP	TokenNameIdentifier	 m K  MAP
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
RecognitionException	TokenNameIdentifier	 Recognition Exception
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
int	TokenNameint	
_type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
K_MAP	TokenNameIdentifier	 K  MAP
;	TokenNameSEMICOLON	
int	TokenNameint	
_channel	TokenNameIdentifier	 channel
=	TokenNameEQUAL	
DEFAULT_TOKEN_CHANNEL	TokenNameIdentifier	 DEFAULT  TOKEN  CHANNEL
;	TokenNameSEMICOLON	
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:935:6: ( M A P ) 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:935:6: ( M A P ) 
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:935:16: M A P 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:935:16: M A P 
{	TokenNameLBRACE	
mM	TokenNameIdentifier	 m M
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mA	TokenNameIdentifier	 m A
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mP	TokenNameIdentifier	 m P
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
_type	TokenNameIdentifier	 type
;	TokenNameSEMICOLON	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
channel	TokenNameIdentifier	 channel
=	TokenNameEQUAL	
_channel	TokenNameIdentifier	 channel
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
finally	TokenNamefinally	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// $ANTLR end "K_MAP" 	TokenNameCOMMENT_LINE	$ANTLR end "K_MAP" 
// $ANTLR start "K_LIST" 	TokenNameCOMMENT_LINE	$ANTLR start "K_LIST" 
public	TokenNamepublic	
final	TokenNamefinal	
void	TokenNamevoid	
mK_LIST	TokenNameIdentifier	 m K  LIST
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
RecognitionException	TokenNameIdentifier	 Recognition Exception
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
int	TokenNameint	
_type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
K_LIST	TokenNameIdentifier	 K  LIST
;	TokenNameSEMICOLON	
int	TokenNameint	
_channel	TokenNameIdentifier	 channel
=	TokenNameEQUAL	
DEFAULT_TOKEN_CHANNEL	TokenNameIdentifier	 DEFAULT  TOKEN  CHANNEL
;	TokenNameSEMICOLON	
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:936:7: ( L I S T ) 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:936:7: ( L I S T ) 
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:936:16: L I S T 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:936:16: L I S T 
{	TokenNameLBRACE	
mL	TokenNameIdentifier	 m L
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mI	TokenNameIdentifier	 m I
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mS	TokenNameIdentifier	 m S
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mT	TokenNameIdentifier	 m T
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
_type	TokenNameIdentifier	 type
;	TokenNameSEMICOLON	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
channel	TokenNameIdentifier	 channel
=	TokenNameEQUAL	
_channel	TokenNameIdentifier	 channel
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
finally	TokenNamefinally	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// $ANTLR end "K_LIST" 	TokenNameCOMMENT_LINE	$ANTLR end "K_LIST" 
// $ANTLR start "K_TRUE" 	TokenNameCOMMENT_LINE	$ANTLR start "K_TRUE" 
public	TokenNamepublic	
final	TokenNamefinal	
void	TokenNamevoid	
mK_TRUE	TokenNameIdentifier	 m K  TRUE
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
RecognitionException	TokenNameIdentifier	 Recognition Exception
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
int	TokenNameint	
_type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
K_TRUE	TokenNameIdentifier	 K  TRUE
;	TokenNameSEMICOLON	
int	TokenNameint	
_channel	TokenNameIdentifier	 channel
=	TokenNameEQUAL	
DEFAULT_TOKEN_CHANNEL	TokenNameIdentifier	 DEFAULT  TOKEN  CHANNEL
;	TokenNameSEMICOLON	
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:938:7: ( T R U E ) 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:938:7: ( T R U E ) 
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:938:16: T R U E 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:938:16: T R U E 
{	TokenNameLBRACE	
mT	TokenNameIdentifier	 m T
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mR	TokenNameIdentifier	 m R
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mU	TokenNameIdentifier	 m U
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mE	TokenNameIdentifier	 m E
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
_type	TokenNameIdentifier	 type
;	TokenNameSEMICOLON	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
channel	TokenNameIdentifier	 channel
=	TokenNameEQUAL	
_channel	TokenNameIdentifier	 channel
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
finally	TokenNamefinally	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// $ANTLR end "K_TRUE" 	TokenNameCOMMENT_LINE	$ANTLR end "K_TRUE" 
// $ANTLR start "K_FALSE" 	TokenNameCOMMENT_LINE	$ANTLR start "K_FALSE" 
public	TokenNamepublic	
final	TokenNamefinal	
void	TokenNamevoid	
mK_FALSE	TokenNameIdentifier	 m K  FALSE
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
RecognitionException	TokenNameIdentifier	 Recognition Exception
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
int	TokenNameint	
_type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
K_FALSE	TokenNameIdentifier	 K  FALSE
;	TokenNameSEMICOLON	
int	TokenNameint	
_channel	TokenNameIdentifier	 channel
=	TokenNameEQUAL	
DEFAULT_TOKEN_CHANNEL	TokenNameIdentifier	 DEFAULT  TOKEN  CHANNEL
;	TokenNameSEMICOLON	
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:939:8: ( F A L S E ) 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:939:8: ( F A L S E ) 
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:939:16: F A L S E 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:939:16: F A L S E 
{	TokenNameLBRACE	
mF	TokenNameIdentifier	 m F
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mA	TokenNameIdentifier	 m A
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mL	TokenNameIdentifier	 m L
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mS	TokenNameIdentifier	 m S
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mE	TokenNameIdentifier	 m E
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
_type	TokenNameIdentifier	 type
;	TokenNameSEMICOLON	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
channel	TokenNameIdentifier	 channel
=	TokenNameEQUAL	
_channel	TokenNameIdentifier	 channel
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
finally	TokenNamefinally	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// $ANTLR end "K_FALSE" 	TokenNameCOMMENT_LINE	$ANTLR end "K_FALSE" 
// $ANTLR start "A" 	TokenNameCOMMENT_LINE	$ANTLR start "A" 
public	TokenNamepublic	
final	TokenNamefinal	
void	TokenNamevoid	
mA	TokenNameIdentifier	 m A
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
RecognitionException	TokenNameIdentifier	 Recognition Exception
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:942:11: ( ( 'a' | 'A' ) ) 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:942:11: ( ( 'a' | 'A' ) ) 
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:942:13: ( 'a' | 'A' ) 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:942:13: ( 'a' | 'A' ) 
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
input	TokenNameIdentifier	 input
.	TokenNameDOT	
LA	TokenNameIdentifier	 LA
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
'A'	TokenNameCharacterLiteral	
||	TokenNameOR_OR	
input	TokenNameIdentifier	 input
.	TokenNameDOT	
LA	TokenNameIdentifier	 LA
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
'a'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
input	TokenNameIdentifier	 input
.	TokenNameDOT	
consume	TokenNameIdentifier	 consume
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
MismatchedSetException	TokenNameIdentifier	 Mismatched Set Exception
mse	TokenNameIdentifier	 mse
=	TokenNameEQUAL	
new	TokenNamenew	
MismatchedSetException	TokenNameIdentifier	 Mismatched Set Exception
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
input	TokenNameIdentifier	 input
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
recover	TokenNameIdentifier	 recover
(	TokenNameLPAREN	
mse	TokenNameIdentifier	 mse
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
throw	TokenNamethrow	
mse	TokenNameIdentifier	 mse
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
finally	TokenNamefinally	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// $ANTLR end "A" 	TokenNameCOMMENT_LINE	$ANTLR end "A" 
// $ANTLR start "B" 	TokenNameCOMMENT_LINE	$ANTLR start "B" 
public	TokenNamepublic	
final	TokenNamefinal	
void	TokenNamevoid	
mB	TokenNameIdentifier	 m B
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
RecognitionException	TokenNameIdentifier	 Recognition Exception
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:943:11: ( ( 'b' | 'B' ) ) 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:943:11: ( ( 'b' | 'B' ) ) 
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:943:13: ( 'b' | 'B' ) 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:943:13: ( 'b' | 'B' ) 
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
input	TokenNameIdentifier	 input
.	TokenNameDOT	
LA	TokenNameIdentifier	 LA
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
'B'	TokenNameCharacterLiteral	
||	TokenNameOR_OR	
input	TokenNameIdentifier	 input
.	TokenNameDOT	
LA	TokenNameIdentifier	 LA
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
'b'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
input	TokenNameIdentifier	 input
.	TokenNameDOT	
consume	TokenNameIdentifier	 consume
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
MismatchedSetException	TokenNameIdentifier	 Mismatched Set Exception
mse	TokenNameIdentifier	 mse
=	TokenNameEQUAL	
new	TokenNamenew	
MismatchedSetException	TokenNameIdentifier	 Mismatched Set Exception
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
input	TokenNameIdentifier	 input
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
recover	TokenNameIdentifier	 recover
(	TokenNameLPAREN	
mse	TokenNameIdentifier	 mse
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
throw	TokenNamethrow	
mse	TokenNameIdentifier	 mse
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
finally	TokenNamefinally	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// $ANTLR end "B" 	TokenNameCOMMENT_LINE	$ANTLR end "B" 
// $ANTLR start "C" 	TokenNameCOMMENT_LINE	$ANTLR start "C" 
public	TokenNamepublic	
final	TokenNamefinal	
void	TokenNamevoid	
mC	TokenNameIdentifier	 m C
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
RecognitionException	TokenNameIdentifier	 Recognition Exception
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:944:11: ( ( 'c' | 'C' ) ) 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:944:11: ( ( 'c' | 'C' ) ) 
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:944:13: ( 'c' | 'C' ) 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:944:13: ( 'c' | 'C' ) 
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
input	TokenNameIdentifier	 input
.	TokenNameDOT	
LA	TokenNameIdentifier	 LA
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
'C'	TokenNameCharacterLiteral	
||	TokenNameOR_OR	
input	TokenNameIdentifier	 input
.	TokenNameDOT	
LA	TokenNameIdentifier	 LA
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
'c'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
input	TokenNameIdentifier	 input
.	TokenNameDOT	
consume	TokenNameIdentifier	 consume
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
MismatchedSetException	TokenNameIdentifier	 Mismatched Set Exception
mse	TokenNameIdentifier	 mse
=	TokenNameEQUAL	
new	TokenNamenew	
MismatchedSetException	TokenNameIdentifier	 Mismatched Set Exception
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
input	TokenNameIdentifier	 input
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
recover	TokenNameIdentifier	 recover
(	TokenNameLPAREN	
mse	TokenNameIdentifier	 mse
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
throw	TokenNamethrow	
mse	TokenNameIdentifier	 mse
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
finally	TokenNamefinally	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// $ANTLR end "C" 	TokenNameCOMMENT_LINE	$ANTLR end "C" 
// $ANTLR start "D" 	TokenNameCOMMENT_LINE	$ANTLR start "D" 
public	TokenNamepublic	
final	TokenNamefinal	
void	TokenNamevoid	
mD	TokenNameIdentifier	 m D
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
RecognitionException	TokenNameIdentifier	 Recognition Exception
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:945:11: ( ( 'd' | 'D' ) ) 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:945:11: ( ( 'd' | 'D' ) ) 
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:945:13: ( 'd' | 'D' ) 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:945:13: ( 'd' | 'D' ) 
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
input	TokenNameIdentifier	 input
.	TokenNameDOT	
LA	TokenNameIdentifier	 LA
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
'D'	TokenNameCharacterLiteral	
||	TokenNameOR_OR	
input	TokenNameIdentifier	 input
.	TokenNameDOT	
LA	TokenNameIdentifier	 LA
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
'd'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
input	TokenNameIdentifier	 input
.	TokenNameDOT	
consume	TokenNameIdentifier	 consume
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
MismatchedSetException	TokenNameIdentifier	 Mismatched Set Exception
mse	TokenNameIdentifier	 mse
=	TokenNameEQUAL	
new	TokenNamenew	
MismatchedSetException	TokenNameIdentifier	 Mismatched Set Exception
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
input	TokenNameIdentifier	 input
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
recover	TokenNameIdentifier	 recover
(	TokenNameLPAREN	
mse	TokenNameIdentifier	 mse
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
throw	TokenNamethrow	
mse	TokenNameIdentifier	 mse
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
finally	TokenNamefinally	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// $ANTLR end "D" 	TokenNameCOMMENT_LINE	$ANTLR end "D" 
// $ANTLR start "E" 	TokenNameCOMMENT_LINE	$ANTLR start "E" 
public	TokenNamepublic	
final	TokenNamefinal	
void	TokenNamevoid	
mE	TokenNameIdentifier	 m E
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
RecognitionException	TokenNameIdentifier	 Recognition Exception
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:946:11: ( ( 'e' | 'E' ) ) 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:946:11: ( ( 'e' | 'E' ) ) 
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:946:13: ( 'e' | 'E' ) 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:946:13: ( 'e' | 'E' ) 
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
input	TokenNameIdentifier	 input
.	TokenNameDOT	
LA	TokenNameIdentifier	 LA
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
'E'	TokenNameCharacterLiteral	
||	TokenNameOR_OR	
input	TokenNameIdentifier	 input
.	TokenNameDOT	
LA	TokenNameIdentifier	 LA
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
'e'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
input	TokenNameIdentifier	 input
.	TokenNameDOT	
consume	TokenNameIdentifier	 consume
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
MismatchedSetException	TokenNameIdentifier	 Mismatched Set Exception
mse	TokenNameIdentifier	 mse
=	TokenNameEQUAL	
new	TokenNamenew	
MismatchedSetException	TokenNameIdentifier	 Mismatched Set Exception
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
input	TokenNameIdentifier	 input
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
recover	TokenNameIdentifier	 recover
(	TokenNameLPAREN	
mse	TokenNameIdentifier	 mse
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
throw	TokenNamethrow	
mse	TokenNameIdentifier	 mse
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
finally	TokenNamefinally	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// $ANTLR end "E" 	TokenNameCOMMENT_LINE	$ANTLR end "E" 
// $ANTLR start "F" 	TokenNameCOMMENT_LINE	$ANTLR start "F" 
public	TokenNamepublic	
final	TokenNamefinal	
void	TokenNamevoid	
mF	TokenNameIdentifier	 m F
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
RecognitionException	TokenNameIdentifier	 Recognition Exception
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:947:11: ( ( 'f' | 'F' ) ) 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:947:11: ( ( 'f' | 'F' ) ) 
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:947:13: ( 'f' | 'F' ) 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:947:13: ( 'f' | 'F' ) 
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
input	TokenNameIdentifier	 input
.	TokenNameDOT	
LA	TokenNameIdentifier	 LA
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
'F'	TokenNameCharacterLiteral	
||	TokenNameOR_OR	
input	TokenNameIdentifier	 input
.	TokenNameDOT	
LA	TokenNameIdentifier	 LA
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
'f'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
input	TokenNameIdentifier	 input
.	TokenNameDOT	
consume	TokenNameIdentifier	 consume
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
MismatchedSetException	TokenNameIdentifier	 Mismatched Set Exception
mse	TokenNameIdentifier	 mse
=	TokenNameEQUAL	
new	TokenNamenew	
MismatchedSetException	TokenNameIdentifier	 Mismatched Set Exception
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
input	TokenNameIdentifier	 input
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
recover	TokenNameIdentifier	 recover
(	TokenNameLPAREN	
mse	TokenNameIdentifier	 mse
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
throw	TokenNamethrow	
mse	TokenNameIdentifier	 mse
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
finally	TokenNamefinally	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// $ANTLR end "F" 	TokenNameCOMMENT_LINE	$ANTLR end "F" 
// $ANTLR start "G" 	TokenNameCOMMENT_LINE	$ANTLR start "G" 
public	TokenNamepublic	
final	TokenNamefinal	
void	TokenNamevoid	
mG	TokenNameIdentifier	 m G
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
RecognitionException	TokenNameIdentifier	 Recognition Exception
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:948:11: ( ( 'g' | 'G' ) ) 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:948:11: ( ( 'g' | 'G' ) ) 
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:948:13: ( 'g' | 'G' ) 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:948:13: ( 'g' | 'G' ) 
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
input	TokenNameIdentifier	 input
.	TokenNameDOT	
LA	TokenNameIdentifier	 LA
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
'G'	TokenNameCharacterLiteral	
||	TokenNameOR_OR	
input	TokenNameIdentifier	 input
.	TokenNameDOT	
LA	TokenNameIdentifier	 LA
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
'g'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
input	TokenNameIdentifier	 input
.	TokenNameDOT	
consume	TokenNameIdentifier	 consume
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
MismatchedSetException	TokenNameIdentifier	 Mismatched Set Exception
mse	TokenNameIdentifier	 mse
=	TokenNameEQUAL	
new	TokenNamenew	
MismatchedSetException	TokenNameIdentifier	 Mismatched Set Exception
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
input	TokenNameIdentifier	 input
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
recover	TokenNameIdentifier	 recover
(	TokenNameLPAREN	
mse	TokenNameIdentifier	 mse
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
throw	TokenNamethrow	
mse	TokenNameIdentifier	 mse
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
finally	TokenNamefinally	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// $ANTLR end "G" 	TokenNameCOMMENT_LINE	$ANTLR end "G" 
// $ANTLR start "H" 	TokenNameCOMMENT_LINE	$ANTLR start "H" 
public	TokenNamepublic	
final	TokenNamefinal	
void	TokenNamevoid	
mH	TokenNameIdentifier	 m H
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
RecognitionException	TokenNameIdentifier	 Recognition Exception
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:949:11: ( ( 'h' | 'H' ) ) 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:949:11: ( ( 'h' | 'H' ) ) 
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:949:13: ( 'h' | 'H' ) 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:949:13: ( 'h' | 'H' ) 
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
input	TokenNameIdentifier	 input
.	TokenNameDOT	
LA	TokenNameIdentifier	 LA
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
'H'	TokenNameCharacterLiteral	
||	TokenNameOR_OR	
input	TokenNameIdentifier	 input
.	TokenNameDOT	
LA	TokenNameIdentifier	 LA
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
'h'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
input	TokenNameIdentifier	 input
.	TokenNameDOT	
consume	TokenNameIdentifier	 consume
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
MismatchedSetException	TokenNameIdentifier	 Mismatched Set Exception
mse	TokenNameIdentifier	 mse
=	TokenNameEQUAL	
new	TokenNamenew	
MismatchedSetException	TokenNameIdentifier	 Mismatched Set Exception
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
input	TokenNameIdentifier	 input
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
recover	TokenNameIdentifier	 recover
(	TokenNameLPAREN	
mse	TokenNameIdentifier	 mse
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
throw	TokenNamethrow	
mse	TokenNameIdentifier	 mse
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
finally	TokenNamefinally	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// $ANTLR end "H" 	TokenNameCOMMENT_LINE	$ANTLR end "H" 
// $ANTLR start "I" 	TokenNameCOMMENT_LINE	$ANTLR start "I" 
public	TokenNamepublic	
final	TokenNamefinal	
void	TokenNamevoid	
mI	TokenNameIdentifier	 m I
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
RecognitionException	TokenNameIdentifier	 Recognition Exception
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:950:11: ( ( 'i' | 'I' ) ) 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:950:11: ( ( 'i' | 'I' ) ) 
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:950:13: ( 'i' | 'I' ) 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:950:13: ( 'i' | 'I' ) 
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
input	TokenNameIdentifier	 input
.	TokenNameDOT	
LA	TokenNameIdentifier	 LA
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
'I'	TokenNameCharacterLiteral	
||	TokenNameOR_OR	
input	TokenNameIdentifier	 input
.	TokenNameDOT	
LA	TokenNameIdentifier	 LA
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
'i'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
input	TokenNameIdentifier	 input
.	TokenNameDOT	
consume	TokenNameIdentifier	 consume
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
MismatchedSetException	TokenNameIdentifier	 Mismatched Set Exception
mse	TokenNameIdentifier	 mse
=	TokenNameEQUAL	
new	TokenNamenew	
MismatchedSetException	TokenNameIdentifier	 Mismatched Set Exception
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
input	TokenNameIdentifier	 input
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
recover	TokenNameIdentifier	 recover
(	TokenNameLPAREN	
mse	TokenNameIdentifier	 mse
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
throw	TokenNamethrow	
mse	TokenNameIdentifier	 mse
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
finally	TokenNamefinally	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// $ANTLR end "I" 	TokenNameCOMMENT_LINE	$ANTLR end "I" 
// $ANTLR start "J" 	TokenNameCOMMENT_LINE	$ANTLR start "J" 
public	TokenNamepublic	
final	TokenNamefinal	
void	TokenNamevoid	
mJ	TokenNameIdentifier	 m J
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
RecognitionException	TokenNameIdentifier	 Recognition Exception
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:951:11: ( ( 'j' | 'J' ) ) 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:951:11: ( ( 'j' | 'J' ) ) 
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:951:13: ( 'j' | 'J' ) 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:951:13: ( 'j' | 'J' ) 
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
input	TokenNameIdentifier	 input
.	TokenNameDOT	
LA	TokenNameIdentifier	 LA
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
'J'	TokenNameCharacterLiteral	
||	TokenNameOR_OR	
input	TokenNameIdentifier	 input
.	TokenNameDOT	
LA	TokenNameIdentifier	 LA
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
'j'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
input	TokenNameIdentifier	 input
.	TokenNameDOT	
consume	TokenNameIdentifier	 consume
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
MismatchedSetException	TokenNameIdentifier	 Mismatched Set Exception
mse	TokenNameIdentifier	 mse
=	TokenNameEQUAL	
new	TokenNamenew	
MismatchedSetException	TokenNameIdentifier	 Mismatched Set Exception
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
input	TokenNameIdentifier	 input
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
recover	TokenNameIdentifier	 recover
(	TokenNameLPAREN	
mse	TokenNameIdentifier	 mse
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
throw	TokenNamethrow	
mse	TokenNameIdentifier	 mse
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
finally	TokenNamefinally	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// $ANTLR end "J" 	TokenNameCOMMENT_LINE	$ANTLR end "J" 
// $ANTLR start "K" 	TokenNameCOMMENT_LINE	$ANTLR start "K" 
public	TokenNamepublic	
final	TokenNamefinal	
void	TokenNamevoid	
mK	TokenNameIdentifier	 m K
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
RecognitionException	TokenNameIdentifier	 Recognition Exception
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:952:11: ( ( 'k' | 'K' ) ) 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:952:11: ( ( 'k' | 'K' ) ) 
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:952:13: ( 'k' | 'K' ) 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:952:13: ( 'k' | 'K' ) 
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
input	TokenNameIdentifier	 input
.	TokenNameDOT	
LA	TokenNameIdentifier	 LA
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
'K'	TokenNameCharacterLiteral	
||	TokenNameOR_OR	
input	TokenNameIdentifier	 input
.	TokenNameDOT	
LA	TokenNameIdentifier	 LA
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
'k'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
input	TokenNameIdentifier	 input
.	TokenNameDOT	
consume	TokenNameIdentifier	 consume
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
MismatchedSetException	TokenNameIdentifier	 Mismatched Set Exception
mse	TokenNameIdentifier	 mse
=	TokenNameEQUAL	
new	TokenNamenew	
MismatchedSetException	TokenNameIdentifier	 Mismatched Set Exception
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
input	TokenNameIdentifier	 input
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
recover	TokenNameIdentifier	 recover
(	TokenNameLPAREN	
mse	TokenNameIdentifier	 mse
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
throw	TokenNamethrow	
mse	TokenNameIdentifier	 mse
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
finally	TokenNamefinally	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// $ANTLR end "K" 	TokenNameCOMMENT_LINE	$ANTLR end "K" 
// $ANTLR start "L" 	TokenNameCOMMENT_LINE	$ANTLR start "L" 
public	TokenNamepublic	
final	TokenNamefinal	
void	TokenNamevoid	
mL	TokenNameIdentifier	 m L
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
RecognitionException	TokenNameIdentifier	 Recognition Exception
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:953:11: ( ( 'l' | 'L' ) ) 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:953:11: ( ( 'l' | 'L' ) ) 
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:953:13: ( 'l' | 'L' ) 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:953:13: ( 'l' | 'L' ) 
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
input	TokenNameIdentifier	 input
.	TokenNameDOT	
LA	TokenNameIdentifier	 LA
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
'L'	TokenNameCharacterLiteral	
||	TokenNameOR_OR	
input	TokenNameIdentifier	 input
.	TokenNameDOT	
LA	TokenNameIdentifier	 LA
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
'l'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
input	TokenNameIdentifier	 input
.	TokenNameDOT	
consume	TokenNameIdentifier	 consume
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
MismatchedSetException	TokenNameIdentifier	 Mismatched Set Exception
mse	TokenNameIdentifier	 mse
=	TokenNameEQUAL	
new	TokenNamenew	
MismatchedSetException	TokenNameIdentifier	 Mismatched Set Exception
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
input	TokenNameIdentifier	 input
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
recover	TokenNameIdentifier	 recover
(	TokenNameLPAREN	
mse	TokenNameIdentifier	 mse
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
throw	TokenNamethrow	
mse	TokenNameIdentifier	 mse
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
finally	TokenNamefinally	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// $ANTLR end "L" 	TokenNameCOMMENT_LINE	$ANTLR end "L" 
// $ANTLR start "M" 	TokenNameCOMMENT_LINE	$ANTLR start "M" 
public	TokenNamepublic	
final	TokenNamefinal	
void	TokenNamevoid	
mM	TokenNameIdentifier	 m M
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
RecognitionException	TokenNameIdentifier	 Recognition Exception
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:954:11: ( ( 'm' | 'M' ) ) 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:954:11: ( ( 'm' | 'M' ) ) 
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:954:13: ( 'm' | 'M' ) 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:954:13: ( 'm' | 'M' ) 
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
input	TokenNameIdentifier	 input
.	TokenNameDOT	
LA	TokenNameIdentifier	 LA
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
'M'	TokenNameCharacterLiteral	
||	TokenNameOR_OR	
input	TokenNameIdentifier	 input
.	TokenNameDOT	
LA	TokenNameIdentifier	 LA
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
'm'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
input	TokenNameIdentifier	 input
.	TokenNameDOT	
consume	TokenNameIdentifier	 consume
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
MismatchedSetException	TokenNameIdentifier	 Mismatched Set Exception
mse	TokenNameIdentifier	 mse
=	TokenNameEQUAL	
new	TokenNamenew	
MismatchedSetException	TokenNameIdentifier	 Mismatched Set Exception
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
input	TokenNameIdentifier	 input
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
recover	TokenNameIdentifier	 recover
(	TokenNameLPAREN	
mse	TokenNameIdentifier	 mse
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
throw	TokenNamethrow	
mse	TokenNameIdentifier	 mse
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
finally	TokenNamefinally	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// $ANTLR end "M" 	TokenNameCOMMENT_LINE	$ANTLR end "M" 
// $ANTLR start "N" 	TokenNameCOMMENT_LINE	$ANTLR start "N" 
public	TokenNamepublic	
final	TokenNamefinal	
void	TokenNamevoid	
mN	TokenNameIdentifier	 m N
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
RecognitionException	TokenNameIdentifier	 Recognition Exception
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:955:11: ( ( 'n' | 'N' ) ) 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:955:11: ( ( 'n' | 'N' ) ) 
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:955:13: ( 'n' | 'N' ) 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:955:13: ( 'n' | 'N' ) 
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
input	TokenNameIdentifier	 input
.	TokenNameDOT	
LA	TokenNameIdentifier	 LA
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
'N'	TokenNameCharacterLiteral	
||	TokenNameOR_OR	
input	TokenNameIdentifier	 input
.	TokenNameDOT	
LA	TokenNameIdentifier	 LA
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
'n'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
input	TokenNameIdentifier	 input
.	TokenNameDOT	
consume	TokenNameIdentifier	 consume
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
MismatchedSetException	TokenNameIdentifier	 Mismatched Set Exception
mse	TokenNameIdentifier	 mse
=	TokenNameEQUAL	
new	TokenNamenew	
MismatchedSetException	TokenNameIdentifier	 Mismatched Set Exception
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
input	TokenNameIdentifier	 input
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
recover	TokenNameIdentifier	 recover
(	TokenNameLPAREN	
mse	TokenNameIdentifier	 mse
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
throw	TokenNamethrow	
mse	TokenNameIdentifier	 mse
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
finally	TokenNamefinally	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// $ANTLR end "N" 	TokenNameCOMMENT_LINE	$ANTLR end "N" 
// $ANTLR start "O" 	TokenNameCOMMENT_LINE	$ANTLR start "O" 
public	TokenNamepublic	
final	TokenNamefinal	
void	TokenNamevoid	
mO	TokenNameIdentifier	 m O
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
RecognitionException	TokenNameIdentifier	 Recognition Exception
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:956:11: ( ( 'o' | 'O' ) ) 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:956:11: ( ( 'o' | 'O' ) ) 
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:956:13: ( 'o' | 'O' ) 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:956:13: ( 'o' | 'O' ) 
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
input	TokenNameIdentifier	 input
.	TokenNameDOT	
LA	TokenNameIdentifier	 LA
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
'O'	TokenNameCharacterLiteral	
||	TokenNameOR_OR	
input	TokenNameIdentifier	 input
.	TokenNameDOT	
LA	TokenNameIdentifier	 LA
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
'o'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
input	TokenNameIdentifier	 input
.	TokenNameDOT	
consume	TokenNameIdentifier	 consume
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
MismatchedSetException	TokenNameIdentifier	 Mismatched Set Exception
mse	TokenNameIdentifier	 mse
=	TokenNameEQUAL	
new	TokenNamenew	
MismatchedSetException	TokenNameIdentifier	 Mismatched Set Exception
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
input	TokenNameIdentifier	 input
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
recover	TokenNameIdentifier	 recover
(	TokenNameLPAREN	
mse	TokenNameIdentifier	 mse
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
throw	TokenNamethrow	
mse	TokenNameIdentifier	 mse
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
finally	TokenNamefinally	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// $ANTLR end "O" 	TokenNameCOMMENT_LINE	$ANTLR end "O" 
// $ANTLR start "P" 	TokenNameCOMMENT_LINE	$ANTLR start "P" 
public	TokenNamepublic	
final	TokenNamefinal	
void	TokenNamevoid	
mP	TokenNameIdentifier	 m P
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
RecognitionException	TokenNameIdentifier	 Recognition Exception
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:957:11: ( ( 'p' | 'P' ) ) 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:957:11: ( ( 'p' | 'P' ) ) 
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:957:13: ( 'p' | 'P' ) 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:957:13: ( 'p' | 'P' ) 
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
input	TokenNameIdentifier	 input
.	TokenNameDOT	
LA	TokenNameIdentifier	 LA
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
'P'	TokenNameCharacterLiteral	
||	TokenNameOR_OR	
input	TokenNameIdentifier	 input
.	TokenNameDOT	
LA	TokenNameIdentifier	 LA
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
'p'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
input	TokenNameIdentifier	 input
.	TokenNameDOT	
consume	TokenNameIdentifier	 consume
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
MismatchedSetException	TokenNameIdentifier	 Mismatched Set Exception
mse	TokenNameIdentifier	 mse
=	TokenNameEQUAL	
new	TokenNamenew	
MismatchedSetException	TokenNameIdentifier	 Mismatched Set Exception
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
input	TokenNameIdentifier	 input
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
recover	TokenNameIdentifier	 recover
(	TokenNameLPAREN	
mse	TokenNameIdentifier	 mse
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
throw	TokenNamethrow	
mse	TokenNameIdentifier	 mse
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
finally	TokenNamefinally	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// $ANTLR end "P" 	TokenNameCOMMENT_LINE	$ANTLR end "P" 
// $ANTLR start "Q" 	TokenNameCOMMENT_LINE	$ANTLR start "Q" 
public	TokenNamepublic	
final	TokenNamefinal	
void	TokenNamevoid	
mQ	TokenNameIdentifier	 m Q
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
RecognitionException	TokenNameIdentifier	 Recognition Exception
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:958:11: ( ( 'q' | 'Q' ) ) 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:958:11: ( ( 'q' | 'Q' ) ) 
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:958:13: ( 'q' | 'Q' ) 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:958:13: ( 'q' | 'Q' ) 
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
input	TokenNameIdentifier	 input
.	TokenNameDOT	
LA	TokenNameIdentifier	 LA
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
'Q'	TokenNameCharacterLiteral	
||	TokenNameOR_OR	
input	TokenNameIdentifier	 input
.	TokenNameDOT	
LA	TokenNameIdentifier	 LA
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
'q'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
input	TokenNameIdentifier	 input
.	TokenNameDOT	
consume	TokenNameIdentifier	 consume
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
MismatchedSetException	TokenNameIdentifier	 Mismatched Set Exception
mse	TokenNameIdentifier	 mse
=	TokenNameEQUAL	
new	TokenNamenew	
MismatchedSetException	TokenNameIdentifier	 Mismatched Set Exception
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
input	TokenNameIdentifier	 input
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
recover	TokenNameIdentifier	 recover
(	TokenNameLPAREN	
mse	TokenNameIdentifier	 mse
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
throw	TokenNamethrow	
mse	TokenNameIdentifier	 mse
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
finally	TokenNamefinally	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// $ANTLR end "Q" 	TokenNameCOMMENT_LINE	$ANTLR end "Q" 
// $ANTLR start "R" 	TokenNameCOMMENT_LINE	$ANTLR start "R" 
public	TokenNamepublic	
final	TokenNamefinal	
void	TokenNamevoid	
mR	TokenNameIdentifier	 m R
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
RecognitionException	TokenNameIdentifier	 Recognition Exception
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:959:11: ( ( 'r' | 'R' ) ) 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:959:11: ( ( 'r' | 'R' ) ) 
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:959:13: ( 'r' | 'R' ) 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:959:13: ( 'r' | 'R' ) 
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
input	TokenNameIdentifier	 input
.	TokenNameDOT	
LA	TokenNameIdentifier	 LA
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
'R'	TokenNameCharacterLiteral	
||	TokenNameOR_OR	
input	TokenNameIdentifier	 input
.	TokenNameDOT	
LA	TokenNameIdentifier	 LA
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
'r'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
input	TokenNameIdentifier	 input
.	TokenNameDOT	
consume	TokenNameIdentifier	 consume
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
MismatchedSetException	TokenNameIdentifier	 Mismatched Set Exception
mse	TokenNameIdentifier	 mse
=	TokenNameEQUAL	
new	TokenNamenew	
MismatchedSetException	TokenNameIdentifier	 Mismatched Set Exception
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
input	TokenNameIdentifier	 input
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
recover	TokenNameIdentifier	 recover
(	TokenNameLPAREN	
mse	TokenNameIdentifier	 mse
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
throw	TokenNamethrow	
mse	TokenNameIdentifier	 mse
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
finally	TokenNamefinally	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// $ANTLR end "R" 	TokenNameCOMMENT_LINE	$ANTLR end "R" 
// $ANTLR start "S" 	TokenNameCOMMENT_LINE	$ANTLR start "S" 
public	TokenNamepublic	
final	TokenNamefinal	
void	TokenNamevoid	
mS	TokenNameIdentifier	 m S
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
RecognitionException	TokenNameIdentifier	 Recognition Exception
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:960:11: ( ( 's' | 'S' ) ) 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:960:11: ( ( 's' | 'S' ) ) 
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:960:13: ( 's' | 'S' ) 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:960:13: ( 's' | 'S' ) 
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
input	TokenNameIdentifier	 input
.	TokenNameDOT	
LA	TokenNameIdentifier	 LA
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
'S'	TokenNameCharacterLiteral	
||	TokenNameOR_OR	
input	TokenNameIdentifier	 input
.	TokenNameDOT	
LA	TokenNameIdentifier	 LA
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
's'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
input	TokenNameIdentifier	 input
.	TokenNameDOT	
consume	TokenNameIdentifier	 consume
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
MismatchedSetException	TokenNameIdentifier	 Mismatched Set Exception
mse	TokenNameIdentifier	 mse
=	TokenNameEQUAL	
new	TokenNamenew	
MismatchedSetException	TokenNameIdentifier	 Mismatched Set Exception
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
input	TokenNameIdentifier	 input
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
recover	TokenNameIdentifier	 recover
(	TokenNameLPAREN	
mse	TokenNameIdentifier	 mse
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
throw	TokenNamethrow	
mse	TokenNameIdentifier	 mse
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
finally	TokenNamefinally	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// $ANTLR end "S" 	TokenNameCOMMENT_LINE	$ANTLR end "S" 
// $ANTLR start "T" 	TokenNameCOMMENT_LINE	$ANTLR start "T" 
public	TokenNamepublic	
final	TokenNamefinal	
void	TokenNamevoid	
mT	TokenNameIdentifier	 m T
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
RecognitionException	TokenNameIdentifier	 Recognition Exception
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:961:11: ( ( 't' | 'T' ) ) 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:961:11: ( ( 't' | 'T' ) ) 
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:961:13: ( 't' | 'T' ) 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:961:13: ( 't' | 'T' ) 
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
input	TokenNameIdentifier	 input
.	TokenNameDOT	
LA	TokenNameIdentifier	 LA
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
'T'	TokenNameCharacterLiteral	
||	TokenNameOR_OR	
input	TokenNameIdentifier	 input
.	TokenNameDOT	
LA	TokenNameIdentifier	 LA
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
't'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
input	TokenNameIdentifier	 input
.	TokenNameDOT	
consume	TokenNameIdentifier	 consume
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
MismatchedSetException	TokenNameIdentifier	 Mismatched Set Exception
mse	TokenNameIdentifier	 mse
=	TokenNameEQUAL	
new	TokenNamenew	
MismatchedSetException	TokenNameIdentifier	 Mismatched Set Exception
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
input	TokenNameIdentifier	 input
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
recover	TokenNameIdentifier	 recover
(	TokenNameLPAREN	
mse	TokenNameIdentifier	 mse
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
throw	TokenNamethrow	
mse	TokenNameIdentifier	 mse
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
finally	TokenNamefinally	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// $ANTLR end "T" 	TokenNameCOMMENT_LINE	$ANTLR end "T" 
// $ANTLR start "U" 	TokenNameCOMMENT_LINE	$ANTLR start "U" 
public	TokenNamepublic	
final	TokenNamefinal	
void	TokenNamevoid	
mU	TokenNameIdentifier	 m U
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
RecognitionException	TokenNameIdentifier	 Recognition Exception
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:962:11: ( ( 'u' | 'U' ) ) 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:962:11: ( ( 'u' | 'U' ) ) 
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:962:13: ( 'u' | 'U' ) 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:962:13: ( 'u' | 'U' ) 
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
input	TokenNameIdentifier	 input
.	TokenNameDOT	
LA	TokenNameIdentifier	 LA
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
'U'	TokenNameCharacterLiteral	
||	TokenNameOR_OR	
input	TokenNameIdentifier	 input
.	TokenNameDOT	
LA	TokenNameIdentifier	 LA
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
'u'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
input	TokenNameIdentifier	 input
.	TokenNameDOT	
consume	TokenNameIdentifier	 consume
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
MismatchedSetException	TokenNameIdentifier	 Mismatched Set Exception
mse	TokenNameIdentifier	 mse
=	TokenNameEQUAL	
new	TokenNamenew	
MismatchedSetException	TokenNameIdentifier	 Mismatched Set Exception
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
input	TokenNameIdentifier	 input
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
recover	TokenNameIdentifier	 recover
(	TokenNameLPAREN	
mse	TokenNameIdentifier	 mse
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
throw	TokenNamethrow	
mse	TokenNameIdentifier	 mse
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
finally	TokenNamefinally	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// $ANTLR end "U" 	TokenNameCOMMENT_LINE	$ANTLR end "U" 
// $ANTLR start "V" 	TokenNameCOMMENT_LINE	$ANTLR start "V" 
public	TokenNamepublic	
final	TokenNamefinal	
void	TokenNamevoid	
mV	TokenNameIdentifier	 m V
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
RecognitionException	TokenNameIdentifier	 Recognition Exception
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:963:11: ( ( 'v' | 'V' ) ) 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:963:11: ( ( 'v' | 'V' ) ) 
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:963:13: ( 'v' | 'V' ) 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:963:13: ( 'v' | 'V' ) 
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
input	TokenNameIdentifier	 input
.	TokenNameDOT	
LA	TokenNameIdentifier	 LA
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
'V'	TokenNameCharacterLiteral	
||	TokenNameOR_OR	
input	TokenNameIdentifier	 input
.	TokenNameDOT	
LA	TokenNameIdentifier	 LA
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
'v'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
input	TokenNameIdentifier	 input
.	TokenNameDOT	
consume	TokenNameIdentifier	 consume
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
MismatchedSetException	TokenNameIdentifier	 Mismatched Set Exception
mse	TokenNameIdentifier	 mse
=	TokenNameEQUAL	
new	TokenNamenew	
MismatchedSetException	TokenNameIdentifier	 Mismatched Set Exception
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
input	TokenNameIdentifier	 input
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
recover	TokenNameIdentifier	 recover
(	TokenNameLPAREN	
mse	TokenNameIdentifier	 mse
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
throw	TokenNamethrow	
mse	TokenNameIdentifier	 mse
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
finally	TokenNamefinally	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// $ANTLR end "V" 	TokenNameCOMMENT_LINE	$ANTLR end "V" 
// $ANTLR start "W" 	TokenNameCOMMENT_LINE	$ANTLR start "W" 
public	TokenNamepublic	
final	TokenNamefinal	
void	TokenNamevoid	
mW	TokenNameIdentifier	 m W
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
RecognitionException	TokenNameIdentifier	 Recognition Exception
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:964:11: ( ( 'w' | 'W' ) ) 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:964:11: ( ( 'w' | 'W' ) ) 
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:964:13: ( 'w' | 'W' ) 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:964:13: ( 'w' | 'W' ) 
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
input	TokenNameIdentifier	 input
.	TokenNameDOT	
LA	TokenNameIdentifier	 LA
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
'W'	TokenNameCharacterLiteral	
||	TokenNameOR_OR	
input	TokenNameIdentifier	 input
.	TokenNameDOT	
LA	TokenNameIdentifier	 LA
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
'w'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
input	TokenNameIdentifier	 input
.	TokenNameDOT	
consume	TokenNameIdentifier	 consume
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
MismatchedSetException	TokenNameIdentifier	 Mismatched Set Exception
mse	TokenNameIdentifier	 mse
=	TokenNameEQUAL	
new	TokenNamenew	
MismatchedSetException	TokenNameIdentifier	 Mismatched Set Exception
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
input	TokenNameIdentifier	 input
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
recover	TokenNameIdentifier	 recover
(	TokenNameLPAREN	
mse	TokenNameIdentifier	 mse
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
throw	TokenNamethrow	
mse	TokenNameIdentifier	 mse
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
finally	TokenNamefinally	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// $ANTLR end "W" 	TokenNameCOMMENT_LINE	$ANTLR end "W" 
// $ANTLR start "X" 	TokenNameCOMMENT_LINE	$ANTLR start "X" 
public	TokenNamepublic	
final	TokenNamefinal	
void	TokenNamevoid	
mX	TokenNameIdentifier	 m X
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
RecognitionException	TokenNameIdentifier	 Recognition Exception
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:965:11: ( ( 'x' | 'X' ) ) 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:965:11: ( ( 'x' | 'X' ) ) 
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:965:13: ( 'x' | 'X' ) 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:965:13: ( 'x' | 'X' ) 
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
input	TokenNameIdentifier	 input
.	TokenNameDOT	
LA	TokenNameIdentifier	 LA
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
'X'	TokenNameCharacterLiteral	
||	TokenNameOR_OR	
input	TokenNameIdentifier	 input
.	TokenNameDOT	
LA	TokenNameIdentifier	 LA
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
'x'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
input	TokenNameIdentifier	 input
.	TokenNameDOT	
consume	TokenNameIdentifier	 consume
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
MismatchedSetException	TokenNameIdentifier	 Mismatched Set Exception
mse	TokenNameIdentifier	 mse
=	TokenNameEQUAL	
new	TokenNamenew	
MismatchedSetException	TokenNameIdentifier	 Mismatched Set Exception
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
input	TokenNameIdentifier	 input
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
recover	TokenNameIdentifier	 recover
(	TokenNameLPAREN	
mse	TokenNameIdentifier	 mse
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
throw	TokenNamethrow	
mse	TokenNameIdentifier	 mse
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
finally	TokenNamefinally	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// $ANTLR end "X" 	TokenNameCOMMENT_LINE	$ANTLR end "X" 
// $ANTLR start "Y" 	TokenNameCOMMENT_LINE	$ANTLR start "Y" 
public	TokenNamepublic	
final	TokenNamefinal	
void	TokenNamevoid	
mY	TokenNameIdentifier	 m Y
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
RecognitionException	TokenNameIdentifier	 Recognition Exception
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:966:11: ( ( 'y' | 'Y' ) ) 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:966:11: ( ( 'y' | 'Y' ) ) 
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:966:13: ( 'y' | 'Y' ) 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:966:13: ( 'y' | 'Y' ) 
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
input	TokenNameIdentifier	 input
.	TokenNameDOT	
LA	TokenNameIdentifier	 LA
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
'Y'	TokenNameCharacterLiteral	
||	TokenNameOR_OR	
input	TokenNameIdentifier	 input
.	TokenNameDOT	
LA	TokenNameIdentifier	 LA
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
'y'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
input	TokenNameIdentifier	 input
.	TokenNameDOT	
consume	TokenNameIdentifier	 consume
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
MismatchedSetException	TokenNameIdentifier	 Mismatched Set Exception
mse	TokenNameIdentifier	 mse
=	TokenNameEQUAL	
new	TokenNamenew	
MismatchedSetException	TokenNameIdentifier	 Mismatched Set Exception
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
input	TokenNameIdentifier	 input
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
recover	TokenNameIdentifier	 recover
(	TokenNameLPAREN	
mse	TokenNameIdentifier	 mse
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
throw	TokenNamethrow	
mse	TokenNameIdentifier	 mse
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
finally	TokenNamefinally	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// $ANTLR end "Y" 	TokenNameCOMMENT_LINE	$ANTLR end "Y" 
// $ANTLR start "Z" 	TokenNameCOMMENT_LINE	$ANTLR start "Z" 
public	TokenNamepublic	
final	TokenNamefinal	
void	TokenNamevoid	
mZ	TokenNameIdentifier	 m Z
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
RecognitionException	TokenNameIdentifier	 Recognition Exception
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:967:11: ( ( 'z' | 'Z' ) ) 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:967:11: ( ( 'z' | 'Z' ) ) 
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:967:13: ( 'z' | 'Z' ) 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:967:13: ( 'z' | 'Z' ) 
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
input	TokenNameIdentifier	 input
.	TokenNameDOT	
LA	TokenNameIdentifier	 LA
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
'Z'	TokenNameCharacterLiteral	
||	TokenNameOR_OR	
input	TokenNameIdentifier	 input
.	TokenNameDOT	
LA	TokenNameIdentifier	 LA
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
'z'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
input	TokenNameIdentifier	 input
.	TokenNameDOT	
consume	TokenNameIdentifier	 consume
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
MismatchedSetException	TokenNameIdentifier	 Mismatched Set Exception
mse	TokenNameIdentifier	 mse
=	TokenNameEQUAL	
new	TokenNamenew	
MismatchedSetException	TokenNameIdentifier	 Mismatched Set Exception
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
input	TokenNameIdentifier	 input
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
recover	TokenNameIdentifier	 recover
(	TokenNameLPAREN	
mse	TokenNameIdentifier	 mse
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
throw	TokenNamethrow	
mse	TokenNameIdentifier	 mse
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
finally	TokenNamefinally	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// $ANTLR end "Z" 	TokenNameCOMMENT_LINE	$ANTLR end "Z" 
// $ANTLR start "STRING_LITERAL" 	TokenNameCOMMENT_LINE	$ANTLR start "STRING_LITERAL" 
public	TokenNamepublic	
final	TokenNamefinal	
void	TokenNamevoid	
mSTRING_LITERAL	TokenNameIdentifier	 m STRING  LITERAL
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
RecognitionException	TokenNameIdentifier	 Recognition Exception
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
int	TokenNameint	
_type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
STRING_LITERAL	TokenNameIdentifier	 STRING  LITERAL
;	TokenNameSEMICOLON	
int	TokenNameint	
_channel	TokenNameIdentifier	 channel
=	TokenNameEQUAL	
DEFAULT_TOKEN_CHANNEL	TokenNameIdentifier	 DEFAULT  TOKEN  CHANNEL
;	TokenNameSEMICOLON	
int	TokenNameint	
c	TokenNameIdentifier	 c
;	TokenNameSEMICOLON	
StringBuilder	TokenNameIdentifier	 String Builder
b	TokenNameIdentifier	 b
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuilder	TokenNameIdentifier	 String Builder
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:972:5: ( '\\'' (c=~ ( '\\'' ) | '\\'' '\\'' )* '\\'' ) 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:972:5: ( '\\'' (c=~ ( '\\'' ) | '\\'' '\\'' )* '\\'' ) 
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:972:7: '\\'' (c=~ ( '\\'' ) | '\\'' '\\'' )* '\\'' 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:972:7: '\\'' (c=~ ( '\\'' ) | '\\'' '\\'' )* '\\'' 
{	TokenNameLBRACE	
match	TokenNameIdentifier	 match
(	TokenNameLPAREN	
'\''	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:972:12: (c=~ ( '\\'' ) | '\\'' '\\'' )* 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:972:12: (c=~ ( '\\'' ) | '\\'' '\\'' )* 
loop3	TokenNameIdentifier	 loop3
:	TokenNameCOLON	
do	TokenNamedo	
{	TokenNameLBRACE	
int	TokenNameint	
alt3	TokenNameIdentifier	 alt3
=	TokenNameEQUAL	
3	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
LA3_0	TokenNameIdentifier	 L A3 0
=	TokenNameEQUAL	
input	TokenNameIdentifier	 input
.	TokenNameDOT	
LA	TokenNameIdentifier	 LA
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
LA3_0	TokenNameIdentifier	 L A3 0
==	TokenNameEQUAL_EQUAL	
'\''	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
LA3_1	TokenNameIdentifier	 L A3 1
=	TokenNameEQUAL	
input	TokenNameIdentifier	 input
.	TokenNameDOT	
LA	TokenNameIdentifier	 LA
(	TokenNameLPAREN	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
LA3_1	TokenNameIdentifier	 L A3 1
==	TokenNameEQUAL_EQUAL	
'\''	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
alt3	TokenNameIdentifier	 alt3
=	TokenNameEQUAL	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
LA3_0	TokenNameIdentifier	 L A3 0
>=	TokenNameGREATER_EQUAL	
' '	TokenNameCharacterLiteral	
&&	TokenNameAND_AND	
LA3_0	TokenNameIdentifier	 L A3 0
<=	TokenNameLESS_EQUAL	
'&'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
LA3_0	TokenNameIdentifier	 L A3 0
>=	TokenNameGREATER_EQUAL	
'('	TokenNameCharacterLiteral	
&&	TokenNameAND_AND	
LA3_0	TokenNameIdentifier	 L A3 0
<=	TokenNameLESS_EQUAL	
'?'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
alt3	TokenNameIdentifier	 alt3
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
switch	TokenNameswitch	
(	TokenNameLPAREN	
alt3	TokenNameIdentifier	 alt3
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
1	TokenNameIntegerLiteral	
:	TokenNameCOLON	
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:972:13: c=~ ( '\\'' ) 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:972:13: c=~ ( '\\'' ) 
{	TokenNameLBRACE	
c	TokenNameIdentifier	 c
=	TokenNameEQUAL	
input	TokenNameIdentifier	 input
.	TokenNameDOT	
LA	TokenNameIdentifier	 LA
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
input	TokenNameIdentifier	 input
.	TokenNameDOT	
LA	TokenNameIdentifier	 LA
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
>=	TokenNameGREATER_EQUAL	
' '	TokenNameCharacterLiteral	
&&	TokenNameAND_AND	
input	TokenNameIdentifier	 input
.	TokenNameDOT	
LA	TokenNameIdentifier	 LA
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
<=	TokenNameLESS_EQUAL	
'&'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
input	TokenNameIdentifier	 input
.	TokenNameDOT	
LA	TokenNameIdentifier	 LA
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
>=	TokenNameGREATER_EQUAL	
'('	TokenNameCharacterLiteral	
&&	TokenNameAND_AND	
input	TokenNameIdentifier	 input
.	TokenNameDOT	
LA	TokenNameIdentifier	 LA
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
<=	TokenNameLESS_EQUAL	
'?'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
input	TokenNameIdentifier	 input
.	TokenNameDOT	
consume	TokenNameIdentifier	 consume
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
MismatchedSetException	TokenNameIdentifier	 Mismatched Set Exception
mse	TokenNameIdentifier	 mse
=	TokenNameEQUAL	
new	TokenNamenew	
MismatchedSetException	TokenNameIdentifier	 Mismatched Set Exception
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
input	TokenNameIdentifier	 input
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
recover	TokenNameIdentifier	 recover
(	TokenNameLPAREN	
mse	TokenNameIdentifier	 mse
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
throw	TokenNamethrow	
mse	TokenNameIdentifier	 mse
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
b	TokenNameIdentifier	 b
.	TokenNameDOT	
appendCodePoint	TokenNameIdentifier	 append Code Point
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
2	TokenNameIntegerLiteral	
:	TokenNameCOLON	
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:972:50: '\\'' '\\'' 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:972:50: '\\'' '\\'' 
{	TokenNameLBRACE	
match	TokenNameIdentifier	 match
(	TokenNameLPAREN	
'\''	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
match	TokenNameIdentifier	 match
(	TokenNameLPAREN	
'\''	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
b	TokenNameIdentifier	 b
.	TokenNameDOT	
appendCodePoint	TokenNameIdentifier	 append Code Point
(	TokenNameLPAREN	
'\''	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
default	TokenNamedefault	
:	TokenNameCOLON	
break	TokenNamebreak	
loop3	TokenNameIdentifier	 loop3
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
while	TokenNamewhile	
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
match	TokenNameIdentifier	 match
(	TokenNameLPAREN	
'\''	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
_type	TokenNameIdentifier	 type
;	TokenNameSEMICOLON	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
channel	TokenNameIdentifier	 channel
=	TokenNameEQUAL	
_channel	TokenNameIdentifier	 channel
;	TokenNameSEMICOLON	
setText	TokenNameIdentifier	 set Text
(	TokenNameLPAREN	
b	TokenNameIdentifier	 b
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
finally	TokenNamefinally	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// $ANTLR end "STRING_LITERAL" 	TokenNameCOMMENT_LINE	$ANTLR end "STRING_LITERAL" 
// $ANTLR start "QUOTED_NAME" 	TokenNameCOMMENT_LINE	$ANTLR start "QUOTED_NAME" 
public	TokenNamepublic	
final	TokenNamefinal	
void	TokenNamevoid	
mQUOTED_NAME	TokenNameIdentifier	 m QUOTED  NAME
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
RecognitionException	TokenNameIdentifier	 Recognition Exception
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
int	TokenNameint	
_type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
QUOTED_NAME	TokenNameIdentifier	 QUOTED  NAME
;	TokenNameSEMICOLON	
int	TokenNameint	
_channel	TokenNameIdentifier	 channel
=	TokenNameEQUAL	
DEFAULT_TOKEN_CHANNEL	TokenNameIdentifier	 DEFAULT  TOKEN  CHANNEL
;	TokenNameSEMICOLON	
int	TokenNameint	
c	TokenNameIdentifier	 c
;	TokenNameSEMICOLON	
StringBuilder	TokenNameIdentifier	 String Builder
b	TokenNameIdentifier	 b
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuilder	TokenNameIdentifier	 String Builder
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:978:5: ( '\\\"' (c=~ ( '\\\"' ) | '\\\"' '\\\"' )* '\\\"' ) 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:978:5: ( '\\\"' (c=~ ( '\\\"' ) | '\\\"' '\\\"' )* '\\\"' ) 
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:978:7: '\\\"' (c=~ ( '\\\"' ) | '\\\"' '\\\"' )* '\\\"' 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:978:7: '\\\"' (c=~ ( '\\\"' ) | '\\\"' '\\\"' )* '\\\"' 
{	TokenNameLBRACE	
match	TokenNameIdentifier	 match
(	TokenNameLPAREN	
'\"'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:978:12: (c=~ ( '\\\"' ) | '\\\"' '\\\"' )* 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:978:12: (c=~ ( '\\\"' ) | '\\\"' '\\\"' )* 
loop4	TokenNameIdentifier	 loop4
:	TokenNameCOLON	
do	TokenNamedo	
{	TokenNameLBRACE	
int	TokenNameint	
alt4	TokenNameIdentifier	 alt4
=	TokenNameEQUAL	
3	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
LA4_0	TokenNameIdentifier	 L A4 0
=	TokenNameEQUAL	
input	TokenNameIdentifier	 input
.	TokenNameDOT	
LA	TokenNameIdentifier	 LA
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
LA4_0	TokenNameIdentifier	 L A4 0
==	TokenNameEQUAL_EQUAL	
'\"'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
LA4_1	TokenNameIdentifier	 L A4 1
=	TokenNameEQUAL	
input	TokenNameIdentifier	 input
.	TokenNameDOT	
LA	TokenNameIdentifier	 LA
(	TokenNameLPAREN	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
LA4_1	TokenNameIdentifier	 L A4 1
==	TokenNameEQUAL_EQUAL	
'\"'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
alt4	TokenNameIdentifier	 alt4
=	TokenNameEQUAL	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
LA4_0	TokenNameIdentifier	 L A4 0
>=	TokenNameGREATER_EQUAL	
' '	TokenNameCharacterLiteral	
&&	TokenNameAND_AND	
LA4_0	TokenNameIdentifier	 L A4 0
<=	TokenNameLESS_EQUAL	
'!'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
LA4_0	TokenNameIdentifier	 L A4 0
>=	TokenNameGREATER_EQUAL	
'#'	TokenNameCharacterLiteral	
&&	TokenNameAND_AND	
LA4_0	TokenNameIdentifier	 L A4 0
<=	TokenNameLESS_EQUAL	
'?'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
alt4	TokenNameIdentifier	 alt4
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
switch	TokenNameswitch	
(	TokenNameLPAREN	
alt4	TokenNameIdentifier	 alt4
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
1	TokenNameIntegerLiteral	
:	TokenNameCOLON	
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:978:13: c=~ ( '\\\"' ) 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:978:13: c=~ ( '\\\"' ) 
{	TokenNameLBRACE	
c	TokenNameIdentifier	 c
=	TokenNameEQUAL	
input	TokenNameIdentifier	 input
.	TokenNameDOT	
LA	TokenNameIdentifier	 LA
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
input	TokenNameIdentifier	 input
.	TokenNameDOT	
LA	TokenNameIdentifier	 LA
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
>=	TokenNameGREATER_EQUAL	
' '	TokenNameCharacterLiteral	
&&	TokenNameAND_AND	
input	TokenNameIdentifier	 input
.	TokenNameDOT	
LA	TokenNameIdentifier	 LA
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
<=	TokenNameLESS_EQUAL	
'!'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
input	TokenNameIdentifier	 input
.	TokenNameDOT	
LA	TokenNameIdentifier	 LA
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
>=	TokenNameGREATER_EQUAL	
'#'	TokenNameCharacterLiteral	
&&	TokenNameAND_AND	
input	TokenNameIdentifier	 input
.	TokenNameDOT	
LA	TokenNameIdentifier	 LA
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
<=	TokenNameLESS_EQUAL	
'?'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
input	TokenNameIdentifier	 input
.	TokenNameDOT	
consume	TokenNameIdentifier	 consume
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
MismatchedSetException	TokenNameIdentifier	 Mismatched Set Exception
mse	TokenNameIdentifier	 mse
=	TokenNameEQUAL	
new	TokenNamenew	
MismatchedSetException	TokenNameIdentifier	 Mismatched Set Exception
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
input	TokenNameIdentifier	 input
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
recover	TokenNameIdentifier	 recover
(	TokenNameLPAREN	
mse	TokenNameIdentifier	 mse
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
throw	TokenNamethrow	
mse	TokenNameIdentifier	 mse
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
b	TokenNameIdentifier	 b
.	TokenNameDOT	
appendCodePoint	TokenNameIdentifier	 append Code Point
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
2	TokenNameIntegerLiteral	
:	TokenNameCOLON	
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:978:51: '\\\"' '\\\"' 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:978:51: '\\\"' '\\\"' 
{	TokenNameLBRACE	
match	TokenNameIdentifier	 match
(	TokenNameLPAREN	
'\"'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
match	TokenNameIdentifier	 match
(	TokenNameLPAREN	
'\"'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
b	TokenNameIdentifier	 b
.	TokenNameDOT	
appendCodePoint	TokenNameIdentifier	 append Code Point
(	TokenNameLPAREN	
'\"'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
default	TokenNamedefault	
:	TokenNameCOLON	
break	TokenNamebreak	
loop4	TokenNameIdentifier	 loop4
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
while	TokenNamewhile	
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
match	TokenNameIdentifier	 match
(	TokenNameLPAREN	
'\"'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
_type	TokenNameIdentifier	 type
;	TokenNameSEMICOLON	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
channel	TokenNameIdentifier	 channel
=	TokenNameEQUAL	
_channel	TokenNameIdentifier	 channel
;	TokenNameSEMICOLON	
setText	TokenNameIdentifier	 set Text
(	TokenNameLPAREN	
b	TokenNameIdentifier	 b
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
finally	TokenNamefinally	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// $ANTLR end "QUOTED_NAME" 	TokenNameCOMMENT_LINE	$ANTLR end "QUOTED_NAME" 
// $ANTLR start "DIGIT" 	TokenNameCOMMENT_LINE	$ANTLR start "DIGIT" 
public	TokenNamepublic	
final	TokenNamefinal	
void	TokenNamevoid	
mDIGIT	TokenNameIdentifier	 m DIGIT
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
RecognitionException	TokenNameIdentifier	 Recognition Exception
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:982:5: ( '0' .. '9' ) 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:982:5: ( '0' .. '9' ) 
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:982:7: '0' .. '9' 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:982:7: '0' .. '9' 
{	TokenNameLBRACE	
matchRange	TokenNameIdentifier	 match Range
(	TokenNameLPAREN	
'0'	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
'9'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
finally	TokenNamefinally	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// $ANTLR end "DIGIT" 	TokenNameCOMMENT_LINE	$ANTLR end "DIGIT" 
// $ANTLR start "LETTER" 	TokenNameCOMMENT_LINE	$ANTLR start "LETTER" 
public	TokenNamepublic	
final	TokenNamefinal	
void	TokenNamevoid	
mLETTER	TokenNameIdentifier	 m LETTER
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
RecognitionException	TokenNameIdentifier	 Recognition Exception
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:986:5: ( ( 'A' .. 'Z' | 'a' .. 'z' ) ) 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:986:5: ( ( 'A' .. 'Z' | 'a' .. 'z' ) ) 
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:986:7: ( 'A' .. 'Z' | 'a' .. 'z' ) 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:986:7: ( 'A' .. 'Z' | 'a' .. 'z' ) 
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
input	TokenNameIdentifier	 input
.	TokenNameDOT	
LA	TokenNameIdentifier	 LA
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
>=	TokenNameGREATER_EQUAL	
'A'	TokenNameCharacterLiteral	
&&	TokenNameAND_AND	
input	TokenNameIdentifier	 input
.	TokenNameDOT	
LA	TokenNameIdentifier	 LA
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
<=	TokenNameLESS_EQUAL	
'Z'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
input	TokenNameIdentifier	 input
.	TokenNameDOT	
LA	TokenNameIdentifier	 LA
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
>=	TokenNameGREATER_EQUAL	
'a'	TokenNameCharacterLiteral	
&&	TokenNameAND_AND	
input	TokenNameIdentifier	 input
.	TokenNameDOT	
LA	TokenNameIdentifier	 LA
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
<=	TokenNameLESS_EQUAL	
'z'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
input	TokenNameIdentifier	 input
.	TokenNameDOT	
consume	TokenNameIdentifier	 consume
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
MismatchedSetException	TokenNameIdentifier	 Mismatched Set Exception
mse	TokenNameIdentifier	 mse
=	TokenNameEQUAL	
new	TokenNamenew	
MismatchedSetException	TokenNameIdentifier	 Mismatched Set Exception
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
input	TokenNameIdentifier	 input
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
recover	TokenNameIdentifier	 recover
(	TokenNameLPAREN	
mse	TokenNameIdentifier	 mse
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
throw	TokenNamethrow	
mse	TokenNameIdentifier	 mse
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
finally	TokenNamefinally	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// $ANTLR end "LETTER" 	TokenNameCOMMENT_LINE	$ANTLR end "LETTER" 
// $ANTLR start "HEX" 	TokenNameCOMMENT_LINE	$ANTLR start "HEX" 
public	TokenNamepublic	
final	TokenNamefinal	
void	TokenNamevoid	
mHEX	TokenNameIdentifier	 m HEX
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
RecognitionException	TokenNameIdentifier	 Recognition Exception
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:990:5: ( ( 'A' .. 'F' | 'a' .. 'f' | '0' .. '9' ) ) 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:990:5: ( ( 'A' .. 'F' | 'a' .. 'f' | '0' .. '9' ) ) 
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:990:7: ( 'A' .. 'F' | 'a' .. 'f' | '0' .. '9' ) 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:990:7: ( 'A' .. 'F' | 'a' .. 'f' | '0' .. '9' ) 
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
input	TokenNameIdentifier	 input
.	TokenNameDOT	
LA	TokenNameIdentifier	 LA
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
>=	TokenNameGREATER_EQUAL	
'0'	TokenNameCharacterLiteral	
&&	TokenNameAND_AND	
input	TokenNameIdentifier	 input
.	TokenNameDOT	
LA	TokenNameIdentifier	 LA
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
<=	TokenNameLESS_EQUAL	
'9'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
input	TokenNameIdentifier	 input
.	TokenNameDOT	
LA	TokenNameIdentifier	 LA
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
>=	TokenNameGREATER_EQUAL	
'A'	TokenNameCharacterLiteral	
&&	TokenNameAND_AND	
input	TokenNameIdentifier	 input
.	TokenNameDOT	
LA	TokenNameIdentifier	 LA
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
<=	TokenNameLESS_EQUAL	
'F'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
input	TokenNameIdentifier	 input
.	TokenNameDOT	
LA	TokenNameIdentifier	 LA
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
>=	TokenNameGREATER_EQUAL	
'a'	TokenNameCharacterLiteral	
&&	TokenNameAND_AND	
input	TokenNameIdentifier	 input
.	TokenNameDOT	
LA	TokenNameIdentifier	 LA
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
<=	TokenNameLESS_EQUAL	
'f'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
input	TokenNameIdentifier	 input
.	TokenNameDOT	
consume	TokenNameIdentifier	 consume
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
MismatchedSetException	TokenNameIdentifier	 Mismatched Set Exception
mse	TokenNameIdentifier	 mse
=	TokenNameEQUAL	
new	TokenNamenew	
MismatchedSetException	TokenNameIdentifier	 Mismatched Set Exception
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
input	TokenNameIdentifier	 input
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
recover	TokenNameIdentifier	 recover
(	TokenNameLPAREN	
mse	TokenNameIdentifier	 mse
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
throw	TokenNamethrow	
mse	TokenNameIdentifier	 mse
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
finally	TokenNamefinally	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// $ANTLR end "HEX" 	TokenNameCOMMENT_LINE	$ANTLR end "HEX" 
// $ANTLR start "INTEGER" 	TokenNameCOMMENT_LINE	$ANTLR start "INTEGER" 
public	TokenNamepublic	
final	TokenNamefinal	
void	TokenNamevoid	
mINTEGER	TokenNameIdentifier	 m INTEGER
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
RecognitionException	TokenNameIdentifier	 Recognition Exception
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
int	TokenNameint	
_type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
INTEGER	TokenNameIdentifier	 INTEGER
;	TokenNameSEMICOLON	
int	TokenNameint	
_channel	TokenNameIdentifier	 channel
=	TokenNameEQUAL	
DEFAULT_TOKEN_CHANNEL	TokenNameIdentifier	 DEFAULT  TOKEN  CHANNEL
;	TokenNameSEMICOLON	
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:994:5: ( ( '-' )? ( DIGIT )+ ) 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:994:5: ( ( '-' )? ( DIGIT )+ ) 
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:994:7: ( '-' )? ( DIGIT )+ 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:994:7: ( '-' )? ( DIGIT )+ 
{	TokenNameLBRACE	
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:994:7: ( '-' )? 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:994:7: ( '-' )? 
int	TokenNameint	
alt5	TokenNameIdentifier	 alt5
=	TokenNameEQUAL	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
LA5_0	TokenNameIdentifier	 L A5 0
=	TokenNameEQUAL	
input	TokenNameIdentifier	 input
.	TokenNameDOT	
LA	TokenNameIdentifier	 LA
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
LA5_0	TokenNameIdentifier	 L A5 0
==	TokenNameEQUAL_EQUAL	
'-'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
alt5	TokenNameIdentifier	 alt5
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
switch	TokenNameswitch	
(	TokenNameLPAREN	
alt5	TokenNameIdentifier	 alt5
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
1	TokenNameIntegerLiteral	
:	TokenNameCOLON	
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:994:7: '-' 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:994:7: '-' 
{	TokenNameLBRACE	
match	TokenNameIdentifier	 match
(	TokenNameLPAREN	
'-'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:994:12: ( DIGIT )+ 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:994:12: ( DIGIT )+ 
int	TokenNameint	
cnt6	TokenNameIdentifier	 cnt6
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
loop6	TokenNameIdentifier	 loop6
:	TokenNameCOLON	
do	TokenNamedo	
{	TokenNameLBRACE	
int	TokenNameint	
alt6	TokenNameIdentifier	 alt6
=	TokenNameEQUAL	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
LA6_0	TokenNameIdentifier	 L A6 0
=	TokenNameEQUAL	
input	TokenNameIdentifier	 input
.	TokenNameDOT	
LA	TokenNameIdentifier	 LA
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
LA6_0	TokenNameIdentifier	 L A6 0
>=	TokenNameGREATER_EQUAL	
'0'	TokenNameCharacterLiteral	
&&	TokenNameAND_AND	
LA6_0	TokenNameIdentifier	 L A6 0
<=	TokenNameLESS_EQUAL	
'9'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
alt6	TokenNameIdentifier	 alt6
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
switch	TokenNameswitch	
(	TokenNameLPAREN	
alt6	TokenNameIdentifier	 alt6
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
1	TokenNameIntegerLiteral	
:	TokenNameCOLON	
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:994:12: DIGIT 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:994:12: DIGIT 
{	TokenNameLBRACE	
mDIGIT	TokenNameIdentifier	 m DIGIT
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
default	TokenNamedefault	
:	TokenNameCOLON	
if	TokenNameif	
(	TokenNameLPAREN	
cnt6	TokenNameIdentifier	 cnt6
>=	TokenNameGREATER_EQUAL	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
break	TokenNamebreak	
loop6	TokenNameIdentifier	 loop6
;	TokenNameSEMICOLON	
EarlyExitException	TokenNameIdentifier	 Early Exit Exception
eee	TokenNameIdentifier	 eee
=	TokenNameEQUAL	
new	TokenNamenew	
EarlyExitException	TokenNameIdentifier	 Early Exit Exception
(	TokenNameLPAREN	
6	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
input	TokenNameIdentifier	 input
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
throw	TokenNamethrow	
eee	TokenNameIdentifier	 eee
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
cnt6	TokenNameIdentifier	 cnt6
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
while	TokenNamewhile	
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
_type	TokenNameIdentifier	 type
;	TokenNameSEMICOLON	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
channel	TokenNameIdentifier	 channel
=	TokenNameEQUAL	
_channel	TokenNameIdentifier	 channel
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
finally	TokenNamefinally	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// $ANTLR end "INTEGER" 	TokenNameCOMMENT_LINE	$ANTLR end "INTEGER" 
// $ANTLR start "QMARK" 	TokenNameCOMMENT_LINE	$ANTLR start "QMARK" 
public	TokenNamepublic	
final	TokenNamefinal	
void	TokenNamevoid	
mQMARK	TokenNameIdentifier	 m QMARK
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
RecognitionException	TokenNameIdentifier	 Recognition Exception
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
int	TokenNameint	
_type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
QMARK	TokenNameIdentifier	 QMARK
;	TokenNameSEMICOLON	
int	TokenNameint	
_channel	TokenNameIdentifier	 channel
=	TokenNameEQUAL	
DEFAULT_TOKEN_CHANNEL	TokenNameIdentifier	 DEFAULT  TOKEN  CHANNEL
;	TokenNameSEMICOLON	
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:998:5: ( '?' ) 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:998:5: ( '?' ) 
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:998:7: '?' 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:998:7: '?' 
{	TokenNameLBRACE	
match	TokenNameIdentifier	 match
(	TokenNameLPAREN	
'?'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
_type	TokenNameIdentifier	 type
;	TokenNameSEMICOLON	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
channel	TokenNameIdentifier	 channel
=	TokenNameEQUAL	
_channel	TokenNameIdentifier	 channel
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
finally	TokenNamefinally	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// $ANTLR end "QMARK" 	TokenNameCOMMENT_LINE	$ANTLR end "QMARK" 
// $ANTLR start "FLOAT" 	TokenNameCOMMENT_LINE	$ANTLR start "FLOAT" 
public	TokenNamepublic	
final	TokenNamefinal	
void	TokenNamevoid	
mFLOAT	TokenNameIdentifier	 m FLOAT
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
RecognitionException	TokenNameIdentifier	 Recognition Exception
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
int	TokenNameint	
_type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
FLOAT	TokenNameIdentifier	 FLOAT
;	TokenNameSEMICOLON	
int	TokenNameint	
_channel	TokenNameIdentifier	 channel
=	TokenNameEQUAL	
DEFAULT_TOKEN_CHANNEL	TokenNameIdentifier	 DEFAULT  TOKEN  CHANNEL
;	TokenNameSEMICOLON	
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:1006:5: ( INTEGER '.' ( DIGIT )* ) 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:1006:5: ( INTEGER '.' ( DIGIT )* ) 
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:1006:7: INTEGER '.' ( DIGIT )* 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:1006:7: INTEGER '.' ( DIGIT )* 
{	TokenNameLBRACE	
mINTEGER	TokenNameIdentifier	 m INTEGER
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
match	TokenNameIdentifier	 match
(	TokenNameLPAREN	
'.'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:1006:19: ( DIGIT )* 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:1006:19: ( DIGIT )* 
loop7	TokenNameIdentifier	 loop7
:	TokenNameCOLON	
do	TokenNamedo	
{	TokenNameLBRACE	
int	TokenNameint	
alt7	TokenNameIdentifier	 alt7
=	TokenNameEQUAL	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
LA7_0	TokenNameIdentifier	 L A7 0
=	TokenNameEQUAL	
input	TokenNameIdentifier	 input
.	TokenNameDOT	
LA	TokenNameIdentifier	 LA
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
LA7_0	TokenNameIdentifier	 L A7 0
>=	TokenNameGREATER_EQUAL	
'0'	TokenNameCharacterLiteral	
&&	TokenNameAND_AND	
LA7_0	TokenNameIdentifier	 L A7 0
<=	TokenNameLESS_EQUAL	
'9'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
alt7	TokenNameIdentifier	 alt7
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
switch	TokenNameswitch	
(	TokenNameLPAREN	
alt7	TokenNameIdentifier	 alt7
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
1	TokenNameIntegerLiteral	
:	TokenNameCOLON	
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:1006:19: DIGIT 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:1006:19: DIGIT 
{	TokenNameLBRACE	
mDIGIT	TokenNameIdentifier	 m DIGIT
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
default	TokenNamedefault	
:	TokenNameCOLON	
break	TokenNamebreak	
loop7	TokenNameIdentifier	 loop7
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
while	TokenNamewhile	
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
_type	TokenNameIdentifier	 type
;	TokenNameSEMICOLON	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
channel	TokenNameIdentifier	 channel
=	TokenNameEQUAL	
_channel	TokenNameIdentifier	 channel
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
finally	TokenNamefinally	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// $ANTLR end "FLOAT" 	TokenNameCOMMENT_LINE	$ANTLR end "FLOAT" 
// $ANTLR start "IDENT" 	TokenNameCOMMENT_LINE	$ANTLR start "IDENT" 
public	TokenNamepublic	
final	TokenNamefinal	
void	TokenNamevoid	
mIDENT	TokenNameIdentifier	 m IDENT
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
RecognitionException	TokenNameIdentifier	 Recognition Exception
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
int	TokenNameint	
_type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
IDENT	TokenNameIdentifier	 IDENT
;	TokenNameSEMICOLON	
int	TokenNameint	
_channel	TokenNameIdentifier	 channel
=	TokenNameEQUAL	
DEFAULT_TOKEN_CHANNEL	TokenNameIdentifier	 DEFAULT  TOKEN  CHANNEL
;	TokenNameSEMICOLON	
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:1010:5: ( LETTER ( LETTER | DIGIT | '_' )* ) 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:1010:5: ( LETTER ( LETTER | DIGIT | '_' )* ) 
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:1010:7: LETTER ( LETTER | DIGIT | '_' )* 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:1010:7: LETTER ( LETTER | DIGIT | '_' )* 
{	TokenNameLBRACE	
mLETTER	TokenNameIdentifier	 m LETTER
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:1010:14: ( LETTER | DIGIT | '_' )* 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:1010:14: ( LETTER | DIGIT | '_' )* 
loop8	TokenNameIdentifier	 loop8
:	TokenNameCOLON	
do	TokenNamedo	
{	TokenNameLBRACE	
int	TokenNameint	
alt8	TokenNameIdentifier	 alt8
=	TokenNameEQUAL	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
LA8_0	TokenNameIdentifier	 L A8 0
=	TokenNameEQUAL	
input	TokenNameIdentifier	 input
.	TokenNameDOT	
LA	TokenNameIdentifier	 LA
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
LA8_0	TokenNameIdentifier	 L A8 0
>=	TokenNameGREATER_EQUAL	
'0'	TokenNameCharacterLiteral	
&&	TokenNameAND_AND	
LA8_0	TokenNameIdentifier	 L A8 0
<=	TokenNameLESS_EQUAL	
'9'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
LA8_0	TokenNameIdentifier	 L A8 0
>=	TokenNameGREATER_EQUAL	
'A'	TokenNameCharacterLiteral	
&&	TokenNameAND_AND	
LA8_0	TokenNameIdentifier	 L A8 0
<=	TokenNameLESS_EQUAL	
'Z'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
||	TokenNameOR_OR	
LA8_0	TokenNameIdentifier	 L A8 0
==	TokenNameEQUAL_EQUAL	
'_'	TokenNameCharacterLiteral	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
LA8_0	TokenNameIdentifier	 L A8 0
>=	TokenNameGREATER_EQUAL	
'a'	TokenNameCharacterLiteral	
&&	TokenNameAND_AND	
LA8_0	TokenNameIdentifier	 L A8 0
<=	TokenNameLESS_EQUAL	
'z'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
alt8	TokenNameIdentifier	 alt8
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
switch	TokenNameswitch	
(	TokenNameLPAREN	
alt8	TokenNameIdentifier	 alt8
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
1	TokenNameIntegerLiteral	
:	TokenNameCOLON	
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g: 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g: 
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
input	TokenNameIdentifier	 input
.	TokenNameDOT	
LA	TokenNameIdentifier	 LA
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
>=	TokenNameGREATER_EQUAL	
'0'	TokenNameCharacterLiteral	
&&	TokenNameAND_AND	
input	TokenNameIdentifier	 input
.	TokenNameDOT	
LA	TokenNameIdentifier	 LA
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
<=	TokenNameLESS_EQUAL	
'9'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
input	TokenNameIdentifier	 input
.	TokenNameDOT	
LA	TokenNameIdentifier	 LA
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
>=	TokenNameGREATER_EQUAL	
'A'	TokenNameCharacterLiteral	
&&	TokenNameAND_AND	
input	TokenNameIdentifier	 input
.	TokenNameDOT	
LA	TokenNameIdentifier	 LA
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
<=	TokenNameLESS_EQUAL	
'Z'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
||	TokenNameOR_OR	
input	TokenNameIdentifier	 input
.	TokenNameDOT	
LA	TokenNameIdentifier	 LA
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
'_'	TokenNameCharacterLiteral	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
input	TokenNameIdentifier	 input
.	TokenNameDOT	
LA	TokenNameIdentifier	 LA
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
>=	TokenNameGREATER_EQUAL	
'a'	TokenNameCharacterLiteral	
&&	TokenNameAND_AND	
input	TokenNameIdentifier	 input
.	TokenNameDOT	
LA	TokenNameIdentifier	 LA
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
<=	TokenNameLESS_EQUAL	
'z'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
input	TokenNameIdentifier	 input
.	TokenNameDOT	
consume	TokenNameIdentifier	 consume
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
MismatchedSetException	TokenNameIdentifier	 Mismatched Set Exception
mse	TokenNameIdentifier	 mse
=	TokenNameEQUAL	
new	TokenNamenew	
MismatchedSetException	TokenNameIdentifier	 Mismatched Set Exception
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
input	TokenNameIdentifier	 input
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
recover	TokenNameIdentifier	 recover
(	TokenNameLPAREN	
mse	TokenNameIdentifier	 mse
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
throw	TokenNamethrow	
mse	TokenNameIdentifier	 mse
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
default	TokenNamedefault	
:	TokenNameCOLON	
break	TokenNamebreak	
loop8	TokenNameIdentifier	 loop8
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
while	TokenNamewhile	
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
_type	TokenNameIdentifier	 type
;	TokenNameSEMICOLON	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
channel	TokenNameIdentifier	 channel
=	TokenNameEQUAL	
_channel	TokenNameIdentifier	 channel
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
finally	TokenNamefinally	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// $ANTLR end "IDENT" 	TokenNameCOMMENT_LINE	$ANTLR end "IDENT" 
// $ANTLR start "UUID" 	TokenNameCOMMENT_LINE	$ANTLR start "UUID" 
public	TokenNamepublic	
final	TokenNamefinal	
void	TokenNamevoid	
mUUID	TokenNameIdentifier	 m UUID
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
RecognitionException	TokenNameIdentifier	 Recognition Exception
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
int	TokenNameint	
_type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
UUID	TokenNameIdentifier	 UUID
;	TokenNameSEMICOLON	
int	TokenNameint	
_channel	TokenNameIdentifier	 channel
=	TokenNameEQUAL	
DEFAULT_TOKEN_CHANNEL	TokenNameIdentifier	 DEFAULT  TOKEN  CHANNEL
;	TokenNameSEMICOLON	
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:1014:5: ( HEX HEX HEX HEX HEX HEX HEX HEX '-' HEX HEX HEX HEX '-' HEX HEX HEX HEX '-' HEX HEX HEX HEX '-' HEX HEX HEX HEX HEX HEX HEX HEX HEX HEX HEX HEX ) 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:1014:5: ( HEX HEX HEX HEX HEX HEX HEX HEX '-' HEX HEX HEX HEX '-' HEX HEX HEX HEX '-' HEX HEX HEX HEX '-' HEX HEX HEX HEX HEX HEX HEX HEX HEX HEX HEX HEX ) 
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:1014:7: HEX HEX HEX HEX HEX HEX HEX HEX '-' HEX HEX HEX HEX '-' HEX HEX HEX HEX '-' HEX HEX HEX HEX '-' HEX HEX HEX HEX HEX HEX HEX HEX HEX HEX HEX HEX 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:1014:7: HEX HEX HEX HEX HEX HEX HEX HEX '-' HEX HEX HEX HEX '-' HEX HEX HEX HEX '-' HEX HEX HEX HEX '-' HEX HEX HEX HEX HEX HEX HEX HEX HEX HEX HEX HEX 
{	TokenNameLBRACE	
mHEX	TokenNameIdentifier	 m HEX
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mHEX	TokenNameIdentifier	 m HEX
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mHEX	TokenNameIdentifier	 m HEX
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mHEX	TokenNameIdentifier	 m HEX
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mHEX	TokenNameIdentifier	 m HEX
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mHEX	TokenNameIdentifier	 m HEX
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mHEX	TokenNameIdentifier	 m HEX
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mHEX	TokenNameIdentifier	 m HEX
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
match	TokenNameIdentifier	 match
(	TokenNameLPAREN	
'-'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mHEX	TokenNameIdentifier	 m HEX
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mHEX	TokenNameIdentifier	 m HEX
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mHEX	TokenNameIdentifier	 m HEX
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mHEX	TokenNameIdentifier	 m HEX
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
match	TokenNameIdentifier	 match
(	TokenNameLPAREN	
'-'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mHEX	TokenNameIdentifier	 m HEX
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mHEX	TokenNameIdentifier	 m HEX
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mHEX	TokenNameIdentifier	 m HEX
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mHEX	TokenNameIdentifier	 m HEX
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
match	TokenNameIdentifier	 match
(	TokenNameLPAREN	
'-'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mHEX	TokenNameIdentifier	 m HEX
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mHEX	TokenNameIdentifier	 m HEX
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mHEX	TokenNameIdentifier	 m HEX
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mHEX	TokenNameIdentifier	 m HEX
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
match	TokenNameIdentifier	 match
(	TokenNameLPAREN	
'-'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mHEX	TokenNameIdentifier	 m HEX
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mHEX	TokenNameIdentifier	 m HEX
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mHEX	TokenNameIdentifier	 m HEX
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mHEX	TokenNameIdentifier	 m HEX
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mHEX	TokenNameIdentifier	 m HEX
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mHEX	TokenNameIdentifier	 m HEX
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mHEX	TokenNameIdentifier	 m HEX
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mHEX	TokenNameIdentifier	 m HEX
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mHEX	TokenNameIdentifier	 m HEX
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mHEX	TokenNameIdentifier	 m HEX
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mHEX	TokenNameIdentifier	 m HEX
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mHEX	TokenNameIdentifier	 m HEX
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
_type	TokenNameIdentifier	 type
;	TokenNameSEMICOLON	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
channel	TokenNameIdentifier	 channel
=	TokenNameEQUAL	
_channel	TokenNameIdentifier	 channel
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
finally	TokenNamefinally	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// $ANTLR end "UUID" 	TokenNameCOMMENT_LINE	$ANTLR end "UUID" 
// $ANTLR start "WS" 	TokenNameCOMMENT_LINE	$ANTLR start "WS" 
public	TokenNamepublic	
final	TokenNamefinal	
void	TokenNamevoid	
mWS	TokenNameIdentifier	 m WS
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
RecognitionException	TokenNameIdentifier	 Recognition Exception
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
int	TokenNameint	
_type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
WS	TokenNameIdentifier	 WS
;	TokenNameSEMICOLON	
int	TokenNameint	
_channel	TokenNameIdentifier	 channel
=	TokenNameEQUAL	
DEFAULT_TOKEN_CHANNEL	TokenNameIdentifier	 DEFAULT  TOKEN  CHANNEL
;	TokenNameSEMICOLON	
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:1022:5: ( ( ' ' | '\\t' | '\\n' | '\\r' )+ ) 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:1022:5: ( ( ' ' | '\\t' | '\\n' | '\\r' )+ ) 
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:1022:7: ( ' ' | '\\t' | '\\n' | '\\r' )+ 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:1022:7: ( ' ' | '\\t' | '\\n' | '\\r' )+ 
{	TokenNameLBRACE	
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:1022:7: ( ' ' | '\\t' | '\\n' | '\\r' )+ 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:1022:7: ( ' ' | '\\t' | '\\n' | '\\r' )+ 
int	TokenNameint	
cnt9	TokenNameIdentifier	 cnt9
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
loop9	TokenNameIdentifier	 loop9
:	TokenNameCOLON	
do	TokenNamedo	
{	TokenNameLBRACE	
int	TokenNameint	
alt9	TokenNameIdentifier	 alt9
=	TokenNameEQUAL	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
LA9_0	TokenNameIdentifier	 L A9 0
=	TokenNameEQUAL	
input	TokenNameIdentifier	 input
.	TokenNameDOT	
LA	TokenNameIdentifier	 LA
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
LA9_0	TokenNameIdentifier	 L A9 0
>=	TokenNameGREATER_EQUAL	
'\t'	TokenNameCharacterLiteral	
&&	TokenNameAND_AND	
LA9_0	TokenNameIdentifier	 L A9 0
<=	TokenNameLESS_EQUAL	
'\n'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
||	TokenNameOR_OR	
LA9_0	TokenNameIdentifier	 L A9 0
==	TokenNameEQUAL_EQUAL	
'\r'	TokenNameCharacterLiteral	
||	TokenNameOR_OR	
LA9_0	TokenNameIdentifier	 L A9 0
==	TokenNameEQUAL_EQUAL	
' '	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
alt9	TokenNameIdentifier	 alt9
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
switch	TokenNameswitch	
(	TokenNameLPAREN	
alt9	TokenNameIdentifier	 alt9
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
1	TokenNameIntegerLiteral	
:	TokenNameCOLON	
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g: 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g: 
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
input	TokenNameIdentifier	 input
.	TokenNameDOT	
LA	TokenNameIdentifier	 LA
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
>=	TokenNameGREATER_EQUAL	
'\t'	TokenNameCharacterLiteral	
&&	TokenNameAND_AND	
input	TokenNameIdentifier	 input
.	TokenNameDOT	
LA	TokenNameIdentifier	 LA
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
<=	TokenNameLESS_EQUAL	
'\n'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
||	TokenNameOR_OR	
input	TokenNameIdentifier	 input
.	TokenNameDOT	
LA	TokenNameIdentifier	 LA
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
'\r'	TokenNameCharacterLiteral	
||	TokenNameOR_OR	
input	TokenNameIdentifier	 input
.	TokenNameDOT	
LA	TokenNameIdentifier	 LA
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
' '	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
input	TokenNameIdentifier	 input
.	TokenNameDOT	
consume	TokenNameIdentifier	 consume
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
MismatchedSetException	TokenNameIdentifier	 Mismatched Set Exception
mse	TokenNameIdentifier	 mse
=	TokenNameEQUAL	
new	TokenNamenew	
MismatchedSetException	TokenNameIdentifier	 Mismatched Set Exception
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
input	TokenNameIdentifier	 input
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
recover	TokenNameIdentifier	 recover
(	TokenNameLPAREN	
mse	TokenNameIdentifier	 mse
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
throw	TokenNamethrow	
mse	TokenNameIdentifier	 mse
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
default	TokenNamedefault	
:	TokenNameCOLON	
if	TokenNameif	
(	TokenNameLPAREN	
cnt9	TokenNameIdentifier	 cnt9
>=	TokenNameGREATER_EQUAL	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
break	TokenNamebreak	
loop9	TokenNameIdentifier	 loop9
;	TokenNameSEMICOLON	
EarlyExitException	TokenNameIdentifier	 Early Exit Exception
eee	TokenNameIdentifier	 eee
=	TokenNameEQUAL	
new	TokenNamenew	
EarlyExitException	TokenNameIdentifier	 Early Exit Exception
(	TokenNameLPAREN	
9	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
input	TokenNameIdentifier	 input
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
throw	TokenNamethrow	
eee	TokenNameIdentifier	 eee
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
cnt9	TokenNameIdentifier	 cnt9
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
while	TokenNamewhile	
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
_channel	TokenNameIdentifier	 channel
=	TokenNameEQUAL	
HIDDEN	TokenNameIdentifier	 HIDDEN
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
_type	TokenNameIdentifier	 type
;	TokenNameSEMICOLON	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
channel	TokenNameIdentifier	 channel
=	TokenNameEQUAL	
_channel	TokenNameIdentifier	 channel
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
finally	TokenNamefinally	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// $ANTLR end "WS" 	TokenNameCOMMENT_LINE	$ANTLR end "WS" 
// $ANTLR start "COMMENT" 	TokenNameCOMMENT_LINE	$ANTLR start "COMMENT" 
public	TokenNamepublic	
final	TokenNamefinal	
void	TokenNamevoid	
mCOMMENT	TokenNameIdentifier	 m COMMENT
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
RecognitionException	TokenNameIdentifier	 Recognition Exception
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
int	TokenNameint	
_type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
COMMENT	TokenNameIdentifier	 COMMENT
;	TokenNameSEMICOLON	
int	TokenNameint	
_channel	TokenNameIdentifier	 channel
=	TokenNameEQUAL	
DEFAULT_TOKEN_CHANNEL	TokenNameIdentifier	 DEFAULT  TOKEN  CHANNEL
;	TokenNameSEMICOLON	
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:1026:5: ( ( '--' | '//' ) ( . )* ( '\\n' | '\\r' ) ) 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:1026:5: ( ( '--' | '//' ) ( . )* ( '\\n' | '\\r' ) ) 
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:1026:7: ( '--' | '//' ) ( . )* ( '\\n' | '\\r' ) 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:1026:7: ( '--' | '//' ) ( . )* ( '\\n' | '\\r' ) 
{	TokenNameLBRACE	
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:1026:7: ( '--' | '//' ) 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:1026:7: ( '--' | '//' ) 
int	TokenNameint	
alt10	TokenNameIdentifier	 alt10
=	TokenNameEQUAL	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
LA10_0	TokenNameIdentifier	 L A10 0
=	TokenNameEQUAL	
input	TokenNameIdentifier	 input
.	TokenNameDOT	
LA	TokenNameIdentifier	 LA
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
LA10_0	TokenNameIdentifier	 L A10 0
==	TokenNameEQUAL_EQUAL	
'-'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
alt10	TokenNameIdentifier	 alt10
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
LA10_0	TokenNameIdentifier	 L A10 0
==	TokenNameEQUAL_EQUAL	
'/'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
alt10	TokenNameIdentifier	 alt10
=	TokenNameEQUAL	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
NoViableAltException	TokenNameIdentifier	 No Viable Alt Exception
nvae	TokenNameIdentifier	 nvae
=	TokenNameEQUAL	
new	TokenNamenew	
NoViableAltException	TokenNameIdentifier	 No Viable Alt Exception
(	TokenNameLPAREN	
""	TokenNameStringLiteral	 
,	TokenNameCOMMA	
10	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
input	TokenNameIdentifier	 input
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
throw	TokenNamethrow	
nvae	TokenNameIdentifier	 nvae
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
switch	TokenNameswitch	
(	TokenNameLPAREN	
alt10	TokenNameIdentifier	 alt10
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
1	TokenNameIntegerLiteral	
:	TokenNameCOLON	
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:1026:8: '--' 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:1026:8: '--' 
{	TokenNameLBRACE	
match	TokenNameIdentifier	 match
(	TokenNameLPAREN	
"--"	TokenNameStringLiteral	--
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
2	TokenNameIntegerLiteral	
:	TokenNameCOLON	
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:1026:15: '//' 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:1026:15: '//' 
{	TokenNameLBRACE	
match	TokenNameIdentifier	 match
(	TokenNameLPAREN	
"//"	TokenNameStringLiteral	//
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:1026:21: ( . )* 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:1026:21: ( . )* 
loop11	TokenNameIdentifier	 loop11
:	TokenNameCOLON	
do	TokenNamedo	
{	TokenNameLBRACE	
int	TokenNameint	
alt11	TokenNameIdentifier	 alt11
=	TokenNameEQUAL	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
LA11_0	TokenNameIdentifier	 L A11 0
=	TokenNameEQUAL	
input	TokenNameIdentifier	 input
.	TokenNameDOT	
LA	TokenNameIdentifier	 LA
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
LA11_0	TokenNameIdentifier	 L A11 0
==	TokenNameEQUAL_EQUAL	
'\n'	TokenNameCharacterLiteral	
||	TokenNameOR_OR	
LA11_0	TokenNameIdentifier	 L A11 0
==	TokenNameEQUAL_EQUAL	
'\r'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
alt11	TokenNameIdentifier	 alt11
=	TokenNameEQUAL	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
LA11_0	TokenNameIdentifier	 L A11 0
>=	TokenNameGREATER_EQUAL	
' '	TokenNameCharacterLiteral	
&&	TokenNameAND_AND	
LA11_0	TokenNameIdentifier	 L A11 0
<=	TokenNameLESS_EQUAL	
'\t'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
LA11_0	TokenNameIdentifier	 L A11 0
>=	TokenNameGREATER_EQUAL	
' '	TokenNameCharacterLiteral	
&&	TokenNameAND_AND	
LA11_0	TokenNameIdentifier	 L A11 0
<=	TokenNameLESS_EQUAL	
'\f'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
LA11_0	TokenNameIdentifier	 L A11 0
>=	TokenNameGREATER_EQUAL	
''	TokenNameCharacterLiteral	
&&	TokenNameAND_AND	
LA11_0	TokenNameIdentifier	 L A11 0
<=	TokenNameLESS_EQUAL	
'?'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
alt11	TokenNameIdentifier	 alt11
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
switch	TokenNameswitch	
(	TokenNameLPAREN	
alt11	TokenNameIdentifier	 alt11
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
1	TokenNameIntegerLiteral	
:	TokenNameCOLON	
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:1026:21: . 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:1026:21: . 
{	TokenNameLBRACE	
matchAny	TokenNameIdentifier	 match Any
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
default	TokenNamedefault	
:	TokenNameCOLON	
break	TokenNamebreak	
loop11	TokenNameIdentifier	 loop11
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
while	TokenNamewhile	
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
input	TokenNameIdentifier	 input
.	TokenNameDOT	
LA	TokenNameIdentifier	 LA
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
'\n'	TokenNameCharacterLiteral	
||	TokenNameOR_OR	
input	TokenNameIdentifier	 input
.	TokenNameDOT	
LA	TokenNameIdentifier	 LA
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
'\r'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
input	TokenNameIdentifier	 input
.	TokenNameDOT	
consume	TokenNameIdentifier	 consume
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
MismatchedSetException	TokenNameIdentifier	 Mismatched Set Exception
mse	TokenNameIdentifier	 mse
=	TokenNameEQUAL	
new	TokenNamenew	
MismatchedSetException	TokenNameIdentifier	 Mismatched Set Exception
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
input	TokenNameIdentifier	 input
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
recover	TokenNameIdentifier	 recover
(	TokenNameLPAREN	
mse	TokenNameIdentifier	 mse
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
throw	TokenNamethrow	
mse	TokenNameIdentifier	 mse
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
_channel	TokenNameIdentifier	 channel
=	TokenNameEQUAL	
HIDDEN	TokenNameIdentifier	 HIDDEN
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
_type	TokenNameIdentifier	 type
;	TokenNameSEMICOLON	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
channel	TokenNameIdentifier	 channel
=	TokenNameEQUAL	
_channel	TokenNameIdentifier	 channel
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
finally	TokenNamefinally	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// $ANTLR end "COMMENT" 	TokenNameCOMMENT_LINE	$ANTLR end "COMMENT" 
// $ANTLR start "MULTILINE_COMMENT" 	TokenNameCOMMENT_LINE	$ANTLR start "MULTILINE_COMMENT" 
public	TokenNamepublic	
final	TokenNamefinal	
void	TokenNamevoid	
mMULTILINE_COMMENT	TokenNameIdentifier	 m MULTILINE  COMMENT
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
RecognitionException	TokenNameIdentifier	 Recognition Exception
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
int	TokenNameint	
_type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
MULTILINE_COMMENT	TokenNameIdentifier	 MULTILINE  COMMENT
;	TokenNameSEMICOLON	
int	TokenNameint	
_channel	TokenNameIdentifier	 channel
=	TokenNameEQUAL	
DEFAULT_TOKEN_CHANNEL	TokenNameIdentifier	 DEFAULT  TOKEN  CHANNEL
;	TokenNameSEMICOLON	
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:1030:5: ( '/*' ( . )* '*/' ) 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:1030:5: ( '/*' ( . )* '*/' ) 
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:1030:7: '/*' ( . )* '*/' 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:1030:7: '/*' ( . )* '*/' 
{	TokenNameLBRACE	
match	TokenNameIdentifier	 match
(	TokenNameLPAREN	
"/*"	TokenNameStringLiteral	/*
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:1030:12: ( . )* 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:1030:12: ( . )* 
loop12	TokenNameIdentifier	 loop12
:	TokenNameCOLON	
do	TokenNamedo	
{	TokenNameLBRACE	
int	TokenNameint	
alt12	TokenNameIdentifier	 alt12
=	TokenNameEQUAL	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
LA12_0	TokenNameIdentifier	 L A12 0
=	TokenNameEQUAL	
input	TokenNameIdentifier	 input
.	TokenNameDOT	
LA	TokenNameIdentifier	 LA
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
LA12_0	TokenNameIdentifier	 L A12 0
==	TokenNameEQUAL_EQUAL	
'*'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
LA12_1	TokenNameIdentifier	 L A12 1
=	TokenNameEQUAL	
input	TokenNameIdentifier	 input
.	TokenNameDOT	
LA	TokenNameIdentifier	 LA
(	TokenNameLPAREN	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
LA12_1	TokenNameIdentifier	 L A12 1
==	TokenNameEQUAL_EQUAL	
'/'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
alt12	TokenNameIdentifier	 alt12
=	TokenNameEQUAL	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
LA12_1	TokenNameIdentifier	 L A12 1
>=	TokenNameGREATER_EQUAL	
' '	TokenNameCharacterLiteral	
&&	TokenNameAND_AND	
LA12_1	TokenNameIdentifier	 L A12 1
<=	TokenNameLESS_EQUAL	
'.'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
LA12_1	TokenNameIdentifier	 L A12 1
>=	TokenNameGREATER_EQUAL	
'0'	TokenNameCharacterLiteral	
&&	TokenNameAND_AND	
LA12_1	TokenNameIdentifier	 L A12 1
<=	TokenNameLESS_EQUAL	
'?'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
alt12	TokenNameIdentifier	 alt12
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
LA12_0	TokenNameIdentifier	 L A12 0
>=	TokenNameGREATER_EQUAL	
' '	TokenNameCharacterLiteral	
&&	TokenNameAND_AND	
LA12_0	TokenNameIdentifier	 L A12 0
<=	TokenNameLESS_EQUAL	
')'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
LA12_0	TokenNameIdentifier	 L A12 0
>=	TokenNameGREATER_EQUAL	
'+'	TokenNameCharacterLiteral	
&&	TokenNameAND_AND	
LA12_0	TokenNameIdentifier	 L A12 0
<=	TokenNameLESS_EQUAL	
'?'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
alt12	TokenNameIdentifier	 alt12
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
switch	TokenNameswitch	
(	TokenNameLPAREN	
alt12	TokenNameIdentifier	 alt12
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
1	TokenNameIntegerLiteral	
:	TokenNameCOLON	
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:1030:12: . 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:1030:12: . 
{	TokenNameLBRACE	
matchAny	TokenNameIdentifier	 match Any
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
default	TokenNamedefault	
:	TokenNameCOLON	
break	TokenNamebreak	
loop12	TokenNameIdentifier	 loop12
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
while	TokenNamewhile	
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
match	TokenNameIdentifier	 match
(	TokenNameLPAREN	
"*/"	TokenNameStringLiteral	*/
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
_channel	TokenNameIdentifier	 channel
=	TokenNameEQUAL	
HIDDEN	TokenNameIdentifier	 HIDDEN
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
_type	TokenNameIdentifier	 type
;	TokenNameSEMICOLON	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
channel	TokenNameIdentifier	 channel
=	TokenNameEQUAL	
_channel	TokenNameIdentifier	 channel
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
finally	TokenNamefinally	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// $ANTLR end "MULTILINE_COMMENT" 	TokenNameCOMMENT_LINE	$ANTLR end "MULTILINE_COMMENT" 
public	TokenNamepublic	
void	TokenNamevoid	
mTokens	TokenNameIdentifier	 m Tokens
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
RecognitionException	TokenNameIdentifier	 Recognition Exception
{	TokenNameLBRACE	
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:1:8: ( T__124 | T__125 | T__126 | T__127 | T__128 | T__129 | T__130 | T__131 | T__132 | T__133 | T__134 | T__135 | T__136 | T__137 | T__138 | T__139 | T__140 | T__141 | K_SELECT | K_FROM | K_WHERE | K_AND | K_KEY | K_INSERT | K_UPDATE | K_WITH | K_LIMIT | K_USING | K_USE | K_COUNT | K_SET | K_BEGIN | K_UNLOGGED | K_BATCH | K_APPLY | K_TRUNCATE | K_DELETE | K_IN | K_CREATE | K_KEYSPACE | K_KEYSPACES | K_COLUMNFAMILY | K_INDEX | K_ON | K_TO | K_DROP | K_PRIMARY | K_INTO | K_VALUES | K_TIMESTAMP | K_TTL | K_ALTER | K_RENAME | K_ADD | K_TYPE | K_COMPACT | K_STORAGE | K_ORDER | K_BY | K_ASC | K_DESC | K_ALLOW | K_FILTERING | K_GRANT | K_ALL | K_PERMISSION | K_PERMISSIONS | K_OF | K_REVOKE | K_MODIFY | K_AUTHORIZE | K_NORECURSIVE | K_USER | K_USERS | K_SUPERUSER | K_NOSUPERUSER | K_PASSWORD | K_CLUSTERING | K_ASCII | K_BIGINT | K_BLOB | K_BOOLEAN | K_COUNTER | K_DECIMAL | K_DOUBLE | K_FLOAT | K_INET | K_INT | K_TEXT | K_UUID | K_VARCHAR | K_VARINT | K_TIMEUUID | K_TOKEN | K_WRITETIME | K_MAP | K_LIST | K_TRUE | K_FALSE | STRING_LITERAL | QUOTED_NAME | INTEGER | QMARK | FLOAT | IDENT | UUID | WS | COMMENT | MULTILINE_COMMENT ) 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:1:8: ( T__124 | T__125 | T__126 | T__127 | T__128 | T__129 | T__130 | T__131 | T__132 | T__133 | T__134 | T__135 | T__136 | T__137 | T__138 | T__139 | T__140 | T__141 | K_SELECT | K_FROM | K_WHERE | K_AND | K_KEY | K_INSERT | K_UPDATE | K_WITH | K_LIMIT | K_USING | K_USE | K_COUNT | K_SET | K_BEGIN | K_UNLOGGED | K_BATCH | K_APPLY | K_TRUNCATE | K_DELETE | K_IN | K_CREATE | K_KEYSPACE | K_KEYSPACES | K_COLUMNFAMILY | K_INDEX | K_ON | K_TO | K_DROP | K_PRIMARY | K_INTO | K_VALUES | K_TIMESTAMP | K_TTL | K_ALTER | K_RENAME | K_ADD | K_TYPE | K_COMPACT | K_STORAGE | K_ORDER | K_BY | K_ASC | K_DESC | K_ALLOW | K_FILTERING | K_GRANT | K_ALL | K_PERMISSION | K_PERMISSIONS | K_OF | K_REVOKE | K_MODIFY | K_AUTHORIZE | K_NORECURSIVE | K_USER | K_USERS | K_SUPERUSER | K_NOSUPERUSER | K_PASSWORD | K_CLUSTERING | K_ASCII | K_BIGINT | K_BLOB | K_BOOLEAN | K_COUNTER | K_DECIMAL | K_DOUBLE | K_FLOAT | K_INET | K_INT | K_TEXT | K_UUID | K_VARCHAR | K_VARINT | K_TIMEUUID | K_TOKEN | K_WRITETIME | K_MAP | K_LIST | K_TRUE | K_FALSE | STRING_LITERAL | QUOTED_NAME | INTEGER | QMARK | FLOAT | IDENT | UUID | WS | COMMENT | MULTILINE_COMMENT ) 
int	TokenNameint	
alt13	TokenNameIdentifier	 alt13
=	TokenNameEQUAL	
109	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
alt13	TokenNameIdentifier	 alt13
=	TokenNameEQUAL	
dfa13	TokenNameIdentifier	 dfa13
.	TokenNameDOT	
predict	TokenNameIdentifier	 predict
(	TokenNameLPAREN	
input	TokenNameIdentifier	 input
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
switch	TokenNameswitch	
(	TokenNameLPAREN	
alt13	TokenNameIdentifier	 alt13
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
1	TokenNameIntegerLiteral	
:	TokenNameCOLON	
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:1:10: T__124 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:1:10: T__124 
{	TokenNameLBRACE	
mT__124	TokenNameIdentifier	 m T  124
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
2	TokenNameIntegerLiteral	
:	TokenNameCOLON	
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:1:17: T__125 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:1:17: T__125 
{	TokenNameLBRACE	
mT__125	TokenNameIdentifier	 m T  125
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
3	TokenNameIntegerLiteral	
:	TokenNameCOLON	
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:1:24: T__126 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:1:24: T__126 
{	TokenNameLBRACE	
mT__126	TokenNameIdentifier	 m T  126
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
4	TokenNameIntegerLiteral	
:	TokenNameCOLON	
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:1:31: T__127 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:1:31: T__127 
{	TokenNameLBRACE	
mT__127	TokenNameIdentifier	 m T  127
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
5	TokenNameIntegerLiteral	
:	TokenNameCOLON	
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:1:38: T__128 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:1:38: T__128 
{	TokenNameLBRACE	
mT__128	TokenNameIdentifier	 m T  128
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
6	TokenNameIntegerLiteral	
:	TokenNameCOLON	
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:1:45: T__129 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:1:45: T__129 
{	TokenNameLBRACE	
mT__129	TokenNameIdentifier	 m T  129
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
7	TokenNameIntegerLiteral	
:	TokenNameCOLON	
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:1:52: T__130 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:1:52: T__130 
{	TokenNameLBRACE	
mT__130	TokenNameIdentifier	 m T  130
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
8	TokenNameIntegerLiteral	
:	TokenNameCOLON	
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:1:59: T__131 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:1:59: T__131 
{	TokenNameLBRACE	
mT__131	TokenNameIdentifier	 m T  131
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
9	TokenNameIntegerLiteral	
:	TokenNameCOLON	
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:1:66: T__132 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:1:66: T__132 
{	TokenNameLBRACE	
mT__132	TokenNameIdentifier	 m T  132
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
10	TokenNameIntegerLiteral	
:	TokenNameCOLON	
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:1:73: T__133 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:1:73: T__133 
{	TokenNameLBRACE	
mT__133	TokenNameIdentifier	 m T  133
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
11	TokenNameIntegerLiteral	
:	TokenNameCOLON	
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:1:80: T__134 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:1:80: T__134 
{	TokenNameLBRACE	
mT__134	TokenNameIdentifier	 m T  134
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
12	TokenNameIntegerLiteral	
:	TokenNameCOLON	
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:1:87: T__135 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:1:87: T__135 
{	TokenNameLBRACE	
mT__135	TokenNameIdentifier	 m T  135
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
13	TokenNameIntegerLiteral	
:	TokenNameCOLON	
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:1:94: T__136 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:1:94: T__136 
{	TokenNameLBRACE	
mT__136	TokenNameIdentifier	 m T  136
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
14	TokenNameIntegerLiteral	
:	TokenNameCOLON	
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:1:101: T__137 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:1:101: T__137 
{	TokenNameLBRACE	
mT__137	TokenNameIdentifier	 m T  137
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
15	TokenNameIntegerLiteral	
:	TokenNameCOLON	
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:1:108: T__138 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:1:108: T__138 
{	TokenNameLBRACE	
mT__138	TokenNameIdentifier	 m T  138
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
16	TokenNameIntegerLiteral	
:	TokenNameCOLON	
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:1:115: T__139 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:1:115: T__139 
{	TokenNameLBRACE	
mT__139	TokenNameIdentifier	 m T  139
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
17	TokenNameIntegerLiteral	
:	TokenNameCOLON	
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:1:122: T__140 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:1:122: T__140 
{	TokenNameLBRACE	
mT__140	TokenNameIdentifier	 m T  140
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
18	TokenNameIntegerLiteral	
:	TokenNameCOLON	
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:1:129: T__141 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:1:129: T__141 
{	TokenNameLBRACE	
mT__141	TokenNameIdentifier	 m T  141
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
19	TokenNameIntegerLiteral	
:	TokenNameCOLON	
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:1:136: K_SELECT 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:1:136: K_SELECT 
{	TokenNameLBRACE	
mK_SELECT	TokenNameIdentifier	 m K  SELECT
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
20	TokenNameIntegerLiteral	
:	TokenNameCOLON	
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:1:145: K_FROM 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:1:145: K_FROM 
{	TokenNameLBRACE	
mK_FROM	TokenNameIdentifier	 m K  FROM
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
21	TokenNameIntegerLiteral	
:	TokenNameCOLON	
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:1:152: K_WHERE 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:1:152: K_WHERE 
{	TokenNameLBRACE	
mK_WHERE	TokenNameIdentifier	 m K  WHERE
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
22	TokenNameIntegerLiteral	
:	TokenNameCOLON	
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:1:160: K_AND 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:1:160: K_AND 
{	TokenNameLBRACE	
mK_AND	TokenNameIdentifier	 m K  AND
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
23	TokenNameIntegerLiteral	
:	TokenNameCOLON	
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:1:166: K_KEY 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:1:166: K_KEY 
{	TokenNameLBRACE	
mK_KEY	TokenNameIdentifier	 m K  KEY
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
24	TokenNameIntegerLiteral	
:	TokenNameCOLON	
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:1:172: K_INSERT 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:1:172: K_INSERT 
{	TokenNameLBRACE	
mK_INSERT	TokenNameIdentifier	 m K  INSERT
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
25	TokenNameIntegerLiteral	
:	TokenNameCOLON	
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:1:181: K_UPDATE 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:1:181: K_UPDATE 
{	TokenNameLBRACE	
mK_UPDATE	TokenNameIdentifier	 m K  UPDATE
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
26	TokenNameIntegerLiteral	
:	TokenNameCOLON	
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:1:190: K_WITH 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:1:190: K_WITH 
{	TokenNameLBRACE	
mK_WITH	TokenNameIdentifier	 m K  WITH
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
27	TokenNameIntegerLiteral	
:	TokenNameCOLON	
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:1:197: K_LIMIT 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:1:197: K_LIMIT 
{	TokenNameLBRACE	
mK_LIMIT	TokenNameIdentifier	 m K  LIMIT
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
28	TokenNameIntegerLiteral	
:	TokenNameCOLON	
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:1:205: K_USING 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:1:205: K_USING 
{	TokenNameLBRACE	
mK_USING	TokenNameIdentifier	 m K  USING
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
29	TokenNameIntegerLiteral	
:	TokenNameCOLON	
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:1:213: K_USE 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:1:213: K_USE 
{	TokenNameLBRACE	
mK_USE	TokenNameIdentifier	 m K  USE
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
30	TokenNameIntegerLiteral	
:	TokenNameCOLON	
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:1:219: K_COUNT 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:1:219: K_COUNT 
{	TokenNameLBRACE	
mK_COUNT	TokenNameIdentifier	 m K  COUNT
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
31	TokenNameIntegerLiteral	
:	TokenNameCOLON	
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:1:227: K_SET 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:1:227: K_SET 
{	TokenNameLBRACE	
mK_SET	TokenNameIdentifier	 m K  SET
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
32	TokenNameIntegerLiteral	
:	TokenNameCOLON	
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:1:233: K_BEGIN 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:1:233: K_BEGIN 
{	TokenNameLBRACE	
mK_BEGIN	TokenNameIdentifier	 m K  BEGIN
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
33	TokenNameIntegerLiteral	
:	TokenNameCOLON	
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:1:241: K_UNLOGGED 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:1:241: K_UNLOGGED 
{	TokenNameLBRACE	
mK_UNLOGGED	TokenNameIdentifier	 m K  UNLOGGED
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
34	TokenNameIntegerLiteral	
:	TokenNameCOLON	
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:1:252: K_BATCH 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:1:252: K_BATCH 
{	TokenNameLBRACE	
mK_BATCH	TokenNameIdentifier	 m K  BATCH
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
35	TokenNameIntegerLiteral	
:	TokenNameCOLON	
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:1:260: K_APPLY 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:1:260: K_APPLY 
{	TokenNameLBRACE	
mK_APPLY	TokenNameIdentifier	 m K  APPLY
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
36	TokenNameIntegerLiteral	
:	TokenNameCOLON	
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:1:268: K_TRUNCATE 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:1:268: K_TRUNCATE 
{	TokenNameLBRACE	
mK_TRUNCATE	TokenNameIdentifier	 m K  TRUNCATE
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
37	TokenNameIntegerLiteral	
:	TokenNameCOLON	
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:1:279: K_DELETE 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:1:279: K_DELETE 
{	TokenNameLBRACE	
mK_DELETE	TokenNameIdentifier	 m K  DELETE
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
38	TokenNameIntegerLiteral	
:	TokenNameCOLON	
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:1:288: K_IN 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:1:288: K_IN 
{	TokenNameLBRACE	
mK_IN	TokenNameIdentifier	 m K  IN
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
39	TokenNameIntegerLiteral	
:	TokenNameCOLON	
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:1:293: K_CREATE 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:1:293: K_CREATE 
{	TokenNameLBRACE	
mK_CREATE	TokenNameIdentifier	 m K  CREATE
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
40	TokenNameIntegerLiteral	
:	TokenNameCOLON	
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:1:302: K_KEYSPACE 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:1:302: K_KEYSPACE 
{	TokenNameLBRACE	
mK_KEYSPACE	TokenNameIdentifier	 m K  KEYSPACE
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
41	TokenNameIntegerLiteral	
:	TokenNameCOLON	
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:1:313: K_KEYSPACES 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:1:313: K_KEYSPACES 
{	TokenNameLBRACE	
mK_KEYSPACES	TokenNameIdentifier	 m K  KEYSPACES
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
42	TokenNameIntegerLiteral	
:	TokenNameCOLON	
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:1:325: K_COLUMNFAMILY 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:1:325: K_COLUMNFAMILY 
{	TokenNameLBRACE	
mK_COLUMNFAMILY	TokenNameIdentifier	 m K  COLUMNFAMILY
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
43	TokenNameIntegerLiteral	
:	TokenNameCOLON	
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:1:340: K_INDEX 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:1:340: K_INDEX 
{	TokenNameLBRACE	
mK_INDEX	TokenNameIdentifier	 m K  INDEX
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
44	TokenNameIntegerLiteral	
:	TokenNameCOLON	
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:1:348: K_ON 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:1:348: K_ON 
{	TokenNameLBRACE	
mK_ON	TokenNameIdentifier	 m K  ON
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
45	TokenNameIntegerLiteral	
:	TokenNameCOLON	
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:1:353: K_TO 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:1:353: K_TO 
{	TokenNameLBRACE	
mK_TO	TokenNameIdentifier	 m K  TO
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
46	TokenNameIntegerLiteral	
:	TokenNameCOLON	
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:1:358: K_DROP 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:1:358: K_DROP 
{	TokenNameLBRACE	
mK_DROP	TokenNameIdentifier	 m K  DROP
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
47	TokenNameIntegerLiteral	
:	TokenNameCOLON	
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:1:365: K_PRIMARY 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:1:365: K_PRIMARY 
{	TokenNameLBRACE	
mK_PRIMARY	TokenNameIdentifier	 m K  PRIMARY
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
48	TokenNameIntegerLiteral	
:	TokenNameCOLON	
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:1:375: K_INTO 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:1:375: K_INTO 
{	TokenNameLBRACE	
mK_INTO	TokenNameIdentifier	 m K  INTO
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
49	TokenNameIntegerLiteral	
:	TokenNameCOLON	
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:1:382: K_VALUES 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:1:382: K_VALUES 
{	TokenNameLBRACE	
mK_VALUES	TokenNameIdentifier	 m K  VALUES
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
50	TokenNameIntegerLiteral	
:	TokenNameCOLON	
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:1:391: K_TIMESTAMP 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:1:391: K_TIMESTAMP 
{	TokenNameLBRACE	
mK_TIMESTAMP	TokenNameIdentifier	 m K  TIMESTAMP
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
51	TokenNameIntegerLiteral	
:	TokenNameCOLON	
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:1:403: K_TTL 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:1:403: K_TTL 
{	TokenNameLBRACE	
mK_TTL	TokenNameIdentifier	 m K  TTL
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
52	TokenNameIntegerLiteral	
:	TokenNameCOLON	
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:1:409: K_ALTER 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:1:409: K_ALTER 
{	TokenNameLBRACE	
mK_ALTER	TokenNameIdentifier	 m K  ALTER
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
53	TokenNameIntegerLiteral	
:	TokenNameCOLON	
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:1:417: K_RENAME 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:1:417: K_RENAME 
{	TokenNameLBRACE	
mK_RENAME	TokenNameIdentifier	 m K  RENAME
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
54	TokenNameIntegerLiteral	
:	TokenNameCOLON	
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:1:426: K_ADD 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:1:426: K_ADD 
{	TokenNameLBRACE	
mK_ADD	TokenNameIdentifier	 m K  ADD
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
55	TokenNameIntegerLiteral	
:	TokenNameCOLON	
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:1:432: K_TYPE 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:1:432: K_TYPE 
{	TokenNameLBRACE	
mK_TYPE	TokenNameIdentifier	 m K  TYPE
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
56	TokenNameIntegerLiteral	
:	TokenNameCOLON	
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:1:439: K_COMPACT 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:1:439: K_COMPACT 
{	TokenNameLBRACE	
mK_COMPACT	TokenNameIdentifier	 m K  COMPACT
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
57	TokenNameIntegerLiteral	
:	TokenNameCOLON	
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:1:449: K_STORAGE 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:1:449: K_STORAGE 
{	TokenNameLBRACE	
mK_STORAGE	TokenNameIdentifier	 m K  STORAGE
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
58	TokenNameIntegerLiteral	
:	TokenNameCOLON	
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:1:459: K_ORDER 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:1:459: K_ORDER 
{	TokenNameLBRACE	
mK_ORDER	TokenNameIdentifier	 m K  ORDER
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
59	TokenNameIntegerLiteral	
:	TokenNameCOLON	
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:1:467: K_BY 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:1:467: K_BY 
{	TokenNameLBRACE	
mK_BY	TokenNameIdentifier	 m K  BY
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
60	TokenNameIntegerLiteral	
:	TokenNameCOLON	
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:1:472: K_ASC 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:1:472: K_ASC 
{	TokenNameLBRACE	
mK_ASC	TokenNameIdentifier	 m K  ASC
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
61	TokenNameIntegerLiteral	
:	TokenNameCOLON	
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:1:478: K_DESC 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:1:478: K_DESC 
{	TokenNameLBRACE	
mK_DESC	TokenNameIdentifier	 m K  DESC
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
62	TokenNameIntegerLiteral	
:	TokenNameCOLON	
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:1:485: K_ALLOW 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:1:485: K_ALLOW 
{	TokenNameLBRACE	
mK_ALLOW	TokenNameIdentifier	 m K  ALLOW
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
63	TokenNameIntegerLiteral	
:	TokenNameCOLON	
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:1:493: K_FILTERING 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:1:493: K_FILTERING 
{	TokenNameLBRACE	
mK_FILTERING	TokenNameIdentifier	 m K  FILTERING
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
64	TokenNameIntegerLiteral	
:	TokenNameCOLON	
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:1:505: K_GRANT 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:1:505: K_GRANT 
{	TokenNameLBRACE	
mK_GRANT	TokenNameIdentifier	 m K  GRANT
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
65	TokenNameIntegerLiteral	
:	TokenNameCOLON	
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:1:513: K_ALL 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:1:513: K_ALL 
{	TokenNameLBRACE	
mK_ALL	TokenNameIdentifier	 m K  ALL
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
66	TokenNameIntegerLiteral	
:	TokenNameCOLON	
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:1:519: K_PERMISSION 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:1:519: K_PERMISSION 
{	TokenNameLBRACE	
mK_PERMISSION	TokenNameIdentifier	 m K  PERMISSION
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
67	TokenNameIntegerLiteral	
:	TokenNameCOLON	
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:1:532: K_PERMISSIONS 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:1:532: K_PERMISSIONS 
{	TokenNameLBRACE	
mK_PERMISSIONS	TokenNameIdentifier	 m K  PERMISSIONS
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
68	TokenNameIntegerLiteral	
:	TokenNameCOLON	
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:1:546: K_OF 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:1:546: K_OF 
{	TokenNameLBRACE	
mK_OF	TokenNameIdentifier	 m K  OF
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
69	TokenNameIntegerLiteral	
:	TokenNameCOLON	
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:1:551: K_REVOKE 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:1:551: K_REVOKE 
{	TokenNameLBRACE	
mK_REVOKE	TokenNameIdentifier	 m K  REVOKE
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
70	TokenNameIntegerLiteral	
:	TokenNameCOLON	
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:1:560: K_MODIFY 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:1:560: K_MODIFY 
{	TokenNameLBRACE	
mK_MODIFY	TokenNameIdentifier	 m K  MODIFY
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
71	TokenNameIntegerLiteral	
:	TokenNameCOLON	
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:1:569: K_AUTHORIZE 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:1:569: K_AUTHORIZE 
{	TokenNameLBRACE	
mK_AUTHORIZE	TokenNameIdentifier	 m K  AUTHORIZE
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
72	TokenNameIntegerLiteral	
:	TokenNameCOLON	
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:1:581: K_NORECURSIVE 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:1:581: K_NORECURSIVE 
{	TokenNameLBRACE	
mK_NORECURSIVE	TokenNameIdentifier	 m K  NORECURSIVE
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
73	TokenNameIntegerLiteral	
:	TokenNameCOLON	
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:1:595: K_USER 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:1:595: K_USER 
{	TokenNameLBRACE	
mK_USER	TokenNameIdentifier	 m K  USER
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
74	TokenNameIntegerLiteral	
:	TokenNameCOLON	
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:1:602: K_USERS 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:1:602: K_USERS 
{	TokenNameLBRACE	
mK_USERS	TokenNameIdentifier	 m K  USERS
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
75	TokenNameIntegerLiteral	
:	TokenNameCOLON	
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:1:610: K_SUPERUSER 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:1:610: K_SUPERUSER 
{	TokenNameLBRACE	
mK_SUPERUSER	TokenNameIdentifier	 m K  SUPERUSER
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
76	TokenNameIntegerLiteral	
:	TokenNameCOLON	
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:1:622: K_NOSUPERUSER 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:1:622: K_NOSUPERUSER 
{	TokenNameLBRACE	
mK_NOSUPERUSER	TokenNameIdentifier	 m K  NOSUPERUSER
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
77	TokenNameIntegerLiteral	
:	TokenNameCOLON	
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:1:636: K_PASSWORD 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:1:636: K_PASSWORD 
{	TokenNameLBRACE	
mK_PASSWORD	TokenNameIdentifier	 m K  PASSWORD
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
78	TokenNameIntegerLiteral	
:	TokenNameCOLON	
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:1:647: K_CLUSTERING 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:1:647: K_CLUSTERING 
{	TokenNameLBRACE	
mK_CLUSTERING	TokenNameIdentifier	 m K  CLUSTERING
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
79	TokenNameIntegerLiteral	
:	TokenNameCOLON	
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:1:660: K_ASCII 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:1:660: K_ASCII 
{	TokenNameLBRACE	
mK_ASCII	TokenNameIdentifier	 m K  ASCII
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
80	TokenNameIntegerLiteral	
:	TokenNameCOLON	
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:1:668: K_BIGINT 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:1:668: K_BIGINT 
{	TokenNameLBRACE	
mK_BIGINT	TokenNameIdentifier	 m K  BIGINT
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
81	TokenNameIntegerLiteral	
:	TokenNameCOLON	
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:1:677: K_BLOB 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:1:677: K_BLOB 
{	TokenNameLBRACE	
mK_BLOB	TokenNameIdentifier	 m K  BLOB
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
82	TokenNameIntegerLiteral	
:	TokenNameCOLON	
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:1:684: K_BOOLEAN 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:1:684: K_BOOLEAN 
{	TokenNameLBRACE	
mK_BOOLEAN	TokenNameIdentifier	 m K  BOOLEAN
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
83	TokenNameIntegerLiteral	
:	TokenNameCOLON	
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:1:694: K_COUNTER 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:1:694: K_COUNTER 
{	TokenNameLBRACE	
mK_COUNTER	TokenNameIdentifier	 m K  COUNTER
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
84	TokenNameIntegerLiteral	
:	TokenNameCOLON	
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:1:704: K_DECIMAL 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:1:704: K_DECIMAL 
{	TokenNameLBRACE	
mK_DECIMAL	TokenNameIdentifier	 m K  DECIMAL
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
85	TokenNameIntegerLiteral	
:	TokenNameCOLON	
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:1:714: K_DOUBLE 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:1:714: K_DOUBLE 
{	TokenNameLBRACE	
mK_DOUBLE	TokenNameIdentifier	 m K  DOUBLE
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
86	TokenNameIntegerLiteral	
:	TokenNameCOLON	
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:1:723: K_FLOAT 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:1:723: K_FLOAT 
{	TokenNameLBRACE	
mK_FLOAT	TokenNameIdentifier	 m K  FLOAT
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
87	TokenNameIntegerLiteral	
:	TokenNameCOLON	
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:1:731: K_INET 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:1:731: K_INET 
{	TokenNameLBRACE	
mK_INET	TokenNameIdentifier	 m K  INET
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
88	TokenNameIntegerLiteral	
:	TokenNameCOLON	
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:1:738: K_INT 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:1:738: K_INT 
{	TokenNameLBRACE	
mK_INT	TokenNameIdentifier	 m K  INT
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
89	TokenNameIntegerLiteral	
:	TokenNameCOLON	
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:1:744: K_TEXT 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:1:744: K_TEXT 
{	TokenNameLBRACE	
mK_TEXT	TokenNameIdentifier	 m K  TEXT
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
90	TokenNameIntegerLiteral	
:	TokenNameCOLON	
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:1:751: K_UUID 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:1:751: K_UUID 
{	TokenNameLBRACE	
mK_UUID	TokenNameIdentifier	 m K  UUID
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
91	TokenNameIntegerLiteral	
:	TokenNameCOLON	
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:1:758: K_VARCHAR 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:1:758: K_VARCHAR 
{	TokenNameLBRACE	
mK_VARCHAR	TokenNameIdentifier	 m K  VARCHAR
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
92	TokenNameIntegerLiteral	
:	TokenNameCOLON	
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:1:768: K_VARINT 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:1:768: K_VARINT 
{	TokenNameLBRACE	
mK_VARINT	TokenNameIdentifier	 m K  VARINT
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
93	TokenNameIntegerLiteral	
:	TokenNameCOLON	
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:1:777: K_TIMEUUID 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:1:777: K_TIMEUUID 
{	TokenNameLBRACE	
mK_TIMEUUID	TokenNameIdentifier	 m K  TIMEUUID
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
94	TokenNameIntegerLiteral	
:	TokenNameCOLON	
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:1:788: K_TOKEN 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:1:788: K_TOKEN 
{	TokenNameLBRACE	
mK_TOKEN	TokenNameIdentifier	 m K  TOKEN
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
95	TokenNameIntegerLiteral	
:	TokenNameCOLON	
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:1:796: K_WRITETIME 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:1:796: K_WRITETIME 
{	TokenNameLBRACE	
mK_WRITETIME	TokenNameIdentifier	 m K  WRITETIME
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
96	TokenNameIntegerLiteral	
:	TokenNameCOLON	
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:1:808: K_MAP 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:1:808: K_MAP 
{	TokenNameLBRACE	
mK_MAP	TokenNameIdentifier	 m K  MAP
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
97	TokenNameIntegerLiteral	
:	TokenNameCOLON	
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:1:814: K_LIST 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:1:814: K_LIST 
{	TokenNameLBRACE	
mK_LIST	TokenNameIdentifier	 m K  LIST
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
98	TokenNameIntegerLiteral	
:	TokenNameCOLON	
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:1:821: K_TRUE 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:1:821: K_TRUE 
{	TokenNameLBRACE	
mK_TRUE	TokenNameIdentifier	 m K  TRUE
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
99	TokenNameIntegerLiteral	
:	TokenNameCOLON	
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:1:828: K_FALSE 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:1:828: K_FALSE 
{	TokenNameLBRACE	
mK_FALSE	TokenNameIdentifier	 m K  FALSE
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
100	TokenNameIntegerLiteral	
:	TokenNameCOLON	
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:1:836: STRING_LITERAL 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:1:836: STRING_LITERAL 
{	TokenNameLBRACE	
mSTRING_LITERAL	TokenNameIdentifier	 m STRING  LITERAL
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
101	TokenNameIntegerLiteral	
:	TokenNameCOLON	
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:1:851: QUOTED_NAME 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:1:851: QUOTED_NAME 
{	TokenNameLBRACE	
mQUOTED_NAME	TokenNameIdentifier	 m QUOTED  NAME
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
102	TokenNameIntegerLiteral	
:	TokenNameCOLON	
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:1:863: INTEGER 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:1:863: INTEGER 
{	TokenNameLBRACE	
mINTEGER	TokenNameIdentifier	 m INTEGER
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
103	TokenNameIntegerLiteral	
:	TokenNameCOLON	
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:1:871: QMARK 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:1:871: QMARK 
{	TokenNameLBRACE	
mQMARK	TokenNameIdentifier	 m QMARK
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
104	TokenNameIntegerLiteral	
:	TokenNameCOLON	
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:1:877: FLOAT 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:1:877: FLOAT 
{	TokenNameLBRACE	
mFLOAT	TokenNameIdentifier	 m FLOAT
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
105	TokenNameIntegerLiteral	
:	TokenNameCOLON	
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:1:883: IDENT 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:1:883: IDENT 
{	TokenNameLBRACE	
mIDENT	TokenNameIdentifier	 m IDENT
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
106	TokenNameIntegerLiteral	
:	TokenNameCOLON	
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:1:889: UUID 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:1:889: UUID 
{	TokenNameLBRACE	
mUUID	TokenNameIdentifier	 m UUID
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
107	TokenNameIntegerLiteral	
:	TokenNameCOLON	
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:1:894: WS 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:1:894: WS 
{	TokenNameLBRACE	
mWS	TokenNameIdentifier	 m WS
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
108	TokenNameIntegerLiteral	
:	TokenNameCOLON	
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:1:897: COMMENT 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:1:897: COMMENT 
{	TokenNameLBRACE	
mCOMMENT	TokenNameIdentifier	 m COMMENT
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
109	TokenNameIntegerLiteral	
:	TokenNameCOLON	
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:1:905: MULTILINE_COMMENT 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:1:905: MULTILINE_COMMENT 
{	TokenNameLBRACE	
mMULTILINE_COMMENT	TokenNameIdentifier	 m MULTILINE  COMMENT
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
protected	TokenNameprotected	
DFA13	TokenNameIdentifier	 DF A13
dfa13	TokenNameIdentifier	 dfa13
=	TokenNameEQUAL	
new	TokenNamenew	
DFA13	TokenNameIdentifier	 DF A13
(	TokenNameLPAREN	
this	TokenNamethis	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
DFA13_eotS	TokenNameIdentifier	 DF A13 eot S
=	TokenNameEQUAL	
"?.02)?k?)?"	TokenNameStringLiteral	?.02)?k?)?
+	TokenNamePLUS	
"k?)? )?)? )"	TokenNameStringLiteral	k?)? )?)? )
+	TokenNamePLUS	
"©ª )?k?)? )"	TokenNameStringLiteral	©ª )?k?)? )
+	TokenNamePLUS	
"Æ)É)ÍÎÏ?)"	TokenNameStringLiteral	Æ)É)ÍÎÏ?)
+	TokenNamePLUS	
"Ò)Ø )?)?)é )"	TokenNameStringLiteral	Ò)Ø )?)?)é )
+	TokenNamePLUS	
"? )?)k)?)?)"	TokenNameStringLiteral	? )?)k)?)?)
+	TokenNamePLUS	
"?)?)?)?)??"	TokenNameStringLiteral	?)?)?)?)??
+	TokenNamePLUS	
"?)??)??)?"	TokenNameStringLiteral	?)??)??)?
+	TokenNamePLUS	
")?)?)ı)?)?"	TokenNameStringLiteral	)?)?)ı)?)?
+	TokenNamePLUS	
")? )?)k)??)"	TokenNameStringLiteral	)? )?)k)??)
+	TokenNamePLUS	
"???)?Œœ)?"	TokenNameStringLiteral	???)?Œœ)?
+	TokenNamePLUS	
")??)?????"	TokenNameStringLiteral	)??)?????
+	TokenNamePLUS	
")?)?)?)??)"	TokenNameStringLiteral	)?)?)?)??)
+	TokenNamePLUS	
"?)???)?)?"	TokenNameStringLiteral	?)???)?)?
+	TokenNamePLUS	
"?)?)k)??)?"	TokenNameStringLiteral	?)?)k)??)?
+	TokenNamePLUS	
")?)?)?)???"	TokenNameStringLiteral	)?)?)?)???
+	TokenNamePLUS	
")?)?)??)??"	TokenNameStringLiteral	)?)?)??)??
+	TokenNamePLUS	
")?)???)?)?"	TokenNameStringLiteral	)?)???)?)?
+	TokenNamePLUS	
"????)k??)"	TokenNameStringLiteral	????)k??)
+	TokenNamePLUS	
"?)??)???)"	TokenNameStringLiteral	?)??)???)
+	TokenNamePLUS	
"??)????)k"	TokenNameStringLiteral	??)????)k
+	TokenNamePLUS	
"?)??)?)?)?"	TokenNameStringLiteral	?)??)?)?)?
+	TokenNamePLUS	
"???)?)k??"	TokenNameStringLiteral	???)?)k??
+	TokenNamePLUS	
"????)??)?"	TokenNameStringLiteral	????)??)?
+	TokenNamePLUS	
")???)????"	TokenNameStringLiteral	)???)????
+	TokenNamePLUS	
"??"	TokenNameStringLiteral	??
;	TokenNameSEMICOLON	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
DFA13_eofS	TokenNameIdentifier	 DF A13 eof S
=	TokenNameEQUAL	
"??"	TokenNameStringLiteral	??
;	TokenNameSEMICOLON	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
DFA13_minS	TokenNameIdentifier	 DF A13 min S
=	TokenNameEQUAL	
" ?-=C0H0ENI"	TokenNameStringLiteral	 ?-=C0H0ENI
+	TokenNamePLUS	
"0A0FAERAO?."	TokenNameStringLiteral	0A0FAERAO?.
+	TokenNamePLUS	
"?0?*?.?OHL"	TokenNameStringLiteral	?0?*?.?OHL
+	TokenNamePLUS	
"PO0LO0ETICL"	TokenNameStringLiteral	PO0LO0ETICL
+	TokenNamePLUS	
"TPD0Y0DLEIM"	TokenNameStringLiteral	TPD0Y0DLEIM
+	TokenNamePLUS	
"LUE0O0OG0LM"	TokenNameStringLiteral	LUE0O0OG0LM
+	TokenNamePLUS	
"UXBP0UO0DSR"	TokenNameStringLiteral	UXBP0UO0DSR
+	TokenNamePLUS	
"ILNADPR?.?"	TokenNameStringLiteral	ILNADPR?.?
+	TokenNamePLUS	
"RE0EMS0TARH"	TokenNameStringLiteral	RE0EMS0TARH
+	TokenNamePLUS	
"T0E0HL0?E0T"	TokenNameStringLiteral	T0E0HL0?E0T
+	TokenNamePLUS	
"EAO0NDTIUNP"	TokenNameStringLiteral	EAO0NDTIUNP
+	TokenNamePLUS	
"SACL?BI?E0"	TokenNameStringLiteral	SACL?BI?E0
+	TokenNamePLUS	
"ETLE0CEBP?"	TokenNameStringLiteral	ETLE0CEBP?
+	TokenNamePLUS	
"ESMCUOANI0U"	TokenNameStringLiteral	ESMCUOANI0U
+	TokenNamePLUS	
"E.AMC?R0E0E"	TokenNameStringLiteral	E.AMC?R0E0E
+	TokenNamePLUS	
"TE0E?IR?WO"	TokenNameStringLiteral	TE0E?IR?WO
+	TokenNamePLUS	
"Y?PR?0XTG?"	TokenNameStringLiteral	Y?PR?0XTG?
+	TokenNamePLUS	
"0G0TMTATHE0"	TokenNameStringLiteral	0G0TMTATHE0
+	TokenNamePLUS	
"N?S0C0E0M0T"	TokenNameStringLiteral	N?S0C0E0M0T
+	TokenNamePLUS	
"L0RWIANHEKM"	TokenNameStringLiteral	L0RWIANHEKM
+	TokenNamePLUS	
"TF?PC.GATU"	TokenNameStringLiteral	TF?PC.GATU
+	TokenNamePLUS	
"?0R0?T0R0AT"	TokenNameStringLiteral	?0R0?T0R0AT
+	TokenNamePLUS	
"?0EG?0?0N0"	TokenNameStringLiteral	?0EG?0?0N0
+	TokenNamePLUS	
"CE0A?T0TU?A"	TokenNameStringLiteral	CE0A?T0TU?A
+	TokenNamePLUS	
"?0?A?E?0OS"	TokenNameStringLiteral	?0?A?E?0OS
+	TokenNamePLUS	
"RTASE0YEU.E"	TokenNameStringLiteral	RTASE0YEU.E
+	TokenNamePLUS	
"0S?0I?I?I?"	TokenNameStringLiteral	0S?0I?I?I?
+	TokenNamePLUS	
"C0?0E?F?RT"	TokenNameStringLiteral	C0?0E?F?RT
+	TokenNamePLUS	
"R0?N0?AIT?"	TokenNameStringLiteral	R0?N0?AIT?
+	TokenNamePLUS	
"L0?RSY0R0?"	TokenNameStringLiteral	L0?RSY0R0?
+	TokenNamePLUS	
"0R.0?E0NMZE"	TokenNameStringLiteral	0R.0?E0NMZE
+	TokenNamePLUS	
"?DA0I?0?MD"	TokenNameStringLiteral	?DA0I?0?MD
+	TokenNamePLUS	
"E0?DI0?0?U"	TokenNameStringLiteral	E0?DI0?0?U
+	TokenNamePLUS	
"S.?R-GE0M?N"	TokenNameStringLiteral	S.?R-GE0M?N
+	TokenNamePLUS	
"?P0?0O?SI-"	TokenNameStringLiteral	?P0?0O?SI-
+	TokenNamePLUS	
"0?IG0?NEV?"	TokenNameStringLiteral	0?IG0?NEV?
+	TokenNamePLUS	
"L0?0REY?0?"	TokenNameStringLiteral	L0?0REY?0?
;	TokenNameSEMICOLON	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
DFA13_maxS	TokenNameIdentifier	 DF A13 max S
=	TokenNameEQUAL	
"} ?9=uruenu"	TokenNameStringLiteral	} ?9=uruenu
+	TokenNamePLUS	
"iryraero?f?"	TokenNameStringLiteral	iryraero?f?
+	TokenNamePLUS	
"f?/?9?ohtp"	TokenNameStringLiteral	f?/?9?ohtp
+	TokenNamePLUS	
"olofetictpd"	TokenNameStringLiteral	olofetictpd
+	TokenNamePLUS	
"fyzdlisueto"	TokenNameStringLiteral	fyzdlisueto
+	TokenNamePLUS	
"zogzlmuxbps"	TokenNameStringLiteral	zogzlmuxbps
+	TokenNamePLUS	
"uozdsrirvad"	TokenNameStringLiteral	uozdsrirvad
+	TokenNamePLUS	
"ps?f?rezem"	TokenNameStringLiteral	ps?f?rezem
+	TokenNamePLUS	
"sftarhtzezh"	TokenNameStringLiteral	sftarhtzezh
+	TokenNamePLUS	
"lz?ezteaoz"	TokenNameStringLiteral	lz?ezteaoz
+	TokenNamePLUS	
"ndtiunpsacl"	TokenNameStringLiteral	ndtiunpsacl
+	TokenNamePLUS	
"?bi?ezentl"	TokenNameStringLiteral	?bi?ezentl
+	TokenNamePLUS	
"eicebp?esm"	TokenNameStringLiteral	eicebp?esm
+	TokenNamePLUS	
"iuoanizuefa"	TokenNameStringLiteral	iuoanizuefa
+	TokenNamePLUS	
"mc?rzefete"	TokenNameStringLiteral	mc?rzefete
+	TokenNamePLUS	
"ze?ir?woy?"	TokenNameStringLiteral	ze?ir?woy?
+	TokenNamePLUS	
"pr?zxtg?zg"	TokenNameStringLiteral	pr?zxtg?zg
+	TokenNamePLUS	
"ztmtathezn?"	TokenNameStringLiteral	ztmtathezn?
+	TokenNamePLUS	
"uzczezmztlz"	TokenNameStringLiteral	uzczezmztlz
+	TokenNamePLUS	
"rwianhekmtf"	TokenNameStringLiteral	rwianhekmtf
+	TokenNamePLUS	
"?pcfgatu?z"	TokenNameStringLiteral	?pcfgatu?z
+	TokenNamePLUS	
"frz?tzrzat"	TokenNameStringLiteral	frz?tzrzat
+	TokenNamePLUS	
"?zeg?z?znz"	TokenNameStringLiteral	?zeg?z?znz
+	TokenNamePLUS	
"ceza?tztu?"	TokenNameStringLiteral	ceza?tztu?
+	TokenNamePLUS	
"a?z?a?e?z"	TokenNameStringLiteral	a?z?a?e?z
+	TokenNamePLUS	
"osrtasezyeu"	TokenNameStringLiteral	osrtasezyeu
+	TokenNamePLUS	
"fezs?fi?i?"	TokenNameStringLiteral	fezs?fi?i?
+	TokenNamePLUS	
"i?cz?ze?f?"	TokenNameStringLiteral	i?cz?ze?f?
+	TokenNamePLUS	
"rtrz?nz?ai"	TokenNameStringLiteral	rtrz?nz?ai
+	TokenNamePLUS	
"t?lz?rsyzr"	TokenNameStringLiteral	t?lz?rsyzr
+	TokenNamePLUS	
"z?zrfz?efn"	TokenNameStringLiteral	z?zrfz?efn
+	TokenNamePLUS	
"mze?dazi?z"	TokenNameStringLiteral	mze?dazi?z
+	TokenNamePLUS	
"?mdez?diz?"	TokenNameStringLiteral	?mdez?diz?
+	TokenNamePLUS	
"z?usf?r-ge"	TokenNameStringLiteral	z?usf?r-ge
+	TokenNamePLUS	
"zm?n?pz?zo"	TokenNameStringLiteral	zm?n?pz?zo
+	TokenNamePLUS	
"?si9z?igz?"	TokenNameStringLiteral	?si9z?igz?
+	TokenNamePLUS	
"nev?lz?zre"	TokenNameStringLiteral	nev?lz?zre
+	TokenNamePLUS	
"y?z?"	TokenNameStringLiteral	y?z?
;	TokenNameSEMICOLON	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
DFA13_acceptS	TokenNameIdentifier	 DF A13 accept S
=	TokenNameEQUAL	
"?    "	TokenNameStringLiteral	?    
+	TokenNamePLUS	
" ?de?g?ik?"	TokenNameStringLiteral	 ?de?g?ik?
+	TokenNamePLUS	
"l?8?fh?"	TokenNameStringLiteral	l?8?fh?
+	TokenNamePLUS	
"jm?&?;?- ?"	TokenNameStringLiteral	jm?&?;?- ?
+	TokenNamePLUS	
"D,? ?<?A?"	TokenNameStringLiteral	D,? ?<?A?
+	TokenNamePLUS	
"6?X??3?`"	TokenNameStringLiteral	6?X??3?`
+	TokenNamePLUS	
"???0W?I?"	TokenNameStringLiteral	???0W?I?
+	TokenNamePLUS	
"Za?Q?b?Y?"	TokenNameStringLiteral	Za?Q?b?Y?
+	TokenNamePLUS	
"7?=?.?c?V"	TokenNameStringLiteral	7?=?.?c?V
+	TokenNamePLUS	
"?O4>?#?+?J"	TokenNameStringLiteral	?O4>?#?+?J
+	TokenNamePLUS	
"??"? ^?"	TokenNameStringLiteral	??"? ^?
+	TokenNamePLUS	
"*?:?@?(?"	TokenNameStringLiteral	*?:?@?(?
+	TokenNamePLUS	
"?'?P?%U?\"	TokenNameStringLiteral	?'?P?%U?\
+	TokenNamePLUS	
"?1E5F?9?S8"	TokenNameStringLiteral	?1E5F?9?S8
+	TokenNamePLUS	
"?R?T?/[?!"	TokenNameStringLiteral	?R?T?/[?!
+	TokenNamePLUS	
"?]$M?K?_G)?"	TokenNameStringLiteral	?]$M?K?_G)?
+	TokenNamePLUS	
"2?NB?CLH"	TokenNameStringLiteral	2?NB?CLH
;	TokenNameSEMICOLON	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
DFA13_specialS	TokenNameIdentifier	 DF A13 special S
=	TokenNameEQUAL	
"??}>"	TokenNameStringLiteral	??}>
;	TokenNameSEMICOLON	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
DFA13_transitionS	TokenNameIdentifier	 DF A13 transition S
=	TokenNameEQUAL	
{	TokenNameLBRACE	
"*?*?*?%?$"	TokenNameStringLiteral	*?*?*?%?$
+	TokenNamePLUS	
" + &  "	TokenNameStringLiteral	 + &  
+	TokenNamePLUS	
"'?(!)"	TokenNameStringLiteral	'?(!)
+	TokenNamePLUS	
")"#) "	TokenNameStringLiteral	)"#) 
+	TokenNamePLUS	
")??"	TokenNameStringLiteral	)??
+	TokenNamePLUS	
"(!))"#"	TokenNameStringLiteral	(!))"#
+	TokenNamePLUS	
") ) ? "	TokenNameStringLiteral	) ) ? 
,	TokenNameCOMMA	
""	TokenNameStringLiteral	 
,	TokenNameCOMMA	
""	TokenNameStringLiteral	 
,	TokenNameCOMMA	
""	TokenNameStringLiteral	 
,	TokenNameCOMMA	
""	TokenNameStringLiteral	 
,	TokenNameCOMMA	
""	TokenNameStringLiteral	 
,	TokenNameCOMMA	
""	TokenNameStringLiteral	 
,	TokenNameCOMMA	
""	TokenNameStringLiteral	 
,	TokenNameCOMMA	
""	TokenNameStringLiteral	 
,	TokenNameCOMMA	
""	TokenNameStringLiteral	 
,	TokenNameCOMMA	
""	TokenNameStringLiteral	 
,	TokenNameCOMMA	
""	TokenNameStringLiteral	 
,	TokenNameCOMMA	
""	TokenNameStringLiteral	 
,	TokenNameCOMMA	
""	TokenNameStringLiteral	 
,	TokenNameCOMMA	
",? -"	TokenNameStringLiteral	,? -
,	TokenNameCOMMA	
"/"	TokenNameStringLiteral	/
,	TokenNameCOMMA	
"1"	TokenNameStringLiteral	1
,	TokenNameCOMMA	
"4?5?36 ?4?"	TokenNameStringLiteral	4?5?36 ?4?
+	TokenNamePLUS	
"5?36"	TokenNameStringLiteral	5?36
,	TokenNameCOMMA	
" ;?8;?9?:?"	TokenNameStringLiteral	 ;?8;?9?:?
+	TokenNamePLUS	
"7?8;?9?:?"	TokenNameStringLiteral	7?8;?9?:?
+	TokenNamePLUS	
"7"	TokenNameStringLiteral	7
,	TokenNameCOMMA	
"<=?>?<=?>"	TokenNameStringLiteral	<=?>?<=?>
,	TokenNameCOMMA	
" ;?;D;?@?C"	TokenNameStringLiteral	 ;?;D;?@?C
+	TokenNamePLUS	
"?B???A ?;D"	TokenNameStringLiteral	?B???A ?;D
+	TokenNamePLUS	
";?@?C?B??"	TokenNameStringLiteral	;?@?C?B??
+	TokenNamePLUS	
"?A"	TokenNameStringLiteral	?A
,	TokenNameCOMMA	
"E?E"	TokenNameStringLiteral	E?E
,	TokenNameCOMMA	
"F?F"	TokenNameStringLiteral	F?F
,	TokenNameCOMMA	
"H?G?I?J?"	TokenNameStringLiteral	H?G?I?J?
+	TokenNamePLUS	
"H?G?I?J"	TokenNameStringLiteral	H?G?I?J
,	TokenNameCOMMA	
"K?K"	TokenNameStringLiteral	K?K
,	TokenNameCOMMA	
" ;?;?M?L?N"	TokenNameStringLiteral	 ;?;?M?L?N
+	TokenNamePLUS	
"?;?M?L?N"	TokenNameStringLiteral	?;?M?L?N
,	TokenNameCOMMA	
" ;?O;T;?S?"	TokenNameStringLiteral	 ;?O;T;?S?
+	TokenNamePLUS	
"R?P ?Q?O;T"	TokenNameStringLiteral	R?P ?Q?O;T
+	TokenNamePLUS	
";?S?R?P ?Q"	TokenNameStringLiteral	;?S?R?P ?Q
,	TokenNameCOMMA	
"Z?Y?W?U?"	TokenNameStringLiteral	Z?Y?W?U?
+	TokenNamePLUS	
"X?V?[?Z?Y"	TokenNameStringLiteral	X?V?[?Z?Y
+	TokenNamePLUS	
"?W?U?X?V?"	TokenNameStringLiteral	?W?U?X?V?
+	TokenNamePLUS	
"["	TokenNameStringLiteral	[
,	TokenNameCOMMA	
" ;?;\;?]?^"	TokenNameStringLiteral	 ;?;\;?]?^
+	TokenNamePLUS	
"?;\;?]?^"	TokenNameStringLiteral	?;\;?]?^
,	TokenNameCOMMA	
"_?`?a?_?"	TokenNameStringLiteral	_?`?a?_?
+	TokenNamePLUS	
"`?a"	TokenNameStringLiteral	`?a
,	TokenNameCOMMA	
"b?c ?d?b?"	TokenNameStringLiteral	b?c ?d?b?
+	TokenNamePLUS	
"c ?d"	TokenNameStringLiteral	c ?d
,	TokenNameCOMMA	
"e?e"	TokenNameStringLiteral	e?e
,	TokenNameCOMMA	
"f?f"	TokenNameStringLiteral	f?f
,	TokenNameCOMMA	
"g?g"	TokenNameStringLiteral	g?g
,	TokenNameCOMMA	
"i ?h?i ?h"	TokenNameStringLiteral	i ?h?i ?h
,	TokenNameCOMMA	
"j?j"	TokenNameStringLiteral	j?j
,	TokenNameCOMMA	
""	TokenNameStringLiteral	 
,	TokenNameCOMMA	
""	TokenNameStringLiteral	 
,	TokenNameCOMMA	
"l? m?n?n"	TokenNameStringLiteral	l? m?n?n
,	TokenNameCOMMA	
""	TokenNameStringLiteral	 
,	TokenNameCOMMA	
" ;?;?;"	TokenNameStringLiteral	 ;?;?;
,	TokenNameCOMMA	
""	TokenNameStringLiteral	 
,	TokenNameCOMMA	
""	TokenNameStringLiteral	 
,	TokenNameCOMMA	
"o?,"	TokenNameStringLiteral	o?,
,	TokenNameCOMMA	
""	TokenNameStringLiteral	 
,	TokenNameCOMMA	
"l? -"	TokenNameStringLiteral	l? -
,	TokenNameCOMMA	
""	TokenNameStringLiteral	 
,	TokenNameCOMMA	
""	TokenNameStringLiteral	 
,	TokenNameCOMMA	
""	TokenNameStringLiteral	 
,	TokenNameCOMMA	
""	TokenNameStringLiteral	 
,	TokenNameCOMMA	
""	TokenNameStringLiteral	 
,	TokenNameCOMMA	
"p?p"	TokenNameStringLiteral	p?p
,	TokenNameCOMMA	
"q?q"	TokenNameStringLiteral	q?q
,	TokenNameCOMMA	
"r?s?r?s"	TokenNameStringLiteral	r?s?r?s
,	TokenNameCOMMA	
"t?t"	TokenNameStringLiteral	t?t
,	TokenNameCOMMA	
"u?u"	TokenNameStringLiteral	u?u
,	TokenNameCOMMA	
" w?w?v?w?"	TokenNameStringLiteral	 w?w?v?w?
+	TokenNamePLUS	
"v"	TokenNameStringLiteral	v
,	TokenNameCOMMA	
"x?x"	TokenNameStringLiteral	x?x
,	TokenNameCOMMA	
"y?y"	TokenNameStringLiteral	y?y
,	TokenNameCOMMA	
" w?w?w"	TokenNameStringLiteral	 w?w?w
,	TokenNameCOMMA	
"z?z"	TokenNameStringLiteral	z?z
,	TokenNameCOMMA	
"{?{"	TokenNameStringLiteral	{?{
,	TokenNameCOMMA	
"|?|"	TokenNameStringLiteral	|?|
,	TokenNameCOMMA	
"}?}"	TokenNameStringLiteral	}?}
,	TokenNameCOMMA	
"?~??~"	TokenNameStringLiteral	?~??~
,	TokenNameCOMMA	
"???"	TokenNameStringLiteral	???
,	TokenNameCOMMA	
"???"	TokenNameStringLiteral	???
,	TokenNameCOMMA	
"???"	TokenNameStringLiteral	???
,	TokenNameCOMMA	
" w?w?w?w?"	TokenNameStringLiteral	 w?w?w?w?
+	TokenNamePLUS	
"w"	TokenNameStringLiteral	w
,	TokenNameCOMMA	
"???"	TokenNameStringLiteral	???
,	TokenNameCOMMA	
" )?)?? )??"	TokenNameStringLiteral	 )?)?? )??
+	TokenNamePLUS	
")?)?)?? )?"	TokenNameStringLiteral	)?)?)?? )?
+	TokenNamePLUS	
"?)"	TokenNameStringLiteral	?)
,	TokenNameCOMMA	
"???"	TokenNameStringLiteral	???
,	TokenNameCOMMA	
"???"	TokenNameStringLiteral	???
,	TokenNameCOMMA	
"???????"	TokenNameStringLiteral	???????
,	TokenNameCOMMA	
"???"	TokenNameStringLiteral	???
,	TokenNameCOMMA	
"???????"	TokenNameStringLiteral	???????
,	TokenNameCOMMA	
"???????"	TokenNameStringLiteral	???????
+	TokenNamePLUS	
"??"	TokenNameStringLiteral	??
,	TokenNameCOMMA	
"???"	TokenNameStringLiteral	???
,	TokenNameCOMMA	
"???"	TokenNameStringLiteral	???
,	TokenNameCOMMA	
" w?w ?? ?w ?"	TokenNameStringLiteral	 w?w ?? ?w ?
+	TokenNamePLUS	
"?"	TokenNameStringLiteral	?
,	TokenNameCOMMA	
"???"	TokenNameStringLiteral	???
,	TokenNameCOMMA	
" )?)?)?)"	TokenNameStringLiteral	 )?)?)?)
,	TokenNameCOMMA	
"???"	TokenNameStringLiteral	???
,	TokenNameCOMMA	
"???"	TokenNameStringLiteral	???
,	TokenNameCOMMA	
" w?w??w?"	TokenNameStringLiteral	 w?w??w?
,	TokenNameCOMMA	
" )? )?)?)? "	TokenNameStringLiteral	 )? )?)?)? 
+	TokenNamePLUS	
")?)"	TokenNameStringLiteral	)?)
,	TokenNameCOMMA	
"???"	TokenNameStringLiteral	???
,	TokenNameCOMMA	
"???"	TokenNameStringLiteral	???
,	TokenNameCOMMA	
" ? "	TokenNameStringLiteral	 ? 
,	TokenNameCOMMA	
"¡?¡"	TokenNameStringLiteral	¡?¡
,	TokenNameCOMMA	
"¢?¢"	TokenNameStringLiteral	¢?¢
,	TokenNameCOMMA	
"£?£"	TokenNameStringLiteral	£?£
,	TokenNameCOMMA	
" w?w?w???"	TokenNameStringLiteral	 w?w?w???
+	TokenNamePLUS	
"¥ ?w?w???"	TokenNameStringLiteral	¥ ?w?w???
+	TokenNamePLUS	
"¥"	TokenNameStringLiteral	¥
,	TokenNameCOMMA	
"§?§"	TokenNameStringLiteral	§?§
,	TokenNameCOMMA	
"¨?¨"	TokenNameStringLiteral	¨?¨
,	TokenNameCOMMA	
" )?)?)?)"	TokenNameStringLiteral	 )?)?)?)
,	TokenNameCOMMA	
" )?)?)?)"	TokenNameStringLiteral	 )?)?)?)
,	TokenNameCOMMA	
"«?«"	TokenNameStringLiteral	«?«
,	TokenNameCOMMA	
"¬?¬"	TokenNameStringLiteral	¬?¬
,	TokenNameCOMMA	
"???"	TokenNameStringLiteral	???
,	TokenNameCOMMA	
"®?®"	TokenNameStringLiteral	®?®
,	TokenNameCOMMA	
"°?¯?°?¯"	TokenNameStringLiteral	°?¯?°?¯
,	TokenNameCOMMA	
"??±???±"	TokenNameStringLiteral	??±???±
,	TokenNameCOMMA	
"???"	TokenNameStringLiteral	???
,	TokenNameCOMMA	
"´?´"	TokenNameStringLiteral	´?´
,	TokenNameCOMMA	
"µ?µ"	TokenNameStringLiteral	µ?µ
,	TokenNameCOMMA	
"·¶?·¶"	TokenNameStringLiteral	·¶?·¶
,	TokenNameCOMMA	
""	TokenNameStringLiteral	 
,	TokenNameCOMMA	
""	TokenNameStringLiteral	 
,	TokenNameCOMMA	
"l? ¸?n?n"	TokenNameStringLiteral	l? ¸?n?n
,	TokenNameCOMMA	
""	TokenNameStringLiteral	 
,	TokenNameCOMMA	
""	TokenNameStringLiteral	 
,	TokenNameCOMMA	
"???"	TokenNameStringLiteral	???
,	TokenNameCOMMA	
"º?º"	TokenNameStringLiteral	º?º
,	TokenNameCOMMA	
"»?»"	TokenNameStringLiteral	»?»
,	TokenNameCOMMA	
" )?)?)?)"	TokenNameStringLiteral	 )?)?)?)
,	TokenNameCOMMA	
"???"	TokenNameStringLiteral	???
,	TokenNameCOMMA	
"???"	TokenNameStringLiteral	???
,	TokenNameCOMMA	
"¿?¿"	TokenNameStringLiteral	¿?¿
,	TokenNameCOMMA	
" À?À?À"	TokenNameStringLiteral	 À?À?À
,	TokenNameCOMMA	
"Á?Á"	TokenNameStringLiteral	Á?Á
,	TokenNameCOMMA	
"Â?Â"	TokenNameStringLiteral	Â?Â
,	TokenNameCOMMA	
"Ã?Ã"	TokenNameStringLiteral	Ã?Ã
,	TokenNameCOMMA	
"Ä?Ä"	TokenNameStringLiteral	Ä?Ä
,	TokenNameCOMMA	
"Å?Å"	TokenNameStringLiteral	Å?Å
,	TokenNameCOMMA	
" )?)Ç)?)?"	TokenNameStringLiteral	 )?)Ç)?)?
+	TokenNamePLUS	
")Ç)"	TokenNameStringLiteral	)Ç)
,	TokenNameCOMMA	
"È?È"	TokenNameStringLiteral	È?È
,	TokenNameCOMMA	
" )?)Ê )?)?"	TokenNameStringLiteral	 )?)Ê )?)?
+	TokenNamePLUS	
")Ê )"	TokenNameStringLiteral	)Ê )
,	TokenNameCOMMA	
"Ë?Ë"	TokenNameStringLiteral	Ë?Ë
,	TokenNameCOMMA	
"Ì?Ì"	TokenNameStringLiteral	Ì?Ì
,	TokenNameCOMMA	
" )?)?)?)"	TokenNameStringLiteral	 )?)?)?)
,	TokenNameCOMMA	
" À?À)?)?À"	TokenNameStringLiteral	 À?À)?)?À
+	TokenNamePLUS	
")"	TokenNameStringLiteral	)
,	TokenNameCOMMA	
" )?)?)?)?)"	TokenNameStringLiteral	 )?)?)?)?)
+	TokenNamePLUS	
"?)"	TokenNameStringLiteral	?)
,	TokenNameCOMMA	
""	TokenNameStringLiteral	 
,	TokenNameCOMMA	
"Ñ?Ñ"	TokenNameStringLiteral	Ñ?Ñ
,	TokenNameCOMMA	
" )?)Ó )?)?"	TokenNameStringLiteral	 )?)Ó )?)?
+	TokenNamePLUS	
")Ó )"	TokenNameStringLiteral	)Ó )
,	TokenNameCOMMA	
"Ô?Ô"	TokenNameStringLiteral	Ô?Ô
,	TokenNameCOMMA	
"Õ?Õ"	TokenNameStringLiteral	Õ?Õ
,	TokenNameCOMMA	
"Ö?Ö"	TokenNameStringLiteral	Ö?Ö
,	TokenNameCOMMA	
"???"	TokenNameStringLiteral	???
,	TokenNameCOMMA	
" )?)Ù)?)?"	TokenNameStringLiteral	 )?)Ù)?)?
+	TokenNamePLUS	
")Ù)"	TokenNameStringLiteral	)Ù)
,	TokenNameCOMMA	
"Ú?Ú"	TokenNameStringLiteral	Ú?Ú
,	TokenNameCOMMA	
"Û?Û"	TokenNameStringLiteral	Û?Û
,	TokenNameCOMMA	
"Ü?Ü"	TokenNameStringLiteral	Ü?Ü
,	TokenNameCOMMA	
"???"	TokenNameStringLiteral	???
,	TokenNameCOMMA	
"???"	TokenNameStringLiteral	???
,	TokenNameCOMMA	
"ß?ß"	TokenNameStringLiteral	ß?ß
,	TokenNameCOMMA	
"à?à"	TokenNameStringLiteral	à?à
,	TokenNameCOMMA	
"á?á"	TokenNameStringLiteral	á?á
,	TokenNameCOMMA	
"â?â"	TokenNameStringLiteral	â?â
,	TokenNameCOMMA	
"ã?ã"	TokenNameStringLiteral	ã?ã
,	TokenNameCOMMA	
"ä?ä"	TokenNameStringLiteral	ä?ä
,	TokenNameCOMMA	
""	TokenNameStringLiteral	 
,	TokenNameCOMMA	
"å?å"	TokenNameStringLiteral	å?å
,	TokenNameCOMMA	
"æ?æ"	TokenNameStringLiteral	æ?æ
,	TokenNameCOMMA	
"ç?ç"	TokenNameStringLiteral	ç?ç
,	TokenNameCOMMA	
""	TokenNameStringLiteral	 
,	TokenNameCOMMA	
"è?è"	TokenNameStringLiteral	è?è
,	TokenNameCOMMA	
" )?)?)?)"	TokenNameStringLiteral	 )?)?)?)
,	TokenNameCOMMA	
"ê?ê"	TokenNameStringLiteral	ê?ê
,	TokenNameCOMMA	
"ë?ì?ë?ì"	TokenNameStringLiteral	ë?ì?ë?ì
,	TokenNameCOMMA	
"í?í"	TokenNameStringLiteral	í?í
,	TokenNameCOMMA	
"î?î"	TokenNameStringLiteral	î?î
,	TokenNameCOMMA	
"ï?ï"	TokenNameStringLiteral	ï?ï
,	TokenNameCOMMA	
" À?À???À"	TokenNameStringLiteral	 À?À???À
+	TokenNamePLUS	
"??"	TokenNameStringLiteral	??
,	TokenNameCOMMA	
"ñ?ñ"	TokenNameStringLiteral	ñ?ñ
,	TokenNameCOMMA	
"ò?ò"	TokenNameStringLiteral	ò?ò
,	TokenNameCOMMA	
"ó?ó"	TokenNameStringLiteral	ó?ó
,	TokenNameCOMMA	
"ô?ô"	TokenNameStringLiteral	ô?ô
,	TokenNameCOMMA	
""	TokenNameStringLiteral	 
,	TokenNameCOMMA	
""	TokenNameStringLiteral	 
,	TokenNameCOMMA	
"õ?õ"	TokenNameStringLiteral	õ?õ
,	TokenNameCOMMA	
"ö?ö"	TokenNameStringLiteral	ö?ö
,	TokenNameCOMMA	
"÷?÷"	TokenNameStringLiteral	÷?÷
,	TokenNameCOMMA	
"ø?ø"	TokenNameStringLiteral	ø?ø
,	TokenNameCOMMA	
"ú?ù?ú?ù"	TokenNameStringLiteral	ú?ù?ú?ù
,	TokenNameCOMMA	
"û?û"	TokenNameStringLiteral	û?û
,	TokenNameCOMMA	
"ü?ü"	TokenNameStringLiteral	ü?ü
,	TokenNameCOMMA	
"???"	TokenNameStringLiteral	???
,	TokenNameCOMMA	
"???"	TokenNameStringLiteral	???
,	TokenNameCOMMA	
"ÿ?ÿ"	TokenNameStringLiteral	ÿ?ÿ
,	TokenNameCOMMA	
" )?)?)?)"	TokenNameStringLiteral	 )?)?)?)
,	TokenNameCOMMA	
"???"	TokenNameStringLiteral	???
,	TokenNameCOMMA	
"???"	TokenNameStringLiteral	???
,	TokenNameCOMMA	
"l? ??n?n"	TokenNameStringLiteral	l? ??n?n
,	TokenNameCOMMA	
"???"	TokenNameStringLiteral	???
,	TokenNameCOMMA	
"???"	TokenNameStringLiteral	???
,	TokenNameCOMMA	
"???"	TokenNameStringLiteral	???
,	TokenNameCOMMA	
""	TokenNameStringLiteral	 
,	TokenNameCOMMA	
"???"	TokenNameStringLiteral	???
,	TokenNameCOMMA	
" )?)?)?)"	TokenNameStringLiteral	 )?)?)?)
,	TokenNameCOMMA	
"???"	TokenNameStringLiteral	???
,	TokenNameCOMMA	
" ?????"	TokenNameStringLiteral	 ?????
,	TokenNameCOMMA	
"???"	TokenNameStringLiteral	???
,	TokenNameCOMMA	
"???"	TokenNameStringLiteral	???
,	TokenNameCOMMA	
"???"	TokenNameStringLiteral	???
,	TokenNameCOMMA	
" )?)?)?)"	TokenNameStringLiteral	 )?)?)?)
,	TokenNameCOMMA	
"???"	TokenNameStringLiteral	???
,	TokenNameCOMMA	
""	TokenNameStringLiteral	 
,	TokenNameCOMMA	
"???"	TokenNameStringLiteral	???
,	TokenNameCOMMA	
"???"	TokenNameStringLiteral	???
,	TokenNameCOMMA	
""	TokenNameStringLiteral	 
,	TokenNameCOMMA	
"???"	TokenNameStringLiteral	???
,	TokenNameCOMMA	
"???"	TokenNameStringLiteral	???
,	TokenNameCOMMA	
"???"	TokenNameStringLiteral	???
,	TokenNameCOMMA	
""	TokenNameStringLiteral	 
,	TokenNameCOMMA	
""	TokenNameStringLiteral	 
,	TokenNameCOMMA	
""	TokenNameStringLiteral	 
,	TokenNameCOMMA	
"???"	TokenNameStringLiteral	???
,	TokenNameCOMMA	
"???"	TokenNameStringLiteral	???
,	TokenNameCOMMA	
""	TokenNameStringLiteral	 
,	TokenNameCOMMA	
" )?)?)?)"	TokenNameStringLiteral	 )?)?)?)
,	TokenNameCOMMA	
" )?)?)?)"	TokenNameStringLiteral	 )?)?)?)
,	TokenNameCOMMA	
"???"	TokenNameStringLiteral	???
,	TokenNameCOMMA	
"???"	TokenNameStringLiteral	???
,	TokenNameCOMMA	
"???"	TokenNameStringLiteral	???
,	TokenNameCOMMA	
""	TokenNameStringLiteral	 
,	TokenNameCOMMA	
" )?)?)?)?)"	TokenNameStringLiteral	 )?)?)?)?)
+	TokenNamePLUS	
"?)"	TokenNameStringLiteral	?)
,	TokenNameCOMMA	
"???"	TokenNameStringLiteral	???
,	TokenNameCOMMA	
" )?)?)?)"	TokenNameStringLiteral	 )?)?)?)
,	TokenNameCOMMA	
" )?)?)?)"	TokenNameStringLiteral	 )?)?)?)
,	TokenNameCOMMA	
"???"	TokenNameStringLiteral	???
,	TokenNameCOMMA	
"???"	TokenNameStringLiteral	???
,	TokenNameCOMMA	
"???"	TokenNameStringLiteral	???
,	TokenNameCOMMA	
"???"	TokenNameStringLiteral	???
,	TokenNameCOMMA	
"???"	TokenNameStringLiteral	???
,	TokenNameCOMMA	
"???"	TokenNameStringLiteral	???
,	TokenNameCOMMA	
"???"	TokenNameStringLiteral	???
,	TokenNameCOMMA	
"???"	TokenNameStringLiteral	???
,	TokenNameCOMMA	
" )?)?)?)"	TokenNameStringLiteral	 )?)?)?)
,	TokenNameCOMMA	
"???"	TokenNameStringLiteral	???
,	TokenNameCOMMA	
"???"	TokenNameStringLiteral	???
,	TokenNameCOMMA	
"???"	TokenNameStringLiteral	???
,	TokenNameCOMMA	
""	TokenNameStringLiteral	 
,	TokenNameCOMMA	
"???????"	TokenNameStringLiteral	???????
,	TokenNameCOMMA	
" )?)?)?)"	TokenNameStringLiteral	 )?)?)?)
,	TokenNameCOMMA	
"???"	TokenNameStringLiteral	???
,	TokenNameCOMMA	
" )?)?)?)"	TokenNameStringLiteral	 )?)?)?)
,	TokenNameCOMMA	
"???"	TokenNameStringLiteral	???
,	TokenNameCOMMA	
" )?)?)?)"	TokenNameStringLiteral	 )?)?)?)
,	TokenNameCOMMA	
"???"	TokenNameStringLiteral	???
,	TokenNameCOMMA	
" )?)?)?)"	TokenNameStringLiteral	 )?)?)?)
,	TokenNameCOMMA	
"???"	TokenNameStringLiteral	???
,	TokenNameCOMMA	
"???"	TokenNameStringLiteral	???
,	TokenNameCOMMA	
" )?)?)?)"	TokenNameStringLiteral	 )?)?)?)
,	TokenNameCOMMA	
"???"	TokenNameStringLiteral	???
,	TokenNameCOMMA	
"???"	TokenNameStringLiteral	???
,	TokenNameCOMMA	
"???"	TokenNameStringLiteral	???
,	TokenNameCOMMA	
"???"	TokenNameStringLiteral	???
,	TokenNameCOMMA	
"???"	TokenNameStringLiteral	???
,	TokenNameCOMMA	
"???"	TokenNameStringLiteral	???
,	TokenNameCOMMA	
"???"	TokenNameStringLiteral	???
,	TokenNameCOMMA	
"???"	TokenNameStringLiteral	???
,	TokenNameCOMMA	
"???"	TokenNameStringLiteral	???
,	TokenNameCOMMA	
"???"	TokenNameStringLiteral	???
,	TokenNameCOMMA	
"???"	TokenNameStringLiteral	???
,	TokenNameCOMMA	
""	TokenNameStringLiteral	 
,	TokenNameCOMMA	
"???"	TokenNameStringLiteral	???
,	TokenNameCOMMA	
"???"	TokenNameStringLiteral	???
,	TokenNameCOMMA	
"l? ??n?n"	TokenNameStringLiteral	l? ??n?n
,	TokenNameCOMMA	
"???"	TokenNameStringLiteral	???
,	TokenNameCOMMA	
"???"	TokenNameStringLiteral	???
,	TokenNameCOMMA	
"???"	TokenNameStringLiteral	???
,	TokenNameCOMMA	
"???"	TokenNameStringLiteral	???
,	TokenNameCOMMA	
""	TokenNameStringLiteral	 
,	TokenNameCOMMA	
" )?)?)?)"	TokenNameStringLiteral	 )?)?)?)
,	TokenNameCOMMA	
" ?????"	TokenNameStringLiteral	 ?????
,	TokenNameCOMMA	
"???"	TokenNameStringLiteral	???
,	TokenNameCOMMA	
" )?)?)?)"	TokenNameStringLiteral	 )?)?)?)
,	TokenNameCOMMA	
" )?)?)?)"	TokenNameStringLiteral	 )?)?)?)
,	TokenNameCOMMA	
""	TokenNameStringLiteral	 
,	TokenNameCOMMA	
"???"	TokenNameStringLiteral	???
,	TokenNameCOMMA	
" )?)?)?)"	TokenNameStringLiteral	 )?)?)?)
,	TokenNameCOMMA	
" )?)?)?)"	TokenNameStringLiteral	 )?)?)?)
,	TokenNameCOMMA	
" )?)?)?)"	TokenNameStringLiteral	 )?)?)?)
,	TokenNameCOMMA	
"???"	TokenNameStringLiteral	???
,	TokenNameCOMMA	
" )?)?)?)"	TokenNameStringLiteral	 )?)?)?)
,	TokenNameCOMMA	
"???"	TokenNameStringLiteral	???
,	TokenNameCOMMA	
"???"	TokenNameStringLiteral	???
,	TokenNameCOMMA	
""	TokenNameStringLiteral	 
,	TokenNameCOMMA	
""	TokenNameStringLiteral	 
,	TokenNameCOMMA	
" )?)?)?)"	TokenNameStringLiteral	 )?)?)?)
,	TokenNameCOMMA	
"???"	TokenNameStringLiteral	???
,	TokenNameCOMMA	
"???"	TokenNameStringLiteral	???
,	TokenNameCOMMA	
""	TokenNameStringLiteral	 
,	TokenNameCOMMA	
" )?)?)?)"	TokenNameStringLiteral	 )?)?)?)
,	TokenNameCOMMA	
" )?)?)?)"	TokenNameStringLiteral	 )?)?)?)
,	TokenNameCOMMA	
""	TokenNameStringLiteral	 
,	TokenNameCOMMA	
""	TokenNameStringLiteral	 
,	TokenNameCOMMA	
" )?)?)?)"	TokenNameStringLiteral	 )?)?)?)
,	TokenNameCOMMA	
"???"	TokenNameStringLiteral	???
,	TokenNameCOMMA	
" )?)?)?)?)"	TokenNameStringLiteral	 )?)?)?)?)
+	TokenNamePLUS	
"?)"	TokenNameStringLiteral	?)
,	TokenNameCOMMA	
"???"	TokenNameStringLiteral	???
,	TokenNameCOMMA	
"???"	TokenNameStringLiteral	???
,	TokenNameCOMMA	
"???"	TokenNameStringLiteral	???
,	TokenNameCOMMA	
" )?)?)?)"	TokenNameStringLiteral	 )?)?)?)
,	TokenNameCOMMA	
"???"	TokenNameStringLiteral	???
,	TokenNameCOMMA	
""	TokenNameStringLiteral	 
,	TokenNameCOMMA	
"???"	TokenNameStringLiteral	???
,	TokenNameCOMMA	
" )?)?)?)"	TokenNameStringLiteral	 )?)?)?)
,	TokenNameCOMMA	
" )?)?)?)"	TokenNameStringLiteral	 )?)?)?)
,	TokenNameCOMMA	
"???"	TokenNameStringLiteral	???
,	TokenNameCOMMA	
"???"	TokenNameStringLiteral	???
,	TokenNameCOMMA	
""	TokenNameStringLiteral	 
,	TokenNameCOMMA	
"???"	TokenNameStringLiteral	???
,	TokenNameCOMMA	
""	TokenNameStringLiteral	 
,	TokenNameCOMMA	
" )?)?)?)"	TokenNameStringLiteral	 )?)?)?)
,	TokenNameCOMMA	
""	TokenNameStringLiteral	 
,	TokenNameCOMMA	
"???"	TokenNameStringLiteral	???
,	TokenNameCOMMA	
""	TokenNameStringLiteral	 
,	TokenNameCOMMA	
"???"	TokenNameStringLiteral	???
,	TokenNameCOMMA	
"???"	TokenNameStringLiteral	???
,	TokenNameCOMMA	
""	TokenNameStringLiteral	 
,	TokenNameCOMMA	
" )?)?)?)"	TokenNameStringLiteral	 )?)?)?)
,	TokenNameCOMMA	
"???"	TokenNameStringLiteral	???
,	TokenNameCOMMA	
"???"	TokenNameStringLiteral	???
,	TokenNameCOMMA	
"???"	TokenNameStringLiteral	???
,	TokenNameCOMMA	
"???"	TokenNameStringLiteral	???
,	TokenNameCOMMA	
"???"	TokenNameStringLiteral	???
,	TokenNameCOMMA	
"???"	TokenNameStringLiteral	???
,	TokenNameCOMMA	
"???"	TokenNameStringLiteral	???
,	TokenNameCOMMA	
"Ÿ?Ÿ"	TokenNameStringLiteral	Ÿ?Ÿ
,	TokenNameCOMMA	
" )?)?)?)"	TokenNameStringLiteral	 )?)?)?)
,	TokenNameCOMMA	
"???"	TokenNameStringLiteral	???
,	TokenNameCOMMA	
"???"	TokenNameStringLiteral	???
,	TokenNameCOMMA	
"???"	TokenNameStringLiteral	???
,	TokenNameCOMMA	
"l? ??n?n"	TokenNameStringLiteral	l? ??n?n
,	TokenNameCOMMA	
"???"	TokenNameStringLiteral	???
,	TokenNameCOMMA	
" )?)?)?)"	TokenNameStringLiteral	 )?)?)?)
,	TokenNameCOMMA	
" )?)?)?)"	TokenNameStringLiteral	 )?)?)?)
,	TokenNameCOMMA	
"???"	TokenNameStringLiteral	???
,	TokenNameCOMMA	
""	TokenNameStringLiteral	 
,	TokenNameCOMMA	
" ?????"	TokenNameStringLiteral	 ?????
,	TokenNameCOMMA	
"???"	TokenNameStringLiteral	???
,	TokenNameCOMMA	
""	TokenNameStringLiteral	 
,	TokenNameCOMMA	
""	TokenNameStringLiteral	 
,	TokenNameCOMMA	
"???"	TokenNameStringLiteral	???
,	TokenNameCOMMA	
""	TokenNameStringLiteral	 
,	TokenNameCOMMA	
""	TokenNameStringLiteral	 
,	TokenNameCOMMA	
""	TokenNameStringLiteral	 
,	TokenNameCOMMA	
"???"	TokenNameStringLiteral	???
,	TokenNameCOMMA	
""	TokenNameStringLiteral	 
,	TokenNameCOMMA	
"???"	TokenNameStringLiteral	???
,	TokenNameCOMMA	
" )?)?)?)"	TokenNameStringLiteral	 )?)?)?)
,	TokenNameCOMMA	
""	TokenNameStringLiteral	 
,	TokenNameCOMMA	
" )?)?)?)"	TokenNameStringLiteral	 )?)?)?)
,	TokenNameCOMMA	
"???"	TokenNameStringLiteral	???
,	TokenNameCOMMA	
""	TokenNameStringLiteral	 
,	TokenNameCOMMA	
""	TokenNameStringLiteral	 
,	TokenNameCOMMA	
""	TokenNameStringLiteral	 
,	TokenNameCOMMA	
"???"	TokenNameStringLiteral	???
,	TokenNameCOMMA	
""	TokenNameStringLiteral	 
,	TokenNameCOMMA	
"???"	TokenNameStringLiteral	???
,	TokenNameCOMMA	
"???"	TokenNameStringLiteral	???
,	TokenNameCOMMA	
"???"	TokenNameStringLiteral	???
,	TokenNameCOMMA	
" )?)?)?)"	TokenNameStringLiteral	 )?)?)?)
,	TokenNameCOMMA	
""	TokenNameStringLiteral	 
,	TokenNameCOMMA	
"???"	TokenNameStringLiteral	???
,	TokenNameCOMMA	
" )?)?)?)"	TokenNameStringLiteral	 )?)?)?)
,	TokenNameCOMMA	
""	TokenNameStringLiteral	 
,	TokenNameCOMMA	
""	TokenNameStringLiteral	 
,	TokenNameCOMMA	
"???"	TokenNameStringLiteral	???
,	TokenNameCOMMA	
"ƒ?ƒ"	TokenNameStringLiteral	ƒ?ƒ
,	TokenNameCOMMA	
"???"	TokenNameStringLiteral	???
,	TokenNameCOMMA	
""	TokenNameStringLiteral	 
,	TokenNameCOMMA	
"???"	TokenNameStringLiteral	???
,	TokenNameCOMMA	
" )?)?)?)"	TokenNameStringLiteral	 )?)?)?)
,	TokenNameCOMMA	
" )?)?)?)"	TokenNameStringLiteral	 )?)?)?)
,	TokenNameCOMMA	
""	TokenNameStringLiteral	 
,	TokenNameCOMMA	
"???"	TokenNameStringLiteral	???
,	TokenNameCOMMA	
"???"	TokenNameStringLiteral	???
,	TokenNameCOMMA	
"???"	TokenNameStringLiteral	???
,	TokenNameCOMMA	
" )?)?)?)"	TokenNameStringLiteral	 )?)?)?)
,	TokenNameCOMMA	
"???"	TokenNameStringLiteral	???
,	TokenNameCOMMA	
" )?)?)?)"	TokenNameStringLiteral	 )?)?)?)
,	TokenNameCOMMA	
" )?)?)?)"	TokenNameStringLiteral	 )?)?)?)
,	TokenNameCOMMA	
" )?)?)?)"	TokenNameStringLiteral	 )?)?)?)
,	TokenNameCOMMA	
""	TokenNameStringLiteral	 
,	TokenNameCOMMA	
" )?)?)?)"	TokenNameStringLiteral	 )?)?)?)
,	TokenNameCOMMA	
"???"	TokenNameStringLiteral	???
,	TokenNameCOMMA	
"???"	TokenNameStringLiteral	???
,	TokenNameCOMMA	
"l? ??n?n"	TokenNameStringLiteral	l? ??n?n
,	TokenNameCOMMA	
" )?)?)?)"	TokenNameStringLiteral	 )?)?)?)
,	TokenNameCOMMA	
""	TokenNameStringLiteral	 
,	TokenNameCOMMA	
""	TokenNameStringLiteral	 
,	TokenNameCOMMA	
"???"	TokenNameStringLiteral	???
,	TokenNameCOMMA	
" ?????"	TokenNameStringLiteral	 ?????
,	TokenNameCOMMA	
"???"	TokenNameStringLiteral	???
,	TokenNameCOMMA	
"???"	TokenNameStringLiteral	???
,	TokenNameCOMMA	
"???"	TokenNameStringLiteral	???
,	TokenNameCOMMA	
"???"	TokenNameStringLiteral	???
,	TokenNameCOMMA	
""	TokenNameStringLiteral	 
,	TokenNameCOMMA	
""	TokenNameStringLiteral	 
,	TokenNameCOMMA	
"???"	TokenNameStringLiteral	???
,	TokenNameCOMMA	
"???"	TokenNameStringLiteral	???
,	TokenNameCOMMA	
" )?)?)?)"	TokenNameStringLiteral	 )?)?)?)
,	TokenNameCOMMA	
" )?)?)?)"	TokenNameStringLiteral	 )?)?)?)
,	TokenNameCOMMA	
"???"	TokenNameStringLiteral	???
,	TokenNameCOMMA	
""	TokenNameStringLiteral	 
,	TokenNameCOMMA	
" )?)?)?)"	TokenNameStringLiteral	 )?)?)?)
,	TokenNameCOMMA	
""	TokenNameStringLiteral	 
,	TokenNameCOMMA	
"???"	TokenNameStringLiteral	???
,	TokenNameCOMMA	
"???"	TokenNameStringLiteral	???
,	TokenNameCOMMA	
"???"	TokenNameStringLiteral	???
,	TokenNameCOMMA	
" )?)?)?)"	TokenNameStringLiteral	 )?)?)?)
,	TokenNameCOMMA	
""	TokenNameStringLiteral	 
,	TokenNameCOMMA	
""	TokenNameStringLiteral	 
,	TokenNameCOMMA	
"???"	TokenNameStringLiteral	???
,	TokenNameCOMMA	
"???"	TokenNameStringLiteral	???
,	TokenNameCOMMA	
" )?)?)?)"	TokenNameStringLiteral	 )?)?)?)
,	TokenNameCOMMA	
""	TokenNameStringLiteral	 
,	TokenNameCOMMA	
" )?)?)?)"	TokenNameStringLiteral	 )?)?)?)
,	TokenNameCOMMA	
""	TokenNameStringLiteral	 
,	TokenNameCOMMA	
""	TokenNameStringLiteral	 
,	TokenNameCOMMA	
""	TokenNameStringLiteral	 
,	TokenNameCOMMA	
""	TokenNameStringLiteral	 
,	TokenNameCOMMA	
"???"	TokenNameStringLiteral	???
,	TokenNameCOMMA	
"???"	TokenNameStringLiteral	???
,	TokenNameCOMMA	
"l? ??n?n"	TokenNameStringLiteral	l? ??n?n
,	TokenNameCOMMA	
""	TokenNameStringLiteral	 
,	TokenNameCOMMA	
"???"	TokenNameStringLiteral	???
,	TokenNameCOMMA	
"n"	TokenNameStringLiteral	n
,	TokenNameCOMMA	
"???"	TokenNameStringLiteral	???
,	TokenNameCOMMA	
"???"	TokenNameStringLiteral	???
,	TokenNameCOMMA	
"???"	TokenNameStringLiteral	???
,	TokenNameCOMMA	
" )?)?)?)?)"	TokenNameStringLiteral	 )?)?)?)?)
+	TokenNamePLUS	
"?)"	TokenNameStringLiteral	?)
,	TokenNameCOMMA	
" )?)?)?)"	TokenNameStringLiteral	 )?)?)?)
,	TokenNameCOMMA	
"???"	TokenNameStringLiteral	???
,	TokenNameCOMMA	
""	TokenNameStringLiteral	 
,	TokenNameCOMMA	
""	TokenNameStringLiteral	 
,	TokenNameCOMMA	
"???"	TokenNameStringLiteral	???
,	TokenNameCOMMA	
""	TokenNameStringLiteral	 
,	TokenNameCOMMA	
"???"	TokenNameStringLiteral	???
,	TokenNameCOMMA	
" )?)?)?)"	TokenNameStringLiteral	 )?)?)?)
,	TokenNameCOMMA	
" )?)?)?)"	TokenNameStringLiteral	 )?)?)?)
,	TokenNameCOMMA	
""	TokenNameStringLiteral	 
,	TokenNameCOMMA	
" )?)?)?)"	TokenNameStringLiteral	 )?)?)?)
,	TokenNameCOMMA	
"???"	TokenNameStringLiteral	???
,	TokenNameCOMMA	
""	TokenNameStringLiteral	 
,	TokenNameCOMMA	
""	TokenNameStringLiteral	 
,	TokenNameCOMMA	
"???"	TokenNameStringLiteral	???
,	TokenNameCOMMA	
"???"	TokenNameStringLiteral	???
,	TokenNameCOMMA	
"nl? -"	TokenNameStringLiteral	nl? -
,	TokenNameCOMMA	
" )?)?)?)"	TokenNameStringLiteral	 )?)?)?)
,	TokenNameCOMMA	
" )?)?)?)"	TokenNameStringLiteral	 )?)?)?)
,	TokenNameCOMMA	
" )?)?)?)"	TokenNameStringLiteral	 )?)?)?)
,	TokenNameCOMMA	
" )?)?)?)"	TokenNameStringLiteral	 )?)?)?)
,	TokenNameCOMMA	
" )?)?)?)"	TokenNameStringLiteral	 )?)?)?)
,	TokenNameCOMMA	
""	TokenNameStringLiteral	 
,	TokenNameCOMMA	
"???"	TokenNameStringLiteral	???
,	TokenNameCOMMA	
"???"	TokenNameStringLiteral	???
,	TokenNameCOMMA	
" )?)?)?)"	TokenNameStringLiteral	 )?)?)?)
,	TokenNameCOMMA	
""	TokenNameStringLiteral	 
,	TokenNameCOMMA	
""	TokenNameStringLiteral	 
,	TokenNameCOMMA	
""	TokenNameStringLiteral	 
,	TokenNameCOMMA	
"???"	TokenNameStringLiteral	???
,	TokenNameCOMMA	
"???"	TokenNameStringLiteral	???
,	TokenNameCOMMA	
"???"	TokenNameStringLiteral	???
,	TokenNameCOMMA	
""	TokenNameStringLiteral	 
,	TokenNameCOMMA	
""	TokenNameStringLiteral	 
,	TokenNameCOMMA	
""	TokenNameStringLiteral	 
,	TokenNameCOMMA	
""	TokenNameStringLiteral	 
,	TokenNameCOMMA	
""	TokenNameStringLiteral	 
,	TokenNameCOMMA	
"???"	TokenNameStringLiteral	???
,	TokenNameCOMMA	
" )?)?)?)"	TokenNameStringLiteral	 )?)?)?)
,	TokenNameCOMMA	
""	TokenNameStringLiteral	 
,	TokenNameCOMMA	
" )?)?)?)?)"	TokenNameStringLiteral	 )?)?)?)?)
+	TokenNamePLUS	
"?)"	TokenNameStringLiteral	?)
,	TokenNameCOMMA	
"???"	TokenNameStringLiteral	???
,	TokenNameCOMMA	
"???"	TokenNameStringLiteral	???
,	TokenNameCOMMA	
"???"	TokenNameStringLiteral	???
,	TokenNameCOMMA	
""	TokenNameStringLiteral	 
,	TokenNameCOMMA	
""	TokenNameStringLiteral	 
,	TokenNameCOMMA	
" )?)?)?)"	TokenNameStringLiteral	 )?)?)?)
,	TokenNameCOMMA	
" )?)?)?)"	TokenNameStringLiteral	 )?)?)?)
,	TokenNameCOMMA	
" )?)?)?)"	TokenNameStringLiteral	 )?)?)?)
,	TokenNameCOMMA	
" )?)?)?)"	TokenNameStringLiteral	 )?)?)?)
,	TokenNameCOMMA	
""	TokenNameStringLiteral	 
,	TokenNameCOMMA	
""	TokenNameStringLiteral	 
,	TokenNameCOMMA	
""	TokenNameStringLiteral	 
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
static	TokenNamestatic	
final	TokenNamefinal	
short	TokenNameshort	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
DFA13_eot	TokenNameIdentifier	 DF A13 eot
=	TokenNameEQUAL	
DFA	TokenNameIdentifier	 DFA
.	TokenNameDOT	
unpackEncodedString	TokenNameIdentifier	 unpack Encoded String
(	TokenNameLPAREN	
DFA13_eotS	TokenNameIdentifier	 DF A13 eot S
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
static	TokenNamestatic	
final	TokenNamefinal	
short	TokenNameshort	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
DFA13_eof	TokenNameIdentifier	 DF A13 eof
=	TokenNameEQUAL	
DFA	TokenNameIdentifier	 DFA
.	TokenNameDOT	
unpackEncodedString	TokenNameIdentifier	 unpack Encoded String
(	TokenNameLPAREN	
DFA13_eofS	TokenNameIdentifier	 DF A13 eof S
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
static	TokenNamestatic	
final	TokenNamefinal	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
DFA13_min	TokenNameIdentifier	 DF A13 min
=	TokenNameEQUAL	
DFA	TokenNameIdentifier	 DFA
.	TokenNameDOT	
unpackEncodedStringToUnsignedChars	TokenNameIdentifier	 unpack Encoded String To Unsigned Chars
(	TokenNameLPAREN	
DFA13_minS	TokenNameIdentifier	 DF A13 min S
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
static	TokenNamestatic	
final	TokenNamefinal	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
DFA13_max	TokenNameIdentifier	 DF A13 max
=	TokenNameEQUAL	
DFA	TokenNameIdentifier	 DFA
.	TokenNameDOT	
unpackEncodedStringToUnsignedChars	TokenNameIdentifier	 unpack Encoded String To Unsigned Chars
(	TokenNameLPAREN	
DFA13_maxS	TokenNameIdentifier	 DF A13 max S
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
static	TokenNamestatic	
final	TokenNamefinal	
short	TokenNameshort	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
DFA13_accept	TokenNameIdentifier	 DF A13 accept
=	TokenNameEQUAL	
DFA	TokenNameIdentifier	 DFA
.	TokenNameDOT	
unpackEncodedString	TokenNameIdentifier	 unpack Encoded String
(	TokenNameLPAREN	
DFA13_acceptS	TokenNameIdentifier	 DF A13 accept S
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
static	TokenNamestatic	
final	TokenNamefinal	
short	TokenNameshort	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
DFA13_special	TokenNameIdentifier	 DF A13 special
=	TokenNameEQUAL	
DFA	TokenNameIdentifier	 DFA
.	TokenNameDOT	
unpackEncodedString	TokenNameIdentifier	 unpack Encoded String
(	TokenNameLPAREN	
DFA13_specialS	TokenNameIdentifier	 DF A13 special S
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
static	TokenNamestatic	
final	TokenNamefinal	
short	TokenNameshort	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
DFA13_transition	TokenNameIdentifier	 DF A13 transition
;	TokenNameSEMICOLON	
static	TokenNamestatic	
{	TokenNameLBRACE	
int	TokenNameint	
numStates	TokenNameIdentifier	 num States
=	TokenNameEQUAL	
DFA13_transitionS	TokenNameIdentifier	 DF A13 transition S
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
DFA13_transition	TokenNameIdentifier	 DF A13 transition
=	TokenNameEQUAL	
new	TokenNamenew	
short	TokenNameshort	
[	TokenNameLBRACKET	
numStates	TokenNameIdentifier	 num States
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
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
numStates	TokenNameIdentifier	 num States
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
DFA13_transition	TokenNameIdentifier	 DF A13 transition
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
DFA	TokenNameIdentifier	 DFA
.	TokenNameDOT	
unpackEncodedString	TokenNameIdentifier	 unpack Encoded String
(	TokenNameLPAREN	
DFA13_transitionS	TokenNameIdentifier	 DF A13 transition S
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
class	TokenNameclass	
DFA13	TokenNameIdentifier	 DF A13
extends	TokenNameextends	
DFA	TokenNameIdentifier	 DFA
{	TokenNameLBRACE	
public	TokenNamepublic	
DFA13	TokenNameIdentifier	 DF A13
(	TokenNameLPAREN	
BaseRecognizer	TokenNameIdentifier	 Base Recognizer
recognizer	TokenNameIdentifier	 recognizer
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
recognizer	TokenNameIdentifier	 recognizer
=	TokenNameEQUAL	
recognizer	TokenNameIdentifier	 recognizer
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
decisionNumber	TokenNameIdentifier	 decision Number
=	TokenNameEQUAL	
13	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
eot	TokenNameIdentifier	 eot
=	TokenNameEQUAL	
DFA13_eot	TokenNameIdentifier	 DF A13 eot
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
eof	TokenNameIdentifier	 eof
=	TokenNameEQUAL	
DFA13_eof	TokenNameIdentifier	 DF A13 eof
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
min	TokenNameIdentifier	 min
=	TokenNameEQUAL	
DFA13_min	TokenNameIdentifier	 DF A13 min
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
max	TokenNameIdentifier	 max
=	TokenNameEQUAL	
DFA13_max	TokenNameIdentifier	 DF A13 max
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
accept	TokenNameIdentifier	 accept
=	TokenNameEQUAL	
DFA13_accept	TokenNameIdentifier	 DF A13 accept
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
special	TokenNameIdentifier	 special
=	TokenNameEQUAL	
DFA13_special	TokenNameIdentifier	 DF A13 special
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
transition	TokenNameIdentifier	 transition
=	TokenNameEQUAL	
DFA13_transition	TokenNameIdentifier	 DF A13 transition
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getDescription	TokenNameIdentifier	 get Description
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
"1:1: Tokens : ( T__124 | T__125 | T__126 | T__127 | T__128 | T__129 | T__130 | T__131 | T__132 | T__133 | T__134 | T__135 | T__136 | T__137 | T__138 | T__139 | T__140 | T__141 | K_SELECT | K_FROM | K_WHERE | K_AND | K_KEY | K_INSERT | K_UPDATE | K_WITH | K_LIMIT | K_USING | K_USE | K_COUNT | K_SET | K_BEGIN | K_UNLOGGED | K_BATCH | K_APPLY | K_TRUNCATE | K_DELETE | K_IN | K_CREATE | K_KEYSPACE | K_KEYSPACES | K_COLUMNFAMILY | K_INDEX | K_ON | K_TO | K_DROP | K_PRIMARY | K_INTO | K_VALUES | K_TIMESTAMP | K_TTL | K_ALTER | K_RENAME | K_ADD | K_TYPE | K_COMPACT | K_STORAGE | K_ORDER | K_BY | K_ASC | K_DESC | K_ALLOW | K_FILTERING | K_GRANT | K_ALL | K_PERMISSION | K_PERMISSIONS | K_OF | K_REVOKE | K_MODIFY | K_AUTHORIZE | K_NORECURSIVE | K_USER | K_USERS | K_SUPERUSER | K_NOSUPERUSER | K_PASSWORD | K_CLUSTERING | K_ASCII | K_BIGINT | K_BLOB | K_BOOLEAN | K_COUNTER | K_DECIMAL | K_DOUBLE | K_FLOAT | K_INET | K_INT | K_TEXT | K_UUID | K_VARCHAR | K_VARINT | K_TIMEUUID | K_TOKEN | K_WRITETIME | K_MAP | K_LIST | K_TRUE | K_FALSE | STRING_LITERAL | QUOTED_NAME | INTEGER | QMARK | FLOAT | IDENT | UUID | WS | COMMENT | MULTILINE_COMMENT );"	TokenNameStringLiteral	1:1: Tokens : ( T__124 | T__125 | T__126 | T__127 | T__128 | T__129 | T__130 | T__131 | T__132 | T__133 | T__134 | T__135 | T__136 | T__137 | T__138 | T__139 | T__140 | T__141 | K_SELECT | K_FROM | K_WHERE | K_AND | K_KEY | K_INSERT | K_UPDATE | K_WITH | K_LIMIT | K_USING | K_USE | K_COUNT | K_SET | K_BEGIN | K_UNLOGGED | K_BATCH | K_APPLY | K_TRUNCATE | K_DELETE | K_IN | K_CREATE | K_KEYSPACE | K_KEYSPACES | K_COLUMNFAMILY | K_INDEX | K_ON | K_TO | K_DROP | K_PRIMARY | K_INTO | K_VALUES | K_TIMESTAMP | K_TTL | K_ALTER | K_RENAME | K_ADD | K_TYPE | K_COMPACT | K_STORAGE | K_ORDER | K_BY | K_ASC | K_DESC | K_ALLOW | K_FILTERING | K_GRANT | K_ALL | K_PERMISSION | K_PERMISSIONS | K_OF | K_REVOKE | K_MODIFY | K_AUTHORIZE | K_NORECURSIVE | K_USER | K_USERS | K_SUPERUSER | K_NOSUPERUSER | K_PASSWORD | K_CLUSTERING | K_ASCII | K_BIGINT | K_BLOB | K_BOOLEAN | K_COUNTER | K_DECIMAL | K_DOUBLE | K_FLOAT | K_INET | K_INT | K_TEXT | K_UUID | K_VARCHAR | K_VARINT | K_TIMEUUID | K_TOKEN | K_WRITETIME | K_MAP | K_LIST | K_TRUE | K_FALSE | STRING_LITERAL | QUOTED_NAME | INTEGER | QMARK | FLOAT | IDENT | UUID | WS | COMMENT | MULTILINE_COMMENT );
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
