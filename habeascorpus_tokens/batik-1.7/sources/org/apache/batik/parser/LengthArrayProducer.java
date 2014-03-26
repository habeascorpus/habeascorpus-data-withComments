/* Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
batik	TokenNameIdentifier	 batik
.	TokenNameDOT	
parser	TokenNameIdentifier	 parser
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
LinkedList	TokenNameIdentifier	 Linked List
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
w3c	TokenNameIdentifier	 w3c
.	TokenNameDOT	
dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
svg	TokenNameIdentifier	 svg
.	TokenNameDOT	
SVGLength	TokenNameIdentifier	 SVG Length
;	TokenNameSEMICOLON	
/** * A handler class that generates an array of shorts and an array floats from * parsing a length list. * * @author <a href="mailto:cam%40mcc%2eid%2eau">Cameron McCormack</a> * @version $Id: LengthArrayProducer.java 475477 2006-11-15 22:44:28Z cam $ */	TokenNameCOMMENT_JAVADOC	 A handler class that generates an array of shorts and an array floats from parsing a length list. * @author <a href="mailto:cam%40mcc%2eid%2eau">Cameron McCormack</a> @version $Id: LengthArrayProducer.java 475477 2006-11-15 22:44:28Z cam $ 
public	TokenNamepublic	
class	TokenNameclass	
LengthArrayProducer	TokenNameIdentifier	 Length Array Producer
extends	TokenNameextends	
DefaultLengthListHandler	TokenNameIdentifier	 Default Length List Handler
{	TokenNameLBRACE	
/** * List of <code>float[]</code> objects. */	TokenNameCOMMENT_JAVADOC	 List of <code>float[]</code> objects. 
protected	TokenNameprotected	
LinkedList	TokenNameIdentifier	 Linked List
vs	TokenNameIdentifier	 vs
;	TokenNameSEMICOLON	
/** * The current <code>float[]</code> object. */	TokenNameCOMMENT_JAVADOC	 The current <code>float[]</code> object. 
protected	TokenNameprotected	
float	TokenNamefloat	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
v	TokenNameIdentifier	 v
;	TokenNameSEMICOLON	
/** * List of <code>short[]</code> objects. */	TokenNameCOMMENT_JAVADOC	 List of <code>short[]</code> objects. 
protected	TokenNameprotected	
LinkedList	TokenNameIdentifier	 Linked List
us	TokenNameIdentifier	 us
;	TokenNameSEMICOLON	
/** * The current <code>short[]</code> object. */	TokenNameCOMMENT_JAVADOC	 The current <code>short[]</code> object. 
protected	TokenNameprotected	
short	TokenNameshort	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
u	TokenNameIdentifier	 u
;	TokenNameSEMICOLON	
/** * The index in which to store the next length. */	TokenNameCOMMENT_JAVADOC	 The index in which to store the next length. 
protected	TokenNameprotected	
int	TokenNameint	
index	TokenNameIdentifier	 index
;	TokenNameSEMICOLON	
/** * The total number of lengths accumulated. */	TokenNameCOMMENT_JAVADOC	 The total number of lengths accumulated. 
protected	TokenNameprotected	
int	TokenNameint	
count	TokenNameIdentifier	 count
;	TokenNameSEMICOLON	
/** * The unit for the current length. */	TokenNameCOMMENT_JAVADOC	 The unit for the current length. 
protected	TokenNameprotected	
short	TokenNameshort	
currentUnit	TokenNameIdentifier	 current Unit
;	TokenNameSEMICOLON	
/** * Returns the array of length units accumulated. */	TokenNameCOMMENT_JAVADOC	 Returns the array of length units accumulated. 
public	TokenNamepublic	
short	TokenNameshort	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
getLengthTypeArray	TokenNameIdentifier	 get Length Type Array
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
u	TokenNameIdentifier	 u
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the array of length values accumulated. */	TokenNameCOMMENT_JAVADOC	 Returns the array of length values accumulated. 
public	TokenNamepublic	
float	TokenNamefloat	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
getLengthValueArray	TokenNameIdentifier	 get Length Value Array
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
v	TokenNameIdentifier	 v
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// LengthListHandler ///////////////////////////////////////////////////// 	TokenNameCOMMENT_LINE	LengthListHandler ///////////////////////////////////////////////////// 
/** * Invoked when the length list attribute starts. * @exception ParseException if an error occures while processing the * number list. */	TokenNameCOMMENT_JAVADOC	 Invoked when the length list attribute starts. @exception ParseException if an error occures while processing the number list. 
public	TokenNamepublic	
void	TokenNamevoid	
startLengthList	TokenNameIdentifier	 start Length List
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
ParseException	TokenNameIdentifier	 Parse Exception
{	TokenNameLBRACE	
us	TokenNameIdentifier	 us
=	TokenNameEQUAL	
new	TokenNamenew	
LinkedList	TokenNameIdentifier	 Linked List
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
u	TokenNameIdentifier	 u
=	TokenNameEQUAL	
new	TokenNamenew	
short	TokenNameshort	
[	TokenNameLBRACKET	
11	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
vs	TokenNameIdentifier	 vs
=	TokenNameEQUAL	
new	TokenNamenew	
LinkedList	TokenNameIdentifier	 Linked List
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
v	TokenNameIdentifier	 v
=	TokenNameEQUAL	
new	TokenNamenew	
float	TokenNamefloat	
[	TokenNameLBRACKET	
11	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
count	TokenNameIdentifier	 count
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
index	TokenNameIdentifier	 index
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Invoked when a float value has been parsed. * @exception ParseException if an error occures while processing * the number */	TokenNameCOMMENT_JAVADOC	 Invoked when a float value has been parsed. @exception ParseException if an error occures while processing the number 
public	TokenNamepublic	
void	TokenNamevoid	
numberValue	TokenNameIdentifier	 number Value
(	TokenNameLPAREN	
float	TokenNamefloat	
v	TokenNameIdentifier	 v
)	TokenNameRPAREN	
throws	TokenNamethrows	
ParseException	TokenNameIdentifier	 Parse Exception
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** * Implements {@link LengthHandler#lengthValue(float)}. */	TokenNameCOMMENT_JAVADOC	 Implements {@link LengthHandler#lengthValue(float)}. 
public	TokenNamepublic	
void	TokenNamevoid	
lengthValue	TokenNameIdentifier	 length Value
(	TokenNameLPAREN	
float	TokenNamefloat	
val	TokenNameIdentifier	 val
)	TokenNameRPAREN	
throws	TokenNamethrows	
ParseException	TokenNameIdentifier	 Parse Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
==	TokenNameEQUAL_EQUAL	
v	TokenNameIdentifier	 v
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
{	TokenNameLBRACE	
vs	TokenNameIdentifier	 vs
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
v	TokenNameIdentifier	 v
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
v	TokenNameIdentifier	 v
=	TokenNameEQUAL	
new	TokenNamenew	
float	TokenNamefloat	
[	TokenNameLBRACKET	
v	TokenNameIdentifier	 v
.	TokenNameDOT	
length	TokenNameIdentifier	 length
*	TokenNameMULTIPLY	
2	TokenNameIntegerLiteral	
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
us	TokenNameIdentifier	 us
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
u	TokenNameIdentifier	 u
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
u	TokenNameIdentifier	 u
=	TokenNameEQUAL	
new	TokenNamenew	
short	TokenNameshort	
[	TokenNameLBRACKET	
u	TokenNameIdentifier	 u
.	TokenNameDOT	
length	TokenNameIdentifier	 length
*	TokenNameMULTIPLY	
2	TokenNameIntegerLiteral	
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
index	TokenNameIdentifier	 index
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
v	TokenNameIdentifier	 v
[	TokenNameLBRACKET	
index	TokenNameIdentifier	 index
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
val	TokenNameIdentifier	 val
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Implements {@link LengthHandler#startLength()}. */	TokenNameCOMMENT_JAVADOC	 Implements {@link LengthHandler#startLength()}. 
public	TokenNamepublic	
void	TokenNamevoid	
startLength	TokenNameIdentifier	 start Length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
ParseException	TokenNameIdentifier	 Parse Exception
{	TokenNameLBRACE	
currentUnit	TokenNameIdentifier	 current Unit
=	TokenNameEQUAL	
SVGLength	TokenNameIdentifier	 SVG Length
.	TokenNameDOT	
SVG_LENGTHTYPE_NUMBER	TokenNameIdentifier	 SVG  LENGTHTYPE  NUMBER
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Implements {@link LengthHandler#endLength()}. */	TokenNameCOMMENT_JAVADOC	 Implements {@link LengthHandler#endLength()}. 
public	TokenNamepublic	
void	TokenNamevoid	
endLength	TokenNameIdentifier	 end Length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
ParseException	TokenNameIdentifier	 Parse Exception
{	TokenNameLBRACE	
u	TokenNameIdentifier	 u
[	TokenNameLBRACKET	
index	TokenNameIdentifier	 index
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
currentUnit	TokenNameIdentifier	 current Unit
;	TokenNameSEMICOLON	
count	TokenNameIdentifier	 count
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Implements {@link LengthHandler#em()}. */	TokenNameCOMMENT_JAVADOC	 Implements {@link LengthHandler#em()}. 
public	TokenNamepublic	
void	TokenNamevoid	
em	TokenNameIdentifier	 em
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
ParseException	TokenNameIdentifier	 Parse Exception
{	TokenNameLBRACE	
currentUnit	TokenNameIdentifier	 current Unit
=	TokenNameEQUAL	
SVGLength	TokenNameIdentifier	 SVG Length
.	TokenNameDOT	
SVG_LENGTHTYPE_EMS	TokenNameIdentifier	 SVG  LENGTHTYPE  EMS
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Implements {@link LengthHandler#ex()}. */	TokenNameCOMMENT_JAVADOC	 Implements {@link LengthHandler#ex()}. 
public	TokenNamepublic	
void	TokenNamevoid	
ex	TokenNameIdentifier	 ex
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
ParseException	TokenNameIdentifier	 Parse Exception
{	TokenNameLBRACE	
currentUnit	TokenNameIdentifier	 current Unit
=	TokenNameEQUAL	
SVGLength	TokenNameIdentifier	 SVG Length
.	TokenNameDOT	
SVG_LENGTHTYPE_EXS	TokenNameIdentifier	 SVG  LENGTHTYPE  EXS
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Implements {@link LengthHandler#in()}. */	TokenNameCOMMENT_JAVADOC	 Implements {@link LengthHandler#in()}. 
public	TokenNamepublic	
void	TokenNamevoid	
in	TokenNameIdentifier	 in
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
ParseException	TokenNameIdentifier	 Parse Exception
{	TokenNameLBRACE	
currentUnit	TokenNameIdentifier	 current Unit
=	TokenNameEQUAL	
SVGLength	TokenNameIdentifier	 SVG Length
.	TokenNameDOT	
SVG_LENGTHTYPE_IN	TokenNameIdentifier	 SVG  LENGTHTYPE  IN
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Implements {@link LengthHandler#cm()}. */	TokenNameCOMMENT_JAVADOC	 Implements {@link LengthHandler#cm()}. 
public	TokenNamepublic	
void	TokenNamevoid	
cm	TokenNameIdentifier	 cm
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
ParseException	TokenNameIdentifier	 Parse Exception
{	TokenNameLBRACE	
currentUnit	TokenNameIdentifier	 current Unit
=	TokenNameEQUAL	
SVGLength	TokenNameIdentifier	 SVG Length
.	TokenNameDOT	
SVG_LENGTHTYPE_CM	TokenNameIdentifier	 SVG  LENGTHTYPE  CM
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Implements {@link LengthHandler#mm()}. */	TokenNameCOMMENT_JAVADOC	 Implements {@link LengthHandler#mm()}. 
public	TokenNamepublic	
void	TokenNamevoid	
mm	TokenNameIdentifier	 mm
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
ParseException	TokenNameIdentifier	 Parse Exception
{	TokenNameLBRACE	
currentUnit	TokenNameIdentifier	 current Unit
=	TokenNameEQUAL	
SVGLength	TokenNameIdentifier	 SVG Length
.	TokenNameDOT	
SVG_LENGTHTYPE_MM	TokenNameIdentifier	 SVG  LENGTHTYPE  MM
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Implements {@link LengthHandler#pc()}. */	TokenNameCOMMENT_JAVADOC	 Implements {@link LengthHandler#pc()}. 
public	TokenNamepublic	
void	TokenNamevoid	
pc	TokenNameIdentifier	 pc
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
ParseException	TokenNameIdentifier	 Parse Exception
{	TokenNameLBRACE	
currentUnit	TokenNameIdentifier	 current Unit
=	TokenNameEQUAL	
SVGLength	TokenNameIdentifier	 SVG Length
.	TokenNameDOT	
SVG_LENGTHTYPE_PC	TokenNameIdentifier	 SVG  LENGTHTYPE  PC
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Implements {@link LengthHandler#pt()}. */	TokenNameCOMMENT_JAVADOC	 Implements {@link LengthHandler#pt()}. 
public	TokenNamepublic	
void	TokenNamevoid	
pt	TokenNameIdentifier	 pt
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
ParseException	TokenNameIdentifier	 Parse Exception
{	TokenNameLBRACE	
currentUnit	TokenNameIdentifier	 current Unit
=	TokenNameEQUAL	
SVGLength	TokenNameIdentifier	 SVG Length
.	TokenNameDOT	
SVG_LENGTHTYPE_PT	TokenNameIdentifier	 SVG  LENGTHTYPE  PT
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Implements {@link LengthHandler#px()}. */	TokenNameCOMMENT_JAVADOC	 Implements {@link LengthHandler#px()}. 
public	TokenNamepublic	
void	TokenNamevoid	
px	TokenNameIdentifier	 px
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
ParseException	TokenNameIdentifier	 Parse Exception
{	TokenNameLBRACE	
currentUnit	TokenNameIdentifier	 current Unit
=	TokenNameEQUAL	
SVGLength	TokenNameIdentifier	 SVG Length
.	TokenNameDOT	
SVG_LENGTHTYPE_PX	TokenNameIdentifier	 SVG  LENGTHTYPE  PX
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Implements {@link LengthHandler#percentage()}. */	TokenNameCOMMENT_JAVADOC	 Implements {@link LengthHandler#percentage()}. 
public	TokenNamepublic	
void	TokenNamevoid	
percentage	TokenNameIdentifier	 percentage
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
ParseException	TokenNameIdentifier	 Parse Exception
{	TokenNameLBRACE	
currentUnit	TokenNameIdentifier	 current Unit
=	TokenNameEQUAL	
SVGLength	TokenNameIdentifier	 SVG Length
.	TokenNameDOT	
SVG_LENGTHTYPE_PERCENTAGE	TokenNameIdentifier	 SVG  LENGTHTYPE  PERCENTAGE
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Invoked when the length list attribute ends. * @exception ParseException if an error occures while processing the * number list. */	TokenNameCOMMENT_JAVADOC	 Invoked when the length list attribute ends. @exception ParseException if an error occures while processing the number list. 
public	TokenNamepublic	
void	TokenNamevoid	
endLengthList	TokenNameIdentifier	 end Length List
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
ParseException	TokenNameIdentifier	 Parse Exception
{	TokenNameLBRACE	
float	TokenNamefloat	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
allValues	TokenNameIdentifier	 all Values
=	TokenNameEQUAL	
new	TokenNamenew	
float	TokenNamefloat	
[	TokenNameLBRACKET	
count	TokenNameIdentifier	 count
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
int	TokenNameint	
pos	TokenNameIdentifier	 pos
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
Iterator	TokenNameIdentifier	 Iterator
it	TokenNameIdentifier	 it
=	TokenNameEQUAL	
vs	TokenNameIdentifier	 vs
.	TokenNameDOT	
iterator	TokenNameIdentifier	 iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
it	TokenNameIdentifier	 it
.	TokenNameDOT	
hasNext	TokenNameIdentifier	 has Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
float	TokenNamefloat	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
a	TokenNameIdentifier	 a
=	TokenNameEQUAL	
(	TokenNameLPAREN	
float	TokenNamefloat	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
it	TokenNameIdentifier	 it
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
arraycopy	TokenNameIdentifier	 arraycopy
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
allValues	TokenNameIdentifier	 all Values
,	TokenNameCOMMA	
pos	TokenNameIdentifier	 pos
,	TokenNameCOMMA	
a	TokenNameIdentifier	 a
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
pos	TokenNameIdentifier	 pos
+=	TokenNamePLUS_EQUAL	
a	TokenNameIdentifier	 a
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
arraycopy	TokenNameIdentifier	 arraycopy
(	TokenNameLPAREN	
v	TokenNameIdentifier	 v
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
allValues	TokenNameIdentifier	 all Values
,	TokenNameCOMMA	
pos	TokenNameIdentifier	 pos
,	TokenNameCOMMA	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
vs	TokenNameIdentifier	 vs
.	TokenNameDOT	
clear	TokenNameIdentifier	 clear
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
v	TokenNameIdentifier	 v
=	TokenNameEQUAL	
allValues	TokenNameIdentifier	 all Values
;	TokenNameSEMICOLON	
short	TokenNameshort	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
allUnits	TokenNameIdentifier	 all Units
=	TokenNameEQUAL	
new	TokenNamenew	
short	TokenNameshort	
[	TokenNameLBRACKET	
count	TokenNameIdentifier	 count
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
pos	TokenNameIdentifier	 pos
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
it	TokenNameIdentifier	 it
=	TokenNameEQUAL	
us	TokenNameIdentifier	 us
.	TokenNameDOT	
iterator	TokenNameIdentifier	 iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
it	TokenNameIdentifier	 it
.	TokenNameDOT	
hasNext	TokenNameIdentifier	 has Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
short	TokenNameshort	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
a	TokenNameIdentifier	 a
=	TokenNameEQUAL	
(	TokenNameLPAREN	
short	TokenNameshort	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
it	TokenNameIdentifier	 it
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
arraycopy	TokenNameIdentifier	 arraycopy
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
allUnits	TokenNameIdentifier	 all Units
,	TokenNameCOMMA	
pos	TokenNameIdentifier	 pos
,	TokenNameCOMMA	
a	TokenNameIdentifier	 a
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
pos	TokenNameIdentifier	 pos
+=	TokenNamePLUS_EQUAL	
a	TokenNameIdentifier	 a
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
arraycopy	TokenNameIdentifier	 arraycopy
(	TokenNameLPAREN	
u	TokenNameIdentifier	 u
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
allUnits	TokenNameIdentifier	 all Units
,	TokenNameCOMMA	
pos	TokenNameIdentifier	 pos
,	TokenNameCOMMA	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
us	TokenNameIdentifier	 us
.	TokenNameDOT	
clear	TokenNameIdentifier	 clear
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
u	TokenNameIdentifier	 u
=	TokenNameEQUAL	
allUnits	TokenNameIdentifier	 all Units
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
