package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
search	TokenNameIdentifier	 search
.	TokenNameDOT	
highlight	TokenNameIdentifier	 highlight
;	TokenNameSEMICOLON	
/** * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_JAVADOC	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
analysis	TokenNameIdentifier	 analysis
.	TokenNameDOT	
TokenStream	TokenNameIdentifier	 Token Stream
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
analysis	TokenNameIdentifier	 analysis
.	TokenNameDOT	
tokenattributes	TokenNameIdentifier	 tokenattributes
.	TokenNameDOT	
OffsetAttribute	TokenNameIdentifier	 Offset Attribute
;	TokenNameSEMICOLON	
/** * {@link Fragmenter} implementation which breaks text up into same-size * fragments with no concerns over spotting sentence boundaries. */	TokenNameCOMMENT_JAVADOC	 {@link Fragmenter} implementation which breaks text up into same-size fragments with no concerns over spotting sentence boundaries. 
public	TokenNamepublic	
class	TokenNameclass	
SimpleFragmenter	TokenNameIdentifier	 Simple Fragmenter
implements	TokenNameimplements	
Fragmenter	TokenNameIdentifier	 Fragmenter
{	TokenNameLBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
DEFAULT_FRAGMENT_SIZE	TokenNameIdentifier	 DEFAULT  FRAGMENT  SIZE
=	TokenNameEQUAL	
100	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
currentNumFrags	TokenNameIdentifier	 current Num Frags
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
fragmentSize	TokenNameIdentifier	 fragment Size
;	TokenNameSEMICOLON	
private	TokenNameprivate	
OffsetAttribute	TokenNameIdentifier	 Offset Attribute
offsetAtt	TokenNameIdentifier	 offset Att
;	TokenNameSEMICOLON	
public	TokenNamepublic	
SimpleFragmenter	TokenNameIdentifier	 Simple Fragmenter
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
DEFAULT_FRAGMENT_SIZE	TokenNameIdentifier	 DEFAULT  FRAGMENT  SIZE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * * @param fragmentSize size in number of characters of each fragment */	TokenNameCOMMENT_JAVADOC	 * @param fragmentSize size in number of characters of each fragment 
public	TokenNamepublic	
SimpleFragmenter	TokenNameIdentifier	 Simple Fragmenter
(	TokenNameLPAREN	
int	TokenNameint	
fragmentSize	TokenNameIdentifier	 fragment Size
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
fragmentSize	TokenNameIdentifier	 fragment Size
=	TokenNameEQUAL	
fragmentSize	TokenNameIdentifier	 fragment Size
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/* (non-Javadoc) * @see org.apache.lucene.search.highlight.Fragmenter#start(java.lang.String, org.apache.lucene.analysis.TokenStream) */	TokenNameCOMMENT_BLOCK	 (non-Javadoc) @see org.apache.lucene.search.highlight.Fragmenter#start(java.lang.String, org.apache.lucene.analysis.TokenStream) 
public	TokenNamepublic	
void	TokenNamevoid	
start	TokenNameIdentifier	 start
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
originalText	TokenNameIdentifier	 original Text
,	TokenNameCOMMA	
TokenStream	TokenNameIdentifier	 Token Stream
stream	TokenNameIdentifier	 stream
)	TokenNameRPAREN	
{	TokenNameLBRACE	
offsetAtt	TokenNameIdentifier	 offset Att
=	TokenNameEQUAL	
stream	TokenNameIdentifier	 stream
.	TokenNameDOT	
addAttribute	TokenNameIdentifier	 add Attribute
(	TokenNameLPAREN	
OffsetAttribute	TokenNameIdentifier	 Offset Attribute
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
currentNumFrags	TokenNameIdentifier	 current Num Frags
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/* (non-Javadoc) * @see org.apache.lucene.search.highlight.Fragmenter#isNewFragment() */	TokenNameCOMMENT_BLOCK	 (non-Javadoc) @see org.apache.lucene.search.highlight.Fragmenter#isNewFragment() 
public	TokenNamepublic	
boolean	TokenNameboolean	
isNewFragment	TokenNameIdentifier	 is New Fragment
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
boolean	TokenNameboolean	
isNewFrag	TokenNameIdentifier	 is New Frag
=	TokenNameEQUAL	
offsetAtt	TokenNameIdentifier	 offset Att
.	TokenNameDOT	
endOffset	TokenNameIdentifier	 end Offset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>=	TokenNameGREATER_EQUAL	
(	TokenNameLPAREN	
fragmentSize	TokenNameIdentifier	 fragment Size
*	TokenNameMULTIPLY	
currentNumFrags	TokenNameIdentifier	 current Num Frags
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
isNewFrag	TokenNameIdentifier	 is New Frag
)	TokenNameRPAREN	
{	TokenNameLBRACE	
currentNumFrags	TokenNameIdentifier	 current Num Frags
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
isNewFrag	TokenNameIdentifier	 is New Frag
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @return size in number of characters of each fragment */	TokenNameCOMMENT_JAVADOC	 @return size in number of characters of each fragment 
public	TokenNamepublic	
int	TokenNameint	
getFragmentSize	TokenNameIdentifier	 get Fragment Size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
fragmentSize	TokenNameIdentifier	 fragment Size
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @param size size in characters of each fragment */	TokenNameCOMMENT_JAVADOC	 @param size size in characters of each fragment 
public	TokenNamepublic	
void	TokenNamevoid	
setFragmentSize	TokenNameIdentifier	 set Fragment Size
(	TokenNameLPAREN	
int	TokenNameint	
size	TokenNameIdentifier	 size
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fragmentSize	TokenNameIdentifier	 fragment Size
=	TokenNameEQUAL	
size	TokenNameIdentifier	 size
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
