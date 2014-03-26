/* * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. * */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/* * Portions of this software are based upon public domain software * originally written at the National Center for Supercomputing Applications, * University of Illinois, Urbana-Champaign. */	TokenNameCOMMENT_BLOCK	 Portions of this software are based upon public domain software originally written at the National Center for Supercomputing Applications, University of Illinois, Urbana-Champaign. 
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
Project	TokenNameIdentifier	 Project
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Vector	TokenNameIdentifier	 Vector
;	TokenNameSEMICOLON	
/** Submits a numbered changelist to Perforce. * * <B>Note:</B> P4Submit cannot (yet) submit the default changelist. * This shouldn't be a problem with the ANT task as the usual flow is * P4Change to create a new numbered change followed by P4Edit then P4Submit. * * Example Usage:-<br> * &lt;p4submit change="${p4.change}" /&gt; * * @ant.task category="scm" */	TokenNameCOMMENT_JAVADOC	 Submits a numbered changelist to Perforce. * <B>Note:</B> P4Submit cannot (yet) submit the default changelist. This shouldn't be a problem with the ANT task as the usual flow is P4Change to create a new numbered change followed by P4Edit then P4Submit. * Example Usage:-<br> &lt;p4submit change="${p4.change}" /&gt; * @ant.task category="scm" 
public	TokenNamepublic	
class	TokenNameclass	
P4Submit	TokenNameIdentifier	 P4 Submit
extends	TokenNameextends	
P4Base	TokenNameIdentifier	 P4 Base
{	TokenNameLBRACE	
// CheckStyle:VisibilityModifier OFF - bc 	TokenNameCOMMENT_LINE	CheckStyle:VisibilityModifier OFF - bc 
//ToDo: If dealing with default cl need to parse out <enter description here> 	TokenNameCOMMENT_LINE	ToDo: If dealing with default cl need to parse out <enter description here> 
/** * change list number */	TokenNameCOMMENT_JAVADOC	 change list number 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
change	TokenNameIdentifier	 change
;	TokenNameSEMICOLON	
// CheckStyle:VisibilityModifier ON 	TokenNameCOMMENT_LINE	CheckStyle:VisibilityModifier ON 
/** * change property */	TokenNameCOMMENT_JAVADOC	 change property 
private	TokenNameprivate	
String	TokenNameIdentifier	 String
changeProperty	TokenNameIdentifier	 change Property
;	TokenNameSEMICOLON	
/** * needsresolveproperty */	TokenNameCOMMENT_JAVADOC	 needsresolveproperty 
private	TokenNameprivate	
String	TokenNameIdentifier	 String
needsResolveProperty	TokenNameIdentifier	 needs Resolve Property
;	TokenNameSEMICOLON	
/** * set the change list number to submit * @param change The changelist number to submit; required. */	TokenNameCOMMENT_JAVADOC	 set the change list number to submit @param change The changelist number to submit; required. 
public	TokenNamepublic	
void	TokenNamevoid	
setChange	TokenNameIdentifier	 set Change
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
change	TokenNameIdentifier	 change
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
change	TokenNameIdentifier	 change
=	TokenNameEQUAL	
change	TokenNameIdentifier	 change
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * property defining the change number if the change number gets renumbered * @param changeProperty name of a new property to which the change number * will be assigned if it changes * @since ant 1.6.1 */	TokenNameCOMMENT_JAVADOC	 property defining the change number if the change number gets renumbered @param changeProperty name of a new property to which the change number will be assigned if it changes @since ant 1.6.1 
public	TokenNamepublic	
void	TokenNamevoid	
setChangeProperty	TokenNameIdentifier	 set Change Property
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
changeProperty	TokenNameIdentifier	 change Property
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
changeProperty	TokenNameIdentifier	 change Property
=	TokenNameEQUAL	
changeProperty	TokenNameIdentifier	 change Property
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * property defining the need to resolve the change list * @param needsResolveProperty a property which will be set if the change needs resolve * @since ant 1.6.1 */	TokenNameCOMMENT_JAVADOC	 property defining the need to resolve the change list @param needsResolveProperty a property which will be set if the change needs resolve @since ant 1.6.1 
public	TokenNamepublic	
void	TokenNamevoid	
setNeedsResolveProperty	TokenNameIdentifier	 set Needs Resolve Property
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
needsResolveProperty	TokenNameIdentifier	 needs Resolve Property
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
needsResolveProperty	TokenNameIdentifier	 needs Resolve Property
=	TokenNameEQUAL	
needsResolveProperty	TokenNameIdentifier	 needs Resolve Property
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * do the work * @throws BuildException if no change list specified */	TokenNameCOMMENT_JAVADOC	 do the work @throws BuildException if no change list specified 
public	TokenNamepublic	
void	TokenNamevoid	
execute	TokenNameIdentifier	 execute
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
BuildException	TokenNameIdentifier	 Build Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
change	TokenNameIdentifier	 change
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
execP4Command	TokenNameIdentifier	 exec P4 Command
(	TokenNameLPAREN	
"submit -c "	TokenNameStringLiteral	submit -c 
+	TokenNamePLUS	
change	TokenNameIdentifier	 change
,	TokenNameCOMMA	
(	TokenNameLPAREN	
P4HandlerAdapter	TokenNameIdentifier	 P4 Handler Adapter
)	TokenNameRPAREN	
new	TokenNamenew	
P4SubmitAdapter	TokenNameIdentifier	 P4 Submit Adapter
(	TokenNameLPAREN	
this	TokenNamethis	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
//here we'd parse the output from change -o into submit -i 	TokenNameCOMMENT_LINE	here we'd parse the output from change -o into submit -i 
//in order to support default change. 	TokenNameCOMMENT_LINE	in order to support default change. 
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
"No change specified (no support for default change yet...."	TokenNameStringLiteral	No change specified (no support for default change yet....
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * internal class used to process the output of p4 submit */	TokenNameCOMMENT_JAVADOC	 internal class used to process the output of p4 submit 
public	TokenNamepublic	
class	TokenNameclass	
P4SubmitAdapter	TokenNameIdentifier	 P4 Submit Adapter
extends	TokenNameextends	
SimpleP4OutputHandler	TokenNameIdentifier	 Simple P4 Output Handler
{	TokenNameLBRACE	
/** * Constructor. * @param parent a P4Base instance. */	TokenNameCOMMENT_JAVADOC	 Constructor. @param parent a P4Base instance. 
public	TokenNamepublic	
P4SubmitAdapter	TokenNameIdentifier	 P4 Submit Adapter
(	TokenNameLPAREN	
P4Base	TokenNameIdentifier	 P4 Base
parent	TokenNameIdentifier	 parent
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
parent	TokenNameIdentifier	 parent
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * process a line of stdout/stderr coming from Perforce * @param line line of stdout or stderr coming from Perforce */	TokenNameCOMMENT_JAVADOC	 process a line of stdout/stderr coming from Perforce @param line line of stdout or stderr coming from Perforce 
public	TokenNamepublic	
void	TokenNamevoid	
process	TokenNameIdentifier	 process
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
line	TokenNameIdentifier	 line
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
.	TokenNameDOT	
process	TokenNameIdentifier	 process
(	TokenNameLPAREN	
line	TokenNameIdentifier	 line
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
getProject	TokenNameIdentifier	 get Project
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
setProperty	TokenNameIdentifier	 set Property
(	TokenNameLPAREN	
"p4.needsresolve"	TokenNameStringLiteral	p4.needsresolve
,	TokenNameCOMMA	
"0"	TokenNameStringLiteral	0
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// this type of output might happen 	TokenNameCOMMENT_LINE	this type of output might happen 
// Change 18 renamed change 20 and submitted. 	TokenNameCOMMENT_LINE	Change 18 renamed change 20 and submitted. 
if	TokenNameif	
(	TokenNameLPAREN	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
match	TokenNameIdentifier	 match
(	TokenNameLPAREN	
"/renamed/"	TokenNameStringLiteral	/renamed/
,	TokenNameCOMMA	
line	TokenNameIdentifier	 line
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
Vector	TokenNameIdentifier	 Vector
myarray	TokenNameIdentifier	 myarray
=	TokenNameEQUAL	
new	TokenNamenew	
Vector	TokenNameIdentifier	 Vector
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
split	TokenNameIdentifier	 split
(	TokenNameLPAREN	
myarray	TokenNameIdentifier	 myarray
,	TokenNameCOMMA	
line	TokenNameIdentifier	 line
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
found	TokenNameIdentifier	 found
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
size	TokenNameIdentifier	 size
=	TokenNameEQUAL	
myarray	TokenNameIdentifier	 myarray
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
counter	TokenNameIdentifier	 counter
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
counter	TokenNameIdentifier	 counter
<	TokenNameLESS	
size	TokenNameIdentifier	 size
;	TokenNameSEMICOLON	
counter	TokenNameIdentifier	 counter
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
found	TokenNameIdentifier	 found
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
chnum	TokenNameIdentifier	 chnum
=	TokenNameEQUAL	
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
)	TokenNameRPAREN	
myarray	TokenNameIdentifier	 myarray
.	TokenNameDOT	
elementAt	TokenNameIdentifier	 element At
(	TokenNameLPAREN	
counter	TokenNameIdentifier	 counter
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
changenumber	TokenNameIdentifier	 changenumber
=	TokenNameEQUAL	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
parseInt	TokenNameIdentifier	 parse Int
(	TokenNameLPAREN	
chnum	TokenNameIdentifier	 chnum
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
"Perforce change renamed "	TokenNameStringLiteral	Perforce change renamed 
+	TokenNamePLUS	
changenumber	TokenNameIdentifier	 changenumber
,	TokenNameCOMMA	
Project	TokenNameIdentifier	 Project
.	TokenNameDOT	
MSG_INFO	TokenNameIdentifier	 MSG  INFO
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
getProject	TokenNameIdentifier	 get Project
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
setProperty	TokenNameIdentifier	 set Property
(	TokenNameLPAREN	
"p4.change"	TokenNameStringLiteral	p4.change
,	TokenNameCOMMA	
""	TokenNameStringLiteral	 
+	TokenNamePLUS	
changenumber	TokenNameIdentifier	 changenumber
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
changeProperty	TokenNameIdentifier	 change Property
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
getProject	TokenNameIdentifier	 get Project
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
setNewProperty	TokenNameIdentifier	 set New Property
(	TokenNameLPAREN	
changeProperty	TokenNameIdentifier	 change Property
,	TokenNameCOMMA	
chnum	TokenNameIdentifier	 chnum
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
found	TokenNameIdentifier	 found
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
myarray	TokenNameIdentifier	 myarray
.	TokenNameDOT	
elementAt	TokenNameIdentifier	 element At
(	TokenNameLPAREN	
counter	TokenNameIdentifier	 counter
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
"renamed"	TokenNameStringLiteral	renamed
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
found	TokenNameIdentifier	 found
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// NumberFormatException or ArrayOutOfBondsException could happen here 	TokenNameCOMMENT_LINE	NumberFormatException or ArrayOutOfBondsException could happen here 
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
Exception	TokenNameIdentifier	 Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
msg	TokenNameIdentifier	 msg
=	TokenNameEQUAL	
"Failed to parse "	TokenNameStringLiteral	Failed to parse 
+	TokenNamePLUS	
line	TokenNameIdentifier	 line
+	TokenNamePLUS	
" "	TokenNameStringLiteral	 
+	TokenNamePLUS	
" due to "	TokenNameStringLiteral	 due to 
+	TokenNamePLUS	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
getMessage	TokenNameIdentifier	 get Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
msg	TokenNameIdentifier	 msg
,	TokenNameCOMMA	
e	TokenNameIdentifier	 e
,	TokenNameCOMMA	
getLocation	TokenNameIdentifier	 get Location
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
match	TokenNameIdentifier	 match
(	TokenNameLPAREN	
"/p4 submit -c/"	TokenNameStringLiteral	/p4 submit -c/
,	TokenNameCOMMA	
line	TokenNameIdentifier	 line
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
getProject	TokenNameIdentifier	 get Project
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
setProperty	TokenNameIdentifier	 set Property
(	TokenNameLPAREN	
"p4.needsresolve"	TokenNameStringLiteral	p4.needsresolve
,	TokenNameCOMMA	
"1"	TokenNameStringLiteral	1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
needsResolveProperty	TokenNameIdentifier	 needs Resolve Property
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
getProject	TokenNameIdentifier	 get Project
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
setNewProperty	TokenNameIdentifier	 set New Property
(	TokenNameLPAREN	
needsResolveProperty	TokenNameIdentifier	 needs Resolve Property
,	TokenNameCOMMA	
"true"	TokenNameStringLiteral	true
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
