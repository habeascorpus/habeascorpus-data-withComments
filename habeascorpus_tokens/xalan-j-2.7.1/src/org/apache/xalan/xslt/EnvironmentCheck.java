/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the "License"); * you may not use this file except in compliance with the License. * You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/* * $Id: EnvironmentCheck.java 468646 2006-10-28 06:57:58Z minchau $ */	TokenNameCOMMENT_BLOCK	 $Id: EnvironmentCheck.java 468646 2006-10-28 06:57:58Z minchau $ 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xalan	TokenNameIdentifier	 xalan
.	TokenNameDOT	
xslt	TokenNameIdentifier	 xslt
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
File	TokenNameIdentifier	 File
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
FileWriter	TokenNameIdentifier	 File Writer
;	TokenNameSEMICOLON	
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
lang	TokenNameIdentifier	 lang
.	TokenNameDOT	
reflect	TokenNameIdentifier	 reflect
.	TokenNameDOT	
Field	TokenNameIdentifier	 Field
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
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Enumeration	TokenNameIdentifier	 Enumeration
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Hashtable	TokenNameIdentifier	 Hashtable
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
StringTokenizer	TokenNameIdentifier	 String Tokenizer
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Vector	TokenNameIdentifier	 Vector
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
w3c	TokenNameIdentifier	 w3c
.	TokenNameDOT	
dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
Document	TokenNameIdentifier	 Document
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
w3c	TokenNameIdentifier	 w3c
.	TokenNameDOT	
dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
Element	TokenNameIdentifier	 Element
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
/** * Utility class to report simple information about the environment. * Simplistic reporting about certain classes found in your JVM may * help answer some FAQs for simple problems. * * <p>Usage-command line: * <code> * java org.apache.xalan.xslt.EnvironmentCheck [-out outFile] * </code></p> * * <p>Usage-from program: * <code> * boolean environmentOK = * (new EnvironmentCheck()).checkEnvironment(yourPrintWriter); * </code></p> * * <p>Usage-from stylesheet: * <code><pre> * &lt;?xml version="1.0"?&gt; * &lt;xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0" * xmlns:xalan="http://xml.apache.org/xalan" * exclude-result-prefixes="xalan"&gt; * &lt;xsl:output indent="yes"/&gt; * &lt;xsl:template match="/"&gt; * &lt;xsl:copy-of select="xalan:checkEnvironment()"/&gt; * &lt;/xsl:template&gt; * &lt;/xsl:stylesheet&gt; * </pre></code></p> * * <p>Xalan users reporting problems are encouraged to use this class * to see if there are potential problems with their actual * Java environment <b>before</b> reporting a bug. Note that you * should both check from the JVM/JRE's command line as well as * temporarily calling checkEnvironment() directly from your code, * since the classpath may differ (especially for servlets, etc).</p> * * <p>Also see http://xml.apache.org/xalan-j/faq.html</p> * * <p>Note: This class is pretty simplistic: * results are not necessarily definitive nor will it find all * problems related to environment setup. Also, you should avoid * calling this in deployed production code, both because it is * quite slow and because it forces classes to get loaded.</p> * * <p>Note: This class explicitly has very limited compile-time * dependencies to enable easy compilation and usage even when * Xalan, DOM/SAX/JAXP, etc. are not present.</p> * * <p>Note: for an improved version of this utility, please see * the xml-commons' project Which utility which does the same kind * of thing but in a much simpler manner.</p> * * @author Shane_Curcuru@us.ibm.com * @version $Id: EnvironmentCheck.java 468646 2006-10-28 06:57:58Z minchau $ */	TokenNameCOMMENT_JAVADOC	 Utility class to report simple information about the environment. Simplistic reporting about certain classes found in your JVM may help answer some FAQs for simple problems. * <p>Usage-command line: <code> java org.apache.xalan.xslt.EnvironmentCheck [-out outFile] </code></p> * <p>Usage-from program: <code> boolean environmentOK = (new EnvironmentCheck()).checkEnvironment(yourPrintWriter); </code></p> * <p>Usage-from stylesheet: <code><pre> &lt;?xml version="1.0"?&gt; &lt;xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0" xmlns:xalan="http://xml.apache.org/xalan" exclude-result-prefixes="xalan"&gt; &lt;xsl:output indent="yes"/&gt; &lt;xsl:template match="/"&gt; &lt;xsl:copy-of select="xalan:checkEnvironment()"/&gt; &lt;/xsl:template&gt; &lt;/xsl:stylesheet&gt; </pre></code></p> * <p>Xalan users reporting problems are encouraged to use this class to see if there are potential problems with their actual Java environment <b>before</b> reporting a bug. Note that you should both check from the JVM/JRE's command line as well as temporarily calling checkEnvironment() directly from your code, since the classpath may differ (especially for servlets, etc).</p> * <p>Also see http://xml.apache.org/xalan-j/faq.html</p> * <p>Note: This class is pretty simplistic: results are not necessarily definitive nor will it find all problems related to environment setup. Also, you should avoid calling this in deployed production code, both because it is quite slow and because it forces classes to get loaded.</p> * <p>Note: This class explicitly has very limited compile-time dependencies to enable easy compilation and usage even when Xalan, DOM/SAX/JAXP, etc. are not present.</p> * <p>Note: for an improved version of this utility, please see the xml-commons' project Which utility which does the same kind of thing but in a much simpler manner.</p> * @author Shane_Curcuru@us.ibm.com @version $Id: EnvironmentCheck.java 468646 2006-10-28 06:57:58Z minchau $ 
public	TokenNamepublic	
class	TokenNameclass	
EnvironmentCheck	TokenNameIdentifier	 Environment Check
{	TokenNameLBRACE	
/** * Command line runnability: checks for [-out outFilename] arg. * <p>Command line entrypoint; Sets output and calls * {@link #checkEnvironment(PrintWriter)}.</p> * @param args command line args */	TokenNameCOMMENT_JAVADOC	 Command line runnability: checks for [-out outFilename] arg. <p>Command line entrypoint; Sets output and calls {@link #checkEnvironment(PrintWriter)}.</p> @param args command line args 
public	TokenNamepublic	
static	TokenNamestatic	
void	TokenNamevoid	
main	TokenNameIdentifier	 main
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
args	TokenNameIdentifier	 args
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Default to System.out, autoflushing 	TokenNameCOMMENT_LINE	Default to System.out, autoflushing 
PrintWriter	TokenNameIdentifier	 Print Writer
sendOutputTo	TokenNameIdentifier	 send Output To
=	TokenNameEQUAL	
new	TokenNamenew	
PrintWriter	TokenNameIdentifier	 Print Writer
(	TokenNameLPAREN	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Read our simplistic input args, if supplied 	TokenNameCOMMENT_LINE	Read our simplistic input args, if supplied 
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
args	TokenNameIdentifier	 args
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
"-out"	TokenNameStringLiteral	-out
.	TokenNameDOT	
equalsIgnoreCase	TokenNameIdentifier	 equals Ignore Case
(	TokenNameLPAREN	
args	TokenNameIdentifier	 args
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
args	TokenNameIdentifier	 args
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
sendOutputTo	TokenNameIdentifier	 send Output To
=	TokenNameEQUAL	
new	TokenNamenew	
PrintWriter	TokenNameIdentifier	 Print Writer
(	TokenNameLPAREN	
new	TokenNamenew	
FileWriter	TokenNameIdentifier	 File Writer
(	TokenNameLPAREN	
args	TokenNameIdentifier	 args
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
Exception	TokenNameIdentifier	 Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
err	TokenNameIdentifier	 err
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"# WARNING: -out "	TokenNameStringLiteral	# WARNING: -out 
+	TokenNamePLUS	
args	TokenNameIdentifier	 args
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
+	TokenNamePLUS	
" threw "	TokenNameStringLiteral	 threw 
+	TokenNamePLUS	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
err	TokenNameIdentifier	 err
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"# WARNING: -out argument should have a filename, output sent to console"	TokenNameStringLiteral	# WARNING: -out argument should have a filename, output sent to console
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
EnvironmentCheck	TokenNameIdentifier	 Environment Check
app	TokenNameIdentifier	 app
=	TokenNameEQUAL	
new	TokenNamenew	
EnvironmentCheck	TokenNameIdentifier	 Environment Check
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
app	TokenNameIdentifier	 app
.	TokenNameDOT	
checkEnvironment	TokenNameIdentifier	 check Environment
(	TokenNameLPAREN	
sendOutputTo	TokenNameIdentifier	 send Output To
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Programmatic entrypoint: Report on basic Java environment * and CLASSPATH settings that affect Xalan. * * <p>Note that this class is not advanced enough to tell you * everything about the environment that affects Xalan, and * sometimes reports errors that will not actually affect * Xalan's behavior. Currently, it very simplistically * checks the JVM's environment for some basic properties and * logs them out; it will report a problem if it finds a setting * or .jar file that is <i>likely</i> to cause problems.</p> * * <p>Advanced users can peruse the code herein to help them * investigate potential environment problems found; other users * may simply send the output from this tool along with any bugs * they submit to help us in the debugging process.</p> * * @param pw PrintWriter to send output to; can be sent to a * file that will look similar to a Properties file; defaults * to System.out if null * @return true if your environment appears to have no major * problems; false if potential environment problems found * @see #getEnvironmentHash() */	TokenNameCOMMENT_JAVADOC	 Programmatic entrypoint: Report on basic Java environment and CLASSPATH settings that affect Xalan. * <p>Note that this class is not advanced enough to tell you everything about the environment that affects Xalan, and sometimes reports errors that will not actually affect Xalan's behavior. Currently, it very simplistically checks the JVM's environment for some basic properties and logs them out; it will report a problem if it finds a setting or .jar file that is <i>likely</i> to cause problems.</p> * <p>Advanced users can peruse the code herein to help them investigate potential environment problems found; other users may simply send the output from this tool along with any bugs they submit to help us in the debugging process.</p> * @param pw PrintWriter to send output to; can be sent to a file that will look similar to a Properties file; defaults to System.out if null @return true if your environment appears to have no major problems; false if potential environment problems found @see #getEnvironmentHash() 
public	TokenNamepublic	
boolean	TokenNameboolean	
checkEnvironment	TokenNameIdentifier	 check Environment
(	TokenNameLPAREN	
PrintWriter	TokenNameIdentifier	 Print Writer
pw	TokenNameIdentifier	 pw
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Use user-specified output writer if non-null 	TokenNameCOMMENT_LINE	Use user-specified output writer if non-null 
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
pw	TokenNameIdentifier	 pw
)	TokenNameRPAREN	
outWriter	TokenNameIdentifier	 out Writer
=	TokenNameEQUAL	
pw	TokenNameIdentifier	 pw
;	TokenNameSEMICOLON	
// Setup a hash to store various environment information in 	TokenNameCOMMENT_LINE	Setup a hash to store various environment information in 
Hashtable	TokenNameIdentifier	 Hashtable
hash	TokenNameIdentifier	 hash
=	TokenNameEQUAL	
getEnvironmentHash	TokenNameIdentifier	 get Environment Hash
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Check for ERROR keys in the hashtable, and print report 	TokenNameCOMMENT_LINE	Check for ERROR keys in the hashtable, and print report 
boolean	TokenNameboolean	
environmentHasErrors	TokenNameIdentifier	 environment Has Errors
=	TokenNameEQUAL	
writeEnvironmentReport	TokenNameIdentifier	 write Environment Report
(	TokenNameLPAREN	
hash	TokenNameIdentifier	 hash
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
environmentHasErrors	TokenNameIdentifier	 environment Has Errors
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Note: many logMsg calls have # at the start to 	TokenNameCOMMENT_LINE	Note: many logMsg calls have # at the start to 
// fake a property-file like output 	TokenNameCOMMENT_LINE	fake a property-file like output 
logMsg	TokenNameIdentifier	 log Msg
(	TokenNameLPAREN	
"# WARNING: Potential problems found in your environment!"	TokenNameStringLiteral	# WARNING: Potential problems found in your environment!
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
logMsg	TokenNameIdentifier	 log Msg
(	TokenNameLPAREN	
"# Check any 'ERROR' items above against the Xalan FAQs"	TokenNameStringLiteral	# Check any 'ERROR' items above against the Xalan FAQs
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
logMsg	TokenNameIdentifier	 log Msg
(	TokenNameLPAREN	
"# to correct potential problems with your classes/jars"	TokenNameStringLiteral	# to correct potential problems with your classes/jars
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
logMsg	TokenNameIdentifier	 log Msg
(	TokenNameLPAREN	
"# http://xml.apache.org/xalan-j/faq.html"	TokenNameStringLiteral	# http://xml.apache.org/xalan-j/faq.html
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
outWriter	TokenNameIdentifier	 out Writer
)	TokenNameRPAREN	
outWriter	TokenNameIdentifier	 out Writer
.	TokenNameDOT	
flush	TokenNameIdentifier	 flush
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
logMsg	TokenNameIdentifier	 log Msg
(	TokenNameLPAREN	
"# YAHOO! Your environment seems to be OK."	TokenNameStringLiteral	# YAHOO! Your environment seems to be OK.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
outWriter	TokenNameIdentifier	 out Writer
)	TokenNameRPAREN	
outWriter	TokenNameIdentifier	 out Writer
.	TokenNameDOT	
flush	TokenNameIdentifier	 flush
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Fill a hash with basic environment settings that affect Xalan. * * <p>Worker method called from various places.</p> * <p>Various system and CLASSPATH, etc. properties are put into * the hash as keys with a brief description of the current state * of that item as the value. Any serious problems will be put in * with a key that is prefixed with {@link #ERROR 'ERROR.'} so it * stands out in any resulting report; also a key with just that * constant will be set as well for any error.</p> * <p>Note that some legitimate cases are flaged as potential * errors - namely when a developer recompiles xalan.jar on their * own - and even a non-error state doesn't guaruntee that * everything in the environment is correct. But this will help * point out the most common classpath and system property * problems that we've seen.</p> * * @return Hashtable full of useful environment info about Xalan * and related system properties, etc. */	TokenNameCOMMENT_JAVADOC	 Fill a hash with basic environment settings that affect Xalan. * <p>Worker method called from various places.</p> <p>Various system and CLASSPATH, etc. properties are put into the hash as keys with a brief description of the current state of that item as the value. Any serious problems will be put in with a key that is prefixed with {@link #ERROR 'ERROR.'} so it stands out in any resulting report; also a key with just that constant will be set as well for any error.</p> <p>Note that some legitimate cases are flaged as potential errors - namely when a developer recompiles xalan.jar on their own - and even a non-error state doesn't guaruntee that everything in the environment is correct. But this will help point out the most common classpath and system property problems that we've seen.</p> * @return Hashtable full of useful environment info about Xalan and related system properties, etc. 
public	TokenNamepublic	
Hashtable	TokenNameIdentifier	 Hashtable
getEnvironmentHash	TokenNameIdentifier	 get Environment Hash
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Setup a hash to store various environment information in 	TokenNameCOMMENT_LINE	Setup a hash to store various environment information in 
Hashtable	TokenNameIdentifier	 Hashtable
hash	TokenNameIdentifier	 hash
=	TokenNameEQUAL	
new	TokenNamenew	
Hashtable	TokenNameIdentifier	 Hashtable
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Call various worker methods to fill in the hash 	TokenNameCOMMENT_LINE	Call various worker methods to fill in the hash 
// These are explicitly separate for maintenance and so 	TokenNameCOMMENT_LINE	These are explicitly separate for maintenance and so 
// advanced users could call them standalone 	TokenNameCOMMENT_LINE	advanced users could call them standalone 
checkJAXPVersion	TokenNameIdentifier	 check JAXP Version
(	TokenNameLPAREN	
hash	TokenNameIdentifier	 hash
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkProcessorVersion	TokenNameIdentifier	 check Processor Version
(	TokenNameLPAREN	
hash	TokenNameIdentifier	 hash
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkParserVersion	TokenNameIdentifier	 check Parser Version
(	TokenNameLPAREN	
hash	TokenNameIdentifier	 hash
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkAntVersion	TokenNameIdentifier	 check Ant Version
(	TokenNameLPAREN	
hash	TokenNameIdentifier	 hash
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkDOMVersion	TokenNameIdentifier	 check DOM Version
(	TokenNameLPAREN	
hash	TokenNameIdentifier	 hash
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkSAXVersion	TokenNameIdentifier	 check SAX Version
(	TokenNameLPAREN	
hash	TokenNameIdentifier	 hash
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkSystemProperties	TokenNameIdentifier	 check System Properties
(	TokenNameLPAREN	
hash	TokenNameIdentifier	 hash
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
hash	TokenNameIdentifier	 hash
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Dump a basic Xalan environment report to outWriter. * * <p>This dumps a simple header and then each of the entries in * the Hashtable to our PrintWriter; it does special processing * for entries that are .jars found in the classpath.</p> * * @param h Hashtable of items to report on; presumably * filled in by our various check*() methods * @return true if your environment appears to have no major * problems; false if potential environment problems found * @see #appendEnvironmentReport(Node, Document, Hashtable) * for an equivalent that appends to a Node instead */	TokenNameCOMMENT_JAVADOC	 Dump a basic Xalan environment report to outWriter. * <p>This dumps a simple header and then each of the entries in the Hashtable to our PrintWriter; it does special processing for entries that are .jars found in the classpath.</p> * @param h Hashtable of items to report on; presumably filled in by our various check*() methods @return true if your environment appears to have no major problems; false if potential environment problems found @see #appendEnvironmentReport(Node, Document, Hashtable) for an equivalent that appends to a Node instead 
protected	TokenNameprotected	
boolean	TokenNameboolean	
writeEnvironmentReport	TokenNameIdentifier	 write Environment Report
(	TokenNameLPAREN	
Hashtable	TokenNameIdentifier	 Hashtable
h	TokenNameIdentifier	 h
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
==	TokenNameEQUAL_EQUAL	
h	TokenNameIdentifier	 h
)	TokenNameRPAREN	
{	TokenNameLBRACE	
logMsg	TokenNameIdentifier	 log Msg
(	TokenNameLPAREN	
"# ERROR: writeEnvironmentReport called with null Hashtable"	TokenNameStringLiteral	# ERROR: writeEnvironmentReport called with null Hashtable
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
boolean	TokenNameboolean	
errors	TokenNameIdentifier	 errors
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
logMsg	TokenNameIdentifier	 log Msg
(	TokenNameLPAREN	
"#---- BEGIN writeEnvironmentReport($Revision$): Useful stuff found: ----"	TokenNameStringLiteral	#---- BEGIN writeEnvironmentReport($Revision$): Useful stuff found: ----
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Fake the Properties-like output 	TokenNameCOMMENT_LINE	Fake the Properties-like output 
for	TokenNamefor	
(	TokenNameLPAREN	
Enumeration	TokenNameIdentifier	 Enumeration
keys	TokenNameIdentifier	 keys
=	TokenNameEQUAL	
h	TokenNameIdentifier	 h
.	TokenNameDOT	
keys	TokenNameIdentifier	 keys
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
keys	TokenNameIdentifier	 keys
.	TokenNameDOT	
hasMoreElements	TokenNameIdentifier	 has More Elements
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/* no increment portion */	TokenNameCOMMENT_BLOCK	 no increment portion 
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Object	TokenNameIdentifier	 Object
key	TokenNameIdentifier	 key
=	TokenNameEQUAL	
keys	TokenNameIdentifier	 keys
.	TokenNameDOT	
nextElement	TokenNameIdentifier	 next Element
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
keyStr	TokenNameIdentifier	 key Str
=	TokenNameEQUAL	
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
)	TokenNameRPAREN	
key	TokenNameIdentifier	 key
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
// Special processing for classes found.. 	TokenNameCOMMENT_LINE	Special processing for classes found.. 
if	TokenNameif	
(	TokenNameLPAREN	
keyStr	TokenNameIdentifier	 key Str
.	TokenNameDOT	
startsWith	TokenNameIdentifier	 starts With
(	TokenNameLPAREN	
FOUNDCLASSES	TokenNameIdentifier	 FOUNDCLASSES
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Vector	TokenNameIdentifier	 Vector
v	TokenNameIdentifier	 v
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Vector	TokenNameIdentifier	 Vector
)	TokenNameRPAREN	
h	TokenNameIdentifier	 h
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
keyStr	TokenNameIdentifier	 key Str
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
errors	TokenNameIdentifier	 errors
|=	TokenNameOR_EQUAL	
logFoundJars	TokenNameIdentifier	 log Found Jars
(	TokenNameLPAREN	
v	TokenNameIdentifier	 v
,	TokenNameCOMMA	
keyStr	TokenNameIdentifier	 key Str
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// ..normal processing for all other entries 	TokenNameCOMMENT_LINE	..normal processing for all other entries 
else	TokenNameelse	
{	TokenNameLBRACE	
// Note: we could just check for the ERROR key by itself, 	TokenNameCOMMENT_LINE	Note: we could just check for the ERROR key by itself, 
// since we now set that, but since we have to go 	TokenNameCOMMENT_LINE	since we now set that, but since we have to go 
// through the whole hash anyway, do it this way, 	TokenNameCOMMENT_LINE	through the whole hash anyway, do it this way, 
// which is safer for maintenance 	TokenNameCOMMENT_LINE	which is safer for maintenance 
if	TokenNameif	
(	TokenNameLPAREN	
keyStr	TokenNameIdentifier	 key Str
.	TokenNameDOT	
startsWith	TokenNameIdentifier	 starts With
(	TokenNameLPAREN	
ERROR	TokenNameIdentifier	 ERROR
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
errors	TokenNameIdentifier	 errors
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
logMsg	TokenNameIdentifier	 log Msg
(	TokenNameLPAREN	
keyStr	TokenNameIdentifier	 key Str
+	TokenNamePLUS	
"="	TokenNameStringLiteral	=
+	TokenNamePLUS	
h	TokenNameIdentifier	 h
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
keyStr	TokenNameIdentifier	 key Str
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
Exception	TokenNameIdentifier	 Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
logMsg	TokenNameIdentifier	 log Msg
(	TokenNameLPAREN	
"Reading-"	TokenNameStringLiteral	Reading-
+	TokenNamePLUS	
key	TokenNameIdentifier	 key
+	TokenNamePLUS	
"= threw: "	TokenNameStringLiteral	= threw: 
+	TokenNamePLUS	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
logMsg	TokenNameIdentifier	 log Msg
(	TokenNameLPAREN	
"#----- END writeEnvironmentReport: Useful properties found: -----"	TokenNameStringLiteral	#----- END writeEnvironmentReport: Useful properties found: -----
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
errors	TokenNameIdentifier	 errors
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Prefixed to hash keys that signify serious problems. */	TokenNameCOMMENT_JAVADOC	 Prefixed to hash keys that signify serious problems. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ERROR	TokenNameIdentifier	 ERROR
=	TokenNameEQUAL	
"ERROR."	TokenNameStringLiteral	ERROR.
;	TokenNameSEMICOLON	
/** Added to descriptions that signify potential problems. */	TokenNameCOMMENT_JAVADOC	 Added to descriptions that signify potential problems. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
WARNING	TokenNameIdentifier	 WARNING
=	TokenNameEQUAL	
"WARNING."	TokenNameStringLiteral	WARNING.
;	TokenNameSEMICOLON	
/** Value for any error found. */	TokenNameCOMMENT_JAVADOC	 Value for any error found. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ERROR_FOUND	TokenNameIdentifier	 ERROR  FOUND
=	TokenNameEQUAL	
"At least one error was found!"	TokenNameStringLiteral	At least one error was found!
;	TokenNameSEMICOLON	
/** Prefixed to hash keys that signify version numbers. */	TokenNameCOMMENT_JAVADOC	 Prefixed to hash keys that signify version numbers. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
VERSION	TokenNameIdentifier	 VERSION
=	TokenNameEQUAL	
"version."	TokenNameStringLiteral	version.
;	TokenNameSEMICOLON	
/** Prefixed to hash keys that signify .jars found in classpath. */	TokenNameCOMMENT_JAVADOC	 Prefixed to hash keys that signify .jars found in classpath. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
FOUNDCLASSES	TokenNameIdentifier	 FOUNDCLASSES
=	TokenNameEQUAL	
"foundclasses."	TokenNameStringLiteral	foundclasses.
;	TokenNameSEMICOLON	
/** Marker that a class or .jar was found. */	TokenNameCOMMENT_JAVADOC	 Marker that a class or .jar was found. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
CLASS_PRESENT	TokenNameIdentifier	 CLASS  PRESENT
=	TokenNameEQUAL	
"present-unknown-version"	TokenNameStringLiteral	present-unknown-version
;	TokenNameSEMICOLON	
/** Marker that a class or .jar was not found. */	TokenNameCOMMENT_JAVADOC	 Marker that a class or .jar was not found. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
CLASS_NOTPRESENT	TokenNameIdentifier	 CLASS  NOTPRESENT
=	TokenNameEQUAL	
"not-present"	TokenNameStringLiteral	not-present
;	TokenNameSEMICOLON	
/** Listing of common .jar files that include Xalan-related classes. */	TokenNameCOMMENT_JAVADOC	 Listing of common .jar files that include Xalan-related classes. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
jarNames	TokenNameIdentifier	 jar Names
=	TokenNameEQUAL	
{	TokenNameLBRACE	
"xalan.jar"	TokenNameStringLiteral	xalan.jar
,	TokenNameCOMMA	
"xalansamples.jar"	TokenNameStringLiteral	xalansamples.jar
,	TokenNameCOMMA	
"xalanj1compat.jar"	TokenNameStringLiteral	xalanj1compat.jar
,	TokenNameCOMMA	
"xalanservlet.jar"	TokenNameStringLiteral	xalanservlet.jar
,	TokenNameCOMMA	
"serializer.jar"	TokenNameStringLiteral	serializer.jar
,	TokenNameCOMMA	
// Serializer (shared between Xalan & Xerces) 	TokenNameCOMMENT_LINE	Serializer (shared between Xalan & Xerces) 
"xerces.jar"	TokenNameStringLiteral	xerces.jar
,	TokenNameCOMMA	
// Xerces-J 1.x 	TokenNameCOMMENT_LINE	Xerces-J 1.x 
"xercesImpl.jar"	TokenNameStringLiteral	xercesImpl.jar
,	TokenNameCOMMA	
// Xerces-J 2.x 	TokenNameCOMMENT_LINE	Xerces-J 2.x 
"testxsl.jar"	TokenNameStringLiteral	testxsl.jar
,	TokenNameCOMMA	
"crimson.jar"	TokenNameStringLiteral	crimson.jar
,	TokenNameCOMMA	
"lotusxsl.jar"	TokenNameStringLiteral	lotusxsl.jar
,	TokenNameCOMMA	
"jaxp.jar"	TokenNameStringLiteral	jaxp.jar
,	TokenNameCOMMA	
"parser.jar"	TokenNameStringLiteral	parser.jar
,	TokenNameCOMMA	
"dom.jar"	TokenNameStringLiteral	dom.jar
,	TokenNameCOMMA	
"sax.jar"	TokenNameStringLiteral	sax.jar
,	TokenNameCOMMA	
"xml.jar"	TokenNameStringLiteral	xml.jar
,	TokenNameCOMMA	
"xml-apis.jar"	TokenNameStringLiteral	xml-apis.jar
,	TokenNameCOMMA	
"xsltc.jar"	TokenNameStringLiteral	xsltc.jar
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
/** * Print out report of .jars found in a classpath. * * Takes the information encoded from a checkPathForJars() * call and dumps it out to our PrintWriter. * * @param v Vector of Hashtables of .jar file info * @param desc description to print out in header * * @return false if OK, true if any .jars were reported * as having errors * @see #checkPathForJars(String, String[]) */	TokenNameCOMMENT_JAVADOC	 Print out report of .jars found in a classpath. * Takes the information encoded from a checkPathForJars() call and dumps it out to our PrintWriter. * @param v Vector of Hashtables of .jar file info @param desc description to print out in header * @return false if OK, true if any .jars were reported as having errors @see #checkPathForJars(String, String[]) 
protected	TokenNameprotected	
boolean	TokenNameboolean	
logFoundJars	TokenNameIdentifier	 log Found Jars
(	TokenNameLPAREN	
Vector	TokenNameIdentifier	 Vector
v	TokenNameIdentifier	 v
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
desc	TokenNameIdentifier	 desc
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
null	TokenNamenull	
==	TokenNameEQUAL_EQUAL	
v	TokenNameIdentifier	 v
)	TokenNameRPAREN	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
v	TokenNameIdentifier	 v
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
<	TokenNameLESS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
errors	TokenNameIdentifier	 errors
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
logMsg	TokenNameIdentifier	 log Msg
(	TokenNameLPAREN	
"#---- BEGIN Listing XML-related jars in: "	TokenNameStringLiteral	#---- BEGIN Listing XML-related jars in: 
+	TokenNamePLUS	
desc	TokenNameIdentifier	 desc
+	TokenNamePLUS	
" ----"	TokenNameStringLiteral	 ----
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
v	TokenNameIdentifier	 v
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Hashtable	TokenNameIdentifier	 Hashtable
subhash	TokenNameIdentifier	 subhash
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Hashtable	TokenNameIdentifier	 Hashtable
)	TokenNameRPAREN	
v	TokenNameIdentifier	 v
.	TokenNameDOT	
elementAt	TokenNameIdentifier	 element At
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
Enumeration	TokenNameIdentifier	 Enumeration
keys	TokenNameIdentifier	 keys
=	TokenNameEQUAL	
subhash	TokenNameIdentifier	 subhash
.	TokenNameDOT	
keys	TokenNameIdentifier	 keys
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
keys	TokenNameIdentifier	 keys
.	TokenNameDOT	
hasMoreElements	TokenNameIdentifier	 has More Elements
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/* no increment portion */	TokenNameCOMMENT_BLOCK	 no increment portion 
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Object	TokenNameIdentifier	 Object
key	TokenNameIdentifier	 key
=	TokenNameEQUAL	
keys	TokenNameIdentifier	 keys
.	TokenNameDOT	
nextElement	TokenNameIdentifier	 next Element
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
keyStr	TokenNameIdentifier	 key Str
=	TokenNameEQUAL	
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
)	TokenNameRPAREN	
key	TokenNameIdentifier	 key
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
keyStr	TokenNameIdentifier	 key Str
.	TokenNameDOT	
startsWith	TokenNameIdentifier	 starts With
(	TokenNameLPAREN	
ERROR	TokenNameIdentifier	 ERROR
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
errors	TokenNameIdentifier	 errors
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
logMsg	TokenNameIdentifier	 log Msg
(	TokenNameLPAREN	
keyStr	TokenNameIdentifier	 key Str
+	TokenNamePLUS	
"="	TokenNameStringLiteral	=
+	TokenNamePLUS	
subhash	TokenNameIdentifier	 subhash
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
keyStr	TokenNameIdentifier	 key Str
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
Exception	TokenNameIdentifier	 Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
errors	TokenNameIdentifier	 errors
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
logMsg	TokenNameIdentifier	 log Msg
(	TokenNameLPAREN	
"Reading-"	TokenNameStringLiteral	Reading-
+	TokenNamePLUS	
key	TokenNameIdentifier	 key
+	TokenNamePLUS	
"= threw: "	TokenNameStringLiteral	= threw: 
+	TokenNamePLUS	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
logMsg	TokenNameIdentifier	 log Msg
(	TokenNameLPAREN	
"#----- END Listing XML-related jars in: "	TokenNameStringLiteral	#----- END Listing XML-related jars in: 
+	TokenNamePLUS	
desc	TokenNameIdentifier	 desc
+	TokenNamePLUS	
" -----"	TokenNameStringLiteral	 -----
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
errors	TokenNameIdentifier	 errors
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Stylesheet extension entrypoint: Dump a basic Xalan * environment report from getEnvironmentHash() to a Node. * * <p>Copy of writeEnvironmentReport that creates a Node suitable * for other processing instead of a properties-like text output. * </p> * @param container Node to append our report to * @param factory Document providing createElement, etc. services * @param h Hash presumably from {@link #getEnvironmentHash()} * @see #writeEnvironmentReport(Hashtable) * for an equivalent that writes to a PrintWriter instead */	TokenNameCOMMENT_JAVADOC	 Stylesheet extension entrypoint: Dump a basic Xalan environment report from getEnvironmentHash() to a Node. * <p>Copy of writeEnvironmentReport that creates a Node suitable for other processing instead of a properties-like text output. </p> @param container Node to append our report to @param factory Document providing createElement, etc. services @param h Hash presumably from {@link #getEnvironmentHash()} @see #writeEnvironmentReport(Hashtable) for an equivalent that writes to a PrintWriter instead 
public	TokenNamepublic	
void	TokenNamevoid	
appendEnvironmentReport	TokenNameIdentifier	 append Environment Report
(	TokenNameLPAREN	
Node	TokenNameIdentifier	 Node
container	TokenNameIdentifier	 container
,	TokenNameCOMMA	
Document	TokenNameIdentifier	 Document
factory	TokenNameIdentifier	 factory
,	TokenNameCOMMA	
Hashtable	TokenNameIdentifier	 Hashtable
h	TokenNameIdentifier	 h
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
null	TokenNamenull	
==	TokenNameEQUAL_EQUAL	
container	TokenNameIdentifier	 container
)	TokenNameRPAREN	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
null	TokenNamenull	
==	TokenNameEQUAL_EQUAL	
factory	TokenNameIdentifier	 factory
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
Element	TokenNameIdentifier	 Element
envCheckNode	TokenNameIdentifier	 env Check Node
=	TokenNameEQUAL	
factory	TokenNameIdentifier	 factory
.	TokenNameDOT	
createElement	TokenNameIdentifier	 create Element
(	TokenNameLPAREN	
"EnvironmentCheck"	TokenNameStringLiteral	EnvironmentCheck
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
envCheckNode	TokenNameIdentifier	 env Check Node
.	TokenNameDOT	
setAttribute	TokenNameIdentifier	 set Attribute
(	TokenNameLPAREN	
"version"	TokenNameStringLiteral	version
,	TokenNameCOMMA	
"$Revision$"	TokenNameStringLiteral	$Revision$
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
container	TokenNameIdentifier	 container
.	TokenNameDOT	
appendChild	TokenNameIdentifier	 append Child
(	TokenNameLPAREN	
envCheckNode	TokenNameIdentifier	 env Check Node
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
==	TokenNameEQUAL_EQUAL	
h	TokenNameIdentifier	 h
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Element	TokenNameIdentifier	 Element
statusNode	TokenNameIdentifier	 status Node
=	TokenNameEQUAL	
factory	TokenNameIdentifier	 factory
.	TokenNameDOT	
createElement	TokenNameIdentifier	 create Element
(	TokenNameLPAREN	
"status"	TokenNameStringLiteral	status
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
statusNode	TokenNameIdentifier	 status Node
.	TokenNameDOT	
setAttribute	TokenNameIdentifier	 set Attribute
(	TokenNameLPAREN	
"result"	TokenNameStringLiteral	result
,	TokenNameCOMMA	
"ERROR"	TokenNameStringLiteral	ERROR
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
statusNode	TokenNameIdentifier	 status Node
.	TokenNameDOT	
appendChild	TokenNameIdentifier	 append Child
(	TokenNameLPAREN	
factory	TokenNameIdentifier	 factory
.	TokenNameDOT	
createTextNode	TokenNameIdentifier	 create Text Node
(	TokenNameLPAREN	
"appendEnvironmentReport called with null Hashtable!"	TokenNameStringLiteral	appendEnvironmentReport called with null Hashtable!
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
envCheckNode	TokenNameIdentifier	 env Check Node
.	TokenNameDOT	
appendChild	TokenNameIdentifier	 append Child
(	TokenNameLPAREN	
statusNode	TokenNameIdentifier	 status Node
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
boolean	TokenNameboolean	
errors	TokenNameIdentifier	 errors
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
Element	TokenNameIdentifier	 Element
hashNode	TokenNameIdentifier	 hash Node
=	TokenNameEQUAL	
factory	TokenNameIdentifier	 factory
.	TokenNameDOT	
createElement	TokenNameIdentifier	 create Element
(	TokenNameLPAREN	
"environment"	TokenNameStringLiteral	environment
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
envCheckNode	TokenNameIdentifier	 env Check Node
.	TokenNameDOT	
appendChild	TokenNameIdentifier	 append Child
(	TokenNameLPAREN	
hashNode	TokenNameIdentifier	 hash Node
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
Enumeration	TokenNameIdentifier	 Enumeration
keys	TokenNameIdentifier	 keys
=	TokenNameEQUAL	
h	TokenNameIdentifier	 h
.	TokenNameDOT	
keys	TokenNameIdentifier	 keys
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
keys	TokenNameIdentifier	 keys
.	TokenNameDOT	
hasMoreElements	TokenNameIdentifier	 has More Elements
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/* no increment portion */	TokenNameCOMMENT_BLOCK	 no increment portion 
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Object	TokenNameIdentifier	 Object
key	TokenNameIdentifier	 key
=	TokenNameEQUAL	
keys	TokenNameIdentifier	 keys
.	TokenNameDOT	
nextElement	TokenNameIdentifier	 next Element
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
keyStr	TokenNameIdentifier	 key Str
=	TokenNameEQUAL	
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
)	TokenNameRPAREN	
key	TokenNameIdentifier	 key
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
// Special processing for classes found.. 	TokenNameCOMMENT_LINE	Special processing for classes found.. 
if	TokenNameif	
(	TokenNameLPAREN	
keyStr	TokenNameIdentifier	 key Str
.	TokenNameDOT	
startsWith	TokenNameIdentifier	 starts With
(	TokenNameLPAREN	
FOUNDCLASSES	TokenNameIdentifier	 FOUNDCLASSES
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Vector	TokenNameIdentifier	 Vector
v	TokenNameIdentifier	 v
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Vector	TokenNameIdentifier	 Vector
)	TokenNameRPAREN	
h	TokenNameIdentifier	 h
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
keyStr	TokenNameIdentifier	 key Str
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// errors |= logFoundJars(v, keyStr); 	TokenNameCOMMENT_LINE	errors |= logFoundJars(v, keyStr); 
errors	TokenNameIdentifier	 errors
|=	TokenNameOR_EQUAL	
appendFoundJars	TokenNameIdentifier	 append Found Jars
(	TokenNameLPAREN	
hashNode	TokenNameIdentifier	 hash Node
,	TokenNameCOMMA	
factory	TokenNameIdentifier	 factory
,	TokenNameCOMMA	
v	TokenNameIdentifier	 v
,	TokenNameCOMMA	
keyStr	TokenNameIdentifier	 key Str
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// ..normal processing for all other entries 	TokenNameCOMMENT_LINE	..normal processing for all other entries 
else	TokenNameelse	
{	TokenNameLBRACE	
// Note: we could just check for the ERROR key by itself, 	TokenNameCOMMENT_LINE	Note: we could just check for the ERROR key by itself, 
// since we now set that, but since we have to go 	TokenNameCOMMENT_LINE	since we now set that, but since we have to go 
// through the whole hash anyway, do it this way, 	TokenNameCOMMENT_LINE	through the whole hash anyway, do it this way, 
// which is safer for maintenance 	TokenNameCOMMENT_LINE	which is safer for maintenance 
if	TokenNameif	
(	TokenNameLPAREN	
keyStr	TokenNameIdentifier	 key Str
.	TokenNameDOT	
startsWith	TokenNameIdentifier	 starts With
(	TokenNameLPAREN	
ERROR	TokenNameIdentifier	 ERROR
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
errors	TokenNameIdentifier	 errors
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
Element	TokenNameIdentifier	 Element
node	TokenNameIdentifier	 node
=	TokenNameEQUAL	
factory	TokenNameIdentifier	 factory
.	TokenNameDOT	
createElement	TokenNameIdentifier	 create Element
(	TokenNameLPAREN	
"item"	TokenNameStringLiteral	item
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
node	TokenNameIdentifier	 node
.	TokenNameDOT	
setAttribute	TokenNameIdentifier	 set Attribute
(	TokenNameLPAREN	
"key"	TokenNameStringLiteral	key
,	TokenNameCOMMA	
keyStr	TokenNameIdentifier	 key Str
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
node	TokenNameIdentifier	 node
.	TokenNameDOT	
appendChild	TokenNameIdentifier	 append Child
(	TokenNameLPAREN	
factory	TokenNameIdentifier	 factory
.	TokenNameDOT	
createTextNode	TokenNameIdentifier	 create Text Node
(	TokenNameLPAREN	
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
)	TokenNameRPAREN	
h	TokenNameIdentifier	 h
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
keyStr	TokenNameIdentifier	 key Str
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
hashNode	TokenNameIdentifier	 hash Node
.	TokenNameDOT	
appendChild	TokenNameIdentifier	 append Child
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
Exception	TokenNameIdentifier	 Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
errors	TokenNameIdentifier	 errors
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
Element	TokenNameIdentifier	 Element
node	TokenNameIdentifier	 node
=	TokenNameEQUAL	
factory	TokenNameIdentifier	 factory
.	TokenNameDOT	
createElement	TokenNameIdentifier	 create Element
(	TokenNameLPAREN	
"item"	TokenNameStringLiteral	item
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
node	TokenNameIdentifier	 node
.	TokenNameDOT	
setAttribute	TokenNameIdentifier	 set Attribute
(	TokenNameLPAREN	
"key"	TokenNameStringLiteral	key
,	TokenNameCOMMA	
keyStr	TokenNameIdentifier	 key Str
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
node	TokenNameIdentifier	 node
.	TokenNameDOT	
appendChild	TokenNameIdentifier	 append Child
(	TokenNameLPAREN	
factory	TokenNameIdentifier	 factory
.	TokenNameDOT	
createTextNode	TokenNameIdentifier	 create Text Node
(	TokenNameLPAREN	
ERROR	TokenNameIdentifier	 ERROR
+	TokenNamePLUS	
" Reading "	TokenNameStringLiteral	 Reading 
+	TokenNamePLUS	
key	TokenNameIdentifier	 key
+	TokenNamePLUS	
" threw: "	TokenNameStringLiteral	 threw: 
+	TokenNamePLUS	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
hashNode	TokenNameIdentifier	 hash Node
.	TokenNameDOT	
appendChild	TokenNameIdentifier	 append Child
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// end of for... 	TokenNameCOMMENT_LINE	end of for... 
Element	TokenNameIdentifier	 Element
statusNode	TokenNameIdentifier	 status Node
=	TokenNameEQUAL	
factory	TokenNameIdentifier	 factory
.	TokenNameDOT	
createElement	TokenNameIdentifier	 create Element
(	TokenNameLPAREN	
"status"	TokenNameStringLiteral	status
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
statusNode	TokenNameIdentifier	 status Node
.	TokenNameDOT	
setAttribute	TokenNameIdentifier	 set Attribute
(	TokenNameLPAREN	
"result"	TokenNameStringLiteral	result
,	TokenNameCOMMA	
(	TokenNameLPAREN	
errors	TokenNameIdentifier	 errors
?	TokenNameQUESTION	
"ERROR"	TokenNameStringLiteral	ERROR
:	TokenNameCOLON	
"OK"	TokenNameStringLiteral	OK
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
envCheckNode	TokenNameIdentifier	 env Check Node
.	TokenNameDOT	
appendChild	TokenNameIdentifier	 append Child
(	TokenNameLPAREN	
statusNode	TokenNameIdentifier	 status Node
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
Exception	TokenNameIdentifier	 Exception
e2	TokenNameIdentifier	 e2
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
err	TokenNameIdentifier	 err
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"appendEnvironmentReport threw: "	TokenNameStringLiteral	appendEnvironmentReport threw: 
+	TokenNamePLUS	
e2	TokenNameIdentifier	 e2
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
e2	TokenNameIdentifier	 e2
.	TokenNameDOT	
printStackTrace	TokenNameIdentifier	 print Stack Trace
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Print out report of .jars found in a classpath. * * Takes the information encoded from a checkPathForJars() * call and dumps it out to our PrintWriter. * * @param container Node to append our report to * @param factory Document providing createElement, etc. services * @param v Vector of Hashtables of .jar file info * @param desc description to print out in header * * @return false if OK, true if any .jars were reported * as having errors * @see #checkPathForJars(String, String[]) */	TokenNameCOMMENT_JAVADOC	 Print out report of .jars found in a classpath. * Takes the information encoded from a checkPathForJars() call and dumps it out to our PrintWriter. * @param container Node to append our report to @param factory Document providing createElement, etc. services @param v Vector of Hashtables of .jar file info @param desc description to print out in header * @return false if OK, true if any .jars were reported as having errors @see #checkPathForJars(String, String[]) 
protected	TokenNameprotected	
boolean	TokenNameboolean	
appendFoundJars	TokenNameIdentifier	 append Found Jars
(	TokenNameLPAREN	
Node	TokenNameIdentifier	 Node
container	TokenNameIdentifier	 container
,	TokenNameCOMMA	
Document	TokenNameIdentifier	 Document
factory	TokenNameIdentifier	 factory
,	TokenNameCOMMA	
Vector	TokenNameIdentifier	 Vector
v	TokenNameIdentifier	 v
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
desc	TokenNameIdentifier	 desc
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
null	TokenNamenull	
==	TokenNameEQUAL_EQUAL	
v	TokenNameIdentifier	 v
)	TokenNameRPAREN	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
v	TokenNameIdentifier	 v
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
<	TokenNameLESS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
errors	TokenNameIdentifier	 errors
=	TokenNameEQUAL	
false	TokenNamefalse	
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
v	TokenNameIdentifier	 v
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Hashtable	TokenNameIdentifier	 Hashtable
subhash	TokenNameIdentifier	 subhash
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Hashtable	TokenNameIdentifier	 Hashtable
)	TokenNameRPAREN	
v	TokenNameIdentifier	 v
.	TokenNameDOT	
elementAt	TokenNameIdentifier	 element At
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
Enumeration	TokenNameIdentifier	 Enumeration
keys	TokenNameIdentifier	 keys
=	TokenNameEQUAL	
subhash	TokenNameIdentifier	 subhash
.	TokenNameDOT	
keys	TokenNameIdentifier	 keys
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
keys	TokenNameIdentifier	 keys
.	TokenNameDOT	
hasMoreElements	TokenNameIdentifier	 has More Elements
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/* no increment portion */	TokenNameCOMMENT_BLOCK	 no increment portion 
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Object	TokenNameIdentifier	 Object
key	TokenNameIdentifier	 key
=	TokenNameEQUAL	
keys	TokenNameIdentifier	 keys
.	TokenNameDOT	
nextElement	TokenNameIdentifier	 next Element
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
keyStr	TokenNameIdentifier	 key Str
=	TokenNameEQUAL	
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
)	TokenNameRPAREN	
key	TokenNameIdentifier	 key
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
keyStr	TokenNameIdentifier	 key Str
.	TokenNameDOT	
startsWith	TokenNameIdentifier	 starts With
(	TokenNameLPAREN	
ERROR	TokenNameIdentifier	 ERROR
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
errors	TokenNameIdentifier	 errors
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
Element	TokenNameIdentifier	 Element
node	TokenNameIdentifier	 node
=	TokenNameEQUAL	
factory	TokenNameIdentifier	 factory
.	TokenNameDOT	
createElement	TokenNameIdentifier	 create Element
(	TokenNameLPAREN	
"foundJar"	TokenNameStringLiteral	foundJar
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
node	TokenNameIdentifier	 node
.	TokenNameDOT	
setAttribute	TokenNameIdentifier	 set Attribute
(	TokenNameLPAREN	
"name"	TokenNameStringLiteral	name
,	TokenNameCOMMA	
keyStr	TokenNameIdentifier	 key Str
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
keyStr	TokenNameIdentifier	 key Str
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
"-"	TokenNameStringLiteral	-
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
node	TokenNameIdentifier	 node
.	TokenNameDOT	
setAttribute	TokenNameIdentifier	 set Attribute
(	TokenNameLPAREN	
"desc"	TokenNameStringLiteral	desc
,	TokenNameCOMMA	
keyStr	TokenNameIdentifier	 key Str
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
keyStr	TokenNameIdentifier	 key Str
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
"-"	TokenNameStringLiteral	-
)	TokenNameRPAREN	
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
node	TokenNameIdentifier	 node
.	TokenNameDOT	
appendChild	TokenNameIdentifier	 append Child
(	TokenNameLPAREN	
factory	TokenNameIdentifier	 factory
.	TokenNameDOT	
createTextNode	TokenNameIdentifier	 create Text Node
(	TokenNameLPAREN	
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
)	TokenNameRPAREN	
subhash	TokenNameIdentifier	 subhash
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
keyStr	TokenNameIdentifier	 key Str
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
container	TokenNameIdentifier	 container
.	TokenNameDOT	
appendChild	TokenNameIdentifier	 append Child
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
Exception	TokenNameIdentifier	 Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
errors	TokenNameIdentifier	 errors
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
Element	TokenNameIdentifier	 Element
node	TokenNameIdentifier	 node
=	TokenNameEQUAL	
factory	TokenNameIdentifier	 factory
.	TokenNameDOT	
createElement	TokenNameIdentifier	 create Element
(	TokenNameLPAREN	
"foundJar"	TokenNameStringLiteral	foundJar
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
node	TokenNameIdentifier	 node
.	TokenNameDOT	
appendChild	TokenNameIdentifier	 append Child
(	TokenNameLPAREN	
factory	TokenNameIdentifier	 factory
.	TokenNameDOT	
createTextNode	TokenNameIdentifier	 create Text Node
(	TokenNameLPAREN	
ERROR	TokenNameIdentifier	 ERROR
+	TokenNamePLUS	
" Reading "	TokenNameStringLiteral	 Reading 
+	TokenNamePLUS	
key	TokenNameIdentifier	 key
+	TokenNamePLUS	
" threw: "	TokenNameStringLiteral	 threw: 
+	TokenNamePLUS	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
container	TokenNameIdentifier	 container
.	TokenNameDOT	
appendChild	TokenNameIdentifier	 append Child
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
errors	TokenNameIdentifier	 errors
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Fillin hash with info about SystemProperties. * * Logs java.class.path and other likely paths; then attempts * to search those paths for .jar files with Xalan-related classes. * * //@todo NOTE: We don't actually search java.ext.dirs for * // *.jar files therein! This should be updated * * @param h Hashtable to put information in * @see #jarNames * @see #checkPathForJars(String, String[]) */	TokenNameCOMMENT_JAVADOC	 Fillin hash with info about SystemProperties. * Logs java.class.path and other likely paths; then attempts to search those paths for .jar files with Xalan-related classes. * //@todo NOTE: We don't actually search java.ext.dirs for // *.jar files therein! This should be updated * @param h Hashtable to put information in @see #jarNames @see #checkPathForJars(String, String[]) 
protected	TokenNameprotected	
void	TokenNamevoid	
checkSystemProperties	TokenNameIdentifier	 check System Properties
(	TokenNameLPAREN	
Hashtable	TokenNameIdentifier	 Hashtable
h	TokenNameIdentifier	 h
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
==	TokenNameEQUAL_EQUAL	
h	TokenNameIdentifier	 h
)	TokenNameRPAREN	
h	TokenNameIdentifier	 h
=	TokenNameEQUAL	
new	TokenNamenew	
Hashtable	TokenNameIdentifier	 Hashtable
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Grab java version for later use 	TokenNameCOMMENT_LINE	Grab java version for later use 
try	TokenNametry	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
javaVersion	TokenNameIdentifier	 java Version
=	TokenNameEQUAL	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
getProperty	TokenNameIdentifier	 get Property
(	TokenNameLPAREN	
"java.version"	TokenNameStringLiteral	java.version
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
h	TokenNameIdentifier	 h
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"java.version"	TokenNameStringLiteral	java.version
,	TokenNameCOMMA	
javaVersion	TokenNameIdentifier	 java Version
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
SecurityException	TokenNameIdentifier	 Security Exception
se	TokenNameIdentifier	 se
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// For applet context, etc. 	TokenNameCOMMENT_LINE	For applet context, etc. 
h	TokenNameIdentifier	 h
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"java.version"	TokenNameStringLiteral	java.version
,	TokenNameCOMMA	
"WARNING: SecurityException thrown accessing system version properties"	TokenNameStringLiteral	WARNING: SecurityException thrown accessing system version properties
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Printout jar files on classpath(s) that may affect operation 	TokenNameCOMMENT_LINE	Printout jar files on classpath(s) that may affect operation 
// Do this in order 	TokenNameCOMMENT_LINE	Do this in order 
try	TokenNametry	
{	TokenNameLBRACE	
// This is present in all JVM's 	TokenNameCOMMENT_LINE	This is present in all JVM's 
String	TokenNameIdentifier	 String
cp	TokenNameIdentifier	 cp
=	TokenNameEQUAL	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
getProperty	TokenNameIdentifier	 get Property
(	TokenNameLPAREN	
"java.class.path"	TokenNameStringLiteral	java.class.path
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
h	TokenNameIdentifier	 h
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"java.class.path"	TokenNameStringLiteral	java.class.path
,	TokenNameCOMMA	
cp	TokenNameIdentifier	 cp
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Vector	TokenNameIdentifier	 Vector
classpathJars	TokenNameIdentifier	 classpath Jars
=	TokenNameEQUAL	
checkPathForJars	TokenNameIdentifier	 check Path For Jars
(	TokenNameLPAREN	
cp	TokenNameIdentifier	 cp
,	TokenNameCOMMA	
jarNames	TokenNameIdentifier	 jar Names
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
classpathJars	TokenNameIdentifier	 classpath Jars
)	TokenNameRPAREN	
h	TokenNameIdentifier	 h
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
FOUNDCLASSES	TokenNameIdentifier	 FOUNDCLASSES
+	TokenNamePLUS	
"java.class.path"	TokenNameStringLiteral	java.class.path
,	TokenNameCOMMA	
classpathJars	TokenNameIdentifier	 classpath Jars
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Also check for JDK 1.2+ type classpaths 	TokenNameCOMMENT_LINE	Also check for JDK 1.2+ type classpaths 
String	TokenNameIdentifier	 String
othercp	TokenNameIdentifier	 othercp
=	TokenNameEQUAL	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
getProperty	TokenNameIdentifier	 get Property
(	TokenNameLPAREN	
"sun.boot.class.path"	TokenNameStringLiteral	sun.boot.class.path
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
othercp	TokenNameIdentifier	 othercp
)	TokenNameRPAREN	
{	TokenNameLBRACE	
h	TokenNameIdentifier	 h
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"sun.boot.class.path"	TokenNameStringLiteral	sun.boot.class.path
,	TokenNameCOMMA	
othercp	TokenNameIdentifier	 othercp
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
classpathJars	TokenNameIdentifier	 classpath Jars
=	TokenNameEQUAL	
checkPathForJars	TokenNameIdentifier	 check Path For Jars
(	TokenNameLPAREN	
othercp	TokenNameIdentifier	 othercp
,	TokenNameCOMMA	
jarNames	TokenNameIdentifier	 jar Names
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
classpathJars	TokenNameIdentifier	 classpath Jars
)	TokenNameRPAREN	
h	TokenNameIdentifier	 h
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
FOUNDCLASSES	TokenNameIdentifier	 FOUNDCLASSES
+	TokenNamePLUS	
"sun.boot.class.path"	TokenNameStringLiteral	sun.boot.class.path
,	TokenNameCOMMA	
classpathJars	TokenNameIdentifier	 classpath Jars
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
//@todo NOTE: We don't actually search java.ext.dirs for 	TokenNameCOMMENT_LINE	@todo NOTE: We don't actually search java.ext.dirs for 
// *.jar files therein! This should be updated 	TokenNameCOMMENT_LINE	*.jar files therein! This should be updated 
othercp	TokenNameIdentifier	 othercp
=	TokenNameEQUAL	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
getProperty	TokenNameIdentifier	 get Property
(	TokenNameLPAREN	
"java.ext.dirs"	TokenNameStringLiteral	java.ext.dirs
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
othercp	TokenNameIdentifier	 othercp
)	TokenNameRPAREN	
{	TokenNameLBRACE	
h	TokenNameIdentifier	 h
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"java.ext.dirs"	TokenNameStringLiteral	java.ext.dirs
,	TokenNameCOMMA	
othercp	TokenNameIdentifier	 othercp
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
classpathJars	TokenNameIdentifier	 classpath Jars
=	TokenNameEQUAL	
checkPathForJars	TokenNameIdentifier	 check Path For Jars
(	TokenNameLPAREN	
othercp	TokenNameIdentifier	 othercp
,	TokenNameCOMMA	
jarNames	TokenNameIdentifier	 jar Names
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
classpathJars	TokenNameIdentifier	 classpath Jars
)	TokenNameRPAREN	
h	TokenNameIdentifier	 h
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
FOUNDCLASSES	TokenNameIdentifier	 FOUNDCLASSES
+	TokenNamePLUS	
"java.ext.dirs"	TokenNameStringLiteral	java.ext.dirs
,	TokenNameCOMMA	
classpathJars	TokenNameIdentifier	 classpath Jars
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
//@todo also check other System properties' paths? 	TokenNameCOMMENT_LINE	@todo also check other System properties' paths? 
// v2 = checkPathForJars(System.getProperty("sun.boot.library.path"), jarNames); // ?? may not be needed 	TokenNameCOMMENT_LINE	v2 = checkPathForJars(System.getProperty("sun.boot.library.path"), jarNames); // ?? may not be needed 
// v3 = checkPathForJars(System.getProperty("java.library.path"), jarNames); // ?? may not be needed 	TokenNameCOMMENT_LINE	v3 = checkPathForJars(System.getProperty("java.library.path"), jarNames); // ?? may not be needed 
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
SecurityException	TokenNameIdentifier	 Security Exception
se2	TokenNameIdentifier	 se2
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// For applet context, etc. 	TokenNameCOMMENT_LINE	For applet context, etc. 
h	TokenNameIdentifier	 h
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"java.class.path"	TokenNameStringLiteral	java.class.path
,	TokenNameCOMMA	
"WARNING: SecurityException thrown accessing system classpath properties"	TokenNameStringLiteral	WARNING: SecurityException thrown accessing system classpath properties
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Cheap-o listing of specified .jars found in the classpath. * * cp should be separated by the usual File.pathSeparator. We * then do a simplistic search of the path for any requested * .jar filenames, and return a listing of their names and * where (apparently) they came from. * * @param cp classpath to search * @param jars array of .jar base filenames to look for * * @return Vector of Hashtables filled with info about found .jars * @see #jarNames * @see #logFoundJars(Vector, String) * @see #appendFoundJars(Node, Document, Vector, String ) * @see #getApparentVersion(String, long) */	TokenNameCOMMENT_JAVADOC	 Cheap-o listing of specified .jars found in the classpath. * cp should be separated by the usual File.pathSeparator. We then do a simplistic search of the path for any requested .jar filenames, and return a listing of their names and where (apparently) they came from. * @param cp classpath to search @param jars array of .jar base filenames to look for * @return Vector of Hashtables filled with info about found .jars @see #jarNames @see #logFoundJars(Vector, String) @see #appendFoundJars(Node, Document, Vector, String ) @see #getApparentVersion(String, long) 
protected	TokenNameprotected	
Vector	TokenNameIdentifier	 Vector
checkPathForJars	TokenNameIdentifier	 check Path For Jars
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
cp	TokenNameIdentifier	 cp
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
jars	TokenNameIdentifier	 jars
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
null	TokenNamenull	
==	TokenNameEQUAL_EQUAL	
cp	TokenNameIdentifier	 cp
)	TokenNameRPAREN	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
null	TokenNamenull	
==	TokenNameEQUAL_EQUAL	
jars	TokenNameIdentifier	 jars
)	TokenNameRPAREN	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
==	TokenNameEQUAL_EQUAL	
cp	TokenNameIdentifier	 cp
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
==	TokenNameEQUAL_EQUAL	
jars	TokenNameIdentifier	 jars
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
Vector	TokenNameIdentifier	 Vector
v	TokenNameIdentifier	 v
=	TokenNameEQUAL	
new	TokenNamenew	
Vector	TokenNameIdentifier	 Vector
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
StringTokenizer	TokenNameIdentifier	 String Tokenizer
st	TokenNameIdentifier	 st
=	TokenNameEQUAL	
new	TokenNamenew	
StringTokenizer	TokenNameIdentifier	 String Tokenizer
(	TokenNameLPAREN	
cp	TokenNameIdentifier	 cp
,	TokenNameCOMMA	
File	TokenNameIdentifier	 File
.	TokenNameDOT	
pathSeparator	TokenNameIdentifier	 path Separator
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
st	TokenNameIdentifier	 st
.	TokenNameDOT	
hasMoreTokens	TokenNameIdentifier	 has More Tokens
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Look at each classpath entry for each of our requested jarNames 	TokenNameCOMMENT_LINE	Look at each classpath entry for each of our requested jarNames 
String	TokenNameIdentifier	 String
filename	TokenNameIdentifier	 filename
=	TokenNameEQUAL	
st	TokenNameIdentifier	 st
.	TokenNameDOT	
nextToken	TokenNameIdentifier	 next Token
(	TokenNameLPAREN	
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
jars	TokenNameIdentifier	 jars
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
filename	TokenNameIdentifier	 filename
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
jars	TokenNameIdentifier	 jars
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
>	TokenNameGREATER	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
File	TokenNameIdentifier	 File
f	TokenNameIdentifier	 f
=	TokenNameEQUAL	
new	TokenNamenew	
File	TokenNameIdentifier	 File
(	TokenNameLPAREN	
filename	TokenNameIdentifier	 filename
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
f	TokenNameIdentifier	 f
.	TokenNameDOT	
exists	TokenNameIdentifier	 exists
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// If any requested jarName exists, report on 	TokenNameCOMMENT_LINE	If any requested jarName exists, report on 
// the details of that .jar file 	TokenNameCOMMENT_LINE	the details of that .jar file 
try	TokenNametry	
{	TokenNameLBRACE	
Hashtable	TokenNameIdentifier	 Hashtable
h	TokenNameIdentifier	 h
=	TokenNameEQUAL	
new	TokenNamenew	
Hashtable	TokenNameIdentifier	 Hashtable
(	TokenNameLPAREN	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Note "-" char is looked for in appendFoundJars 	TokenNameCOMMENT_LINE	Note "-" char is looked for in appendFoundJars 
h	TokenNameIdentifier	 h
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
jars	TokenNameIdentifier	 jars
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
+	TokenNamePLUS	
"-path"	TokenNameStringLiteral	-path
,	TokenNameCOMMA	
f	TokenNameIdentifier	 f
.	TokenNameDOT	
getAbsolutePath	TokenNameIdentifier	 get Absolute Path
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// We won't bother reporting on the xalan.jar apparent version 	TokenNameCOMMENT_LINE	We won't bother reporting on the xalan.jar apparent version 
// since this requires knowing the jar size of the xalan.jar 	TokenNameCOMMENT_LINE	since this requires knowing the jar size of the xalan.jar 
// before we build it. 	TokenNameCOMMENT_LINE	before we build it. 
// For other jars, eg. xml-apis.jar and xercesImpl.jar, we 	TokenNameCOMMENT_LINE	For other jars, eg. xml-apis.jar and xercesImpl.jar, we 
// report the apparent version of the file we've found 	TokenNameCOMMENT_LINE	report the apparent version of the file we've found 
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
(	TokenNameLPAREN	
"xalan.jar"	TokenNameStringLiteral	xalan.jar
.	TokenNameDOT	
equalsIgnoreCase	TokenNameIdentifier	 equals Ignore Case
(	TokenNameLPAREN	
jars	TokenNameIdentifier	 jars
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
h	TokenNameIdentifier	 h
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
jars	TokenNameIdentifier	 jars
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
+	TokenNamePLUS	
"-apparent.version"	TokenNameStringLiteral	-apparent.version
,	TokenNameCOMMA	
getApparentVersion	TokenNameIdentifier	 get Apparent Version
(	TokenNameLPAREN	
jars	TokenNameIdentifier	 jars
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
f	TokenNameIdentifier	 f
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
v	TokenNameIdentifier	 v
.	TokenNameDOT	
addElement	TokenNameIdentifier	 add Element
(	TokenNameLPAREN	
h	TokenNameIdentifier	 h
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
Exception	TokenNameIdentifier	 Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
/* no-op, don't add it */	TokenNameCOMMENT_BLOCK	 no-op, don't add it 
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
Hashtable	TokenNameIdentifier	 Hashtable
h	TokenNameIdentifier	 h
=	TokenNameEQUAL	
new	TokenNamenew	
Hashtable	TokenNameIdentifier	 Hashtable
(	TokenNameLPAREN	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Note "-" char is looked for in appendFoundJars 	TokenNameCOMMENT_LINE	Note "-" char is looked for in appendFoundJars 
h	TokenNameIdentifier	 h
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
jars	TokenNameIdentifier	 jars
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
+	TokenNamePLUS	
"-path"	TokenNameStringLiteral	-path
,	TokenNameCOMMA	
WARNING	TokenNameIdentifier	 WARNING
+	TokenNamePLUS	
" Classpath entry: "	TokenNameStringLiteral	 Classpath entry: 
+	TokenNamePLUS	
filename	TokenNameIdentifier	 filename
+	TokenNamePLUS	
" does not exist"	TokenNameStringLiteral	 does not exist
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
h	TokenNameIdentifier	 h
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
jars	TokenNameIdentifier	 jars
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
+	TokenNamePLUS	
"-apparent.version"	TokenNameStringLiteral	-apparent.version
,	TokenNameCOMMA	
CLASS_NOTPRESENT	TokenNameIdentifier	 CLASS  NOTPRESENT
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
v	TokenNameIdentifier	 v
.	TokenNameDOT	
addElement	TokenNameIdentifier	 add Element
(	TokenNameLPAREN	
h	TokenNameIdentifier	 h
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
v	TokenNameIdentifier	 v
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Cheap-o method to determine the product version of a .jar. * * Currently does a lookup into a local table of some recent * shipped Xalan builds to determine where the .jar probably * came from. Note that if you recompile Xalan or Xerces * yourself this will likely report a potential error, since * we can't certify builds other than the ones we ship. * Only reports against selected posted Xalan-J builds. * * //@todo actually look up version info in manifests * * @param jarName base filename of the .jarfile * @param jarSize size of the .jarfile * * @return String describing where the .jar file probably * came from */	TokenNameCOMMENT_JAVADOC	 Cheap-o method to determine the product version of a .jar. * Currently does a lookup into a local table of some recent shipped Xalan builds to determine where the .jar probably came from. Note that if you recompile Xalan or Xerces yourself this will likely report a potential error, since we can't certify builds other than the ones we ship. Only reports against selected posted Xalan-J builds. * //@todo actually look up version info in manifests * @param jarName base filename of the .jarfile @param jarSize size of the .jarfile * @return String describing where the .jar file probably came from 
protected	TokenNameprotected	
String	TokenNameIdentifier	 String
getApparentVersion	TokenNameIdentifier	 get Apparent Version
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
jarName	TokenNameIdentifier	 jar Name
,	TokenNameCOMMA	
long	TokenNamelong	
jarSize	TokenNameIdentifier	 jar Size
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// If we found a matching size and it's for our 	TokenNameCOMMENT_LINE	If we found a matching size and it's for our 
// jar, then return it's description 	TokenNameCOMMENT_LINE	jar, then return it's description 
// Lookup in static jarVersions Hashtable 	TokenNameCOMMENT_LINE	Lookup in static jarVersions Hashtable 
String	TokenNameIdentifier	 String
foundSize	TokenNameIdentifier	 found Size
=	TokenNameEQUAL	
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
)	TokenNameRPAREN	
jarVersions	TokenNameIdentifier	 jar Versions
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
new	TokenNamenew	
Long	TokenNameIdentifier	 Long
(	TokenNameLPAREN	
jarSize	TokenNameIdentifier	 jar Size
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
foundSize	TokenNameIdentifier	 found Size
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
foundSize	TokenNameIdentifier	 found Size
.	TokenNameDOT	
startsWith	TokenNameIdentifier	 starts With
(	TokenNameLPAREN	
jarName	TokenNameIdentifier	 jar Name
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
foundSize	TokenNameIdentifier	 found Size
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
"xerces.jar"	TokenNameStringLiteral	xerces.jar
.	TokenNameDOT	
equalsIgnoreCase	TokenNameIdentifier	 equals Ignore Case
(	TokenNameLPAREN	
jarName	TokenNameIdentifier	 jar Name
)	TokenNameRPAREN	
||	TokenNameOR_OR	
"xercesImpl.jar"	TokenNameStringLiteral	xercesImpl.jar
.	TokenNameDOT	
equalsIgnoreCase	TokenNameIdentifier	 equals Ignore Case
(	TokenNameLPAREN	
jarName	TokenNameIdentifier	 jar Name
)	TokenNameRPAREN	
)	TokenNameRPAREN	
// || "xalan.jar".equalsIgnoreCase(jarName)) 	TokenNameCOMMENT_LINE	|| "xalan.jar".equalsIgnoreCase(jarName)) 
{	TokenNameLBRACE	
// For xalan.jar and xerces.jar/xercesImpl.jar, which we ship together: 	TokenNameCOMMENT_LINE	For xalan.jar and xerces.jar/xercesImpl.jar, which we ship together: 
// The jar is not from a shipped copy of xalan-j, so 	TokenNameCOMMENT_LINE	The jar is not from a shipped copy of xalan-j, so 
// it's up to the user to ensure that it's compatible 	TokenNameCOMMENT_LINE	it's up to the user to ensure that it's compatible 
return	TokenNamereturn	
jarName	TokenNameIdentifier	 jar Name
+	TokenNamePLUS	
" "	TokenNameStringLiteral	 
+	TokenNamePLUS	
WARNING	TokenNameIdentifier	 WARNING
+	TokenNamePLUS	
CLASS_PRESENT	TokenNameIdentifier	 CLASS  PRESENT
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// Otherwise, it's just a jar we don't have the version info calculated for 	TokenNameCOMMENT_LINE	Otherwise, it's just a jar we don't have the version info calculated for 
return	TokenNamereturn	
jarName	TokenNameIdentifier	 jar Name
+	TokenNamePLUS	
" "	TokenNameStringLiteral	 
+	TokenNamePLUS	
CLASS_PRESENT	TokenNameIdentifier	 CLASS  PRESENT
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Report version information about JAXP interfaces. * * Currently distinguishes between JAXP 1.0.1 and JAXP 1.1, * and not found; only tests the interfaces, and does not * check for reference implementation versions. * * @param h Hashtable to put information in */	TokenNameCOMMENT_JAVADOC	 Report version information about JAXP interfaces. * Currently distinguishes between JAXP 1.0.1 and JAXP 1.1, and not found; only tests the interfaces, and does not check for reference implementation versions. * @param h Hashtable to put information in 
protected	TokenNameprotected	
void	TokenNamevoid	
checkJAXPVersion	TokenNameIdentifier	 check JAXP Version
(	TokenNameLPAREN	
Hashtable	TokenNameIdentifier	 Hashtable
h	TokenNameIdentifier	 h
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
==	TokenNameEQUAL_EQUAL	
h	TokenNameIdentifier	 h
)	TokenNameRPAREN	
h	TokenNameIdentifier	 h
=	TokenNameEQUAL	
new	TokenNamenew	
Hashtable	TokenNameIdentifier	 Hashtable
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
Class	TokenNameIdentifier	 Class
noArgs	TokenNameIdentifier	 no Args
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
new	TokenNamenew	
Class	TokenNameIdentifier	 Class
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
Class	TokenNameIdentifier	 Class
clazz	TokenNameIdentifier	 clazz
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
JAXP1_CLASS	TokenNameIdentifier	 JAX P1  CLASS
=	TokenNameEQUAL	
"javax.xml.parsers.DocumentBuilder"	TokenNameStringLiteral	javax.xml.parsers.DocumentBuilder
;	TokenNameSEMICOLON	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
JAXP11_METHOD	TokenNameIdentifier	 JAX P11  METHOD
=	TokenNameEQUAL	
"getDOMImplementation"	TokenNameStringLiteral	getDOMImplementation
;	TokenNameSEMICOLON	
clazz	TokenNameIdentifier	 clazz
=	TokenNameEQUAL	
ObjectFactory	TokenNameIdentifier	 Object Factory
.	TokenNameDOT	
findProviderClass	TokenNameIdentifier	 find Provider Class
(	TokenNameLPAREN	
JAXP1_CLASS	TokenNameIdentifier	 JAX P1  CLASS
,	TokenNameCOMMA	
ObjectFactory	TokenNameIdentifier	 Object Factory
.	TokenNameDOT	
findClassLoader	TokenNameIdentifier	 find Class Loader
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Method	TokenNameIdentifier	 Method
method	TokenNameIdentifier	 method
=	TokenNameEQUAL	
clazz	TokenNameIdentifier	 clazz
.	TokenNameDOT	
getMethod	TokenNameIdentifier	 get Method
(	TokenNameLPAREN	
JAXP11_METHOD	TokenNameIdentifier	 JAX P11  METHOD
,	TokenNameCOMMA	
noArgs	TokenNameIdentifier	 no Args
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// If we succeeded, we at least have JAXP 1.1 available 	TokenNameCOMMENT_LINE	If we succeeded, we at least have JAXP 1.1 available 
h	TokenNameIdentifier	 h
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
VERSION	TokenNameIdentifier	 VERSION
+	TokenNamePLUS	
"JAXP"	TokenNameStringLiteral	JAXP
,	TokenNameCOMMA	
"1.1 or higher"	TokenNameStringLiteral	1.1 or higher
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
Exception	TokenNameIdentifier	 Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
clazz	TokenNameIdentifier	 clazz
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// We must have found the class itself, just not the 	TokenNameCOMMENT_LINE	We must have found the class itself, just not the 
// method, so we (probably) have JAXP 1.0.1 	TokenNameCOMMENT_LINE	method, so we (probably) have JAXP 1.0.1 
h	TokenNameIdentifier	 h
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
ERROR	TokenNameIdentifier	 ERROR
+	TokenNamePLUS	
VERSION	TokenNameIdentifier	 VERSION
+	TokenNamePLUS	
"JAXP"	TokenNameStringLiteral	JAXP
,	TokenNameCOMMA	
"1.0.1"	TokenNameStringLiteral	1.0.1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
h	TokenNameIdentifier	 h
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
ERROR	TokenNameIdentifier	 ERROR
,	TokenNameCOMMA	
ERROR_FOUND	TokenNameIdentifier	 ERROR  FOUND
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// We couldn't even find the class, and don't have 	TokenNameCOMMENT_LINE	We couldn't even find the class, and don't have 
// any JAXP support at all, or only have the 	TokenNameCOMMENT_LINE	any JAXP support at all, or only have the 
// transform half of it 	TokenNameCOMMENT_LINE	transform half of it 
h	TokenNameIdentifier	 h
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
ERROR	TokenNameIdentifier	 ERROR
+	TokenNamePLUS	
VERSION	TokenNameIdentifier	 VERSION
+	TokenNamePLUS	
"JAXP"	TokenNameStringLiteral	JAXP
,	TokenNameCOMMA	
CLASS_NOTPRESENT	TokenNameIdentifier	 CLASS  NOTPRESENT
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
h	TokenNameIdentifier	 h
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
ERROR	TokenNameIdentifier	 ERROR
,	TokenNameCOMMA	
ERROR_FOUND	TokenNameIdentifier	 ERROR  FOUND
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Report product version information from Xalan-J. * * Looks for version info in xalan.jar from Xalan-J products. * * @param h Hashtable to put information in */	TokenNameCOMMENT_JAVADOC	 Report product version information from Xalan-J. * Looks for version info in xalan.jar from Xalan-J products. * @param h Hashtable to put information in 
protected	TokenNameprotected	
void	TokenNamevoid	
checkProcessorVersion	TokenNameIdentifier	 check Processor Version
(	TokenNameLPAREN	
Hashtable	TokenNameIdentifier	 Hashtable
h	TokenNameIdentifier	 h
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
==	TokenNameEQUAL_EQUAL	
h	TokenNameIdentifier	 h
)	TokenNameRPAREN	
h	TokenNameIdentifier	 h
=	TokenNameEQUAL	
new	TokenNamenew	
Hashtable	TokenNameIdentifier	 Hashtable
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
XALAN1_VERSION_CLASS	TokenNameIdentifier	 XALA N1  VERSION  CLASS
=	TokenNameEQUAL	
"org.apache.xalan.xslt.XSLProcessorVersion"	TokenNameStringLiteral	org.apache.xalan.xslt.XSLProcessorVersion
;	TokenNameSEMICOLON	
Class	TokenNameIdentifier	 Class
clazz	TokenNameIdentifier	 clazz
=	TokenNameEQUAL	
ObjectFactory	TokenNameIdentifier	 Object Factory
.	TokenNameDOT	
findProviderClass	TokenNameIdentifier	 find Provider Class
(	TokenNameLPAREN	
XALAN1_VERSION_CLASS	TokenNameIdentifier	 XALA N1  VERSION  CLASS
,	TokenNameCOMMA	
ObjectFactory	TokenNameIdentifier	 Object Factory
.	TokenNameDOT	
findClassLoader	TokenNameIdentifier	 find Class Loader
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Found Xalan-J 1.x, grab it's version fields 	TokenNameCOMMENT_LINE	Found Xalan-J 1.x, grab it's version fields 
StringBuffer	TokenNameIdentifier	 String Buffer
buf	TokenNameIdentifier	 buf
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuffer	TokenNameIdentifier	 String Buffer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Field	TokenNameIdentifier	 Field
f	TokenNameIdentifier	 f
=	TokenNameEQUAL	
clazz	TokenNameIdentifier	 clazz
.	TokenNameDOT	
getField	TokenNameIdentifier	 get Field
(	TokenNameLPAREN	
"PRODUCT"	TokenNameStringLiteral	PRODUCT
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
f	TokenNameIdentifier	 f
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
null	TokenNamenull	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
';'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
f	TokenNameIdentifier	 f
=	TokenNameEQUAL	
clazz	TokenNameIdentifier	 clazz
.	TokenNameDOT	
getField	TokenNameIdentifier	 get Field
(	TokenNameLPAREN	
"LANGUAGE"	TokenNameStringLiteral	LANGUAGE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
f	TokenNameIdentifier	 f
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
null	TokenNamenull	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
';'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
f	TokenNameIdentifier	 f
=	TokenNameEQUAL	
clazz	TokenNameIdentifier	 clazz
.	TokenNameDOT	
getField	TokenNameIdentifier	 get Field
(	TokenNameLPAREN	
"S_VERSION"	TokenNameStringLiteral	S_VERSION
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
f	TokenNameIdentifier	 f
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
null	TokenNamenull	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
';'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
h	TokenNameIdentifier	 h
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
VERSION	TokenNameIdentifier	 VERSION
+	TokenNamePLUS	
"xalan1"	TokenNameStringLiteral	xalan1
,	TokenNameCOMMA	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
Exception	TokenNameIdentifier	 Exception
e1	TokenNameIdentifier	 e1
)	TokenNameRPAREN	
{	TokenNameLBRACE	
h	TokenNameIdentifier	 h
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
VERSION	TokenNameIdentifier	 VERSION
+	TokenNamePLUS	
"xalan1"	TokenNameStringLiteral	xalan1
,	TokenNameCOMMA	
CLASS_NOTPRESENT	TokenNameIdentifier	 CLASS  NOTPRESENT
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
// NOTE: This is the old Xalan 2.0, 2.1, 2.2 version class, 	TokenNameCOMMENT_LINE	NOTE: This is the old Xalan 2.0, 2.1, 2.2 version class, 
// is being replaced by class below 	TokenNameCOMMENT_LINE	is being replaced by class below 
final	TokenNamefinal	
String	TokenNameIdentifier	 String
XALAN2_VERSION_CLASS	TokenNameIdentifier	 XALA N2  VERSION  CLASS
=	TokenNameEQUAL	
"org.apache.xalan.processor.XSLProcessorVersion"	TokenNameStringLiteral	org.apache.xalan.processor.XSLProcessorVersion
;	TokenNameSEMICOLON	
Class	TokenNameIdentifier	 Class
clazz	TokenNameIdentifier	 clazz
=	TokenNameEQUAL	
ObjectFactory	TokenNameIdentifier	 Object Factory
.	TokenNameDOT	
findProviderClass	TokenNameIdentifier	 find Provider Class
(	TokenNameLPAREN	
XALAN2_VERSION_CLASS	TokenNameIdentifier	 XALA N2  VERSION  CLASS
,	TokenNameCOMMA	
ObjectFactory	TokenNameIdentifier	 Object Factory
.	TokenNameDOT	
findClassLoader	TokenNameIdentifier	 find Class Loader
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Found Xalan-J 2.x, grab it's version fields 	TokenNameCOMMENT_LINE	Found Xalan-J 2.x, grab it's version fields 
StringBuffer	TokenNameIdentifier	 String Buffer
buf	TokenNameIdentifier	 buf
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuffer	TokenNameIdentifier	 String Buffer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Field	TokenNameIdentifier	 Field
f	TokenNameIdentifier	 f
=	TokenNameEQUAL	
clazz	TokenNameIdentifier	 clazz
.	TokenNameDOT	
getField	TokenNameIdentifier	 get Field
(	TokenNameLPAREN	
"S_VERSION"	TokenNameStringLiteral	S_VERSION
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
f	TokenNameIdentifier	 f
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
null	TokenNamenull	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
h	TokenNameIdentifier	 h
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
VERSION	TokenNameIdentifier	 VERSION
+	TokenNamePLUS	
"xalan2x"	TokenNameStringLiteral	xalan2x
,	TokenNameCOMMA	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
Exception	TokenNameIdentifier	 Exception
e2	TokenNameIdentifier	 e2
)	TokenNameRPAREN	
{	TokenNameLBRACE	
h	TokenNameIdentifier	 h
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
VERSION	TokenNameIdentifier	 VERSION
+	TokenNamePLUS	
"xalan2x"	TokenNameStringLiteral	xalan2x
,	TokenNameCOMMA	
CLASS_NOTPRESENT	TokenNameIdentifier	 CLASS  NOTPRESENT
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
// NOTE: This is the new Xalan 2.2+ version class 	TokenNameCOMMENT_LINE	NOTE: This is the new Xalan 2.2+ version class 
final	TokenNamefinal	
String	TokenNameIdentifier	 String
XALAN2_2_VERSION_CLASS	TokenNameIdentifier	 XALA N2 2  VERSION  CLASS
=	TokenNameEQUAL	
"org.apache.xalan.Version"	TokenNameStringLiteral	org.apache.xalan.Version
;	TokenNameSEMICOLON	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
XALAN2_2_VERSION_METHOD	TokenNameIdentifier	 XALA N2 2  VERSION  METHOD
=	TokenNameEQUAL	
"getVersion"	TokenNameStringLiteral	getVersion
;	TokenNameSEMICOLON	
final	TokenNamefinal	
Class	TokenNameIdentifier	 Class
noArgs	TokenNameIdentifier	 no Args
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
new	TokenNamenew	
Class	TokenNameIdentifier	 Class
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
Class	TokenNameIdentifier	 Class
clazz	TokenNameIdentifier	 clazz
=	TokenNameEQUAL	
ObjectFactory	TokenNameIdentifier	 Object Factory
.	TokenNameDOT	
findProviderClass	TokenNameIdentifier	 find Provider Class
(	TokenNameLPAREN	
XALAN2_2_VERSION_CLASS	TokenNameIdentifier	 XALA N2 2  VERSION  CLASS
,	TokenNameCOMMA	
ObjectFactory	TokenNameIdentifier	 Object Factory
.	TokenNameDOT	
findClassLoader	TokenNameIdentifier	 find Class Loader
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Method	TokenNameIdentifier	 Method
method	TokenNameIdentifier	 method
=	TokenNameEQUAL	
clazz	TokenNameIdentifier	 clazz
.	TokenNameDOT	
getMethod	TokenNameIdentifier	 get Method
(	TokenNameLPAREN	
XALAN2_2_VERSION_METHOD	TokenNameIdentifier	 XALA N2 2  VERSION  METHOD
,	TokenNameCOMMA	
noArgs	TokenNameIdentifier	 no Args
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Object	TokenNameIdentifier	 Object
returnValue	TokenNameIdentifier	 return Value
=	TokenNameEQUAL	
method	TokenNameIdentifier	 method
.	TokenNameDOT	
invoke	TokenNameIdentifier	 invoke
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
new	TokenNamenew	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
h	TokenNameIdentifier	 h
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
VERSION	TokenNameIdentifier	 VERSION
+	TokenNamePLUS	
"xalan2_2"	TokenNameStringLiteral	xalan2_2
,	TokenNameCOMMA	
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
)	TokenNameRPAREN	
returnValue	TokenNameIdentifier	 return Value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
Exception	TokenNameIdentifier	 Exception
e2	TokenNameIdentifier	 e2
)	TokenNameRPAREN	
{	TokenNameLBRACE	
h	TokenNameIdentifier	 h
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
VERSION	TokenNameIdentifier	 VERSION
+	TokenNamePLUS	
"xalan2_2"	TokenNameStringLiteral	xalan2_2
,	TokenNameCOMMA	
CLASS_NOTPRESENT	TokenNameIdentifier	 CLASS  NOTPRESENT
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Report product version information from common parsers. * * Looks for version info in xerces.jar/xercesImpl.jar/crimson.jar. * * //@todo actually look up version info in crimson manifest * * @param h Hashtable to put information in */	TokenNameCOMMENT_JAVADOC	 Report product version information from common parsers. * Looks for version info in xerces.jar/xercesImpl.jar/crimson.jar. * //@todo actually look up version info in crimson manifest * @param h Hashtable to put information in 
protected	TokenNameprotected	
void	TokenNamevoid	
checkParserVersion	TokenNameIdentifier	 check Parser Version
(	TokenNameLPAREN	
Hashtable	TokenNameIdentifier	 Hashtable
h	TokenNameIdentifier	 h
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
==	TokenNameEQUAL_EQUAL	
h	TokenNameIdentifier	 h
)	TokenNameRPAREN	
h	TokenNameIdentifier	 h
=	TokenNameEQUAL	
new	TokenNamenew	
Hashtable	TokenNameIdentifier	 Hashtable
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
XERCES1_VERSION_CLASS	TokenNameIdentifier	 XERCE S1  VERSION  CLASS
=	TokenNameEQUAL	
"org.apache.xerces.framework.Version"	TokenNameStringLiteral	org.apache.xerces.framework.Version
;	TokenNameSEMICOLON	
Class	TokenNameIdentifier	 Class
clazz	TokenNameIdentifier	 clazz
=	TokenNameEQUAL	
ObjectFactory	TokenNameIdentifier	 Object Factory
.	TokenNameDOT	
findProviderClass	TokenNameIdentifier	 find Provider Class
(	TokenNameLPAREN	
XERCES1_VERSION_CLASS	TokenNameIdentifier	 XERCE S1  VERSION  CLASS
,	TokenNameCOMMA	
ObjectFactory	TokenNameIdentifier	 Object Factory
.	TokenNameDOT	
findClassLoader	TokenNameIdentifier	 find Class Loader
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Found Xerces-J 1.x, grab it's version fields 	TokenNameCOMMENT_LINE	Found Xerces-J 1.x, grab it's version fields 
Field	TokenNameIdentifier	 Field
f	TokenNameIdentifier	 f
=	TokenNameEQUAL	
clazz	TokenNameIdentifier	 clazz
.	TokenNameDOT	
getField	TokenNameIdentifier	 get Field
(	TokenNameLPAREN	
"fVersion"	TokenNameStringLiteral	fVersion
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
parserVersion	TokenNameIdentifier	 parser Version
=	TokenNameEQUAL	
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
)	TokenNameRPAREN	
f	TokenNameIdentifier	 f
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
h	TokenNameIdentifier	 h
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
VERSION	TokenNameIdentifier	 VERSION
+	TokenNamePLUS	
"xerces1"	TokenNameStringLiteral	xerces1
,	TokenNameCOMMA	
parserVersion	TokenNameIdentifier	 parser Version
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
Exception	TokenNameIdentifier	 Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
h	TokenNameIdentifier	 h
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
VERSION	TokenNameIdentifier	 VERSION
+	TokenNamePLUS	
"xerces1"	TokenNameStringLiteral	xerces1
,	TokenNameCOMMA	
CLASS_NOTPRESENT	TokenNameIdentifier	 CLASS  NOTPRESENT
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Look for xerces1 and xerces2 parsers separately 	TokenNameCOMMENT_LINE	Look for xerces1 and xerces2 parsers separately 
try	TokenNametry	
{	TokenNameLBRACE	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
XERCES2_VERSION_CLASS	TokenNameIdentifier	 XERCE S2  VERSION  CLASS
=	TokenNameEQUAL	
"org.apache.xerces.impl.Version"	TokenNameStringLiteral	org.apache.xerces.impl.Version
;	TokenNameSEMICOLON	
Class	TokenNameIdentifier	 Class
clazz	TokenNameIdentifier	 clazz
=	TokenNameEQUAL	
ObjectFactory	TokenNameIdentifier	 Object Factory
.	TokenNameDOT	
findProviderClass	TokenNameIdentifier	 find Provider Class
(	TokenNameLPAREN	
XERCES2_VERSION_CLASS	TokenNameIdentifier	 XERCE S2  VERSION  CLASS
,	TokenNameCOMMA	
ObjectFactory	TokenNameIdentifier	 Object Factory
.	TokenNameDOT	
findClassLoader	TokenNameIdentifier	 find Class Loader
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Found Xerces-J 2.x, grab it's version fields 	TokenNameCOMMENT_LINE	Found Xerces-J 2.x, grab it's version fields 
Field	TokenNameIdentifier	 Field
f	TokenNameIdentifier	 f
=	TokenNameEQUAL	
clazz	TokenNameIdentifier	 clazz
.	TokenNameDOT	
getField	TokenNameIdentifier	 get Field
(	TokenNameLPAREN	
"fVersion"	TokenNameStringLiteral	fVersion
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
parserVersion	TokenNameIdentifier	 parser Version
=	TokenNameEQUAL	
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
)	TokenNameRPAREN	
f	TokenNameIdentifier	 f
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
h	TokenNameIdentifier	 h
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
VERSION	TokenNameIdentifier	 VERSION
+	TokenNamePLUS	
"xerces2"	TokenNameStringLiteral	xerces2
,	TokenNameCOMMA	
parserVersion	TokenNameIdentifier	 parser Version
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
Exception	TokenNameIdentifier	 Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
h	TokenNameIdentifier	 h
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
VERSION	TokenNameIdentifier	 VERSION
+	TokenNamePLUS	
"xerces2"	TokenNameStringLiteral	xerces2
,	TokenNameCOMMA	
CLASS_NOTPRESENT	TokenNameIdentifier	 CLASS  NOTPRESENT
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
CRIMSON_CLASS	TokenNameIdentifier	 CRIMSON  CLASS
=	TokenNameEQUAL	
"org.apache.crimson.parser.Parser2"	TokenNameStringLiteral	org.apache.crimson.parser.Parser2
;	TokenNameSEMICOLON	
Class	TokenNameIdentifier	 Class
clazz	TokenNameIdentifier	 clazz
=	TokenNameEQUAL	
ObjectFactory	TokenNameIdentifier	 Object Factory
.	TokenNameDOT	
findProviderClass	TokenNameIdentifier	 find Provider Class
(	TokenNameLPAREN	
CRIMSON_CLASS	TokenNameIdentifier	 CRIMSON  CLASS
,	TokenNameCOMMA	
ObjectFactory	TokenNameIdentifier	 Object Factory
.	TokenNameDOT	
findClassLoader	TokenNameIdentifier	 find Class Loader
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//@todo determine specific crimson version 	TokenNameCOMMENT_LINE	@todo determine specific crimson version 
h	TokenNameIdentifier	 h
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
VERSION	TokenNameIdentifier	 VERSION
+	TokenNamePLUS	
"crimson"	TokenNameStringLiteral	crimson
,	TokenNameCOMMA	
CLASS_PRESENT	TokenNameIdentifier	 CLASS  PRESENT
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
Exception	TokenNameIdentifier	 Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
h	TokenNameIdentifier	 h
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
VERSION	TokenNameIdentifier	 VERSION
+	TokenNamePLUS	
"crimson"	TokenNameStringLiteral	crimson
,	TokenNameCOMMA	
CLASS_NOTPRESENT	TokenNameIdentifier	 CLASS  NOTPRESENT
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Report product version information from Ant. * * @param h Hashtable to put information in */	TokenNameCOMMENT_JAVADOC	 Report product version information from Ant. * @param h Hashtable to put information in 
protected	TokenNameprotected	
void	TokenNamevoid	
checkAntVersion	TokenNameIdentifier	 check Ant Version
(	TokenNameLPAREN	
Hashtable	TokenNameIdentifier	 Hashtable
h	TokenNameIdentifier	 h
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
==	TokenNameEQUAL_EQUAL	
h	TokenNameIdentifier	 h
)	TokenNameRPAREN	
h	TokenNameIdentifier	 h
=	TokenNameEQUAL	
new	TokenNamenew	
Hashtable	TokenNameIdentifier	 Hashtable
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ANT_VERSION_CLASS	TokenNameIdentifier	 ANT  VERSION  CLASS
=	TokenNameEQUAL	
"org.apache.tools.ant.Main"	TokenNameStringLiteral	org.apache.tools.ant.Main
;	TokenNameSEMICOLON	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ANT_VERSION_METHOD	TokenNameIdentifier	 ANT  VERSION  METHOD
=	TokenNameEQUAL	
"getAntVersion"	TokenNameStringLiteral	getAntVersion
;	TokenNameSEMICOLON	
// noArgs 	TokenNameCOMMENT_LINE	noArgs 
final	TokenNamefinal	
Class	TokenNameIdentifier	 Class
noArgs	TokenNameIdentifier	 no Args
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
new	TokenNamenew	
Class	TokenNameIdentifier	 Class
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
Class	TokenNameIdentifier	 Class
clazz	TokenNameIdentifier	 clazz
=	TokenNameEQUAL	
ObjectFactory	TokenNameIdentifier	 Object Factory
.	TokenNameDOT	
findProviderClass	TokenNameIdentifier	 find Provider Class
(	TokenNameLPAREN	
ANT_VERSION_CLASS	TokenNameIdentifier	 ANT  VERSION  CLASS
,	TokenNameCOMMA	
ObjectFactory	TokenNameIdentifier	 Object Factory
.	TokenNameDOT	
findClassLoader	TokenNameIdentifier	 find Class Loader
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Method	TokenNameIdentifier	 Method
method	TokenNameIdentifier	 method
=	TokenNameEQUAL	
clazz	TokenNameIdentifier	 clazz
.	TokenNameDOT	
getMethod	TokenNameIdentifier	 get Method
(	TokenNameLPAREN	
ANT_VERSION_METHOD	TokenNameIdentifier	 ANT  VERSION  METHOD
,	TokenNameCOMMA	
noArgs	TokenNameIdentifier	 no Args
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Object	TokenNameIdentifier	 Object
returnValue	TokenNameIdentifier	 return Value
=	TokenNameEQUAL	
method	TokenNameIdentifier	 method
.	TokenNameDOT	
invoke	TokenNameIdentifier	 invoke
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
new	TokenNamenew	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
h	TokenNameIdentifier	 h
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
VERSION	TokenNameIdentifier	 VERSION
+	TokenNamePLUS	
"ant"	TokenNameStringLiteral	ant
,	TokenNameCOMMA	
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
)	TokenNameRPAREN	
returnValue	TokenNameIdentifier	 return Value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
Exception	TokenNameIdentifier	 Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
h	TokenNameIdentifier	 h
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
VERSION	TokenNameIdentifier	 VERSION
+	TokenNamePLUS	
"ant"	TokenNameStringLiteral	ant
,	TokenNameCOMMA	
CLASS_NOTPRESENT	TokenNameIdentifier	 CLASS  NOTPRESENT
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Report version info from DOM interfaces. * * Currently distinguishes between pre-DOM level 2, the DOM * level 2 working draft, the DOM level 2 final draft, * and not found. * * @param h Hashtable to put information in */	TokenNameCOMMENT_JAVADOC	 Report version info from DOM interfaces. * Currently distinguishes between pre-DOM level 2, the DOM level 2 working draft, the DOM level 2 final draft, and not found. * @param h Hashtable to put information in 
protected	TokenNameprotected	
void	TokenNamevoid	
checkDOMVersion	TokenNameIdentifier	 check DOM Version
(	TokenNameLPAREN	
Hashtable	TokenNameIdentifier	 Hashtable
h	TokenNameIdentifier	 h
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
==	TokenNameEQUAL_EQUAL	
h	TokenNameIdentifier	 h
)	TokenNameRPAREN	
h	TokenNameIdentifier	 h
=	TokenNameEQUAL	
new	TokenNamenew	
Hashtable	TokenNameIdentifier	 Hashtable
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
DOM_LEVEL2_CLASS	TokenNameIdentifier	 DOM  LEVE L2  CLASS
=	TokenNameEQUAL	
"org.w3c.dom.Document"	TokenNameStringLiteral	org.w3c.dom.Document
;	TokenNameSEMICOLON	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
DOM_LEVEL2_METHOD	TokenNameIdentifier	 DOM  LEVE L2  METHOD
=	TokenNameEQUAL	
"createElementNS"	TokenNameStringLiteral	createElementNS
;	TokenNameSEMICOLON	
// String, String 	TokenNameCOMMENT_LINE	String, String 
final	TokenNamefinal	
String	TokenNameIdentifier	 String
DOM_LEVEL2WD_CLASS	TokenNameIdentifier	 DOM  LEVE L2 WD  CLASS
=	TokenNameEQUAL	
"org.w3c.dom.Node"	TokenNameStringLiteral	org.w3c.dom.Node
;	TokenNameSEMICOLON	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
DOM_LEVEL2WD_METHOD	TokenNameIdentifier	 DOM  LEVE L2 WD  METHOD
=	TokenNameEQUAL	
"supported"	TokenNameStringLiteral	supported
;	TokenNameSEMICOLON	
// String, String 	TokenNameCOMMENT_LINE	String, String 
final	TokenNamefinal	
String	TokenNameIdentifier	 String
DOM_LEVEL2FD_CLASS	TokenNameIdentifier	 DOM  LEVE L2 FD  CLASS
=	TokenNameEQUAL	
"org.w3c.dom.Node"	TokenNameStringLiteral	org.w3c.dom.Node
;	TokenNameSEMICOLON	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
DOM_LEVEL2FD_METHOD	TokenNameIdentifier	 DOM  LEVE L2 FD  METHOD
=	TokenNameEQUAL	
"isSupported"	TokenNameStringLiteral	isSupported
;	TokenNameSEMICOLON	
// String, String 	TokenNameCOMMENT_LINE	String, String 
final	TokenNamefinal	
Class	TokenNameIdentifier	 Class
twoStringArgs	TokenNameIdentifier	 two String Args
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
{	TokenNameLBRACE	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
lang	TokenNameIdentifier	 lang
.	TokenNameDOT	
String	TokenNameIdentifier	 String
.	TokenNameDOT	
class	TokenNameclass	
,	TokenNameCOMMA	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
lang	TokenNameIdentifier	 lang
.	TokenNameDOT	
String	TokenNameIdentifier	 String
.	TokenNameDOT	
class	TokenNameclass	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
Class	TokenNameIdentifier	 Class
clazz	TokenNameIdentifier	 clazz
=	TokenNameEQUAL	
ObjectFactory	TokenNameIdentifier	 Object Factory
.	TokenNameDOT	
findProviderClass	TokenNameIdentifier	 find Provider Class
(	TokenNameLPAREN	
DOM_LEVEL2_CLASS	TokenNameIdentifier	 DOM  LEVE L2  CLASS
,	TokenNameCOMMA	
ObjectFactory	TokenNameIdentifier	 Object Factory
.	TokenNameDOT	
findClassLoader	TokenNameIdentifier	 find Class Loader
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Method	TokenNameIdentifier	 Method
method	TokenNameIdentifier	 method
=	TokenNameEQUAL	
clazz	TokenNameIdentifier	 clazz
.	TokenNameDOT	
getMethod	TokenNameIdentifier	 get Method
(	TokenNameLPAREN	
DOM_LEVEL2_METHOD	TokenNameIdentifier	 DOM  LEVE L2  METHOD
,	TokenNameCOMMA	
twoStringArgs	TokenNameIdentifier	 two String Args
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// If we succeeded, we have loaded interfaces from a 	TokenNameCOMMENT_LINE	If we succeeded, we have loaded interfaces from a 
// level 2 DOM somewhere 	TokenNameCOMMENT_LINE	level 2 DOM somewhere 
h	TokenNameIdentifier	 h
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
VERSION	TokenNameIdentifier	 VERSION
+	TokenNamePLUS	
"DOM"	TokenNameStringLiteral	DOM
,	TokenNameCOMMA	
"2.0"	TokenNameStringLiteral	2.0
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
// Check for the working draft version, which is 	TokenNameCOMMENT_LINE	Check for the working draft version, which is 
// commonly found, but won't work anymore 	TokenNameCOMMENT_LINE	commonly found, but won't work anymore 
clazz	TokenNameIdentifier	 clazz
=	TokenNameEQUAL	
ObjectFactory	TokenNameIdentifier	 Object Factory
.	TokenNameDOT	
findProviderClass	TokenNameIdentifier	 find Provider Class
(	TokenNameLPAREN	
DOM_LEVEL2WD_CLASS	TokenNameIdentifier	 DOM  LEVE L2 WD  CLASS
,	TokenNameCOMMA	
ObjectFactory	TokenNameIdentifier	 Object Factory
.	TokenNameDOT	
findClassLoader	TokenNameIdentifier	 find Class Loader
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
method	TokenNameIdentifier	 method
=	TokenNameEQUAL	
clazz	TokenNameIdentifier	 clazz
.	TokenNameDOT	
getMethod	TokenNameIdentifier	 get Method
(	TokenNameLPAREN	
DOM_LEVEL2WD_METHOD	TokenNameIdentifier	 DOM  LEVE L2 WD  METHOD
,	TokenNameCOMMA	
twoStringArgs	TokenNameIdentifier	 two String Args
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
h	TokenNameIdentifier	 h
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
ERROR	TokenNameIdentifier	 ERROR
+	TokenNamePLUS	
VERSION	TokenNameIdentifier	 VERSION
+	TokenNamePLUS	
"DOM.draftlevel"	TokenNameStringLiteral	DOM.draftlevel
,	TokenNameCOMMA	
"2.0wd"	TokenNameStringLiteral	2.0wd
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
h	TokenNameIdentifier	 h
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
ERROR	TokenNameIdentifier	 ERROR
,	TokenNameCOMMA	
ERROR_FOUND	TokenNameIdentifier	 ERROR  FOUND
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
Exception	TokenNameIdentifier	 Exception
e2	TokenNameIdentifier	 e2
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
// Check for the final draft version as well 	TokenNameCOMMENT_LINE	Check for the final draft version as well 
clazz	TokenNameIdentifier	 clazz
=	TokenNameEQUAL	
ObjectFactory	TokenNameIdentifier	 Object Factory
.	TokenNameDOT	
findProviderClass	TokenNameIdentifier	 find Provider Class
(	TokenNameLPAREN	
DOM_LEVEL2FD_CLASS	TokenNameIdentifier	 DOM  LEVE L2 FD  CLASS
,	TokenNameCOMMA	
ObjectFactory	TokenNameIdentifier	 Object Factory
.	TokenNameDOT	
findClassLoader	TokenNameIdentifier	 find Class Loader
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
method	TokenNameIdentifier	 method
=	TokenNameEQUAL	
clazz	TokenNameIdentifier	 clazz
.	TokenNameDOT	
getMethod	TokenNameIdentifier	 get Method
(	TokenNameLPAREN	
DOM_LEVEL2FD_METHOD	TokenNameIdentifier	 DOM  LEVE L2 FD  METHOD
,	TokenNameCOMMA	
twoStringArgs	TokenNameIdentifier	 two String Args
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
h	TokenNameIdentifier	 h
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
VERSION	TokenNameIdentifier	 VERSION
+	TokenNamePLUS	
"DOM.draftlevel"	TokenNameStringLiteral	DOM.draftlevel
,	TokenNameCOMMA	
"2.0fd"	TokenNameStringLiteral	2.0fd
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
Exception	TokenNameIdentifier	 Exception
e3	TokenNameIdentifier	 e3
)	TokenNameRPAREN	
{	TokenNameLBRACE	
h	TokenNameIdentifier	 h
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
ERROR	TokenNameIdentifier	 ERROR
+	TokenNamePLUS	
VERSION	TokenNameIdentifier	 VERSION
+	TokenNamePLUS	
"DOM.draftlevel"	TokenNameStringLiteral	DOM.draftlevel
,	TokenNameCOMMA	
"2.0unknown"	TokenNameStringLiteral	2.0unknown
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
h	TokenNameIdentifier	 h
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
ERROR	TokenNameIdentifier	 ERROR
,	TokenNameCOMMA	
ERROR_FOUND	TokenNameIdentifier	 ERROR  FOUND
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
Exception	TokenNameIdentifier	 Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
h	TokenNameIdentifier	 h
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
ERROR	TokenNameIdentifier	 ERROR
+	TokenNamePLUS	
VERSION	TokenNameIdentifier	 VERSION
+	TokenNamePLUS	
"DOM"	TokenNameStringLiteral	DOM
,	TokenNameCOMMA	
"ERROR attempting to load DOM level 2 class: "	TokenNameStringLiteral	ERROR attempting to load DOM level 2 class: 
+	TokenNamePLUS	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
h	TokenNameIdentifier	 h
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
ERROR	TokenNameIdentifier	 ERROR
,	TokenNameCOMMA	
ERROR_FOUND	TokenNameIdentifier	 ERROR  FOUND
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
//@todo load an actual DOM implmementation and query it as well 	TokenNameCOMMENT_LINE	@todo load an actual DOM implmementation and query it as well 
//@todo load an actual DOM implmementation and check if 	TokenNameCOMMENT_LINE	@todo load an actual DOM implmementation and check if 
// isNamespaceAware() == true, which is needed to parse 	TokenNameCOMMENT_LINE	isNamespaceAware() == true, which is needed to parse 
// xsl stylesheet files into a DOM 	TokenNameCOMMENT_LINE	xsl stylesheet files into a DOM 
}	TokenNameRBRACE	
/** * Report version info from SAX interfaces. * * Currently distinguishes between SAX 2, SAX 2.0beta2, * SAX1, and not found. * * @param h Hashtable to put information in */	TokenNameCOMMENT_JAVADOC	 Report version info from SAX interfaces. * Currently distinguishes between SAX 2, SAX 2.0beta2, SAX1, and not found. * @param h Hashtable to put information in 
protected	TokenNameprotected	
void	TokenNamevoid	
checkSAXVersion	TokenNameIdentifier	 check SAX Version
(	TokenNameLPAREN	
Hashtable	TokenNameIdentifier	 Hashtable
h	TokenNameIdentifier	 h
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
==	TokenNameEQUAL_EQUAL	
h	TokenNameIdentifier	 h
)	TokenNameRPAREN	
h	TokenNameIdentifier	 h
=	TokenNameEQUAL	
new	TokenNamenew	
Hashtable	TokenNameIdentifier	 Hashtable
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
SAX_VERSION1_CLASS	TokenNameIdentifier	 SAX  VERSIO N1  CLASS
=	TokenNameEQUAL	
"org.xml.sax.Parser"	TokenNameStringLiteral	org.xml.sax.Parser
;	TokenNameSEMICOLON	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
SAX_VERSION1_METHOD	TokenNameIdentifier	 SAX  VERSIO N1  METHOD
=	TokenNameEQUAL	
"parse"	TokenNameStringLiteral	parse
;	TokenNameSEMICOLON	
// String 	TokenNameCOMMENT_LINE	String 
final	TokenNamefinal	
String	TokenNameIdentifier	 String
SAX_VERSION2_CLASS	TokenNameIdentifier	 SAX  VERSIO N2  CLASS
=	TokenNameEQUAL	
"org.xml.sax.XMLReader"	TokenNameStringLiteral	org.xml.sax.XMLReader
;	TokenNameSEMICOLON	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
SAX_VERSION2_METHOD	TokenNameIdentifier	 SAX  VERSIO N2  METHOD
=	TokenNameEQUAL	
"parse"	TokenNameStringLiteral	parse
;	TokenNameSEMICOLON	
// String 	TokenNameCOMMENT_LINE	String 
final	TokenNamefinal	
String	TokenNameIdentifier	 String
SAX_VERSION2BETA_CLASSNF	TokenNameIdentifier	 SAX  VERSIO N2 BETA  CLASSNF
=	TokenNameEQUAL	
"org.xml.sax.helpers.AttributesImpl"	TokenNameStringLiteral	org.xml.sax.helpers.AttributesImpl
;	TokenNameSEMICOLON	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
SAX_VERSION2BETA_METHODNF	TokenNameIdentifier	 SAX  VERSIO N2 BETA  METHODNF
=	TokenNameEQUAL	
"setAttributes"	TokenNameStringLiteral	setAttributes
;	TokenNameSEMICOLON	
// Attributes 	TokenNameCOMMENT_LINE	Attributes 
final	TokenNamefinal	
Class	TokenNameIdentifier	 Class
oneStringArg	TokenNameIdentifier	 one String Arg
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
{	TokenNameLBRACE	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
lang	TokenNameIdentifier	 lang
.	TokenNameDOT	
String	TokenNameIdentifier	 String
.	TokenNameDOT	
class	TokenNameclass	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
// Note this introduces a minor compile dependency on SAX... 	TokenNameCOMMENT_LINE	Note this introduces a minor compile dependency on SAX... 
final	TokenNamefinal	
Class	TokenNameIdentifier	 Class
attributesArg	TokenNameIdentifier	 attributes Arg
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
{	TokenNameLBRACE	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
sax	TokenNameIdentifier	 sax
.	TokenNameDOT	
Attributes	TokenNameIdentifier	 Attributes
.	TokenNameDOT	
class	TokenNameclass	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
// This method was only added in the final SAX 2.0 release; 	TokenNameCOMMENT_LINE	This method was only added in the final SAX 2.0 release; 
// see changes.html "Changes from SAX 2.0beta2 to SAX 2.0prerelease" 	TokenNameCOMMENT_LINE	see changes.html "Changes from SAX 2.0beta2 to SAX 2.0prerelease" 
Class	TokenNameIdentifier	 Class
clazz	TokenNameIdentifier	 clazz
=	TokenNameEQUAL	
ObjectFactory	TokenNameIdentifier	 Object Factory
.	TokenNameDOT	
findProviderClass	TokenNameIdentifier	 find Provider Class
(	TokenNameLPAREN	
SAX_VERSION2BETA_CLASSNF	TokenNameIdentifier	 SAX  VERSIO N2 BETA  CLASSNF
,	TokenNameCOMMA	
ObjectFactory	TokenNameIdentifier	 Object Factory
.	TokenNameDOT	
findClassLoader	TokenNameIdentifier	 find Class Loader
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Method	TokenNameIdentifier	 Method
method	TokenNameIdentifier	 method
=	TokenNameEQUAL	
clazz	TokenNameIdentifier	 clazz
.	TokenNameDOT	
getMethod	TokenNameIdentifier	 get Method
(	TokenNameLPAREN	
SAX_VERSION2BETA_METHODNF	TokenNameIdentifier	 SAX  VERSIO N2 BETA  METHODNF
,	TokenNameCOMMA	
attributesArg	TokenNameIdentifier	 attributes Arg
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// If we succeeded, we have loaded interfaces from a 	TokenNameCOMMENT_LINE	If we succeeded, we have loaded interfaces from a 
// real, final SAX version 2.0 somewhere 	TokenNameCOMMENT_LINE	real, final SAX version 2.0 somewhere 
h	TokenNameIdentifier	 h
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
VERSION	TokenNameIdentifier	 VERSION
+	TokenNamePLUS	
"SAX"	TokenNameStringLiteral	SAX
,	TokenNameCOMMA	
"2.0"	TokenNameStringLiteral	2.0
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
Exception	TokenNameIdentifier	 Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// If we didn't find the SAX 2.0 class, look for a 2.0beta2 	TokenNameCOMMENT_LINE	If we didn't find the SAX 2.0 class, look for a 2.0beta2 
h	TokenNameIdentifier	 h
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
ERROR	TokenNameIdentifier	 ERROR
+	TokenNamePLUS	
VERSION	TokenNameIdentifier	 VERSION
+	TokenNamePLUS	
"SAX"	TokenNameStringLiteral	SAX
,	TokenNameCOMMA	
"ERROR attempting to load SAX version 2 class: "	TokenNameStringLiteral	ERROR attempting to load SAX version 2 class: 
+	TokenNamePLUS	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
h	TokenNameIdentifier	 h
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
ERROR	TokenNameIdentifier	 ERROR
,	TokenNameCOMMA	
ERROR_FOUND	TokenNameIdentifier	 ERROR  FOUND
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
Class	TokenNameIdentifier	 Class
clazz	TokenNameIdentifier	 clazz
=	TokenNameEQUAL	
ObjectFactory	TokenNameIdentifier	 Object Factory
.	TokenNameDOT	
findProviderClass	TokenNameIdentifier	 find Provider Class
(	TokenNameLPAREN	
SAX_VERSION2_CLASS	TokenNameIdentifier	 SAX  VERSIO N2  CLASS
,	TokenNameCOMMA	
ObjectFactory	TokenNameIdentifier	 Object Factory
.	TokenNameDOT	
findClassLoader	TokenNameIdentifier	 find Class Loader
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Method	TokenNameIdentifier	 Method
method	TokenNameIdentifier	 method
=	TokenNameEQUAL	
clazz	TokenNameIdentifier	 clazz
.	TokenNameDOT	
getMethod	TokenNameIdentifier	 get Method
(	TokenNameLPAREN	
SAX_VERSION2_METHOD	TokenNameIdentifier	 SAX  VERSIO N2  METHOD
,	TokenNameCOMMA	
oneStringArg	TokenNameIdentifier	 one String Arg
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// If we succeeded, we have loaded interfaces from a 	TokenNameCOMMENT_LINE	If we succeeded, we have loaded interfaces from a 
// SAX version 2.0beta2 or earlier; these might work but 	TokenNameCOMMENT_LINE	SAX version 2.0beta2 or earlier; these might work but 
// you should really have the final SAX 2.0 	TokenNameCOMMENT_LINE	you should really have the final SAX 2.0 
h	TokenNameIdentifier	 h
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
VERSION	TokenNameIdentifier	 VERSION
+	TokenNamePLUS	
"SAX-backlevel"	TokenNameStringLiteral	SAX-backlevel
,	TokenNameCOMMA	
"2.0beta2-or-earlier"	TokenNameStringLiteral	2.0beta2-or-earlier
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
Exception	TokenNameIdentifier	 Exception
e2	TokenNameIdentifier	 e2
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// If we didn't find the SAX 2.0beta2 class, look for a 1.0 one 	TokenNameCOMMENT_LINE	If we didn't find the SAX 2.0beta2 class, look for a 1.0 one 
h	TokenNameIdentifier	 h
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
ERROR	TokenNameIdentifier	 ERROR
+	TokenNamePLUS	
VERSION	TokenNameIdentifier	 VERSION
+	TokenNamePLUS	
"SAX"	TokenNameStringLiteral	SAX
,	TokenNameCOMMA	
"ERROR attempting to load SAX version 2 class: "	TokenNameStringLiteral	ERROR attempting to load SAX version 2 class: 
+	TokenNamePLUS	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
h	TokenNameIdentifier	 h
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
ERROR	TokenNameIdentifier	 ERROR
,	TokenNameCOMMA	
ERROR_FOUND	TokenNameIdentifier	 ERROR  FOUND
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
Class	TokenNameIdentifier	 Class
clazz	TokenNameIdentifier	 clazz
=	TokenNameEQUAL	
ObjectFactory	TokenNameIdentifier	 Object Factory
.	TokenNameDOT	
findProviderClass	TokenNameIdentifier	 find Provider Class
(	TokenNameLPAREN	
SAX_VERSION1_CLASS	TokenNameIdentifier	 SAX  VERSIO N1  CLASS
,	TokenNameCOMMA	
ObjectFactory	TokenNameIdentifier	 Object Factory
.	TokenNameDOT	
findClassLoader	TokenNameIdentifier	 find Class Loader
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Method	TokenNameIdentifier	 Method
method	TokenNameIdentifier	 method
=	TokenNameEQUAL	
clazz	TokenNameIdentifier	 clazz
.	TokenNameDOT	
getMethod	TokenNameIdentifier	 get Method
(	TokenNameLPAREN	
SAX_VERSION1_METHOD	TokenNameIdentifier	 SAX  VERSIO N1  METHOD
,	TokenNameCOMMA	
oneStringArg	TokenNameIdentifier	 one String Arg
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// If we succeeded, we have loaded interfaces from a 	TokenNameCOMMENT_LINE	If we succeeded, we have loaded interfaces from a 
// SAX version 1.0 somewhere; which won't work very 	TokenNameCOMMENT_LINE	SAX version 1.0 somewhere; which won't work very 
// well for JAXP 1.1 or beyond! 	TokenNameCOMMENT_LINE	well for JAXP 1.1 or beyond! 
h	TokenNameIdentifier	 h
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
VERSION	TokenNameIdentifier	 VERSION
+	TokenNamePLUS	
"SAX-backlevel"	TokenNameStringLiteral	SAX-backlevel
,	TokenNameCOMMA	
"1.0"	TokenNameStringLiteral	1.0
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
Exception	TokenNameIdentifier	 Exception
e3	TokenNameIdentifier	 e3
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// If we didn't find the SAX 2.0 class, look for a 1.0 one 	TokenNameCOMMENT_LINE	If we didn't find the SAX 2.0 class, look for a 1.0 one 
// Note that either 1.0 or no SAX are both errors 	TokenNameCOMMENT_LINE	Note that either 1.0 or no SAX are both errors 
h	TokenNameIdentifier	 h
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
ERROR	TokenNameIdentifier	 ERROR
+	TokenNamePLUS	
VERSION	TokenNameIdentifier	 VERSION
+	TokenNamePLUS	
"SAX-backlevel"	TokenNameStringLiteral	SAX-backlevel
,	TokenNameCOMMA	
"ERROR attempting to load SAX version 1 class: "	TokenNameStringLiteral	ERROR attempting to load SAX version 1 class: 
+	TokenNamePLUS	
e3	TokenNameIdentifier	 e3
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Manual table of known .jar sizes. * Only includes shipped versions of certain projects. * key=jarsize, value=jarname ' from ' distro name * Note assumption: two jars cannot have the same size! * * @see #getApparentVersion(String, long) */	TokenNameCOMMENT_JAVADOC	 Manual table of known .jar sizes. Only includes shipped versions of certain projects. key=jarsize, value=jarname ' from ' distro name Note assumption: two jars cannot have the same size! * @see #getApparentVersion(String, long) 
private	TokenNameprivate	
static	TokenNamestatic	
Hashtable	TokenNameIdentifier	 Hashtable
jarVersions	TokenNameIdentifier	 jar Versions
=	TokenNameEQUAL	
new	TokenNamenew	
Hashtable	TokenNameIdentifier	 Hashtable
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Static initializer for jarVersions table. * Doing this just once saves time and space. * * @see #getApparentVersion(String, long) */	TokenNameCOMMENT_JAVADOC	 Static initializer for jarVersions table. Doing this just once saves time and space. * @see #getApparentVersion(String, long) 
static	TokenNamestatic	
{	TokenNameLBRACE	
// Note: hackish Hashtable, this could use improvement 	TokenNameCOMMENT_LINE	Note: hackish Hashtable, this could use improvement 
jarVersions	TokenNameIdentifier	 jar Versions
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
new	TokenNamenew	
Long	TokenNameIdentifier	 Long
(	TokenNameLPAREN	
857192	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
"xalan.jar from xalan-j_1_1"	TokenNameStringLiteral	xalan.jar from xalan-j_1_1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
jarVersions	TokenNameIdentifier	 jar Versions
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
new	TokenNamenew	
Long	TokenNameIdentifier	 Long
(	TokenNameLPAREN	
440237	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
"xalan.jar from xalan-j_1_2"	TokenNameStringLiteral	xalan.jar from xalan-j_1_2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
jarVersions	TokenNameIdentifier	 jar Versions
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
new	TokenNamenew	
Long	TokenNameIdentifier	 Long
(	TokenNameLPAREN	
436094	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
"xalan.jar from xalan-j_1_2_1"	TokenNameStringLiteral	xalan.jar from xalan-j_1_2_1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
jarVersions	TokenNameIdentifier	 jar Versions
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
new	TokenNamenew	
Long	TokenNameIdentifier	 Long
(	TokenNameLPAREN	
426249	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
"xalan.jar from xalan-j_1_2_2"	TokenNameStringLiteral	xalan.jar from xalan-j_1_2_2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
jarVersions	TokenNameIdentifier	 jar Versions
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
new	TokenNamenew	
Long	TokenNameIdentifier	 Long
(	TokenNameLPAREN	
702536	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
"xalan.jar from xalan-j_2_0_0"	TokenNameStringLiteral	xalan.jar from xalan-j_2_0_0
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
jarVersions	TokenNameIdentifier	 jar Versions
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
new	TokenNamenew	
Long	TokenNameIdentifier	 Long
(	TokenNameLPAREN	
720930	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
"xalan.jar from xalan-j_2_0_1"	TokenNameStringLiteral	xalan.jar from xalan-j_2_0_1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
jarVersions	TokenNameIdentifier	 jar Versions
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
new	TokenNamenew	
Long	TokenNameIdentifier	 Long
(	TokenNameLPAREN	
732330	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
"xalan.jar from xalan-j_2_1_0"	TokenNameStringLiteral	xalan.jar from xalan-j_2_1_0
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
jarVersions	TokenNameIdentifier	 jar Versions
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
new	TokenNamenew	
Long	TokenNameIdentifier	 Long
(	TokenNameLPAREN	
872241	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
"xalan.jar from xalan-j_2_2_D10"	TokenNameStringLiteral	xalan.jar from xalan-j_2_2_D10
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
jarVersions	TokenNameIdentifier	 jar Versions
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
new	TokenNamenew	
Long	TokenNameIdentifier	 Long
(	TokenNameLPAREN	
882739	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
"xalan.jar from xalan-j_2_2_D11"	TokenNameStringLiteral	xalan.jar from xalan-j_2_2_D11
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
jarVersions	TokenNameIdentifier	 jar Versions
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
new	TokenNamenew	
Long	TokenNameIdentifier	 Long
(	TokenNameLPAREN	
923866	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
"xalan.jar from xalan-j_2_2_0"	TokenNameStringLiteral	xalan.jar from xalan-j_2_2_0
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
jarVersions	TokenNameIdentifier	 jar Versions
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
new	TokenNamenew	
Long	TokenNameIdentifier	 Long
(	TokenNameLPAREN	
905872	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
"xalan.jar from xalan-j_2_3_D1"	TokenNameStringLiteral	xalan.jar from xalan-j_2_3_D1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
jarVersions	TokenNameIdentifier	 jar Versions
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
new	TokenNamenew	
Long	TokenNameIdentifier	 Long
(	TokenNameLPAREN	
906122	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
"xalan.jar from xalan-j_2_3_0"	TokenNameStringLiteral	xalan.jar from xalan-j_2_3_0
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
jarVersions	TokenNameIdentifier	 jar Versions
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
new	TokenNamenew	
Long	TokenNameIdentifier	 Long
(	TokenNameLPAREN	
906248	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
"xalan.jar from xalan-j_2_3_1"	TokenNameStringLiteral	xalan.jar from xalan-j_2_3_1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
jarVersions	TokenNameIdentifier	 jar Versions
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
new	TokenNamenew	
Long	TokenNameIdentifier	 Long
(	TokenNameLPAREN	
983377	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
"xalan.jar from xalan-j_2_4_D1"	TokenNameStringLiteral	xalan.jar from xalan-j_2_4_D1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
jarVersions	TokenNameIdentifier	 jar Versions
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
new	TokenNamenew	
Long	TokenNameIdentifier	 Long
(	TokenNameLPAREN	
997276	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
"xalan.jar from xalan-j_2_4_0"	TokenNameStringLiteral	xalan.jar from xalan-j_2_4_0
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
jarVersions	TokenNameIdentifier	 jar Versions
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
new	TokenNamenew	
Long	TokenNameIdentifier	 Long
(	TokenNameLPAREN	
1031036	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
"xalan.jar from xalan-j_2_4_1"	TokenNameStringLiteral	xalan.jar from xalan-j_2_4_1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Stop recording xalan.jar sizes as of Xalan Java 2.5.0 	TokenNameCOMMENT_LINE	Stop recording xalan.jar sizes as of Xalan Java 2.5.0 
jarVersions	TokenNameIdentifier	 jar Versions
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
new	TokenNamenew	
Long	TokenNameIdentifier	 Long
(	TokenNameLPAREN	
596540	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
"xsltc.jar from xalan-j_2_2_0"	TokenNameStringLiteral	xsltc.jar from xalan-j_2_2_0
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
jarVersions	TokenNameIdentifier	 jar Versions
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
new	TokenNamenew	
Long	TokenNameIdentifier	 Long
(	TokenNameLPAREN	
590247	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
"xsltc.jar from xalan-j_2_3_D1"	TokenNameStringLiteral	xsltc.jar from xalan-j_2_3_D1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
jarVersions	TokenNameIdentifier	 jar Versions
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
new	TokenNamenew	
Long	TokenNameIdentifier	 Long
(	TokenNameLPAREN	
589914	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
"xsltc.jar from xalan-j_2_3_0"	TokenNameStringLiteral	xsltc.jar from xalan-j_2_3_0
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
jarVersions	TokenNameIdentifier	 jar Versions
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
new	TokenNamenew	
Long	TokenNameIdentifier	 Long
(	TokenNameLPAREN	
589915	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
"xsltc.jar from xalan-j_2_3_1"	TokenNameStringLiteral	xsltc.jar from xalan-j_2_3_1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
jarVersions	TokenNameIdentifier	 jar Versions
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
new	TokenNamenew	
Long	TokenNameIdentifier	 Long
(	TokenNameLPAREN	
1306667	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
"xsltc.jar from xalan-j_2_4_D1"	TokenNameStringLiteral	xsltc.jar from xalan-j_2_4_D1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
jarVersions	TokenNameIdentifier	 jar Versions
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
new	TokenNamenew	
Long	TokenNameIdentifier	 Long
(	TokenNameLPAREN	
1328227	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
"xsltc.jar from xalan-j_2_4_0"	TokenNameStringLiteral	xsltc.jar from xalan-j_2_4_0
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
jarVersions	TokenNameIdentifier	 jar Versions
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
new	TokenNamenew	
Long	TokenNameIdentifier	 Long
(	TokenNameLPAREN	
1344009	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
"xsltc.jar from xalan-j_2_4_1"	TokenNameStringLiteral	xsltc.jar from xalan-j_2_4_1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
jarVersions	TokenNameIdentifier	 jar Versions
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
new	TokenNamenew	
Long	TokenNameIdentifier	 Long
(	TokenNameLPAREN	
1348361	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
"xsltc.jar from xalan-j_2_5_D1"	TokenNameStringLiteral	xsltc.jar from xalan-j_2_5_D1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Stop recording xsltc.jar sizes as of Xalan Java 2.5.0 	TokenNameCOMMENT_LINE	Stop recording xsltc.jar sizes as of Xalan Java 2.5.0 
jarVersions	TokenNameIdentifier	 jar Versions
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
new	TokenNamenew	
Long	TokenNameIdentifier	 Long
(	TokenNameLPAREN	
1268634	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
"xsltc.jar-bundled from xalan-j_2_3_0"	TokenNameStringLiteral	xsltc.jar-bundled from xalan-j_2_3_0
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
jarVersions	TokenNameIdentifier	 jar Versions
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
new	TokenNamenew	
Long	TokenNameIdentifier	 Long
(	TokenNameLPAREN	
100196	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
"xml-apis.jar from xalan-j_2_2_0 or xalan-j_2_3_D1"	TokenNameStringLiteral	xml-apis.jar from xalan-j_2_2_0 or xalan-j_2_3_D1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
jarVersions	TokenNameIdentifier	 jar Versions
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
new	TokenNamenew	
Long	TokenNameIdentifier	 Long
(	TokenNameLPAREN	
108484	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
"xml-apis.jar from xalan-j_2_3_0, or xalan-j_2_3_1 from xml-commons-1.0.b2"	TokenNameStringLiteral	xml-apis.jar from xalan-j_2_3_0, or xalan-j_2_3_1 from xml-commons-1.0.b2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
jarVersions	TokenNameIdentifier	 jar Versions
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
new	TokenNamenew	
Long	TokenNameIdentifier	 Long
(	TokenNameLPAREN	
109049	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
"xml-apis.jar from xalan-j_2_4_0 from xml-commons RIVERCOURT1 branch"	TokenNameStringLiteral	xml-apis.jar from xalan-j_2_4_0 from xml-commons RIVERCOURT1 branch
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
jarVersions	TokenNameIdentifier	 jar Versions
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
new	TokenNamenew	
Long	TokenNameIdentifier	 Long
(	TokenNameLPAREN	
113749	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
"xml-apis.jar from xalan-j_2_4_1 from factoryfinder-build of xml-commons RIVERCOURT1"	TokenNameStringLiteral	xml-apis.jar from xalan-j_2_4_1 from factoryfinder-build of xml-commons RIVERCOURT1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
jarVersions	TokenNameIdentifier	 jar Versions
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
new	TokenNamenew	
Long	TokenNameIdentifier	 Long
(	TokenNameLPAREN	
124704	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
"xml-apis.jar from tck-jaxp-1_2_0 branch of xml-commons"	TokenNameStringLiteral	xml-apis.jar from tck-jaxp-1_2_0 branch of xml-commons
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
jarVersions	TokenNameIdentifier	 jar Versions
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
new	TokenNamenew	
Long	TokenNameIdentifier	 Long
(	TokenNameLPAREN	
124724	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
"xml-apis.jar from tck-jaxp-1_2_0 branch of xml-commons, tag: xml-commons-external_1_2_01"	TokenNameStringLiteral	xml-apis.jar from tck-jaxp-1_2_0 branch of xml-commons, tag: xml-commons-external_1_2_01
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
jarVersions	TokenNameIdentifier	 jar Versions
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
new	TokenNamenew	
Long	TokenNameIdentifier	 Long
(	TokenNameLPAREN	
194205	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
"xml-apis.jar from head branch of xml-commons, tag: xml-commons-external_1_3_02"	TokenNameStringLiteral	xml-apis.jar from head branch of xml-commons, tag: xml-commons-external_1_3_02
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// If the below were more common I would update it to report 	TokenNameCOMMENT_LINE	If the below were more common I would update it to report 
// errors better; but this is so old hardly anyone has it 	TokenNameCOMMENT_LINE	errors better; but this is so old hardly anyone has it 
jarVersions	TokenNameIdentifier	 jar Versions
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
new	TokenNamenew	
Long	TokenNameIdentifier	 Long
(	TokenNameLPAREN	
424490	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
"xalan.jar from Xerces Tools releases - ERROR:DO NOT USE!"	TokenNameStringLiteral	xalan.jar from Xerces Tools releases - ERROR:DO NOT USE!
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
jarVersions	TokenNameIdentifier	 jar Versions
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
new	TokenNamenew	
Long	TokenNameIdentifier	 Long
(	TokenNameLPAREN	
1591855	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
"xerces.jar from xalan-j_1_1 from xerces-1..."	TokenNameStringLiteral	xerces.jar from xalan-j_1_1 from xerces-1...
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
jarVersions	TokenNameIdentifier	 jar Versions
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
new	TokenNamenew	
Long	TokenNameIdentifier	 Long
(	TokenNameLPAREN	
1498679	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
"xerces.jar from xalan-j_1_2 from xerces-1_2_0.bin"	TokenNameStringLiteral	xerces.jar from xalan-j_1_2 from xerces-1_2_0.bin
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
jarVersions	TokenNameIdentifier	 jar Versions
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
new	TokenNamenew	
Long	TokenNameIdentifier	 Long
(	TokenNameLPAREN	
1484896	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
"xerces.jar from xalan-j_1_2_1 from xerces-1_2_1.bin"	TokenNameStringLiteral	xerces.jar from xalan-j_1_2_1 from xerces-1_2_1.bin
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
jarVersions	TokenNameIdentifier	 jar Versions
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
new	TokenNamenew	
Long	TokenNameIdentifier	 Long
(	TokenNameLPAREN	
804460	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
"xerces.jar from xalan-j_1_2_2 from xerces-1_2_2.bin"	TokenNameStringLiteral	xerces.jar from xalan-j_1_2_2 from xerces-1_2_2.bin
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
jarVersions	TokenNameIdentifier	 jar Versions
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
new	TokenNamenew	
Long	TokenNameIdentifier	 Long
(	TokenNameLPAREN	
1499244	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
"xerces.jar from xalan-j_2_0_0 from xerces-1_2_3.bin"	TokenNameStringLiteral	xerces.jar from xalan-j_2_0_0 from xerces-1_2_3.bin
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
jarVersions	TokenNameIdentifier	 jar Versions
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
new	TokenNamenew	
Long	TokenNameIdentifier	 Long
(	TokenNameLPAREN	
1605266	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
"xerces.jar from xalan-j_2_0_1 from xerces-1_3_0.bin"	TokenNameStringLiteral	xerces.jar from xalan-j_2_0_1 from xerces-1_3_0.bin
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
jarVersions	TokenNameIdentifier	 jar Versions
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
new	TokenNamenew	
Long	TokenNameIdentifier	 Long
(	TokenNameLPAREN	
904030	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
"xerces.jar from xalan-j_2_1_0 from xerces-1_4.bin"	TokenNameStringLiteral	xerces.jar from xalan-j_2_1_0 from xerces-1_4.bin
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
jarVersions	TokenNameIdentifier	 jar Versions
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
new	TokenNamenew	
Long	TokenNameIdentifier	 Long
(	TokenNameLPAREN	
904030	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
"xerces.jar from xerces-1_4_0.bin"	TokenNameStringLiteral	xerces.jar from xerces-1_4_0.bin
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
jarVersions	TokenNameIdentifier	 jar Versions
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
new	TokenNamenew	
Long	TokenNameIdentifier	 Long
(	TokenNameLPAREN	
1802885	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
"xerces.jar from xerces-1_4_2.bin"	TokenNameStringLiteral	xerces.jar from xerces-1_4_2.bin
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
jarVersions	TokenNameIdentifier	 jar Versions
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
new	TokenNamenew	
Long	TokenNameIdentifier	 Long
(	TokenNameLPAREN	
1734594	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
"xerces.jar from Xerces-J-bin.2.0.0.beta3"	TokenNameStringLiteral	xerces.jar from Xerces-J-bin.2.0.0.beta3
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
jarVersions	TokenNameIdentifier	 jar Versions
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
new	TokenNamenew	
Long	TokenNameIdentifier	 Long
(	TokenNameLPAREN	
1808883	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
"xerces.jar from xalan-j_2_2_D10,D11,D12 or xerces-1_4_3.bin"	TokenNameStringLiteral	xerces.jar from xalan-j_2_2_D10,D11,D12 or xerces-1_4_3.bin
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
jarVersions	TokenNameIdentifier	 jar Versions
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
new	TokenNamenew	
Long	TokenNameIdentifier	 Long
(	TokenNameLPAREN	
1812019	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
"xerces.jar from xalan-j_2_2_0"	TokenNameStringLiteral	xerces.jar from xalan-j_2_2_0
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
jarVersions	TokenNameIdentifier	 jar Versions
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
new	TokenNamenew	
Long	TokenNameIdentifier	 Long
(	TokenNameLPAREN	
1720292	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
"xercesImpl.jar from xalan-j_2_3_D1"	TokenNameStringLiteral	xercesImpl.jar from xalan-j_2_3_D1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
jarVersions	TokenNameIdentifier	 jar Versions
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
new	TokenNamenew	
Long	TokenNameIdentifier	 Long
(	TokenNameLPAREN	
1730053	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
"xercesImpl.jar from xalan-j_2_3_0 or xalan-j_2_3_1 from xerces-2_0_0"	TokenNameStringLiteral	xercesImpl.jar from xalan-j_2_3_0 or xalan-j_2_3_1 from xerces-2_0_0
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
jarVersions	TokenNameIdentifier	 jar Versions
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
new	TokenNamenew	
Long	TokenNameIdentifier	 Long
(	TokenNameLPAREN	
1728861	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
"xercesImpl.jar from xalan-j_2_4_D1 from xerces-2_0_1"	TokenNameStringLiteral	xercesImpl.jar from xalan-j_2_4_D1 from xerces-2_0_1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
jarVersions	TokenNameIdentifier	 jar Versions
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
new	TokenNamenew	
Long	TokenNameIdentifier	 Long
(	TokenNameLPAREN	
972027	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
"xercesImpl.jar from xalan-j_2_4_0 from xerces-2_1"	TokenNameStringLiteral	xercesImpl.jar from xalan-j_2_4_0 from xerces-2_1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
jarVersions	TokenNameIdentifier	 jar Versions
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
new	TokenNamenew	
Long	TokenNameIdentifier	 Long
(	TokenNameLPAREN	
831587	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
"xercesImpl.jar from xalan-j_2_4_1 from xerces-2_2"	TokenNameStringLiteral	xercesImpl.jar from xalan-j_2_4_1 from xerces-2_2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
jarVersions	TokenNameIdentifier	 jar Versions
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
new	TokenNamenew	
Long	TokenNameIdentifier	 Long
(	TokenNameLPAREN	
891817	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
"xercesImpl.jar from xalan-j_2_5_D1 from xerces-2_3"	TokenNameStringLiteral	xercesImpl.jar from xalan-j_2_5_D1 from xerces-2_3
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
jarVersions	TokenNameIdentifier	 jar Versions
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
new	TokenNamenew	
Long	TokenNameIdentifier	 Long
(	TokenNameLPAREN	
895924	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
"xercesImpl.jar from xerces-2_4"	TokenNameStringLiteral	xercesImpl.jar from xerces-2_4
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
jarVersions	TokenNameIdentifier	 jar Versions
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
new	TokenNamenew	
Long	TokenNameIdentifier	 Long
(	TokenNameLPAREN	
1010806	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
"xercesImpl.jar from Xerces-J-bin.2.6.2"	TokenNameStringLiteral	xercesImpl.jar from Xerces-J-bin.2.6.2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
jarVersions	TokenNameIdentifier	 jar Versions
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
new	TokenNamenew	
Long	TokenNameIdentifier	 Long
(	TokenNameLPAREN	
1203860	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
"xercesImpl.jar from Xerces-J-bin.2.7.1"	TokenNameStringLiteral	xercesImpl.jar from Xerces-J-bin.2.7.1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
jarVersions	TokenNameIdentifier	 jar Versions
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
new	TokenNamenew	
Long	TokenNameIdentifier	 Long
(	TokenNameLPAREN	
37485	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
"xalanj1compat.jar from xalan-j_2_0_0"	TokenNameStringLiteral	xalanj1compat.jar from xalan-j_2_0_0
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
jarVersions	TokenNameIdentifier	 jar Versions
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
new	TokenNamenew	
Long	TokenNameIdentifier	 Long
(	TokenNameLPAREN	
38100	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
"xalanj1compat.jar from xalan-j_2_0_1"	TokenNameStringLiteral	xalanj1compat.jar from xalan-j_2_0_1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
jarVersions	TokenNameIdentifier	 jar Versions
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
new	TokenNamenew	
Long	TokenNameIdentifier	 Long
(	TokenNameLPAREN	
18779	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
"xalanservlet.jar from xalan-j_2_0_0"	TokenNameStringLiteral	xalanservlet.jar from xalan-j_2_0_0
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
jarVersions	TokenNameIdentifier	 jar Versions
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
new	TokenNamenew	
Long	TokenNameIdentifier	 Long
(	TokenNameLPAREN	
21453	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
"xalanservlet.jar from xalan-j_2_0_1"	TokenNameStringLiteral	xalanservlet.jar from xalan-j_2_0_1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
jarVersions	TokenNameIdentifier	 jar Versions
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
new	TokenNamenew	
Long	TokenNameIdentifier	 Long
(	TokenNameLPAREN	
24826	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
"xalanservlet.jar from xalan-j_2_3_1 or xalan-j_2_4_1"	TokenNameStringLiteral	xalanservlet.jar from xalan-j_2_3_1 or xalan-j_2_4_1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
jarVersions	TokenNameIdentifier	 jar Versions
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
new	TokenNamenew	
Long	TokenNameIdentifier	 Long
(	TokenNameLPAREN	
24831	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
"xalanservlet.jar from xalan-j_2_4_1"	TokenNameStringLiteral	xalanservlet.jar from xalan-j_2_4_1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Stop recording xalanservlet.jar sizes as of Xalan Java 2.5.0; now a .war file 	TokenNameCOMMENT_LINE	Stop recording xalanservlet.jar sizes as of Xalan Java 2.5.0; now a .war file 
// For those who've downloaded JAXP from sun 	TokenNameCOMMENT_LINE	For those who've downloaded JAXP from sun 
jarVersions	TokenNameIdentifier	 jar Versions
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
new	TokenNamenew	
Long	TokenNameIdentifier	 Long
(	TokenNameLPAREN	
5618	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
"jaxp.jar from jaxp1.0.1"	TokenNameStringLiteral	jaxp.jar from jaxp1.0.1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
jarVersions	TokenNameIdentifier	 jar Versions
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
new	TokenNamenew	
Long	TokenNameIdentifier	 Long
(	TokenNameLPAREN	
136133	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
"parser.jar from jaxp1.0.1"	TokenNameStringLiteral	parser.jar from jaxp1.0.1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
jarVersions	TokenNameIdentifier	 jar Versions
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
new	TokenNamenew	
Long	TokenNameIdentifier	 Long
(	TokenNameLPAREN	
28404	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
"jaxp.jar from jaxp-1.1"	TokenNameStringLiteral	jaxp.jar from jaxp-1.1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
jarVersions	TokenNameIdentifier	 jar Versions
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
new	TokenNamenew	
Long	TokenNameIdentifier	 Long
(	TokenNameLPAREN	
187162	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
"crimson.jar from jaxp-1.1"	TokenNameStringLiteral	crimson.jar from jaxp-1.1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
jarVersions	TokenNameIdentifier	 jar Versions
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
new	TokenNamenew	
Long	TokenNameIdentifier	 Long
(	TokenNameLPAREN	
801714	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
"xalan.jar from jaxp-1.1"	TokenNameStringLiteral	xalan.jar from jaxp-1.1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
jarVersions	TokenNameIdentifier	 jar Versions
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
new	TokenNamenew	
Long	TokenNameIdentifier	 Long
(	TokenNameLPAREN	
196399	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
"crimson.jar from crimson-1.1.1"	TokenNameStringLiteral	crimson.jar from crimson-1.1.1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
jarVersions	TokenNameIdentifier	 jar Versions
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
new	TokenNamenew	
Long	TokenNameIdentifier	 Long
(	TokenNameLPAREN	
33323	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
"jaxp.jar from crimson-1.1.1 or jakarta-ant-1.4.1b1"	TokenNameStringLiteral	jaxp.jar from crimson-1.1.1 or jakarta-ant-1.4.1b1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
jarVersions	TokenNameIdentifier	 jar Versions
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
new	TokenNamenew	
Long	TokenNameIdentifier	 Long
(	TokenNameLPAREN	
152717	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
"crimson.jar from crimson-1.1.2beta2"	TokenNameStringLiteral	crimson.jar from crimson-1.1.2beta2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
jarVersions	TokenNameIdentifier	 jar Versions
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
new	TokenNamenew	
Long	TokenNameIdentifier	 Long
(	TokenNameLPAREN	
88143	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
"xml-apis.jar from crimson-1.1.2beta2"	TokenNameStringLiteral	xml-apis.jar from crimson-1.1.2beta2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
jarVersions	TokenNameIdentifier	 jar Versions
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
new	TokenNamenew	
Long	TokenNameIdentifier	 Long
(	TokenNameLPAREN	
206384	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
"crimson.jar from crimson-1.1.3 or jakarta-ant-1.4.1b1"	TokenNameStringLiteral	crimson.jar from crimson-1.1.3 or jakarta-ant-1.4.1b1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// jakarta-ant: since many people use ant these days 	TokenNameCOMMENT_LINE	jakarta-ant: since many people use ant these days 
jarVersions	TokenNameIdentifier	 jar Versions
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
new	TokenNamenew	
Long	TokenNameIdentifier	 Long
(	TokenNameLPAREN	
136198	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
"parser.jar from jakarta-ant-1.3 or 1.2"	TokenNameStringLiteral	parser.jar from jakarta-ant-1.3 or 1.2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
jarVersions	TokenNameIdentifier	 jar Versions
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
new	TokenNamenew	
Long	TokenNameIdentifier	 Long
(	TokenNameLPAREN	
5537	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
"jaxp.jar from jakarta-ant-1.3 or 1.2"	TokenNameStringLiteral	jaxp.jar from jakarta-ant-1.3 or 1.2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Simple PrintWriter we send output to; defaults to System.out. */	TokenNameCOMMENT_JAVADOC	 Simple PrintWriter we send output to; defaults to System.out. 
protected	TokenNameprotected	
PrintWriter	TokenNameIdentifier	 Print Writer
outWriter	TokenNameIdentifier	 out Writer
=	TokenNameEQUAL	
new	TokenNamenew	
PrintWriter	TokenNameIdentifier	 Print Writer
(	TokenNameLPAREN	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Bottleneck output: calls outWriter.println(s). * @param s String to print */	TokenNameCOMMENT_JAVADOC	 Bottleneck output: calls outWriter.println(s). @param s String to print 
protected	TokenNameprotected	
void	TokenNamevoid	
logMsg	TokenNameIdentifier	 log Msg
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
{	TokenNameLBRACE	
outWriter	TokenNameIdentifier	 out Writer
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
