package	TokenNamepackage	
edu	TokenNameIdentifier	 edu
.	TokenNameDOT	
cmu	TokenNameIdentifier	 cmu
.	TokenNameDOT	
minorthird	TokenNameIdentifier	 minorthird
.	TokenNameDOT	
util	TokenNameIdentifier	 util
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
lang	TokenNameIdentifier	 lang
.	TokenNameDOT	
reflect	TokenNameIdentifier	 reflect
.	TokenNameDOT	
Method	TokenNameIdentifier	 Method
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
log4j	TokenNameIdentifier	 log4j
.	TokenNameDOT	
Logger	TokenNameIdentifier	 Logger
;	TokenNameSEMICOLON	
/** * Utilities for reflection. */	TokenNameCOMMENT_JAVADOC	 Utilities for reflection. 
public	TokenNamepublic	
class	TokenNameclass	
RefUtils	TokenNameIdentifier	 Ref Utils
{	TokenNameLBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
Logger	TokenNameIdentifier	 Logger
log	TokenNameIdentifier	 log
=	TokenNameEQUAL	
Logger	TokenNameIdentifier	 Logger
.	TokenNameDOT	
getLogger	TokenNameIdentifier	 get Logger
(	TokenNameLPAREN	
RefUtils	TokenNameIdentifier	 Ref Utils
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
int	TokenNameint	
LHS	TokenNameIdentifier	 LHS
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
RHS	TokenNameIdentifier	 RHS
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
static	TokenNamestatic	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
toGetter	TokenNameIdentifier	 to Getter
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
"get"	TokenNameStringLiteral	get
+	TokenNamePLUS	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
.	TokenNameDOT	
toUpperCase	TokenNameIdentifier	 to Upper Case
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
static	TokenNamestatic	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
toSetter	TokenNameIdentifier	 to Setter
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
"set"	TokenNameStringLiteral	set
+	TokenNamePLUS	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
.	TokenNameDOT	
toUpperCase	TokenNameIdentifier	 to Upper Case
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Creates an instance of class c, initialized with the string s. * String can be something like "true", "false", "1041", "13.56", or * the name of a class (for instance * "text.learn.SequentialLearner"). */	TokenNameCOMMENT_JAVADOC	 Creates an instance of class c, initialized with the string s. String can be something like "true", "false", "1041", "13.56", or the name of a class (for instance "text.learn.SequentialLearner"). 
static	TokenNamestatic	
private	TokenNameprivate	
Object	TokenNameIdentifier	 Object
toObject	TokenNameIdentifier	 to Object
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
s	TokenNameIdentifier	 s
,	TokenNameCOMMA	
Class	TokenNameIdentifier	 Class
<	TokenNameLESS	
?	TokenNameQUESTION	
>	TokenNameGREATER	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
==	TokenNameEQUAL_EQUAL	
Boolean	TokenNameIdentifier	 Boolean
.	TokenNameDOT	
class	TokenNameclass	
||	TokenNameOR_OR	
c	TokenNameIdentifier	 c
==	TokenNameEQUAL_EQUAL	
boolean	TokenNameboolean	
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
equalsIgnoreCase	TokenNameIdentifier	 equals Ignore Case
(	TokenNameLPAREN	
"true"	TokenNameStringLiteral	true
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
new	TokenNamenew	
Boolean	TokenNameIdentifier	 Boolean
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
==	TokenNameEQUAL_EQUAL	
Boolean	TokenNameIdentifier	 Boolean
.	TokenNameDOT	
class	TokenNameclass	
||	TokenNameOR_OR	
c	TokenNameIdentifier	 c
==	TokenNameEQUAL_EQUAL	
boolean	TokenNameboolean	
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
equalsIgnoreCase	TokenNameIdentifier	 equals Ignore Case
(	TokenNameLPAREN	
"false"	TokenNameStringLiteral	false
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
new	TokenNamenew	
Boolean	TokenNameIdentifier	 Boolean
(	TokenNameLPAREN	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
==	TokenNameEQUAL_EQUAL	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
class	TokenNameclass	
||	TokenNameOR_OR	
c	TokenNameIdentifier	 c
==	TokenNameEQUAL_EQUAL	
int	TokenNameint	
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
return	TokenNamereturn	
new	TokenNamenew	
Integer	TokenNameIdentifier	 Integer
(	TokenNameLPAREN	
StringUtil	TokenNameIdentifier	 String Util
.	TokenNameDOT	
atoi	TokenNameIdentifier	 atoi
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
==	TokenNameEQUAL_EQUAL	
Double	TokenNameIdentifier	 Double
.	TokenNameDOT	
class	TokenNameclass	
||	TokenNameOR_OR	
c	TokenNameIdentifier	 c
==	TokenNameEQUAL_EQUAL	
double	TokenNamedouble	
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
return	TokenNamereturn	
new	TokenNamenew	
Double	TokenNameIdentifier	 Double
(	TokenNameLPAREN	
StringUtil	TokenNameIdentifier	 String Util
.	TokenNameDOT	
atof	TokenNameIdentifier	 atof
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
try	TokenNametry	
{	TokenNameLBRACE	
return	TokenNamereturn	
Class	TokenNameIdentifier	 Class
.	TokenNameDOT	
forName	TokenNameIdentifier	 for Name
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
.	TokenNameDOT	
newInstance	TokenNameIdentifier	 new Instance
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
Exception	TokenNameIdentifier	 Exception
ex1	TokenNameIdentifier	 ex1
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
return	TokenNamereturn	
Class	TokenNameIdentifier	 Class
.	TokenNameDOT	
forName	TokenNameIdentifier	 for Name
(	TokenNameLPAREN	
"edu.cmu.minorthird."	TokenNameStringLiteral	edu.cmu.minorthird.
+	TokenNamePLUS	
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
.	TokenNameDOT	
newInstance	TokenNameIdentifier	 new Instance
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
Exception	TokenNameIdentifier	 Exception
ex2	TokenNameIdentifier	 ex2
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
lastIndexOf	TokenNameIdentifier	 last Index Of
(	TokenNameLPAREN	
'.'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
len	TokenNameIdentifier	 len
=	TokenNameEQUAL	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
s2	TokenNameIdentifier	 s2
=	TokenNameEQUAL	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
+	TokenNamePLUS	
"$"	TokenNameStringLiteral	$
+	TokenNamePLUS	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
len	TokenNameIdentifier	 len
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
Class	TokenNameIdentifier	 Class
.	TokenNameDOT	
forName	TokenNameIdentifier	 for Name
(	TokenNameLPAREN	
"edu.cmu.minorthird."	TokenNameStringLiteral	edu.cmu.minorthird.
+	TokenNamePLUS	
s2	TokenNameIdentifier	 s2
)	TokenNameRPAREN	
.	TokenNameDOT	
newInstance	TokenNameIdentifier	 new Instance
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
Exception	TokenNameIdentifier	 Exception
ex3	TokenNameIdentifier	 ex3
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
lastIndexOf	TokenNameIdentifier	 last Index Of
(	TokenNameLPAREN	
'.'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
len	TokenNameIdentifier	 len
=	TokenNameEQUAL	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
s2	TokenNameIdentifier	 s2
=	TokenNameEQUAL	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
+	TokenNamePLUS	
"$"	TokenNameStringLiteral	$
+	TokenNamePLUS	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
len	TokenNameIdentifier	 len
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
Class	TokenNameIdentifier	 Class
.	TokenNameDOT	
forName	TokenNameIdentifier	 for Name
(	TokenNameLPAREN	
s2	TokenNameIdentifier	 s2
)	TokenNameRPAREN	
.	TokenNameDOT	
newInstance	TokenNameIdentifier	 new Instance
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
Exception	TokenNameIdentifier	 Exception
ex4	TokenNameIdentifier	 ex4
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
"can't create instance of '"	TokenNameStringLiteral	can't create instance of '
+	TokenNamePLUS	
s	TokenNameIdentifier	 s
+	TokenNamePLUS	
"' or 'edu.cmu.minorthird."	TokenNameStringLiteral	' or 'edu.cmu.minorthird.
+	TokenNamePLUS	
s	TokenNameIdentifier	 s
+	TokenNamePLUS	
"'"	TokenNameStringLiteral	'
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Returns a modified copy of the object. * * @param modifications a comma or semi-colon separated list of * strings of the form LHS=RHS, where RHS is something that can be * passed to toObject(), and LHS is a period-separated chain of * getters/setters, where only the last item is a setter. * <p> * Example:<br> * <code>RefUtils.modify( * new StackedSequenceLearner(new MaxEntLearner(),1),<br> * "params.historySize=1,params.futureSize=0")<br> * </code> * is the same as: * <code> * StackedSequenceLearner a = new StackedSequenceLearner(new MaxEntLearner(),1);<br> * a.getParams().setHistorySize(1);<br> * a.getParams().setFutureSize(0);<br> * </code> */	TokenNameCOMMENT_JAVADOC	 Returns a modified copy of the object. * @param modifications a comma or semi-colon separated list of strings of the form LHS=RHS, where RHS is something that can be passed to toObject(), and LHS is a period-separated chain of getters/setters, where only the last item is a setter. <p> Example:<br> <code>RefUtils.modify( new StackedSequenceLearner(new MaxEntLearner(),1),<br> "params.historySize=1,params.futureSize=0")<br> </code> is the same as: <code> StackedSequenceLearner a = new StackedSequenceLearner(new MaxEntLearner(),1);<br> a.getParams().setHistorySize(1);<br> a.getParams().setFutureSize(0);<br> </code> 
public	TokenNamepublic	
static	TokenNamestatic	
Object	TokenNameIdentifier	 Object
modify	TokenNameIdentifier	 modify
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
obj	TokenNameIdentifier	 obj
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
modifications	TokenNameIdentifier	 modifications
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
mods	TokenNameIdentifier	 mods
=	TokenNameEQUAL	
modifications	TokenNameIdentifier	 modifications
.	TokenNameDOT	
split	TokenNameIdentifier	 split
(	TokenNameLPAREN	
"[,;]\s*"	TokenNameStringLiteral	[,;]\s*
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
mods	TokenNameIdentifier	 mods
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
sides	TokenNameIdentifier	 sides
=	TokenNameEQUAL	
mods	TokenNameIdentifier	 mods
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
split	TokenNameIdentifier	 split
(	TokenNameLPAREN	
"="	TokenNameStringLiteral	=
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
sides	TokenNameIdentifier	 sides
.	TokenNameDOT	
length	TokenNameIdentifier	 length
!=	TokenNameNOT_EQUAL	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
log	TokenNameIdentifier	 log
.	TokenNameDOT	
warn	TokenNameIdentifier	 warn
(	TokenNameLPAREN	
"Illegal modification (should be of the form x=y): "	TokenNameStringLiteral	Illegal modification (should be of the form x=y): 
+	TokenNamePLUS	
mods	TokenNameIdentifier	 mods
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
continue	TokenNamecontinue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
path	TokenNameIdentifier	 path
=	TokenNameEQUAL	
sides	TokenNameIdentifier	 sides
[	TokenNameLBRACKET	
LHS	TokenNameIdentifier	 LHS
]	TokenNameRBRACKET	
.	TokenNameDOT	
split	TokenNameIdentifier	 split
(	TokenNameLPAREN	
"\."	TokenNameStringLiteral	\.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Object	TokenNameIdentifier	 Object
objToChange	TokenNameIdentifier	 obj To Change
=	TokenNameEQUAL	
obj	TokenNameIdentifier	 obj
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
j	TokenNameIdentifier	 j
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
<	TokenNameLESS	
path	TokenNameIdentifier	 path
.	TokenNameDOT	
length	TokenNameIdentifier	 length
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Method	TokenNameIdentifier	 Method
m	TokenNameIdentifier	 m
=	TokenNameEQUAL	
objToChange	TokenNameIdentifier	 obj To Change
.	TokenNameDOT	
getClass	TokenNameIdentifier	 get Class
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getMethod	TokenNameIdentifier	 get Method
(	TokenNameLPAREN	
toGetter	TokenNameIdentifier	 to Getter
(	TokenNameLPAREN	
path	TokenNameIdentifier	 path
[	TokenNameLBRACKET	
j	TokenNameIdentifier	 j
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
new	TokenNamenew	
Class	TokenNameIdentifier	 Class
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
objToChange	TokenNameIdentifier	 obj To Change
=	TokenNameEQUAL	
m	TokenNameIdentifier	 m
.	TokenNameDOT	
invoke	TokenNameIdentifier	 invoke
(	TokenNameLPAREN	
objToChange	TokenNameIdentifier	 obj To Change
,	TokenNameCOMMA	
new	TokenNamenew	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// find a setter method m 	TokenNameCOMMENT_LINE	find a setter method m 
Method	TokenNameIdentifier	 Method
m	TokenNameIdentifier	 m
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
Method	TokenNameIdentifier	 Method
ms	TokenNameIdentifier	 ms
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
objToChange	TokenNameIdentifier	 obj To Change
.	TokenNameDOT	
getClass	TokenNameIdentifier	 get Class
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getMethods	TokenNameIdentifier	 get Methods
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
setterName	TokenNameIdentifier	 setter Name
=	TokenNameEQUAL	
toSetter	TokenNameIdentifier	 to Setter
(	TokenNameLPAREN	
path	TokenNameIdentifier	 path
[	TokenNameLBRACKET	
path	TokenNameIdentifier	 path
.	TokenNameDOT	
length	TokenNameIdentifier	 length
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
k	TokenNameIdentifier	 k
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
k	TokenNameIdentifier	 k
<	TokenNameLESS	
ms	TokenNameIdentifier	 ms
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
k	TokenNameIdentifier	 k
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
setterName	TokenNameIdentifier	 setter Name
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
ms	TokenNameIdentifier	 ms
[	TokenNameLBRACKET	
k	TokenNameIdentifier	 k
]	TokenNameRBRACKET	
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m	TokenNameIdentifier	 m
=	TokenNameEQUAL	
ms	TokenNameIdentifier	 ms
[	TokenNameLBRACKET	
k	TokenNameIdentifier	 k
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
m	TokenNameIdentifier	 m
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
log	TokenNameIdentifier	 log
.	TokenNameDOT	
warn	TokenNameIdentifier	 warn
(	TokenNameLPAREN	
"No setter defined for '"	TokenNameStringLiteral	No setter defined for '
+	TokenNamePLUS	
path	TokenNameIdentifier	 path
[	TokenNameLBRACKET	
path	TokenNameIdentifier	 path
.	TokenNameDOT	
length	TokenNameIdentifier	 length
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
+	TokenNamePLUS	
"'"	TokenNameStringLiteral	'
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
{	TokenNameLBRACE	
Class	TokenNameIdentifier	 Class
<	TokenNameLESS	
?	TokenNameQUESTION	
>	TokenNameGREATER	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
expectedClasses	TokenNameIdentifier	 expected Classes
=	TokenNameEQUAL	
m	TokenNameIdentifier	 m
.	TokenNameDOT	
getParameterTypes	TokenNameIdentifier	 get Parameter Types
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Object	TokenNameIdentifier	 Object
rhs	TokenNameIdentifier	 rhs
=	TokenNameEQUAL	
toObject	TokenNameIdentifier	 to Object
(	TokenNameLPAREN	
sides	TokenNameIdentifier	 sides
[	TokenNameLBRACKET	
RHS	TokenNameIdentifier	 RHS
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
expectedClasses	TokenNameIdentifier	 expected Classes
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m	TokenNameIdentifier	 m
.	TokenNameDOT	
invoke	TokenNameIdentifier	 invoke
(	TokenNameLPAREN	
objToChange	TokenNameIdentifier	 obj To Change
,	TokenNameCOMMA	
new	TokenNamenew	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
rhs	TokenNameIdentifier	 rhs
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
Exception	TokenNameIdentifier	 Exception
ex	TokenNameIdentifier	 ex
)	TokenNameRPAREN	
{	TokenNameLBRACE	
log	TokenNameIdentifier	 log
.	TokenNameDOT	
warn	TokenNameIdentifier	 warn
(	TokenNameLPAREN	
"Can't execute modification '"	TokenNameStringLiteral	Can't execute modification '
+	TokenNamePLUS	
mods	TokenNameIdentifier	 mods
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
+	TokenNamePLUS	
"': error was "	TokenNameStringLiteral	': error was 
+	TokenNamePLUS	
ex	TokenNameIdentifier	 ex
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
obj	TokenNameIdentifier	 obj
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
