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
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Stack	TokenNameIdentifier	 Stack
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
ComponentHelper	TokenNameIdentifier	 Component Helper
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
util	TokenNameIdentifier	 util
.	TokenNameDOT	
IdentityStack	TokenNameIdentifier	 Identity Stack
;	TokenNameSEMICOLON	
/** * Base class for those classes that can appear inside the build file * as stand alone data types. * * <p>This class handles the common description attribute and provides * a default implementation for reference handling and checking for * circular references that is appropriate for types that can not be * nested inside elements of the same type (i.e. &lt;patternset&gt; * but not &lt;path&gt;).</p> * */	TokenNameCOMMENT_JAVADOC	 Base class for those classes that can appear inside the build file as stand alone data types. * <p>This class handles the common description attribute and provides a default implementation for reference handling and checking for circular references that is appropriate for types that can not be nested inside elements of the same type (i.e. &lt;patternset&gt; but not &lt;path&gt;).</p> 
public	TokenNamepublic	
abstract	TokenNameabstract	
class	TokenNameclass	
DataType	TokenNameIdentifier	 Data Type
extends	TokenNameextends	
ProjectComponent	TokenNameIdentifier	 Project Component
implements	TokenNameimplements	
Cloneable	TokenNameIdentifier	 Cloneable
{	TokenNameLBRACE	
// CheckStyle:VisibilityModifier OFF 	TokenNameCOMMENT_LINE	CheckStyle:VisibilityModifier OFF 
/** * Value to the refid attribute. * * @deprecated since 1.7. * The user should not be directly referencing * variable. Please use {@link #getRefid} instead. */	TokenNameCOMMENT_JAVADOC	 Value to the refid attribute. * @deprecated since 1.7. The user should not be directly referencing variable. Please use {@link #getRefid} instead. 
protected	TokenNameprotected	
Reference	TokenNameIdentifier	 Reference
ref	TokenNameIdentifier	 ref
;	TokenNameSEMICOLON	
/** * Are we sure we don't hold circular references? * * <p>Subclasses are responsible for setting this value to false * if we'd need to investigate this condition (usually because a * child element has been added that is a subclass of * DataType).</p> * * @deprecated since 1.7. * The user should not be directly referencing * variable. Please use {@link #setChecked} or * {@link #isChecked} instead. */	TokenNameCOMMENT_JAVADOC	 Are we sure we don't hold circular references? * <p>Subclasses are responsible for setting this value to false if we'd need to investigate this condition (usually because a child element has been added that is a subclass of DataType).</p> * @deprecated since 1.7. The user should not be directly referencing variable. Please use {@link #setChecked} or {@link #isChecked} instead. 
protected	TokenNameprotected	
boolean	TokenNameboolean	
checked	TokenNameIdentifier	 checked
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
// CheckStyle:VisibilityModifier ON 	TokenNameCOMMENT_LINE	CheckStyle:VisibilityModifier ON 
/** * Has the refid attribute of this element been set? * @return true if the refid attribute has been set */	TokenNameCOMMENT_JAVADOC	 Has the refid attribute of this element been set? @return true if the refid attribute has been set 
public	TokenNamepublic	
boolean	TokenNameboolean	
isReference	TokenNameIdentifier	 is Reference
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
ref	TokenNameIdentifier	 ref
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set the value of the refid attribute. * * <p>Subclasses may need to check whether any other attributes * have been set as well or child elements have been created and * thus override this method. if they do the must call * <code>super.setRefid</code>.</p> * @param ref the reference to use */	TokenNameCOMMENT_JAVADOC	 Set the value of the refid attribute. * <p>Subclasses may need to check whether any other attributes have been set as well or child elements have been created and thus override this method. if they do the must call <code>super.setRefid</code>.</p> @param ref the reference to use 
public	TokenNamepublic	
void	TokenNamevoid	
setRefid	TokenNameIdentifier	 set Refid
(	TokenNameLPAREN	
final	TokenNamefinal	
Reference	TokenNameIdentifier	 Reference
ref	TokenNameIdentifier	 ref
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
ref	TokenNameIdentifier	 ref
=	TokenNameEQUAL	
ref	TokenNameIdentifier	 ref
;	TokenNameSEMICOLON	
checked	TokenNameIdentifier	 checked
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Gets as descriptive as possible a name used for this datatype instance. * @return <code>String</code> name. */	TokenNameCOMMENT_JAVADOC	 Gets as descriptive as possible a name used for this datatype instance. @return <code>String</code> name. 
protected	TokenNameprotected	
String	TokenNameIdentifier	 String
getDataTypeName	TokenNameIdentifier	 get Data Type Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
ComponentHelper	TokenNameIdentifier	 Component Helper
.	TokenNameDOT	
getElementName	TokenNameIdentifier	 get Element Name
(	TokenNameLPAREN	
getProject	TokenNameIdentifier	 get Project
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
this	TokenNamethis	
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Convenience method. * @since Ant 1.7 */	TokenNameCOMMENT_JAVADOC	 Convenience method. @since Ant 1.7 
protected	TokenNameprotected	
void	TokenNamevoid	
dieOnCircularReference	TokenNameIdentifier	 die On Circular Reference
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
dieOnCircularReference	TokenNameIdentifier	 die On Circular Reference
(	TokenNameLPAREN	
getProject	TokenNameIdentifier	 get Project
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Convenience method. * @param p the Ant Project instance against which to resolve references. * @since Ant 1.7 */	TokenNameCOMMENT_JAVADOC	 Convenience method. @param p the Ant Project instance against which to resolve references. @since Ant 1.7 
protected	TokenNameprotected	
void	TokenNamevoid	
dieOnCircularReference	TokenNameIdentifier	 die On Circular Reference
(	TokenNameLPAREN	
Project	TokenNameIdentifier	 Project
p	TokenNameIdentifier	 p
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
checked	TokenNameIdentifier	 checked
||	TokenNameOR_OR	
!	TokenNameNOT	
isReference	TokenNameIdentifier	 is Reference
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
dieOnCircularReference	TokenNameIdentifier	 die On Circular Reference
(	TokenNameLPAREN	
new	TokenNamenew	
IdentityStack	TokenNameIdentifier	 Identity Stack
(	TokenNameLPAREN	
this	TokenNamethis	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
p	TokenNameIdentifier	 p
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Check to see whether any DataType we hold references to is * included in the Stack (which holds all DataType instances that * directly or indirectly reference this instance, including this * instance itself). * * <p>If one is included, throw a BuildException created by {@link * #circularReference circularReference}.</p> * * <p>This implementation is appropriate only for a DataType that * cannot hold other DataTypes as children.</p> * * <p>The general contract of this method is that it shouldn't do * anything if {@link #checked <code>checked</code>} is true and * set it to true on exit.</p> * @param stack the stack of references to check. * @param project the project to use to dereference the references. * @throws BuildException on error. */	TokenNameCOMMENT_JAVADOC	 Check to see whether any DataType we hold references to is included in the Stack (which holds all DataType instances that directly or indirectly reference this instance, including this instance itself). * <p>If one is included, throw a BuildException created by {@link #circularReference circularReference}.</p> * <p>This implementation is appropriate only for a DataType that cannot hold other DataTypes as children.</p> * <p>The general contract of this method is that it shouldn't do anything if {@link #checked <code>checked</code>} is true and set it to true on exit.</p> @param stack the stack of references to check. @param project the project to use to dereference the references. @throws BuildException on error. 
protected	TokenNameprotected	
void	TokenNamevoid	
dieOnCircularReference	TokenNameIdentifier	 die On Circular Reference
(	TokenNameLPAREN	
final	TokenNamefinal	
Stack	TokenNameIdentifier	 Stack
stack	TokenNameIdentifier	 stack
,	TokenNameCOMMA	
final	TokenNamefinal	
Project	TokenNameIdentifier	 Project
project	TokenNameIdentifier	 project
)	TokenNameRPAREN	
throws	TokenNamethrows	
BuildException	TokenNameIdentifier	 Build Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
checked	TokenNameIdentifier	 checked
||	TokenNameOR_OR	
!	TokenNameNOT	
isReference	TokenNameIdentifier	 is Reference
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
Object	TokenNameIdentifier	 Object
o	TokenNameIdentifier	 o
=	TokenNameEQUAL	
ref	TokenNameIdentifier	 ref
.	TokenNameDOT	
getReferencedObject	TokenNameIdentifier	 get Referenced Object
(	TokenNameLPAREN	
project	TokenNameIdentifier	 project
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
o	TokenNameIdentifier	 o
instanceof	TokenNameinstanceof	
DataType	TokenNameIdentifier	 Data Type
)	TokenNameRPAREN	
{	TokenNameLBRACE	
IdentityStack	TokenNameIdentifier	 Identity Stack
id	TokenNameIdentifier	 id
=	TokenNameEQUAL	
IdentityStack	TokenNameIdentifier	 Identity Stack
.	TokenNameDOT	
getInstance	TokenNameIdentifier	 get Instance
(	TokenNameLPAREN	
stack	TokenNameIdentifier	 stack
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
id	TokenNameIdentifier	 id
.	TokenNameDOT	
contains	TokenNameIdentifier	 contains
(	TokenNameLPAREN	
o	TokenNameIdentifier	 o
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
circularReference	TokenNameIdentifier	 circular Reference
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
id	TokenNameIdentifier	 id
.	TokenNameDOT	
push	TokenNameIdentifier	 push
(	TokenNameLPAREN	
o	TokenNameIdentifier	 o
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
DataType	TokenNameIdentifier	 Data Type
)	TokenNameRPAREN	
o	TokenNameIdentifier	 o
)	TokenNameRPAREN	
.	TokenNameDOT	
dieOnCircularReference	TokenNameIdentifier	 die On Circular Reference
(	TokenNameLPAREN	
id	TokenNameIdentifier	 id
,	TokenNameCOMMA	
project	TokenNameIdentifier	 project
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
id	TokenNameIdentifier	 id
.	TokenNameDOT	
pop	TokenNameIdentifier	 pop
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
checked	TokenNameIdentifier	 checked
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Allow DataTypes outside org.apache.tools.ant.types to indirectly call * dieOnCircularReference on nested DataTypes. * @param dt the DataType to check. * @param stk the stack of references to check. * @param p the project to use to dereference the references. * @throws BuildException on error. * @since Ant 1.7 */	TokenNameCOMMENT_JAVADOC	 Allow DataTypes outside org.apache.tools.ant.types to indirectly call dieOnCircularReference on nested DataTypes. @param dt the DataType to check. @param stk the stack of references to check. @param p the project to use to dereference the references. @throws BuildException on error. @since Ant 1.7 
public	TokenNamepublic	
static	TokenNamestatic	
void	TokenNamevoid	
invokeCircularReferenceCheck	TokenNameIdentifier	 invoke Circular Reference Check
(	TokenNameLPAREN	
DataType	TokenNameIdentifier	 Data Type
dt	TokenNameIdentifier	 dt
,	TokenNameCOMMA	
Stack	TokenNameIdentifier	 Stack
stk	TokenNameIdentifier	 stk
,	TokenNameCOMMA	
Project	TokenNameIdentifier	 Project
p	TokenNameIdentifier	 p
)	TokenNameRPAREN	
{	TokenNameLBRACE	
dt	TokenNameIdentifier	 dt
.	TokenNameDOT	
dieOnCircularReference	TokenNameIdentifier	 die On Circular Reference
(	TokenNameLPAREN	
stk	TokenNameIdentifier	 stk
,	TokenNameCOMMA	
p	TokenNameIdentifier	 p
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Allow DataTypes outside org.apache.tools.ant.types to indirectly call * dieOnCircularReference on nested DataTypes. * * <p>Pushes dt on the stack, runs dieOnCircularReference and pops * it again.</p> * @param dt the DataType to check. * @param stk the stack of references to check. * @param p the project to use to dereference the references. * @throws BuildException on error. * @since Ant 1.8.0 */	TokenNameCOMMENT_JAVADOC	 Allow DataTypes outside org.apache.tools.ant.types to indirectly call dieOnCircularReference on nested DataTypes. * <p>Pushes dt on the stack, runs dieOnCircularReference and pops it again.</p> @param dt the DataType to check. @param stk the stack of references to check. @param p the project to use to dereference the references. @throws BuildException on error. @since Ant 1.8.0 
public	TokenNamepublic	
static	TokenNamestatic	
void	TokenNamevoid	
pushAndInvokeCircularReferenceCheck	TokenNameIdentifier	 push And Invoke Circular Reference Check
(	TokenNameLPAREN	
DataType	TokenNameIdentifier	 Data Type
dt	TokenNameIdentifier	 dt
,	TokenNameCOMMA	
Stack	TokenNameIdentifier	 Stack
stk	TokenNameIdentifier	 stk
,	TokenNameCOMMA	
Project	TokenNameIdentifier	 Project
p	TokenNameIdentifier	 p
)	TokenNameRPAREN	
{	TokenNameLBRACE	
stk	TokenNameIdentifier	 stk
.	TokenNameDOT	
push	TokenNameIdentifier	 push
(	TokenNameLPAREN	
dt	TokenNameIdentifier	 dt
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
dt	TokenNameIdentifier	 dt
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
/** * Performs the check for circular references and returns the * referenced object. * @return the dereferenced object. * @throws BuildException if the reference is invalid (circular ref, wrong class, etc). * @since Ant 1.7 */	TokenNameCOMMENT_JAVADOC	 Performs the check for circular references and returns the referenced object. @return the dereferenced object. @throws BuildException if the reference is invalid (circular ref, wrong class, etc). @since Ant 1.7 
protected	TokenNameprotected	
Object	TokenNameIdentifier	 Object
getCheckedRef	TokenNameIdentifier	 get Checked Ref
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
getCheckedRef	TokenNameIdentifier	 get Checked Ref
(	TokenNameLPAREN	
getProject	TokenNameIdentifier	 get Project
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Performs the check for circular references and returns the * referenced object. * @param p the Ant Project instance against which to resolve references. * @return the dereferenced object. * @throws BuildException if the reference is invalid (circular ref, wrong class, etc). * @since Ant 1.7 */	TokenNameCOMMENT_JAVADOC	 Performs the check for circular references and returns the referenced object. @param p the Ant Project instance against which to resolve references. @return the dereferenced object. @throws BuildException if the reference is invalid (circular ref, wrong class, etc). @since Ant 1.7 
protected	TokenNameprotected	
Object	TokenNameIdentifier	 Object
getCheckedRef	TokenNameIdentifier	 get Checked Ref
(	TokenNameLPAREN	
Project	TokenNameIdentifier	 Project
p	TokenNameIdentifier	 p
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
getCheckedRef	TokenNameIdentifier	 get Checked Ref
(	TokenNameLPAREN	
getClass	TokenNameIdentifier	 get Class
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
getDataTypeName	TokenNameIdentifier	 get Data Type Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
p	TokenNameIdentifier	 p
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Performs the check for circular references and returns the * referenced object. * @param requiredClass the class that this reference should be a subclass of. * @param dataTypeName the name of the datatype that the reference should be * (error message use only). * @return the dereferenced object. * @throws BuildException if the reference is invalid (circular ref, wrong class, etc). */	TokenNameCOMMENT_JAVADOC	 Performs the check for circular references and returns the referenced object. @param requiredClass the class that this reference should be a subclass of. @param dataTypeName the name of the datatype that the reference should be (error message use only). @return the dereferenced object. @throws BuildException if the reference is invalid (circular ref, wrong class, etc). 
protected	TokenNameprotected	
Object	TokenNameIdentifier	 Object
getCheckedRef	TokenNameIdentifier	 get Checked Ref
(	TokenNameLPAREN	
final	TokenNamefinal	
Class	TokenNameIdentifier	 Class
requiredClass	TokenNameIdentifier	 required Class
,	TokenNameCOMMA	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
dataTypeName	TokenNameIdentifier	 data Type Name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
getCheckedRef	TokenNameIdentifier	 get Checked Ref
(	TokenNameLPAREN	
requiredClass	TokenNameIdentifier	 required Class
,	TokenNameCOMMA	
dataTypeName	TokenNameIdentifier	 data Type Name
,	TokenNameCOMMA	
getProject	TokenNameIdentifier	 get Project
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Performs the check for circular references and returns the * referenced object. This version allows the fallback Project instance to be specified. * @param requiredClass the class that this reference should be a subclass of. * @param dataTypeName the name of the datatype that the reference should be * (error message use only). * @param project the fallback Project instance for dereferencing. * @return the dereferenced object. * @throws BuildException if the reference is invalid (circular ref, wrong class, etc), * or if <code>project</code> is <code>null</code>. * @since Ant 1.7 */	TokenNameCOMMENT_JAVADOC	 Performs the check for circular references and returns the referenced object. This version allows the fallback Project instance to be specified. @param requiredClass the class that this reference should be a subclass of. @param dataTypeName the name of the datatype that the reference should be (error message use only). @param project the fallback Project instance for dereferencing. @return the dereferenced object. @throws BuildException if the reference is invalid (circular ref, wrong class, etc), or if <code>project</code> is <code>null</code>. @since Ant 1.7 
protected	TokenNameprotected	
Object	TokenNameIdentifier	 Object
getCheckedRef	TokenNameIdentifier	 get Checked Ref
(	TokenNameLPAREN	
final	TokenNamefinal	
Class	TokenNameIdentifier	 Class
requiredClass	TokenNameIdentifier	 required Class
,	TokenNameCOMMA	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
dataTypeName	TokenNameIdentifier	 data Type Name
,	TokenNameCOMMA	
final	TokenNamefinal	
Project	TokenNameIdentifier	 Project
project	TokenNameIdentifier	 project
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
project	TokenNameIdentifier	 project
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
"No Project specified"	TokenNameStringLiteral	No Project specified
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
dieOnCircularReference	TokenNameIdentifier	 die On Circular Reference
(	TokenNameLPAREN	
project	TokenNameIdentifier	 project
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Object	TokenNameIdentifier	 Object
o	TokenNameIdentifier	 o
=	TokenNameEQUAL	
ref	TokenNameIdentifier	 ref
.	TokenNameDOT	
getReferencedObject	TokenNameIdentifier	 get Referenced Object
(	TokenNameLPAREN	
project	TokenNameIdentifier	 project
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
(	TokenNameLPAREN	
requiredClass	TokenNameIdentifier	 required Class
.	TokenNameDOT	
isAssignableFrom	TokenNameIdentifier	 is Assignable From
(	TokenNameLPAREN	
o	TokenNameIdentifier	 o
.	TokenNameDOT	
getClass	TokenNameIdentifier	 get Class
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
"Class "	TokenNameStringLiteral	Class 
+	TokenNamePLUS	
o	TokenNameIdentifier	 o
.	TokenNameDOT	
getClass	TokenNameIdentifier	 get Class
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
" is not a subclass of "	TokenNameStringLiteral	 is not a subclass of 
+	TokenNamePLUS	
requiredClass	TokenNameIdentifier	 required Class
,	TokenNameCOMMA	
Project	TokenNameIdentifier	 Project
.	TokenNameDOT	
MSG_VERBOSE	TokenNameIdentifier	 MSG  VERBOSE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
msg	TokenNameIdentifier	 msg
=	TokenNameEQUAL	
ref	TokenNameIdentifier	 ref
.	TokenNameDOT	
getRefId	TokenNameIdentifier	 get Ref Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
" doesn't denote a "	TokenNameStringLiteral	 doesn't denote a 
+	TokenNamePLUS	
dataTypeName	TokenNameIdentifier	 data Type Name
;	TokenNameSEMICOLON	
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
msg	TokenNameIdentifier	 msg
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
o	TokenNameIdentifier	 o
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Creates an exception that indicates that refid has to be the * only attribute if it is set. * @return the exception to throw */	TokenNameCOMMENT_JAVADOC	 Creates an exception that indicates that refid has to be the only attribute if it is set. @return the exception to throw 
protected	TokenNameprotected	
BuildException	TokenNameIdentifier	 Build Exception
tooManyAttributes	TokenNameIdentifier	 too Many Attributes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
"You must not specify more than one "	TokenNameStringLiteral	You must not specify more than one 
+	TokenNamePLUS	
"attribute when using refid"	TokenNameStringLiteral	attribute when using refid
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Creates an exception that indicates that this XML element must * not have child elements if the refid attribute is set. * @return the exception to throw */	TokenNameCOMMENT_JAVADOC	 Creates an exception that indicates that this XML element must not have child elements if the refid attribute is set. @return the exception to throw 
protected	TokenNameprotected	
BuildException	TokenNameIdentifier	 Build Exception
noChildrenAllowed	TokenNameIdentifier	 no Children Allowed
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
"You must not specify nested elements "	TokenNameStringLiteral	You must not specify nested elements 
+	TokenNamePLUS	
"when using refid"	TokenNameStringLiteral	when using refid
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Creates an exception that indicates the user has generated a * loop of data types referencing each other. * @return the exception to throw */	TokenNameCOMMENT_JAVADOC	 Creates an exception that indicates the user has generated a loop of data types referencing each other. @return the exception to throw 
protected	TokenNameprotected	
BuildException	TokenNameIdentifier	 Build Exception
circularReference	TokenNameIdentifier	 circular Reference
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
"This data type contains a circular "	TokenNameStringLiteral	This data type contains a circular 
+	TokenNamePLUS	
"reference."	TokenNameStringLiteral	reference.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * The flag that is used to indicate that circular references have been checked. * @return true if circular references have been checked */	TokenNameCOMMENT_JAVADOC	 The flag that is used to indicate that circular references have been checked. @return true if circular references have been checked 
protected	TokenNameprotected	
boolean	TokenNameboolean	
isChecked	TokenNameIdentifier	 is Checked
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
checked	TokenNameIdentifier	 checked
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set the flag that is used to indicate that circular references have been checked. * @param checked if true, if circular references have been checked */	TokenNameCOMMENT_JAVADOC	 Set the flag that is used to indicate that circular references have been checked. @param checked if true, if circular references have been checked 
protected	TokenNameprotected	
void	TokenNamevoid	
setChecked	TokenNameIdentifier	 set Checked
(	TokenNameLPAREN	
final	TokenNamefinal	
boolean	TokenNameboolean	
checked	TokenNameIdentifier	 checked
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
checked	TokenNameIdentifier	 checked
=	TokenNameEQUAL	
checked	TokenNameIdentifier	 checked
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * get the reference set on this object * @return the reference or null */	TokenNameCOMMENT_JAVADOC	 get the reference set on this object @return the reference or null 
public	TokenNamepublic	
Reference	TokenNameIdentifier	 Reference
getRefid	TokenNameIdentifier	 get Refid
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
ref	TokenNameIdentifier	 ref
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * check that it is ok to set attributes, i.e that no reference is defined * @since Ant 1.6 * @throws BuildException if not allowed */	TokenNameCOMMENT_JAVADOC	 check that it is ok to set attributes, i.e that no reference is defined @since Ant 1.6 @throws BuildException if not allowed 
protected	TokenNameprotected	
void	TokenNamevoid	
checkAttributesAllowed	TokenNameIdentifier	 check Attributes Allowed
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
tooManyAttributes	TokenNameIdentifier	 too Many Attributes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * check that it is ok to add children, i.e that no reference is defined * @since Ant 1.6 * @throws BuildException if not allowed */	TokenNameCOMMENT_JAVADOC	 check that it is ok to add children, i.e that no reference is defined @since Ant 1.6 @throws BuildException if not allowed 
protected	TokenNameprotected	
void	TokenNamevoid	
checkChildrenAllowed	TokenNameIdentifier	 check Children Allowed
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
}	TokenNameRBRACE	
/** * Basic DataType toString(). * @return this DataType formatted as a String. */	TokenNameCOMMENT_JAVADOC	 Basic DataType toString(). @return this DataType formatted as a String. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
d	TokenNameIdentifier	 d
=	TokenNameEQUAL	
getDescription	TokenNameIdentifier	 get Description
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
d	TokenNameIdentifier	 d
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
?	TokenNameQUESTION	
getDataTypeName	TokenNameIdentifier	 get Data Type Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
:	TokenNameCOLON	
getDataTypeName	TokenNameIdentifier	 get Data Type Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
" "	TokenNameStringLiteral	 
+	TokenNamePLUS	
d	TokenNameIdentifier	 d
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @since Ant 1.7 * @return a shallow copy of this DataType. * @throws CloneNotSupportedException if there is a problem. */	TokenNameCOMMENT_JAVADOC	 @since Ant 1.7 @return a shallow copy of this DataType. @throws CloneNotSupportedException if there is a problem. 
public	TokenNamepublic	
Object	TokenNameIdentifier	 Object
clone	TokenNameIdentifier	 clone
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
CloneNotSupportedException	TokenNameIdentifier	 Clone Not Supported Exception
{	TokenNameLBRACE	
DataType	TokenNameIdentifier	 Data Type
dt	TokenNameIdentifier	 dt
=	TokenNameEQUAL	
(	TokenNameLPAREN	
DataType	TokenNameIdentifier	 Data Type
)	TokenNameRPAREN	
super	TokenNamesuper	
.	TokenNameDOT	
clone	TokenNameIdentifier	 clone
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
dt	TokenNameIdentifier	 dt
.	TokenNameDOT	
setDescription	TokenNameIdentifier	 set Description
(	TokenNameLPAREN	
getDescription	TokenNameIdentifier	 get Description
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
getRefid	TokenNameIdentifier	 get Refid
(	TokenNameLPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
dt	TokenNameIdentifier	 dt
.	TokenNameDOT	
setRefid	TokenNameIdentifier	 set Refid
(	TokenNameLPAREN	
getRefid	TokenNameIdentifier	 get Refid
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
dt	TokenNameIdentifier	 dt
.	TokenNameDOT	
setChecked	TokenNameIdentifier	 set Checked
(	TokenNameLPAREN	
isChecked	TokenNameIdentifier	 is Checked
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
dt	TokenNameIdentifier	 dt
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
