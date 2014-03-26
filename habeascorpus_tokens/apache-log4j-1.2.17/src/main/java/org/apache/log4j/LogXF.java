/* * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
log4j	TokenNameIdentifier	 log4j
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
/** * This is a base class for LogMF and LogSF parameterized logging classes. * * * @see org.apache.log4j.LogMF * @see org.apache.log4j.LogSF * @since 1.2.16 */	TokenNameCOMMENT_JAVADOC	 This is a base class for LogMF and LogSF parameterized logging classes. * @see org.apache.log4j.LogMF @see org.apache.log4j.LogSF @since 1.2.16 
public	TokenNamepublic	
abstract	TokenNameabstract	
class	TokenNameclass	
LogXF	TokenNameIdentifier	 Log XF
{	TokenNameLBRACE	
/** * Trace level. */	TokenNameCOMMENT_JAVADOC	 Trace level. 
protected	TokenNameprotected	
static	TokenNamestatic	
final	TokenNamefinal	
Level	TokenNameIdentifier	 Level
TRACE	TokenNameIdentifier	 TRACE
=	TokenNameEQUAL	
new	TokenNamenew	
Level	TokenNameIdentifier	 Level
(	TokenNameLPAREN	
5000	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
"TRACE"	TokenNameStringLiteral	TRACE
,	TokenNameCOMMA	
7	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Fully Qualified Class Name of this class. */	TokenNameCOMMENT_JAVADOC	 Fully Qualified Class Name of this class. 
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
FQCN	TokenNameIdentifier	 FQCN
=	TokenNameEQUAL	
LogXF	TokenNameIdentifier	 Log XF
.	TokenNameDOT	
class	TokenNameclass	
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
LogXF	TokenNameIdentifier	 Log XF
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** * Returns a Boolean instance representing the specified boolean. * Boolean.valueOf was added in JDK 1.4. * * @param b a boolean value. * @return a Boolean instance representing b. */	TokenNameCOMMENT_JAVADOC	 Returns a Boolean instance representing the specified boolean. Boolean.valueOf was added in JDK 1.4. * @param b a boolean value. @return a Boolean instance representing b. 
protected	TokenNameprotected	
static	TokenNamestatic	
Boolean	TokenNameIdentifier	 Boolean
valueOf	TokenNameIdentifier	 value Of
(	TokenNameLPAREN	
final	TokenNamefinal	
boolean	TokenNameboolean	
b	TokenNameIdentifier	 b
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
b	TokenNameIdentifier	 b
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
Boolean	TokenNameIdentifier	 Boolean
.	TokenNameDOT	
TRUE	TokenNameIdentifier	 TRUE
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
Boolean	TokenNameIdentifier	 Boolean
.	TokenNameDOT	
FALSE	TokenNameIdentifier	 FALSE
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns a Character instance representing the specified char. * Character.valueOf was added in JDK 1.5. * * @param c a character value. * @return a Character instance representing c. */	TokenNameCOMMENT_JAVADOC	 Returns a Character instance representing the specified char. Character.valueOf was added in JDK 1.5. * @param c a character value. @return a Character instance representing c. 
protected	TokenNameprotected	
static	TokenNamestatic	
Character	TokenNameIdentifier	 Character
valueOf	TokenNameIdentifier	 value Of
(	TokenNameLPAREN	
final	TokenNamefinal	
char	TokenNamechar	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
Character	TokenNameIdentifier	 Character
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns a Byte instance representing the specified byte. * Byte.valueOf was added in JDK 1.5. * * @param b a byte value. * @return a Byte instance representing b. */	TokenNameCOMMENT_JAVADOC	 Returns a Byte instance representing the specified byte. Byte.valueOf was added in JDK 1.5. * @param b a byte value. @return a Byte instance representing b. 
protected	TokenNameprotected	
static	TokenNamestatic	
Byte	TokenNameIdentifier	 Byte
valueOf	TokenNameIdentifier	 value Of
(	TokenNameLPAREN	
final	TokenNamefinal	
byte	TokenNamebyte	
b	TokenNameIdentifier	 b
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
Byte	TokenNameIdentifier	 Byte
(	TokenNameLPAREN	
b	TokenNameIdentifier	 b
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns a Short instance representing the specified short. * Short.valueOf was added in JDK 1.5. * * @param b a short value. * @return a Byte instance representing b. */	TokenNameCOMMENT_JAVADOC	 Returns a Short instance representing the specified short. Short.valueOf was added in JDK 1.5. * @param b a short value. @return a Byte instance representing b. 
protected	TokenNameprotected	
static	TokenNamestatic	
Short	TokenNameIdentifier	 Short
valueOf	TokenNameIdentifier	 value Of
(	TokenNameLPAREN	
final	TokenNamefinal	
short	TokenNameshort	
b	TokenNameIdentifier	 b
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
Short	TokenNameIdentifier	 Short
(	TokenNameLPAREN	
b	TokenNameIdentifier	 b
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns an Integer instance representing the specified int. * Integer.valueOf was added in JDK 1.5. * * @param b an int value. * @return an Integer instance representing b. */	TokenNameCOMMENT_JAVADOC	 Returns an Integer instance representing the specified int. Integer.valueOf was added in JDK 1.5. * @param b an int value. @return an Integer instance representing b. 
protected	TokenNameprotected	
static	TokenNamestatic	
Integer	TokenNameIdentifier	 Integer
valueOf	TokenNameIdentifier	 value Of
(	TokenNameLPAREN	
final	TokenNamefinal	
int	TokenNameint	
b	TokenNameIdentifier	 b
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
Integer	TokenNameIdentifier	 Integer
(	TokenNameLPAREN	
b	TokenNameIdentifier	 b
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns a Long instance representing the specified long. * Long.valueOf was added in JDK 1.5. * * @param b a long value. * @return a Long instance representing b. */	TokenNameCOMMENT_JAVADOC	 Returns a Long instance representing the specified long. Long.valueOf was added in JDK 1.5. * @param b a long value. @return a Long instance representing b. 
protected	TokenNameprotected	
static	TokenNamestatic	
Long	TokenNameIdentifier	 Long
valueOf	TokenNameIdentifier	 value Of
(	TokenNameLPAREN	
final	TokenNamefinal	
long	TokenNamelong	
b	TokenNameIdentifier	 b
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
Long	TokenNameIdentifier	 Long
(	TokenNameLPAREN	
b	TokenNameIdentifier	 b
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns a Float instance representing the specified float. * Float.valueOf was added in JDK 1.5. * * @param b a float value. * @return a Float instance representing b. */	TokenNameCOMMENT_JAVADOC	 Returns a Float instance representing the specified float. Float.valueOf was added in JDK 1.5. * @param b a float value. @return a Float instance representing b. 
protected	TokenNameprotected	
static	TokenNamestatic	
Float	TokenNameIdentifier	 Float
valueOf	TokenNameIdentifier	 value Of
(	TokenNameLPAREN	
final	TokenNamefinal	
float	TokenNamefloat	
b	TokenNameIdentifier	 b
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
Float	TokenNameIdentifier	 Float
(	TokenNameLPAREN	
b	TokenNameIdentifier	 b
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns a Double instance representing the specified double. * Double.valueOf was added in JDK 1.5. * * @param b a double value. * @return a Byte instance representing b. */	TokenNameCOMMENT_JAVADOC	 Returns a Double instance representing the specified double. Double.valueOf was added in JDK 1.5. * @param b a double value. @return a Byte instance representing b. 
protected	TokenNameprotected	
static	TokenNamestatic	
Double	TokenNameIdentifier	 Double
valueOf	TokenNameIdentifier	 value Of
(	TokenNameLPAREN	
final	TokenNamefinal	
double	TokenNamedouble	
b	TokenNameIdentifier	 b
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
Double	TokenNameIdentifier	 Double
(	TokenNameLPAREN	
b	TokenNameIdentifier	 b
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Create new array. * * @param param1 parameter 1. * @return new array. */	TokenNameCOMMENT_JAVADOC	 Create new array. * @param param1 parameter 1. @return new array. 
protected	TokenNameprotected	
static	TokenNamestatic	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
toArray	TokenNameIdentifier	 to Array
(	TokenNameLPAREN	
final	TokenNamefinal	
Object	TokenNameIdentifier	 Object
param1	TokenNameIdentifier	 param1
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
param1	TokenNameIdentifier	 param1
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Create new array. * * @param param1 parameter 1. * @param param2 parameter 2. * @return new array. */	TokenNameCOMMENT_JAVADOC	 Create new array. * @param param1 parameter 1. @param param2 parameter 2. @return new array. 
protected	TokenNameprotected	
static	TokenNamestatic	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
toArray	TokenNameIdentifier	 to Array
(	TokenNameLPAREN	
final	TokenNamefinal	
Object	TokenNameIdentifier	 Object
param1	TokenNameIdentifier	 param1
,	TokenNameCOMMA	
final	TokenNamefinal	
Object	TokenNameIdentifier	 Object
param2	TokenNameIdentifier	 param2
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
param1	TokenNameIdentifier	 param1
,	TokenNameCOMMA	
param2	TokenNameIdentifier	 param2
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Create new array. * * @param param1 parameter 1. * @param param2 parameter 2. * @param param3 parameter 3. * @return new array. */	TokenNameCOMMENT_JAVADOC	 Create new array. * @param param1 parameter 1. @param param2 parameter 2. @param param3 parameter 3. @return new array. 
protected	TokenNameprotected	
static	TokenNamestatic	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
toArray	TokenNameIdentifier	 to Array
(	TokenNameLPAREN	
final	TokenNamefinal	
Object	TokenNameIdentifier	 Object
param1	TokenNameIdentifier	 param1
,	TokenNameCOMMA	
final	TokenNamefinal	
Object	TokenNameIdentifier	 Object
param2	TokenNameIdentifier	 param2
,	TokenNameCOMMA	
final	TokenNamefinal	
Object	TokenNameIdentifier	 Object
param3	TokenNameIdentifier	 param3
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
param1	TokenNameIdentifier	 param1
,	TokenNameCOMMA	
param2	TokenNameIdentifier	 param2
,	TokenNameCOMMA	
param3	TokenNameIdentifier	 param3
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Create new array. * * @param param1 parameter 1. * @param param2 parameter 2. * @param param3 parameter 3. * @param param4 parameter 4. * @return new array. */	TokenNameCOMMENT_JAVADOC	 Create new array. * @param param1 parameter 1. @param param2 parameter 2. @param param3 parameter 3. @param param4 parameter 4. @return new array. 
protected	TokenNameprotected	
static	TokenNamestatic	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
toArray	TokenNameIdentifier	 to Array
(	TokenNameLPAREN	
final	TokenNamefinal	
Object	TokenNameIdentifier	 Object
param1	TokenNameIdentifier	 param1
,	TokenNameCOMMA	
final	TokenNamefinal	
Object	TokenNameIdentifier	 Object
param2	TokenNameIdentifier	 param2
,	TokenNameCOMMA	
final	TokenNamefinal	
Object	TokenNameIdentifier	 Object
param3	TokenNameIdentifier	 param3
,	TokenNameCOMMA	
final	TokenNamefinal	
Object	TokenNameIdentifier	 Object
param4	TokenNameIdentifier	 param4
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
param1	TokenNameIdentifier	 param1
,	TokenNameCOMMA	
param2	TokenNameIdentifier	 param2
,	TokenNameCOMMA	
param3	TokenNameIdentifier	 param3
,	TokenNameCOMMA	
param4	TokenNameIdentifier	 param4
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Log an entering message at DEBUG level. * * @param logger logger, may not be null. * @param sourceClass source class, may be null. * @param sourceMethod method, may be null. */	TokenNameCOMMENT_JAVADOC	 Log an entering message at DEBUG level. * @param logger logger, may not be null. @param sourceClass source class, may be null. @param sourceMethod method, may be null. 
public	TokenNamepublic	
static	TokenNamestatic	
void	TokenNamevoid	
entering	TokenNameIdentifier	 entering
(	TokenNameLPAREN	
final	TokenNamefinal	
Logger	TokenNameIdentifier	 Logger
logger	TokenNameIdentifier	 logger
,	TokenNameCOMMA	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
sourceClass	TokenNameIdentifier	 source Class
,	TokenNameCOMMA	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
sourceMethod	TokenNameIdentifier	 source Method
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
logger	TokenNameIdentifier	 logger
.	TokenNameDOT	
isDebugEnabled	TokenNameIdentifier	 is Debug Enabled
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
logger	TokenNameIdentifier	 logger
.	TokenNameDOT	
callAppenders	TokenNameIdentifier	 call Appenders
(	TokenNameLPAREN	
new	TokenNamenew	
LoggingEvent	TokenNameIdentifier	 Logging Event
(	TokenNameLPAREN	
FQCN	TokenNameIdentifier	 FQCN
,	TokenNameCOMMA	
logger	TokenNameIdentifier	 logger
,	TokenNameCOMMA	
Level	TokenNameIdentifier	 Level
.	TokenNameDOT	
DEBUG	TokenNameIdentifier	 DEBUG
,	TokenNameCOMMA	
sourceClass	TokenNameIdentifier	 source Class
+	TokenNamePLUS	
"."	TokenNameStringLiteral	.
+	TokenNamePLUS	
sourceMethod	TokenNameIdentifier	 source Method
+	TokenNamePLUS	
" ENTRY"	TokenNameStringLiteral	 ENTRY
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Log an entering message with a parameter at DEBUG level. * * @param logger logger, may not be null. * @param sourceClass source class, may be null. * @param sourceMethod method, may be null. * @param param parameter, may be null. */	TokenNameCOMMENT_JAVADOC	 Log an entering message with a parameter at DEBUG level. * @param logger logger, may not be null. @param sourceClass source class, may be null. @param sourceMethod method, may be null. @param param parameter, may be null. 
public	TokenNamepublic	
static	TokenNamestatic	
void	TokenNamevoid	
entering	TokenNameIdentifier	 entering
(	TokenNameLPAREN	
final	TokenNamefinal	
Logger	TokenNameIdentifier	 Logger
logger	TokenNameIdentifier	 logger
,	TokenNameCOMMA	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
sourceClass	TokenNameIdentifier	 source Class
,	TokenNameCOMMA	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
sourceMethod	TokenNameIdentifier	 source Method
,	TokenNameCOMMA	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
param	TokenNameIdentifier	 param
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
logger	TokenNameIdentifier	 logger
.	TokenNameDOT	
isDebugEnabled	TokenNameIdentifier	 is Debug Enabled
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
msg	TokenNameIdentifier	 msg
=	TokenNameEQUAL	
sourceClass	TokenNameIdentifier	 source Class
+	TokenNamePLUS	
"."	TokenNameStringLiteral	.
+	TokenNamePLUS	
sourceMethod	TokenNameIdentifier	 source Method
+	TokenNamePLUS	
" ENTRY "	TokenNameStringLiteral	 ENTRY 
+	TokenNamePLUS	
param	TokenNameIdentifier	 param
;	TokenNameSEMICOLON	
logger	TokenNameIdentifier	 logger
.	TokenNameDOT	
callAppenders	TokenNameIdentifier	 call Appenders
(	TokenNameLPAREN	
new	TokenNamenew	
LoggingEvent	TokenNameIdentifier	 Logging Event
(	TokenNameLPAREN	
FQCN	TokenNameIdentifier	 FQCN
,	TokenNameCOMMA	
logger	TokenNameIdentifier	 logger
,	TokenNameCOMMA	
Level	TokenNameIdentifier	 Level
.	TokenNameDOT	
DEBUG	TokenNameIdentifier	 DEBUG
,	TokenNameCOMMA	
msg	TokenNameIdentifier	 msg
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Log an entering message with a parameter at DEBUG level. * * @param logger logger, may not be null. * @param sourceClass source class, may be null. * @param sourceMethod method, may be null. * @param param parameter, may be null. */	TokenNameCOMMENT_JAVADOC	 Log an entering message with a parameter at DEBUG level. * @param logger logger, may not be null. @param sourceClass source class, may be null. @param sourceMethod method, may be null. @param param parameter, may be null. 
public	TokenNamepublic	
static	TokenNamestatic	
void	TokenNamevoid	
entering	TokenNameIdentifier	 entering
(	TokenNameLPAREN	
final	TokenNamefinal	
Logger	TokenNameIdentifier	 Logger
logger	TokenNameIdentifier	 logger
,	TokenNameCOMMA	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
sourceClass	TokenNameIdentifier	 source Class
,	TokenNameCOMMA	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
sourceMethod	TokenNameIdentifier	 source Method
,	TokenNameCOMMA	
final	TokenNamefinal	
Object	TokenNameIdentifier	 Object
param	TokenNameIdentifier	 param
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
logger	TokenNameIdentifier	 logger
.	TokenNameDOT	
isDebugEnabled	TokenNameIdentifier	 is Debug Enabled
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
msg	TokenNameIdentifier	 msg
=	TokenNameEQUAL	
sourceClass	TokenNameIdentifier	 source Class
+	TokenNamePLUS	
"."	TokenNameStringLiteral	.
+	TokenNamePLUS	
sourceMethod	TokenNameIdentifier	 source Method
+	TokenNamePLUS	
" ENTRY "	TokenNameStringLiteral	 ENTRY 
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
param	TokenNameIdentifier	 param
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
msg	TokenNameIdentifier	 msg
+=	TokenNamePLUS_EQUAL	
"null"	TokenNameStringLiteral	null
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
msg	TokenNameIdentifier	 msg
+=	TokenNamePLUS_EQUAL	
param	TokenNameIdentifier	 param
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
Throwable	TokenNameIdentifier	 Throwable
ex	TokenNameIdentifier	 ex
)	TokenNameRPAREN	
{	TokenNameLBRACE	
msg	TokenNameIdentifier	 msg
+=	TokenNamePLUS_EQUAL	
"?"	TokenNameStringLiteral	?
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
logger	TokenNameIdentifier	 logger
.	TokenNameDOT	
callAppenders	TokenNameIdentifier	 call Appenders
(	TokenNameLPAREN	
new	TokenNamenew	
LoggingEvent	TokenNameIdentifier	 Logging Event
(	TokenNameLPAREN	
FQCN	TokenNameIdentifier	 FQCN
,	TokenNameCOMMA	
logger	TokenNameIdentifier	 logger
,	TokenNameCOMMA	
Level	TokenNameIdentifier	 Level
.	TokenNameDOT	
DEBUG	TokenNameIdentifier	 DEBUG
,	TokenNameCOMMA	
msg	TokenNameIdentifier	 msg
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Log an entering message with an array of parameters at DEBUG level. * * @param logger logger, may not be null. * @param sourceClass source class, may be null. * @param sourceMethod method, may be null. * @param params parameters, may be null. */	TokenNameCOMMENT_JAVADOC	 Log an entering message with an array of parameters at DEBUG level. * @param logger logger, may not be null. @param sourceClass source class, may be null. @param sourceMethod method, may be null. @param params parameters, may be null. 
public	TokenNamepublic	
static	TokenNamestatic	
void	TokenNamevoid	
entering	TokenNameIdentifier	 entering
(	TokenNameLPAREN	
final	TokenNamefinal	
Logger	TokenNameIdentifier	 Logger
logger	TokenNameIdentifier	 logger
,	TokenNameCOMMA	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
sourceClass	TokenNameIdentifier	 source Class
,	TokenNameCOMMA	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
sourceMethod	TokenNameIdentifier	 source Method
,	TokenNameCOMMA	
final	TokenNamefinal	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
params	TokenNameIdentifier	 params
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
logger	TokenNameIdentifier	 logger
.	TokenNameDOT	
isDebugEnabled	TokenNameIdentifier	 is Debug Enabled
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
msg	TokenNameIdentifier	 msg
=	TokenNameEQUAL	
sourceClass	TokenNameIdentifier	 source Class
+	TokenNamePLUS	
"."	TokenNameStringLiteral	.
+	TokenNamePLUS	
sourceMethod	TokenNameIdentifier	 source Method
+	TokenNamePLUS	
" ENTRY "	TokenNameStringLiteral	 ENTRY 
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
params	TokenNameIdentifier	 params
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
params	TokenNameIdentifier	 params
.	TokenNameDOT	
length	TokenNameIdentifier	 length
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
delim	TokenNameIdentifier	 delim
=	TokenNameEQUAL	
"{"	TokenNameStringLiteral	{
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
params	TokenNameIdentifier	 params
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
msg	TokenNameIdentifier	 msg
+=	TokenNamePLUS_EQUAL	
delim	TokenNameIdentifier	 delim
+	TokenNamePLUS	
params	TokenNameIdentifier	 params
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
Throwable	TokenNameIdentifier	 Throwable
ex	TokenNameIdentifier	 ex
)	TokenNameRPAREN	
{	TokenNameLBRACE	
msg	TokenNameIdentifier	 msg
+=	TokenNamePLUS_EQUAL	
delim	TokenNameIdentifier	 delim
+	TokenNamePLUS	
"?"	TokenNameStringLiteral	?
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
delim	TokenNameIdentifier	 delim
=	TokenNameEQUAL	
","	TokenNameStringLiteral	,
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
msg	TokenNameIdentifier	 msg
+=	TokenNamePLUS_EQUAL	
"}"	TokenNameStringLiteral	}
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
msg	TokenNameIdentifier	 msg
+=	TokenNamePLUS_EQUAL	
"{}"	TokenNameStringLiteral	{}
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
logger	TokenNameIdentifier	 logger
.	TokenNameDOT	
callAppenders	TokenNameIdentifier	 call Appenders
(	TokenNameLPAREN	
new	TokenNamenew	
LoggingEvent	TokenNameIdentifier	 Logging Event
(	TokenNameLPAREN	
FQCN	TokenNameIdentifier	 FQCN
,	TokenNameCOMMA	
logger	TokenNameIdentifier	 logger
,	TokenNameCOMMA	
Level	TokenNameIdentifier	 Level
.	TokenNameDOT	
DEBUG	TokenNameIdentifier	 DEBUG
,	TokenNameCOMMA	
msg	TokenNameIdentifier	 msg
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Log an exiting message at DEBUG level. * * @param logger logger, may not be null. * @param sourceClass source class, may be null. * @param sourceMethod method, may be null. */	TokenNameCOMMENT_JAVADOC	 Log an exiting message at DEBUG level. * @param logger logger, may not be null. @param sourceClass source class, may be null. @param sourceMethod method, may be null. 
public	TokenNamepublic	
static	TokenNamestatic	
void	TokenNamevoid	
exiting	TokenNameIdentifier	 exiting
(	TokenNameLPAREN	
final	TokenNamefinal	
Logger	TokenNameIdentifier	 Logger
logger	TokenNameIdentifier	 logger
,	TokenNameCOMMA	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
sourceClass	TokenNameIdentifier	 source Class
,	TokenNameCOMMA	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
sourceMethod	TokenNameIdentifier	 source Method
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
logger	TokenNameIdentifier	 logger
.	TokenNameDOT	
isDebugEnabled	TokenNameIdentifier	 is Debug Enabled
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
logger	TokenNameIdentifier	 logger
.	TokenNameDOT	
callAppenders	TokenNameIdentifier	 call Appenders
(	TokenNameLPAREN	
new	TokenNamenew	
LoggingEvent	TokenNameIdentifier	 Logging Event
(	TokenNameLPAREN	
FQCN	TokenNameIdentifier	 FQCN
,	TokenNameCOMMA	
logger	TokenNameIdentifier	 logger
,	TokenNameCOMMA	
Level	TokenNameIdentifier	 Level
.	TokenNameDOT	
DEBUG	TokenNameIdentifier	 DEBUG
,	TokenNameCOMMA	
sourceClass	TokenNameIdentifier	 source Class
+	TokenNamePLUS	
"."	TokenNameStringLiteral	.
+	TokenNamePLUS	
sourceMethod	TokenNameIdentifier	 source Method
+	TokenNamePLUS	
" RETURN"	TokenNameStringLiteral	 RETURN
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Log an exiting message with result at DEBUG level. * * @param logger logger, may not be null. * @param sourceClass source class, may be null. * @param sourceMethod method, may be null. * @param result result, may be null. */	TokenNameCOMMENT_JAVADOC	 Log an exiting message with result at DEBUG level. * @param logger logger, may not be null. @param sourceClass source class, may be null. @param sourceMethod method, may be null. @param result result, may be null. 
public	TokenNamepublic	
static	TokenNamestatic	
void	TokenNamevoid	
exiting	TokenNameIdentifier	 exiting
(	TokenNameLPAREN	
final	TokenNamefinal	
Logger	TokenNameIdentifier	 Logger
logger	TokenNameIdentifier	 logger
,	TokenNameCOMMA	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
sourceClass	TokenNameIdentifier	 source Class
,	TokenNameCOMMA	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
sourceMethod	TokenNameIdentifier	 source Method
,	TokenNameCOMMA	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
result	TokenNameIdentifier	 result
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
logger	TokenNameIdentifier	 logger
.	TokenNameDOT	
isDebugEnabled	TokenNameIdentifier	 is Debug Enabled
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
logger	TokenNameIdentifier	 logger
.	TokenNameDOT	
callAppenders	TokenNameIdentifier	 call Appenders
(	TokenNameLPAREN	
new	TokenNamenew	
LoggingEvent	TokenNameIdentifier	 Logging Event
(	TokenNameLPAREN	
FQCN	TokenNameIdentifier	 FQCN
,	TokenNameCOMMA	
logger	TokenNameIdentifier	 logger
,	TokenNameCOMMA	
Level	TokenNameIdentifier	 Level
.	TokenNameDOT	
DEBUG	TokenNameIdentifier	 DEBUG
,	TokenNameCOMMA	
sourceClass	TokenNameIdentifier	 source Class
+	TokenNamePLUS	
"."	TokenNameStringLiteral	.
+	TokenNamePLUS	
sourceMethod	TokenNameIdentifier	 source Method
+	TokenNamePLUS	
" RETURN "	TokenNameStringLiteral	 RETURN 
+	TokenNamePLUS	
result	TokenNameIdentifier	 result
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Log an exiting message with result at DEBUG level. * * @param logger logger, may not be null. * @param sourceClass source class, may be null. * @param sourceMethod method, may be null. * @param result result, may be null. */	TokenNameCOMMENT_JAVADOC	 Log an exiting message with result at DEBUG level. * @param logger logger, may not be null. @param sourceClass source class, may be null. @param sourceMethod method, may be null. @param result result, may be null. 
public	TokenNamepublic	
static	TokenNamestatic	
void	TokenNamevoid	
exiting	TokenNameIdentifier	 exiting
(	TokenNameLPAREN	
final	TokenNamefinal	
Logger	TokenNameIdentifier	 Logger
logger	TokenNameIdentifier	 logger
,	TokenNameCOMMA	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
sourceClass	TokenNameIdentifier	 source Class
,	TokenNameCOMMA	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
sourceMethod	TokenNameIdentifier	 source Method
,	TokenNameCOMMA	
final	TokenNamefinal	
Object	TokenNameIdentifier	 Object
result	TokenNameIdentifier	 result
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
logger	TokenNameIdentifier	 logger
.	TokenNameDOT	
isDebugEnabled	TokenNameIdentifier	 is Debug Enabled
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
msg	TokenNameIdentifier	 msg
=	TokenNameEQUAL	
sourceClass	TokenNameIdentifier	 source Class
+	TokenNamePLUS	
"."	TokenNameStringLiteral	.
+	TokenNamePLUS	
sourceMethod	TokenNameIdentifier	 source Method
+	TokenNamePLUS	
" RETURN "	TokenNameStringLiteral	 RETURN 
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
result	TokenNameIdentifier	 result
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
msg	TokenNameIdentifier	 msg
+=	TokenNamePLUS_EQUAL	
"null"	TokenNameStringLiteral	null
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
msg	TokenNameIdentifier	 msg
+=	TokenNamePLUS_EQUAL	
result	TokenNameIdentifier	 result
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
Throwable	TokenNameIdentifier	 Throwable
ex	TokenNameIdentifier	 ex
)	TokenNameRPAREN	
{	TokenNameLBRACE	
msg	TokenNameIdentifier	 msg
+=	TokenNamePLUS_EQUAL	
"?"	TokenNameStringLiteral	?
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
logger	TokenNameIdentifier	 logger
.	TokenNameDOT	
callAppenders	TokenNameIdentifier	 call Appenders
(	TokenNameLPAREN	
new	TokenNamenew	
LoggingEvent	TokenNameIdentifier	 Logging Event
(	TokenNameLPAREN	
FQCN	TokenNameIdentifier	 FQCN
,	TokenNameCOMMA	
logger	TokenNameIdentifier	 logger
,	TokenNameCOMMA	
Level	TokenNameIdentifier	 Level
.	TokenNameDOT	
DEBUG	TokenNameIdentifier	 DEBUG
,	TokenNameCOMMA	
msg	TokenNameIdentifier	 msg
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Logs a throwing message at DEBUG level. * * @param logger logger, may not be null. * @param sourceClass source class, may be null. * @param sourceMethod method, may be null. * @param thrown throwable, may be null. */	TokenNameCOMMENT_JAVADOC	 Logs a throwing message at DEBUG level. * @param logger logger, may not be null. @param sourceClass source class, may be null. @param sourceMethod method, may be null. @param thrown throwable, may be null. 
public	TokenNamepublic	
static	TokenNamestatic	
void	TokenNamevoid	
throwing	TokenNameIdentifier	 throwing
(	TokenNameLPAREN	
final	TokenNamefinal	
Logger	TokenNameIdentifier	 Logger
logger	TokenNameIdentifier	 logger
,	TokenNameCOMMA	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
sourceClass	TokenNameIdentifier	 source Class
,	TokenNameCOMMA	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
sourceMethod	TokenNameIdentifier	 source Method
,	TokenNameCOMMA	
final	TokenNamefinal	
Throwable	TokenNameIdentifier	 Throwable
thrown	TokenNameIdentifier	 thrown
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
logger	TokenNameIdentifier	 logger
.	TokenNameDOT	
isDebugEnabled	TokenNameIdentifier	 is Debug Enabled
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
logger	TokenNameIdentifier	 logger
.	TokenNameDOT	
callAppenders	TokenNameIdentifier	 call Appenders
(	TokenNameLPAREN	
new	TokenNamenew	
LoggingEvent	TokenNameIdentifier	 Logging Event
(	TokenNameLPAREN	
FQCN	TokenNameIdentifier	 FQCN
,	TokenNameCOMMA	
logger	TokenNameIdentifier	 logger
,	TokenNameCOMMA	
Level	TokenNameIdentifier	 Level
.	TokenNameDOT	
DEBUG	TokenNameIdentifier	 DEBUG
,	TokenNameCOMMA	
sourceClass	TokenNameIdentifier	 source Class
+	TokenNamePLUS	
"."	TokenNameStringLiteral	.
+	TokenNamePLUS	
sourceMethod	TokenNameIdentifier	 source Method
+	TokenNamePLUS	
" THROW"	TokenNameStringLiteral	 THROW
,	TokenNameCOMMA	
thrown	TokenNameIdentifier	 thrown
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
