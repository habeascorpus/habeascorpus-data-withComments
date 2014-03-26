/* Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
batik	TokenNameIdentifier	 batik
.	TokenNameDOT	
script	TokenNameIdentifier	 script
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
Reader	TokenNameIdentifier	 Reader
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
Writer	TokenNameIdentifier	 Writer
;	TokenNameSEMICOLON	
/** * An hight level interface that represents an interpreter engine of * a particular scripting language. * * @author <a href="mailto:cjolif@ilog.fr">Christophe Jolif</a> * @version $Id: Interpreter.java 475477 2006-11-15 22:44:28Z cam $ */	TokenNameCOMMENT_JAVADOC	 An hight level interface that represents an interpreter engine of a particular scripting language. * @author <a href="mailto:cjolif@ilog.fr">Christophe Jolif</a> @version $Id: Interpreter.java 475477 2006-11-15 22:44:28Z cam $ 
public	TokenNamepublic	
interface	TokenNameinterface	
Interpreter	TokenNameIdentifier	 Interpreter
extends	TokenNameextends	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
batik	TokenNameIdentifier	 batik
.	TokenNameDOT	
i18n	TokenNameIdentifier	 i18n
.	TokenNameDOT	
Localizable	TokenNameIdentifier	 Localizable
{	TokenNameLBRACE	
/** * This method should evaluate a piece of script associated to a given * description. * * @param scriptreader a <code>java.io.Reader</code> on the piece of script * @param description description which can be later used (e.g., for error * messages). * @return if no exception is thrown during the call, should return the * value of the last expression evaluated in the script */	TokenNameCOMMENT_JAVADOC	 This method should evaluate a piece of script associated to a given description. * @param scriptreader a <code>java.io.Reader</code> on the piece of script @param description description which can be later used (e.g., for error messages). @return if no exception is thrown during the call, should return the value of the last expression evaluated in the script 
Object	TokenNameIdentifier	 Object
evaluate	TokenNameIdentifier	 evaluate
(	TokenNameLPAREN	
Reader	TokenNameIdentifier	 Reader
scriptreader	TokenNameIdentifier	 scriptreader
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
description	TokenNameIdentifier	 description
)	TokenNameRPAREN	
throws	TokenNamethrows	
InterpreterException	TokenNameIdentifier	 Interpreter Exception
,	TokenNameCOMMA	
IOException	TokenNameIdentifier	 IO Exception
;	TokenNameSEMICOLON	
/** * This method should evaluate a piece of script. * * @param scriptreader a <code>java.io.Reader</code> on the piece of script * @return if no exception is thrown during the call, should return the * value of the last expression evaluated in the script */	TokenNameCOMMENT_JAVADOC	 This method should evaluate a piece of script. * @param scriptreader a <code>java.io.Reader</code> on the piece of script @return if no exception is thrown during the call, should return the value of the last expression evaluated in the script 
Object	TokenNameIdentifier	 Object
evaluate	TokenNameIdentifier	 evaluate
(	TokenNameLPAREN	
Reader	TokenNameIdentifier	 Reader
scriptreader	TokenNameIdentifier	 scriptreader
)	TokenNameRPAREN	
throws	TokenNamethrows	
InterpreterException	TokenNameIdentifier	 Interpreter Exception
,	TokenNameCOMMA	
IOException	TokenNameIdentifier	 IO Exception
;	TokenNameSEMICOLON	
/** * This method should evaluate a piece of script using a <code>String</code> * instead of a <code>Reader</code>. This usually allows do easily do some * caching. * * @param script the piece of script * @return if no exception is thrown during the call, should return the * value of the last expression evaluated in the script */	TokenNameCOMMENT_JAVADOC	 This method should evaluate a piece of script using a <code>String</code> instead of a <code>Reader</code>. This usually allows do easily do some caching. * @param script the piece of script @return if no exception is thrown during the call, should return the value of the last expression evaluated in the script 
Object	TokenNameIdentifier	 Object
evaluate	TokenNameIdentifier	 evaluate
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
script	TokenNameIdentifier	 script
)	TokenNameRPAREN	
throws	TokenNamethrows	
InterpreterException	TokenNameIdentifier	 Interpreter Exception
;	TokenNameSEMICOLON	
/** * This method should register a particular Java <code>Object</code> in * the environment of the interpreter. * * @param name the name of the script object to create * @param object the Java object */	TokenNameCOMMENT_JAVADOC	 This method should register a particular Java <code>Object</code> in the environment of the interpreter. * @param name the name of the script object to create @param object the Java object 
void	TokenNamevoid	
bindObject	TokenNameIdentifier	 bind Object
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
Object	TokenNameIdentifier	 Object
object	TokenNameIdentifier	 object
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * This method should change the output <code>Writer</code> that will be * used when output function of the scripting langage is used. * * @param output the new out <code>Writer</code>. */	TokenNameCOMMENT_JAVADOC	 This method should change the output <code>Writer</code> that will be used when output function of the scripting langage is used. * @param output the new out <code>Writer</code>. 
void	TokenNamevoid	
setOut	TokenNameIdentifier	 set Out
(	TokenNameLPAREN	
Writer	TokenNameIdentifier	 Writer
output	TokenNameIdentifier	 output
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * This method can dispose resources used by the interpreter when it is * no longer used. Be careful, you SHOULD NOT use this interpreter instance * after calling this method. */	TokenNameCOMMENT_JAVADOC	 This method can dispose resources used by the interpreter when it is no longer used. Be careful, you SHOULD NOT use this interpreter instance after calling this method. 
void	TokenNamevoid	
dispose	TokenNameIdentifier	 dispose
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
