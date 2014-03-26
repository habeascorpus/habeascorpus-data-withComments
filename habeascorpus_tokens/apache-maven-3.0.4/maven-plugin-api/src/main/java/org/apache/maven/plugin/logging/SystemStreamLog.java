package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
maven	TokenNameIdentifier	 maven
.	TokenNameDOT	
plugin	TokenNameIdentifier	 plugin
.	TokenNameDOT	
logging	TokenNameIdentifier	 logging
;	TokenNameSEMICOLON	
/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the * "License"); you may not use this file except in compliance * with the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, * software distributed under the License is distributed on an * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY * KIND, either express or implied. See the License for the * specific language governing permissions and limitations * under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
PrintWriter	TokenNameIdentifier	 Print Writer
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
StringWriter	TokenNameIdentifier	 String Writer
;	TokenNameSEMICOLON	
/** * Logger with "standard" output and error output stream. * * @author jdcasey */	TokenNameCOMMENT_JAVADOC	 Logger with "standard" output and error output stream. * @author jdcasey 
public	TokenNamepublic	
class	TokenNameclass	
SystemStreamLog	TokenNameIdentifier	 System Stream Log
implements	TokenNameimplements	
Log	TokenNameIdentifier	 Log
{	TokenNameLBRACE	
/** * @see org.apache.maven.plugin.logging.Log#debug(java.lang.CharSequence) */	TokenNameCOMMENT_JAVADOC	 @see org.apache.maven.plugin.logging.Log#debug(java.lang.CharSequence) 
public	TokenNamepublic	
void	TokenNamevoid	
debug	TokenNameIdentifier	 debug
(	TokenNameLPAREN	
CharSequence	TokenNameIdentifier	 Char Sequence
content	TokenNameIdentifier	 content
)	TokenNameRPAREN	
{	TokenNameLBRACE	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
"debug"	TokenNameStringLiteral	debug
,	TokenNameCOMMA	
content	TokenNameIdentifier	 content
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @see org.apache.maven.plugin.logging.Log#debug(java.lang.CharSequence, java.lang.Throwable) */	TokenNameCOMMENT_JAVADOC	 @see org.apache.maven.plugin.logging.Log#debug(java.lang.CharSequence, java.lang.Throwable) 
public	TokenNamepublic	
void	TokenNamevoid	
debug	TokenNameIdentifier	 debug
(	TokenNameLPAREN	
CharSequence	TokenNameIdentifier	 Char Sequence
content	TokenNameIdentifier	 content
,	TokenNameCOMMA	
Throwable	TokenNameIdentifier	 Throwable
error	TokenNameIdentifier	 error
)	TokenNameRPAREN	
{	TokenNameLBRACE	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
"debug"	TokenNameStringLiteral	debug
,	TokenNameCOMMA	
content	TokenNameIdentifier	 content
,	TokenNameCOMMA	
error	TokenNameIdentifier	 error
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @see org.apache.maven.plugin.logging.Log#debug(java.lang.Throwable) */	TokenNameCOMMENT_JAVADOC	 @see org.apache.maven.plugin.logging.Log#debug(java.lang.Throwable) 
public	TokenNamepublic	
void	TokenNamevoid	
debug	TokenNameIdentifier	 debug
(	TokenNameLPAREN	
Throwable	TokenNameIdentifier	 Throwable
error	TokenNameIdentifier	 error
)	TokenNameRPAREN	
{	TokenNameLBRACE	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
"debug"	TokenNameStringLiteral	debug
,	TokenNameCOMMA	
error	TokenNameIdentifier	 error
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @see org.apache.maven.plugin.logging.Log#info(java.lang.CharSequence) */	TokenNameCOMMENT_JAVADOC	 @see org.apache.maven.plugin.logging.Log#info(java.lang.CharSequence) 
public	TokenNamepublic	
void	TokenNamevoid	
info	TokenNameIdentifier	 info
(	TokenNameLPAREN	
CharSequence	TokenNameIdentifier	 Char Sequence
content	TokenNameIdentifier	 content
)	TokenNameRPAREN	
{	TokenNameLBRACE	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
"info"	TokenNameStringLiteral	info
,	TokenNameCOMMA	
content	TokenNameIdentifier	 content
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @see org.apache.maven.plugin.logging.Log#info(java.lang.CharSequence, java.lang.Throwable) */	TokenNameCOMMENT_JAVADOC	 @see org.apache.maven.plugin.logging.Log#info(java.lang.CharSequence, java.lang.Throwable) 
public	TokenNamepublic	
void	TokenNamevoid	
info	TokenNameIdentifier	 info
(	TokenNameLPAREN	
CharSequence	TokenNameIdentifier	 Char Sequence
content	TokenNameIdentifier	 content
,	TokenNameCOMMA	
Throwable	TokenNameIdentifier	 Throwable
error	TokenNameIdentifier	 error
)	TokenNameRPAREN	
{	TokenNameLBRACE	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
"info"	TokenNameStringLiteral	info
,	TokenNameCOMMA	
content	TokenNameIdentifier	 content
,	TokenNameCOMMA	
error	TokenNameIdentifier	 error
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @see org.apache.maven.plugin.logging.Log#info(java.lang.Throwable) */	TokenNameCOMMENT_JAVADOC	 @see org.apache.maven.plugin.logging.Log#info(java.lang.Throwable) 
public	TokenNamepublic	
void	TokenNamevoid	
info	TokenNameIdentifier	 info
(	TokenNameLPAREN	
Throwable	TokenNameIdentifier	 Throwable
error	TokenNameIdentifier	 error
)	TokenNameRPAREN	
{	TokenNameLBRACE	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
"info"	TokenNameStringLiteral	info
,	TokenNameCOMMA	
error	TokenNameIdentifier	 error
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @see org.apache.maven.plugin.logging.Log#warn(java.lang.CharSequence) */	TokenNameCOMMENT_JAVADOC	 @see org.apache.maven.plugin.logging.Log#warn(java.lang.CharSequence) 
public	TokenNamepublic	
void	TokenNamevoid	
warn	TokenNameIdentifier	 warn
(	TokenNameLPAREN	
CharSequence	TokenNameIdentifier	 Char Sequence
content	TokenNameIdentifier	 content
)	TokenNameRPAREN	
{	TokenNameLBRACE	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
"warn"	TokenNameStringLiteral	warn
,	TokenNameCOMMA	
content	TokenNameIdentifier	 content
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @see org.apache.maven.plugin.logging.Log#warn(java.lang.CharSequence, java.lang.Throwable) */	TokenNameCOMMENT_JAVADOC	 @see org.apache.maven.plugin.logging.Log#warn(java.lang.CharSequence, java.lang.Throwable) 
public	TokenNamepublic	
void	TokenNamevoid	
warn	TokenNameIdentifier	 warn
(	TokenNameLPAREN	
CharSequence	TokenNameIdentifier	 Char Sequence
content	TokenNameIdentifier	 content
,	TokenNameCOMMA	
Throwable	TokenNameIdentifier	 Throwable
error	TokenNameIdentifier	 error
)	TokenNameRPAREN	
{	TokenNameLBRACE	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
"warn"	TokenNameStringLiteral	warn
,	TokenNameCOMMA	
content	TokenNameIdentifier	 content
,	TokenNameCOMMA	
error	TokenNameIdentifier	 error
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @see org.apache.maven.plugin.logging.Log#warn(java.lang.Throwable) */	TokenNameCOMMENT_JAVADOC	 @see org.apache.maven.plugin.logging.Log#warn(java.lang.Throwable) 
public	TokenNamepublic	
void	TokenNamevoid	
warn	TokenNameIdentifier	 warn
(	TokenNameLPAREN	
Throwable	TokenNameIdentifier	 Throwable
error	TokenNameIdentifier	 error
)	TokenNameRPAREN	
{	TokenNameLBRACE	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
"warn"	TokenNameStringLiteral	warn
,	TokenNameCOMMA	
error	TokenNameIdentifier	 error
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @see org.apache.maven.plugin.logging.Log#error(java.lang.CharSequence) */	TokenNameCOMMENT_JAVADOC	 @see org.apache.maven.plugin.logging.Log#error(java.lang.CharSequence) 
public	TokenNamepublic	
void	TokenNamevoid	
error	TokenNameIdentifier	 error
(	TokenNameLPAREN	
CharSequence	TokenNameIdentifier	 Char Sequence
content	TokenNameIdentifier	 content
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
err	TokenNameIdentifier	 err
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"[error] "	TokenNameStringLiteral	[error] 
+	TokenNamePLUS	
content	TokenNameIdentifier	 content
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @see org.apache.maven.plugin.logging.Log#error(java.lang.CharSequence, java.lang.Throwable) */	TokenNameCOMMENT_JAVADOC	 @see org.apache.maven.plugin.logging.Log#error(java.lang.CharSequence, java.lang.Throwable) 
public	TokenNamepublic	
void	TokenNamevoid	
error	TokenNameIdentifier	 error
(	TokenNameLPAREN	
CharSequence	TokenNameIdentifier	 Char Sequence
content	TokenNameIdentifier	 content
,	TokenNameCOMMA	
Throwable	TokenNameIdentifier	 Throwable
error	TokenNameIdentifier	 error
)	TokenNameRPAREN	
{	TokenNameLBRACE	
StringWriter	TokenNameIdentifier	 String Writer
sWriter	TokenNameIdentifier	 s Writer
=	TokenNameEQUAL	
new	TokenNamenew	
StringWriter	TokenNameIdentifier	 String Writer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
PrintWriter	TokenNameIdentifier	 Print Writer
pWriter	TokenNameIdentifier	 p Writer
=	TokenNameEQUAL	
new	TokenNamenew	
PrintWriter	TokenNameIdentifier	 Print Writer
(	TokenNameLPAREN	
sWriter	TokenNameIdentifier	 s Writer
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
error	TokenNameIdentifier	 error
.	TokenNameDOT	
printStackTrace	TokenNameIdentifier	 print Stack Trace
(	TokenNameLPAREN	
pWriter	TokenNameIdentifier	 p Writer
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
err	TokenNameIdentifier	 err
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"[error] "	TokenNameStringLiteral	[error] 
+	TokenNamePLUS	
content	TokenNameIdentifier	 content
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
" "	TokenNameStringLiteral	 
+	TokenNamePLUS	
sWriter	TokenNameIdentifier	 s Writer
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @see org.apache.maven.plugin.logging.Log#error(java.lang.Throwable) */	TokenNameCOMMENT_JAVADOC	 @see org.apache.maven.plugin.logging.Log#error(java.lang.Throwable) 
public	TokenNamepublic	
void	TokenNamevoid	
error	TokenNameIdentifier	 error
(	TokenNameLPAREN	
Throwable	TokenNameIdentifier	 Throwable
error	TokenNameIdentifier	 error
)	TokenNameRPAREN	
{	TokenNameLBRACE	
StringWriter	TokenNameIdentifier	 String Writer
sWriter	TokenNameIdentifier	 s Writer
=	TokenNameEQUAL	
new	TokenNamenew	
StringWriter	TokenNameIdentifier	 String Writer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
PrintWriter	TokenNameIdentifier	 Print Writer
pWriter	TokenNameIdentifier	 p Writer
=	TokenNameEQUAL	
new	TokenNamenew	
PrintWriter	TokenNameIdentifier	 Print Writer
(	TokenNameLPAREN	
sWriter	TokenNameIdentifier	 s Writer
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
error	TokenNameIdentifier	 error
.	TokenNameDOT	
printStackTrace	TokenNameIdentifier	 print Stack Trace
(	TokenNameLPAREN	
pWriter	TokenNameIdentifier	 p Writer
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
err	TokenNameIdentifier	 err
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"[error] "	TokenNameStringLiteral	[error] 
+	TokenNamePLUS	
sWriter	TokenNameIdentifier	 s Writer
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @see org.apache.maven.plugin.logging.Log#isDebugEnabled() */	TokenNameCOMMENT_JAVADOC	 @see org.apache.maven.plugin.logging.Log#isDebugEnabled() 
public	TokenNamepublic	
boolean	TokenNameboolean	
isDebugEnabled	TokenNameIdentifier	 is Debug Enabled
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// TODO: Not sure how best to set these for this implementation... 	TokenNameCOMMENT_LINE	TODO: Not sure how best to set these for this implementation... 
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @see org.apache.maven.plugin.logging.Log#isInfoEnabled() */	TokenNameCOMMENT_JAVADOC	 @see org.apache.maven.plugin.logging.Log#isInfoEnabled() 
public	TokenNamepublic	
boolean	TokenNameboolean	
isInfoEnabled	TokenNameIdentifier	 is Info Enabled
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @see org.apache.maven.plugin.logging.Log#isWarnEnabled() */	TokenNameCOMMENT_JAVADOC	 @see org.apache.maven.plugin.logging.Log#isWarnEnabled() 
public	TokenNamepublic	
boolean	TokenNameboolean	
isWarnEnabled	TokenNameIdentifier	 is Warn Enabled
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @see org.apache.maven.plugin.logging.Log#isErrorEnabled() */	TokenNameCOMMENT_JAVADOC	 @see org.apache.maven.plugin.logging.Log#isErrorEnabled() 
public	TokenNamepublic	
boolean	TokenNameboolean	
isErrorEnabled	TokenNameIdentifier	 is Error Enabled
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
void	TokenNamevoid	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
prefix	TokenNameIdentifier	 prefix
,	TokenNameCOMMA	
CharSequence	TokenNameIdentifier	 Char Sequence
content	TokenNameIdentifier	 content
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"["	TokenNameStringLiteral	[
+	TokenNamePLUS	
prefix	TokenNameIdentifier	 prefix
+	TokenNamePLUS	
"] "	TokenNameStringLiteral	] 
+	TokenNamePLUS	
content	TokenNameIdentifier	 content
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
void	TokenNamevoid	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
prefix	TokenNameIdentifier	 prefix
,	TokenNameCOMMA	
Throwable	TokenNameIdentifier	 Throwable
error	TokenNameIdentifier	 error
)	TokenNameRPAREN	
{	TokenNameLBRACE	
StringWriter	TokenNameIdentifier	 String Writer
sWriter	TokenNameIdentifier	 s Writer
=	TokenNameEQUAL	
new	TokenNamenew	
StringWriter	TokenNameIdentifier	 String Writer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
PrintWriter	TokenNameIdentifier	 Print Writer
pWriter	TokenNameIdentifier	 p Writer
=	TokenNameEQUAL	
new	TokenNamenew	
PrintWriter	TokenNameIdentifier	 Print Writer
(	TokenNameLPAREN	
sWriter	TokenNameIdentifier	 s Writer
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
error	TokenNameIdentifier	 error
.	TokenNameDOT	
printStackTrace	TokenNameIdentifier	 print Stack Trace
(	TokenNameLPAREN	
pWriter	TokenNameIdentifier	 p Writer
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"["	TokenNameStringLiteral	[
+	TokenNamePLUS	
prefix	TokenNameIdentifier	 prefix
+	TokenNamePLUS	
"] "	TokenNameStringLiteral	] 
+	TokenNamePLUS	
sWriter	TokenNameIdentifier	 s Writer
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
void	TokenNamevoid	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
prefix	TokenNameIdentifier	 prefix
,	TokenNameCOMMA	
CharSequence	TokenNameIdentifier	 Char Sequence
content	TokenNameIdentifier	 content
,	TokenNameCOMMA	
Throwable	TokenNameIdentifier	 Throwable
error	TokenNameIdentifier	 error
)	TokenNameRPAREN	
{	TokenNameLBRACE	
StringWriter	TokenNameIdentifier	 String Writer
sWriter	TokenNameIdentifier	 s Writer
=	TokenNameEQUAL	
new	TokenNamenew	
StringWriter	TokenNameIdentifier	 String Writer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
PrintWriter	TokenNameIdentifier	 Print Writer
pWriter	TokenNameIdentifier	 p Writer
=	TokenNameEQUAL	
new	TokenNamenew	
PrintWriter	TokenNameIdentifier	 Print Writer
(	TokenNameLPAREN	
sWriter	TokenNameIdentifier	 s Writer
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
error	TokenNameIdentifier	 error
.	TokenNameDOT	
printStackTrace	TokenNameIdentifier	 print Stack Trace
(	TokenNameLPAREN	
pWriter	TokenNameIdentifier	 p Writer
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"["	TokenNameStringLiteral	[
+	TokenNamePLUS	
prefix	TokenNameIdentifier	 prefix
+	TokenNamePLUS	
"] "	TokenNameStringLiteral	] 
+	TokenNamePLUS	
content	TokenNameIdentifier	 content
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
" "	TokenNameStringLiteral	 
+	TokenNamePLUS	
sWriter	TokenNameIdentifier	 s Writer
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
