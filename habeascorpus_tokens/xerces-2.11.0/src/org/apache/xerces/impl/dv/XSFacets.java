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
dv	TokenNameIdentifier	 dv
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
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xerces	TokenNameIdentifier	 xerces
.	TokenNameDOT	
impl	TokenNameIdentifier	 impl
.	TokenNameDOT	
xs	TokenNameIdentifier	 xs
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
XSObjectListImpl	TokenNameIdentifier	 XS Object List Impl
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xerces	TokenNameIdentifier	 xerces
.	TokenNameDOT	
xs	TokenNameIdentifier	 xs
.	TokenNameDOT	
XSAnnotation	TokenNameIdentifier	 XS Annotation
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xerces	TokenNameIdentifier	 xerces
.	TokenNameDOT	
xs	TokenNameIdentifier	 xs
.	TokenNameDOT	
XSObjectList	TokenNameIdentifier	 XS Object List
;	TokenNameSEMICOLON	
/** * The class used to pass all facets to {@link XSSimpleType#applyFacets}. * * @xerces.internal * * @author Sandy Gao, IBM * * @version $Id: XSFacets.java 699892 2008-09-28 21:08:27Z mrglavas $ */	TokenNameCOMMENT_JAVADOC	 The class used to pass all facets to {@link XSSimpleType#applyFacets}. * @xerces.internal * @author Sandy Gao, IBM * @version $Id: XSFacets.java 699892 2008-09-28 21:08:27Z mrglavas $ 
public	TokenNamepublic	
class	TokenNameclass	
XSFacets	TokenNameIdentifier	 XS Facets
{	TokenNameLBRACE	
/** * value of length facet. */	TokenNameCOMMENT_JAVADOC	 value of length facet. 
public	TokenNamepublic	
int	TokenNameint	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
/** * value of minLength facet. */	TokenNameCOMMENT_JAVADOC	 value of minLength facet. 
public	TokenNamepublic	
int	TokenNameint	
minLength	TokenNameIdentifier	 min Length
;	TokenNameSEMICOLON	
/** * value of maxLength facet. */	TokenNameCOMMENT_JAVADOC	 value of maxLength facet. 
public	TokenNamepublic	
int	TokenNameint	
maxLength	TokenNameIdentifier	 max Length
;	TokenNameSEMICOLON	
/** * value of whiteSpace facet. */	TokenNameCOMMENT_JAVADOC	 value of whiteSpace facet. 
public	TokenNamepublic	
short	TokenNameshort	
whiteSpace	TokenNameIdentifier	 white Space
;	TokenNameSEMICOLON	
/** * value of totalDigits facet. */	TokenNameCOMMENT_JAVADOC	 value of totalDigits facet. 
public	TokenNamepublic	
int	TokenNameint	
totalDigits	TokenNameIdentifier	 total Digits
;	TokenNameSEMICOLON	
/** * value of fractionDigits facet. */	TokenNameCOMMENT_JAVADOC	 value of fractionDigits facet. 
public	TokenNamepublic	
int	TokenNameint	
fractionDigits	TokenNameIdentifier	 fraction Digits
;	TokenNameSEMICOLON	
/** * string containing value of pattern facet, for multiple patterns values * are ORed together. */	TokenNameCOMMENT_JAVADOC	 string containing value of pattern facet, for multiple patterns values are ORed together. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
pattern	TokenNameIdentifier	 pattern
;	TokenNameSEMICOLON	
/** * Vector containing values of Enumeration facet, as String's. */	TokenNameCOMMENT_JAVADOC	 Vector containing values of Enumeration facet, as String's. 
public	TokenNamepublic	
Vector	TokenNameIdentifier	 Vector
enumeration	TokenNameIdentifier	 enumeration
;	TokenNameSEMICOLON	
/** * An array parallel to "Vector enumeration". It contains namespace context * of each enumeration value. Elements of this vector are NamespaceContext * objects. */	TokenNameCOMMENT_JAVADOC	 An array parallel to "Vector enumeration". It contains namespace context of each enumeration value. Elements of this vector are NamespaceContext objects. 
public	TokenNamepublic	
Vector	TokenNameIdentifier	 Vector
enumNSDecls	TokenNameIdentifier	 enum NS Decls
;	TokenNameSEMICOLON	
/** * value of maxInclusive facet. */	TokenNameCOMMENT_JAVADOC	 value of maxInclusive facet. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
maxInclusive	TokenNameIdentifier	 max Inclusive
;	TokenNameSEMICOLON	
/** * value of maxExclusive facet. */	TokenNameCOMMENT_JAVADOC	 value of maxExclusive facet. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
maxExclusive	TokenNameIdentifier	 max Exclusive
;	TokenNameSEMICOLON	
/** * value of minInclusive facet. */	TokenNameCOMMENT_JAVADOC	 value of minInclusive facet. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
minInclusive	TokenNameIdentifier	 min Inclusive
;	TokenNameSEMICOLON	
/** * value of minExclusive facet. */	TokenNameCOMMENT_JAVADOC	 value of minExclusive facet. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
minExclusive	TokenNameIdentifier	 min Exclusive
;	TokenNameSEMICOLON	
public	TokenNamepublic	
XSAnnotation	TokenNameIdentifier	 XS Annotation
lengthAnnotation	TokenNameIdentifier	 length Annotation
;	TokenNameSEMICOLON	
public	TokenNamepublic	
XSAnnotation	TokenNameIdentifier	 XS Annotation
minLengthAnnotation	TokenNameIdentifier	 min Length Annotation
;	TokenNameSEMICOLON	
public	TokenNamepublic	
XSAnnotation	TokenNameIdentifier	 XS Annotation
maxLengthAnnotation	TokenNameIdentifier	 max Length Annotation
;	TokenNameSEMICOLON	
public	TokenNamepublic	
XSAnnotation	TokenNameIdentifier	 XS Annotation
whiteSpaceAnnotation	TokenNameIdentifier	 white Space Annotation
;	TokenNameSEMICOLON	
public	TokenNamepublic	
XSAnnotation	TokenNameIdentifier	 XS Annotation
totalDigitsAnnotation	TokenNameIdentifier	 total Digits Annotation
;	TokenNameSEMICOLON	
public	TokenNamepublic	
XSAnnotation	TokenNameIdentifier	 XS Annotation
fractionDigitsAnnotation	TokenNameIdentifier	 fraction Digits Annotation
;	TokenNameSEMICOLON	
public	TokenNamepublic	
XSObjectListImpl	TokenNameIdentifier	 XS Object List Impl
patternAnnotations	TokenNameIdentifier	 pattern Annotations
;	TokenNameSEMICOLON	
public	TokenNamepublic	
XSObjectList	TokenNameIdentifier	 XS Object List
enumAnnotations	TokenNameIdentifier	 enum Annotations
;	TokenNameSEMICOLON	
public	TokenNamepublic	
XSAnnotation	TokenNameIdentifier	 XS Annotation
maxInclusiveAnnotation	TokenNameIdentifier	 max Inclusive Annotation
;	TokenNameSEMICOLON	
public	TokenNamepublic	
XSAnnotation	TokenNameIdentifier	 XS Annotation
maxExclusiveAnnotation	TokenNameIdentifier	 max Exclusive Annotation
;	TokenNameSEMICOLON	
public	TokenNamepublic	
XSAnnotation	TokenNameIdentifier	 XS Annotation
minInclusiveAnnotation	TokenNameIdentifier	 min Inclusive Annotation
;	TokenNameSEMICOLON	
public	TokenNamepublic	
XSAnnotation	TokenNameIdentifier	 XS Annotation
minExclusiveAnnotation	TokenNameIdentifier	 min Exclusive Annotation
;	TokenNameSEMICOLON	
public	TokenNamepublic	
void	TokenNamevoid	
reset	TokenNameIdentifier	 reset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
lengthAnnotation	TokenNameIdentifier	 length Annotation
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
minLengthAnnotation	TokenNameIdentifier	 min Length Annotation
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
maxLengthAnnotation	TokenNameIdentifier	 max Length Annotation
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
whiteSpaceAnnotation	TokenNameIdentifier	 white Space Annotation
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
totalDigitsAnnotation	TokenNameIdentifier	 total Digits Annotation
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
fractionDigitsAnnotation	TokenNameIdentifier	 fraction Digits Annotation
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
patternAnnotations	TokenNameIdentifier	 pattern Annotations
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
enumAnnotations	TokenNameIdentifier	 enum Annotations
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
maxInclusiveAnnotation	TokenNameIdentifier	 max Inclusive Annotation
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
maxExclusiveAnnotation	TokenNameIdentifier	 max Exclusive Annotation
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
minInclusiveAnnotation	TokenNameIdentifier	 min Inclusive Annotation
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
minExclusiveAnnotation	TokenNameIdentifier	 min Exclusive Annotation
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
