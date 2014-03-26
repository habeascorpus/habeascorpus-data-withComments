// $ANTLR 3.2 Sep 23, 2009 12:02:23 /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql/Cql.g 2013-01-24 15:45:45 	TokenNameCOMMENT_LINE	$ANTLR 3.2 Sep 23, 2009 12:02:23 /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql/Cql.g 2013-01-24 15:45:45 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
cql	TokenNameIdentifier	 cql
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Map	TokenNameIdentifier	 Map
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
HashMap	TokenNameIdentifier	 Hash Map
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Collections	TokenNameIdentifier	 Collections
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
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
utils	TokenNameIdentifier	 utils
.	TokenNameDOT	
Pair	TokenNameIdentifier	 Pair
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
db	TokenNameIdentifier	 db
.	TokenNameDOT	
ConsistencyLevel	TokenNameIdentifier	 Consistency Level
;	TokenNameSEMICOLON	
import	TokenNameimport	
static	TokenNamestatic	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
cql	TokenNameIdentifier	 cql
.	TokenNameDOT	
AlterTableStatement	TokenNameIdentifier	 Alter Table Statement
.	TokenNameDOT	
OperationType	TokenNameIdentifier	 Operation Type
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
CqlParser	TokenNameIdentifier	 Cql Parser
extends	TokenNameextends	
Parser	TokenNameIdentifier	 Parser
{	TokenNameLBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
tokenNames	TokenNameIdentifier	 token Names
=	TokenNameEQUAL	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"<invalid>"	TokenNameStringLiteral	<invalid>
,	TokenNameCOMMA	
"<EOR>"	TokenNameStringLiteral	<EOR>
,	TokenNameCOMMA	
"<DOWN>"	TokenNameStringLiteral	<DOWN>
,	TokenNameCOMMA	
"<UP>"	TokenNameStringLiteral	<UP>
,	TokenNameCOMMA	
"K_USE"	TokenNameStringLiteral	K_USE
,	TokenNameCOMMA	
"IDENT"	TokenNameStringLiteral	IDENT
,	TokenNameCOMMA	
"INTEGER"	TokenNameStringLiteral	INTEGER
,	TokenNameCOMMA	
"STRING_LITERAL"	TokenNameStringLiteral	STRING_LITERAL
,	TokenNameCOMMA	
"K_SELECT"	TokenNameStringLiteral	K_SELECT
,	TokenNameCOMMA	
"K_COUNT"	TokenNameStringLiteral	K_COUNT
,	TokenNameCOMMA	
"K_FROM"	TokenNameStringLiteral	K_FROM
,	TokenNameCOMMA	
"K_USING"	TokenNameStringLiteral	K_USING
,	TokenNameCOMMA	
"K_CONSISTENCY"	TokenNameStringLiteral	K_CONSISTENCY
,	TokenNameCOMMA	
"K_LEVEL"	TokenNameStringLiteral	K_LEVEL
,	TokenNameCOMMA	
"K_WHERE"	TokenNameStringLiteral	K_WHERE
,	TokenNameCOMMA	
"K_LIMIT"	TokenNameStringLiteral	K_LIMIT
,	TokenNameCOMMA	
"K_FIRST"	TokenNameStringLiteral	K_FIRST
,	TokenNameCOMMA	
"K_REVERSED"	TokenNameStringLiteral	K_REVERSED
,	TokenNameCOMMA	
"RANGEOP"	TokenNameStringLiteral	RANGEOP
,	TokenNameCOMMA	
"K_AND"	TokenNameStringLiteral	K_AND
,	TokenNameCOMMA	
"K_IN"	TokenNameStringLiteral	K_IN
,	TokenNameCOMMA	
"K_INSERT"	TokenNameStringLiteral	K_INSERT
,	TokenNameCOMMA	
"K_INTO"	TokenNameStringLiteral	K_INTO
,	TokenNameCOMMA	
"K_VALUES"	TokenNameStringLiteral	K_VALUES
,	TokenNameCOMMA	
"K_TIMESTAMP"	TokenNameStringLiteral	K_TIMESTAMP
,	TokenNameCOMMA	
"K_TTL"	TokenNameStringLiteral	K_TTL
,	TokenNameCOMMA	
"K_BEGIN"	TokenNameStringLiteral	K_BEGIN
,	TokenNameCOMMA	
"K_BATCH"	TokenNameStringLiteral	K_BATCH
,	TokenNameCOMMA	
"K_APPLY"	TokenNameStringLiteral	K_APPLY
,	TokenNameCOMMA	
"K_UPDATE"	TokenNameStringLiteral	K_UPDATE
,	TokenNameCOMMA	
"K_SET"	TokenNameStringLiteral	K_SET
,	TokenNameCOMMA	
"K_DELETE"	TokenNameStringLiteral	K_DELETE
,	TokenNameCOMMA	
"K_CREATE"	TokenNameStringLiteral	K_CREATE
,	TokenNameCOMMA	
"K_KEYSPACE"	TokenNameStringLiteral	K_KEYSPACE
,	TokenNameCOMMA	
"K_WITH"	TokenNameStringLiteral	K_WITH
,	TokenNameCOMMA	
"COMPIDENT"	TokenNameStringLiteral	COMPIDENT
,	TokenNameCOMMA	
"K_COLUMNFAMILY"	TokenNameStringLiteral	K_COLUMNFAMILY
,	TokenNameCOMMA	
"K_PRIMARY"	TokenNameStringLiteral	K_PRIMARY
,	TokenNameCOMMA	
"K_KEY"	TokenNameStringLiteral	K_KEY
,	TokenNameCOMMA	
"FLOAT"	TokenNameStringLiteral	FLOAT
,	TokenNameCOMMA	
"K_INDEX"	TokenNameStringLiteral	K_INDEX
,	TokenNameCOMMA	
"K_ON"	TokenNameStringLiteral	K_ON
,	TokenNameCOMMA	
"K_DROP"	TokenNameStringLiteral	K_DROP
,	TokenNameCOMMA	
"K_ALTER"	TokenNameStringLiteral	K_ALTER
,	TokenNameCOMMA	
"K_TYPE"	TokenNameStringLiteral	K_TYPE
,	TokenNameCOMMA	
"K_ADD"	TokenNameStringLiteral	K_ADD
,	TokenNameCOMMA	
"UUID"	TokenNameStringLiteral	UUID
,	TokenNameCOMMA	
"QMARK"	TokenNameStringLiteral	QMARK
,	TokenNameCOMMA	
"K_TRUNCATE"	TokenNameStringLiteral	K_TRUNCATE
,	TokenNameCOMMA	
"S"	TokenNameStringLiteral	S
,	TokenNameCOMMA	
"E"	TokenNameStringLiteral	E
,	TokenNameCOMMA	
"L"	TokenNameStringLiteral	L
,	TokenNameCOMMA	
"C"	TokenNameStringLiteral	C
,	TokenNameCOMMA	
"T"	TokenNameStringLiteral	T
,	TokenNameCOMMA	
"F"	TokenNameStringLiteral	F
,	TokenNameCOMMA	
"R"	TokenNameStringLiteral	R
,	TokenNameCOMMA	
"O"	TokenNameStringLiteral	O
,	TokenNameCOMMA	
"M"	TokenNameStringLiteral	M
,	TokenNameCOMMA	
"W"	TokenNameStringLiteral	W
,	TokenNameCOMMA	
"H"	TokenNameStringLiteral	H
,	TokenNameCOMMA	
"A"	TokenNameStringLiteral	A
,	TokenNameCOMMA	
"N"	TokenNameStringLiteral	N
,	TokenNameCOMMA	
"D"	TokenNameStringLiteral	D
,	TokenNameCOMMA	
"K"	TokenNameStringLiteral	K
,	TokenNameCOMMA	
"Y"	TokenNameStringLiteral	Y
,	TokenNameCOMMA	
"I"	TokenNameStringLiteral	I
,	TokenNameCOMMA	
"U"	TokenNameStringLiteral	U
,	TokenNameCOMMA	
"P"	TokenNameStringLiteral	P
,	TokenNameCOMMA	
"G"	TokenNameStringLiteral	G
,	TokenNameCOMMA	
"Q"	TokenNameStringLiteral	Q
,	TokenNameCOMMA	
"V"	TokenNameStringLiteral	V
,	TokenNameCOMMA	
"B"	TokenNameStringLiteral	B
,	TokenNameCOMMA	
"X"	TokenNameStringLiteral	X
,	TokenNameCOMMA	
"J"	TokenNameStringLiteral	J
,	TokenNameCOMMA	
"Z"	TokenNameStringLiteral	Z
,	TokenNameCOMMA	
"DIGIT"	TokenNameStringLiteral	DIGIT
,	TokenNameCOMMA	
"LETTER"	TokenNameStringLiteral	LETTER
,	TokenNameCOMMA	
"HEX"	TokenNameStringLiteral	HEX
,	TokenNameCOMMA	
"WS"	TokenNameStringLiteral	WS
,	TokenNameCOMMA	
"COMMENT"	TokenNameStringLiteral	COMMENT
,	TokenNameCOMMA	
"MULTILINE_COMMENT"	TokenNameStringLiteral	MULTILINE_COMMENT
,	TokenNameCOMMA	
"'('"	TokenNameStringLiteral	'('
,	TokenNameCOMMA	
"')'"	TokenNameStringLiteral	')'
,	TokenNameCOMMA	
"'.'"	TokenNameStringLiteral	'.'
,	TokenNameCOMMA	
"','"	TokenNameStringLiteral	','
,	TokenNameCOMMA	
"'\*'"	TokenNameStringLiteral	'\*'
,	TokenNameCOMMA	
"';'"	TokenNameStringLiteral	';'
,	TokenNameCOMMA	
"'='"	TokenNameStringLiteral	'='
,	TokenNameCOMMA	
"'blob'"	TokenNameStringLiteral	'blob'
,	TokenNameCOMMA	
"'ascii'"	TokenNameStringLiteral	'ascii'
,	TokenNameCOMMA	
"'text'"	TokenNameStringLiteral	'text'
,	TokenNameCOMMA	
"'varchar'"	TokenNameStringLiteral	'varchar'
,	TokenNameCOMMA	
"'int'"	TokenNameStringLiteral	'int'
,	TokenNameCOMMA	
"'varint'"	TokenNameStringLiteral	'varint'
,	TokenNameCOMMA	
"'bigint'"	TokenNameStringLiteral	'bigint'
,	TokenNameCOMMA	
"'uuid'"	TokenNameStringLiteral	'uuid'
,	TokenNameCOMMA	
"'counter'"	TokenNameStringLiteral	'counter'
,	TokenNameCOMMA	
"'boolean'"	TokenNameStringLiteral	'boolean'
,	TokenNameCOMMA	
"'timestamp'"	TokenNameStringLiteral	'timestamp'
,	TokenNameCOMMA	
"'float'"	TokenNameStringLiteral	'float'
,	TokenNameCOMMA	
"'double'"	TokenNameStringLiteral	'double'
,	TokenNameCOMMA	
"'decimal'"	TokenNameStringLiteral	'decimal'
,	TokenNameCOMMA	
"'+'"	TokenNameStringLiteral	'+'
,	TokenNameCOMMA	
"'-'"	TokenNameStringLiteral	'-'
,	TokenNameCOMMA	
"'<'"	TokenNameStringLiteral	'<'
,	TokenNameCOMMA	
"'<='"	TokenNameStringLiteral	'<='
,	TokenNameCOMMA	
"'>='"	TokenNameStringLiteral	'>='
,	TokenNameCOMMA	
"'>'"	TokenNameStringLiteral	'>'
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
LETTER	TokenNameIdentifier	 LETTER
=	TokenNameEQUAL	
76	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
K_CREATE	TokenNameIdentifier	 K  CREATE
=	TokenNameEQUAL	
32	TokenNameIntegerLiteral	
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
T__93	TokenNameIdentifier	 T  93
=	TokenNameEQUAL	
93	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
T__94	TokenNameIdentifier	 T  94
=	TokenNameEQUAL	
94	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
T__91	TokenNameIdentifier	 T  91
=	TokenNameEQUAL	
91	TokenNameIntegerLiteral	
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
T__92	TokenNameIdentifier	 T  92
=	TokenNameEQUAL	
92	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
K_VALUES	TokenNameIdentifier	 K  VALUES
=	TokenNameEQUAL	
23	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
STRING_LITERAL	TokenNameIdentifier	 STRING  LITERAL
=	TokenNameEQUAL	
7	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
T__90	TokenNameIdentifier	 T  90
=	TokenNameEQUAL	
90	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
K_ON	TokenNameIdentifier	 K  ON
=	TokenNameEQUAL	
41	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
K_USING	TokenNameIdentifier	 K  USING
=	TokenNameEQUAL	
11	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
K_ADD	TokenNameIdentifier	 K  ADD
=	TokenNameEQUAL	
45	TokenNameIntegerLiteral	
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
COMMENT	TokenNameIdentifier	 COMMENT
=	TokenNameEQUAL	
79	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
K_TRUNCATE	TokenNameIdentifier	 K  TRUNCATE
=	TokenNameEQUAL	
48	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
T__99	TokenNameIdentifier	 T  99
=	TokenNameEQUAL	
99	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
T__98	TokenNameIdentifier	 T  98
=	TokenNameEQUAL	
98	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
T__97	TokenNameIdentifier	 T  97
=	TokenNameEQUAL	
97	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
T__96	TokenNameIdentifier	 T  96
=	TokenNameEQUAL	
96	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
T__95	TokenNameIdentifier	 T  95
=	TokenNameEQUAL	
95	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
D	TokenNameIdentifier	 D
=	TokenNameEQUAL	
62	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
E	TokenNameIdentifier	 E
=	TokenNameEQUAL	
50	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
F	TokenNameIdentifier	 F
=	TokenNameEQUAL	
54	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
G	TokenNameIdentifier	 G
=	TokenNameEQUAL	
68	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
K_COUNT	TokenNameIdentifier	 K  COUNT
=	TokenNameEQUAL	
9	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
K_KEYSPACE	TokenNameIdentifier	 K  KEYSPACE
=	TokenNameEQUAL	
33	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
K_TYPE	TokenNameIdentifier	 K  TYPE
=	TokenNameEQUAL	
44	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
T__81	TokenNameIdentifier	 T  81
=	TokenNameEQUAL	
81	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
A	TokenNameIdentifier	 A
=	TokenNameEQUAL	
60	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
B	TokenNameIdentifier	 B
=	TokenNameEQUAL	
71	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
T__82	TokenNameIdentifier	 T  82
=	TokenNameEQUAL	
82	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
T__83	TokenNameIdentifier	 T  83
=	TokenNameEQUAL	
83	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
C	TokenNameIdentifier	 C
=	TokenNameEQUAL	
52	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
L	TokenNameIdentifier	 L
=	TokenNameEQUAL	
51	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
M	TokenNameIdentifier	 M
=	TokenNameEQUAL	
57	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
N	TokenNameIdentifier	 N
=	TokenNameEQUAL	
61	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
O	TokenNameIdentifier	 O
=	TokenNameEQUAL	
56	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
H	TokenNameIdentifier	 H
=	TokenNameEQUAL	
59	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
I	TokenNameIdentifier	 I
=	TokenNameEQUAL	
65	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
J	TokenNameIdentifier	 J
=	TokenNameEQUAL	
73	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
K_UPDATE	TokenNameIdentifier	 K  UPDATE
=	TokenNameEQUAL	
29	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
K	TokenNameIdentifier	 K
=	TokenNameEQUAL	
63	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
U	TokenNameIdentifier	 U
=	TokenNameEQUAL	
66	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
T	TokenNameIdentifier	 T
=	TokenNameEQUAL	
53	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
W	TokenNameIdentifier	 W
=	TokenNameEQUAL	
58	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
V	TokenNameIdentifier	 V
=	TokenNameEQUAL	
70	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
Q	TokenNameIdentifier	 Q
=	TokenNameEQUAL	
69	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
P	TokenNameIdentifier	 P
=	TokenNameEQUAL	
67	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
S	TokenNameIdentifier	 S
=	TokenNameEQUAL	
49	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
R	TokenNameIdentifier	 R
=	TokenNameEQUAL	
55	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
T__85	TokenNameIdentifier	 T  85
=	TokenNameEQUAL	
85	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
T__84	TokenNameIdentifier	 T  84
=	TokenNameEQUAL	
84	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
T__87	TokenNameIdentifier	 T  87
=	TokenNameEQUAL	
87	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
T__86	TokenNameIdentifier	 T  86
=	TokenNameEQUAL	
86	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
K_TTL	TokenNameIdentifier	 K  TTL
=	TokenNameEQUAL	
25	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
Y	TokenNameIdentifier	 Y
=	TokenNameEQUAL	
64	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
T__89	TokenNameIdentifier	 T  89
=	TokenNameEQUAL	
89	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
X	TokenNameIdentifier	 X
=	TokenNameEQUAL	
72	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
T__88	TokenNameIdentifier	 T  88
=	TokenNameEQUAL	
88	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
Z	TokenNameIdentifier	 Z
=	TokenNameEQUAL	
74	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
K_INDEX	TokenNameIdentifier	 K  INDEX
=	TokenNameEQUAL	
40	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
K_REVERSED	TokenNameIdentifier	 K  REVERSED
=	TokenNameEQUAL	
17	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
K_INSERT	TokenNameIdentifier	 K  INSERT
=	TokenNameEQUAL	
21	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
WS	TokenNameIdentifier	 WS
=	TokenNameEQUAL	
78	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
K_APPLY	TokenNameIdentifier	 K  APPLY
=	TokenNameEQUAL	
28	TokenNameIntegerLiteral	
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
19	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
QMARK	TokenNameIdentifier	 QMARK
=	TokenNameEQUAL	
47	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
K_LEVEL	TokenNameIdentifier	 K  LEVEL
=	TokenNameEQUAL	
13	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
K_BATCH	TokenNameIdentifier	 K  BATCH
=	TokenNameEQUAL	
27	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
UUID	TokenNameIdentifier	 UUID
=	TokenNameEQUAL	
46	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
K_DELETE	TokenNameIdentifier	 K  DELETE
=	TokenNameEQUAL	
31	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
FLOAT	TokenNameIdentifier	 FLOAT
=	TokenNameEQUAL	
39	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
K_SELECT	TokenNameIdentifier	 K  SELECT
=	TokenNameEQUAL	
8	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
K_LIMIT	TokenNameIdentifier	 K  LIMIT
=	TokenNameEQUAL	
15	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
K_ALTER	TokenNameIdentifier	 K  ALTER
=	TokenNameEQUAL	
43	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
K_SET	TokenNameIdentifier	 K  SET
=	TokenNameEQUAL	
30	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
K_WHERE	TokenNameIdentifier	 K  WHERE
=	TokenNameEQUAL	
14	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
MULTILINE_COMMENT	TokenNameIdentifier	 MULTILINE  COMMENT
=	TokenNameEQUAL	
80	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
T__107	TokenNameIdentifier	 T  107
=	TokenNameEQUAL	
107	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
HEX	TokenNameIdentifier	 HEX
=	TokenNameEQUAL	
77	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
K_INTO	TokenNameIdentifier	 K  INTO
=	TokenNameEQUAL	
22	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
T__103	TokenNameIdentifier	 T  103
=	TokenNameEQUAL	
103	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
T__104	TokenNameIdentifier	 T  104
=	TokenNameEQUAL	
104	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
T__105	TokenNameIdentifier	 T  105
=	TokenNameEQUAL	
105	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
T__106	TokenNameIdentifier	 T  106
=	TokenNameEQUAL	
106	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
IDENT	TokenNameIdentifier	 IDENT
=	TokenNameEQUAL	
5	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
DIGIT	TokenNameIdentifier	 DIGIT
=	TokenNameEQUAL	
75	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
K_FIRST	TokenNameIdentifier	 K  FIRST
=	TokenNameEQUAL	
16	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
K_BEGIN	TokenNameIdentifier	 K  BEGIN
=	TokenNameEQUAL	
26	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
INTEGER	TokenNameIdentifier	 INTEGER
=	TokenNameEQUAL	
6	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
RANGEOP	TokenNameIdentifier	 RANGEOP
=	TokenNameEQUAL	
18	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
K_CONSISTENCY	TokenNameIdentifier	 K  CONSISTENCY
=	TokenNameEQUAL	
12	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
K_WITH	TokenNameIdentifier	 K  WITH
=	TokenNameEQUAL	
34	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
COMPIDENT	TokenNameIdentifier	 COMPIDENT
=	TokenNameEQUAL	
35	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
T__102	TokenNameIdentifier	 T  102
=	TokenNameEQUAL	
102	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
T__101	TokenNameIdentifier	 T  101
=	TokenNameEQUAL	
101	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
T__100	TokenNameIdentifier	 T  100
=	TokenNameEQUAL	
100	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
K_IN	TokenNameIdentifier	 K  IN
=	TokenNameEQUAL	
20	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
K_FROM	TokenNameIdentifier	 K  FROM
=	TokenNameEQUAL	
10	TokenNameIntegerLiteral	
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
K_DROP	TokenNameIdentifier	 K  DROP
=	TokenNameEQUAL	
42	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// delegates 	TokenNameCOMMENT_LINE	delegates 
// delegators 	TokenNameCOMMENT_LINE	delegators 
public	TokenNamepublic	
CqlParser	TokenNameIdentifier	 Cql Parser
(	TokenNameLPAREN	
TokenStream	TokenNameIdentifier	 Token Stream
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
CqlParser	TokenNameIdentifier	 Cql Parser
(	TokenNameLPAREN	
TokenStream	TokenNameIdentifier	 Token Stream
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
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
getTokenNames	TokenNameIdentifier	 get Token Names
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
CqlParser	TokenNameIdentifier	 Cql Parser
.	TokenNameDOT	
tokenNames	TokenNameIdentifier	 token Names
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getGrammarFileName	TokenNameIdentifier	 get Grammar File Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
"/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql/Cql.g"	TokenNameStringLiteral	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql/Cql.g
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
private	TokenNameprivate	
int	TokenNameint	
currentBindMarkerIdx	TokenNameIdentifier	 current Bind Marker Idx
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
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
// used by UPDATE of the counter columns to validate if '-' was supplied by user 	TokenNameCOMMENT_LINE	used by UPDATE of the counter columns to validate if '-' was supplied by user 
public	TokenNamepublic	
void	TokenNamevoid	
validateMinusSupplied	TokenNameIdentifier	 validate Minus Supplied
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
op	TokenNameIdentifier	 op
,	TokenNameCOMMA	
final	TokenNamefinal	
Term	TokenNameIdentifier	 Term
value	TokenNameIdentifier	 value
,	TokenNameCOMMA	
IntStream	TokenNameIdentifier	 Int Stream
stream	TokenNameIdentifier	 stream
)	TokenNameRPAREN	
throws	TokenNamethrows	
MissingTokenException	TokenNameIdentifier	 Missing Token Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
op	TokenNameIdentifier	 op
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
Long	TokenNameIdentifier	 Long
.	TokenNameDOT	
parseLong	TokenNameIdentifier	 parse Long
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
.	TokenNameDOT	
getText	TokenNameIdentifier	 get Text
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
MissingTokenException	TokenNameIdentifier	 Missing Token Exception
(	TokenNameLPAREN	
102	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
stream	TokenNameIdentifier	 stream
,	TokenNameCOMMA	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// $ANTLR start "query" 	TokenNameCOMMENT_LINE	$ANTLR start "query" 
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql/Cql.g:114:1: query returns [CQLStatement stmnt] : ( selectStatement | insertStatement endStmnt | updateStatement endStmnt | batchStatement | useStatement | truncateStatement | deleteStatement endStmnt | createKeyspaceStatement | createColumnFamilyStatement | createIndexStatement | dropIndexStatement | dropKeyspaceStatement | dropColumnFamilyStatement | alterTableStatement ); 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql/Cql.g:114:1: query returns [CQLStatement stmnt] : ( selectStatement | insertStatement endStmnt | updateStatement endStmnt | batchStatement | useStatement | truncateStatement | deleteStatement endStmnt | createKeyspaceStatement | createColumnFamilyStatement | createIndexStatement | dropIndexStatement | dropKeyspaceStatement | dropColumnFamilyStatement | alterTableStatement ); 
public	TokenNamepublic	
final	TokenNamefinal	
CQLStatement	TokenNameIdentifier	 CQL Statement
query	TokenNameIdentifier	 query
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
RecognitionException	TokenNameIdentifier	 Recognition Exception
{	TokenNameLBRACE	
CQLStatement	TokenNameIdentifier	 CQL Statement
stmnt	TokenNameIdentifier	 stmnt
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
SelectStatement	TokenNameIdentifier	 Select Statement
selectStatement1	TokenNameIdentifier	 select Statement1
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
UpdateStatement	TokenNameIdentifier	 Update Statement
insertStatement2	TokenNameIdentifier	 insert Statement2
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
UpdateStatement	TokenNameIdentifier	 Update Statement
updateStatement3	TokenNameIdentifier	 update Statement3
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
BatchStatement	TokenNameIdentifier	 Batch Statement
batchStatement4	TokenNameIdentifier	 batch Statement4
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
useStatement5	TokenNameIdentifier	 use Statement5
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
Pair	TokenNameIdentifier	 Pair
<	TokenNameLESS	
String	TokenNameIdentifier	 String
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
truncateStatement6	TokenNameIdentifier	 truncate Statement6
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
DeleteStatement	TokenNameIdentifier	 Delete Statement
deleteStatement7	TokenNameIdentifier	 delete Statement7
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
CreateKeyspaceStatement	TokenNameIdentifier	 Create Keyspace Statement
createKeyspaceStatement8	TokenNameIdentifier	 create Keyspace Statement8
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
CreateColumnFamilyStatement	TokenNameIdentifier	 Create Column Family Statement
createColumnFamilyStatement9	TokenNameIdentifier	 create Column Family Statement9
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
CreateIndexStatement	TokenNameIdentifier	 Create Index Statement
createIndexStatement10	TokenNameIdentifier	 create Index Statement10
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
DropIndexStatement	TokenNameIdentifier	 Drop Index Statement
dropIndexStatement11	TokenNameIdentifier	 drop Index Statement11
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
dropKeyspaceStatement12	TokenNameIdentifier	 drop Keyspace Statement12
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
dropColumnFamilyStatement13	TokenNameIdentifier	 drop Column Family Statement13
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
AlterTableStatement	TokenNameIdentifier	 Alter Table Statement
alterTableStatement14	TokenNameIdentifier	 alter Table Statement14
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql/Cql.g:115:5: ( selectStatement | insertStatement endStmnt | updateStatement endStmnt | batchStatement | useStatement | truncateStatement | deleteStatement endStmnt | createKeyspaceStatement | createColumnFamilyStatement | createIndexStatement | dropIndexStatement | dropKeyspaceStatement | dropColumnFamilyStatement | alterTableStatement ) 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql/Cql.g:115:5: ( selectStatement | insertStatement endStmnt | updateStatement endStmnt | batchStatement | useStatement | truncateStatement | deleteStatement endStmnt | createKeyspaceStatement | createColumnFamilyStatement | createIndexStatement | dropIndexStatement | dropKeyspaceStatement | dropColumnFamilyStatement | alterTableStatement ) 
int	TokenNameint	
alt1	TokenNameIdentifier	 alt1
=	TokenNameEQUAL	
14	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
alt1	TokenNameIdentifier	 alt1
=	TokenNameEQUAL	
dfa1	TokenNameIdentifier	 dfa1
.	TokenNameDOT	
predict	TokenNameIdentifier	 predict
(	TokenNameLPAREN	
input	TokenNameIdentifier	 input
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
switch	TokenNameswitch	
(	TokenNameLPAREN	
alt1	TokenNameIdentifier	 alt1
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
1	TokenNameIntegerLiteral	
:	TokenNameCOLON	
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql/Cql.g:115:7: selectStatement 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql/Cql.g:115:7: selectStatement 
{	TokenNameLBRACE	
pushFollow	TokenNameIdentifier	 push Follow
(	TokenNameLPAREN	
FOLLOW_selectStatement_in_query69	TokenNameIdentifier	 FOLLOW select Statement in query69
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
selectStatement1	TokenNameIdentifier	 select Statement1
=	TokenNameEQUAL	
selectStatement	TokenNameIdentifier	 select Statement
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
_fsp	TokenNameIdentifier	 fsp
--	TokenNameMINUS_MINUS	
;	TokenNameSEMICOLON	
stmnt	TokenNameIdentifier	 stmnt
=	TokenNameEQUAL	
new	TokenNamenew	
CQLStatement	TokenNameIdentifier	 CQL Statement
(	TokenNameLPAREN	
StatementType	TokenNameIdentifier	 Statement Type
.	TokenNameDOT	
SELECT	TokenNameIdentifier	 SELECT
,	TokenNameCOMMA	
selectStatement1	TokenNameIdentifier	 select Statement1
,	TokenNameCOMMA	
currentBindMarkerIdx	TokenNameIdentifier	 current Bind Marker Idx
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
2	TokenNameIntegerLiteral	
:	TokenNameCOLON	
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql/Cql.g:116:7: insertStatement endStmnt 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql/Cql.g:116:7: insertStatement endStmnt 
{	TokenNameLBRACE	
pushFollow	TokenNameIdentifier	 push Follow
(	TokenNameLPAREN	
FOLLOW_insertStatement_in_query81	TokenNameIdentifier	 FOLLOW insert Statement in query81
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
insertStatement2	TokenNameIdentifier	 insert Statement2
=	TokenNameEQUAL	
insertStatement	TokenNameIdentifier	 insert Statement
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
_fsp	TokenNameIdentifier	 fsp
--	TokenNameMINUS_MINUS	
;	TokenNameSEMICOLON	
pushFollow	TokenNameIdentifier	 push Follow
(	TokenNameLPAREN	
FOLLOW_endStmnt_in_query83	TokenNameIdentifier	 FOLLOW end Stmnt in query83
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
endStmnt	TokenNameIdentifier	 end Stmnt
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
_fsp	TokenNameIdentifier	 fsp
--	TokenNameMINUS_MINUS	
;	TokenNameSEMICOLON	
stmnt	TokenNameIdentifier	 stmnt
=	TokenNameEQUAL	
new	TokenNamenew	
CQLStatement	TokenNameIdentifier	 CQL Statement
(	TokenNameLPAREN	
StatementType	TokenNameIdentifier	 Statement Type
.	TokenNameDOT	
INSERT	TokenNameIdentifier	 INSERT
,	TokenNameCOMMA	
insertStatement2	TokenNameIdentifier	 insert Statement2
,	TokenNameCOMMA	
currentBindMarkerIdx	TokenNameIdentifier	 current Bind Marker Idx
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
3	TokenNameIntegerLiteral	
:	TokenNameCOLON	
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql/Cql.g:117:7: updateStatement endStmnt 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql/Cql.g:117:7: updateStatement endStmnt 
{	TokenNameLBRACE	
pushFollow	TokenNameIdentifier	 push Follow
(	TokenNameLPAREN	
FOLLOW_updateStatement_in_query93	TokenNameIdentifier	 FOLLOW update Statement in query93
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
updateStatement3	TokenNameIdentifier	 update Statement3
=	TokenNameEQUAL	
updateStatement	TokenNameIdentifier	 update Statement
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
_fsp	TokenNameIdentifier	 fsp
--	TokenNameMINUS_MINUS	
;	TokenNameSEMICOLON	
pushFollow	TokenNameIdentifier	 push Follow
(	TokenNameLPAREN	
FOLLOW_endStmnt_in_query95	TokenNameIdentifier	 FOLLOW end Stmnt in query95
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
endStmnt	TokenNameIdentifier	 end Stmnt
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
_fsp	TokenNameIdentifier	 fsp
--	TokenNameMINUS_MINUS	
;	TokenNameSEMICOLON	
stmnt	TokenNameIdentifier	 stmnt
=	TokenNameEQUAL	
new	TokenNamenew	
CQLStatement	TokenNameIdentifier	 CQL Statement
(	TokenNameLPAREN	
StatementType	TokenNameIdentifier	 Statement Type
.	TokenNameDOT	
UPDATE	TokenNameIdentifier	 UPDATE
,	TokenNameCOMMA	
updateStatement3	TokenNameIdentifier	 update Statement3
,	TokenNameCOMMA	
currentBindMarkerIdx	TokenNameIdentifier	 current Bind Marker Idx
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
4	TokenNameIntegerLiteral	
:	TokenNameCOLON	
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql/Cql.g:118:7: batchStatement 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql/Cql.g:118:7: batchStatement 
{	TokenNameLBRACE	
pushFollow	TokenNameIdentifier	 push Follow
(	TokenNameLPAREN	
FOLLOW_batchStatement_in_query105	TokenNameIdentifier	 FOLLOW batch Statement in query105
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
batchStatement4	TokenNameIdentifier	 batch Statement4
=	TokenNameEQUAL	
batchStatement	TokenNameIdentifier	 batch Statement
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
_fsp	TokenNameIdentifier	 fsp
--	TokenNameMINUS_MINUS	
;	TokenNameSEMICOLON	
stmnt	TokenNameIdentifier	 stmnt
=	TokenNameEQUAL	
new	TokenNamenew	
CQLStatement	TokenNameIdentifier	 CQL Statement
(	TokenNameLPAREN	
StatementType	TokenNameIdentifier	 Statement Type
.	TokenNameDOT	
BATCH	TokenNameIdentifier	 BATCH
,	TokenNameCOMMA	
batchStatement4	TokenNameIdentifier	 batch Statement4
,	TokenNameCOMMA	
currentBindMarkerIdx	TokenNameIdentifier	 current Bind Marker Idx
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
5	TokenNameIntegerLiteral	
:	TokenNameCOLON	
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql/Cql.g:119:7: useStatement 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql/Cql.g:119:7: useStatement 
{	TokenNameLBRACE	
pushFollow	TokenNameIdentifier	 push Follow
(	TokenNameLPAREN	
FOLLOW_useStatement_in_query115	TokenNameIdentifier	 FOLLOW use Statement in query115
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
useStatement5	TokenNameIdentifier	 use Statement5
=	TokenNameEQUAL	
useStatement	TokenNameIdentifier	 use Statement
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
_fsp	TokenNameIdentifier	 fsp
--	TokenNameMINUS_MINUS	
;	TokenNameSEMICOLON	
stmnt	TokenNameIdentifier	 stmnt
=	TokenNameEQUAL	
new	TokenNamenew	
CQLStatement	TokenNameIdentifier	 CQL Statement
(	TokenNameLPAREN	
StatementType	TokenNameIdentifier	 Statement Type
.	TokenNameDOT	
USE	TokenNameIdentifier	 USE
,	TokenNameCOMMA	
useStatement5	TokenNameIdentifier	 use Statement5
,	TokenNameCOMMA	
currentBindMarkerIdx	TokenNameIdentifier	 current Bind Marker Idx
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
6	TokenNameIntegerLiteral	
:	TokenNameCOLON	
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql/Cql.g:120:7: truncateStatement 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql/Cql.g:120:7: truncateStatement 
{	TokenNameLBRACE	
pushFollow	TokenNameIdentifier	 push Follow
(	TokenNameLPAREN	
FOLLOW_truncateStatement_in_query130	TokenNameIdentifier	 FOLLOW truncate Statement in query130
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
truncateStatement6	TokenNameIdentifier	 truncate Statement6
=	TokenNameEQUAL	
truncateStatement	TokenNameIdentifier	 truncate Statement
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
_fsp	TokenNameIdentifier	 fsp
--	TokenNameMINUS_MINUS	
;	TokenNameSEMICOLON	
stmnt	TokenNameIdentifier	 stmnt
=	TokenNameEQUAL	
new	TokenNamenew	
CQLStatement	TokenNameIdentifier	 CQL Statement
(	TokenNameLPAREN	
StatementType	TokenNameIdentifier	 Statement Type
.	TokenNameDOT	
TRUNCATE	TokenNameIdentifier	 TRUNCATE
,	TokenNameCOMMA	
truncateStatement6	TokenNameIdentifier	 truncate Statement6
,	TokenNameCOMMA	
currentBindMarkerIdx	TokenNameIdentifier	 current Bind Marker Idx
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
7	TokenNameIntegerLiteral	
:	TokenNameCOLON	
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql/Cql.g:121:7: deleteStatement endStmnt 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql/Cql.g:121:7: deleteStatement endStmnt 
{	TokenNameLBRACE	
pushFollow	TokenNameIdentifier	 push Follow
(	TokenNameLPAREN	
FOLLOW_deleteStatement_in_query140	TokenNameIdentifier	 FOLLOW delete Statement in query140
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
deleteStatement7	TokenNameIdentifier	 delete Statement7
=	TokenNameEQUAL	
deleteStatement	TokenNameIdentifier	 delete Statement
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
_fsp	TokenNameIdentifier	 fsp
--	TokenNameMINUS_MINUS	
;	TokenNameSEMICOLON	
pushFollow	TokenNameIdentifier	 push Follow
(	TokenNameLPAREN	
FOLLOW_endStmnt_in_query142	TokenNameIdentifier	 FOLLOW end Stmnt in query142
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
endStmnt	TokenNameIdentifier	 end Stmnt
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
_fsp	TokenNameIdentifier	 fsp
--	TokenNameMINUS_MINUS	
;	TokenNameSEMICOLON	
stmnt	TokenNameIdentifier	 stmnt
=	TokenNameEQUAL	
new	TokenNamenew	
CQLStatement	TokenNameIdentifier	 CQL Statement
(	TokenNameLPAREN	
StatementType	TokenNameIdentifier	 Statement Type
.	TokenNameDOT	
DELETE	TokenNameIdentifier	 DELETE
,	TokenNameCOMMA	
deleteStatement7	TokenNameIdentifier	 delete Statement7
,	TokenNameCOMMA	
currentBindMarkerIdx	TokenNameIdentifier	 current Bind Marker Idx
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
8	TokenNameIntegerLiteral	
:	TokenNameCOLON	
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql/Cql.g:122:7: createKeyspaceStatement 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql/Cql.g:122:7: createKeyspaceStatement 
{	TokenNameLBRACE	
pushFollow	TokenNameIdentifier	 push Follow
(	TokenNameLPAREN	
FOLLOW_createKeyspaceStatement_in_query152	TokenNameIdentifier	 FOLLOW create Keyspace Statement in query152
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
createKeyspaceStatement8	TokenNameIdentifier	 create Keyspace Statement8
=	TokenNameEQUAL	
createKeyspaceStatement	TokenNameIdentifier	 create Keyspace Statement
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
_fsp	TokenNameIdentifier	 fsp
--	TokenNameMINUS_MINUS	
;	TokenNameSEMICOLON	
stmnt	TokenNameIdentifier	 stmnt
=	TokenNameEQUAL	
new	TokenNamenew	
CQLStatement	TokenNameIdentifier	 CQL Statement
(	TokenNameLPAREN	
StatementType	TokenNameIdentifier	 Statement Type
.	TokenNameDOT	
CREATE_KEYSPACE	TokenNameIdentifier	 CREATE  KEYSPACE
,	TokenNameCOMMA	
createKeyspaceStatement8	TokenNameIdentifier	 create Keyspace Statement8
,	TokenNameCOMMA	
currentBindMarkerIdx	TokenNameIdentifier	 current Bind Marker Idx
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
9	TokenNameIntegerLiteral	
:	TokenNameCOLON	
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql/Cql.g:123:7: createColumnFamilyStatement 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql/Cql.g:123:7: createColumnFamilyStatement 
{	TokenNameLBRACE	
pushFollow	TokenNameIdentifier	 push Follow
(	TokenNameLPAREN	
FOLLOW_createColumnFamilyStatement_in_query162	TokenNameIdentifier	 FOLLOW create Column Family Statement in query162
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
createColumnFamilyStatement9	TokenNameIdentifier	 create Column Family Statement9
=	TokenNameEQUAL	
createColumnFamilyStatement	TokenNameIdentifier	 create Column Family Statement
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
_fsp	TokenNameIdentifier	 fsp
--	TokenNameMINUS_MINUS	
;	TokenNameSEMICOLON	
stmnt	TokenNameIdentifier	 stmnt
=	TokenNameEQUAL	
new	TokenNamenew	
CQLStatement	TokenNameIdentifier	 CQL Statement
(	TokenNameLPAREN	
StatementType	TokenNameIdentifier	 Statement Type
.	TokenNameDOT	
CREATE_COLUMNFAMILY	TokenNameIdentifier	 CREATE  COLUMNFAMILY
,	TokenNameCOMMA	
createColumnFamilyStatement9	TokenNameIdentifier	 create Column Family Statement9
,	TokenNameCOMMA	
currentBindMarkerIdx	TokenNameIdentifier	 current Bind Marker Idx
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
10	TokenNameIntegerLiteral	
:	TokenNameCOLON	
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql/Cql.g:124:7: createIndexStatement 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql/Cql.g:124:7: createIndexStatement 
{	TokenNameLBRACE	
pushFollow	TokenNameIdentifier	 push Follow
(	TokenNameLPAREN	
FOLLOW_createIndexStatement_in_query172	TokenNameIdentifier	 FOLLOW create Index Statement in query172
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
createIndexStatement10	TokenNameIdentifier	 create Index Statement10
=	TokenNameEQUAL	
createIndexStatement	TokenNameIdentifier	 create Index Statement
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
_fsp	TokenNameIdentifier	 fsp
--	TokenNameMINUS_MINUS	
;	TokenNameSEMICOLON	
stmnt	TokenNameIdentifier	 stmnt
=	TokenNameEQUAL	
new	TokenNamenew	
CQLStatement	TokenNameIdentifier	 CQL Statement
(	TokenNameLPAREN	
StatementType	TokenNameIdentifier	 Statement Type
.	TokenNameDOT	
CREATE_INDEX	TokenNameIdentifier	 CREATE  INDEX
,	TokenNameCOMMA	
createIndexStatement10	TokenNameIdentifier	 create Index Statement10
,	TokenNameCOMMA	
currentBindMarkerIdx	TokenNameIdentifier	 current Bind Marker Idx
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
11	TokenNameIntegerLiteral	
:	TokenNameCOLON	
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql/Cql.g:125:7: dropIndexStatement 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql/Cql.g:125:7: dropIndexStatement 
{	TokenNameLBRACE	
pushFollow	TokenNameIdentifier	 push Follow
(	TokenNameLPAREN	
FOLLOW_dropIndexStatement_in_query182	TokenNameIdentifier	 FOLLOW drop Index Statement in query182
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
dropIndexStatement11	TokenNameIdentifier	 drop Index Statement11
=	TokenNameEQUAL	
dropIndexStatement	TokenNameIdentifier	 drop Index Statement
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
_fsp	TokenNameIdentifier	 fsp
--	TokenNameMINUS_MINUS	
;	TokenNameSEMICOLON	
stmnt	TokenNameIdentifier	 stmnt
=	TokenNameEQUAL	
new	TokenNamenew	
CQLStatement	TokenNameIdentifier	 CQL Statement
(	TokenNameLPAREN	
StatementType	TokenNameIdentifier	 Statement Type
.	TokenNameDOT	
DROP_INDEX	TokenNameIdentifier	 DROP  INDEX
,	TokenNameCOMMA	
dropIndexStatement11	TokenNameIdentifier	 drop Index Statement11
,	TokenNameCOMMA	
currentBindMarkerIdx	TokenNameIdentifier	 current Bind Marker Idx
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
12	TokenNameIntegerLiteral	
:	TokenNameCOLON	
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql/Cql.g:126:7: dropKeyspaceStatement 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql/Cql.g:126:7: dropKeyspaceStatement 
{	TokenNameLBRACE	
pushFollow	TokenNameIdentifier	 push Follow
(	TokenNameLPAREN	
FOLLOW_dropKeyspaceStatement_in_query194	TokenNameIdentifier	 FOLLOW drop Keyspace Statement in query194
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
dropKeyspaceStatement12	TokenNameIdentifier	 drop Keyspace Statement12
=	TokenNameEQUAL	
dropKeyspaceStatement	TokenNameIdentifier	 drop Keyspace Statement
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
_fsp	TokenNameIdentifier	 fsp
--	TokenNameMINUS_MINUS	
;	TokenNameSEMICOLON	
stmnt	TokenNameIdentifier	 stmnt
=	TokenNameEQUAL	
new	TokenNamenew	
CQLStatement	TokenNameIdentifier	 CQL Statement
(	TokenNameLPAREN	
StatementType	TokenNameIdentifier	 Statement Type
.	TokenNameDOT	
DROP_KEYSPACE	TokenNameIdentifier	 DROP  KEYSPACE
,	TokenNameCOMMA	
dropKeyspaceStatement12	TokenNameIdentifier	 drop Keyspace Statement12
,	TokenNameCOMMA	
currentBindMarkerIdx	TokenNameIdentifier	 current Bind Marker Idx
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
13	TokenNameIntegerLiteral	
:	TokenNameCOLON	
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql/Cql.g:127:7: dropColumnFamilyStatement 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql/Cql.g:127:7: dropColumnFamilyStatement 
{	TokenNameLBRACE	
pushFollow	TokenNameIdentifier	 push Follow
(	TokenNameLPAREN	
FOLLOW_dropColumnFamilyStatement_in_query204	TokenNameIdentifier	 FOLLOW drop Column Family Statement in query204
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
dropColumnFamilyStatement13	TokenNameIdentifier	 drop Column Family Statement13
=	TokenNameEQUAL	
dropColumnFamilyStatement	TokenNameIdentifier	 drop Column Family Statement
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
_fsp	TokenNameIdentifier	 fsp
--	TokenNameMINUS_MINUS	
;	TokenNameSEMICOLON	
stmnt	TokenNameIdentifier	 stmnt
=	TokenNameEQUAL	
new	TokenNamenew	
CQLStatement	TokenNameIdentifier	 CQL Statement
(	TokenNameLPAREN	
StatementType	TokenNameIdentifier	 Statement Type
.	TokenNameDOT	
DROP_COLUMNFAMILY	TokenNameIdentifier	 DROP  COLUMNFAMILY
,	TokenNameCOMMA	
dropColumnFamilyStatement13	TokenNameIdentifier	 drop Column Family Statement13
,	TokenNameCOMMA	
currentBindMarkerIdx	TokenNameIdentifier	 current Bind Marker Idx
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
14	TokenNameIntegerLiteral	
:	TokenNameCOLON	
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql/Cql.g:128:7: alterTableStatement 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql/Cql.g:128:7: alterTableStatement 
{	TokenNameLBRACE	
pushFollow	TokenNameIdentifier	 push Follow
(	TokenNameLPAREN	
FOLLOW_alterTableStatement_in_query214	TokenNameIdentifier	 FOLLOW alter Table Statement in query214
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
alterTableStatement14	TokenNameIdentifier	 alter Table Statement14
=	TokenNameEQUAL	
alterTableStatement	TokenNameIdentifier	 alter Table Statement
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
_fsp	TokenNameIdentifier	 fsp
--	TokenNameMINUS_MINUS	
;	TokenNameSEMICOLON	
stmnt	TokenNameIdentifier	 stmnt
=	TokenNameEQUAL	
new	TokenNamenew	
CQLStatement	TokenNameIdentifier	 CQL Statement
(	TokenNameLPAREN	
StatementType	TokenNameIdentifier	 Statement Type
.	TokenNameDOT	
ALTER_TABLE	TokenNameIdentifier	 ALTER  TABLE
,	TokenNameCOMMA	
alterTableStatement14	TokenNameIdentifier	 alter Table Statement14
,	TokenNameCOMMA	
currentBindMarkerIdx	TokenNameIdentifier	 current Bind Marker Idx
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
RecognitionException	TokenNameIdentifier	 Recognition Exception
re	TokenNameIdentifier	 re
)	TokenNameRPAREN	
{	TokenNameLBRACE	
reportError	TokenNameIdentifier	 report Error
(	TokenNameLPAREN	
re	TokenNameIdentifier	 re
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
recover	TokenNameIdentifier	 recover
(	TokenNameLPAREN	
input	TokenNameIdentifier	 input
,	TokenNameCOMMA	
re	TokenNameIdentifier	 re
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
finally	TokenNamefinally	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
stmnt	TokenNameIdentifier	 stmnt
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// $ANTLR end "query" 	TokenNameCOMMENT_LINE	$ANTLR end "query" 
// $ANTLR start "useStatement" 	TokenNameCOMMENT_LINE	$ANTLR start "useStatement" 
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql/Cql.g:132:1: useStatement returns [String keyspace] : K_USE name= ( IDENT | INTEGER | STRING_LITERAL ) endStmnt ; 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql/Cql.g:132:1: useStatement returns [String keyspace] : K_USE name= ( IDENT | INTEGER | STRING_LITERAL ) endStmnt ; 
public	TokenNamepublic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
useStatement	TokenNameIdentifier	 use Statement
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
RecognitionException	TokenNameIdentifier	 Recognition Exception
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
keyspace	TokenNameIdentifier	 keyspace
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
Token	TokenNameIdentifier	 Token
name	TokenNameIdentifier	 name
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql/Cql.g:133:5: ( K_USE name= ( IDENT | INTEGER | STRING_LITERAL ) endStmnt ) 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql/Cql.g:133:5: ( K_USE name= ( IDENT | INTEGER | STRING_LITERAL ) endStmnt ) 
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql/Cql.g:133:7: K_USE name= ( IDENT | INTEGER | STRING_LITERAL ) endStmnt 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql/Cql.g:133:7: K_USE name= ( IDENT | INTEGER | STRING_LITERAL ) endStmnt 
{	TokenNameLBRACE	
match	TokenNameIdentifier	 match
(	TokenNameLPAREN	
input	TokenNameIdentifier	 input
,	TokenNameCOMMA	
K_USE	TokenNameIdentifier	 K  USE
,	TokenNameCOMMA	
FOLLOW_K_USE_in_useStatement238	TokenNameIdentifier	 FOLLOW  K  USE in use Statement238
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
name	TokenNameIdentifier	 name
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Token	TokenNameIdentifier	 Token
)	TokenNameRPAREN	
input	TokenNameIdentifier	 input
.	TokenNameDOT	
LT	TokenNameIdentifier	 LT
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
IDENT	TokenNameIdentifier	 IDENT
&&	TokenNameAND_AND	
input	TokenNameIdentifier	 input
.	TokenNameDOT	
LA	TokenNameIdentifier	 LA
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
<=	TokenNameLESS_EQUAL	
STRING_LITERAL	TokenNameIdentifier	 STRING  LITERAL
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
input	TokenNameIdentifier	 input
.	TokenNameDOT	
consume	TokenNameIdentifier	 consume
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
errorRecovery	TokenNameIdentifier	 error Recovery
=	TokenNameEQUAL	
false	TokenNamefalse	
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
throw	TokenNamethrow	
mse	TokenNameIdentifier	 mse
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
keyspace	TokenNameIdentifier	 keyspace
=	TokenNameEQUAL	
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
?	TokenNameQUESTION	
name	TokenNameIdentifier	 name
.	TokenNameDOT	
getText	TokenNameIdentifier	 get Text
(	TokenNameLPAREN	
)	TokenNameRPAREN	
:	TokenNameCOLON	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
pushFollow	TokenNameIdentifier	 push Follow
(	TokenNameLPAREN	
FOLLOW_endStmnt_in_useStatement258	TokenNameIdentifier	 FOLLOW end Stmnt in use Statement258
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
endStmnt	TokenNameIdentifier	 end Stmnt
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
_fsp	TokenNameIdentifier	 fsp
--	TokenNameMINUS_MINUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
RecognitionException	TokenNameIdentifier	 Recognition Exception
re	TokenNameIdentifier	 re
)	TokenNameRPAREN	
{	TokenNameLBRACE	
reportError	TokenNameIdentifier	 report Error
(	TokenNameLPAREN	
re	TokenNameIdentifier	 re
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
recover	TokenNameIdentifier	 recover
(	TokenNameLPAREN	
input	TokenNameIdentifier	 input
,	TokenNameCOMMA	
re	TokenNameIdentifier	 re
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
finally	TokenNamefinally	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
keyspace	TokenNameIdentifier	 keyspace
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// $ANTLR end "useStatement" 	TokenNameCOMMENT_LINE	$ANTLR end "useStatement" 
// $ANTLR start "selectStatement" 	TokenNameCOMMENT_LINE	$ANTLR start "selectStatement" 
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql/Cql.g:136:1: selectStatement returns [SelectStatement expr] : K_SELECT (s1= selectExpression | K_COUNT '(' s2= selectExpression ')' ) K_FROM (keyspace= ( IDENT | STRING_LITERAL | INTEGER ) '.' )? columnFamily= ( IDENT | STRING_LITERAL | INTEGER ) ( K_USING K_CONSISTENCY K_LEVEL )? ( K_WHERE whereClause )? ( K_LIMIT rows= INTEGER )? endStmnt ; 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql/Cql.g:136:1: selectStatement returns [SelectStatement expr] : K_SELECT (s1= selectExpression | K_COUNT '(' s2= selectExpression ')' ) K_FROM (keyspace= ( IDENT | STRING_LITERAL | INTEGER ) '.' )? columnFamily= ( IDENT | STRING_LITERAL | INTEGER ) ( K_USING K_CONSISTENCY K_LEVEL )? ( K_WHERE whereClause )? ( K_LIMIT rows= INTEGER )? endStmnt ; 
public	TokenNamepublic	
final	TokenNamefinal	
SelectStatement	TokenNameIdentifier	 Select Statement
selectStatement	TokenNameIdentifier	 select Statement
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
RecognitionException	TokenNameIdentifier	 Recognition Exception
{	TokenNameLBRACE	
SelectStatement	TokenNameIdentifier	 Select Statement
expr	TokenNameIdentifier	 expr
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
Token	TokenNameIdentifier	 Token
keyspace	TokenNameIdentifier	 keyspace
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
Token	TokenNameIdentifier	 Token
columnFamily	TokenNameIdentifier	 column Family
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
Token	TokenNameIdentifier	 Token
rows	TokenNameIdentifier	 rows
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
Token	TokenNameIdentifier	 Token
K_LEVEL15	TokenNameIdentifier	 K  LEVE L15
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
SelectExpression	TokenNameIdentifier	 Select Expression
s1	TokenNameIdentifier	 s1
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
SelectExpression	TokenNameIdentifier	 Select Expression
s2	TokenNameIdentifier	 s2
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
WhereClause	TokenNameIdentifier	 Where Clause
whereClause16	TokenNameIdentifier	 where Clause16
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql/Cql.g:149:5: ( K_SELECT (s1= selectExpression | K_COUNT '(' s2= selectExpression ')' ) K_FROM (keyspace= ( IDENT | STRING_LITERAL | INTEGER ) '.' )? columnFamily= ( IDENT | STRING_LITERAL | INTEGER ) ( K_USING K_CONSISTENCY K_LEVEL )? ( K_WHERE whereClause )? ( K_LIMIT rows= INTEGER )? endStmnt ) 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql/Cql.g:149:5: ( K_SELECT (s1= selectExpression | K_COUNT '(' s2= selectExpression ')' ) K_FROM (keyspace= ( IDENT | STRING_LITERAL | INTEGER ) '.' )? columnFamily= ( IDENT | STRING_LITERAL | INTEGER ) ( K_USING K_CONSISTENCY K_LEVEL )? ( K_WHERE whereClause )? ( K_LIMIT rows= INTEGER )? endStmnt ) 
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql/Cql.g:149:7: K_SELECT (s1= selectExpression | K_COUNT '(' s2= selectExpression ')' ) K_FROM (keyspace= ( IDENT | STRING_LITERAL | INTEGER ) '.' )? columnFamily= ( IDENT | STRING_LITERAL | INTEGER ) ( K_USING K_CONSISTENCY K_LEVEL )? ( K_WHERE whereClause )? ( K_LIMIT rows= INTEGER )? endStmnt 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql/Cql.g:149:7: K_SELECT (s1= selectExpression | K_COUNT '(' s2= selectExpression ')' ) K_FROM (keyspace= ( IDENT | STRING_LITERAL | INTEGER ) '.' )? columnFamily= ( IDENT | STRING_LITERAL | INTEGER ) ( K_USING K_CONSISTENCY K_LEVEL )? ( K_WHERE whereClause )? ( K_LIMIT rows= INTEGER )? endStmnt 
{	TokenNameLBRACE	
int	TokenNameint	
numRecords	TokenNameIdentifier	 num Records
=	TokenNameEQUAL	
10000	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
SelectExpression	TokenNameIdentifier	 Select Expression
expression	TokenNameIdentifier	 expression
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
isCountOp	TokenNameIdentifier	 is Count Op
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
ConsistencyLevel	TokenNameIdentifier	 Consistency Level
cLevel	TokenNameIdentifier	 c Level
=	TokenNameEQUAL	
ConsistencyLevel	TokenNameIdentifier	 Consistency Level
.	TokenNameDOT	
ONE	TokenNameIdentifier	 ONE
;	TokenNameSEMICOLON	
match	TokenNameIdentifier	 match
(	TokenNameLPAREN	
input	TokenNameIdentifier	 input
,	TokenNameCOMMA	
K_SELECT	TokenNameIdentifier	 K  SELECT
,	TokenNameCOMMA	
FOLLOW_K_SELECT_in_selectStatement289	TokenNameIdentifier	 FOLLOW  K  SELECT in select Statement289
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql/Cql.g:156:11: (s1= selectExpression | K_COUNT '(' s2= selectExpression ')' ) 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql/Cql.g:156:11: (s1= selectExpression | K_COUNT '(' s2= selectExpression ')' ) 
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
(	TokenNameLPAREN	
LA2_0	TokenNameIdentifier	 L A2 0
>=	TokenNameGREATER_EQUAL	
IDENT	TokenNameIdentifier	 IDENT
&&	TokenNameAND_AND	
LA2_0	TokenNameIdentifier	 L A2 0
<=	TokenNameLESS_EQUAL	
STRING_LITERAL	TokenNameIdentifier	 STRING  LITERAL
)	TokenNameRPAREN	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
LA2_0	TokenNameIdentifier	 L A2 0
>=	TokenNameGREATER_EQUAL	
K_FIRST	TokenNameIdentifier	 K  FIRST
&&	TokenNameAND_AND	
LA2_0	TokenNameIdentifier	 L A2 0
<=	TokenNameLESS_EQUAL	
K_REVERSED	TokenNameIdentifier	 K  REVERSED
)	TokenNameRPAREN	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
LA2_0	TokenNameIdentifier	 L A2 0
>=	TokenNameGREATER_EQUAL	
K_KEY	TokenNameIdentifier	 K  KEY
&&	TokenNameAND_AND	
LA2_0	TokenNameIdentifier	 L A2 0
<=	TokenNameLESS_EQUAL	
FLOAT	TokenNameIdentifier	 FLOAT
)	TokenNameRPAREN	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
LA2_0	TokenNameIdentifier	 L A2 0
>=	TokenNameGREATER_EQUAL	
UUID	TokenNameIdentifier	 UUID
&&	TokenNameAND_AND	
LA2_0	TokenNameIdentifier	 L A2 0
<=	TokenNameLESS_EQUAL	
QMARK	TokenNameIdentifier	 QMARK
)	TokenNameRPAREN	
||	TokenNameOR_OR	
LA2_0	TokenNameIdentifier	 L A2 0
==	TokenNameEQUAL_EQUAL	
85	TokenNameIntegerLiteral	
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
K_COUNT	TokenNameIdentifier	 K  COUNT
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
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql/Cql.g:156:13: s1= selectExpression 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql/Cql.g:156:13: s1= selectExpression 
{	TokenNameLBRACE	
pushFollow	TokenNameIdentifier	 push Follow
(	TokenNameLPAREN	
FOLLOW_selectExpression_in_selectStatement305	TokenNameIdentifier	 FOLLOW select Expression in select Statement305
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
s1	TokenNameIdentifier	 s1
=	TokenNameEQUAL	
selectExpression	TokenNameIdentifier	 select Expression
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
_fsp	TokenNameIdentifier	 fsp
--	TokenNameMINUS_MINUS	
;	TokenNameSEMICOLON	
expression	TokenNameIdentifier	 expression
=	TokenNameEQUAL	
s1	TokenNameIdentifier	 s1
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
2	TokenNameIntegerLiteral	
:	TokenNameCOLON	
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql/Cql.g:157:13: K_COUNT '(' s2= selectExpression ')' 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql/Cql.g:157:13: K_COUNT '(' s2= selectExpression ')' 
{	TokenNameLBRACE	
match	TokenNameIdentifier	 match
(	TokenNameLPAREN	
input	TokenNameIdentifier	 input
,	TokenNameCOMMA	
K_COUNT	TokenNameIdentifier	 K  COUNT
,	TokenNameCOMMA	
FOLLOW_K_COUNT_in_selectStatement337	TokenNameIdentifier	 FOLLOW  K  COUNT in select Statement337
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
match	TokenNameIdentifier	 match
(	TokenNameLPAREN	
input	TokenNameIdentifier	 input
,	TokenNameCOMMA	
81	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
FOLLOW_81_in_selectStatement339	TokenNameIdentifier	 FOLLOW 81 in select Statement339
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
pushFollow	TokenNameIdentifier	 push Follow
(	TokenNameLPAREN	
FOLLOW_selectExpression_in_selectStatement343	TokenNameIdentifier	 FOLLOW select Expression in select Statement343
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
s2	TokenNameIdentifier	 s2
=	TokenNameEQUAL	
selectExpression	TokenNameIdentifier	 select Expression
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
_fsp	TokenNameIdentifier	 fsp
--	TokenNameMINUS_MINUS	
;	TokenNameSEMICOLON	
match	TokenNameIdentifier	 match
(	TokenNameLPAREN	
input	TokenNameIdentifier	 input
,	TokenNameCOMMA	
82	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
FOLLOW_82_in_selectStatement345	TokenNameIdentifier	 FOLLOW 82 in select Statement345
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
expression	TokenNameIdentifier	 expression
=	TokenNameEQUAL	
s2	TokenNameIdentifier	 s2
;	TokenNameSEMICOLON	
isCountOp	TokenNameIdentifier	 is Count Op
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
match	TokenNameIdentifier	 match
(	TokenNameLPAREN	
input	TokenNameIdentifier	 input
,	TokenNameCOMMA	
K_FROM	TokenNameIdentifier	 K  FROM
,	TokenNameCOMMA	
FOLLOW_K_FROM_in_selectStatement371	TokenNameIdentifier	 FOLLOW  K  FROM in select Statement371
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql/Cql.g:159:18: (keyspace= ( IDENT | STRING_LITERAL | INTEGER ) '.' )? 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql/Cql.g:159:18: (keyspace= ( IDENT | STRING_LITERAL | INTEGER ) '.' )? 
int	TokenNameint	
alt3	TokenNameIdentifier	 alt3
=	TokenNameEQUAL	
2	TokenNameIntegerLiteral	
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
(	TokenNameLPAREN	
LA3_0	TokenNameIdentifier	 L A3 0
>=	TokenNameGREATER_EQUAL	
IDENT	TokenNameIdentifier	 IDENT
&&	TokenNameAND_AND	
LA3_0	TokenNameIdentifier	 L A3 0
<=	TokenNameLESS_EQUAL	
STRING_LITERAL	TokenNameIdentifier	 STRING  LITERAL
)	TokenNameRPAREN	
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
83	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
alt3	TokenNameIdentifier	 alt3
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
switch	TokenNameswitch	
(	TokenNameLPAREN	
alt3	TokenNameIdentifier	 alt3
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
1	TokenNameIntegerLiteral	
:	TokenNameCOLON	
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql/Cql.g:159:19: keyspace= ( IDENT | STRING_LITERAL | INTEGER ) '.' 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql/Cql.g:159:19: keyspace= ( IDENT | STRING_LITERAL | INTEGER ) '.' 
{	TokenNameLBRACE	
keyspace	TokenNameIdentifier	 keyspace
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Token	TokenNameIdentifier	 Token
)	TokenNameRPAREN	
input	TokenNameIdentifier	 input
.	TokenNameDOT	
LT	TokenNameIdentifier	 LT
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
IDENT	TokenNameIdentifier	 IDENT
&&	TokenNameAND_AND	
input	TokenNameIdentifier	 input
.	TokenNameDOT	
LA	TokenNameIdentifier	 LA
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
<=	TokenNameLESS_EQUAL	
STRING_LITERAL	TokenNameIdentifier	 STRING  LITERAL
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
input	TokenNameIdentifier	 input
.	TokenNameDOT	
consume	TokenNameIdentifier	 consume
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
errorRecovery	TokenNameIdentifier	 error Recovery
=	TokenNameEQUAL	
false	TokenNamefalse	
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
throw	TokenNamethrow	
mse	TokenNameIdentifier	 mse
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
match	TokenNameIdentifier	 match
(	TokenNameLPAREN	
input	TokenNameIdentifier	 input
,	TokenNameCOMMA	
83	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
FOLLOW_83_in_selectStatement388	TokenNameIdentifier	 FOLLOW 83 in select Statement388
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
columnFamily	TokenNameIdentifier	 column Family
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Token	TokenNameIdentifier	 Token
)	TokenNameRPAREN	
input	TokenNameIdentifier	 input
.	TokenNameDOT	
LT	TokenNameIdentifier	 LT
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
IDENT	TokenNameIdentifier	 IDENT
&&	TokenNameAND_AND	
input	TokenNameIdentifier	 input
.	TokenNameDOT	
LA	TokenNameIdentifier	 LA
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
<=	TokenNameLESS_EQUAL	
STRING_LITERAL	TokenNameIdentifier	 STRING  LITERAL
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
input	TokenNameIdentifier	 input
.	TokenNameDOT	
consume	TokenNameIdentifier	 consume
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
errorRecovery	TokenNameIdentifier	 error Recovery
=	TokenNameEQUAL	
false	TokenNamefalse	
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
throw	TokenNamethrow	
mse	TokenNameIdentifier	 mse
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql/Cql.g:160:11: ( K_USING K_CONSISTENCY K_LEVEL )? 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql/Cql.g:160:11: ( K_USING K_CONSISTENCY K_LEVEL )? 
int	TokenNameint	
alt4	TokenNameIdentifier	 alt4
=	TokenNameEQUAL	
2	TokenNameIntegerLiteral	
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
K_USING	TokenNameIdentifier	 K  USING
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
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql/Cql.g:160:13: K_USING K_CONSISTENCY K_LEVEL 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql/Cql.g:160:13: K_USING K_CONSISTENCY K_LEVEL 
{	TokenNameLBRACE	
match	TokenNameIdentifier	 match
(	TokenNameLPAREN	
input	TokenNameIdentifier	 input
,	TokenNameCOMMA	
K_USING	TokenNameIdentifier	 K  USING
,	TokenNameCOMMA	
FOLLOW_K_USING_in_selectStatement420	TokenNameIdentifier	 FOLLOW  K  USING in select Statement420
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
match	TokenNameIdentifier	 match
(	TokenNameLPAREN	
input	TokenNameIdentifier	 input
,	TokenNameCOMMA	
K_CONSISTENCY	TokenNameIdentifier	 K  CONSISTENCY
,	TokenNameCOMMA	
FOLLOW_K_CONSISTENCY_in_selectStatement422	TokenNameIdentifier	 FOLLOW  K  CONSISTENCY in select Statement422
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
K_LEVEL15	TokenNameIdentifier	 K  LEVE L15
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Token	TokenNameIdentifier	 Token
)	TokenNameRPAREN	
match	TokenNameIdentifier	 match
(	TokenNameLPAREN	
input	TokenNameIdentifier	 input
,	TokenNameCOMMA	
K_LEVEL	TokenNameIdentifier	 K  LEVEL
,	TokenNameCOMMA	
FOLLOW_K_LEVEL_in_selectStatement424	TokenNameIdentifier	 FOLLOW  K  LEVEL in select Statement424
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
cLevel	TokenNameIdentifier	 c Level
=	TokenNameEQUAL	
ConsistencyLevel	TokenNameIdentifier	 Consistency Level
.	TokenNameDOT	
valueOf	TokenNameIdentifier	 value Of
(	TokenNameLPAREN	
(	TokenNameLPAREN	
K_LEVEL15	TokenNameIdentifier	 K  LEVE L15
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
?	TokenNameQUESTION	
K_LEVEL15	TokenNameIdentifier	 K  LEVE L15
.	TokenNameDOT	
getText	TokenNameIdentifier	 get Text
(	TokenNameLPAREN	
)	TokenNameRPAREN	
:	TokenNameCOLON	
null	TokenNamenull	
)	TokenNameRPAREN	
.	TokenNameDOT	
toUpperCase	TokenNameIdentifier	 to Upper Case
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql/Cql.g:161:11: ( K_WHERE whereClause )? 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql/Cql.g:161:11: ( K_WHERE whereClause )? 
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
K_WHERE	TokenNameIdentifier	 K  WHERE
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
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql/Cql.g:161:13: K_WHERE whereClause 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql/Cql.g:161:13: K_WHERE whereClause 
{	TokenNameLBRACE	
match	TokenNameIdentifier	 match
(	TokenNameLPAREN	
input	TokenNameIdentifier	 input
,	TokenNameCOMMA	
K_WHERE	TokenNameIdentifier	 K  WHERE
,	TokenNameCOMMA	
FOLLOW_K_WHERE_in_selectStatement443	TokenNameIdentifier	 FOLLOW  K  WHERE in select Statement443
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
pushFollow	TokenNameIdentifier	 push Follow
(	TokenNameLPAREN	
FOLLOW_whereClause_in_selectStatement445	TokenNameIdentifier	 FOLLOW where Clause in select Statement445
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
whereClause16	TokenNameIdentifier	 where Clause16
=	TokenNameEQUAL	
whereClause	TokenNameIdentifier	 where Clause
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
_fsp	TokenNameIdentifier	 fsp
--	TokenNameMINUS_MINUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql/Cql.g:162:11: ( K_LIMIT rows= INTEGER )? 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql/Cql.g:162:11: ( K_LIMIT rows= INTEGER )? 
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
LA6_0	TokenNameIdentifier	 L A6 0
==	TokenNameEQUAL_EQUAL	
K_LIMIT	TokenNameIdentifier	 K  LIMIT
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
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql/Cql.g:162:13: K_LIMIT rows= INTEGER 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql/Cql.g:162:13: K_LIMIT rows= INTEGER 
{	TokenNameLBRACE	
match	TokenNameIdentifier	 match
(	TokenNameLPAREN	
input	TokenNameIdentifier	 input
,	TokenNameCOMMA	
K_LIMIT	TokenNameIdentifier	 K  LIMIT
,	TokenNameCOMMA	
FOLLOW_K_LIMIT_in_selectStatement462	TokenNameIdentifier	 FOLLOW  K  LIMIT in select Statement462
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
rows	TokenNameIdentifier	 rows
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Token	TokenNameIdentifier	 Token
)	TokenNameRPAREN	
match	TokenNameIdentifier	 match
(	TokenNameLPAREN	
input	TokenNameIdentifier	 input
,	TokenNameCOMMA	
INTEGER	TokenNameIdentifier	 INTEGER
,	TokenNameCOMMA	
FOLLOW_INTEGER_in_selectStatement466	TokenNameIdentifier	 FOLLOW  INTEGER in select Statement466
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
numRecords	TokenNameIdentifier	 num Records
=	TokenNameEQUAL	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
parseInt	TokenNameIdentifier	 parse Int
(	TokenNameLPAREN	
(	TokenNameLPAREN	
rows	TokenNameIdentifier	 rows
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
?	TokenNameQUESTION	
rows	TokenNameIdentifier	 rows
.	TokenNameDOT	
getText	TokenNameIdentifier	 get Text
(	TokenNameLPAREN	
)	TokenNameRPAREN	
:	TokenNameCOLON	
null	TokenNamenull	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
pushFollow	TokenNameIdentifier	 push Follow
(	TokenNameLPAREN	
FOLLOW_endStmnt_in_selectStatement483	TokenNameIdentifier	 FOLLOW end Stmnt in select Statement483
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
endStmnt	TokenNameIdentifier	 end Stmnt
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
_fsp	TokenNameIdentifier	 fsp
--	TokenNameMINUS_MINUS	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
new	TokenNamenew	
SelectStatement	TokenNameIdentifier	 Select Statement
(	TokenNameLPAREN	
expression	TokenNameIdentifier	 expression
,	TokenNameCOMMA	
isCountOp	TokenNameIdentifier	 is Count Op
,	TokenNameCOMMA	
(	TokenNameLPAREN	
keyspace	TokenNameIdentifier	 keyspace
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
?	TokenNameQUESTION	
keyspace	TokenNameIdentifier	 keyspace
.	TokenNameDOT	
getText	TokenNameIdentifier	 get Text
(	TokenNameLPAREN	
)	TokenNameRPAREN	
:	TokenNameCOLON	
null	TokenNamenull	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
(	TokenNameLPAREN	
columnFamily	TokenNameIdentifier	 column Family
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
?	TokenNameQUESTION	
columnFamily	TokenNameIdentifier	 column Family
.	TokenNameDOT	
getText	TokenNameIdentifier	 get Text
(	TokenNameLPAREN	
)	TokenNameRPAREN	
:	TokenNameCOLON	
null	TokenNamenull	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
cLevel	TokenNameIdentifier	 c Level
,	TokenNameCOMMA	
whereClause16	TokenNameIdentifier	 where Clause16
,	TokenNameCOMMA	
numRecords	TokenNameIdentifier	 num Records
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
RecognitionException	TokenNameIdentifier	 Recognition Exception
re	TokenNameIdentifier	 re
)	TokenNameRPAREN	
{	TokenNameLBRACE	
reportError	TokenNameIdentifier	 report Error
(	TokenNameLPAREN	
re	TokenNameIdentifier	 re
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
recover	TokenNameIdentifier	 recover
(	TokenNameLPAREN	
input	TokenNameIdentifier	 input
,	TokenNameCOMMA	
re	TokenNameIdentifier	 re
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
finally	TokenNamefinally	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
expr	TokenNameIdentifier	 expr
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// $ANTLR end "selectStatement" 	TokenNameCOMMENT_LINE	$ANTLR end "selectStatement" 
// $ANTLR start "selectExpression" 	TokenNameCOMMENT_LINE	$ANTLR start "selectExpression" 
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql/Cql.g:177:1: selectExpression returns [SelectExpression expr] : ( K_FIRST cols= INTEGER )? ( K_REVERSED )? (first= term ( ',' next= term )* | start= term RANGEOP finish= term | '\\*' ) ; 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql/Cql.g:177:1: selectExpression returns [SelectExpression expr] : ( K_FIRST cols= INTEGER )? ( K_REVERSED )? (first= term ( ',' next= term )* | start= term RANGEOP finish= term | '\\*' ) ; 
public	TokenNamepublic	
final	TokenNamefinal	
SelectExpression	TokenNameIdentifier	 Select Expression
selectExpression	TokenNameIdentifier	 select Expression
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
RecognitionException	TokenNameIdentifier	 Recognition Exception
{	TokenNameLBRACE	
SelectExpression	TokenNameIdentifier	 Select Expression
expr	TokenNameIdentifier	 expr
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
Token	TokenNameIdentifier	 Token
cols	TokenNameIdentifier	 cols
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
Term	TokenNameIdentifier	 Term
first	TokenNameIdentifier	 first
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
Term	TokenNameIdentifier	 Term
next	TokenNameIdentifier	 next
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
Term	TokenNameIdentifier	 Term
start	TokenNameIdentifier	 start
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
Term	TokenNameIdentifier	 Term
finish	TokenNameIdentifier	 finish
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql/Cql.g:178:5: ( ( K_FIRST cols= INTEGER )? ( K_REVERSED )? (first= term ( ',' next= term )* | start= term RANGEOP finish= term | '\\*' ) ) 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql/Cql.g:178:5: ( ( K_FIRST cols= INTEGER )? ( K_REVERSED )? (first= term ( ',' next= term )* | start= term RANGEOP finish= term | '\\*' ) ) 
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql/Cql.g:178:7: ( K_FIRST cols= INTEGER )? ( K_REVERSED )? (first= term ( ',' next= term )* | start= term RANGEOP finish= term | '\\*' ) 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql/Cql.g:178:7: ( K_FIRST cols= INTEGER )? ( K_REVERSED )? (first= term ( ',' next= term )* | start= term RANGEOP finish= term | '\\*' ) 
{	TokenNameLBRACE	
int	TokenNameint	
count	TokenNameIdentifier	 count
=	TokenNameEQUAL	
10000	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
reversed	TokenNameIdentifier	 reversed
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
hasFirstSet	TokenNameIdentifier	 has First Set
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql/Cql.g:183:7: ( K_FIRST cols= INTEGER )? 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql/Cql.g:183:7: ( K_FIRST cols= INTEGER )? 
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
LA7_0	TokenNameIdentifier	 L A7 0
==	TokenNameEQUAL_EQUAL	
K_FIRST	TokenNameIdentifier	 K  FIRST
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
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql/Cql.g:183:9: K_FIRST cols= INTEGER 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql/Cql.g:183:9: K_FIRST cols= INTEGER 
{	TokenNameLBRACE	
match	TokenNameIdentifier	 match
(	TokenNameLPAREN	
input	TokenNameIdentifier	 input
,	TokenNameCOMMA	
K_FIRST	TokenNameIdentifier	 K  FIRST
,	TokenNameCOMMA	
FOLLOW_K_FIRST_in_selectExpression524	TokenNameIdentifier	 FOLLOW  K  FIRST in select Expression524
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
hasFirstSet	TokenNameIdentifier	 has First Set
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
cols	TokenNameIdentifier	 cols
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Token	TokenNameIdentifier	 Token
)	TokenNameRPAREN	
match	TokenNameIdentifier	 match
(	TokenNameLPAREN	
input	TokenNameIdentifier	 input
,	TokenNameCOMMA	
INTEGER	TokenNameIdentifier	 INTEGER
,	TokenNameCOMMA	
FOLLOW_INTEGER_in_selectExpression530	TokenNameIdentifier	 FOLLOW  INTEGER in select Expression530
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
count	TokenNameIdentifier	 count
=	TokenNameEQUAL	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
parseInt	TokenNameIdentifier	 parse Int
(	TokenNameLPAREN	
(	TokenNameLPAREN	
cols	TokenNameIdentifier	 cols
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
?	TokenNameQUESTION	
cols	TokenNameIdentifier	 cols
.	TokenNameDOT	
getText	TokenNameIdentifier	 get Text
(	TokenNameLPAREN	
)	TokenNameRPAREN	
:	TokenNameCOLON	
null	TokenNamenull	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql/Cql.g:184:7: ( K_REVERSED )? 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql/Cql.g:184:7: ( K_REVERSED )? 
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
LA8_0	TokenNameIdentifier	 L A8 0
==	TokenNameEQUAL_EQUAL	
K_REVERSED	TokenNameIdentifier	 K  REVERSED
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
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql/Cql.g:184:9: K_REVERSED 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql/Cql.g:184:9: K_REVERSED 
{	TokenNameLBRACE	
match	TokenNameIdentifier	 match
(	TokenNameLPAREN	
input	TokenNameIdentifier	 input
,	TokenNameCOMMA	
K_REVERSED	TokenNameIdentifier	 K  REVERSED
,	TokenNameCOMMA	
FOLLOW_K_REVERSED_in_selectExpression545	TokenNameIdentifier	 FOLLOW  K  REVERSED in select Expression545
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
reversed	TokenNameIdentifier	 reversed
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql/Cql.g:185:7: (first= term ( ',' next= term )* | start= term RANGEOP finish= term | '\\*' ) 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql/Cql.g:185:7: (first= term ( ',' next= term )* | start= term RANGEOP finish= term | '\\*' ) 
int	TokenNameint	
alt10	TokenNameIdentifier	 alt10
=	TokenNameEQUAL	
3	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
alt10	TokenNameIdentifier	 alt10
=	TokenNameEQUAL	
dfa10	TokenNameIdentifier	 dfa10
.	TokenNameDOT	
predict	TokenNameIdentifier	 predict
(	TokenNameLPAREN	
input	TokenNameIdentifier	 input
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
switch	TokenNameswitch	
(	TokenNameLPAREN	
alt10	TokenNameIdentifier	 alt10
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
1	TokenNameIntegerLiteral	
:	TokenNameCOLON	
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql/Cql.g:185:9: first= term ( ',' next= term )* 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql/Cql.g:185:9: first= term ( ',' next= term )* 
{	TokenNameLBRACE	
pushFollow	TokenNameIdentifier	 push Follow
(	TokenNameLPAREN	
FOLLOW_term_in_selectExpression562	TokenNameIdentifier	 FOLLOW term in select Expression562
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
first	TokenNameIdentifier	 first
=	TokenNameEQUAL	
term	TokenNameIdentifier	 term
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
_fsp	TokenNameIdentifier	 fsp
--	TokenNameMINUS_MINUS	
;	TokenNameSEMICOLON	
expr	TokenNameIdentifier	 expr
=	TokenNameEQUAL	
new	TokenNamenew	
SelectExpression	TokenNameIdentifier	 Select Expression
(	TokenNameLPAREN	
first	TokenNameIdentifier	 first
,	TokenNameCOMMA	
count	TokenNameIdentifier	 count
,	TokenNameCOMMA	
reversed	TokenNameIdentifier	 reversed
,	TokenNameCOMMA	
hasFirstSet	TokenNameIdentifier	 has First Set
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql/Cql.g:186:13: ( ',' next= term )* 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql/Cql.g:186:13: ( ',' next= term )* 
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
LA9_0	TokenNameIdentifier	 L A9 0
==	TokenNameEQUAL_EQUAL	
84	TokenNameIntegerLiteral	
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
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql/Cql.g:186:14: ',' next= term 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql/Cql.g:186:14: ',' next= term 
{	TokenNameLBRACE	
match	TokenNameIdentifier	 match
(	TokenNameLPAREN	
input	TokenNameIdentifier	 input
,	TokenNameCOMMA	
84	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
FOLLOW_84_in_selectExpression579	TokenNameIdentifier	 FOLLOW 84 in select Expression579
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
pushFollow	TokenNameIdentifier	 push Follow
(	TokenNameLPAREN	
FOLLOW_term_in_selectExpression583	TokenNameIdentifier	 FOLLOW term in select Expression583
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
next	TokenNameIdentifier	 next
=	TokenNameEQUAL	
term	TokenNameIdentifier	 term
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
_fsp	TokenNameIdentifier	 fsp
--	TokenNameMINUS_MINUS	
;	TokenNameSEMICOLON	
expr	TokenNameIdentifier	 expr
.	TokenNameDOT	
and	TokenNameIdentifier	 and
(	TokenNameLPAREN	
next	TokenNameIdentifier	 next
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
default	TokenNamedefault	
:	TokenNameCOLON	
break	TokenNamebreak	
loop9	TokenNameIdentifier	 loop9
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
while	TokenNamewhile	
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
2	TokenNameIntegerLiteral	
:	TokenNameCOLON	
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql/Cql.g:187:9: start= term RANGEOP finish= term 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql/Cql.g:187:9: start= term RANGEOP finish= term 
{	TokenNameLBRACE	
pushFollow	TokenNameIdentifier	 push Follow
(	TokenNameLPAREN	
FOLLOW_term_in_selectExpression599	TokenNameIdentifier	 FOLLOW term in select Expression599
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
start	TokenNameIdentifier	 start
=	TokenNameEQUAL	
term	TokenNameIdentifier	 term
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
_fsp	TokenNameIdentifier	 fsp
--	TokenNameMINUS_MINUS	
;	TokenNameSEMICOLON	
match	TokenNameIdentifier	 match
(	TokenNameLPAREN	
input	TokenNameIdentifier	 input
,	TokenNameCOMMA	
RANGEOP	TokenNameIdentifier	 RANGEOP
,	TokenNameCOMMA	
FOLLOW_RANGEOP_in_selectExpression601	TokenNameIdentifier	 FOLLOW  RANGEOP in select Expression601
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
pushFollow	TokenNameIdentifier	 push Follow
(	TokenNameLPAREN	
FOLLOW_term_in_selectExpression605	TokenNameIdentifier	 FOLLOW term in select Expression605
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
finish	TokenNameIdentifier	 finish
=	TokenNameEQUAL	
term	TokenNameIdentifier	 term
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
_fsp	TokenNameIdentifier	 fsp
--	TokenNameMINUS_MINUS	
;	TokenNameSEMICOLON	
expr	TokenNameIdentifier	 expr
=	TokenNameEQUAL	
new	TokenNamenew	
SelectExpression	TokenNameIdentifier	 Select Expression
(	TokenNameLPAREN	
start	TokenNameIdentifier	 start
,	TokenNameCOMMA	
finish	TokenNameIdentifier	 finish
,	TokenNameCOMMA	
count	TokenNameIdentifier	 count
,	TokenNameCOMMA	
reversed	TokenNameIdentifier	 reversed
,	TokenNameCOMMA	
false	TokenNamefalse	
,	TokenNameCOMMA	
hasFirstSet	TokenNameIdentifier	 has First Set
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
3	TokenNameIntegerLiteral	
:	TokenNameCOLON	
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql/Cql.g:188:9: '\\*' 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql/Cql.g:188:9: '\\*' 
{	TokenNameLBRACE	
match	TokenNameIdentifier	 match
(	TokenNameLPAREN	
input	TokenNameIdentifier	 input
,	TokenNameCOMMA	
85	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
FOLLOW_85_in_selectExpression617	TokenNameIdentifier	 FOLLOW 85 in select Expression617
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
expr	TokenNameIdentifier	 expr
=	TokenNameEQUAL	
new	TokenNamenew	
SelectExpression	TokenNameIdentifier	 Select Expression
(	TokenNameLPAREN	
new	TokenNamenew	
Term	TokenNameIdentifier	 Term
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
new	TokenNamenew	
Term	TokenNameIdentifier	 Term
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
count	TokenNameIdentifier	 count
,	TokenNameCOMMA	
reversed	TokenNameIdentifier	 reversed
,	TokenNameCOMMA	
true	TokenNametrue	
,	TokenNameCOMMA	
hasFirstSet	TokenNameIdentifier	 has First Set
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
RecognitionException	TokenNameIdentifier	 Recognition Exception
re	TokenNameIdentifier	 re
)	TokenNameRPAREN	
{	TokenNameLBRACE	
reportError	TokenNameIdentifier	 report Error
(	TokenNameLPAREN	
re	TokenNameIdentifier	 re
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
recover	TokenNameIdentifier	 recover
(	TokenNameLPAREN	
input	TokenNameIdentifier	 input
,	TokenNameCOMMA	
re	TokenNameIdentifier	 re
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
finally	TokenNamefinally	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
expr	TokenNameIdentifier	 expr
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// $ANTLR end "selectExpression" 	TokenNameCOMMENT_LINE	$ANTLR end "selectExpression" 
// $ANTLR start "whereClause" 	TokenNameCOMMENT_LINE	$ANTLR start "whereClause" 
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql/Cql.g:193:1: whereClause returns [WhereClause clause] : (first= relation ( K_AND next= relation )* | key_alias= term K_IN '(' f1= term ( ',' fN= term )* ')' ); 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql/Cql.g:193:1: whereClause returns [WhereClause clause] : (first= relation ( K_AND next= relation )* | key_alias= term K_IN '(' f1= term ( ',' fN= term )* ')' ); 
public	TokenNamepublic	
final	TokenNamefinal	
WhereClause	TokenNameIdentifier	 Where Clause
whereClause	TokenNameIdentifier	 where Clause
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
RecognitionException	TokenNameIdentifier	 Recognition Exception
{	TokenNameLBRACE	
WhereClause	TokenNameIdentifier	 Where Clause
clause	TokenNameIdentifier	 clause
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
Relation	TokenNameIdentifier	 Relation
first	TokenNameIdentifier	 first
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
Relation	TokenNameIdentifier	 Relation
next	TokenNameIdentifier	 next
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
Term	TokenNameIdentifier	 Term
key_alias	TokenNameIdentifier	 key alias
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
Term	TokenNameIdentifier	 Term
f1	TokenNameIdentifier	 f1
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
Term	TokenNameIdentifier	 Term
fN	TokenNameIdentifier	 f N
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
WhereClause	TokenNameIdentifier	 Where Clause
inClause	TokenNameIdentifier	 in Clause
=	TokenNameEQUAL	
new	TokenNamenew	
WhereClause	TokenNameIdentifier	 Where Clause
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql/Cql.g:197:5: (first= relation ( K_AND next= relation )* | key_alias= term K_IN '(' f1= term ( ',' fN= term )* ')' ) 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql/Cql.g:197:5: (first= relation ( K_AND next= relation )* | key_alias= term K_IN '(' f1= term ( ',' fN= term )* ')' ) 
int	TokenNameint	
alt13	TokenNameIdentifier	 alt13
=	TokenNameEQUAL	
2	TokenNameIntegerLiteral	
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
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql/Cql.g:197:7: first= relation ( K_AND next= relation )* 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql/Cql.g:197:7: first= relation ( K_AND next= relation )* 
{	TokenNameLBRACE	
pushFollow	TokenNameIdentifier	 push Follow
(	TokenNameLPAREN	
FOLLOW_relation_in_whereClause660	TokenNameIdentifier	 FOLLOW relation in where Clause660
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
first	TokenNameIdentifier	 first
=	TokenNameEQUAL	
relation	TokenNameIdentifier	 relation
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
_fsp	TokenNameIdentifier	 fsp
--	TokenNameMINUS_MINUS	
;	TokenNameSEMICOLON	
clause	TokenNameIdentifier	 clause
=	TokenNameEQUAL	
new	TokenNamenew	
WhereClause	TokenNameIdentifier	 Where Clause
(	TokenNameLPAREN	
first	TokenNameIdentifier	 first
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql/Cql.g:198:11: ( K_AND next= relation )* 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql/Cql.g:198:11: ( K_AND next= relation )* 
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
K_AND	TokenNameIdentifier	 K  AND
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
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql/Cql.g:198:12: K_AND next= relation 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql/Cql.g:198:12: K_AND next= relation 
{	TokenNameLBRACE	
match	TokenNameIdentifier	 match
(	TokenNameLPAREN	
input	TokenNameIdentifier	 input
,	TokenNameCOMMA	
K_AND	TokenNameIdentifier	 K  AND
,	TokenNameCOMMA	
FOLLOW_K_AND_in_whereClause676	TokenNameIdentifier	 FOLLOW  K  AND in where Clause676
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
pushFollow	TokenNameIdentifier	 push Follow
(	TokenNameLPAREN	
FOLLOW_relation_in_whereClause680	TokenNameIdentifier	 FOLLOW relation in where Clause680
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
next	TokenNameIdentifier	 next
=	TokenNameEQUAL	
relation	TokenNameIdentifier	 relation
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
_fsp	TokenNameIdentifier	 fsp
--	TokenNameMINUS_MINUS	
;	TokenNameSEMICOLON	
clause	TokenNameIdentifier	 clause
.	TokenNameDOT	
and	TokenNameIdentifier	 and
(	TokenNameLPAREN	
next	TokenNameIdentifier	 next
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
}	TokenNameRBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
2	TokenNameIntegerLiteral	
:	TokenNameCOLON	
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql/Cql.g:199:9: key_alias= term K_IN '(' f1= term ( ',' fN= term )* ')' 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql/Cql.g:199:9: key_alias= term K_IN '(' f1= term ( ',' fN= term )* ')' 
{	TokenNameLBRACE	
pushFollow	TokenNameIdentifier	 push Follow
(	TokenNameLPAREN	
FOLLOW_term_in_whereClause696	TokenNameIdentifier	 FOLLOW term in where Clause696
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
key_alias	TokenNameIdentifier	 key alias
=	TokenNameEQUAL	
term	TokenNameIdentifier	 term
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
_fsp	TokenNameIdentifier	 fsp
--	TokenNameMINUS_MINUS	
;	TokenNameSEMICOLON	
inClause	TokenNameIdentifier	 in Clause
.	TokenNameDOT	
setKeyAlias	TokenNameIdentifier	 set Key Alias
(	TokenNameLPAREN	
key_alias	TokenNameIdentifier	 key alias
.	TokenNameDOT	
getText	TokenNameIdentifier	 get Text
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
match	TokenNameIdentifier	 match
(	TokenNameLPAREN	
input	TokenNameIdentifier	 input
,	TokenNameCOMMA	
K_IN	TokenNameIdentifier	 K  IN
,	TokenNameCOMMA	
FOLLOW_K_IN_in_whereClause711	TokenNameIdentifier	 FOLLOW  K  IN in where Clause711
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
match	TokenNameIdentifier	 match
(	TokenNameLPAREN	
input	TokenNameIdentifier	 input
,	TokenNameCOMMA	
81	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
FOLLOW_81_in_whereClause713	TokenNameIdentifier	 FOLLOW 81 in where Clause713
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
pushFollow	TokenNameIdentifier	 push Follow
(	TokenNameLPAREN	
FOLLOW_term_in_whereClause717	TokenNameIdentifier	 FOLLOW term in where Clause717
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
f1	TokenNameIdentifier	 f1
=	TokenNameEQUAL	
term	TokenNameIdentifier	 term
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
_fsp	TokenNameIdentifier	 fsp
--	TokenNameMINUS_MINUS	
;	TokenNameSEMICOLON	
inClause	TokenNameIdentifier	 in Clause
.	TokenNameDOT	
andKeyEquals	TokenNameIdentifier	 and Key Equals
(	TokenNameLPAREN	
f1	TokenNameIdentifier	 f1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql/Cql.g:201:19: ( ',' fN= term )* 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql/Cql.g:201:19: ( ',' fN= term )* 
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
84	TokenNameIntegerLiteral	
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
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql/Cql.g:201:20: ',' fN= term 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql/Cql.g:201:20: ',' fN= term 
{	TokenNameLBRACE	
match	TokenNameIdentifier	 match
(	TokenNameLPAREN	
input	TokenNameIdentifier	 input
,	TokenNameCOMMA	
84	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
FOLLOW_84_in_whereClause740	TokenNameIdentifier	 FOLLOW 84 in where Clause740
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
pushFollow	TokenNameIdentifier	 push Follow
(	TokenNameLPAREN	
FOLLOW_term_in_whereClause744	TokenNameIdentifier	 FOLLOW term in where Clause744
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fN	TokenNameIdentifier	 f N
=	TokenNameEQUAL	
term	TokenNameIdentifier	 term
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
_fsp	TokenNameIdentifier	 fsp
--	TokenNameMINUS_MINUS	
;	TokenNameSEMICOLON	
inClause	TokenNameIdentifier	 in Clause
.	TokenNameDOT	
andKeyEquals	TokenNameIdentifier	 and Key Equals
(	TokenNameLPAREN	
fN	TokenNameIdentifier	 f N
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
input	TokenNameIdentifier	 input
,	TokenNameCOMMA	
82	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
FOLLOW_82_in_whereClause751	TokenNameIdentifier	 FOLLOW 82 in where Clause751
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
inClause	TokenNameIdentifier	 in Clause
.	TokenNameDOT	
setMultiKey	TokenNameIdentifier	 set Multi Key
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
clause	TokenNameIdentifier	 clause
=	TokenNameEQUAL	
inClause	TokenNameIdentifier	 in Clause
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
RecognitionException	TokenNameIdentifier	 Recognition Exception
re	TokenNameIdentifier	 re
)	TokenNameRPAREN	
{	TokenNameLBRACE	
reportError	TokenNameIdentifier	 report Error
(	TokenNameLPAREN	
re	TokenNameIdentifier	 re
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
recover	TokenNameIdentifier	 recover
(	TokenNameLPAREN	
input	TokenNameIdentifier	 input
,	TokenNameCOMMA	
re	TokenNameIdentifier	 re
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
finally	TokenNamefinally	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
clause	TokenNameIdentifier	 clause
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// $ANTLR end "whereClause" 	TokenNameCOMMENT_LINE	$ANTLR end "whereClause" 
// $ANTLR start "insertStatement" 	TokenNameCOMMENT_LINE	$ANTLR start "insertStatement" 
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql/Cql.g:205:1: insertStatement returns [UpdateStatement expr] : K_INSERT K_INTO (keyspace= ( IDENT | STRING_LITERAL | INTEGER ) '.' )? columnFamily= ( IDENT | STRING_LITERAL | INTEGER ) '(' key_alias= term ( ',' column_name= term )+ ')' K_VALUES '(' key= term ( ',' column_value= term )+ ')' ( usingClause[attrs] )? ; 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql/Cql.g:205:1: insertStatement returns [UpdateStatement expr] : K_INSERT K_INTO (keyspace= ( IDENT | STRING_LITERAL | INTEGER ) '.' )? columnFamily= ( IDENT | STRING_LITERAL | INTEGER ) '(' key_alias= term ( ',' column_name= term )+ ')' K_VALUES '(' key= term ( ',' column_value= term )+ ')' ( usingClause[attrs] )? ; 
public	TokenNamepublic	
final	TokenNamefinal	
UpdateStatement	TokenNameIdentifier	 Update Statement
insertStatement	TokenNameIdentifier	 insert Statement
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
RecognitionException	TokenNameIdentifier	 Recognition Exception
{	TokenNameLBRACE	
UpdateStatement	TokenNameIdentifier	 Update Statement
expr	TokenNameIdentifier	 expr
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
Token	TokenNameIdentifier	 Token
keyspace	TokenNameIdentifier	 keyspace
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
Token	TokenNameIdentifier	 Token
columnFamily	TokenNameIdentifier	 column Family
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
Term	TokenNameIdentifier	 Term
key_alias	TokenNameIdentifier	 key alias
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
Term	TokenNameIdentifier	 Term
column_name	TokenNameIdentifier	 column name
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
Term	TokenNameIdentifier	 Term
key	TokenNameIdentifier	 key
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
Term	TokenNameIdentifier	 Term
column_value	TokenNameIdentifier	 column value
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql/Cql.g:219:5: ( K_INSERT K_INTO (keyspace= ( IDENT | STRING_LITERAL | INTEGER ) '.' )? columnFamily= ( IDENT | STRING_LITERAL | INTEGER ) '(' key_alias= term ( ',' column_name= term )+ ')' K_VALUES '(' key= term ( ',' column_value= term )+ ')' ( usingClause[attrs] )? ) 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql/Cql.g:219:5: ( K_INSERT K_INTO (keyspace= ( IDENT | STRING_LITERAL | INTEGER ) '.' )? columnFamily= ( IDENT | STRING_LITERAL | INTEGER ) '(' key_alias= term ( ',' column_name= term )+ ')' K_VALUES '(' key= term ( ',' column_value= term )+ ')' ( usingClause[attrs] )? ) 
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql/Cql.g:219:7: K_INSERT K_INTO (keyspace= ( IDENT | STRING_LITERAL | INTEGER ) '.' )? columnFamily= ( IDENT | STRING_LITERAL | INTEGER ) '(' key_alias= term ( ',' column_name= term )+ ')' K_VALUES '(' key= term ( ',' column_value= term )+ ')' ( usingClause[attrs] )? 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql/Cql.g:219:7: K_INSERT K_INTO (keyspace= ( IDENT | STRING_LITERAL | INTEGER ) '.' )? columnFamily= ( IDENT | STRING_LITERAL | INTEGER ) '(' key_alias= term ( ',' column_name= term )+ ')' K_VALUES '(' key= term ( ',' column_value= term )+ ')' ( usingClause[attrs] )? 
{	TokenNameLBRACE	
Attributes	TokenNameIdentifier	 Attributes
attrs	TokenNameIdentifier	 attrs
=	TokenNameEQUAL	
new	TokenNamenew	
Attributes	TokenNameIdentifier	 Attributes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
Term	TokenNameIdentifier	 Term
>	TokenNameGREATER	
columnNames	TokenNameIdentifier	 column Names
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
Term	TokenNameIdentifier	 Term
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
Term	TokenNameIdentifier	 Term
>	TokenNameGREATER	
columnValues	TokenNameIdentifier	 column Values
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
Term	TokenNameIdentifier	 Term
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
match	TokenNameIdentifier	 match
(	TokenNameLPAREN	
input	TokenNameIdentifier	 input
,	TokenNameCOMMA	
K_INSERT	TokenNameIdentifier	 K  INSERT
,	TokenNameCOMMA	
FOLLOW_K_INSERT_in_insertStatement792	TokenNameIdentifier	 FOLLOW  K  INSERT in insert Statement792
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
match	TokenNameIdentifier	 match
(	TokenNameLPAREN	
input	TokenNameIdentifier	 input
,	TokenNameCOMMA	
K_INTO	TokenNameIdentifier	 K  INTO
,	TokenNameCOMMA	
FOLLOW_K_INTO_in_insertStatement794	TokenNameIdentifier	 FOLLOW  K  INTO in insert Statement794
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql/Cql.g:225:23: (keyspace= ( IDENT | STRING_LITERAL | INTEGER ) '.' )? 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql/Cql.g:225:23: (keyspace= ( IDENT | STRING_LITERAL | INTEGER ) '.' )? 
int	TokenNameint	
alt14	TokenNameIdentifier	 alt14
=	TokenNameEQUAL	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
LA14_0	TokenNameIdentifier	 L A14 0
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
LA14_0	TokenNameIdentifier	 L A14 0
>=	TokenNameGREATER_EQUAL	
IDENT	TokenNameIdentifier	 IDENT
&&	TokenNameAND_AND	
LA14_0	TokenNameIdentifier	 L A14 0
<=	TokenNameLESS_EQUAL	
STRING_LITERAL	TokenNameIdentifier	 STRING  LITERAL
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
LA14_1	TokenNameIdentifier	 L A14 1
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
LA14_1	TokenNameIdentifier	 L A14 1
==	TokenNameEQUAL_EQUAL	
83	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
alt14	TokenNameIdentifier	 alt14
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
switch	TokenNameswitch	
(	TokenNameLPAREN	
alt14	TokenNameIdentifier	 alt14
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
1	TokenNameIntegerLiteral	
:	TokenNameCOLON	
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql/Cql.g:225:24: keyspace= ( IDENT | STRING_LITERAL | INTEGER ) '.' 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql/Cql.g:225:24: keyspace= ( IDENT | STRING_LITERAL | INTEGER ) '.' 
{	TokenNameLBRACE	
keyspace	TokenNameIdentifier	 keyspace
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Token	TokenNameIdentifier	 Token
)	TokenNameRPAREN	
input	TokenNameIdentifier	 input
.	TokenNameDOT	
LT	TokenNameIdentifier	 LT
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
IDENT	TokenNameIdentifier	 IDENT
&&	TokenNameAND_AND	
input	TokenNameIdentifier	 input
.	TokenNameDOT	
LA	TokenNameIdentifier	 LA
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
<=	TokenNameLESS_EQUAL	
STRING_LITERAL	TokenNameIdentifier	 STRING  LITERAL
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
input	TokenNameIdentifier	 input
.	TokenNameDOT	
consume	TokenNameIdentifier	 consume
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
errorRecovery	TokenNameIdentifier	 error Recovery
=	TokenNameEQUAL	
false	TokenNamefalse	
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
throw	TokenNamethrow	
mse	TokenNameIdentifier	 mse
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
match	TokenNameIdentifier	 match
(	TokenNameLPAREN	
input	TokenNameIdentifier	 input
,	TokenNameCOMMA	
83	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
FOLLOW_83_in_insertStatement811	TokenNameIdentifier	 FOLLOW 83 in insert Statement811
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
columnFamily	TokenNameIdentifier	 column Family
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Token	TokenNameIdentifier	 Token
)	TokenNameRPAREN	
input	TokenNameIdentifier	 input
.	TokenNameDOT	
LT	TokenNameIdentifier	 LT
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
IDENT	TokenNameIdentifier	 IDENT
&&	TokenNameAND_AND	
input	TokenNameIdentifier	 input
.	TokenNameDOT	
LA	TokenNameIdentifier	 LA
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
<=	TokenNameLESS_EQUAL	
STRING_LITERAL	TokenNameIdentifier	 STRING  LITERAL
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
input	TokenNameIdentifier	 input
.	TokenNameDOT	
consume	TokenNameIdentifier	 consume
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
errorRecovery	TokenNameIdentifier	 error Recovery
=	TokenNameEQUAL	
false	TokenNamefalse	
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
throw	TokenNamethrow	
mse	TokenNameIdentifier	 mse
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
match	TokenNameIdentifier	 match
(	TokenNameLPAREN	
input	TokenNameIdentifier	 input
,	TokenNameCOMMA	
81	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
FOLLOW_81_in_insertStatement841	TokenNameIdentifier	 FOLLOW 81 in insert Statement841
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
pushFollow	TokenNameIdentifier	 push Follow
(	TokenNameLPAREN	
FOLLOW_term_in_insertStatement845	TokenNameIdentifier	 FOLLOW term in insert Statement845
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
key_alias	TokenNameIdentifier	 key alias
=	TokenNameEQUAL	
term	TokenNameIdentifier	 term
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
_fsp	TokenNameIdentifier	 fsp
--	TokenNameMINUS_MINUS	
;	TokenNameSEMICOLON	
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql/Cql.g:226:30: ( ',' column_name= term )+ 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql/Cql.g:226:30: ( ',' column_name= term )+ 
int	TokenNameint	
cnt15	TokenNameIdentifier	 cnt15
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
loop15	TokenNameIdentifier	 loop15
:	TokenNameCOLON	
do	TokenNamedo	
{	TokenNameLBRACE	
int	TokenNameint	
alt15	TokenNameIdentifier	 alt15
=	TokenNameEQUAL	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
LA15_0	TokenNameIdentifier	 L A15 0
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
LA15_0	TokenNameIdentifier	 L A15 0
==	TokenNameEQUAL_EQUAL	
84	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
alt15	TokenNameIdentifier	 alt15
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
switch	TokenNameswitch	
(	TokenNameLPAREN	
alt15	TokenNameIdentifier	 alt15
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
1	TokenNameIntegerLiteral	
:	TokenNameCOLON	
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql/Cql.g:226:32: ',' column_name= term 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql/Cql.g:226:32: ',' column_name= term 
{	TokenNameLBRACE	
match	TokenNameIdentifier	 match
(	TokenNameLPAREN	
input	TokenNameIdentifier	 input
,	TokenNameCOMMA	
84	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
FOLLOW_84_in_insertStatement849	TokenNameIdentifier	 FOLLOW 84 in insert Statement849
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
pushFollow	TokenNameIdentifier	 push Follow
(	TokenNameLPAREN	
FOLLOW_term_in_insertStatement853	TokenNameIdentifier	 FOLLOW term in insert Statement853
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
column_name	TokenNameIdentifier	 column name
=	TokenNameEQUAL	
term	TokenNameIdentifier	 term
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
_fsp	TokenNameIdentifier	 fsp
--	TokenNameMINUS_MINUS	
;	TokenNameSEMICOLON	
columnNames	TokenNameIdentifier	 column Names
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
column_name	TokenNameIdentifier	 column name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
default	TokenNamedefault	
:	TokenNameCOLON	
if	TokenNameif	
(	TokenNameLPAREN	
cnt15	TokenNameIdentifier	 cnt15
>=	TokenNameGREATER_EQUAL	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
break	TokenNamebreak	
loop15	TokenNameIdentifier	 loop15
;	TokenNameSEMICOLON	
EarlyExitException	TokenNameIdentifier	 Early Exit Exception
eee	TokenNameIdentifier	 eee
=	TokenNameEQUAL	
new	TokenNamenew	
EarlyExitException	TokenNameIdentifier	 Early Exit Exception
(	TokenNameLPAREN	
15	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
input	TokenNameIdentifier	 input
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
throw	TokenNamethrow	
eee	TokenNameIdentifier	 eee
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
cnt15	TokenNameIdentifier	 cnt15
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
while	TokenNamewhile	
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
match	TokenNameIdentifier	 match
(	TokenNameLPAREN	
input	TokenNameIdentifier	 input
,	TokenNameCOMMA	
82	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
FOLLOW_82_in_insertStatement861	TokenNameIdentifier	 FOLLOW 82 in insert Statement861
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
match	TokenNameIdentifier	 match
(	TokenNameLPAREN	
input	TokenNameIdentifier	 input
,	TokenNameCOMMA	
K_VALUES	TokenNameIdentifier	 K  VALUES
,	TokenNameCOMMA	
FOLLOW_K_VALUES_in_insertStatement871	TokenNameIdentifier	 FOLLOW  K  VALUES in insert Statement871
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
match	TokenNameIdentifier	 match
(	TokenNameLPAREN	
input	TokenNameIdentifier	 input
,	TokenNameCOMMA	
81	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
FOLLOW_81_in_insertStatement883	TokenNameIdentifier	 FOLLOW 81 in insert Statement883
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
pushFollow	TokenNameIdentifier	 push Follow
(	TokenNameLPAREN	
FOLLOW_term_in_insertStatement887	TokenNameIdentifier	 FOLLOW term in insert Statement887
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
key	TokenNameIdentifier	 key
=	TokenNameEQUAL	
term	TokenNameIdentifier	 term
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
_fsp	TokenNameIdentifier	 fsp
--	TokenNameMINUS_MINUS	
;	TokenNameSEMICOLON	
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql/Cql.g:228:24: ( ',' column_value= term )+ 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql/Cql.g:228:24: ( ',' column_value= term )+ 
int	TokenNameint	
cnt16	TokenNameIdentifier	 cnt16
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
loop16	TokenNameIdentifier	 loop16
:	TokenNameCOLON	
do	TokenNamedo	
{	TokenNameLBRACE	
int	TokenNameint	
alt16	TokenNameIdentifier	 alt16
=	TokenNameEQUAL	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
LA16_0	TokenNameIdentifier	 L A16 0
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
LA16_0	TokenNameIdentifier	 L A16 0
==	TokenNameEQUAL_EQUAL	
84	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
alt16	TokenNameIdentifier	 alt16
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
switch	TokenNameswitch	
(	TokenNameLPAREN	
alt16	TokenNameIdentifier	 alt16
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
1	TokenNameIntegerLiteral	
:	TokenNameCOLON	
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql/Cql.g:228:26: ',' column_value= term 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql/Cql.g:228:26: ',' column_value= term 
{	TokenNameLBRACE	
match	TokenNameIdentifier	 match
(	TokenNameLPAREN	
input	TokenNameIdentifier	 input
,	TokenNameCOMMA	
84	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
FOLLOW_84_in_insertStatement891	TokenNameIdentifier	 FOLLOW 84 in insert Statement891
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
pushFollow	TokenNameIdentifier	 push Follow
(	TokenNameLPAREN	
FOLLOW_term_in_insertStatement895	TokenNameIdentifier	 FOLLOW term in insert Statement895
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
column_value	TokenNameIdentifier	 column value
=	TokenNameEQUAL	
term	TokenNameIdentifier	 term
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
_fsp	TokenNameIdentifier	 fsp
--	TokenNameMINUS_MINUS	
;	TokenNameSEMICOLON	
columnValues	TokenNameIdentifier	 column Values
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
column_value	TokenNameIdentifier	 column value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
default	TokenNamedefault	
:	TokenNameCOLON	
if	TokenNameif	
(	TokenNameLPAREN	
cnt16	TokenNameIdentifier	 cnt16
>=	TokenNameGREATER_EQUAL	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
break	TokenNamebreak	
loop16	TokenNameIdentifier	 loop16
;	TokenNameSEMICOLON	
EarlyExitException	TokenNameIdentifier	 Early Exit Exception
eee	TokenNameIdentifier	 eee
=	TokenNameEQUAL	
new	TokenNamenew	
EarlyExitException	TokenNameIdentifier	 Early Exit Exception
(	TokenNameLPAREN	
16	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
input	TokenNameIdentifier	 input
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
throw	TokenNamethrow	
eee	TokenNameIdentifier	 eee
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
cnt16	TokenNameIdentifier	 cnt16
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
while	TokenNamewhile	
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
match	TokenNameIdentifier	 match
(	TokenNameLPAREN	
input	TokenNameIdentifier	 input
,	TokenNameCOMMA	
82	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
FOLLOW_82_in_insertStatement901	TokenNameIdentifier	 FOLLOW 82 in insert Statement901
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql/Cql.g:229:9: ( usingClause[attrs] )? 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql/Cql.g:229:9: ( usingClause[attrs] )? 
int	TokenNameint	
alt17	TokenNameIdentifier	 alt17
=	TokenNameEQUAL	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
LA17_0	TokenNameIdentifier	 L A17 0
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
LA17_0	TokenNameIdentifier	 L A17 0
==	TokenNameEQUAL_EQUAL	
K_USING	TokenNameIdentifier	 K  USING
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
alt17	TokenNameIdentifier	 alt17
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
switch	TokenNameswitch	
(	TokenNameLPAREN	
alt17	TokenNameIdentifier	 alt17
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
1	TokenNameIntegerLiteral	
:	TokenNameCOLON	
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql/Cql.g:229:11: usingClause[attrs] 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql/Cql.g:229:11: usingClause[attrs] 
{	TokenNameLBRACE	
pushFollow	TokenNameIdentifier	 push Follow
(	TokenNameLPAREN	
FOLLOW_usingClause_in_insertStatement913	TokenNameIdentifier	 FOLLOW using Clause in insert Statement913
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
usingClause	TokenNameIdentifier	 using Clause
(	TokenNameLPAREN	
attrs	TokenNameIdentifier	 attrs
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
_fsp	TokenNameIdentifier	 fsp
--	TokenNameMINUS_MINUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
new	TokenNamenew	
UpdateStatement	TokenNameIdentifier	 Update Statement
(	TokenNameLPAREN	
(	TokenNameLPAREN	
keyspace	TokenNameIdentifier	 keyspace
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
?	TokenNameQUESTION	
keyspace	TokenNameIdentifier	 keyspace
.	TokenNameDOT	
getText	TokenNameIdentifier	 get Text
(	TokenNameLPAREN	
)	TokenNameRPAREN	
:	TokenNameCOLON	
null	TokenNamenull	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
(	TokenNameLPAREN	
columnFamily	TokenNameIdentifier	 column Family
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
?	TokenNameQUESTION	
columnFamily	TokenNameIdentifier	 column Family
.	TokenNameDOT	
getText	TokenNameIdentifier	 get Text
(	TokenNameLPAREN	
)	TokenNameRPAREN	
:	TokenNameCOLON	
null	TokenNamenull	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
key_alias	TokenNameIdentifier	 key alias
.	TokenNameDOT	
getText	TokenNameIdentifier	 get Text
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
columnNames	TokenNameIdentifier	 column Names
,	TokenNameCOMMA	
columnValues	TokenNameIdentifier	 column Values
,	TokenNameCOMMA	
Collections	TokenNameIdentifier	 Collections
.	TokenNameDOT	
singletonList	TokenNameIdentifier	 singleton List
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
,	TokenNameCOMMA	
attrs	TokenNameIdentifier	 attrs
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
RecognitionException	TokenNameIdentifier	 Recognition Exception
re	TokenNameIdentifier	 re
)	TokenNameRPAREN	
{	TokenNameLBRACE	
reportError	TokenNameIdentifier	 report Error
(	TokenNameLPAREN	
re	TokenNameIdentifier	 re
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
recover	TokenNameIdentifier	 recover
(	TokenNameLPAREN	
input	TokenNameIdentifier	 input
,	TokenNameCOMMA	
re	TokenNameIdentifier	 re
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
finally	TokenNamefinally	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
expr	TokenNameIdentifier	 expr
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// $ANTLR end "insertStatement" 	TokenNameCOMMENT_LINE	$ANTLR end "insertStatement" 
// $ANTLR start "usingClause" 	TokenNameCOMMENT_LINE	$ANTLR start "usingClause" 
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql/Cql.g:235:1: usingClause[Attributes attrs] : K_USING usingClauseObjective[attrs] ( ( K_AND )? usingClauseObjective[attrs] )* ; 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql/Cql.g:235:1: usingClause[Attributes attrs] : K_USING usingClauseObjective[attrs] ( ( K_AND )? usingClauseObjective[attrs] )* ; 
public	TokenNamepublic	
final	TokenNamefinal	
void	TokenNamevoid	
usingClause	TokenNameIdentifier	 using Clause
(	TokenNameLPAREN	
Attributes	TokenNameIdentifier	 Attributes
attrs	TokenNameIdentifier	 attrs
)	TokenNameRPAREN	
throws	TokenNamethrows	
RecognitionException	TokenNameIdentifier	 Recognition Exception
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql/Cql.g:236:5: ( K_USING usingClauseObjective[attrs] ( ( K_AND )? usingClauseObjective[attrs] )* ) 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql/Cql.g:236:5: ( K_USING usingClauseObjective[attrs] ( ( K_AND )? usingClauseObjective[attrs] )* ) 
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql/Cql.g:236:7: K_USING usingClauseObjective[attrs] ( ( K_AND )? usingClauseObjective[attrs] )* 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql/Cql.g:236:7: K_USING usingClauseObjective[attrs] ( ( K_AND )? usingClauseObjective[attrs] )* 
{	TokenNameLBRACE	
match	TokenNameIdentifier	 match
(	TokenNameLPAREN	
input	TokenNameIdentifier	 input
,	TokenNameCOMMA	
K_USING	TokenNameIdentifier	 K  USING
,	TokenNameCOMMA	
FOLLOW_K_USING_in_usingClause943	TokenNameIdentifier	 FOLLOW  K  USING in using Clause943
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
pushFollow	TokenNameIdentifier	 push Follow
(	TokenNameLPAREN	
FOLLOW_usingClauseObjective_in_usingClause945	TokenNameIdentifier	 FOLLOW using Clause Objective in using Clause945
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
usingClauseObjective	TokenNameIdentifier	 using Clause Objective
(	TokenNameLPAREN	
attrs	TokenNameIdentifier	 attrs
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
_fsp	TokenNameIdentifier	 fsp
--	TokenNameMINUS_MINUS	
;	TokenNameSEMICOLON	
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql/Cql.g:236:43: ( ( K_AND )? usingClauseObjective[attrs] )* 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql/Cql.g:236:43: ( ( K_AND )? usingClauseObjective[attrs] )* 
loop19	TokenNameIdentifier	 loop19
:	TokenNameCOLON	
do	TokenNamedo	
{	TokenNameLBRACE	
int	TokenNameint	
alt19	TokenNameIdentifier	 alt19
=	TokenNameEQUAL	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
LA19_0	TokenNameIdentifier	 L A19 0
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
LA19_0	TokenNameIdentifier	 L A19 0
==	TokenNameEQUAL_EQUAL	
K_CONSISTENCY	TokenNameIdentifier	 K  CONSISTENCY
||	TokenNameOR_OR	
LA19_0	TokenNameIdentifier	 L A19 0
==	TokenNameEQUAL_EQUAL	
K_AND	TokenNameIdentifier	 K  AND
||	TokenNameOR_OR	
(	TokenNameLPAREN	
LA19_0	TokenNameIdentifier	 L A19 0
>=	TokenNameGREATER_EQUAL	
K_TIMESTAMP	TokenNameIdentifier	 K  TIMESTAMP
&&	TokenNameAND_AND	
LA19_0	TokenNameIdentifier	 L A19 0
<=	TokenNameLESS_EQUAL	
K_TTL	TokenNameIdentifier	 K  TTL
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
alt19	TokenNameIdentifier	 alt19
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
switch	TokenNameswitch	
(	TokenNameLPAREN	
alt19	TokenNameIdentifier	 alt19
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
1	TokenNameIntegerLiteral	
:	TokenNameCOLON	
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql/Cql.g:236:45: ( K_AND )? usingClauseObjective[attrs] 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql/Cql.g:236:45: ( K_AND )? usingClauseObjective[attrs] 
{	TokenNameLBRACE	
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql/Cql.g:236:45: ( K_AND )? 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql/Cql.g:236:45: ( K_AND )? 
int	TokenNameint	
alt18	TokenNameIdentifier	 alt18
=	TokenNameEQUAL	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
LA18_0	TokenNameIdentifier	 L A18 0
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
LA18_0	TokenNameIdentifier	 L A18 0
==	TokenNameEQUAL_EQUAL	
K_AND	TokenNameIdentifier	 K  AND
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
alt18	TokenNameIdentifier	 alt18
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
switch	TokenNameswitch	
(	TokenNameLPAREN	
alt18	TokenNameIdentifier	 alt18
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
1	TokenNameIntegerLiteral	
:	TokenNameCOLON	
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql/Cql.g:236:45: K_AND 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql/Cql.g:236:45: K_AND 
{	TokenNameLBRACE	
match	TokenNameIdentifier	 match
(	TokenNameLPAREN	
input	TokenNameIdentifier	 input
,	TokenNameCOMMA	
K_AND	TokenNameIdentifier	 K  AND
,	TokenNameCOMMA	
FOLLOW_K_AND_in_usingClause950	TokenNameIdentifier	 FOLLOW  K  AND in using Clause950
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
pushFollow	TokenNameIdentifier	 push Follow
(	TokenNameLPAREN	
FOLLOW_usingClauseObjective_in_usingClause953	TokenNameIdentifier	 FOLLOW using Clause Objective in using Clause953
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
usingClauseObjective	TokenNameIdentifier	 using Clause Objective
(	TokenNameLPAREN	
attrs	TokenNameIdentifier	 attrs
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
_fsp	TokenNameIdentifier	 fsp
--	TokenNameMINUS_MINUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
default	TokenNamedefault	
:	TokenNameCOLON	
break	TokenNamebreak	
loop19	TokenNameIdentifier	 loop19
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
while	TokenNamewhile	
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
RecognitionException	TokenNameIdentifier	 Recognition Exception
re	TokenNameIdentifier	 re
)	TokenNameRPAREN	
{	TokenNameLBRACE	
reportError	TokenNameIdentifier	 report Error
(	TokenNameLPAREN	
re	TokenNameIdentifier	 re
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
recover	TokenNameIdentifier	 recover
(	TokenNameLPAREN	
input	TokenNameIdentifier	 input
,	TokenNameCOMMA	
re	TokenNameIdentifier	 re
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
finally	TokenNamefinally	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// $ANTLR end "usingClause" 	TokenNameCOMMENT_LINE	$ANTLR end "usingClause" 
// $ANTLR start "usingClauseDelete" 	TokenNameCOMMENT_LINE	$ANTLR start "usingClauseDelete" 
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql/Cql.g:239:1: usingClauseDelete[Attributes attrs] : K_USING usingClauseDeleteObjective[attrs] ( ( K_AND )? usingClauseDeleteObjective[attrs] )* ; 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql/Cql.g:239:1: usingClauseDelete[Attributes attrs] : K_USING usingClauseDeleteObjective[attrs] ( ( K_AND )? usingClauseDeleteObjective[attrs] )* ; 
public	TokenNamepublic	
final	TokenNamefinal	
void	TokenNamevoid	
usingClauseDelete	TokenNameIdentifier	 using Clause Delete
(	TokenNameLPAREN	
Attributes	TokenNameIdentifier	 Attributes
attrs	TokenNameIdentifier	 attrs
)	TokenNameRPAREN	
throws	TokenNamethrows	
RecognitionException	TokenNameIdentifier	 Recognition Exception
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql/Cql.g:240:5: ( K_USING usingClauseDeleteObjective[attrs] ( ( K_AND )? usingClauseDeleteObjective[attrs] )* ) 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql/Cql.g:240:5: ( K_USING usingClauseDeleteObjective[attrs] ( ( K_AND )? usingClauseDeleteObjective[attrs] )* ) 
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql/Cql.g:240:7: K_USING usingClauseDeleteObjective[attrs] ( ( K_AND )? usingClauseDeleteObjective[attrs] )* 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql/Cql.g:240:7: K_USING usingClauseDeleteObjective[attrs] ( ( K_AND )? usingClauseDeleteObjective[attrs] )* 
{	TokenNameLBRACE	
match	TokenNameIdentifier	 match
(	TokenNameLPAREN	
input	TokenNameIdentifier	 input
,	TokenNameCOMMA	
K_USING	TokenNameIdentifier	 K  USING
,	TokenNameCOMMA	
FOLLOW_K_USING_in_usingClauseDelete975	TokenNameIdentifier	 FOLLOW  K  USING in using Clause Delete975
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
pushFollow	TokenNameIdentifier	 push Follow
(	TokenNameLPAREN	
FOLLOW_usingClauseDeleteObjective_in_usingClauseDelete977	TokenNameIdentifier	 FOLLOW using Clause Delete Objective in using Clause Delete977
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
usingClauseDeleteObjective	TokenNameIdentifier	 using Clause Delete Objective
(	TokenNameLPAREN	
attrs	TokenNameIdentifier	 attrs
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
_fsp	TokenNameIdentifier	 fsp
--	TokenNameMINUS_MINUS	
;	TokenNameSEMICOLON	
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql/Cql.g:240:49: ( ( K_AND )? usingClauseDeleteObjective[attrs] )* 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql/Cql.g:240:49: ( ( K_AND )? usingClauseDeleteObjective[attrs] )* 
loop21	TokenNameIdentifier	 loop21
:	TokenNameCOLON	
do	TokenNamedo	
{	TokenNameLBRACE	
int	TokenNameint	
alt21	TokenNameIdentifier	 alt21
=	TokenNameEQUAL	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
LA21_0	TokenNameIdentifier	 L A21 0
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
LA21_0	TokenNameIdentifier	 L A21 0
==	TokenNameEQUAL_EQUAL	
K_CONSISTENCY	TokenNameIdentifier	 K  CONSISTENCY
||	TokenNameOR_OR	
LA21_0	TokenNameIdentifier	 L A21 0
==	TokenNameEQUAL_EQUAL	
K_AND	TokenNameIdentifier	 K  AND
||	TokenNameOR_OR	
LA21_0	TokenNameIdentifier	 L A21 0
==	TokenNameEQUAL_EQUAL	
K_TIMESTAMP	TokenNameIdentifier	 K  TIMESTAMP
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
alt21	TokenNameIdentifier	 alt21
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
switch	TokenNameswitch	
(	TokenNameLPAREN	
alt21	TokenNameIdentifier	 alt21
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
1	TokenNameIntegerLiteral	
:	TokenNameCOLON	
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql/Cql.g:240:51: ( K_AND )? usingClauseDeleteObjective[attrs] 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql/Cql.g:240:51: ( K_AND )? usingClauseDeleteObjective[attrs] 
{	TokenNameLBRACE	
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql/Cql.g:240:51: ( K_AND )? 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql/Cql.g:240:51: ( K_AND )? 
int	TokenNameint	
alt20	TokenNameIdentifier	 alt20
=	TokenNameEQUAL	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
LA20_0	TokenNameIdentifier	 L A20 0
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
LA20_0	TokenNameIdentifier	 L A20 0
==	TokenNameEQUAL_EQUAL	
K_AND	TokenNameIdentifier	 K  AND
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
alt20	TokenNameIdentifier	 alt20
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
switch	TokenNameswitch	
(	TokenNameLPAREN	
alt20	TokenNameIdentifier	 alt20
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
1	TokenNameIntegerLiteral	
:	TokenNameCOLON	
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql/Cql.g:240:51: K_AND 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql/Cql.g:240:51: K_AND 
{	TokenNameLBRACE	
match	TokenNameIdentifier	 match
(	TokenNameLPAREN	
input	TokenNameIdentifier	 input
,	TokenNameCOMMA	
K_AND	TokenNameIdentifier	 K  AND
,	TokenNameCOMMA	
FOLLOW_K_AND_in_usingClauseDelete982	TokenNameIdentifier	 FOLLOW  K  AND in using Clause Delete982
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
pushFollow	TokenNameIdentifier	 push Follow
(	TokenNameLPAREN	
FOLLOW_usingClauseDeleteObjective_in_usingClauseDelete985	TokenNameIdentifier	 FOLLOW using Clause Delete Objective in using Clause Delete985
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
usingClauseDeleteObjective	TokenNameIdentifier	 using Clause Delete Objective
(	TokenNameLPAREN	
attrs	TokenNameIdentifier	 attrs
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
_fsp	TokenNameIdentifier	 fsp
--	TokenNameMINUS_MINUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
default	TokenNamedefault	
:	TokenNameCOLON	
break	TokenNamebreak	
loop21	TokenNameIdentifier	 loop21
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
while	TokenNamewhile	
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
RecognitionException	TokenNameIdentifier	 Recognition Exception
re	TokenNameIdentifier	 re
)	TokenNameRPAREN	
{	TokenNameLBRACE	
reportError	TokenNameIdentifier	 report Error
(	TokenNameLPAREN	
re	TokenNameIdentifier	 re
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
recover	TokenNameIdentifier	 recover
(	TokenNameLPAREN	
input	TokenNameIdentifier	 input
,	TokenNameCOMMA	
re	TokenNameIdentifier	 re
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
finally	TokenNamefinally	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// $ANTLR end "usingClauseDelete" 	TokenNameCOMMENT_LINE	$ANTLR end "usingClauseDelete" 
// $ANTLR start "usingClauseDeleteObjective" 	TokenNameCOMMENT_LINE	$ANTLR start "usingClauseDeleteObjective" 
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql/Cql.g:243:1: usingClauseDeleteObjective[Attributes attrs] : ( K_CONSISTENCY K_LEVEL | K_TIMESTAMP ts= INTEGER ); 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql/Cql.g:243:1: usingClauseDeleteObjective[Attributes attrs] : ( K_CONSISTENCY K_LEVEL | K_TIMESTAMP ts= INTEGER ); 
public	TokenNamepublic	
final	TokenNamefinal	
void	TokenNamevoid	
usingClauseDeleteObjective	TokenNameIdentifier	 using Clause Delete Objective
(	TokenNameLPAREN	
Attributes	TokenNameIdentifier	 Attributes
attrs	TokenNameIdentifier	 attrs
)	TokenNameRPAREN	
throws	TokenNamethrows	
RecognitionException	TokenNameIdentifier	 Recognition Exception
{	TokenNameLBRACE	
Token	TokenNameIdentifier	 Token
ts	TokenNameIdentifier	 ts
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
Token	TokenNameIdentifier	 Token
K_LEVEL17	TokenNameIdentifier	 K  LEVE L17
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql/Cql.g:244:5: ( K_CONSISTENCY K_LEVEL | K_TIMESTAMP ts= INTEGER ) 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql/Cql.g:244:5: ( K_CONSISTENCY K_LEVEL | K_TIMESTAMP ts= INTEGER ) 
int	TokenNameint	
alt22	TokenNameIdentifier	 alt22
=	TokenNameEQUAL	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
LA22_0	TokenNameIdentifier	 L A22 0
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
LA22_0	TokenNameIdentifier	 L A22 0
==	TokenNameEQUAL_EQUAL	
K_CONSISTENCY	TokenNameIdentifier	 K  CONSISTENCY
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
alt22	TokenNameIdentifier	 alt22
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
LA22_0	TokenNameIdentifier	 L A22 0
==	TokenNameEQUAL_EQUAL	
K_TIMESTAMP	TokenNameIdentifier	 K  TIMESTAMP
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
alt22	TokenNameIdentifier	 alt22
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
22	TokenNameIntegerLiteral	
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
alt22	TokenNameIdentifier	 alt22
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
1	TokenNameIntegerLiteral	
:	TokenNameCOLON	
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql/Cql.g:244:7: K_CONSISTENCY K_LEVEL 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql/Cql.g:244:7: K_CONSISTENCY K_LEVEL 
{	TokenNameLBRACE	
match	TokenNameIdentifier	 match
(	TokenNameLPAREN	
input	TokenNameIdentifier	 input
,	TokenNameCOMMA	
K_CONSISTENCY	TokenNameIdentifier	 K  CONSISTENCY
,	TokenNameCOMMA	
FOLLOW_K_CONSISTENCY_in_usingClauseDeleteObjective1007	TokenNameIdentifier	 FOLLOW  K  CONSISTENCY in using Clause Delete Objective1007
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
K_LEVEL17	TokenNameIdentifier	 K  LEVE L17
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Token	TokenNameIdentifier	 Token
)	TokenNameRPAREN	
match	TokenNameIdentifier	 match
(	TokenNameLPAREN	
input	TokenNameIdentifier	 input
,	TokenNameCOMMA	
K_LEVEL	TokenNameIdentifier	 K  LEVEL
,	TokenNameCOMMA	
FOLLOW_K_LEVEL_in_usingClauseDeleteObjective1009	TokenNameIdentifier	 FOLLOW  K  LEVEL in using Clause Delete Objective1009
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
attrs	TokenNameIdentifier	 attrs
.	TokenNameDOT	
setConsistencyLevel	TokenNameIdentifier	 set Consistency Level
(	TokenNameLPAREN	
ConsistencyLevel	TokenNameIdentifier	 Consistency Level
.	TokenNameDOT	
valueOf	TokenNameIdentifier	 value Of
(	TokenNameLPAREN	
(	TokenNameLPAREN	
K_LEVEL17	TokenNameIdentifier	 K  LEVE L17
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
?	TokenNameQUESTION	
K_LEVEL17	TokenNameIdentifier	 K  LEVE L17
.	TokenNameDOT	
getText	TokenNameIdentifier	 get Text
(	TokenNameLPAREN	
)	TokenNameRPAREN	
:	TokenNameCOLON	
null	TokenNamenull	
)	TokenNameRPAREN	
.	TokenNameDOT	
toUpperCase	TokenNameIdentifier	 to Upper Case
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
2	TokenNameIntegerLiteral	
:	TokenNameCOLON	
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql/Cql.g:245:7: K_TIMESTAMP ts= INTEGER 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql/Cql.g:245:7: K_TIMESTAMP ts= INTEGER 
{	TokenNameLBRACE	
match	TokenNameIdentifier	 match
(	TokenNameLPAREN	
input	TokenNameIdentifier	 input
,	TokenNameCOMMA	
K_TIMESTAMP	TokenNameIdentifier	 K  TIMESTAMP
,	TokenNameCOMMA	
FOLLOW_K_TIMESTAMP_in_usingClauseDeleteObjective1020	TokenNameIdentifier	 FOLLOW  K  TIMESTAMP in using Clause Delete Objective1020
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ts	TokenNameIdentifier	 ts
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Token	TokenNameIdentifier	 Token
)	TokenNameRPAREN	
match	TokenNameIdentifier	 match
(	TokenNameLPAREN	
input	TokenNameIdentifier	 input
,	TokenNameCOMMA	
INTEGER	TokenNameIdentifier	 INTEGER
,	TokenNameCOMMA	
FOLLOW_INTEGER_in_usingClauseDeleteObjective1024	TokenNameIdentifier	 FOLLOW  INTEGER in using Clause Delete Objective1024
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
attrs	TokenNameIdentifier	 attrs
.	TokenNameDOT	
setTimestamp	TokenNameIdentifier	 set Timestamp
(	TokenNameLPAREN	
Long	TokenNameIdentifier	 Long
.	TokenNameDOT	
valueOf	TokenNameIdentifier	 value Of
(	TokenNameLPAREN	
(	TokenNameLPAREN	
ts	TokenNameIdentifier	 ts
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
?	TokenNameQUESTION	
ts	TokenNameIdentifier	 ts
.	TokenNameDOT	
getText	TokenNameIdentifier	 get Text
(	TokenNameLPAREN	
)	TokenNameRPAREN	
:	TokenNameCOLON	
null	TokenNamenull	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
RecognitionException	TokenNameIdentifier	 Recognition Exception
re	TokenNameIdentifier	 re
)	TokenNameRPAREN	
{	TokenNameLBRACE	
reportError	TokenNameIdentifier	 report Error
(	TokenNameLPAREN	
re	TokenNameIdentifier	 re
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
recover	TokenNameIdentifier	 recover
(	TokenNameLPAREN	
input	TokenNameIdentifier	 input
,	TokenNameCOMMA	
re	TokenNameIdentifier	 re
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
finally	TokenNamefinally	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// $ANTLR end "usingClauseDeleteObjective" 	TokenNameCOMMENT_LINE	$ANTLR end "usingClauseDeleteObjective" 
// $ANTLR start "usingClauseObjective" 	TokenNameCOMMENT_LINE	$ANTLR start "usingClauseObjective" 
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql/Cql.g:248:1: usingClauseObjective[Attributes attrs] : ( usingClauseDeleteObjective[attrs] | K_TTL t= INTEGER ); 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql/Cql.g:248:1: usingClauseObjective[Attributes attrs] : ( usingClauseDeleteObjective[attrs] | K_TTL t= INTEGER ); 
public	TokenNamepublic	
final	TokenNamefinal	
void	TokenNamevoid	
usingClauseObjective	TokenNameIdentifier	 using Clause Objective
(	TokenNameLPAREN	
Attributes	TokenNameIdentifier	 Attributes
attrs	TokenNameIdentifier	 attrs
)	TokenNameRPAREN	
throws	TokenNamethrows	
RecognitionException	TokenNameIdentifier	 Recognition Exception
{	TokenNameLBRACE	
Token	TokenNameIdentifier	 Token
t	TokenNameIdentifier	 t
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql/Cql.g:249:5: ( usingClauseDeleteObjective[attrs] | K_TTL t= INTEGER ) 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql/Cql.g:249:5: ( usingClauseDeleteObjective[attrs] | K_TTL t= INTEGER ) 
int	TokenNameint	
alt23	TokenNameIdentifier	 alt23
=	TokenNameEQUAL	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
LA23_0	TokenNameIdentifier	 L A23 0
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
LA23_0	TokenNameIdentifier	 L A23 0
==	TokenNameEQUAL_EQUAL	
K_CONSISTENCY	TokenNameIdentifier	 K  CONSISTENCY
||	TokenNameOR_OR	
LA23_0	TokenNameIdentifier	 L A23 0
==	TokenNameEQUAL_EQUAL	
K_TIMESTAMP	TokenNameIdentifier	 K  TIMESTAMP
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
alt23	TokenNameIdentifier	 alt23
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
LA23_0	TokenNameIdentifier	 L A23 0
==	TokenNameEQUAL_EQUAL	
K_TTL	TokenNameIdentifier	 K  TTL
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
alt23	TokenNameIdentifier	 alt23
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
23	TokenNameIntegerLiteral	
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
alt23	TokenNameIdentifier	 alt23
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
1	TokenNameIntegerLiteral	
:	TokenNameCOLON	
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql/Cql.g:249:7: usingClauseDeleteObjective[attrs] 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql/Cql.g:249:7: usingClauseDeleteObjective[attrs] 
{	TokenNameLBRACE	
pushFollow	TokenNameIdentifier	 push Follow
(	TokenNameLPAREN	
FOLLOW_usingClauseDeleteObjective_in_usingClauseObjective1044	TokenNameIdentifier	 FOLLOW using Clause Delete Objective in using Clause Objective1044
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
usingClauseDeleteObjective	TokenNameIdentifier	 using Clause Delete Objective
(	TokenNameLPAREN	
attrs	TokenNameIdentifier	 attrs
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
_fsp	TokenNameIdentifier	 fsp
--	TokenNameMINUS_MINUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
2	TokenNameIntegerLiteral	
:	TokenNameCOLON	
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql/Cql.g:250:7: K_TTL t= INTEGER 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql/Cql.g:250:7: K_TTL t= INTEGER 
{	TokenNameLBRACE	
match	TokenNameIdentifier	 match
(	TokenNameLPAREN	
input	TokenNameIdentifier	 input
,	TokenNameCOMMA	
K_TTL	TokenNameIdentifier	 K  TTL
,	TokenNameCOMMA	
FOLLOW_K_TTL_in_usingClauseObjective1053	TokenNameIdentifier	 FOLLOW  K  TTL in using Clause Objective1053
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
t	TokenNameIdentifier	 t
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Token	TokenNameIdentifier	 Token
)	TokenNameRPAREN	
match	TokenNameIdentifier	 match
(	TokenNameLPAREN	
input	TokenNameIdentifier	 input
,	TokenNameCOMMA	
INTEGER	TokenNameIdentifier	 INTEGER
,	TokenNameCOMMA	
FOLLOW_INTEGER_in_usingClauseObjective1057	TokenNameIdentifier	 FOLLOW  INTEGER in using Clause Objective1057
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
attrs	TokenNameIdentifier	 attrs
.	TokenNameDOT	
setTimeToLive	TokenNameIdentifier	 set Time To Live
(	TokenNameLPAREN	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
parseInt	TokenNameIdentifier	 parse Int
(	TokenNameLPAREN	
(	TokenNameLPAREN	
t	TokenNameIdentifier	 t
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
?	TokenNameQUESTION	
t	TokenNameIdentifier	 t
.	TokenNameDOT	
getText	TokenNameIdentifier	 get Text
(	TokenNameLPAREN	
)	TokenNameRPAREN	
:	TokenNameCOLON	
null	TokenNamenull	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
RecognitionException	TokenNameIdentifier	 Recognition Exception
re	TokenNameIdentifier	 re
)	TokenNameRPAREN	
{	TokenNameLBRACE	
reportError	TokenNameIdentifier	 report Error
(	TokenNameLPAREN	
re	TokenNameIdentifier	 re
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
recover	TokenNameIdentifier	 recover
(	TokenNameLPAREN	
input	TokenNameIdentifier	 input
,	TokenNameCOMMA	
re	TokenNameIdentifier	 re
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
finally	TokenNamefinally	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// $ANTLR end "usingClauseObjective" 	TokenNameCOMMENT_LINE	$ANTLR end "usingClauseObjective" 
// $ANTLR start "batchStatement" 	TokenNameCOMMENT_LINE	$ANTLR start "batchStatement" 
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql/Cql.g:253:1: batchStatement returns [BatchStatement expr] : K_BEGIN K_BATCH ( usingClause[attrs] )? s1= batchStatementObjective ( ';' )? (sN= batchStatementObjective ( ';' )? )* K_APPLY K_BATCH endStmnt ; 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql/Cql.g:253:1: batchStatement returns [BatchStatement expr] : K_BEGIN K_BATCH ( usingClause[attrs] )? s1= batchStatementObjective ( ';' )? (sN= batchStatementObjective ( ';' )? )* K_APPLY K_BATCH endStmnt ; 
public	TokenNamepublic	
final	TokenNamefinal	
BatchStatement	TokenNameIdentifier	 Batch Statement
batchStatement	TokenNameIdentifier	 batch Statement
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
RecognitionException	TokenNameIdentifier	 Recognition Exception
{	TokenNameLBRACE	
BatchStatement	TokenNameIdentifier	 Batch Statement
expr	TokenNameIdentifier	 expr
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
AbstractModification	TokenNameIdentifier	 Abstract Modification
s1	TokenNameIdentifier	 s1
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
AbstractModification	TokenNameIdentifier	 Abstract Modification
sN	TokenNameIdentifier	 s N
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql/Cql.g:278:5: ( K_BEGIN K_BATCH ( usingClause[attrs] )? s1= batchStatementObjective ( ';' )? (sN= batchStatementObjective ( ';' )? )* K_APPLY K_BATCH endStmnt ) 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql/Cql.g:278:5: ( K_BEGIN K_BATCH ( usingClause[attrs] )? s1= batchStatementObjective ( ';' )? (sN= batchStatementObjective ( ';' )? )* K_APPLY K_BATCH endStmnt ) 
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql/Cql.g:278:7: K_BEGIN K_BATCH ( usingClause[attrs] )? s1= batchStatementObjective ( ';' )? (sN= batchStatementObjective ( ';' )? )* K_APPLY K_BATCH endStmnt 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql/Cql.g:278:7: K_BEGIN K_BATCH ( usingClause[attrs] )? s1= batchStatementObjective ( ';' )? (sN= batchStatementObjective ( ';' )? )* K_APPLY K_BATCH endStmnt 
{	TokenNameLBRACE	
Attributes	TokenNameIdentifier	 Attributes
attrs	TokenNameIdentifier	 attrs
=	TokenNameEQUAL	
new	TokenNamenew	
Attributes	TokenNameIdentifier	 Attributes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
attrs	TokenNameIdentifier	 attrs
.	TokenNameDOT	
setConsistencyLevel	TokenNameIdentifier	 set Consistency Level
(	TokenNameLPAREN	
ConsistencyLevel	TokenNameIdentifier	 Consistency Level
.	TokenNameDOT	
ONE	TokenNameIdentifier	 ONE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
AbstractModification	TokenNameIdentifier	 Abstract Modification
>	TokenNameGREATER	
statements	TokenNameIdentifier	 statements
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
AbstractModification	TokenNameIdentifier	 Abstract Modification
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
match	TokenNameIdentifier	 match
(	TokenNameLPAREN	
input	TokenNameIdentifier	 input
,	TokenNameCOMMA	
K_BEGIN	TokenNameIdentifier	 K  BEGIN
,	TokenNameCOMMA	
FOLLOW_K_BEGIN_in_batchStatement1097	TokenNameIdentifier	 FOLLOW  K  BEGIN in batch Statement1097
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
match	TokenNameIdentifier	 match
(	TokenNameLPAREN	
input	TokenNameIdentifier	 input
,	TokenNameCOMMA	
K_BATCH	TokenNameIdentifier	 K  BATCH
,	TokenNameCOMMA	
FOLLOW_K_BATCH_in_batchStatement1099	TokenNameIdentifier	 FOLLOW  K  BATCH in batch Statement1099
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql/Cql.g:284:23: ( usingClause[attrs] )? 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql/Cql.g:284:23: ( usingClause[attrs] )? 
int	TokenNameint	
alt24	TokenNameIdentifier	 alt24
=	TokenNameEQUAL	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
LA24_0	TokenNameIdentifier	 L A24 0
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
LA24_0	TokenNameIdentifier	 L A24 0
==	TokenNameEQUAL_EQUAL	
K_USING	TokenNameIdentifier	 K  USING
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
alt24	TokenNameIdentifier	 alt24
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
switch	TokenNameswitch	
(	TokenNameLPAREN	
alt24	TokenNameIdentifier	 alt24
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
1	TokenNameIntegerLiteral	
:	TokenNameCOLON	
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql/Cql.g:284:25: usingClause[attrs] 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql/Cql.g:284:25: usingClause[attrs] 
{	TokenNameLBRACE	
pushFollow	TokenNameIdentifier	 push Follow
(	TokenNameLPAREN	
FOLLOW_usingClause_in_batchStatement1103	TokenNameIdentifier	 FOLLOW using Clause in batch Statement1103
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
usingClause	TokenNameIdentifier	 using Clause
(	TokenNameLPAREN	
attrs	TokenNameIdentifier	 attrs
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
_fsp	TokenNameIdentifier	 fsp
--	TokenNameMINUS_MINUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
pushFollow	TokenNameIdentifier	 push Follow
(	TokenNameLPAREN	
FOLLOW_batchStatementObjective_in_batchStatement1121	TokenNameIdentifier	 FOLLOW batch Statement Objective in batch Statement1121
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
s1	TokenNameIdentifier	 s1
=	TokenNameEQUAL	
batchStatementObjective	TokenNameIdentifier	 batch Statement Objective
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
_fsp	TokenNameIdentifier	 fsp
--	TokenNameMINUS_MINUS	
;	TokenNameSEMICOLON	
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql/Cql.g:285:38: ( ';' )? 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql/Cql.g:285:38: ( ';' )? 
int	TokenNameint	
alt25	TokenNameIdentifier	 alt25
=	TokenNameEQUAL	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
LA25_0	TokenNameIdentifier	 L A25 0
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
LA25_0	TokenNameIdentifier	 L A25 0
==	TokenNameEQUAL_EQUAL	
86	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
alt25	TokenNameIdentifier	 alt25
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
switch	TokenNameswitch	
(	TokenNameLPAREN	
alt25	TokenNameIdentifier	 alt25
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
1	TokenNameIntegerLiteral	
:	TokenNameCOLON	
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql/Cql.g:285:38: ';' 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql/Cql.g:285:38: ';' 
{	TokenNameLBRACE	
match	TokenNameIdentifier	 match
(	TokenNameLPAREN	
input	TokenNameIdentifier	 input
,	TokenNameCOMMA	
86	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
FOLLOW_86_in_batchStatement1123	TokenNameIdentifier	 FOLLOW 86 in batch Statement1123
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
statements	TokenNameIdentifier	 statements
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
s1	TokenNameIdentifier	 s1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql/Cql.g:285:67: (sN= batchStatementObjective ( ';' )? )* 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql/Cql.g:285:67: (sN= batchStatementObjective ( ';' )? )* 
loop27	TokenNameIdentifier	 loop27
:	TokenNameCOLON	
do	TokenNamedo	
{	TokenNameLBRACE	
int	TokenNameint	
alt27	TokenNameIdentifier	 alt27
=	TokenNameEQUAL	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
LA27_0	TokenNameIdentifier	 L A27 0
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
LA27_0	TokenNameIdentifier	 L A27 0
==	TokenNameEQUAL_EQUAL	
K_INSERT	TokenNameIdentifier	 K  INSERT
||	TokenNameOR_OR	
LA27_0	TokenNameIdentifier	 L A27 0
==	TokenNameEQUAL_EQUAL	
K_UPDATE	TokenNameIdentifier	 K  UPDATE
||	TokenNameOR_OR	
LA27_0	TokenNameIdentifier	 L A27 0
==	TokenNameEQUAL_EQUAL	
K_DELETE	TokenNameIdentifier	 K  DELETE
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
alt27	TokenNameIdentifier	 alt27
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
switch	TokenNameswitch	
(	TokenNameLPAREN	
alt27	TokenNameIdentifier	 alt27
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
1	TokenNameIntegerLiteral	
:	TokenNameCOLON	
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql/Cql.g:285:69: sN= batchStatementObjective ( ';' )? 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql/Cql.g:285:69: sN= batchStatementObjective ( ';' )? 
{	TokenNameLBRACE	
pushFollow	TokenNameIdentifier	 push Follow
(	TokenNameLPAREN	
FOLLOW_batchStatementObjective_in_batchStatement1132	TokenNameIdentifier	 FOLLOW batch Statement Objective in batch Statement1132
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sN	TokenNameIdentifier	 s N
=	TokenNameEQUAL	
batchStatementObjective	TokenNameIdentifier	 batch Statement Objective
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
_fsp	TokenNameIdentifier	 fsp
--	TokenNameMINUS_MINUS	
;	TokenNameSEMICOLON	
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql/Cql.g:285:96: ( ';' )? 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql/Cql.g:285:96: ( ';' )? 
int	TokenNameint	
alt26	TokenNameIdentifier	 alt26
=	TokenNameEQUAL	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
LA26_0	TokenNameIdentifier	 L A26 0
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
LA26_0	TokenNameIdentifier	 L A26 0
==	TokenNameEQUAL_EQUAL	
86	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
alt26	TokenNameIdentifier	 alt26
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
switch	TokenNameswitch	
(	TokenNameLPAREN	
alt26	TokenNameIdentifier	 alt26
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
1	TokenNameIntegerLiteral	
:	TokenNameCOLON	
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql/Cql.g:285:96: ';' 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql/Cql.g:285:96: ';' 
{	TokenNameLBRACE	
match	TokenNameIdentifier	 match
(	TokenNameLPAREN	
input	TokenNameIdentifier	 input
,	TokenNameCOMMA	
86	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
FOLLOW_86_in_batchStatement1134	TokenNameIdentifier	 FOLLOW 86 in batch Statement1134
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
statements	TokenNameIdentifier	 statements
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
sN	TokenNameIdentifier	 s N
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
default	TokenNamedefault	
:	TokenNameCOLON	
break	TokenNamebreak	
loop27	TokenNameIdentifier	 loop27
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
input	TokenNameIdentifier	 input
,	TokenNameCOMMA	
K_APPLY	TokenNameIdentifier	 K  APPLY
,	TokenNameCOMMA	
FOLLOW_K_APPLY_in_batchStatement1148	TokenNameIdentifier	 FOLLOW  K  APPLY in batch Statement1148
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
match	TokenNameIdentifier	 match
(	TokenNameLPAREN	
input	TokenNameIdentifier	 input
,	TokenNameCOMMA	
K_BATCH	TokenNameIdentifier	 K  BATCH
,	TokenNameCOMMA	
FOLLOW_K_BATCH_in_batchStatement1150	TokenNameIdentifier	 FOLLOW  K  BATCH in batch Statement1150
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
pushFollow	TokenNameIdentifier	 push Follow
(	TokenNameLPAREN	
FOLLOW_endStmnt_in_batchStatement1152	TokenNameIdentifier	 FOLLOW end Stmnt in batch Statement1152
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
endStmnt	TokenNameIdentifier	 end Stmnt
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
_fsp	TokenNameIdentifier	 fsp
--	TokenNameMINUS_MINUS	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
new	TokenNamenew	
BatchStatement	TokenNameIdentifier	 Batch Statement
(	TokenNameLPAREN	
statements	TokenNameIdentifier	 statements
,	TokenNameCOMMA	
attrs	TokenNameIdentifier	 attrs
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
RecognitionException	TokenNameIdentifier	 Recognition Exception
re	TokenNameIdentifier	 re
)	TokenNameRPAREN	
{	TokenNameLBRACE	
reportError	TokenNameIdentifier	 report Error
(	TokenNameLPAREN	
re	TokenNameIdentifier	 re
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
recover	TokenNameIdentifier	 recover
(	TokenNameLPAREN	
input	TokenNameIdentifier	 input
,	TokenNameCOMMA	
re	TokenNameIdentifier	 re
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
finally	TokenNamefinally	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
expr	TokenNameIdentifier	 expr
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// $ANTLR end "batchStatement" 	TokenNameCOMMENT_LINE	$ANTLR end "batchStatement" 
// $ANTLR start "batchStatementObjective" 	TokenNameCOMMENT_LINE	$ANTLR start "batchStatementObjective" 
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql/Cql.g:292:1: batchStatementObjective returns [AbstractModification statement] : (i= insertStatement | u= updateStatement | d= deleteStatement ); 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql/Cql.g:292:1: batchStatementObjective returns [AbstractModification statement] : (i= insertStatement | u= updateStatement | d= deleteStatement ); 
public	TokenNamepublic	
final	TokenNamefinal	
AbstractModification	TokenNameIdentifier	 Abstract Modification
batchStatementObjective	TokenNameIdentifier	 batch Statement Objective
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
RecognitionException	TokenNameIdentifier	 Recognition Exception
{	TokenNameLBRACE	
AbstractModification	TokenNameIdentifier	 Abstract Modification
statement	TokenNameIdentifier	 statement
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
UpdateStatement	TokenNameIdentifier	 Update Statement
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
UpdateStatement	TokenNameIdentifier	 Update Statement
u	TokenNameIdentifier	 u
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
DeleteStatement	TokenNameIdentifier	 Delete Statement
d	TokenNameIdentifier	 d
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql/Cql.g:293:5: (i= insertStatement | u= updateStatement | d= deleteStatement ) 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql/Cql.g:293:5: (i= insertStatement | u= updateStatement | d= deleteStatement ) 
int	TokenNameint	
alt28	TokenNameIdentifier	 alt28
=	TokenNameEQUAL	
3	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
switch	TokenNameswitch	
(	TokenNameLPAREN	
input	TokenNameIdentifier	 input
.	TokenNameDOT	
LA	TokenNameIdentifier	 LA
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
K_INSERT	TokenNameIdentifier	 K  INSERT
:	TokenNameCOLON	
{	TokenNameLBRACE	
alt28	TokenNameIdentifier	 alt28
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
K_UPDATE	TokenNameIdentifier	 K  UPDATE
:	TokenNameCOLON	
{	TokenNameLBRACE	
alt28	TokenNameIdentifier	 alt28
=	TokenNameEQUAL	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
K_DELETE	TokenNameIdentifier	 K  DELETE
:	TokenNameCOLON	
{	TokenNameLBRACE	
alt28	TokenNameIdentifier	 alt28
=	TokenNameEQUAL	
3	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
default	TokenNamedefault	
:	TokenNameCOLON	
NoViableAltException	TokenNameIdentifier	 No Viable Alt Exception
nvae	TokenNameIdentifier	 nvae
=	TokenNameEQUAL	
new	TokenNamenew	
NoViableAltException	TokenNameIdentifier	 No Viable Alt Exception
(	TokenNameLPAREN	
""	TokenNameStringLiteral	 
,	TokenNameCOMMA	
28	TokenNameIntegerLiteral	
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
alt28	TokenNameIdentifier	 alt28
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
1	TokenNameIntegerLiteral	
:	TokenNameCOLON	
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql/Cql.g:293:7: i= insertStatement 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql/Cql.g:293:7: i= insertStatement 
{	TokenNameLBRACE	
pushFollow	TokenNameIdentifier	 push Follow
(	TokenNameLPAREN	
FOLLOW_insertStatement_in_batchStatementObjective1183	TokenNameIdentifier	 FOLLOW insert Statement in batch Statement Objective1183
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
insertStatement	TokenNameIdentifier	 insert Statement
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
_fsp	TokenNameIdentifier	 fsp
--	TokenNameMINUS_MINUS	
;	TokenNameSEMICOLON	
statement	TokenNameIdentifier	 statement
=	TokenNameEQUAL	
i	TokenNameIdentifier	 i
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
2	TokenNameIntegerLiteral	
:	TokenNameCOLON	
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql/Cql.g:294:7: u= updateStatement 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql/Cql.g:294:7: u= updateStatement 
{	TokenNameLBRACE	
pushFollow	TokenNameIdentifier	 push Follow
(	TokenNameLPAREN	
FOLLOW_updateStatement_in_batchStatementObjective1196	TokenNameIdentifier	 FOLLOW update Statement in batch Statement Objective1196
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
u	TokenNameIdentifier	 u
=	TokenNameEQUAL	
updateStatement	TokenNameIdentifier	 update Statement
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
_fsp	TokenNameIdentifier	 fsp
--	TokenNameMINUS_MINUS	
;	TokenNameSEMICOLON	
statement	TokenNameIdentifier	 statement
=	TokenNameEQUAL	
u	TokenNameIdentifier	 u
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
3	TokenNameIntegerLiteral	
:	TokenNameCOLON	
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql/Cql.g:295:7: d= deleteStatement 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql/Cql.g:295:7: d= deleteStatement 
{	TokenNameLBRACE	
pushFollow	TokenNameIdentifier	 push Follow
(	TokenNameLPAREN	
FOLLOW_deleteStatement_in_batchStatementObjective1209	TokenNameIdentifier	 FOLLOW delete Statement in batch Statement Objective1209
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
d	TokenNameIdentifier	 d
=	TokenNameEQUAL	
deleteStatement	TokenNameIdentifier	 delete Statement
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
_fsp	TokenNameIdentifier	 fsp
--	TokenNameMINUS_MINUS	
;	TokenNameSEMICOLON	
statement	TokenNameIdentifier	 statement
=	TokenNameEQUAL	
d	TokenNameIdentifier	 d
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
RecognitionException	TokenNameIdentifier	 Recognition Exception
re	TokenNameIdentifier	 re
)	TokenNameRPAREN	
{	TokenNameLBRACE	
reportError	TokenNameIdentifier	 report Error
(	TokenNameLPAREN	
re	TokenNameIdentifier	 re
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
recover	TokenNameIdentifier	 recover
(	TokenNameLPAREN	
input	TokenNameIdentifier	 input
,	TokenNameCOMMA	
re	TokenNameIdentifier	 re
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
finally	TokenNamefinally	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
statement	TokenNameIdentifier	 statement
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// $ANTLR end "batchStatementObjective" 	TokenNameCOMMENT_LINE	$ANTLR end "batchStatementObjective" 
// $ANTLR start "updateStatement" 	TokenNameCOMMENT_LINE	$ANTLR start "updateStatement" 
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql/Cql.g:298:1: updateStatement returns [UpdateStatement expr] : K_UPDATE (keyspace= ( IDENT | STRING_LITERAL | INTEGER ) '.' )? columnFamily= ( IDENT | STRING_LITERAL | INTEGER ) ( usingClause[attrs] )? K_SET termPairWithOperation[columns] ( ',' termPairWithOperation[columns] )* K_WHERE (key_alias= term ( '=' key= term | K_IN '(' keys= termList ')' ) ) ; 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql/Cql.g:298:1: updateStatement returns [UpdateStatement expr] : K_UPDATE (keyspace= ( IDENT | STRING_LITERAL | INTEGER ) '.' )? columnFamily= ( IDENT | STRING_LITERAL | INTEGER ) ( usingClause[attrs] )? K_SET termPairWithOperation[columns] ( ',' termPairWithOperation[columns] )* K_WHERE (key_alias= term ( '=' key= term | K_IN '(' keys= termList ')' ) ) ; 
public	TokenNamepublic	
final	TokenNamefinal	
UpdateStatement	TokenNameIdentifier	 Update Statement
updateStatement	TokenNameIdentifier	 update Statement
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
RecognitionException	TokenNameIdentifier	 Recognition Exception
{	TokenNameLBRACE	
UpdateStatement	TokenNameIdentifier	 Update Statement
expr	TokenNameIdentifier	 expr
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
Token	TokenNameIdentifier	 Token
keyspace	TokenNameIdentifier	 keyspace
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
Token	TokenNameIdentifier	 Token
columnFamily	TokenNameIdentifier	 column Family
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
Term	TokenNameIdentifier	 Term
key_alias	TokenNameIdentifier	 key alias
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
Term	TokenNameIdentifier	 Term
key	TokenNameIdentifier	 key
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
Term	TokenNameIdentifier	 Term
>	TokenNameGREATER	
keys	TokenNameIdentifier	 keys
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql/Cql.g:312:5: ( K_UPDATE (keyspace= ( IDENT | STRING_LITERAL | INTEGER ) '.' )? columnFamily= ( IDENT | STRING_LITERAL | INTEGER ) ( usingClause[attrs] )? K_SET termPairWithOperation[columns] ( ',' termPairWithOperation[columns] )* K_WHERE (key_alias= term ( '=' key= term | K_IN '(' keys= termList ')' ) ) ) 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql/Cql.g:312:5: ( K_UPDATE (keyspace= ( IDENT | STRING_LITERAL | INTEGER ) '.' )? columnFamily= ( IDENT | STRING_LITERAL | INTEGER ) ( usingClause[attrs] )? K_SET termPairWithOperation[columns] ( ',' termPairWithOperation[columns] )* K_WHERE (key_alias= term ( '=' key= term | K_IN '(' keys= termList ')' ) ) ) 
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql/Cql.g:312:7: K_UPDATE (keyspace= ( IDENT | STRING_LITERAL | INTEGER ) '.' )? columnFamily= ( IDENT | STRING_LITERAL | INTEGER ) ( usingClause[attrs] )? K_SET termPairWithOperation[columns] ( ',' termPairWithOperation[columns] )* K_WHERE (key_alias= term ( '=' key= term | K_IN '(' keys= termList ')' ) ) 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql/Cql.g:312:7: K_UPDATE (keyspace= ( IDENT | STRING_LITERAL | INTEGER ) '.' )? columnFamily= ( IDENT | STRING_LITERAL | INTEGER ) ( usingClause[attrs] )? K_SET termPairWithOperation[columns] ( ',' termPairWithOperation[columns] )* K_WHERE (key_alias= term ( '=' key= term | K_IN '(' keys= termList ')' ) ) 
{	TokenNameLBRACE	
Attributes	TokenNameIdentifier	 Attributes
attrs	TokenNameIdentifier	 attrs
=	TokenNameEQUAL	
new	TokenNamenew	
Attributes	TokenNameIdentifier	 Attributes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Map	TokenNameIdentifier	 Map
<	TokenNameLESS	
Term	TokenNameIdentifier	 Term
,	TokenNameCOMMA	
Operation	TokenNameIdentifier	 Operation
>	TokenNameGREATER	
columns	TokenNameIdentifier	 columns
=	TokenNameEQUAL	
new	TokenNamenew	
HashMap	TokenNameIdentifier	 Hash Map
<	TokenNameLESS	
Term	TokenNameIdentifier	 Term
,	TokenNameCOMMA	
Operation	TokenNameIdentifier	 Operation
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
Term	TokenNameIdentifier	 Term
>	TokenNameGREATER	
keyList	TokenNameIdentifier	 key List
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
match	TokenNameIdentifier	 match
(	TokenNameLPAREN	
input	TokenNameIdentifier	 input
,	TokenNameCOMMA	
K_UPDATE	TokenNameIdentifier	 K  UPDATE
,	TokenNameCOMMA	
FOLLOW_K_UPDATE_in_updateStatement1243	TokenNameIdentifier	 FOLLOW  K  UPDATE in update Statement1243
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql/Cql.g:317:16: (keyspace= ( IDENT | STRING_LITERAL | INTEGER ) '.' )? 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql/Cql.g:317:16: (keyspace= ( IDENT | STRING_LITERAL | INTEGER ) '.' )? 
int	TokenNameint	
alt29	TokenNameIdentifier	 alt29
=	TokenNameEQUAL	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
LA29_0	TokenNameIdentifier	 L A29 0
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
LA29_0	TokenNameIdentifier	 L A29 0
>=	TokenNameGREATER_EQUAL	
IDENT	TokenNameIdentifier	 IDENT
&&	TokenNameAND_AND	
LA29_0	TokenNameIdentifier	 L A29 0
<=	TokenNameLESS_EQUAL	
STRING_LITERAL	TokenNameIdentifier	 STRING  LITERAL
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
LA29_1	TokenNameIdentifier	 L A29 1
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
LA29_1	TokenNameIdentifier	 L A29 1
==	TokenNameEQUAL_EQUAL	
83	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
alt29	TokenNameIdentifier	 alt29
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
switch	TokenNameswitch	
(	TokenNameLPAREN	
alt29	TokenNameIdentifier	 alt29
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
1	TokenNameIntegerLiteral	
:	TokenNameCOLON	
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql/Cql.g:317:17: keyspace= ( IDENT | STRING_LITERAL | INTEGER ) '.' 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql/Cql.g:317:17: keyspace= ( IDENT | STRING_LITERAL | INTEGER ) '.' 
{	TokenNameLBRACE	
keyspace	TokenNameIdentifier	 keyspace
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Token	TokenNameIdentifier	 Token
)	TokenNameRPAREN	
input	TokenNameIdentifier	 input
.	TokenNameDOT	
LT	TokenNameIdentifier	 LT
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
IDENT	TokenNameIdentifier	 IDENT
&&	TokenNameAND_AND	
input	TokenNameIdentifier	 input
.	TokenNameDOT	
LA	TokenNameIdentifier	 LA
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
<=	TokenNameLESS_EQUAL	
STRING_LITERAL	TokenNameIdentifier	 STRING  LITERAL
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
input	TokenNameIdentifier	 input
.	TokenNameDOT	
consume	TokenNameIdentifier	 consume
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
errorRecovery	TokenNameIdentifier	 error Recovery
=	TokenNameEQUAL	
false	TokenNamefalse	
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
throw	TokenNamethrow	
mse	TokenNameIdentifier	 mse
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
match	TokenNameIdentifier	 match
(	TokenNameLPAREN	
input	TokenNameIdentifier	 input
,	TokenNameCOMMA	
83	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
FOLLOW_83_in_updateStatement1260	TokenNameIdentifier	 FOLLOW 83 in update Statement1260
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
columnFamily	TokenNameIdentifier	 column Family
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Token	TokenNameIdentifier	 Token
)	TokenNameRPAREN	
input	TokenNameIdentifier	 input
.	TokenNameDOT	
LT	TokenNameIdentifier	 LT
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
IDENT	TokenNameIdentifier	 IDENT
&&	TokenNameAND_AND	
input	TokenNameIdentifier	 input
.	TokenNameDOT	
LA	TokenNameIdentifier	 LA
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
<=	TokenNameLESS_EQUAL	
STRING_LITERAL	TokenNameIdentifier	 STRING  LITERAL
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
input	TokenNameIdentifier	 input
.	TokenNameDOT	
consume	TokenNameIdentifier	 consume
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
errorRecovery	TokenNameIdentifier	 error Recovery
=	TokenNameEQUAL	
false	TokenNamefalse	
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
throw	TokenNamethrow	
mse	TokenNameIdentifier	 mse
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql/Cql.g:318:11: ( usingClause[attrs] )? 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql/Cql.g:318:11: ( usingClause[attrs] )? 
int	TokenNameint	
alt30	TokenNameIdentifier	 alt30
=	TokenNameEQUAL	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
LA30_0	TokenNameIdentifier	 L A30 0
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
LA30_0	TokenNameIdentifier	 L A30 0
==	TokenNameEQUAL_EQUAL	
K_USING	TokenNameIdentifier	 K  USING
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
alt30	TokenNameIdentifier	 alt30
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
switch	TokenNameswitch	
(	TokenNameLPAREN	
alt30	TokenNameIdentifier	 alt30
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
1	TokenNameIntegerLiteral	
:	TokenNameCOLON	
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql/Cql.g:318:13: usingClause[attrs] 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql/Cql.g:318:13: usingClause[attrs] 
{	TokenNameLBRACE	
pushFollow	TokenNameIdentifier	 push Follow
(	TokenNameLPAREN	
FOLLOW_usingClause_in_updateStatement1292	TokenNameIdentifier	 FOLLOW using Clause in update Statement1292
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
usingClause	TokenNameIdentifier	 using Clause
(	TokenNameLPAREN	
attrs	TokenNameIdentifier	 attrs
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
_fsp	TokenNameIdentifier	 fsp
--	TokenNameMINUS_MINUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
match	TokenNameIdentifier	 match
(	TokenNameLPAREN	
input	TokenNameIdentifier	 input
,	TokenNameCOMMA	
K_SET	TokenNameIdentifier	 K  SET
,	TokenNameCOMMA	
FOLLOW_K_SET_in_updateStatement1308	TokenNameIdentifier	 FOLLOW  K  SET in update Statement1308
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
pushFollow	TokenNameIdentifier	 push Follow
(	TokenNameLPAREN	
FOLLOW_termPairWithOperation_in_updateStatement1310	TokenNameIdentifier	 FOLLOW term Pair With Operation in update Statement1310
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
termPairWithOperation	TokenNameIdentifier	 term Pair With Operation
(	TokenNameLPAREN	
columns	TokenNameIdentifier	 columns
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
_fsp	TokenNameIdentifier	 fsp
--	TokenNameMINUS_MINUS	
;	TokenNameSEMICOLON	
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql/Cql.g:319:48: ( ',' termPairWithOperation[columns] )* 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql/Cql.g:319:48: ( ',' termPairWithOperation[columns] )* 
loop31	TokenNameIdentifier	 loop31
:	TokenNameCOLON	
do	TokenNamedo	
{	TokenNameLBRACE	
int	TokenNameint	
alt31	TokenNameIdentifier	 alt31
=	TokenNameEQUAL	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
LA31_0	TokenNameIdentifier	 L A31 0
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
LA31_0	TokenNameIdentifier	 L A31 0
==	TokenNameEQUAL_EQUAL	
84	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
alt31	TokenNameIdentifier	 alt31
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
switch	TokenNameswitch	
(	TokenNameLPAREN	
alt31	TokenNameIdentifier	 alt31
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
1	TokenNameIntegerLiteral	
:	TokenNameCOLON	
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql/Cql.g:319:49: ',' termPairWithOperation[columns] 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql/Cql.g:319:49: ',' termPairWithOperation[columns] 
{	TokenNameLBRACE	
match	TokenNameIdentifier	 match
(	TokenNameLPAREN	
input	TokenNameIdentifier	 input
,	TokenNameCOMMA	
84	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
FOLLOW_84_in_updateStatement1314	TokenNameIdentifier	 FOLLOW 84 in update Statement1314
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
pushFollow	TokenNameIdentifier	 push Follow
(	TokenNameLPAREN	
FOLLOW_termPairWithOperation_in_updateStatement1316	TokenNameIdentifier	 FOLLOW term Pair With Operation in update Statement1316
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
termPairWithOperation	TokenNameIdentifier	 term Pair With Operation
(	TokenNameLPAREN	
columns	TokenNameIdentifier	 columns
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
_fsp	TokenNameIdentifier	 fsp
--	TokenNameMINUS_MINUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
default	TokenNamedefault	
:	TokenNameCOLON	
break	TokenNamebreak	
loop31	TokenNameIdentifier	 loop31
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
input	TokenNameIdentifier	 input
,	TokenNameCOMMA	
K_WHERE	TokenNameIdentifier	 K  WHERE
,	TokenNameCOMMA	
FOLLOW_K_WHERE_in_updateStatement1331	TokenNameIdentifier	 FOLLOW  K  WHERE in update Statement1331
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql/Cql.g:320:19: (key_alias= term ( '=' key= term | K_IN '(' keys= termList ')' ) ) 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql/Cql.g:320:19: (key_alias= term ( '=' key= term | K_IN '(' keys= termList ')' ) ) 
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql/Cql.g:320:21: key_alias= term ( '=' key= term | K_IN '(' keys= termList ')' ) 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql/Cql.g:320:21: key_alias= term ( '=' key= term | K_IN '(' keys= termList ')' ) 
{	TokenNameLBRACE	
pushFollow	TokenNameIdentifier	 push Follow
(	TokenNameLPAREN	
FOLLOW_term_in_updateStatement1337	TokenNameIdentifier	 FOLLOW term in update Statement1337
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
key_alias	TokenNameIdentifier	 key alias
=	TokenNameEQUAL	
term	TokenNameIdentifier	 term
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
_fsp	TokenNameIdentifier	 fsp
--	TokenNameMINUS_MINUS	
;	TokenNameSEMICOLON	
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql/Cql.g:320:36: ( '=' key= term | K_IN '(' keys= termList ')' ) 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql/Cql.g:320:36: ( '=' key= term | K_IN '(' keys= termList ')' ) 
int	TokenNameint	
alt32	TokenNameIdentifier	 alt32
=	TokenNameEQUAL	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
LA32_0	TokenNameIdentifier	 L A32 0
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
LA32_0	TokenNameIdentifier	 L A32 0
==	TokenNameEQUAL_EQUAL	
87	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
alt32	TokenNameIdentifier	 alt32
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
LA32_0	TokenNameIdentifier	 L A32 0
==	TokenNameEQUAL_EQUAL	
K_IN	TokenNameIdentifier	 K  IN
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
alt32	TokenNameIdentifier	 alt32
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
32	TokenNameIntegerLiteral	
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
alt32	TokenNameIdentifier	 alt32
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
1	TokenNameIntegerLiteral	
:	TokenNameCOLON	
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql/Cql.g:320:37: '=' key= term 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql/Cql.g:320:37: '=' key= term 
{	TokenNameLBRACE	
match	TokenNameIdentifier	 match
(	TokenNameLPAREN	
input	TokenNameIdentifier	 input
,	TokenNameCOMMA	
87	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
FOLLOW_87_in_updateStatement1340	TokenNameIdentifier	 FOLLOW 87 in update Statement1340
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
pushFollow	TokenNameIdentifier	 push Follow
(	TokenNameLPAREN	
FOLLOW_term_in_updateStatement1344	TokenNameIdentifier	 FOLLOW term in update Statement1344
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
key	TokenNameIdentifier	 key
=	TokenNameEQUAL	
term	TokenNameIdentifier	 term
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
_fsp	TokenNameIdentifier	 fsp
--	TokenNameMINUS_MINUS	
;	TokenNameSEMICOLON	
keyList	TokenNameIdentifier	 key List
=	TokenNameEQUAL	
Collections	TokenNameIdentifier	 Collections
.	TokenNameDOT	
singletonList	TokenNameIdentifier	 singleton List
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
2	TokenNameIntegerLiteral	
:	TokenNameCOLON	
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql/Cql.g:322:37: K_IN '(' keys= termList ')' 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql/Cql.g:322:37: K_IN '(' keys= termList ')' 
{	TokenNameLBRACE	
match	TokenNameIdentifier	 match
(	TokenNameLPAREN	
input	TokenNameIdentifier	 input
,	TokenNameCOMMA	
K_IN	TokenNameIdentifier	 K  IN
,	TokenNameCOMMA	
FOLLOW_K_IN_in_updateStatement1422	TokenNameIdentifier	 FOLLOW  K  IN in update Statement1422
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
match	TokenNameIdentifier	 match
(	TokenNameLPAREN	
input	TokenNameIdentifier	 input
,	TokenNameCOMMA	
81	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
FOLLOW_81_in_updateStatement1424	TokenNameIdentifier	 FOLLOW 81 in update Statement1424
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
pushFollow	TokenNameIdentifier	 push Follow
(	TokenNameLPAREN	
FOLLOW_termList_in_updateStatement1428	TokenNameIdentifier	 FOLLOW term List in update Statement1428
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
keys	TokenNameIdentifier	 keys
=	TokenNameEQUAL	
termList	TokenNameIdentifier	 term List
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
_fsp	TokenNameIdentifier	 fsp
--	TokenNameMINUS_MINUS	
;	TokenNameSEMICOLON	
keyList	TokenNameIdentifier	 key List
=	TokenNameEQUAL	
keys	TokenNameIdentifier	 keys
;	TokenNameSEMICOLON	
match	TokenNameIdentifier	 match
(	TokenNameLPAREN	
input	TokenNameIdentifier	 input
,	TokenNameCOMMA	
82	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
FOLLOW_82_in_updateStatement1432	TokenNameIdentifier	 FOLLOW 82 in update Statement1432
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
new	TokenNamenew	
UpdateStatement	TokenNameIdentifier	 Update Statement
(	TokenNameLPAREN	
(	TokenNameLPAREN	
keyspace	TokenNameIdentifier	 keyspace
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
?	TokenNameQUESTION	
keyspace	TokenNameIdentifier	 keyspace
.	TokenNameDOT	
getText	TokenNameIdentifier	 get Text
(	TokenNameLPAREN	
)	TokenNameRPAREN	
:	TokenNameCOLON	
null	TokenNamenull	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
(	TokenNameLPAREN	
columnFamily	TokenNameIdentifier	 column Family
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
?	TokenNameQUESTION	
columnFamily	TokenNameIdentifier	 column Family
.	TokenNameDOT	
getText	TokenNameIdentifier	 get Text
(	TokenNameLPAREN	
)	TokenNameRPAREN	
:	TokenNameCOLON	
null	TokenNamenull	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
key_alias	TokenNameIdentifier	 key alias
.	TokenNameDOT	
getText	TokenNameIdentifier	 get Text
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
columns	TokenNameIdentifier	 columns
,	TokenNameCOMMA	
keyList	TokenNameIdentifier	 key List
,	TokenNameCOMMA	
attrs	TokenNameIdentifier	 attrs
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
RecognitionException	TokenNameIdentifier	 Recognition Exception
re	TokenNameIdentifier	 re
)	TokenNameRPAREN	
{	TokenNameLBRACE	
reportError	TokenNameIdentifier	 report Error
(	TokenNameLPAREN	
re	TokenNameIdentifier	 re
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
recover	TokenNameIdentifier	 recover
(	TokenNameLPAREN	
input	TokenNameIdentifier	 input
,	TokenNameCOMMA	
re	TokenNameIdentifier	 re
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
finally	TokenNamefinally	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
expr	TokenNameIdentifier	 expr
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// $ANTLR end "updateStatement" 	TokenNameCOMMENT_LINE	$ANTLR end "updateStatement" 
// $ANTLR start "deleteStatement" 	TokenNameCOMMENT_LINE	$ANTLR start "deleteStatement" 
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql/Cql.g:328:1: deleteStatement returns [DeleteStatement expr] : K_DELETE (cols= termList )? K_FROM (keyspace= ( IDENT | STRING_LITERAL | INTEGER ) '.' )? columnFamily= ( IDENT | STRING_LITERAL | INTEGER ) ( usingClauseDelete[attrs] )? ( K_WHERE key_alias= term ( '=' key= term | K_IN '(' keys= termList ')' ) )? ; 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql/Cql.g:328:1: deleteStatement returns [DeleteStatement expr] : K_DELETE (cols= termList )? K_FROM (keyspace= ( IDENT | STRING_LITERAL | INTEGER ) '.' )? columnFamily= ( IDENT | STRING_LITERAL | INTEGER ) ( usingClauseDelete[attrs] )? ( K_WHERE key_alias= term ( '=' key= term | K_IN '(' keys= termList ')' ) )? ; 
public	TokenNamepublic	
final	TokenNamefinal	
DeleteStatement	TokenNameIdentifier	 Delete Statement
deleteStatement	TokenNameIdentifier	 delete Statement
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
RecognitionException	TokenNameIdentifier	 Recognition Exception
{	TokenNameLBRACE	
DeleteStatement	TokenNameIdentifier	 Delete Statement
expr	TokenNameIdentifier	 expr
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
Token	TokenNameIdentifier	 Token
keyspace	TokenNameIdentifier	 keyspace
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
Token	TokenNameIdentifier	 Token
columnFamily	TokenNameIdentifier	 column Family
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
Term	TokenNameIdentifier	 Term
>	TokenNameGREATER	
cols	TokenNameIdentifier	 cols
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
Term	TokenNameIdentifier	 Term
key_alias	TokenNameIdentifier	 key alias
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
Term	TokenNameIdentifier	 Term
key	TokenNameIdentifier	 key
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
Term	TokenNameIdentifier	 Term
>	TokenNameGREATER	
keys	TokenNameIdentifier	 keys
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql/Cql.g:339:5: ( K_DELETE (cols= termList )? K_FROM (keyspace= ( IDENT | STRING_LITERAL | INTEGER ) '.' )? columnFamily= ( IDENT | STRING_LITERAL | INTEGER ) ( usingClauseDelete[attrs] )? ( K_WHERE key_alias= term ( '=' key= term | K_IN '(' keys= termList ')' ) )? ) 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql/Cql.g:339:5: ( K_DELETE (cols= termList )? K_FROM (keyspace= ( IDENT | STRING_LITERAL | INTEGER ) '.' )? columnFamily= ( IDENT | STRING_LITERAL | INTEGER ) ( usingClauseDelete[attrs] )? ( K_WHERE key_alias= term ( '=' key= term | K_IN '(' keys= termList ')' ) )? ) 
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql/Cql.g:339:7: K_DELETE (cols= termList )? K_FROM (keyspace= ( IDENT | STRING_LITERAL | INTEGER ) '.' )? columnFamily= ( IDENT | STRING_LITERAL | INTEGER ) ( usingClauseDelete[attrs] )? ( K_WHERE key_alias= term ( '=' key= term | K_IN '(' keys= termList ')' ) )? 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql/Cql.g:339:7: K_DELETE (cols= termList )? K_FROM (keyspace= ( IDENT | STRING_LITERAL | INTEGER ) '.' )? columnFamily= ( IDENT | STRING_LITERAL | INTEGER ) ( usingClauseDelete[attrs] )? ( K_WHERE key_alias= term ( '=' key= term | K_IN '(' keys= termList ')' ) )? 
{	TokenNameLBRACE	
Attributes	TokenNameIdentifier	 Attributes
attrs	TokenNameIdentifier	 attrs
=	TokenNameEQUAL	
new	TokenNamenew	
Attributes	TokenNameIdentifier	 Attributes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
Term	TokenNameIdentifier	 Term
>	TokenNameGREATER	
keyList	TokenNameIdentifier	 key List
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
Term	TokenNameIdentifier	 Term
>	TokenNameGREATER	
columnsList	TokenNameIdentifier	 columns List
=	TokenNameEQUAL	
Collections	TokenNameIdentifier	 Collections
.	TokenNameDOT	
emptyList	TokenNameIdentifier	 empty List
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
match	TokenNameIdentifier	 match
(	TokenNameLPAREN	
input	TokenNameIdentifier	 input
,	TokenNameCOMMA	
K_DELETE	TokenNameIdentifier	 K  DELETE
,	TokenNameCOMMA	
FOLLOW_K_DELETE_in_deleteStatement1474	TokenNameIdentifier	 FOLLOW  K  DELETE in delete Statement1474
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql/Cql.g:345:11: (cols= termList )? 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql/Cql.g:345:11: (cols= termList )? 
int	TokenNameint	
alt33	TokenNameIdentifier	 alt33
=	TokenNameEQUAL	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
LA33_0	TokenNameIdentifier	 L A33 0
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
LA33_0	TokenNameIdentifier	 L A33 0
>=	TokenNameGREATER_EQUAL	
IDENT	TokenNameIdentifier	 IDENT
&&	TokenNameAND_AND	
LA33_0	TokenNameIdentifier	 L A33 0
<=	TokenNameLESS_EQUAL	
STRING_LITERAL	TokenNameIdentifier	 STRING  LITERAL
)	TokenNameRPAREN	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
LA33_0	TokenNameIdentifier	 L A33 0
>=	TokenNameGREATER_EQUAL	
K_KEY	TokenNameIdentifier	 K  KEY
&&	TokenNameAND_AND	
LA33_0	TokenNameIdentifier	 L A33 0
<=	TokenNameLESS_EQUAL	
FLOAT	TokenNameIdentifier	 FLOAT
)	TokenNameRPAREN	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
LA33_0	TokenNameIdentifier	 L A33 0
>=	TokenNameGREATER_EQUAL	
UUID	TokenNameIdentifier	 UUID
&&	TokenNameAND_AND	
LA33_0	TokenNameIdentifier	 L A33 0
<=	TokenNameLESS_EQUAL	
QMARK	TokenNameIdentifier	 QMARK
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
alt33	TokenNameIdentifier	 alt33
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
switch	TokenNameswitch	
(	TokenNameLPAREN	
alt33	TokenNameIdentifier	 alt33
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
1	TokenNameIntegerLiteral	
:	TokenNameCOLON	
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql/Cql.g:345:13: cols= termList 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql/Cql.g:345:13: cols= termList 
{	TokenNameLBRACE	
pushFollow	TokenNameIdentifier	 push Follow
(	TokenNameLPAREN	
FOLLOW_termList_in_deleteStatement1490	TokenNameIdentifier	 FOLLOW term List in delete Statement1490
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
cols	TokenNameIdentifier	 cols
=	TokenNameEQUAL	
termList	TokenNameIdentifier	 term List
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
_fsp	TokenNameIdentifier	 fsp
--	TokenNameMINUS_MINUS	
;	TokenNameSEMICOLON	
columnsList	TokenNameIdentifier	 columns List
=	TokenNameEQUAL	
cols	TokenNameIdentifier	 cols
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
match	TokenNameIdentifier	 match
(	TokenNameLPAREN	
input	TokenNameIdentifier	 input
,	TokenNameCOMMA	
K_FROM	TokenNameIdentifier	 K  FROM
,	TokenNameCOMMA	
FOLLOW_K_FROM_in_deleteStatement1506	TokenNameIdentifier	 FOLLOW  K  FROM in delete Statement1506
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql/Cql.g:346:18: (keyspace= ( IDENT | STRING_LITERAL | INTEGER ) '.' )? 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql/Cql.g:346:18: (keyspace= ( IDENT | STRING_LITERAL | INTEGER ) '.' )? 
int	TokenNameint	
alt34	TokenNameIdentifier	 alt34
=	TokenNameEQUAL	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
LA34_0	TokenNameIdentifier	 L A34 0
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
LA34_0	TokenNameIdentifier	 L A34 0
>=	TokenNameGREATER_EQUAL	
IDENT	TokenNameIdentifier	 IDENT
&&	TokenNameAND_AND	
LA34_0	TokenNameIdentifier	 L A34 0
<=	TokenNameLESS_EQUAL	
STRING_LITERAL	TokenNameIdentifier	 STRING  LITERAL
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
LA34_1	TokenNameIdentifier	 L A34 1
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
LA34_1	TokenNameIdentifier	 L A34 1
==	TokenNameEQUAL_EQUAL	
83	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
alt34	TokenNameIdentifier	 alt34
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
switch	TokenNameswitch	
(	TokenNameLPAREN	
alt34	TokenNameIdentifier	 alt34
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
1	TokenNameIntegerLiteral	
:	TokenNameCOLON	
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql/Cql.g:346:19: keyspace= ( IDENT | STRING_LITERAL | INTEGER ) '.' 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql/Cql.g:346:19: keyspace= ( IDENT | STRING_LITERAL | INTEGER ) '.' 
{	TokenNameLBRACE	
keyspace	TokenNameIdentifier	 keyspace
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Token	TokenNameIdentifier	 Token
)	TokenNameRPAREN	
input	TokenNameIdentifier	 input
.	TokenNameDOT	
LT	TokenNameIdentifier	 LT
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
IDENT	TokenNameIdentifier	 IDENT
&&	TokenNameAND_AND	
input	TokenNameIdentifier	 input
.	TokenNameDOT	
LA	TokenNameIdentifier	 LA
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
<=	TokenNameLESS_EQUAL	
STRING_LITERAL	TokenNameIdentifier	 STRING  LITERAL
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
input	TokenNameIdentifier	 input
.	TokenNameDOT	
consume	TokenNameIdentifier	 consume
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
errorRecovery	TokenNameIdentifier	 error Recovery
=	TokenNameEQUAL	
false	TokenNamefalse	
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
throw	TokenNamethrow	
mse	TokenNameIdentifier	 mse
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
match	TokenNameIdentifier	 match
(	TokenNameLPAREN	
input	TokenNameIdentifier	 input
,	TokenNameCOMMA	
83	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
FOLLOW_83_in_deleteStatement1523	TokenNameIdentifier	 FOLLOW 83 in delete Statement1523
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
columnFamily	TokenNameIdentifier	 column Family
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Token	TokenNameIdentifier	 Token
)	TokenNameRPAREN	
input	TokenNameIdentifier	 input
.	TokenNameDOT	
LT	TokenNameIdentifier	 LT
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
IDENT	TokenNameIdentifier	 IDENT
&&	TokenNameAND_AND	
input	TokenNameIdentifier	 input
.	TokenNameDOT	
LA	TokenNameIdentifier	 LA
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
<=	TokenNameLESS_EQUAL	
STRING_LITERAL	TokenNameIdentifier	 STRING  LITERAL
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
input	TokenNameIdentifier	 input
.	TokenNameDOT	
consume	TokenNameIdentifier	 consume
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
errorRecovery	TokenNameIdentifier	 error Recovery
=	TokenNameEQUAL	
false	TokenNamefalse	
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
throw	TokenNamethrow	
mse	TokenNameIdentifier	 mse
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql/Cql.g:347:11: ( usingClauseDelete[attrs] )? 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql/Cql.g:347:11: ( usingClauseDelete[attrs] )? 
int	TokenNameint	
alt35	TokenNameIdentifier	 alt35
=	TokenNameEQUAL	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
LA35_0	TokenNameIdentifier	 L A35 0
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
LA35_0	TokenNameIdentifier	 L A35 0
==	TokenNameEQUAL_EQUAL	
K_USING	TokenNameIdentifier	 K  USING
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
alt35	TokenNameIdentifier	 alt35
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
switch	TokenNameswitch	
(	TokenNameLPAREN	
alt35	TokenNameIdentifier	 alt35
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
1	TokenNameIntegerLiteral	
:	TokenNameCOLON	
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql/Cql.g:347:13: usingClauseDelete[attrs] 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql/Cql.g:347:13: usingClauseDelete[attrs] 
{	TokenNameLBRACE	
pushFollow	TokenNameIdentifier	 push Follow
(	TokenNameLPAREN	
FOLLOW_usingClauseDelete_in_deleteStatement1555	TokenNameIdentifier	 FOLLOW using Clause Delete in delete Statement1555
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
usingClauseDelete	TokenNameIdentifier	 using Clause Delete
(	TokenNameLPAREN	
attrs	TokenNameIdentifier	 attrs
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
_fsp	TokenNameIdentifier	 fsp
--	TokenNameMINUS_MINUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql/Cql.g:348:11: ( K_WHERE key_alias= term ( '=' key= term | K_IN '(' keys= termList ')' ) )? 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql/Cql.g:348:11: ( K_WHERE key_alias= term ( '=' key= term | K_IN '(' keys= termList ')' ) )? 
int	TokenNameint	
alt37	TokenNameIdentifier	 alt37
=	TokenNameEQUAL	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
LA37_0	TokenNameIdentifier	 L A37 0
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
LA37_0	TokenNameIdentifier	 L A37 0
==	TokenNameEQUAL_EQUAL	
K_WHERE	TokenNameIdentifier	 K  WHERE
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
alt37	TokenNameIdentifier	 alt37
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
switch	TokenNameswitch	
(	TokenNameLPAREN	
alt37	TokenNameIdentifier	 alt37
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
1	TokenNameIntegerLiteral	
:	TokenNameCOLON	
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql/Cql.g:348:13: K_WHERE key_alias= term ( '=' key= term | K_IN '(' keys= termList ')' ) 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql/Cql.g:348:13: K_WHERE key_alias= term ( '=' key= term | K_IN '(' keys= termList ')' ) 
{	TokenNameLBRACE	
match	TokenNameIdentifier	 match
(	TokenNameLPAREN	
input	TokenNameIdentifier	 input
,	TokenNameCOMMA	
K_WHERE	TokenNameIdentifier	 K  WHERE
,	TokenNameCOMMA	
FOLLOW_K_WHERE_in_deleteStatement1573	TokenNameIdentifier	 FOLLOW  K  WHERE in delete Statement1573
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
pushFollow	TokenNameIdentifier	 push Follow
(	TokenNameLPAREN	
FOLLOW_term_in_deleteStatement1577	TokenNameIdentifier	 FOLLOW term in delete Statement1577
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
key_alias	TokenNameIdentifier	 key alias
=	TokenNameEQUAL	
term	TokenNameIdentifier	 term
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
_fsp	TokenNameIdentifier	 fsp
--	TokenNameMINUS_MINUS	
;	TokenNameSEMICOLON	
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql/Cql.g:348:36: ( '=' key= term | K_IN '(' keys= termList ')' ) 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql/Cql.g:348:36: ( '=' key= term | K_IN '(' keys= termList ')' ) 
int	TokenNameint	
alt36	TokenNameIdentifier	 alt36
=	TokenNameEQUAL	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
LA36_0	TokenNameIdentifier	 L A36 0
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
LA36_0	TokenNameIdentifier	 L A36 0
==	TokenNameEQUAL_EQUAL	
87	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
alt36	TokenNameIdentifier	 alt36
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
LA36_0	TokenNameIdentifier	 L A36 0
==	TokenNameEQUAL_EQUAL	
K_IN	TokenNameIdentifier	 K  IN
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
alt36	TokenNameIdentifier	 alt36
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
36	TokenNameIntegerLiteral	
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
alt36	TokenNameIdentifier	 alt36
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
1	TokenNameIntegerLiteral	
:	TokenNameCOLON	
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql/Cql.g:348:37: '=' key= term 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql/Cql.g:348:37: '=' key= term 
{	TokenNameLBRACE	
match	TokenNameIdentifier	 match
(	TokenNameLPAREN	
input	TokenNameIdentifier	 input
,	TokenNameCOMMA	
87	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
FOLLOW_87_in_deleteStatement1580	TokenNameIdentifier	 FOLLOW 87 in delete Statement1580
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
pushFollow	TokenNameIdentifier	 push Follow
(	TokenNameLPAREN	
FOLLOW_term_in_deleteStatement1584	TokenNameIdentifier	 FOLLOW term in delete Statement1584
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
key	TokenNameIdentifier	 key
=	TokenNameEQUAL	
term	TokenNameIdentifier	 term
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
_fsp	TokenNameIdentifier	 fsp
--	TokenNameMINUS_MINUS	
;	TokenNameSEMICOLON	
keyList	TokenNameIdentifier	 key List
=	TokenNameEQUAL	
Collections	TokenNameIdentifier	 Collections
.	TokenNameDOT	
singletonList	TokenNameIdentifier	 singleton List
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
2	TokenNameIntegerLiteral	
:	TokenNameCOLON	
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql/Cql.g:349:38: K_IN '(' keys= termList ')' 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql/Cql.g:349:38: K_IN '(' keys= termList ')' 
{	TokenNameLBRACE	
match	TokenNameIdentifier	 match
(	TokenNameLPAREN	
input	TokenNameIdentifier	 input
,	TokenNameCOMMA	
K_IN	TokenNameIdentifier	 K  IN
,	TokenNameCOMMA	
FOLLOW_K_IN_in_deleteStatement1635	TokenNameIdentifier	 FOLLOW  K  IN in delete Statement1635
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
match	TokenNameIdentifier	 match
(	TokenNameLPAREN	
input	TokenNameIdentifier	 input
,	TokenNameCOMMA	
81	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
FOLLOW_81_in_deleteStatement1637	TokenNameIdentifier	 FOLLOW 81 in delete Statement1637
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
pushFollow	TokenNameIdentifier	 push Follow
(	TokenNameLPAREN	
FOLLOW_termList_in_deleteStatement1641	TokenNameIdentifier	 FOLLOW term List in delete Statement1641
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
keys	TokenNameIdentifier	 keys
=	TokenNameEQUAL	
termList	TokenNameIdentifier	 term List
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
_fsp	TokenNameIdentifier	 fsp
--	TokenNameMINUS_MINUS	
;	TokenNameSEMICOLON	
keyList	TokenNameIdentifier	 key List
=	TokenNameEQUAL	
keys	TokenNameIdentifier	 keys
;	TokenNameSEMICOLON	
match	TokenNameIdentifier	 match
(	TokenNameLPAREN	
input	TokenNameIdentifier	 input
,	TokenNameCOMMA	
82	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
FOLLOW_82_in_deleteStatement1645	TokenNameIdentifier	 FOLLOW 82 in delete Statement1645
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
new	TokenNamenew	
DeleteStatement	TokenNameIdentifier	 Delete Statement
(	TokenNameLPAREN	
columnsList	TokenNameIdentifier	 columns List
,	TokenNameCOMMA	
(	TokenNameLPAREN	
keyspace	TokenNameIdentifier	 keyspace
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
?	TokenNameQUESTION	
keyspace	TokenNameIdentifier	 keyspace
.	TokenNameDOT	
getText	TokenNameIdentifier	 get Text
(	TokenNameLPAREN	
)	TokenNameRPAREN	
:	TokenNameCOLON	
null	TokenNamenull	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
(	TokenNameLPAREN	
columnFamily	TokenNameIdentifier	 column Family
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
?	TokenNameQUESTION	
columnFamily	TokenNameIdentifier	 column Family
.	TokenNameDOT	
getText	TokenNameIdentifier	 get Text
(	TokenNameLPAREN	
)	TokenNameRPAREN	
:	TokenNameCOLON	
null	TokenNamenull	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
key_alias	TokenNameIdentifier	 key alias
.	TokenNameDOT	
getText	TokenNameIdentifier	 get Text
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
keyList	TokenNameIdentifier	 key List
,	TokenNameCOMMA	
attrs	TokenNameIdentifier	 attrs
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
RecognitionException	TokenNameIdentifier	 Recognition Exception
re	TokenNameIdentifier	 re
)	TokenNameRPAREN	
{	TokenNameLBRACE	
reportError	TokenNameIdentifier	 report Error
(	TokenNameLPAREN	
re	TokenNameIdentifier	 re
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
recover	TokenNameIdentifier	 recover
(	TokenNameLPAREN	
input	TokenNameIdentifier	 input
,	TokenNameCOMMA	
re	TokenNameIdentifier	 re
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
finally	TokenNamefinally	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
expr	TokenNameIdentifier	 expr
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// $ANTLR end "deleteStatement" 	TokenNameCOMMENT_LINE	$ANTLR end "deleteStatement" 
// $ANTLR start "createKeyspaceStatement" 	TokenNameCOMMENT_LINE	$ANTLR start "createKeyspaceStatement" 
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql/Cql.g:358:1: createKeyspaceStatement returns [CreateKeyspaceStatement expr] : K_CREATE K_KEYSPACE keyspace= ( IDENT | STRING_LITERAL | INTEGER ) K_WITH a1= ( COMPIDENT | IDENT ) '=' v1= ( STRING_LITERAL | INTEGER | IDENT ) ( K_AND aN= ( COMPIDENT | IDENT ) '=' vN= ( STRING_LITERAL | INTEGER | IDENT ) )* endStmnt ; 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql/Cql.g:358:1: createKeyspaceStatement returns [CreateKeyspaceStatement expr] : K_CREATE K_KEYSPACE keyspace= ( IDENT | STRING_LITERAL | INTEGER ) K_WITH a1= ( COMPIDENT | IDENT ) '=' v1= ( STRING_LITERAL | INTEGER | IDENT ) ( K_AND aN= ( COMPIDENT | IDENT ) '=' vN= ( STRING_LITERAL | INTEGER | IDENT ) )* endStmnt ; 
public	TokenNamepublic	
final	TokenNamefinal	
CreateKeyspaceStatement	TokenNameIdentifier	 Create Keyspace Statement
createKeyspaceStatement	TokenNameIdentifier	 create Keyspace Statement
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
RecognitionException	TokenNameIdentifier	 Recognition Exception
{	TokenNameLBRACE	
CreateKeyspaceStatement	TokenNameIdentifier	 Create Keyspace Statement
expr	TokenNameIdentifier	 expr
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
Token	TokenNameIdentifier	 Token
keyspace	TokenNameIdentifier	 keyspace
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
Token	TokenNameIdentifier	 Token
a1	TokenNameIdentifier	 a1
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
Token	TokenNameIdentifier	 Token
v1	TokenNameIdentifier	 v1
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
Token	TokenNameIdentifier	 Token
aN	TokenNameIdentifier	 a N
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
Token	TokenNameIdentifier	 Token
vN	TokenNameIdentifier	 v N
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql/Cql.g:360:5: ( K_CREATE K_KEYSPACE keyspace= ( IDENT | STRING_LITERAL | INTEGER ) K_WITH a1= ( COMPIDENT | IDENT ) '=' v1= ( STRING_LITERAL | INTEGER | IDENT ) ( K_AND aN= ( COMPIDENT | IDENT ) '=' vN= ( STRING_LITERAL | INTEGER | IDENT ) )* endStmnt ) 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql/Cql.g:360:5: ( K_CREATE K_KEYSPACE keyspace= ( IDENT | STRING_LITERAL | INTEGER ) K_WITH a1= ( COMPIDENT | IDENT ) '=' v1= ( STRING_LITERAL | INTEGER | IDENT ) ( K_AND aN= ( COMPIDENT | IDENT ) '=' vN= ( STRING_LITERAL | INTEGER | IDENT ) )* endStmnt ) 
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql/Cql.g:360:7: K_CREATE K_KEYSPACE keyspace= ( IDENT | STRING_LITERAL | INTEGER ) K_WITH a1= ( COMPIDENT | IDENT ) '=' v1= ( STRING_LITERAL | INTEGER | IDENT ) ( K_AND aN= ( COMPIDENT | IDENT ) '=' vN= ( STRING_LITERAL | INTEGER | IDENT ) )* endStmnt 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql/Cql.g:360:7: K_CREATE K_KEYSPACE keyspace= ( IDENT | STRING_LITERAL | INTEGER ) K_WITH a1= ( COMPIDENT | IDENT ) '=' v1= ( STRING_LITERAL | INTEGER | IDENT ) ( K_AND aN= ( COMPIDENT | IDENT ) '=' vN= ( STRING_LITERAL | INTEGER | IDENT ) )* endStmnt 
{	TokenNameLBRACE	
Map	TokenNameIdentifier	 Map
<	TokenNameLESS	
String	TokenNameIdentifier	 String
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
attrs	TokenNameIdentifier	 attrs
=	TokenNameEQUAL	
new	TokenNamenew	
HashMap	TokenNameIdentifier	 Hash Map
<	TokenNameLESS	
String	TokenNameIdentifier	 String
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
match	TokenNameIdentifier	 match
(	TokenNameLPAREN	
input	TokenNameIdentifier	 input
,	TokenNameCOMMA	
K_CREATE	TokenNameIdentifier	 K  CREATE
,	TokenNameCOMMA	
FOLLOW_K_CREATE_in_createKeyspaceStatement1708	TokenNameIdentifier	 FOLLOW  K  CREATE in create Keyspace Statement1708
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
match	TokenNameIdentifier	 match
(	TokenNameLPAREN	
input	TokenNameIdentifier	 input
,	TokenNameCOMMA	
K_KEYSPACE	TokenNameIdentifier	 K  KEYSPACE
,	TokenNameCOMMA	
FOLLOW_K_KEYSPACE_in_createKeyspaceStatement1710	TokenNameIdentifier	 FOLLOW  K  KEYSPACE in create Keyspace Statement1710
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
keyspace	TokenNameIdentifier	 keyspace
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Token	TokenNameIdentifier	 Token
)	TokenNameRPAREN	
input	TokenNameIdentifier	 input
.	TokenNameDOT	
LT	TokenNameIdentifier	 LT
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
IDENT	TokenNameIdentifier	 IDENT
&&	TokenNameAND_AND	
input	TokenNameIdentifier	 input
.	TokenNameDOT	
LA	TokenNameIdentifier	 LA
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
<=	TokenNameLESS_EQUAL	
STRING_LITERAL	TokenNameIdentifier	 STRING  LITERAL
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
input	TokenNameIdentifier	 input
.	TokenNameDOT	
consume	TokenNameIdentifier	 consume
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
errorRecovery	TokenNameIdentifier	 error Recovery
=	TokenNameEQUAL	
false	TokenNamefalse	
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
throw	TokenNamethrow	
mse	TokenNameIdentifier	 mse
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
match	TokenNameIdentifier	 match
(	TokenNameLPAREN	
input	TokenNameIdentifier	 input
,	TokenNameCOMMA	
K_WITH	TokenNameIdentifier	 K  WITH
,	TokenNameCOMMA	
FOLLOW_K_WITH_in_createKeyspaceStatement1738	TokenNameIdentifier	 FOLLOW  K  WITH in create Keyspace Statement1738
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
a1	TokenNameIdentifier	 a1
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Token	TokenNameIdentifier	 Token
)	TokenNameRPAREN	
input	TokenNameIdentifier	 input
.	TokenNameDOT	
LT	TokenNameIdentifier	 LT
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
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
IDENT	TokenNameIdentifier	 IDENT
||	TokenNameOR_OR	
input	TokenNameIdentifier	 input
.	TokenNameDOT	
LA	TokenNameIdentifier	 LA
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
COMPIDENT	TokenNameIdentifier	 COMPIDENT
)	TokenNameRPAREN	
{	TokenNameLBRACE	
input	TokenNameIdentifier	 input
.	TokenNameDOT	
consume	TokenNameIdentifier	 consume
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
errorRecovery	TokenNameIdentifier	 error Recovery
=	TokenNameEQUAL	
false	TokenNamefalse	
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
throw	TokenNamethrow	
mse	TokenNameIdentifier	 mse
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
match	TokenNameIdentifier	 match
(	TokenNameLPAREN	
input	TokenNameIdentifier	 input
,	TokenNameCOMMA	
87	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
FOLLOW_87_in_createKeyspaceStatement1753	TokenNameIdentifier	 FOLLOW 87 in create Keyspace Statement1753
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
v1	TokenNameIdentifier	 v1
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Token	TokenNameIdentifier	 Token
)	TokenNameRPAREN	
input	TokenNameIdentifier	 input
.	TokenNameDOT	
LT	TokenNameIdentifier	 LT
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
IDENT	TokenNameIdentifier	 IDENT
&&	TokenNameAND_AND	
input	TokenNameIdentifier	 input
.	TokenNameDOT	
LA	TokenNameIdentifier	 LA
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
<=	TokenNameLESS_EQUAL	
STRING_LITERAL	TokenNameIdentifier	 STRING  LITERAL
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
input	TokenNameIdentifier	 input
.	TokenNameDOT	
consume	TokenNameIdentifier	 consume
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
errorRecovery	TokenNameIdentifier	 error Recovery
=	TokenNameEQUAL	
false	TokenNamefalse	
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
throw	TokenNamethrow	
mse	TokenNameIdentifier	 mse
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
attrs	TokenNameIdentifier	 attrs
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
(	TokenNameLPAREN	
a1	TokenNameIdentifier	 a1
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
?	TokenNameQUESTION	
a1	TokenNameIdentifier	 a1
.	TokenNameDOT	
getText	TokenNameIdentifier	 get Text
(	TokenNameLPAREN	
)	TokenNameRPAREN	
:	TokenNameCOLON	
null	TokenNamenull	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
(	TokenNameLPAREN	
v1	TokenNameIdentifier	 v1
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
?	TokenNameQUESTION	
v1	TokenNameIdentifier	 v1
.	TokenNameDOT	
getText	TokenNameIdentifier	 get Text
(	TokenNameLPAREN	
)	TokenNameRPAREN	
:	TokenNameCOLON	
null	TokenNamenull	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql/Cql.g:365:11: ( K_AND aN= ( COMPIDENT | IDENT ) '=' vN= ( STRING_LITERAL | INTEGER | IDENT ) )* 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql/Cql.g:365:11: ( K_AND aN= ( COMPIDENT | IDENT ) '=' vN= ( STRING_LITERAL | INTEGER | IDENT ) )* 
loop38	TokenNameIdentifier	 loop38
:	TokenNameCOLON	
do	TokenNamedo	
{	TokenNameLBRACE	
int	TokenNameint	
alt38	TokenNameIdentifier	 alt38
=	TokenNameEQUAL	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
LA38_0	TokenNameIdentifier	 L A38 0
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
LA38_0	TokenNameIdentifier	 L A38 0
==	TokenNameEQUAL_EQUAL	
K_AND	TokenNameIdentifier	 K  AND
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
alt38	TokenNameIdentifier	 alt38
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
switch	TokenNameswitch	
(	TokenNameLPAREN	
alt38	TokenNameIdentifier	 alt38
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
1	TokenNameIntegerLiteral	
:	TokenNameCOLON	
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql/Cql.g:365:13: K_AND aN= ( COMPIDENT | IDENT ) '=' vN= ( STRING_LITERAL | INTEGER | IDENT ) 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql/Cql.g:365:13: K_AND aN= ( COMPIDENT | IDENT ) '=' vN= ( STRING_LITERAL | INTEGER | IDENT ) 
{	TokenNameLBRACE	
match	TokenNameIdentifier	 match
(	TokenNameLPAREN	
input	TokenNameIdentifier	 input
,	TokenNameCOMMA	
K_AND	TokenNameIdentifier	 K  AND
,	TokenNameCOMMA	
FOLLOW_K_AND_in_createKeyspaceStatement1785	TokenNameIdentifier	 FOLLOW  K  AND in create Keyspace Statement1785
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
aN	TokenNameIdentifier	 a N
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Token	TokenNameIdentifier	 Token
)	TokenNameRPAREN	
input	TokenNameIdentifier	 input
.	TokenNameDOT	
LT	TokenNameIdentifier	 LT
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
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
IDENT	TokenNameIdentifier	 IDENT
||	TokenNameOR_OR	
input	TokenNameIdentifier	 input
.	TokenNameDOT	
LA	TokenNameIdentifier	 LA
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
COMPIDENT	TokenNameIdentifier	 COMPIDENT
)	TokenNameRPAREN	
{	TokenNameLBRACE	
input	TokenNameIdentifier	 input
.	TokenNameDOT	
consume	TokenNameIdentifier	 consume
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
errorRecovery	TokenNameIdentifier	 error Recovery
=	TokenNameEQUAL	
false	TokenNamefalse	
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
throw	TokenNamethrow	
mse	TokenNameIdentifier	 mse
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
match	TokenNameIdentifier	 match
(	TokenNameLPAREN	
input	TokenNameIdentifier	 input
,	TokenNameCOMMA	
87	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
FOLLOW_87_in_createKeyspaceStatement1799	TokenNameIdentifier	 FOLLOW 87 in create Keyspace Statement1799
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
vN	TokenNameIdentifier	 v N
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Token	TokenNameIdentifier	 Token
)	TokenNameRPAREN	
input	TokenNameIdentifier	 input
.	TokenNameDOT	
LT	TokenNameIdentifier	 LT
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
IDENT	TokenNameIdentifier	 IDENT
&&	TokenNameAND_AND	
input	TokenNameIdentifier	 input
.	TokenNameDOT	
LA	TokenNameIdentifier	 LA
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
<=	TokenNameLESS_EQUAL	
STRING_LITERAL	TokenNameIdentifier	 STRING  LITERAL
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
input	TokenNameIdentifier	 input
.	TokenNameDOT	
consume	TokenNameIdentifier	 consume
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
errorRecovery	TokenNameIdentifier	 error Recovery
=	TokenNameEQUAL	
false	TokenNamefalse	
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
throw	TokenNamethrow	
mse	TokenNameIdentifier	 mse
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
attrs	TokenNameIdentifier	 attrs
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
(	TokenNameLPAREN	
aN	TokenNameIdentifier	 a N
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
?	TokenNameQUESTION	
aN	TokenNameIdentifier	 a N
.	TokenNameDOT	
getText	TokenNameIdentifier	 get Text
(	TokenNameLPAREN	
)	TokenNameRPAREN	
:	TokenNameCOLON	
null	TokenNamenull	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
(	TokenNameLPAREN	
vN	TokenNameIdentifier	 v N
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
?	TokenNameQUESTION	
vN	TokenNameIdentifier	 v N
.	TokenNameDOT	
getText	TokenNameIdentifier	 get Text
(	TokenNameLPAREN	
)	TokenNameRPAREN	
:	TokenNameCOLON	
null	TokenNamenull	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
default	TokenNamedefault	
:	TokenNameCOLON	
break	TokenNamebreak	
loop38	TokenNameIdentifier	 loop38
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
while	TokenNamewhile	
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
pushFollow	TokenNameIdentifier	 push Follow
(	TokenNameLPAREN	
FOLLOW_endStmnt_in_createKeyspaceStatement1832	TokenNameIdentifier	 FOLLOW end Stmnt in create Keyspace Statement1832
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
endStmnt	TokenNameIdentifier	 end Stmnt
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
_fsp	TokenNameIdentifier	 fsp
--	TokenNameMINUS_MINUS	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
new	TokenNamenew	
CreateKeyspaceStatement	TokenNameIdentifier	 Create Keyspace Statement
(	TokenNameLPAREN	
(	TokenNameLPAREN	
keyspace	TokenNameIdentifier	 keyspace
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
?	TokenNameQUESTION	
keyspace	TokenNameIdentifier	 keyspace
.	TokenNameDOT	
getText	TokenNameIdentifier	 get Text
(	TokenNameLPAREN	
)	TokenNameRPAREN	
:	TokenNameCOLON	
null	TokenNamenull	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
attrs	TokenNameIdentifier	 attrs
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
RecognitionException	TokenNameIdentifier	 Recognition Exception
re	TokenNameIdentifier	 re
)	TokenNameRPAREN	
{	TokenNameLBRACE	
reportError	TokenNameIdentifier	 report Error
(	TokenNameLPAREN	
re	TokenNameIdentifier	 re
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
recover	TokenNameIdentifier	 recover
(	TokenNameLPAREN	
input	TokenNameIdentifier	 input
,	TokenNameCOMMA	
re	TokenNameIdentifier	 re
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
finally	TokenNamefinally	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
expr	TokenNameIdentifier	 expr
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// $ANTLR end "createKeyspaceStatement" 	TokenNameCOMMENT_LINE	$ANTLR end "createKeyspaceStatement" 
// $ANTLR start "createColumnFamilyStatement" 	TokenNameCOMMENT_LINE	$ANTLR start "createColumnFamilyStatement" 
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql/Cql.g:372:1: createColumnFamilyStatement returns [CreateColumnFamilyStatement expr] : K_CREATE K_COLUMNFAMILY name= ( IDENT | STRING_LITERAL | INTEGER ) ( '(' createCfamColumns[expr] ( ',' createCfamColumns[expr] )* ')' )? ( K_WITH prop1= ( COMPIDENT | IDENT ) '=' arg1= createCfamKeywordArgument ( K_AND propN= ( COMPIDENT | IDENT ) '=' argN= createCfamKeywordArgument )* )? endStmnt ; 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql/Cql.g:372:1: createColumnFamilyStatement returns [CreateColumnFamilyStatement expr] : K_CREATE K_COLUMNFAMILY name= ( IDENT | STRING_LITERAL | INTEGER ) ( '(' createCfamColumns[expr] ( ',' createCfamColumns[expr] )* ')' )? ( K_WITH prop1= ( COMPIDENT | IDENT ) '=' arg1= createCfamKeywordArgument ( K_AND propN= ( COMPIDENT | IDENT ) '=' argN= createCfamKeywordArgument )* )? endStmnt ; 
public	TokenNamepublic	
final	TokenNamefinal	
CreateColumnFamilyStatement	TokenNameIdentifier	 Create Column Family Statement
createColumnFamilyStatement	TokenNameIdentifier	 create Column Family Statement
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
RecognitionException	TokenNameIdentifier	 Recognition Exception
{	TokenNameLBRACE	
CreateColumnFamilyStatement	TokenNameIdentifier	 Create Column Family Statement
expr	TokenNameIdentifier	 expr
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
Token	TokenNameIdentifier	 Token
name	TokenNameIdentifier	 name
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
Token	TokenNameIdentifier	 Token
prop1	TokenNameIdentifier	 prop1
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
Token	TokenNameIdentifier	 Token
propN	TokenNameIdentifier	 prop N
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
arg1	TokenNameIdentifier	 arg1
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
argN	TokenNameIdentifier	 arg N
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql/Cql.g:380:5: ( K_CREATE K_COLUMNFAMILY name= ( IDENT | STRING_LITERAL | INTEGER ) ( '(' createCfamColumns[expr] ( ',' createCfamColumns[expr] )* ')' )? ( K_WITH prop1= ( COMPIDENT | IDENT ) '=' arg1= createCfamKeywordArgument ( K_AND propN= ( COMPIDENT | IDENT ) '=' argN= createCfamKeywordArgument )* )? endStmnt ) 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql/Cql.g:380:5: ( K_CREATE K_COLUMNFAMILY name= ( IDENT | STRING_LITERAL | INTEGER ) ( '(' createCfamColumns[expr] ( ',' createCfamColumns[expr] )* ')' )? ( K_WITH prop1= ( COMPIDENT | IDENT ) '=' arg1= createCfamKeywordArgument ( K_AND propN= ( COMPIDENT | IDENT ) '=' argN= createCfamKeywordArgument )* )? endStmnt ) 
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql/Cql.g:380:7: K_CREATE K_COLUMNFAMILY name= ( IDENT | STRING_LITERAL | INTEGER ) ( '(' createCfamColumns[expr] ( ',' createCfamColumns[expr] )* ')' )? ( K_WITH prop1= ( COMPIDENT | IDENT ) '=' arg1= createCfamKeywordArgument ( K_AND propN= ( COMPIDENT | IDENT ) '=' argN= createCfamKeywordArgument )* )? endStmnt 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql/Cql.g:380:7: K_CREATE K_COLUMNFAMILY name= ( IDENT | STRING_LITERAL | INTEGER ) ( '(' createCfamColumns[expr] ( ',' createCfamColumns[expr] )* ')' )? ( K_WITH prop1= ( COMPIDENT | IDENT ) '=' arg1= createCfamKeywordArgument ( K_AND propN= ( COMPIDENT | IDENT ) '=' argN= createCfamKeywordArgument )* )? endStmnt 
{	TokenNameLBRACE	
match	TokenNameIdentifier	 match
(	TokenNameLPAREN	
input	TokenNameIdentifier	 input
,	TokenNameCOMMA	
K_CREATE	TokenNameIdentifier	 K  CREATE
,	TokenNameCOMMA	
FOLLOW_K_CREATE_in_createColumnFamilyStatement1867	TokenNameIdentifier	 FOLLOW  K  CREATE in create Column Family Statement1867
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
match	TokenNameIdentifier	 match
(	TokenNameLPAREN	
input	TokenNameIdentifier	 input
,	TokenNameCOMMA	
K_COLUMNFAMILY	TokenNameIdentifier	 K  COLUMNFAMILY
,	TokenNameCOMMA	
FOLLOW_K_COLUMNFAMILY_in_createColumnFamilyStatement1869	TokenNameIdentifier	 FOLLOW  K  COLUMNFAMILY in create Column Family Statement1869
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
name	TokenNameIdentifier	 name
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Token	TokenNameIdentifier	 Token
)	TokenNameRPAREN	
input	TokenNameIdentifier	 input
.	TokenNameDOT	
LT	TokenNameIdentifier	 LT
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
IDENT	TokenNameIdentifier	 IDENT
&&	TokenNameAND_AND	
input	TokenNameIdentifier	 input
.	TokenNameDOT	
LA	TokenNameIdentifier	 LA
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
<=	TokenNameLESS_EQUAL	
STRING_LITERAL	TokenNameIdentifier	 STRING  LITERAL
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
input	TokenNameIdentifier	 input
.	TokenNameDOT	
consume	TokenNameIdentifier	 consume
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
errorRecovery	TokenNameIdentifier	 error Recovery
=	TokenNameEQUAL	
false	TokenNamefalse	
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
throw	TokenNamethrow	
mse	TokenNameIdentifier	 mse
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
expr	TokenNameIdentifier	 expr
=	TokenNameEQUAL	
new	TokenNamenew	
CreateColumnFamilyStatement	TokenNameIdentifier	 Create Column Family Statement
(	TokenNameLPAREN	
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
?	TokenNameQUESTION	
name	TokenNameIdentifier	 name
.	TokenNameDOT	
getText	TokenNameIdentifier	 get Text
(	TokenNameLPAREN	
)	TokenNameRPAREN	
:	TokenNameCOLON	
null	TokenNamenull	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql/Cql.g:381:7: ( '(' createCfamColumns[expr] ( ',' createCfamColumns[expr] )* ')' )? 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql/Cql.g:381:7: ( '(' createCfamColumns[expr] ( ',' createCfamColumns[expr] )* ')' )? 
int	TokenNameint	
alt40	TokenNameIdentifier	 alt40
=	TokenNameEQUAL	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
LA40_0	TokenNameIdentifier	 L A40 0
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
LA40_0	TokenNameIdentifier	 L A40 0
==	TokenNameEQUAL_EQUAL	
81	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
alt40	TokenNameIdentifier	 alt40
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
switch	TokenNameswitch	
(	TokenNameLPAREN	
alt40	TokenNameIdentifier	 alt40
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
1	TokenNameIntegerLiteral	
:	TokenNameCOLON	
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql/Cql.g:381:9: '(' createCfamColumns[expr] ( ',' createCfamColumns[expr] )* ')' 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql/Cql.g:381:9: '(' createCfamColumns[expr] ( ',' createCfamColumns[expr] )* ')' 
{	TokenNameLBRACE	
match	TokenNameIdentifier	 match
(	TokenNameLPAREN	
input	TokenNameIdentifier	 input
,	TokenNameCOMMA	
81	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
FOLLOW_81_in_createColumnFamilyStatement1897	TokenNameIdentifier	 FOLLOW 81 in create Column Family Statement1897
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
pushFollow	TokenNameIdentifier	 push Follow
(	TokenNameLPAREN	
FOLLOW_createCfamColumns_in_createColumnFamilyStatement1899	TokenNameIdentifier	 FOLLOW create Cfam Columns in create Column Family Statement1899
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
createCfamColumns	TokenNameIdentifier	 create Cfam Columns
(	TokenNameLPAREN	
expr	TokenNameIdentifier	 expr
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
_fsp	TokenNameIdentifier	 fsp
--	TokenNameMINUS_MINUS	
;	TokenNameSEMICOLON	
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql/Cql.g:381:37: ( ',' createCfamColumns[expr] )* 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql/Cql.g:381:37: ( ',' createCfamColumns[expr] )* 
loop39	TokenNameIdentifier	 loop39
:	TokenNameCOLON	
do	TokenNamedo	
{	TokenNameLBRACE	
int	TokenNameint	
alt39	TokenNameIdentifier	 alt39
=	TokenNameEQUAL	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
LA39_0	TokenNameIdentifier	 L A39 0
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
LA39_0	TokenNameIdentifier	 L A39 0
==	TokenNameEQUAL_EQUAL	
84	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
alt39	TokenNameIdentifier	 alt39
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
switch	TokenNameswitch	
(	TokenNameLPAREN	
alt39	TokenNameIdentifier	 alt39
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
1	TokenNameIntegerLiteral	
:	TokenNameCOLON	
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql/Cql.g:381:39: ',' createCfamColumns[expr] 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql/Cql.g:381:39: ',' createCfamColumns[expr] 
{	TokenNameLBRACE	
match	TokenNameIdentifier	 match
(	TokenNameLPAREN	
input	TokenNameIdentifier	 input
,	TokenNameCOMMA	
84	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
FOLLOW_84_in_createColumnFamilyStatement1904	TokenNameIdentifier	 FOLLOW 84 in create Column Family Statement1904
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
pushFollow	TokenNameIdentifier	 push Follow
(	TokenNameLPAREN	
FOLLOW_createCfamColumns_in_createColumnFamilyStatement1906	TokenNameIdentifier	 FOLLOW create Cfam Columns in create Column Family Statement1906
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
createCfamColumns	TokenNameIdentifier	 create Cfam Columns
(	TokenNameLPAREN	
expr	TokenNameIdentifier	 expr
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
_fsp	TokenNameIdentifier	 fsp
--	TokenNameMINUS_MINUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
default	TokenNamedefault	
:	TokenNameCOLON	
break	TokenNamebreak	
loop39	TokenNameIdentifier	 loop39
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
input	TokenNameIdentifier	 input
,	TokenNameCOMMA	
82	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
FOLLOW_82_in_createColumnFamilyStatement1912	TokenNameIdentifier	 FOLLOW 82 in create Column Family Statement1912
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql/Cql.g:382:7: ( K_WITH prop1= ( COMPIDENT | IDENT ) '=' arg1= createCfamKeywordArgument ( K_AND propN= ( COMPIDENT | IDENT ) '=' argN= createCfamKeywordArgument )* )? 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql/Cql.g:382:7: ( K_WITH prop1= ( COMPIDENT | IDENT ) '=' arg1= createCfamKeywordArgument ( K_AND propN= ( COMPIDENT | IDENT ) '=' argN= createCfamKeywordArgument )* )? 
int	TokenNameint	
alt42	TokenNameIdentifier	 alt42
=	TokenNameEQUAL	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
LA42_0	TokenNameIdentifier	 L A42 0
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
LA42_0	TokenNameIdentifier	 L A42 0
==	TokenNameEQUAL_EQUAL	
K_WITH	TokenNameIdentifier	 K  WITH
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
alt42	TokenNameIdentifier	 alt42
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
switch	TokenNameswitch	
(	TokenNameLPAREN	
alt42	TokenNameIdentifier	 alt42
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
1	TokenNameIntegerLiteral	
:	TokenNameCOLON	
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql/Cql.g:382:9: K_WITH prop1= ( COMPIDENT | IDENT ) '=' arg1= createCfamKeywordArgument ( K_AND propN= ( COMPIDENT | IDENT ) '=' argN= createCfamKeywordArgument )* 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql/Cql.g:382:9: K_WITH prop1= ( COMPIDENT | IDENT ) '=' arg1= createCfamKeywordArgument ( K_AND propN= ( COMPIDENT | IDENT ) '=' argN= createCfamKeywordArgument )* 
{	TokenNameLBRACE	
match	TokenNameIdentifier	 match
(	TokenNameLPAREN	
input	TokenNameIdentifier	 input
,	TokenNameCOMMA	
K_WITH	TokenNameIdentifier	 K  WITH
,	TokenNameCOMMA	
FOLLOW_K_WITH_in_createColumnFamilyStatement1925	TokenNameIdentifier	 FOLLOW  K  WITH in create Column Family Statement1925
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
prop1	TokenNameIdentifier	 prop1
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Token	TokenNameIdentifier	 Token
)	TokenNameRPAREN	
input	TokenNameIdentifier	 input
.	TokenNameDOT	
LT	TokenNameIdentifier	 LT
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
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
IDENT	TokenNameIdentifier	 IDENT
||	TokenNameOR_OR	
input	TokenNameIdentifier	 input
.	TokenNameDOT	
LA	TokenNameIdentifier	 LA
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
COMPIDENT	TokenNameIdentifier	 COMPIDENT
)	TokenNameRPAREN	
{	TokenNameLBRACE	
input	TokenNameIdentifier	 input
.	TokenNameDOT	
consume	TokenNameIdentifier	 consume
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
errorRecovery	TokenNameIdentifier	 error Recovery
=	TokenNameEQUAL	
false	TokenNamefalse	
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
throw	TokenNamethrow	
mse	TokenNameIdentifier	 mse
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
match	TokenNameIdentifier	 match
(	TokenNameLPAREN	
input	TokenNameIdentifier	 input
,	TokenNameCOMMA	
87	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
FOLLOW_87_in_createColumnFamilyStatement1937	TokenNameIdentifier	 FOLLOW 87 in create Column Family Statement1937
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
pushFollow	TokenNameIdentifier	 push Follow
(	TokenNameLPAREN	
FOLLOW_createCfamKeywordArgument_in_createColumnFamilyStatement1941	TokenNameIdentifier	 FOLLOW create Cfam Keyword Argument in create Column Family Statement1941
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
arg1	TokenNameIdentifier	 arg1
=	TokenNameEQUAL	
createCfamKeywordArgument	TokenNameIdentifier	 create Cfam Keyword Argument
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
_fsp	TokenNameIdentifier	 fsp
--	TokenNameMINUS_MINUS	
;	TokenNameSEMICOLON	
expr	TokenNameIdentifier	 expr
.	TokenNameDOT	
addProperty	TokenNameIdentifier	 add Property
(	TokenNameLPAREN	
(	TokenNameLPAREN	
prop1	TokenNameIdentifier	 prop1
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
?	TokenNameQUESTION	
prop1	TokenNameIdentifier	 prop1
.	TokenNameDOT	
getText	TokenNameIdentifier	 get Text
(	TokenNameLPAREN	
)	TokenNameRPAREN	
:	TokenNameCOLON	
null	TokenNamenull	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
arg1	TokenNameIdentifier	 arg1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql/Cql.g:383:11: ( K_AND propN= ( COMPIDENT | IDENT ) '=' argN= createCfamKeywordArgument )* 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql/Cql.g:383:11: ( K_AND propN= ( COMPIDENT | IDENT ) '=' argN= createCfamKeywordArgument )* 
loop41	TokenNameIdentifier	 loop41
:	TokenNameCOLON	
do	TokenNamedo	
{	TokenNameLBRACE	
int	TokenNameint	
alt41	TokenNameIdentifier	 alt41
=	TokenNameEQUAL	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
LA41_0	TokenNameIdentifier	 L A41 0
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
LA41_0	TokenNameIdentifier	 L A41 0
==	TokenNameEQUAL_EQUAL	
K_AND	TokenNameIdentifier	 K  AND
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
alt41	TokenNameIdentifier	 alt41
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
switch	TokenNameswitch	
(	TokenNameLPAREN	
alt41	TokenNameIdentifier	 alt41
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
1	TokenNameIntegerLiteral	
:	TokenNameCOLON	
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql/Cql.g:383:13: K_AND propN= ( COMPIDENT | IDENT ) '=' argN= createCfamKeywordArgument 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql/Cql.g:383:13: K_AND propN= ( COMPIDENT | IDENT ) '=' argN= createCfamKeywordArgument 
{	TokenNameLBRACE	
match	TokenNameIdentifier	 match
(	TokenNameLPAREN	
input	TokenNameIdentifier	 input
,	TokenNameCOMMA	
K_AND	TokenNameIdentifier	 K  AND
,	TokenNameCOMMA	
FOLLOW_K_AND_in_createColumnFamilyStatement1957	TokenNameIdentifier	 FOLLOW  K  AND in create Column Family Statement1957
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
propN	TokenNameIdentifier	 prop N
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Token	TokenNameIdentifier	 Token
)	TokenNameRPAREN	
input	TokenNameIdentifier	 input
.	TokenNameDOT	
LT	TokenNameIdentifier	 LT
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
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
IDENT	TokenNameIdentifier	 IDENT
||	TokenNameOR_OR	
input	TokenNameIdentifier	 input
.	TokenNameDOT	
LA	TokenNameIdentifier	 LA
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
COMPIDENT	TokenNameIdentifier	 COMPIDENT
)	TokenNameRPAREN	
{	TokenNameLBRACE	
input	TokenNameIdentifier	 input
.	TokenNameDOT	
consume	TokenNameIdentifier	 consume
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
errorRecovery	TokenNameIdentifier	 error Recovery
=	TokenNameEQUAL	
false	TokenNamefalse	
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
throw	TokenNamethrow	
mse	TokenNameIdentifier	 mse
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
match	TokenNameIdentifier	 match
(	TokenNameLPAREN	
input	TokenNameIdentifier	 input
,	TokenNameCOMMA	
87	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
FOLLOW_87_in_createColumnFamilyStatement1969	TokenNameIdentifier	 FOLLOW 87 in create Column Family Statement1969
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
pushFollow	TokenNameIdentifier	 push Follow
(	TokenNameLPAREN	
FOLLOW_createCfamKeywordArgument_in_createColumnFamilyStatement1973	TokenNameIdentifier	 FOLLOW create Cfam Keyword Argument in create Column Family Statement1973
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
argN	TokenNameIdentifier	 arg N
=	TokenNameEQUAL	
createCfamKeywordArgument	TokenNameIdentifier	 create Cfam Keyword Argument
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
_fsp	TokenNameIdentifier	 fsp
--	TokenNameMINUS_MINUS	
;	TokenNameSEMICOLON	
expr	TokenNameIdentifier	 expr
.	TokenNameDOT	
addProperty	TokenNameIdentifier	 add Property
(	TokenNameLPAREN	
(	TokenNameLPAREN	
propN	TokenNameIdentifier	 prop N
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
?	TokenNameQUESTION	
propN	TokenNameIdentifier	 prop N
.	TokenNameDOT	
getText	TokenNameIdentifier	 get Text
(	TokenNameLPAREN	
)	TokenNameRPAREN	
:	TokenNameCOLON	
null	TokenNamenull	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
argN	TokenNameIdentifier	 arg N
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
default	TokenNamedefault	
:	TokenNameCOLON	
break	TokenNamebreak	
loop41	TokenNameIdentifier	 loop41
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
while	TokenNamewhile	
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
pushFollow	TokenNameIdentifier	 push Follow
(	TokenNameLPAREN	
FOLLOW_endStmnt_in_createColumnFamilyStatement1995	TokenNameIdentifier	 FOLLOW end Stmnt in create Column Family Statement1995
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
endStmnt	TokenNameIdentifier	 end Stmnt
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
_fsp	TokenNameIdentifier	 fsp
--	TokenNameMINUS_MINUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
RecognitionException	TokenNameIdentifier	 Recognition Exception
re	TokenNameIdentifier	 re
)	TokenNameRPAREN	
{	TokenNameLBRACE	
reportError	TokenNameIdentifier	 report Error
(	TokenNameLPAREN	
re	TokenNameIdentifier	 re
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
recover	TokenNameIdentifier	 recover
(	TokenNameLPAREN	
input	TokenNameIdentifier	 input
,	TokenNameCOMMA	
re	TokenNameIdentifier	 re
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
finally	TokenNamefinally	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
expr	TokenNameIdentifier	 expr
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// $ANTLR end "createColumnFamilyStatement" 	TokenNameCOMMENT_LINE	$ANTLR end "createColumnFamilyStatement" 
// $ANTLR start "createCfamColumns" 	TokenNameCOMMENT_LINE	$ANTLR start "createCfamColumns" 
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql/Cql.g:388:1: createCfamColumns[CreateColumnFamilyStatement expr] : (n= term v= createCfamColumnValidator | k= term v= createCfamColumnValidator K_PRIMARY K_KEY ); 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql/Cql.g:388:1: createCfamColumns[CreateColumnFamilyStatement expr] : (n= term v= createCfamColumnValidator | k= term v= createCfamColumnValidator K_PRIMARY K_KEY ); 
public	TokenNamepublic	
final	TokenNamefinal	
void	TokenNamevoid	
createCfamColumns	TokenNameIdentifier	 create Cfam Columns
(	TokenNameLPAREN	
CreateColumnFamilyStatement	TokenNameIdentifier	 Create Column Family Statement
expr	TokenNameIdentifier	 expr
)	TokenNameRPAREN	
throws	TokenNamethrows	
RecognitionException	TokenNameIdentifier	 Recognition Exception
{	TokenNameLBRACE	
Term	TokenNameIdentifier	 Term
n	TokenNameIdentifier	 n
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
v	TokenNameIdentifier	 v
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
Term	TokenNameIdentifier	 Term
k	TokenNameIdentifier	 k
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql/Cql.g:389:5: (n= term v= createCfamColumnValidator | k= term v= createCfamColumnValidator K_PRIMARY K_KEY ) 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql/Cql.g:389:5: (n= term v= createCfamColumnValidator | k= term v= createCfamColumnValidator K_PRIMARY K_KEY ) 
int	TokenNameint	
alt43	TokenNameIdentifier	 alt43
=	TokenNameEQUAL	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
alt43	TokenNameIdentifier	 alt43
=	TokenNameEQUAL	
dfa43	TokenNameIdentifier	 dfa43
.	TokenNameDOT	
predict	TokenNameIdentifier	 predict
(	TokenNameLPAREN	
input	TokenNameIdentifier	 input
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
switch	TokenNameswitch	
(	TokenNameLPAREN	
alt43	TokenNameIdentifier	 alt43
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
1	TokenNameIntegerLiteral	
:	TokenNameCOLON	
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql/Cql.g:389:7: n= term v= createCfamColumnValidator 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql/Cql.g:389:7: n= term v= createCfamColumnValidator 
{	TokenNameLBRACE	
pushFollow	TokenNameIdentifier	 push Follow
(	TokenNameLPAREN	
FOLLOW_term_in_createCfamColumns2015	TokenNameIdentifier	 FOLLOW term in create Cfam Columns2015
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
n	TokenNameIdentifier	 n
=	TokenNameEQUAL	
term	TokenNameIdentifier	 term
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
_fsp	TokenNameIdentifier	 fsp
--	TokenNameMINUS_MINUS	
;	TokenNameSEMICOLON	
pushFollow	TokenNameIdentifier	 push Follow
(	TokenNameLPAREN	
FOLLOW_createCfamColumnValidator_in_createCfamColumns2019	TokenNameIdentifier	 FOLLOW create Cfam Column Validator in create Cfam Columns2019
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
v	TokenNameIdentifier	 v
=	TokenNameEQUAL	
createCfamColumnValidator	TokenNameIdentifier	 create Cfam Column Validator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
_fsp	TokenNameIdentifier	 fsp
--	TokenNameMINUS_MINUS	
;	TokenNameSEMICOLON	
expr	TokenNameIdentifier	 expr
.	TokenNameDOT	
addColumn	TokenNameIdentifier	 add Column
(	TokenNameLPAREN	
n	TokenNameIdentifier	 n
,	TokenNameCOMMA	
v	TokenNameIdentifier	 v
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
2	TokenNameIntegerLiteral	
:	TokenNameCOLON	
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql/Cql.g:390:7: k= term v= createCfamColumnValidator K_PRIMARY K_KEY 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql/Cql.g:390:7: k= term v= createCfamColumnValidator K_PRIMARY K_KEY 
{	TokenNameLBRACE	
pushFollow	TokenNameIdentifier	 push Follow
(	TokenNameLPAREN	
FOLLOW_term_in_createCfamColumns2031	TokenNameIdentifier	 FOLLOW term in create Cfam Columns2031
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
k	TokenNameIdentifier	 k
=	TokenNameEQUAL	
term	TokenNameIdentifier	 term
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
_fsp	TokenNameIdentifier	 fsp
--	TokenNameMINUS_MINUS	
;	TokenNameSEMICOLON	
pushFollow	TokenNameIdentifier	 push Follow
(	TokenNameLPAREN	
FOLLOW_createCfamColumnValidator_in_createCfamColumns2035	TokenNameIdentifier	 FOLLOW create Cfam Column Validator in create Cfam Columns2035
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
v	TokenNameIdentifier	 v
=	TokenNameEQUAL	
createCfamColumnValidator	TokenNameIdentifier	 create Cfam Column Validator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
_fsp	TokenNameIdentifier	 fsp
--	TokenNameMINUS_MINUS	
;	TokenNameSEMICOLON	
match	TokenNameIdentifier	 match
(	TokenNameLPAREN	
input	TokenNameIdentifier	 input
,	TokenNameCOMMA	
K_PRIMARY	TokenNameIdentifier	 K  PRIMARY
,	TokenNameCOMMA	
FOLLOW_K_PRIMARY_in_createCfamColumns2037	TokenNameIdentifier	 FOLLOW  K  PRIMARY in create Cfam Columns2037
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
match	TokenNameIdentifier	 match
(	TokenNameLPAREN	
input	TokenNameIdentifier	 input
,	TokenNameCOMMA	
K_KEY	TokenNameIdentifier	 K  KEY
,	TokenNameCOMMA	
FOLLOW_K_KEY_in_createCfamColumns2039	TokenNameIdentifier	 FOLLOW  K  KEY in create Cfam Columns2039
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
expr	TokenNameIdentifier	 expr
.	TokenNameDOT	
setKeyAlias	TokenNameIdentifier	 set Key Alias
(	TokenNameLPAREN	
k	TokenNameIdentifier	 k
.	TokenNameDOT	
getText	TokenNameIdentifier	 get Text
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
expr	TokenNameIdentifier	 expr
.	TokenNameDOT	
setKeyType	TokenNameIdentifier	 set Key Type
(	TokenNameLPAREN	
v	TokenNameIdentifier	 v
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
RecognitionException	TokenNameIdentifier	 Recognition Exception
re	TokenNameIdentifier	 re
)	TokenNameRPAREN	
{	TokenNameLBRACE	
reportError	TokenNameIdentifier	 report Error
(	TokenNameLPAREN	
re	TokenNameIdentifier	 re
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
recover	TokenNameIdentifier	 recover
(	TokenNameLPAREN	
input	TokenNameIdentifier	 input
,	TokenNameCOMMA	
re	TokenNameIdentifier	 re
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
finally	TokenNamefinally	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// $ANTLR end "createCfamColumns" 	TokenNameCOMMENT_LINE	$ANTLR end "createCfamColumns" 
// $ANTLR start "createCfamColumnValidator" 	TokenNameCOMMENT_LINE	$ANTLR start "createCfamColumnValidator" 
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql/Cql.g:393:1: createCfamColumnValidator returns [String validator] : ( comparatorType | STRING_LITERAL ); 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql/Cql.g:393:1: createCfamColumnValidator returns [String validator] : ( comparatorType | STRING_LITERAL ); 
public	TokenNamepublic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
createCfamColumnValidator	TokenNameIdentifier	 create Cfam Column Validator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
RecognitionException	TokenNameIdentifier	 Recognition Exception
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
validator	TokenNameIdentifier	 validator
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
Token	TokenNameIdentifier	 Token
STRING_LITERAL19	TokenNameIdentifier	 STRING  LITERA L19
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
CqlParser	TokenNameIdentifier	 Cql Parser
.	TokenNameDOT	
comparatorType_return	TokenNameIdentifier	 comparator Type return
comparatorType18	TokenNameIdentifier	 comparator Type18
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql/Cql.g:394:5: ( comparatorType | STRING_LITERAL ) 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql/Cql.g:394:5: ( comparatorType | STRING_LITERAL ) 
int	TokenNameint	
alt44	TokenNameIdentifier	 alt44
=	TokenNameEQUAL	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
LA44_0	TokenNameIdentifier	 L A44 0
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
LA44_0	TokenNameIdentifier	 L A44 0
>=	TokenNameGREATER_EQUAL	
88	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
LA44_0	TokenNameIdentifier	 L A44 0
<=	TokenNameLESS_EQUAL	
101	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
alt44	TokenNameIdentifier	 alt44
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
LA44_0	TokenNameIdentifier	 L A44 0
==	TokenNameEQUAL_EQUAL	
STRING_LITERAL	TokenNameIdentifier	 STRING  LITERAL
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
alt44	TokenNameIdentifier	 alt44
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
44	TokenNameIntegerLiteral	
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
alt44	TokenNameIdentifier	 alt44
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
1	TokenNameIntegerLiteral	
:	TokenNameCOLON	
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql/Cql.g:394:7: comparatorType 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql/Cql.g:394:7: comparatorType 
{	TokenNameLBRACE	
pushFollow	TokenNameIdentifier	 push Follow
(	TokenNameLPAREN	
FOLLOW_comparatorType_in_createCfamColumnValidator2062	TokenNameIdentifier	 FOLLOW comparator Type in create Cfam Column Validator2062
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
comparatorType18	TokenNameIdentifier	 comparator Type18
=	TokenNameEQUAL	
comparatorType	TokenNameIdentifier	 comparator Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
_fsp	TokenNameIdentifier	 fsp
--	TokenNameMINUS_MINUS	
;	TokenNameSEMICOLON	
validator	TokenNameIdentifier	 validator
=	TokenNameEQUAL	
(	TokenNameLPAREN	
comparatorType18	TokenNameIdentifier	 comparator Type18
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
?	TokenNameQUESTION	
input	TokenNameIdentifier	 input
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
comparatorType18	TokenNameIdentifier	 comparator Type18
.	TokenNameDOT	
start	TokenNameIdentifier	 start
,	TokenNameCOMMA	
comparatorType18	TokenNameIdentifier	 comparator Type18
.	TokenNameDOT	
stop	TokenNameIdentifier	 stop
)	TokenNameRPAREN	
:	TokenNameCOLON	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
2	TokenNameIntegerLiteral	
:	TokenNameCOLON	
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql/Cql.g:395:7: STRING_LITERAL 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql/Cql.g:395:7: STRING_LITERAL 
{	TokenNameLBRACE	
STRING_LITERAL19	TokenNameIdentifier	 STRING  LITERA L19
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Token	TokenNameIdentifier	 Token
)	TokenNameRPAREN	
match	TokenNameIdentifier	 match
(	TokenNameLPAREN	
input	TokenNameIdentifier	 input
,	TokenNameCOMMA	
STRING_LITERAL	TokenNameIdentifier	 STRING  LITERAL
,	TokenNameCOMMA	
FOLLOW_STRING_LITERAL_in_createCfamColumnValidator2072	TokenNameIdentifier	 FOLLOW  STRING  LITERAL in create Cfam Column Validator2072
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
validator	TokenNameIdentifier	 validator
=	TokenNameEQUAL	
(	TokenNameLPAREN	
STRING_LITERAL19	TokenNameIdentifier	 STRING  LITERA L19
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
?	TokenNameQUESTION	
STRING_LITERAL19	TokenNameIdentifier	 STRING  LITERA L19
.	TokenNameDOT	
getText	TokenNameIdentifier	 get Text
(	TokenNameLPAREN	
)	TokenNameRPAREN	
:	TokenNameCOLON	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
RecognitionException	TokenNameIdentifier	 Recognition Exception
re	TokenNameIdentifier	 re
)	TokenNameRPAREN	
{	TokenNameLBRACE	
reportError	TokenNameIdentifier	 report Error
(	TokenNameLPAREN	
re	TokenNameIdentifier	 re
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
recover	TokenNameIdentifier	 recover
(	TokenNameLPAREN	
input	TokenNameIdentifier	 input
,	TokenNameCOMMA	
re	TokenNameIdentifier	 re
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
finally	TokenNamefinally	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
validator	TokenNameIdentifier	 validator
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// $ANTLR end "createCfamColumnValidator" 	TokenNameCOMMENT_LINE	$ANTLR end "createCfamColumnValidator" 
// $ANTLR start "createCfamKeywordArgument" 	TokenNameCOMMENT_LINE	$ANTLR start "createCfamKeywordArgument" 
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql/Cql.g:398:1: createCfamKeywordArgument returns [String arg] : ( comparatorType | value= ( STRING_LITERAL | IDENT | INTEGER | FLOAT ) ); 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql/Cql.g:398:1: createCfamKeywordArgument returns [String arg] : ( comparatorType | value= ( STRING_LITERAL | IDENT | INTEGER | FLOAT ) ); 
public	TokenNamepublic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
createCfamKeywordArgument	TokenNameIdentifier	 create Cfam Keyword Argument
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
RecognitionException	TokenNameIdentifier	 Recognition Exception
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
arg	TokenNameIdentifier	 arg
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
Token	TokenNameIdentifier	 Token
value	TokenNameIdentifier	 value
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
CqlParser	TokenNameIdentifier	 Cql Parser
.	TokenNameDOT	
comparatorType_return	TokenNameIdentifier	 comparator Type return
comparatorType20	TokenNameIdentifier	 comparator Type20
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql/Cql.g:399:5: ( comparatorType | value= ( STRING_LITERAL | IDENT | INTEGER | FLOAT ) ) 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql/Cql.g:399:5: ( comparatorType | value= ( STRING_LITERAL | IDENT | INTEGER | FLOAT ) ) 
int	TokenNameint	
alt45	TokenNameIdentifier	 alt45
=	TokenNameEQUAL	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
LA45_0	TokenNameIdentifier	 L A45 0
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
LA45_0	TokenNameIdentifier	 L A45 0
>=	TokenNameGREATER_EQUAL	
88	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
LA45_0	TokenNameIdentifier	 L A45 0
<=	TokenNameLESS_EQUAL	
101	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
alt45	TokenNameIdentifier	 alt45
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
LA45_0	TokenNameIdentifier	 L A45 0
>=	TokenNameGREATER_EQUAL	
IDENT	TokenNameIdentifier	 IDENT
&&	TokenNameAND_AND	
LA45_0	TokenNameIdentifier	 L A45 0
<=	TokenNameLESS_EQUAL	
STRING_LITERAL	TokenNameIdentifier	 STRING  LITERAL
)	TokenNameRPAREN	
||	TokenNameOR_OR	
LA45_0	TokenNameIdentifier	 L A45 0
==	TokenNameEQUAL_EQUAL	
FLOAT	TokenNameIdentifier	 FLOAT
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
alt45	TokenNameIdentifier	 alt45
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
45	TokenNameIntegerLiteral	
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
alt45	TokenNameIdentifier	 alt45
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
1	TokenNameIntegerLiteral	
:	TokenNameCOLON	
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql/Cql.g:399:7: comparatorType 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql/Cql.g:399:7: comparatorType 
{	TokenNameLBRACE	
pushFollow	TokenNameIdentifier	 push Follow
(	TokenNameLPAREN	
FOLLOW_comparatorType_in_createCfamKeywordArgument2095	TokenNameIdentifier	 FOLLOW comparator Type in create Cfam Keyword Argument2095
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
comparatorType20	TokenNameIdentifier	 comparator Type20
=	TokenNameEQUAL	
comparatorType	TokenNameIdentifier	 comparator Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
_fsp	TokenNameIdentifier	 fsp
--	TokenNameMINUS_MINUS	
;	TokenNameSEMICOLON	
arg	TokenNameIdentifier	 arg
=	TokenNameEQUAL	
(	TokenNameLPAREN	
comparatorType20	TokenNameIdentifier	 comparator Type20
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
?	TokenNameQUESTION	
input	TokenNameIdentifier	 input
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
comparatorType20	TokenNameIdentifier	 comparator Type20
.	TokenNameDOT	
start	TokenNameIdentifier	 start
,	TokenNameCOMMA	
comparatorType20	TokenNameIdentifier	 comparator Type20
.	TokenNameDOT	
stop	TokenNameIdentifier	 stop
)	TokenNameRPAREN	
:	TokenNameCOLON	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
2	TokenNameIntegerLiteral	
:	TokenNameCOLON	
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql/Cql.g:400:7: value= ( STRING_LITERAL | IDENT | INTEGER | FLOAT ) 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql/Cql.g:400:7: value= ( STRING_LITERAL | IDENT | INTEGER | FLOAT ) 
{	TokenNameLBRACE	
value	TokenNameIdentifier	 value
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Token	TokenNameIdentifier	 Token
)	TokenNameRPAREN	
input	TokenNameIdentifier	 input
.	TokenNameDOT	
LT	TokenNameIdentifier	 LT
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
IDENT	TokenNameIdentifier	 IDENT
&&	TokenNameAND_AND	
input	TokenNameIdentifier	 input
.	TokenNameDOT	
LA	TokenNameIdentifier	 LA
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
<=	TokenNameLESS_EQUAL	
STRING_LITERAL	TokenNameIdentifier	 STRING  LITERAL
)	TokenNameRPAREN	
||	TokenNameOR_OR	
input	TokenNameIdentifier	 input
.	TokenNameDOT	
LA	TokenNameIdentifier	 LA
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
FLOAT	TokenNameIdentifier	 FLOAT
)	TokenNameRPAREN	
{	TokenNameLBRACE	
input	TokenNameIdentifier	 input
.	TokenNameDOT	
consume	TokenNameIdentifier	 consume
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
errorRecovery	TokenNameIdentifier	 error Recovery
=	TokenNameEQUAL	
false	TokenNamefalse	
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
throw	TokenNamethrow	
mse	TokenNameIdentifier	 mse
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
arg	TokenNameIdentifier	 arg
=	TokenNameEQUAL	
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
?	TokenNameQUESTION	
value	TokenNameIdentifier	 value
.	TokenNameDOT	
getText	TokenNameIdentifier	 get Text
(	TokenNameLPAREN	
)	TokenNameRPAREN	
:	TokenNameCOLON	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
RecognitionException	TokenNameIdentifier	 Recognition Exception
re	TokenNameIdentifier	 re
)	TokenNameRPAREN	
{	TokenNameLBRACE	
reportError	TokenNameIdentifier	 report Error
(	TokenNameLPAREN	
re	TokenNameIdentifier	 re
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
recover	TokenNameIdentifier	 recover
(	TokenNameLPAREN	
input	TokenNameIdentifier	 input
,	TokenNameCOMMA	
re	TokenNameIdentifier	 re
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
finally	TokenNamefinally	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
arg	TokenNameIdentifier	 arg
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// $ANTLR end "createCfamKeywordArgument" 	TokenNameCOMMENT_LINE	$ANTLR end "createCfamKeywordArgument" 
// $ANTLR start "createIndexStatement" 	TokenNameCOMMENT_LINE	$ANTLR start "createIndexStatement" 
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql/Cql.g:403:1: createIndexStatement returns [CreateIndexStatement expr] : K_CREATE K_INDEX (idxName= IDENT )? K_ON cf= ( IDENT | STRING_LITERAL | INTEGER ) '(' columnName= term ')' endStmnt ; 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql/Cql.g:403:1: createIndexStatement returns [CreateIndexStatement expr] : K_CREATE K_INDEX (idxName= IDENT )? K_ON cf= ( IDENT | STRING_LITERAL | INTEGER ) '(' columnName= term ')' endStmnt ; 
public	TokenNamepublic	
final	TokenNamefinal	
CreateIndexStatement	TokenNameIdentifier	 Create Index Statement
createIndexStatement	TokenNameIdentifier	 create Index Statement
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
RecognitionException	TokenNameIdentifier	 Recognition Exception
{	TokenNameLBRACE	
CreateIndexStatement	TokenNameIdentifier	 Create Index Statement
expr	TokenNameIdentifier	 expr
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
Token	TokenNameIdentifier	 Token
idxName	TokenNameIdentifier	 idx Name
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
Token	TokenNameIdentifier	 Token
cf	TokenNameIdentifier	 cf
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
Term	TokenNameIdentifier	 Term
columnName	TokenNameIdentifier	 column Name
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql/Cql.g:405:5: ( K_CREATE K_INDEX (idxName= IDENT )? K_ON cf= ( IDENT | STRING_LITERAL | INTEGER ) '(' columnName= term ')' endStmnt ) 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql/Cql.g:405:5: ( K_CREATE K_INDEX (idxName= IDENT )? K_ON cf= ( IDENT | STRING_LITERAL | INTEGER ) '(' columnName= term ')' endStmnt ) 
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql/Cql.g:405:7: K_CREATE K_INDEX (idxName= IDENT )? K_ON cf= ( IDENT | STRING_LITERAL | INTEGER ) '(' columnName= term ')' endStmnt 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql/Cql.g:405:7: K_CREATE K_INDEX (idxName= IDENT )? K_ON cf= ( IDENT | STRING_LITERAL | INTEGER ) '(' columnName= term ')' endStmnt 
{	TokenNameLBRACE	
match	TokenNameIdentifier	 match
(	TokenNameLPAREN	
input	TokenNameIdentifier	 input
,	TokenNameCOMMA	
K_CREATE	TokenNameIdentifier	 K  CREATE
,	TokenNameCOMMA	
FOLLOW_K_CREATE_in_createIndexStatement2148	TokenNameIdentifier	 FOLLOW  K  CREATE in create Index Statement2148
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
match	TokenNameIdentifier	 match
(	TokenNameLPAREN	
input	TokenNameIdentifier	 input
,	TokenNameCOMMA	
K_INDEX	TokenNameIdentifier	 K  INDEX
,	TokenNameCOMMA	
FOLLOW_K_INDEX_in_createIndexStatement2150	TokenNameIdentifier	 FOLLOW  K  INDEX in create Index Statement2150
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql/Cql.g:405:24: (idxName= IDENT )? 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql/Cql.g:405:24: (idxName= IDENT )? 
int	TokenNameint	
alt46	TokenNameIdentifier	 alt46
=	TokenNameEQUAL	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
LA46_0	TokenNameIdentifier	 L A46 0
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
LA46_0	TokenNameIdentifier	 L A46 0
==	TokenNameEQUAL_EQUAL	
IDENT	TokenNameIdentifier	 IDENT
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
alt46	TokenNameIdentifier	 alt46
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
switch	TokenNameswitch	
(	TokenNameLPAREN	
alt46	TokenNameIdentifier	 alt46
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
1	TokenNameIntegerLiteral	
:	TokenNameCOLON	
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql/Cql.g:405:25: idxName= IDENT 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql/Cql.g:405:25: idxName= IDENT 
{	TokenNameLBRACE	
idxName	TokenNameIdentifier	 idx Name
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Token	TokenNameIdentifier	 Token
)	TokenNameRPAREN	
match	TokenNameIdentifier	 match
(	TokenNameLPAREN	
input	TokenNameIdentifier	 input
,	TokenNameCOMMA	
IDENT	TokenNameIdentifier	 IDENT
,	TokenNameCOMMA	
FOLLOW_IDENT_in_createIndexStatement2155	TokenNameIdentifier	 FOLLOW  IDENT in create Index Statement2155
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
match	TokenNameIdentifier	 match
(	TokenNameLPAREN	
input	TokenNameIdentifier	 input
,	TokenNameCOMMA	
K_ON	TokenNameIdentifier	 K  ON
,	TokenNameCOMMA	
FOLLOW_K_ON_in_createIndexStatement2159	TokenNameIdentifier	 FOLLOW  K  ON in create Index Statement2159
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
cf	TokenNameIdentifier	 cf
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Token	TokenNameIdentifier	 Token
)	TokenNameRPAREN	
input	TokenNameIdentifier	 input
.	TokenNameDOT	
LT	TokenNameIdentifier	 LT
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
IDENT	TokenNameIdentifier	 IDENT
&&	TokenNameAND_AND	
input	TokenNameIdentifier	 input
.	TokenNameDOT	
LA	TokenNameIdentifier	 LA
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
<=	TokenNameLESS_EQUAL	
STRING_LITERAL	TokenNameIdentifier	 STRING  LITERAL
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
input	TokenNameIdentifier	 input
.	TokenNameDOT	
consume	TokenNameIdentifier	 consume
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
errorRecovery	TokenNameIdentifier	 error Recovery
=	TokenNameEQUAL	
false	TokenNamefalse	
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
throw	TokenNamethrow	
mse	TokenNameIdentifier	 mse
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
match	TokenNameIdentifier	 match
(	TokenNameLPAREN	
input	TokenNameIdentifier	 input
,	TokenNameCOMMA	
81	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
FOLLOW_81_in_createIndexStatement2177	TokenNameIdentifier	 FOLLOW 81 in create Index Statement2177
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
pushFollow	TokenNameIdentifier	 push Follow
(	TokenNameLPAREN	
FOLLOW_term_in_createIndexStatement2181	TokenNameIdentifier	 FOLLOW term in create Index Statement2181
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
columnName	TokenNameIdentifier	 column Name
=	TokenNameEQUAL	
term	TokenNameIdentifier	 term
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
_fsp	TokenNameIdentifier	 fsp
--	TokenNameMINUS_MINUS	
;	TokenNameSEMICOLON	
match	TokenNameIdentifier	 match
(	TokenNameLPAREN	
input	TokenNameIdentifier	 input
,	TokenNameCOMMA	
82	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
FOLLOW_82_in_createIndexStatement2183	TokenNameIdentifier	 FOLLOW 82 in create Index Statement2183
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
pushFollow	TokenNameIdentifier	 push Follow
(	TokenNameLPAREN	
FOLLOW_endStmnt_in_createIndexStatement2185	TokenNameIdentifier	 FOLLOW end Stmnt in create Index Statement2185
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
endStmnt	TokenNameIdentifier	 end Stmnt
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
_fsp	TokenNameIdentifier	 fsp
--	TokenNameMINUS_MINUS	
;	TokenNameSEMICOLON	
expr	TokenNameIdentifier	 expr
=	TokenNameEQUAL	
new	TokenNamenew	
CreateIndexStatement	TokenNameIdentifier	 Create Index Statement
(	TokenNameLPAREN	
(	TokenNameLPAREN	
idxName	TokenNameIdentifier	 idx Name
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
?	TokenNameQUESTION	
idxName	TokenNameIdentifier	 idx Name
.	TokenNameDOT	
getText	TokenNameIdentifier	 get Text
(	TokenNameLPAREN	
)	TokenNameRPAREN	
:	TokenNameCOLON	
null	TokenNamenull	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
(	TokenNameLPAREN	
cf	TokenNameIdentifier	 cf
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
?	TokenNameQUESTION	
cf	TokenNameIdentifier	 cf
.	TokenNameDOT	
getText	TokenNameIdentifier	 get Text
(	TokenNameLPAREN	
)	TokenNameRPAREN	
:	TokenNameCOLON	
null	TokenNamenull	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
columnName	TokenNameIdentifier	 column Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
RecognitionException	TokenNameIdentifier	 Recognition Exception
re	TokenNameIdentifier	 re
)	TokenNameRPAREN	
{	TokenNameLBRACE	
reportError	TokenNameIdentifier	 report Error
(	TokenNameLPAREN	
re	TokenNameIdentifier	 re
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
recover	TokenNameIdentifier	 recover
(	TokenNameLPAREN	
input	TokenNameIdentifier	 input
,	TokenNameCOMMA	
re	TokenNameIdentifier	 re
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
finally	TokenNamefinally	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
expr	TokenNameIdentifier	 expr
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// $ANTLR end "createIndexStatement" 	TokenNameCOMMENT_LINE	$ANTLR end "createIndexStatement" 
// $ANTLR start "dropIndexStatement" 	TokenNameCOMMENT_LINE	$ANTLR start "dropIndexStatement" 
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql/Cql.g:408:1: dropIndexStatement returns [DropIndexStatement expr] : K_DROP K_INDEX index= ( IDENT | STRING_LITERAL | INTEGER ) endStmnt ; 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql/Cql.g:408:1: dropIndexStatement returns [DropIndexStatement expr] : K_DROP K_INDEX index= ( IDENT | STRING_LITERAL | INTEGER ) endStmnt ; 
public	TokenNamepublic	
final	TokenNamefinal	
DropIndexStatement	TokenNameIdentifier	 Drop Index Statement
dropIndexStatement	TokenNameIdentifier	 drop Index Statement
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
RecognitionException	TokenNameIdentifier	 Recognition Exception
{	TokenNameLBRACE	
DropIndexStatement	TokenNameIdentifier	 Drop Index Statement
expr	TokenNameIdentifier	 expr
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
Token	TokenNameIdentifier	 Token
index	TokenNameIdentifier	 index
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql/Cql.g:413:5: ( K_DROP K_INDEX index= ( IDENT | STRING_LITERAL | INTEGER ) endStmnt ) 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql/Cql.g:413:5: ( K_DROP K_INDEX index= ( IDENT | STRING_LITERAL | INTEGER ) endStmnt ) 
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql/Cql.g:414:7: K_DROP K_INDEX index= ( IDENT | STRING_LITERAL | INTEGER ) endStmnt 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql/Cql.g:414:7: K_DROP K_INDEX index= ( IDENT | STRING_LITERAL | INTEGER ) endStmnt 
{	TokenNameLBRACE	
match	TokenNameIdentifier	 match
(	TokenNameLPAREN	
input	TokenNameIdentifier	 input
,	TokenNameCOMMA	
K_DROP	TokenNameIdentifier	 K  DROP
,	TokenNameCOMMA	
FOLLOW_K_DROP_in_dropIndexStatement2221	TokenNameIdentifier	 FOLLOW  K  DROP in drop Index Statement2221
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
match	TokenNameIdentifier	 match
(	TokenNameLPAREN	
input	TokenNameIdentifier	 input
,	TokenNameCOMMA	
K_INDEX	TokenNameIdentifier	 K  INDEX
,	TokenNameCOMMA	
FOLLOW_K_INDEX_in_dropIndexStatement2223	TokenNameIdentifier	 FOLLOW  K  INDEX in drop Index Statement2223
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
index	TokenNameIdentifier	 index
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Token	TokenNameIdentifier	 Token
)	TokenNameRPAREN	
input	TokenNameIdentifier	 input
.	TokenNameDOT	
LT	TokenNameIdentifier	 LT
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
IDENT	TokenNameIdentifier	 IDENT
&&	TokenNameAND_AND	
input	TokenNameIdentifier	 input
.	TokenNameDOT	
LA	TokenNameIdentifier	 LA
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
<=	TokenNameLESS_EQUAL	
STRING_LITERAL	TokenNameIdentifier	 STRING  LITERAL
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
input	TokenNameIdentifier	 input
.	TokenNameDOT	
consume	TokenNameIdentifier	 consume
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
errorRecovery	TokenNameIdentifier	 error Recovery
=	TokenNameEQUAL	
false	TokenNamefalse	
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
throw	TokenNamethrow	
mse	TokenNameIdentifier	 mse
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
pushFollow	TokenNameIdentifier	 push Follow
(	TokenNameLPAREN	
FOLLOW_endStmnt_in_dropIndexStatement2241	TokenNameIdentifier	 FOLLOW end Stmnt in drop Index Statement2241
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
endStmnt	TokenNameIdentifier	 end Stmnt
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
_fsp	TokenNameIdentifier	 fsp
--	TokenNameMINUS_MINUS	
;	TokenNameSEMICOLON	
expr	TokenNameIdentifier	 expr
=	TokenNameEQUAL	
new	TokenNamenew	
DropIndexStatement	TokenNameIdentifier	 Drop Index Statement
(	TokenNameLPAREN	
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
?	TokenNameQUESTION	
index	TokenNameIdentifier	 index
.	TokenNameDOT	
getText	TokenNameIdentifier	 get Text
(	TokenNameLPAREN	
)	TokenNameRPAREN	
:	TokenNameCOLON	
null	TokenNamenull	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
RecognitionException	TokenNameIdentifier	 Recognition Exception
re	TokenNameIdentifier	 re
)	TokenNameRPAREN	
{	TokenNameLBRACE	
reportError	TokenNameIdentifier	 report Error
(	TokenNameLPAREN	
re	TokenNameIdentifier	 re
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
recover	TokenNameIdentifier	 recover
(	TokenNameLPAREN	
input	TokenNameIdentifier	 input
,	TokenNameCOMMA	
re	TokenNameIdentifier	 re
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
finally	TokenNamefinally	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
expr	TokenNameIdentifier	 expr
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// $ANTLR end "dropIndexStatement" 	TokenNameCOMMENT_LINE	$ANTLR end "dropIndexStatement" 
// $ANTLR start "dropKeyspaceStatement" 	TokenNameCOMMENT_LINE	$ANTLR start "dropKeyspaceStatement" 
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql/Cql.g:418:1: dropKeyspaceStatement returns [String ksp] : K_DROP K_KEYSPACE name= ( IDENT | STRING_LITERAL | INTEGER ) endStmnt ; 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql/Cql.g:418:1: dropKeyspaceStatement returns [String ksp] : K_DROP K_KEYSPACE name= ( IDENT | STRING_LITERAL | INTEGER ) endStmnt ; 
public	TokenNamepublic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
dropKeyspaceStatement	TokenNameIdentifier	 drop Keyspace Statement
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
RecognitionException	TokenNameIdentifier	 Recognition Exception
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
ksp	TokenNameIdentifier	 ksp
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
Token	TokenNameIdentifier	 Token
name	TokenNameIdentifier	 name
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql/Cql.g:420:5: ( K_DROP K_KEYSPACE name= ( IDENT | STRING_LITERAL | INTEGER ) endStmnt ) 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql/Cql.g:420:5: ( K_DROP K_KEYSPACE name= ( IDENT | STRING_LITERAL | INTEGER ) endStmnt ) 
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql/Cql.g:420:7: K_DROP K_KEYSPACE name= ( IDENT | STRING_LITERAL | INTEGER ) endStmnt 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql/Cql.g:420:7: K_DROP K_KEYSPACE name= ( IDENT | STRING_LITERAL | INTEGER ) endStmnt 
{	TokenNameLBRACE	
match	TokenNameIdentifier	 match
(	TokenNameLPAREN	
input	TokenNameIdentifier	 input
,	TokenNameCOMMA	
K_DROP	TokenNameIdentifier	 K  DROP
,	TokenNameCOMMA	
FOLLOW_K_DROP_in_dropKeyspaceStatement2272	TokenNameIdentifier	 FOLLOW  K  DROP in drop Keyspace Statement2272
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
match	TokenNameIdentifier	 match
(	TokenNameLPAREN	
input	TokenNameIdentifier	 input
,	TokenNameCOMMA	
K_KEYSPACE	TokenNameIdentifier	 K  KEYSPACE
,	TokenNameCOMMA	
FOLLOW_K_KEYSPACE_in_dropKeyspaceStatement2274	TokenNameIdentifier	 FOLLOW  K  KEYSPACE in drop Keyspace Statement2274
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
name	TokenNameIdentifier	 name
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Token	TokenNameIdentifier	 Token
)	TokenNameRPAREN	
input	TokenNameIdentifier	 input
.	TokenNameDOT	
LT	TokenNameIdentifier	 LT
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
IDENT	TokenNameIdentifier	 IDENT
&&	TokenNameAND_AND	
input	TokenNameIdentifier	 input
.	TokenNameDOT	
LA	TokenNameIdentifier	 LA
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
<=	TokenNameLESS_EQUAL	
STRING_LITERAL	TokenNameIdentifier	 STRING  LITERAL
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
input	TokenNameIdentifier	 input
.	TokenNameDOT	
consume	TokenNameIdentifier	 consume
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
errorRecovery	TokenNameIdentifier	 error Recovery
=	TokenNameEQUAL	
false	TokenNamefalse	
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
throw	TokenNamethrow	
mse	TokenNameIdentifier	 mse
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
pushFollow	TokenNameIdentifier	 push Follow
(	TokenNameLPAREN	
FOLLOW_endStmnt_in_dropKeyspaceStatement2292	TokenNameIdentifier	 FOLLOW end Stmnt in drop Keyspace Statement2292
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
endStmnt	TokenNameIdentifier	 end Stmnt
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
_fsp	TokenNameIdentifier	 fsp
--	TokenNameMINUS_MINUS	
;	TokenNameSEMICOLON	
ksp	TokenNameIdentifier	 ksp
=	TokenNameEQUAL	
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
?	TokenNameQUESTION	
name	TokenNameIdentifier	 name
.	TokenNameDOT	
getText	TokenNameIdentifier	 get Text
(	TokenNameLPAREN	
)	TokenNameRPAREN	
:	TokenNameCOLON	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
RecognitionException	TokenNameIdentifier	 Recognition Exception
re	TokenNameIdentifier	 re
)	TokenNameRPAREN	
{	TokenNameLBRACE	
reportError	TokenNameIdentifier	 report Error
(	TokenNameLPAREN	
re	TokenNameIdentifier	 re
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
recover	TokenNameIdentifier	 recover
(	TokenNameLPAREN	
input	TokenNameIdentifier	 input
,	TokenNameCOMMA	
re	TokenNameIdentifier	 re
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
finally	TokenNamefinally	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
ksp	TokenNameIdentifier	 ksp
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// $ANTLR end "dropKeyspaceStatement" 	TokenNameCOMMENT_LINE	$ANTLR end "dropKeyspaceStatement" 
// $ANTLR start "alterTableStatement" 	TokenNameCOMMENT_LINE	$ANTLR start "alterTableStatement" 
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql/Cql.g:424:1: alterTableStatement returns [AlterTableStatement expr] : K_ALTER K_COLUMNFAMILY name= ( IDENT | STRING_LITERAL | INTEGER ) ( K_ALTER (col= ( IDENT | STRING_LITERAL | INTEGER ) ) K_TYPE alterValidator= comparatorType | K_ADD (col= ( IDENT | STRING_LITERAL | INTEGER ) ) addValidator= comparatorType | K_DROP (col= ( IDENT | STRING_LITERAL | INTEGER ) ) | K_WITH prop1= ( COMPIDENT | IDENT ) '=' arg1= createCfamKeywordArgument ( K_AND propN= ( COMPIDENT | IDENT ) '=' argN= createCfamKeywordArgument )* ) endStmnt ; 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql/Cql.g:424:1: alterTableStatement returns [AlterTableStatement expr] : K_ALTER K_COLUMNFAMILY name= ( IDENT | STRING_LITERAL | INTEGER ) ( K_ALTER (col= ( IDENT | STRING_LITERAL | INTEGER ) ) K_TYPE alterValidator= comparatorType | K_ADD (col= ( IDENT | STRING_LITERAL | INTEGER ) ) addValidator= comparatorType | K_DROP (col= ( IDENT | STRING_LITERAL | INTEGER ) ) | K_WITH prop1= ( COMPIDENT | IDENT ) '=' arg1= createCfamKeywordArgument ( K_AND propN= ( COMPIDENT | IDENT ) '=' argN= createCfamKeywordArgument )* ) endStmnt ; 
public	TokenNamepublic	
final	TokenNamefinal	
AlterTableStatement	TokenNameIdentifier	 Alter Table Statement
alterTableStatement	TokenNameIdentifier	 alter Table Statement
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
RecognitionException	TokenNameIdentifier	 Recognition Exception
{	TokenNameLBRACE	
AlterTableStatement	TokenNameIdentifier	 Alter Table Statement
expr	TokenNameIdentifier	 expr
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
Token	TokenNameIdentifier	 Token
name	TokenNameIdentifier	 name
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
Token	TokenNameIdentifier	 Token
col	TokenNameIdentifier	 col
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
Token	TokenNameIdentifier	 Token
prop1	TokenNameIdentifier	 prop1
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
Token	TokenNameIdentifier	 Token
propN	TokenNameIdentifier	 prop N
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
CqlParser	TokenNameIdentifier	 Cql Parser
.	TokenNameDOT	
comparatorType_return	TokenNameIdentifier	 comparator Type return
alterValidator	TokenNameIdentifier	 alter Validator
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
CqlParser	TokenNameIdentifier	 Cql Parser
.	TokenNameDOT	
comparatorType_return	TokenNameIdentifier	 comparator Type return
addValidator	TokenNameIdentifier	 add Validator
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
arg1	TokenNameIdentifier	 arg1
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
argN	TokenNameIdentifier	 arg N
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql/Cql.g:425:5: ( K_ALTER K_COLUMNFAMILY name= ( IDENT | STRING_LITERAL | INTEGER ) ( K_ALTER (col= ( IDENT | STRING_LITERAL | INTEGER ) ) K_TYPE alterValidator= comparatorType | K_ADD (col= ( IDENT | STRING_LITERAL | INTEGER ) ) addValidator= comparatorType | K_DROP (col= ( IDENT | STRING_LITERAL | INTEGER ) ) | K_WITH prop1= ( COMPIDENT | IDENT ) '=' arg1= createCfamKeywordArgument ( K_AND propN= ( COMPIDENT | IDENT ) '=' argN= createCfamKeywordArgument )* ) endStmnt ) 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql/Cql.g:425:5: ( K_ALTER K_COLUMNFAMILY name= ( IDENT | STRING_LITERAL | INTEGER ) ( K_ALTER (col= ( IDENT | STRING_LITERAL | INTEGER ) ) K_TYPE alterValidator= comparatorType | K_ADD (col= ( IDENT | STRING_LITERAL | INTEGER ) ) addValidator= comparatorType | K_DROP (col= ( IDENT | STRING_LITERAL | INTEGER ) ) | K_WITH prop1= ( COMPIDENT | IDENT ) '=' arg1= createCfamKeywordArgument ( K_AND propN= ( COMPIDENT | IDENT ) '=' argN= createCfamKeywordArgument )* ) endStmnt ) 
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql/Cql.g:426:5: K_ALTER K_COLUMNFAMILY name= ( IDENT | STRING_LITERAL | INTEGER ) ( K_ALTER (col= ( IDENT | STRING_LITERAL | INTEGER ) ) K_TYPE alterValidator= comparatorType | K_ADD (col= ( IDENT | STRING_LITERAL | INTEGER ) ) addValidator= comparatorType | K_DROP (col= ( IDENT | STRING_LITERAL | INTEGER ) ) | K_WITH prop1= ( COMPIDENT | IDENT ) '=' arg1= createCfamKeywordArgument ( K_AND propN= ( COMPIDENT | IDENT ) '=' argN= createCfamKeywordArgument )* ) endStmnt 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql/Cql.g:426:5: K_ALTER K_COLUMNFAMILY name= ( IDENT | STRING_LITERAL | INTEGER ) ( K_ALTER (col= ( IDENT | STRING_LITERAL | INTEGER ) ) K_TYPE alterValidator= comparatorType | K_ADD (col= ( IDENT | STRING_LITERAL | INTEGER ) ) addValidator= comparatorType | K_DROP (col= ( IDENT | STRING_LITERAL | INTEGER ) ) | K_WITH prop1= ( COMPIDENT | IDENT ) '=' arg1= createCfamKeywordArgument ( K_AND propN= ( COMPIDENT | IDENT ) '=' argN= createCfamKeywordArgument )* ) endStmnt 
{	TokenNameLBRACE	
OperationType	TokenNameIdentifier	 Operation Type
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
columnFamily	TokenNameIdentifier	 column Family
=	TokenNameEQUAL	
null	TokenNamenull	
,	TokenNameCOMMA	
columnName	TokenNameIdentifier	 column Name
=	TokenNameEQUAL	
null	TokenNamenull	
,	TokenNameCOMMA	
validator	TokenNameIdentifier	 validator
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
Map	TokenNameIdentifier	 Map
<	TokenNameLESS	
String	TokenNameIdentifier	 String
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
propertyMap	TokenNameIdentifier	 property Map
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
match	TokenNameIdentifier	 match
(	TokenNameLPAREN	
input	TokenNameIdentifier	 input
,	TokenNameCOMMA	
K_ALTER	TokenNameIdentifier	 K  ALTER
,	TokenNameCOMMA	
FOLLOW_K_ALTER_in_alterTableStatement2326	TokenNameIdentifier	 FOLLOW  K  ALTER in alter Table Statement2326
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
match	TokenNameIdentifier	 match
(	TokenNameLPAREN	
input	TokenNameIdentifier	 input
,	TokenNameCOMMA	
K_COLUMNFAMILY	TokenNameIdentifier	 K  COLUMNFAMILY
,	TokenNameCOMMA	
FOLLOW_K_COLUMNFAMILY_in_alterTableStatement2328	TokenNameIdentifier	 FOLLOW  K  COLUMNFAMILY in alter Table Statement2328
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
name	TokenNameIdentifier	 name
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Token	TokenNameIdentifier	 Token
)	TokenNameRPAREN	
input	TokenNameIdentifier	 input
.	TokenNameDOT	
LT	TokenNameIdentifier	 LT
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
IDENT	TokenNameIdentifier	 IDENT
&&	TokenNameAND_AND	
input	TokenNameIdentifier	 input
.	TokenNameDOT	
LA	TokenNameIdentifier	 LA
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
<=	TokenNameLESS_EQUAL	
STRING_LITERAL	TokenNameIdentifier	 STRING  LITERAL
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
input	TokenNameIdentifier	 input
.	TokenNameDOT	
consume	TokenNameIdentifier	 consume
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
errorRecovery	TokenNameIdentifier	 error Recovery
=	TokenNameEQUAL	
false	TokenNamefalse	
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
throw	TokenNamethrow	
mse	TokenNameIdentifier	 mse
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
columnFamily	TokenNameIdentifier	 column Family
=	TokenNameEQUAL	
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
?	TokenNameQUESTION	
name	TokenNameIdentifier	 name
.	TokenNameDOT	
getText	TokenNameIdentifier	 get Text
(	TokenNameLPAREN	
)	TokenNameRPAREN	
:	TokenNameCOLON	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql/Cql.g:432:11: ( K_ALTER (col= ( IDENT | STRING_LITERAL | INTEGER ) ) K_TYPE alterValidator= comparatorType | K_ADD (col= ( IDENT | STRING_LITERAL | INTEGER ) ) addValidator= comparatorType | K_DROP (col= ( IDENT | STRING_LITERAL | INTEGER ) ) | K_WITH prop1= ( COMPIDENT | IDENT ) '=' arg1= createCfamKeywordArgument ( K_AND propN= ( COMPIDENT | IDENT ) '=' argN= createCfamKeywordArgument )* ) 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql/Cql.g:432:11: ( K_ALTER (col= ( IDENT | STRING_LITERAL | INTEGER ) ) K_TYPE alterValidator= comparatorType | K_ADD (col= ( IDENT | STRING_LITERAL | INTEGER ) ) addValidator= comparatorType | K_DROP (col= ( IDENT | STRING_LITERAL | INTEGER ) ) | K_WITH prop1= ( COMPIDENT | IDENT ) '=' arg1= createCfamKeywordArgument ( K_AND propN= ( COMPIDENT | IDENT ) '=' argN= createCfamKeywordArgument )* ) 
int	TokenNameint	
alt48	TokenNameIdentifier	 alt48
=	TokenNameEQUAL	
4	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
switch	TokenNameswitch	
(	TokenNameLPAREN	
input	TokenNameIdentifier	 input
.	TokenNameDOT	
LA	TokenNameIdentifier	 LA
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
K_ALTER	TokenNameIdentifier	 K  ALTER
:	TokenNameCOLON	
{	TokenNameLBRACE	
alt48	TokenNameIdentifier	 alt48
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
K_ADD	TokenNameIdentifier	 K  ADD
:	TokenNameCOLON	
{	TokenNameLBRACE	
alt48	TokenNameIdentifier	 alt48
=	TokenNameEQUAL	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
K_DROP	TokenNameIdentifier	 K  DROP
:	TokenNameCOLON	
{	TokenNameLBRACE	
alt48	TokenNameIdentifier	 alt48
=	TokenNameEQUAL	
3	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
K_WITH	TokenNameIdentifier	 K  WITH
:	TokenNameCOLON	
{	TokenNameLBRACE	
alt48	TokenNameIdentifier	 alt48
=	TokenNameEQUAL	
4	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
default	TokenNamedefault	
:	TokenNameCOLON	
NoViableAltException	TokenNameIdentifier	 No Viable Alt Exception
nvae	TokenNameIdentifier	 nvae
=	TokenNameEQUAL	
new	TokenNamenew	
NoViableAltException	TokenNameIdentifier	 No Viable Alt Exception
(	TokenNameLPAREN	
""	TokenNameStringLiteral	 
,	TokenNameCOMMA	
48	TokenNameIntegerLiteral	
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
alt48	TokenNameIdentifier	 alt48
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
1	TokenNameIntegerLiteral	
:	TokenNameCOLON	
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql/Cql.g:432:13: K_ALTER (col= ( IDENT | STRING_LITERAL | INTEGER ) ) K_TYPE alterValidator= comparatorType 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql/Cql.g:432:13: K_ALTER (col= ( IDENT | STRING_LITERAL | INTEGER ) ) K_TYPE alterValidator= comparatorType 
{	TokenNameLBRACE	
match	TokenNameIdentifier	 match
(	TokenNameLPAREN	
input	TokenNameIdentifier	 input
,	TokenNameCOMMA	
K_ALTER	TokenNameIdentifier	 K  ALTER
,	TokenNameCOMMA	
FOLLOW_K_ALTER_in_alterTableStatement2360	TokenNameIdentifier	 FOLLOW  K  ALTER in alter Table Statement2360
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
OperationType	TokenNameIdentifier	 Operation Type
.	TokenNameDOT	
ALTER	TokenNameIdentifier	 ALTER
;	TokenNameSEMICOLON	
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql/Cql.g:433:16: (col= ( IDENT | STRING_LITERAL | INTEGER ) ) 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql/Cql.g:433:16: (col= ( IDENT | STRING_LITERAL | INTEGER ) ) 
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql/Cql.g:433:17: col= ( IDENT | STRING_LITERAL | INTEGER ) 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql/Cql.g:433:17: col= ( IDENT | STRING_LITERAL | INTEGER ) 
{	TokenNameLBRACE	
col	TokenNameIdentifier	 col
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Token	TokenNameIdentifier	 Token
)	TokenNameRPAREN	
input	TokenNameIdentifier	 input
.	TokenNameDOT	
LT	TokenNameIdentifier	 LT
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
IDENT	TokenNameIdentifier	 IDENT
&&	TokenNameAND_AND	
input	TokenNameIdentifier	 input
.	TokenNameDOT	
LA	TokenNameIdentifier	 LA
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
<=	TokenNameLESS_EQUAL	
STRING_LITERAL	TokenNameIdentifier	 STRING  LITERAL
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
input	TokenNameIdentifier	 input
.	TokenNameDOT	
consume	TokenNameIdentifier	 consume
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
errorRecovery	TokenNameIdentifier	 error Recovery
=	TokenNameEQUAL	
false	TokenNamefalse	
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
throw	TokenNamethrow	
mse	TokenNameIdentifier	 mse
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
columnName	TokenNameIdentifier	 column Name
=	TokenNameEQUAL	
(	TokenNameLPAREN	
col	TokenNameIdentifier	 col
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
?	TokenNameQUESTION	
col	TokenNameIdentifier	 col
.	TokenNameDOT	
getText	TokenNameIdentifier	 get Text
(	TokenNameLPAREN	
)	TokenNameRPAREN	
:	TokenNameCOLON	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
match	TokenNameIdentifier	 match
(	TokenNameLPAREN	
input	TokenNameIdentifier	 input
,	TokenNameCOMMA	
K_TYPE	TokenNameIdentifier	 K  TYPE
,	TokenNameCOMMA	
FOLLOW_K_TYPE_in_alterTableStatement2414	TokenNameIdentifier	 FOLLOW  K  TYPE in alter Table Statement2414
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
pushFollow	TokenNameIdentifier	 push Follow
(	TokenNameLPAREN	
FOLLOW_comparatorType_in_alterTableStatement2418	TokenNameIdentifier	 FOLLOW comparator Type in alter Table Statement2418
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
alterValidator	TokenNameIdentifier	 alter Validator
=	TokenNameEQUAL	
comparatorType	TokenNameIdentifier	 comparator Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
_fsp	TokenNameIdentifier	 fsp
--	TokenNameMINUS_MINUS	
;	TokenNameSEMICOLON	
validator	TokenNameIdentifier	 validator
=	TokenNameEQUAL	
(	TokenNameLPAREN	
alterValidator	TokenNameIdentifier	 alter Validator
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
?	TokenNameQUESTION	
input	TokenNameIdentifier	 input
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
alterValidator	TokenNameIdentifier	 alter Validator
.	TokenNameDOT	
start	TokenNameIdentifier	 start
,	TokenNameCOMMA	
alterValidator	TokenNameIdentifier	 alter Validator
.	TokenNameDOT	
stop	TokenNameIdentifier	 stop
)	TokenNameRPAREN	
:	TokenNameCOLON	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
2	TokenNameIntegerLiteral	
:	TokenNameCOLON	
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql/Cql.g:435:13: K_ADD (col= ( IDENT | STRING_LITERAL | INTEGER ) ) addValidator= comparatorType 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql/Cql.g:435:13: K_ADD (col= ( IDENT | STRING_LITERAL | INTEGER ) ) addValidator= comparatorType 
{	TokenNameLBRACE	
match	TokenNameIdentifier	 match
(	TokenNameLPAREN	
input	TokenNameIdentifier	 input
,	TokenNameCOMMA	
K_ADD	TokenNameIdentifier	 K  ADD
,	TokenNameCOMMA	
FOLLOW_K_ADD_in_alterTableStatement2434	TokenNameIdentifier	 FOLLOW  K  ADD in alter Table Statement2434
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
OperationType	TokenNameIdentifier	 Operation Type
.	TokenNameDOT	
ADD	TokenNameIdentifier	 ADD
;	TokenNameSEMICOLON	
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql/Cql.g:436:16: (col= ( IDENT | STRING_LITERAL | INTEGER ) ) 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql/Cql.g:436:16: (col= ( IDENT | STRING_LITERAL | INTEGER ) ) 
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql/Cql.g:436:17: col= ( IDENT | STRING_LITERAL | INTEGER ) 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql/Cql.g:436:17: col= ( IDENT | STRING_LITERAL | INTEGER ) 
{	TokenNameLBRACE	
col	TokenNameIdentifier	 col
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Token	TokenNameIdentifier	 Token
)	TokenNameRPAREN	
input	TokenNameIdentifier	 input
.	TokenNameDOT	
LT	TokenNameIdentifier	 LT
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
IDENT	TokenNameIdentifier	 IDENT
&&	TokenNameAND_AND	
input	TokenNameIdentifier	 input
.	TokenNameDOT	
LA	TokenNameIdentifier	 LA
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
<=	TokenNameLESS_EQUAL	
STRING_LITERAL	TokenNameIdentifier	 STRING  LITERAL
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
input	TokenNameIdentifier	 input
.	TokenNameDOT	
consume	TokenNameIdentifier	 consume
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
errorRecovery	TokenNameIdentifier	 error Recovery
=	TokenNameEQUAL	
false	TokenNamefalse	
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
throw	TokenNamethrow	
mse	TokenNameIdentifier	 mse
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
columnName	TokenNameIdentifier	 column Name
=	TokenNameEQUAL	
(	TokenNameLPAREN	
col	TokenNameIdentifier	 col
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
?	TokenNameQUESTION	
col	TokenNameIdentifier	 col
.	TokenNameDOT	
getText	TokenNameIdentifier	 get Text
(	TokenNameLPAREN	
)	TokenNameRPAREN	
:	TokenNameCOLON	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
pushFollow	TokenNameIdentifier	 push Follow
(	TokenNameLPAREN	
FOLLOW_comparatorType_in_alterTableStatement2490	TokenNameIdentifier	 FOLLOW comparator Type in alter Table Statement2490
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
addValidator	TokenNameIdentifier	 add Validator
=	TokenNameEQUAL	
comparatorType	TokenNameIdentifier	 comparator Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
_fsp	TokenNameIdentifier	 fsp
--	TokenNameMINUS_MINUS	
;	TokenNameSEMICOLON	
validator	TokenNameIdentifier	 validator
=	TokenNameEQUAL	
(	TokenNameLPAREN	
addValidator	TokenNameIdentifier	 add Validator
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
?	TokenNameQUESTION	
input	TokenNameIdentifier	 input
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
addValidator	TokenNameIdentifier	 add Validator
.	TokenNameDOT	
start	TokenNameIdentifier	 start
,	TokenNameCOMMA	
addValidator	TokenNameIdentifier	 add Validator
.	TokenNameDOT	
stop	TokenNameIdentifier	 stop
)	TokenNameRPAREN	
:	TokenNameCOLON	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
3	TokenNameIntegerLiteral	
:	TokenNameCOLON	
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql/Cql.g:438:13: K_DROP (col= ( IDENT | STRING_LITERAL | INTEGER ) ) 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql/Cql.g:438:13: K_DROP (col= ( IDENT | STRING_LITERAL | INTEGER ) ) 
{	TokenNameLBRACE	
match	TokenNameIdentifier	 match
(	TokenNameLPAREN	
input	TokenNameIdentifier	 input
,	TokenNameCOMMA	
K_DROP	TokenNameIdentifier	 K  DROP
,	TokenNameCOMMA	
FOLLOW_K_DROP_in_alterTableStatement2506	TokenNameIdentifier	 FOLLOW  K  DROP in alter Table Statement2506
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
OperationType	TokenNameIdentifier	 Operation Type
.	TokenNameDOT	
DROP	TokenNameIdentifier	 DROP
;	TokenNameSEMICOLON	
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql/Cql.g:439:16: (col= ( IDENT | STRING_LITERAL | INTEGER ) ) 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql/Cql.g:439:16: (col= ( IDENT | STRING_LITERAL | INTEGER ) ) 
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql/Cql.g:439:17: col= ( IDENT | STRING_LITERAL | INTEGER ) 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql/Cql.g:439:17: col= ( IDENT | STRING_LITERAL | INTEGER ) 
{	TokenNameLBRACE	
col	TokenNameIdentifier	 col
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Token	TokenNameIdentifier	 Token
)	TokenNameRPAREN	
input	TokenNameIdentifier	 input
.	TokenNameDOT	
LT	TokenNameIdentifier	 LT
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
IDENT	TokenNameIdentifier	 IDENT
&&	TokenNameAND_AND	
input	TokenNameIdentifier	 input
.	TokenNameDOT	
LA	TokenNameIdentifier	 LA
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
<=	TokenNameLESS_EQUAL	
STRING_LITERAL	TokenNameIdentifier	 STRING  LITERAL
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
input	TokenNameIdentifier	 input
.	TokenNameDOT	
consume	TokenNameIdentifier	 consume
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
errorRecovery	TokenNameIdentifier	 error Recovery
=	TokenNameEQUAL	
false	TokenNamefalse	
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
throw	TokenNamethrow	
mse	TokenNameIdentifier	 mse
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
columnName	TokenNameIdentifier	 column Name
=	TokenNameEQUAL	
(	TokenNameLPAREN	
col	TokenNameIdentifier	 col
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
?	TokenNameQUESTION	
col	TokenNameIdentifier	 col
.	TokenNameDOT	
getText	TokenNameIdentifier	 get Text
(	TokenNameLPAREN	
)	TokenNameRPAREN	
:	TokenNameCOLON	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
4	TokenNameIntegerLiteral	
:	TokenNameCOLON	
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql/Cql.g:440:13: K_WITH prop1= ( COMPIDENT | IDENT ) '=' arg1= createCfamKeywordArgument ( K_AND propN= ( COMPIDENT | IDENT ) '=' argN= createCfamKeywordArgument )* 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql/Cql.g:440:13: K_WITH prop1= ( COMPIDENT | IDENT ) '=' arg1= createCfamKeywordArgument ( K_AND propN= ( COMPIDENT | IDENT ) '=' argN= createCfamKeywordArgument )* 
{	TokenNameLBRACE	
match	TokenNameIdentifier	 match
(	TokenNameLPAREN	
input	TokenNameIdentifier	 input
,	TokenNameCOMMA	
K_WITH	TokenNameIdentifier	 K  WITH
,	TokenNameCOMMA	
FOLLOW_K_WITH_in_alterTableStatement2557	TokenNameIdentifier	 FOLLOW  K  WITH in alter Table Statement2557
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
OperationType	TokenNameIdentifier	 Operation Type
.	TokenNameDOT	
OPTS	TokenNameIdentifier	 OPTS
;	TokenNameSEMICOLON	
propertyMap	TokenNameIdentifier	 property Map
=	TokenNameEQUAL	
new	TokenNamenew	
HashMap	TokenNameIdentifier	 Hash Map
<	TokenNameLESS	
String	TokenNameIdentifier	 String
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
prop1	TokenNameIdentifier	 prop1
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Token	TokenNameIdentifier	 Token
)	TokenNameRPAREN	
input	TokenNameIdentifier	 input
.	TokenNameDOT	
LT	TokenNameIdentifier	 LT
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
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
IDENT	TokenNameIdentifier	 IDENT
||	TokenNameOR_OR	
input	TokenNameIdentifier	 input
.	TokenNameDOT	
LA	TokenNameIdentifier	 LA
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
COMPIDENT	TokenNameIdentifier	 COMPIDENT
)	TokenNameRPAREN	
{	TokenNameLBRACE	
input	TokenNameIdentifier	 input
.	TokenNameDOT	
consume	TokenNameIdentifier	 consume
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
errorRecovery	TokenNameIdentifier	 error Recovery
=	TokenNameEQUAL	
false	TokenNamefalse	
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
throw	TokenNamethrow	
mse	TokenNameIdentifier	 mse
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
match	TokenNameIdentifier	 match
(	TokenNameLPAREN	
input	TokenNameIdentifier	 input
,	TokenNameCOMMA	
87	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
FOLLOW_87_in_alterTableStatement2586	TokenNameIdentifier	 FOLLOW 87 in alter Table Statement2586
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
pushFollow	TokenNameIdentifier	 push Follow
(	TokenNameLPAREN	
FOLLOW_createCfamKeywordArgument_in_alterTableStatement2590	TokenNameIdentifier	 FOLLOW create Cfam Keyword Argument in alter Table Statement2590
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
arg1	TokenNameIdentifier	 arg1
=	TokenNameEQUAL	
createCfamKeywordArgument	TokenNameIdentifier	 create Cfam Keyword Argument
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
_fsp	TokenNameIdentifier	 fsp
--	TokenNameMINUS_MINUS	
;	TokenNameSEMICOLON	
propertyMap	TokenNameIdentifier	 property Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
(	TokenNameLPAREN	
prop1	TokenNameIdentifier	 prop1
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
?	TokenNameQUESTION	
prop1	TokenNameIdentifier	 prop1
.	TokenNameDOT	
getText	TokenNameIdentifier	 get Text
(	TokenNameLPAREN	
)	TokenNameRPAREN	
:	TokenNameCOLON	
null	TokenNamenull	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
arg1	TokenNameIdentifier	 arg1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql/Cql.g:442:16: ( K_AND propN= ( COMPIDENT | IDENT ) '=' argN= createCfamKeywordArgument )* 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql/Cql.g:442:16: ( K_AND propN= ( COMPIDENT | IDENT ) '=' argN= createCfamKeywordArgument )* 
loop47	TokenNameIdentifier	 loop47
:	TokenNameCOLON	
do	TokenNamedo	
{	TokenNameLBRACE	
int	TokenNameint	
alt47	TokenNameIdentifier	 alt47
=	TokenNameEQUAL	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
LA47_0	TokenNameIdentifier	 L A47 0
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
LA47_0	TokenNameIdentifier	 L A47 0
==	TokenNameEQUAL_EQUAL	
K_AND	TokenNameIdentifier	 K  AND
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
alt47	TokenNameIdentifier	 alt47
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
switch	TokenNameswitch	
(	TokenNameLPAREN	
alt47	TokenNameIdentifier	 alt47
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
1	TokenNameIntegerLiteral	
:	TokenNameCOLON	
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql/Cql.g:442:18: K_AND propN= ( COMPIDENT | IDENT ) '=' argN= createCfamKeywordArgument 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql/Cql.g:442:18: K_AND propN= ( COMPIDENT | IDENT ) '=' argN= createCfamKeywordArgument 
{	TokenNameLBRACE	
match	TokenNameIdentifier	 match
(	TokenNameLPAREN	
input	TokenNameIdentifier	 input
,	TokenNameCOMMA	
K_AND	TokenNameIdentifier	 K  AND
,	TokenNameCOMMA	
FOLLOW_K_AND_in_alterTableStatement2611	TokenNameIdentifier	 FOLLOW  K  AND in alter Table Statement2611
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
propN	TokenNameIdentifier	 prop N
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Token	TokenNameIdentifier	 Token
)	TokenNameRPAREN	
input	TokenNameIdentifier	 input
.	TokenNameDOT	
LT	TokenNameIdentifier	 LT
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
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
IDENT	TokenNameIdentifier	 IDENT
||	TokenNameOR_OR	
input	TokenNameIdentifier	 input
.	TokenNameDOT	
LA	TokenNameIdentifier	 LA
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
COMPIDENT	TokenNameIdentifier	 COMPIDENT
)	TokenNameRPAREN	
{	TokenNameLBRACE	
input	TokenNameIdentifier	 input
.	TokenNameDOT	
consume	TokenNameIdentifier	 consume
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
errorRecovery	TokenNameIdentifier	 error Recovery
=	TokenNameEQUAL	
false	TokenNamefalse	
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
throw	TokenNamethrow	
mse	TokenNameIdentifier	 mse
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
match	TokenNameIdentifier	 match
(	TokenNameLPAREN	
input	TokenNameIdentifier	 input
,	TokenNameCOMMA	
87	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
FOLLOW_87_in_alterTableStatement2623	TokenNameIdentifier	 FOLLOW 87 in alter Table Statement2623
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
pushFollow	TokenNameIdentifier	 push Follow
(	TokenNameLPAREN	
FOLLOW_createCfamKeywordArgument_in_alterTableStatement2627	TokenNameIdentifier	 FOLLOW create Cfam Keyword Argument in alter Table Statement2627
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
argN	TokenNameIdentifier	 arg N
=	TokenNameEQUAL	
createCfamKeywordArgument	TokenNameIdentifier	 create Cfam Keyword Argument
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
_fsp	TokenNameIdentifier	 fsp
--	TokenNameMINUS_MINUS	
;	TokenNameSEMICOLON	
propertyMap	TokenNameIdentifier	 property Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
(	TokenNameLPAREN	
propN	TokenNameIdentifier	 prop N
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
?	TokenNameQUESTION	
propN	TokenNameIdentifier	 prop N
.	TokenNameDOT	
getText	TokenNameIdentifier	 get Text
(	TokenNameLPAREN	
)	TokenNameRPAREN	
:	TokenNameCOLON	
null	TokenNamenull	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
argN	TokenNameIdentifier	 arg N
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
default	TokenNamedefault	
:	TokenNameCOLON	
break	TokenNamebreak	
loop47	TokenNameIdentifier	 loop47
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
while	TokenNamewhile	
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
pushFollow	TokenNameIdentifier	 push Follow
(	TokenNameLPAREN	
FOLLOW_endStmnt_in_alterTableStatement2640	TokenNameIdentifier	 FOLLOW end Stmnt in alter Table Statement2640
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
endStmnt	TokenNameIdentifier	 end Stmnt
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
_fsp	TokenNameIdentifier	 fsp
--	TokenNameMINUS_MINUS	
;	TokenNameSEMICOLON	
expr	TokenNameIdentifier	 expr
=	TokenNameEQUAL	
new	TokenNamenew	
AlterTableStatement	TokenNameIdentifier	 Alter Table Statement
(	TokenNameLPAREN	
columnFamily	TokenNameIdentifier	 column Family
,	TokenNameCOMMA	
type	TokenNameIdentifier	 type
,	TokenNameCOMMA	
columnName	TokenNameIdentifier	 column Name
,	TokenNameCOMMA	
validator	TokenNameIdentifier	 validator
,	TokenNameCOMMA	
propertyMap	TokenNameIdentifier	 property Map
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
RecognitionException	TokenNameIdentifier	 Recognition Exception
re	TokenNameIdentifier	 re
)	TokenNameRPAREN	
{	TokenNameLBRACE	
reportError	TokenNameIdentifier	 report Error
(	TokenNameLPAREN	
re	TokenNameIdentifier	 re
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
recover	TokenNameIdentifier	 recover
(	TokenNameLPAREN	
input	TokenNameIdentifier	 input
,	TokenNameCOMMA	
re	TokenNameIdentifier	 re
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
finally	TokenNamefinally	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
expr	TokenNameIdentifier	 expr
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// $ANTLR end "alterTableStatement" 	TokenNameCOMMENT_LINE	$ANTLR end "alterTableStatement" 
// $ANTLR start "dropColumnFamilyStatement" 	TokenNameCOMMENT_LINE	$ANTLR start "dropColumnFamilyStatement" 
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql/Cql.g:449:1: dropColumnFamilyStatement returns [String cfam] : K_DROP K_COLUMNFAMILY name= ( IDENT | STRING_LITERAL | INTEGER ) endStmnt ; 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql/Cql.g:449:1: dropColumnFamilyStatement returns [String cfam] : K_DROP K_COLUMNFAMILY name= ( IDENT | STRING_LITERAL | INTEGER ) endStmnt ; 
public	TokenNamepublic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
dropColumnFamilyStatement	TokenNameIdentifier	 drop Column Family Statement
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
RecognitionException	TokenNameIdentifier	 Recognition Exception
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
cfam	TokenNameIdentifier	 cfam
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
Token	TokenNameIdentifier	 Token
name	TokenNameIdentifier	 name
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql/Cql.g:451:5: ( K_DROP K_COLUMNFAMILY name= ( IDENT | STRING_LITERAL | INTEGER ) endStmnt ) 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql/Cql.g:451:5: ( K_DROP K_COLUMNFAMILY name= ( IDENT | STRING_LITERAL | INTEGER ) endStmnt ) 
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql/Cql.g:451:7: K_DROP K_COLUMNFAMILY name= ( IDENT | STRING_LITERAL | INTEGER ) endStmnt 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql/Cql.g:451:7: K_DROP K_COLUMNFAMILY name= ( IDENT | STRING_LITERAL | INTEGER ) endStmnt 
{	TokenNameLBRACE	
match	TokenNameIdentifier	 match
(	TokenNameLPAREN	
input	TokenNameIdentifier	 input
,	TokenNameCOMMA	
K_DROP	TokenNameIdentifier	 K  DROP
,	TokenNameCOMMA	
FOLLOW_K_DROP_in_dropColumnFamilyStatement2671	TokenNameIdentifier	 FOLLOW  K  DROP in drop Column Family Statement2671
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
match	TokenNameIdentifier	 match
(	TokenNameLPAREN	
input	TokenNameIdentifier	 input
,	TokenNameCOMMA	
K_COLUMNFAMILY	TokenNameIdentifier	 K  COLUMNFAMILY
,	TokenNameCOMMA	
FOLLOW_K_COLUMNFAMILY_in_dropColumnFamilyStatement2673	TokenNameIdentifier	 FOLLOW  K  COLUMNFAMILY in drop Column Family Statement2673
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
name	TokenNameIdentifier	 name
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Token	TokenNameIdentifier	 Token
)	TokenNameRPAREN	
input	TokenNameIdentifier	 input
.	TokenNameDOT	
LT	TokenNameIdentifier	 LT
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
IDENT	TokenNameIdentifier	 IDENT
&&	TokenNameAND_AND	
input	TokenNameIdentifier	 input
.	TokenNameDOT	
LA	TokenNameIdentifier	 LA
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
<=	TokenNameLESS_EQUAL	
STRING_LITERAL	TokenNameIdentifier	 STRING  LITERAL
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
input	TokenNameIdentifier	 input
.	TokenNameDOT	
consume	TokenNameIdentifier	 consume
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
errorRecovery	TokenNameIdentifier	 error Recovery
=	TokenNameEQUAL	
false	TokenNamefalse	
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
throw	TokenNamethrow	
mse	TokenNameIdentifier	 mse
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
pushFollow	TokenNameIdentifier	 push Follow
(	TokenNameLPAREN	
FOLLOW_endStmnt_in_dropColumnFamilyStatement2691	TokenNameIdentifier	 FOLLOW end Stmnt in drop Column Family Statement2691
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
endStmnt	TokenNameIdentifier	 end Stmnt
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
_fsp	TokenNameIdentifier	 fsp
--	TokenNameMINUS_MINUS	
;	TokenNameSEMICOLON	
cfam	TokenNameIdentifier	 cfam
=	TokenNameEQUAL	
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
?	TokenNameQUESTION	
name	TokenNameIdentifier	 name
.	TokenNameDOT	
getText	TokenNameIdentifier	 get Text
(	TokenNameLPAREN	
)	TokenNameRPAREN	
:	TokenNameCOLON	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
RecognitionException	TokenNameIdentifier	 Recognition Exception
re	TokenNameIdentifier	 re
)	TokenNameRPAREN	
{	TokenNameLBRACE	
reportError	TokenNameIdentifier	 report Error
(	TokenNameLPAREN	
re	TokenNameIdentifier	 re
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
recover	TokenNameIdentifier	 recover
(	TokenNameLPAREN	
input	TokenNameIdentifier	 input
,	TokenNameCOMMA	
re	TokenNameIdentifier	 re
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
finally	TokenNamefinally	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
cfam	TokenNameIdentifier	 cfam
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// $ANTLR end "dropColumnFamilyStatement" 	TokenNameCOMMENT_LINE	$ANTLR end "dropColumnFamilyStatement" 
public	TokenNamepublic	
static	TokenNamestatic	
class	TokenNameclass	
comparatorType_return	TokenNameIdentifier	 comparator Type return
extends	TokenNameextends	
ParserRuleReturnScope	TokenNameIdentifier	 Parser Rule Return Scope
{	TokenNameLBRACE	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
// $ANTLR start "comparatorType" 	TokenNameCOMMENT_LINE	$ANTLR start "comparatorType" 
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql/Cql.g:454:1: comparatorType : ( 'blob' | 'ascii' | 'text' | 'varchar' | 'int' | 'varint' | 'bigint' | 'uuid' | 'counter' | 'boolean' | 'timestamp' | 'float' | 'double' | 'decimal' ); 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql/Cql.g:454:1: comparatorType : ( 'blob' | 'ascii' | 'text' | 'varchar' | 'int' | 'varint' | 'bigint' | 'uuid' | 'counter' | 'boolean' | 'timestamp' | 'float' | 'double' | 'decimal' ); 
public	TokenNamepublic	
final	TokenNamefinal	
CqlParser	TokenNameIdentifier	 Cql Parser
.	TokenNameDOT	
comparatorType_return	TokenNameIdentifier	 comparator Type return
comparatorType	TokenNameIdentifier	 comparator Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
RecognitionException	TokenNameIdentifier	 Recognition Exception
{	TokenNameLBRACE	
CqlParser	TokenNameIdentifier	 Cql Parser
.	TokenNameDOT	
comparatorType_return	TokenNameIdentifier	 comparator Type return
retval	TokenNameIdentifier	 retval
=	TokenNameEQUAL	
new	TokenNamenew	
CqlParser	TokenNameIdentifier	 Cql Parser
.	TokenNameDOT	
comparatorType_return	TokenNameIdentifier	 comparator Type return
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
retval	TokenNameIdentifier	 retval
.	TokenNameDOT	
start	TokenNameIdentifier	 start
=	TokenNameEQUAL	
input	TokenNameIdentifier	 input
.	TokenNameDOT	
LT	TokenNameIdentifier	 LT
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql/Cql.g:455:5: ( 'blob' | 'ascii' | 'text' | 'varchar' | 'int' | 'varint' | 'bigint' | 'uuid' | 'counter' | 'boolean' | 'timestamp' | 'float' | 'double' | 'decimal' ) 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql/Cql.g:455:5: ( 'blob' | 'ascii' | 'text' | 'varchar' | 'int' | 'varint' | 'bigint' | 'uuid' | 'counter' | 'boolean' | 'timestamp' | 'float' | 'double' | 'decimal' ) 
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql/Cql.g: 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql/Cql.g: 
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
88	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
input	TokenNameIdentifier	 input
.	TokenNameDOT	
LA	TokenNameIdentifier	 LA
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
<=	TokenNameLESS_EQUAL	
101	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
input	TokenNameIdentifier	 input
.	TokenNameDOT	
consume	TokenNameIdentifier	 consume
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
errorRecovery	TokenNameIdentifier	 error Recovery
=	TokenNameEQUAL	
false	TokenNamefalse	
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
throw	TokenNamethrow	
mse	TokenNameIdentifier	 mse
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
retval	TokenNameIdentifier	 retval
.	TokenNameDOT	
stop	TokenNameIdentifier	 stop
=	TokenNameEQUAL	
input	TokenNameIdentifier	 input
.	TokenNameDOT	
LT	TokenNameIdentifier	 LT
(	TokenNameLPAREN	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
RecognitionException	TokenNameIdentifier	 Recognition Exception
re	TokenNameIdentifier	 re
)	TokenNameRPAREN	
{	TokenNameLBRACE	
reportError	TokenNameIdentifier	 report Error
(	TokenNameLPAREN	
re	TokenNameIdentifier	 re
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
recover	TokenNameIdentifier	 recover
(	TokenNameLPAREN	
input	TokenNameIdentifier	 input
,	TokenNameCOMMA	
re	TokenNameIdentifier	 re
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
finally	TokenNamefinally	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
retval	TokenNameIdentifier	 retval
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// $ANTLR end "comparatorType" 	TokenNameCOMMENT_LINE	$ANTLR end "comparatorType" 
// $ANTLR start "term" 	TokenNameCOMMENT_LINE	$ANTLR start "term" 
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql/Cql.g:458:1: term returns [Term item] : ( (t= K_KEY | t= STRING_LITERAL | t= INTEGER | t= UUID | t= IDENT | t= FLOAT ) | t= QMARK ) ; 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql/Cql.g:458:1: term returns [Term item] : ( (t= K_KEY | t= STRING_LITERAL | t= INTEGER | t= UUID | t= IDENT | t= FLOAT ) | t= QMARK ) ; 
public	TokenNamepublic	
final	TokenNamefinal	
Term	TokenNameIdentifier	 Term
term	TokenNameIdentifier	 term
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
RecognitionException	TokenNameIdentifier	 Recognition Exception
{	TokenNameLBRACE	
Term	TokenNameIdentifier	 Term
item	TokenNameIdentifier	 item
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
Token	TokenNameIdentifier	 Token
t	TokenNameIdentifier	 t
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql/Cql.g:459:5: ( ( (t= K_KEY | t= STRING_LITERAL | t= INTEGER | t= UUID | t= IDENT | t= FLOAT ) | t= QMARK ) ) 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql/Cql.g:459:5: ( ( (t= K_KEY | t= STRING_LITERAL | t= INTEGER | t= UUID | t= IDENT | t= FLOAT ) | t= QMARK ) ) 
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql/Cql.g:459:7: ( (t= K_KEY | t= STRING_LITERAL | t= INTEGER | t= UUID | t= IDENT | t= FLOAT ) | t= QMARK ) 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql/Cql.g:459:7: ( (t= K_KEY | t= STRING_LITERAL | t= INTEGER | t= UUID | t= IDENT | t= FLOAT ) | t= QMARK ) 
{	TokenNameLBRACE	
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql/Cql.g:459:7: ( (t= K_KEY | t= STRING_LITERAL | t= INTEGER | t= UUID | t= IDENT | t= FLOAT ) | t= QMARK ) 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql/Cql.g:459:7: ( (t= K_KEY | t= STRING_LITERAL | t= INTEGER | t= UUID | t= IDENT | t= FLOAT ) | t= QMARK ) 
int	TokenNameint	
alt50	TokenNameIdentifier	 alt50
=	TokenNameEQUAL	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
LA50_0	TokenNameIdentifier	 L A50 0
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
LA50_0	TokenNameIdentifier	 L A50 0
>=	TokenNameGREATER_EQUAL	
IDENT	TokenNameIdentifier	 IDENT
&&	TokenNameAND_AND	
LA50_0	TokenNameIdentifier	 L A50 0
<=	TokenNameLESS_EQUAL	
STRING_LITERAL	TokenNameIdentifier	 STRING  LITERAL
)	TokenNameRPAREN	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
LA50_0	TokenNameIdentifier	 L A50 0
>=	TokenNameGREATER_EQUAL	
K_KEY	TokenNameIdentifier	 K  KEY
&&	TokenNameAND_AND	
LA50_0	TokenNameIdentifier	 L A50 0
<=	TokenNameLESS_EQUAL	
FLOAT	TokenNameIdentifier	 FLOAT
)	TokenNameRPAREN	
||	TokenNameOR_OR	
LA50_0	TokenNameIdentifier	 L A50 0
==	TokenNameEQUAL_EQUAL	
UUID	TokenNameIdentifier	 UUID
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
alt50	TokenNameIdentifier	 alt50
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
LA50_0	TokenNameIdentifier	 L A50 0
==	TokenNameEQUAL_EQUAL	
QMARK	TokenNameIdentifier	 QMARK
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
alt50	TokenNameIdentifier	 alt50
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
50	TokenNameIntegerLiteral	
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
alt50	TokenNameIdentifier	 alt50
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
1	TokenNameIntegerLiteral	
:	TokenNameCOLON	
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql/Cql.g:459:8: (t= K_KEY | t= STRING_LITERAL | t= INTEGER | t= UUID | t= IDENT | t= FLOAT ) 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql/Cql.g:459:8: (t= K_KEY | t= STRING_LITERAL | t= INTEGER | t= UUID | t= IDENT | t= FLOAT ) 
{	TokenNameLBRACE	
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql/Cql.g:459:8: (t= K_KEY | t= STRING_LITERAL | t= INTEGER | t= UUID | t= IDENT | t= FLOAT ) 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql/Cql.g:459:8: (t= K_KEY | t= STRING_LITERAL | t= INTEGER | t= UUID | t= IDENT | t= FLOAT ) 
int	TokenNameint	
alt49	TokenNameIdentifier	 alt49
=	TokenNameEQUAL	
6	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
switch	TokenNameswitch	
(	TokenNameLPAREN	
input	TokenNameIdentifier	 input
.	TokenNameDOT	
LA	TokenNameIdentifier	 LA
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
K_KEY	TokenNameIdentifier	 K  KEY
:	TokenNameCOLON	
{	TokenNameLBRACE	
alt49	TokenNameIdentifier	 alt49
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
STRING_LITERAL	TokenNameIdentifier	 STRING  LITERAL
:	TokenNameCOLON	
{	TokenNameLBRACE	
alt49	TokenNameIdentifier	 alt49
=	TokenNameEQUAL	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
INTEGER	TokenNameIdentifier	 INTEGER
:	TokenNameCOLON	
{	TokenNameLBRACE	
alt49	TokenNameIdentifier	 alt49
=	TokenNameEQUAL	
3	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
UUID	TokenNameIdentifier	 UUID
:	TokenNameCOLON	
{	TokenNameLBRACE	
alt49	TokenNameIdentifier	 alt49
=	TokenNameEQUAL	
4	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
IDENT	TokenNameIdentifier	 IDENT
:	TokenNameCOLON	
{	TokenNameLBRACE	
alt49	TokenNameIdentifier	 alt49
=	TokenNameEQUAL	
5	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
FLOAT	TokenNameIdentifier	 FLOAT
:	TokenNameCOLON	
{	TokenNameLBRACE	
alt49	TokenNameIdentifier	 alt49
=	TokenNameEQUAL	
6	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
default	TokenNamedefault	
:	TokenNameCOLON	
NoViableAltException	TokenNameIdentifier	 No Viable Alt Exception
nvae	TokenNameIdentifier	 nvae
=	TokenNameEQUAL	
new	TokenNamenew	
NoViableAltException	TokenNameIdentifier	 No Viable Alt Exception
(	TokenNameLPAREN	
""	TokenNameStringLiteral	 
,	TokenNameCOMMA	
49	TokenNameIntegerLiteral	
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
alt49	TokenNameIdentifier	 alt49
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
1	TokenNameIntegerLiteral	
:	TokenNameCOLON	
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql/Cql.g:459:10: t= K_KEY 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql/Cql.g:459:10: t= K_KEY 
{	TokenNameLBRACE	
t	TokenNameIdentifier	 t
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Token	TokenNameIdentifier	 Token
)	TokenNameRPAREN	
match	TokenNameIdentifier	 match
(	TokenNameLPAREN	
input	TokenNameIdentifier	 input
,	TokenNameCOMMA	
K_KEY	TokenNameIdentifier	 K  KEY
,	TokenNameCOMMA	
FOLLOW_K_KEY_in_term2788	TokenNameIdentifier	 FOLLOW  K  KEY in term2788
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
2	TokenNameIntegerLiteral	
:	TokenNameCOLON	
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql/Cql.g:459:20: t= STRING_LITERAL 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql/Cql.g:459:20: t= STRING_LITERAL 
{	TokenNameLBRACE	
t	TokenNameIdentifier	 t
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Token	TokenNameIdentifier	 Token
)	TokenNameRPAREN	
match	TokenNameIdentifier	 match
(	TokenNameLPAREN	
input	TokenNameIdentifier	 input
,	TokenNameCOMMA	
STRING_LITERAL	TokenNameIdentifier	 STRING  LITERAL
,	TokenNameCOMMA	
FOLLOW_STRING_LITERAL_in_term2794	TokenNameIdentifier	 FOLLOW  STRING  LITERAL in term2794
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
3	TokenNameIntegerLiteral	
:	TokenNameCOLON	
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql/Cql.g:459:39: t= INTEGER 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql/Cql.g:459:39: t= INTEGER 
{	TokenNameLBRACE	
t	TokenNameIdentifier	 t
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Token	TokenNameIdentifier	 Token
)	TokenNameRPAREN	
match	TokenNameIdentifier	 match
(	TokenNameLPAREN	
input	TokenNameIdentifier	 input
,	TokenNameCOMMA	
INTEGER	TokenNameIdentifier	 INTEGER
,	TokenNameCOMMA	
FOLLOW_INTEGER_in_term2800	TokenNameIdentifier	 FOLLOW  INTEGER in term2800
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
4	TokenNameIntegerLiteral	
:	TokenNameCOLON	
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql/Cql.g:459:51: t= UUID 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql/Cql.g:459:51: t= UUID 
{	TokenNameLBRACE	
t	TokenNameIdentifier	 t
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Token	TokenNameIdentifier	 Token
)	TokenNameRPAREN	
match	TokenNameIdentifier	 match
(	TokenNameLPAREN	
input	TokenNameIdentifier	 input
,	TokenNameCOMMA	
UUID	TokenNameIdentifier	 UUID
,	TokenNameCOMMA	
FOLLOW_UUID_in_term2806	TokenNameIdentifier	 FOLLOW  UUID in term2806
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
5	TokenNameIntegerLiteral	
:	TokenNameCOLON	
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql/Cql.g:459:60: t= IDENT 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql/Cql.g:459:60: t= IDENT 
{	TokenNameLBRACE	
t	TokenNameIdentifier	 t
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Token	TokenNameIdentifier	 Token
)	TokenNameRPAREN	
match	TokenNameIdentifier	 match
(	TokenNameLPAREN	
input	TokenNameIdentifier	 input
,	TokenNameCOMMA	
IDENT	TokenNameIdentifier	 IDENT
,	TokenNameCOMMA	
FOLLOW_IDENT_in_term2812	TokenNameIdentifier	 FOLLOW  IDENT in term2812
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
6	TokenNameIntegerLiteral	
:	TokenNameCOLON	
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql/Cql.g:459:70: t= FLOAT 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql/Cql.g:459:70: t= FLOAT 
{	TokenNameLBRACE	
t	TokenNameIdentifier	 t
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Token	TokenNameIdentifier	 Token
)	TokenNameRPAREN	
match	TokenNameIdentifier	 match
(	TokenNameLPAREN	
input	TokenNameIdentifier	 input
,	TokenNameCOMMA	
FLOAT	TokenNameIdentifier	 FLOAT
,	TokenNameCOMMA	
FOLLOW_FLOAT_in_term2818	TokenNameIdentifier	 FOLLOW  FLOAT in term2818
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
item	TokenNameIdentifier	 item
=	TokenNameEQUAL	
new	TokenNamenew	
Term	TokenNameIdentifier	 Term
(	TokenNameLPAREN	
(	TokenNameLPAREN	
t	TokenNameIdentifier	 t
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
?	TokenNameQUESTION	
t	TokenNameIdentifier	 t
.	TokenNameDOT	
getText	TokenNameIdentifier	 get Text
(	TokenNameLPAREN	
)	TokenNameRPAREN	
:	TokenNameCOLON	
null	TokenNamenull	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
(	TokenNameLPAREN	
t	TokenNameIdentifier	 t
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
?	TokenNameQUESTION	
t	TokenNameIdentifier	 t
.	TokenNameDOT	
getType	TokenNameIdentifier	 get Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
:	TokenNameCOLON	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
2	TokenNameIntegerLiteral	
:	TokenNameCOLON	
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql/Cql.g:460:10: t= QMARK 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql/Cql.g:460:10: t= QMARK 
{	TokenNameLBRACE	
t	TokenNameIdentifier	 t
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Token	TokenNameIdentifier	 Token
)	TokenNameRPAREN	
match	TokenNameIdentifier	 match
(	TokenNameLPAREN	
input	TokenNameIdentifier	 input
,	TokenNameCOMMA	
QMARK	TokenNameIdentifier	 QMARK
,	TokenNameCOMMA	
FOLLOW_QMARK_in_term2835	TokenNameIdentifier	 FOLLOW  QMARK in term2835
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
item	TokenNameIdentifier	 item
=	TokenNameEQUAL	
new	TokenNamenew	
Term	TokenNameIdentifier	 Term
(	TokenNameLPAREN	
(	TokenNameLPAREN	
t	TokenNameIdentifier	 t
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
?	TokenNameQUESTION	
t	TokenNameIdentifier	 t
.	TokenNameDOT	
getText	TokenNameIdentifier	 get Text
(	TokenNameLPAREN	
)	TokenNameRPAREN	
:	TokenNameCOLON	
null	TokenNamenull	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
(	TokenNameLPAREN	
t	TokenNameIdentifier	 t
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
?	TokenNameQUESTION	
t	TokenNameIdentifier	 t
.	TokenNameDOT	
getType	TokenNameIdentifier	 get Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
:	TokenNameCOLON	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
++	TokenNamePLUS_PLUS	
currentBindMarkerIdx	TokenNameIdentifier	 current Bind Marker Idx
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
RecognitionException	TokenNameIdentifier	 Recognition Exception
re	TokenNameIdentifier	 re
)	TokenNameRPAREN	
{	TokenNameLBRACE	
reportError	TokenNameIdentifier	 report Error
(	TokenNameLPAREN	
re	TokenNameIdentifier	 re
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
recover	TokenNameIdentifier	 recover
(	TokenNameLPAREN	
input	TokenNameIdentifier	 input
,	TokenNameCOMMA	
re	TokenNameIdentifier	 re
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
finally	TokenNamefinally	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
item	TokenNameIdentifier	 item
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// $ANTLR end "term" 	TokenNameCOMMENT_LINE	$ANTLR end "term" 
// $ANTLR start "termList" 	TokenNameCOMMENT_LINE	$ANTLR start "termList" 
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql/Cql.g:464:1: termList returns [List<Term> items] : t1= term ( ',' tN= term )* ; 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql/Cql.g:464:1: termList returns [List<Term> items] : t1= term ( ',' tN= term )* ; 
public	TokenNamepublic	
final	TokenNamefinal	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
Term	TokenNameIdentifier	 Term
>	TokenNameGREATER	
termList	TokenNameIdentifier	 term List
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
RecognitionException	TokenNameIdentifier	 Recognition Exception
{	TokenNameLBRACE	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
Term	TokenNameIdentifier	 Term
>	TokenNameGREATER	
items	TokenNameIdentifier	 items
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
Term	TokenNameIdentifier	 Term
t1	TokenNameIdentifier	 t1
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
Term	TokenNameIdentifier	 Term
tN	TokenNameIdentifier	 t N
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql/Cql.g:465:5: (t1= term ( ',' tN= term )* ) 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql/Cql.g:465:5: (t1= term ( ',' tN= term )* ) 
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql/Cql.g:465:7: t1= term ( ',' tN= term )* 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql/Cql.g:465:7: t1= term ( ',' tN= term )* 
{	TokenNameLBRACE	
items	TokenNameIdentifier	 items
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
Term	TokenNameIdentifier	 Term
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
pushFollow	TokenNameIdentifier	 push Follow
(	TokenNameLPAREN	
FOLLOW_term_in_termList2876	TokenNameIdentifier	 FOLLOW term in term List2876
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
t1	TokenNameIdentifier	 t1
=	TokenNameEQUAL	
term	TokenNameIdentifier	 term
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
_fsp	TokenNameIdentifier	 fsp
--	TokenNameMINUS_MINUS	
;	TokenNameSEMICOLON	
items	TokenNameIdentifier	 items
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
t1	TokenNameIdentifier	 t1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql/Cql.g:466:35: ( ',' tN= term )* 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql/Cql.g:466:35: ( ',' tN= term )* 
loop51	TokenNameIdentifier	 loop51
:	TokenNameCOLON	
do	TokenNamedo	
{	TokenNameLBRACE	
int	TokenNameint	
alt51	TokenNameIdentifier	 alt51
=	TokenNameEQUAL	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
LA51_0	TokenNameIdentifier	 L A51 0
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
LA51_0	TokenNameIdentifier	 L A51 0
==	TokenNameEQUAL_EQUAL	
84	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
alt51	TokenNameIdentifier	 alt51
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
switch	TokenNameswitch	
(	TokenNameLPAREN	
alt51	TokenNameIdentifier	 alt51
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
1	TokenNameIntegerLiteral	
:	TokenNameCOLON	
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql/Cql.g:466:36: ',' tN= term 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql/Cql.g:466:36: ',' tN= term 
{	TokenNameLBRACE	
match	TokenNameIdentifier	 match
(	TokenNameLPAREN	
input	TokenNameIdentifier	 input
,	TokenNameCOMMA	
84	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
FOLLOW_84_in_termList2881	TokenNameIdentifier	 FOLLOW 84 in term List2881
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
pushFollow	TokenNameIdentifier	 push Follow
(	TokenNameLPAREN	
FOLLOW_term_in_termList2885	TokenNameIdentifier	 FOLLOW term in term List2885
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
tN	TokenNameIdentifier	 t N
=	TokenNameEQUAL	
term	TokenNameIdentifier	 term
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
_fsp	TokenNameIdentifier	 fsp
--	TokenNameMINUS_MINUS	
;	TokenNameSEMICOLON	
items	TokenNameIdentifier	 items
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
tN	TokenNameIdentifier	 t N
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
default	TokenNamedefault	
:	TokenNameCOLON	
break	TokenNamebreak	
loop51	TokenNameIdentifier	 loop51
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
while	TokenNamewhile	
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
RecognitionException	TokenNameIdentifier	 Recognition Exception
re	TokenNameIdentifier	 re
)	TokenNameRPAREN	
{	TokenNameLBRACE	
reportError	TokenNameIdentifier	 report Error
(	TokenNameLPAREN	
re	TokenNameIdentifier	 re
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
recover	TokenNameIdentifier	 recover
(	TokenNameLPAREN	
input	TokenNameIdentifier	 input
,	TokenNameCOMMA	
re	TokenNameIdentifier	 re
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
finally	TokenNamefinally	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
items	TokenNameIdentifier	 items
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// $ANTLR end "termList" 	TokenNameCOMMENT_LINE	$ANTLR end "termList" 
// $ANTLR start "termPair" 	TokenNameCOMMENT_LINE	$ANTLR start "termPair" 
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql/Cql.g:470:1: termPair[Map<Term, Term> columns] : key= term '=' value= term ; 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql/Cql.g:470:1: termPair[Map<Term, Term> columns] : key= term '=' value= term ; 
public	TokenNamepublic	
final	TokenNamefinal	
void	TokenNamevoid	
termPair	TokenNameIdentifier	 term Pair
(	TokenNameLPAREN	
Map	TokenNameIdentifier	 Map
<	TokenNameLESS	
Term	TokenNameIdentifier	 Term
,	TokenNameCOMMA	
Term	TokenNameIdentifier	 Term
>	TokenNameGREATER	
columns	TokenNameIdentifier	 columns
)	TokenNameRPAREN	
throws	TokenNamethrows	
RecognitionException	TokenNameIdentifier	 Recognition Exception
{	TokenNameLBRACE	
Term	TokenNameIdentifier	 Term
key	TokenNameIdentifier	 key
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
Term	TokenNameIdentifier	 Term
value	TokenNameIdentifier	 value
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql/Cql.g:471:5: (key= term '=' value= term ) 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql/Cql.g:471:5: (key= term '=' value= term ) 
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql/Cql.g:471:9: key= term '=' value= term 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql/Cql.g:471:9: key= term '=' value= term 
{	TokenNameLBRACE	
pushFollow	TokenNameIdentifier	 push Follow
(	TokenNameLPAREN	
FOLLOW_term_in_termPair2912	TokenNameIdentifier	 FOLLOW term in term Pair2912
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
key	TokenNameIdentifier	 key
=	TokenNameEQUAL	
term	TokenNameIdentifier	 term
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
_fsp	TokenNameIdentifier	 fsp
--	TokenNameMINUS_MINUS	
;	TokenNameSEMICOLON	
match	TokenNameIdentifier	 match
(	TokenNameLPAREN	
input	TokenNameIdentifier	 input
,	TokenNameCOMMA	
87	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
FOLLOW_87_in_termPair2914	TokenNameIdentifier	 FOLLOW 87 in term Pair2914
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
pushFollow	TokenNameIdentifier	 push Follow
(	TokenNameLPAREN	
FOLLOW_term_in_termPair2918	TokenNameIdentifier	 FOLLOW term in term Pair2918
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
value	TokenNameIdentifier	 value
=	TokenNameEQUAL	
term	TokenNameIdentifier	 term
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
_fsp	TokenNameIdentifier	 fsp
--	TokenNameMINUS_MINUS	
;	TokenNameSEMICOLON	
columns	TokenNameIdentifier	 columns
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
,	TokenNameCOMMA	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
RecognitionException	TokenNameIdentifier	 Recognition Exception
re	TokenNameIdentifier	 re
)	TokenNameRPAREN	
{	TokenNameLBRACE	
reportError	TokenNameIdentifier	 report Error
(	TokenNameLPAREN	
re	TokenNameIdentifier	 re
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
recover	TokenNameIdentifier	 recover
(	TokenNameLPAREN	
input	TokenNameIdentifier	 input
,	TokenNameCOMMA	
re	TokenNameIdentifier	 re
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
finally	TokenNamefinally	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// $ANTLR end "termPair" 	TokenNameCOMMENT_LINE	$ANTLR end "termPair" 
// $ANTLR start "intTerm" 	TokenNameCOMMENT_LINE	$ANTLR start "intTerm" 
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql/Cql.g:474:1: intTerm returns [Term integer] : t= INTEGER ; 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql/Cql.g:474:1: intTerm returns [Term integer] : t= INTEGER ; 
public	TokenNamepublic	
final	TokenNamefinal	
Term	TokenNameIdentifier	 Term
intTerm	TokenNameIdentifier	 int Term
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
RecognitionException	TokenNameIdentifier	 Recognition Exception
{	TokenNameLBRACE	
Term	TokenNameIdentifier	 Term
integer	TokenNameIdentifier	 integer
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
Token	TokenNameIdentifier	 Token
t	TokenNameIdentifier	 t
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql/Cql.g:475:5: (t= INTEGER ) 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql/Cql.g:475:5: (t= INTEGER ) 
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql/Cql.g:475:7: t= INTEGER 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql/Cql.g:475:7: t= INTEGER 
{	TokenNameLBRACE	
t	TokenNameIdentifier	 t
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Token	TokenNameIdentifier	 Token
)	TokenNameRPAREN	
match	TokenNameIdentifier	 match
(	TokenNameLPAREN	
input	TokenNameIdentifier	 input
,	TokenNameCOMMA	
INTEGER	TokenNameIdentifier	 INTEGER
,	TokenNameCOMMA	
FOLLOW_INTEGER_in_intTerm2943	TokenNameIdentifier	 FOLLOW  INTEGER in int Term2943
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
integer	TokenNameIdentifier	 integer
=	TokenNameEQUAL	
new	TokenNamenew	
Term	TokenNameIdentifier	 Term
(	TokenNameLPAREN	
(	TokenNameLPAREN	
t	TokenNameIdentifier	 t
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
?	TokenNameQUESTION	
t	TokenNameIdentifier	 t
.	TokenNameDOT	
getText	TokenNameIdentifier	 get Text
(	TokenNameLPAREN	
)	TokenNameRPAREN	
:	TokenNameCOLON	
null	TokenNamenull	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
(	TokenNameLPAREN	
t	TokenNameIdentifier	 t
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
?	TokenNameQUESTION	
t	TokenNameIdentifier	 t
.	TokenNameDOT	
getType	TokenNameIdentifier	 get Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
:	TokenNameCOLON	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
RecognitionException	TokenNameIdentifier	 Recognition Exception
re	TokenNameIdentifier	 re
)	TokenNameRPAREN	
{	TokenNameLBRACE	
reportError	TokenNameIdentifier	 report Error
(	TokenNameLPAREN	
re	TokenNameIdentifier	 re
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
recover	TokenNameIdentifier	 recover
(	TokenNameLPAREN	
input	TokenNameIdentifier	 input
,	TokenNameCOMMA	
re	TokenNameIdentifier	 re
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
finally	TokenNamefinally	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
integer	TokenNameIdentifier	 integer
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// $ANTLR end "intTerm" 	TokenNameCOMMENT_LINE	$ANTLR end "intTerm" 
// $ANTLR start "termPairWithOperation" 	TokenNameCOMMENT_LINE	$ANTLR start "termPairWithOperation" 
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql/Cql.g:478:1: termPairWithOperation[Map<Term, Operation> columns] : key= term '=' (value= term | c= term ( '+' v= term | (op= '-' )? v= intTerm ) ) ; 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql/Cql.g:478:1: termPairWithOperation[Map<Term, Operation> columns] : key= term '=' (value= term | c= term ( '+' v= term | (op= '-' )? v= intTerm ) ) ; 
public	TokenNamepublic	
final	TokenNamefinal	
void	TokenNamevoid	
termPairWithOperation	TokenNameIdentifier	 term Pair With Operation
(	TokenNameLPAREN	
Map	TokenNameIdentifier	 Map
<	TokenNameLESS	
Term	TokenNameIdentifier	 Term
,	TokenNameCOMMA	
Operation	TokenNameIdentifier	 Operation
>	TokenNameGREATER	
columns	TokenNameIdentifier	 columns
)	TokenNameRPAREN	
throws	TokenNamethrows	
RecognitionException	TokenNameIdentifier	 Recognition Exception
{	TokenNameLBRACE	
Token	TokenNameIdentifier	 Token
op	TokenNameIdentifier	 op
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
Term	TokenNameIdentifier	 Term
key	TokenNameIdentifier	 key
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
Term	TokenNameIdentifier	 Term
value	TokenNameIdentifier	 value
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
Term	TokenNameIdentifier	 Term
c	TokenNameIdentifier	 c
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
Term	TokenNameIdentifier	 Term
v	TokenNameIdentifier	 v
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql/Cql.g:479:5: (key= term '=' (value= term | c= term ( '+' v= term | (op= '-' )? v= intTerm ) ) ) 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql/Cql.g:479:5: (key= term '=' (value= term | c= term ( '+' v= term | (op= '-' )? v= intTerm ) ) ) 
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql/Cql.g:479:7: key= term '=' (value= term | c= term ( '+' v= term | (op= '-' )? v= intTerm ) ) 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql/Cql.g:479:7: key= term '=' (value= term | c= term ( '+' v= term | (op= '-' )? v= intTerm ) ) 
{	TokenNameLBRACE	
pushFollow	TokenNameIdentifier	 push Follow
(	TokenNameLPAREN	
FOLLOW_term_in_termPairWithOperation2965	TokenNameIdentifier	 FOLLOW term in term Pair With Operation2965
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
key	TokenNameIdentifier	 key
=	TokenNameEQUAL	
term	TokenNameIdentifier	 term
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
_fsp	TokenNameIdentifier	 fsp
--	TokenNameMINUS_MINUS	
;	TokenNameSEMICOLON	
match	TokenNameIdentifier	 match
(	TokenNameLPAREN	
input	TokenNameIdentifier	 input
,	TokenNameCOMMA	
87	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
FOLLOW_87_in_termPairWithOperation2967	TokenNameIdentifier	 FOLLOW 87 in term Pair With Operation2967
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql/Cql.g:479:20: (value= term | c= term ( '+' v= term | (op= '-' )? v= intTerm ) ) 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql/Cql.g:479:20: (value= term | c= term ( '+' v= term | (op= '-' )? v= intTerm ) ) 
int	TokenNameint	
alt54	TokenNameIdentifier	 alt54
=	TokenNameEQUAL	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
alt54	TokenNameIdentifier	 alt54
=	TokenNameEQUAL	
dfa54	TokenNameIdentifier	 dfa54
.	TokenNameDOT	
predict	TokenNameIdentifier	 predict
(	TokenNameLPAREN	
input	TokenNameIdentifier	 input
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
switch	TokenNameswitch	
(	TokenNameLPAREN	
alt54	TokenNameIdentifier	 alt54
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
1	TokenNameIntegerLiteral	
:	TokenNameCOLON	
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql/Cql.g:479:21: value= term 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql/Cql.g:479:21: value= term 
{	TokenNameLBRACE	
pushFollow	TokenNameIdentifier	 push Follow
(	TokenNameLPAREN	
FOLLOW_term_in_termPairWithOperation2972	TokenNameIdentifier	 FOLLOW term in term Pair With Operation2972
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
value	TokenNameIdentifier	 value
=	TokenNameEQUAL	
term	TokenNameIdentifier	 term
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
_fsp	TokenNameIdentifier	 fsp
--	TokenNameMINUS_MINUS	
;	TokenNameSEMICOLON	
columns	TokenNameIdentifier	 columns
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
,	TokenNameCOMMA	
new	TokenNamenew	
Operation	TokenNameIdentifier	 Operation
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
2	TokenNameIntegerLiteral	
:	TokenNameCOLON	
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql/Cql.g:480:20: c= term ( '+' v= term | (op= '-' )? v= intTerm ) 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql/Cql.g:480:20: c= term ( '+' v= term | (op= '-' )? v= intTerm ) 
{	TokenNameLBRACE	
pushFollow	TokenNameIdentifier	 push Follow
(	TokenNameLPAREN	
FOLLOW_term_in_termPairWithOperation2997	TokenNameIdentifier	 FOLLOW term in term Pair With Operation2997
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
c	TokenNameIdentifier	 c
=	TokenNameEQUAL	
term	TokenNameIdentifier	 term
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
_fsp	TokenNameIdentifier	 fsp
--	TokenNameMINUS_MINUS	
;	TokenNameSEMICOLON	
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql/Cql.g:480:27: ( '+' v= term | (op= '-' )? v= intTerm ) 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql/Cql.g:480:27: ( '+' v= term | (op= '-' )? v= intTerm ) 
int	TokenNameint	
alt53	TokenNameIdentifier	 alt53
=	TokenNameEQUAL	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
LA53_0	TokenNameIdentifier	 L A53 0
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
LA53_0	TokenNameIdentifier	 L A53 0
==	TokenNameEQUAL_EQUAL	
102	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
alt53	TokenNameIdentifier	 alt53
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
LA53_0	TokenNameIdentifier	 L A53 0
==	TokenNameEQUAL_EQUAL	
INTEGER	TokenNameIdentifier	 INTEGER
||	TokenNameOR_OR	
LA53_0	TokenNameIdentifier	 L A53 0
==	TokenNameEQUAL_EQUAL	
103	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
alt53	TokenNameIdentifier	 alt53
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
53	TokenNameIntegerLiteral	
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
alt53	TokenNameIdentifier	 alt53
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
1	TokenNameIntegerLiteral	
:	TokenNameCOLON	
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql/Cql.g:480:29: '+' v= term 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql/Cql.g:480:29: '+' v= term 
{	TokenNameLBRACE	
match	TokenNameIdentifier	 match
(	TokenNameLPAREN	
input	TokenNameIdentifier	 input
,	TokenNameCOMMA	
102	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
FOLLOW_102_in_termPairWithOperation3001	TokenNameIdentifier	 FOLLOW 102 in term Pair With Operation3001
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
pushFollow	TokenNameIdentifier	 push Follow
(	TokenNameLPAREN	
FOLLOW_term_in_termPairWithOperation3006	TokenNameIdentifier	 FOLLOW term in term Pair With Operation3006
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
v	TokenNameIdentifier	 v
=	TokenNameEQUAL	
term	TokenNameIdentifier	 term
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
_fsp	TokenNameIdentifier	 fsp
--	TokenNameMINUS_MINUS	
;	TokenNameSEMICOLON	
columns	TokenNameIdentifier	 columns
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
,	TokenNameCOMMA	
new	TokenNamenew	
Operation	TokenNameIdentifier	 Operation
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
,	TokenNameCOMMA	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
cql	TokenNameIdentifier	 cql
.	TokenNameDOT	
Operation	TokenNameIdentifier	 Operation
.	TokenNameDOT	
OperationType	TokenNameIdentifier	 Operation Type
.	TokenNameDOT	
PLUS	TokenNameIdentifier	 PLUS
,	TokenNameCOMMA	
v	TokenNameIdentifier	 v
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
2	TokenNameIntegerLiteral	
:	TokenNameCOLON	
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql/Cql.g:481:31: (op= '-' )? v= intTerm 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql/Cql.g:481:31: (op= '-' )? v= intTerm 
{	TokenNameLBRACE	
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql/Cql.g:481:33: (op= '-' )? 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql/Cql.g:481:33: (op= '-' )? 
int	TokenNameint	
alt52	TokenNameIdentifier	 alt52
=	TokenNameEQUAL	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
LA52_0	TokenNameIdentifier	 L A52 0
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
LA52_0	TokenNameIdentifier	 L A52 0
==	TokenNameEQUAL_EQUAL	
103	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
alt52	TokenNameIdentifier	 alt52
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
switch	TokenNameswitch	
(	TokenNameLPAREN	
alt52	TokenNameIdentifier	 alt52
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
1	TokenNameIntegerLiteral	
:	TokenNameCOLON	
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql/Cql.g:481:33: op= '-' 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql/Cql.g:481:33: op= '-' 
{	TokenNameLBRACE	
op	TokenNameIdentifier	 op
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Token	TokenNameIdentifier	 Token
)	TokenNameRPAREN	
match	TokenNameIdentifier	 match
(	TokenNameLPAREN	
input	TokenNameIdentifier	 input
,	TokenNameCOMMA	
103	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
FOLLOW_103_in_termPairWithOperation3042	TokenNameIdentifier	 FOLLOW 103 in term Pair With Operation3042
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
pushFollow	TokenNameIdentifier	 push Follow
(	TokenNameLPAREN	
FOLLOW_intTerm_in_termPairWithOperation3047	TokenNameIdentifier	 FOLLOW int Term in term Pair With Operation3047
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
v	TokenNameIdentifier	 v
=	TokenNameEQUAL	
intTerm	TokenNameIdentifier	 int Term
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
_fsp	TokenNameIdentifier	 fsp
--	TokenNameMINUS_MINUS	
;	TokenNameSEMICOLON	
validateMinusSupplied	TokenNameIdentifier	 validate Minus Supplied
(	TokenNameLPAREN	
op	TokenNameIdentifier	 op
,	TokenNameCOMMA	
v	TokenNameIdentifier	 v
,	TokenNameCOMMA	
input	TokenNameIdentifier	 input
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
op	TokenNameIdentifier	 op
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
v	TokenNameIdentifier	 v
=	TokenNameEQUAL	
new	TokenNamenew	
Term	TokenNameIdentifier	 Term
(	TokenNameLPAREN	
-	TokenNameMINUS	
(	TokenNameLPAREN	
Long	TokenNameIdentifier	 Long
.	TokenNameDOT	
valueOf	TokenNameIdentifier	 value Of
(	TokenNameLPAREN	
v	TokenNameIdentifier	 v
.	TokenNameDOT	
getText	TokenNameIdentifier	 get Text
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
v	TokenNameIdentifier	 v
.	TokenNameDOT	
getType	TokenNameIdentifier	 get Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
columns	TokenNameIdentifier	 columns
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
,	TokenNameCOMMA	
new	TokenNamenew	
Operation	TokenNameIdentifier	 Operation
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
,	TokenNameCOMMA	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
cql	TokenNameIdentifier	 cql
.	TokenNameDOT	
Operation	TokenNameIdentifier	 Operation
.	TokenNameDOT	
OperationType	TokenNameIdentifier	 Operation Type
.	TokenNameDOT	
MINUS	TokenNameIdentifier	 MINUS
,	TokenNameCOMMA	
v	TokenNameIdentifier	 v
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
RecognitionException	TokenNameIdentifier	 Recognition Exception
re	TokenNameIdentifier	 re
)	TokenNameRPAREN	
{	TokenNameLBRACE	
reportError	TokenNameIdentifier	 report Error
(	TokenNameLPAREN	
re	TokenNameIdentifier	 re
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
recover	TokenNameIdentifier	 recover
(	TokenNameLPAREN	
input	TokenNameIdentifier	 input
,	TokenNameCOMMA	
re	TokenNameIdentifier	 re
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
finally	TokenNamefinally	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// $ANTLR end "termPairWithOperation" 	TokenNameCOMMENT_LINE	$ANTLR end "termPairWithOperation" 
// $ANTLR start "relation" 	TokenNameCOMMENT_LINE	$ANTLR start "relation" 
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql/Cql.g:488:1: relation returns [Relation rel] : name= term type= ( '=' | '<' | '<=' | '>=' | '>' ) t= term ; 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql/Cql.g:488:1: relation returns [Relation rel] : name= term type= ( '=' | '<' | '<=' | '>=' | '>' ) t= term ; 
public	TokenNamepublic	
final	TokenNamefinal	
Relation	TokenNameIdentifier	 Relation
relation	TokenNameIdentifier	 relation
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
RecognitionException	TokenNameIdentifier	 Recognition Exception
{	TokenNameLBRACE	
Relation	TokenNameIdentifier	 Relation
rel	TokenNameIdentifier	 rel
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
Token	TokenNameIdentifier	 Token
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
Term	TokenNameIdentifier	 Term
name	TokenNameIdentifier	 name
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
Term	TokenNameIdentifier	 Term
t	TokenNameIdentifier	 t
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql/Cql.g:489:5: (name= term type= ( '=' | '<' | '<=' | '>=' | '>' ) t= term ) 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql/Cql.g:489:5: (name= term type= ( '=' | '<' | '<=' | '>=' | '>' ) t= term ) 
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql/Cql.g:489:7: name= term type= ( '=' | '<' | '<=' | '>=' | '>' ) t= term 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql/Cql.g:489:7: name= term type= ( '=' | '<' | '<=' | '>=' | '>' ) t= term 
{	TokenNameLBRACE	
pushFollow	TokenNameIdentifier	 push Follow
(	TokenNameLPAREN	
FOLLOW_term_in_relation3110	TokenNameIdentifier	 FOLLOW term in relation3110
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
name	TokenNameIdentifier	 name
=	TokenNameEQUAL	
term	TokenNameIdentifier	 term
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
_fsp	TokenNameIdentifier	 fsp
--	TokenNameMINUS_MINUS	
;	TokenNameSEMICOLON	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Token	TokenNameIdentifier	 Token
)	TokenNameRPAREN	
input	TokenNameIdentifier	 input
.	TokenNameDOT	
LT	TokenNameIdentifier	 LT
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
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
87	TokenNameIntegerLiteral	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
input	TokenNameIdentifier	 input
.	TokenNameDOT	
LA	TokenNameIdentifier	 LA
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
>=	TokenNameGREATER_EQUAL	
104	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
input	TokenNameIdentifier	 input
.	TokenNameDOT	
LA	TokenNameIdentifier	 LA
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
<=	TokenNameLESS_EQUAL	
107	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
input	TokenNameIdentifier	 input
.	TokenNameDOT	
consume	TokenNameIdentifier	 consume
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
errorRecovery	TokenNameIdentifier	 error Recovery
=	TokenNameEQUAL	
false	TokenNamefalse	
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
throw	TokenNamethrow	
mse	TokenNameIdentifier	 mse
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
pushFollow	TokenNameIdentifier	 push Follow
(	TokenNameLPAREN	
FOLLOW_term_in_relation3136	TokenNameIdentifier	 FOLLOW term in relation3136
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
t	TokenNameIdentifier	 t
=	TokenNameEQUAL	
term	TokenNameIdentifier	 term
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
_fsp	TokenNameIdentifier	 fsp
--	TokenNameMINUS_MINUS	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
new	TokenNamenew	
Relation	TokenNameIdentifier	 Relation
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
?	TokenNameQUESTION	
type	TokenNameIdentifier	 type
.	TokenNameDOT	
getText	TokenNameIdentifier	 get Text
(	TokenNameLPAREN	
)	TokenNameRPAREN	
:	TokenNameCOLON	
null	TokenNamenull	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
t	TokenNameIdentifier	 t
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
RecognitionException	TokenNameIdentifier	 Recognition Exception
re	TokenNameIdentifier	 re
)	TokenNameRPAREN	
{	TokenNameLBRACE	
reportError	TokenNameIdentifier	 report Error
(	TokenNameLPAREN	
re	TokenNameIdentifier	 re
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
recover	TokenNameIdentifier	 recover
(	TokenNameLPAREN	
input	TokenNameIdentifier	 input
,	TokenNameCOMMA	
re	TokenNameIdentifier	 re
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
finally	TokenNamefinally	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
rel	TokenNameIdentifier	 rel
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// $ANTLR end "relation" 	TokenNameCOMMENT_LINE	$ANTLR end "relation" 
// $ANTLR start "truncateStatement" 	TokenNameCOMMENT_LINE	$ANTLR start "truncateStatement" 
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql/Cql.g:494:1: truncateStatement returns [Pair<String,String> cf] : K_TRUNCATE (keyspace= ( IDENT | STRING_LITERAL | INTEGER ) '.' )? columnFamily= ( IDENT | STRING_LITERAL | INTEGER ) endStmnt ; 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql/Cql.g:494:1: truncateStatement returns [Pair<String,String> cf] : K_TRUNCATE (keyspace= ( IDENT | STRING_LITERAL | INTEGER ) '.' )? columnFamily= ( IDENT | STRING_LITERAL | INTEGER ) endStmnt ; 
public	TokenNamepublic	
final	TokenNamefinal	
Pair	TokenNameIdentifier	 Pair
<	TokenNameLESS	
String	TokenNameIdentifier	 String
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
truncateStatement	TokenNameIdentifier	 truncate Statement
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
RecognitionException	TokenNameIdentifier	 Recognition Exception
{	TokenNameLBRACE	
Pair	TokenNameIdentifier	 Pair
<	TokenNameLESS	
String	TokenNameIdentifier	 String
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
cf	TokenNameIdentifier	 cf
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
Token	TokenNameIdentifier	 Token
keyspace	TokenNameIdentifier	 keyspace
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
Token	TokenNameIdentifier	 Token
columnFamily	TokenNameIdentifier	 column Family
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql/Cql.g:495:5: ( K_TRUNCATE (keyspace= ( IDENT | STRING_LITERAL | INTEGER ) '.' )? columnFamily= ( IDENT | STRING_LITERAL | INTEGER ) endStmnt ) 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql/Cql.g:495:5: ( K_TRUNCATE (keyspace= ( IDENT | STRING_LITERAL | INTEGER ) '.' )? columnFamily= ( IDENT | STRING_LITERAL | INTEGER ) endStmnt ) 
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql/Cql.g:495:7: K_TRUNCATE (keyspace= ( IDENT | STRING_LITERAL | INTEGER ) '.' )? columnFamily= ( IDENT | STRING_LITERAL | INTEGER ) endStmnt 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql/Cql.g:495:7: K_TRUNCATE (keyspace= ( IDENT | STRING_LITERAL | INTEGER ) '.' )? columnFamily= ( IDENT | STRING_LITERAL | INTEGER ) endStmnt 
{	TokenNameLBRACE	
match	TokenNameIdentifier	 match
(	TokenNameLPAREN	
input	TokenNameIdentifier	 input
,	TokenNameCOMMA	
K_TRUNCATE	TokenNameIdentifier	 K  TRUNCATE
,	TokenNameCOMMA	
FOLLOW_K_TRUNCATE_in_truncateStatement3166	TokenNameIdentifier	 FOLLOW  K  TRUNCATE in truncate Statement3166
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql/Cql.g:495:18: (keyspace= ( IDENT | STRING_LITERAL | INTEGER ) '.' )? 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql/Cql.g:495:18: (keyspace= ( IDENT | STRING_LITERAL | INTEGER ) '.' )? 
int	TokenNameint	
alt55	TokenNameIdentifier	 alt55
=	TokenNameEQUAL	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
LA55_0	TokenNameIdentifier	 L A55 0
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
LA55_0	TokenNameIdentifier	 L A55 0
>=	TokenNameGREATER_EQUAL	
IDENT	TokenNameIdentifier	 IDENT
&&	TokenNameAND_AND	
LA55_0	TokenNameIdentifier	 L A55 0
<=	TokenNameLESS_EQUAL	
STRING_LITERAL	TokenNameIdentifier	 STRING  LITERAL
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
LA55_1	TokenNameIdentifier	 L A55 1
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
LA55_1	TokenNameIdentifier	 L A55 1
==	TokenNameEQUAL_EQUAL	
83	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
alt55	TokenNameIdentifier	 alt55
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
switch	TokenNameswitch	
(	TokenNameLPAREN	
alt55	TokenNameIdentifier	 alt55
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
1	TokenNameIntegerLiteral	
:	TokenNameCOLON	
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql/Cql.g:495:19: keyspace= ( IDENT | STRING_LITERAL | INTEGER ) '.' 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql/Cql.g:495:19: keyspace= ( IDENT | STRING_LITERAL | INTEGER ) '.' 
{	TokenNameLBRACE	
keyspace	TokenNameIdentifier	 keyspace
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Token	TokenNameIdentifier	 Token
)	TokenNameRPAREN	
input	TokenNameIdentifier	 input
.	TokenNameDOT	
LT	TokenNameIdentifier	 LT
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
IDENT	TokenNameIdentifier	 IDENT
&&	TokenNameAND_AND	
input	TokenNameIdentifier	 input
.	TokenNameDOT	
LA	TokenNameIdentifier	 LA
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
<=	TokenNameLESS_EQUAL	
STRING_LITERAL	TokenNameIdentifier	 STRING  LITERAL
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
input	TokenNameIdentifier	 input
.	TokenNameDOT	
consume	TokenNameIdentifier	 consume
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
errorRecovery	TokenNameIdentifier	 error Recovery
=	TokenNameEQUAL	
false	TokenNamefalse	
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
throw	TokenNamethrow	
mse	TokenNameIdentifier	 mse
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
match	TokenNameIdentifier	 match
(	TokenNameLPAREN	
input	TokenNameIdentifier	 input
,	TokenNameCOMMA	
83	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
FOLLOW_83_in_truncateStatement3185	TokenNameIdentifier	 FOLLOW 83 in truncate Statement3185
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
columnFamily	TokenNameIdentifier	 column Family
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Token	TokenNameIdentifier	 Token
)	TokenNameRPAREN	
input	TokenNameIdentifier	 input
.	TokenNameDOT	
LT	TokenNameIdentifier	 LT
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
IDENT	TokenNameIdentifier	 IDENT
&&	TokenNameAND_AND	
input	TokenNameIdentifier	 input
.	TokenNameDOT	
LA	TokenNameIdentifier	 LA
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
<=	TokenNameLESS_EQUAL	
STRING_LITERAL	TokenNameIdentifier	 STRING  LITERAL
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
input	TokenNameIdentifier	 input
.	TokenNameDOT	
consume	TokenNameIdentifier	 consume
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
errorRecovery	TokenNameIdentifier	 error Recovery
=	TokenNameEQUAL	
false	TokenNamefalse	
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
throw	TokenNamethrow	
mse	TokenNameIdentifier	 mse
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
cf	TokenNameIdentifier	 cf
=	TokenNameEQUAL	
Pair	TokenNameIdentifier	 Pair
.	TokenNameDOT	
create	TokenNameIdentifier	 create
(	TokenNameLPAREN	
(	TokenNameLPAREN	
keyspace	TokenNameIdentifier	 keyspace
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
?	TokenNameQUESTION	
keyspace	TokenNameIdentifier	 keyspace
.	TokenNameDOT	
getText	TokenNameIdentifier	 get Text
(	TokenNameLPAREN	
)	TokenNameRPAREN	
:	TokenNameCOLON	
null	TokenNamenull	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
(	TokenNameLPAREN	
columnFamily	TokenNameIdentifier	 column Family
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
?	TokenNameQUESTION	
columnFamily	TokenNameIdentifier	 column Family
.	TokenNameDOT	
getText	TokenNameIdentifier	 get Text
(	TokenNameLPAREN	
)	TokenNameRPAREN	
:	TokenNameCOLON	
null	TokenNamenull	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
pushFollow	TokenNameIdentifier	 push Follow
(	TokenNameLPAREN	
FOLLOW_endStmnt_in_truncateStatement3207	TokenNameIdentifier	 FOLLOW end Stmnt in truncate Statement3207
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
endStmnt	TokenNameIdentifier	 end Stmnt
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
_fsp	TokenNameIdentifier	 fsp
--	TokenNameMINUS_MINUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
RecognitionException	TokenNameIdentifier	 Recognition Exception
re	TokenNameIdentifier	 re
)	TokenNameRPAREN	
{	TokenNameLBRACE	
reportError	TokenNameIdentifier	 report Error
(	TokenNameLPAREN	
re	TokenNameIdentifier	 re
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
recover	TokenNameIdentifier	 recover
(	TokenNameLPAREN	
input	TokenNameIdentifier	 input
,	TokenNameCOMMA	
re	TokenNameIdentifier	 re
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
finally	TokenNamefinally	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
cf	TokenNameIdentifier	 cf
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// $ANTLR end "truncateStatement" 	TokenNameCOMMENT_LINE	$ANTLR end "truncateStatement" 
// $ANTLR start "endStmnt" 	TokenNameCOMMENT_LINE	$ANTLR start "endStmnt" 
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql/Cql.g:498:1: endStmnt : ( ';' )? EOF ; 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql/Cql.g:498:1: endStmnt : ( ';' )? EOF ; 
public	TokenNamepublic	
final	TokenNamefinal	
void	TokenNamevoid	
endStmnt	TokenNameIdentifier	 end Stmnt
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
RecognitionException	TokenNameIdentifier	 Recognition Exception
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql/Cql.g:499:5: ( ( ';' )? EOF ) 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql/Cql.g:499:5: ( ( ';' )? EOF ) 
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql/Cql.g:499:7: ( ';' )? EOF 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql/Cql.g:499:7: ( ';' )? EOF 
{	TokenNameLBRACE	
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql/Cql.g:499:7: ( ';' )? 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql/Cql.g:499:7: ( ';' )? 
int	TokenNameint	
alt56	TokenNameIdentifier	 alt56
=	TokenNameEQUAL	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
LA56_0	TokenNameIdentifier	 L A56 0
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
LA56_0	TokenNameIdentifier	 L A56 0
==	TokenNameEQUAL_EQUAL	
86	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
alt56	TokenNameIdentifier	 alt56
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
switch	TokenNameswitch	
(	TokenNameLPAREN	
alt56	TokenNameIdentifier	 alt56
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
1	TokenNameIntegerLiteral	
:	TokenNameCOLON	
// /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql/Cql.g:499:7: ';' 	TokenNameCOMMENT_LINE	/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql/Cql.g:499:7: ';' 
{	TokenNameLBRACE	
match	TokenNameIdentifier	 match
(	TokenNameLPAREN	
input	TokenNameIdentifier	 input
,	TokenNameCOMMA	
86	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
FOLLOW_86_in_endStmnt3224	TokenNameIdentifier	 FOLLOW 86 in end Stmnt3224
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
match	TokenNameIdentifier	 match
(	TokenNameLPAREN	
input	TokenNameIdentifier	 input
,	TokenNameCOMMA	
EOF	TokenNameIdentifier	 EOF
,	TokenNameCOMMA	
FOLLOW_EOF_in_endStmnt3228	TokenNameIdentifier	 FOLLOW  EOF in end Stmnt3228
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
RecognitionException	TokenNameIdentifier	 Recognition Exception
re	TokenNameIdentifier	 re
)	TokenNameRPAREN	
{	TokenNameLBRACE	
reportError	TokenNameIdentifier	 report Error
(	TokenNameLPAREN	
re	TokenNameIdentifier	 re
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
recover	TokenNameIdentifier	 recover
(	TokenNameLPAREN	
input	TokenNameIdentifier	 input
,	TokenNameCOMMA	
re	TokenNameIdentifier	 re
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
finally	TokenNamefinally	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// $ANTLR end "endStmnt" 	TokenNameCOMMENT_LINE	$ANTLR end "endStmnt" 
// Delegated rules 	TokenNameCOMMENT_LINE	Delegated rules 
protected	TokenNameprotected	
DFA1	TokenNameIdentifier	 DF A1
dfa1	TokenNameIdentifier	 dfa1
=	TokenNameEQUAL	
new	TokenNamenew	
DFA1	TokenNameIdentifier	 DF A1
(	TokenNameLPAREN	
this	TokenNamethis	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
DFA10	TokenNameIdentifier	 DF A10
dfa10	TokenNameIdentifier	 dfa10
=	TokenNameEQUAL	
new	TokenNamenew	
DFA10	TokenNameIdentifier	 DF A10
(	TokenNameLPAREN	
this	TokenNamethis	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
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
protected	TokenNameprotected	
DFA43	TokenNameIdentifier	 DF A43
dfa43	TokenNameIdentifier	 dfa43
=	TokenNameEQUAL	
new	TokenNamenew	
DFA43	TokenNameIdentifier	 DF A43
(	TokenNameLPAREN	
this	TokenNamethis	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
DFA54	TokenNameIdentifier	 DF A54
dfa54	TokenNameIdentifier	 dfa54
=	TokenNameEQUAL	
new	TokenNamenew	
DFA54	TokenNameIdentifier	 DF A54
(	TokenNameLPAREN	
this	TokenNamethis	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
DFA1_eotS	TokenNameIdentifier	 DF A1 eot S
=	TokenNameEQUAL	
"?"	TokenNameStringLiteral	?
;	TokenNameSEMICOLON	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
DFA1_eofS	TokenNameIdentifier	 DF A1 eof S
=	TokenNameEQUAL	
"?"	TokenNameStringLiteral	?
;	TokenNameSEMICOLON	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
DFA1_minS	TokenNameIdentifier	 DF A1 min S
=	TokenNameEQUAL	
"?!?"	TokenNameStringLiteral	?!?
;	TokenNameSEMICOLON	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
DFA1_maxS	TokenNameIdentifier	 DF A1 max S
=	TokenNameEQUAL	
"0?(?"	TokenNameStringLiteral	0?(?
;	TokenNameSEMICOLON	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
DFA1_acceptS	TokenNameIdentifier	 DF A1 accept S
=	TokenNameEQUAL	
"??  "	TokenNameStringLiteral	??  
+	TokenNamePLUS	
"   "	TokenNameStringLiteral	   
;	TokenNameSEMICOLON	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
DFA1_specialS	TokenNameIdentifier	 DF A1 special S
=	TokenNameEQUAL	
"?}>"	TokenNameStringLiteral	?}>
;	TokenNameSEMICOLON	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
DFA1_transitionS	TokenNameIdentifier	 DF A1 transition S
=	TokenNameEQUAL	
{	TokenNameLBRACE	
"? ????"	TokenNameStringLiteral	? ????
+	TokenNamePLUS	
" ?  ?"	TokenNameStringLiteral	 ?  ?
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
" ? ? "	TokenNameStringLiteral	 ? ? 
,	TokenNameCOMMA	
"??"	TokenNameStringLiteral	??
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
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
static	TokenNamestatic	
final	TokenNamefinal	
short	TokenNameshort	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
DFA1_eot	TokenNameIdentifier	 DF A1 eot
=	TokenNameEQUAL	
DFA	TokenNameIdentifier	 DFA
.	TokenNameDOT	
unpackEncodedString	TokenNameIdentifier	 unpack Encoded String
(	TokenNameLPAREN	
DFA1_eotS	TokenNameIdentifier	 DF A1 eot S
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
static	TokenNamestatic	
final	TokenNamefinal	
short	TokenNameshort	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
DFA1_eof	TokenNameIdentifier	 DF A1 eof
=	TokenNameEQUAL	
DFA	TokenNameIdentifier	 DFA
.	TokenNameDOT	
unpackEncodedString	TokenNameIdentifier	 unpack Encoded String
(	TokenNameLPAREN	
DFA1_eofS	TokenNameIdentifier	 DF A1 eof S
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
static	TokenNamestatic	
final	TokenNamefinal	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
DFA1_min	TokenNameIdentifier	 DF A1 min
=	TokenNameEQUAL	
DFA	TokenNameIdentifier	 DFA
.	TokenNameDOT	
unpackEncodedStringToUnsignedChars	TokenNameIdentifier	 unpack Encoded String To Unsigned Chars
(	TokenNameLPAREN	
DFA1_minS	TokenNameIdentifier	 DF A1 min S
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
static	TokenNamestatic	
final	TokenNamefinal	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
DFA1_max	TokenNameIdentifier	 DF A1 max
=	TokenNameEQUAL	
DFA	TokenNameIdentifier	 DFA
.	TokenNameDOT	
unpackEncodedStringToUnsignedChars	TokenNameIdentifier	 unpack Encoded String To Unsigned Chars
(	TokenNameLPAREN	
DFA1_maxS	TokenNameIdentifier	 DF A1 max S
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
static	TokenNamestatic	
final	TokenNamefinal	
short	TokenNameshort	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
DFA1_accept	TokenNameIdentifier	 DF A1 accept
=	TokenNameEQUAL	
DFA	TokenNameIdentifier	 DFA
.	TokenNameDOT	
unpackEncodedString	TokenNameIdentifier	 unpack Encoded String
(	TokenNameLPAREN	
DFA1_acceptS	TokenNameIdentifier	 DF A1 accept S
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
static	TokenNamestatic	
final	TokenNamefinal	
short	TokenNameshort	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
DFA1_special	TokenNameIdentifier	 DF A1 special
=	TokenNameEQUAL	
DFA	TokenNameIdentifier	 DFA
.	TokenNameDOT	
unpackEncodedString	TokenNameIdentifier	 unpack Encoded String
(	TokenNameLPAREN	
DFA1_specialS	TokenNameIdentifier	 DF A1 special S
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
static	TokenNamestatic	
final	TokenNamefinal	
short	TokenNameshort	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
DFA1_transition	TokenNameIdentifier	 DF A1 transition
;	TokenNameSEMICOLON	
static	TokenNamestatic	
{	TokenNameLBRACE	
int	TokenNameint	
numStates	TokenNameIdentifier	 num States
=	TokenNameEQUAL	
DFA1_transitionS	TokenNameIdentifier	 DF A1 transition S
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
DFA1_transition	TokenNameIdentifier	 DF A1 transition
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
DFA1_transition	TokenNameIdentifier	 DF A1 transition
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
DFA	TokenNameIdentifier	 DFA
.	TokenNameDOT	
unpackEncodedString	TokenNameIdentifier	 unpack Encoded String
(	TokenNameLPAREN	
DFA1_transitionS	TokenNameIdentifier	 DF A1 transition S
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
class	TokenNameclass	
DFA1	TokenNameIdentifier	 DF A1
extends	TokenNameextends	
DFA	TokenNameIdentifier	 DFA
{	TokenNameLBRACE	
public	TokenNamepublic	
DFA1	TokenNameIdentifier	 DF A1
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
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
eot	TokenNameIdentifier	 eot
=	TokenNameEQUAL	
DFA1_eot	TokenNameIdentifier	 DF A1 eot
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
eof	TokenNameIdentifier	 eof
=	TokenNameEQUAL	
DFA1_eof	TokenNameIdentifier	 DF A1 eof
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
min	TokenNameIdentifier	 min
=	TokenNameEQUAL	
DFA1_min	TokenNameIdentifier	 DF A1 min
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
max	TokenNameIdentifier	 max
=	TokenNameEQUAL	
DFA1_max	TokenNameIdentifier	 DF A1 max
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
accept	TokenNameIdentifier	 accept
=	TokenNameEQUAL	
DFA1_accept	TokenNameIdentifier	 DF A1 accept
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
special	TokenNameIdentifier	 special
=	TokenNameEQUAL	
DFA1_special	TokenNameIdentifier	 DF A1 special
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
transition	TokenNameIdentifier	 transition
=	TokenNameEQUAL	
DFA1_transition	TokenNameIdentifier	 DF A1 transition
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getDescription	TokenNameIdentifier	 get Description
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
"114:1: query returns [CQLStatement stmnt] : ( selectStatement | insertStatement endStmnt | updateStatement endStmnt | batchStatement | useStatement | truncateStatement | deleteStatement endStmnt | createKeyspaceStatement | createColumnFamilyStatement | createIndexStatement | dropIndexStatement | dropKeyspaceStatement | dropColumnFamilyStatement | alterTableStatement );"	TokenNameStringLiteral	114:1: query returns [CQLStatement stmnt] : ( selectStatement | insertStatement endStmnt | updateStatement endStmnt | batchStatement | useStatement | truncateStatement | deleteStatement endStmnt | createKeyspaceStatement | createColumnFamilyStatement | createIndexStatement | dropIndexStatement | dropKeyspaceStatement | dropColumnFamilyStatement | alterTableStatement );
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
DFA10_eotS	TokenNameIdentifier	 DF A10 eot S
=	TokenNameEQUAL	
" ?"	TokenNameStringLiteral	 ?
;	TokenNameSEMICOLON	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
DFA10_eofS	TokenNameIdentifier	 DF A10 eof S
=	TokenNameEQUAL	
" ?"	TokenNameStringLiteral	 ?
;	TokenNameSEMICOLON	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
DFA10_minS	TokenNameIdentifier	 DF A10 min S
=	TokenNameEQUAL	
" ?"	TokenNameStringLiteral	 ?
;	TokenNameSEMICOLON	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
DFA10_maxS	TokenNameIdentifier	 DF A10 max S
=	TokenNameEQUAL	
"UT?"	TokenNameStringLiteral	UT?
;	TokenNameSEMICOLON	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
DFA10_acceptS	TokenNameIdentifier	 DF A10 accept S
=	TokenNameEQUAL	
"?"	TokenNameStringLiteral	?
;	TokenNameSEMICOLON	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
DFA10_specialS	TokenNameIdentifier	 DF A10 special S
=	TokenNameEQUAL	
" ?}>"	TokenNameStringLiteral	 ?}>
;	TokenNameSEMICOLON	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
DFA10_transitionS	TokenNameIdentifier	 DF A10 transition S
=	TokenNameEQUAL	
{	TokenNameLBRACE	
"??%?"	TokenNameStringLiteral	??%?
,	TokenNameCOMMA	
" ? ?? ? "	TokenNameStringLiteral	 ? ?? ? 
,	TokenNameCOMMA	
" ? ?? ? "	TokenNameStringLiteral	 ? ?? ? 
,	TokenNameCOMMA	
" ? ?? ? "	TokenNameStringLiteral	 ? ?? ? 
,	TokenNameCOMMA	
" ? ?? ? "	TokenNameStringLiteral	 ? ?? ? 
,	TokenNameCOMMA	
" ? ?? ? "	TokenNameStringLiteral	 ? ?? ? 
,	TokenNameCOMMA	
" ? ?? ? "	TokenNameStringLiteral	 ? ?? ? 
,	TokenNameCOMMA	
" ? ?? ? "	TokenNameStringLiteral	 ? ?? ? 
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
DFA10_eot	TokenNameIdentifier	 DF A10 eot
=	TokenNameEQUAL	
DFA	TokenNameIdentifier	 DFA
.	TokenNameDOT	
unpackEncodedString	TokenNameIdentifier	 unpack Encoded String
(	TokenNameLPAREN	
DFA10_eotS	TokenNameIdentifier	 DF A10 eot S
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
static	TokenNamestatic	
final	TokenNamefinal	
short	TokenNameshort	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
DFA10_eof	TokenNameIdentifier	 DF A10 eof
=	TokenNameEQUAL	
DFA	TokenNameIdentifier	 DFA
.	TokenNameDOT	
unpackEncodedString	TokenNameIdentifier	 unpack Encoded String
(	TokenNameLPAREN	
DFA10_eofS	TokenNameIdentifier	 DF A10 eof S
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
static	TokenNamestatic	
final	TokenNamefinal	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
DFA10_min	TokenNameIdentifier	 DF A10 min
=	TokenNameEQUAL	
DFA	TokenNameIdentifier	 DFA
.	TokenNameDOT	
unpackEncodedStringToUnsignedChars	TokenNameIdentifier	 unpack Encoded String To Unsigned Chars
(	TokenNameLPAREN	
DFA10_minS	TokenNameIdentifier	 DF A10 min S
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
static	TokenNamestatic	
final	TokenNamefinal	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
DFA10_max	TokenNameIdentifier	 DF A10 max
=	TokenNameEQUAL	
DFA	TokenNameIdentifier	 DFA
.	TokenNameDOT	
unpackEncodedStringToUnsignedChars	TokenNameIdentifier	 unpack Encoded String To Unsigned Chars
(	TokenNameLPAREN	
DFA10_maxS	TokenNameIdentifier	 DF A10 max S
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
static	TokenNamestatic	
final	TokenNamefinal	
short	TokenNameshort	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
DFA10_accept	TokenNameIdentifier	 DF A10 accept
=	TokenNameEQUAL	
DFA	TokenNameIdentifier	 DFA
.	TokenNameDOT	
unpackEncodedString	TokenNameIdentifier	 unpack Encoded String
(	TokenNameLPAREN	
DFA10_acceptS	TokenNameIdentifier	 DF A10 accept S
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
static	TokenNamestatic	
final	TokenNamefinal	
short	TokenNameshort	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
DFA10_special	TokenNameIdentifier	 DF A10 special
=	TokenNameEQUAL	
DFA	TokenNameIdentifier	 DFA
.	TokenNameDOT	
unpackEncodedString	TokenNameIdentifier	 unpack Encoded String
(	TokenNameLPAREN	
DFA10_specialS	TokenNameIdentifier	 DF A10 special S
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
static	TokenNamestatic	
final	TokenNamefinal	
short	TokenNameshort	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
DFA10_transition	TokenNameIdentifier	 DF A10 transition
;	TokenNameSEMICOLON	
static	TokenNamestatic	
{	TokenNameLBRACE	
int	TokenNameint	
numStates	TokenNameIdentifier	 num States
=	TokenNameEQUAL	
DFA10_transitionS	TokenNameIdentifier	 DF A10 transition S
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
DFA10_transition	TokenNameIdentifier	 DF A10 transition
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
DFA10_transition	TokenNameIdentifier	 DF A10 transition
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
DFA	TokenNameIdentifier	 DFA
.	TokenNameDOT	
unpackEncodedString	TokenNameIdentifier	 unpack Encoded String
(	TokenNameLPAREN	
DFA10_transitionS	TokenNameIdentifier	 DF A10 transition S
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
class	TokenNameclass	
DFA10	TokenNameIdentifier	 DF A10
extends	TokenNameextends	
DFA	TokenNameIdentifier	 DFA
{	TokenNameLBRACE	
public	TokenNamepublic	
DFA10	TokenNameIdentifier	 DF A10
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
10	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
eot	TokenNameIdentifier	 eot
=	TokenNameEQUAL	
DFA10_eot	TokenNameIdentifier	 DF A10 eot
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
eof	TokenNameIdentifier	 eof
=	TokenNameEQUAL	
DFA10_eof	TokenNameIdentifier	 DF A10 eof
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
min	TokenNameIdentifier	 min
=	TokenNameEQUAL	
DFA10_min	TokenNameIdentifier	 DF A10 min
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
max	TokenNameIdentifier	 max
=	TokenNameEQUAL	
DFA10_max	TokenNameIdentifier	 DF A10 max
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
accept	TokenNameIdentifier	 accept
=	TokenNameEQUAL	
DFA10_accept	TokenNameIdentifier	 DF A10 accept
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
special	TokenNameIdentifier	 special
=	TokenNameEQUAL	
DFA10_special	TokenNameIdentifier	 DF A10 special
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
transition	TokenNameIdentifier	 transition
=	TokenNameEQUAL	
DFA10_transition	TokenNameIdentifier	 DF A10 transition
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getDescription	TokenNameIdentifier	 get Description
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
"185:7: (first= term ( ',' next= term )* | start= term RANGEOP finish= term | '\*' )"	TokenNameStringLiteral	185:7: (first= term ( ',' next= term )* | start= term RANGEOP finish= term | '\*' )
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
DFA13_eotS	TokenNameIdentifier	 DF A13 eot S
=	TokenNameEQUAL	
" ?"	TokenNameStringLiteral	 ?
;	TokenNameSEMICOLON	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
DFA13_eofS	TokenNameIdentifier	 DF A13 eof S
=	TokenNameEQUAL	
" ?"	TokenNameStringLiteral	 ?
;	TokenNameSEMICOLON	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
DFA13_minS	TokenNameIdentifier	 DF A13 min S
=	TokenNameEQUAL	
"?"	TokenNameStringLiteral	?
;	TokenNameSEMICOLON	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
DFA13_maxS	TokenNameIdentifier	 DF A13 max S
=	TokenNameEQUAL	
"/k?"	TokenNameStringLiteral	/k?
;	TokenNameSEMICOLON	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
DFA13_acceptS	TokenNameIdentifier	 DF A13 accept S
=	TokenNameEQUAL	
"?"	TokenNameStringLiteral	?
;	TokenNameSEMICOLON	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
DFA13_specialS	TokenNameIdentifier	 DF A13 special S
=	TokenNameEQUAL	
" ?}>"	TokenNameStringLiteral	 ?}>
;	TokenNameSEMICOLON	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
DFA13_transitionS	TokenNameIdentifier	 DF A13 transition S
=	TokenNameEQUAL	
{	TokenNameLBRACE	
"??"	TokenNameStringLiteral	??
,	TokenNameCOMMA	
" B??"	TokenNameStringLiteral	 B??
,	TokenNameCOMMA	
" B??"	TokenNameStringLiteral	 B??
,	TokenNameCOMMA	
" B??"	TokenNameStringLiteral	 B??
,	TokenNameCOMMA	
" B??"	TokenNameStringLiteral	 B??
,	TokenNameCOMMA	
" B??"	TokenNameStringLiteral	 B??
,	TokenNameCOMMA	
" B??"	TokenNameStringLiteral	 B??
,	TokenNameCOMMA	
" B??"	TokenNameStringLiteral	 B??
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
"193:1: whereClause returns [WhereClause clause] : (first= relation ( K_AND next= relation )* | key_alias= term K_IN '(' f1= term ( ',' fN= term )* ')' );"	TokenNameStringLiteral	193:1: whereClause returns [WhereClause clause] : (first= relation ( K_AND next= relation )* | key_alias= term K_IN '(' f1= term ( ',' fN= term )* ')' );
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
DFA43_eotS	TokenNameIdentifier	 DF A43 eot S
=	TokenNameEQUAL	
" ?"	TokenNameStringLiteral	 ?
;	TokenNameSEMICOLON	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
DFA43_eofS	TokenNameIdentifier	 DF A43 eof S
=	TokenNameEQUAL	
" ?"	TokenNameStringLiteral	 ?
;	TokenNameSEMICOLON	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
DFA43_minS	TokenNameIdentifier	 DF A43 min S
=	TokenNameEQUAL	
"%?"	TokenNameStringLiteral	%?
;	TokenNameSEMICOLON	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
DFA43_maxS	TokenNameIdentifier	 DF A43 max S
=	TokenNameEQUAL	
"/eT?"	TokenNameStringLiteral	/eT?
;	TokenNameSEMICOLON	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
DFA43_acceptS	TokenNameIdentifier	 DF A43 accept S
=	TokenNameEQUAL	
" ?"	TokenNameStringLiteral	 ?
;	TokenNameSEMICOLON	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
DFA43_specialS	TokenNameIdentifier	 DF A43 special S
=	TokenNameEQUAL	
" ?}>"	TokenNameStringLiteral	 ?}>
;	TokenNameSEMICOLON	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
DFA43_transitionS	TokenNameIdentifier	 DF A43 transition S
=	TokenNameEQUAL	
{	TokenNameLBRACE	
"??"	TokenNameStringLiteral	??
,	TokenNameCOMMA	
" P?"	TokenNameStringLiteral	 P?
,	TokenNameCOMMA	
" P?"	TokenNameStringLiteral	 P?
,	TokenNameCOMMA	
" P?"	TokenNameStringLiteral	 P?
,	TokenNameCOMMA	
" P?"	TokenNameStringLiteral	 P?
,	TokenNameCOMMA	
" P?"	TokenNameStringLiteral	 P?
,	TokenNameCOMMA	
" P?"	TokenNameStringLiteral	 P?
,	TokenNameCOMMA	
" P?"	TokenNameStringLiteral	 P?
,	TokenNameCOMMA	
" ,? ? "	TokenNameStringLiteral	 ,? ? 
,	TokenNameCOMMA	
" ,? ? "	TokenNameStringLiteral	 ,? ? 
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
DFA43_eot	TokenNameIdentifier	 DF A43 eot
=	TokenNameEQUAL	
DFA	TokenNameIdentifier	 DFA
.	TokenNameDOT	
unpackEncodedString	TokenNameIdentifier	 unpack Encoded String
(	TokenNameLPAREN	
DFA43_eotS	TokenNameIdentifier	 DF A43 eot S
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
static	TokenNamestatic	
final	TokenNamefinal	
short	TokenNameshort	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
DFA43_eof	TokenNameIdentifier	 DF A43 eof
=	TokenNameEQUAL	
DFA	TokenNameIdentifier	 DFA
.	TokenNameDOT	
unpackEncodedString	TokenNameIdentifier	 unpack Encoded String
(	TokenNameLPAREN	
DFA43_eofS	TokenNameIdentifier	 DF A43 eof S
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
static	TokenNamestatic	
final	TokenNamefinal	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
DFA43_min	TokenNameIdentifier	 DF A43 min
=	TokenNameEQUAL	
DFA	TokenNameIdentifier	 DFA
.	TokenNameDOT	
unpackEncodedStringToUnsignedChars	TokenNameIdentifier	 unpack Encoded String To Unsigned Chars
(	TokenNameLPAREN	
DFA43_minS	TokenNameIdentifier	 DF A43 min S
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
static	TokenNamestatic	
final	TokenNamefinal	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
DFA43_max	TokenNameIdentifier	 DF A43 max
=	TokenNameEQUAL	
DFA	TokenNameIdentifier	 DFA
.	TokenNameDOT	
unpackEncodedStringToUnsignedChars	TokenNameIdentifier	 unpack Encoded String To Unsigned Chars
(	TokenNameLPAREN	
DFA43_maxS	TokenNameIdentifier	 DF A43 max S
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
static	TokenNamestatic	
final	TokenNamefinal	
short	TokenNameshort	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
DFA43_accept	TokenNameIdentifier	 DF A43 accept
=	TokenNameEQUAL	
DFA	TokenNameIdentifier	 DFA
.	TokenNameDOT	
unpackEncodedString	TokenNameIdentifier	 unpack Encoded String
(	TokenNameLPAREN	
DFA43_acceptS	TokenNameIdentifier	 DF A43 accept S
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
static	TokenNamestatic	
final	TokenNamefinal	
short	TokenNameshort	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
DFA43_special	TokenNameIdentifier	 DF A43 special
=	TokenNameEQUAL	
DFA	TokenNameIdentifier	 DFA
.	TokenNameDOT	
unpackEncodedString	TokenNameIdentifier	 unpack Encoded String
(	TokenNameLPAREN	
DFA43_specialS	TokenNameIdentifier	 DF A43 special S
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
static	TokenNamestatic	
final	TokenNamefinal	
short	TokenNameshort	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
DFA43_transition	TokenNameIdentifier	 DF A43 transition
;	TokenNameSEMICOLON	
static	TokenNamestatic	
{	TokenNameLBRACE	
int	TokenNameint	
numStates	TokenNameIdentifier	 num States
=	TokenNameEQUAL	
DFA43_transitionS	TokenNameIdentifier	 DF A43 transition S
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
DFA43_transition	TokenNameIdentifier	 DF A43 transition
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
DFA43_transition	TokenNameIdentifier	 DF A43 transition
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
DFA	TokenNameIdentifier	 DFA
.	TokenNameDOT	
unpackEncodedString	TokenNameIdentifier	 unpack Encoded String
(	TokenNameLPAREN	
DFA43_transitionS	TokenNameIdentifier	 DF A43 transition S
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
class	TokenNameclass	
DFA43	TokenNameIdentifier	 DF A43
extends	TokenNameextends	
DFA	TokenNameIdentifier	 DFA
{	TokenNameLBRACE	
public	TokenNamepublic	
DFA43	TokenNameIdentifier	 DF A43
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
43	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
eot	TokenNameIdentifier	 eot
=	TokenNameEQUAL	
DFA43_eot	TokenNameIdentifier	 DF A43 eot
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
eof	TokenNameIdentifier	 eof
=	TokenNameEQUAL	
DFA43_eof	TokenNameIdentifier	 DF A43 eof
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
min	TokenNameIdentifier	 min
=	TokenNameEQUAL	
DFA43_min	TokenNameIdentifier	 DF A43 min
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
max	TokenNameIdentifier	 max
=	TokenNameEQUAL	
DFA43_max	TokenNameIdentifier	 DF A43 max
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
accept	TokenNameIdentifier	 accept
=	TokenNameEQUAL	
DFA43_accept	TokenNameIdentifier	 DF A43 accept
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
special	TokenNameIdentifier	 special
=	TokenNameEQUAL	
DFA43_special	TokenNameIdentifier	 DF A43 special
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
transition	TokenNameIdentifier	 transition
=	TokenNameEQUAL	
DFA43_transition	TokenNameIdentifier	 DF A43 transition
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getDescription	TokenNameIdentifier	 get Description
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
"388:1: createCfamColumns[CreateColumnFamilyStatement expr] : (n= term v= createCfamColumnValidator | k= term v= createCfamColumnValidator K_PRIMARY K_KEY );"	TokenNameStringLiteral	388:1: createCfamColumns[CreateColumnFamilyStatement expr] : (n= term v= createCfamColumnValidator | k= term v= createCfamColumnValidator K_PRIMARY K_KEY );
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
DFA54_eotS	TokenNameIdentifier	 DF A54 eot S
=	TokenNameEQUAL	
" ?"	TokenNameStringLiteral	 ?
;	TokenNameSEMICOLON	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
DFA54_eofS	TokenNameIdentifier	 DF A54 eof S
=	TokenNameEQUAL	
" ?"	TokenNameStringLiteral	 ?
;	TokenNameSEMICOLON	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
DFA54_minS	TokenNameIdentifier	 DF A54 min S
=	TokenNameEQUAL	
"?"	TokenNameStringLiteral	?
;	TokenNameSEMICOLON	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
DFA54_maxS	TokenNameIdentifier	 DF A54 max S
=	TokenNameEQUAL	
"/g?"	TokenNameStringLiteral	/g?
;	TokenNameSEMICOLON	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
DFA54_acceptS	TokenNameIdentifier	 DF A54 accept S
=	TokenNameEQUAL	
"?"	TokenNameStringLiteral	?
;	TokenNameSEMICOLON	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
DFA54_specialS	TokenNameIdentifier	 DF A54 special S
=	TokenNameEQUAL	
" ?}>"	TokenNameStringLiteral	 ?}>
;	TokenNameSEMICOLON	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
DFA54_transitionS	TokenNameIdentifier	 DF A54 transition S
=	TokenNameEQUAL	
{	TokenNameLBRACE	
"??"	TokenNameStringLiteral	??
,	TokenNameCOMMA	
" ?E?? "	TokenNameStringLiteral	 ?E?? 
,	TokenNameCOMMA	
" ?E?? "	TokenNameStringLiteral	 ?E?? 
,	TokenNameCOMMA	
" ?E?? "	TokenNameStringLiteral	 ?E?? 
,	TokenNameCOMMA	
" ?E?? "	TokenNameStringLiteral	 ?E?? 
,	TokenNameCOMMA	
" ?E?? "	TokenNameStringLiteral	 ?E?? 
,	TokenNameCOMMA	
" ?E?? "	TokenNameStringLiteral	 ?E?? 
,	TokenNameCOMMA	
" ?E?? "	TokenNameStringLiteral	 ?E?? 
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
DFA54_eot	TokenNameIdentifier	 DF A54 eot
=	TokenNameEQUAL	
DFA	TokenNameIdentifier	 DFA
.	TokenNameDOT	
unpackEncodedString	TokenNameIdentifier	 unpack Encoded String
(	TokenNameLPAREN	
DFA54_eotS	TokenNameIdentifier	 DF A54 eot S
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
static	TokenNamestatic	
final	TokenNamefinal	
short	TokenNameshort	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
DFA54_eof	TokenNameIdentifier	 DF A54 eof
=	TokenNameEQUAL	
DFA	TokenNameIdentifier	 DFA
.	TokenNameDOT	
unpackEncodedString	TokenNameIdentifier	 unpack Encoded String
(	TokenNameLPAREN	
DFA54_eofS	TokenNameIdentifier	 DF A54 eof S
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
static	TokenNamestatic	
final	TokenNamefinal	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
DFA54_min	TokenNameIdentifier	 DF A54 min
=	TokenNameEQUAL	
DFA	TokenNameIdentifier	 DFA
.	TokenNameDOT	
unpackEncodedStringToUnsignedChars	TokenNameIdentifier	 unpack Encoded String To Unsigned Chars
(	TokenNameLPAREN	
DFA54_minS	TokenNameIdentifier	 DF A54 min S
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
static	TokenNamestatic	
final	TokenNamefinal	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
DFA54_max	TokenNameIdentifier	 DF A54 max
=	TokenNameEQUAL	
DFA	TokenNameIdentifier	 DFA
.	TokenNameDOT	
unpackEncodedStringToUnsignedChars	TokenNameIdentifier	 unpack Encoded String To Unsigned Chars
(	TokenNameLPAREN	
DFA54_maxS	TokenNameIdentifier	 DF A54 max S
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
static	TokenNamestatic	
final	TokenNamefinal	
short	TokenNameshort	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
DFA54_accept	TokenNameIdentifier	 DF A54 accept
=	TokenNameEQUAL	
DFA	TokenNameIdentifier	 DFA
.	TokenNameDOT	
unpackEncodedString	TokenNameIdentifier	 unpack Encoded String
(	TokenNameLPAREN	
DFA54_acceptS	TokenNameIdentifier	 DF A54 accept S
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
static	TokenNamestatic	
final	TokenNamefinal	
short	TokenNameshort	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
DFA54_special	TokenNameIdentifier	 DF A54 special
=	TokenNameEQUAL	
DFA	TokenNameIdentifier	 DFA
.	TokenNameDOT	
unpackEncodedString	TokenNameIdentifier	 unpack Encoded String
(	TokenNameLPAREN	
DFA54_specialS	TokenNameIdentifier	 DF A54 special S
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
static	TokenNamestatic	
final	TokenNamefinal	
short	TokenNameshort	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
DFA54_transition	TokenNameIdentifier	 DF A54 transition
;	TokenNameSEMICOLON	
static	TokenNamestatic	
{	TokenNameLBRACE	
int	TokenNameint	
numStates	TokenNameIdentifier	 num States
=	TokenNameEQUAL	
DFA54_transitionS	TokenNameIdentifier	 DF A54 transition S
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
DFA54_transition	TokenNameIdentifier	 DF A54 transition
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
DFA54_transition	TokenNameIdentifier	 DF A54 transition
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
DFA	TokenNameIdentifier	 DFA
.	TokenNameDOT	
unpackEncodedString	TokenNameIdentifier	 unpack Encoded String
(	TokenNameLPAREN	
DFA54_transitionS	TokenNameIdentifier	 DF A54 transition S
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
class	TokenNameclass	
DFA54	TokenNameIdentifier	 DF A54
extends	TokenNameextends	
DFA	TokenNameIdentifier	 DFA
{	TokenNameLBRACE	
public	TokenNamepublic	
DFA54	TokenNameIdentifier	 DF A54
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
54	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
eot	TokenNameIdentifier	 eot
=	TokenNameEQUAL	
DFA54_eot	TokenNameIdentifier	 DF A54 eot
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
eof	TokenNameIdentifier	 eof
=	TokenNameEQUAL	
DFA54_eof	TokenNameIdentifier	 DF A54 eof
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
min	TokenNameIdentifier	 min
=	TokenNameEQUAL	
DFA54_min	TokenNameIdentifier	 DF A54 min
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
max	TokenNameIdentifier	 max
=	TokenNameEQUAL	
DFA54_max	TokenNameIdentifier	 DF A54 max
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
accept	TokenNameIdentifier	 accept
=	TokenNameEQUAL	
DFA54_accept	TokenNameIdentifier	 DF A54 accept
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
special	TokenNameIdentifier	 special
=	TokenNameEQUAL	
DFA54_special	TokenNameIdentifier	 DF A54 special
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
transition	TokenNameIdentifier	 transition
=	TokenNameEQUAL	
DFA54_transition	TokenNameIdentifier	 DF A54 transition
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getDescription	TokenNameIdentifier	 get Description
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
"479:20: (value= term | c= term ( '+' v= term | (op= '-' )? v= intTerm ) )"	TokenNameStringLiteral	479:20: (value= term | c= term ( '+' v= term | (op= '-' )? v= intTerm ) )
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
BitSet	TokenNameIdentifier	 Bit Set
FOLLOW_selectStatement_in_query69	TokenNameIdentifier	 FOLLOW select Statement in query69
=	TokenNameEQUAL	
new	TokenNamenew	
BitSet	TokenNameIdentifier	 Bit Set
(	TokenNameLPAREN	
new	TokenNamenew	
long	TokenNamelong	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
0x0000000000000002L	TokenNameLongLiteral	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
BitSet	TokenNameIdentifier	 Bit Set
FOLLOW_insertStatement_in_query81	TokenNameIdentifier	 FOLLOW insert Statement in query81
=	TokenNameEQUAL	
new	TokenNamenew	
BitSet	TokenNameIdentifier	 Bit Set
(	TokenNameLPAREN	
new	TokenNamenew	
long	TokenNamelong	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
0x0000000000000000L	TokenNameLongLiteral	
,	TokenNameCOMMA	
0x0000000000400000L	TokenNameLongLiteral	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
BitSet	TokenNameIdentifier	 Bit Set
FOLLOW_endStmnt_in_query83	TokenNameIdentifier	 FOLLOW end Stmnt in query83
=	TokenNameEQUAL	
new	TokenNamenew	
BitSet	TokenNameIdentifier	 Bit Set
(	TokenNameLPAREN	
new	TokenNamenew	
long	TokenNamelong	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
0x0000000000000002L	TokenNameLongLiteral	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
BitSet	TokenNameIdentifier	 Bit Set
FOLLOW_updateStatement_in_query93	TokenNameIdentifier	 FOLLOW update Statement in query93
=	TokenNameEQUAL	
new	TokenNamenew	
BitSet	TokenNameIdentifier	 Bit Set
(	TokenNameLPAREN	
new	TokenNamenew	
long	TokenNamelong	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
0x0000000000000000L	TokenNameLongLiteral	
,	TokenNameCOMMA	
0x0000000000400000L	TokenNameLongLiteral	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
BitSet	TokenNameIdentifier	 Bit Set
FOLLOW_endStmnt_in_query95	TokenNameIdentifier	 FOLLOW end Stmnt in query95
=	TokenNameEQUAL	
new	TokenNamenew	
BitSet	TokenNameIdentifier	 Bit Set
(	TokenNameLPAREN	
new	TokenNamenew	
long	TokenNamelong	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
0x0000000000000002L	TokenNameLongLiteral	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
BitSet	TokenNameIdentifier	 Bit Set
FOLLOW_batchStatement_in_query105	TokenNameIdentifier	 FOLLOW batch Statement in query105
=	TokenNameEQUAL	
new	TokenNamenew	
BitSet	TokenNameIdentifier	 Bit Set
(	TokenNameLPAREN	
new	TokenNamenew	
long	TokenNamelong	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
0x0000000000000002L	TokenNameLongLiteral	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
BitSet	TokenNameIdentifier	 Bit Set
FOLLOW_useStatement_in_query115	TokenNameIdentifier	 FOLLOW use Statement in query115
=	TokenNameEQUAL	
new	TokenNamenew	
BitSet	TokenNameIdentifier	 Bit Set
(	TokenNameLPAREN	
new	TokenNamenew	
long	TokenNamelong	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
0x0000000000000002L	TokenNameLongLiteral	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
BitSet	TokenNameIdentifier	 Bit Set
FOLLOW_truncateStatement_in_query130	TokenNameIdentifier	 FOLLOW truncate Statement in query130
=	TokenNameEQUAL	
new	TokenNamenew	
BitSet	TokenNameIdentifier	 Bit Set
(	TokenNameLPAREN	
new	TokenNamenew	
long	TokenNamelong	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
0x0000000000000002L	TokenNameLongLiteral	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
BitSet	TokenNameIdentifier	 Bit Set
FOLLOW_deleteStatement_in_query140	TokenNameIdentifier	 FOLLOW delete Statement in query140
=	TokenNameEQUAL	
new	TokenNamenew	
BitSet	TokenNameIdentifier	 Bit Set
(	TokenNameLPAREN	
new	TokenNamenew	
long	TokenNamelong	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
0x0000000000000000L	TokenNameLongLiteral	
,	TokenNameCOMMA	
0x0000000000400000L	TokenNameLongLiteral	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
BitSet	TokenNameIdentifier	 Bit Set
FOLLOW_endStmnt_in_query142	TokenNameIdentifier	 FOLLOW end Stmnt in query142
=	TokenNameEQUAL	
new	TokenNamenew	
BitSet	TokenNameIdentifier	 Bit Set
(	TokenNameLPAREN	
new	TokenNamenew	
long	TokenNamelong	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
0x0000000000000002L	TokenNameLongLiteral	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
BitSet	TokenNameIdentifier	 Bit Set
FOLLOW_createKeyspaceStatement_in_query152	TokenNameIdentifier	 FOLLOW create Keyspace Statement in query152
=	TokenNameEQUAL	
new	TokenNamenew	
BitSet	TokenNameIdentifier	 Bit Set
(	TokenNameLPAREN	
new	TokenNamenew	
long	TokenNamelong	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
0x0000000000000002L	TokenNameLongLiteral	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
BitSet	TokenNameIdentifier	 Bit Set
FOLLOW_createColumnFamilyStatement_in_query162	TokenNameIdentifier	 FOLLOW create Column Family Statement in query162
=	TokenNameEQUAL	
new	TokenNamenew	
BitSet	TokenNameIdentifier	 Bit Set
(	TokenNameLPAREN	
new	TokenNamenew	
long	TokenNamelong	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
0x0000000000000002L	TokenNameLongLiteral	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
BitSet	TokenNameIdentifier	 Bit Set
FOLLOW_createIndexStatement_in_query172	TokenNameIdentifier	 FOLLOW create Index Statement in query172
=	TokenNameEQUAL	
new	TokenNamenew	
BitSet	TokenNameIdentifier	 Bit Set
(	TokenNameLPAREN	
new	TokenNamenew	
long	TokenNamelong	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
0x0000000000000002L	TokenNameLongLiteral	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
BitSet	TokenNameIdentifier	 Bit Set
FOLLOW_dropIndexStatement_in_query182	TokenNameIdentifier	 FOLLOW drop Index Statement in query182
=	TokenNameEQUAL	
new	TokenNamenew	
BitSet	TokenNameIdentifier	 Bit Set
(	TokenNameLPAREN	
new	TokenNamenew	
long	TokenNamelong	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
0x0000000000000002L	TokenNameLongLiteral	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
BitSet	TokenNameIdentifier	 Bit Set
FOLLOW_dropKeyspaceStatement_in_query194	TokenNameIdentifier	 FOLLOW drop Keyspace Statement in query194
=	TokenNameEQUAL	
new	TokenNamenew	
BitSet	TokenNameIdentifier	 Bit Set
(	TokenNameLPAREN	
new	TokenNamenew	
long	TokenNamelong	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
0x0000000000000002L	TokenNameLongLiteral	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
BitSet	TokenNameIdentifier	 Bit Set
FOLLOW_dropColumnFamilyStatement_in_query204	TokenNameIdentifier	 FOLLOW drop Column Family Statement in query204
=	TokenNameEQUAL	
new	TokenNamenew	
BitSet	TokenNameIdentifier	 Bit Set
(	TokenNameLPAREN	
new	TokenNamenew	
long	TokenNamelong	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
0x0000000000000002L	TokenNameLongLiteral	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
BitSet	TokenNameIdentifier	 Bit Set
FOLLOW_alterTableStatement_in_query214	TokenNameIdentifier	 FOLLOW alter Table Statement in query214
=	TokenNameEQUAL	
new	TokenNamenew	
BitSet	TokenNameIdentifier	 Bit Set
(	TokenNameLPAREN	
new	TokenNamenew	
long	TokenNamelong	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
0x0000000000000002L	TokenNameLongLiteral	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
BitSet	TokenNameIdentifier	 Bit Set
FOLLOW_K_USE_in_useStatement238	TokenNameIdentifier	 FOLLOW  K  USE in use Statement238
=	TokenNameEQUAL	
new	TokenNamenew	
BitSet	TokenNameIdentifier	 Bit Set
(	TokenNameLPAREN	
new	TokenNamenew	
long	TokenNamelong	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
0x00000000000000E0L	TokenNameLongLiteral	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
BitSet	TokenNameIdentifier	 Bit Set
FOLLOW_set_in_useStatement242	TokenNameIdentifier	 FOLLOW set in use Statement242
=	TokenNameEQUAL	
new	TokenNamenew	
BitSet	TokenNameIdentifier	 Bit Set
(	TokenNameLPAREN	
new	TokenNamenew	
long	TokenNamelong	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
0x0000000000000000L	TokenNameLongLiteral	
,	TokenNameCOMMA	
0x0000000000400000L	TokenNameLongLiteral	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
BitSet	TokenNameIdentifier	 Bit Set
FOLLOW_endStmnt_in_useStatement258	TokenNameIdentifier	 FOLLOW end Stmnt in use Statement258
=	TokenNameEQUAL	
new	TokenNamenew	
BitSet	TokenNameIdentifier	 Bit Set
(	TokenNameLPAREN	
new	TokenNamenew	
long	TokenNamelong	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
0x0000000000000002L	TokenNameLongLiteral	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
BitSet	TokenNameIdentifier	 Bit Set
FOLLOW_K_SELECT_in_selectStatement289	TokenNameIdentifier	 FOLLOW  K  SELECT in select Statement289
=	TokenNameEQUAL	
new	TokenNamenew	
BitSet	TokenNameIdentifier	 Bit Set
(	TokenNameLPAREN	
new	TokenNamenew	
long	TokenNamelong	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
0x0000C0C0000302E0L	TokenNameLongLiteral	
,	TokenNameCOMMA	
0x0000000000200000L	TokenNameLongLiteral	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
BitSet	TokenNameIdentifier	 Bit Set
FOLLOW_selectExpression_in_selectStatement305	TokenNameIdentifier	 FOLLOW select Expression in select Statement305
=	TokenNameEQUAL	
new	TokenNamenew	
BitSet	TokenNameIdentifier	 Bit Set
(	TokenNameLPAREN	
new	TokenNamenew	
long	TokenNamelong	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
0x0000000000000400L	TokenNameLongLiteral	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
BitSet	TokenNameIdentifier	 Bit Set
FOLLOW_K_COUNT_in_selectStatement337	TokenNameIdentifier	 FOLLOW  K  COUNT in select Statement337
=	TokenNameEQUAL	
new	TokenNamenew	
BitSet	TokenNameIdentifier	 Bit Set
(	TokenNameLPAREN	
new	TokenNamenew	
long	TokenNamelong	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
0x0000000000000000L	TokenNameLongLiteral	
,	TokenNameCOMMA	
0x0000000000020000L	TokenNameLongLiteral	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
BitSet	TokenNameIdentifier	 Bit Set
FOLLOW_81_in_selectStatement339	TokenNameIdentifier	 FOLLOW 81 in select Statement339
=	TokenNameEQUAL	
new	TokenNamenew	
BitSet	TokenNameIdentifier	 Bit Set
(	TokenNameLPAREN	
new	TokenNamenew	
long	TokenNamelong	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
0x0000C0C0000300E0L	TokenNameLongLiteral	
,	TokenNameCOMMA	
0x0000000000200000L	TokenNameLongLiteral	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
BitSet	TokenNameIdentifier	 Bit Set
FOLLOW_selectExpression_in_selectStatement343	TokenNameIdentifier	 FOLLOW select Expression in select Statement343
=	TokenNameEQUAL	
new	TokenNamenew	
BitSet	TokenNameIdentifier	 Bit Set
(	TokenNameLPAREN	
new	TokenNamenew	
long	TokenNamelong	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
0x0000000000000000L	TokenNameLongLiteral	
,	TokenNameCOMMA	
0x0000000000040000L	TokenNameLongLiteral	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
BitSet	TokenNameIdentifier	 Bit Set
FOLLOW_82_in_selectStatement345	TokenNameIdentifier	 FOLLOW 82 in select Statement345
=	TokenNameEQUAL	
new	TokenNamenew	
BitSet	TokenNameIdentifier	 Bit Set
(	TokenNameLPAREN	
new	TokenNamenew	
long	TokenNamelong	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
0x0000000000000400L	TokenNameLongLiteral	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
BitSet	TokenNameIdentifier	 Bit Set
FOLLOW_K_FROM_in_selectStatement371	TokenNameIdentifier	 FOLLOW  K  FROM in select Statement371
=	TokenNameEQUAL	
new	TokenNamenew	
BitSet	TokenNameIdentifier	 Bit Set
(	TokenNameLPAREN	
new	TokenNamenew	
long	TokenNamelong	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
0x00000000000000E0L	TokenNameLongLiteral	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
BitSet	TokenNameIdentifier	 Bit Set
FOLLOW_set_in_selectStatement376	TokenNameIdentifier	 FOLLOW set in select Statement376
=	TokenNameEQUAL	
new	TokenNamenew	
BitSet	TokenNameIdentifier	 Bit Set
(	TokenNameLPAREN	
new	TokenNamenew	
long	TokenNamelong	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
0x0000000000000000L	TokenNameLongLiteral	
,	TokenNameCOMMA	
0x0000000000080000L	TokenNameLongLiteral	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
BitSet	TokenNameIdentifier	 Bit Set
FOLLOW_83_in_selectStatement388	TokenNameIdentifier	 FOLLOW 83 in select Statement388
=	TokenNameEQUAL	
new	TokenNamenew	
BitSet	TokenNameIdentifier	 Bit Set
(	TokenNameLPAREN	
new	TokenNamenew	
long	TokenNamelong	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
0x00000000000000E0L	TokenNameLongLiteral	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
BitSet	TokenNameIdentifier	 Bit Set
FOLLOW_set_in_selectStatement394	TokenNameIdentifier	 FOLLOW set in select Statement394
=	TokenNameEQUAL	
new	TokenNamenew	
BitSet	TokenNameIdentifier	 Bit Set
(	TokenNameLPAREN	
new	TokenNamenew	
long	TokenNamelong	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
0x000000000000C800L	TokenNameLongLiteral	
,	TokenNameCOMMA	
0x0000000000400000L	TokenNameLongLiteral	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
BitSet	TokenNameIdentifier	 Bit Set
FOLLOW_K_USING_in_selectStatement420	TokenNameIdentifier	 FOLLOW  K  USING in select Statement420
=	TokenNameEQUAL	
new	TokenNamenew	
BitSet	TokenNameIdentifier	 Bit Set
(	TokenNameLPAREN	
new	TokenNamenew	
long	TokenNamelong	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
0x0000000000001000L	TokenNameLongLiteral	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
BitSet	TokenNameIdentifier	 Bit Set
FOLLOW_K_CONSISTENCY_in_selectStatement422	TokenNameIdentifier	 FOLLOW  K  CONSISTENCY in select Statement422
=	TokenNameEQUAL	
new	TokenNamenew	
BitSet	TokenNameIdentifier	 Bit Set
(	TokenNameLPAREN	
new	TokenNamenew	
long	TokenNamelong	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
0x0000000000002000L	TokenNameLongLiteral	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
BitSet	TokenNameIdentifier	 Bit Set
FOLLOW_K_LEVEL_in_selectStatement424	TokenNameIdentifier	 FOLLOW  K  LEVEL in select Statement424
=	TokenNameEQUAL	
new	TokenNamenew	
BitSet	TokenNameIdentifier	 Bit Set
(	TokenNameLPAREN	
new	TokenNamenew	
long	TokenNamelong	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
0x000000000000C000L	TokenNameLongLiteral	
,	TokenNameCOMMA	
0x0000000000400000L	TokenNameLongLiteral	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
BitSet	TokenNameIdentifier	 Bit Set
FOLLOW_K_WHERE_in_selectStatement443	TokenNameIdentifier	 FOLLOW  K  WHERE in select Statement443
=	TokenNameEQUAL	
new	TokenNamenew	
BitSet	TokenNameIdentifier	 Bit Set
(	TokenNameLPAREN	
new	TokenNamenew	
long	TokenNamelong	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
0x0000C0C0000000E0L	TokenNameLongLiteral	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
BitSet	TokenNameIdentifier	 Bit Set
FOLLOW_whereClause_in_selectStatement445	TokenNameIdentifier	 FOLLOW where Clause in select Statement445
=	TokenNameEQUAL	
new	TokenNamenew	
BitSet	TokenNameIdentifier	 Bit Set
(	TokenNameLPAREN	
new	TokenNamenew	
long	TokenNamelong	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
0x0000000000008000L	TokenNameLongLiteral	
,	TokenNameCOMMA	
0x0000000000400000L	TokenNameLongLiteral	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
BitSet	TokenNameIdentifier	 Bit Set
FOLLOW_K_LIMIT_in_selectStatement462	TokenNameIdentifier	 FOLLOW  K  LIMIT in select Statement462
=	TokenNameEQUAL	
new	TokenNamenew	
BitSet	TokenNameIdentifier	 Bit Set
(	TokenNameLPAREN	
new	TokenNamenew	
long	TokenNamelong	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
0x0000000000000040L	TokenNameLongLiteral	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
BitSet	TokenNameIdentifier	 Bit Set
FOLLOW_INTEGER_in_selectStatement466	TokenNameIdentifier	 FOLLOW  INTEGER in select Statement466
=	TokenNameEQUAL	
new	TokenNamenew	
BitSet	TokenNameIdentifier	 Bit Set
(	TokenNameLPAREN	
new	TokenNamenew	
long	TokenNamelong	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
0x0000000000000000L	TokenNameLongLiteral	
,	TokenNameCOMMA	
0x0000000000400000L	TokenNameLongLiteral	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
BitSet	TokenNameIdentifier	 Bit Set
FOLLOW_endStmnt_in_selectStatement483	TokenNameIdentifier	 FOLLOW end Stmnt in select Statement483
=	TokenNameEQUAL	
new	TokenNamenew	
BitSet	TokenNameIdentifier	 Bit Set
(	TokenNameLPAREN	
new	TokenNamenew	
long	TokenNamelong	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
0x0000000000000002L	TokenNameLongLiteral	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
BitSet	TokenNameIdentifier	 Bit Set
FOLLOW_K_FIRST_in_selectExpression524	TokenNameIdentifier	 FOLLOW  K  FIRST in select Expression524
=	TokenNameEQUAL	
new	TokenNamenew	
BitSet	TokenNameIdentifier	 Bit Set
(	TokenNameLPAREN	
new	TokenNamenew	
long	TokenNamelong	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
0x0000000000000040L	TokenNameLongLiteral	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
BitSet	TokenNameIdentifier	 Bit Set
FOLLOW_INTEGER_in_selectExpression530	TokenNameIdentifier	 FOLLOW  INTEGER in select Expression530
=	TokenNameEQUAL	
new	TokenNamenew	
BitSet	TokenNameIdentifier	 Bit Set
(	TokenNameLPAREN	
new	TokenNamenew	
long	TokenNamelong	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
0x0000C0C0000200E0L	TokenNameLongLiteral	
,	TokenNameCOMMA	
0x0000000000200000L	TokenNameLongLiteral	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
BitSet	TokenNameIdentifier	 Bit Set
FOLLOW_K_REVERSED_in_selectExpression545	TokenNameIdentifier	 FOLLOW  K  REVERSED in select Expression545
=	TokenNameEQUAL	
new	TokenNamenew	
BitSet	TokenNameIdentifier	 Bit Set
(	TokenNameLPAREN	
new	TokenNamenew	
long	TokenNamelong	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
0x0000C0C0000000E0L	TokenNameLongLiteral	
,	TokenNameCOMMA	
0x0000000000200000L	TokenNameLongLiteral	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
BitSet	TokenNameIdentifier	 Bit Set
FOLLOW_term_in_selectExpression562	TokenNameIdentifier	 FOLLOW term in select Expression562
=	TokenNameEQUAL	
new	TokenNamenew	
BitSet	TokenNameIdentifier	 Bit Set
(	TokenNameLPAREN	
new	TokenNamenew	
long	TokenNamelong	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
0x0000000000000002L	TokenNameLongLiteral	
,	TokenNameCOMMA	
0x0000000000100000L	TokenNameLongLiteral	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
BitSet	TokenNameIdentifier	 Bit Set
FOLLOW_84_in_selectExpression579	TokenNameIdentifier	 FOLLOW 84 in select Expression579
=	TokenNameEQUAL	
new	TokenNamenew	
BitSet	TokenNameIdentifier	 Bit Set
(	TokenNameLPAREN	
new	TokenNamenew	
long	TokenNamelong	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
0x0000C0C0000000E0L	TokenNameLongLiteral	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
BitSet	TokenNameIdentifier	 Bit Set
FOLLOW_term_in_selectExpression583	TokenNameIdentifier	 FOLLOW term in select Expression583
=	TokenNameEQUAL	
new	TokenNamenew	
BitSet	TokenNameIdentifier	 Bit Set
(	TokenNameLPAREN	
new	TokenNamenew	
long	TokenNamelong	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
0x0000000000000002L	TokenNameLongLiteral	
,	TokenNameCOMMA	
0x0000000000100000L	TokenNameLongLiteral	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
BitSet	TokenNameIdentifier	 Bit Set
FOLLOW_term_in_selectExpression599	TokenNameIdentifier	 FOLLOW term in select Expression599
=	TokenNameEQUAL	
new	TokenNamenew	
BitSet	TokenNameIdentifier	 Bit Set
(	TokenNameLPAREN	
new	TokenNamenew	
long	TokenNamelong	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
0x0000000000040000L	TokenNameLongLiteral	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
BitSet	TokenNameIdentifier	 Bit Set
FOLLOW_RANGEOP_in_selectExpression601	TokenNameIdentifier	 FOLLOW  RANGEOP in select Expression601
=	TokenNameEQUAL	
new	TokenNamenew	
BitSet	TokenNameIdentifier	 Bit Set
(	TokenNameLPAREN	
new	TokenNamenew	
long	TokenNamelong	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
0x0000C0C0000000E0L	TokenNameLongLiteral	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
BitSet	TokenNameIdentifier	 Bit Set
FOLLOW_term_in_selectExpression605	TokenNameIdentifier	 FOLLOW term in select Expression605
=	TokenNameEQUAL	
new	TokenNamenew	
BitSet	TokenNameIdentifier	 Bit Set
(	TokenNameLPAREN	
new	TokenNamenew	
long	TokenNamelong	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
0x0000000000000002L	TokenNameLongLiteral	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
BitSet	TokenNameIdentifier	 Bit Set
FOLLOW_85_in_selectExpression617	TokenNameIdentifier	 FOLLOW 85 in select Expression617
=	TokenNameEQUAL	
new	TokenNamenew	
BitSet	TokenNameIdentifier	 Bit Set
(	TokenNameLPAREN	
new	TokenNamenew	
long	TokenNamelong	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
0x0000000000000002L	TokenNameLongLiteral	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
BitSet	TokenNameIdentifier	 Bit Set
FOLLOW_relation_in_whereClause660	TokenNameIdentifier	 FOLLOW relation in where Clause660
=	TokenNameEQUAL	
new	TokenNamenew	
BitSet	TokenNameIdentifier	 Bit Set
(	TokenNameLPAREN	
new	TokenNamenew	
long	TokenNamelong	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
0x0000000000080002L	TokenNameLongLiteral	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
BitSet	TokenNameIdentifier	 Bit Set
FOLLOW_K_AND_in_whereClause676	TokenNameIdentifier	 FOLLOW  K  AND in where Clause676
=	TokenNameEQUAL	
new	TokenNamenew	
BitSet	TokenNameIdentifier	 Bit Set
(	TokenNameLPAREN	
new	TokenNamenew	
long	TokenNamelong	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
0x0000C0C0000000E0L	TokenNameLongLiteral	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
BitSet	TokenNameIdentifier	 Bit Set
FOLLOW_relation_in_whereClause680	TokenNameIdentifier	 FOLLOW relation in where Clause680
=	TokenNameEQUAL	
new	TokenNamenew	
BitSet	TokenNameIdentifier	 Bit Set
(	TokenNameLPAREN	
new	TokenNamenew	
long	TokenNamelong	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
0x0000000000080002L	TokenNameLongLiteral	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
BitSet	TokenNameIdentifier	 Bit Set
FOLLOW_term_in_whereClause696	TokenNameIdentifier	 FOLLOW term in where Clause696
=	TokenNameEQUAL	
new	TokenNamenew	
BitSet	TokenNameIdentifier	 Bit Set
(	TokenNameLPAREN	
new	TokenNamenew	
long	TokenNamelong	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
0x0000000000100000L	TokenNameLongLiteral	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
BitSet	TokenNameIdentifier	 Bit Set
FOLLOW_K_IN_in_whereClause711	TokenNameIdentifier	 FOLLOW  K  IN in where Clause711
=	TokenNameEQUAL	
new	TokenNamenew	
BitSet	TokenNameIdentifier	 Bit Set
(	TokenNameLPAREN	
new	TokenNamenew	
long	TokenNamelong	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
0x0000000000000000L	TokenNameLongLiteral	
,	TokenNameCOMMA	
0x0000000000020000L	TokenNameLongLiteral	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
BitSet	TokenNameIdentifier	 Bit Set
FOLLOW_81_in_whereClause713	TokenNameIdentifier	 FOLLOW 81 in where Clause713
=	TokenNameEQUAL	
new	TokenNamenew	
BitSet	TokenNameIdentifier	 Bit Set
(	TokenNameLPAREN	
new	TokenNamenew	
long	TokenNamelong	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
0x0000C0C0000000E0L	TokenNameLongLiteral	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
BitSet	TokenNameIdentifier	 Bit Set
FOLLOW_term_in_whereClause717	TokenNameIdentifier	 FOLLOW term in where Clause717
=	TokenNameEQUAL	
new	TokenNamenew	
BitSet	TokenNameIdentifier	 Bit Set
(	TokenNameLPAREN	
new	TokenNamenew	
long	TokenNamelong	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
0x0000000000000000L	TokenNameLongLiteral	
,	TokenNameCOMMA	
0x0000000000140000L	TokenNameLongLiteral	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
BitSet	TokenNameIdentifier	 Bit Set
FOLLOW_84_in_whereClause740	TokenNameIdentifier	 FOLLOW 84 in where Clause740
=	TokenNameEQUAL	
new	TokenNamenew	
BitSet	TokenNameIdentifier	 Bit Set
(	TokenNameLPAREN	
new	TokenNamenew	
long	TokenNamelong	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
0x0000C0C0000000E0L	TokenNameLongLiteral	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
BitSet	TokenNameIdentifier	 Bit Set
FOLLOW_term_in_whereClause744	TokenNameIdentifier	 FOLLOW term in where Clause744
=	TokenNameEQUAL	
new	TokenNamenew	
BitSet	TokenNameIdentifier	 Bit Set
(	TokenNameLPAREN	
new	TokenNamenew	
long	TokenNamelong	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
0x0000000000000000L	TokenNameLongLiteral	
,	TokenNameCOMMA	
0x0000000000140000L	TokenNameLongLiteral	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
BitSet	TokenNameIdentifier	 Bit Set
FOLLOW_82_in_whereClause751	TokenNameIdentifier	 FOLLOW 82 in where Clause751
=	TokenNameEQUAL	
new	TokenNamenew	
BitSet	TokenNameIdentifier	 Bit Set
(	TokenNameLPAREN	
new	TokenNamenew	
long	TokenNamelong	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
0x0000000000000002L	TokenNameLongLiteral	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
BitSet	TokenNameIdentifier	 Bit Set
FOLLOW_K_INSERT_in_insertStatement792	TokenNameIdentifier	 FOLLOW  K  INSERT in insert Statement792
=	TokenNameEQUAL	
new	TokenNamenew	
BitSet	TokenNameIdentifier	 Bit Set
(	TokenNameLPAREN	
new	TokenNamenew	
long	TokenNamelong	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
0x0000000000400000L	TokenNameLongLiteral	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
BitSet	TokenNameIdentifier	 Bit Set
FOLLOW_K_INTO_in_insertStatement794	TokenNameIdentifier	 FOLLOW  K  INTO in insert Statement794
=	TokenNameEQUAL	
new	TokenNamenew	
BitSet	TokenNameIdentifier	 Bit Set
(	TokenNameLPAREN	
new	TokenNamenew	
long	TokenNamelong	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
0x00000000000000E0L	TokenNameLongLiteral	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
BitSet	TokenNameIdentifier	 Bit Set
FOLLOW_set_in_insertStatement799	TokenNameIdentifier	 FOLLOW set in insert Statement799
=	TokenNameEQUAL	
new	TokenNamenew	
BitSet	TokenNameIdentifier	 Bit Set
(	TokenNameLPAREN	
new	TokenNamenew	
long	TokenNamelong	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
0x0000000000000000L	TokenNameLongLiteral	
,	TokenNameCOMMA	
0x0000000000080000L	TokenNameLongLiteral	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
BitSet	TokenNameIdentifier	 Bit Set
FOLLOW_83_in_insertStatement811	TokenNameIdentifier	 FOLLOW 83 in insert Statement811
=	TokenNameEQUAL	
new	TokenNamenew	
BitSet	TokenNameIdentifier	 Bit Set
(	TokenNameLPAREN	
new	TokenNamenew	
long	TokenNamelong	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
0x00000000000000E0L	TokenNameLongLiteral	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
BitSet	TokenNameIdentifier	 Bit Set
FOLLOW_set_in_insertStatement817	TokenNameIdentifier	 FOLLOW set in insert Statement817
=	TokenNameEQUAL	
new	TokenNamenew	
BitSet	TokenNameIdentifier	 Bit Set
(	TokenNameLPAREN	
new	TokenNamenew	
long	TokenNamelong	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
0x0000000000000000L	TokenNameLongLiteral	
,	TokenNameCOMMA	
0x0000000000020000L	TokenNameLongLiteral	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
BitSet	TokenNameIdentifier	 Bit Set
FOLLOW_81_in_insertStatement841	TokenNameIdentifier	 FOLLOW 81 in insert Statement841
=	TokenNameEQUAL	
new	TokenNamenew	
BitSet	TokenNameIdentifier	 Bit Set
(	TokenNameLPAREN	
new	TokenNamenew	
long	TokenNamelong	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
0x0000C0C0000000E0L	TokenNameLongLiteral	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
BitSet	TokenNameIdentifier	 Bit Set
FOLLOW_term_in_insertStatement845	TokenNameIdentifier	 FOLLOW term in insert Statement845
=	TokenNameEQUAL	
new	TokenNamenew	
BitSet	TokenNameIdentifier	 Bit Set
(	TokenNameLPAREN	
new	TokenNamenew	
long	TokenNamelong	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
0x0000000000000000L	TokenNameLongLiteral	
,	TokenNameCOMMA	
0x0000000000100000L	TokenNameLongLiteral	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
BitSet	TokenNameIdentifier	 Bit Set
FOLLOW_84_in_insertStatement849	TokenNameIdentifier	 FOLLOW 84 in insert Statement849
=	TokenNameEQUAL	
new	TokenNamenew	
BitSet	TokenNameIdentifier	 Bit Set
(	TokenNameLPAREN	
new	TokenNamenew	
long	TokenNamelong	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
0x0000C0C0000000E0L	TokenNameLongLiteral	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
BitSet	TokenNameIdentifier	 Bit Set
FOLLOW_term_in_insertStatement853	TokenNameIdentifier	 FOLLOW term in insert Statement853
=	TokenNameEQUAL	
new	TokenNamenew	
BitSet	TokenNameIdentifier	 Bit Set
(	TokenNameLPAREN	
new	TokenNamenew	
long	TokenNamelong	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
0x0000000000000000L	TokenNameLongLiteral	
,	TokenNameCOMMA	
0x0000000000140000L	TokenNameLongLiteral	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
BitSet	TokenNameIdentifier	 Bit Set
FOLLOW_82_in_insertStatement861	TokenNameIdentifier	 FOLLOW 82 in insert Statement861
=	TokenNameEQUAL	
new	TokenNamenew	
BitSet	TokenNameIdentifier	 Bit Set
(	TokenNameLPAREN	
new	TokenNamenew	
long	TokenNamelong	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
0x0000000000800000L	TokenNameLongLiteral	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
BitSet	TokenNameIdentifier	 Bit Set
FOLLOW_K_VALUES_in_insertStatement871	TokenNameIdentifier	 FOLLOW  K  VALUES in insert Statement871
=	TokenNameEQUAL	
new	TokenNamenew	
BitSet	TokenNameIdentifier	 Bit Set
(	TokenNameLPAREN	
new	TokenNamenew	
long	TokenNamelong	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
0x0000000000000000L	TokenNameLongLiteral	
,	TokenNameCOMMA	
0x0000000000020000L	TokenNameLongLiteral	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
BitSet	TokenNameIdentifier	 Bit Set
FOLLOW_81_in_insertStatement883	TokenNameIdentifier	 FOLLOW 81 in insert Statement883
=	TokenNameEQUAL	
new	TokenNamenew	
BitSet	TokenNameIdentifier	 Bit Set
(	TokenNameLPAREN	
new	TokenNamenew	
long	TokenNamelong	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
0x0000C0C0000000E0L	TokenNameLongLiteral	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
BitSet	TokenNameIdentifier	 Bit Set
FOLLOW_term_in_insertStatement887	TokenNameIdentifier	 FOLLOW term in insert Statement887
=	TokenNameEQUAL	
new	TokenNamenew	
BitSet	TokenNameIdentifier	 Bit Set
(	TokenNameLPAREN	
new	TokenNamenew	
long	TokenNamelong	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
0x0000000000000000L	TokenNameLongLiteral	
,	TokenNameCOMMA	
0x0000000000100000L	TokenNameLongLiteral	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
BitSet	TokenNameIdentifier	 Bit Set
FOLLOW_84_in_insertStatement891	TokenNameIdentifier	 FOLLOW 84 in insert Statement891
=	TokenNameEQUAL	
new	TokenNamenew	
BitSet	TokenNameIdentifier	 Bit Set
(	TokenNameLPAREN	
new	TokenNamenew	
long	TokenNamelong	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
0x0000C0C0000000E0L	TokenNameLongLiteral	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
BitSet	TokenNameIdentifier	 Bit Set
FOLLOW_term_in_insertStatement895	TokenNameIdentifier	 FOLLOW term in insert Statement895
=	TokenNameEQUAL	
new	TokenNamenew	
BitSet	TokenNameIdentifier	 Bit Set
(	TokenNameLPAREN	
new	TokenNamenew	
long	TokenNamelong	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
0x0000000000000000L	TokenNameLongLiteral	
,	TokenNameCOMMA	
0x0000000000140000L	TokenNameLongLiteral	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
BitSet	TokenNameIdentifier	 Bit Set
FOLLOW_82_in_insertStatement901	TokenNameIdentifier	 FOLLOW 82 in insert Statement901
=	TokenNameEQUAL	
new	TokenNamenew	
BitSet	TokenNameIdentifier	 Bit Set
(	TokenNameLPAREN	
new	TokenNamenew	
long	TokenNamelong	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
0x0000000000000802L	TokenNameLongLiteral	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
BitSet	TokenNameIdentifier	 Bit Set
FOLLOW_usingClause_in_insertStatement913	TokenNameIdentifier	 FOLLOW using Clause in insert Statement913
=	TokenNameEQUAL	
new	TokenNamenew	
BitSet	TokenNameIdentifier	 Bit Set
(	TokenNameLPAREN	
new	TokenNamenew	
long	TokenNamelong	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
0x0000000000000002L	TokenNameLongLiteral	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
BitSet	TokenNameIdentifier	 Bit Set
FOLLOW_K_USING_in_usingClause943	TokenNameIdentifier	 FOLLOW  K  USING in using Clause943
=	TokenNameEQUAL	
new	TokenNamenew	
BitSet	TokenNameIdentifier	 Bit Set
(	TokenNameLPAREN	
new	TokenNamenew	
long	TokenNamelong	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
0x0000000003001000L	TokenNameLongLiteral	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
BitSet	TokenNameIdentifier	 Bit Set
FOLLOW_usingClauseObjective_in_usingClause945	TokenNameIdentifier	 FOLLOW using Clause Objective in using Clause945
=	TokenNameEQUAL	
new	TokenNamenew	
BitSet	TokenNameIdentifier	 Bit Set
(	TokenNameLPAREN	
new	TokenNamenew	
long	TokenNamelong	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
0x0000000003081002L	TokenNameLongLiteral	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
BitSet	TokenNameIdentifier	 Bit Set
FOLLOW_K_AND_in_usingClause950	TokenNameIdentifier	 FOLLOW  K  AND in using Clause950
=	TokenNameEQUAL	
new	TokenNamenew	
BitSet	TokenNameIdentifier	 Bit Set
(	TokenNameLPAREN	
new	TokenNamenew	
long	TokenNamelong	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
0x0000000003001000L	TokenNameLongLiteral	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
BitSet	TokenNameIdentifier	 Bit Set
FOLLOW_usingClauseObjective_in_usingClause953	TokenNameIdentifier	 FOLLOW using Clause Objective in using Clause953
=	TokenNameEQUAL	
new	TokenNamenew	
BitSet	TokenNameIdentifier	 Bit Set
(	TokenNameLPAREN	
new	TokenNamenew	
long	TokenNamelong	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
0x0000000003081002L	TokenNameLongLiteral	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
BitSet	TokenNameIdentifier	 Bit Set
FOLLOW_K_USING_in_usingClauseDelete975	TokenNameIdentifier	 FOLLOW  K  USING in using Clause Delete975
=	TokenNameEQUAL	
new	TokenNamenew	
BitSet	TokenNameIdentifier	 Bit Set
(	TokenNameLPAREN	
new	TokenNamenew	
long	TokenNamelong	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
0x0000000001001000L	TokenNameLongLiteral	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
BitSet	TokenNameIdentifier	 Bit Set
FOLLOW_usingClauseDeleteObjective_in_usingClauseDelete977	TokenNameIdentifier	 FOLLOW using Clause Delete Objective in using Clause Delete977
=	TokenNameEQUAL	
new	TokenNamenew	
BitSet	TokenNameIdentifier	 Bit Set
(	TokenNameLPAREN	
new	TokenNamenew	
long	TokenNamelong	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
0x0000000001081002L	TokenNameLongLiteral	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
BitSet	TokenNameIdentifier	 Bit Set
FOLLOW_K_AND_in_usingClauseDelete982	TokenNameIdentifier	 FOLLOW  K  AND in using Clause Delete982
=	TokenNameEQUAL	
new	TokenNamenew	
BitSet	TokenNameIdentifier	 Bit Set
(	TokenNameLPAREN	
new	TokenNamenew	
long	TokenNamelong	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
0x0000000001001000L	TokenNameLongLiteral	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
BitSet	TokenNameIdentifier	 Bit Set
FOLLOW_usingClauseDeleteObjective_in_usingClauseDelete985	TokenNameIdentifier	 FOLLOW using Clause Delete Objective in using Clause Delete985
=	TokenNameEQUAL	
new	TokenNamenew	
BitSet	TokenNameIdentifier	 Bit Set
(	TokenNameLPAREN	
new	TokenNamenew	
long	TokenNamelong	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
0x0000000001081002L	TokenNameLongLiteral	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
BitSet	TokenNameIdentifier	 Bit Set
FOLLOW_K_CONSISTENCY_in_usingClauseDeleteObjective1007	TokenNameIdentifier	 FOLLOW  K  CONSISTENCY in using Clause Delete Objective1007
=	TokenNameEQUAL	
new	TokenNamenew	
BitSet	TokenNameIdentifier	 Bit Set
(	TokenNameLPAREN	
new	TokenNamenew	
long	TokenNamelong	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
0x0000000000002000L	TokenNameLongLiteral	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
BitSet	TokenNameIdentifier	 Bit Set
FOLLOW_K_LEVEL_in_usingClauseDeleteObjective1009	TokenNameIdentifier	 FOLLOW  K  LEVEL in using Clause Delete Objective1009
=	TokenNameEQUAL	
new	TokenNamenew	
BitSet	TokenNameIdentifier	 Bit Set
(	TokenNameLPAREN	
new	TokenNamenew	
long	TokenNamelong	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
0x0000000000000002L	TokenNameLongLiteral	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
BitSet	TokenNameIdentifier	 Bit Set
FOLLOW_K_TIMESTAMP_in_usingClauseDeleteObjective1020	TokenNameIdentifier	 FOLLOW  K  TIMESTAMP in using Clause Delete Objective1020
=	TokenNameEQUAL	
new	TokenNamenew	
BitSet	TokenNameIdentifier	 Bit Set
(	TokenNameLPAREN	
new	TokenNamenew	
long	TokenNamelong	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
0x0000000000000040L	TokenNameLongLiteral	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
BitSet	TokenNameIdentifier	 Bit Set
FOLLOW_INTEGER_in_usingClauseDeleteObjective1024	TokenNameIdentifier	 FOLLOW  INTEGER in using Clause Delete Objective1024
=	TokenNameEQUAL	
new	TokenNamenew	
BitSet	TokenNameIdentifier	 Bit Set
(	TokenNameLPAREN	
new	TokenNamenew	
long	TokenNamelong	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
0x0000000000000002L	TokenNameLongLiteral	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
BitSet	TokenNameIdentifier	 Bit Set
FOLLOW_usingClauseDeleteObjective_in_usingClauseObjective1044	TokenNameIdentifier	 FOLLOW using Clause Delete Objective in using Clause Objective1044
=	TokenNameEQUAL	
new	TokenNamenew	
BitSet	TokenNameIdentifier	 Bit Set
(	TokenNameLPAREN	
new	TokenNamenew	
long	TokenNamelong	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
0x0000000000000002L	TokenNameLongLiteral	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
BitSet	TokenNameIdentifier	 Bit Set
FOLLOW_K_TTL_in_usingClauseObjective1053	TokenNameIdentifier	 FOLLOW  K  TTL in using Clause Objective1053
=	TokenNameEQUAL	
new	TokenNamenew	
BitSet	TokenNameIdentifier	 Bit Set
(	TokenNameLPAREN	
new	TokenNamenew	
long	TokenNamelong	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
0x0000000000000040L	TokenNameLongLiteral	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
BitSet	TokenNameIdentifier	 Bit Set
FOLLOW_INTEGER_in_usingClauseObjective1057	TokenNameIdentifier	 FOLLOW  INTEGER in using Clause Objective1057
=	TokenNameEQUAL	
new	TokenNamenew	
BitSet	TokenNameIdentifier	 Bit Set
(	TokenNameLPAREN	
new	TokenNamenew	
long	TokenNamelong	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
0x0000000000000002L	TokenNameLongLiteral	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
BitSet	TokenNameIdentifier	 Bit Set
FOLLOW_K_BEGIN_in_batchStatement1097	TokenNameIdentifier	 FOLLOW  K  BEGIN in batch Statement1097
=	TokenNameEQUAL	
new	TokenNamenew	
BitSet	TokenNameIdentifier	 Bit Set
(	TokenNameLPAREN	
new	TokenNamenew	
long	TokenNamelong	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
0x0000000008000000L	TokenNameLongLiteral	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
BitSet	TokenNameIdentifier	 Bit Set
FOLLOW_K_BATCH_in_batchStatement1099	TokenNameIdentifier	 FOLLOW  K  BATCH in batch Statement1099
=	TokenNameEQUAL	
new	TokenNamenew	
BitSet	TokenNameIdentifier	 Bit Set
(	TokenNameLPAREN	
new	TokenNamenew	
long	TokenNamelong	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
0x00000000A0200800L	TokenNameLongLiteral	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
BitSet	TokenNameIdentifier	 Bit Set
FOLLOW_usingClause_in_batchStatement1103	TokenNameIdentifier	 FOLLOW using Clause in batch Statement1103
=	TokenNameEQUAL	
new	TokenNamenew	
BitSet	TokenNameIdentifier	 Bit Set
(	TokenNameLPAREN	
new	TokenNamenew	
long	TokenNamelong	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
0x00000000A0200800L	TokenNameLongLiteral	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
BitSet	TokenNameIdentifier	 Bit Set
FOLLOW_batchStatementObjective_in_batchStatement1121	TokenNameIdentifier	 FOLLOW batch Statement Objective in batch Statement1121
=	TokenNameEQUAL	
new	TokenNamenew	
BitSet	TokenNameIdentifier	 Bit Set
(	TokenNameLPAREN	
new	TokenNamenew	
long	TokenNamelong	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
0x00000000B0200800L	TokenNameLongLiteral	
,	TokenNameCOMMA	
0x0000000000400000L	TokenNameLongLiteral	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
BitSet	TokenNameIdentifier	 Bit Set
FOLLOW_86_in_batchStatement1123	TokenNameIdentifier	 FOLLOW 86 in batch Statement1123
=	TokenNameEQUAL	
new	TokenNamenew	
BitSet	TokenNameIdentifier	 Bit Set
(	TokenNameLPAREN	
new	TokenNamenew	
long	TokenNamelong	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
0x00000000B0200800L	TokenNameLongLiteral	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
BitSet	TokenNameIdentifier	 Bit Set
FOLLOW_batchStatementObjective_in_batchStatement1132	TokenNameIdentifier	 FOLLOW batch Statement Objective in batch Statement1132
=	TokenNameEQUAL	
new	TokenNamenew	
BitSet	TokenNameIdentifier	 Bit Set
(	TokenNameLPAREN	
new	TokenNamenew	
long	TokenNamelong	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
0x00000000B0200800L	TokenNameLongLiteral	
,	TokenNameCOMMA	
0x0000000000400000L	TokenNameLongLiteral	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
BitSet	TokenNameIdentifier	 Bit Set
FOLLOW_86_in_batchStatement1134	TokenNameIdentifier	 FOLLOW 86 in batch Statement1134
=	TokenNameEQUAL	
new	TokenNamenew	
BitSet	TokenNameIdentifier	 Bit Set
(	TokenNameLPAREN	
new	TokenNamenew	
long	TokenNamelong	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
0x00000000B0200800L	TokenNameLongLiteral	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
BitSet	TokenNameIdentifier	 Bit Set
FOLLOW_K_APPLY_in_batchStatement1148	TokenNameIdentifier	 FOLLOW  K  APPLY in batch Statement1148
=	TokenNameEQUAL	
new	TokenNamenew	
BitSet	TokenNameIdentifier	 Bit Set
(	TokenNameLPAREN	
new	TokenNamenew	
long	TokenNamelong	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
0x0000000008000000L	TokenNameLongLiteral	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
BitSet	TokenNameIdentifier	 Bit Set
FOLLOW_K_BATCH_in_batchStatement1150	TokenNameIdentifier	 FOLLOW  K  BATCH in batch Statement1150
=	TokenNameEQUAL	
new	TokenNamenew	
BitSet	TokenNameIdentifier	 Bit Set
(	TokenNameLPAREN	
new	TokenNamenew	
long	TokenNamelong	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
0x0000000000000000L	TokenNameLongLiteral	
,	TokenNameCOMMA	
0x0000000000400000L	TokenNameLongLiteral	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
BitSet	TokenNameIdentifier	 Bit Set
FOLLOW_endStmnt_in_batchStatement1152	TokenNameIdentifier	 FOLLOW end Stmnt in batch Statement1152
=	TokenNameEQUAL	
new	TokenNamenew	
BitSet	TokenNameIdentifier	 Bit Set
(	TokenNameLPAREN	
new	TokenNamenew	
long	TokenNamelong	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
0x0000000000000002L	TokenNameLongLiteral	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
BitSet	TokenNameIdentifier	 Bit Set
FOLLOW_insertStatement_in_batchStatementObjective1183	TokenNameIdentifier	 FOLLOW insert Statement in batch Statement Objective1183
=	TokenNameEQUAL	
new	TokenNamenew	
BitSet	TokenNameIdentifier	 Bit Set
(	TokenNameLPAREN	
new	TokenNamenew	
long	TokenNamelong	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
0x0000000000000002L	TokenNameLongLiteral	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
BitSet	TokenNameIdentifier	 Bit Set
FOLLOW_updateStatement_in_batchStatementObjective1196	TokenNameIdentifier	 FOLLOW update Statement in batch Statement Objective1196
=	TokenNameEQUAL	
new	TokenNamenew	
BitSet	TokenNameIdentifier	 Bit Set
(	TokenNameLPAREN	
new	TokenNamenew	
long	TokenNamelong	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
0x0000000000000002L	TokenNameLongLiteral	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
BitSet	TokenNameIdentifier	 Bit Set
FOLLOW_deleteStatement_in_batchStatementObjective1209	TokenNameIdentifier	 FOLLOW delete Statement in batch Statement Objective1209
=	TokenNameEQUAL	
new	TokenNamenew	
BitSet	TokenNameIdentifier	 Bit Set
(	TokenNameLPAREN	
new	TokenNamenew	
long	TokenNamelong	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
0x0000000000000002L	TokenNameLongLiteral	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
BitSet	TokenNameIdentifier	 Bit Set
FOLLOW_K_UPDATE_in_updateStatement1243	TokenNameIdentifier	 FOLLOW  K  UPDATE in update Statement1243
=	TokenNameEQUAL	
new	TokenNamenew	
BitSet	TokenNameIdentifier	 Bit Set
(	TokenNameLPAREN	
new	TokenNamenew	
long	TokenNamelong	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
0x00000000000000E0L	TokenNameLongLiteral	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
BitSet	TokenNameIdentifier	 Bit Set
FOLLOW_set_in_updateStatement1248	TokenNameIdentifier	 FOLLOW set in update Statement1248
=	TokenNameEQUAL	
new	TokenNamenew	
BitSet	TokenNameIdentifier	 Bit Set
(	TokenNameLPAREN	
new	TokenNamenew	
long	TokenNamelong	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
0x0000000000000000L	TokenNameLongLiteral	
,	TokenNameCOMMA	
0x0000000000080000L	TokenNameLongLiteral	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
BitSet	TokenNameIdentifier	 Bit Set
FOLLOW_83_in_updateStatement1260	TokenNameIdentifier	 FOLLOW 83 in update Statement1260
=	TokenNameEQUAL	
new	TokenNamenew	
BitSet	TokenNameIdentifier	 Bit Set
(	TokenNameLPAREN	
new	TokenNamenew	
long	TokenNamelong	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
0x00000000000000E0L	TokenNameLongLiteral	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
BitSet	TokenNameIdentifier	 Bit Set
FOLLOW_set_in_updateStatement1266	TokenNameIdentifier	 FOLLOW set in update Statement1266
=	TokenNameEQUAL	
new	TokenNamenew	
BitSet	TokenNameIdentifier	 Bit Set
(	TokenNameLPAREN	
new	TokenNamenew	
long	TokenNamelong	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
0x0000000040000800L	TokenNameLongLiteral	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
BitSet	TokenNameIdentifier	 Bit Set
FOLLOW_usingClause_in_updateStatement1292	TokenNameIdentifier	 FOLLOW using Clause in update Statement1292
=	TokenNameEQUAL	
new	TokenNamenew	
BitSet	TokenNameIdentifier	 Bit Set
(	TokenNameLPAREN	
new	TokenNamenew	
long	TokenNamelong	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
0x0000000040000000L	TokenNameLongLiteral	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
BitSet	TokenNameIdentifier	 Bit Set
FOLLOW_K_SET_in_updateStatement1308	TokenNameIdentifier	 FOLLOW  K  SET in update Statement1308
=	TokenNameEQUAL	
new	TokenNamenew	
BitSet	TokenNameIdentifier	 Bit Set
(	TokenNameLPAREN	
new	TokenNamenew	
long	TokenNamelong	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
0x0000C0C0000000E0L	TokenNameLongLiteral	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
BitSet	TokenNameIdentifier	 Bit Set
FOLLOW_termPairWithOperation_in_updateStatement1310	TokenNameIdentifier	 FOLLOW term Pair With Operation in update Statement1310
=	TokenNameEQUAL	
new	TokenNamenew	
BitSet	TokenNameIdentifier	 Bit Set
(	TokenNameLPAREN	
new	TokenNamenew	
long	TokenNamelong	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
0x0000000000004000L	TokenNameLongLiteral	
,	TokenNameCOMMA	
0x0000000000100000L	TokenNameLongLiteral	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
BitSet	TokenNameIdentifier	 Bit Set
FOLLOW_84_in_updateStatement1314	TokenNameIdentifier	 FOLLOW 84 in update Statement1314
=	TokenNameEQUAL	
new	TokenNamenew	
BitSet	TokenNameIdentifier	 Bit Set
(	TokenNameLPAREN	
new	TokenNamenew	
long	TokenNamelong	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
0x0000C0C0000000E0L	TokenNameLongLiteral	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
BitSet	TokenNameIdentifier	 Bit Set
FOLLOW_termPairWithOperation_in_updateStatement1316	TokenNameIdentifier	 FOLLOW term Pair With Operation in update Statement1316
=	TokenNameEQUAL	
new	TokenNamenew	
BitSet	TokenNameIdentifier	 Bit Set
(	TokenNameLPAREN	
new	TokenNamenew	
long	TokenNamelong	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
0x0000000000004000L	TokenNameLongLiteral	
,	TokenNameCOMMA	
0x0000000000100000L	TokenNameLongLiteral	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
BitSet	TokenNameIdentifier	 Bit Set
FOLLOW_K_WHERE_in_updateStatement1331	TokenNameIdentifier	 FOLLOW  K  WHERE in update Statement1331
=	TokenNameEQUAL	
new	TokenNamenew	
BitSet	TokenNameIdentifier	 Bit Set
(	TokenNameLPAREN	
new	TokenNamenew	
long	TokenNamelong	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
0x0000C0C0000000E0L	TokenNameLongLiteral	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
BitSet	TokenNameIdentifier	 Bit Set
FOLLOW_term_in_updateStatement1337	TokenNameIdentifier	 FOLLOW term in update Statement1337
=	TokenNameEQUAL	
new	TokenNamenew	
BitSet	TokenNameIdentifier	 Bit Set
(	TokenNameLPAREN	
new	TokenNamenew	
long	TokenNamelong	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
0x0000000000100000L	TokenNameLongLiteral	
,	TokenNameCOMMA	
0x0000000000800000L	TokenNameLongLiteral	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
BitSet	TokenNameIdentifier	 Bit Set
FOLLOW_87_in_updateStatement1340	TokenNameIdentifier	 FOLLOW 87 in update Statement1340
=	TokenNameEQUAL	
new	TokenNamenew	
BitSet	TokenNameIdentifier	 Bit Set
(	TokenNameLPAREN	
new	TokenNamenew	
long	TokenNamelong	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
0x0000C0C0000000E0L	TokenNameLongLiteral	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
BitSet	TokenNameIdentifier	 Bit Set
FOLLOW_term_in_updateStatement1344	TokenNameIdentifier	 FOLLOW term in update Statement1344
=	TokenNameEQUAL	
new	TokenNamenew	
BitSet	TokenNameIdentifier	 Bit Set
(	TokenNameLPAREN	
new	TokenNamenew	
long	TokenNamelong	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
0x0000000000000002L	TokenNameLongLiteral	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
BitSet	TokenNameIdentifier	 Bit Set
FOLLOW_K_IN_in_updateStatement1422	TokenNameIdentifier	 FOLLOW  K  IN in update Statement1422
=	TokenNameEQUAL	
new	TokenNamenew	
BitSet	TokenNameIdentifier	 Bit Set
(	TokenNameLPAREN	
new	TokenNamenew	
long	TokenNamelong	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
0x0000000000000000L	TokenNameLongLiteral	
,	TokenNameCOMMA	
0x0000000000020000L	TokenNameLongLiteral	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
BitSet	TokenNameIdentifier	 Bit Set
FOLLOW_81_in_updateStatement1424	TokenNameIdentifier	 FOLLOW 81 in update Statement1424
=	TokenNameEQUAL	
new	TokenNamenew	
BitSet	TokenNameIdentifier	 Bit Set
(	TokenNameLPAREN	
new	TokenNamenew	
long	TokenNamelong	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
0x0000C0C0000000E0L	TokenNameLongLiteral	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
BitSet	TokenNameIdentifier	 Bit Set
FOLLOW_termList_in_updateStatement1428	TokenNameIdentifier	 FOLLOW term List in update Statement1428
=	TokenNameEQUAL	
new	TokenNamenew	
BitSet	TokenNameIdentifier	 Bit Set
(	TokenNameLPAREN	
new	TokenNamenew	
long	TokenNamelong	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
0x0000000000000000L	TokenNameLongLiteral	
,	TokenNameCOMMA	
0x0000000000040000L	TokenNameLongLiteral	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
BitSet	TokenNameIdentifier	 Bit Set
FOLLOW_82_in_updateStatement1432	TokenNameIdentifier	 FOLLOW 82 in update Statement1432
=	TokenNameEQUAL	
new	TokenNamenew	
BitSet	TokenNameIdentifier	 Bit Set
(	TokenNameLPAREN	
new	TokenNamenew	
long	TokenNamelong	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
0x0000000000000002L	TokenNameLongLiteral	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
BitSet	TokenNameIdentifier	 Bit Set
FOLLOW_K_DELETE_in_deleteStatement1474	TokenNameIdentifier	 FOLLOW  K  DELETE in delete Statement1474
=	TokenNameEQUAL	
new	TokenNamenew	
BitSet	TokenNameIdentifier	 Bit Set
(	TokenNameLPAREN	
new	TokenNamenew	
long	TokenNamelong	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
0x0000C0C0000004E0L	TokenNameLongLiteral	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
BitSet	TokenNameIdentifier	 Bit Set
FOLLOW_termList_in_deleteStatement1490	TokenNameIdentifier	 FOLLOW term List in delete Statement1490
=	TokenNameEQUAL	
new	TokenNamenew	
BitSet	TokenNameIdentifier	 Bit Set
(	TokenNameLPAREN	
new	TokenNamenew	
long	TokenNamelong	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
0x0000000000000400L	TokenNameLongLiteral	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
BitSet	TokenNameIdentifier	 Bit Set
FOLLOW_K_FROM_in_deleteStatement1506	TokenNameIdentifier	 FOLLOW  K  FROM in delete Statement1506
=	TokenNameEQUAL	
new	TokenNamenew	
BitSet	TokenNameIdentifier	 Bit Set
(	TokenNameLPAREN	
new	TokenNamenew	
long	TokenNamelong	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
0x00000000000000E0L	TokenNameLongLiteral	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
BitSet	TokenNameIdentifier	 Bit Set
FOLLOW_set_in_deleteStatement1511	TokenNameIdentifier	 FOLLOW set in delete Statement1511
=	TokenNameEQUAL	
new	TokenNamenew	
BitSet	TokenNameIdentifier	 Bit Set
(	TokenNameLPAREN	
new	TokenNamenew	
long	TokenNamelong	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
0x0000000000000000L	TokenNameLongLiteral	
,	TokenNameCOMMA	
0x0000000000080000L	TokenNameLongLiteral	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
BitSet	TokenNameIdentifier	 Bit Set
FOLLOW_83_in_deleteStatement1523	TokenNameIdentifier	 FOLLOW 83 in delete Statement1523
=	TokenNameEQUAL	
new	TokenNamenew	
BitSet	TokenNameIdentifier	 Bit Set
(	TokenNameLPAREN	
new	TokenNamenew	
long	TokenNamelong	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
0x00000000000000E0L	TokenNameLongLiteral	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
BitSet	TokenNameIdentifier	 Bit Set
FOLLOW_set_in_deleteStatement1529	TokenNameIdentifier	 FOLLOW set in delete Statement1529
=	TokenNameEQUAL	
new	TokenNamenew	
BitSet	TokenNameIdentifier	 Bit Set
(	TokenNameLPAREN	
new	TokenNamenew	
long	TokenNamelong	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
0x0000000000004802L	TokenNameLongLiteral	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
BitSet	TokenNameIdentifier	 Bit Set
FOLLOW_usingClauseDelete_in_deleteStatement1555	TokenNameIdentifier	 FOLLOW using Clause Delete in delete Statement1555
=	TokenNameEQUAL	
new	TokenNamenew	
BitSet	TokenNameIdentifier	 Bit Set
(	TokenNameLPAREN	
new	TokenNamenew	
long	TokenNamelong	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
0x0000000000004002L	TokenNameLongLiteral	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
BitSet	TokenNameIdentifier	 Bit Set
FOLLOW_K_WHERE_in_deleteStatement1573	TokenNameIdentifier	 FOLLOW  K  WHERE in delete Statement1573
=	TokenNameEQUAL	
new	TokenNamenew	
BitSet	TokenNameIdentifier	 Bit Set
(	TokenNameLPAREN	
new	TokenNamenew	
long	TokenNamelong	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
0x0000C0C0000000E0L	TokenNameLongLiteral	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
BitSet	TokenNameIdentifier	 Bit Set
FOLLOW_term_in_deleteStatement1577	TokenNameIdentifier	 FOLLOW term in delete Statement1577
=	TokenNameEQUAL	
new	TokenNamenew	
BitSet	TokenNameIdentifier	 Bit Set
(	TokenNameLPAREN	
new	TokenNamenew	
long	TokenNamelong	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
0x0000000000100000L	TokenNameLongLiteral	
,	TokenNameCOMMA	
0x0000000000800000L	TokenNameLongLiteral	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
BitSet	TokenNameIdentifier	 Bit Set
FOLLOW_87_in_deleteStatement1580	TokenNameIdentifier	 FOLLOW 87 in delete Statement1580
=	TokenNameEQUAL	
new	TokenNamenew	
BitSet	TokenNameIdentifier	 Bit Set
(	TokenNameLPAREN	
new	TokenNamenew	
long	TokenNamelong	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
0x0000C0C0000000E0L	TokenNameLongLiteral	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
BitSet	TokenNameIdentifier	 Bit Set
FOLLOW_term_in_deleteStatement1584	TokenNameIdentifier	 FOLLOW term in delete Statement1584
=	TokenNameEQUAL	
new	TokenNamenew	
BitSet	TokenNameIdentifier	 Bit Set
(	TokenNameLPAREN	
new	TokenNamenew	
long	TokenNamelong	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
0x0000000000000002L	TokenNameLongLiteral	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
BitSet	TokenNameIdentifier	 Bit Set
FOLLOW_K_IN_in_deleteStatement1635	TokenNameIdentifier	 FOLLOW  K  IN in delete Statement1635
=	TokenNameEQUAL	
new	TokenNamenew	
BitSet	TokenNameIdentifier	 Bit Set
(	TokenNameLPAREN	
new	TokenNamenew	
long	TokenNamelong	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
0x0000000000000000L	TokenNameLongLiteral	
,	TokenNameCOMMA	
0x0000000000020000L	TokenNameLongLiteral	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
BitSet	TokenNameIdentifier	 Bit Set
FOLLOW_81_in_deleteStatement1637	TokenNameIdentifier	 FOLLOW 81 in delete Statement1637
=	TokenNameEQUAL	
new	TokenNamenew	
BitSet	TokenNameIdentifier	 Bit Set
(	TokenNameLPAREN	
new	TokenNamenew	
long	TokenNamelong	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
0x0000C0C0000000E0L	TokenNameLongLiteral	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
BitSet	TokenNameIdentifier	 Bit Set
FOLLOW_termList_in_deleteStatement1641	TokenNameIdentifier	 FOLLOW term List in delete Statement1641
=	TokenNameEQUAL	
new	TokenNamenew	
BitSet	TokenNameIdentifier	 Bit Set
(	TokenNameLPAREN	
new	TokenNamenew	
long	TokenNamelong	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
0x0000000000000000L	TokenNameLongLiteral	
,	TokenNameCOMMA	
0x0000000000040000L	TokenNameLongLiteral	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
BitSet	TokenNameIdentifier	 Bit Set
FOLLOW_82_in_deleteStatement1645	TokenNameIdentifier	 FOLLOW 82 in delete Statement1645
=	TokenNameEQUAL	
new	TokenNamenew	
BitSet	TokenNameIdentifier	 Bit Set
(	TokenNameLPAREN	
new	TokenNamenew	
long	TokenNamelong	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
0x0000000000000002L	TokenNameLongLiteral	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
BitSet	TokenNameIdentifier	 Bit Set
FOLLOW_K_CREATE_in_createKeyspaceStatement1708	TokenNameIdentifier	 FOLLOW  K  CREATE in create Keyspace Statement1708
=	TokenNameEQUAL	
new	TokenNamenew	
BitSet	TokenNameIdentifier	 Bit Set
(	TokenNameLPAREN	
new	TokenNamenew	
long	TokenNamelong	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
0x0000000200000000L	TokenNameLongLiteral	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
BitSet	TokenNameIdentifier	 Bit Set
FOLLOW_K_KEYSPACE_in_createKeyspaceStatement1710	TokenNameIdentifier	 FOLLOW  K  KEYSPACE in create Keyspace Statement1710
=	TokenNameEQUAL	
new	TokenNamenew	
BitSet	TokenNameIdentifier	 Bit Set
(	TokenNameLPAREN	
new	TokenNamenew	
long	TokenNamelong	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
0x00000000000000E0L	TokenNameLongLiteral	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
BitSet	TokenNameIdentifier	 Bit Set
FOLLOW_set_in_createKeyspaceStatement1714	TokenNameIdentifier	 FOLLOW set in create Keyspace Statement1714
=	TokenNameEQUAL	
new	TokenNamenew	
BitSet	TokenNameIdentifier	 Bit Set
(	TokenNameLPAREN	
new	TokenNamenew	
long	TokenNamelong	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
0x0000000400000000L	TokenNameLongLiteral	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
BitSet	TokenNameIdentifier	 Bit Set
FOLLOW_K_WITH_in_createKeyspaceStatement1738	TokenNameIdentifier	 FOLLOW  K  WITH in create Keyspace Statement1738
=	TokenNameEQUAL	
new	TokenNamenew	
BitSet	TokenNameIdentifier	 Bit Set
(	TokenNameLPAREN	
new	TokenNamenew	
long	TokenNamelong	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
0x0000000800000020L	TokenNameLongLiteral	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
BitSet	TokenNameIdentifier	 Bit Set
FOLLOW_set_in_createKeyspaceStatement1743	TokenNameIdentifier	 FOLLOW set in create Keyspace Statement1743
=	TokenNameEQUAL	
new	TokenNamenew	
BitSet	TokenNameIdentifier	 Bit Set
(	TokenNameLPAREN	
new	TokenNamenew	
long	TokenNamelong	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
0x0000000000000000L	TokenNameLongLiteral	
,	TokenNameCOMMA	
0x0000000000800000L	TokenNameLongLiteral	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
BitSet	TokenNameIdentifier	 Bit Set
FOLLOW_87_in_createKeyspaceStatement1753	TokenNameIdentifier	 FOLLOW 87 in create Keyspace Statement1753
=	TokenNameEQUAL	
new	TokenNamenew	
BitSet	TokenNameIdentifier	 Bit Set
(	TokenNameLPAREN	
new	TokenNamenew	
long	TokenNamelong	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
0x00000000000000E0L	TokenNameLongLiteral	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
BitSet	TokenNameIdentifier	 Bit Set
FOLLOW_set_in_createKeyspaceStatement1757	TokenNameIdentifier	 FOLLOW set in create Keyspace Statement1757
=	TokenNameEQUAL	
new	TokenNamenew	
BitSet	TokenNameIdentifier	 Bit Set
(	TokenNameLPAREN	
new	TokenNamenew	
long	TokenNamelong	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
0x0000000000080000L	TokenNameLongLiteral	
,	TokenNameCOMMA	
0x0000000000400000L	TokenNameLongLiteral	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
BitSet	TokenNameIdentifier	 Bit Set
FOLLOW_K_AND_in_createKeyspaceStatement1785	TokenNameIdentifier	 FOLLOW  K  AND in create Keyspace Statement1785
=	TokenNameEQUAL	
new	TokenNamenew	
BitSet	TokenNameIdentifier	 Bit Set
(	TokenNameLPAREN	
new	TokenNamenew	
long	TokenNamelong	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
0x0000000800000020L	TokenNameLongLiteral	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
BitSet	TokenNameIdentifier	 Bit Set
FOLLOW_set_in_createKeyspaceStatement1789	TokenNameIdentifier	 FOLLOW set in create Keyspace Statement1789
=	TokenNameEQUAL	
new	TokenNamenew	
BitSet	TokenNameIdentifier	 Bit Set
(	TokenNameLPAREN	
new	TokenNamenew	
long	TokenNamelong	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
0x0000000000000000L	TokenNameLongLiteral	
,	TokenNameCOMMA	
0x0000000000800000L	TokenNameLongLiteral	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
BitSet	TokenNameIdentifier	 Bit Set
FOLLOW_87_in_createKeyspaceStatement1799	TokenNameIdentifier	 FOLLOW 87 in create Keyspace Statement1799
=	TokenNameEQUAL	
new	TokenNamenew	
BitSet	TokenNameIdentifier	 Bit Set
(	TokenNameLPAREN	
new	TokenNamenew	
long	TokenNamelong	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
0x00000000000000E0L	TokenNameLongLiteral	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
BitSet	TokenNameIdentifier	 Bit Set
FOLLOW_set_in_createKeyspaceStatement1803	TokenNameIdentifier	 FOLLOW set in create Keyspace Statement1803
=	TokenNameEQUAL	
new	TokenNamenew	
BitSet	TokenNameIdentifier	 Bit Set
(	TokenNameLPAREN	
new	TokenNamenew	
long	TokenNamelong	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
0x0000000000080000L	TokenNameLongLiteral	
,	TokenNameCOMMA	
0x0000000000400000L	TokenNameLongLiteral	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
BitSet	TokenNameIdentifier	 Bit Set
FOLLOW_endStmnt_in_createKeyspaceStatement1832	TokenNameIdentifier	 FOLLOW end Stmnt in create Keyspace Statement1832
=	TokenNameEQUAL	
new	TokenNamenew	
BitSet	TokenNameIdentifier	 Bit Set
(	TokenNameLPAREN	
new	TokenNamenew	
long	TokenNamelong	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
0x0000000000000002L	TokenNameLongLiteral	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
BitSet	TokenNameIdentifier	 Bit Set
FOLLOW_K_CREATE_in_createColumnFamilyStatement1867	TokenNameIdentifier	 FOLLOW  K  CREATE in create Column Family Statement1867
=	TokenNameEQUAL	
new	TokenNamenew	
BitSet	TokenNameIdentifier	 Bit Set
(	TokenNameLPAREN	
new	TokenNamenew	
long	TokenNamelong	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
0x0000001000000000L	TokenNameLongLiteral	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
BitSet	TokenNameIdentifier	 Bit Set
FOLLOW_K_COLUMNFAMILY_in_createColumnFamilyStatement1869	TokenNameIdentifier	 FOLLOW  K  COLUMNFAMILY in create Column Family Statement1869
=	TokenNameEQUAL	
new	TokenNamenew	
BitSet	TokenNameIdentifier	 Bit Set
(	TokenNameLPAREN	
new	TokenNamenew	
long	TokenNamelong	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
0x00000000000000E0L	TokenNameLongLiteral	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
BitSet	TokenNameIdentifier	 Bit Set
FOLLOW_set_in_createColumnFamilyStatement1873	TokenNameIdentifier	 FOLLOW set in create Column Family Statement1873
=	TokenNameEQUAL	
new	TokenNamenew	
BitSet	TokenNameIdentifier	 Bit Set
(	TokenNameLPAREN	
new	TokenNamenew	
long	TokenNamelong	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
0x0000000400000000L	TokenNameLongLiteral	
,	TokenNameCOMMA	
0x0000000000420000L	TokenNameLongLiteral	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
BitSet	TokenNameIdentifier	 Bit Set
FOLLOW_81_in_createColumnFamilyStatement1897	TokenNameIdentifier	 FOLLOW 81 in create Column Family Statement1897
=	TokenNameEQUAL	
new	TokenNamenew	
BitSet	TokenNameIdentifier	 Bit Set
(	TokenNameLPAREN	
new	TokenNamenew	
long	TokenNamelong	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
0x0000C0C0000000E0L	TokenNameLongLiteral	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
BitSet	TokenNameIdentifier	 Bit Set
FOLLOW_createCfamColumns_in_createColumnFamilyStatement1899	TokenNameIdentifier	 FOLLOW create Cfam Columns in create Column Family Statement1899
=	TokenNameEQUAL	
new	TokenNamenew	
BitSet	TokenNameIdentifier	 Bit Set
(	TokenNameLPAREN	
new	TokenNamenew	
long	TokenNamelong	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
0x0000000000000000L	TokenNameLongLiteral	
,	TokenNameCOMMA	
0x0000000000140000L	TokenNameLongLiteral	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
BitSet	TokenNameIdentifier	 Bit Set
FOLLOW_84_in_createColumnFamilyStatement1904	TokenNameIdentifier	 FOLLOW 84 in create Column Family Statement1904
=	TokenNameEQUAL	
new	TokenNamenew	
BitSet	TokenNameIdentifier	 Bit Set
(	TokenNameLPAREN	
new	TokenNamenew	
long	TokenNamelong	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
0x0000C0C0000000E0L	TokenNameLongLiteral	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
BitSet	TokenNameIdentifier	 Bit Set
FOLLOW_createCfamColumns_in_createColumnFamilyStatement1906	TokenNameIdentifier	 FOLLOW create Cfam Columns in create Column Family Statement1906
=	TokenNameEQUAL	
new	TokenNamenew	
BitSet	TokenNameIdentifier	 Bit Set
(	TokenNameLPAREN	
new	TokenNamenew	
long	TokenNamelong	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
0x0000000000000000L	TokenNameLongLiteral	
,	TokenNameCOMMA	
0x0000000000140000L	TokenNameLongLiteral	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
BitSet	TokenNameIdentifier	 Bit Set
FOLLOW_82_in_createColumnFamilyStatement1912	TokenNameIdentifier	 FOLLOW 82 in create Column Family Statement1912
=	TokenNameEQUAL	
new	TokenNamenew	
BitSet	TokenNameIdentifier	 Bit Set
(	TokenNameLPAREN	
new	TokenNamenew	
long	TokenNamelong	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
0x0000000400000000L	TokenNameLongLiteral	
,	TokenNameCOMMA	
0x0000000000400000L	TokenNameLongLiteral	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
BitSet	TokenNameIdentifier	 Bit Set
FOLLOW_K_WITH_in_createColumnFamilyStatement1925	TokenNameIdentifier	 FOLLOW  K  WITH in create Column Family Statement1925
=	TokenNameEQUAL	
new	TokenNamenew	
BitSet	TokenNameIdentifier	 Bit Set
(	TokenNameLPAREN	
new	TokenNamenew	
long	TokenNamelong	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
0x0000000800000020L	TokenNameLongLiteral	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
BitSet	TokenNameIdentifier	 Bit Set
FOLLOW_set_in_createColumnFamilyStatement1929	TokenNameIdentifier	 FOLLOW set in create Column Family Statement1929
=	TokenNameEQUAL	
new	TokenNamenew	
BitSet	TokenNameIdentifier	 Bit Set
(	TokenNameLPAREN	
new	TokenNamenew	
long	TokenNamelong	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
0x0000000000000000L	TokenNameLongLiteral	
,	TokenNameCOMMA	
0x0000000000800000L	TokenNameLongLiteral	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
BitSet	TokenNameIdentifier	 Bit Set
FOLLOW_87_in_createColumnFamilyStatement1937	TokenNameIdentifier	 FOLLOW 87 in create Column Family Statement1937
=	TokenNameEQUAL	
new	TokenNamenew	
BitSet	TokenNameIdentifier	 Bit Set
(	TokenNameLPAREN	
new	TokenNamenew	
long	TokenNamelong	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
0x00000080000000E0L	TokenNameLongLiteral	
,	TokenNameCOMMA	
0x0000003FFF000000L	TokenNameLongLiteral	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
BitSet	TokenNameIdentifier	 Bit Set
FOLLOW_createCfamKeywordArgument_in_createColumnFamilyStatement1941	TokenNameIdentifier	 FOLLOW create Cfam Keyword Argument in create Column Family Statement1941
=	TokenNameEQUAL	
new	TokenNamenew	
BitSet	TokenNameIdentifier	 Bit Set
(	TokenNameLPAREN	
new	TokenNamenew	
long	TokenNamelong	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
0x0000000000080000L	TokenNameLongLiteral	
,	TokenNameCOMMA	
0x0000000000400000L	TokenNameLongLiteral	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
BitSet	TokenNameIdentifier	 Bit Set
FOLLOW_K_AND_in_createColumnFamilyStatement1957	TokenNameIdentifier	 FOLLOW  K  AND in create Column Family Statement1957
=	TokenNameEQUAL	
new	TokenNamenew	
BitSet	TokenNameIdentifier	 Bit Set
(	TokenNameLPAREN	
new	TokenNamenew	
long	TokenNamelong	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
0x0000000800000020L	TokenNameLongLiteral	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
BitSet	TokenNameIdentifier	 Bit Set
FOLLOW_set_in_createColumnFamilyStatement1961	TokenNameIdentifier	 FOLLOW set in create Column Family Statement1961
=	TokenNameEQUAL	
new	TokenNamenew	
BitSet	TokenNameIdentifier	 Bit Set
(	TokenNameLPAREN	
new	TokenNamenew	
long	TokenNamelong	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
0x0000000000000000L	TokenNameLongLiteral	
,	TokenNameCOMMA	
0x0000000000800000L	TokenNameLongLiteral	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
BitSet	TokenNameIdentifier	 Bit Set
FOLLOW_87_in_createColumnFamilyStatement1969	TokenNameIdentifier	 FOLLOW 87 in create Column Family Statement1969
=	TokenNameEQUAL	
new	TokenNamenew	
BitSet	TokenNameIdentifier	 Bit Set
(	TokenNameLPAREN	
new	TokenNamenew	
long	TokenNamelong	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
0x00000080000000E0L	TokenNameLongLiteral	
,	TokenNameCOMMA	
0x0000003FFF000000L	TokenNameLongLiteral	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
BitSet	TokenNameIdentifier	 Bit Set
FOLLOW_createCfamKeywordArgument_in_createColumnFamilyStatement1973	TokenNameIdentifier	 FOLLOW create Cfam Keyword Argument in create Column Family Statement1973
=	TokenNameEQUAL	
new	TokenNamenew	
BitSet	TokenNameIdentifier	 Bit Set
(	TokenNameLPAREN	
new	TokenNamenew	
long	TokenNamelong	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
0x0000000000080000L	TokenNameLongLiteral	
,	TokenNameCOMMA	
0x0000000000400000L	TokenNameLongLiteral	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
BitSet	TokenNameIdentifier	 Bit Set
FOLLOW_endStmnt_in_createColumnFamilyStatement1995	TokenNameIdentifier	 FOLLOW end Stmnt in create Column Family Statement1995
=	TokenNameEQUAL	
new	TokenNamenew	
BitSet	TokenNameIdentifier	 Bit Set
(	TokenNameLPAREN	
new	TokenNamenew	
long	TokenNamelong	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
0x0000000000000002L	TokenNameLongLiteral	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
BitSet	TokenNameIdentifier	 Bit Set
FOLLOW_term_in_createCfamColumns2015	TokenNameIdentifier	 FOLLOW term in create Cfam Columns2015
=	TokenNameEQUAL	
new	TokenNamenew	
BitSet	TokenNameIdentifier	 Bit Set
(	TokenNameLPAREN	
new	TokenNamenew	
long	TokenNamelong	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
0x0000000000000080L	TokenNameLongLiteral	
,	TokenNameCOMMA	
0x0000003FFF000000L	TokenNameLongLiteral	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
BitSet	TokenNameIdentifier	 Bit Set
FOLLOW_createCfamColumnValidator_in_createCfamColumns2019	TokenNameIdentifier	 FOLLOW create Cfam Column Validator in create Cfam Columns2019
=	TokenNameEQUAL	
new	TokenNamenew	
BitSet	TokenNameIdentifier	 Bit Set
(	TokenNameLPAREN	
new	TokenNamenew	
long	TokenNamelong	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
0x0000000000000002L	TokenNameLongLiteral	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
BitSet	TokenNameIdentifier	 Bit Set
FOLLOW_term_in_createCfamColumns2031	TokenNameIdentifier	 FOLLOW term in create Cfam Columns2031
=	TokenNameEQUAL	
new	TokenNamenew	
BitSet	TokenNameIdentifier	 Bit Set
(	TokenNameLPAREN	
new	TokenNamenew	
long	TokenNamelong	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
0x0000000000000080L	TokenNameLongLiteral	
,	TokenNameCOMMA	
0x0000003FFF000000L	TokenNameLongLiteral	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
BitSet	TokenNameIdentifier	 Bit Set
FOLLOW_createCfamColumnValidator_in_createCfamColumns2035	TokenNameIdentifier	 FOLLOW create Cfam Column Validator in create Cfam Columns2035
=	TokenNameEQUAL	
new	TokenNamenew	
BitSet	TokenNameIdentifier	 Bit Set
(	TokenNameLPAREN	
new	TokenNamenew	
long	TokenNamelong	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
0x0000002000000000L	TokenNameLongLiteral	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
BitSet	TokenNameIdentifier	 Bit Set
FOLLOW_K_PRIMARY_in_createCfamColumns2037	TokenNameIdentifier	 FOLLOW  K  PRIMARY in create Cfam Columns2037
=	TokenNameEQUAL	
new	TokenNamenew	
BitSet	TokenNameIdentifier	 Bit Set
(	TokenNameLPAREN	
new	TokenNamenew	
long	TokenNamelong	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
0x0000004000000000L	TokenNameLongLiteral	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
BitSet	TokenNameIdentifier	 Bit Set
FOLLOW_K_KEY_in_createCfamColumns2039	TokenNameIdentifier	 FOLLOW  K  KEY in create Cfam Columns2039
=	TokenNameEQUAL	
new	TokenNamenew	
BitSet	TokenNameIdentifier	 Bit Set
(	TokenNameLPAREN	
new	TokenNamenew	
long	TokenNamelong	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
0x0000000000000002L	TokenNameLongLiteral	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
BitSet	TokenNameIdentifier	 Bit Set
FOLLOW_comparatorType_in_createCfamColumnValidator2062	TokenNameIdentifier	 FOLLOW comparator Type in create Cfam Column Validator2062
=	TokenNameEQUAL	
new	TokenNamenew	
BitSet	TokenNameIdentifier	 Bit Set
(	TokenNameLPAREN	
new	TokenNamenew	
long	TokenNamelong	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
0x0000000000000002L	TokenNameLongLiteral	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
BitSet	TokenNameIdentifier	 Bit Set
FOLLOW_STRING_LITERAL_in_createCfamColumnValidator2072	TokenNameIdentifier	 FOLLOW  STRING  LITERAL in create Cfam Column Validator2072
=	TokenNameEQUAL	
new	TokenNamenew	
BitSet	TokenNameIdentifier	 Bit Set
(	TokenNameLPAREN	
new	TokenNamenew	
long	TokenNamelong	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
0x0000000000000002L	TokenNameLongLiteral	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
BitSet	TokenNameIdentifier	 Bit Set
FOLLOW_comparatorType_in_createCfamKeywordArgument2095	TokenNameIdentifier	 FOLLOW comparator Type in create Cfam Keyword Argument2095
=	TokenNameEQUAL	
new	TokenNamenew	
BitSet	TokenNameIdentifier	 Bit Set
(	TokenNameLPAREN	
new	TokenNamenew	
long	TokenNamelong	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
0x0000000000000002L	TokenNameLongLiteral	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
BitSet	TokenNameIdentifier	 Bit Set
FOLLOW_set_in_createCfamKeywordArgument2107	TokenNameIdentifier	 FOLLOW set in create Cfam Keyword Argument2107
=	TokenNameEQUAL	
new	TokenNamenew	
BitSet	TokenNameIdentifier	 Bit Set
(	TokenNameLPAREN	
new	TokenNamenew	
long	TokenNamelong	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
0x0000000000000002L	TokenNameLongLiteral	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
BitSet	TokenNameIdentifier	 Bit Set
FOLLOW_K_CREATE_in_createIndexStatement2148	TokenNameIdentifier	 FOLLOW  K  CREATE in create Index Statement2148
=	TokenNameEQUAL	
new	TokenNamenew	
BitSet	TokenNameIdentifier	 Bit Set
(	TokenNameLPAREN	
new	TokenNamenew	
long	TokenNamelong	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
0x0000010000000000L	TokenNameLongLiteral	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
BitSet	TokenNameIdentifier	 Bit Set
FOLLOW_K_INDEX_in_createIndexStatement2150	TokenNameIdentifier	 FOLLOW  K  INDEX in create Index Statement2150
=	TokenNameEQUAL	
new	TokenNamenew	
BitSet	TokenNameIdentifier	 Bit Set
(	TokenNameLPAREN	
new	TokenNamenew	
long	TokenNamelong	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
0x0000020000000020L	TokenNameLongLiteral	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
BitSet	TokenNameIdentifier	 Bit Set
FOLLOW_IDENT_in_createIndexStatement2155	TokenNameIdentifier	 FOLLOW  IDENT in create Index Statement2155
=	TokenNameEQUAL	
new	TokenNamenew	
BitSet	TokenNameIdentifier	 Bit Set
(	TokenNameLPAREN	
new	TokenNamenew	
long	TokenNamelong	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
0x0000020000000000L	TokenNameLongLiteral	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
BitSet	TokenNameIdentifier	 Bit Set
FOLLOW_K_ON_in_createIndexStatement2159	TokenNameIdentifier	 FOLLOW  K  ON in create Index Statement2159
=	TokenNameEQUAL	
new	TokenNamenew	
BitSet	TokenNameIdentifier	 Bit Set
(	TokenNameLPAREN	
new	TokenNamenew	
long	TokenNamelong	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
0x00000000000000E0L	TokenNameLongLiteral	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
BitSet	TokenNameIdentifier	 Bit Set
FOLLOW_set_in_createIndexStatement2163	TokenNameIdentifier	 FOLLOW set in create Index Statement2163
=	TokenNameEQUAL	
new	TokenNamenew	
BitSet	TokenNameIdentifier	 Bit Set
(	TokenNameLPAREN	
new	TokenNamenew	
long	TokenNamelong	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
0x0000000000000000L	TokenNameLongLiteral	
,	TokenNameCOMMA	
0x0000000000020000L	TokenNameLongLiteral	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
BitSet	TokenNameIdentifier	 Bit Set
FOLLOW_81_in_createIndexStatement2177	TokenNameIdentifier	 FOLLOW 81 in create Index Statement2177
=	TokenNameEQUAL	
new	TokenNamenew	
BitSet	TokenNameIdentifier	 Bit Set
(	TokenNameLPAREN	
new	TokenNamenew	
long	TokenNamelong	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
0x0000C0C0000000E0L	TokenNameLongLiteral	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
BitSet	TokenNameIdentifier	 Bit Set
FOLLOW_term_in_createIndexStatement2181	TokenNameIdentifier	 FOLLOW term in create Index Statement2181
=	TokenNameEQUAL	
new	TokenNamenew	
BitSet	TokenNameIdentifier	 Bit Set
(	TokenNameLPAREN	
new	TokenNamenew	
long	TokenNamelong	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
0x0000000000000000L	TokenNameLongLiteral	
,	TokenNameCOMMA	
0x0000000000040000L	TokenNameLongLiteral	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
BitSet	TokenNameIdentifier	 Bit Set
FOLLOW_82_in_createIndexStatement2183	TokenNameIdentifier	 FOLLOW 82 in create Index Statement2183
=	TokenNameEQUAL	
new	TokenNamenew	
BitSet	TokenNameIdentifier	 Bit Set
(	TokenNameLPAREN	
new	TokenNamenew	
long	TokenNamelong	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
0x0000000000000000L	TokenNameLongLiteral	
,	TokenNameCOMMA	
0x0000000000400000L	TokenNameLongLiteral	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
BitSet	TokenNameIdentifier	 Bit Set
FOLLOW_endStmnt_in_createIndexStatement2185	TokenNameIdentifier	 FOLLOW end Stmnt in create Index Statement2185
=	TokenNameEQUAL	
new	TokenNamenew	
BitSet	TokenNameIdentifier	 Bit Set
(	TokenNameLPAREN	
new	TokenNamenew	
long	TokenNamelong	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
0x0000000000000002L	TokenNameLongLiteral	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
BitSet	TokenNameIdentifier	 Bit Set
FOLLOW_K_DROP_in_dropIndexStatement2221	TokenNameIdentifier	 FOLLOW  K  DROP in drop Index Statement2221
=	TokenNameEQUAL	
new	TokenNamenew	
BitSet	TokenNameIdentifier	 Bit Set
(	TokenNameLPAREN	
new	TokenNamenew	
long	TokenNamelong	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
0x0000010000000000L	TokenNameLongLiteral	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
BitSet	TokenNameIdentifier	 Bit Set
FOLLOW_K_INDEX_in_dropIndexStatement2223	TokenNameIdentifier	 FOLLOW  K  INDEX in drop Index Statement2223
=	TokenNameEQUAL	
new	TokenNamenew	
BitSet	TokenNameIdentifier	 Bit Set
(	TokenNameLPAREN	
new	TokenNamenew	
long	TokenNamelong	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
0x00000000000000E0L	TokenNameLongLiteral	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
BitSet	TokenNameIdentifier	 Bit Set
FOLLOW_set_in_dropIndexStatement2227	TokenNameIdentifier	 FOLLOW set in drop Index Statement2227
=	TokenNameEQUAL	
new	TokenNamenew	
BitSet	TokenNameIdentifier	 Bit Set
(	TokenNameLPAREN	
new	TokenNamenew	
long	TokenNamelong	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
0x0000000000000000L	TokenNameLongLiteral	
,	TokenNameCOMMA	
0x0000000000400000L	TokenNameLongLiteral	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
BitSet	TokenNameIdentifier	 Bit Set
FOLLOW_endStmnt_in_dropIndexStatement2241	TokenNameIdentifier	 FOLLOW end Stmnt in drop Index Statement2241
=	TokenNameEQUAL	
new	TokenNamenew	
BitSet	TokenNameIdentifier	 Bit Set
(	TokenNameLPAREN	
new	TokenNamenew	
long	TokenNamelong	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
0x0000000000000002L	TokenNameLongLiteral	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
BitSet	TokenNameIdentifier	 Bit Set
FOLLOW_K_DROP_in_dropKeyspaceStatement2272	TokenNameIdentifier	 FOLLOW  K  DROP in drop Keyspace Statement2272
=	TokenNameEQUAL	
new	TokenNamenew	
BitSet	TokenNameIdentifier	 Bit Set
(	TokenNameLPAREN	
new	TokenNamenew	
long	TokenNamelong	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
0x0000000200000000L	TokenNameLongLiteral	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
BitSet	TokenNameIdentifier	 Bit Set
FOLLOW_K_KEYSPACE_in_dropKeyspaceStatement2274	TokenNameIdentifier	 FOLLOW  K  KEYSPACE in drop Keyspace Statement2274
=	TokenNameEQUAL	
new	TokenNamenew	
BitSet	TokenNameIdentifier	 Bit Set
(	TokenNameLPAREN	
new	TokenNamenew	
long	TokenNamelong	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
0x00000000000000E0L	TokenNameLongLiteral	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
BitSet	TokenNameIdentifier	 Bit Set
FOLLOW_set_in_dropKeyspaceStatement2278	TokenNameIdentifier	 FOLLOW set in drop Keyspace Statement2278
=	TokenNameEQUAL	
new	TokenNamenew	
BitSet	TokenNameIdentifier	 Bit Set
(	TokenNameLPAREN	
new	TokenNamenew	
long	TokenNamelong	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
0x0000000000000000L	TokenNameLongLiteral	
,	TokenNameCOMMA	
0x0000000000400000L	TokenNameLongLiteral	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
BitSet	TokenNameIdentifier	 Bit Set
FOLLOW_endStmnt_in_dropKeyspaceStatement2292	TokenNameIdentifier	 FOLLOW end Stmnt in drop Keyspace Statement2292
=	TokenNameEQUAL	
new	TokenNamenew	
BitSet	TokenNameIdentifier	 Bit Set
(	TokenNameLPAREN	
new	TokenNamenew	
long	TokenNamelong	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
0x0000000000000002L	TokenNameLongLiteral	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
BitSet	TokenNameIdentifier	 Bit Set
FOLLOW_K_ALTER_in_alterTableStatement2326	TokenNameIdentifier	 FOLLOW  K  ALTER in alter Table Statement2326
=	TokenNameEQUAL	
new	TokenNamenew	
BitSet	TokenNameIdentifier	 Bit Set
(	TokenNameLPAREN	
new	TokenNamenew	
long	TokenNamelong	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
0x0000001000000000L	TokenNameLongLiteral	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
BitSet	TokenNameIdentifier	 Bit Set
FOLLOW_K_COLUMNFAMILY_in_alterTableStatement2328	TokenNameIdentifier	 FOLLOW  K  COLUMNFAMILY in alter Table Statement2328
=	TokenNameEQUAL	
new	TokenNamenew	
BitSet	TokenNameIdentifier	 Bit Set
(	TokenNameLPAREN	
new	TokenNamenew	
long	TokenNamelong	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
0x00000000000000E0L	TokenNameLongLiteral	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
BitSet	TokenNameIdentifier	 Bit Set
FOLLOW_set_in_alterTableStatement2332	TokenNameIdentifier	 FOLLOW set in alter Table Statement2332
=	TokenNameEQUAL	
new	TokenNamenew	
BitSet	TokenNameIdentifier	 Bit Set
(	TokenNameLPAREN	
new	TokenNamenew	
long	TokenNamelong	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
0x00002C0400000000L	TokenNameLongLiteral	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
BitSet	TokenNameIdentifier	 Bit Set
FOLLOW_K_ALTER_in_alterTableStatement2360	TokenNameIdentifier	 FOLLOW  K  ALTER in alter Table Statement2360
=	TokenNameEQUAL	
new	TokenNamenew	
BitSet	TokenNameIdentifier	 Bit Set
(	TokenNameLPAREN	
new	TokenNamenew	
long	TokenNamelong	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
0x00000000000000E0L	TokenNameLongLiteral	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
BitSet	TokenNameIdentifier	 Bit Set
FOLLOW_set_in_alterTableStatement2382	TokenNameIdentifier	 FOLLOW set in alter Table Statement2382
=	TokenNameEQUAL	
new	TokenNamenew	
BitSet	TokenNameIdentifier	 Bit Set
(	TokenNameLPAREN	
new	TokenNamenew	
long	TokenNamelong	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
0x0000100000000000L	TokenNameLongLiteral	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
BitSet	TokenNameIdentifier	 Bit Set
FOLLOW_K_TYPE_in_alterTableStatement2414	TokenNameIdentifier	 FOLLOW  K  TYPE in alter Table Statement2414
=	TokenNameEQUAL	
new	TokenNamenew	
BitSet	TokenNameIdentifier	 Bit Set
(	TokenNameLPAREN	
new	TokenNamenew	
long	TokenNamelong	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
0x0000000000000000L	TokenNameLongLiteral	
,	TokenNameCOMMA	
0x0000003FFF000000L	TokenNameLongLiteral	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
BitSet	TokenNameIdentifier	 Bit Set
FOLLOW_comparatorType_in_alterTableStatement2418	TokenNameIdentifier	 FOLLOW comparator Type in alter Table Statement2418
=	TokenNameEQUAL	
new	TokenNamenew	
BitSet	TokenNameIdentifier	 Bit Set
(	TokenNameLPAREN	
new	TokenNamenew	
long	TokenNamelong	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
0x0000000000000000L	TokenNameLongLiteral	
,	TokenNameCOMMA	
0x0000000000400000L	TokenNameLongLiteral	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
BitSet	TokenNameIdentifier	 Bit Set
FOLLOW_K_ADD_in_alterTableStatement2434	TokenNameIdentifier	 FOLLOW  K  ADD in alter Table Statement2434
=	TokenNameEQUAL	
new	TokenNamenew	
BitSet	TokenNameIdentifier	 Bit Set
(	TokenNameLPAREN	
new	TokenNamenew	
long	TokenNamelong	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
0x00000000000000E0L	TokenNameLongLiteral	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
BitSet	TokenNameIdentifier	 Bit Set
FOLLOW_set_in_alterTableStatement2456	TokenNameIdentifier	 FOLLOW set in alter Table Statement2456
=	TokenNameEQUAL	
new	TokenNamenew	
BitSet	TokenNameIdentifier	 Bit Set
(	TokenNameLPAREN	
new	TokenNamenew	
long	TokenNamelong	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
0x0000000000000000L	TokenNameLongLiteral	
,	TokenNameCOMMA	
0x0000003FFF000000L	TokenNameLongLiteral	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
BitSet	TokenNameIdentifier	 Bit Set
FOLLOW_comparatorType_in_alterTableStatement2490	TokenNameIdentifier	 FOLLOW comparator Type in alter Table Statement2490
=	TokenNameEQUAL	
new	TokenNamenew	
BitSet	TokenNameIdentifier	 Bit Set
(	TokenNameLPAREN	
new	TokenNamenew	
long	TokenNamelong	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
0x0000000000000000L	TokenNameLongLiteral	
,	TokenNameCOMMA	
0x0000000000400000L	TokenNameLongLiteral	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
BitSet	TokenNameIdentifier	 Bit Set
FOLLOW_K_DROP_in_alterTableStatement2506	TokenNameIdentifier	 FOLLOW  K  DROP in alter Table Statement2506
=	TokenNameEQUAL	
new	TokenNamenew	
BitSet	TokenNameIdentifier	 Bit Set
(	TokenNameLPAREN	
new	TokenNamenew	
long	TokenNamelong	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
0x00000000000000E0L	TokenNameLongLiteral	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
BitSet	TokenNameIdentifier	 Bit Set
FOLLOW_set_in_alterTableStatement2528	TokenNameIdentifier	 FOLLOW set in alter Table Statement2528
=	TokenNameEQUAL	
new	TokenNamenew	
BitSet	TokenNameIdentifier	 Bit Set
(	TokenNameLPAREN	
new	TokenNamenew	
long	TokenNamelong	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
0x0000000000000000L	TokenNameLongLiteral	
,	TokenNameCOMMA	
0x0000000000400000L	TokenNameLongLiteral	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
BitSet	TokenNameIdentifier	 Bit Set
FOLLOW_K_WITH_in_alterTableStatement2557	TokenNameIdentifier	 FOLLOW  K  WITH in alter Table Statement2557
=	TokenNameEQUAL	
new	TokenNamenew	
BitSet	TokenNameIdentifier	 Bit Set
(	TokenNameLPAREN	
new	TokenNamenew	
long	TokenNamelong	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
0x0000000800000020L	TokenNameLongLiteral	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
BitSet	TokenNameIdentifier	 Bit Set
FOLLOW_set_in_alterTableStatement2578	TokenNameIdentifier	 FOLLOW set in alter Table Statement2578
=	TokenNameEQUAL	
new	TokenNamenew	
BitSet	TokenNameIdentifier	 Bit Set
(	TokenNameLPAREN	
new	TokenNamenew	
long	TokenNamelong	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
0x0000000000000000L	TokenNameLongLiteral	
,	TokenNameCOMMA	
0x0000000000800000L	TokenNameLongLiteral	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
BitSet	TokenNameIdentifier	 Bit Set
FOLLOW_87_in_alterTableStatement2586	TokenNameIdentifier	 FOLLOW 87 in alter Table Statement2586
=	TokenNameEQUAL	
new	TokenNamenew	
BitSet	TokenNameIdentifier	 Bit Set
(	TokenNameLPAREN	
new	TokenNamenew	
long	TokenNamelong	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
0x00000080000000E0L	TokenNameLongLiteral	
,	TokenNameCOMMA	
0x0000003FFF000000L	TokenNameLongLiteral	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
BitSet	TokenNameIdentifier	 Bit Set
FOLLOW_createCfamKeywordArgument_in_alterTableStatement2590	TokenNameIdentifier	 FOLLOW create Cfam Keyword Argument in alter Table Statement2590
=	TokenNameEQUAL	
new	TokenNamenew	
BitSet	TokenNameIdentifier	 Bit Set
(	TokenNameLPAREN	
new	TokenNamenew	
long	TokenNamelong	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
0x0000000000080000L	TokenNameLongLiteral	
,	TokenNameCOMMA	
0x0000000000400000L	TokenNameLongLiteral	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
BitSet	TokenNameIdentifier	 Bit Set
FOLLOW_K_AND_in_alterTableStatement2611	TokenNameIdentifier	 FOLLOW  K  AND in alter Table Statement2611
=	TokenNameEQUAL	
new	TokenNamenew	
BitSet	TokenNameIdentifier	 Bit Set
(	TokenNameLPAREN	
new	TokenNamenew	
long	TokenNamelong	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
0x0000000800000020L	TokenNameLongLiteral	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
BitSet	TokenNameIdentifier	 Bit Set
FOLLOW_set_in_alterTableStatement2615	TokenNameIdentifier	 FOLLOW set in alter Table Statement2615
=	TokenNameEQUAL	
new	TokenNamenew	
BitSet	TokenNameIdentifier	 Bit Set
(	TokenNameLPAREN	
new	TokenNamenew	
long	TokenNamelong	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
0x0000000000000000L	TokenNameLongLiteral	
,	TokenNameCOMMA	
0x0000000000800000L	TokenNameLongLiteral	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
BitSet	TokenNameIdentifier	 Bit Set
FOLLOW_87_in_alterTableStatement2623	TokenNameIdentifier	 FOLLOW 87 in alter Table Statement2623
=	TokenNameEQUAL	
new	TokenNamenew	
BitSet	TokenNameIdentifier	 Bit Set
(	TokenNameLPAREN	
new	TokenNamenew	
long	TokenNamelong	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
0x00000080000000E0L	TokenNameLongLiteral	
,	TokenNameCOMMA	
0x0000003FFF000000L	TokenNameLongLiteral	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
BitSet	TokenNameIdentifier	 Bit Set
FOLLOW_createCfamKeywordArgument_in_alterTableStatement2627	TokenNameIdentifier	 FOLLOW create Cfam Keyword Argument in alter Table Statement2627
=	TokenNameEQUAL	
new	TokenNamenew	
BitSet	TokenNameIdentifier	 Bit Set
(	TokenNameLPAREN	
new	TokenNamenew	
long	TokenNamelong	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
0x0000000000080000L	TokenNameLongLiteral	
,	TokenNameCOMMA	
0x0000000000400000L	TokenNameLongLiteral	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
BitSet	TokenNameIdentifier	 Bit Set
FOLLOW_endStmnt_in_alterTableStatement2640	TokenNameIdentifier	 FOLLOW end Stmnt in alter Table Statement2640
=	TokenNameEQUAL	
new	TokenNamenew	
BitSet	TokenNameIdentifier	 Bit Set
(	TokenNameLPAREN	
new	TokenNamenew	
long	TokenNamelong	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
0x0000000000000002L	TokenNameLongLiteral	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
BitSet	TokenNameIdentifier	 Bit Set
FOLLOW_K_DROP_in_dropColumnFamilyStatement2671	TokenNameIdentifier	 FOLLOW  K  DROP in drop Column Family Statement2671
=	TokenNameEQUAL	
new	TokenNamenew	
BitSet	TokenNameIdentifier	 Bit Set
(	TokenNameLPAREN	
new	TokenNamenew	
long	TokenNamelong	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
0x0000001000000000L	TokenNameLongLiteral	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
BitSet	TokenNameIdentifier	 Bit Set
FOLLOW_K_COLUMNFAMILY_in_dropColumnFamilyStatement2673	TokenNameIdentifier	 FOLLOW  K  COLUMNFAMILY in drop Column Family Statement2673
=	TokenNameEQUAL	
new	TokenNamenew	
BitSet	TokenNameIdentifier	 Bit Set
(	TokenNameLPAREN	
new	TokenNamenew	
long	TokenNamelong	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
0x00000000000000E0L	TokenNameLongLiteral	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
BitSet	TokenNameIdentifier	 Bit Set
FOLLOW_set_in_dropColumnFamilyStatement2677	TokenNameIdentifier	 FOLLOW set in drop Column Family Statement2677
=	TokenNameEQUAL	
new	TokenNamenew	
BitSet	TokenNameIdentifier	 Bit Set
(	TokenNameLPAREN	
new	TokenNamenew	
long	TokenNamelong	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
0x0000000000000000L	TokenNameLongLiteral	
,	TokenNameCOMMA	
0x0000000000400000L	TokenNameLongLiteral	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
BitSet	TokenNameIdentifier	 Bit Set
FOLLOW_endStmnt_in_dropColumnFamilyStatement2691	TokenNameIdentifier	 FOLLOW end Stmnt in drop Column Family Statement2691
=	TokenNameEQUAL	
new	TokenNamenew	
BitSet	TokenNameIdentifier	 Bit Set
(	TokenNameLPAREN	
new	TokenNamenew	
long	TokenNamelong	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
0x0000000000000002L	TokenNameLongLiteral	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
BitSet	TokenNameIdentifier	 Bit Set
FOLLOW_set_in_comparatorType0	TokenNameIdentifier	 FOLLOW set in comparator Type0
=	TokenNameEQUAL	
new	TokenNamenew	
BitSet	TokenNameIdentifier	 Bit Set
(	TokenNameLPAREN	
new	TokenNamenew	
long	TokenNamelong	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
0x0000000000000002L	TokenNameLongLiteral	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
BitSet	TokenNameIdentifier	 Bit Set
FOLLOW_K_KEY_in_term2788	TokenNameIdentifier	 FOLLOW  K  KEY in term2788
=	TokenNameEQUAL	
new	TokenNamenew	
BitSet	TokenNameIdentifier	 Bit Set
(	TokenNameLPAREN	
new	TokenNamenew	
long	TokenNamelong	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
0x0000000000000002L	TokenNameLongLiteral	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
BitSet	TokenNameIdentifier	 Bit Set
FOLLOW_STRING_LITERAL_in_term2794	TokenNameIdentifier	 FOLLOW  STRING  LITERAL in term2794
=	TokenNameEQUAL	
new	TokenNamenew	
BitSet	TokenNameIdentifier	 Bit Set
(	TokenNameLPAREN	
new	TokenNamenew	
long	TokenNamelong	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
0x0000000000000002L	TokenNameLongLiteral	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
BitSet	TokenNameIdentifier	 Bit Set
FOLLOW_INTEGER_in_term2800	TokenNameIdentifier	 FOLLOW  INTEGER in term2800
=	TokenNameEQUAL	
new	TokenNamenew	
BitSet	TokenNameIdentifier	 Bit Set
(	TokenNameLPAREN	
new	TokenNamenew	
long	TokenNamelong	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
0x0000000000000002L	TokenNameLongLiteral	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
BitSet	TokenNameIdentifier	 Bit Set
FOLLOW_UUID_in_term2806	TokenNameIdentifier	 FOLLOW  UUID in term2806
=	TokenNameEQUAL	
new	TokenNamenew	
BitSet	TokenNameIdentifier	 Bit Set
(	TokenNameLPAREN	
new	TokenNamenew	
long	TokenNamelong	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
0x0000000000000002L	TokenNameLongLiteral	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
BitSet	TokenNameIdentifier	 Bit Set
FOLLOW_IDENT_in_term2812	TokenNameIdentifier	 FOLLOW  IDENT in term2812
=	TokenNameEQUAL	
new	TokenNamenew	
BitSet	TokenNameIdentifier	 Bit Set
(	TokenNameLPAREN	
new	TokenNamenew	
long	TokenNamelong	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
0x0000000000000002L	TokenNameLongLiteral	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
BitSet	TokenNameIdentifier	 Bit Set
FOLLOW_FLOAT_in_term2818	TokenNameIdentifier	 FOLLOW  FLOAT in term2818
=	TokenNameEQUAL	
new	TokenNamenew	
BitSet	TokenNameIdentifier	 Bit Set
(	TokenNameLPAREN	
new	TokenNamenew	
long	TokenNamelong	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
0x0000000000000002L	TokenNameLongLiteral	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
BitSet	TokenNameIdentifier	 Bit Set
FOLLOW_QMARK_in_term2835	TokenNameIdentifier	 FOLLOW  QMARK in term2835
=	TokenNameEQUAL	
new	TokenNamenew	
BitSet	TokenNameIdentifier	 Bit Set
(	TokenNameLPAREN	
new	TokenNamenew	
long	TokenNamelong	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
0x0000000000000002L	TokenNameLongLiteral	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
BitSet	TokenNameIdentifier	 Bit Set
FOLLOW_term_in_termList2876	TokenNameIdentifier	 FOLLOW term in term List2876
=	TokenNameEQUAL	
new	TokenNamenew	
BitSet	TokenNameIdentifier	 Bit Set
(	TokenNameLPAREN	
new	TokenNamenew	
long	TokenNamelong	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
0x0000000000000002L	TokenNameLongLiteral	
,	TokenNameCOMMA	
0x0000000000100000L	TokenNameLongLiteral	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
BitSet	TokenNameIdentifier	 Bit Set
FOLLOW_84_in_termList2881	TokenNameIdentifier	 FOLLOW 84 in term List2881
=	TokenNameEQUAL	
new	TokenNamenew	
BitSet	TokenNameIdentifier	 Bit Set
(	TokenNameLPAREN	
new	TokenNamenew	
long	TokenNamelong	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
0x0000C0C0000000E0L	TokenNameLongLiteral	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
BitSet	TokenNameIdentifier	 Bit Set
FOLLOW_term_in_termList2885	TokenNameIdentifier	 FOLLOW term in term List2885
=	TokenNameEQUAL	
new	TokenNamenew	
BitSet	TokenNameIdentifier	 Bit Set
(	TokenNameLPAREN	
new	TokenNamenew	
long	TokenNamelong	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
0x0000000000000002L	TokenNameLongLiteral	
,	TokenNameCOMMA	
0x0000000000100000L	TokenNameLongLiteral	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
BitSet	TokenNameIdentifier	 Bit Set
FOLLOW_term_in_termPair2912	TokenNameIdentifier	 FOLLOW term in term Pair2912
=	TokenNameEQUAL	
new	TokenNamenew	
BitSet	TokenNameIdentifier	 Bit Set
(	TokenNameLPAREN	
new	TokenNamenew	
long	TokenNamelong	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
0x0000000000000000L	TokenNameLongLiteral	
,	TokenNameCOMMA	
0x0000000000800000L	TokenNameLongLiteral	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
BitSet	TokenNameIdentifier	 Bit Set
FOLLOW_87_in_termPair2914	TokenNameIdentifier	 FOLLOW 87 in term Pair2914
=	TokenNameEQUAL	
new	TokenNamenew	
BitSet	TokenNameIdentifier	 Bit Set
(	TokenNameLPAREN	
new	TokenNamenew	
long	TokenNamelong	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
0x0000C0C0000000E0L	TokenNameLongLiteral	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
BitSet	TokenNameIdentifier	 Bit Set
FOLLOW_term_in_termPair2918	TokenNameIdentifier	 FOLLOW term in term Pair2918
=	TokenNameEQUAL	
new	TokenNamenew	
BitSet	TokenNameIdentifier	 Bit Set
(	TokenNameLPAREN	
new	TokenNamenew	
long	TokenNamelong	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
0x0000000000000002L	TokenNameLongLiteral	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
BitSet	TokenNameIdentifier	 Bit Set
FOLLOW_INTEGER_in_intTerm2943	TokenNameIdentifier	 FOLLOW  INTEGER in int Term2943
=	TokenNameEQUAL	
new	TokenNamenew	
BitSet	TokenNameIdentifier	 Bit Set
(	TokenNameLPAREN	
new	TokenNamenew	
long	TokenNamelong	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
0x0000000000000002L	TokenNameLongLiteral	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
BitSet	TokenNameIdentifier	 Bit Set
FOLLOW_term_in_termPairWithOperation2965	TokenNameIdentifier	 FOLLOW term in term Pair With Operation2965
=	TokenNameEQUAL	
new	TokenNamenew	
BitSet	TokenNameIdentifier	 Bit Set
(	TokenNameLPAREN	
new	TokenNamenew	
long	TokenNamelong	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
0x0000000000000000L	TokenNameLongLiteral	
,	TokenNameCOMMA	
0x0000000000800000L	TokenNameLongLiteral	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
BitSet	TokenNameIdentifier	 Bit Set
FOLLOW_87_in_termPairWithOperation2967	TokenNameIdentifier	 FOLLOW 87 in term Pair With Operation2967
=	TokenNameEQUAL	
new	TokenNamenew	
BitSet	TokenNameIdentifier	 Bit Set
(	TokenNameLPAREN	
new	TokenNamenew	
long	TokenNamelong	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
0x0000C0C0000000E0L	TokenNameLongLiteral	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
BitSet	TokenNameIdentifier	 Bit Set
FOLLOW_term_in_termPairWithOperation2972	TokenNameIdentifier	 FOLLOW term in term Pair With Operation2972
=	TokenNameEQUAL	
new	TokenNamenew	
BitSet	TokenNameIdentifier	 Bit Set
(	TokenNameLPAREN	
new	TokenNamenew	
long	TokenNamelong	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
0x0000000000000002L	TokenNameLongLiteral	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
BitSet	TokenNameIdentifier	 Bit Set
FOLLOW_term_in_termPairWithOperation2997	TokenNameIdentifier	 FOLLOW term in term Pair With Operation2997
=	TokenNameEQUAL	
new	TokenNamenew	
BitSet	TokenNameIdentifier	 Bit Set
(	TokenNameLPAREN	
new	TokenNamenew	
long	TokenNamelong	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
0x0000000000000040L	TokenNameLongLiteral	
,	TokenNameCOMMA	
0x000000C000000000L	TokenNameLongLiteral	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
BitSet	TokenNameIdentifier	 Bit Set
FOLLOW_102_in_termPairWithOperation3001	TokenNameIdentifier	 FOLLOW 102 in term Pair With Operation3001
=	TokenNameEQUAL	
new	TokenNamenew	
BitSet	TokenNameIdentifier	 Bit Set
(	TokenNameLPAREN	
new	TokenNamenew	
long	TokenNamelong	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
0x0000C0C0000000E0L	TokenNameLongLiteral	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
BitSet	TokenNameIdentifier	 Bit Set
FOLLOW_term_in_termPairWithOperation3006	TokenNameIdentifier	 FOLLOW term in term Pair With Operation3006
=	TokenNameEQUAL	
new	TokenNamenew	
BitSet	TokenNameIdentifier	 Bit Set
(	TokenNameLPAREN	
new	TokenNamenew	
long	TokenNamelong	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
0x0000000000000002L	TokenNameLongLiteral	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
BitSet	TokenNameIdentifier	 Bit Set
FOLLOW_103_in_termPairWithOperation3042	TokenNameIdentifier	 FOLLOW 103 in term Pair With Operation3042
=	TokenNameEQUAL	
new	TokenNamenew	
BitSet	TokenNameIdentifier	 Bit Set
(	TokenNameLPAREN	
new	TokenNamenew	
long	TokenNamelong	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
0x0000000000000040L	TokenNameLongLiteral	
,	TokenNameCOMMA	
0x000000C000000000L	TokenNameLongLiteral	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
BitSet	TokenNameIdentifier	 Bit Set
FOLLOW_intTerm_in_termPairWithOperation3047	TokenNameIdentifier	 FOLLOW int Term in term Pair With Operation3047
=	TokenNameEQUAL	
new	TokenNamenew	
BitSet	TokenNameIdentifier	 Bit Set
(	TokenNameLPAREN	
new	TokenNamenew	
long	TokenNamelong	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
0x0000000000000002L	TokenNameLongLiteral	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
BitSet	TokenNameIdentifier	 Bit Set
FOLLOW_term_in_relation3110	TokenNameIdentifier	 FOLLOW term in relation3110
=	TokenNameEQUAL	
new	TokenNamenew	
BitSet	TokenNameIdentifier	 Bit Set
(	TokenNameLPAREN	
new	TokenNamenew	
long	TokenNamelong	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
0x0000000000000000L	TokenNameLongLiteral	
,	TokenNameCOMMA	
0x00000F0000800000L	TokenNameLongLiteral	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
BitSet	TokenNameIdentifier	 Bit Set
FOLLOW_set_in_relation3114	TokenNameIdentifier	 FOLLOW set in relation3114
=	TokenNameEQUAL	
new	TokenNamenew	
BitSet	TokenNameIdentifier	 Bit Set
(	TokenNameLPAREN	
new	TokenNamenew	
long	TokenNamelong	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
0x0000C0C0000000E0L	TokenNameLongLiteral	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
BitSet	TokenNameIdentifier	 Bit Set
FOLLOW_term_in_relation3136	TokenNameIdentifier	 FOLLOW term in relation3136
=	TokenNameEQUAL	
new	TokenNamenew	
BitSet	TokenNameIdentifier	 Bit Set
(	TokenNameLPAREN	
new	TokenNamenew	
long	TokenNamelong	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
0x0000000000000002L	TokenNameLongLiteral	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
BitSet	TokenNameIdentifier	 Bit Set
FOLLOW_K_TRUNCATE_in_truncateStatement3166	TokenNameIdentifier	 FOLLOW  K  TRUNCATE in truncate Statement3166
=	TokenNameEQUAL	
new	TokenNamenew	
BitSet	TokenNameIdentifier	 Bit Set
(	TokenNameLPAREN	
new	TokenNamenew	
long	TokenNamelong	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
0x00000000000000E0L	TokenNameLongLiteral	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
BitSet	TokenNameIdentifier	 Bit Set
FOLLOW_set_in_truncateStatement3171	TokenNameIdentifier	 FOLLOW set in truncate Statement3171
=	TokenNameEQUAL	
new	TokenNamenew	
BitSet	TokenNameIdentifier	 Bit Set
(	TokenNameLPAREN	
new	TokenNamenew	
long	TokenNamelong	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
0x0000000000000000L	TokenNameLongLiteral	
,	TokenNameCOMMA	
0x0000000000080000L	TokenNameLongLiteral	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
BitSet	TokenNameIdentifier	 Bit Set
FOLLOW_83_in_truncateStatement3185	TokenNameIdentifier	 FOLLOW 83 in truncate Statement3185
=	TokenNameEQUAL	
new	TokenNamenew	
BitSet	TokenNameIdentifier	 Bit Set
(	TokenNameLPAREN	
new	TokenNamenew	
long	TokenNamelong	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
0x00000000000000E0L	TokenNameLongLiteral	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
BitSet	TokenNameIdentifier	 Bit Set
FOLLOW_set_in_truncateStatement3191	TokenNameIdentifier	 FOLLOW set in truncate Statement3191
=	TokenNameEQUAL	
new	TokenNamenew	
BitSet	TokenNameIdentifier	 Bit Set
(	TokenNameLPAREN	
new	TokenNamenew	
long	TokenNamelong	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
0x0000000000000000L	TokenNameLongLiteral	
,	TokenNameCOMMA	
0x0000000000400000L	TokenNameLongLiteral	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
BitSet	TokenNameIdentifier	 Bit Set
FOLLOW_endStmnt_in_truncateStatement3207	TokenNameIdentifier	 FOLLOW end Stmnt in truncate Statement3207
=	TokenNameEQUAL	
new	TokenNamenew	
BitSet	TokenNameIdentifier	 Bit Set
(	TokenNameLPAREN	
new	TokenNamenew	
long	TokenNamelong	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
0x0000000000000002L	TokenNameLongLiteral	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
BitSet	TokenNameIdentifier	 Bit Set
FOLLOW_86_in_endStmnt3224	TokenNameIdentifier	 FOLLOW 86 in end Stmnt3224
=	TokenNameEQUAL	
new	TokenNamenew	
BitSet	TokenNameIdentifier	 Bit Set
(	TokenNameLPAREN	
new	TokenNamenew	
long	TokenNamelong	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
0x0000000000000000L	TokenNameLongLiteral	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
BitSet	TokenNameIdentifier	 Bit Set
FOLLOW_EOF_in_endStmnt3228	TokenNameIdentifier	 FOLLOW  EOF in end Stmnt3228
=	TokenNameEQUAL	
new	TokenNamenew	
BitSet	TokenNameIdentifier	 Bit Set
(	TokenNameLPAREN	
new	TokenNamenew	
long	TokenNamelong	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
0x0000000000000002L	TokenNameLongLiteral	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
