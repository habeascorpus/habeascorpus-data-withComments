/* * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
log4j	TokenNameIdentifier	 log4j
.	TokenNameDOT	
helpers	TokenNameIdentifier	 helpers
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
log4j	TokenNameIdentifier	 log4j
.	TokenNameDOT	
spi	TokenNameIdentifier	 spi
.	TokenNameDOT	
LoggingEvent	TokenNameIdentifier	 Logging Event
;	TokenNameSEMICOLON	
/** CyclicBuffer is used by other appenders to hold {@link LoggingEvent LoggingEvents} for immediate or differed display. <p>This buffer gives read access to any element in the buffer not just the first or last element. @author Ceki G&uuml;lc&uuml; @since 0.9.0 */	TokenNameCOMMENT_JAVADOC	 CyclicBuffer is used by other appenders to hold {@link LoggingEvent LoggingEvents} for immediate or differed display. <p>This buffer gives read access to any element in the buffer not just the first or last element. @author Ceki G&uuml;lc&uuml; @since 0.9.0 
public	TokenNamepublic	
class	TokenNameclass	
CyclicBuffer	TokenNameIdentifier	 Cyclic Buffer
{	TokenNameLBRACE	
LoggingEvent	TokenNameIdentifier	 Logging Event
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
ea	TokenNameIdentifier	 ea
;	TokenNameSEMICOLON	
int	TokenNameint	
first	TokenNameIdentifier	 first
;	TokenNameSEMICOLON	
int	TokenNameint	
last	TokenNameIdentifier	 last
;	TokenNameSEMICOLON	
int	TokenNameint	
numElems	TokenNameIdentifier	 num Elems
;	TokenNameSEMICOLON	
int	TokenNameint	
maxSize	TokenNameIdentifier	 max Size
;	TokenNameSEMICOLON	
/** Instantiate a new CyclicBuffer of at most <code>maxSize</code> events. The <code>maxSize</code> argument must a positive integer. @param maxSize The maximum number of elements in the buffer. */	TokenNameCOMMENT_JAVADOC	 Instantiate a new CyclicBuffer of at most <code>maxSize</code> events. The <code>maxSize</code> argument must a positive integer. @param maxSize The maximum number of elements in the buffer. 
public	TokenNamepublic	
CyclicBuffer	TokenNameIdentifier	 Cyclic Buffer
(	TokenNameLPAREN	
int	TokenNameint	
maxSize	TokenNameIdentifier	 max Size
)	TokenNameRPAREN	
throws	TokenNamethrows	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
maxSize	TokenNameIdentifier	 max Size
<	TokenNameLESS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
"The maxSize argument ("	TokenNameStringLiteral	The maxSize argument (
+	TokenNamePLUS	
maxSize	TokenNameIdentifier	 max Size
+	TokenNamePLUS	
") is not a positive integer."	TokenNameStringLiteral	) is not a positive integer.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
this	TokenNamethis	
.	TokenNameDOT	
maxSize	TokenNameIdentifier	 max Size
=	TokenNameEQUAL	
maxSize	TokenNameIdentifier	 max Size
;	TokenNameSEMICOLON	
ea	TokenNameIdentifier	 ea
=	TokenNameEQUAL	
new	TokenNamenew	
LoggingEvent	TokenNameIdentifier	 Logging Event
[	TokenNameLBRACKET	
maxSize	TokenNameIdentifier	 max Size
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
first	TokenNameIdentifier	 first
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
last	TokenNameIdentifier	 last
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
numElems	TokenNameIdentifier	 num Elems
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Add an <code>event</code> as the last event in the buffer. */	TokenNameCOMMENT_JAVADOC	 Add an <code>event</code> as the last event in the buffer. 
public	TokenNamepublic	
void	TokenNamevoid	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
LoggingEvent	TokenNameIdentifier	 Logging Event
event	TokenNameIdentifier	 event
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ea	TokenNameIdentifier	 ea
[	TokenNameLBRACKET	
last	TokenNameIdentifier	 last
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
event	TokenNameIdentifier	 event
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
++	TokenNamePLUS_PLUS	
last	TokenNameIdentifier	 last
==	TokenNameEQUAL_EQUAL	
maxSize	TokenNameIdentifier	 max Size
)	TokenNameRPAREN	
last	TokenNameIdentifier	 last
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
numElems	TokenNameIdentifier	 num Elems
<	TokenNameLESS	
maxSize	TokenNameIdentifier	 max Size
)	TokenNameRPAREN	
numElems	TokenNameIdentifier	 num Elems
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
++	TokenNamePLUS_PLUS	
first	TokenNameIdentifier	 first
==	TokenNameEQUAL_EQUAL	
maxSize	TokenNameIdentifier	 max Size
)	TokenNameRPAREN	
first	TokenNameIdentifier	 first
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Get the <i>i</i>th oldest event currently in the buffer. If <em>i</em> is outside the range 0 to the number of elements currently in the buffer, then <code>null</code> is returned. */	TokenNameCOMMENT_JAVADOC	 Get the <i>i</i>th oldest event currently in the buffer. If <em>i</em> is outside the range 0 to the number of elements currently in the buffer, then <code>null</code> is returned. 
public	TokenNamepublic	
LoggingEvent	TokenNameIdentifier	 Logging Event
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
||	TokenNameOR_OR	
i	TokenNameIdentifier	 i
>=	TokenNameGREATER_EQUAL	
numElems	TokenNameIdentifier	 num Elems
)	TokenNameRPAREN	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
ea	TokenNameIdentifier	 ea
[	TokenNameLBRACKET	
(	TokenNameLPAREN	
first	TokenNameIdentifier	 first
+	TokenNamePLUS	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
%	TokenNameREMAINDER	
maxSize	TokenNameIdentifier	 max Size
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
int	TokenNameint	
getMaxSize	TokenNameIdentifier	 get Max Size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
maxSize	TokenNameIdentifier	 max Size
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Get the oldest (first) element in the buffer. The oldest element is removed from the buffer. */	TokenNameCOMMENT_JAVADOC	 Get the oldest (first) element in the buffer. The oldest element is removed from the buffer. 
public	TokenNamepublic	
LoggingEvent	TokenNameIdentifier	 Logging Event
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
LoggingEvent	TokenNameIdentifier	 Logging Event
r	TokenNameIdentifier	 r
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
numElems	TokenNameIdentifier	 num Elems
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
numElems	TokenNameIdentifier	 num Elems
--	TokenNameMINUS_MINUS	
;	TokenNameSEMICOLON	
r	TokenNameIdentifier	 r
=	TokenNameEQUAL	
ea	TokenNameIdentifier	 ea
[	TokenNameLBRACKET	
first	TokenNameIdentifier	 first
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
ea	TokenNameIdentifier	 ea
[	TokenNameLBRACKET	
first	TokenNameIdentifier	 first
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
++	TokenNamePLUS_PLUS	
first	TokenNameIdentifier	 first
==	TokenNameEQUAL_EQUAL	
maxSize	TokenNameIdentifier	 max Size
)	TokenNameRPAREN	
first	TokenNameIdentifier	 first
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
r	TokenNameIdentifier	 r
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Get the number of elements in the buffer. This number is guaranteed to be in the range 0 to <code>maxSize</code> (inclusive). */	TokenNameCOMMENT_JAVADOC	 Get the number of elements in the buffer. This number is guaranteed to be in the range 0 to <code>maxSize</code> (inclusive). 
public	TokenNamepublic	
int	TokenNameint	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
numElems	TokenNameIdentifier	 num Elems
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Resize the cyclic buffer to <code>newSize</code>. @throws IllegalArgumentException if <code>newSize</code> is negative. */	TokenNameCOMMENT_JAVADOC	 Resize the cyclic buffer to <code>newSize</code>. @throws IllegalArgumentException if <code>newSize</code> is negative. 
public	TokenNamepublic	
void	TokenNamevoid	
resize	TokenNameIdentifier	 resize
(	TokenNameLPAREN	
int	TokenNameint	
newSize	TokenNameIdentifier	 new Size
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
newSize	TokenNameIdentifier	 new Size
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
"Negative array size ["	TokenNameStringLiteral	Negative array size [
+	TokenNamePLUS	
newSize	TokenNameIdentifier	 new Size
+	TokenNamePLUS	
"] not allowed."	TokenNameStringLiteral	] not allowed.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
newSize	TokenNameIdentifier	 new Size
==	TokenNameEQUAL_EQUAL	
numElems	TokenNameIdentifier	 num Elems
)	TokenNameRPAREN	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
// nothing to do 	TokenNameCOMMENT_LINE	nothing to do 
LoggingEvent	TokenNameIdentifier	 Logging Event
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
temp	TokenNameIdentifier	 temp
=	TokenNameEQUAL	
new	TokenNamenew	
LoggingEvent	TokenNameIdentifier	 Logging Event
[	TokenNameLBRACKET	
newSize	TokenNameIdentifier	 new Size
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
int	TokenNameint	
loopLen	TokenNameIdentifier	 loop Len
=	TokenNameEQUAL	
newSize	TokenNameIdentifier	 new Size
<	TokenNameLESS	
numElems	TokenNameIdentifier	 num Elems
?	TokenNameQUESTION	
newSize	TokenNameIdentifier	 new Size
:	TokenNameCOLON	
numElems	TokenNameIdentifier	 num Elems
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
loopLen	TokenNameIdentifier	 loop Len
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
temp	TokenNameIdentifier	 temp
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
ea	TokenNameIdentifier	 ea
[	TokenNameLBRACKET	
first	TokenNameIdentifier	 first
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
ea	TokenNameIdentifier	 ea
[	TokenNameLBRACKET	
first	TokenNameIdentifier	 first
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
++	TokenNamePLUS_PLUS	
first	TokenNameIdentifier	 first
==	TokenNameEQUAL_EQUAL	
numElems	TokenNameIdentifier	 num Elems
)	TokenNameRPAREN	
first	TokenNameIdentifier	 first
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
ea	TokenNameIdentifier	 ea
=	TokenNameEQUAL	
temp	TokenNameIdentifier	 temp
;	TokenNameSEMICOLON	
first	TokenNameIdentifier	 first
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
numElems	TokenNameIdentifier	 num Elems
=	TokenNameEQUAL	
loopLen	TokenNameIdentifier	 loop Len
;	TokenNameSEMICOLON	
maxSize	TokenNameIdentifier	 max Size
=	TokenNameEQUAL	
newSize	TokenNameIdentifier	 new Size
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
loopLen	TokenNameIdentifier	 loop Len
==	TokenNameEQUAL_EQUAL	
newSize	TokenNameIdentifier	 new Size
)	TokenNameRPAREN	
{	TokenNameLBRACE	
last	TokenNameIdentifier	 last
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
last	TokenNameIdentifier	 last
=	TokenNameEQUAL	
loopLen	TokenNameIdentifier	 loop Len
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
