/* * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xerces	TokenNameIdentifier	 xerces
.	TokenNameDOT	
impl	TokenNameIdentifier	 impl
.	TokenNameDOT	
xs	TokenNameIdentifier	 xs
.	TokenNameDOT	
traversers	TokenNameIdentifier	 traversers
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xerces	TokenNameIdentifier	 xerces
.	TokenNameDOT	
impl	TokenNameIdentifier	 impl
.	TokenNameDOT	
xs	TokenNameIdentifier	 xs
.	TokenNameDOT	
opti	TokenNameIdentifier	 opti
.	TokenNameDOT	
ElementImpl	TokenNameIdentifier	 Element Impl
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
/** * Objects of this class contain the textual representation of * an XML schema annotation as well as information on the location * of the annotation in the document it originated from. * * @xerces.internal * * @author Michael Glavassevich, IBM * @version $Id: XSAnnotationInfo.java 699892 2008-09-28 21:08:27Z mrglavas $ */	TokenNameCOMMENT_JAVADOC	 Objects of this class contain the textual representation of an XML schema annotation as well as information on the location of the annotation in the document it originated from. * @xerces.internal * @author Michael Glavassevich, IBM @version $Id: XSAnnotationInfo.java 699892 2008-09-28 21:08:27Z mrglavas $ 
final	TokenNamefinal	
class	TokenNameclass	
XSAnnotationInfo	TokenNameIdentifier	 XS Annotation Info
{	TokenNameLBRACE	
/** Textual representation of annotation. **/	TokenNameCOMMENT_JAVADOC	 Textual representation of annotation. *
String	TokenNameIdentifier	 String
fAnnotation	TokenNameIdentifier	 f Annotation
;	TokenNameSEMICOLON	
/** Line number of &lt;annotation&gt; element. **/	TokenNameCOMMENT_JAVADOC	 Line number of &lt;annotation&gt; element. *
int	TokenNameint	
fLine	TokenNameIdentifier	 f Line
;	TokenNameSEMICOLON	
/** Column number of &lt;annotation&gt; element. **/	TokenNameCOMMENT_JAVADOC	 Column number of &lt;annotation&gt; element. *
int	TokenNameint	
fColumn	TokenNameIdentifier	 f Column
;	TokenNameSEMICOLON	
/** Character offset of &lt;annotation&gt; element. **/	TokenNameCOMMENT_JAVADOC	 Character offset of &lt;annotation&gt; element. *
int	TokenNameint	
fCharOffset	TokenNameIdentifier	 f Char Offset
;	TokenNameSEMICOLON	
/** Next annotation. **/	TokenNameCOMMENT_JAVADOC	 Next annotation. *
XSAnnotationInfo	TokenNameIdentifier	 XS Annotation Info
next	TokenNameIdentifier	 next
;	TokenNameSEMICOLON	
XSAnnotationInfo	TokenNameIdentifier	 XS Annotation Info
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
annotation	TokenNameIdentifier	 annotation
,	TokenNameCOMMA	
int	TokenNameint	
line	TokenNameIdentifier	 line
,	TokenNameCOMMA	
int	TokenNameint	
column	TokenNameIdentifier	 column
,	TokenNameCOMMA	
int	TokenNameint	
charOffset	TokenNameIdentifier	 char Offset
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fAnnotation	TokenNameIdentifier	 f Annotation
=	TokenNameEQUAL	
annotation	TokenNameIdentifier	 annotation
;	TokenNameSEMICOLON	
fLine	TokenNameIdentifier	 f Line
=	TokenNameEQUAL	
line	TokenNameIdentifier	 line
;	TokenNameSEMICOLON	
fColumn	TokenNameIdentifier	 f Column
=	TokenNameEQUAL	
column	TokenNameIdentifier	 column
;	TokenNameSEMICOLON	
fCharOffset	TokenNameIdentifier	 f Char Offset
=	TokenNameEQUAL	
charOffset	TokenNameIdentifier	 char Offset
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
XSAnnotationInfo	TokenNameIdentifier	 XS Annotation Info
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
annotation	TokenNameIdentifier	 annotation
,	TokenNameCOMMA	
Element	TokenNameIdentifier	 Element
annotationDecl	TokenNameIdentifier	 annotation Decl
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fAnnotation	TokenNameIdentifier	 f Annotation
=	TokenNameEQUAL	
annotation	TokenNameIdentifier	 annotation
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
annotationDecl	TokenNameIdentifier	 annotation Decl
instanceof	TokenNameinstanceof	
ElementImpl	TokenNameIdentifier	 Element Impl
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
ElementImpl	TokenNameIdentifier	 Element Impl
annotationDeclImpl	TokenNameIdentifier	 annotation Decl Impl
=	TokenNameEQUAL	
(	TokenNameLPAREN	
ElementImpl	TokenNameIdentifier	 Element Impl
)	TokenNameRPAREN	
annotationDecl	TokenNameIdentifier	 annotation Decl
;	TokenNameSEMICOLON	
fLine	TokenNameIdentifier	 f Line
=	TokenNameEQUAL	
annotationDeclImpl	TokenNameIdentifier	 annotation Decl Impl
.	TokenNameDOT	
getLineNumber	TokenNameIdentifier	 get Line Number
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fColumn	TokenNameIdentifier	 f Column
=	TokenNameEQUAL	
annotationDeclImpl	TokenNameIdentifier	 annotation Decl Impl
.	TokenNameDOT	
getColumnNumber	TokenNameIdentifier	 get Column Number
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fCharOffset	TokenNameIdentifier	 f Char Offset
=	TokenNameEQUAL	
annotationDeclImpl	TokenNameIdentifier	 annotation Decl Impl
.	TokenNameDOT	
getCharacterOffset	TokenNameIdentifier	 get Character Offset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
fLine	TokenNameIdentifier	 f Line
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
fColumn	TokenNameIdentifier	 f Column
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
fCharOffset	TokenNameIdentifier	 f Char Offset
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// XSAnnotationInfo 	TokenNameCOMMENT_LINE	XSAnnotationInfo 
