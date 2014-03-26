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
types	TokenNameIdentifier	 types
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
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Stack	TokenNameIdentifier	 Stack
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Vector	TokenNameIdentifier	 Vector
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
ArrayList	TokenNameIdentifier	 Array List
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
Project	TokenNameIdentifier	 Project
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
Redirector	TokenNameIdentifier	 Redirector
;	TokenNameSEMICOLON	
/** * Element representation of a <code>Redirector</code>. * @since Ant 1.6.2 */	TokenNameCOMMENT_JAVADOC	 Element representation of a <code>Redirector</code>. @since Ant 1.6.2 
public	TokenNamepublic	
class	TokenNameclass	
RedirectorElement	TokenNameIdentifier	 Redirector Element
extends	TokenNameextends	
DataType	TokenNameIdentifier	 Data Type
{	TokenNameLBRACE	
/** * Whether the input mapper was set via <code>setOutput</code>. */	TokenNameCOMMENT_JAVADOC	 Whether the input mapper was set via <code>setOutput</code>. 
private	TokenNameprivate	
boolean	TokenNameboolean	
usingInput	TokenNameIdentifier	 using Input
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
/** * Whether the output mapper was set via <code>setOutput</code>. */	TokenNameCOMMENT_JAVADOC	 Whether the output mapper was set via <code>setOutput</code>. 
private	TokenNameprivate	
boolean	TokenNameboolean	
usingOutput	TokenNameIdentifier	 using Output
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
/** * Whether the error mapper was set via <code>setError</code>. */	TokenNameCOMMENT_JAVADOC	 Whether the error mapper was set via <code>setError</code>. 
private	TokenNameprivate	
boolean	TokenNameboolean	
usingError	TokenNameIdentifier	 using Error
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
/** * Indicates if standard error should be logged to Ant's log system * rather than the output. This has no effect if standard error is * redirected to a file or property. */	TokenNameCOMMENT_JAVADOC	 Indicates if standard error should be logged to Ant's log system rather than the output. This has no effect if standard error is redirected to a file or property. 
private	TokenNameprivate	
Boolean	TokenNameIdentifier	 Boolean
logError	TokenNameIdentifier	 log Error
;	TokenNameSEMICOLON	
/** The name of the property into which output is to be stored */	TokenNameCOMMENT_JAVADOC	 The name of the property into which output is to be stored 
private	TokenNameprivate	
String	TokenNameIdentifier	 String
outputProperty	TokenNameIdentifier	 output Property
;	TokenNameSEMICOLON	
/** The name of the property into which error output is to be stored */	TokenNameCOMMENT_JAVADOC	 The name of the property into which error output is to be stored 
private	TokenNameprivate	
String	TokenNameIdentifier	 String
errorProperty	TokenNameIdentifier	 error Property
;	TokenNameSEMICOLON	
/** String from which input is taken */	TokenNameCOMMENT_JAVADOC	 String from which input is taken 
private	TokenNameprivate	
String	TokenNameIdentifier	 String
inputString	TokenNameIdentifier	 input String
;	TokenNameSEMICOLON	
/** Flag which indicates if error and output files are to be appended. */	TokenNameCOMMENT_JAVADOC	 Flag which indicates if error and output files are to be appended. 
private	TokenNameprivate	
Boolean	TokenNameIdentifier	 Boolean
append	TokenNameIdentifier	 append
;	TokenNameSEMICOLON	
/** Flag which indicates that output should be always sent to the log */	TokenNameCOMMENT_JAVADOC	 Flag which indicates that output should be always sent to the log 
private	TokenNameprivate	
Boolean	TokenNameIdentifier	 Boolean
alwaysLog	TokenNameIdentifier	 always Log
;	TokenNameSEMICOLON	
/** Flag which indicates whether files should be created even if empty. */	TokenNameCOMMENT_JAVADOC	 Flag which indicates whether files should be created even if empty. 
private	TokenNameprivate	
Boolean	TokenNameIdentifier	 Boolean
createEmptyFiles	TokenNameIdentifier	 create Empty Files
;	TokenNameSEMICOLON	
/** Input file mapper. */	TokenNameCOMMENT_JAVADOC	 Input file mapper. 
private	TokenNameprivate	
Mapper	TokenNameIdentifier	 Mapper
inputMapper	TokenNameIdentifier	 input Mapper
;	TokenNameSEMICOLON	
/** Output file mapper. */	TokenNameCOMMENT_JAVADOC	 Output file mapper. 
private	TokenNameprivate	
Mapper	TokenNameIdentifier	 Mapper
outputMapper	TokenNameIdentifier	 output Mapper
;	TokenNameSEMICOLON	
/** Error file mapper. */	TokenNameCOMMENT_JAVADOC	 Error file mapper. 
private	TokenNameprivate	
Mapper	TokenNameIdentifier	 Mapper
errorMapper	TokenNameIdentifier	 error Mapper
;	TokenNameSEMICOLON	
/** input filter chains. */	TokenNameCOMMENT_JAVADOC	 input filter chains. 
private	TokenNameprivate	
Vector	TokenNameIdentifier	 Vector
inputFilterChains	TokenNameIdentifier	 input Filter Chains
=	TokenNameEQUAL	
new	TokenNamenew	
Vector	TokenNameIdentifier	 Vector
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** output filter chains. */	TokenNameCOMMENT_JAVADOC	 output filter chains. 
private	TokenNameprivate	
Vector	TokenNameIdentifier	 Vector
outputFilterChains	TokenNameIdentifier	 output Filter Chains
=	TokenNameEQUAL	
new	TokenNamenew	
Vector	TokenNameIdentifier	 Vector
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** error filter chains. */	TokenNameCOMMENT_JAVADOC	 error filter chains. 
private	TokenNameprivate	
Vector	TokenNameIdentifier	 Vector
errorFilterChains	TokenNameIdentifier	 error Filter Chains
=	TokenNameEQUAL	
new	TokenNamenew	
Vector	TokenNameIdentifier	 Vector
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** The output encoding */	TokenNameCOMMENT_JAVADOC	 The output encoding 
private	TokenNameprivate	
String	TokenNameIdentifier	 String
outputEncoding	TokenNameIdentifier	 output Encoding
;	TokenNameSEMICOLON	
/** The error encoding */	TokenNameCOMMENT_JAVADOC	 The error encoding 
private	TokenNameprivate	
String	TokenNameIdentifier	 String
errorEncoding	TokenNameIdentifier	 error Encoding
;	TokenNameSEMICOLON	
/** The input encoding */	TokenNameCOMMENT_JAVADOC	 The input encoding 
private	TokenNameprivate	
String	TokenNameIdentifier	 String
inputEncoding	TokenNameIdentifier	 input Encoding
;	TokenNameSEMICOLON	
/** whether to log the inputstring */	TokenNameCOMMENT_JAVADOC	 whether to log the inputstring 
private	TokenNameprivate	
Boolean	TokenNameIdentifier	 Boolean
logInputString	TokenNameIdentifier	 log Input String
;	TokenNameSEMICOLON	
/** * Add the input file mapper. * @param inputMapper <code>Mapper</code>. */	TokenNameCOMMENT_JAVADOC	 Add the input file mapper. @param inputMapper <code>Mapper</code>. 
public	TokenNamepublic	
void	TokenNamevoid	
addConfiguredInputMapper	TokenNameIdentifier	 add Configured Input Mapper
(	TokenNameLPAREN	
Mapper	TokenNameIdentifier	 Mapper
inputMapper	TokenNameIdentifier	 input Mapper
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
isReference	TokenNameIdentifier	 is Reference
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
noChildrenAllowed	TokenNameIdentifier	 no Children Allowed
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
inputMapper	TokenNameIdentifier	 input Mapper
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
usingInput	TokenNameIdentifier	 using Input
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
"attribute "input""	TokenNameStringLiteral	attribute "input"
+	TokenNamePLUS	
" cannot coexist with a nested <inputmapper>"	TokenNameStringLiteral	 cannot coexist with a nested <inputmapper>
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
"Cannot have > 1 <inputmapper>"	TokenNameStringLiteral	Cannot have > 1 <inputmapper>
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
setChecked	TokenNameIdentifier	 set Checked
(	TokenNameLPAREN	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
inputMapper	TokenNameIdentifier	 input Mapper
=	TokenNameEQUAL	
inputMapper	TokenNameIdentifier	 input Mapper
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Add the output file mapper. * @param outputMapper <code>Mapper</code>. */	TokenNameCOMMENT_JAVADOC	 Add the output file mapper. @param outputMapper <code>Mapper</code>. 
public	TokenNamepublic	
void	TokenNamevoid	
addConfiguredOutputMapper	TokenNameIdentifier	 add Configured Output Mapper
(	TokenNameLPAREN	
Mapper	TokenNameIdentifier	 Mapper
outputMapper	TokenNameIdentifier	 output Mapper
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
isReference	TokenNameIdentifier	 is Reference
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
noChildrenAllowed	TokenNameIdentifier	 no Children Allowed
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
outputMapper	TokenNameIdentifier	 output Mapper
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
usingOutput	TokenNameIdentifier	 using Output
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
"attribute "output""	TokenNameStringLiteral	attribute "output"
+	TokenNamePLUS	
" cannot coexist with a nested <outputmapper>"	TokenNameStringLiteral	 cannot coexist with a nested <outputmapper>
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
"Cannot have > 1 <outputmapper>"	TokenNameStringLiteral	Cannot have > 1 <outputmapper>
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
setChecked	TokenNameIdentifier	 set Checked
(	TokenNameLPAREN	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
outputMapper	TokenNameIdentifier	 output Mapper
=	TokenNameEQUAL	
outputMapper	TokenNameIdentifier	 output Mapper
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Add the error file mapper. * @param errorMapper <code>Mapper</code>. */	TokenNameCOMMENT_JAVADOC	 Add the error file mapper. @param errorMapper <code>Mapper</code>. 
public	TokenNamepublic	
void	TokenNamevoid	
addConfiguredErrorMapper	TokenNameIdentifier	 add Configured Error Mapper
(	TokenNameLPAREN	
Mapper	TokenNameIdentifier	 Mapper
errorMapper	TokenNameIdentifier	 error Mapper
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
isReference	TokenNameIdentifier	 is Reference
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
noChildrenAllowed	TokenNameIdentifier	 no Children Allowed
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
errorMapper	TokenNameIdentifier	 error Mapper
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
usingError	TokenNameIdentifier	 using Error
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
"attribute "error""	TokenNameStringLiteral	attribute "error"
+	TokenNamePLUS	
" cannot coexist with a nested <errormapper>"	TokenNameStringLiteral	 cannot coexist with a nested <errormapper>
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
"Cannot have > 1 <errormapper>"	TokenNameStringLiteral	Cannot have > 1 <errormapper>
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
setChecked	TokenNameIdentifier	 set Checked
(	TokenNameLPAREN	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
errorMapper	TokenNameIdentifier	 error Mapper
=	TokenNameEQUAL	
errorMapper	TokenNameIdentifier	 error Mapper
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Make this instance in effect a reference to another instance. * * <p>You must not set another attribute or nest elements inside * this element if you make it a reference.</p> * @param r the reference to use. * @throws BuildException on error. */	TokenNameCOMMENT_JAVADOC	 Make this instance in effect a reference to another instance. * <p>You must not set another attribute or nest elements inside this element if you make it a reference.</p> @param r the reference to use. @throws BuildException on error. 
public	TokenNamepublic	
void	TokenNamevoid	
setRefid	TokenNameIdentifier	 set Refid
(	TokenNameLPAREN	
Reference	TokenNameIdentifier	 Reference
r	TokenNameIdentifier	 r
)	TokenNameRPAREN	
throws	TokenNamethrows	
BuildException	TokenNameIdentifier	 Build Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
usingInput	TokenNameIdentifier	 using Input
||	TokenNameOR_OR	
usingOutput	TokenNameIdentifier	 using Output
||	TokenNameOR_OR	
usingError	TokenNameIdentifier	 using Error
||	TokenNameOR_OR	
inputString	TokenNameIdentifier	 input String
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
||	TokenNameOR_OR	
logError	TokenNameIdentifier	 log Error
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
||	TokenNameOR_OR	
append	TokenNameIdentifier	 append
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
||	TokenNameOR_OR	
createEmptyFiles	TokenNameIdentifier	 create Empty Files
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
||	TokenNameOR_OR	
inputEncoding	TokenNameIdentifier	 input Encoding
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
||	TokenNameOR_OR	
outputEncoding	TokenNameIdentifier	 output Encoding
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
||	TokenNameOR_OR	
errorEncoding	TokenNameIdentifier	 error Encoding
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
||	TokenNameOR_OR	
outputProperty	TokenNameIdentifier	 output Property
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
||	TokenNameOR_OR	
errorProperty	TokenNameIdentifier	 error Property
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
||	TokenNameOR_OR	
logInputString	TokenNameIdentifier	 log Input String
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
tooManyAttributes	TokenNameIdentifier	 too Many Attributes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
super	TokenNamesuper	
.	TokenNameDOT	
setRefid	TokenNameIdentifier	 set Refid
(	TokenNameLPAREN	
r	TokenNameIdentifier	 r
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set the input to use for the task. * @param input the file from which input is read. */	TokenNameCOMMENT_JAVADOC	 Set the input to use for the task. @param input the file from which input is read. 
public	TokenNamepublic	
void	TokenNamevoid	
setInput	TokenNameIdentifier	 set Input
(	TokenNameLPAREN	
File	TokenNameIdentifier	 File
input	TokenNameIdentifier	 input
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
isReference	TokenNameIdentifier	 is Reference
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
tooManyAttributes	TokenNameIdentifier	 too Many Attributes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
inputString	TokenNameIdentifier	 input String
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
"The "input" and "inputstring" "	TokenNameStringLiteral	The "input" and "inputstring" 
+	TokenNamePLUS	
"attributes cannot both be specified"	TokenNameStringLiteral	attributes cannot both be specified
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
usingInput	TokenNameIdentifier	 using Input
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
inputMapper	TokenNameIdentifier	 input Mapper
=	TokenNameEQUAL	
createMergeMapper	TokenNameIdentifier	 create Merge Mapper
(	TokenNameLPAREN	
input	TokenNameIdentifier	 input
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set the string to use as input * @param inputString the string which is used as the input source */	TokenNameCOMMENT_JAVADOC	 Set the string to use as input @param inputString the string which is used as the input source 
public	TokenNamepublic	
void	TokenNamevoid	
setInputString	TokenNameIdentifier	 set Input String
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
inputString	TokenNameIdentifier	 input String
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
isReference	TokenNameIdentifier	 is Reference
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
tooManyAttributes	TokenNameIdentifier	 too Many Attributes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
usingInput	TokenNameIdentifier	 using Input
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
"The "input" and "inputstring" "	TokenNameStringLiteral	The "input" and "inputstring" 
+	TokenNamePLUS	
"attributes cannot both be specified"	TokenNameStringLiteral	attributes cannot both be specified
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
this	TokenNamethis	
.	TokenNameDOT	
inputString	TokenNameIdentifier	 input String
=	TokenNameEQUAL	
inputString	TokenNameIdentifier	 input String
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set whether to include the value of the input string in log messages. * Defaults to true. * @param logInputString true or false. * @since Ant 1.7 */	TokenNameCOMMENT_JAVADOC	 Set whether to include the value of the input string in log messages. Defaults to true. @param logInputString true or false. @since Ant 1.7 
public	TokenNamepublic	
void	TokenNamevoid	
setLogInputString	TokenNameIdentifier	 set Log Input String
(	TokenNameLPAREN	
boolean	TokenNameboolean	
logInputString	TokenNameIdentifier	 log Input String
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
isReference	TokenNameIdentifier	 is Reference
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
tooManyAttributes	TokenNameIdentifier	 too Many Attributes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
this	TokenNamethis	
.	TokenNameDOT	
logInputString	TokenNameIdentifier	 log Input String
=	TokenNameEQUAL	
logInputString	TokenNameIdentifier	 log Input String
?	TokenNameQUESTION	
Boolean	TokenNameIdentifier	 Boolean
.	TokenNameDOT	
TRUE	TokenNameIdentifier	 TRUE
:	TokenNameCOLON	
Boolean	TokenNameIdentifier	 Boolean
.	TokenNameDOT	
FALSE	TokenNameIdentifier	 FALSE
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * File the output of the process is redirected to. If error is not * redirected, it too will appear in the output. * * @param out the file to which output stream is written. */	TokenNameCOMMENT_JAVADOC	 File the output of the process is redirected to. If error is not redirected, it too will appear in the output. * @param out the file to which output stream is written. 
public	TokenNamepublic	
void	TokenNamevoid	
setOutput	TokenNameIdentifier	 set Output
(	TokenNameLPAREN	
File	TokenNameIdentifier	 File
out	TokenNameIdentifier	 out
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
isReference	TokenNameIdentifier	 is Reference
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
tooManyAttributes	TokenNameIdentifier	 too Many Attributes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
out	TokenNameIdentifier	 out
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
"output file specified as null"	TokenNameStringLiteral	output file specified as null
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
usingOutput	TokenNameIdentifier	 using Output
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
outputMapper	TokenNameIdentifier	 output Mapper
=	TokenNameEQUAL	
createMergeMapper	TokenNameIdentifier	 create Merge Mapper
(	TokenNameLPAREN	
out	TokenNameIdentifier	 out
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set the output encoding. * @param outputEncoding <code>String</code>. */	TokenNameCOMMENT_JAVADOC	 Set the output encoding. @param outputEncoding <code>String</code>. 
public	TokenNamepublic	
void	TokenNamevoid	
setOutputEncoding	TokenNameIdentifier	 set Output Encoding
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
outputEncoding	TokenNameIdentifier	 output Encoding
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
isReference	TokenNameIdentifier	 is Reference
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
tooManyAttributes	TokenNameIdentifier	 too Many Attributes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
this	TokenNamethis	
.	TokenNameDOT	
outputEncoding	TokenNameIdentifier	 output Encoding
=	TokenNameEQUAL	
outputEncoding	TokenNameIdentifier	 output Encoding
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set the error encoding. * * @param errorEncoding <code>String</code>. */	TokenNameCOMMENT_JAVADOC	 Set the error encoding. * @param errorEncoding <code>String</code>. 
public	TokenNamepublic	
void	TokenNamevoid	
setErrorEncoding	TokenNameIdentifier	 set Error Encoding
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
errorEncoding	TokenNameIdentifier	 error Encoding
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
isReference	TokenNameIdentifier	 is Reference
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
tooManyAttributes	TokenNameIdentifier	 too Many Attributes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
this	TokenNamethis	
.	TokenNameDOT	
errorEncoding	TokenNameIdentifier	 error Encoding
=	TokenNameEQUAL	
errorEncoding	TokenNameIdentifier	 error Encoding
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set the input encoding. * @param inputEncoding <code>String</code>. */	TokenNameCOMMENT_JAVADOC	 Set the input encoding. @param inputEncoding <code>String</code>. 
public	TokenNamepublic	
void	TokenNamevoid	
setInputEncoding	TokenNameIdentifier	 set Input Encoding
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
inputEncoding	TokenNameIdentifier	 input Encoding
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
isReference	TokenNameIdentifier	 is Reference
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
tooManyAttributes	TokenNameIdentifier	 too Many Attributes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
this	TokenNamethis	
.	TokenNameDOT	
inputEncoding	TokenNameIdentifier	 input Encoding
=	TokenNameEQUAL	
inputEncoding	TokenNameIdentifier	 input Encoding
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Controls whether error output of exec is logged. This is only useful * when output is being redirected and error output is desired in the * Ant log. * @param logError if true the standard error is sent to the Ant log system * and not sent to output. */	TokenNameCOMMENT_JAVADOC	 Controls whether error output of exec is logged. This is only useful when output is being redirected and error output is desired in the Ant log. @param logError if true the standard error is sent to the Ant log system and not sent to output. 
public	TokenNamepublic	
void	TokenNamevoid	
setLogError	TokenNameIdentifier	 set Log Error
(	TokenNameLPAREN	
boolean	TokenNameboolean	
logError	TokenNameIdentifier	 log Error
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
isReference	TokenNameIdentifier	 is Reference
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
tooManyAttributes	TokenNameIdentifier	 too Many Attributes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
this	TokenNamethis	
.	TokenNameDOT	
logError	TokenNameIdentifier	 log Error
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
logError	TokenNameIdentifier	 log Error
)	TokenNameRPAREN	
?	TokenNameQUESTION	
Boolean	TokenNameIdentifier	 Boolean
.	TokenNameDOT	
TRUE	TokenNameIdentifier	 TRUE
:	TokenNameCOLON	
Boolean	TokenNameIdentifier	 Boolean
.	TokenNameDOT	
FALSE	TokenNameIdentifier	 FALSE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set the file to which standard error is to be redirected. * @param error the file to which error is to be written. */	TokenNameCOMMENT_JAVADOC	 Set the file to which standard error is to be redirected. @param error the file to which error is to be written. 
public	TokenNamepublic	
void	TokenNamevoid	
setError	TokenNameIdentifier	 set Error
(	TokenNameLPAREN	
File	TokenNameIdentifier	 File
error	TokenNameIdentifier	 error
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
isReference	TokenNameIdentifier	 is Reference
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
tooManyAttributes	TokenNameIdentifier	 too Many Attributes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
error	TokenNameIdentifier	 error
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
"error file specified as null"	TokenNameStringLiteral	error file specified as null
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
usingError	TokenNameIdentifier	 using Error
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
errorMapper	TokenNameIdentifier	 error Mapper
=	TokenNameEQUAL	
createMergeMapper	TokenNameIdentifier	 create Merge Mapper
(	TokenNameLPAREN	
error	TokenNameIdentifier	 error
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Property name whose value should be set to the output of * the process. * @param outputProperty the name of the property to be set with the * task's output. */	TokenNameCOMMENT_JAVADOC	 Property name whose value should be set to the output of the process. @param outputProperty the name of the property to be set with the task's output. 
public	TokenNamepublic	
void	TokenNamevoid	
setOutputProperty	TokenNameIdentifier	 set Output Property
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
outputProperty	TokenNameIdentifier	 output Property
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
isReference	TokenNameIdentifier	 is Reference
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
tooManyAttributes	TokenNameIdentifier	 too Many Attributes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
this	TokenNamethis	
.	TokenNameDOT	
outputProperty	TokenNameIdentifier	 output Property
=	TokenNameEQUAL	
outputProperty	TokenNameIdentifier	 output Property
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Whether output should be appended to or overwrite an existing file. * Defaults to false. * @param append if true output and error streams are appended to their * respective files, if specified. */	TokenNameCOMMENT_JAVADOC	 Whether output should be appended to or overwrite an existing file. Defaults to false. @param append if true output and error streams are appended to their respective files, if specified. 
public	TokenNamepublic	
void	TokenNamevoid	
setAppend	TokenNameIdentifier	 set Append
(	TokenNameLPAREN	
boolean	TokenNameboolean	
append	TokenNameIdentifier	 append
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
isReference	TokenNameIdentifier	 is Reference
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
tooManyAttributes	TokenNameIdentifier	 too Many Attributes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
this	TokenNamethis	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
append	TokenNameIdentifier	 append
)	TokenNameRPAREN	
?	TokenNameQUESTION	
Boolean	TokenNameIdentifier	 Boolean
.	TokenNameDOT	
TRUE	TokenNameIdentifier	 TRUE
:	TokenNameCOLON	
Boolean	TokenNameIdentifier	 Boolean
.	TokenNameDOT	
FALSE	TokenNameIdentifier	 FALSE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * If true, (error and non-error) output will be "teed", redirected * as specified while being sent to Ant's logging mechanism as if no * redirection had taken place. Defaults to false. * @param alwaysLog <code>boolean</code> * @since Ant 1.6.3 */	TokenNameCOMMENT_JAVADOC	 If true, (error and non-error) output will be "teed", redirected as specified while being sent to Ant's logging mechanism as if no redirection had taken place. Defaults to false. @param alwaysLog <code>boolean</code> @since Ant 1.6.3 
public	TokenNamepublic	
void	TokenNamevoid	
setAlwaysLog	TokenNameIdentifier	 set Always Log
(	TokenNameLPAREN	
boolean	TokenNameboolean	
alwaysLog	TokenNameIdentifier	 always Log
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
isReference	TokenNameIdentifier	 is Reference
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
tooManyAttributes	TokenNameIdentifier	 too Many Attributes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
this	TokenNamethis	
.	TokenNameDOT	
alwaysLog	TokenNameIdentifier	 always Log
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
alwaysLog	TokenNameIdentifier	 always Log
)	TokenNameRPAREN	
?	TokenNameQUESTION	
Boolean	TokenNameIdentifier	 Boolean
.	TokenNameDOT	
TRUE	TokenNameIdentifier	 TRUE
:	TokenNameCOLON	
Boolean	TokenNameIdentifier	 Boolean
.	TokenNameDOT	
FALSE	TokenNameIdentifier	 FALSE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Whether output and error files should be created even when empty. * Defaults to true. * @param createEmptyFiles <code>boolean</code>. */	TokenNameCOMMENT_JAVADOC	 Whether output and error files should be created even when empty. Defaults to true. @param createEmptyFiles <code>boolean</code>. 
public	TokenNamepublic	
void	TokenNamevoid	
setCreateEmptyFiles	TokenNameIdentifier	 set Create Empty Files
(	TokenNameLPAREN	
boolean	TokenNameboolean	
createEmptyFiles	TokenNameIdentifier	 create Empty Files
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
isReference	TokenNameIdentifier	 is Reference
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
tooManyAttributes	TokenNameIdentifier	 too Many Attributes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
this	TokenNamethis	
.	TokenNameDOT	
createEmptyFiles	TokenNameIdentifier	 create Empty Files
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
createEmptyFiles	TokenNameIdentifier	 create Empty Files
)	TokenNameRPAREN	
?	TokenNameQUESTION	
Boolean	TokenNameIdentifier	 Boolean
.	TokenNameDOT	
TRUE	TokenNameIdentifier	 TRUE
:	TokenNameCOLON	
Boolean	TokenNameIdentifier	 Boolean
.	TokenNameDOT	
FALSE	TokenNameIdentifier	 FALSE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Property name whose value should be set to the error of * the process. * @param errorProperty the name of the property to be set * with the error output. */	TokenNameCOMMENT_JAVADOC	 Property name whose value should be set to the error of the process. @param errorProperty the name of the property to be set with the error output. 
public	TokenNamepublic	
void	TokenNamevoid	
setErrorProperty	TokenNameIdentifier	 set Error Property
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
errorProperty	TokenNameIdentifier	 error Property
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
isReference	TokenNameIdentifier	 is Reference
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
tooManyAttributes	TokenNameIdentifier	 too Many Attributes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
this	TokenNamethis	
.	TokenNameDOT	
errorProperty	TokenNameIdentifier	 error Property
=	TokenNameEQUAL	
errorProperty	TokenNameIdentifier	 error Property
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Create a nested input <code>FilterChain</code>. * @return <code>FilterChain</code>. */	TokenNameCOMMENT_JAVADOC	 Create a nested input <code>FilterChain</code>. @return <code>FilterChain</code>. 
public	TokenNamepublic	
FilterChain	TokenNameIdentifier	 Filter Chain
createInputFilterChain	TokenNameIdentifier	 create Input Filter Chain
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
isReference	TokenNameIdentifier	 is Reference
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
noChildrenAllowed	TokenNameIdentifier	 no Children Allowed
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
FilterChain	TokenNameIdentifier	 Filter Chain
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
new	TokenNamenew	
FilterChain	TokenNameIdentifier	 Filter Chain
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
setProject	TokenNameIdentifier	 set Project
(	TokenNameLPAREN	
getProject	TokenNameIdentifier	 get Project
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
inputFilterChains	TokenNameIdentifier	 input Filter Chains
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
result	TokenNameIdentifier	 result
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
setChecked	TokenNameIdentifier	 set Checked
(	TokenNameLPAREN	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
result	TokenNameIdentifier	 result
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Create a nested output <code>FilterChain</code>. * @return <code>FilterChain</code>. */	TokenNameCOMMENT_JAVADOC	 Create a nested output <code>FilterChain</code>. @return <code>FilterChain</code>. 
public	TokenNamepublic	
FilterChain	TokenNameIdentifier	 Filter Chain
createOutputFilterChain	TokenNameIdentifier	 create Output Filter Chain
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
isReference	TokenNameIdentifier	 is Reference
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
noChildrenAllowed	TokenNameIdentifier	 no Children Allowed
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
FilterChain	TokenNameIdentifier	 Filter Chain
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
new	TokenNamenew	
FilterChain	TokenNameIdentifier	 Filter Chain
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
setProject	TokenNameIdentifier	 set Project
(	TokenNameLPAREN	
getProject	TokenNameIdentifier	 get Project
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
outputFilterChains	TokenNameIdentifier	 output Filter Chains
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
result	TokenNameIdentifier	 result
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
setChecked	TokenNameIdentifier	 set Checked
(	TokenNameLPAREN	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
result	TokenNameIdentifier	 result
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Create a nested error <code>FilterChain</code>. * @return <code>FilterChain</code>. */	TokenNameCOMMENT_JAVADOC	 Create a nested error <code>FilterChain</code>. @return <code>FilterChain</code>. 
public	TokenNamepublic	
FilterChain	TokenNameIdentifier	 Filter Chain
createErrorFilterChain	TokenNameIdentifier	 create Error Filter Chain
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
isReference	TokenNameIdentifier	 is Reference
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
noChildrenAllowed	TokenNameIdentifier	 no Children Allowed
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
FilterChain	TokenNameIdentifier	 Filter Chain
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
new	TokenNamenew	
FilterChain	TokenNameIdentifier	 Filter Chain
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
setProject	TokenNameIdentifier	 set Project
(	TokenNameLPAREN	
getProject	TokenNameIdentifier	 get Project
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
errorFilterChains	TokenNameIdentifier	 error Filter Chains
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
result	TokenNameIdentifier	 result
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
setChecked	TokenNameIdentifier	 set Checked
(	TokenNameLPAREN	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
result	TokenNameIdentifier	 result
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Configure the specified <code>Redirector</code>. * @param redirector <code>Redirector</code>. */	TokenNameCOMMENT_JAVADOC	 Configure the specified <code>Redirector</code>. @param redirector <code>Redirector</code>. 
public	TokenNamepublic	
void	TokenNamevoid	
configure	TokenNameIdentifier	 configure
(	TokenNameLPAREN	
Redirector	TokenNameIdentifier	 Redirector
redirector	TokenNameIdentifier	 redirector
)	TokenNameRPAREN	
{	TokenNameLBRACE	
configure	TokenNameIdentifier	 configure
(	TokenNameLPAREN	
redirector	TokenNameIdentifier	 redirector
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Configure the specified <code>Redirector</code> * for the specified sourcefile. * @param redirector <code>Redirector</code>. * @param sourcefile <code>String</code>. */	TokenNameCOMMENT_JAVADOC	 Configure the specified <code>Redirector</code> for the specified sourcefile. @param redirector <code>Redirector</code>. @param sourcefile <code>String</code>. 
public	TokenNamepublic	
void	TokenNamevoid	
configure	TokenNameIdentifier	 configure
(	TokenNameLPAREN	
Redirector	TokenNameIdentifier	 Redirector
redirector	TokenNameIdentifier	 redirector
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
sourcefile	TokenNameIdentifier	 sourcefile
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
isReference	TokenNameIdentifier	 is Reference
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
getRef	TokenNameIdentifier	 get Ref
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
configure	TokenNameIdentifier	 configure
(	TokenNameLPAREN	
redirector	TokenNameIdentifier	 redirector
,	TokenNameCOMMA	
sourcefile	TokenNameIdentifier	 sourcefile
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
dieOnCircularReference	TokenNameIdentifier	 die On Circular Reference
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
alwaysLog	TokenNameIdentifier	 always Log
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
redirector	TokenNameIdentifier	 redirector
.	TokenNameDOT	
setAlwaysLog	TokenNameIdentifier	 set Always Log
(	TokenNameLPAREN	
alwaysLog	TokenNameIdentifier	 always Log
.	TokenNameDOT	
booleanValue	TokenNameIdentifier	 boolean Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
logError	TokenNameIdentifier	 log Error
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
redirector	TokenNameIdentifier	 redirector
.	TokenNameDOT	
setLogError	TokenNameIdentifier	 set Log Error
(	TokenNameLPAREN	
logError	TokenNameIdentifier	 log Error
.	TokenNameDOT	
booleanValue	TokenNameIdentifier	 boolean Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
append	TokenNameIdentifier	 append
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
redirector	TokenNameIdentifier	 redirector
.	TokenNameDOT	
setAppend	TokenNameIdentifier	 set Append
(	TokenNameLPAREN	
append	TokenNameIdentifier	 append
.	TokenNameDOT	
booleanValue	TokenNameIdentifier	 boolean Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
createEmptyFiles	TokenNameIdentifier	 create Empty Files
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
redirector	TokenNameIdentifier	 redirector
.	TokenNameDOT	
setCreateEmptyFiles	TokenNameIdentifier	 set Create Empty Files
(	TokenNameLPAREN	
createEmptyFiles	TokenNameIdentifier	 create Empty Files
.	TokenNameDOT	
booleanValue	TokenNameIdentifier	 boolean Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
outputProperty	TokenNameIdentifier	 output Property
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
redirector	TokenNameIdentifier	 redirector
.	TokenNameDOT	
setOutputProperty	TokenNameIdentifier	 set Output Property
(	TokenNameLPAREN	
outputProperty	TokenNameIdentifier	 output Property
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
errorProperty	TokenNameIdentifier	 error Property
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
redirector	TokenNameIdentifier	 redirector
.	TokenNameDOT	
setErrorProperty	TokenNameIdentifier	 set Error Property
(	TokenNameLPAREN	
errorProperty	TokenNameIdentifier	 error Property
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
inputString	TokenNameIdentifier	 input String
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
redirector	TokenNameIdentifier	 redirector
.	TokenNameDOT	
setInputString	TokenNameIdentifier	 set Input String
(	TokenNameLPAREN	
inputString	TokenNameIdentifier	 input String
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
logInputString	TokenNameIdentifier	 log Input String
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
redirector	TokenNameIdentifier	 redirector
.	TokenNameDOT	
setLogInputString	TokenNameIdentifier	 set Log Input String
(	TokenNameLPAREN	
logInputString	TokenNameIdentifier	 log Input String
.	TokenNameDOT	
booleanValue	TokenNameIdentifier	 boolean Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
inputMapper	TokenNameIdentifier	 input Mapper
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
inputTargets	TokenNameIdentifier	 input Targets
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
inputTargets	TokenNameIdentifier	 input Targets
=	TokenNameEQUAL	
inputMapper	TokenNameIdentifier	 input Mapper
.	TokenNameDOT	
getImplementation	TokenNameIdentifier	 get Implementation
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
mapFileName	TokenNameIdentifier	 map File Name
(	TokenNameLPAREN	
sourcefile	TokenNameIdentifier	 sourcefile
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
NullPointerException	TokenNameIdentifier	 Null Pointer Exception
enPeaEx	TokenNameIdentifier	 en Pea Ex
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
sourcefile	TokenNameIdentifier	 sourcefile
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
enPeaEx	TokenNameIdentifier	 en Pea Ex
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
inputTargets	TokenNameIdentifier	 input Targets
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
inputTargets	TokenNameIdentifier	 input Targets
.	TokenNameDOT	
length	TokenNameIdentifier	 length
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
redirector	TokenNameIdentifier	 redirector
.	TokenNameDOT	
setInput	TokenNameIdentifier	 set Input
(	TokenNameLPAREN	
toFileArray	TokenNameIdentifier	 to File Array
(	TokenNameLPAREN	
inputTargets	TokenNameIdentifier	 input Targets
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
outputMapper	TokenNameIdentifier	 output Mapper
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
outputTargets	TokenNameIdentifier	 output Targets
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
outputTargets	TokenNameIdentifier	 output Targets
=	TokenNameEQUAL	
outputMapper	TokenNameIdentifier	 output Mapper
.	TokenNameDOT	
getImplementation	TokenNameIdentifier	 get Implementation
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
mapFileName	TokenNameIdentifier	 map File Name
(	TokenNameLPAREN	
sourcefile	TokenNameIdentifier	 sourcefile
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
NullPointerException	TokenNameIdentifier	 Null Pointer Exception
enPeaEx	TokenNameIdentifier	 en Pea Ex
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
sourcefile	TokenNameIdentifier	 sourcefile
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
enPeaEx	TokenNameIdentifier	 en Pea Ex
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
outputTargets	TokenNameIdentifier	 output Targets
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
outputTargets	TokenNameIdentifier	 output Targets
.	TokenNameDOT	
length	TokenNameIdentifier	 length
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
redirector	TokenNameIdentifier	 redirector
.	TokenNameDOT	
setOutput	TokenNameIdentifier	 set Output
(	TokenNameLPAREN	
toFileArray	TokenNameIdentifier	 to File Array
(	TokenNameLPAREN	
outputTargets	TokenNameIdentifier	 output Targets
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
errorMapper	TokenNameIdentifier	 error Mapper
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
errorTargets	TokenNameIdentifier	 error Targets
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
errorTargets	TokenNameIdentifier	 error Targets
=	TokenNameEQUAL	
errorMapper	TokenNameIdentifier	 error Mapper
.	TokenNameDOT	
getImplementation	TokenNameIdentifier	 get Implementation
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
mapFileName	TokenNameIdentifier	 map File Name
(	TokenNameLPAREN	
sourcefile	TokenNameIdentifier	 sourcefile
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
NullPointerException	TokenNameIdentifier	 Null Pointer Exception
enPeaEx	TokenNameIdentifier	 en Pea Ex
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
sourcefile	TokenNameIdentifier	 sourcefile
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
enPeaEx	TokenNameIdentifier	 en Pea Ex
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
errorTargets	TokenNameIdentifier	 error Targets
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
errorTargets	TokenNameIdentifier	 error Targets
.	TokenNameDOT	
length	TokenNameIdentifier	 length
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
redirector	TokenNameIdentifier	 redirector
.	TokenNameDOT	
setError	TokenNameIdentifier	 set Error
(	TokenNameLPAREN	
toFileArray	TokenNameIdentifier	 to File Array
(	TokenNameLPAREN	
errorTargets	TokenNameIdentifier	 error Targets
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
inputFilterChains	TokenNameIdentifier	 input Filter Chains
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
redirector	TokenNameIdentifier	 redirector
.	TokenNameDOT	
setInputFilterChains	TokenNameIdentifier	 set Input Filter Chains
(	TokenNameLPAREN	
inputFilterChains	TokenNameIdentifier	 input Filter Chains
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
outputFilterChains	TokenNameIdentifier	 output Filter Chains
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
redirector	TokenNameIdentifier	 redirector
.	TokenNameDOT	
setOutputFilterChains	TokenNameIdentifier	 set Output Filter Chains
(	TokenNameLPAREN	
outputFilterChains	TokenNameIdentifier	 output Filter Chains
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
errorFilterChains	TokenNameIdentifier	 error Filter Chains
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
redirector	TokenNameIdentifier	 redirector
.	TokenNameDOT	
setErrorFilterChains	TokenNameIdentifier	 set Error Filter Chains
(	TokenNameLPAREN	
errorFilterChains	TokenNameIdentifier	 error Filter Chains
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
inputEncoding	TokenNameIdentifier	 input Encoding
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
redirector	TokenNameIdentifier	 redirector
.	TokenNameDOT	
setInputEncoding	TokenNameIdentifier	 set Input Encoding
(	TokenNameLPAREN	
inputEncoding	TokenNameIdentifier	 input Encoding
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
outputEncoding	TokenNameIdentifier	 output Encoding
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
redirector	TokenNameIdentifier	 redirector
.	TokenNameDOT	
setOutputEncoding	TokenNameIdentifier	 set Output Encoding
(	TokenNameLPAREN	
outputEncoding	TokenNameIdentifier	 output Encoding
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
errorEncoding	TokenNameIdentifier	 error Encoding
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
redirector	TokenNameIdentifier	 redirector
.	TokenNameDOT	
setErrorEncoding	TokenNameIdentifier	 set Error Encoding
(	TokenNameLPAREN	
errorEncoding	TokenNameIdentifier	 error Encoding
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Create a merge mapper pointing to the specified destination file. * @param destfile <code>File</code> * @return <code>Mapper</code>. */	TokenNameCOMMENT_JAVADOC	 Create a merge mapper pointing to the specified destination file. @param destfile <code>File</code> @return <code>Mapper</code>. 
protected	TokenNameprotected	
Mapper	TokenNameIdentifier	 Mapper
createMergeMapper	TokenNameIdentifier	 create Merge Mapper
(	TokenNameLPAREN	
File	TokenNameIdentifier	 File
destfile	TokenNameIdentifier	 destfile
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Mapper	TokenNameIdentifier	 Mapper
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
new	TokenNamenew	
Mapper	TokenNameIdentifier	 Mapper
(	TokenNameLPAREN	
getProject	TokenNameIdentifier	 get Project
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
setClassname	TokenNameIdentifier	 set Classname
(	TokenNameLPAREN	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
tools	TokenNameIdentifier	 tools
.	TokenNameDOT	
ant	TokenNameIdentifier	 ant
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
MergingMapper	TokenNameIdentifier	 Merging Mapper
.	TokenNameDOT	
class	TokenNameclass	
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
setTo	TokenNameIdentifier	 set To
(	TokenNameLPAREN	
destfile	TokenNameIdentifier	 destfile
.	TokenNameDOT	
getAbsolutePath	TokenNameIdentifier	 get Absolute Path
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
result	TokenNameIdentifier	 result
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Return a <code>File[]</code> from the specified set of filenames. * @param name <code>String[]</code> * @return <code>File[]</code>. */	TokenNameCOMMENT_JAVADOC	 Return a <code>File[]</code> from the specified set of filenames. @param name <code>String[]</code> @return <code>File[]</code>. 
protected	TokenNameprotected	
File	TokenNameIdentifier	 File
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
toFileArray	TokenNameIdentifier	 to File Array
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
//remove any null elements 	TokenNameCOMMENT_LINE	remove any null elements 
ArrayList	TokenNameIdentifier	 Array List
list	TokenNameIdentifier	 list
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
.	TokenNameDOT	
length	TokenNameIdentifier	 length
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
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
list	TokenNameIdentifier	 list
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
getProject	TokenNameIdentifier	 get Project
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
resolveFile	TokenNameIdentifier	 resolve File
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
File	TokenNameIdentifier	 File
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
list	TokenNameIdentifier	 list
.	TokenNameDOT	
toArray	TokenNameIdentifier	 to Array
(	TokenNameLPAREN	
new	TokenNamenew	
File	TokenNameIdentifier	 File
[	TokenNameLBRACKET	
list	TokenNameIdentifier	 list
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Overrides the version of DataType to recurse on all DataType * child elements that may have been added. * @param stk the stack of data types to use (recursively). * @param p the project to use to dereference the references. * @throws BuildException on error. */	TokenNameCOMMENT_JAVADOC	 Overrides the version of DataType to recurse on all DataType child elements that may have been added. @param stk the stack of data types to use (recursively). @param p the project to use to dereference the references. @throws BuildException on error. 
protected	TokenNameprotected	
void	TokenNamevoid	
dieOnCircularReference	TokenNameIdentifier	 die On Circular Reference
(	TokenNameLPAREN	
Stack	TokenNameIdentifier	 Stack
stk	TokenNameIdentifier	 stk
,	TokenNameCOMMA	
Project	TokenNameIdentifier	 Project
p	TokenNameIdentifier	 p
)	TokenNameRPAREN	
throws	TokenNamethrows	
BuildException	TokenNameIdentifier	 Build Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
isChecked	TokenNameIdentifier	 is Checked
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
isReference	TokenNameIdentifier	 is Reference
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
.	TokenNameDOT	
dieOnCircularReference	TokenNameIdentifier	 die On Circular Reference
(	TokenNameLPAREN	
stk	TokenNameIdentifier	 stk
,	TokenNameCOMMA	
p	TokenNameIdentifier	 p
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
Mapper	TokenNameIdentifier	 Mapper
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
m	TokenNameIdentifier	 m
=	TokenNameEQUAL	
new	TokenNamenew	
Mapper	TokenNameIdentifier	 Mapper
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
inputMapper	TokenNameIdentifier	 input Mapper
,	TokenNameCOMMA	
outputMapper	TokenNameIdentifier	 output Mapper
,	TokenNameCOMMA	
errorMapper	TokenNameIdentifier	 error Mapper
}	TokenNameRBRACE	
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
m	TokenNameIdentifier	 m
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
m	TokenNameIdentifier	 m
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
stk	TokenNameIdentifier	 stk
.	TokenNameDOT	
push	TokenNameIdentifier	 push
(	TokenNameLPAREN	
m	TokenNameIdentifier	 m
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m	TokenNameIdentifier	 m
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
dieOnCircularReference	TokenNameIdentifier	 die On Circular Reference
(	TokenNameLPAREN	
stk	TokenNameIdentifier	 stk
,	TokenNameCOMMA	
p	TokenNameIdentifier	 p
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
stk	TokenNameIdentifier	 stk
.	TokenNameDOT	
pop	TokenNameIdentifier	 pop
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
Vector	TokenNameIdentifier	 Vector
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
v	TokenNameIdentifier	 v
=	TokenNameEQUAL	
new	TokenNamenew	
Vector	TokenNameIdentifier	 Vector
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
inputFilterChains	TokenNameIdentifier	 input Filter Chains
,	TokenNameCOMMA	
outputFilterChains	TokenNameIdentifier	 output Filter Chains
,	TokenNameCOMMA	
errorFilterChains	TokenNameIdentifier	 error Filter Chains
}	TokenNameRBRACE	
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
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
v	TokenNameIdentifier	 v
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
Iterator	TokenNameIdentifier	 Iterator
fci	TokenNameIdentifier	 fci
=	TokenNameEQUAL	
v	TokenNameIdentifier	 v
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
iterator	TokenNameIdentifier	 iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fci	TokenNameIdentifier	 fci
.	TokenNameDOT	
hasNext	TokenNameIdentifier	 has Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
FilterChain	TokenNameIdentifier	 Filter Chain
fc	TokenNameIdentifier	 fc
=	TokenNameEQUAL	
(	TokenNameLPAREN	
FilterChain	TokenNameIdentifier	 Filter Chain
)	TokenNameRPAREN	
fci	TokenNameIdentifier	 fci
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
pushAndInvokeCircularReferenceCheck	TokenNameIdentifier	 push And Invoke Circular Reference Check
(	TokenNameLPAREN	
fc	TokenNameIdentifier	 fc
,	TokenNameCOMMA	
stk	TokenNameIdentifier	 stk
,	TokenNameCOMMA	
p	TokenNameIdentifier	 p
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
setChecked	TokenNameIdentifier	 set Checked
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Perform the check for circular references, returning the * referenced RedirectorElement. * @return the referenced RedirectorElement. */	TokenNameCOMMENT_JAVADOC	 Perform the check for circular references, returning the referenced RedirectorElement. @return the referenced RedirectorElement. 
private	TokenNameprivate	
RedirectorElement	TokenNameIdentifier	 Redirector Element
getRef	TokenNameIdentifier	 get Ref
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
RedirectorElement	TokenNameIdentifier	 Redirector Element
)	TokenNameRPAREN	
getCheckedRef	TokenNameIdentifier	 get Checked Ref
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
