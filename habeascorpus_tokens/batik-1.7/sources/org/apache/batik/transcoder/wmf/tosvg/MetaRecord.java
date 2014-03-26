/* Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
batik	TokenNameIdentifier	 batik
.	TokenNameDOT	
transcoder	TokenNameIdentifier	 transcoder
.	TokenNameDOT	
wmf	TokenNameIdentifier	 wmf
.	TokenNameDOT	
tosvg	TokenNameIdentifier	 tosvg
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
List	TokenNameIdentifier	 List
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
ArrayList	TokenNameIdentifier	 Array List
;	TokenNameSEMICOLON	
/** * This is used to keep data while processing WMF-files. * It is tagged with a type and holds a list of Integer-objects. * It seems, it might be rewritten to keep just the plain int-data. * * @author <a href="mailto:bella.robinson@cmis.csiro.au">Bella Robinson</a> * @version $Id: MetaRecord.java 582434 2007-10-06 02:11:51Z cam $ */	TokenNameCOMMENT_JAVADOC	 This is used to keep data while processing WMF-files. It is tagged with a type and holds a list of Integer-objects. It seems, it might be rewritten to keep just the plain int-data. * @author <a href="mailto:bella.robinson@cmis.csiro.au">Bella Robinson</a> @version $Id: MetaRecord.java 582434 2007-10-06 02:11:51Z cam $ 
public	TokenNamepublic	
class	TokenNameclass	
MetaRecord	TokenNameIdentifier	 Meta Record
/*implements Serializable*/	TokenNameCOMMENT_BLOCK	implements Serializable
{	TokenNameLBRACE	
public	TokenNamepublic	
int	TokenNameint	
functionId	TokenNameIdentifier	 function Id
;	TokenNameSEMICOLON	
public	TokenNamepublic	
int	TokenNameint	
numPoints	TokenNameIdentifier	 num Points
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
List	TokenNameIdentifier	 List
ptVector	TokenNameIdentifier	 pt Vector
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
MetaRecord	TokenNameIdentifier	 Meta Record
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
EnsureCapacity	TokenNameIdentifier	 Ensure Capacity
(	TokenNameLPAREN	
int	TokenNameint	
cc	TokenNameIdentifier	 cc
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** * when you are storing Integer-objects, consider using addElement( int ) instead. * @param obj */	TokenNameCOMMENT_JAVADOC	 when you are storing Integer-objects, consider using addElement( int ) instead. @param obj 
public	TokenNamepublic	
void	TokenNamevoid	
AddElement	TokenNameIdentifier	 Add Element
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
obj	TokenNameIdentifier	 obj
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ptVector	TokenNameIdentifier	 pt Vector
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
obj	TokenNameIdentifier	 obj
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * helper method to add int-values. This way we keep the call to new Integer() * in one place, here. * * @param iValue the value to add to ptVector, wrapped in an Integer */	TokenNameCOMMENT_JAVADOC	 helper method to add int-values. This way we keep the call to new Integer() in one place, here. * @param iValue the value to add to ptVector, wrapped in an Integer 
public	TokenNamepublic	
final	TokenNamefinal	
void	TokenNamevoid	
addElement	TokenNameIdentifier	 add Element
(	TokenNameLPAREN	
int	TokenNameint	
iValue	TokenNameIdentifier	 i Value
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ptVector	TokenNameIdentifier	 pt Vector
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
new	TokenNamenew	
Integer	TokenNameIdentifier	 Integer
(	TokenNameLPAREN	
iValue	TokenNameIdentifier	 i Value
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * if you dont really need the Integer-object from this method * it is recommended to use the <code>elementAt()</code>-method instead, * which returns an <code>int</code>. */	TokenNameCOMMENT_JAVADOC	 if you dont really need the Integer-object from this method it is recommended to use the <code>elementAt()</code>-method instead, which returns an <code>int</code>. 
public	TokenNamepublic	
Integer	TokenNameIdentifier	 Integer
ElementAt	TokenNameIdentifier	 Element At
(	TokenNameLPAREN	
int	TokenNameint	
offset	TokenNameIdentifier	 offset
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
Integer	TokenNameIdentifier	 Integer
)	TokenNameRPAREN	
ptVector	TokenNameIdentifier	 pt Vector
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
offset	TokenNameIdentifier	 offset
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * helper-method to return the plain int-value from the record * and save the .intValue()-call at the caller's site. * @param offset of the element to get * @return the intValue of the element at offset */	TokenNameCOMMENT_JAVADOC	 helper-method to return the plain int-value from the record and save the .intValue()-call at the caller's site. @param offset of the element to get @return the intValue of the element at offset 
public	TokenNamepublic	
final	TokenNamefinal	
int	TokenNameint	
elementAt	TokenNameIdentifier	 element At
(	TokenNameLPAREN	
int	TokenNameint	
offset	TokenNameIdentifier	 offset
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
Integer	TokenNameIdentifier	 Integer
)	TokenNameRPAREN	
ptVector	TokenNameIdentifier	 pt Vector
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
offset	TokenNameIdentifier	 offset
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
intValue	TokenNameIdentifier	 int Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** A record that contain byte arrays elements. */	TokenNameCOMMENT_JAVADOC	 A record that contain byte arrays elements. 
public	TokenNamepublic	
static	TokenNamestatic	
class	TokenNameclass	
ByteRecord	TokenNameIdentifier	 Byte Record
extends	TokenNameextends	
MetaRecord	TokenNameIdentifier	 Meta Record
{	TokenNameLBRACE	
public	TokenNamepublic	
final	TokenNamefinal	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
bstr	TokenNameIdentifier	 bstr
;	TokenNameSEMICOLON	
public	TokenNamepublic	
ByteRecord	TokenNameIdentifier	 Byte Record
(	TokenNameLPAREN	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
bstr	TokenNameIdentifier	 bstr
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
bstr	TokenNameIdentifier	 bstr
=	TokenNameEQUAL	
bstr	TokenNameIdentifier	 bstr
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
class	TokenNameclass	
StringRecord	TokenNameIdentifier	 String Record
extends	TokenNameextends	
MetaRecord	TokenNameIdentifier	 Meta Record
/*implements Serializable*/	TokenNameCOMMENT_BLOCK	implements Serializable
{	TokenNameLBRACE	
public	TokenNamepublic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
text	TokenNameIdentifier	 text
;	TokenNameSEMICOLON	
public	TokenNamepublic	
StringRecord	TokenNameIdentifier	 String Record
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
newText	TokenNameIdentifier	 new Text
)	TokenNameRPAREN	
{	TokenNameLBRACE	
text	TokenNameIdentifier	 text
=	TokenNameEQUAL	
newText	TokenNameIdentifier	 new Text
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
