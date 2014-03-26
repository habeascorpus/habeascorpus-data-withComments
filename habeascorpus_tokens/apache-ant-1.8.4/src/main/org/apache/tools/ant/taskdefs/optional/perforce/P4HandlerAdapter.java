/* * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. * */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
tools	TokenNameIdentifier	 tools
.	TokenNameDOT	
ant	TokenNameIdentifier	 ant
.	TokenNameDOT	
taskdefs	TokenNameIdentifier	 taskdefs
.	TokenNameDOT	
optional	TokenNameIdentifier	 optional
.	TokenNameDOT	
perforce	TokenNameIdentifier	 perforce
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
ByteArrayInputStream	TokenNameIdentifier	 Byte Array Input Stream
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
IOException	TokenNameIdentifier	 IO Exception
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
InputStream	TokenNameIdentifier	 Input Stream
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
OutputStream	TokenNameIdentifier	 Output Stream
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
tools	TokenNameIdentifier	 tools
.	TokenNameDOT	
ant	TokenNameIdentifier	 ant
.	TokenNameDOT	
BuildException	TokenNameIdentifier	 Build Exception
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
tools	TokenNameIdentifier	 tools
.	TokenNameDOT	
ant	TokenNameIdentifier	 ant
.	TokenNameDOT	
taskdefs	TokenNameIdentifier	 taskdefs
.	TokenNameDOT	
PumpStreamHandler	TokenNameIdentifier	 Pump Stream Handler
;	TokenNameSEMICOLON	
/** * base class to manage streams around the execution of the Perforce * command line client */	TokenNameCOMMENT_JAVADOC	 base class to manage streams around the execution of the Perforce command line client 
public	TokenNamepublic	
abstract	TokenNameabstract	
class	TokenNameclass	
P4HandlerAdapter	TokenNameIdentifier	 P4 Handler Adapter
implements	TokenNameimplements	
P4Handler	TokenNameIdentifier	 P4 Handler
{	TokenNameLBRACE	
// CheckStyle:VisibilityModifier OFF - bc 	TokenNameCOMMENT_LINE	CheckStyle:VisibilityModifier OFF - bc 
String	TokenNameIdentifier	 String
p4input	TokenNameIdentifier	 p4input
=	TokenNameEQUAL	
""	TokenNameStringLiteral	 
;	TokenNameSEMICOLON	
private	TokenNameprivate	
PumpStreamHandler	TokenNameIdentifier	 Pump Stream Handler
myHandler	TokenNameIdentifier	 my Handler
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
// CheckStyle:VisibilityModifier ON 	TokenNameCOMMENT_LINE	CheckStyle:VisibilityModifier ON 
/** * set any data to be written to P4's stdin * @param p4Input the text to write to P4's stdin */	TokenNameCOMMENT_JAVADOC	 set any data to be written to P4's stdin @param p4Input the text to write to P4's stdin 
public	TokenNamepublic	
void	TokenNamevoid	
setOutput	TokenNameIdentifier	 set Output
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
p4Input	TokenNameIdentifier	 p4 Input
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
p4input	TokenNameIdentifier	 p4input
=	TokenNameEQUAL	
p4Input	TokenNameIdentifier	 p4 Input
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * subclasses of P4HandlerAdapter must implement this routine * processing of one line of stdout or of stderr * @param line line of stdout or stderr to process */	TokenNameCOMMENT_JAVADOC	 subclasses of P4HandlerAdapter must implement this routine processing of one line of stdout or of stderr @param line line of stdout or stderr to process 
public	TokenNamepublic	
abstract	TokenNameabstract	
void	TokenNamevoid	
process	TokenNameIdentifier	 process
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
line	TokenNameIdentifier	 line
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * this routine gets called by the execute routine of the Execute class * it connects the PumpStreamHandler to the input/output/error streams of the process. * @throws BuildException if there is a error. * @see org.apache.tools.ant.taskdefs.Execute#execute */	TokenNameCOMMENT_JAVADOC	 this routine gets called by the execute routine of the Execute class it connects the PumpStreamHandler to the input/output/error streams of the process. @throws BuildException if there is a error. @see org.apache.tools.ant.taskdefs.Execute#execute 
public	TokenNamepublic	
void	TokenNamevoid	
start	TokenNameIdentifier	 start
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
BuildException	TokenNameIdentifier	 Build Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
p4input	TokenNameIdentifier	 p4input
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
p4input	TokenNameIdentifier	 p4input
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
myHandler	TokenNameIdentifier	 my Handler
=	TokenNameEQUAL	
new	TokenNamenew	
PumpStreamHandler	TokenNameIdentifier	 Pump Stream Handler
(	TokenNameLPAREN	
new	TokenNamenew	
P4OutputStream	TokenNameIdentifier	 P4 Output Stream
(	TokenNameLPAREN	
this	TokenNamethis	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
new	TokenNamenew	
P4OutputStream	TokenNameIdentifier	 P4 Output Stream
(	TokenNameLPAREN	
this	TokenNamethis	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
new	TokenNamenew	
ByteArrayInputStream	TokenNameIdentifier	 Byte Array Input Stream
(	TokenNameLPAREN	
p4input	TokenNameIdentifier	 p4input
.	TokenNameDOT	
getBytes	TokenNameIdentifier	 get Bytes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
myHandler	TokenNameIdentifier	 my Handler
=	TokenNameEQUAL	
new	TokenNamenew	
PumpStreamHandler	TokenNameIdentifier	 Pump Stream Handler
(	TokenNameLPAREN	
new	TokenNamenew	
P4OutputStream	TokenNameIdentifier	 P4 Output Stream
(	TokenNameLPAREN	
this	TokenNamethis	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
new	TokenNamenew	
P4OutputStream	TokenNameIdentifier	 P4 Output Stream
(	TokenNameLPAREN	
this	TokenNamethis	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
myHandler	TokenNameIdentifier	 my Handler
.	TokenNameDOT	
setProcessInputStream	TokenNameIdentifier	 set Process Input Stream
(	TokenNameLPAREN	
os	TokenNameIdentifier	 os
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
myHandler	TokenNameIdentifier	 my Handler
.	TokenNameDOT	
setProcessErrorStream	TokenNameIdentifier	 set Process Error Stream
(	TokenNameLPAREN	
es	TokenNameIdentifier	 es
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
myHandler	TokenNameIdentifier	 my Handler
.	TokenNameDOT	
setProcessOutputStream	TokenNameIdentifier	 set Process Output Stream
(	TokenNameLPAREN	
is	TokenNameIdentifier	 is
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
myHandler	TokenNameIdentifier	 my Handler
.	TokenNameDOT	
start	TokenNameIdentifier	 start
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * stops the processing of streams * called from P4Base#execP4Command(String command, P4Handler handler) * @see P4Base#execP4Command(String, P4Handler) */	TokenNameCOMMENT_JAVADOC	 stops the processing of streams called from P4Base#execP4Command(String command, P4Handler handler) @see P4Base#execP4Command(String, P4Handler) 
public	TokenNamepublic	
void	TokenNamevoid	
stop	TokenNameIdentifier	 stop
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
myHandler	TokenNameIdentifier	 my Handler
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// might never have been started, forfor example ifif p4 	TokenNameCOMMENT_LINE	might never have been started, forfor example ifif p4 
// is not on the PATH 	TokenNameCOMMENT_LINE	is not on the PATH 
myHandler	TokenNameIdentifier	 my Handler
.	TokenNameDOT	
stop	TokenNameIdentifier	 stop
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// CheckStyle:VisibilityModifier OFF - bc 	TokenNameCOMMENT_LINE	CheckStyle:VisibilityModifier OFF - bc 
OutputStream	TokenNameIdentifier	 Output Stream
os	TokenNameIdentifier	 os
;	TokenNameSEMICOLON	
//Input 	TokenNameCOMMENT_LINE	Input 
InputStream	TokenNameIdentifier	 Input Stream
is	TokenNameIdentifier	 is
;	TokenNameSEMICOLON	
//Output 	TokenNameCOMMENT_LINE	Output 
InputStream	TokenNameIdentifier	 Input Stream
es	TokenNameIdentifier	 es
;	TokenNameSEMICOLON	
//Error 	TokenNameCOMMENT_LINE	Error 
// CheckStyle:VisibilityModifier ON 	TokenNameCOMMENT_LINE	CheckStyle:VisibilityModifier ON 
/** * connects the handler to the input stream into Perforce * used indirectly by tasks requiring to send specific standard input * such as p4label, p4change * @param os the stream bringing input to the p4 executable * @throws IOException under unknown circumstances */	TokenNameCOMMENT_JAVADOC	 connects the handler to the input stream into Perforce used indirectly by tasks requiring to send specific standard input such as p4label, p4change @param os the stream bringing input to the p4 executable @throws IOException under unknown circumstances 
public	TokenNamepublic	
void	TokenNamevoid	
setProcessInputStream	TokenNameIdentifier	 set Process Input Stream
(	TokenNameLPAREN	
OutputStream	TokenNameIdentifier	 Output Stream
os	TokenNameIdentifier	 os
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
os	TokenNameIdentifier	 os
=	TokenNameEQUAL	
os	TokenNameIdentifier	 os
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * connects the handler to the stderr of the Perforce process * @param is stderr coming from Perforce * @throws IOException under unknown circumstances */	TokenNameCOMMENT_JAVADOC	 connects the handler to the stderr of the Perforce process @param is stderr coming from Perforce @throws IOException under unknown circumstances 
public	TokenNamepublic	
void	TokenNamevoid	
setProcessErrorStream	TokenNameIdentifier	 set Process Error Stream
(	TokenNameLPAREN	
InputStream	TokenNameIdentifier	 Input Stream
is	TokenNameIdentifier	 is
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
es	TokenNameIdentifier	 es
=	TokenNameEQUAL	
is	TokenNameIdentifier	 is
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * connects the handler to the stdout of the Perforce process * @param is stdout coming from Perforce * @throws IOException under unknown circumstances */	TokenNameCOMMENT_JAVADOC	 connects the handler to the stdout of the Perforce process @param is stdout coming from Perforce @throws IOException under unknown circumstances 
public	TokenNamepublic	
void	TokenNamevoid	
setProcessOutputStream	TokenNameIdentifier	 set Process Output Stream
(	TokenNameLPAREN	
InputStream	TokenNameIdentifier	 Input Stream
is	TokenNameIdentifier	 is
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
is	TokenNameIdentifier	 is
=	TokenNameEQUAL	
is	TokenNameIdentifier	 is
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
