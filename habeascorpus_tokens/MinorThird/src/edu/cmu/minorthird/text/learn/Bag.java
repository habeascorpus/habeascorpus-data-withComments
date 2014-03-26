package	TokenNamepackage	
edu	TokenNameIdentifier	 edu
.	TokenNameDOT	
cmu	TokenNameIdentifier	 cmu
.	TokenNameDOT	
minorthird	TokenNameIdentifier	 minorthird
.	TokenNameDOT	
text	TokenNameIdentifier	 text
.	TokenNameDOT	
learn	TokenNameIdentifier	 learn
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Iterator	TokenNameIdentifier	 Iterator
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Set	TokenNameIdentifier	 Set
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
SortedMap	TokenNameIdentifier	 Sorted Map
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
SortedSet	TokenNameIdentifier	 Sorted Set
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
TreeMap	TokenNameIdentifier	 Tree Map
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
TreeSet	TokenNameIdentifier	 Tree Set
;	TokenNameSEMICOLON	
/** A Bag of Objects. Also known as a Multiset. */	TokenNameCOMMENT_JAVADOC	 A Bag of Objects. Also known as a Multiset. 
class	TokenNameclass	
Bag	TokenNameIdentifier	 Bag
<	TokenNameLESS	
T	TokenNameIdentifier	 T
>	TokenNameGREATER	
{	TokenNameLBRACE	
static	TokenNamestatic	
private	TokenNameprivate	
Integer	TokenNameIdentifier	 Integer
ONE	TokenNameIdentifier	 ONE
=	TokenNameEQUAL	
new	TokenNamenew	
Integer	TokenNameIdentifier	 Integer
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
static	TokenNamestatic	
private	TokenNameprivate	
Integer	TokenNameIdentifier	 Integer
TWO	TokenNameIdentifier	 TWO
=	TokenNameEQUAL	
new	TokenNamenew	
Integer	TokenNameIdentifier	 Integer
(	TokenNameLPAREN	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
static	TokenNamestatic	
private	TokenNameprivate	
Integer	TokenNameIdentifier	 Integer
THREE	TokenNameIdentifier	 THREE
=	TokenNameEQUAL	
new	TokenNamenew	
Integer	TokenNameIdentifier	 Integer
(	TokenNameLPAREN	
3	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
SortedMap	TokenNameIdentifier	 Sorted Map
<	TokenNameLESS	
T	TokenNameIdentifier	 T
,	TokenNameCOMMA	
Integer	TokenNameIdentifier	 Integer
>	TokenNameGREATER	
map	TokenNameIdentifier	 map
=	TokenNameEQUAL	
new	TokenNamenew	
TreeMap	TokenNameIdentifier	 Tree Map
<	TokenNameLESS	
T	TokenNameIdentifier	 T
,	TokenNameCOMMA	
Integer	TokenNameIdentifier	 Integer
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
boolean	TokenNameboolean	
contains	TokenNameIdentifier	 contains
(	TokenNameLPAREN	
T	TokenNameIdentifier	 T
o	TokenNameIdentifier	 o
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
map	TokenNameIdentifier	 map
.	TokenNameDOT	
keySet	TokenNameIdentifier	 key Set
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
contains	TokenNameIdentifier	 contains
(	TokenNameLPAREN	
o	TokenNameIdentifier	 o
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Add another instance of the object. */	TokenNameCOMMENT_JAVADOC	 Add another instance of the object. 
public	TokenNamepublic	
void	TokenNamevoid	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
T	TokenNameIdentifier	 T
o	TokenNameIdentifier	 o
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Integer	TokenNameIdentifier	 Integer
count	TokenNameIdentifier	 count
=	TokenNameEQUAL	
map	TokenNameIdentifier	 map
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
o	TokenNameIdentifier	 o
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
count	TokenNameIdentifier	 count
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
map	TokenNameIdentifier	 map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
o	TokenNameIdentifier	 o
,	TokenNameCOMMA	
ONE	TokenNameIdentifier	 ONE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
count	TokenNameIdentifier	 count
==	TokenNameEQUAL_EQUAL	
ONE	TokenNameIdentifier	 ONE
)	TokenNameRPAREN	
map	TokenNameIdentifier	 map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
o	TokenNameIdentifier	 o
,	TokenNameCOMMA	
TWO	TokenNameIdentifier	 TWO
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
count	TokenNameIdentifier	 count
==	TokenNameEQUAL_EQUAL	
TWO	TokenNameIdentifier	 TWO
)	TokenNameRPAREN	
map	TokenNameIdentifier	 map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
o	TokenNameIdentifier	 o
,	TokenNameCOMMA	
THREE	TokenNameIdentifier	 THREE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
map	TokenNameIdentifier	 map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
o	TokenNameIdentifier	 o
,	TokenNameCOMMA	
new	TokenNamenew	
Integer	TokenNameIdentifier	 Integer
(	TokenNameLPAREN	
count	TokenNameIdentifier	 count
.	TokenNameDOT	
intValue	TokenNameIdentifier	 int Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Add another instance of the object. */	TokenNameCOMMENT_JAVADOC	 Add another instance of the object. 
public	TokenNamepublic	
void	TokenNamevoid	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
T	TokenNameIdentifier	 T
o	TokenNameIdentifier	 o
,	TokenNameCOMMA	
int	TokenNameint	
numCopies	TokenNameIdentifier	 num Copies
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Integer	TokenNameIdentifier	 Integer
count	TokenNameIdentifier	 count
=	TokenNameEQUAL	
map	TokenNameIdentifier	 map
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
o	TokenNameIdentifier	 o
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
count	TokenNameIdentifier	 count
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
map	TokenNameIdentifier	 map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
o	TokenNameIdentifier	 o
,	TokenNameCOMMA	
new	TokenNamenew	
Integer	TokenNameIdentifier	 Integer
(	TokenNameLPAREN	
numCopies	TokenNameIdentifier	 num Copies
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
map	TokenNameIdentifier	 map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
o	TokenNameIdentifier	 o
,	TokenNameCOMMA	
new	TokenNamenew	
Integer	TokenNameIdentifier	 Integer
(	TokenNameLPAREN	
count	TokenNameIdentifier	 count
.	TokenNameDOT	
intValue	TokenNameIdentifier	 int Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
numCopies	TokenNameIdentifier	 num Copies
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Iterator over all objects. */	TokenNameCOMMENT_JAVADOC	 Iterator over all objects. 
public	TokenNamepublic	
Iterator	TokenNameIdentifier	 Iterator
<	TokenNameLESS	
T	TokenNameIdentifier	 T
>	TokenNameGREATER	
iterator	TokenNameIdentifier	 iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
map	TokenNameIdentifier	 map
.	TokenNameDOT	
keySet	TokenNameIdentifier	 key Set
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
iterator	TokenNameIdentifier	 iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Get number of occurences of the object in the bag. */	TokenNameCOMMENT_JAVADOC	 Get number of occurences of the object in the bag. 
public	TokenNamepublic	
int	TokenNameint	
getCount	TokenNameIdentifier	 get Count
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
o	TokenNameIdentifier	 o
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Integer	TokenNameIdentifier	 Integer
count	TokenNameIdentifier	 count
=	TokenNameEQUAL	
map	TokenNameIdentifier	 map
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
o	TokenNameIdentifier	 o
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
count	TokenNameIdentifier	 count
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
return	TokenNamereturn	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
else	TokenNameelse	
return	TokenNamereturn	
count	TokenNameIdentifier	 count
.	TokenNameDOT	
intValue	TokenNameIdentifier	 int Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Convert to an ordinary set. */	TokenNameCOMMENT_JAVADOC	 Convert to an ordinary set. 
public	TokenNamepublic	
SortedSet	TokenNameIdentifier	 Sorted Set
<	TokenNameLESS	
T	TokenNameIdentifier	 T
>	TokenNameGREATER	
asSet	TokenNameIdentifier	 as Set
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Set	TokenNameIdentifier	 Set
<	TokenNameLESS	
T	TokenNameIdentifier	 T
>	TokenNameGREATER	
s	TokenNameIdentifier	 s
=	TokenNameEQUAL	
map	TokenNameIdentifier	 map
.	TokenNameDOT	
keySet	TokenNameIdentifier	 key Set
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
instanceof	TokenNameinstanceof	
TreeSet	TokenNameIdentifier	 Tree Set
)	TokenNameRPAREN	
return	TokenNamereturn	
(	TokenNameLPAREN	
TreeSet	TokenNameIdentifier	 Tree Set
<	TokenNameLESS	
T	TokenNameIdentifier	 T
>	TokenNameGREATER	
)	TokenNameRPAREN	
s	TokenNameIdentifier	 s
;	TokenNameSEMICOLON	
else	TokenNameelse	
{	TokenNameLBRACE	
SortedSet	TokenNameIdentifier	 Sorted Set
<	TokenNameLESS	
T	TokenNameIdentifier	 T
>	TokenNameGREATER	
t	TokenNameIdentifier	 t
=	TokenNameEQUAL	
new	TokenNamenew	
TreeSet	TokenNameIdentifier	 Tree Set
<	TokenNameLESS	
T	TokenNameIdentifier	 T
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
t	TokenNameIdentifier	 t
.	TokenNameDOT	
addAll	TokenNameIdentifier	 add All
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
t	TokenNameIdentifier	 t
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
String	TokenNameIdentifier	 String
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
"[Bag "	TokenNameStringLiteral	[Bag 
+	TokenNamePLUS	
map	TokenNameIdentifier	 map
+	TokenNamePLUS	
"]"	TokenNameStringLiteral	]
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
