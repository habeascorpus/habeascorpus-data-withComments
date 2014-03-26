/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the "License"); * you may not use this file except in compliance with the License. * You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/* * $Id: TemplateSubPatternAssociation.java 468643 2006-10-28 06:56:03Z minchau $ */	TokenNameCOMMENT_BLOCK	 $Id: TemplateSubPatternAssociation.java 468643 2006-10-28 06:56:03Z minchau $ 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xalan	TokenNameIdentifier	 xalan
.	TokenNameDOT	
templates	TokenNameIdentifier	 templates
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
Serializable	TokenNameIdentifier	 Serializable
;	TokenNameSEMICOLON	
import	TokenNameimport	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
transform	TokenNameIdentifier	 transform
.	TokenNameDOT	
TransformerException	TokenNameIdentifier	 Transformer Exception
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
utils	TokenNameIdentifier	 utils
.	TokenNameDOT	
QName	TokenNameIdentifier	 Q Name
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xpath	TokenNameIdentifier	 xpath
.	TokenNameDOT	
XPath	TokenNameIdentifier	 X Path
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xpath	TokenNameIdentifier	 xpath
.	TokenNameDOT	
XPathContext	TokenNameIdentifier	 X Path Context
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xpath	TokenNameIdentifier	 xpath
.	TokenNameDOT	
patterns	TokenNameIdentifier	 patterns
.	TokenNameDOT	
StepPattern	TokenNameIdentifier	 Step Pattern
;	TokenNameSEMICOLON	
/** * A class to contain a match pattern and it's corresponding template. * This class also defines a node in a match pattern linked list. */	TokenNameCOMMENT_JAVADOC	 A class to contain a match pattern and it's corresponding template. This class also defines a node in a match pattern linked list. 
class	TokenNameclass	
TemplateSubPatternAssociation	TokenNameIdentifier	 Template Sub Pattern Association
implements	TokenNameimplements	
Serializable	TokenNameIdentifier	 Serializable
,	TokenNameCOMMA	
Cloneable	TokenNameIdentifier	 Cloneable
{	TokenNameLBRACE	
static	TokenNamestatic	
final	TokenNamefinal	
long	TokenNamelong	
serialVersionUID	TokenNameIdentifier	 serial Version UID
=	TokenNameEQUAL	
-	TokenNameMINUS	
8902606755229903350L	TokenNameLongLiteral	
;	TokenNameSEMICOLON	
/** Step pattern */	TokenNameCOMMENT_JAVADOC	 Step pattern 
StepPattern	TokenNameIdentifier	 Step Pattern
m_stepPattern	TokenNameIdentifier	 m step Pattern
;	TokenNameSEMICOLON	
/** Template pattern */	TokenNameCOMMENT_JAVADOC	 Template pattern 
private	TokenNameprivate	
String	TokenNameIdentifier	 String
m_pattern	TokenNameIdentifier	 m pattern
;	TokenNameSEMICOLON	
/** The template element */	TokenNameCOMMENT_JAVADOC	 The template element 
private	TokenNameprivate	
ElemTemplate	TokenNameIdentifier	 Elem Template
m_template	TokenNameIdentifier	 m template
;	TokenNameSEMICOLON	
/** Next pattern */	TokenNameCOMMENT_JAVADOC	 Next pattern 
private	TokenNameprivate	
TemplateSubPatternAssociation	TokenNameIdentifier	 Template Sub Pattern Association
m_next	TokenNameIdentifier	 m next
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
/** Flag indicating whether this is wild card pattern */	TokenNameCOMMENT_JAVADOC	 Flag indicating whether this is wild card pattern 
private	TokenNameprivate	
boolean	TokenNameboolean	
m_wild	TokenNameIdentifier	 m wild
;	TokenNameSEMICOLON	
/** Target string for this match pattern */	TokenNameCOMMENT_JAVADOC	 Target string for this match pattern 
private	TokenNameprivate	
String	TokenNameIdentifier	 String
m_targetString	TokenNameIdentifier	 m target String
;	TokenNameSEMICOLON	
/** * Construct a match pattern from a pattern and template. * @param template The node that contains the template for this pattern. * @param pattern An executable XSLT StepPattern. * @param pat For now a Nodelist that contains old-style element patterns. */	TokenNameCOMMENT_JAVADOC	 Construct a match pattern from a pattern and template. @param template The node that contains the template for this pattern. @param pattern An executable XSLT StepPattern. @param pat For now a Nodelist that contains old-style element patterns. 
TemplateSubPatternAssociation	TokenNameIdentifier	 Template Sub Pattern Association
(	TokenNameLPAREN	
ElemTemplate	TokenNameIdentifier	 Elem Template
template	TokenNameIdentifier	 template
,	TokenNameCOMMA	
StepPattern	TokenNameIdentifier	 Step Pattern
pattern	TokenNameIdentifier	 pattern
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
pat	TokenNameIdentifier	 pat
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_pattern	TokenNameIdentifier	 m pattern
=	TokenNameEQUAL	
pat	TokenNameIdentifier	 pat
;	TokenNameSEMICOLON	
m_template	TokenNameIdentifier	 m template
=	TokenNameEQUAL	
template	TokenNameIdentifier	 template
;	TokenNameSEMICOLON	
m_stepPattern	TokenNameIdentifier	 m step Pattern
=	TokenNameEQUAL	
pattern	TokenNameIdentifier	 pattern
;	TokenNameSEMICOLON	
m_targetString	TokenNameIdentifier	 m target String
=	TokenNameEQUAL	
m_stepPattern	TokenNameIdentifier	 m step Pattern
.	TokenNameDOT	
getTargetString	TokenNameIdentifier	 get Target String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_wild	TokenNameIdentifier	 m wild
=	TokenNameEQUAL	
m_targetString	TokenNameIdentifier	 m target String
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
"*"	TokenNameStringLiteral	*
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Clone this object. * * @return The cloned object. * * @throws CloneNotSupportedException */	TokenNameCOMMENT_JAVADOC	 Clone this object. * @return The cloned object. * @throws CloneNotSupportedException 
public	TokenNamepublic	
Object	TokenNameIdentifier	 Object
clone	TokenNameIdentifier	 clone
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
CloneNotSupportedException	TokenNameIdentifier	 Clone Not Supported Exception
{	TokenNameLBRACE	
TemplateSubPatternAssociation	TokenNameIdentifier	 Template Sub Pattern Association
tspa	TokenNameIdentifier	 tspa
=	TokenNameEQUAL	
(	TokenNameLPAREN	
TemplateSubPatternAssociation	TokenNameIdentifier	 Template Sub Pattern Association
)	TokenNameRPAREN	
super	TokenNamesuper	
.	TokenNameDOT	
clone	TokenNameIdentifier	 clone
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
tspa	TokenNameIdentifier	 tspa
.	TokenNameDOT	
m_next	TokenNameIdentifier	 m next
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
tspa	TokenNameIdentifier	 tspa
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the target string of the pattern. For instance, if the pattern is * "foo/baz/boo[@daba]", this string will be "boo". * * @return The "target" string. */	TokenNameCOMMENT_JAVADOC	 Get the target string of the pattern. For instance, if the pattern is "foo/baz/boo[@daba]", this string will be "boo". * @return The "target" string. 
public	TokenNamepublic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
getTargetString	TokenNameIdentifier	 get Target String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
m_targetString	TokenNameIdentifier	 m target String
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set Target String for this template pattern * * * @param key Target string to set */	TokenNameCOMMENT_JAVADOC	 Set Target String for this template pattern * @param key Target string to set 
public	TokenNamepublic	
void	TokenNamevoid	
setTargetString	TokenNameIdentifier	 set Target String
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_targetString	TokenNameIdentifier	 m target String
=	TokenNameEQUAL	
key	TokenNameIdentifier	 key
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Tell if two modes match according to the rules of XSLT. * * @param m1 mode to match * * @return True if the given mode matches this template's mode */	TokenNameCOMMENT_JAVADOC	 Tell if two modes match according to the rules of XSLT. * @param m1 mode to match * @return True if the given mode matches this template's mode 
boolean	TokenNameboolean	
matchMode	TokenNameIdentifier	 match Mode
(	TokenNameLPAREN	
QName	TokenNameIdentifier	 Q Name
m1	TokenNameIdentifier	 m1
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
matchModes	TokenNameIdentifier	 match Modes
(	TokenNameLPAREN	
m1	TokenNameIdentifier	 m1
,	TokenNameCOMMA	
m_template	TokenNameIdentifier	 m template
.	TokenNameDOT	
getMode	TokenNameIdentifier	 get Mode
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Tell if two modes match according to the rules of XSLT. * * @param m1 First mode to match * @param m2 Second mode to match * * @return True if the two given modes match */	TokenNameCOMMENT_JAVADOC	 Tell if two modes match according to the rules of XSLT. * @param m1 First mode to match @param m2 Second mode to match * @return True if the two given modes match 
private	TokenNameprivate	
boolean	TokenNameboolean	
matchModes	TokenNameIdentifier	 match Modes
(	TokenNameLPAREN	
QName	TokenNameIdentifier	 Q Name
m1	TokenNameIdentifier	 m1
,	TokenNameCOMMA	
QName	TokenNameIdentifier	 Q Name
m2	TokenNameIdentifier	 m2
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
null	TokenNamenull	
==	TokenNameEQUAL_EQUAL	
m1	TokenNameIdentifier	 m1
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
null	TokenNamenull	
==	TokenNameEQUAL_EQUAL	
m2	TokenNameIdentifier	 m2
)	TokenNameRPAREN	
)	TokenNameRPAREN	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
m1	TokenNameIdentifier	 m1
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
m2	TokenNameIdentifier	 m2
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
m1	TokenNameIdentifier	 m1
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
m2	TokenNameIdentifier	 m2
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Return the mode associated with the template. * * * @param xctxt XPath context to use with this template * @param targetNode Target node * @param mode reference, which may be null, to the <a href="http://www.w3.org/TR/xslt#modes">current mode</a>. * @return The mode associated with the template. * * @throws TransformerException */	TokenNameCOMMENT_JAVADOC	 Return the mode associated with the template. * @param xctxt XPath context to use with this template @param targetNode Target node @param mode reference, which may be null, to the <a href="http://www.w3.org/TR/xslt#modes">current mode</a>. @return The mode associated with the template. * @throws TransformerException 
public	TokenNamepublic	
boolean	TokenNameboolean	
matches	TokenNameIdentifier	 matches
(	TokenNameLPAREN	
XPathContext	TokenNameIdentifier	 X Path Context
xctxt	TokenNameIdentifier	 xctxt
,	TokenNameCOMMA	
int	TokenNameint	
targetNode	TokenNameIdentifier	 target Node
,	TokenNameCOMMA	
QName	TokenNameIdentifier	 Q Name
mode	TokenNameIdentifier	 mode
)	TokenNameRPAREN	
throws	TokenNamethrows	
TransformerException	TokenNameIdentifier	 Transformer Exception
{	TokenNameLBRACE	
double	TokenNamedouble	
score	TokenNameIdentifier	 score
=	TokenNameEQUAL	
m_stepPattern	TokenNameIdentifier	 m step Pattern
.	TokenNameDOT	
getMatchScore	TokenNameIdentifier	 get Match Score
(	TokenNameLPAREN	
xctxt	TokenNameIdentifier	 xctxt
,	TokenNameCOMMA	
targetNode	TokenNameIdentifier	 target Node
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
(	TokenNameLPAREN	
XPath	TokenNameIdentifier	 X Path
.	TokenNameDOT	
MATCH_SCORE_NONE	TokenNameIdentifier	 MATCH  SCORE  NONE
!=	TokenNameNOT_EQUAL	
score	TokenNameIdentifier	 score
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
matchModes	TokenNameIdentifier	 match Modes
(	TokenNameLPAREN	
mode	TokenNameIdentifier	 mode
,	TokenNameCOMMA	
m_template	TokenNameIdentifier	 m template
.	TokenNameDOT	
getMode	TokenNameIdentifier	 get Mode
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Tell if the pattern for this association is a wildcard. * * @return true if this pattern is considered to be a wild match. */	TokenNameCOMMENT_JAVADOC	 Tell if the pattern for this association is a wildcard. * @return true if this pattern is considered to be a wild match. 
public	TokenNamepublic	
final	TokenNamefinal	
boolean	TokenNameboolean	
isWild	TokenNameIdentifier	 is Wild
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
m_wild	TokenNameIdentifier	 m wild
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get associated XSLT StepPattern. * * @return An executable StepPattern object, never null. * */	TokenNameCOMMENT_JAVADOC	 Get associated XSLT StepPattern. * @return An executable StepPattern object, never null. 
public	TokenNamepublic	
final	TokenNamefinal	
StepPattern	TokenNameIdentifier	 Step Pattern
getStepPattern	TokenNameIdentifier	 get Step Pattern
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
m_stepPattern	TokenNameIdentifier	 m step Pattern
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the pattern string for diagnostic purposes. * * @return The pattern string for diagnostic purposes. * */	TokenNameCOMMENT_JAVADOC	 Get the pattern string for diagnostic purposes. * @return The pattern string for diagnostic purposes. 
public	TokenNamepublic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
getPattern	TokenNameIdentifier	 get Pattern
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
m_pattern	TokenNameIdentifier	 m pattern
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Return the position of the template in document * order in the stylesheet. * * @return The position of the template in the overall template order. */	TokenNameCOMMENT_JAVADOC	 Return the position of the template in document order in the stylesheet. * @return The position of the template in the overall template order. 
public	TokenNamepublic	
int	TokenNameint	
getDocOrderPos	TokenNameIdentifier	 get Doc Order Pos
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
m_template	TokenNameIdentifier	 m template
.	TokenNameDOT	
getUid	TokenNameIdentifier	 get Uid
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Return the import level associated with the stylesheet into which * this template is composed. * * @return The import level of this template. */	TokenNameCOMMENT_JAVADOC	 Return the import level associated with the stylesheet into which this template is composed. * @return The import level of this template. 
public	TokenNamepublic	
final	TokenNamefinal	
int	TokenNameint	
getImportLevel	TokenNameIdentifier	 get Import Level
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
m_template	TokenNameIdentifier	 m template
.	TokenNameDOT	
getStylesheetComposed	TokenNameIdentifier	 get Stylesheet Composed
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getImportCountComposed	TokenNameIdentifier	 get Import Count Composed
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the assocated xsl:template. * * @return An ElemTemplate, never null. * */	TokenNameCOMMENT_JAVADOC	 Get the assocated xsl:template. * @return An ElemTemplate, never null. 
public	TokenNamepublic	
final	TokenNamefinal	
ElemTemplate	TokenNameIdentifier	 Elem Template
getTemplate	TokenNameIdentifier	 get Template
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
m_template	TokenNameIdentifier	 m template
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the next association. * * @return A valid TemplateSubPatternAssociation, or null. */	TokenNameCOMMENT_JAVADOC	 Get the next association. * @return A valid TemplateSubPatternAssociation, or null. 
public	TokenNamepublic	
final	TokenNamefinal	
TemplateSubPatternAssociation	TokenNameIdentifier	 Template Sub Pattern Association
getNext	TokenNameIdentifier	 get Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
m_next	TokenNameIdentifier	 m next
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set the next element on this association * list, which should be equal or less in priority to * this association, and, if equal priority, should occur * before this template in document order. * * @param mp The next association to score if this one fails. * */	TokenNameCOMMENT_JAVADOC	 Set the next element on this association list, which should be equal or less in priority to this association, and, if equal priority, should occur before this template in document order. * @param mp The next association to score if this one fails. 
public	TokenNamepublic	
void	TokenNamevoid	
setNext	TokenNameIdentifier	 set Next
(	TokenNameLPAREN	
TemplateSubPatternAssociation	TokenNameIdentifier	 Template Sub Pattern Association
mp	TokenNameIdentifier	 mp
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_next	TokenNameIdentifier	 m next
=	TokenNameEQUAL	
mp	TokenNameIdentifier	 mp
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
