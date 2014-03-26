/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the "License"); * you may not use this file except in compliance with the License. * You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/* * $Id: NodeTest.java 468655 2006-10-28 07:12:06Z minchau $ */	TokenNameCOMMENT_BLOCK	 $Id: NodeTest.java 468655 2006-10-28 07:12:06Z minchau $ 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xpath	TokenNameIdentifier	 xpath
.	TokenNameDOT	
patterns	TokenNameIdentifier	 patterns
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
dtm	TokenNameIdentifier	 dtm
.	TokenNameDOT	
DTM	TokenNameIdentifier	 DTM
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
dtm	TokenNameIdentifier	 dtm
.	TokenNameDOT	
DTMFilter	TokenNameIdentifier	 DTM Filter
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xpath	TokenNameIdentifier	 xpath
.	TokenNameDOT	
Expression	TokenNameIdentifier	 Expression
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xpath	TokenNameIdentifier	 xpath
.	TokenNameDOT	
ExpressionOwner	TokenNameIdentifier	 Expression Owner
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
XPathVisitor	TokenNameIdentifier	 X Path Visitor
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xpath	TokenNameIdentifier	 xpath
.	TokenNameDOT	
objects	TokenNameIdentifier	 objects
.	TokenNameDOT	
XNumber	TokenNameIdentifier	 X Number
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xpath	TokenNameIdentifier	 xpath
.	TokenNameDOT	
objects	TokenNameIdentifier	 objects
.	TokenNameDOT	
XObject	TokenNameIdentifier	 X Object
;	TokenNameSEMICOLON	
/** * This is the basic node test class for both match patterns and location path * steps. * @xsl.usage advanced */	TokenNameCOMMENT_JAVADOC	 This is the basic node test class for both match patterns and location path steps. @xsl.usage advanced 
public	TokenNamepublic	
class	TokenNameclass	
NodeTest	TokenNameIdentifier	 Node Test
extends	TokenNameextends	
Expression	TokenNameIdentifier	 Expression
{	TokenNameLBRACE	
static	TokenNamestatic	
final	TokenNamefinal	
long	TokenNamelong	
serialVersionUID	TokenNameIdentifier	 serial Version UID
=	TokenNameEQUAL	
-	TokenNameMINUS	
5736721866747906182L	TokenNameLongLiteral	
;	TokenNameSEMICOLON	
/** * The namespace or local name for node tests with a wildcard. * @see <a href="http://www.w3.org/TR/xpath#NT-NameTest">the XPath NameTest production.</a> */	TokenNameCOMMENT_JAVADOC	 The namespace or local name for node tests with a wildcard. @see <a href="http://www.w3.org/TR/xpath#NT-NameTest">the XPath NameTest production.</a> 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
WILD	TokenNameIdentifier	 WILD
=	TokenNameEQUAL	
"*"	TokenNameStringLiteral	*
;	TokenNameSEMICOLON	
/** * The URL to pass to the Node#supports method, to see if the * DOM has already been stripped of whitespace nodes. */	TokenNameCOMMENT_JAVADOC	 The URL to pass to the Node#supports method, to see if the DOM has already been stripped of whitespace nodes. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
SUPPORTS_PRE_STRIPPING	TokenNameIdentifier	 SUPPORTS  PRE  STRIPPING
=	TokenNameEQUAL	
"http://xml.apache.org/xpath/features/whitespace-pre-stripping"	TokenNameStringLiteral	http://xml.apache.org/xpath/features/whitespace-pre-stripping
;	TokenNameSEMICOLON	
/** * This attribute determines which node types are accepted. * @serial */	TokenNameCOMMENT_JAVADOC	 This attribute determines which node types are accepted. @serial 
protected	TokenNameprotected	
int	TokenNameint	
m_whatToShow	TokenNameIdentifier	 m what To Show
;	TokenNameSEMICOLON	
/** * Special bitmap for match patterns starting with a function. * Make sure this does not conflict with {@link org.w3c.dom.traversal.NodeFilter}. */	TokenNameCOMMENT_JAVADOC	 Special bitmap for match patterns starting with a function. Make sure this does not conflict with {@link org.w3c.dom.traversal.NodeFilter}. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
SHOW_BYFUNCTION	TokenNameIdentifier	 SHOW  BYFUNCTION
=	TokenNameEQUAL	
0x00010000	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * This attribute determines which node types are accepted. * These constants are defined in the {@link org.w3c.dom.traversal.NodeFilter} * interface. * * @return bitset mainly defined in {@link org.w3c.dom.traversal.NodeFilter}. */	TokenNameCOMMENT_JAVADOC	 This attribute determines which node types are accepted. These constants are defined in the {@link org.w3c.dom.traversal.NodeFilter} interface. * @return bitset mainly defined in {@link org.w3c.dom.traversal.NodeFilter}. 
public	TokenNamepublic	
int	TokenNameint	
getWhatToShow	TokenNameIdentifier	 get What To Show
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
m_whatToShow	TokenNameIdentifier	 m what To Show
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * This attribute determines which node types are accepted. * These constants are defined in the {@link org.w3c.dom.traversal.NodeFilter} * interface. * * @param what bitset mainly defined in {@link org.w3c.dom.traversal.NodeFilter}. */	TokenNameCOMMENT_JAVADOC	 This attribute determines which node types are accepted. These constants are defined in the {@link org.w3c.dom.traversal.NodeFilter} interface. * @param what bitset mainly defined in {@link org.w3c.dom.traversal.NodeFilter}. 
public	TokenNamepublic	
void	TokenNamevoid	
setWhatToShow	TokenNameIdentifier	 set What To Show
(	TokenNameLPAREN	
int	TokenNameint	
what	TokenNameIdentifier	 what
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_whatToShow	TokenNameIdentifier	 m what To Show
=	TokenNameEQUAL	
what	TokenNameIdentifier	 what
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * The namespace to be tested for, which may be null. * @serial */	TokenNameCOMMENT_JAVADOC	 The namespace to be tested for, which may be null. @serial 
String	TokenNameIdentifier	 String
m_namespace	TokenNameIdentifier	 m namespace
;	TokenNameSEMICOLON	
/** * Return the namespace to be tested. * * @return The namespace to be tested for, or {@link #WILD}, or null. */	TokenNameCOMMENT_JAVADOC	 Return the namespace to be tested. * @return The namespace to be tested for, or {@link #WILD}, or null. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getNamespace	TokenNameIdentifier	 get Namespace
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
m_namespace	TokenNameIdentifier	 m namespace
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set the namespace to be tested. * * @param ns The namespace to be tested for, or {@link #WILD}, or null. */	TokenNameCOMMENT_JAVADOC	 Set the namespace to be tested. * @param ns The namespace to be tested for, or {@link #WILD}, or null. 
public	TokenNamepublic	
void	TokenNamevoid	
setNamespace	TokenNameIdentifier	 set Namespace
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
ns	TokenNameIdentifier	 ns
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_namespace	TokenNameIdentifier	 m namespace
=	TokenNameEQUAL	
ns	TokenNameIdentifier	 ns
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * The local name to be tested for. * @serial */	TokenNameCOMMENT_JAVADOC	 The local name to be tested for. @serial 
protected	TokenNameprotected	
String	TokenNameIdentifier	 String
m_name	TokenNameIdentifier	 m name
;	TokenNameSEMICOLON	
/** * Return the local name to be tested. * * @return the local name to be tested, or {@link #WILD}, or an empty string. */	TokenNameCOMMENT_JAVADOC	 Return the local name to be tested. * @return the local name to be tested, or {@link #WILD}, or an empty string. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getLocalName	TokenNameIdentifier	 get Local Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
null	TokenNamenull	
==	TokenNameEQUAL_EQUAL	
m_name	TokenNameIdentifier	 m name
)	TokenNameRPAREN	
?	TokenNameQUESTION	
""	TokenNameStringLiteral	 
:	TokenNameCOLON	
m_name	TokenNameIdentifier	 m name
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set the local name to be tested. * * @param name the local name to be tested, or {@link #WILD}, or an empty string. */	TokenNameCOMMENT_JAVADOC	 Set the local name to be tested. * @param name the local name to be tested, or {@link #WILD}, or an empty string. 
public	TokenNamepublic	
void	TokenNamevoid	
setLocalName	TokenNameIdentifier	 set Local Name
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_name	TokenNameIdentifier	 m name
=	TokenNameEQUAL	
name	TokenNameIdentifier	 name
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Statically calculated score for this test. One of * {@link #SCORE_NODETEST}, * {@link #SCORE_NONE}, * {@link #SCORE_NSWILD}, * {@link #SCORE_QNAME}, or * {@link #SCORE_OTHER}. * @serial */	TokenNameCOMMENT_JAVADOC	 Statically calculated score for this test. One of {@link #SCORE_NODETEST}, {@link #SCORE_NONE}, {@link #SCORE_NSWILD}, {@link #SCORE_QNAME}, or {@link #SCORE_OTHER}. @serial 
XNumber	TokenNameIdentifier	 X Number
m_score	TokenNameIdentifier	 m score
;	TokenNameSEMICOLON	
/** * The match score if the pattern consists of just a NodeTest. * @see <a href="http://www.w3.org/TR/xslt#conflict">XSLT Specification - 5.5 Conflict Resolution for Template Rules</a> */	TokenNameCOMMENT_JAVADOC	 The match score if the pattern consists of just a NodeTest. @see <a href="http://www.w3.org/TR/xslt#conflict">XSLT Specification - 5.5 Conflict Resolution for Template Rules</a> 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
XNumber	TokenNameIdentifier	 X Number
SCORE_NODETEST	TokenNameIdentifier	 SCORE  NODETEST
=	TokenNameEQUAL	
new	TokenNamenew	
XNumber	TokenNameIdentifier	 X Number
(	TokenNameLPAREN	
XPath	TokenNameIdentifier	 X Path
.	TokenNameDOT	
MATCH_SCORE_NODETEST	TokenNameIdentifier	 MATCH  SCORE  NODETEST
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * The match score if the pattern pattern has the form NCName:*. * @see <a href="http://www.w3.org/TR/xslt#conflict">XSLT Specification - 5.5 Conflict Resolution for Template Rules</a> */	TokenNameCOMMENT_JAVADOC	 The match score if the pattern pattern has the form NCName:*. @see <a href="http://www.w3.org/TR/xslt#conflict">XSLT Specification - 5.5 Conflict Resolution for Template Rules</a> 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
XNumber	TokenNameIdentifier	 X Number
SCORE_NSWILD	TokenNameIdentifier	 SCORE  NSWILD
=	TokenNameEQUAL	
new	TokenNamenew	
XNumber	TokenNameIdentifier	 X Number
(	TokenNameLPAREN	
XPath	TokenNameIdentifier	 X Path
.	TokenNameDOT	
MATCH_SCORE_NSWILD	TokenNameIdentifier	 MATCH  SCORE  NSWILD
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * The match score if the pattern has the form * of a QName optionally preceded by an @ character. * @see <a href="http://www.w3.org/TR/xslt#conflict">XSLT Specification - 5.5 Conflict Resolution for Template Rules</a> */	TokenNameCOMMENT_JAVADOC	 The match score if the pattern has the form of a QName optionally preceded by an @ character. @see <a href="http://www.w3.org/TR/xslt#conflict">XSLT Specification - 5.5 Conflict Resolution for Template Rules</a> 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
XNumber	TokenNameIdentifier	 X Number
SCORE_QNAME	TokenNameIdentifier	 SCORE  QNAME
=	TokenNameEQUAL	
new	TokenNamenew	
XNumber	TokenNameIdentifier	 X Number
(	TokenNameLPAREN	
XPath	TokenNameIdentifier	 X Path
.	TokenNameDOT	
MATCH_SCORE_QNAME	TokenNameIdentifier	 MATCH  SCORE  QNAME
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * The match score if the pattern consists of something * other than just a NodeTest or just a qname. * @see <a href="http://www.w3.org/TR/xslt#conflict">XSLT Specification - 5.5 Conflict Resolution for Template Rules</a> */	TokenNameCOMMENT_JAVADOC	 The match score if the pattern consists of something other than just a NodeTest or just a qname. @see <a href="http://www.w3.org/TR/xslt#conflict">XSLT Specification - 5.5 Conflict Resolution for Template Rules</a> 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
XNumber	TokenNameIdentifier	 X Number
SCORE_OTHER	TokenNameIdentifier	 SCORE  OTHER
=	TokenNameEQUAL	
new	TokenNamenew	
XNumber	TokenNameIdentifier	 X Number
(	TokenNameLPAREN	
XPath	TokenNameIdentifier	 X Path
.	TokenNameDOT	
MATCH_SCORE_OTHER	TokenNameIdentifier	 MATCH  SCORE  OTHER
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * The match score if no match is made. * @see <a href="http://www.w3.org/TR/xslt#conflict">XSLT Specification - 5.5 Conflict Resolution for Template Rules</a> */	TokenNameCOMMENT_JAVADOC	 The match score if no match is made. @see <a href="http://www.w3.org/TR/xslt#conflict">XSLT Specification - 5.5 Conflict Resolution for Template Rules</a> 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
XNumber	TokenNameIdentifier	 X Number
SCORE_NONE	TokenNameIdentifier	 SCORE  NONE
=	TokenNameEQUAL	
new	TokenNamenew	
XNumber	TokenNameIdentifier	 X Number
(	TokenNameLPAREN	
XPath	TokenNameIdentifier	 X Path
.	TokenNameDOT	
MATCH_SCORE_NONE	TokenNameIdentifier	 MATCH  SCORE  NONE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Construct an NodeTest that tests for namespaces and node names. * * * @param whatToShow Bit set defined mainly by {@link org.w3c.dom.traversal.NodeFilter}. * @param namespace The namespace to be tested. * @param name The local name to be tested. */	TokenNameCOMMENT_JAVADOC	 Construct an NodeTest that tests for namespaces and node names. * @param whatToShow Bit set defined mainly by {@link org.w3c.dom.traversal.NodeFilter}. @param namespace The namespace to be tested. @param name The local name to be tested. 
public	TokenNamepublic	
NodeTest	TokenNameIdentifier	 Node Test
(	TokenNameLPAREN	
int	TokenNameint	
whatToShow	TokenNameIdentifier	 what To Show
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
namespace	TokenNameIdentifier	 namespace
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
initNodeTest	TokenNameIdentifier	 init Node Test
(	TokenNameLPAREN	
whatToShow	TokenNameIdentifier	 what To Show
,	TokenNameCOMMA	
namespace	TokenNameIdentifier	 namespace
,	TokenNameCOMMA	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Construct an NodeTest that doesn't test for node names. * * * @param whatToShow Bit set defined mainly by {@link org.w3c.dom.traversal.NodeFilter}. */	TokenNameCOMMENT_JAVADOC	 Construct an NodeTest that doesn't test for node names. * @param whatToShow Bit set defined mainly by {@link org.w3c.dom.traversal.NodeFilter}. 
public	TokenNamepublic	
NodeTest	TokenNameIdentifier	 Node Test
(	TokenNameLPAREN	
int	TokenNameint	
whatToShow	TokenNameIdentifier	 what To Show
)	TokenNameRPAREN	
{	TokenNameLBRACE	
initNodeTest	TokenNameIdentifier	 init Node Test
(	TokenNameLPAREN	
whatToShow	TokenNameIdentifier	 what To Show
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @see Expression#deepEquals(Expression) */	TokenNameCOMMENT_JAVADOC	 @see Expression#deepEquals(Expression) 
public	TokenNamepublic	
boolean	TokenNameboolean	
deepEquals	TokenNameIdentifier	 deep Equals
(	TokenNameLPAREN	
Expression	TokenNameIdentifier	 Expression
expr	TokenNameIdentifier	 expr
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
isSameClass	TokenNameIdentifier	 is Same Class
(	TokenNameLPAREN	
expr	TokenNameIdentifier	 expr
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
NodeTest	TokenNameIdentifier	 Node Test
nt	TokenNameIdentifier	 nt
=	TokenNameEQUAL	
(	TokenNameLPAREN	
NodeTest	TokenNameIdentifier	 Node Test
)	TokenNameRPAREN	
expr	TokenNameIdentifier	 expr
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
nt	TokenNameIdentifier	 nt
.	TokenNameDOT	
m_name	TokenNameIdentifier	 m name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
==	TokenNameEQUAL_EQUAL	
m_name	TokenNameIdentifier	 m name
)	TokenNameRPAREN	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
nt	TokenNameIdentifier	 nt
.	TokenNameDOT	
m_name	TokenNameIdentifier	 m name
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
m_name	TokenNameIdentifier	 m name
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
m_name	TokenNameIdentifier	 m name
)	TokenNameRPAREN	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
nt	TokenNameIdentifier	 nt
.	TokenNameDOT	
m_namespace	TokenNameIdentifier	 m namespace
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
==	TokenNameEQUAL_EQUAL	
m_namespace	TokenNameIdentifier	 m namespace
)	TokenNameRPAREN	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
nt	TokenNameIdentifier	 nt
.	TokenNameDOT	
m_namespace	TokenNameIdentifier	 m namespace
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
m_namespace	TokenNameIdentifier	 m namespace
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
m_namespace	TokenNameIdentifier	 m namespace
)	TokenNameRPAREN	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
m_whatToShow	TokenNameIdentifier	 m what To Show
!=	TokenNameNOT_EQUAL	
nt	TokenNameIdentifier	 nt
.	TokenNameDOT	
m_whatToShow	TokenNameIdentifier	 m what To Show
)	TokenNameRPAREN	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
m_isTotallyWild	TokenNameIdentifier	 m is Totally Wild
!=	TokenNameNOT_EQUAL	
nt	TokenNameIdentifier	 nt
.	TokenNameDOT	
m_isTotallyWild	TokenNameIdentifier	 m is Totally Wild
)	TokenNameRPAREN	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Null argument constructor. */	TokenNameCOMMENT_JAVADOC	 Null argument constructor. 
public	TokenNamepublic	
NodeTest	TokenNameIdentifier	 Node Test
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** * Initialize this node test by setting the whatToShow property, and * calculating the score that this test will return if a test succeeds. * * * @param whatToShow Bit set defined mainly by {@link org.w3c.dom.traversal.NodeFilter}. */	TokenNameCOMMENT_JAVADOC	 Initialize this node test by setting the whatToShow property, and calculating the score that this test will return if a test succeeds. * @param whatToShow Bit set defined mainly by {@link org.w3c.dom.traversal.NodeFilter}. 
public	TokenNamepublic	
void	TokenNamevoid	
initNodeTest	TokenNameIdentifier	 init Node Test
(	TokenNameLPAREN	
int	TokenNameint	
whatToShow	TokenNameIdentifier	 what To Show
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_whatToShow	TokenNameIdentifier	 m what To Show
=	TokenNameEQUAL	
whatToShow	TokenNameIdentifier	 what To Show
;	TokenNameSEMICOLON	
calcScore	TokenNameIdentifier	 calc Score
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Initialize this node test by setting the whatToShow property and the * namespace and local name, and * calculating the score that this test will return if a test succeeds. * * * @param whatToShow Bit set defined mainly by {@link org.w3c.dom.traversal.NodeFilter}. * @param namespace The namespace to be tested. * @param name The local name to be tested. */	TokenNameCOMMENT_JAVADOC	 Initialize this node test by setting the whatToShow property and the namespace and local name, and calculating the score that this test will return if a test succeeds. * @param whatToShow Bit set defined mainly by {@link org.w3c.dom.traversal.NodeFilter}. @param namespace The namespace to be tested. @param name The local name to be tested. 
public	TokenNamepublic	
void	TokenNamevoid	
initNodeTest	TokenNameIdentifier	 init Node Test
(	TokenNameLPAREN	
int	TokenNameint	
whatToShow	TokenNameIdentifier	 what To Show
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
namespace	TokenNameIdentifier	 namespace
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_whatToShow	TokenNameIdentifier	 m what To Show
=	TokenNameEQUAL	
whatToShow	TokenNameIdentifier	 what To Show
;	TokenNameSEMICOLON	
m_namespace	TokenNameIdentifier	 m namespace
=	TokenNameEQUAL	
namespace	TokenNameIdentifier	 namespace
;	TokenNameSEMICOLON	
m_name	TokenNameIdentifier	 m name
=	TokenNameEQUAL	
name	TokenNameIdentifier	 name
;	TokenNameSEMICOLON	
calcScore	TokenNameIdentifier	 calc Score
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * True if this test has a null namespace and a local name of {@link #WILD}. * @serial */	TokenNameCOMMENT_JAVADOC	 True if this test has a null namespace and a local name of {@link #WILD}. @serial 
private	TokenNameprivate	
boolean	TokenNameboolean	
m_isTotallyWild	TokenNameIdentifier	 m is Totally Wild
;	TokenNameSEMICOLON	
/** * Get the static score for this node test. * @return Should be one of the SCORE_XXX constants. */	TokenNameCOMMENT_JAVADOC	 Get the static score for this node test. @return Should be one of the SCORE_XXX constants. 
public	TokenNamepublic	
XNumber	TokenNameIdentifier	 X Number
getStaticScore	TokenNameIdentifier	 get Static Score
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
m_score	TokenNameIdentifier	 m score
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set the static score for this node test. * @param score Should be one of the SCORE_XXX constants. */	TokenNameCOMMENT_JAVADOC	 Set the static score for this node test. @param score Should be one of the SCORE_XXX constants. 
public	TokenNamepublic	
void	TokenNamevoid	
setStaticScore	TokenNameIdentifier	 set Static Score
(	TokenNameLPAREN	
XNumber	TokenNameIdentifier	 X Number
score	TokenNameIdentifier	 score
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_score	TokenNameIdentifier	 m score
=	TokenNameEQUAL	
score	TokenNameIdentifier	 score
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Static calc of match score. */	TokenNameCOMMENT_JAVADOC	 Static calc of match score. 
protected	TokenNameprotected	
void	TokenNamevoid	
calcScore	TokenNameIdentifier	 calc Score
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
m_namespace	TokenNameIdentifier	 m namespace
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
m_name	TokenNameIdentifier	 m name
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
m_score	TokenNameIdentifier	 m score
=	TokenNameEQUAL	
SCORE_NODETEST	TokenNameIdentifier	 SCORE  NODETEST
;	TokenNameSEMICOLON	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
m_namespace	TokenNameIdentifier	 m namespace
==	TokenNameEQUAL_EQUAL	
WILD	TokenNameIdentifier	 WILD
)	TokenNameRPAREN	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
m_namespace	TokenNameIdentifier	 m namespace
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
m_name	TokenNameIdentifier	 m name
==	TokenNameEQUAL_EQUAL	
WILD	TokenNameIdentifier	 WILD
)	TokenNameRPAREN	
)	TokenNameRPAREN	
m_score	TokenNameIdentifier	 m score
=	TokenNameEQUAL	
SCORE_NODETEST	TokenNameIdentifier	 SCORE  NODETEST
;	TokenNameSEMICOLON	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
m_namespace	TokenNameIdentifier	 m namespace
!=	TokenNameNOT_EQUAL	
WILD	TokenNameIdentifier	 WILD
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
m_name	TokenNameIdentifier	 m name
==	TokenNameEQUAL_EQUAL	
WILD	TokenNameIdentifier	 WILD
)	TokenNameRPAREN	
)	TokenNameRPAREN	
m_score	TokenNameIdentifier	 m score
=	TokenNameEQUAL	
SCORE_NSWILD	TokenNameIdentifier	 SCORE  NSWILD
;	TokenNameSEMICOLON	
else	TokenNameelse	
m_score	TokenNameIdentifier	 m score
=	TokenNameEQUAL	
SCORE_QNAME	TokenNameIdentifier	 SCORE  QNAME
;	TokenNameSEMICOLON	
m_isTotallyWild	TokenNameIdentifier	 m is Totally Wild
=	TokenNameEQUAL	
(	TokenNameLPAREN	
m_namespace	TokenNameIdentifier	 m namespace
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
m_name	TokenNameIdentifier	 m name
==	TokenNameEQUAL_EQUAL	
WILD	TokenNameIdentifier	 WILD
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the score that this test will return if a test succeeds. * * * @return the score that this test will return if a test succeeds. */	TokenNameCOMMENT_JAVADOC	 Get the score that this test will return if a test succeeds. * @return the score that this test will return if a test succeeds. 
public	TokenNamepublic	
double	TokenNamedouble	
getDefaultScore	TokenNameIdentifier	 get Default Score
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
m_score	TokenNameIdentifier	 m score
.	TokenNameDOT	
num	TokenNameIdentifier	 num
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Tell what node type to test, if not DTMFilter.SHOW_ALL. * * @param whatToShow Bit set defined mainly by * {@link org.apache.xml.dtm.DTMFilter}. * @return the node type for the whatToShow. Since whatToShow can specify * multiple types, it will return the first bit tested that is on, * so the caller of this function should take care that this is * the function they really want to call. If none of the known bits * are set, this function will return zero. */	TokenNameCOMMENT_JAVADOC	 Tell what node type to test, if not DTMFilter.SHOW_ALL. * @param whatToShow Bit set defined mainly by {@link org.apache.xml.dtm.DTMFilter}. @return the node type for the whatToShow. Since whatToShow can specify multiple types, it will return the first bit tested that is on, so the caller of this function should take care that this is the function they really want to call. If none of the known bits are set, this function will return zero. 
public	TokenNamepublic	
static	TokenNamestatic	
int	TokenNameint	
getNodeTypeTest	TokenNameIdentifier	 get Node Type Test
(	TokenNameLPAREN	
int	TokenNameint	
whatToShow	TokenNameIdentifier	 what To Show
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// %REVIEW% Is there a better way? 	TokenNameCOMMENT_LINE	%REVIEW% Is there a better way? 
if	TokenNameif	
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
!=	TokenNameNOT_EQUAL	
(	TokenNameLPAREN	
whatToShow	TokenNameIdentifier	 what To Show
&	TokenNameAND	
DTMFilter	TokenNameIdentifier	 DTM Filter
.	TokenNameDOT	
SHOW_ELEMENT	TokenNameIdentifier	 SHOW  ELEMENT
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
ELEMENT_NODE	TokenNameIdentifier	 ELEMENT  NODE
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
!=	TokenNameNOT_EQUAL	
(	TokenNameLPAREN	
whatToShow	TokenNameIdentifier	 what To Show
&	TokenNameAND	
DTMFilter	TokenNameIdentifier	 DTM Filter
.	TokenNameDOT	
SHOW_ATTRIBUTE	TokenNameIdentifier	 SHOW  ATTRIBUTE
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
ATTRIBUTE_NODE	TokenNameIdentifier	 ATTRIBUTE  NODE
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
!=	TokenNameNOT_EQUAL	
(	TokenNameLPAREN	
whatToShow	TokenNameIdentifier	 what To Show
&	TokenNameAND	
DTMFilter	TokenNameIdentifier	 DTM Filter
.	TokenNameDOT	
SHOW_TEXT	TokenNameIdentifier	 SHOW  TEXT
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
TEXT_NODE	TokenNameIdentifier	 TEXT  NODE
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
!=	TokenNameNOT_EQUAL	
(	TokenNameLPAREN	
whatToShow	TokenNameIdentifier	 what To Show
&	TokenNameAND	
DTMFilter	TokenNameIdentifier	 DTM Filter
.	TokenNameDOT	
SHOW_DOCUMENT	TokenNameIdentifier	 SHOW  DOCUMENT
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
DOCUMENT_NODE	TokenNameIdentifier	 DOCUMENT  NODE
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
!=	TokenNameNOT_EQUAL	
(	TokenNameLPAREN	
whatToShow	TokenNameIdentifier	 what To Show
&	TokenNameAND	
DTMFilter	TokenNameIdentifier	 DTM Filter
.	TokenNameDOT	
SHOW_DOCUMENT_FRAGMENT	TokenNameIdentifier	 SHOW  DOCUMENT  FRAGMENT
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
DOCUMENT_FRAGMENT_NODE	TokenNameIdentifier	 DOCUMENT  FRAGMENT  NODE
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
!=	TokenNameNOT_EQUAL	
(	TokenNameLPAREN	
whatToShow	TokenNameIdentifier	 what To Show
&	TokenNameAND	
DTMFilter	TokenNameIdentifier	 DTM Filter
.	TokenNameDOT	
SHOW_NAMESPACE	TokenNameIdentifier	 SHOW  NAMESPACE
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
NAMESPACE_NODE	TokenNameIdentifier	 NAMESPACE  NODE
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
!=	TokenNameNOT_EQUAL	
(	TokenNameLPAREN	
whatToShow	TokenNameIdentifier	 what To Show
&	TokenNameAND	
DTMFilter	TokenNameIdentifier	 DTM Filter
.	TokenNameDOT	
SHOW_COMMENT	TokenNameIdentifier	 SHOW  COMMENT
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
COMMENT_NODE	TokenNameIdentifier	 COMMENT  NODE
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
!=	TokenNameNOT_EQUAL	
(	TokenNameLPAREN	
whatToShow	TokenNameIdentifier	 what To Show
&	TokenNameAND	
DTMFilter	TokenNameIdentifier	 DTM Filter
.	TokenNameDOT	
SHOW_PROCESSING_INSTRUCTION	TokenNameIdentifier	 SHOW  PROCESSING  INSTRUCTION
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
PROCESSING_INSTRUCTION_NODE	TokenNameIdentifier	 PROCESSING  INSTRUCTION  NODE
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
!=	TokenNameNOT_EQUAL	
(	TokenNameLPAREN	
whatToShow	TokenNameIdentifier	 what To Show
&	TokenNameAND	
DTMFilter	TokenNameIdentifier	 DTM Filter
.	TokenNameDOT	
SHOW_DOCUMENT_TYPE	TokenNameIdentifier	 SHOW  DOCUMENT  TYPE
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
DOCUMENT_TYPE_NODE	TokenNameIdentifier	 DOCUMENT  TYPE  NODE
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
!=	TokenNameNOT_EQUAL	
(	TokenNameLPAREN	
whatToShow	TokenNameIdentifier	 what To Show
&	TokenNameAND	
DTMFilter	TokenNameIdentifier	 DTM Filter
.	TokenNameDOT	
SHOW_ENTITY	TokenNameIdentifier	 SHOW  ENTITY
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
ENTITY_NODE	TokenNameIdentifier	 ENTITY  NODE
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
!=	TokenNameNOT_EQUAL	
(	TokenNameLPAREN	
whatToShow	TokenNameIdentifier	 what To Show
&	TokenNameAND	
DTMFilter	TokenNameIdentifier	 DTM Filter
.	TokenNameDOT	
SHOW_ENTITY_REFERENCE	TokenNameIdentifier	 SHOW  ENTITY  REFERENCE
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
ENTITY_REFERENCE_NODE	TokenNameIdentifier	 ENTITY  REFERENCE  NODE
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
!=	TokenNameNOT_EQUAL	
(	TokenNameLPAREN	
whatToShow	TokenNameIdentifier	 what To Show
&	TokenNameAND	
DTMFilter	TokenNameIdentifier	 DTM Filter
.	TokenNameDOT	
SHOW_NOTATION	TokenNameIdentifier	 SHOW  NOTATION
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
NOTATION_NODE	TokenNameIdentifier	 NOTATION  NODE
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
!=	TokenNameNOT_EQUAL	
(	TokenNameLPAREN	
whatToShow	TokenNameIdentifier	 what To Show
&	TokenNameAND	
DTMFilter	TokenNameIdentifier	 DTM Filter
.	TokenNameDOT	
SHOW_CDATA_SECTION	TokenNameIdentifier	 SHOW  CDATA  SECTION
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
CDATA_SECTION_NODE	TokenNameIdentifier	 CDATA  SECTION  NODE
;	TokenNameSEMICOLON	
return	TokenNamereturn	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Do a diagnostics dump of a whatToShow bit set. * * * @param whatToShow Bit set defined mainly by * {@link org.apache.xml.dtm.DTMFilter}. */	TokenNameCOMMENT_JAVADOC	 Do a diagnostics dump of a whatToShow bit set. * @param whatToShow Bit set defined mainly by {@link org.apache.xml.dtm.DTMFilter}. 
public	TokenNamepublic	
static	TokenNamestatic	
void	TokenNamevoid	
debugWhatToShow	TokenNameIdentifier	 debug What To Show
(	TokenNameLPAREN	
int	TokenNameint	
whatToShow	TokenNameIdentifier	 what To Show
)	TokenNameRPAREN	
{	TokenNameLBRACE	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Vector	TokenNameIdentifier	 Vector
v	TokenNameIdentifier	 v
=	TokenNameEQUAL	
new	TokenNamenew	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Vector	TokenNameIdentifier	 Vector
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
!=	TokenNameNOT_EQUAL	
(	TokenNameLPAREN	
whatToShow	TokenNameIdentifier	 what To Show
&	TokenNameAND	
DTMFilter	TokenNameIdentifier	 DTM Filter
.	TokenNameDOT	
SHOW_ATTRIBUTE	TokenNameIdentifier	 SHOW  ATTRIBUTE
)	TokenNameRPAREN	
)	TokenNameRPAREN	
v	TokenNameIdentifier	 v
.	TokenNameDOT	
addElement	TokenNameIdentifier	 add Element
(	TokenNameLPAREN	
"SHOW_ATTRIBUTE"	TokenNameStringLiteral	SHOW_ATTRIBUTE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
!=	TokenNameNOT_EQUAL	
(	TokenNameLPAREN	
whatToShow	TokenNameIdentifier	 what To Show
&	TokenNameAND	
DTMFilter	TokenNameIdentifier	 DTM Filter
.	TokenNameDOT	
SHOW_NAMESPACE	TokenNameIdentifier	 SHOW  NAMESPACE
)	TokenNameRPAREN	
)	TokenNameRPAREN	
v	TokenNameIdentifier	 v
.	TokenNameDOT	
addElement	TokenNameIdentifier	 add Element
(	TokenNameLPAREN	
"SHOW_NAMESPACE"	TokenNameStringLiteral	SHOW_NAMESPACE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
!=	TokenNameNOT_EQUAL	
(	TokenNameLPAREN	
whatToShow	TokenNameIdentifier	 what To Show
&	TokenNameAND	
DTMFilter	TokenNameIdentifier	 DTM Filter
.	TokenNameDOT	
SHOW_CDATA_SECTION	TokenNameIdentifier	 SHOW  CDATA  SECTION
)	TokenNameRPAREN	
)	TokenNameRPAREN	
v	TokenNameIdentifier	 v
.	TokenNameDOT	
addElement	TokenNameIdentifier	 add Element
(	TokenNameLPAREN	
"SHOW_CDATA_SECTION"	TokenNameStringLiteral	SHOW_CDATA_SECTION
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
!=	TokenNameNOT_EQUAL	
(	TokenNameLPAREN	
whatToShow	TokenNameIdentifier	 what To Show
&	TokenNameAND	
DTMFilter	TokenNameIdentifier	 DTM Filter
.	TokenNameDOT	
SHOW_COMMENT	TokenNameIdentifier	 SHOW  COMMENT
)	TokenNameRPAREN	
)	TokenNameRPAREN	
v	TokenNameIdentifier	 v
.	TokenNameDOT	
addElement	TokenNameIdentifier	 add Element
(	TokenNameLPAREN	
"SHOW_COMMENT"	TokenNameStringLiteral	SHOW_COMMENT
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
!=	TokenNameNOT_EQUAL	
(	TokenNameLPAREN	
whatToShow	TokenNameIdentifier	 what To Show
&	TokenNameAND	
DTMFilter	TokenNameIdentifier	 DTM Filter
.	TokenNameDOT	
SHOW_DOCUMENT	TokenNameIdentifier	 SHOW  DOCUMENT
)	TokenNameRPAREN	
)	TokenNameRPAREN	
v	TokenNameIdentifier	 v
.	TokenNameDOT	
addElement	TokenNameIdentifier	 add Element
(	TokenNameLPAREN	
"SHOW_DOCUMENT"	TokenNameStringLiteral	SHOW_DOCUMENT
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
!=	TokenNameNOT_EQUAL	
(	TokenNameLPAREN	
whatToShow	TokenNameIdentifier	 what To Show
&	TokenNameAND	
DTMFilter	TokenNameIdentifier	 DTM Filter
.	TokenNameDOT	
SHOW_DOCUMENT_FRAGMENT	TokenNameIdentifier	 SHOW  DOCUMENT  FRAGMENT
)	TokenNameRPAREN	
)	TokenNameRPAREN	
v	TokenNameIdentifier	 v
.	TokenNameDOT	
addElement	TokenNameIdentifier	 add Element
(	TokenNameLPAREN	
"SHOW_DOCUMENT_FRAGMENT"	TokenNameStringLiteral	SHOW_DOCUMENT_FRAGMENT
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
!=	TokenNameNOT_EQUAL	
(	TokenNameLPAREN	
whatToShow	TokenNameIdentifier	 what To Show
&	TokenNameAND	
DTMFilter	TokenNameIdentifier	 DTM Filter
.	TokenNameDOT	
SHOW_DOCUMENT_TYPE	TokenNameIdentifier	 SHOW  DOCUMENT  TYPE
)	TokenNameRPAREN	
)	TokenNameRPAREN	
v	TokenNameIdentifier	 v
.	TokenNameDOT	
addElement	TokenNameIdentifier	 add Element
(	TokenNameLPAREN	
"SHOW_DOCUMENT_TYPE"	TokenNameStringLiteral	SHOW_DOCUMENT_TYPE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
!=	TokenNameNOT_EQUAL	
(	TokenNameLPAREN	
whatToShow	TokenNameIdentifier	 what To Show
&	TokenNameAND	
DTMFilter	TokenNameIdentifier	 DTM Filter
.	TokenNameDOT	
SHOW_ELEMENT	TokenNameIdentifier	 SHOW  ELEMENT
)	TokenNameRPAREN	
)	TokenNameRPAREN	
v	TokenNameIdentifier	 v
.	TokenNameDOT	
addElement	TokenNameIdentifier	 add Element
(	TokenNameLPAREN	
"SHOW_ELEMENT"	TokenNameStringLiteral	SHOW_ELEMENT
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
!=	TokenNameNOT_EQUAL	
(	TokenNameLPAREN	
whatToShow	TokenNameIdentifier	 what To Show
&	TokenNameAND	
DTMFilter	TokenNameIdentifier	 DTM Filter
.	TokenNameDOT	
SHOW_ENTITY	TokenNameIdentifier	 SHOW  ENTITY
)	TokenNameRPAREN	
)	TokenNameRPAREN	
v	TokenNameIdentifier	 v
.	TokenNameDOT	
addElement	TokenNameIdentifier	 add Element
(	TokenNameLPAREN	
"SHOW_ENTITY"	TokenNameStringLiteral	SHOW_ENTITY
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
!=	TokenNameNOT_EQUAL	
(	TokenNameLPAREN	
whatToShow	TokenNameIdentifier	 what To Show
&	TokenNameAND	
DTMFilter	TokenNameIdentifier	 DTM Filter
.	TokenNameDOT	
SHOW_ENTITY_REFERENCE	TokenNameIdentifier	 SHOW  ENTITY  REFERENCE
)	TokenNameRPAREN	
)	TokenNameRPAREN	
v	TokenNameIdentifier	 v
.	TokenNameDOT	
addElement	TokenNameIdentifier	 add Element
(	TokenNameLPAREN	
"SHOW_ENTITY_REFERENCE"	TokenNameStringLiteral	SHOW_ENTITY_REFERENCE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
!=	TokenNameNOT_EQUAL	
(	TokenNameLPAREN	
whatToShow	TokenNameIdentifier	 what To Show
&	TokenNameAND	
DTMFilter	TokenNameIdentifier	 DTM Filter
.	TokenNameDOT	
SHOW_NOTATION	TokenNameIdentifier	 SHOW  NOTATION
)	TokenNameRPAREN	
)	TokenNameRPAREN	
v	TokenNameIdentifier	 v
.	TokenNameDOT	
addElement	TokenNameIdentifier	 add Element
(	TokenNameLPAREN	
"SHOW_NOTATION"	TokenNameStringLiteral	SHOW_NOTATION
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
!=	TokenNameNOT_EQUAL	
(	TokenNameLPAREN	
whatToShow	TokenNameIdentifier	 what To Show
&	TokenNameAND	
DTMFilter	TokenNameIdentifier	 DTM Filter
.	TokenNameDOT	
SHOW_PROCESSING_INSTRUCTION	TokenNameIdentifier	 SHOW  PROCESSING  INSTRUCTION
)	TokenNameRPAREN	
)	TokenNameRPAREN	
v	TokenNameIdentifier	 v
.	TokenNameDOT	
addElement	TokenNameIdentifier	 add Element
(	TokenNameLPAREN	
"SHOW_PROCESSING_INSTRUCTION"	TokenNameStringLiteral	SHOW_PROCESSING_INSTRUCTION
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
!=	TokenNameNOT_EQUAL	
(	TokenNameLPAREN	
whatToShow	TokenNameIdentifier	 what To Show
&	TokenNameAND	
DTMFilter	TokenNameIdentifier	 DTM Filter
.	TokenNameDOT	
SHOW_TEXT	TokenNameIdentifier	 SHOW  TEXT
)	TokenNameRPAREN	
)	TokenNameRPAREN	
v	TokenNameIdentifier	 v
.	TokenNameDOT	
addElement	TokenNameIdentifier	 add Element
(	TokenNameLPAREN	
"SHOW_TEXT"	TokenNameStringLiteral	SHOW_TEXT
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
n	TokenNameIdentifier	 n
=	TokenNameEQUAL	
v	TokenNameIdentifier	 v
.	TokenNameDOT	
size	TokenNameIdentifier	 size
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
n	TokenNameIdentifier	 n
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
" | "	TokenNameStringLiteral	 | 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
v	TokenNameIdentifier	 v
.	TokenNameDOT	
elementAt	TokenNameIdentifier	 element At
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
==	TokenNameEQUAL_EQUAL	
n	TokenNameIdentifier	 n
)	TokenNameRPAREN	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
"empty whatToShow: "	TokenNameStringLiteral	empty whatToShow: 
+	TokenNamePLUS	
whatToShow	TokenNameIdentifier	 what To Show
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Two names are equal if they and either both are null or * the name t is wild and the name p is non-null, or the two * strings are equal. * * @param p part string from the node. * @param t target string, which may be {@link #WILD}. * * @return true if the strings match according to the rules of this method. */	TokenNameCOMMENT_JAVADOC	 Two names are equal if they and either both are null or the name t is wild and the name p is non-null, or the two strings are equal. * @param p part string from the node. @param t target string, which may be {@link #WILD}. * @return true if the strings match according to the rules of this method. 
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
boolean	TokenNameboolean	
subPartMatch	TokenNameIdentifier	 sub Part Match
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
p	TokenNameIdentifier	 p
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
t	TokenNameIdentifier	 t
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// boolean b = (p == t) || ((null != p) && ((t == WILD) || p.equals(t))); 	TokenNameCOMMENT_LINE	boolean b = (p == t) || ((null != p) && ((t == WILD) || p.equals(t))); 
// System.out.println("subPartMatch - p: "+p+", t: "+t+", result: "+b); 	TokenNameCOMMENT_LINE	System.out.println("subPartMatch - p: "+p+", t: "+t+", result: "+b); 
return	TokenNamereturn	
(	TokenNameLPAREN	
p	TokenNameIdentifier	 p
==	TokenNameEQUAL_EQUAL	
t	TokenNameIdentifier	 t
)	TokenNameRPAREN	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
p	TokenNameIdentifier	 p
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
t	TokenNameIdentifier	 t
==	TokenNameEQUAL_EQUAL	
WILD	TokenNameIdentifier	 WILD
)	TokenNameRPAREN	
||	TokenNameOR_OR	
p	TokenNameIdentifier	 p
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
t	TokenNameIdentifier	 t
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * This is temporary to patch over Xerces issue with representing DOM * namespaces as "". * * @param p part string from the node, which may represent the null namespace * as null or as "". * @param t target string, which may be {@link #WILD}. * * @return true if the strings match according to the rules of this method. */	TokenNameCOMMENT_JAVADOC	 This is temporary to patch over Xerces issue with representing DOM namespaces as "". * @param p part string from the node, which may represent the null namespace as null or as "". @param t target string, which may be {@link #WILD}. * @return true if the strings match according to the rules of this method. 
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
boolean	TokenNameboolean	
subPartMatchNS	TokenNameIdentifier	 sub Part Match NS
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
p	TokenNameIdentifier	 p
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
t	TokenNameIdentifier	 t
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
p	TokenNameIdentifier	 p
==	TokenNameEQUAL_EQUAL	
t	TokenNameIdentifier	 t
)	TokenNameRPAREN	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
p	TokenNameIdentifier	 p
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
p	TokenNameIdentifier	 p
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
t	TokenNameIdentifier	 t
==	TokenNameEQUAL_EQUAL	
WILD	TokenNameIdentifier	 WILD
)	TokenNameRPAREN	
||	TokenNameOR_OR	
p	TokenNameIdentifier	 p
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
t	TokenNameIdentifier	 t
)	TokenNameRPAREN	
)	TokenNameRPAREN	
:	TokenNameCOLON	
null	TokenNamenull	
==	TokenNameEQUAL_EQUAL	
t	TokenNameIdentifier	 t
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Tell what the test score is for the given node. * * * @param xctxt XPath runtime context. * @param context The node being tested. * * @return {@link org.apache.xpath.patterns.NodeTest#SCORE_NODETEST}, * {@link org.apache.xpath.patterns.NodeTest#SCORE_NONE}, * {@link org.apache.xpath.patterns.NodeTest#SCORE_NSWILD}, * {@link org.apache.xpath.patterns.NodeTest#SCORE_QNAME}, or * {@link org.apache.xpath.patterns.NodeTest#SCORE_OTHER}. * * @throws javax.xml.transform.TransformerException */	TokenNameCOMMENT_JAVADOC	 Tell what the test score is for the given node. * @param xctxt XPath runtime context. @param context The node being tested. * @return {@link org.apache.xpath.patterns.NodeTest#SCORE_NODETEST}, {@link org.apache.xpath.patterns.NodeTest#SCORE_NONE}, {@link org.apache.xpath.patterns.NodeTest#SCORE_NSWILD}, {@link org.apache.xpath.patterns.NodeTest#SCORE_QNAME}, or {@link org.apache.xpath.patterns.NodeTest#SCORE_OTHER}. * @throws javax.xml.transform.TransformerException 
public	TokenNamepublic	
XObject	TokenNameIdentifier	 X Object
execute	TokenNameIdentifier	 execute
(	TokenNameLPAREN	
XPathContext	TokenNameIdentifier	 X Path Context
xctxt	TokenNameIdentifier	 xctxt
,	TokenNameCOMMA	
int	TokenNameint	
context	TokenNameIdentifier	 context
)	TokenNameRPAREN	
throws	TokenNamethrows	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
transform	TokenNameIdentifier	 transform
.	TokenNameDOT	
TransformerException	TokenNameIdentifier	 Transformer Exception
{	TokenNameLBRACE	
DTM	TokenNameIdentifier	 DTM
dtm	TokenNameIdentifier	 dtm
=	TokenNameEQUAL	
xctxt	TokenNameIdentifier	 xctxt
.	TokenNameDOT	
getDTM	TokenNameIdentifier	 get DTM
(	TokenNameLPAREN	
context	TokenNameIdentifier	 context
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
short	TokenNameshort	
nodeType	TokenNameIdentifier	 node Type
=	TokenNameEQUAL	
dtm	TokenNameIdentifier	 dtm
.	TokenNameDOT	
getNodeType	TokenNameIdentifier	 get Node Type
(	TokenNameLPAREN	
context	TokenNameIdentifier	 context
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
m_whatToShow	TokenNameIdentifier	 m what To Show
==	TokenNameEQUAL_EQUAL	
DTMFilter	TokenNameIdentifier	 DTM Filter
.	TokenNameDOT	
SHOW_ALL	TokenNameIdentifier	 SHOW  ALL
)	TokenNameRPAREN	
return	TokenNamereturn	
m_score	TokenNameIdentifier	 m score
;	TokenNameSEMICOLON	
int	TokenNameint	
nodeBit	TokenNameIdentifier	 node Bit
=	TokenNameEQUAL	
(	TokenNameLPAREN	
m_whatToShow	TokenNameIdentifier	 m what To Show
&	TokenNameAND	
(	TokenNameLPAREN	
0x00000001	TokenNameIntegerLiteral	
<<	TokenNameLEFT_SHIFT	
(	TokenNameLPAREN	
nodeType	TokenNameIdentifier	 node Type
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
switch	TokenNameswitch	
(	TokenNameLPAREN	
nodeBit	TokenNameIdentifier	 node Bit
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
DTMFilter	TokenNameIdentifier	 DTM Filter
.	TokenNameDOT	
SHOW_DOCUMENT_FRAGMENT	TokenNameIdentifier	 SHOW  DOCUMENT  FRAGMENT
:	TokenNameCOLON	
case	TokenNamecase	
DTMFilter	TokenNameIdentifier	 DTM Filter
.	TokenNameDOT	
SHOW_DOCUMENT	TokenNameIdentifier	 SHOW  DOCUMENT
:	TokenNameCOLON	
return	TokenNamereturn	
SCORE_OTHER	TokenNameIdentifier	 SCORE  OTHER
;	TokenNameSEMICOLON	
case	TokenNamecase	
DTMFilter	TokenNameIdentifier	 DTM Filter
.	TokenNameDOT	
SHOW_COMMENT	TokenNameIdentifier	 SHOW  COMMENT
:	TokenNameCOLON	
return	TokenNamereturn	
m_score	TokenNameIdentifier	 m score
;	TokenNameSEMICOLON	
case	TokenNamecase	
DTMFilter	TokenNameIdentifier	 DTM Filter
.	TokenNameDOT	
SHOW_CDATA_SECTION	TokenNameIdentifier	 SHOW  CDATA  SECTION
:	TokenNameCOLON	
case	TokenNamecase	
DTMFilter	TokenNameIdentifier	 DTM Filter
.	TokenNameDOT	
SHOW_TEXT	TokenNameIdentifier	 SHOW  TEXT
:	TokenNameCOLON	
// was: 	TokenNameCOMMENT_LINE	was: 
// return (!xctxt.getDOMHelper().shouldStripSourceNode(context)) 	TokenNameCOMMENT_LINE	return (!xctxt.getDOMHelper().shouldStripSourceNode(context)) 
// ? m_score : SCORE_NONE; 	TokenNameCOMMENT_LINE	? m_score : SCORE_NONE; 
return	TokenNamereturn	
m_score	TokenNameIdentifier	 m score
;	TokenNameSEMICOLON	
case	TokenNamecase	
DTMFilter	TokenNameIdentifier	 DTM Filter
.	TokenNameDOT	
SHOW_PROCESSING_INSTRUCTION	TokenNameIdentifier	 SHOW  PROCESSING  INSTRUCTION
:	TokenNameCOLON	
return	TokenNamereturn	
subPartMatch	TokenNameIdentifier	 sub Part Match
(	TokenNameLPAREN	
dtm	TokenNameIdentifier	 dtm
.	TokenNameDOT	
getNodeName	TokenNameIdentifier	 get Node Name
(	TokenNameLPAREN	
context	TokenNameIdentifier	 context
)	TokenNameRPAREN	
,	TokenNameCOMMA	
m_name	TokenNameIdentifier	 m name
)	TokenNameRPAREN	
?	TokenNameQUESTION	
m_score	TokenNameIdentifier	 m score
:	TokenNameCOLON	
SCORE_NONE	TokenNameIdentifier	 SCORE  NONE
;	TokenNameSEMICOLON	
// From the draft: "Two expanded names are equal if they 	TokenNameCOMMENT_LINE	From the draft: "Two expanded names are equal if they 
// have the same local part, and either both have no URI or 	TokenNameCOMMENT_LINE	have the same local part, and either both have no URI or 
// both have the same URI." 	TokenNameCOMMENT_LINE	both have the same URI." 
// "A node test * is true for any node of the principal node type. 	TokenNameCOMMENT_LINE	"A node test * is true for any node of the principal node type. 
// For example, child::* will select all element children of the 	TokenNameCOMMENT_LINE	For example, child::* will select all element children of the 
// context node, and attribute::* will select all attributes of 	TokenNameCOMMENT_LINE	context node, and attribute::* will select all attributes of 
// the context node." 	TokenNameCOMMENT_LINE	the context node." 
// "A node test can have the form NCName:*. In this case, the prefix 	TokenNameCOMMENT_LINE	"A node test can have the form NCName:*. In this case, the prefix 
// is expanded in the same way as with a QName using the context 	TokenNameCOMMENT_LINE	is expanded in the same way as with a QName using the context 
// namespace declarations. The node test will be true for any node 	TokenNameCOMMENT_LINE	namespace declarations. The node test will be true for any node 
// of the principal type whose expanded name has the URI to which 	TokenNameCOMMENT_LINE	of the principal type whose expanded name has the URI to which 
// the prefix expands, regardless of the local part of the name." 	TokenNameCOMMENT_LINE	the prefix expands, regardless of the local part of the name." 
case	TokenNamecase	
DTMFilter	TokenNameIdentifier	 DTM Filter
.	TokenNameDOT	
SHOW_NAMESPACE	TokenNameIdentifier	 SHOW  NAMESPACE
:	TokenNameCOLON	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
ns	TokenNameIdentifier	 ns
=	TokenNameEQUAL	
dtm	TokenNameIdentifier	 dtm
.	TokenNameDOT	
getLocalName	TokenNameIdentifier	 get Local Name
(	TokenNameLPAREN	
context	TokenNameIdentifier	 context
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
(	TokenNameLPAREN	
subPartMatch	TokenNameIdentifier	 sub Part Match
(	TokenNameLPAREN	
ns	TokenNameIdentifier	 ns
,	TokenNameCOMMA	
m_name	TokenNameIdentifier	 m name
)	TokenNameRPAREN	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
m_score	TokenNameIdentifier	 m score
:	TokenNameCOLON	
SCORE_NONE	TokenNameIdentifier	 SCORE  NONE
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
case	TokenNamecase	
DTMFilter	TokenNameIdentifier	 DTM Filter
.	TokenNameDOT	
SHOW_ATTRIBUTE	TokenNameIdentifier	 SHOW  ATTRIBUTE
:	TokenNameCOLON	
case	TokenNamecase	
DTMFilter	TokenNameIdentifier	 DTM Filter
.	TokenNameDOT	
SHOW_ELEMENT	TokenNameIdentifier	 SHOW  ELEMENT
:	TokenNameCOLON	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
m_isTotallyWild	TokenNameIdentifier	 m is Totally Wild
||	TokenNameOR_OR	
(	TokenNameLPAREN	
subPartMatchNS	TokenNameIdentifier	 sub Part Match NS
(	TokenNameLPAREN	
dtm	TokenNameIdentifier	 dtm
.	TokenNameDOT	
getNamespaceURI	TokenNameIdentifier	 get Namespace URI
(	TokenNameLPAREN	
context	TokenNameIdentifier	 context
)	TokenNameRPAREN	
,	TokenNameCOMMA	
m_namespace	TokenNameIdentifier	 m namespace
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
subPartMatch	TokenNameIdentifier	 sub Part Match
(	TokenNameLPAREN	
dtm	TokenNameIdentifier	 dtm
.	TokenNameDOT	
getLocalName	TokenNameIdentifier	 get Local Name
(	TokenNameLPAREN	
context	TokenNameIdentifier	 context
)	TokenNameRPAREN	
,	TokenNameCOMMA	
m_name	TokenNameIdentifier	 m name
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
m_score	TokenNameIdentifier	 m score
:	TokenNameCOLON	
SCORE_NONE	TokenNameIdentifier	 SCORE  NONE
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
default	TokenNamedefault	
:	TokenNameCOLON	
return	TokenNamereturn	
SCORE_NONE	TokenNameIdentifier	 SCORE  NONE
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// end switch(testType) 	TokenNameCOMMENT_LINE	end switch(testType) 
}	TokenNameRBRACE	
/** * Tell what the test score is for the given node. * * * @param xctxt XPath runtime context. * @param context The node being tested. * * @return {@link org.apache.xpath.patterns.NodeTest#SCORE_NODETEST}, * {@link org.apache.xpath.patterns.NodeTest#SCORE_NONE}, * {@link org.apache.xpath.patterns.NodeTest#SCORE_NSWILD}, * {@link org.apache.xpath.patterns.NodeTest#SCORE_QNAME}, or * {@link org.apache.xpath.patterns.NodeTest#SCORE_OTHER}. * * @throws javax.xml.transform.TransformerException */	TokenNameCOMMENT_JAVADOC	 Tell what the test score is for the given node. * @param xctxt XPath runtime context. @param context The node being tested. * @return {@link org.apache.xpath.patterns.NodeTest#SCORE_NODETEST}, {@link org.apache.xpath.patterns.NodeTest#SCORE_NONE}, {@link org.apache.xpath.patterns.NodeTest#SCORE_NSWILD}, {@link org.apache.xpath.patterns.NodeTest#SCORE_QNAME}, or {@link org.apache.xpath.patterns.NodeTest#SCORE_OTHER}. * @throws javax.xml.transform.TransformerException 
public	TokenNamepublic	
XObject	TokenNameIdentifier	 X Object
execute	TokenNameIdentifier	 execute
(	TokenNameLPAREN	
XPathContext	TokenNameIdentifier	 X Path Context
xctxt	TokenNameIdentifier	 xctxt
,	TokenNameCOMMA	
int	TokenNameint	
context	TokenNameIdentifier	 context
,	TokenNameCOMMA	
DTM	TokenNameIdentifier	 DTM
dtm	TokenNameIdentifier	 dtm
,	TokenNameCOMMA	
int	TokenNameint	
expType	TokenNameIdentifier	 exp Type
)	TokenNameRPAREN	
throws	TokenNamethrows	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
transform	TokenNameIdentifier	 transform
.	TokenNameDOT	
TransformerException	TokenNameIdentifier	 Transformer Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
m_whatToShow	TokenNameIdentifier	 m what To Show
==	TokenNameEQUAL_EQUAL	
DTMFilter	TokenNameIdentifier	 DTM Filter
.	TokenNameDOT	
SHOW_ALL	TokenNameIdentifier	 SHOW  ALL
)	TokenNameRPAREN	
return	TokenNamereturn	
m_score	TokenNameIdentifier	 m score
;	TokenNameSEMICOLON	
int	TokenNameint	
nodeBit	TokenNameIdentifier	 node Bit
=	TokenNameEQUAL	
(	TokenNameLPAREN	
m_whatToShow	TokenNameIdentifier	 m what To Show
&	TokenNameAND	
(	TokenNameLPAREN	
0x00000001	TokenNameIntegerLiteral	
<<	TokenNameLEFT_SHIFT	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
dtm	TokenNameIdentifier	 dtm
.	TokenNameDOT	
getNodeType	TokenNameIdentifier	 get Node Type
(	TokenNameLPAREN	
context	TokenNameIdentifier	 context
)	TokenNameRPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
switch	TokenNameswitch	
(	TokenNameLPAREN	
nodeBit	TokenNameIdentifier	 node Bit
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
DTMFilter	TokenNameIdentifier	 DTM Filter
.	TokenNameDOT	
SHOW_DOCUMENT_FRAGMENT	TokenNameIdentifier	 SHOW  DOCUMENT  FRAGMENT
:	TokenNameCOLON	
case	TokenNamecase	
DTMFilter	TokenNameIdentifier	 DTM Filter
.	TokenNameDOT	
SHOW_DOCUMENT	TokenNameIdentifier	 SHOW  DOCUMENT
:	TokenNameCOLON	
return	TokenNamereturn	
SCORE_OTHER	TokenNameIdentifier	 SCORE  OTHER
;	TokenNameSEMICOLON	
case	TokenNamecase	
DTMFilter	TokenNameIdentifier	 DTM Filter
.	TokenNameDOT	
SHOW_COMMENT	TokenNameIdentifier	 SHOW  COMMENT
:	TokenNameCOLON	
return	TokenNamereturn	
m_score	TokenNameIdentifier	 m score
;	TokenNameSEMICOLON	
case	TokenNamecase	
DTMFilter	TokenNameIdentifier	 DTM Filter
.	TokenNameDOT	
SHOW_CDATA_SECTION	TokenNameIdentifier	 SHOW  CDATA  SECTION
:	TokenNameCOLON	
case	TokenNamecase	
DTMFilter	TokenNameIdentifier	 DTM Filter
.	TokenNameDOT	
SHOW_TEXT	TokenNameIdentifier	 SHOW  TEXT
:	TokenNameCOLON	
// was: 	TokenNameCOMMENT_LINE	was: 
// return (!xctxt.getDOMHelper().shouldStripSourceNode(context)) 	TokenNameCOMMENT_LINE	return (!xctxt.getDOMHelper().shouldStripSourceNode(context)) 
// ? m_score : SCORE_NONE; 	TokenNameCOMMENT_LINE	? m_score : SCORE_NONE; 
return	TokenNamereturn	
m_score	TokenNameIdentifier	 m score
;	TokenNameSEMICOLON	
case	TokenNamecase	
DTMFilter	TokenNameIdentifier	 DTM Filter
.	TokenNameDOT	
SHOW_PROCESSING_INSTRUCTION	TokenNameIdentifier	 SHOW  PROCESSING  INSTRUCTION
:	TokenNameCOLON	
return	TokenNamereturn	
subPartMatch	TokenNameIdentifier	 sub Part Match
(	TokenNameLPAREN	
dtm	TokenNameIdentifier	 dtm
.	TokenNameDOT	
getNodeName	TokenNameIdentifier	 get Node Name
(	TokenNameLPAREN	
context	TokenNameIdentifier	 context
)	TokenNameRPAREN	
,	TokenNameCOMMA	
m_name	TokenNameIdentifier	 m name
)	TokenNameRPAREN	
?	TokenNameQUESTION	
m_score	TokenNameIdentifier	 m score
:	TokenNameCOLON	
SCORE_NONE	TokenNameIdentifier	 SCORE  NONE
;	TokenNameSEMICOLON	
// From the draft: "Two expanded names are equal if they 	TokenNameCOMMENT_LINE	From the draft: "Two expanded names are equal if they 
// have the same local part, and either both have no URI or 	TokenNameCOMMENT_LINE	have the same local part, and either both have no URI or 
// both have the same URI." 	TokenNameCOMMENT_LINE	both have the same URI." 
// "A node test * is true for any node of the principal node type. 	TokenNameCOMMENT_LINE	"A node test * is true for any node of the principal node type. 
// For example, child::* will select all element children of the 	TokenNameCOMMENT_LINE	For example, child::* will select all element children of the 
// context node, and attribute::* will select all attributes of 	TokenNameCOMMENT_LINE	context node, and attribute::* will select all attributes of 
// the context node." 	TokenNameCOMMENT_LINE	the context node." 
// "A node test can have the form NCName:*. In this case, the prefix 	TokenNameCOMMENT_LINE	"A node test can have the form NCName:*. In this case, the prefix 
// is expanded in the same way as with a QName using the context 	TokenNameCOMMENT_LINE	is expanded in the same way as with a QName using the context 
// namespace declarations. The node test will be true for any node 	TokenNameCOMMENT_LINE	namespace declarations. The node test will be true for any node 
// of the principal type whose expanded name has the URI to which 	TokenNameCOMMENT_LINE	of the principal type whose expanded name has the URI to which 
// the prefix expands, regardless of the local part of the name." 	TokenNameCOMMENT_LINE	the prefix expands, regardless of the local part of the name." 
case	TokenNamecase	
DTMFilter	TokenNameIdentifier	 DTM Filter
.	TokenNameDOT	
SHOW_NAMESPACE	TokenNameIdentifier	 SHOW  NAMESPACE
:	TokenNameCOLON	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
ns	TokenNameIdentifier	 ns
=	TokenNameEQUAL	
dtm	TokenNameIdentifier	 dtm
.	TokenNameDOT	
getLocalName	TokenNameIdentifier	 get Local Name
(	TokenNameLPAREN	
context	TokenNameIdentifier	 context
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
(	TokenNameLPAREN	
subPartMatch	TokenNameIdentifier	 sub Part Match
(	TokenNameLPAREN	
ns	TokenNameIdentifier	 ns
,	TokenNameCOMMA	
m_name	TokenNameIdentifier	 m name
)	TokenNameRPAREN	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
m_score	TokenNameIdentifier	 m score
:	TokenNameCOLON	
SCORE_NONE	TokenNameIdentifier	 SCORE  NONE
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
case	TokenNamecase	
DTMFilter	TokenNameIdentifier	 DTM Filter
.	TokenNameDOT	
SHOW_ATTRIBUTE	TokenNameIdentifier	 SHOW  ATTRIBUTE
:	TokenNameCOLON	
case	TokenNamecase	
DTMFilter	TokenNameIdentifier	 DTM Filter
.	TokenNameDOT	
SHOW_ELEMENT	TokenNameIdentifier	 SHOW  ELEMENT
:	TokenNameCOLON	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
m_isTotallyWild	TokenNameIdentifier	 m is Totally Wild
||	TokenNameOR_OR	
(	TokenNameLPAREN	
subPartMatchNS	TokenNameIdentifier	 sub Part Match NS
(	TokenNameLPAREN	
dtm	TokenNameIdentifier	 dtm
.	TokenNameDOT	
getNamespaceURI	TokenNameIdentifier	 get Namespace URI
(	TokenNameLPAREN	
context	TokenNameIdentifier	 context
)	TokenNameRPAREN	
,	TokenNameCOMMA	
m_namespace	TokenNameIdentifier	 m namespace
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
subPartMatch	TokenNameIdentifier	 sub Part Match
(	TokenNameLPAREN	
dtm	TokenNameIdentifier	 dtm
.	TokenNameDOT	
getLocalName	TokenNameIdentifier	 get Local Name
(	TokenNameLPAREN	
context	TokenNameIdentifier	 context
)	TokenNameRPAREN	
,	TokenNameCOMMA	
m_name	TokenNameIdentifier	 m name
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
m_score	TokenNameIdentifier	 m score
:	TokenNameCOLON	
SCORE_NONE	TokenNameIdentifier	 SCORE  NONE
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
default	TokenNamedefault	
:	TokenNameCOLON	
return	TokenNamereturn	
SCORE_NONE	TokenNameIdentifier	 SCORE  NONE
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// end switch(testType) 	TokenNameCOMMENT_LINE	end switch(testType) 
}	TokenNameRBRACE	
/** * Test the current node to see if it matches the given node test. * * @param xctxt XPath runtime context. * * @return {@link org.apache.xpath.patterns.NodeTest#SCORE_NODETEST}, * {@link org.apache.xpath.patterns.NodeTest#SCORE_NONE}, * {@link org.apache.xpath.patterns.NodeTest#SCORE_NSWILD}, * {@link org.apache.xpath.patterns.NodeTest#SCORE_QNAME}, or * {@link org.apache.xpath.patterns.NodeTest#SCORE_OTHER}. * * @throws javax.xml.transform.TransformerException */	TokenNameCOMMENT_JAVADOC	 Test the current node to see if it matches the given node test. * @param xctxt XPath runtime context. * @return {@link org.apache.xpath.patterns.NodeTest#SCORE_NODETEST}, {@link org.apache.xpath.patterns.NodeTest#SCORE_NONE}, {@link org.apache.xpath.patterns.NodeTest#SCORE_NSWILD}, {@link org.apache.xpath.patterns.NodeTest#SCORE_QNAME}, or {@link org.apache.xpath.patterns.NodeTest#SCORE_OTHER}. * @throws javax.xml.transform.TransformerException 
public	TokenNamepublic	
XObject	TokenNameIdentifier	 X Object
execute	TokenNameIdentifier	 execute
(	TokenNameLPAREN	
XPathContext	TokenNameIdentifier	 X Path Context
xctxt	TokenNameIdentifier	 xctxt
)	TokenNameRPAREN	
throws	TokenNamethrows	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
transform	TokenNameIdentifier	 transform
.	TokenNameDOT	
TransformerException	TokenNameIdentifier	 Transformer Exception
{	TokenNameLBRACE	
return	TokenNamereturn	
execute	TokenNameIdentifier	 execute
(	TokenNameLPAREN	
xctxt	TokenNameIdentifier	 xctxt
,	TokenNameCOMMA	
xctxt	TokenNameIdentifier	 xctxt
.	TokenNameDOT	
getCurrentNode	TokenNameIdentifier	 get Current Node
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Node tests by themselves do not need to fix up variables. */	TokenNameCOMMENT_JAVADOC	 Node tests by themselves do not need to fix up variables. 
public	TokenNamepublic	
void	TokenNamevoid	
fixupVariables	TokenNameIdentifier	 fixup Variables
(	TokenNameLPAREN	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Vector	TokenNameIdentifier	 Vector
vars	TokenNameIdentifier	 vars
,	TokenNameCOMMA	
int	TokenNameint	
globalsSize	TokenNameIdentifier	 globals Size
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// no-op 	TokenNameCOMMENT_LINE	no-op 
}	TokenNameRBRACE	
/** * @see org.apache.xpath.XPathVisitable#callVisitors(ExpressionOwner, XPathVisitor) */	TokenNameCOMMENT_JAVADOC	 @see org.apache.xpath.XPathVisitable#callVisitors(ExpressionOwner, XPathVisitor) 
public	TokenNamepublic	
void	TokenNamevoid	
callVisitors	TokenNameIdentifier	 call Visitors
(	TokenNameLPAREN	
ExpressionOwner	TokenNameIdentifier	 Expression Owner
owner	TokenNameIdentifier	 owner
,	TokenNameCOMMA	
XPathVisitor	TokenNameIdentifier	 X Path Visitor
visitor	TokenNameIdentifier	 visitor
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assertion	TokenNameIdentifier	 assertion
(	TokenNameLPAREN	
false	TokenNamefalse	
,	TokenNameCOMMA	
"callVisitors should not be called for this object!!!"	TokenNameStringLiteral	callVisitors should not be called for this object!!!
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
