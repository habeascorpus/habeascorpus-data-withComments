/* * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
// Contributors: Mathias Bogaert 	TokenNameCOMMENT_LINE	Contributors: Mathias Bogaert 
// joelr@viair.com 	TokenNameCOMMENT_LINE	joelr@viair.com 
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
/** <code>BoundedFIFO</code> serves as the bounded first-in-first-out buffer heavily used by the {@link org.apache.log4j.AsyncAppender}. @author Ceki G&uuml;lc&uuml; @since version 0.9.1 */	TokenNameCOMMENT_JAVADOC	 <code>BoundedFIFO</code> serves as the bounded first-in-first-out buffer heavily used by the {@link org.apache.log4j.AsyncAppender}. @author Ceki G&uuml;lc&uuml; @since version 0.9.1 
public	TokenNamepublic	
class	TokenNameclass	
BoundedFIFO	TokenNameIdentifier	 Bounded FIFO
{	TokenNameLBRACE	
LoggingEvent	TokenNameIdentifier	 Logging Event
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
buf	TokenNameIdentifier	 buf
;	TokenNameSEMICOLON	
int	TokenNameint	
numElements	TokenNameIdentifier	 num Elements
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
first	TokenNameIdentifier	 first
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
next	TokenNameIdentifier	 next
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
maxSize	TokenNameIdentifier	 max Size
;	TokenNameSEMICOLON	
/** Instantiate a new BoundedFIFO with a maximum size passed as argument. */	TokenNameCOMMENT_JAVADOC	 Instantiate a new BoundedFIFO with a maximum size passed as argument. 
public	TokenNamepublic	
BoundedFIFO	TokenNameIdentifier	 Bounded FIFO
(	TokenNameLPAREN	
int	TokenNameint	
maxSize	TokenNameIdentifier	 max Size
)	TokenNameRPAREN	
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
buf	TokenNameIdentifier	 buf
=	TokenNameEQUAL	
new	TokenNamenew	
LoggingEvent	TokenNameIdentifier	 Logging Event
[	TokenNameLBRACKET	
maxSize	TokenNameIdentifier	 max Size
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Get the first element in the buffer. Returns <code>null</code> if there are no elements in the buffer. */	TokenNameCOMMENT_JAVADOC	 Get the first element in the buffer. Returns <code>null</code> if there are no elements in the buffer. 
public	TokenNamepublic	
LoggingEvent	TokenNameIdentifier	 Logging Event
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
numElements	TokenNameIdentifier	 num Elements
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
LoggingEvent	TokenNameIdentifier	 Logging Event
r	TokenNameIdentifier	 r
=	TokenNameEQUAL	
buf	TokenNameIdentifier	 buf
[	TokenNameLBRACKET	
first	TokenNameIdentifier	 first
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
buf	TokenNameIdentifier	 buf
[	TokenNameLBRACKET	
first	TokenNameIdentifier	 first
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
// help garbage collection 	TokenNameCOMMENT_LINE	help garbage collection 
if	TokenNameif	
(	TokenNameLPAREN	
++	TokenNamePLUS_PLUS	
first	TokenNameIdentifier	 first
==	TokenNameEQUAL_EQUAL	
maxSize	TokenNameIdentifier	 max Size
)	TokenNameRPAREN	
{	TokenNameLBRACE	
first	TokenNameIdentifier	 first
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
numElements	TokenNameIdentifier	 num Elements
--	TokenNameMINUS_MINUS	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
r	TokenNameIdentifier	 r
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Place a {@link LoggingEvent} in the buffer. If the buffer is full then the event is <b>silently dropped</b>. It is the caller's responsability to make sure that the buffer has free space. */	TokenNameCOMMENT_JAVADOC	 Place a {@link LoggingEvent} in the buffer. If the buffer is full then the event is <b>silently dropped</b>. It is the caller's responsability to make sure that the buffer has free space. 
public	TokenNamepublic	
void	TokenNamevoid	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
LoggingEvent	TokenNameIdentifier	 Logging Event
o	TokenNameIdentifier	 o
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
numElements	TokenNameIdentifier	 num Elements
!=	TokenNameNOT_EQUAL	
maxSize	TokenNameIdentifier	 max Size
)	TokenNameRPAREN	
{	TokenNameLBRACE	
buf	TokenNameIdentifier	 buf
[	TokenNameLBRACKET	
next	TokenNameIdentifier	 next
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
o	TokenNameIdentifier	 o
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
++	TokenNamePLUS_PLUS	
next	TokenNameIdentifier	 next
==	TokenNameEQUAL_EQUAL	
maxSize	TokenNameIdentifier	 max Size
)	TokenNameRPAREN	
{	TokenNameLBRACE	
next	TokenNameIdentifier	 next
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
numElements	TokenNameIdentifier	 num Elements
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** Get the maximum size of the buffer. */	TokenNameCOMMENT_JAVADOC	 Get the maximum size of the buffer. 
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
/** Return <code>true</code> if the buffer is full, that is, whether the number of elements in the buffer equals the buffer size. */	TokenNameCOMMENT_JAVADOC	 Return <code>true</code> if the buffer is full, that is, whether the number of elements in the buffer equals the buffer size. 
public	TokenNamepublic	
boolean	TokenNameboolean	
isFull	TokenNameIdentifier	 is Full
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
numElements	TokenNameIdentifier	 num Elements
==	TokenNameEQUAL_EQUAL	
maxSize	TokenNameIdentifier	 max Size
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
numElements	TokenNameIdentifier	 num Elements
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
int	TokenNameint	
min	TokenNameIdentifier	 min
(	TokenNameLPAREN	
int	TokenNameint	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
int	TokenNameint	
b	TokenNameIdentifier	 b
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
a	TokenNameIdentifier	 a
<	TokenNameLESS	
b	TokenNameIdentifier	 b
?	TokenNameQUESTION	
a	TokenNameIdentifier	 a
:	TokenNameCOLON	
b	TokenNameIdentifier	 b
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Resize the buffer to a new size. If the new size is smaller than the old size events might be lost. @since 1.1 */	TokenNameCOMMENT_JAVADOC	 Resize the buffer to a new size. If the new size is smaller than the old size events might be lost. @since 1.1 
synchronized	TokenNamesynchronized	
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
==	TokenNameEQUAL_EQUAL	
maxSize	TokenNameIdentifier	 max Size
)	TokenNameRPAREN	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
LoggingEvent	TokenNameIdentifier	 Logging Event
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
tmp	TokenNameIdentifier	 tmp
=	TokenNameEQUAL	
new	TokenNamenew	
LoggingEvent	TokenNameIdentifier	 Logging Event
[	TokenNameLBRACKET	
newSize	TokenNameIdentifier	 new Size
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
// we should not copy beyond the buf array 	TokenNameCOMMENT_LINE	we should not copy beyond the buf array 
int	TokenNameint	
len1	TokenNameIdentifier	 len1
=	TokenNameEQUAL	
maxSize	TokenNameIdentifier	 max Size
-	TokenNameMINUS	
first	TokenNameIdentifier	 first
;	TokenNameSEMICOLON	
// we should not copy beyond the tmp array 	TokenNameCOMMENT_LINE	we should not copy beyond the tmp array 
len1	TokenNameIdentifier	 len1
=	TokenNameEQUAL	
min	TokenNameIdentifier	 min
(	TokenNameLPAREN	
len1	TokenNameIdentifier	 len1
,	TokenNameCOMMA	
newSize	TokenNameIdentifier	 new Size
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// er.. how much do we actually need to copy? 	TokenNameCOMMENT_LINE	er.. how much do we actually need to copy? 
// We should not copy more than the actual number of elements. 	TokenNameCOMMENT_LINE	We should not copy more than the actual number of elements. 
len1	TokenNameIdentifier	 len1
=	TokenNameEQUAL	
min	TokenNameIdentifier	 min
(	TokenNameLPAREN	
len1	TokenNameIdentifier	 len1
,	TokenNameCOMMA	
numElements	TokenNameIdentifier	 num Elements
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Copy from buf starting a first, to tmp, starting at position 0, len1 elements. 	TokenNameCOMMENT_LINE	Copy from buf starting a first, to tmp, starting at position 0, len1 elements. 
System	TokenNameIdentifier	 System
.	TokenNameDOT	
arraycopy	TokenNameIdentifier	 arraycopy
(	TokenNameLPAREN	
buf	TokenNameIdentifier	 buf
,	TokenNameCOMMA	
first	TokenNameIdentifier	 first
,	TokenNameCOMMA	
tmp	TokenNameIdentifier	 tmp
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
len1	TokenNameIdentifier	 len1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Are there any uncopied elements and is there still space in the new array? 	TokenNameCOMMENT_LINE	Are there any uncopied elements and is there still space in the new array? 
int	TokenNameint	
len2	TokenNameIdentifier	 len2
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
len1	TokenNameIdentifier	 len1
<	TokenNameLESS	
numElements	TokenNameIdentifier	 num Elements
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
len1	TokenNameIdentifier	 len1
<	TokenNameLESS	
newSize	TokenNameIdentifier	 new Size
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
len2	TokenNameIdentifier	 len2
=	TokenNameEQUAL	
numElements	TokenNameIdentifier	 num Elements
-	TokenNameMINUS	
len1	TokenNameIdentifier	 len1
;	TokenNameSEMICOLON	
len2	TokenNameIdentifier	 len2
=	TokenNameEQUAL	
min	TokenNameIdentifier	 min
(	TokenNameLPAREN	
len2	TokenNameIdentifier	 len2
,	TokenNameCOMMA	
newSize	TokenNameIdentifier	 new Size
-	TokenNameMINUS	
len1	TokenNameIdentifier	 len1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
arraycopy	TokenNameIdentifier	 arraycopy
(	TokenNameLPAREN	
buf	TokenNameIdentifier	 buf
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
tmp	TokenNameIdentifier	 tmp
,	TokenNameCOMMA	
len1	TokenNameIdentifier	 len1
,	TokenNameCOMMA	
len2	TokenNameIdentifier	 len2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
this	TokenNamethis	
.	TokenNameDOT	
buf	TokenNameIdentifier	 buf
=	TokenNameEQUAL	
tmp	TokenNameIdentifier	 tmp
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
maxSize	TokenNameIdentifier	 max Size
=	TokenNameEQUAL	
newSize	TokenNameIdentifier	 new Size
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
first	TokenNameIdentifier	 first
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
numElements	TokenNameIdentifier	 num Elements
=	TokenNameEQUAL	
len1	TokenNameIdentifier	 len1
+	TokenNamePLUS	
len2	TokenNameIdentifier	 len2
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
next	TokenNameIdentifier	 next
=	TokenNameEQUAL	
this	TokenNamethis	
.	TokenNameDOT	
numElements	TokenNameIdentifier	 num Elements
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
next	TokenNameIdentifier	 next
==	TokenNameEQUAL_EQUAL	
this	TokenNamethis	
.	TokenNameDOT	
maxSize	TokenNameIdentifier	 max Size
)	TokenNameRPAREN	
// this should never happen, but again, it just might. 	TokenNameCOMMENT_LINE	this should never happen, but again, it just might. 
this	TokenNamethis	
.	TokenNameDOT	
next	TokenNameIdentifier	 next
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Returns <code>true</code> if there is just one element in the buffer. In other words, if there were no elements before the last {@link #put} operation completed. */	TokenNameCOMMENT_JAVADOC	 Returns <code>true</code> if there is just one element in the buffer. In other words, if there were no elements before the last {@link #put} operation completed. 
public	TokenNamepublic	
boolean	TokenNameboolean	
wasEmpty	TokenNameIdentifier	 was Empty
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
numElements	TokenNameIdentifier	 num Elements
==	TokenNameEQUAL_EQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Returns <code>true</code> if the number of elements in the buffer plus 1 equals the maximum buffer size, returns <code>false</code> otherwise. */	TokenNameCOMMENT_JAVADOC	 Returns <code>true</code> if the number of elements in the buffer plus 1 equals the maximum buffer size, returns <code>false</code> otherwise. 
public	TokenNamepublic	
boolean	TokenNameboolean	
wasFull	TokenNameIdentifier	 was Full
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
numElements	TokenNameIdentifier	 num Elements
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
==	TokenNameEQUAL_EQUAL	
maxSize	TokenNameIdentifier	 max Size
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
