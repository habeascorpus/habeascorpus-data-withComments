/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the "License"); * you may not use this file except in compliance with the License. * You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/* * $Id: MethodResolver.java 468637 2006-10-28 06:51:02Z minchau $ */	TokenNameCOMMENT_BLOCK	 $Id: MethodResolver.java 468637 2006-10-28 06:51:02Z minchau $ 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xalan	TokenNameIdentifier	 xalan
.	TokenNameDOT	
extensions	TokenNameIdentifier	 extensions
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
lang	TokenNameIdentifier	 lang
.	TokenNameDOT	
reflect	TokenNameIdentifier	 reflect
.	TokenNameDOT	
Constructor	TokenNameIdentifier	 Constructor
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
java	TokenNameIdentifier	 java
.	TokenNameDOT	
lang	TokenNameIdentifier	 lang
.	TokenNameDOT	
reflect	TokenNameIdentifier	 reflect
.	TokenNameDOT	
Modifier	TokenNameIdentifier	 Modifier
;	TokenNameSEMICOLON	
import	TokenNameimport	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
transform	TokenNameIdentifier	 transform
.	TokenNameDOT	
TransformerException	TokenNameIdentifier	 Transformer Exception
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xalan	TokenNameIdentifier	 xalan
.	TokenNameDOT	
res	TokenNameIdentifier	 res
.	TokenNameDOT	
XSLMessages	TokenNameIdentifier	 XSL Messages
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xalan	TokenNameIdentifier	 xalan
.	TokenNameDOT	
res	TokenNameIdentifier	 res
.	TokenNameDOT	
XSLTErrorResources	TokenNameIdentifier	 XSLT Error Resources
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
dtm	TokenNameIdentifier	 dtm
.	TokenNameDOT	
DTM	TokenNameIdentifier	 DTM
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
dtm	TokenNameIdentifier	 dtm
.	TokenNameDOT	
DTMIterator	TokenNameIdentifier	 DTM Iterator
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
dtm	TokenNameIdentifier	 dtm
.	TokenNameDOT	
ref	TokenNameIdentifier	 ref
.	TokenNameDOT	
DTMNodeIterator	TokenNameIdentifier	 DTM Node Iterator
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xpath	TokenNameIdentifier	 xpath
.	TokenNameDOT	
objects	TokenNameIdentifier	 objects
.	TokenNameDOT	
XObject	TokenNameIdentifier	 X Object
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xpath	TokenNameIdentifier	 xpath
.	TokenNameDOT	
objects	TokenNameIdentifier	 objects
.	TokenNameDOT	
XRTreeFrag	TokenNameIdentifier	 XR Tree Frag
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xpath	TokenNameIdentifier	 xpath
.	TokenNameDOT	
objects	TokenNameIdentifier	 objects
.	TokenNameDOT	
XString	TokenNameIdentifier	 X String
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
w3c	TokenNameIdentifier	 w3c
.	TokenNameDOT	
dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
Node	TokenNameIdentifier	 Node
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
w3c	TokenNameIdentifier	 w3c
.	TokenNameDOT	
dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
NodeList	TokenNameIdentifier	 Node List
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
w3c	TokenNameIdentifier	 w3c
.	TokenNameDOT	
dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
traversal	TokenNameIdentifier	 traversal
.	TokenNameDOT	
NodeIterator	TokenNameIdentifier	 Node Iterator
;	TokenNameSEMICOLON	
/** * Utility class to help resolve method overloading with Xalan XSLT * argument types. */	TokenNameCOMMENT_JAVADOC	 Utility class to help resolve method overloading with Xalan XSLT argument types. 
public	TokenNamepublic	
class	TokenNameclass	
MethodResolver	TokenNameIdentifier	 Method Resolver
{	TokenNameLBRACE	
/** * Specifies a search for static methods only. */	TokenNameCOMMENT_JAVADOC	 Specifies a search for static methods only. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
STATIC_ONLY	TokenNameIdentifier	 STATIC  ONLY
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * Specifies a search for instance methods only. */	TokenNameCOMMENT_JAVADOC	 Specifies a search for instance methods only. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
INSTANCE_ONLY	TokenNameIdentifier	 INSTANCE  ONLY
=	TokenNameEQUAL	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * Specifies a search for both static and instance methods. */	TokenNameCOMMENT_JAVADOC	 Specifies a search for both static and instance methods. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
STATIC_AND_INSTANCE	TokenNameIdentifier	 STATIC  AND  INSTANCE
=	TokenNameEQUAL	
3	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * Specifies a Dynamic method search. If the method being * evaluated is a static method, all arguments are used. * Otherwise, it is an instance method and only arguments * beginning with the second argument are used. */	TokenNameCOMMENT_JAVADOC	 Specifies a Dynamic method search. If the method being evaluated is a static method, all arguments are used. Otherwise, it is an instance method and only arguments beginning with the second argument are used. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
DYNAMIC	TokenNameIdentifier	 DYNAMIC
=	TokenNameEQUAL	
4	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * Given a class, figure out the resolution of * the Java Constructor from the XSLT argument types, and perform the * conversion of the arguments. * @param classObj the Class of the object to be constructed. * @param argsIn An array of XSLT/XPath arguments. * @param argsOut An array of the exact size as argsIn, which will be * populated with converted arguments if a suitable method is found. * @return A constructor that will work with the argsOut array. * @throws TransformerException may be thrown for Xalan conversion * exceptions. */	TokenNameCOMMENT_JAVADOC	 Given a class, figure out the resolution of the Java Constructor from the XSLT argument types, and perform the conversion of the arguments. @param classObj the Class of the object to be constructed. @param argsIn An array of XSLT/XPath arguments. @param argsOut An array of the exact size as argsIn, which will be populated with converted arguments if a suitable method is found. @return A constructor that will work with the argsOut array. @throws TransformerException may be thrown for Xalan conversion exceptions. 
public	TokenNamepublic	
static	TokenNamestatic	
Constructor	TokenNameIdentifier	 Constructor
getConstructor	TokenNameIdentifier	 get Constructor
(	TokenNameLPAREN	
Class	TokenNameIdentifier	 Class
classObj	TokenNameIdentifier	 class Obj
,	TokenNameCOMMA	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
argsIn	TokenNameIdentifier	 args In
,	TokenNameCOMMA	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
argsOut	TokenNameIdentifier	 args Out
,	TokenNameCOMMA	
ExpressionContext	TokenNameIdentifier	 Expression Context
exprContext	TokenNameIdentifier	 expr Context
)	TokenNameRPAREN	
throws	TokenNamethrows	
NoSuchMethodException	TokenNameIdentifier	 No Such Method Exception
,	TokenNameCOMMA	
SecurityException	TokenNameIdentifier	 Security Exception
,	TokenNameCOMMA	
TransformerException	TokenNameIdentifier	 Transformer Exception
{	TokenNameLBRACE	
Constructor	TokenNameIdentifier	 Constructor
bestConstructor	TokenNameIdentifier	 best Constructor
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
Class	TokenNameIdentifier	 Class
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
bestParamTypes	TokenNameIdentifier	 best Param Types
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
Constructor	TokenNameIdentifier	 Constructor
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
constructors	TokenNameIdentifier	 constructors
=	TokenNameEQUAL	
classObj	TokenNameIdentifier	 class Obj
.	TokenNameDOT	
getConstructors	TokenNameIdentifier	 get Constructors
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
nMethods	TokenNameIdentifier	 n Methods
=	TokenNameEQUAL	
constructors	TokenNameIdentifier	 constructors
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
int	TokenNameint	
bestScore	TokenNameIdentifier	 best Score
=	TokenNameEQUAL	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
MAX_VALUE	TokenNameIdentifier	 MAX  VALUE
;	TokenNameSEMICOLON	
int	TokenNameint	
bestScoreCount	TokenNameIdentifier	 best Score Count
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
nMethods	TokenNameIdentifier	 n Methods
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Constructor	TokenNameIdentifier	 Constructor
ctor	TokenNameIdentifier	 ctor
=	TokenNameEQUAL	
constructors	TokenNameIdentifier	 constructors
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
Class	TokenNameIdentifier	 Class
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
paramTypes	TokenNameIdentifier	 param Types
=	TokenNameEQUAL	
ctor	TokenNameIdentifier	 ctor
.	TokenNameDOT	
getParameterTypes	TokenNameIdentifier	 get Parameter Types
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
numberMethodParams	TokenNameIdentifier	 number Method Params
=	TokenNameEQUAL	
paramTypes	TokenNameIdentifier	 param Types
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
int	TokenNameint	
paramStart	TokenNameIdentifier	 param Start
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
isFirstExpressionContext	TokenNameIdentifier	 is First Expression Context
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
int	TokenNameint	
scoreStart	TokenNameIdentifier	 score Start
;	TokenNameSEMICOLON	
// System.out.println("numberMethodParams: "+numberMethodParams); 	TokenNameCOMMENT_LINE	System.out.println("numberMethodParams: "+numberMethodParams); 
// System.out.println("argsIn.length: "+argsIn.length); 	TokenNameCOMMENT_LINE	System.out.println("argsIn.length: "+argsIn.length); 
// System.out.println("exprContext: "+exprContext); 	TokenNameCOMMENT_LINE	System.out.println("exprContext: "+exprContext); 
if	TokenNameif	
(	TokenNameLPAREN	
numberMethodParams	TokenNameIdentifier	 number Method Params
==	TokenNameEQUAL_EQUAL	
(	TokenNameLPAREN	
argsIn	TokenNameIdentifier	 args In
.	TokenNameDOT	
length	TokenNameIdentifier	 length
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Class	TokenNameIdentifier	 Class
javaClass	TokenNameIdentifier	 java Class
=	TokenNameEQUAL	
paramTypes	TokenNameIdentifier	 param Types
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
// System.out.println("first javaClass: "+javaClass.getName()); 	TokenNameCOMMENT_LINE	System.out.println("first javaClass: "+javaClass.getName()); 
if	TokenNameif	
(	TokenNameLPAREN	
ExpressionContext	TokenNameIdentifier	 Expression Context
.	TokenNameDOT	
class	TokenNameclass	
.	TokenNameDOT	
isAssignableFrom	TokenNameIdentifier	 is Assignable From
(	TokenNameLPAREN	
javaClass	TokenNameIdentifier	 java Class
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
isFirstExpressionContext	TokenNameIdentifier	 is First Expression Context
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
scoreStart	TokenNameIdentifier	 score Start
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
paramStart	TokenNameIdentifier	 param Start
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
// System.out.println("Incrementing paramStart: "+paramStart); 	TokenNameCOMMENT_LINE	System.out.println("Incrementing paramStart: "+paramStart); 
}	TokenNameRBRACE	
else	TokenNameelse	
continue	TokenNamecontinue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
scoreStart	TokenNameIdentifier	 score Start
=	TokenNameEQUAL	
1000	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
argsIn	TokenNameIdentifier	 args In
.	TokenNameDOT	
length	TokenNameIdentifier	 length
==	TokenNameEQUAL_EQUAL	
(	TokenNameLPAREN	
numberMethodParams	TokenNameIdentifier	 number Method Params
-	TokenNameMINUS	
paramStart	TokenNameIdentifier	 param Start
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// then we have our candidate. 	TokenNameCOMMENT_LINE	then we have our candidate. 
int	TokenNameint	
score	TokenNameIdentifier	 score
=	TokenNameEQUAL	
scoreMatch	TokenNameIdentifier	 score Match
(	TokenNameLPAREN	
paramTypes	TokenNameIdentifier	 param Types
,	TokenNameCOMMA	
paramStart	TokenNameIdentifier	 param Start
,	TokenNameCOMMA	
argsIn	TokenNameIdentifier	 args In
,	TokenNameCOMMA	
scoreStart	TokenNameIdentifier	 score Start
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// System.out.println("score: "+score); 	TokenNameCOMMENT_LINE	System.out.println("score: "+score); 
if	TokenNameif	
(	TokenNameLPAREN	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
==	TokenNameEQUAL_EQUAL	
score	TokenNameIdentifier	 score
)	TokenNameRPAREN	
continue	TokenNamecontinue	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
score	TokenNameIdentifier	 score
<	TokenNameLESS	
bestScore	TokenNameIdentifier	 best Score
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// System.out.println("Assigning best ctor: "+ctor); 	TokenNameCOMMENT_LINE	System.out.println("Assigning best ctor: "+ctor); 
bestConstructor	TokenNameIdentifier	 best Constructor
=	TokenNameEQUAL	
ctor	TokenNameIdentifier	 ctor
;	TokenNameSEMICOLON	
bestParamTypes	TokenNameIdentifier	 best Param Types
=	TokenNameEQUAL	
paramTypes	TokenNameIdentifier	 param Types
;	TokenNameSEMICOLON	
bestScore	TokenNameIdentifier	 best Score
=	TokenNameEQUAL	
score	TokenNameIdentifier	 score
;	TokenNameSEMICOLON	
bestScoreCount	TokenNameIdentifier	 best Score Count
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
score	TokenNameIdentifier	 score
==	TokenNameEQUAL_EQUAL	
bestScore	TokenNameIdentifier	 best Score
)	TokenNameRPAREN	
bestScoreCount	TokenNameIdentifier	 best Score Count
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
==	TokenNameEQUAL_EQUAL	
bestConstructor	TokenNameIdentifier	 best Constructor
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
NoSuchMethodException	TokenNameIdentifier	 No Such Method Exception
(	TokenNameLPAREN	
errString	TokenNameIdentifier	 err String
(	TokenNameLPAREN	
"function"	TokenNameStringLiteral	function
,	TokenNameCOMMA	
"constructor"	TokenNameStringLiteral	constructor
,	TokenNameCOMMA	
classObj	TokenNameIdentifier	 class Obj
,	TokenNameCOMMA	
""	TokenNameStringLiteral	 
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
argsIn	TokenNameIdentifier	 args In
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/*** This is commented out until we can do a better object -> object scoring else if (bestScoreCount > 1) throw new TransformerException(XSLMessages.createMessage(XSLTErrorResources.ER_MORE_MATCH_CONSTRUCTOR, new Object[]{classObj.getName()})); //"More than one best match for constructor for " + classObj.getName()); ***/	TokenNameCOMMENT_JAVADOC	* This is commented out until we can do a better object -> object scoring else if (bestScoreCount > 1) throw new TransformerException(XSLMessages.createMessage(XSLTErrorResources.ER_MORE_MATCH_CONSTRUCTOR, new Object[]{classObj.getName()})); //"More than one best match for constructor for " + classObj.getName()); **
else	TokenNameelse	
convertParams	TokenNameIdentifier	 convert Params
(	TokenNameLPAREN	
argsIn	TokenNameIdentifier	 args In
,	TokenNameCOMMA	
argsOut	TokenNameIdentifier	 args Out
,	TokenNameCOMMA	
bestParamTypes	TokenNameIdentifier	 best Param Types
,	TokenNameCOMMA	
exprContext	TokenNameIdentifier	 expr Context
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
bestConstructor	TokenNameIdentifier	 best Constructor
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Given the name of a method, figure out the resolution of * the Java Method from the XSLT argument types, and perform the * conversion of the arguments. * @param classObj The Class of the object that should have the method. * @param name The name of the method to be invoked. * @param argsIn An array of XSLT/XPath arguments. * @param argsOut An array of the exact size as argsIn, which will be * populated with converted arguments if a suitable method is found. * @return A method that will work with the argsOut array. * @throws TransformerException may be thrown for Xalan conversion * exceptions. */	TokenNameCOMMENT_JAVADOC	 Given the name of a method, figure out the resolution of the Java Method from the XSLT argument types, and perform the conversion of the arguments. @param classObj The Class of the object that should have the method. @param name The name of the method to be invoked. @param argsIn An array of XSLT/XPath arguments. @param argsOut An array of the exact size as argsIn, which will be populated with converted arguments if a suitable method is found. @return A method that will work with the argsOut array. @throws TransformerException may be thrown for Xalan conversion exceptions. 
public	TokenNamepublic	
static	TokenNamestatic	
Method	TokenNameIdentifier	 Method
getMethod	TokenNameIdentifier	 get Method
(	TokenNameLPAREN	
Class	TokenNameIdentifier	 Class
classObj	TokenNameIdentifier	 class Obj
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
argsIn	TokenNameIdentifier	 args In
,	TokenNameCOMMA	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
argsOut	TokenNameIdentifier	 args Out
,	TokenNameCOMMA	
ExpressionContext	TokenNameIdentifier	 Expression Context
exprContext	TokenNameIdentifier	 expr Context
,	TokenNameCOMMA	
int	TokenNameint	
searchMethod	TokenNameIdentifier	 search Method
)	TokenNameRPAREN	
throws	TokenNamethrows	
NoSuchMethodException	TokenNameIdentifier	 No Such Method Exception
,	TokenNameCOMMA	
SecurityException	TokenNameIdentifier	 Security Exception
,	TokenNameCOMMA	
TransformerException	TokenNameIdentifier	 Transformer Exception
{	TokenNameLBRACE	
// System.out.println("---> Looking for method: "+name); 	TokenNameCOMMENT_LINE	System.out.println("---> Looking for method: "+name); 
// System.out.println("---> classObj: "+classObj); 	TokenNameCOMMENT_LINE	System.out.println("---> classObj: "+classObj); 
if	TokenNameif	
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
"-"	TokenNameStringLiteral	-
)	TokenNameRPAREN	
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
name	TokenNameIdentifier	 name
=	TokenNameEQUAL	
replaceDash	TokenNameIdentifier	 replace Dash
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Method	TokenNameIdentifier	 Method
bestMethod	TokenNameIdentifier	 best Method
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
Class	TokenNameIdentifier	 Class
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
bestParamTypes	TokenNameIdentifier	 best Param Types
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
Method	TokenNameIdentifier	 Method
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
methods	TokenNameIdentifier	 methods
=	TokenNameEQUAL	
classObj	TokenNameIdentifier	 class Obj
.	TokenNameDOT	
getMethods	TokenNameIdentifier	 get Methods
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
nMethods	TokenNameIdentifier	 n Methods
=	TokenNameEQUAL	
methods	TokenNameIdentifier	 methods
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
int	TokenNameint	
bestScore	TokenNameIdentifier	 best Score
=	TokenNameEQUAL	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
MAX_VALUE	TokenNameIdentifier	 MAX  VALUE
;	TokenNameSEMICOLON	
int	TokenNameint	
bestScoreCount	TokenNameIdentifier	 best Score Count
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
isStatic	TokenNameIdentifier	 is Static
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
nMethods	TokenNameIdentifier	 n Methods
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Method	TokenNameIdentifier	 Method
method	TokenNameIdentifier	 method
=	TokenNameEQUAL	
methods	TokenNameIdentifier	 methods
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
// System.out.println("looking at method: "+method); 	TokenNameCOMMENT_LINE	System.out.println("looking at method: "+method); 
int	TokenNameint	
xsltParamStart	TokenNameIdentifier	 xslt Param Start
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
method	TokenNameIdentifier	 method
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
isStatic	TokenNameIdentifier	 is Static
=	TokenNameEQUAL	
Modifier	TokenNameIdentifier	 Modifier
.	TokenNameDOT	
isStatic	TokenNameIdentifier	 is Static
(	TokenNameLPAREN	
method	TokenNameIdentifier	 method
.	TokenNameDOT	
getModifiers	TokenNameIdentifier	 get Modifiers
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
switch	TokenNameswitch	
(	TokenNameLPAREN	
searchMethod	TokenNameIdentifier	 search Method
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
STATIC_ONLY	TokenNameIdentifier	 STATIC  ONLY
:	TokenNameCOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
isStatic	TokenNameIdentifier	 is Static
)	TokenNameRPAREN	
{	TokenNameLBRACE	
continue	TokenNamecontinue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
INSTANCE_ONLY	TokenNameIdentifier	 INSTANCE  ONLY
:	TokenNameCOLON	
if	TokenNameif	
(	TokenNameLPAREN	
isStatic	TokenNameIdentifier	 is Static
)	TokenNameRPAREN	
{	TokenNameLBRACE	
continue	TokenNamecontinue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
STATIC_AND_INSTANCE	TokenNameIdentifier	 STATIC  AND  INSTANCE
:	TokenNameCOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
DYNAMIC	TokenNameIdentifier	 DYNAMIC
:	TokenNameCOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
isStatic	TokenNameIdentifier	 is Static
)	TokenNameRPAREN	
xsltParamStart	TokenNameIdentifier	 xslt Param Start
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
int	TokenNameint	
javaParamStart	TokenNameIdentifier	 java Param Start
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
Class	TokenNameIdentifier	 Class
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
paramTypes	TokenNameIdentifier	 param Types
=	TokenNameEQUAL	
method	TokenNameIdentifier	 method
.	TokenNameDOT	
getParameterTypes	TokenNameIdentifier	 get Parameter Types
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
numberMethodParams	TokenNameIdentifier	 number Method Params
=	TokenNameEQUAL	
paramTypes	TokenNameIdentifier	 param Types
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
isFirstExpressionContext	TokenNameIdentifier	 is First Expression Context
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
int	TokenNameint	
scoreStart	TokenNameIdentifier	 score Start
;	TokenNameSEMICOLON	
// System.out.println("numberMethodParams: "+numberMethodParams); 	TokenNameCOMMENT_LINE	System.out.println("numberMethodParams: "+numberMethodParams); 
// System.out.println("argsIn.length: "+argsIn.length); 	TokenNameCOMMENT_LINE	System.out.println("argsIn.length: "+argsIn.length); 
// System.out.println("exprContext: "+exprContext); 	TokenNameCOMMENT_LINE	System.out.println("exprContext: "+exprContext); 
int	TokenNameint	
argsLen	TokenNameIdentifier	 args Len
=	TokenNameEQUAL	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
argsIn	TokenNameIdentifier	 args In
)	TokenNameRPAREN	
?	TokenNameQUESTION	
argsIn	TokenNameIdentifier	 args In
.	TokenNameDOT	
length	TokenNameIdentifier	 length
:	TokenNameCOLON	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
numberMethodParams	TokenNameIdentifier	 number Method Params
==	TokenNameEQUAL_EQUAL	
(	TokenNameLPAREN	
argsLen	TokenNameIdentifier	 args Len
-	TokenNameMINUS	
xsltParamStart	TokenNameIdentifier	 xslt Param Start
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Class	TokenNameIdentifier	 Class
javaClass	TokenNameIdentifier	 java Class
=	TokenNameEQUAL	
paramTypes	TokenNameIdentifier	 param Types
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
ExpressionContext	TokenNameIdentifier	 Expression Context
.	TokenNameDOT	
class	TokenNameclass	
.	TokenNameDOT	
isAssignableFrom	TokenNameIdentifier	 is Assignable From
(	TokenNameLPAREN	
javaClass	TokenNameIdentifier	 java Class
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
isFirstExpressionContext	TokenNameIdentifier	 is First Expression Context
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
scoreStart	TokenNameIdentifier	 score Start
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
javaParamStart	TokenNameIdentifier	 java Param Start
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
continue	TokenNamecontinue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
scoreStart	TokenNameIdentifier	 score Start
=	TokenNameEQUAL	
1000	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
argsLen	TokenNameIdentifier	 args Len
-	TokenNameMINUS	
xsltParamStart	TokenNameIdentifier	 xslt Param Start
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
(	TokenNameLPAREN	
numberMethodParams	TokenNameIdentifier	 number Method Params
-	TokenNameMINUS	
javaParamStart	TokenNameIdentifier	 java Param Start
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// then we have our candidate. 	TokenNameCOMMENT_LINE	then we have our candidate. 
int	TokenNameint	
score	TokenNameIdentifier	 score
=	TokenNameEQUAL	
scoreMatch	TokenNameIdentifier	 score Match
(	TokenNameLPAREN	
paramTypes	TokenNameIdentifier	 param Types
,	TokenNameCOMMA	
javaParamStart	TokenNameIdentifier	 java Param Start
,	TokenNameCOMMA	
argsIn	TokenNameIdentifier	 args In
,	TokenNameCOMMA	
scoreStart	TokenNameIdentifier	 score Start
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// System.out.println("score: "+score); 	TokenNameCOMMENT_LINE	System.out.println("score: "+score); 
if	TokenNameif	
(	TokenNameLPAREN	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
==	TokenNameEQUAL_EQUAL	
score	TokenNameIdentifier	 score
)	TokenNameRPAREN	
continue	TokenNamecontinue	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
score	TokenNameIdentifier	 score
<	TokenNameLESS	
bestScore	TokenNameIdentifier	 best Score
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// System.out.println("Assigning best method: "+method); 	TokenNameCOMMENT_LINE	System.out.println("Assigning best method: "+method); 
bestMethod	TokenNameIdentifier	 best Method
=	TokenNameEQUAL	
method	TokenNameIdentifier	 method
;	TokenNameSEMICOLON	
bestParamTypes	TokenNameIdentifier	 best Param Types
=	TokenNameEQUAL	
paramTypes	TokenNameIdentifier	 param Types
;	TokenNameSEMICOLON	
bestScore	TokenNameIdentifier	 best Score
=	TokenNameEQUAL	
score	TokenNameIdentifier	 score
;	TokenNameSEMICOLON	
bestScoreCount	TokenNameIdentifier	 best Score Count
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
score	TokenNameIdentifier	 score
==	TokenNameEQUAL_EQUAL	
bestScore	TokenNameIdentifier	 best Score
)	TokenNameRPAREN	
bestScoreCount	TokenNameIdentifier	 best Score Count
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
==	TokenNameEQUAL_EQUAL	
bestMethod	TokenNameIdentifier	 best Method
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
NoSuchMethodException	TokenNameIdentifier	 No Such Method Exception
(	TokenNameLPAREN	
errString	TokenNameIdentifier	 err String
(	TokenNameLPAREN	
"function"	TokenNameStringLiteral	function
,	TokenNameCOMMA	
"method"	TokenNameStringLiteral	method
,	TokenNameCOMMA	
classObj	TokenNameIdentifier	 class Obj
,	TokenNameCOMMA	
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
searchMethod	TokenNameIdentifier	 search Method
,	TokenNameCOMMA	
argsIn	TokenNameIdentifier	 args In
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/*** This is commented out until we can do a better object -> object scoring else if (bestScoreCount > 1) throw new TransformerException(XSLMessages.createMessage(XSLTErrorResources.ER_MORE_MATCH_METHOD, new Object[]{name})); //"More than one best match for method " + name); ***/	TokenNameCOMMENT_JAVADOC	* This is commented out until we can do a better object -> object scoring else if (bestScoreCount > 1) throw new TransformerException(XSLMessages.createMessage(XSLTErrorResources.ER_MORE_MATCH_METHOD, new Object[]{name})); //"More than one best match for method " + name); **
else	TokenNameelse	
convertParams	TokenNameIdentifier	 convert Params
(	TokenNameLPAREN	
argsIn	TokenNameIdentifier	 args In
,	TokenNameCOMMA	
argsOut	TokenNameIdentifier	 args Out
,	TokenNameCOMMA	
bestParamTypes	TokenNameIdentifier	 best Param Types
,	TokenNameCOMMA	
exprContext	TokenNameIdentifier	 expr Context
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
bestMethod	TokenNameIdentifier	 best Method
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * To support EXSLT extensions, convert names with dash to allowable Java names: * e.g., convert abc-xyz to abcXyz. * Note: dashes only appear in middle of an EXSLT function or element name. */	TokenNameCOMMENT_JAVADOC	 To support EXSLT extensions, convert names with dash to allowable Java names: e.g., convert abc-xyz to abcXyz. Note: dashes only appear in middle of an EXSLT function or element name. 
private	TokenNameprivate	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
replaceDash	TokenNameIdentifier	 replace Dash
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
char	TokenNamechar	
dash	TokenNameIdentifier	 dash
=	TokenNameEQUAL	
'-'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
StringBuffer	TokenNameIdentifier	 String Buffer
buff	TokenNameIdentifier	 buff
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuffer	TokenNameIdentifier	 String Buffer
(	TokenNameLPAREN	
""	TokenNameStringLiteral	 
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
name	TokenNameIdentifier	 name
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
dash	TokenNameIdentifier	 dash
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
name	TokenNameIdentifier	 name
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
dash	TokenNameIdentifier	 dash
)	TokenNameRPAREN	
buff	TokenNameIdentifier	 buff
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
Character	TokenNameIdentifier	 Character
.	TokenNameDOT	
toUpperCase	TokenNameIdentifier	 to Upper Case
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
buff	TokenNameIdentifier	 buff
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
buff	TokenNameIdentifier	 buff
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Given the name of a method, figure out the resolution of * the Java Method * @param classObj The Class of the object that should have the method. * @param name The name of the method to be invoked. * @return A method that will work to be called as an element. * @throws TransformerException may be thrown for Xalan conversion * exceptions. */	TokenNameCOMMENT_JAVADOC	 Given the name of a method, figure out the resolution of the Java Method @param classObj The Class of the object that should have the method. @param name The name of the method to be invoked. @return A method that will work to be called as an element. @throws TransformerException may be thrown for Xalan conversion exceptions. 
public	TokenNamepublic	
static	TokenNamestatic	
Method	TokenNameIdentifier	 Method
getElementMethod	TokenNameIdentifier	 get Element Method
(	TokenNameLPAREN	
Class	TokenNameIdentifier	 Class
classObj	TokenNameIdentifier	 class Obj
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
throws	TokenNamethrows	
NoSuchMethodException	TokenNameIdentifier	 No Such Method Exception
,	TokenNameCOMMA	
SecurityException	TokenNameIdentifier	 Security Exception
,	TokenNameCOMMA	
TransformerException	TokenNameIdentifier	 Transformer Exception
{	TokenNameLBRACE	
// System.out.println("---> Looking for element method: "+name); 	TokenNameCOMMENT_LINE	System.out.println("---> Looking for element method: "+name); 
// System.out.println("---> classObj: "+classObj); 	TokenNameCOMMENT_LINE	System.out.println("---> classObj: "+classObj); 
Method	TokenNameIdentifier	 Method
bestMethod	TokenNameIdentifier	 best Method
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
Method	TokenNameIdentifier	 Method
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
methods	TokenNameIdentifier	 methods
=	TokenNameEQUAL	
classObj	TokenNameIdentifier	 class Obj
.	TokenNameDOT	
getMethods	TokenNameIdentifier	 get Methods
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
nMethods	TokenNameIdentifier	 n Methods
=	TokenNameEQUAL	
methods	TokenNameIdentifier	 methods
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
int	TokenNameint	
bestScoreCount	TokenNameIdentifier	 best Score Count
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
nMethods	TokenNameIdentifier	 n Methods
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Method	TokenNameIdentifier	 Method
method	TokenNameIdentifier	 method
=	TokenNameEQUAL	
methods	TokenNameIdentifier	 methods
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
// System.out.println("looking at method: "+method); 	TokenNameCOMMENT_LINE	System.out.println("looking at method: "+method); 
if	TokenNameif	
(	TokenNameLPAREN	
method	TokenNameIdentifier	 method
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Class	TokenNameIdentifier	 Class
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
paramTypes	TokenNameIdentifier	 param Types
=	TokenNameEQUAL	
method	TokenNameIdentifier	 method
.	TokenNameDOT	
getParameterTypes	TokenNameIdentifier	 get Parameter Types
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
paramTypes	TokenNameIdentifier	 param Types
.	TokenNameDOT	
length	TokenNameIdentifier	 length
==	TokenNameEQUAL_EQUAL	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
paramTypes	TokenNameIdentifier	 param Types
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
.	TokenNameDOT	
isAssignableFrom	TokenNameIdentifier	 is Assignable From
(	TokenNameLPAREN	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xalan	TokenNameIdentifier	 xalan
.	TokenNameDOT	
templates	TokenNameIdentifier	 templates
.	TokenNameDOT	
ElemExtensionCall	TokenNameIdentifier	 Elem Extension Call
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
paramTypes	TokenNameIdentifier	 param Types
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
.	TokenNameDOT	
isAssignableFrom	TokenNameIdentifier	 is Assignable From
(	TokenNameLPAREN	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xalan	TokenNameIdentifier	 xalan
.	TokenNameDOT	
extensions	TokenNameIdentifier	 extensions
.	TokenNameDOT	
XSLProcessorContext	TokenNameIdentifier	 XSL Processor Context
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
++	TokenNamePLUS_PLUS	
bestScoreCount	TokenNameIdentifier	 best Score Count
==	TokenNameEQUAL_EQUAL	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
bestMethod	TokenNameIdentifier	 best Method
=	TokenNameEQUAL	
method	TokenNameIdentifier	 method
;	TokenNameSEMICOLON	
else	TokenNameelse	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
==	TokenNameEQUAL_EQUAL	
bestMethod	TokenNameIdentifier	 best Method
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
NoSuchMethodException	TokenNameIdentifier	 No Such Method Exception
(	TokenNameLPAREN	
errString	TokenNameIdentifier	 err String
(	TokenNameLPAREN	
"element"	TokenNameStringLiteral	element
,	TokenNameCOMMA	
"method"	TokenNameStringLiteral	method
,	TokenNameCOMMA	
classObj	TokenNameIdentifier	 class Obj
,	TokenNameCOMMA	
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
bestScoreCount	TokenNameIdentifier	 best Score Count
>	TokenNameGREATER	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
TransformerException	TokenNameIdentifier	 Transformer Exception
(	TokenNameLPAREN	
XSLMessages	TokenNameIdentifier	 XSL Messages
.	TokenNameDOT	
createMessage	TokenNameIdentifier	 create Message
(	TokenNameLPAREN	
XSLTErrorResources	TokenNameIdentifier	 XSLT Error Resources
.	TokenNameDOT	
ER_MORE_MATCH_ELEMENT	TokenNameIdentifier	 ER  MORE  MATCH  ELEMENT
,	TokenNameCOMMA	
new	TokenNamenew	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
name	TokenNameIdentifier	 name
}	TokenNameRBRACE	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//"More than one best match for element method " + name); 	TokenNameCOMMENT_LINE	"More than one best match for element method " + name); 
return	TokenNamereturn	
bestMethod	TokenNameIdentifier	 best Method
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Convert a set of parameters based on a set of paramTypes. * @param argsIn An array of XSLT/XPath arguments. * @param argsOut An array of the exact size as argsIn, which will be * populated with converted arguments. * @param paramTypes An array of class objects, of the exact same * size as argsIn and argsOut. * @throws TransformerException may be thrown for Xalan conversion * exceptions. */	TokenNameCOMMENT_JAVADOC	 Convert a set of parameters based on a set of paramTypes. @param argsIn An array of XSLT/XPath arguments. @param argsOut An array of the exact size as argsIn, which will be populated with converted arguments. @param paramTypes An array of class objects, of the exact same size as argsIn and argsOut. @throws TransformerException may be thrown for Xalan conversion exceptions. 
public	TokenNamepublic	
static	TokenNamestatic	
void	TokenNamevoid	
convertParams	TokenNameIdentifier	 convert Params
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
argsIn	TokenNameIdentifier	 args In
,	TokenNameCOMMA	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
argsOut	TokenNameIdentifier	 args Out
,	TokenNameCOMMA	
Class	TokenNameIdentifier	 Class
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
paramTypes	TokenNameIdentifier	 param Types
,	TokenNameCOMMA	
ExpressionContext	TokenNameIdentifier	 Expression Context
exprContext	TokenNameIdentifier	 expr Context
)	TokenNameRPAREN	
throws	TokenNamethrows	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
transform	TokenNameIdentifier	 transform
.	TokenNameDOT	
TransformerException	TokenNameIdentifier	 Transformer Exception
{	TokenNameLBRACE	
// System.out.println("In convertParams"); 	TokenNameCOMMENT_LINE	System.out.println("In convertParams"); 
if	TokenNameif	
(	TokenNameLPAREN	
paramTypes	TokenNameIdentifier	 param Types
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
argsOut	TokenNameIdentifier	 args Out
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
else	TokenNameelse	
{	TokenNameLBRACE	
int	TokenNameint	
nParams	TokenNameIdentifier	 n Params
=	TokenNameEQUAL	
paramTypes	TokenNameIdentifier	 param Types
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
argsOut	TokenNameIdentifier	 args Out
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
new	TokenNamenew	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
nParams	TokenNameIdentifier	 n Params
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
int	TokenNameint	
paramIndex	TokenNameIdentifier	 param Index
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
nParams	TokenNameIdentifier	 n Params
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
ExpressionContext	TokenNameIdentifier	 Expression Context
.	TokenNameDOT	
class	TokenNameclass	
.	TokenNameDOT	
isAssignableFrom	TokenNameIdentifier	 is Assignable From
(	TokenNameLPAREN	
paramTypes	TokenNameIdentifier	 param Types
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
argsOut	TokenNameIdentifier	 args Out
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
exprContext	TokenNameIdentifier	 expr Context
;	TokenNameSEMICOLON	
// System.out.println("Incrementing paramIndex in convertParams: "+paramIndex); 	TokenNameCOMMENT_LINE	System.out.println("Incrementing paramIndex in convertParams: "+paramIndex); 
paramIndex	TokenNameIdentifier	 param Index
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
argsIn	TokenNameIdentifier	 args In
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
argsIn	TokenNameIdentifier	 args In
.	TokenNameDOT	
length	TokenNameIdentifier	 length
-	TokenNameMINUS	
nParams	TokenNameIdentifier	 n Params
+	TokenNamePLUS	
paramIndex	TokenNameIdentifier	 param Index
;	TokenNameSEMICOLON	
paramIndex	TokenNameIdentifier	 param Index
<	TokenNameLESS	
nParams	TokenNameIdentifier	 n Params
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
,	TokenNameCOMMA	
paramIndex	TokenNameIdentifier	 param Index
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// System.out.println("paramTypes[i]: "+paramTypes[i]); 	TokenNameCOMMENT_LINE	System.out.println("paramTypes[i]: "+paramTypes[i]); 
argsOut	TokenNameIdentifier	 args Out
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
paramIndex	TokenNameIdentifier	 param Index
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
convert	TokenNameIdentifier	 convert
(	TokenNameLPAREN	
argsIn	TokenNameIdentifier	 args In
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
paramTypes	TokenNameIdentifier	 param Types
[	TokenNameLBRACKET	
paramIndex	TokenNameIdentifier	 param Index
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Simple class to hold information about allowed conversions * and their relative scores, for use by the table below. */	TokenNameCOMMENT_JAVADOC	 Simple class to hold information about allowed conversions and their relative scores, for use by the table below. 
static	TokenNamestatic	
class	TokenNameclass	
ConversionInfo	TokenNameIdentifier	 Conversion Info
{	TokenNameLBRACE	
ConversionInfo	TokenNameIdentifier	 Conversion Info
(	TokenNameLPAREN	
Class	TokenNameIdentifier	 Class
cl	TokenNameIdentifier	 cl
,	TokenNameCOMMA	
int	TokenNameint	
score	TokenNameIdentifier	 score
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_class	TokenNameIdentifier	 m class
=	TokenNameEQUAL	
cl	TokenNameIdentifier	 cl
;	TokenNameSEMICOLON	
m_score	TokenNameIdentifier	 m score
=	TokenNameEQUAL	
score	TokenNameIdentifier	 score
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
Class	TokenNameIdentifier	 Class
m_class	TokenNameIdentifier	 m class
;	TokenNameSEMICOLON	
// Java class to convert to. 	TokenNameCOMMENT_LINE	Java class to convert to. 
int	TokenNameint	
m_score	TokenNameIdentifier	 m score
;	TokenNameSEMICOLON	
// Match score, closer to zero is more matched. 	TokenNameCOMMENT_LINE	Match score, closer to zero is more matched. 
}	TokenNameRBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
SCOREBASE	TokenNameIdentifier	 SCOREBASE
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * Specification of conversions from XSLT type CLASS_UNKNOWN * (i.e. some unknown Java object) to allowed Java types. */	TokenNameCOMMENT_JAVADOC	 Specification of conversions from XSLT type CLASS_UNKNOWN (i.e. some unknown Java object) to allowed Java types. 
private	TokenNameprivate	
final	TokenNamefinal	
static	TokenNamestatic	
ConversionInfo	TokenNameIdentifier	 Conversion Info
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
m_javaObjConversions	TokenNameIdentifier	 m java Obj Conversions
=	TokenNameEQUAL	
{	TokenNameLBRACE	
new	TokenNamenew	
ConversionInfo	TokenNameIdentifier	 Conversion Info
(	TokenNameLPAREN	
Double	TokenNameIdentifier	 Double
.	TokenNameDOT	
TYPE	TokenNameIdentifier	 TYPE
,	TokenNameCOMMA	
11	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
new	TokenNamenew	
ConversionInfo	TokenNameIdentifier	 Conversion Info
(	TokenNameLPAREN	
Float	TokenNameIdentifier	 Float
.	TokenNameDOT	
TYPE	TokenNameIdentifier	 TYPE
,	TokenNameCOMMA	
12	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
new	TokenNamenew	
ConversionInfo	TokenNameIdentifier	 Conversion Info
(	TokenNameLPAREN	
Long	TokenNameIdentifier	 Long
.	TokenNameDOT	
TYPE	TokenNameIdentifier	 TYPE
,	TokenNameCOMMA	
13	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
new	TokenNamenew	
ConversionInfo	TokenNameIdentifier	 Conversion Info
(	TokenNameLPAREN	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
TYPE	TokenNameIdentifier	 TYPE
,	TokenNameCOMMA	
14	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
new	TokenNamenew	
ConversionInfo	TokenNameIdentifier	 Conversion Info
(	TokenNameLPAREN	
Short	TokenNameIdentifier	 Short
.	TokenNameDOT	
TYPE	TokenNameIdentifier	 TYPE
,	TokenNameCOMMA	
15	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
new	TokenNamenew	
ConversionInfo	TokenNameIdentifier	 Conversion Info
(	TokenNameLPAREN	
Character	TokenNameIdentifier	 Character
.	TokenNameDOT	
TYPE	TokenNameIdentifier	 TYPE
,	TokenNameCOMMA	
16	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
new	TokenNamenew	
ConversionInfo	TokenNameIdentifier	 Conversion Info
(	TokenNameLPAREN	
Byte	TokenNameIdentifier	 Byte
.	TokenNameDOT	
TYPE	TokenNameIdentifier	 TYPE
,	TokenNameCOMMA	
17	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
new	TokenNamenew	
ConversionInfo	TokenNameIdentifier	 Conversion Info
(	TokenNameLPAREN	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
lang	TokenNameIdentifier	 lang
.	TokenNameDOT	
String	TokenNameIdentifier	 String
.	TokenNameDOT	
class	TokenNameclass	
,	TokenNameCOMMA	
18	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
/** * Specification of conversions from XSLT type CLASS_BOOLEAN * to allowed Java types. */	TokenNameCOMMENT_JAVADOC	 Specification of conversions from XSLT type CLASS_BOOLEAN to allowed Java types. 
private	TokenNameprivate	
final	TokenNamefinal	
static	TokenNamestatic	
ConversionInfo	TokenNameIdentifier	 Conversion Info
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
m_booleanConversions	TokenNameIdentifier	 m boolean Conversions
=	TokenNameEQUAL	
{	TokenNameLBRACE	
new	TokenNamenew	
ConversionInfo	TokenNameIdentifier	 Conversion Info
(	TokenNameLPAREN	
Boolean	TokenNameIdentifier	 Boolean
.	TokenNameDOT	
TYPE	TokenNameIdentifier	 TYPE
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
new	TokenNamenew	
ConversionInfo	TokenNameIdentifier	 Conversion Info
(	TokenNameLPAREN	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
lang	TokenNameIdentifier	 lang
.	TokenNameDOT	
Boolean	TokenNameIdentifier	 Boolean
.	TokenNameDOT	
class	TokenNameclass	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
new	TokenNamenew	
ConversionInfo	TokenNameIdentifier	 Conversion Info
(	TokenNameLPAREN	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
lang	TokenNameIdentifier	 lang
.	TokenNameDOT	
Object	TokenNameIdentifier	 Object
.	TokenNameDOT	
class	TokenNameclass	
,	TokenNameCOMMA	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
new	TokenNamenew	
ConversionInfo	TokenNameIdentifier	 Conversion Info
(	TokenNameLPAREN	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
lang	TokenNameIdentifier	 lang
.	TokenNameDOT	
String	TokenNameIdentifier	 String
.	TokenNameDOT	
class	TokenNameclass	
,	TokenNameCOMMA	
3	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
/** * Specification of conversions from XSLT type CLASS_NUMBER * to allowed Java types. */	TokenNameCOMMENT_JAVADOC	 Specification of conversions from XSLT type CLASS_NUMBER to allowed Java types. 
private	TokenNameprivate	
final	TokenNamefinal	
static	TokenNamestatic	
ConversionInfo	TokenNameIdentifier	 Conversion Info
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
m_numberConversions	TokenNameIdentifier	 m number Conversions
=	TokenNameEQUAL	
{	TokenNameLBRACE	
new	TokenNamenew	
ConversionInfo	TokenNameIdentifier	 Conversion Info
(	TokenNameLPAREN	
Double	TokenNameIdentifier	 Double
.	TokenNameDOT	
TYPE	TokenNameIdentifier	 TYPE
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
new	TokenNamenew	
ConversionInfo	TokenNameIdentifier	 Conversion Info
(	TokenNameLPAREN	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
lang	TokenNameIdentifier	 lang
.	TokenNameDOT	
Double	TokenNameIdentifier	 Double
.	TokenNameDOT	
class	TokenNameclass	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
new	TokenNamenew	
ConversionInfo	TokenNameIdentifier	 Conversion Info
(	TokenNameLPAREN	
Float	TokenNameIdentifier	 Float
.	TokenNameDOT	
TYPE	TokenNameIdentifier	 TYPE
,	TokenNameCOMMA	
3	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
new	TokenNamenew	
ConversionInfo	TokenNameIdentifier	 Conversion Info
(	TokenNameLPAREN	
Long	TokenNameIdentifier	 Long
.	TokenNameDOT	
TYPE	TokenNameIdentifier	 TYPE
,	TokenNameCOMMA	
4	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
new	TokenNamenew	
ConversionInfo	TokenNameIdentifier	 Conversion Info
(	TokenNameLPAREN	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
TYPE	TokenNameIdentifier	 TYPE
,	TokenNameCOMMA	
5	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
new	TokenNamenew	
ConversionInfo	TokenNameIdentifier	 Conversion Info
(	TokenNameLPAREN	
Short	TokenNameIdentifier	 Short
.	TokenNameDOT	
TYPE	TokenNameIdentifier	 TYPE
,	TokenNameCOMMA	
6	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
new	TokenNamenew	
ConversionInfo	TokenNameIdentifier	 Conversion Info
(	TokenNameLPAREN	
Character	TokenNameIdentifier	 Character
.	TokenNameDOT	
TYPE	TokenNameIdentifier	 TYPE
,	TokenNameCOMMA	
7	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
new	TokenNamenew	
ConversionInfo	TokenNameIdentifier	 Conversion Info
(	TokenNameLPAREN	
Byte	TokenNameIdentifier	 Byte
.	TokenNameDOT	
TYPE	TokenNameIdentifier	 TYPE
,	TokenNameCOMMA	
8	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
new	TokenNamenew	
ConversionInfo	TokenNameIdentifier	 Conversion Info
(	TokenNameLPAREN	
Boolean	TokenNameIdentifier	 Boolean
.	TokenNameDOT	
TYPE	TokenNameIdentifier	 TYPE
,	TokenNameCOMMA	
9	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
new	TokenNamenew	
ConversionInfo	TokenNameIdentifier	 Conversion Info
(	TokenNameLPAREN	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
lang	TokenNameIdentifier	 lang
.	TokenNameDOT	
String	TokenNameIdentifier	 String
.	TokenNameDOT	
class	TokenNameclass	
,	TokenNameCOMMA	
10	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
new	TokenNamenew	
ConversionInfo	TokenNameIdentifier	 Conversion Info
(	TokenNameLPAREN	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
lang	TokenNameIdentifier	 lang
.	TokenNameDOT	
Object	TokenNameIdentifier	 Object
.	TokenNameDOT	
class	TokenNameclass	
,	TokenNameCOMMA	
11	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
/** * Specification of conversions from XSLT type CLASS_STRING * to allowed Java types. */	TokenNameCOMMENT_JAVADOC	 Specification of conversions from XSLT type CLASS_STRING to allowed Java types. 
private	TokenNameprivate	
final	TokenNamefinal	
static	TokenNamestatic	
ConversionInfo	TokenNameIdentifier	 Conversion Info
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
m_stringConversions	TokenNameIdentifier	 m string Conversions
=	TokenNameEQUAL	
{	TokenNameLBRACE	
new	TokenNamenew	
ConversionInfo	TokenNameIdentifier	 Conversion Info
(	TokenNameLPAREN	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
lang	TokenNameIdentifier	 lang
.	TokenNameDOT	
String	TokenNameIdentifier	 String
.	TokenNameDOT	
class	TokenNameclass	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
new	TokenNamenew	
ConversionInfo	TokenNameIdentifier	 Conversion Info
(	TokenNameLPAREN	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
lang	TokenNameIdentifier	 lang
.	TokenNameDOT	
Object	TokenNameIdentifier	 Object
.	TokenNameDOT	
class	TokenNameclass	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
new	TokenNamenew	
ConversionInfo	TokenNameIdentifier	 Conversion Info
(	TokenNameLPAREN	
Character	TokenNameIdentifier	 Character
.	TokenNameDOT	
TYPE	TokenNameIdentifier	 TYPE
,	TokenNameCOMMA	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
new	TokenNamenew	
ConversionInfo	TokenNameIdentifier	 Conversion Info
(	TokenNameLPAREN	
Double	TokenNameIdentifier	 Double
.	TokenNameDOT	
TYPE	TokenNameIdentifier	 TYPE
,	TokenNameCOMMA	
3	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
new	TokenNamenew	
ConversionInfo	TokenNameIdentifier	 Conversion Info
(	TokenNameLPAREN	
Float	TokenNameIdentifier	 Float
.	TokenNameDOT	
TYPE	TokenNameIdentifier	 TYPE
,	TokenNameCOMMA	
3	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
new	TokenNamenew	
ConversionInfo	TokenNameIdentifier	 Conversion Info
(	TokenNameLPAREN	
Long	TokenNameIdentifier	 Long
.	TokenNameDOT	
TYPE	TokenNameIdentifier	 TYPE
,	TokenNameCOMMA	
3	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
new	TokenNamenew	
ConversionInfo	TokenNameIdentifier	 Conversion Info
(	TokenNameLPAREN	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
TYPE	TokenNameIdentifier	 TYPE
,	TokenNameCOMMA	
3	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
new	TokenNamenew	
ConversionInfo	TokenNameIdentifier	 Conversion Info
(	TokenNameLPAREN	
Short	TokenNameIdentifier	 Short
.	TokenNameDOT	
TYPE	TokenNameIdentifier	 TYPE
,	TokenNameCOMMA	
3	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
new	TokenNamenew	
ConversionInfo	TokenNameIdentifier	 Conversion Info
(	TokenNameLPAREN	
Byte	TokenNameIdentifier	 Byte
.	TokenNameDOT	
TYPE	TokenNameIdentifier	 TYPE
,	TokenNameCOMMA	
3	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
new	TokenNamenew	
ConversionInfo	TokenNameIdentifier	 Conversion Info
(	TokenNameLPAREN	
Boolean	TokenNameIdentifier	 Boolean
.	TokenNameDOT	
TYPE	TokenNameIdentifier	 TYPE
,	TokenNameCOMMA	
4	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
/** * Specification of conversions from XSLT type CLASS_RTREEFRAG * to allowed Java types. */	TokenNameCOMMENT_JAVADOC	 Specification of conversions from XSLT type CLASS_RTREEFRAG to allowed Java types. 
private	TokenNameprivate	
final	TokenNamefinal	
static	TokenNamestatic	
ConversionInfo	TokenNameIdentifier	 Conversion Info
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
m_rtfConversions	TokenNameIdentifier	 m rtf Conversions
=	TokenNameEQUAL	
{	TokenNameLBRACE	
new	TokenNamenew	
ConversionInfo	TokenNameIdentifier	 Conversion Info
(	TokenNameLPAREN	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
w3c	TokenNameIdentifier	 w3c
.	TokenNameDOT	
dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
traversal	TokenNameIdentifier	 traversal
.	TokenNameDOT	
NodeIterator	TokenNameIdentifier	 Node Iterator
.	TokenNameDOT	
class	TokenNameclass	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
new	TokenNamenew	
ConversionInfo	TokenNameIdentifier	 Conversion Info
(	TokenNameLPAREN	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
w3c	TokenNameIdentifier	 w3c
.	TokenNameDOT	
dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
NodeList	TokenNameIdentifier	 Node List
.	TokenNameDOT	
class	TokenNameclass	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
new	TokenNamenew	
ConversionInfo	TokenNameIdentifier	 Conversion Info
(	TokenNameLPAREN	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
w3c	TokenNameIdentifier	 w3c
.	TokenNameDOT	
dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
Node	TokenNameIdentifier	 Node
.	TokenNameDOT	
class	TokenNameclass	
,	TokenNameCOMMA	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
new	TokenNamenew	
ConversionInfo	TokenNameIdentifier	 Conversion Info
(	TokenNameLPAREN	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
lang	TokenNameIdentifier	 lang
.	TokenNameDOT	
String	TokenNameIdentifier	 String
.	TokenNameDOT	
class	TokenNameclass	
,	TokenNameCOMMA	
3	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
new	TokenNamenew	
ConversionInfo	TokenNameIdentifier	 Conversion Info
(	TokenNameLPAREN	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
lang	TokenNameIdentifier	 lang
.	TokenNameDOT	
Object	TokenNameIdentifier	 Object
.	TokenNameDOT	
class	TokenNameclass	
,	TokenNameCOMMA	
5	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
new	TokenNamenew	
ConversionInfo	TokenNameIdentifier	 Conversion Info
(	TokenNameLPAREN	
Character	TokenNameIdentifier	 Character
.	TokenNameDOT	
TYPE	TokenNameIdentifier	 TYPE
,	TokenNameCOMMA	
6	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
new	TokenNamenew	
ConversionInfo	TokenNameIdentifier	 Conversion Info
(	TokenNameLPAREN	
Double	TokenNameIdentifier	 Double
.	TokenNameDOT	
TYPE	TokenNameIdentifier	 TYPE
,	TokenNameCOMMA	
7	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
new	TokenNamenew	
ConversionInfo	TokenNameIdentifier	 Conversion Info
(	TokenNameLPAREN	
Float	TokenNameIdentifier	 Float
.	TokenNameDOT	
TYPE	TokenNameIdentifier	 TYPE
,	TokenNameCOMMA	
7	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
new	TokenNamenew	
ConversionInfo	TokenNameIdentifier	 Conversion Info
(	TokenNameLPAREN	
Long	TokenNameIdentifier	 Long
.	TokenNameDOT	
TYPE	TokenNameIdentifier	 TYPE
,	TokenNameCOMMA	
7	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
new	TokenNamenew	
ConversionInfo	TokenNameIdentifier	 Conversion Info
(	TokenNameLPAREN	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
TYPE	TokenNameIdentifier	 TYPE
,	TokenNameCOMMA	
7	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
new	TokenNamenew	
ConversionInfo	TokenNameIdentifier	 Conversion Info
(	TokenNameLPAREN	
Short	TokenNameIdentifier	 Short
.	TokenNameDOT	
TYPE	TokenNameIdentifier	 TYPE
,	TokenNameCOMMA	
7	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
new	TokenNamenew	
ConversionInfo	TokenNameIdentifier	 Conversion Info
(	TokenNameLPAREN	
Byte	TokenNameIdentifier	 Byte
.	TokenNameDOT	
TYPE	TokenNameIdentifier	 TYPE
,	TokenNameCOMMA	
7	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
new	TokenNamenew	
ConversionInfo	TokenNameIdentifier	 Conversion Info
(	TokenNameLPAREN	
Boolean	TokenNameIdentifier	 Boolean
.	TokenNameDOT	
TYPE	TokenNameIdentifier	 TYPE
,	TokenNameCOMMA	
8	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
/** * Specification of conversions from XSLT type CLASS_NODESET * to allowed Java types. (This is the same as for CLASS_RTREEFRAG) */	TokenNameCOMMENT_JAVADOC	 Specification of conversions from XSLT type CLASS_NODESET to allowed Java types. (This is the same as for CLASS_RTREEFRAG) 
private	TokenNameprivate	
final	TokenNamefinal	
static	TokenNamestatic	
ConversionInfo	TokenNameIdentifier	 Conversion Info
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
m_nodesetConversions	TokenNameIdentifier	 m nodeset Conversions
=	TokenNameEQUAL	
{	TokenNameLBRACE	
new	TokenNamenew	
ConversionInfo	TokenNameIdentifier	 Conversion Info
(	TokenNameLPAREN	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
w3c	TokenNameIdentifier	 w3c
.	TokenNameDOT	
dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
traversal	TokenNameIdentifier	 traversal
.	TokenNameDOT	
NodeIterator	TokenNameIdentifier	 Node Iterator
.	TokenNameDOT	
class	TokenNameclass	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
new	TokenNamenew	
ConversionInfo	TokenNameIdentifier	 Conversion Info
(	TokenNameLPAREN	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
w3c	TokenNameIdentifier	 w3c
.	TokenNameDOT	
dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
NodeList	TokenNameIdentifier	 Node List
.	TokenNameDOT	
class	TokenNameclass	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
new	TokenNamenew	
ConversionInfo	TokenNameIdentifier	 Conversion Info
(	TokenNameLPAREN	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
w3c	TokenNameIdentifier	 w3c
.	TokenNameDOT	
dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
Node	TokenNameIdentifier	 Node
.	TokenNameDOT	
class	TokenNameclass	
,	TokenNameCOMMA	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
new	TokenNamenew	
ConversionInfo	TokenNameIdentifier	 Conversion Info
(	TokenNameLPAREN	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
lang	TokenNameIdentifier	 lang
.	TokenNameDOT	
String	TokenNameIdentifier	 String
.	TokenNameDOT	
class	TokenNameclass	
,	TokenNameCOMMA	
3	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
new	TokenNamenew	
ConversionInfo	TokenNameIdentifier	 Conversion Info
(	TokenNameLPAREN	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
lang	TokenNameIdentifier	 lang
.	TokenNameDOT	
Object	TokenNameIdentifier	 Object
.	TokenNameDOT	
class	TokenNameclass	
,	TokenNameCOMMA	
5	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
new	TokenNamenew	
ConversionInfo	TokenNameIdentifier	 Conversion Info
(	TokenNameLPAREN	
Character	TokenNameIdentifier	 Character
.	TokenNameDOT	
TYPE	TokenNameIdentifier	 TYPE
,	TokenNameCOMMA	
6	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
new	TokenNamenew	
ConversionInfo	TokenNameIdentifier	 Conversion Info
(	TokenNameLPAREN	
Double	TokenNameIdentifier	 Double
.	TokenNameDOT	
TYPE	TokenNameIdentifier	 TYPE
,	TokenNameCOMMA	
7	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
new	TokenNamenew	
ConversionInfo	TokenNameIdentifier	 Conversion Info
(	TokenNameLPAREN	
Float	TokenNameIdentifier	 Float
.	TokenNameDOT	
TYPE	TokenNameIdentifier	 TYPE
,	TokenNameCOMMA	
7	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
new	TokenNamenew	
ConversionInfo	TokenNameIdentifier	 Conversion Info
(	TokenNameLPAREN	
Long	TokenNameIdentifier	 Long
.	TokenNameDOT	
TYPE	TokenNameIdentifier	 TYPE
,	TokenNameCOMMA	
7	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
new	TokenNamenew	
ConversionInfo	TokenNameIdentifier	 Conversion Info
(	TokenNameLPAREN	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
TYPE	TokenNameIdentifier	 TYPE
,	TokenNameCOMMA	
7	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
new	TokenNamenew	
ConversionInfo	TokenNameIdentifier	 Conversion Info
(	TokenNameLPAREN	
Short	TokenNameIdentifier	 Short
.	TokenNameDOT	
TYPE	TokenNameIdentifier	 TYPE
,	TokenNameCOMMA	
7	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
new	TokenNamenew	
ConversionInfo	TokenNameIdentifier	 Conversion Info
(	TokenNameLPAREN	
Byte	TokenNameIdentifier	 Byte
.	TokenNameDOT	
TYPE	TokenNameIdentifier	 TYPE
,	TokenNameCOMMA	
7	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
new	TokenNamenew	
ConversionInfo	TokenNameIdentifier	 Conversion Info
(	TokenNameLPAREN	
Boolean	TokenNameIdentifier	 Boolean
.	TokenNameDOT	
TYPE	TokenNameIdentifier	 TYPE
,	TokenNameCOMMA	
8	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
/** * Order is significant in the list below, based on * XObject.CLASS_XXX values. */	TokenNameCOMMENT_JAVADOC	 Order is significant in the list below, based on XObject.CLASS_XXX values. 
private	TokenNameprivate	
final	TokenNamefinal	
static	TokenNamestatic	
ConversionInfo	TokenNameIdentifier	 Conversion Info
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
m_conversions	TokenNameIdentifier	 m conversions
=	TokenNameEQUAL	
{	TokenNameLBRACE	
m_javaObjConversions	TokenNameIdentifier	 m java Obj Conversions
,	TokenNameCOMMA	
// CLASS_UNKNOWN = 0; 	TokenNameCOMMENT_LINE	CLASS_UNKNOWN = 0; 
m_booleanConversions	TokenNameIdentifier	 m boolean Conversions
,	TokenNameCOMMA	
// CLASS_BOOLEAN = 1; 	TokenNameCOMMENT_LINE	CLASS_BOOLEAN = 1; 
m_numberConversions	TokenNameIdentifier	 m number Conversions
,	TokenNameCOMMA	
// CLASS_NUMBER = 2; 	TokenNameCOMMENT_LINE	CLASS_NUMBER = 2; 
m_stringConversions	TokenNameIdentifier	 m string Conversions
,	TokenNameCOMMA	
// CLASS_STRING = 3; 	TokenNameCOMMENT_LINE	CLASS_STRING = 3; 
m_nodesetConversions	TokenNameIdentifier	 m nodeset Conversions
,	TokenNameCOMMA	
// CLASS_NODESET = 4; 	TokenNameCOMMENT_LINE	CLASS_NODESET = 4; 
m_rtfConversions	TokenNameIdentifier	 m rtf Conversions
// CLASS_RTREEFRAG = 5; 	TokenNameCOMMENT_LINE	CLASS_RTREEFRAG = 5; 
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
/** * Score the conversion of a set of XSLT arguments to a * given set of Java parameters. * If any invocations of this function for a method with * the same name return the same positive value, then a conflict * has occured, and an error should be signaled. * @param javaParamTypes Must be filled with valid class names, and * of the same length as xsltArgs. * @param xsltArgs Must be filled with valid object instances, and * of the same length as javeParamTypes. * @return -1 for no allowed conversion, or a positive score * that is closer to zero for more preferred, or further from * zero for less preferred. */	TokenNameCOMMENT_JAVADOC	 Score the conversion of a set of XSLT arguments to a given set of Java parameters. If any invocations of this function for a method with the same name return the same positive value, then a conflict has occured, and an error should be signaled. @param javaParamTypes Must be filled with valid class names, and of the same length as xsltArgs. @param xsltArgs Must be filled with valid object instances, and of the same length as javeParamTypes. @return -1 for no allowed conversion, or a positive score that is closer to zero for more preferred, or further from zero for less preferred. 
public	TokenNamepublic	
static	TokenNamestatic	
int	TokenNameint	
scoreMatch	TokenNameIdentifier	 score Match
(	TokenNameLPAREN	
Class	TokenNameIdentifier	 Class
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
javaParamTypes	TokenNameIdentifier	 java Param Types
,	TokenNameCOMMA	
int	TokenNameint	
javaParamsStart	TokenNameIdentifier	 java Params Start
,	TokenNameCOMMA	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
xsltArgs	TokenNameIdentifier	 xslt Args
,	TokenNameCOMMA	
int	TokenNameint	
score	TokenNameIdentifier	 score
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
xsltArgs	TokenNameIdentifier	 xslt Args
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
javaParamTypes	TokenNameIdentifier	 java Param Types
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
score	TokenNameIdentifier	 score
;	TokenNameSEMICOLON	
int	TokenNameint	
nParams	TokenNameIdentifier	 n Params
=	TokenNameEQUAL	
xsltArgs	TokenNameIdentifier	 xslt Args
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
nParams	TokenNameIdentifier	 n Params
-	TokenNameMINUS	
javaParamTypes	TokenNameIdentifier	 java Param Types
.	TokenNameDOT	
length	TokenNameIdentifier	 length
+	TokenNamePLUS	
javaParamsStart	TokenNameIdentifier	 java Params Start
,	TokenNameCOMMA	
javaParamTypesIndex	TokenNameIdentifier	 java Param Types Index
=	TokenNameEQUAL	
javaParamsStart	TokenNameIdentifier	 java Params Start
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
nParams	TokenNameIdentifier	 n Params
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
,	TokenNameCOMMA	
javaParamTypesIndex	TokenNameIdentifier	 java Param Types Index
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Object	TokenNameIdentifier	 Object
xsltObj	TokenNameIdentifier	 xslt Obj
=	TokenNameEQUAL	
xsltArgs	TokenNameIdentifier	 xslt Args
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
int	TokenNameint	
xsltClassType	TokenNameIdentifier	 xslt Class Type
=	TokenNameEQUAL	
(	TokenNameLPAREN	
xsltObj	TokenNameIdentifier	 xslt Obj
instanceof	TokenNameinstanceof	
XObject	TokenNameIdentifier	 X Object
)	TokenNameRPAREN	
?	TokenNameQUESTION	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
XObject	TokenNameIdentifier	 X Object
)	TokenNameRPAREN	
xsltObj	TokenNameIdentifier	 xslt Obj
)	TokenNameRPAREN	
.	TokenNameDOT	
getType	TokenNameIdentifier	 get Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
:	TokenNameCOLON	
XObject	TokenNameIdentifier	 X Object
.	TokenNameDOT	
CLASS_UNKNOWN	TokenNameIdentifier	 CLASS  UNKNOWN
;	TokenNameSEMICOLON	
Class	TokenNameIdentifier	 Class
javaClass	TokenNameIdentifier	 java Class
=	TokenNameEQUAL	
javaParamTypes	TokenNameIdentifier	 java Param Types
[	TokenNameLBRACKET	
javaParamTypesIndex	TokenNameIdentifier	 java Param Types Index
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
// System.out.println("Checking xslt: "+xsltObj.getClass().getName()+ 	TokenNameCOMMENT_LINE	System.out.println("Checking xslt: "+xsltObj.getClass().getName()+ 
// " against java: "+javaClass.getName()); 	TokenNameCOMMENT_LINE	" against java: "+javaClass.getName()); 
if	TokenNameif	
(	TokenNameLPAREN	
xsltClassType	TokenNameIdentifier	 xslt Class Type
==	TokenNameEQUAL_EQUAL	
XObject	TokenNameIdentifier	 X Object
.	TokenNameDOT	
CLASS_NULL	TokenNameIdentifier	 CLASS  NULL
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// In Xalan I have objects of CLASS_NULL, though I'm not 	TokenNameCOMMENT_LINE	In Xalan I have objects of CLASS_NULL, though I'm not 
// sure they're used any more. For now, do something funky. 	TokenNameCOMMENT_LINE	sure they're used any more. For now, do something funky. 
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
javaClass	TokenNameIdentifier	 java Class
.	TokenNameDOT	
isPrimitive	TokenNameIdentifier	 is Primitive
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Then assume that a null can be used, but give it a low score. 	TokenNameCOMMENT_LINE	Then assume that a null can be used, but give it a low score. 
score	TokenNameIdentifier	 score
+=	TokenNamePLUS_EQUAL	
10	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
continue	TokenNamecontinue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
return	TokenNamereturn	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// no match. 	TokenNameCOMMENT_LINE	no match. 
}	TokenNameRBRACE	
ConversionInfo	TokenNameIdentifier	 Conversion Info
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
convInfo	TokenNameIdentifier	 conv Info
=	TokenNameEQUAL	
m_conversions	TokenNameIdentifier	 m conversions
[	TokenNameLBRACKET	
xsltClassType	TokenNameIdentifier	 xslt Class Type
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
int	TokenNameint	
nConversions	TokenNameIdentifier	 n Conversions
=	TokenNameEQUAL	
convInfo	TokenNameIdentifier	 conv Info
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
int	TokenNameint	
k	TokenNameIdentifier	 k
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
k	TokenNameIdentifier	 k
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
k	TokenNameIdentifier	 k
<	TokenNameLESS	
nConversions	TokenNameIdentifier	 n Conversions
;	TokenNameSEMICOLON	
k	TokenNameIdentifier	 k
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ConversionInfo	TokenNameIdentifier	 Conversion Info
cinfo	TokenNameIdentifier	 cinfo
=	TokenNameEQUAL	
convInfo	TokenNameIdentifier	 conv Info
[	TokenNameLBRACKET	
k	TokenNameIdentifier	 k
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
javaClass	TokenNameIdentifier	 java Class
.	TokenNameDOT	
isAssignableFrom	TokenNameIdentifier	 is Assignable From
(	TokenNameLPAREN	
cinfo	TokenNameIdentifier	 cinfo
.	TokenNameDOT	
m_class	TokenNameIdentifier	 m class
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
score	TokenNameIdentifier	 score
+=	TokenNamePLUS_EQUAL	
cinfo	TokenNameIdentifier	 cinfo
.	TokenNameDOT	
m_score	TokenNameIdentifier	 m score
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
// from k loop 	TokenNameCOMMENT_LINE	from k loop 
}	TokenNameRBRACE	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
k	TokenNameIdentifier	 k
==	TokenNameEQUAL_EQUAL	
nConversions	TokenNameIdentifier	 n Conversions
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// If we get here, we haven't made a match on this parameter using 	TokenNameCOMMENT_LINE	If we get here, we haven't made a match on this parameter using 
// the ConversionInfo array. We now try to handle the object -> object 	TokenNameCOMMENT_LINE	the ConversionInfo array. We now try to handle the object -> object 
// mapping which we can't handle through the array mechanism. To do this, 	TokenNameCOMMENT_LINE	mapping which we can't handle through the array mechanism. To do this, 
// we must determine the class of the argument passed from the stylesheet. 	TokenNameCOMMENT_LINE	we must determine the class of the argument passed from the stylesheet. 
// If we were passed a subclass of XObject, representing one of the actual 	TokenNameCOMMENT_LINE	If we were passed a subclass of XObject, representing one of the actual 
// XSLT types, and we are here, we reject this extension method as a candidate 	TokenNameCOMMENT_LINE	XSLT types, and we are here, we reject this extension method as a candidate 
// because a match should have been made using the ConversionInfo array. If we 	TokenNameCOMMENT_LINE	because a match should have been made using the ConversionInfo array. If we 
// were passed an XObject that encapsulates a non-XSLT type or we 	TokenNameCOMMENT_LINE	were passed an XObject that encapsulates a non-XSLT type or we 
// were passed a non-XSLT type directly, we continue. 	TokenNameCOMMENT_LINE	were passed a non-XSLT type directly, we continue. 
// The current implementation (contributed by Kelly Campbell <camk@channelpoint.com>) 	TokenNameCOMMENT_LINE	The current implementation (contributed by Kelly Campbell <camk@channelpoint.com>) 
// checks to see if we were passed an XObject from the XSLT stylesheet. If not, 	TokenNameCOMMENT_LINE	checks to see if we were passed an XObject from the XSLT stylesheet. If not, 
// we use the class of the object that was passed and make sure that it will 	TokenNameCOMMENT_LINE	we use the class of the object that was passed and make sure that it will 
// map to the class type of the parameter in the extension function. 	TokenNameCOMMENT_LINE	map to the class type of the parameter in the extension function. 
// If we were passed an XObject, we attempt to get the class of the actual 	TokenNameCOMMENT_LINE	If we were passed an XObject, we attempt to get the class of the actual 
// object encapsulated inside the XObject. If the encapsulated object is null, 	TokenNameCOMMENT_LINE	object encapsulated inside the XObject. If the encapsulated object is null, 
// we judge this method as a match but give it a low score. 	TokenNameCOMMENT_LINE	we judge this method as a match but give it a low score. 
// If the encapsulated object is not null, we use its type to determine 	TokenNameCOMMENT_LINE	If the encapsulated object is not null, we use its type to determine 
// whether this java method is a valid match for this extension function call. 	TokenNameCOMMENT_LINE	whether this java method is a valid match for this extension function call. 
// This approach eliminates the NullPointerException in the earlier implementation 	TokenNameCOMMENT_LINE	This approach eliminates the NullPointerException in the earlier implementation 
// that resulted from passing an XObject encapsulating the null java object. 	TokenNameCOMMENT_LINE	that resulted from passing an XObject encapsulating the null java object. 
// TODO: This needs to be improved to assign relative scores to subclasses, 	TokenNameCOMMENT_LINE	TODO: This needs to be improved to assign relative scores to subclasses, 
// etc. 	TokenNameCOMMENT_LINE	etc. 
if	TokenNameif	
(	TokenNameLPAREN	
XObject	TokenNameIdentifier	 X Object
.	TokenNameDOT	
CLASS_UNKNOWN	TokenNameIdentifier	 CLASS  UNKNOWN
==	TokenNameEQUAL_EQUAL	
xsltClassType	TokenNameIdentifier	 xslt Class Type
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Class	TokenNameIdentifier	 Class
realClass	TokenNameIdentifier	 real Class
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
xsltObj	TokenNameIdentifier	 xslt Obj
instanceof	TokenNameinstanceof	
XObject	TokenNameIdentifier	 X Object
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Object	TokenNameIdentifier	 Object
realObj	TokenNameIdentifier	 real Obj
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
XObject	TokenNameIdentifier	 X Object
)	TokenNameRPAREN	
xsltObj	TokenNameIdentifier	 xslt Obj
)	TokenNameRPAREN	
.	TokenNameDOT	
object	TokenNameIdentifier	 object
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
realObj	TokenNameIdentifier	 real Obj
)	TokenNameRPAREN	
{	TokenNameLBRACE	
realClass	TokenNameIdentifier	 real Class
=	TokenNameEQUAL	
realObj	TokenNameIdentifier	 real Obj
.	TokenNameDOT	
getClass	TokenNameIdentifier	 get Class
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// do the same as if we were passed XObject.CLASS_NULL 	TokenNameCOMMENT_LINE	do the same as if we were passed XObject.CLASS_NULL 
score	TokenNameIdentifier	 score
+=	TokenNamePLUS_EQUAL	
10	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
continue	TokenNamecontinue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
realClass	TokenNameIdentifier	 real Class
=	TokenNameEQUAL	
xsltObj	TokenNameIdentifier	 xslt Obj
.	TokenNameDOT	
getClass	TokenNameIdentifier	 get Class
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
javaClass	TokenNameIdentifier	 java Class
.	TokenNameDOT	
isAssignableFrom	TokenNameIdentifier	 is Assignable From
(	TokenNameLPAREN	
realClass	TokenNameIdentifier	 real Class
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
score	TokenNameIdentifier	 score
+=	TokenNamePLUS_EQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// TODO: To be assigned based on subclass "distance" 	TokenNameCOMMENT_LINE	TODO: To be assigned based on subclass "distance" 
}	TokenNameRBRACE	
else	TokenNameelse	
return	TokenNamereturn	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
return	TokenNamereturn	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
score	TokenNameIdentifier	 score
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Convert the given XSLT object to an object of * the given class. * @param xsltObj The XSLT object that needs conversion. * @param javaClass The type of object to convert to. * @returns An object suitable for passing to the Method.invoke * function in the args array, which may be null in some cases. * @throws TransformerException may be thrown for Xalan conversion * exceptions. */	TokenNameCOMMENT_JAVADOC	 Convert the given XSLT object to an object of the given class. @param xsltObj The XSLT object that needs conversion. @param javaClass The type of object to convert to. @returns An object suitable for passing to the Method.invoke function in the args array, which may be null in some cases. @throws TransformerException may be thrown for Xalan conversion exceptions. 
static	TokenNamestatic	
Object	TokenNameIdentifier	 Object
convert	TokenNameIdentifier	 convert
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
xsltObj	TokenNameIdentifier	 xslt Obj
,	TokenNameCOMMA	
Class	TokenNameIdentifier	 Class
javaClass	TokenNameIdentifier	 java Class
)	TokenNameRPAREN	
throws	TokenNamethrows	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
transform	TokenNameIdentifier	 transform
.	TokenNameDOT	
TransformerException	TokenNameIdentifier	 Transformer Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
xsltObj	TokenNameIdentifier	 xslt Obj
instanceof	TokenNameinstanceof	
XObject	TokenNameIdentifier	 X Object
)	TokenNameRPAREN	
{	TokenNameLBRACE	
XObject	TokenNameIdentifier	 X Object
xobj	TokenNameIdentifier	 xobj
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
XObject	TokenNameIdentifier	 X Object
)	TokenNameRPAREN	
xsltObj	TokenNameIdentifier	 xslt Obj
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
xsltClassType	TokenNameIdentifier	 xslt Class Type
=	TokenNameEQUAL	
xobj	TokenNameIdentifier	 xobj
.	TokenNameDOT	
getType	TokenNameIdentifier	 get Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
switch	TokenNameswitch	
(	TokenNameLPAREN	
xsltClassType	TokenNameIdentifier	 xslt Class Type
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
XObject	TokenNameIdentifier	 X Object
.	TokenNameDOT	
CLASS_NULL	TokenNameIdentifier	 CLASS  NULL
:	TokenNameCOLON	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
case	TokenNamecase	
XObject	TokenNameIdentifier	 X Object
.	TokenNameDOT	
CLASS_BOOLEAN	TokenNameIdentifier	 CLASS  BOOLEAN
:	TokenNameCOLON	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
javaClass	TokenNameIdentifier	 java Class
==	TokenNameEQUAL_EQUAL	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
lang	TokenNameIdentifier	 lang
.	TokenNameDOT	
String	TokenNameIdentifier	 String
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
return	TokenNamereturn	
xobj	TokenNameIdentifier	 xobj
.	TokenNameDOT	
str	TokenNameIdentifier	 str
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
return	TokenNamereturn	
new	TokenNamenew	
Boolean	TokenNameIdentifier	 Boolean
(	TokenNameLPAREN	
xobj	TokenNameIdentifier	 xobj
.	TokenNameDOT	
bool	TokenNameIdentifier	 bool
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// break; Unreachable 	TokenNameCOMMENT_LINE	break; Unreachable 
case	TokenNamecase	
XObject	TokenNameIdentifier	 X Object
.	TokenNameDOT	
CLASS_NUMBER	TokenNameIdentifier	 CLASS  NUMBER
:	TokenNameCOLON	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
javaClass	TokenNameIdentifier	 java Class
==	TokenNameEQUAL_EQUAL	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
lang	TokenNameIdentifier	 lang
.	TokenNameDOT	
String	TokenNameIdentifier	 String
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
return	TokenNamereturn	
xobj	TokenNameIdentifier	 xobj
.	TokenNameDOT	
str	TokenNameIdentifier	 str
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
javaClass	TokenNameIdentifier	 java Class
==	TokenNameEQUAL_EQUAL	
Boolean	TokenNameIdentifier	 Boolean
.	TokenNameDOT	
TYPE	TokenNameIdentifier	 TYPE
)	TokenNameRPAREN	
return	TokenNamereturn	
new	TokenNamenew	
Boolean	TokenNameIdentifier	 Boolean
(	TokenNameLPAREN	
xobj	TokenNameIdentifier	 xobj
.	TokenNameDOT	
bool	TokenNameIdentifier	 bool
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
{	TokenNameLBRACE	
return	TokenNamereturn	
convertDoubleToNumber	TokenNameIdentifier	 convert Double To Number
(	TokenNameLPAREN	
xobj	TokenNameIdentifier	 xobj
.	TokenNameDOT	
num	TokenNameIdentifier	 num
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
javaClass	TokenNameIdentifier	 java Class
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// break; Unreachable 	TokenNameCOMMENT_LINE	break; Unreachable 
case	TokenNamecase	
XObject	TokenNameIdentifier	 X Object
.	TokenNameDOT	
CLASS_STRING	TokenNameIdentifier	 CLASS  STRING
:	TokenNameCOLON	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
javaClass	TokenNameIdentifier	 java Class
==	TokenNameEQUAL_EQUAL	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
lang	TokenNameIdentifier	 lang
.	TokenNameDOT	
String	TokenNameIdentifier	 String
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
javaClass	TokenNameIdentifier	 java Class
==	TokenNameEQUAL_EQUAL	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
lang	TokenNameIdentifier	 lang
.	TokenNameDOT	
Object	TokenNameIdentifier	 Object
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
xobj	TokenNameIdentifier	 xobj
.	TokenNameDOT	
str	TokenNameIdentifier	 str
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
javaClass	TokenNameIdentifier	 java Class
==	TokenNameEQUAL_EQUAL	
Character	TokenNameIdentifier	 Character
.	TokenNameDOT	
TYPE	TokenNameIdentifier	 TYPE
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
str	TokenNameIdentifier	 str
=	TokenNameEQUAL	
xobj	TokenNameIdentifier	 xobj
.	TokenNameDOT	
str	TokenNameIdentifier	 str
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
str	TokenNameIdentifier	 str
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
return	TokenNamereturn	
new	TokenNamenew	
Character	TokenNameIdentifier	 Character
(	TokenNameLPAREN	
str	TokenNameIdentifier	 str
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
// ?? 	TokenNameCOMMENT_LINE	?? 
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
javaClass	TokenNameIdentifier	 java Class
==	TokenNameEQUAL_EQUAL	
Boolean	TokenNameIdentifier	 Boolean
.	TokenNameDOT	
TYPE	TokenNameIdentifier	 TYPE
)	TokenNameRPAREN	
return	TokenNamereturn	
new	TokenNamenew	
Boolean	TokenNameIdentifier	 Boolean
(	TokenNameLPAREN	
xobj	TokenNameIdentifier	 xobj
.	TokenNameDOT	
bool	TokenNameIdentifier	 bool
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
{	TokenNameLBRACE	
return	TokenNamereturn	
convertDoubleToNumber	TokenNameIdentifier	 convert Double To Number
(	TokenNameLPAREN	
xobj	TokenNameIdentifier	 xobj
.	TokenNameDOT	
num	TokenNameIdentifier	 num
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
javaClass	TokenNameIdentifier	 java Class
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// break; Unreachable 	TokenNameCOMMENT_LINE	break; Unreachable 
case	TokenNamecase	
XObject	TokenNameIdentifier	 X Object
.	TokenNameDOT	
CLASS_RTREEFRAG	TokenNameIdentifier	 CLASS  RTREEFRAG
:	TokenNameCOLON	
{	TokenNameLBRACE	
// GLP: I don't see the reason for the isAssignableFrom call 	TokenNameCOMMENT_LINE	GLP: I don't see the reason for the isAssignableFrom call 
// instead of an == test as is used everywhere else. 	TokenNameCOMMENT_LINE	instead of an == test as is used everywhere else. 
// Besides, if the javaClass is a subclass of NodeIterator 	TokenNameCOMMENT_LINE	Besides, if the javaClass is a subclass of NodeIterator 
// the condition will be true and we'll create a NodeIterator 	TokenNameCOMMENT_LINE	the condition will be true and we'll create a NodeIterator 
// which may not match the javaClass, causing a RuntimeException. 	TokenNameCOMMENT_LINE	which may not match the javaClass, causing a RuntimeException. 
// if((NodeIterator.class.isAssignableFrom(javaClass)) || 	TokenNameCOMMENT_LINE	if((NodeIterator.class.isAssignableFrom(javaClass)) || 
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
javaClass	TokenNameIdentifier	 java Class
==	TokenNameEQUAL_EQUAL	
NodeIterator	TokenNameIdentifier	 Node Iterator
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
javaClass	TokenNameIdentifier	 java Class
==	TokenNameEQUAL_EQUAL	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
lang	TokenNameIdentifier	 lang
.	TokenNameDOT	
Object	TokenNameIdentifier	 Object
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
DTMIterator	TokenNameIdentifier	 DTM Iterator
dtmIter	TokenNameIdentifier	 dtm Iter
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
XRTreeFrag	TokenNameIdentifier	 XR Tree Frag
)	TokenNameRPAREN	
xobj	TokenNameIdentifier	 xobj
)	TokenNameRPAREN	
.	TokenNameDOT	
asNodeIterator	TokenNameIdentifier	 as Node Iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
new	TokenNamenew	
DTMNodeIterator	TokenNameIdentifier	 DTM Node Iterator
(	TokenNameLPAREN	
dtmIter	TokenNameIdentifier	 dtm Iter
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
javaClass	TokenNameIdentifier	 java Class
==	TokenNameEQUAL_EQUAL	
NodeList	TokenNameIdentifier	 Node List
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
XRTreeFrag	TokenNameIdentifier	 XR Tree Frag
)	TokenNameRPAREN	
xobj	TokenNameIdentifier	 xobj
)	TokenNameRPAREN	
.	TokenNameDOT	
convertToNodeset	TokenNameIdentifier	 convert To Nodeset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Same comment as above 	TokenNameCOMMENT_LINE	Same comment as above 
// else if(Node.class.isAssignableFrom(javaClass)) 	TokenNameCOMMENT_LINE	else if(Node.class.isAssignableFrom(javaClass)) 
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
javaClass	TokenNameIdentifier	 java Class
==	TokenNameEQUAL_EQUAL	
Node	TokenNameIdentifier	 Node
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
DTMIterator	TokenNameIdentifier	 DTM Iterator
iter	TokenNameIdentifier	 iter
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
XRTreeFrag	TokenNameIdentifier	 XR Tree Frag
)	TokenNameRPAREN	
xobj	TokenNameIdentifier	 xobj
)	TokenNameRPAREN	
.	TokenNameDOT	
asNodeIterator	TokenNameIdentifier	 as Node Iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
rootHandle	TokenNameIdentifier	 root Handle
=	TokenNameEQUAL	
iter	TokenNameIdentifier	 iter
.	TokenNameDOT	
nextNode	TokenNameIdentifier	 next Node
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
DTM	TokenNameIdentifier	 DTM
dtm	TokenNameIdentifier	 dtm
=	TokenNameEQUAL	
iter	TokenNameIdentifier	 iter
.	TokenNameDOT	
getDTM	TokenNameIdentifier	 get DTM
(	TokenNameLPAREN	
rootHandle	TokenNameIdentifier	 root Handle
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
dtm	TokenNameIdentifier	 dtm
.	TokenNameDOT	
getNode	TokenNameIdentifier	 get Node
(	TokenNameLPAREN	
dtm	TokenNameIdentifier	 dtm
.	TokenNameDOT	
getFirstChild	TokenNameIdentifier	 get First Child
(	TokenNameLPAREN	
rootHandle	TokenNameIdentifier	 root Handle
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
javaClass	TokenNameIdentifier	 java Class
==	TokenNameEQUAL_EQUAL	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
lang	TokenNameIdentifier	 lang
.	TokenNameDOT	
String	TokenNameIdentifier	 String
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
xobj	TokenNameIdentifier	 xobj
.	TokenNameDOT	
str	TokenNameIdentifier	 str
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
javaClass	TokenNameIdentifier	 java Class
==	TokenNameEQUAL_EQUAL	
Boolean	TokenNameIdentifier	 Boolean
.	TokenNameDOT	
TYPE	TokenNameIdentifier	 TYPE
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
Boolean	TokenNameIdentifier	 Boolean
(	TokenNameLPAREN	
xobj	TokenNameIdentifier	 xobj
.	TokenNameDOT	
bool	TokenNameIdentifier	 bool
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
javaClass	TokenNameIdentifier	 java Class
.	TokenNameDOT	
isPrimitive	TokenNameIdentifier	 is Primitive
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
convertDoubleToNumber	TokenNameIdentifier	 convert Double To Number
(	TokenNameLPAREN	
xobj	TokenNameIdentifier	 xobj
.	TokenNameDOT	
num	TokenNameIdentifier	 num
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
javaClass	TokenNameIdentifier	 java Class
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
DTMIterator	TokenNameIdentifier	 DTM Iterator
iter	TokenNameIdentifier	 iter
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
XRTreeFrag	TokenNameIdentifier	 XR Tree Frag
)	TokenNameRPAREN	
xobj	TokenNameIdentifier	 xobj
)	TokenNameRPAREN	
.	TokenNameDOT	
asNodeIterator	TokenNameIdentifier	 as Node Iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
rootHandle	TokenNameIdentifier	 root Handle
=	TokenNameEQUAL	
iter	TokenNameIdentifier	 iter
.	TokenNameDOT	
nextNode	TokenNameIdentifier	 next Node
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
DTM	TokenNameIdentifier	 DTM
dtm	TokenNameIdentifier	 dtm
=	TokenNameEQUAL	
iter	TokenNameIdentifier	 iter
.	TokenNameDOT	
getDTM	TokenNameIdentifier	 get DTM
(	TokenNameLPAREN	
rootHandle	TokenNameIdentifier	 root Handle
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Node	TokenNameIdentifier	 Node
child	TokenNameIdentifier	 child
=	TokenNameEQUAL	
dtm	TokenNameIdentifier	 dtm
.	TokenNameDOT	
getNode	TokenNameIdentifier	 get Node
(	TokenNameLPAREN	
dtm	TokenNameIdentifier	 dtm
.	TokenNameDOT	
getFirstChild	TokenNameIdentifier	 get First Child
(	TokenNameLPAREN	
rootHandle	TokenNameIdentifier	 root Handle
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
javaClass	TokenNameIdentifier	 java Class
.	TokenNameDOT	
isAssignableFrom	TokenNameIdentifier	 is Assignable From
(	TokenNameLPAREN	
child	TokenNameIdentifier	 child
.	TokenNameDOT	
getClass	TokenNameIdentifier	 get Class
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
child	TokenNameIdentifier	 child
;	TokenNameSEMICOLON	
else	TokenNameelse	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// break; Unreachable 	TokenNameCOMMENT_LINE	break; Unreachable 
case	TokenNamecase	
XObject	TokenNameIdentifier	 X Object
.	TokenNameDOT	
CLASS_NODESET	TokenNameIdentifier	 CLASS  NODESET
:	TokenNameCOLON	
{	TokenNameLBRACE	
// GLP: I don't see the reason for the isAssignableFrom call 	TokenNameCOMMENT_LINE	GLP: I don't see the reason for the isAssignableFrom call 
// instead of an == test as is used everywhere else. 	TokenNameCOMMENT_LINE	instead of an == test as is used everywhere else. 
// Besides, if the javaClass is a subclass of NodeIterator 	TokenNameCOMMENT_LINE	Besides, if the javaClass is a subclass of NodeIterator 
// the condition will be true and we'll create a NodeIterator 	TokenNameCOMMENT_LINE	the condition will be true and we'll create a NodeIterator 
// which may not match the javaClass, causing a RuntimeException. 	TokenNameCOMMENT_LINE	which may not match the javaClass, causing a RuntimeException. 
// if((NodeIterator.class.isAssignableFrom(javaClass)) || 	TokenNameCOMMENT_LINE	if((NodeIterator.class.isAssignableFrom(javaClass)) || 
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
javaClass	TokenNameIdentifier	 java Class
==	TokenNameEQUAL_EQUAL	
NodeIterator	TokenNameIdentifier	 Node Iterator
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
javaClass	TokenNameIdentifier	 java Class
==	TokenNameEQUAL_EQUAL	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
lang	TokenNameIdentifier	 lang
.	TokenNameDOT	
Object	TokenNameIdentifier	 Object
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
xobj	TokenNameIdentifier	 xobj
.	TokenNameDOT	
nodeset	TokenNameIdentifier	 nodeset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Same comment as above 	TokenNameCOMMENT_LINE	Same comment as above 
// else if(NodeList.class.isAssignableFrom(javaClass)) 	TokenNameCOMMENT_LINE	else if(NodeList.class.isAssignableFrom(javaClass)) 
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
javaClass	TokenNameIdentifier	 java Class
==	TokenNameEQUAL_EQUAL	
NodeList	TokenNameIdentifier	 Node List
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
xobj	TokenNameIdentifier	 xobj
.	TokenNameDOT	
nodelist	TokenNameIdentifier	 nodelist
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Same comment as above 	TokenNameCOMMENT_LINE	Same comment as above 
// else if(Node.class.isAssignableFrom(javaClass)) 	TokenNameCOMMENT_LINE	else if(Node.class.isAssignableFrom(javaClass)) 
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
javaClass	TokenNameIdentifier	 java Class
==	TokenNameEQUAL_EQUAL	
Node	TokenNameIdentifier	 Node
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Xalan ensures that iter() always returns an 	TokenNameCOMMENT_LINE	Xalan ensures that iter() always returns an 
// iterator positioned at the beginning. 	TokenNameCOMMENT_LINE	iterator positioned at the beginning. 
DTMIterator	TokenNameIdentifier	 DTM Iterator
ni	TokenNameIdentifier	 ni
=	TokenNameEQUAL	
xobj	TokenNameIdentifier	 xobj
.	TokenNameDOT	
iter	TokenNameIdentifier	 iter
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
handle	TokenNameIdentifier	 handle
=	TokenNameEQUAL	
ni	TokenNameIdentifier	 ni
.	TokenNameDOT	
nextNode	TokenNameIdentifier	 next Node
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
handle	TokenNameIdentifier	 handle
!=	TokenNameNOT_EQUAL	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
NULL	TokenNameIdentifier	 NULL
)	TokenNameRPAREN	
return	TokenNamereturn	
ni	TokenNameIdentifier	 ni
.	TokenNameDOT	
getDTM	TokenNameIdentifier	 get DTM
(	TokenNameLPAREN	
handle	TokenNameIdentifier	 handle
)	TokenNameRPAREN	
.	TokenNameDOT	
getNode	TokenNameIdentifier	 get Node
(	TokenNameLPAREN	
handle	TokenNameIdentifier	 handle
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// may be null. 	TokenNameCOMMENT_LINE	may be null. 
else	TokenNameelse	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
javaClass	TokenNameIdentifier	 java Class
==	TokenNameEQUAL_EQUAL	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
lang	TokenNameIdentifier	 lang
.	TokenNameDOT	
String	TokenNameIdentifier	 String
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
xobj	TokenNameIdentifier	 xobj
.	TokenNameDOT	
str	TokenNameIdentifier	 str
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
javaClass	TokenNameIdentifier	 java Class
==	TokenNameEQUAL_EQUAL	
Boolean	TokenNameIdentifier	 Boolean
.	TokenNameDOT	
TYPE	TokenNameIdentifier	 TYPE
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
Boolean	TokenNameIdentifier	 Boolean
(	TokenNameLPAREN	
xobj	TokenNameIdentifier	 xobj
.	TokenNameDOT	
bool	TokenNameIdentifier	 bool
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
javaClass	TokenNameIdentifier	 java Class
.	TokenNameDOT	
isPrimitive	TokenNameIdentifier	 is Primitive
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
convertDoubleToNumber	TokenNameIdentifier	 convert Double To Number
(	TokenNameLPAREN	
xobj	TokenNameIdentifier	 xobj
.	TokenNameDOT	
num	TokenNameIdentifier	 num
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
javaClass	TokenNameIdentifier	 java Class
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
DTMIterator	TokenNameIdentifier	 DTM Iterator
iter	TokenNameIdentifier	 iter
=	TokenNameEQUAL	
xobj	TokenNameIdentifier	 xobj
.	TokenNameDOT	
iter	TokenNameIdentifier	 iter
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
childHandle	TokenNameIdentifier	 child Handle
=	TokenNameEQUAL	
iter	TokenNameIdentifier	 iter
.	TokenNameDOT	
nextNode	TokenNameIdentifier	 next Node
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
DTM	TokenNameIdentifier	 DTM
dtm	TokenNameIdentifier	 dtm
=	TokenNameEQUAL	
iter	TokenNameIdentifier	 iter
.	TokenNameDOT	
getDTM	TokenNameIdentifier	 get DTM
(	TokenNameLPAREN	
childHandle	TokenNameIdentifier	 child Handle
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Node	TokenNameIdentifier	 Node
child	TokenNameIdentifier	 child
=	TokenNameEQUAL	
dtm	TokenNameIdentifier	 dtm
.	TokenNameDOT	
getNode	TokenNameIdentifier	 get Node
(	TokenNameLPAREN	
childHandle	TokenNameIdentifier	 child Handle
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
javaClass	TokenNameIdentifier	 java Class
.	TokenNameDOT	
isAssignableFrom	TokenNameIdentifier	 is Assignable From
(	TokenNameLPAREN	
child	TokenNameIdentifier	 child
.	TokenNameDOT	
getClass	TokenNameIdentifier	 get Class
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
child	TokenNameIdentifier	 child
;	TokenNameSEMICOLON	
else	TokenNameelse	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// break; Unreachable 	TokenNameCOMMENT_LINE	break; Unreachable 
// No default:, fall-through on purpose 	TokenNameCOMMENT_LINE	No default:, fall-through on purpose 
}	TokenNameRBRACE	
// end switch 	TokenNameCOMMENT_LINE	end switch 
xsltObj	TokenNameIdentifier	 xslt Obj
=	TokenNameEQUAL	
xobj	TokenNameIdentifier	 xobj
.	TokenNameDOT	
object	TokenNameIdentifier	 object
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// end if if(xsltObj instanceof XObject) 	TokenNameCOMMENT_LINE	end if if(xsltObj instanceof XObject) 
// At this point, we have a raw java object, not an XObject. 	TokenNameCOMMENT_LINE	At this point, we have a raw java object, not an XObject. 
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
xsltObj	TokenNameIdentifier	 xslt Obj
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
javaClass	TokenNameIdentifier	 java Class
==	TokenNameEQUAL_EQUAL	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
lang	TokenNameIdentifier	 lang
.	TokenNameDOT	
String	TokenNameIdentifier	 String
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
xsltObj	TokenNameIdentifier	 xslt Obj
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
javaClass	TokenNameIdentifier	 java Class
.	TokenNameDOT	
isPrimitive	TokenNameIdentifier	 is Primitive
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Assume a number conversion 	TokenNameCOMMENT_LINE	Assume a number conversion 
XString	TokenNameIdentifier	 X String
xstr	TokenNameIdentifier	 xstr
=	TokenNameEQUAL	
new	TokenNamenew	
XString	TokenNameIdentifier	 X String
(	TokenNameLPAREN	
xsltObj	TokenNameIdentifier	 xslt Obj
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
double	TokenNamedouble	
num	TokenNameIdentifier	 num
=	TokenNameEQUAL	
xstr	TokenNameIdentifier	 xstr
.	TokenNameDOT	
num	TokenNameIdentifier	 num
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
convertDoubleToNumber	TokenNameIdentifier	 convert Double To Number
(	TokenNameLPAREN	
num	TokenNameIdentifier	 num
,	TokenNameCOMMA	
javaClass	TokenNameIdentifier	 java Class
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
javaClass	TokenNameIdentifier	 java Class
==	TokenNameEQUAL_EQUAL	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
lang	TokenNameIdentifier	 lang
.	TokenNameDOT	
Class	TokenNameIdentifier	 Class
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
xsltObj	TokenNameIdentifier	 xslt Obj
.	TokenNameDOT	
getClass	TokenNameIdentifier	 get Class
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// Just pass the object directly, and hope for the best. 	TokenNameCOMMENT_LINE	Just pass the object directly, and hope for the best. 
return	TokenNamereturn	
xsltObj	TokenNameIdentifier	 xslt Obj
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// Just pass the object directly, and hope for the best. 	TokenNameCOMMENT_LINE	Just pass the object directly, and hope for the best. 
return	TokenNamereturn	
xsltObj	TokenNameIdentifier	 xslt Obj
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Do a standard conversion of a double to the specified type. * @param num The number to be converted. * @param javaClass The class type to be converted to. * @return An object specified by javaClass, or a Double instance. */	TokenNameCOMMENT_JAVADOC	 Do a standard conversion of a double to the specified type. @param num The number to be converted. @param javaClass The class type to be converted to. @return An object specified by javaClass, or a Double instance. 
static	TokenNamestatic	
Object	TokenNameIdentifier	 Object
convertDoubleToNumber	TokenNameIdentifier	 convert Double To Number
(	TokenNameLPAREN	
double	TokenNamedouble	
num	TokenNameIdentifier	 num
,	TokenNameCOMMA	
Class	TokenNameIdentifier	 Class
javaClass	TokenNameIdentifier	 java Class
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// In the code below, I don't check for NaN, etc., instead 	TokenNameCOMMENT_LINE	In the code below, I don't check for NaN, etc., instead 
// using the standard Java conversion, as I think we should 	TokenNameCOMMENT_LINE	using the standard Java conversion, as I think we should 
// specify. See issue-runtime-errors. 	TokenNameCOMMENT_LINE	specify. See issue-runtime-errors. 
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
javaClass	TokenNameIdentifier	 java Class
==	TokenNameEQUAL_EQUAL	
Double	TokenNameIdentifier	 Double
.	TokenNameDOT	
TYPE	TokenNameIdentifier	 TYPE
)	TokenNameRPAREN	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
javaClass	TokenNameIdentifier	 java Class
==	TokenNameEQUAL_EQUAL	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
lang	TokenNameIdentifier	 lang
.	TokenNameDOT	
Double	TokenNameIdentifier	 Double
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
new	TokenNamenew	
Double	TokenNameIdentifier	 Double
(	TokenNameLPAREN	
num	TokenNameIdentifier	 num
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
javaClass	TokenNameIdentifier	 java Class
==	TokenNameEQUAL_EQUAL	
Float	TokenNameIdentifier	 Float
.	TokenNameDOT	
TYPE	TokenNameIdentifier	 TYPE
)	TokenNameRPAREN	
return	TokenNamereturn	
new	TokenNamenew	
Float	TokenNameIdentifier	 Float
(	TokenNameLPAREN	
num	TokenNameIdentifier	 num
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
javaClass	TokenNameIdentifier	 java Class
==	TokenNameEQUAL_EQUAL	
Long	TokenNameIdentifier	 Long
.	TokenNameDOT	
TYPE	TokenNameIdentifier	 TYPE
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Use standard Java Narrowing Primitive Conversion 	TokenNameCOMMENT_LINE	Use standard Java Narrowing Primitive Conversion 
// See http://java.sun.com/docs/books/jls/html/5.doc.html#175672 	TokenNameCOMMENT_LINE	See http://java.sun.com/docs/books/jls/html/5.doc.html#175672 
return	TokenNamereturn	
new	TokenNamenew	
Long	TokenNameIdentifier	 Long
(	TokenNameLPAREN	
(	TokenNameLPAREN	
long	TokenNamelong	
)	TokenNameRPAREN	
num	TokenNameIdentifier	 num
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
javaClass	TokenNameIdentifier	 java Class
==	TokenNameEQUAL_EQUAL	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
TYPE	TokenNameIdentifier	 TYPE
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Use standard Java Narrowing Primitive Conversion 	TokenNameCOMMENT_LINE	Use standard Java Narrowing Primitive Conversion 
// See http://java.sun.com/docs/books/jls/html/5.doc.html#175672 	TokenNameCOMMENT_LINE	See http://java.sun.com/docs/books/jls/html/5.doc.html#175672 
return	TokenNamereturn	
new	TokenNamenew	
Integer	TokenNameIdentifier	 Integer
(	TokenNameLPAREN	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
num	TokenNameIdentifier	 num
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
javaClass	TokenNameIdentifier	 java Class
==	TokenNameEQUAL_EQUAL	
Short	TokenNameIdentifier	 Short
.	TokenNameDOT	
TYPE	TokenNameIdentifier	 TYPE
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Use standard Java Narrowing Primitive Conversion 	TokenNameCOMMENT_LINE	Use standard Java Narrowing Primitive Conversion 
// See http://java.sun.com/docs/books/jls/html/5.doc.html#175672 	TokenNameCOMMENT_LINE	See http://java.sun.com/docs/books/jls/html/5.doc.html#175672 
return	TokenNamereturn	
new	TokenNamenew	
Short	TokenNameIdentifier	 Short
(	TokenNameLPAREN	
(	TokenNameLPAREN	
short	TokenNameshort	
)	TokenNameRPAREN	
num	TokenNameIdentifier	 num
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
javaClass	TokenNameIdentifier	 java Class
==	TokenNameEQUAL_EQUAL	
Character	TokenNameIdentifier	 Character
.	TokenNameDOT	
TYPE	TokenNameIdentifier	 TYPE
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Use standard Java Narrowing Primitive Conversion 	TokenNameCOMMENT_LINE	Use standard Java Narrowing Primitive Conversion 
// See http://java.sun.com/docs/books/jls/html/5.doc.html#175672 	TokenNameCOMMENT_LINE	See http://java.sun.com/docs/books/jls/html/5.doc.html#175672 
return	TokenNamereturn	
new	TokenNamenew	
Character	TokenNameIdentifier	 Character
(	TokenNameLPAREN	
(	TokenNameLPAREN	
char	TokenNamechar	
)	TokenNameRPAREN	
num	TokenNameIdentifier	 num
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
javaClass	TokenNameIdentifier	 java Class
==	TokenNameEQUAL_EQUAL	
Byte	TokenNameIdentifier	 Byte
.	TokenNameDOT	
TYPE	TokenNameIdentifier	 TYPE
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Use standard Java Narrowing Primitive Conversion 	TokenNameCOMMENT_LINE	Use standard Java Narrowing Primitive Conversion 
// See http://java.sun.com/docs/books/jls/html/5.doc.html#175672 	TokenNameCOMMENT_LINE	See http://java.sun.com/docs/books/jls/html/5.doc.html#175672 
return	TokenNamereturn	
new	TokenNamenew	
Byte	TokenNameIdentifier	 Byte
(	TokenNameLPAREN	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
num	TokenNameIdentifier	 num
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
// Some other type of object 	TokenNameCOMMENT_LINE	Some other type of object 
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
Double	TokenNameIdentifier	 Double
(	TokenNameLPAREN	
num	TokenNameIdentifier	 num
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Format the message for the NoSuchMethodException containing * all the information about the method we're looking for. */	TokenNameCOMMENT_JAVADOC	 Format the message for the NoSuchMethodException containing all the information about the method we're looking for. 
private	TokenNameprivate	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
errString	TokenNameIdentifier	 err String
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
callType	TokenNameIdentifier	 call Type
,	TokenNameCOMMA	
// "function" or "element" 	TokenNameCOMMENT_LINE	"function" or "element" 
String	TokenNameIdentifier	 String
searchType	TokenNameIdentifier	 search Type
,	TokenNameCOMMA	
// "method" or "constructor" 	TokenNameCOMMENT_LINE	"method" or "constructor" 
Class	TokenNameIdentifier	 Class
classObj	TokenNameIdentifier	 class Obj
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
funcName	TokenNameIdentifier	 func Name
,	TokenNameCOMMA	
int	TokenNameint	
searchMethod	TokenNameIdentifier	 search Method
,	TokenNameCOMMA	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
xsltArgs	TokenNameIdentifier	 xslt Args
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
resultString	TokenNameIdentifier	 result String
=	TokenNameEQUAL	
"For extension "	TokenNameStringLiteral	For extension 
+	TokenNamePLUS	
callType	TokenNameIdentifier	 call Type
+	TokenNamePLUS	
", could not find "	TokenNameStringLiteral	, could not find 
+	TokenNamePLUS	
searchType	TokenNameIdentifier	 search Type
+	TokenNamePLUS	
" "	TokenNameStringLiteral	 
;	TokenNameSEMICOLON	
switch	TokenNameswitch	
(	TokenNameLPAREN	
searchMethod	TokenNameIdentifier	 search Method
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
STATIC_ONLY	TokenNameIdentifier	 STATIC  ONLY
:	TokenNameCOLON	
return	TokenNamereturn	
resultString	TokenNameIdentifier	 result String
+	TokenNamePLUS	
"static "	TokenNameStringLiteral	static 
+	TokenNamePLUS	
classObj	TokenNameIdentifier	 class Obj
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
"."	TokenNameStringLiteral	.
+	TokenNamePLUS	
funcName	TokenNameIdentifier	 func Name
+	TokenNamePLUS	
"([ExpressionContext,] "	TokenNameStringLiteral	([ExpressionContext,] 
+	TokenNamePLUS	
errArgs	TokenNameIdentifier	 err Args
(	TokenNameLPAREN	
xsltArgs	TokenNameIdentifier	 xslt Args
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
+	TokenNamePLUS	
")."	TokenNameStringLiteral	).
;	TokenNameSEMICOLON	
case	TokenNamecase	
INSTANCE_ONLY	TokenNameIdentifier	 INSTANCE  ONLY
:	TokenNameCOLON	
return	TokenNamereturn	
resultString	TokenNameIdentifier	 result String
+	TokenNamePLUS	
classObj	TokenNameIdentifier	 class Obj
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
"."	TokenNameStringLiteral	.
+	TokenNamePLUS	
funcName	TokenNameIdentifier	 func Name
+	TokenNamePLUS	
"([ExpressionContext,] "	TokenNameStringLiteral	([ExpressionContext,] 
+	TokenNamePLUS	
errArgs	TokenNameIdentifier	 err Args
(	TokenNameLPAREN	
xsltArgs	TokenNameIdentifier	 xslt Args
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
+	TokenNamePLUS	
")."	TokenNameStringLiteral	).
;	TokenNameSEMICOLON	
case	TokenNamecase	
STATIC_AND_INSTANCE	TokenNameIdentifier	 STATIC  AND  INSTANCE
:	TokenNameCOLON	
return	TokenNamereturn	
resultString	TokenNameIdentifier	 result String
+	TokenNamePLUS	
classObj	TokenNameIdentifier	 class Obj
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
"."	TokenNameStringLiteral	.
+	TokenNamePLUS	
funcName	TokenNameIdentifier	 func Name
+	TokenNamePLUS	
"([ExpressionContext,] "	TokenNameStringLiteral	([ExpressionContext,] 
+	TokenNamePLUS	
errArgs	TokenNameIdentifier	 err Args
(	TokenNameLPAREN	
xsltArgs	TokenNameIdentifier	 xslt Args
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
+	TokenNamePLUS	
"). "	TokenNameStringLiteral	). 
+	TokenNamePLUS	
"Checked both static and instance methods."	TokenNameStringLiteral	Checked both static and instance methods.
;	TokenNameSEMICOLON	
case	TokenNamecase	
DYNAMIC	TokenNameIdentifier	 DYNAMIC
:	TokenNameCOLON	
return	TokenNamereturn	
resultString	TokenNameIdentifier	 result String
+	TokenNamePLUS	
"static "	TokenNameStringLiteral	static 
+	TokenNamePLUS	
classObj	TokenNameIdentifier	 class Obj
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
"."	TokenNameStringLiteral	.
+	TokenNamePLUS	
funcName	TokenNameIdentifier	 func Name
+	TokenNamePLUS	
"([ExpressionContext, ]"	TokenNameStringLiteral	([ExpressionContext, ]
+	TokenNamePLUS	
errArgs	TokenNameIdentifier	 err Args
(	TokenNameLPAREN	
xsltArgs	TokenNameIdentifier	 xslt Args
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
+	TokenNamePLUS	
") nor "	TokenNameStringLiteral	) nor 
+	TokenNamePLUS	
classObj	TokenNameIdentifier	 class Obj
+	TokenNamePLUS	
"."	TokenNameStringLiteral	.
+	TokenNamePLUS	
funcName	TokenNameIdentifier	 func Name
+	TokenNamePLUS	
"([ExpressionContext,] "	TokenNameStringLiteral	([ExpressionContext,] 
+	TokenNamePLUS	
errArgs	TokenNameIdentifier	 err Args
(	TokenNameLPAREN	
xsltArgs	TokenNameIdentifier	 xslt Args
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
+	TokenNamePLUS	
")."	TokenNameStringLiteral	).
;	TokenNameSEMICOLON	
default	TokenNamedefault	
:	TokenNameCOLON	
if	TokenNameif	
(	TokenNameLPAREN	
callType	TokenNameIdentifier	 call Type
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
"function"	TokenNameStringLiteral	function
)	TokenNameRPAREN	
)	TokenNameRPAREN	
// must be a constructor 	TokenNameCOMMENT_LINE	must be a constructor 
{	TokenNameLBRACE	
return	TokenNamereturn	
resultString	TokenNameIdentifier	 result String
+	TokenNamePLUS	
classObj	TokenNameIdentifier	 class Obj
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
"([ExpressionContext,] "	TokenNameStringLiteral	([ExpressionContext,] 
+	TokenNamePLUS	
errArgs	TokenNameIdentifier	 err Args
(	TokenNameLPAREN	
xsltArgs	TokenNameIdentifier	 xslt Args
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
+	TokenNamePLUS	
")."	TokenNameStringLiteral	).
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
// must be an element call 	TokenNameCOMMENT_LINE	must be an element call 
{	TokenNameLBRACE	
return	TokenNamereturn	
resultString	TokenNameIdentifier	 result String
+	TokenNamePLUS	
classObj	TokenNameIdentifier	 class Obj
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
"."	TokenNameStringLiteral	.
+	TokenNamePLUS	
funcName	TokenNameIdentifier	 func Name
+	TokenNamePLUS	
"(org.apache.xalan.extensions.XSLProcessorContext, "	TokenNameStringLiteral	(org.apache.xalan.extensions.XSLProcessorContext, 
+	TokenNamePLUS	
"org.apache.xalan.templates.ElemExtensionCall)."	TokenNameStringLiteral	org.apache.xalan.templates.ElemExtensionCall).
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
errArgs	TokenNameIdentifier	 err Args
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
xsltArgs	TokenNameIdentifier	 xslt Args
,	TokenNameCOMMA	
int	TokenNameint	
startingArg	TokenNameIdentifier	 starting Arg
)	TokenNameRPAREN	
{	TokenNameLBRACE	
StringBuffer	TokenNameIdentifier	 String Buffer
returnArgs	TokenNameIdentifier	 return Args
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
startingArg	TokenNameIdentifier	 starting Arg
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
xsltArgs	TokenNameIdentifier	 xslt Args
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
!=	TokenNameNOT_EQUAL	
startingArg	TokenNameIdentifier	 starting Arg
)	TokenNameRPAREN	
returnArgs	TokenNameIdentifier	 return Args
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
", "	TokenNameStringLiteral	, 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
xsltArgs	TokenNameIdentifier	 xslt Args
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
instanceof	TokenNameinstanceof	
XObject	TokenNameIdentifier	 X Object
)	TokenNameRPAREN	
returnArgs	TokenNameIdentifier	 return Args
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
XObject	TokenNameIdentifier	 X Object
)	TokenNameRPAREN	
xsltArgs	TokenNameIdentifier	 xslt Args
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
.	TokenNameDOT	
getTypeString	TokenNameIdentifier	 get Type String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
returnArgs	TokenNameIdentifier	 return Args
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
xsltArgs	TokenNameIdentifier	 xslt Args
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
getClass	TokenNameIdentifier	 get Class
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
returnArgs	TokenNameIdentifier	 return Args
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
