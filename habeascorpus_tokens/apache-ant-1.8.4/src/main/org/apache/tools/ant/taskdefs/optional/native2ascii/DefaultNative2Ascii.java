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
native2ascii	TokenNameIdentifier	 native2ascii
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
File	TokenNameIdentifier	 File
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
ProjectComponent	TokenNameIdentifier	 Project Component
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
optional	TokenNameIdentifier	 optional
.	TokenNameDOT	
Native2Ascii	TokenNameIdentifier	 Native2 Ascii
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
types	TokenNameIdentifier	 types
.	TokenNameDOT	
Commandline	TokenNameIdentifier	 Commandline
;	TokenNameSEMICOLON	
/** * encapsulates the handling common to diffent Native2Asciiadapter * implementations. * * @since Ant 1.6.3 */	TokenNameCOMMENT_JAVADOC	 encapsulates the handling common to diffent Native2Asciiadapter implementations. * @since Ant 1.6.3 
public	TokenNamepublic	
abstract	TokenNameabstract	
class	TokenNameclass	
DefaultNative2Ascii	TokenNameIdentifier	 Default Native2 Ascii
implements	TokenNameimplements	
Native2AsciiAdapter	TokenNameIdentifier	 Native2 Ascii Adapter
{	TokenNameLBRACE	
/** No-arg constructor. */	TokenNameCOMMENT_JAVADOC	 No-arg constructor. 
public	TokenNamepublic	
DefaultNative2Ascii	TokenNameIdentifier	 Default Native2 Ascii
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** * Splits the task into setting up the command line switches * @param args the native 2 ascii arguments. * @param srcFile the source file. * @param destFile the destination file. * @return run if the conversion was successful. * @throws BuildException if there is a problem. * (delegated to {@link #setup setup}), adding the file names * (delegated to {@link #addFiles addFiles}) and running the tool * (delegated to {@link #run run}). */	TokenNameCOMMENT_JAVADOC	 Splits the task into setting up the command line switches @param args the native 2 ascii arguments. @param srcFile the source file. @param destFile the destination file. @return run if the conversion was successful. @throws BuildException if there is a problem. (delegated to {@link #setup setup}), adding the file names (delegated to {@link #addFiles addFiles}) and running the tool (delegated to {@link #run run}). 
public	TokenNamepublic	
final	TokenNamefinal	
boolean	TokenNameboolean	
convert	TokenNameIdentifier	 convert
(	TokenNameLPAREN	
Native2Ascii	TokenNameIdentifier	 Native2 Ascii
args	TokenNameIdentifier	 args
,	TokenNameCOMMA	
File	TokenNameIdentifier	 File
srcFile	TokenNameIdentifier	 src File
,	TokenNameCOMMA	
File	TokenNameIdentifier	 File
destFile	TokenNameIdentifier	 dest File
)	TokenNameRPAREN	
throws	TokenNamethrows	
BuildException	TokenNameIdentifier	 Build Exception
{	TokenNameLBRACE	
Commandline	TokenNameIdentifier	 Commandline
cmd	TokenNameIdentifier	 cmd
=	TokenNameEQUAL	
new	TokenNamenew	
Commandline	TokenNameIdentifier	 Commandline
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
setup	TokenNameIdentifier	 setup
(	TokenNameLPAREN	
cmd	TokenNameIdentifier	 cmd
,	TokenNameCOMMA	
args	TokenNameIdentifier	 args
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
addFiles	TokenNameIdentifier	 add Files
(	TokenNameLPAREN	
cmd	TokenNameIdentifier	 cmd
,	TokenNameCOMMA	
args	TokenNameIdentifier	 args
,	TokenNameCOMMA	
srcFile	TokenNameIdentifier	 src File
,	TokenNameCOMMA	
destFile	TokenNameIdentifier	 dest File
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
run	TokenNameIdentifier	 run
(	TokenNameLPAREN	
cmd	TokenNameIdentifier	 cmd
,	TokenNameCOMMA	
args	TokenNameIdentifier	 args
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sets up the initial command line. * * <p>only the -encoding argument and nested arg elements get * handled here.</p> * * @param cmd Command line to add to * @param args provides the user-setting and access to Ant's * logging system. * @throws BuildException if there was a problem. */	TokenNameCOMMENT_JAVADOC	 Sets up the initial command line. * <p>only the -encoding argument and nested arg elements get handled here.</p> * @param cmd Command line to add to @param args provides the user-setting and access to Ant's logging system. @throws BuildException if there was a problem. 
protected	TokenNameprotected	
void	TokenNamevoid	
setup	TokenNameIdentifier	 setup
(	TokenNameLPAREN	
Commandline	TokenNameIdentifier	 Commandline
cmd	TokenNameIdentifier	 cmd
,	TokenNameCOMMA	
Native2Ascii	TokenNameIdentifier	 Native2 Ascii
args	TokenNameIdentifier	 args
)	TokenNameRPAREN	
throws	TokenNamethrows	
BuildException	TokenNameIdentifier	 Build Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
args	TokenNameIdentifier	 args
.	TokenNameDOT	
getEncoding	TokenNameIdentifier	 get Encoding
(	TokenNameLPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
cmd	TokenNameIdentifier	 cmd
.	TokenNameDOT	
createArgument	TokenNameIdentifier	 create Argument
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
setValue	TokenNameIdentifier	 set Value
(	TokenNameLPAREN	
"-encoding"	TokenNameStringLiteral	-encoding
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
cmd	TokenNameIdentifier	 cmd
.	TokenNameDOT	
createArgument	TokenNameIdentifier	 create Argument
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
setValue	TokenNameIdentifier	 set Value
(	TokenNameLPAREN	
args	TokenNameIdentifier	 args
.	TokenNameDOT	
getEncoding	TokenNameIdentifier	 get Encoding
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
cmd	TokenNameIdentifier	 cmd
.	TokenNameDOT	
addArguments	TokenNameIdentifier	 add Arguments
(	TokenNameLPAREN	
args	TokenNameIdentifier	 args
.	TokenNameDOT	
getCurrentArgs	TokenNameIdentifier	 get Current Args
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Adds source and dest files to the command line. * * <p>This implementation adds them without any leading * qualifiers, source first.</p> * * @param cmd Command line to add to * @param log provides access to Ant's logging system. * @param src the source file * @param dest the destination file * @throws BuildException if there was a problem. */	TokenNameCOMMENT_JAVADOC	 Adds source and dest files to the command line. * <p>This implementation adds them without any leading qualifiers, source first.</p> * @param cmd Command line to add to @param log provides access to Ant's logging system. @param src the source file @param dest the destination file @throws BuildException if there was a problem. 
protected	TokenNameprotected	
void	TokenNamevoid	
addFiles	TokenNameIdentifier	 add Files
(	TokenNameLPAREN	
Commandline	TokenNameIdentifier	 Commandline
cmd	TokenNameIdentifier	 cmd
,	TokenNameCOMMA	
ProjectComponent	TokenNameIdentifier	 Project Component
log	TokenNameIdentifier	 log
,	TokenNameCOMMA	
File	TokenNameIdentifier	 File
src	TokenNameIdentifier	 src
,	TokenNameCOMMA	
File	TokenNameIdentifier	 File
dest	TokenNameIdentifier	 dest
)	TokenNameRPAREN	
throws	TokenNamethrows	
BuildException	TokenNameIdentifier	 Build Exception
{	TokenNameLBRACE	
cmd	TokenNameIdentifier	 cmd
.	TokenNameDOT	
createArgument	TokenNameIdentifier	 create Argument
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
setFile	TokenNameIdentifier	 set File
(	TokenNameLPAREN	
src	TokenNameIdentifier	 src
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
cmd	TokenNameIdentifier	 cmd
.	TokenNameDOT	
createArgument	TokenNameIdentifier	 create Argument
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
setFile	TokenNameIdentifier	 set File
(	TokenNameLPAREN	
dest	TokenNameIdentifier	 dest
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Executes the command. * * @param cmd Command line to execute * @param log provides access to Ant's logging system. * @return whether execution was successful * @throws BuildException if there was a problem. */	TokenNameCOMMENT_JAVADOC	 Executes the command. * @param cmd Command line to execute @param log provides access to Ant's logging system. @return whether execution was successful @throws BuildException if there was a problem. 
protected	TokenNameprotected	
abstract	TokenNameabstract	
boolean	TokenNameboolean	
run	TokenNameIdentifier	 run
(	TokenNameLPAREN	
Commandline	TokenNameIdentifier	 Commandline
cmd	TokenNameIdentifier	 cmd
,	TokenNameCOMMA	
ProjectComponent	TokenNameIdentifier	 Project Component
log	TokenNameIdentifier	 log
)	TokenNameRPAREN	
throws	TokenNamethrows	
BuildException	TokenNameIdentifier	 Build Exception
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
