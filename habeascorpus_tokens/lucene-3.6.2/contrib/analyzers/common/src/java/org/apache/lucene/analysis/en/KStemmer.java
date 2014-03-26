/** * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_JAVADOC	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/* This file was partially derived from the original CIIR University of Massachusetts Amherst version of KStemmer.java (license for the original shown below) */	TokenNameCOMMENT_BLOCK	 This file was partially derived from the original CIIR University of Massachusetts Amherst version of KStemmer.java (license for the original shown below) 
/* Copyright © 2003, Center for Intelligent Information Retrieval, University of Massachusetts, Amherst. All rights reserved. Redistribution and use in source and binary forms, with or without modification, are permitted provided that the following conditions are met: 1. Redistributions of source code must retain the above copyright notice, this list of conditions and the following disclaimer. 2. Redistributions in binary form must reproduce the above copyright notice, this list of conditions and the following disclaimer in the documentation and/or other materials provided with the distribution. 3. The names "Center for Intelligent Information Retrieval" and "University of Massachusetts" must not be used to endorse or promote products derived from this software without prior written permission. To obtain permission, contact info@ciir.cs.umass.edu. THIS SOFTWARE IS PROVIDED BY UNIVERSITY OF MASSACHUSETTS AND OTHER CONTRIBUTORS "AS IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT HOLDERS OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE. */	TokenNameCOMMENT_BLOCK	 Copyright © 2003, Center for Intelligent Information Retrieval, University of Massachusetts, Amherst. All rights reserved. Redistribution and use in source and binary forms, with or without modification, are permitted provided that the following conditions are met: 1. Redistributions of source code must retain the above copyright notice, this list of conditions and the following disclaimer. 2. Redistributions in binary form must reproduce the above copyright notice, this list of conditions and the following disclaimer in the documentation and/or other materials provided with the distribution. 3. The names "Center for Intelligent Information Retrieval" and "University of Massachusetts" must not be used to endorse or promote products derived from this software without prior written permission. To obtain permission, contact info@ciir.cs.umass.edu. THIS SOFTWARE IS PROVIDED BY UNIVERSITY OF MASSACHUSETTS AND OTHER CONTRIBUTORS "AS IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT HOLDERS OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
analysis	TokenNameIdentifier	 analysis
.	TokenNameDOT	
en	TokenNameIdentifier	 en
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
CharArrayMap	TokenNameIdentifier	 Char Array Map
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
util	TokenNameIdentifier	 util
.	TokenNameDOT	
OpenStringBuilder	TokenNameIdentifier	 Open String Builder
;	TokenNameSEMICOLON	
/** * <p>Title: Kstemmer</p> * <p>Description: This is a java version of Bob Krovetz' kstem stemmer</p> * <p>Copyright: Copyright 2008, Luicid Imagination, Inc. </p> * <p>Copyright: Copyright 2003, CIIR University of Massachusetts Amherst (http://ciir.cs.umass.edu) </p> */	TokenNameCOMMENT_JAVADOC	 <p>Title: Kstemmer</p> <p>Description: This is a java version of Bob Krovetz' kstem stemmer</p> <p>Copyright: Copyright 2008, Luicid Imagination, Inc. </p> <p>Copyright: Copyright 2003, CIIR University of Massachusetts Amherst (http://ciir.cs.umass.edu) </p> 
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Version	TokenNameIdentifier	 Version
;	TokenNameSEMICOLON	
/** * This class implements the Kstem algorithm */	TokenNameCOMMENT_JAVADOC	 This class implements the Kstem algorithm 
public	TokenNamepublic	
class	TokenNameclass	
KStemmer	TokenNameIdentifier	 K Stemmer
{	TokenNameLBRACE	
static	TokenNamestatic	
private	TokenNameprivate	
final	TokenNamefinal	
int	TokenNameint	
MaxWordLen	TokenNameIdentifier	 Max Word Len
=	TokenNameEQUAL	
50	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
static	TokenNamestatic	
private	TokenNameprivate	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
exceptionWords	TokenNameIdentifier	 exception Words
=	TokenNameEQUAL	
{	TokenNameLBRACE	
"aide"	TokenNameStringLiteral	aide
,	TokenNameCOMMA	
"bathe"	TokenNameStringLiteral	bathe
,	TokenNameCOMMA	
"caste"	TokenNameStringLiteral	caste
,	TokenNameCOMMA	
"cute"	TokenNameStringLiteral	cute
,	TokenNameCOMMA	
"dame"	TokenNameStringLiteral	dame
,	TokenNameCOMMA	
"dime"	TokenNameStringLiteral	dime
,	TokenNameCOMMA	
"doge"	TokenNameStringLiteral	doge
,	TokenNameCOMMA	
"done"	TokenNameStringLiteral	done
,	TokenNameCOMMA	
"dune"	TokenNameStringLiteral	dune
,	TokenNameCOMMA	
"envelope"	TokenNameStringLiteral	envelope
,	TokenNameCOMMA	
"gage"	TokenNameStringLiteral	gage
,	TokenNameCOMMA	
"grille"	TokenNameStringLiteral	grille
,	TokenNameCOMMA	
"grippe"	TokenNameStringLiteral	grippe
,	TokenNameCOMMA	
"lobe"	TokenNameStringLiteral	lobe
,	TokenNameCOMMA	
"mane"	TokenNameStringLiteral	mane
,	TokenNameCOMMA	
"mare"	TokenNameStringLiteral	mare
,	TokenNameCOMMA	
"nape"	TokenNameStringLiteral	nape
,	TokenNameCOMMA	
"node"	TokenNameStringLiteral	node
,	TokenNameCOMMA	
"pane"	TokenNameStringLiteral	pane
,	TokenNameCOMMA	
"pate"	TokenNameStringLiteral	pate
,	TokenNameCOMMA	
"plane"	TokenNameStringLiteral	plane
,	TokenNameCOMMA	
"pope"	TokenNameStringLiteral	pope
,	TokenNameCOMMA	
"programme"	TokenNameStringLiteral	programme
,	TokenNameCOMMA	
"quite"	TokenNameStringLiteral	quite
,	TokenNameCOMMA	
"ripe"	TokenNameStringLiteral	ripe
,	TokenNameCOMMA	
"rote"	TokenNameStringLiteral	rote
,	TokenNameCOMMA	
"rune"	TokenNameStringLiteral	rune
,	TokenNameCOMMA	
"sage"	TokenNameStringLiteral	sage
,	TokenNameCOMMA	
"severe"	TokenNameStringLiteral	severe
,	TokenNameCOMMA	
"shoppe"	TokenNameStringLiteral	shoppe
,	TokenNameCOMMA	
"sine"	TokenNameStringLiteral	sine
,	TokenNameCOMMA	
"slime"	TokenNameStringLiteral	slime
,	TokenNameCOMMA	
"snipe"	TokenNameStringLiteral	snipe
,	TokenNameCOMMA	
"steppe"	TokenNameStringLiteral	steppe
,	TokenNameCOMMA	
"suite"	TokenNameStringLiteral	suite
,	TokenNameCOMMA	
"swinge"	TokenNameStringLiteral	swinge
,	TokenNameCOMMA	
"tare"	TokenNameStringLiteral	tare
,	TokenNameCOMMA	
"tine"	TokenNameStringLiteral	tine
,	TokenNameCOMMA	
"tope"	TokenNameStringLiteral	tope
,	TokenNameCOMMA	
"tripe"	TokenNameStringLiteral	tripe
,	TokenNameCOMMA	
"twine"	TokenNameStringLiteral	twine
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
static	TokenNamestatic	
private	TokenNameprivate	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
directConflations	TokenNameIdentifier	 direct Conflations
=	TokenNameEQUAL	
{	TokenNameLBRACE	
{	TokenNameLBRACE	
"aging"	TokenNameStringLiteral	aging
,	TokenNameCOMMA	
"age"	TokenNameStringLiteral	age
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"going"	TokenNameStringLiteral	going
,	TokenNameCOMMA	
"go"	TokenNameStringLiteral	go
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"goes"	TokenNameStringLiteral	goes
,	TokenNameCOMMA	
"go"	TokenNameStringLiteral	go
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"lying"	TokenNameStringLiteral	lying
,	TokenNameCOMMA	
"lie"	TokenNameStringLiteral	lie
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"using"	TokenNameStringLiteral	using
,	TokenNameCOMMA	
"use"	TokenNameStringLiteral	use
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"owing"	TokenNameStringLiteral	owing
,	TokenNameCOMMA	
"owe"	TokenNameStringLiteral	owe
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"suing"	TokenNameStringLiteral	suing
,	TokenNameCOMMA	
"sue"	TokenNameStringLiteral	sue
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"dying"	TokenNameStringLiteral	dying
,	TokenNameCOMMA	
"die"	TokenNameStringLiteral	die
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"tying"	TokenNameStringLiteral	tying
,	TokenNameCOMMA	
"tie"	TokenNameStringLiteral	tie
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"vying"	TokenNameStringLiteral	vying
,	TokenNameCOMMA	
"vie"	TokenNameStringLiteral	vie
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"aged"	TokenNameStringLiteral	aged
,	TokenNameCOMMA	
"age"	TokenNameStringLiteral	age
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"used"	TokenNameStringLiteral	used
,	TokenNameCOMMA	
"use"	TokenNameStringLiteral	use
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"vied"	TokenNameStringLiteral	vied
,	TokenNameCOMMA	
"vie"	TokenNameStringLiteral	vie
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"cued"	TokenNameStringLiteral	cued
,	TokenNameCOMMA	
"cue"	TokenNameStringLiteral	cue
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"died"	TokenNameStringLiteral	died
,	TokenNameCOMMA	
"die"	TokenNameStringLiteral	die
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"eyed"	TokenNameStringLiteral	eyed
,	TokenNameCOMMA	
"eye"	TokenNameStringLiteral	eye
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"hued"	TokenNameStringLiteral	hued
,	TokenNameCOMMA	
"hue"	TokenNameStringLiteral	hue
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"iced"	TokenNameStringLiteral	iced
,	TokenNameCOMMA	
"ice"	TokenNameStringLiteral	ice
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"lied"	TokenNameStringLiteral	lied
,	TokenNameCOMMA	
"lie"	TokenNameStringLiteral	lie
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"owed"	TokenNameStringLiteral	owed
,	TokenNameCOMMA	
"owe"	TokenNameStringLiteral	owe
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"sued"	TokenNameStringLiteral	sued
,	TokenNameCOMMA	
"sue"	TokenNameStringLiteral	sue
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"toed"	TokenNameStringLiteral	toed
,	TokenNameCOMMA	
"toe"	TokenNameStringLiteral	toe
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"tied"	TokenNameStringLiteral	tied
,	TokenNameCOMMA	
"tie"	TokenNameStringLiteral	tie
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"does"	TokenNameStringLiteral	does
,	TokenNameCOMMA	
"do"	TokenNameStringLiteral	do
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"doing"	TokenNameStringLiteral	doing
,	TokenNameCOMMA	
"do"	TokenNameStringLiteral	do
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"aeronautical"	TokenNameStringLiteral	aeronautical
,	TokenNameCOMMA	
"aeronautics"	TokenNameStringLiteral	aeronautics
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"mathematical"	TokenNameStringLiteral	mathematical
,	TokenNameCOMMA	
"mathematics"	TokenNameStringLiteral	mathematics
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"political"	TokenNameStringLiteral	political
,	TokenNameCOMMA	
"politics"	TokenNameStringLiteral	politics
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"metaphysical"	TokenNameStringLiteral	metaphysical
,	TokenNameCOMMA	
"metaphysics"	TokenNameStringLiteral	metaphysics
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"cylindrical"	TokenNameStringLiteral	cylindrical
,	TokenNameCOMMA	
"cylinder"	TokenNameStringLiteral	cylinder
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"nazism"	TokenNameStringLiteral	nazism
,	TokenNameCOMMA	
"nazi"	TokenNameStringLiteral	nazi
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"ambiguity"	TokenNameStringLiteral	ambiguity
,	TokenNameCOMMA	
"ambiguous"	TokenNameStringLiteral	ambiguous
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"barbarity"	TokenNameStringLiteral	barbarity
,	TokenNameCOMMA	
"barbarous"	TokenNameStringLiteral	barbarous
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"credulity"	TokenNameStringLiteral	credulity
,	TokenNameCOMMA	
"credulous"	TokenNameStringLiteral	credulous
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"generosity"	TokenNameStringLiteral	generosity
,	TokenNameCOMMA	
"generous"	TokenNameStringLiteral	generous
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"spontaneity"	TokenNameStringLiteral	spontaneity
,	TokenNameCOMMA	
"spontaneous"	TokenNameStringLiteral	spontaneous
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"unanimity"	TokenNameStringLiteral	unanimity
,	TokenNameCOMMA	
"unanimous"	TokenNameStringLiteral	unanimous
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"voracity"	TokenNameStringLiteral	voracity
,	TokenNameCOMMA	
"voracious"	TokenNameStringLiteral	voracious
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"fled"	TokenNameStringLiteral	fled
,	TokenNameCOMMA	
"flee"	TokenNameStringLiteral	flee
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"miscarriage"	TokenNameStringLiteral	miscarriage
,	TokenNameCOMMA	
"miscarry"	TokenNameStringLiteral	miscarry
}	TokenNameRBRACE	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
static	TokenNamestatic	
private	TokenNameprivate	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
countryNationality	TokenNameIdentifier	 country Nationality
=	TokenNameEQUAL	
{	TokenNameLBRACE	
{	TokenNameLBRACE	
"afghan"	TokenNameStringLiteral	afghan
,	TokenNameCOMMA	
"afghanistan"	TokenNameStringLiteral	afghanistan
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"african"	TokenNameStringLiteral	african
,	TokenNameCOMMA	
"africa"	TokenNameStringLiteral	africa
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"albanian"	TokenNameStringLiteral	albanian
,	TokenNameCOMMA	
"albania"	TokenNameStringLiteral	albania
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"algerian"	TokenNameStringLiteral	algerian
,	TokenNameCOMMA	
"algeria"	TokenNameStringLiteral	algeria
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"american"	TokenNameStringLiteral	american
,	TokenNameCOMMA	
"america"	TokenNameStringLiteral	america
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"andorran"	TokenNameStringLiteral	andorran
,	TokenNameCOMMA	
"andorra"	TokenNameStringLiteral	andorra
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"angolan"	TokenNameStringLiteral	angolan
,	TokenNameCOMMA	
"angola"	TokenNameStringLiteral	angola
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"arabian"	TokenNameStringLiteral	arabian
,	TokenNameCOMMA	
"arabia"	TokenNameStringLiteral	arabia
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"argentine"	TokenNameStringLiteral	argentine
,	TokenNameCOMMA	
"argentina"	TokenNameStringLiteral	argentina
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"armenian"	TokenNameStringLiteral	armenian
,	TokenNameCOMMA	
"armenia"	TokenNameStringLiteral	armenia
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"asian"	TokenNameStringLiteral	asian
,	TokenNameCOMMA	
"asia"	TokenNameStringLiteral	asia
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"australian"	TokenNameStringLiteral	australian
,	TokenNameCOMMA	
"australia"	TokenNameStringLiteral	australia
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"austrian"	TokenNameStringLiteral	austrian
,	TokenNameCOMMA	
"austria"	TokenNameStringLiteral	austria
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"azerbaijani"	TokenNameStringLiteral	azerbaijani
,	TokenNameCOMMA	
"azerbaijan"	TokenNameStringLiteral	azerbaijan
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"azeri"	TokenNameStringLiteral	azeri
,	TokenNameCOMMA	
"azerbaijan"	TokenNameStringLiteral	azerbaijan
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"bangladeshi"	TokenNameStringLiteral	bangladeshi
,	TokenNameCOMMA	
"bangladesh"	TokenNameStringLiteral	bangladesh
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"belgian"	TokenNameStringLiteral	belgian
,	TokenNameCOMMA	
"belgium"	TokenNameStringLiteral	belgium
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"bermudan"	TokenNameStringLiteral	bermudan
,	TokenNameCOMMA	
"bermuda"	TokenNameStringLiteral	bermuda
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"bolivian"	TokenNameStringLiteral	bolivian
,	TokenNameCOMMA	
"bolivia"	TokenNameStringLiteral	bolivia
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"bosnian"	TokenNameStringLiteral	bosnian
,	TokenNameCOMMA	
"bosnia"	TokenNameStringLiteral	bosnia
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"botswanan"	TokenNameStringLiteral	botswanan
,	TokenNameCOMMA	
"botswana"	TokenNameStringLiteral	botswana
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"brazilian"	TokenNameStringLiteral	brazilian
,	TokenNameCOMMA	
"brazil"	TokenNameStringLiteral	brazil
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"british"	TokenNameStringLiteral	british
,	TokenNameCOMMA	
"britain"	TokenNameStringLiteral	britain
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"bulgarian"	TokenNameStringLiteral	bulgarian
,	TokenNameCOMMA	
"bulgaria"	TokenNameStringLiteral	bulgaria
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"burmese"	TokenNameStringLiteral	burmese
,	TokenNameCOMMA	
"burma"	TokenNameStringLiteral	burma
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"californian"	TokenNameStringLiteral	californian
,	TokenNameCOMMA	
"california"	TokenNameStringLiteral	california
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"cambodian"	TokenNameStringLiteral	cambodian
,	TokenNameCOMMA	
"cambodia"	TokenNameStringLiteral	cambodia
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"canadian"	TokenNameStringLiteral	canadian
,	TokenNameCOMMA	
"canada"	TokenNameStringLiteral	canada
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"chadian"	TokenNameStringLiteral	chadian
,	TokenNameCOMMA	
"chad"	TokenNameStringLiteral	chad
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"chilean"	TokenNameStringLiteral	chilean
,	TokenNameCOMMA	
"chile"	TokenNameStringLiteral	chile
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"chinese"	TokenNameStringLiteral	chinese
,	TokenNameCOMMA	
"china"	TokenNameStringLiteral	china
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"colombian"	TokenNameStringLiteral	colombian
,	TokenNameCOMMA	
"colombia"	TokenNameStringLiteral	colombia
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"croat"	TokenNameStringLiteral	croat
,	TokenNameCOMMA	
"croatia"	TokenNameStringLiteral	croatia
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"croatian"	TokenNameStringLiteral	croatian
,	TokenNameCOMMA	
"croatia"	TokenNameStringLiteral	croatia
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"cuban"	TokenNameStringLiteral	cuban
,	TokenNameCOMMA	
"cuba"	TokenNameStringLiteral	cuba
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"cypriot"	TokenNameStringLiteral	cypriot
,	TokenNameCOMMA	
"cyprus"	TokenNameStringLiteral	cyprus
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"czechoslovakian"	TokenNameStringLiteral	czechoslovakian
,	TokenNameCOMMA	
"czechoslovakia"	TokenNameStringLiteral	czechoslovakia
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"danish"	TokenNameStringLiteral	danish
,	TokenNameCOMMA	
"denmark"	TokenNameStringLiteral	denmark
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"egyptian"	TokenNameStringLiteral	egyptian
,	TokenNameCOMMA	
"egypt"	TokenNameStringLiteral	egypt
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"equadorian"	TokenNameStringLiteral	equadorian
,	TokenNameCOMMA	
"equador"	TokenNameStringLiteral	equador
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"eritrean"	TokenNameStringLiteral	eritrean
,	TokenNameCOMMA	
"eritrea"	TokenNameStringLiteral	eritrea
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"estonian"	TokenNameStringLiteral	estonian
,	TokenNameCOMMA	
"estonia"	TokenNameStringLiteral	estonia
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"ethiopian"	TokenNameStringLiteral	ethiopian
,	TokenNameCOMMA	
"ethiopia"	TokenNameStringLiteral	ethiopia
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"european"	TokenNameStringLiteral	european
,	TokenNameCOMMA	
"europe"	TokenNameStringLiteral	europe
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"fijian"	TokenNameStringLiteral	fijian
,	TokenNameCOMMA	
"fiji"	TokenNameStringLiteral	fiji
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"filipino"	TokenNameStringLiteral	filipino
,	TokenNameCOMMA	
"philippines"	TokenNameStringLiteral	philippines
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"finnish"	TokenNameStringLiteral	finnish
,	TokenNameCOMMA	
"finland"	TokenNameStringLiteral	finland
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"french"	TokenNameStringLiteral	french
,	TokenNameCOMMA	
"france"	TokenNameStringLiteral	france
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"gambian"	TokenNameStringLiteral	gambian
,	TokenNameCOMMA	
"gambia"	TokenNameStringLiteral	gambia
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"georgian"	TokenNameStringLiteral	georgian
,	TokenNameCOMMA	
"georgia"	TokenNameStringLiteral	georgia
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"german"	TokenNameStringLiteral	german
,	TokenNameCOMMA	
"germany"	TokenNameStringLiteral	germany
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"ghanian"	TokenNameStringLiteral	ghanian
,	TokenNameCOMMA	
"ghana"	TokenNameStringLiteral	ghana
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"greek"	TokenNameStringLiteral	greek
,	TokenNameCOMMA	
"greece"	TokenNameStringLiteral	greece
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"grenadan"	TokenNameStringLiteral	grenadan
,	TokenNameCOMMA	
"grenada"	TokenNameStringLiteral	grenada
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"guamian"	TokenNameStringLiteral	guamian
,	TokenNameCOMMA	
"guam"	TokenNameStringLiteral	guam
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"guatemalan"	TokenNameStringLiteral	guatemalan
,	TokenNameCOMMA	
"guatemala"	TokenNameStringLiteral	guatemala
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"guinean"	TokenNameStringLiteral	guinean
,	TokenNameCOMMA	
"guinea"	TokenNameStringLiteral	guinea
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"guyanan"	TokenNameStringLiteral	guyanan
,	TokenNameCOMMA	
"guyana"	TokenNameStringLiteral	guyana
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"haitian"	TokenNameStringLiteral	haitian
,	TokenNameCOMMA	
"haiti"	TokenNameStringLiteral	haiti
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"hawaiian"	TokenNameStringLiteral	hawaiian
,	TokenNameCOMMA	
"hawaii"	TokenNameStringLiteral	hawaii
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"holland"	TokenNameStringLiteral	holland
,	TokenNameCOMMA	
"dutch"	TokenNameStringLiteral	dutch
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"honduran"	TokenNameStringLiteral	honduran
,	TokenNameCOMMA	
"honduras"	TokenNameStringLiteral	honduras
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"hungarian"	TokenNameStringLiteral	hungarian
,	TokenNameCOMMA	
"hungary"	TokenNameStringLiteral	hungary
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"icelandic"	TokenNameStringLiteral	icelandic
,	TokenNameCOMMA	
"iceland"	TokenNameStringLiteral	iceland
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"indonesian"	TokenNameStringLiteral	indonesian
,	TokenNameCOMMA	
"indonesia"	TokenNameStringLiteral	indonesia
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"iranian"	TokenNameStringLiteral	iranian
,	TokenNameCOMMA	
"iran"	TokenNameStringLiteral	iran
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"iraqi"	TokenNameStringLiteral	iraqi
,	TokenNameCOMMA	
"iraq"	TokenNameStringLiteral	iraq
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"iraqui"	TokenNameStringLiteral	iraqui
,	TokenNameCOMMA	
"iraq"	TokenNameStringLiteral	iraq
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"irish"	TokenNameStringLiteral	irish
,	TokenNameCOMMA	
"ireland"	TokenNameStringLiteral	ireland
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"israeli"	TokenNameStringLiteral	israeli
,	TokenNameCOMMA	
"israel"	TokenNameStringLiteral	israel
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"italian"	TokenNameStringLiteral	italian
,	TokenNameCOMMA	
"italy"	TokenNameStringLiteral	italy
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"jamaican"	TokenNameStringLiteral	jamaican
,	TokenNameCOMMA	
"jamaica"	TokenNameStringLiteral	jamaica
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"japanese"	TokenNameStringLiteral	japanese
,	TokenNameCOMMA	
"japan"	TokenNameStringLiteral	japan
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"jordanian"	TokenNameStringLiteral	jordanian
,	TokenNameCOMMA	
"jordan"	TokenNameStringLiteral	jordan
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"kampuchean"	TokenNameStringLiteral	kampuchean
,	TokenNameCOMMA	
"cambodia"	TokenNameStringLiteral	cambodia
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"kenyan"	TokenNameStringLiteral	kenyan
,	TokenNameCOMMA	
"kenya"	TokenNameStringLiteral	kenya
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"korean"	TokenNameStringLiteral	korean
,	TokenNameCOMMA	
"korea"	TokenNameStringLiteral	korea
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"kuwaiti"	TokenNameStringLiteral	kuwaiti
,	TokenNameCOMMA	
"kuwait"	TokenNameStringLiteral	kuwait
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"lankan"	TokenNameStringLiteral	lankan
,	TokenNameCOMMA	
"lanka"	TokenNameStringLiteral	lanka
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"laotian"	TokenNameStringLiteral	laotian
,	TokenNameCOMMA	
"laos"	TokenNameStringLiteral	laos
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"latvian"	TokenNameStringLiteral	latvian
,	TokenNameCOMMA	
"latvia"	TokenNameStringLiteral	latvia
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"lebanese"	TokenNameStringLiteral	lebanese
,	TokenNameCOMMA	
"lebanon"	TokenNameStringLiteral	lebanon
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"liberian"	TokenNameStringLiteral	liberian
,	TokenNameCOMMA	
"liberia"	TokenNameStringLiteral	liberia
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"libyan"	TokenNameStringLiteral	libyan
,	TokenNameCOMMA	
"libya"	TokenNameStringLiteral	libya
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"lithuanian"	TokenNameStringLiteral	lithuanian
,	TokenNameCOMMA	
"lithuania"	TokenNameStringLiteral	lithuania
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"macedonian"	TokenNameStringLiteral	macedonian
,	TokenNameCOMMA	
"macedonia"	TokenNameStringLiteral	macedonia
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"madagascan"	TokenNameStringLiteral	madagascan
,	TokenNameCOMMA	
"madagascar"	TokenNameStringLiteral	madagascar
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"malaysian"	TokenNameStringLiteral	malaysian
,	TokenNameCOMMA	
"malaysia"	TokenNameStringLiteral	malaysia
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"maltese"	TokenNameStringLiteral	maltese
,	TokenNameCOMMA	
"malta"	TokenNameStringLiteral	malta
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"mauritanian"	TokenNameStringLiteral	mauritanian
,	TokenNameCOMMA	
"mauritania"	TokenNameStringLiteral	mauritania
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"mexican"	TokenNameStringLiteral	mexican
,	TokenNameCOMMA	
"mexico"	TokenNameStringLiteral	mexico
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"micronesian"	TokenNameStringLiteral	micronesian
,	TokenNameCOMMA	
"micronesia"	TokenNameStringLiteral	micronesia
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"moldovan"	TokenNameStringLiteral	moldovan
,	TokenNameCOMMA	
"moldova"	TokenNameStringLiteral	moldova
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"monacan"	TokenNameStringLiteral	monacan
,	TokenNameCOMMA	
"monaco"	TokenNameStringLiteral	monaco
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"mongolian"	TokenNameStringLiteral	mongolian
,	TokenNameCOMMA	
"mongolia"	TokenNameStringLiteral	mongolia
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"montenegran"	TokenNameStringLiteral	montenegran
,	TokenNameCOMMA	
"montenegro"	TokenNameStringLiteral	montenegro
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"moroccan"	TokenNameStringLiteral	moroccan
,	TokenNameCOMMA	
"morocco"	TokenNameStringLiteral	morocco
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"myanmar"	TokenNameStringLiteral	myanmar
,	TokenNameCOMMA	
"burma"	TokenNameStringLiteral	burma
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"namibian"	TokenNameStringLiteral	namibian
,	TokenNameCOMMA	
"namibia"	TokenNameStringLiteral	namibia
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"nepalese"	TokenNameStringLiteral	nepalese
,	TokenNameCOMMA	
"nepal"	TokenNameStringLiteral	nepal
}	TokenNameRBRACE	
,	TokenNameCOMMA	
// {"netherlands", "dutch"}, 	TokenNameCOMMENT_LINE	{"netherlands", "dutch"}, 
{	TokenNameLBRACE	
"nicaraguan"	TokenNameStringLiteral	nicaraguan
,	TokenNameCOMMA	
"nicaragua"	TokenNameStringLiteral	nicaragua
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"nigerian"	TokenNameStringLiteral	nigerian
,	TokenNameCOMMA	
"nigeria"	TokenNameStringLiteral	nigeria
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"norwegian"	TokenNameStringLiteral	norwegian
,	TokenNameCOMMA	
"norway"	TokenNameStringLiteral	norway
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"omani"	TokenNameStringLiteral	omani
,	TokenNameCOMMA	
"oman"	TokenNameStringLiteral	oman
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"pakistani"	TokenNameStringLiteral	pakistani
,	TokenNameCOMMA	
"pakistan"	TokenNameStringLiteral	pakistan
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"panamanian"	TokenNameStringLiteral	panamanian
,	TokenNameCOMMA	
"panama"	TokenNameStringLiteral	panama
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"papuan"	TokenNameStringLiteral	papuan
,	TokenNameCOMMA	
"papua"	TokenNameStringLiteral	papua
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"paraguayan"	TokenNameStringLiteral	paraguayan
,	TokenNameCOMMA	
"paraguay"	TokenNameStringLiteral	paraguay
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"peruvian"	TokenNameStringLiteral	peruvian
,	TokenNameCOMMA	
"peru"	TokenNameStringLiteral	peru
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"portuguese"	TokenNameStringLiteral	portuguese
,	TokenNameCOMMA	
"portugal"	TokenNameStringLiteral	portugal
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"romanian"	TokenNameStringLiteral	romanian
,	TokenNameCOMMA	
"romania"	TokenNameStringLiteral	romania
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"rumania"	TokenNameStringLiteral	rumania
,	TokenNameCOMMA	
"romania"	TokenNameStringLiteral	romania
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"rumanian"	TokenNameStringLiteral	rumanian
,	TokenNameCOMMA	
"romania"	TokenNameStringLiteral	romania
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"russian"	TokenNameStringLiteral	russian
,	TokenNameCOMMA	
"russia"	TokenNameStringLiteral	russia
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"rwandan"	TokenNameStringLiteral	rwandan
,	TokenNameCOMMA	
"rwanda"	TokenNameStringLiteral	rwanda
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"samoan"	TokenNameStringLiteral	samoan
,	TokenNameCOMMA	
"samoa"	TokenNameStringLiteral	samoa
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"scottish"	TokenNameStringLiteral	scottish
,	TokenNameCOMMA	
"scotland"	TokenNameStringLiteral	scotland
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"serb"	TokenNameStringLiteral	serb
,	TokenNameCOMMA	
"serbia"	TokenNameStringLiteral	serbia
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"serbian"	TokenNameStringLiteral	serbian
,	TokenNameCOMMA	
"serbia"	TokenNameStringLiteral	serbia
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"siam"	TokenNameStringLiteral	siam
,	TokenNameCOMMA	
"thailand"	TokenNameStringLiteral	thailand
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"siamese"	TokenNameStringLiteral	siamese
,	TokenNameCOMMA	
"thailand"	TokenNameStringLiteral	thailand
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"slovakia"	TokenNameStringLiteral	slovakia
,	TokenNameCOMMA	
"slovak"	TokenNameStringLiteral	slovak
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"slovakian"	TokenNameStringLiteral	slovakian
,	TokenNameCOMMA	
"slovak"	TokenNameStringLiteral	slovak
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"slovenian"	TokenNameStringLiteral	slovenian
,	TokenNameCOMMA	
"slovenia"	TokenNameStringLiteral	slovenia
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"somali"	TokenNameStringLiteral	somali
,	TokenNameCOMMA	
"somalia"	TokenNameStringLiteral	somalia
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"somalian"	TokenNameStringLiteral	somalian
,	TokenNameCOMMA	
"somalia"	TokenNameStringLiteral	somalia
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"spanish"	TokenNameStringLiteral	spanish
,	TokenNameCOMMA	
"spain"	TokenNameStringLiteral	spain
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"swedish"	TokenNameStringLiteral	swedish
,	TokenNameCOMMA	
"sweden"	TokenNameStringLiteral	sweden
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"swiss"	TokenNameStringLiteral	swiss
,	TokenNameCOMMA	
"switzerland"	TokenNameStringLiteral	switzerland
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"syrian"	TokenNameStringLiteral	syrian
,	TokenNameCOMMA	
"syria"	TokenNameStringLiteral	syria
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"taiwanese"	TokenNameStringLiteral	taiwanese
,	TokenNameCOMMA	
"taiwan"	TokenNameStringLiteral	taiwan
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"tanzanian"	TokenNameStringLiteral	tanzanian
,	TokenNameCOMMA	
"tanzania"	TokenNameStringLiteral	tanzania
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"texan"	TokenNameStringLiteral	texan
,	TokenNameCOMMA	
"texas"	TokenNameStringLiteral	texas
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"thai"	TokenNameStringLiteral	thai
,	TokenNameCOMMA	
"thailand"	TokenNameStringLiteral	thailand
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"tunisian"	TokenNameStringLiteral	tunisian
,	TokenNameCOMMA	
"tunisia"	TokenNameStringLiteral	tunisia
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"turkish"	TokenNameStringLiteral	turkish
,	TokenNameCOMMA	
"turkey"	TokenNameStringLiteral	turkey
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"ugandan"	TokenNameStringLiteral	ugandan
,	TokenNameCOMMA	
"uganda"	TokenNameStringLiteral	uganda
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"ukrainian"	TokenNameStringLiteral	ukrainian
,	TokenNameCOMMA	
"ukraine"	TokenNameStringLiteral	ukraine
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"uruguayan"	TokenNameStringLiteral	uruguayan
,	TokenNameCOMMA	
"uruguay"	TokenNameStringLiteral	uruguay
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"uzbek"	TokenNameStringLiteral	uzbek
,	TokenNameCOMMA	
"uzbekistan"	TokenNameStringLiteral	uzbekistan
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"venezuelan"	TokenNameStringLiteral	venezuelan
,	TokenNameCOMMA	
"venezuela"	TokenNameStringLiteral	venezuela
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"vietnamese"	TokenNameStringLiteral	vietnamese
,	TokenNameCOMMA	
"viet"	TokenNameStringLiteral	viet
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"virginian"	TokenNameStringLiteral	virginian
,	TokenNameCOMMA	
"virginia"	TokenNameStringLiteral	virginia
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"yemeni"	TokenNameStringLiteral	yemeni
,	TokenNameCOMMA	
"yemen"	TokenNameStringLiteral	yemen
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"yugoslav"	TokenNameStringLiteral	yugoslav
,	TokenNameCOMMA	
"yugoslavia"	TokenNameStringLiteral	yugoslavia
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"yugoslavian"	TokenNameStringLiteral	yugoslavian
,	TokenNameCOMMA	
"yugoslavia"	TokenNameStringLiteral	yugoslavia
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"zambian"	TokenNameStringLiteral	zambian
,	TokenNameCOMMA	
"zambia"	TokenNameStringLiteral	zambia
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"zealander"	TokenNameStringLiteral	zealander
,	TokenNameCOMMA	
"zealand"	TokenNameStringLiteral	zealand
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"zimbabwean"	TokenNameStringLiteral	zimbabwean
,	TokenNameCOMMA	
"zimbabwe"	TokenNameStringLiteral	zimbabwe
}	TokenNameRBRACE	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
static	TokenNamestatic	
private	TokenNameprivate	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
supplementDict	TokenNameIdentifier	 supplement Dict
=	TokenNameEQUAL	
{	TokenNameLBRACE	
"aids"	TokenNameStringLiteral	aids
,	TokenNameCOMMA	
"applicator"	TokenNameStringLiteral	applicator
,	TokenNameCOMMA	
"capacitor"	TokenNameStringLiteral	capacitor
,	TokenNameCOMMA	
"digitize"	TokenNameStringLiteral	digitize
,	TokenNameCOMMA	
"electromagnet"	TokenNameStringLiteral	electromagnet
,	TokenNameCOMMA	
"ellipsoid"	TokenNameStringLiteral	ellipsoid
,	TokenNameCOMMA	
"exosphere"	TokenNameStringLiteral	exosphere
,	TokenNameCOMMA	
"extensible"	TokenNameStringLiteral	extensible
,	TokenNameCOMMA	
"ferromagnet"	TokenNameStringLiteral	ferromagnet
,	TokenNameCOMMA	
"graphics"	TokenNameStringLiteral	graphics
,	TokenNameCOMMA	
"hydromagnet"	TokenNameStringLiteral	hydromagnet
,	TokenNameCOMMA	
"polygraph"	TokenNameStringLiteral	polygraph
,	TokenNameCOMMA	
"toroid"	TokenNameStringLiteral	toroid
,	TokenNameCOMMA	
"superconduct"	TokenNameStringLiteral	superconduct
,	TokenNameCOMMA	
"backscatter"	TokenNameStringLiteral	backscatter
,	TokenNameCOMMA	
"connectionism"	TokenNameStringLiteral	connectionism
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
static	TokenNamestatic	
private	TokenNameprivate	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
properNouns	TokenNameIdentifier	 proper Nouns
=	TokenNameEQUAL	
{	TokenNameLBRACE	
"abrams"	TokenNameStringLiteral	abrams
,	TokenNameCOMMA	
"achilles"	TokenNameStringLiteral	achilles
,	TokenNameCOMMA	
"acropolis"	TokenNameStringLiteral	acropolis
,	TokenNameCOMMA	
"adams"	TokenNameStringLiteral	adams
,	TokenNameCOMMA	
"agnes"	TokenNameStringLiteral	agnes
,	TokenNameCOMMA	
"aires"	TokenNameStringLiteral	aires
,	TokenNameCOMMA	
"alexander"	TokenNameStringLiteral	alexander
,	TokenNameCOMMA	
"alexis"	TokenNameStringLiteral	alexis
,	TokenNameCOMMA	
"alfred"	TokenNameStringLiteral	alfred
,	TokenNameCOMMA	
"algiers"	TokenNameStringLiteral	algiers
,	TokenNameCOMMA	
"alps"	TokenNameStringLiteral	alps
,	TokenNameCOMMA	
"amadeus"	TokenNameStringLiteral	amadeus
,	TokenNameCOMMA	
"ames"	TokenNameStringLiteral	ames
,	TokenNameCOMMA	
"amos"	TokenNameStringLiteral	amos
,	TokenNameCOMMA	
"andes"	TokenNameStringLiteral	andes
,	TokenNameCOMMA	
"angeles"	TokenNameStringLiteral	angeles
,	TokenNameCOMMA	
"annapolis"	TokenNameStringLiteral	annapolis
,	TokenNameCOMMA	
"antilles"	TokenNameStringLiteral	antilles
,	TokenNameCOMMA	
"aquarius"	TokenNameStringLiteral	aquarius
,	TokenNameCOMMA	
"archimedes"	TokenNameStringLiteral	archimedes
,	TokenNameCOMMA	
"arkansas"	TokenNameStringLiteral	arkansas
,	TokenNameCOMMA	
"asher"	TokenNameStringLiteral	asher
,	TokenNameCOMMA	
"ashly"	TokenNameStringLiteral	ashly
,	TokenNameCOMMA	
"athens"	TokenNameStringLiteral	athens
,	TokenNameCOMMA	
"atkins"	TokenNameStringLiteral	atkins
,	TokenNameCOMMA	
"atlantis"	TokenNameStringLiteral	atlantis
,	TokenNameCOMMA	
"avis"	TokenNameStringLiteral	avis
,	TokenNameCOMMA	
"bahamas"	TokenNameStringLiteral	bahamas
,	TokenNameCOMMA	
"bangor"	TokenNameStringLiteral	bangor
,	TokenNameCOMMA	
"barbados"	TokenNameStringLiteral	barbados
,	TokenNameCOMMA	
"barger"	TokenNameStringLiteral	barger
,	TokenNameCOMMA	
"bering"	TokenNameStringLiteral	bering
,	TokenNameCOMMA	
"brahms"	TokenNameStringLiteral	brahms
,	TokenNameCOMMA	
"brandeis"	TokenNameStringLiteral	brandeis
,	TokenNameCOMMA	
"brussels"	TokenNameStringLiteral	brussels
,	TokenNameCOMMA	
"bruxelles"	TokenNameStringLiteral	bruxelles
,	TokenNameCOMMA	
"cairns"	TokenNameStringLiteral	cairns
,	TokenNameCOMMA	
"camoros"	TokenNameStringLiteral	camoros
,	TokenNameCOMMA	
"camus"	TokenNameStringLiteral	camus
,	TokenNameCOMMA	
"carlos"	TokenNameStringLiteral	carlos
,	TokenNameCOMMA	
"celts"	TokenNameStringLiteral	celts
,	TokenNameCOMMA	
"chalker"	TokenNameStringLiteral	chalker
,	TokenNameCOMMA	
"charles"	TokenNameStringLiteral	charles
,	TokenNameCOMMA	
"cheops"	TokenNameStringLiteral	cheops
,	TokenNameCOMMA	
"ching"	TokenNameStringLiteral	ching
,	TokenNameCOMMA	
"christmas"	TokenNameStringLiteral	christmas
,	TokenNameCOMMA	
"cocos"	TokenNameStringLiteral	cocos
,	TokenNameCOMMA	
"collins"	TokenNameStringLiteral	collins
,	TokenNameCOMMA	
"columbus"	TokenNameStringLiteral	columbus
,	TokenNameCOMMA	
"confucius"	TokenNameStringLiteral	confucius
,	TokenNameCOMMA	
"conners"	TokenNameStringLiteral	conners
,	TokenNameCOMMA	
"connolly"	TokenNameStringLiteral	connolly
,	TokenNameCOMMA	
"copernicus"	TokenNameStringLiteral	copernicus
,	TokenNameCOMMA	
"cramer"	TokenNameStringLiteral	cramer
,	TokenNameCOMMA	
"cyclops"	TokenNameStringLiteral	cyclops
,	TokenNameCOMMA	
"cygnus"	TokenNameStringLiteral	cygnus
,	TokenNameCOMMA	
"cyprus"	TokenNameStringLiteral	cyprus
,	TokenNameCOMMA	
"dallas"	TokenNameStringLiteral	dallas
,	TokenNameCOMMA	
"damascus"	TokenNameStringLiteral	damascus
,	TokenNameCOMMA	
"daniels"	TokenNameStringLiteral	daniels
,	TokenNameCOMMA	
"davies"	TokenNameStringLiteral	davies
,	TokenNameCOMMA	
"davis"	TokenNameStringLiteral	davis
,	TokenNameCOMMA	
"decker"	TokenNameStringLiteral	decker
,	TokenNameCOMMA	
"denning"	TokenNameStringLiteral	denning
,	TokenNameCOMMA	
"dennis"	TokenNameStringLiteral	dennis
,	TokenNameCOMMA	
"descartes"	TokenNameStringLiteral	descartes
,	TokenNameCOMMA	
"dickens"	TokenNameStringLiteral	dickens
,	TokenNameCOMMA	
"doris"	TokenNameStringLiteral	doris
,	TokenNameCOMMA	
"douglas"	TokenNameStringLiteral	douglas
,	TokenNameCOMMA	
"downs"	TokenNameStringLiteral	downs
,	TokenNameCOMMA	
"dreyfus"	TokenNameStringLiteral	dreyfus
,	TokenNameCOMMA	
"dukakis"	TokenNameStringLiteral	dukakis
,	TokenNameCOMMA	
"dulles"	TokenNameStringLiteral	dulles
,	TokenNameCOMMA	
"dumfries"	TokenNameStringLiteral	dumfries
,	TokenNameCOMMA	
"ecclesiastes"	TokenNameStringLiteral	ecclesiastes
,	TokenNameCOMMA	
"edwards"	TokenNameStringLiteral	edwards
,	TokenNameCOMMA	
"emily"	TokenNameStringLiteral	emily
,	TokenNameCOMMA	
"erasmus"	TokenNameStringLiteral	erasmus
,	TokenNameCOMMA	
"euphrates"	TokenNameStringLiteral	euphrates
,	TokenNameCOMMA	
"evans"	TokenNameStringLiteral	evans
,	TokenNameCOMMA	
"everglades"	TokenNameStringLiteral	everglades
,	TokenNameCOMMA	
"fairbanks"	TokenNameStringLiteral	fairbanks
,	TokenNameCOMMA	
"federales"	TokenNameStringLiteral	federales
,	TokenNameCOMMA	
"fisher"	TokenNameStringLiteral	fisher
,	TokenNameCOMMA	
"fitzsimmons"	TokenNameStringLiteral	fitzsimmons
,	TokenNameCOMMA	
"fleming"	TokenNameStringLiteral	fleming
,	TokenNameCOMMA	
"forbes"	TokenNameStringLiteral	forbes
,	TokenNameCOMMA	
"fowler"	TokenNameStringLiteral	fowler
,	TokenNameCOMMA	
"france"	TokenNameStringLiteral	france
,	TokenNameCOMMA	
"francis"	TokenNameStringLiteral	francis
,	TokenNameCOMMA	
"goering"	TokenNameStringLiteral	goering
,	TokenNameCOMMA	
"goodling"	TokenNameStringLiteral	goodling
,	TokenNameCOMMA	
"goths"	TokenNameStringLiteral	goths
,	TokenNameCOMMA	
"grenadines"	TokenNameStringLiteral	grenadines
,	TokenNameCOMMA	
"guiness"	TokenNameStringLiteral	guiness
,	TokenNameCOMMA	
"hades"	TokenNameStringLiteral	hades
,	TokenNameCOMMA	
"harding"	TokenNameStringLiteral	harding
,	TokenNameCOMMA	
"harris"	TokenNameStringLiteral	harris
,	TokenNameCOMMA	
"hastings"	TokenNameStringLiteral	hastings
,	TokenNameCOMMA	
"hawkes"	TokenNameStringLiteral	hawkes
,	TokenNameCOMMA	
"hawking"	TokenNameStringLiteral	hawking
,	TokenNameCOMMA	
"hayes"	TokenNameStringLiteral	hayes
,	TokenNameCOMMA	
"heights"	TokenNameStringLiteral	heights
,	TokenNameCOMMA	
"hercules"	TokenNameStringLiteral	hercules
,	TokenNameCOMMA	
"himalayas"	TokenNameStringLiteral	himalayas
,	TokenNameCOMMA	
"hippocrates"	TokenNameStringLiteral	hippocrates
,	TokenNameCOMMA	
"hobbs"	TokenNameStringLiteral	hobbs
,	TokenNameCOMMA	
"holmes"	TokenNameStringLiteral	holmes
,	TokenNameCOMMA	
"honduras"	TokenNameStringLiteral	honduras
,	TokenNameCOMMA	
"hopkins"	TokenNameStringLiteral	hopkins
,	TokenNameCOMMA	
"hughes"	TokenNameStringLiteral	hughes
,	TokenNameCOMMA	
"humphreys"	TokenNameStringLiteral	humphreys
,	TokenNameCOMMA	
"illinois"	TokenNameStringLiteral	illinois
,	TokenNameCOMMA	
"indianapolis"	TokenNameStringLiteral	indianapolis
,	TokenNameCOMMA	
"inverness"	TokenNameStringLiteral	inverness
,	TokenNameCOMMA	
"iris"	TokenNameStringLiteral	iris
,	TokenNameCOMMA	
"iroquois"	TokenNameStringLiteral	iroquois
,	TokenNameCOMMA	
"irving"	TokenNameStringLiteral	irving
,	TokenNameCOMMA	
"isaacs"	TokenNameStringLiteral	isaacs
,	TokenNameCOMMA	
"italy"	TokenNameStringLiteral	italy
,	TokenNameCOMMA	
"james"	TokenNameStringLiteral	james
,	TokenNameCOMMA	
"jarvis"	TokenNameStringLiteral	jarvis
,	TokenNameCOMMA	
"jeffreys"	TokenNameStringLiteral	jeffreys
,	TokenNameCOMMA	
"jesus"	TokenNameStringLiteral	jesus
,	TokenNameCOMMA	
"jones"	TokenNameStringLiteral	jones
,	TokenNameCOMMA	
"josephus"	TokenNameStringLiteral	josephus
,	TokenNameCOMMA	
"judas"	TokenNameStringLiteral	judas
,	TokenNameCOMMA	
"julius"	TokenNameStringLiteral	julius
,	TokenNameCOMMA	
"kansas"	TokenNameStringLiteral	kansas
,	TokenNameCOMMA	
"keynes"	TokenNameStringLiteral	keynes
,	TokenNameCOMMA	
"kipling"	TokenNameStringLiteral	kipling
,	TokenNameCOMMA	
"kiwanis"	TokenNameStringLiteral	kiwanis
,	TokenNameCOMMA	
"lansing"	TokenNameStringLiteral	lansing
,	TokenNameCOMMA	
"laos"	TokenNameStringLiteral	laos
,	TokenNameCOMMA	
"leeds"	TokenNameStringLiteral	leeds
,	TokenNameCOMMA	
"levis"	TokenNameStringLiteral	levis
,	TokenNameCOMMA	
"leviticus"	TokenNameStringLiteral	leviticus
,	TokenNameCOMMA	
"lewis"	TokenNameStringLiteral	lewis
,	TokenNameCOMMA	
"louis"	TokenNameStringLiteral	louis
,	TokenNameCOMMA	
"maccabees"	TokenNameStringLiteral	maccabees
,	TokenNameCOMMA	
"madras"	TokenNameStringLiteral	madras
,	TokenNameCOMMA	
"maimonides"	TokenNameStringLiteral	maimonides
,	TokenNameCOMMA	
"maldive"	TokenNameStringLiteral	maldive
,	TokenNameCOMMA	
"massachusetts"	TokenNameStringLiteral	massachusetts
,	TokenNameCOMMA	
"matthews"	TokenNameStringLiteral	matthews
,	TokenNameCOMMA	
"mauritius"	TokenNameStringLiteral	mauritius
,	TokenNameCOMMA	
"memphis"	TokenNameStringLiteral	memphis
,	TokenNameCOMMA	
"mercedes"	TokenNameStringLiteral	mercedes
,	TokenNameCOMMA	
"midas"	TokenNameStringLiteral	midas
,	TokenNameCOMMA	
"mingus"	TokenNameStringLiteral	mingus
,	TokenNameCOMMA	
"minneapolis"	TokenNameStringLiteral	minneapolis
,	TokenNameCOMMA	
"mohammed"	TokenNameStringLiteral	mohammed
,	TokenNameCOMMA	
"moines"	TokenNameStringLiteral	moines
,	TokenNameCOMMA	
"morris"	TokenNameStringLiteral	morris
,	TokenNameCOMMA	
"moses"	TokenNameStringLiteral	moses
,	TokenNameCOMMA	
"myers"	TokenNameStringLiteral	myers
,	TokenNameCOMMA	
"myknos"	TokenNameStringLiteral	myknos
,	TokenNameCOMMA	
"nablus"	TokenNameStringLiteral	nablus
,	TokenNameCOMMA	
"nanjing"	TokenNameStringLiteral	nanjing
,	TokenNameCOMMA	
"nantes"	TokenNameStringLiteral	nantes
,	TokenNameCOMMA	
"naples"	TokenNameStringLiteral	naples
,	TokenNameCOMMA	
"neal"	TokenNameStringLiteral	neal
,	TokenNameCOMMA	
"netherlands"	TokenNameStringLiteral	netherlands
,	TokenNameCOMMA	
"nevis"	TokenNameStringLiteral	nevis
,	TokenNameCOMMA	
"nostradamus"	TokenNameStringLiteral	nostradamus
,	TokenNameCOMMA	
"oedipus"	TokenNameStringLiteral	oedipus
,	TokenNameCOMMA	
"olympus"	TokenNameStringLiteral	olympus
,	TokenNameCOMMA	
"orleans"	TokenNameStringLiteral	orleans
,	TokenNameCOMMA	
"orly"	TokenNameStringLiteral	orly
,	TokenNameCOMMA	
"papas"	TokenNameStringLiteral	papas
,	TokenNameCOMMA	
"paris"	TokenNameStringLiteral	paris
,	TokenNameCOMMA	
"parker"	TokenNameStringLiteral	parker
,	TokenNameCOMMA	
"pauling"	TokenNameStringLiteral	pauling
,	TokenNameCOMMA	
"peking"	TokenNameStringLiteral	peking
,	TokenNameCOMMA	
"pershing"	TokenNameStringLiteral	pershing
,	TokenNameCOMMA	
"peter"	TokenNameStringLiteral	peter
,	TokenNameCOMMA	
"peters"	TokenNameStringLiteral	peters
,	TokenNameCOMMA	
"philippines"	TokenNameStringLiteral	philippines
,	TokenNameCOMMA	
"phineas"	TokenNameStringLiteral	phineas
,	TokenNameCOMMA	
"pisces"	TokenNameStringLiteral	pisces
,	TokenNameCOMMA	
"pryor"	TokenNameStringLiteral	pryor
,	TokenNameCOMMA	
"pythagoras"	TokenNameStringLiteral	pythagoras
,	TokenNameCOMMA	
"queens"	TokenNameStringLiteral	queens
,	TokenNameCOMMA	
"rabelais"	TokenNameStringLiteral	rabelais
,	TokenNameCOMMA	
"ramses"	TokenNameStringLiteral	ramses
,	TokenNameCOMMA	
"reynolds"	TokenNameStringLiteral	reynolds
,	TokenNameCOMMA	
"rhesus"	TokenNameStringLiteral	rhesus
,	TokenNameCOMMA	
"rhodes"	TokenNameStringLiteral	rhodes
,	TokenNameCOMMA	
"richards"	TokenNameStringLiteral	richards
,	TokenNameCOMMA	
"robins"	TokenNameStringLiteral	robins
,	TokenNameCOMMA	
"rodgers"	TokenNameStringLiteral	rodgers
,	TokenNameCOMMA	
"rogers"	TokenNameStringLiteral	rogers
,	TokenNameCOMMA	
"rubens"	TokenNameStringLiteral	rubens
,	TokenNameCOMMA	
"sagittarius"	TokenNameStringLiteral	sagittarius
,	TokenNameCOMMA	
"seychelles"	TokenNameStringLiteral	seychelles
,	TokenNameCOMMA	
"socrates"	TokenNameStringLiteral	socrates
,	TokenNameCOMMA	
"texas"	TokenNameStringLiteral	texas
,	TokenNameCOMMA	
"thames"	TokenNameStringLiteral	thames
,	TokenNameCOMMA	
"thomas"	TokenNameStringLiteral	thomas
,	TokenNameCOMMA	
"tiberias"	TokenNameStringLiteral	tiberias
,	TokenNameCOMMA	
"tunis"	TokenNameStringLiteral	tunis
,	TokenNameCOMMA	
"venus"	TokenNameStringLiteral	venus
,	TokenNameCOMMA	
"vilnius"	TokenNameStringLiteral	vilnius
,	TokenNameCOMMA	
"wales"	TokenNameStringLiteral	wales
,	TokenNameCOMMA	
"warner"	TokenNameStringLiteral	warner
,	TokenNameCOMMA	
"wilkins"	TokenNameStringLiteral	wilkins
,	TokenNameCOMMA	
"williams"	TokenNameStringLiteral	williams
,	TokenNameCOMMA	
"wyoming"	TokenNameStringLiteral	wyoming
,	TokenNameCOMMA	
"xmas"	TokenNameStringLiteral	xmas
,	TokenNameCOMMA	
"yonkers"	TokenNameStringLiteral	yonkers
,	TokenNameCOMMA	
"zeus"	TokenNameStringLiteral	zeus
,	TokenNameCOMMA	
"frances"	TokenNameStringLiteral	frances
,	TokenNameCOMMA	
"aarhus"	TokenNameStringLiteral	aarhus
,	TokenNameCOMMA	
"adonis"	TokenNameStringLiteral	adonis
,	TokenNameCOMMA	
"andrews"	TokenNameStringLiteral	andrews
,	TokenNameCOMMA	
"angus"	TokenNameStringLiteral	angus
,	TokenNameCOMMA	
"antares"	TokenNameStringLiteral	antares
,	TokenNameCOMMA	
"aquinas"	TokenNameStringLiteral	aquinas
,	TokenNameCOMMA	
"arcturus"	TokenNameStringLiteral	arcturus
,	TokenNameCOMMA	
"ares"	TokenNameStringLiteral	ares
,	TokenNameCOMMA	
"artemis"	TokenNameStringLiteral	artemis
,	TokenNameCOMMA	
"augustus"	TokenNameStringLiteral	augustus
,	TokenNameCOMMA	
"ayers"	TokenNameStringLiteral	ayers
,	TokenNameCOMMA	
"barnabas"	TokenNameStringLiteral	barnabas
,	TokenNameCOMMA	
"barnes"	TokenNameStringLiteral	barnes
,	TokenNameCOMMA	
"becker"	TokenNameStringLiteral	becker
,	TokenNameCOMMA	
"bejing"	TokenNameStringLiteral	bejing
,	TokenNameCOMMA	
"biggs"	TokenNameStringLiteral	biggs
,	TokenNameCOMMA	
"billings"	TokenNameStringLiteral	billings
,	TokenNameCOMMA	
"boeing"	TokenNameStringLiteral	boeing
,	TokenNameCOMMA	
"boris"	TokenNameStringLiteral	boris
,	TokenNameCOMMA	
"borroughs"	TokenNameStringLiteral	borroughs
,	TokenNameCOMMA	
"briggs"	TokenNameStringLiteral	briggs
,	TokenNameCOMMA	
"buenos"	TokenNameStringLiteral	buenos
,	TokenNameCOMMA	
"calais"	TokenNameStringLiteral	calais
,	TokenNameCOMMA	
"caracas"	TokenNameStringLiteral	caracas
,	TokenNameCOMMA	
"cassius"	TokenNameStringLiteral	cassius
,	TokenNameCOMMA	
"cerberus"	TokenNameStringLiteral	cerberus
,	TokenNameCOMMA	
"ceres"	TokenNameStringLiteral	ceres
,	TokenNameCOMMA	
"cervantes"	TokenNameStringLiteral	cervantes
,	TokenNameCOMMA	
"chantilly"	TokenNameStringLiteral	chantilly
,	TokenNameCOMMA	
"chartres"	TokenNameStringLiteral	chartres
,	TokenNameCOMMA	
"chester"	TokenNameStringLiteral	chester
,	TokenNameCOMMA	
"connally"	TokenNameStringLiteral	connally
,	TokenNameCOMMA	
"conner"	TokenNameStringLiteral	conner
,	TokenNameCOMMA	
"coors"	TokenNameStringLiteral	coors
,	TokenNameCOMMA	
"cummings"	TokenNameStringLiteral	cummings
,	TokenNameCOMMA	
"curtis"	TokenNameStringLiteral	curtis
,	TokenNameCOMMA	
"daedalus"	TokenNameStringLiteral	daedalus
,	TokenNameCOMMA	
"dionysus"	TokenNameStringLiteral	dionysus
,	TokenNameCOMMA	
"dobbs"	TokenNameStringLiteral	dobbs
,	TokenNameCOMMA	
"dolores"	TokenNameStringLiteral	dolores
,	TokenNameCOMMA	
"edmonds"	TokenNameStringLiteral	edmonds
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
static	TokenNamestatic	
class	TokenNameclass	
DictEntry	TokenNameIdentifier	 Dict Entry
{	TokenNameLBRACE	
boolean	TokenNameboolean	
exception	TokenNameIdentifier	 exception
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
root	TokenNameIdentifier	 root
;	TokenNameSEMICOLON	
DictEntry	TokenNameIdentifier	 Dict Entry
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
root	TokenNameIdentifier	 root
,	TokenNameCOMMA	
boolean	TokenNameboolean	
isException	TokenNameIdentifier	 is Exception
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
root	TokenNameIdentifier	 root
=	TokenNameEQUAL	
root	TokenNameIdentifier	 root
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
exception	TokenNameIdentifier	 exception
=	TokenNameEQUAL	
isException	TokenNameIdentifier	 is Exception
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
CharArrayMap	TokenNameIdentifier	 Char Array Map
<	TokenNameLESS	
DictEntry	TokenNameIdentifier	 Dict Entry
>	TokenNameGREATER	
dict_ht	TokenNameIdentifier	 dict ht
=	TokenNameEQUAL	
initializeDictHash	TokenNameIdentifier	 initialize Dict Hash
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/*** * caching off private int maxCacheSize; private CharArrayMap<String> cache = * null; private static final String SAME = "SAME"; // use if stemmed form is * the same ***/	TokenNameCOMMENT_JAVADOC	* caching off private int maxCacheSize; private CharArrayMap<String> cache = null; private static final String SAME = "SAME"; // use if stemmed form is the same **
private	TokenNameprivate	
final	TokenNamefinal	
OpenStringBuilder	TokenNameIdentifier	 Open String Builder
word	TokenNameIdentifier	 word
=	TokenNameEQUAL	
new	TokenNamenew	
OpenStringBuilder	TokenNameIdentifier	 Open String Builder
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
j	TokenNameIdentifier	 j
;	TokenNameSEMICOLON	
/* index of final letter in stem (within word) */	TokenNameCOMMENT_BLOCK	 index of final letter in stem (within word) 
private	TokenNameprivate	
int	TokenNameint	
k	TokenNameIdentifier	 k
;	TokenNameSEMICOLON	
/* * INDEX of final letter in word. You must add 1 to k to get * the current length of word. When you want the length of * word, use the method wordLength, which returns (k+1). */	TokenNameCOMMENT_BLOCK	 INDEX of final letter in word. You must add 1 to k to get the current length of word. When you want the length of word, use the method wordLength, which returns (k+1). 
/*** * private void initializeStemHash() { if (maxCacheSize > 0) cache = new * CharArrayMap<String>(maxCacheSize,false); } ***/	TokenNameCOMMENT_JAVADOC	* private void initializeStemHash() { if (maxCacheSize > 0) cache = new CharArrayMap<String>(maxCacheSize,false); } **
private	TokenNameprivate	
char	TokenNamechar	
finalChar	TokenNameIdentifier	 final Char
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
word	TokenNameIdentifier	 word
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
k	TokenNameIdentifier	 k
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
char	TokenNamechar	
penultChar	TokenNameIdentifier	 penult Char
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
word	TokenNameIdentifier	 word
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
k	TokenNameIdentifier	 k
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
boolean	TokenNameboolean	
isVowel	TokenNameIdentifier	 is Vowel
(	TokenNameLPAREN	
int	TokenNameint	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
!	TokenNameNOT	
isCons	TokenNameIdentifier	 is Cons
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
boolean	TokenNameboolean	
isCons	TokenNameIdentifier	 is Cons
(	TokenNameLPAREN	
int	TokenNameint	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
{	TokenNameLBRACE	
char	TokenNamechar	
ch	TokenNameIdentifier	 ch
;	TokenNameSEMICOLON	
ch	TokenNameIdentifier	 ch
=	TokenNameEQUAL	
word	TokenNameIdentifier	 word
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
==	TokenNameEQUAL_EQUAL	
'a'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
==	TokenNameEQUAL_EQUAL	
'e'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
==	TokenNameEQUAL_EQUAL	
'i'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
==	TokenNameEQUAL_EQUAL	
'o'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
==	TokenNameEQUAL_EQUAL	
'u'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
!=	TokenNameNOT_EQUAL	
'y'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
else	TokenNameelse	
return	TokenNamereturn	
(	TokenNameLPAREN	
!	TokenNameNOT	
isCons	TokenNameIdentifier	 is Cons
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
CharArrayMap	TokenNameIdentifier	 Char Array Map
<	TokenNameLESS	
DictEntry	TokenNameIdentifier	 Dict Entry
>	TokenNameGREATER	
initializeDictHash	TokenNameIdentifier	 initialize Dict Hash
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
DictEntry	TokenNameIdentifier	 Dict Entry
defaultEntry	TokenNameIdentifier	 default Entry
;	TokenNameSEMICOLON	
DictEntry	TokenNameIdentifier	 Dict Entry
entry	TokenNameIdentifier	 entry
;	TokenNameSEMICOLON	
CharArrayMap	TokenNameIdentifier	 Char Array Map
<	TokenNameLESS	
DictEntry	TokenNameIdentifier	 Dict Entry
>	TokenNameGREATER	
d	TokenNameIdentifier	 d
=	TokenNameEQUAL	
new	TokenNamenew	
CharArrayMap	TokenNameIdentifier	 Char Array Map
<	TokenNameLESS	
DictEntry	TokenNameIdentifier	 Dict Entry
>	TokenNameGREATER	
(	TokenNameLPAREN	
Version	TokenNameIdentifier	 Version
.	TokenNameDOT	
LUCENE_31	TokenNameIdentifier	 LUCENE 31
,	TokenNameCOMMA	
1000	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
d	TokenNameIdentifier	 d
=	TokenNameEQUAL	
new	TokenNamenew	
CharArrayMap	TokenNameIdentifier	 Char Array Map
<	TokenNameLESS	
DictEntry	TokenNameIdentifier	 Dict Entry
>	TokenNameGREATER	
(	TokenNameLPAREN	
Version	TokenNameIdentifier	 Version
.	TokenNameDOT	
LUCENE_31	TokenNameIdentifier	 LUCENE 31
,	TokenNameCOMMA	
1000	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
false	TokenNamefalse	
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
exceptionWords	TokenNameIdentifier	 exception Words
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
d	TokenNameIdentifier	 d
.	TokenNameDOT	
containsKey	TokenNameIdentifier	 contains Key
(	TokenNameLPAREN	
exceptionWords	TokenNameIdentifier	 exception Words
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
entry	TokenNameIdentifier	 entry
=	TokenNameEQUAL	
new	TokenNamenew	
DictEntry	TokenNameIdentifier	 Dict Entry
(	TokenNameLPAREN	
exceptionWords	TokenNameIdentifier	 exception Words
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
d	TokenNameIdentifier	 d
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
exceptionWords	TokenNameIdentifier	 exception Words
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
entry	TokenNameIdentifier	 entry
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"Warning: Entry ["	TokenNameStringLiteral	Warning: Entry [
+	TokenNamePLUS	
exceptionWords	TokenNameIdentifier	 exception Words
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
+	TokenNamePLUS	
"] already in dictionary 1"	TokenNameStringLiteral	] already in dictionary 1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
directConflations	TokenNameIdentifier	 direct Conflations
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
d	TokenNameIdentifier	 d
.	TokenNameDOT	
containsKey	TokenNameIdentifier	 contains Key
(	TokenNameLPAREN	
directConflations	TokenNameIdentifier	 direct Conflations
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
entry	TokenNameIdentifier	 entry
=	TokenNameEQUAL	
new	TokenNamenew	
DictEntry	TokenNameIdentifier	 Dict Entry
(	TokenNameLPAREN	
directConflations	TokenNameIdentifier	 direct Conflations
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
d	TokenNameIdentifier	 d
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
directConflations	TokenNameIdentifier	 direct Conflations
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
entry	TokenNameIdentifier	 entry
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"Warning: Entry ["	TokenNameStringLiteral	Warning: Entry [
+	TokenNamePLUS	
directConflations	TokenNameIdentifier	 direct Conflations
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
+	TokenNamePLUS	
"] already in dictionary 2"	TokenNameStringLiteral	] already in dictionary 2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
countryNationality	TokenNameIdentifier	 country Nationality
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
d	TokenNameIdentifier	 d
.	TokenNameDOT	
containsKey	TokenNameIdentifier	 contains Key
(	TokenNameLPAREN	
countryNationality	TokenNameIdentifier	 country Nationality
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
entry	TokenNameIdentifier	 entry
=	TokenNameEQUAL	
new	TokenNamenew	
DictEntry	TokenNameIdentifier	 Dict Entry
(	TokenNameLPAREN	
countryNationality	TokenNameIdentifier	 country Nationality
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
d	TokenNameIdentifier	 d
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
countryNationality	TokenNameIdentifier	 country Nationality
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
entry	TokenNameIdentifier	 entry
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"Warning: Entry ["	TokenNameStringLiteral	Warning: Entry [
+	TokenNamePLUS	
countryNationality	TokenNameIdentifier	 country Nationality
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
+	TokenNamePLUS	
"] already in dictionary 3"	TokenNameStringLiteral	] already in dictionary 3
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
defaultEntry	TokenNameIdentifier	 default Entry
=	TokenNameEQUAL	
new	TokenNamenew	
DictEntry	TokenNameIdentifier	 Dict Entry
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
array	TokenNameIdentifier	 array
;	TokenNameSEMICOLON	
array	TokenNameIdentifier	 array
=	TokenNameEQUAL	
KStemData1	TokenNameIdentifier	 K Stem Data1
.	TokenNameDOT	
data	TokenNameIdentifier	 data
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
array	TokenNameIdentifier	 array
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
d	TokenNameIdentifier	 d
.	TokenNameDOT	
containsKey	TokenNameIdentifier	 contains Key
(	TokenNameLPAREN	
array	TokenNameIdentifier	 array
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
d	TokenNameIdentifier	 d
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
array	TokenNameIdentifier	 array
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
defaultEntry	TokenNameIdentifier	 default Entry
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"Warning: Entry ["	TokenNameStringLiteral	Warning: Entry [
+	TokenNamePLUS	
array	TokenNameIdentifier	 array
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
+	TokenNamePLUS	
"] already in dictionary 4"	TokenNameStringLiteral	] already in dictionary 4
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
array	TokenNameIdentifier	 array
=	TokenNameEQUAL	
KStemData2	TokenNameIdentifier	 K Stem Data2
.	TokenNameDOT	
data	TokenNameIdentifier	 data
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
array	TokenNameIdentifier	 array
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
d	TokenNameIdentifier	 d
.	TokenNameDOT	
containsKey	TokenNameIdentifier	 contains Key
(	TokenNameLPAREN	
array	TokenNameIdentifier	 array
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
d	TokenNameIdentifier	 d
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
array	TokenNameIdentifier	 array
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
defaultEntry	TokenNameIdentifier	 default Entry
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"Warning: Entry ["	TokenNameStringLiteral	Warning: Entry [
+	TokenNamePLUS	
array	TokenNameIdentifier	 array
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
+	TokenNamePLUS	
"] already in dictionary 4"	TokenNameStringLiteral	] already in dictionary 4
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
array	TokenNameIdentifier	 array
=	TokenNameEQUAL	
KStemData3	TokenNameIdentifier	 K Stem Data3
.	TokenNameDOT	
data	TokenNameIdentifier	 data
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
array	TokenNameIdentifier	 array
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
d	TokenNameIdentifier	 d
.	TokenNameDOT	
containsKey	TokenNameIdentifier	 contains Key
(	TokenNameLPAREN	
array	TokenNameIdentifier	 array
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
d	TokenNameIdentifier	 d
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
array	TokenNameIdentifier	 array
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
defaultEntry	TokenNameIdentifier	 default Entry
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"Warning: Entry ["	TokenNameStringLiteral	Warning: Entry [
+	TokenNamePLUS	
array	TokenNameIdentifier	 array
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
+	TokenNamePLUS	
"] already in dictionary 4"	TokenNameStringLiteral	] already in dictionary 4
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
array	TokenNameIdentifier	 array
=	TokenNameEQUAL	
KStemData4	TokenNameIdentifier	 K Stem Data4
.	TokenNameDOT	
data	TokenNameIdentifier	 data
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
array	TokenNameIdentifier	 array
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
d	TokenNameIdentifier	 d
.	TokenNameDOT	
containsKey	TokenNameIdentifier	 contains Key
(	TokenNameLPAREN	
array	TokenNameIdentifier	 array
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
d	TokenNameIdentifier	 d
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
array	TokenNameIdentifier	 array
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
defaultEntry	TokenNameIdentifier	 default Entry
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"Warning: Entry ["	TokenNameStringLiteral	Warning: Entry [
+	TokenNamePLUS	
array	TokenNameIdentifier	 array
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
+	TokenNamePLUS	
"] already in dictionary 4"	TokenNameStringLiteral	] already in dictionary 4
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
array	TokenNameIdentifier	 array
=	TokenNameEQUAL	
KStemData5	TokenNameIdentifier	 K Stem Data5
.	TokenNameDOT	
data	TokenNameIdentifier	 data
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
array	TokenNameIdentifier	 array
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
d	TokenNameIdentifier	 d
.	TokenNameDOT	
containsKey	TokenNameIdentifier	 contains Key
(	TokenNameLPAREN	
array	TokenNameIdentifier	 array
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
d	TokenNameIdentifier	 d
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
array	TokenNameIdentifier	 array
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
defaultEntry	TokenNameIdentifier	 default Entry
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"Warning: Entry ["	TokenNameStringLiteral	Warning: Entry [
+	TokenNamePLUS	
array	TokenNameIdentifier	 array
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
+	TokenNamePLUS	
"] already in dictionary 4"	TokenNameStringLiteral	] already in dictionary 4
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
array	TokenNameIdentifier	 array
=	TokenNameEQUAL	
KStemData6	TokenNameIdentifier	 K Stem Data6
.	TokenNameDOT	
data	TokenNameIdentifier	 data
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
array	TokenNameIdentifier	 array
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
d	TokenNameIdentifier	 d
.	TokenNameDOT	
containsKey	TokenNameIdentifier	 contains Key
(	TokenNameLPAREN	
array	TokenNameIdentifier	 array
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
d	TokenNameIdentifier	 d
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
array	TokenNameIdentifier	 array
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
defaultEntry	TokenNameIdentifier	 default Entry
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"Warning: Entry ["	TokenNameStringLiteral	Warning: Entry [
+	TokenNamePLUS	
array	TokenNameIdentifier	 array
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
+	TokenNamePLUS	
"] already in dictionary 4"	TokenNameStringLiteral	] already in dictionary 4
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
array	TokenNameIdentifier	 array
=	TokenNameEQUAL	
KStemData7	TokenNameIdentifier	 K Stem Data7
.	TokenNameDOT	
data	TokenNameIdentifier	 data
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
array	TokenNameIdentifier	 array
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
d	TokenNameIdentifier	 d
.	TokenNameDOT	
containsKey	TokenNameIdentifier	 contains Key
(	TokenNameLPAREN	
array	TokenNameIdentifier	 array
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
d	TokenNameIdentifier	 d
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
array	TokenNameIdentifier	 array
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
defaultEntry	TokenNameIdentifier	 default Entry
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"Warning: Entry ["	TokenNameStringLiteral	Warning: Entry [
+	TokenNamePLUS	
array	TokenNameIdentifier	 array
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
+	TokenNamePLUS	
"] already in dictionary 4"	TokenNameStringLiteral	] already in dictionary 4
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
KStemData8	TokenNameIdentifier	 K Stem Data8
.	TokenNameDOT	
data	TokenNameIdentifier	 data
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
d	TokenNameIdentifier	 d
.	TokenNameDOT	
containsKey	TokenNameIdentifier	 contains Key
(	TokenNameLPAREN	
KStemData8	TokenNameIdentifier	 K Stem Data8
.	TokenNameDOT	
data	TokenNameIdentifier	 data
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
d	TokenNameIdentifier	 d
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
KStemData8	TokenNameIdentifier	 K Stem Data8
.	TokenNameDOT	
data	TokenNameIdentifier	 data
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
defaultEntry	TokenNameIdentifier	 default Entry
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"Warning: Entry ["	TokenNameStringLiteral	Warning: Entry [
+	TokenNamePLUS	
KStemData8	TokenNameIdentifier	 K Stem Data8
.	TokenNameDOT	
data	TokenNameIdentifier	 data
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
+	TokenNamePLUS	
"] already in dictionary 4"	TokenNameStringLiteral	] already in dictionary 4
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
supplementDict	TokenNameIdentifier	 supplement Dict
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
d	TokenNameIdentifier	 d
.	TokenNameDOT	
containsKey	TokenNameIdentifier	 contains Key
(	TokenNameLPAREN	
supplementDict	TokenNameIdentifier	 supplement Dict
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
d	TokenNameIdentifier	 d
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
supplementDict	TokenNameIdentifier	 supplement Dict
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
defaultEntry	TokenNameIdentifier	 default Entry
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"Warning: Entry ["	TokenNameStringLiteral	Warning: Entry [
+	TokenNamePLUS	
supplementDict	TokenNameIdentifier	 supplement Dict
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
+	TokenNamePLUS	
"] already in dictionary 5"	TokenNameStringLiteral	] already in dictionary 5
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
properNouns	TokenNameIdentifier	 proper Nouns
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
d	TokenNameIdentifier	 d
.	TokenNameDOT	
containsKey	TokenNameIdentifier	 contains Key
(	TokenNameLPAREN	
properNouns	TokenNameIdentifier	 proper Nouns
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
d	TokenNameIdentifier	 d
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
properNouns	TokenNameIdentifier	 proper Nouns
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
defaultEntry	TokenNameIdentifier	 default Entry
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"Warning: Entry ["	TokenNameStringLiteral	Warning: Entry [
+	TokenNamePLUS	
properNouns	TokenNameIdentifier	 proper Nouns
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
+	TokenNamePLUS	
"] already in dictionary 6"	TokenNameStringLiteral	] already in dictionary 6
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
d	TokenNameIdentifier	 d
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
boolean	TokenNameboolean	
isAlpha	TokenNameIdentifier	 is Alpha
(	TokenNameLPAREN	
char	TokenNamechar	
ch	TokenNameIdentifier	 ch
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
ch	TokenNameIdentifier	 ch
>=	TokenNameGREATER_EQUAL	
'a'	TokenNameCharacterLiteral	
&&	TokenNameAND_AND	
ch	TokenNameIdentifier	 ch
<=	TokenNameLESS_EQUAL	
'z'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
// terms must be lowercased already 	TokenNameCOMMENT_LINE	terms must be lowercased already 
}	TokenNameRBRACE	
/* length of stem within word */	TokenNameCOMMENT_BLOCK	 length of stem within word 
private	TokenNameprivate	
int	TokenNameint	
stemLength	TokenNameIdentifier	 stem Length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
j	TokenNameIdentifier	 j
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
boolean	TokenNameboolean	
endsIn	TokenNameIdentifier	 ends In
(	TokenNameLPAREN	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
length	TokenNameIdentifier	 length
>	TokenNameGREATER	
k	TokenNameIdentifier	 k
)	TokenNameRPAREN	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
int	TokenNameint	
r	TokenNameIdentifier	 r
=	TokenNameEQUAL	
word	TokenNameIdentifier	 word
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
/* length of word before this suffix */	TokenNameCOMMENT_BLOCK	 length of word before this suffix 
j	TokenNameIdentifier	 j
=	TokenNameEQUAL	
k	TokenNameIdentifier	 k
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
r1	TokenNameIdentifier	 r1
=	TokenNameEQUAL	
r	TokenNameIdentifier	 r
,	TokenNameCOMMA	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
,	TokenNameCOMMA	
r1	TokenNameIdentifier	 r1
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
!=	TokenNameNOT_EQUAL	
word	TokenNameIdentifier	 word
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
r1	TokenNameIdentifier	 r1
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
j	TokenNameIdentifier	 j
=	TokenNameEQUAL	
r	TokenNameIdentifier	 r
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/* index of the character BEFORE the posfix */	TokenNameCOMMENT_BLOCK	 index of the character BEFORE the posfix 
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
boolean	TokenNameboolean	
endsIn	TokenNameIdentifier	 ends In
(	TokenNameLPAREN	
char	TokenNamechar	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
char	TokenNamechar	
b	TokenNameIdentifier	 b
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
2	TokenNameIntegerLiteral	
>	TokenNameGREATER	
k	TokenNameIdentifier	 k
)	TokenNameRPAREN	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
// check left to right since the endings have often already matched 	TokenNameCOMMENT_LINE	check left to right since the endings have often already matched 
if	TokenNameif	
(	TokenNameLPAREN	
word	TokenNameIdentifier	 word
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
k	TokenNameIdentifier	 k
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
a	TokenNameIdentifier	 a
&&	TokenNameAND_AND	
word	TokenNameIdentifier	 word
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
k	TokenNameIdentifier	 k
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
b	TokenNameIdentifier	 b
)	TokenNameRPAREN	
{	TokenNameLBRACE	
j	TokenNameIdentifier	 j
=	TokenNameEQUAL	
k	TokenNameIdentifier	 k
-	TokenNameMINUS	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
boolean	TokenNameboolean	
endsIn	TokenNameIdentifier	 ends In
(	TokenNameLPAREN	
char	TokenNamechar	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
char	TokenNamechar	
b	TokenNameIdentifier	 b
,	TokenNameCOMMA	
char	TokenNamechar	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
3	TokenNameIntegerLiteral	
>	TokenNameGREATER	
k	TokenNameIdentifier	 k
)	TokenNameRPAREN	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
word	TokenNameIdentifier	 word
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
k	TokenNameIdentifier	 k
-	TokenNameMINUS	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
a	TokenNameIdentifier	 a
&&	TokenNameAND_AND	
word	TokenNameIdentifier	 word
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
k	TokenNameIdentifier	 k
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
b	TokenNameIdentifier	 b
&&	TokenNameAND_AND	
word	TokenNameIdentifier	 word
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
k	TokenNameIdentifier	 k
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
{	TokenNameLBRACE	
j	TokenNameIdentifier	 j
=	TokenNameEQUAL	
k	TokenNameIdentifier	 k
-	TokenNameMINUS	
3	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
boolean	TokenNameboolean	
endsIn	TokenNameIdentifier	 ends In
(	TokenNameLPAREN	
char	TokenNamechar	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
char	TokenNamechar	
b	TokenNameIdentifier	 b
,	TokenNameCOMMA	
char	TokenNamechar	
c	TokenNameIdentifier	 c
,	TokenNameCOMMA	
char	TokenNamechar	
d	TokenNameIdentifier	 d
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
4	TokenNameIntegerLiteral	
>	TokenNameGREATER	
k	TokenNameIdentifier	 k
)	TokenNameRPAREN	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
word	TokenNameIdentifier	 word
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
k	TokenNameIdentifier	 k
-	TokenNameMINUS	
3	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
a	TokenNameIdentifier	 a
&&	TokenNameAND_AND	
word	TokenNameIdentifier	 word
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
k	TokenNameIdentifier	 k
-	TokenNameMINUS	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
b	TokenNameIdentifier	 b
&&	TokenNameAND_AND	
word	TokenNameIdentifier	 word
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
k	TokenNameIdentifier	 k
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
c	TokenNameIdentifier	 c
&&	TokenNameAND_AND	
word	TokenNameIdentifier	 word
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
k	TokenNameIdentifier	 k
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
d	TokenNameIdentifier	 d
)	TokenNameRPAREN	
{	TokenNameLBRACE	
j	TokenNameIdentifier	 j
=	TokenNameEQUAL	
k	TokenNameIdentifier	 k
-	TokenNameMINUS	
4	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
DictEntry	TokenNameIdentifier	 Dict Entry
wordInDict	TokenNameIdentifier	 word In Dict
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
/*** * if (matchedEntry != null) { if (dict_ht.get(word.getArray(), 0, * word.size()) != matchedEntry) { * System.out.println("Uh oh... cached entry doesn't match"); } return * matchedEntry; } ***/	TokenNameCOMMENT_JAVADOC	* if (matchedEntry != null) { if (dict_ht.get(word.getArray(), 0, word.size()) != matchedEntry) { System.out.println("Uh oh... cached entry doesn't match"); } return matchedEntry; } **
if	TokenNameif	
(	TokenNameLPAREN	
matchedEntry	TokenNameIdentifier	 matched Entry
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
return	TokenNamereturn	
matchedEntry	TokenNameIdentifier	 matched Entry
;	TokenNameSEMICOLON	
DictEntry	TokenNameIdentifier	 Dict Entry
e	TokenNameIdentifier	 e
=	TokenNameEQUAL	
dict_ht	TokenNameIdentifier	 dict ht
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
word	TokenNameIdentifier	 word
.	TokenNameDOT	
getArray	TokenNameIdentifier	 get Array
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
word	TokenNameIdentifier	 word
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
!	TokenNameNOT	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
exception	TokenNameIdentifier	 exception
)	TokenNameRPAREN	
{	TokenNameLBRACE	
matchedEntry	TokenNameIdentifier	 matched Entry
=	TokenNameEQUAL	
e	TokenNameIdentifier	 e
;	TokenNameSEMICOLON	
// only cache if it's not an exception. 	TokenNameCOMMENT_LINE	only cache if it's not an exception. 
}	TokenNameRBRACE	
// lookups.add(word.toString()); 	TokenNameCOMMENT_LINE	lookups.add(word.toString()); 
return	TokenNamereturn	
e	TokenNameIdentifier	 e
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/* Convert plurals to singular form, and '-ies' to 'y' */	TokenNameCOMMENT_BLOCK	 Convert plurals to singular form, and '-ies' to 'y' 
private	TokenNameprivate	
void	TokenNamevoid	
plural	TokenNameIdentifier	 plural
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
word	TokenNameIdentifier	 word
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
k	TokenNameIdentifier	 k
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
's'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
endsIn	TokenNameIdentifier	 ends In
(	TokenNameLPAREN	
'i'	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
'e'	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
's'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
word	TokenNameIdentifier	 word
.	TokenNameDOT	
setLength	TokenNameIdentifier	 set Length
(	TokenNameLPAREN	
j	TokenNameIdentifier	 j
+	TokenNamePLUS	
3	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
k	TokenNameIdentifier	 k
--	TokenNameMINUS_MINUS	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
lookup	TokenNameIdentifier	 lookup
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
/* ensure calories -> calorie */	TokenNameCOMMENT_BLOCK	 ensure calories -> calorie 
return	TokenNamereturn	
;	TokenNameSEMICOLON	
k	TokenNameIdentifier	 k
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
word	TokenNameIdentifier	 word
.	TokenNameDOT	
unsafeWrite	TokenNameIdentifier	 unsafe Write
(	TokenNameLPAREN	
's'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
setSuffix	TokenNameIdentifier	 set Suffix
(	TokenNameLPAREN	
"y"	TokenNameStringLiteral	y
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
lookup	TokenNameIdentifier	 lookup
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
endsIn	TokenNameIdentifier	 ends In
(	TokenNameLPAREN	
'e'	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
's'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
/* try just removing the "s" */	TokenNameCOMMENT_BLOCK	 try just removing the "s" 
word	TokenNameIdentifier	 word
.	TokenNameDOT	
setLength	TokenNameIdentifier	 set Length
(	TokenNameLPAREN	
j	TokenNameIdentifier	 j
+	TokenNamePLUS	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
k	TokenNameIdentifier	 k
--	TokenNameMINUS_MINUS	
;	TokenNameSEMICOLON	
/* * note: don't check for exceptions here. So, `aides' -> `aide', but * `aided' -> `aid'. The exception for double s is used to prevent * crosses -> crosse. This is actually correct if crosses is a plural * noun (a type of racket used in lacrosse), but the verb is much more * common */	TokenNameCOMMENT_BLOCK	 note: don't check for exceptions here. So, `aides' -> `aide', but `aided' -> `aid'. The exception for double s is used to prevent crosses -> crosse. This is actually correct if crosses is a plural noun (a type of racket used in lacrosse), but the verb is much more common 
/**** * YCS: this was the one place where lookup was not followed by return. * So restructure it. if ((j>0)&&(lookup(word.toString())) && * !((word.charAt(j) == 's') && (word.charAt(j-1) == 's'))) return; *****/	TokenNameCOMMENT_JAVADOC	** YCS: this was the one place where lookup was not followed by return. So restructure it. if ((j>0)&&(lookup(word.toString())) && !((word.charAt(j) == 's') && (word.charAt(j-1) == 's'))) return; ****
boolean	TokenNameboolean	
tryE	TokenNameIdentifier	 try E
=	TokenNameEQUAL	
j	TokenNameIdentifier	 j
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
!	TokenNameNOT	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
word	TokenNameIdentifier	 word
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
j	TokenNameIdentifier	 j
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
's'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
word	TokenNameIdentifier	 word
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
j	TokenNameIdentifier	 j
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
's'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
tryE	TokenNameIdentifier	 try E
&&	TokenNameAND_AND	
lookup	TokenNameIdentifier	 lookup
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
/* try removing the "es" */	TokenNameCOMMENT_BLOCK	 try removing the "es" 
word	TokenNameIdentifier	 word
.	TokenNameDOT	
setLength	TokenNameIdentifier	 set Length
(	TokenNameLPAREN	
j	TokenNameIdentifier	 j
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
k	TokenNameIdentifier	 k
--	TokenNameMINUS_MINUS	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
lookup	TokenNameIdentifier	 lookup
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
/* the default is to retain the "e" */	TokenNameCOMMENT_BLOCK	 the default is to retain the "e" 
word	TokenNameIdentifier	 word
.	TokenNameDOT	
unsafeWrite	TokenNameIdentifier	 unsafe Write
(	TokenNameLPAREN	
'e'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
k	TokenNameIdentifier	 k
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
tryE	TokenNameIdentifier	 try E
)	TokenNameRPAREN	
lookup	TokenNameIdentifier	 lookup
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// if we didn't try the "e" ending before 	TokenNameCOMMENT_LINE	if we didn't try the "e" ending before 
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
word	TokenNameIdentifier	 word
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>	TokenNameGREATER	
3	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
penultChar	TokenNameIdentifier	 penult Char
(	TokenNameLPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
's'	TokenNameCharacterLiteral	
&&	TokenNameAND_AND	
!	TokenNameNOT	
endsIn	TokenNameIdentifier	 ends In
(	TokenNameLPAREN	
'o'	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
'u'	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
's'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
/* unless the word ends in "ous" or a double "s", remove the final "s" */	TokenNameCOMMENT_BLOCK	 unless the word ends in "ous" or a double "s", remove the final "s" 
word	TokenNameIdentifier	 word
.	TokenNameDOT	
setLength	TokenNameIdentifier	 set Length
(	TokenNameLPAREN	
k	TokenNameIdentifier	 k
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
k	TokenNameIdentifier	 k
--	TokenNameMINUS_MINUS	
;	TokenNameSEMICOLON	
lookup	TokenNameIdentifier	 lookup
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
private	TokenNameprivate	
void	TokenNamevoid	
setSuffix	TokenNameIdentifier	 set Suffix
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
{	TokenNameLBRACE	
setSuff	TokenNameIdentifier	 set Suff
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
,	TokenNameCOMMA	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/* replace old suffix with s */	TokenNameCOMMENT_BLOCK	 replace old suffix with s 
private	TokenNameprivate	
void	TokenNamevoid	
setSuff	TokenNameIdentifier	 set Suff
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
s	TokenNameIdentifier	 s
,	TokenNameCOMMA	
int	TokenNameint	
len	TokenNameIdentifier	 len
)	TokenNameRPAREN	
{	TokenNameLBRACE	
word	TokenNameIdentifier	 word
.	TokenNameDOT	
setLength	TokenNameIdentifier	 set Length
(	TokenNameLPAREN	
j	TokenNameIdentifier	 j
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
l	TokenNameIdentifier	 l
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
l	TokenNameIdentifier	 l
<	TokenNameLESS	
len	TokenNameIdentifier	 len
;	TokenNameSEMICOLON	
l	TokenNameIdentifier	 l
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
word	TokenNameIdentifier	 word
.	TokenNameDOT	
unsafeWrite	TokenNameIdentifier	 unsafe Write
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
l	TokenNameIdentifier	 l
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
k	TokenNameIdentifier	 k
=	TokenNameEQUAL	
j	TokenNameIdentifier	 j
+	TokenNamePLUS	
len	TokenNameIdentifier	 len
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/* Returns true if the word is found in the dictionary */	TokenNameCOMMENT_BLOCK	 Returns true if the word is found in the dictionary 
// almost all uses of lookup() return immediately and are 	TokenNameCOMMENT_LINE	almost all uses of lookup() return immediately and are 
// followed by another lookup in the dict. Store the match 	TokenNameCOMMENT_LINE	followed by another lookup in the dict. Store the match 
// to avoid this double lookup. 	TokenNameCOMMENT_LINE	to avoid this double lookup. 
DictEntry	TokenNameIdentifier	 Dict Entry
matchedEntry	TokenNameIdentifier	 matched Entry
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
boolean	TokenNameboolean	
lookup	TokenNameIdentifier	 lookup
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
/****** * debugging code String thisLookup = word.toString(); boolean added = * lookups.add(thisLookup); if (!added) { * System.out.println("######extra lookup:" + thisLookup); // occaasional * extra lookups aren't necessarily errors... could happen by diff * manipulations // throw new RuntimeException("######extra lookup:" + * thisLookup); } else { // System.out.println("new lookup:" + thisLookup); * } ******/	TokenNameCOMMENT_JAVADOC	**** debugging code String thisLookup = word.toString(); boolean added = lookups.add(thisLookup); if (!added) { System.out.println("######extra lookup:" + thisLookup); // occaasional extra lookups aren't necessarily errors... could happen by diff manipulations // throw new RuntimeException("######extra lookup:" + thisLookup); } else { // System.out.println("new lookup:" + thisLookup); } *****
matchedEntry	TokenNameIdentifier	 matched Entry
=	TokenNameEQUAL	
dict_ht	TokenNameIdentifier	 dict ht
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
word	TokenNameIdentifier	 word
.	TokenNameDOT	
getArray	TokenNameIdentifier	 get Array
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
word	TokenNameIdentifier	 word
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
matchedEntry	TokenNameIdentifier	 matched Entry
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Set<String> lookups = new HashSet<String>(); 	TokenNameCOMMENT_LINE	Set<String> lookups = new HashSet<String>(); 
/* convert past tense (-ed) to present, and `-ied' to `y' */	TokenNameCOMMENT_BLOCK	 convert past tense (-ed) to present, and `-ied' to `y' 
private	TokenNameprivate	
void	TokenNamevoid	
pastTense	TokenNameIdentifier	 past Tense
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
/* * Handle words less than 5 letters with a direct mapping This prevents * (fled -> fl). */	TokenNameCOMMENT_BLOCK	 Handle words less than 5 letters with a direct mapping This prevents (fled -> fl). 
if	TokenNameif	
(	TokenNameLPAREN	
word	TokenNameIdentifier	 word
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
<=	TokenNameLESS_EQUAL	
4	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
endsIn	TokenNameIdentifier	 ends In
(	TokenNameLPAREN	
'i'	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
'e'	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
'd'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
word	TokenNameIdentifier	 word
.	TokenNameDOT	
setLength	TokenNameIdentifier	 set Length
(	TokenNameLPAREN	
j	TokenNameIdentifier	 j
+	TokenNamePLUS	
3	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
k	TokenNameIdentifier	 k
--	TokenNameMINUS_MINUS	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
lookup	TokenNameIdentifier	 lookup
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
/* we almost always want to convert -ied to -y, but */	TokenNameCOMMENT_BLOCK	 we almost always want to convert -ied to -y, but 
return	TokenNamereturn	
;	TokenNameSEMICOLON	
/* this isn't true for short words (died->die) */	TokenNameCOMMENT_BLOCK	 this isn't true for short words (died->die) 
k	TokenNameIdentifier	 k
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
/* I don't know any long words that this applies to, */	TokenNameCOMMENT_BLOCK	 I don't know any long words that this applies to, 
word	TokenNameIdentifier	 word
.	TokenNameDOT	
unsafeWrite	TokenNameIdentifier	 unsafe Write
(	TokenNameLPAREN	
'd'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/* but just in case... */	TokenNameCOMMENT_BLOCK	 but just in case... 
setSuffix	TokenNameIdentifier	 set Suffix
(	TokenNameLPAREN	
"y"	TokenNameStringLiteral	y
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
lookup	TokenNameIdentifier	 lookup
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/* the vowelInStem() is necessary so we don't stem acronyms */	TokenNameCOMMENT_BLOCK	 the vowelInStem() is necessary so we don't stem acronyms 
if	TokenNameif	
(	TokenNameLPAREN	
endsIn	TokenNameIdentifier	 ends In
(	TokenNameLPAREN	
'e'	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
'd'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
vowelInStem	TokenNameIdentifier	 vowel In Stem
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
/* see if the root ends in `e' */	TokenNameCOMMENT_BLOCK	 see if the root ends in `e' 
word	TokenNameIdentifier	 word
.	TokenNameDOT	
setLength	TokenNameIdentifier	 set Length
(	TokenNameLPAREN	
j	TokenNameIdentifier	 j
+	TokenNamePLUS	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
k	TokenNameIdentifier	 k
=	TokenNameEQUAL	
j	TokenNameIdentifier	 j
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
DictEntry	TokenNameIdentifier	 Dict Entry
entry	TokenNameIdentifier	 entry
=	TokenNameEQUAL	
wordInDict	TokenNameIdentifier	 word In Dict
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
entry	TokenNameIdentifier	 entry
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
entry	TokenNameIdentifier	 entry
.	TokenNameDOT	
exception	TokenNameIdentifier	 exception
)	TokenNameRPAREN	
/* * if it's in the dictionary and * not an exception */	TokenNameCOMMENT_BLOCK	 if it's in the dictionary and not an exception 
return	TokenNamereturn	
;	TokenNameSEMICOLON	
/* try removing the "ed" */	TokenNameCOMMENT_BLOCK	 try removing the "ed" 
word	TokenNameIdentifier	 word
.	TokenNameDOT	
setLength	TokenNameIdentifier	 set Length
(	TokenNameLPAREN	
j	TokenNameIdentifier	 j
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
k	TokenNameIdentifier	 k
=	TokenNameEQUAL	
j	TokenNameIdentifier	 j
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
lookup	TokenNameIdentifier	 lookup
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
/* * try removing a doubled consonant. if the root isn't found in the * dictionary, the default is to leave it doubled. This will correctly * capture `backfilled' -> `backfill' instead of `backfill' -> * `backfille', and seems correct most of the time */	TokenNameCOMMENT_BLOCK	 try removing a doubled consonant. if the root isn't found in the dictionary, the default is to leave it doubled. This will correctly capture `backfilled' -> `backfill' instead of `backfill' -> `backfille', and seems correct most of the time 
if	TokenNameif	
(	TokenNameLPAREN	
doubleC	TokenNameIdentifier	 double C
(	TokenNameLPAREN	
k	TokenNameIdentifier	 k
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
word	TokenNameIdentifier	 word
.	TokenNameDOT	
setLength	TokenNameIdentifier	 set Length
(	TokenNameLPAREN	
k	TokenNameIdentifier	 k
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
k	TokenNameIdentifier	 k
--	TokenNameMINUS_MINUS	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
lookup	TokenNameIdentifier	 lookup
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
word	TokenNameIdentifier	 word
.	TokenNameDOT	
unsafeWrite	TokenNameIdentifier	 unsafe Write
(	TokenNameLPAREN	
word	TokenNameIdentifier	 word
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
k	TokenNameIdentifier	 k
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
k	TokenNameIdentifier	 k
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
lookup	TokenNameIdentifier	 lookup
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/* if we have a `un-' prefix, then leave the word alone */	TokenNameCOMMENT_BLOCK	 if we have a `un-' prefix, then leave the word alone 
/* (this will sometimes screw up with `under-', but we */	TokenNameCOMMENT_BLOCK	 (this will sometimes screw up with `under-', but we 
/* will take care of that later) */	TokenNameCOMMENT_BLOCK	 will take care of that later) 
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
word	TokenNameIdentifier	 word
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
'u'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
word	TokenNameIdentifier	 word
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
'n'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
word	TokenNameIdentifier	 word
.	TokenNameDOT	
unsafeWrite	TokenNameIdentifier	 unsafe Write
(	TokenNameLPAREN	
'e'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
word	TokenNameIdentifier	 word
.	TokenNameDOT	
unsafeWrite	TokenNameIdentifier	 unsafe Write
(	TokenNameLPAREN	
'd'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
k	TokenNameIdentifier	 k
=	TokenNameEQUAL	
k	TokenNameIdentifier	 k
+	TokenNamePLUS	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// nolookup() 	TokenNameCOMMENT_LINE	nolookup() 
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/* * it wasn't found by just removing the `d' or the `ed', so prefer to end * with an `e' (e.g., `microcoded' -> `microcode'). */	TokenNameCOMMENT_BLOCK	 it wasn't found by just removing the `d' or the `ed', so prefer to end with an `e' (e.g., `microcoded' -> `microcode'). 
word	TokenNameIdentifier	 word
.	TokenNameDOT	
setLength	TokenNameIdentifier	 set Length
(	TokenNameLPAREN	
j	TokenNameIdentifier	 j
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
word	TokenNameIdentifier	 word
.	TokenNameDOT	
unsafeWrite	TokenNameIdentifier	 unsafe Write
(	TokenNameLPAREN	
'e'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
k	TokenNameIdentifier	 k
=	TokenNameEQUAL	
j	TokenNameIdentifier	 j
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// nolookup() - we already tried the "e" ending 	TokenNameCOMMENT_LINE	nolookup() - we already tried the "e" ending 
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/* return TRUE if word ends with a double consonant */	TokenNameCOMMENT_BLOCK	 return TRUE if word ends with a double consonant 
private	TokenNameprivate	
boolean	TokenNameboolean	
doubleC	TokenNameIdentifier	 double C
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
word	TokenNameIdentifier	 word
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
word	TokenNameIdentifier	 word
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
(	TokenNameLPAREN	
isCons	TokenNameIdentifier	 is Cons
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
boolean	TokenNameboolean	
vowelInStem	TokenNameIdentifier	 vowel In Stem
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
stemLength	TokenNameIdentifier	 stem Length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
isVowel	TokenNameIdentifier	 is Vowel
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/* handle `-ing' endings */	TokenNameCOMMENT_BLOCK	 handle `-ing' endings 
private	TokenNameprivate	
void	TokenNamevoid	
aspect	TokenNameIdentifier	 aspect
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
/* * handle short words (aging -> age) via a direct mapping. This prevents * (thing -> the) in the version of this routine that ignores inflectional * variants that are mentioned in the dictionary (when the root is also * present) */	TokenNameCOMMENT_BLOCK	 handle short words (aging -> age) via a direct mapping. This prevents (thing -> the) in the version of this routine that ignores inflectional variants that are mentioned in the dictionary (when the root is also present) 
if	TokenNameif	
(	TokenNameLPAREN	
word	TokenNameIdentifier	 word
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
<=	TokenNameLESS_EQUAL	
5	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
/* the vowelinstem() is necessary so we don't stem acronyms */	TokenNameCOMMENT_BLOCK	 the vowelinstem() is necessary so we don't stem acronyms 
if	TokenNameif	
(	TokenNameLPAREN	
endsIn	TokenNameIdentifier	 ends In
(	TokenNameLPAREN	
'i'	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
'n'	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
'g'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
vowelInStem	TokenNameIdentifier	 vowel In Stem
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
/* try adding an `e' to the stem and check against the dictionary */	TokenNameCOMMENT_BLOCK	 try adding an `e' to the stem and check against the dictionary 
word	TokenNameIdentifier	 word
.	TokenNameDOT	
setCharAt	TokenNameIdentifier	 set Char At
(	TokenNameLPAREN	
j	TokenNameIdentifier	 j
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
'e'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
word	TokenNameIdentifier	 word
.	TokenNameDOT	
setLength	TokenNameIdentifier	 set Length
(	TokenNameLPAREN	
j	TokenNameIdentifier	 j
+	TokenNamePLUS	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
k	TokenNameIdentifier	 k
=	TokenNameEQUAL	
j	TokenNameIdentifier	 j
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
DictEntry	TokenNameIdentifier	 Dict Entry
entry	TokenNameIdentifier	 entry
=	TokenNameEQUAL	
wordInDict	TokenNameIdentifier	 word In Dict
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
entry	TokenNameIdentifier	 entry
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
entry	TokenNameIdentifier	 entry
.	TokenNameDOT	
exception	TokenNameIdentifier	 exception
)	TokenNameRPAREN	
/* if it's in the dictionary and not an exception */	TokenNameCOMMENT_BLOCK	 if it's in the dictionary and not an exception 
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/* adding on the `e' didn't work, so remove it */	TokenNameCOMMENT_BLOCK	 adding on the `e' didn't work, so remove it 
word	TokenNameIdentifier	 word
.	TokenNameDOT	
setLength	TokenNameIdentifier	 set Length
(	TokenNameLPAREN	
k	TokenNameIdentifier	 k
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
k	TokenNameIdentifier	 k
--	TokenNameMINUS_MINUS	
;	TokenNameSEMICOLON	
/* note that `ing' has also been removed */	TokenNameCOMMENT_BLOCK	 note that `ing' has also been removed 
if	TokenNameif	
(	TokenNameLPAREN	
lookup	TokenNameIdentifier	 lookup
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
/* if I can remove a doubled consonant and get a word, then do so */	TokenNameCOMMENT_BLOCK	 if I can remove a doubled consonant and get a word, then do so 
if	TokenNameif	
(	TokenNameLPAREN	
doubleC	TokenNameIdentifier	 double C
(	TokenNameLPAREN	
k	TokenNameIdentifier	 k
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
k	TokenNameIdentifier	 k
--	TokenNameMINUS_MINUS	
;	TokenNameSEMICOLON	
word	TokenNameIdentifier	 word
.	TokenNameDOT	
setLength	TokenNameIdentifier	 set Length
(	TokenNameLPAREN	
k	TokenNameIdentifier	 k
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
lookup	TokenNameIdentifier	 lookup
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
word	TokenNameIdentifier	 word
.	TokenNameDOT	
unsafeWrite	TokenNameIdentifier	 unsafe Write
(	TokenNameLPAREN	
word	TokenNameIdentifier	 word
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
k	TokenNameIdentifier	 k
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/* restore the doubled consonant */	TokenNameCOMMENT_BLOCK	 restore the doubled consonant 
/* the default is to leave the consonant doubled */	TokenNameCOMMENT_BLOCK	 the default is to leave the consonant doubled 
/* (e.g.,`fingerspelling' -> `fingerspell'). Unfortunately */	TokenNameCOMMENT_BLOCK	 (e.g.,`fingerspelling' -> `fingerspell'). Unfortunately 
/* `bookselling' -> `booksell' and `mislabelling' -> `mislabell'). */	TokenNameCOMMENT_BLOCK	 `bookselling' -> `booksell' and `mislabelling' -> `mislabell'). 
/* Without making the algorithm significantly more complicated, this */	TokenNameCOMMENT_BLOCK	 Without making the algorithm significantly more complicated, this 
/* is the best I can do */	TokenNameCOMMENT_BLOCK	 is the best I can do 
k	TokenNameIdentifier	 k
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
lookup	TokenNameIdentifier	 lookup
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/* * the word wasn't in the dictionary after removing the stem, and then * checking with and without a final `e'. The default is to add an `e' * unless the word ends in two consonants, so `microcoding' -> * `microcode'. The two consonants restriction wouldn't normally be * necessary, but is needed because we don't try to deal with prefixes and * compounds, and most of the time it is correct (e.g., footstamping -> * footstamp, not footstampe; however, decoupled -> decoupl). We can * prevent almost all of the incorrect stems if we try to do some prefix * analysis first */	TokenNameCOMMENT_BLOCK	 the word wasn't in the dictionary after removing the stem, and then checking with and without a final `e'. The default is to add an `e' unless the word ends in two consonants, so `microcoding' -> `microcode'. The two consonants restriction wouldn't normally be necessary, but is needed because we don't try to deal with prefixes and compounds, and most of the time it is correct (e.g., footstamping -> footstamp, not footstampe; however, decoupled -> decoupl). We can prevent almost all of the incorrect stems if we try to do some prefix analysis first 
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
j	TokenNameIdentifier	 j
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
isCons	TokenNameIdentifier	 is Cons
(	TokenNameLPAREN	
j	TokenNameIdentifier	 j
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
isCons	TokenNameIdentifier	 is Cons
(	TokenNameLPAREN	
j	TokenNameIdentifier	 j
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
k	TokenNameIdentifier	 k
=	TokenNameEQUAL	
j	TokenNameIdentifier	 j
;	TokenNameSEMICOLON	
word	TokenNameIdentifier	 word
.	TokenNameDOT	
setLength	TokenNameIdentifier	 set Length
(	TokenNameLPAREN	
k	TokenNameIdentifier	 k
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// nolookup() because we already did according to the comment 	TokenNameCOMMENT_LINE	nolookup() because we already did according to the comment 
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
word	TokenNameIdentifier	 word
.	TokenNameDOT	
setLength	TokenNameIdentifier	 set Length
(	TokenNameLPAREN	
j	TokenNameIdentifier	 j
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
word	TokenNameIdentifier	 word
.	TokenNameDOT	
unsafeWrite	TokenNameIdentifier	 unsafe Write
(	TokenNameLPAREN	
'e'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
k	TokenNameIdentifier	 k
=	TokenNameEQUAL	
j	TokenNameIdentifier	 j
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// nolookup(); we already tried an 'e' ending 	TokenNameCOMMENT_LINE	nolookup(); we already tried an 'e' ending 
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/* * this routine deals with -ity endings. It accepts -ability, -ibility, and * -ality, even without checking the dictionary because they are so * productive. The first two are mapped to -ble, and the -ity is remove for * the latter */	TokenNameCOMMENT_BLOCK	 this routine deals with -ity endings. It accepts -ability, -ibility, and -ality, even without checking the dictionary because they are so productive. The first two are mapped to -ble, and the -ity is remove for the latter 
private	TokenNameprivate	
void	TokenNamevoid	
ityEndings	TokenNameIdentifier	 ity Endings
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
old_k	TokenNameIdentifier	 old k
=	TokenNameEQUAL	
k	TokenNameIdentifier	 k
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
endsIn	TokenNameIdentifier	 ends In
(	TokenNameLPAREN	
'i'	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
't'	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
'y'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
word	TokenNameIdentifier	 word
.	TokenNameDOT	
setLength	TokenNameIdentifier	 set Length
(	TokenNameLPAREN	
j	TokenNameIdentifier	 j
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/* try just removing -ity */	TokenNameCOMMENT_BLOCK	 try just removing -ity 
k	TokenNameIdentifier	 k
=	TokenNameEQUAL	
j	TokenNameIdentifier	 j
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
lookup	TokenNameIdentifier	 lookup
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
word	TokenNameIdentifier	 word
.	TokenNameDOT	
unsafeWrite	TokenNameIdentifier	 unsafe Write
(	TokenNameLPAREN	
'e'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/* try removing -ity and adding -e */	TokenNameCOMMENT_BLOCK	 try removing -ity and adding -e 
k	TokenNameIdentifier	 k
=	TokenNameEQUAL	
j	TokenNameIdentifier	 j
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
lookup	TokenNameIdentifier	 lookup
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
word	TokenNameIdentifier	 word
.	TokenNameDOT	
setCharAt	TokenNameIdentifier	 set Char At
(	TokenNameLPAREN	
j	TokenNameIdentifier	 j
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
'i'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
word	TokenNameIdentifier	 word
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"ty"	TokenNameStringLiteral	ty
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
k	TokenNameIdentifier	 k
=	TokenNameEQUAL	
old_k	TokenNameIdentifier	 old k
;	TokenNameSEMICOLON	
/* * the -ability and -ibility endings are highly productive, so just accept * them */	TokenNameCOMMENT_BLOCK	 the -ability and -ibility endings are highly productive, so just accept them 
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
j	TokenNameIdentifier	 j
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
word	TokenNameIdentifier	 word
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
j	TokenNameIdentifier	 j
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
'i'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
word	TokenNameIdentifier	 word
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
j	TokenNameIdentifier	 j
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
'l'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
word	TokenNameIdentifier	 word
.	TokenNameDOT	
setLength	TokenNameIdentifier	 set Length
(	TokenNameLPAREN	
j	TokenNameIdentifier	 j
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
word	TokenNameIdentifier	 word
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"le"	TokenNameStringLiteral	le
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/* convert to -ble */	TokenNameCOMMENT_BLOCK	 convert to -ble 
k	TokenNameIdentifier	 k
=	TokenNameEQUAL	
j	TokenNameIdentifier	 j
;	TokenNameSEMICOLON	
lookup	TokenNameIdentifier	 lookup
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/* ditto for -ivity */	TokenNameCOMMENT_BLOCK	 ditto for -ivity 
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
j	TokenNameIdentifier	 j
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
word	TokenNameIdentifier	 word
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
j	TokenNameIdentifier	 j
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
'i'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
word	TokenNameIdentifier	 word
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
j	TokenNameIdentifier	 j
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
'v'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
word	TokenNameIdentifier	 word
.	TokenNameDOT	
setLength	TokenNameIdentifier	 set Length
(	TokenNameLPAREN	
j	TokenNameIdentifier	 j
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
word	TokenNameIdentifier	 word
.	TokenNameDOT	
unsafeWrite	TokenNameIdentifier	 unsafe Write
(	TokenNameLPAREN	
'e'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/* convert to -ive */	TokenNameCOMMENT_BLOCK	 convert to -ive 
k	TokenNameIdentifier	 k
=	TokenNameEQUAL	
j	TokenNameIdentifier	 j
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
lookup	TokenNameIdentifier	 lookup
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/* ditto for -ality */	TokenNameCOMMENT_BLOCK	 ditto for -ality 
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
j	TokenNameIdentifier	 j
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
word	TokenNameIdentifier	 word
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
j	TokenNameIdentifier	 j
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
'a'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
word	TokenNameIdentifier	 word
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
j	TokenNameIdentifier	 j
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
'l'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
word	TokenNameIdentifier	 word
.	TokenNameDOT	
setLength	TokenNameIdentifier	 set Length
(	TokenNameLPAREN	
j	TokenNameIdentifier	 j
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
k	TokenNameIdentifier	 k
=	TokenNameEQUAL	
j	TokenNameIdentifier	 j
;	TokenNameSEMICOLON	
lookup	TokenNameIdentifier	 lookup
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/* * if the root isn't in the dictionary, and the variant *is* there, then * use the variant. This allows `immunity'->`immune', but prevents * `capacity'->`capac'. If neither the variant nor the root form are in * the dictionary, then remove the ending as a default */	TokenNameCOMMENT_BLOCK	 if the root isn't in the dictionary, and the variant *is* there, then use the variant. This allows `immunity'->`immune', but prevents `capacity'->`capac'. If neither the variant nor the root form are in the dictionary, then remove the ending as a default 
if	TokenNameif	
(	TokenNameLPAREN	
lookup	TokenNameIdentifier	 lookup
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
/* the default is to remove -ity altogether */	TokenNameCOMMENT_BLOCK	 the default is to remove -ity altogether 
word	TokenNameIdentifier	 word
.	TokenNameDOT	
setLength	TokenNameIdentifier	 set Length
(	TokenNameLPAREN	
j	TokenNameIdentifier	 j
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
k	TokenNameIdentifier	 k
=	TokenNameEQUAL	
j	TokenNameIdentifier	 j
;	TokenNameSEMICOLON	
// nolookup(), we already did it. 	TokenNameCOMMENT_LINE	nolookup(), we already did it. 
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/* handle -ence and -ance */	TokenNameCOMMENT_BLOCK	 handle -ence and -ance 
private	TokenNameprivate	
void	TokenNamevoid	
nceEndings	TokenNameIdentifier	 nce Endings
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
old_k	TokenNameIdentifier	 old k
=	TokenNameEQUAL	
k	TokenNameIdentifier	 k
;	TokenNameSEMICOLON	
char	TokenNamechar	
word_char	TokenNameIdentifier	 word char
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
endsIn	TokenNameIdentifier	 ends In
(	TokenNameLPAREN	
'n'	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
'c'	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
'e'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
word_char	TokenNameIdentifier	 word char
=	TokenNameEQUAL	
word	TokenNameIdentifier	 word
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
j	TokenNameIdentifier	 j
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
word_char	TokenNameIdentifier	 word char
==	TokenNameEQUAL_EQUAL	
'e'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
word_char	TokenNameIdentifier	 word char
==	TokenNameEQUAL_EQUAL	
'a'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
word	TokenNameIdentifier	 word
.	TokenNameDOT	
setLength	TokenNameIdentifier	 set Length
(	TokenNameLPAREN	
j	TokenNameIdentifier	 j
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
word	TokenNameIdentifier	 word
.	TokenNameDOT	
unsafeWrite	TokenNameIdentifier	 unsafe Write
(	TokenNameLPAREN	
'e'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/* try converting -e/ance to -e (adherance/adhere) */	TokenNameCOMMENT_BLOCK	 try converting -e/ance to -e (adherance/adhere) 
k	TokenNameIdentifier	 k
=	TokenNameEQUAL	
j	TokenNameIdentifier	 j
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
lookup	TokenNameIdentifier	 lookup
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
word	TokenNameIdentifier	 word
.	TokenNameDOT	
setLength	TokenNameIdentifier	 set Length
(	TokenNameLPAREN	
j	TokenNameIdentifier	 j
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/* * try removing -e/ance altogether * (disappearance/disappear) */	TokenNameCOMMENT_BLOCK	 try removing -e/ance altogether (disappearance/disappear) 
k	TokenNameIdentifier	 k
=	TokenNameEQUAL	
j	TokenNameIdentifier	 j
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
lookup	TokenNameIdentifier	 lookup
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
word	TokenNameIdentifier	 word
.	TokenNameDOT	
unsafeWrite	TokenNameIdentifier	 unsafe Write
(	TokenNameLPAREN	
word_char	TokenNameIdentifier	 word char
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/* restore the original ending */	TokenNameCOMMENT_BLOCK	 restore the original ending 
word	TokenNameIdentifier	 word
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"nce"	TokenNameStringLiteral	nce
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
k	TokenNameIdentifier	 k
=	TokenNameEQUAL	
old_k	TokenNameIdentifier	 old k
;	TokenNameSEMICOLON	
// nolookup() because we restored the original ending 	TokenNameCOMMENT_LINE	nolookup() because we restored the original ending 
}	TokenNameRBRACE	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/* handle -ness */	TokenNameCOMMENT_BLOCK	 handle -ness 
private	TokenNameprivate	
void	TokenNamevoid	
nessEndings	TokenNameIdentifier	 ness Endings
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
endsIn	TokenNameIdentifier	 ends In
(	TokenNameLPAREN	
'n'	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
'e'	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
's'	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
's'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
/* * this is a very productive endings, so * just accept it */	TokenNameCOMMENT_BLOCK	 this is a very productive endings, so just accept it 
word	TokenNameIdentifier	 word
.	TokenNameDOT	
setLength	TokenNameIdentifier	 set Length
(	TokenNameLPAREN	
j	TokenNameIdentifier	 j
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
k	TokenNameIdentifier	 k
=	TokenNameEQUAL	
j	TokenNameIdentifier	 j
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
word	TokenNameIdentifier	 word
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
j	TokenNameIdentifier	 j
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
'i'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
word	TokenNameIdentifier	 word
.	TokenNameDOT	
setCharAt	TokenNameIdentifier	 set Char At
(	TokenNameLPAREN	
j	TokenNameIdentifier	 j
,	TokenNameCOMMA	
'y'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
lookup	TokenNameIdentifier	 lookup
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/* handle -ism */	TokenNameCOMMENT_BLOCK	 handle -ism 
private	TokenNameprivate	
void	TokenNamevoid	
ismEndings	TokenNameIdentifier	 ism Endings
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
endsIn	TokenNameIdentifier	 ends In
(	TokenNameLPAREN	
'i'	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
's'	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
'm'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
/* * this is a very productive ending, so just * accept it */	TokenNameCOMMENT_BLOCK	 this is a very productive ending, so just accept it 
word	TokenNameIdentifier	 word
.	TokenNameDOT	
setLength	TokenNameIdentifier	 set Length
(	TokenNameLPAREN	
j	TokenNameIdentifier	 j
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
k	TokenNameIdentifier	 k
=	TokenNameEQUAL	
j	TokenNameIdentifier	 j
;	TokenNameSEMICOLON	
lookup	TokenNameIdentifier	 lookup
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/* this routine deals with -ment endings. */	TokenNameCOMMENT_BLOCK	 this routine deals with -ment endings. 
private	TokenNameprivate	
void	TokenNamevoid	
mentEndings	TokenNameIdentifier	 ment Endings
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
old_k	TokenNameIdentifier	 old k
=	TokenNameEQUAL	
k	TokenNameIdentifier	 k
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
endsIn	TokenNameIdentifier	 ends In
(	TokenNameLPAREN	
'm'	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
'e'	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
'n'	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
't'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
word	TokenNameIdentifier	 word
.	TokenNameDOT	
setLength	TokenNameIdentifier	 set Length
(	TokenNameLPAREN	
j	TokenNameIdentifier	 j
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
k	TokenNameIdentifier	 k
=	TokenNameEQUAL	
j	TokenNameIdentifier	 j
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
lookup	TokenNameIdentifier	 lookup
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
word	TokenNameIdentifier	 word
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"ment"	TokenNameStringLiteral	ment
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
k	TokenNameIdentifier	 k
=	TokenNameEQUAL	
old_k	TokenNameIdentifier	 old k
;	TokenNameSEMICOLON	
// nolookup 	TokenNameCOMMENT_LINE	nolookup 
}	TokenNameRBRACE	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/* this routine deals with -ize endings. */	TokenNameCOMMENT_BLOCK	 this routine deals with -ize endings. 
private	TokenNameprivate	
void	TokenNamevoid	
izeEndings	TokenNameIdentifier	 ize Endings
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
old_k	TokenNameIdentifier	 old k
=	TokenNameEQUAL	
k	TokenNameIdentifier	 k
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
endsIn	TokenNameIdentifier	 ends In
(	TokenNameLPAREN	
'i'	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
'z'	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
'e'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
word	TokenNameIdentifier	 word
.	TokenNameDOT	
setLength	TokenNameIdentifier	 set Length
(	TokenNameLPAREN	
j	TokenNameIdentifier	 j
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/* try removing -ize entirely */	TokenNameCOMMENT_BLOCK	 try removing -ize entirely 
k	TokenNameIdentifier	 k
=	TokenNameEQUAL	
j	TokenNameIdentifier	 j
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
lookup	TokenNameIdentifier	 lookup
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
word	TokenNameIdentifier	 word
.	TokenNameDOT	
unsafeWrite	TokenNameIdentifier	 unsafe Write
(	TokenNameLPAREN	
'i'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
doubleC	TokenNameIdentifier	 double C
(	TokenNameLPAREN	
j	TokenNameIdentifier	 j
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
/* allow for a doubled consonant */	TokenNameCOMMENT_BLOCK	 allow for a doubled consonant 
word	TokenNameIdentifier	 word
.	TokenNameDOT	
setLength	TokenNameIdentifier	 set Length
(	TokenNameLPAREN	
j	TokenNameIdentifier	 j
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
k	TokenNameIdentifier	 k
=	TokenNameEQUAL	
j	TokenNameIdentifier	 j
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
lookup	TokenNameIdentifier	 lookup
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
word	TokenNameIdentifier	 word
.	TokenNameDOT	
unsafeWrite	TokenNameIdentifier	 unsafe Write
(	TokenNameLPAREN	
word	TokenNameIdentifier	 word
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
j	TokenNameIdentifier	 j
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
word	TokenNameIdentifier	 word
.	TokenNameDOT	
setLength	TokenNameIdentifier	 set Length
(	TokenNameLPAREN	
j	TokenNameIdentifier	 j
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
word	TokenNameIdentifier	 word
.	TokenNameDOT	
unsafeWrite	TokenNameIdentifier	 unsafe Write
(	TokenNameLPAREN	
'e'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/* try removing -ize and adding -e */	TokenNameCOMMENT_BLOCK	 try removing -ize and adding -e 
k	TokenNameIdentifier	 k
=	TokenNameEQUAL	
j	TokenNameIdentifier	 j
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
lookup	TokenNameIdentifier	 lookup
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
word	TokenNameIdentifier	 word
.	TokenNameDOT	
setLength	TokenNameIdentifier	 set Length
(	TokenNameLPAREN	
j	TokenNameIdentifier	 j
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
word	TokenNameIdentifier	 word
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"ize"	TokenNameStringLiteral	ize
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
k	TokenNameIdentifier	 k
=	TokenNameEQUAL	
old_k	TokenNameIdentifier	 old k
;	TokenNameSEMICOLON	
// nolookup() 	TokenNameCOMMENT_LINE	nolookup() 
}	TokenNameRBRACE	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/* handle -ency and -ancy */	TokenNameCOMMENT_BLOCK	 handle -ency and -ancy 
private	TokenNameprivate	
void	TokenNamevoid	
ncyEndings	TokenNameIdentifier	 ncy Endings
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
endsIn	TokenNameIdentifier	 ends In
(	TokenNameLPAREN	
'n'	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
'c'	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
'y'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
word	TokenNameIdentifier	 word
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
j	TokenNameIdentifier	 j
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
'e'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
word	TokenNameIdentifier	 word
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
j	TokenNameIdentifier	 j
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
'a'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
word	TokenNameIdentifier	 word
.	TokenNameDOT	
setCharAt	TokenNameIdentifier	 set Char At
(	TokenNameLPAREN	
j	TokenNameIdentifier	 j
+	TokenNamePLUS	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
't'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/* try converting -ncy to -nt */	TokenNameCOMMENT_BLOCK	 try converting -ncy to -nt 
word	TokenNameIdentifier	 word
.	TokenNameDOT	
setLength	TokenNameIdentifier	 set Length
(	TokenNameLPAREN	
j	TokenNameIdentifier	 j
+	TokenNamePLUS	
3	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
k	TokenNameIdentifier	 k
=	TokenNameEQUAL	
j	TokenNameIdentifier	 j
+	TokenNamePLUS	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
lookup	TokenNameIdentifier	 lookup
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
word	TokenNameIdentifier	 word
.	TokenNameDOT	
setCharAt	TokenNameIdentifier	 set Char At
(	TokenNameLPAREN	
j	TokenNameIdentifier	 j
+	TokenNamePLUS	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
'c'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/* the default is to convert it to -nce */	TokenNameCOMMENT_BLOCK	 the default is to convert it to -nce 
word	TokenNameIdentifier	 word
.	TokenNameDOT	
unsafeWrite	TokenNameIdentifier	 unsafe Write
(	TokenNameLPAREN	
'e'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
k	TokenNameIdentifier	 k
=	TokenNameEQUAL	
j	TokenNameIdentifier	 j
+	TokenNamePLUS	
3	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
lookup	TokenNameIdentifier	 lookup
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/* handle -able and -ible */	TokenNameCOMMENT_BLOCK	 handle -able and -ible 
private	TokenNameprivate	
void	TokenNamevoid	
bleEndings	TokenNameIdentifier	 ble Endings
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
old_k	TokenNameIdentifier	 old k
=	TokenNameEQUAL	
k	TokenNameIdentifier	 k
;	TokenNameSEMICOLON	
char	TokenNamechar	
word_char	TokenNameIdentifier	 word char
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
endsIn	TokenNameIdentifier	 ends In
(	TokenNameLPAREN	
'b'	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
'l'	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
'e'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
word	TokenNameIdentifier	 word
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
j	TokenNameIdentifier	 j
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
'a'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
word	TokenNameIdentifier	 word
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
j	TokenNameIdentifier	 j
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
'i'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
word_char	TokenNameIdentifier	 word char
=	TokenNameEQUAL	
word	TokenNameIdentifier	 word
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
j	TokenNameIdentifier	 j
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
word	TokenNameIdentifier	 word
.	TokenNameDOT	
setLength	TokenNameIdentifier	 set Length
(	TokenNameLPAREN	
j	TokenNameIdentifier	 j
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/* try just removing the ending */	TokenNameCOMMENT_BLOCK	 try just removing the ending 
k	TokenNameIdentifier	 k
=	TokenNameEQUAL	
j	TokenNameIdentifier	 j
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
lookup	TokenNameIdentifier	 lookup
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
doubleC	TokenNameIdentifier	 double C
(	TokenNameLPAREN	
k	TokenNameIdentifier	 k
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
/* allow for a doubled consonant */	TokenNameCOMMENT_BLOCK	 allow for a doubled consonant 
word	TokenNameIdentifier	 word
.	TokenNameDOT	
setLength	TokenNameIdentifier	 set Length
(	TokenNameLPAREN	
k	TokenNameIdentifier	 k
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
k	TokenNameIdentifier	 k
--	TokenNameMINUS_MINUS	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
lookup	TokenNameIdentifier	 lookup
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
k	TokenNameIdentifier	 k
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
word	TokenNameIdentifier	 word
.	TokenNameDOT	
unsafeWrite	TokenNameIdentifier	 unsafe Write
(	TokenNameLPAREN	
word	TokenNameIdentifier	 word
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
k	TokenNameIdentifier	 k
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
word	TokenNameIdentifier	 word
.	TokenNameDOT	
setLength	TokenNameIdentifier	 set Length
(	TokenNameLPAREN	
j	TokenNameIdentifier	 j
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
word	TokenNameIdentifier	 word
.	TokenNameDOT	
unsafeWrite	TokenNameIdentifier	 unsafe Write
(	TokenNameLPAREN	
'e'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/* try removing -a/ible and adding -e */	TokenNameCOMMENT_BLOCK	 try removing -a/ible and adding -e 
k	TokenNameIdentifier	 k
=	TokenNameEQUAL	
j	TokenNameIdentifier	 j
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
lookup	TokenNameIdentifier	 lookup
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
word	TokenNameIdentifier	 word
.	TokenNameDOT	
setLength	TokenNameIdentifier	 set Length
(	TokenNameLPAREN	
j	TokenNameIdentifier	 j
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
word	TokenNameIdentifier	 word
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"ate"	TokenNameStringLiteral	ate
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/* try removing -able and adding -ate */	TokenNameCOMMENT_BLOCK	 try removing -able and adding -ate 
/* (e.g., compensable/compensate) */	TokenNameCOMMENT_BLOCK	 (e.g., compensable/compensate) 
k	TokenNameIdentifier	 k
=	TokenNameEQUAL	
j	TokenNameIdentifier	 j
+	TokenNamePLUS	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
lookup	TokenNameIdentifier	 lookup
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
word	TokenNameIdentifier	 word
.	TokenNameDOT	
setLength	TokenNameIdentifier	 set Length
(	TokenNameLPAREN	
j	TokenNameIdentifier	 j
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
word	TokenNameIdentifier	 word
.	TokenNameDOT	
unsafeWrite	TokenNameIdentifier	 unsafe Write
(	TokenNameLPAREN	
word_char	TokenNameIdentifier	 word char
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/* restore the original values */	TokenNameCOMMENT_BLOCK	 restore the original values 
word	TokenNameIdentifier	 word
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"ble"	TokenNameStringLiteral	ble
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
k	TokenNameIdentifier	 k
=	TokenNameEQUAL	
old_k	TokenNameIdentifier	 old k
;	TokenNameSEMICOLON	
// nolookup() 	TokenNameCOMMENT_LINE	nolookup() 
}	TokenNameRBRACE	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/* * handle -ic endings. This is fairly straightforward, but this is also the * only place we try *expanding* an ending, -ic -> -ical. This is to handle * cases like `canonic' -> `canonical' */	TokenNameCOMMENT_BLOCK	 handle -ic endings. This is fairly straightforward, but this is also the only place we try *expanding* an ending, -ic -> -ical. This is to handle cases like `canonic' -> `canonical' 
private	TokenNameprivate	
void	TokenNamevoid	
icEndings	TokenNameIdentifier	 ic Endings
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
endsIn	TokenNameIdentifier	 ends In
(	TokenNameLPAREN	
'i'	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
'c'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
word	TokenNameIdentifier	 word
.	TokenNameDOT	
setLength	TokenNameIdentifier	 set Length
(	TokenNameLPAREN	
j	TokenNameIdentifier	 j
+	TokenNamePLUS	
3	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
word	TokenNameIdentifier	 word
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"al"	TokenNameStringLiteral	al
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/* try converting -ic to -ical */	TokenNameCOMMENT_BLOCK	 try converting -ic to -ical 
k	TokenNameIdentifier	 k
=	TokenNameEQUAL	
j	TokenNameIdentifier	 j
+	TokenNamePLUS	
4	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
lookup	TokenNameIdentifier	 lookup
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
word	TokenNameIdentifier	 word
.	TokenNameDOT	
setCharAt	TokenNameIdentifier	 set Char At
(	TokenNameLPAREN	
j	TokenNameIdentifier	 j
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
'y'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/* try converting -ic to -y */	TokenNameCOMMENT_BLOCK	 try converting -ic to -y 
word	TokenNameIdentifier	 word
.	TokenNameDOT	
setLength	TokenNameIdentifier	 set Length
(	TokenNameLPAREN	
j	TokenNameIdentifier	 j
+	TokenNamePLUS	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
k	TokenNameIdentifier	 k
=	TokenNameEQUAL	
j	TokenNameIdentifier	 j
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
lookup	TokenNameIdentifier	 lookup
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
word	TokenNameIdentifier	 word
.	TokenNameDOT	
setCharAt	TokenNameIdentifier	 set Char At
(	TokenNameLPAREN	
j	TokenNameIdentifier	 j
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
'e'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/* try converting -ic to -e */	TokenNameCOMMENT_BLOCK	 try converting -ic to -e 
if	TokenNameif	
(	TokenNameLPAREN	
lookup	TokenNameIdentifier	 lookup
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
word	TokenNameIdentifier	 word
.	TokenNameDOT	
setLength	TokenNameIdentifier	 set Length
(	TokenNameLPAREN	
j	TokenNameIdentifier	 j
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/* try removing -ic altogether */	TokenNameCOMMENT_BLOCK	 try removing -ic altogether 
k	TokenNameIdentifier	 k
=	TokenNameEQUAL	
j	TokenNameIdentifier	 j
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
lookup	TokenNameIdentifier	 lookup
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
word	TokenNameIdentifier	 word
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"ic"	TokenNameStringLiteral	ic
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/* restore the original ending */	TokenNameCOMMENT_BLOCK	 restore the original ending 
k	TokenNameIdentifier	 k
=	TokenNameEQUAL	
j	TokenNameIdentifier	 j
+	TokenNamePLUS	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// nolookup() 	TokenNameCOMMENT_LINE	nolookup() 
}	TokenNameRBRACE	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
ization	TokenNameIdentifier	 ization
=	TokenNameEQUAL	
"ization"	TokenNameStringLiteral	ization
.	TokenNameDOT	
toCharArray	TokenNameIdentifier	 to Char Array
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
ition	TokenNameIdentifier	 ition
=	TokenNameEQUAL	
"ition"	TokenNameStringLiteral	ition
.	TokenNameDOT	
toCharArray	TokenNameIdentifier	 to Char Array
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
ation	TokenNameIdentifier	 ation
=	TokenNameEQUAL	
"ation"	TokenNameStringLiteral	ation
.	TokenNameDOT	
toCharArray	TokenNameIdentifier	 to Char Array
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
ication	TokenNameIdentifier	 ication
=	TokenNameEQUAL	
"ication"	TokenNameStringLiteral	ication
.	TokenNameDOT	
toCharArray	TokenNameIdentifier	 to Char Array
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/* handle some derivational endings */	TokenNameCOMMENT_BLOCK	 handle some derivational endings 
/* * this routine deals with -ion, -ition, -ation, -ization, and -ication. The * -ization ending is always converted to -ize */	TokenNameCOMMENT_BLOCK	 this routine deals with -ion, -ition, -ation, -ization, and -ication. The -ization ending is always converted to -ize 
private	TokenNameprivate	
void	TokenNamevoid	
ionEndings	TokenNameIdentifier	 ion Endings
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
old_k	TokenNameIdentifier	 old k
=	TokenNameEQUAL	
k	TokenNameIdentifier	 k
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
endsIn	TokenNameIdentifier	 ends In
(	TokenNameLPAREN	
'i'	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
'o'	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
'n'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
endsIn	TokenNameIdentifier	 ends In
(	TokenNameLPAREN	
ization	TokenNameIdentifier	 ization
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
/* * the -ize ending is very productive, so simply * accept it as the root */	TokenNameCOMMENT_BLOCK	 the -ize ending is very productive, so simply accept it as the root 
word	TokenNameIdentifier	 word
.	TokenNameDOT	
setLength	TokenNameIdentifier	 set Length
(	TokenNameLPAREN	
j	TokenNameIdentifier	 j
+	TokenNamePLUS	
3	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
word	TokenNameIdentifier	 word
.	TokenNameDOT	
unsafeWrite	TokenNameIdentifier	 unsafe Write
(	TokenNameLPAREN	
'e'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
k	TokenNameIdentifier	 k
=	TokenNameEQUAL	
j	TokenNameIdentifier	 j
+	TokenNamePLUS	
3	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
lookup	TokenNameIdentifier	 lookup
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
endsIn	TokenNameIdentifier	 ends In
(	TokenNameLPAREN	
ition	TokenNameIdentifier	 ition
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
word	TokenNameIdentifier	 word
.	TokenNameDOT	
setLength	TokenNameIdentifier	 set Length
(	TokenNameLPAREN	
j	TokenNameIdentifier	 j
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
word	TokenNameIdentifier	 word
.	TokenNameDOT	
unsafeWrite	TokenNameIdentifier	 unsafe Write
(	TokenNameLPAREN	
'e'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
k	TokenNameIdentifier	 k
=	TokenNameEQUAL	
j	TokenNameIdentifier	 j
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
lookup	TokenNameIdentifier	 lookup
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
/* * remove -ition and add `e', and check against the * dictionary */	TokenNameCOMMENT_BLOCK	 remove -ition and add `e', and check against the dictionary 
return	TokenNamereturn	
;	TokenNameSEMICOLON	
/* (e.g., definition->define, opposition->oppose) */	TokenNameCOMMENT_BLOCK	 (e.g., definition->define, opposition->oppose) 
/* restore original values */	TokenNameCOMMENT_BLOCK	 restore original values 
word	TokenNameIdentifier	 word
.	TokenNameDOT	
setLength	TokenNameIdentifier	 set Length
(	TokenNameLPAREN	
j	TokenNameIdentifier	 j
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
word	TokenNameIdentifier	 word
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"ition"	TokenNameStringLiteral	ition
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
k	TokenNameIdentifier	 k
=	TokenNameEQUAL	
old_k	TokenNameIdentifier	 old k
;	TokenNameSEMICOLON	
// nolookup() 	TokenNameCOMMENT_LINE	nolookup() 
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
endsIn	TokenNameIdentifier	 ends In
(	TokenNameLPAREN	
ation	TokenNameIdentifier	 ation
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
word	TokenNameIdentifier	 word
.	TokenNameDOT	
setLength	TokenNameIdentifier	 set Length
(	TokenNameLPAREN	
j	TokenNameIdentifier	 j
+	TokenNamePLUS	
3	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
word	TokenNameIdentifier	 word
.	TokenNameDOT	
unsafeWrite	TokenNameIdentifier	 unsafe Write
(	TokenNameLPAREN	
'e'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
k	TokenNameIdentifier	 k
=	TokenNameEQUAL	
j	TokenNameIdentifier	 j
+	TokenNamePLUS	
3	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
lookup	TokenNameIdentifier	 lookup
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
/* remove -ion and add `e', and check against the dictionary */	TokenNameCOMMENT_BLOCK	 remove -ion and add `e', and check against the dictionary 
return	TokenNamereturn	
;	TokenNameSEMICOLON	
/* (elmination -> eliminate) */	TokenNameCOMMENT_BLOCK	 (elmination -> eliminate) 
word	TokenNameIdentifier	 word
.	TokenNameDOT	
setLength	TokenNameIdentifier	 set Length
(	TokenNameLPAREN	
j	TokenNameIdentifier	 j
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
word	TokenNameIdentifier	 word
.	TokenNameDOT	
unsafeWrite	TokenNameIdentifier	 unsafe Write
(	TokenNameLPAREN	
'e'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/* * remove -ation and add `e', and check against the * dictionary */	TokenNameCOMMENT_BLOCK	 remove -ation and add `e', and check against the dictionary 
k	TokenNameIdentifier	 k
=	TokenNameEQUAL	
j	TokenNameIdentifier	 j
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
lookup	TokenNameIdentifier	 lookup
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
word	TokenNameIdentifier	 word
.	TokenNameDOT	
setLength	TokenNameIdentifier	 set Length
(	TokenNameLPAREN	
j	TokenNameIdentifier	 j
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/* * just remove -ation (resignation->resign) and * check dictionary */	TokenNameCOMMENT_BLOCK	 just remove -ation (resignation->resign) and check dictionary 
k	TokenNameIdentifier	 k
=	TokenNameEQUAL	
j	TokenNameIdentifier	 j
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
lookup	TokenNameIdentifier	 lookup
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
/* restore original values */	TokenNameCOMMENT_BLOCK	 restore original values 
word	TokenNameIdentifier	 word
.	TokenNameDOT	
setLength	TokenNameIdentifier	 set Length
(	TokenNameLPAREN	
j	TokenNameIdentifier	 j
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
word	TokenNameIdentifier	 word
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"ation"	TokenNameStringLiteral	ation
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
k	TokenNameIdentifier	 k
=	TokenNameEQUAL	
old_k	TokenNameIdentifier	 old k
;	TokenNameSEMICOLON	
// nolookup() 	TokenNameCOMMENT_LINE	nolookup() 
}	TokenNameRBRACE	
/* * test -ication after -ation is attempted (e.g., `complication->complicate' * rather than `complication->comply') */	TokenNameCOMMENT_BLOCK	 test -ication after -ation is attempted (e.g., `complication->complicate' rather than `complication->comply') 
if	TokenNameif	
(	TokenNameLPAREN	
endsIn	TokenNameIdentifier	 ends In
(	TokenNameLPAREN	
ication	TokenNameIdentifier	 ication
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
word	TokenNameIdentifier	 word
.	TokenNameDOT	
setLength	TokenNameIdentifier	 set Length
(	TokenNameLPAREN	
j	TokenNameIdentifier	 j
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
word	TokenNameIdentifier	 word
.	TokenNameDOT	
unsafeWrite	TokenNameIdentifier	 unsafe Write
(	TokenNameLPAREN	
'y'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
k	TokenNameIdentifier	 k
=	TokenNameEQUAL	
j	TokenNameIdentifier	 j
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
lookup	TokenNameIdentifier	 lookup
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
/* * remove -ication and add `y', and check against the * dictionary */	TokenNameCOMMENT_BLOCK	 remove -ication and add `y', and check against the dictionary 
return	TokenNamereturn	
;	TokenNameSEMICOLON	
/* (e.g., amplification -> amplify) */	TokenNameCOMMENT_BLOCK	 (e.g., amplification -> amplify) 
/* restore original values */	TokenNameCOMMENT_BLOCK	 restore original values 
word	TokenNameIdentifier	 word
.	TokenNameDOT	
setLength	TokenNameIdentifier	 set Length
(	TokenNameLPAREN	
j	TokenNameIdentifier	 j
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
word	TokenNameIdentifier	 word
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"ication"	TokenNameStringLiteral	ication
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
k	TokenNameIdentifier	 k
=	TokenNameEQUAL	
old_k	TokenNameIdentifier	 old k
;	TokenNameSEMICOLON	
// nolookup() 	TokenNameCOMMENT_LINE	nolookup() 
}	TokenNameRBRACE	
// if (endsIn(ion)) { 	TokenNameCOMMENT_LINE	if (endsIn(ion)) { 
if	TokenNameif	
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// we checked for this earlier... just need to set "j" 	TokenNameCOMMENT_LINE	we checked for this earlier... just need to set "j" 
j	TokenNameIdentifier	 j
=	TokenNameEQUAL	
k	TokenNameIdentifier	 k
-	TokenNameMINUS	
3	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// YCS 	TokenNameCOMMENT_LINE	YCS 
word	TokenNameIdentifier	 word
.	TokenNameDOT	
setLength	TokenNameIdentifier	 set Length
(	TokenNameLPAREN	
j	TokenNameIdentifier	 j
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
word	TokenNameIdentifier	 word
.	TokenNameDOT	
unsafeWrite	TokenNameIdentifier	 unsafe Write
(	TokenNameLPAREN	
'e'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
k	TokenNameIdentifier	 k
=	TokenNameEQUAL	
j	TokenNameIdentifier	 j
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
lookup	TokenNameIdentifier	 lookup
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
/* remove -ion and add `e', and check against the dictionary */	TokenNameCOMMENT_BLOCK	 remove -ion and add `e', and check against the dictionary 
return	TokenNamereturn	
;	TokenNameSEMICOLON	
word	TokenNameIdentifier	 word
.	TokenNameDOT	
setLength	TokenNameIdentifier	 set Length
(	TokenNameLPAREN	
j	TokenNameIdentifier	 j
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
k	TokenNameIdentifier	 k
=	TokenNameEQUAL	
j	TokenNameIdentifier	 j
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
lookup	TokenNameIdentifier	 lookup
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
/* remove -ion, and if it's found, treat that as the root */	TokenNameCOMMENT_BLOCK	 remove -ion, and if it's found, treat that as the root 
return	TokenNamereturn	
;	TokenNameSEMICOLON	
/* restore original values */	TokenNameCOMMENT_BLOCK	 restore original values 
word	TokenNameIdentifier	 word
.	TokenNameDOT	
setLength	TokenNameIdentifier	 set Length
(	TokenNameLPAREN	
j	TokenNameIdentifier	 j
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
word	TokenNameIdentifier	 word
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"ion"	TokenNameStringLiteral	ion
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
k	TokenNameIdentifier	 k
=	TokenNameEQUAL	
old_k	TokenNameIdentifier	 old k
;	TokenNameSEMICOLON	
// nolookup() 	TokenNameCOMMENT_LINE	nolookup() 
}	TokenNameRBRACE	
// nolookup(); all of the other paths restored original values 	TokenNameCOMMENT_LINE	nolookup(); all of the other paths restored original values 
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/* * this routine deals with -er, -or, -ier, and -eer. The -izer ending is * always converted to -ize */	TokenNameCOMMENT_BLOCK	 this routine deals with -er, -or, -ier, and -eer. The -izer ending is always converted to -ize 
private	TokenNameprivate	
void	TokenNamevoid	
erAndOrEndings	TokenNameIdentifier	 er And Or Endings
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
old_k	TokenNameIdentifier	 old k
=	TokenNameEQUAL	
k	TokenNameIdentifier	 k
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
word	TokenNameIdentifier	 word
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
k	TokenNameIdentifier	 k
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
'r'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
// YCS 	TokenNameCOMMENT_LINE	YCS 
char	TokenNamechar	
word_char	TokenNameIdentifier	 word char
;	TokenNameSEMICOLON	
/* so we can remember if it was -er or -or */	TokenNameCOMMENT_BLOCK	 so we can remember if it was -er or -or 
if	TokenNameif	
(	TokenNameLPAREN	
endsIn	TokenNameIdentifier	 ends In
(	TokenNameLPAREN	
'i'	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
'z'	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
'e'	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
'r'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
/* * -ize is very productive, so accept it * as the root */	TokenNameCOMMENT_BLOCK	 -ize is very productive, so accept it as the root 
word	TokenNameIdentifier	 word
.	TokenNameDOT	
setLength	TokenNameIdentifier	 set Length
(	TokenNameLPAREN	
j	TokenNameIdentifier	 j
+	TokenNamePLUS	
4	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
k	TokenNameIdentifier	 k
=	TokenNameEQUAL	
j	TokenNameIdentifier	 j
+	TokenNamePLUS	
3	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
lookup	TokenNameIdentifier	 lookup
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
endsIn	TokenNameIdentifier	 ends In
(	TokenNameLPAREN	
'e'	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
'r'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
||	TokenNameOR_OR	
endsIn	TokenNameIdentifier	 ends In
(	TokenNameLPAREN	
'o'	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
'r'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
word_char	TokenNameIdentifier	 word char
=	TokenNameEQUAL	
word	TokenNameIdentifier	 word
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
j	TokenNameIdentifier	 j
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
doubleC	TokenNameIdentifier	 double C
(	TokenNameLPAREN	
j	TokenNameIdentifier	 j
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
word	TokenNameIdentifier	 word
.	TokenNameDOT	
setLength	TokenNameIdentifier	 set Length
(	TokenNameLPAREN	
j	TokenNameIdentifier	 j
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
k	TokenNameIdentifier	 k
=	TokenNameEQUAL	
j	TokenNameIdentifier	 j
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
lookup	TokenNameIdentifier	 lookup
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
word	TokenNameIdentifier	 word
.	TokenNameDOT	
unsafeWrite	TokenNameIdentifier	 unsafe Write
(	TokenNameLPAREN	
word	TokenNameIdentifier	 word
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
j	TokenNameIdentifier	 j
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/* restore the doubled consonant */	TokenNameCOMMENT_BLOCK	 restore the doubled consonant 
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
word	TokenNameIdentifier	 word
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
j	TokenNameIdentifier	 j
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
'i'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
/* do we have a -ier ending? */	TokenNameCOMMENT_BLOCK	 do we have a -ier ending? 
word	TokenNameIdentifier	 word
.	TokenNameDOT	
setCharAt	TokenNameIdentifier	 set Char At
(	TokenNameLPAREN	
j	TokenNameIdentifier	 j
,	TokenNameCOMMA	
'y'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
word	TokenNameIdentifier	 word
.	TokenNameDOT	
setLength	TokenNameIdentifier	 set Length
(	TokenNameLPAREN	
j	TokenNameIdentifier	 j
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
k	TokenNameIdentifier	 k
=	TokenNameEQUAL	
j	TokenNameIdentifier	 j
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
lookup	TokenNameIdentifier	 lookup
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
/* yes, so check against the dictionary */	TokenNameCOMMENT_BLOCK	 yes, so check against the dictionary 
return	TokenNamereturn	
;	TokenNameSEMICOLON	
word	TokenNameIdentifier	 word
.	TokenNameDOT	
setCharAt	TokenNameIdentifier	 set Char At
(	TokenNameLPAREN	
j	TokenNameIdentifier	 j
,	TokenNameCOMMA	
'i'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/* restore the endings */	TokenNameCOMMENT_BLOCK	 restore the endings 
word	TokenNameIdentifier	 word
.	TokenNameDOT	
unsafeWrite	TokenNameIdentifier	 unsafe Write
(	TokenNameLPAREN	
'e'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
word	TokenNameIdentifier	 word
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
j	TokenNameIdentifier	 j
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
'e'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
/* handle -eer */	TokenNameCOMMENT_BLOCK	 handle -eer 
word	TokenNameIdentifier	 word
.	TokenNameDOT	
setLength	TokenNameIdentifier	 set Length
(	TokenNameLPAREN	
j	TokenNameIdentifier	 j
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
k	TokenNameIdentifier	 k
=	TokenNameEQUAL	
j	TokenNameIdentifier	 j
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
lookup	TokenNameIdentifier	 lookup
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
word	TokenNameIdentifier	 word
.	TokenNameDOT	
unsafeWrite	TokenNameIdentifier	 unsafe Write
(	TokenNameLPAREN	
'e'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
word	TokenNameIdentifier	 word
.	TokenNameDOT	
setLength	TokenNameIdentifier	 set Length
(	TokenNameLPAREN	
j	TokenNameIdentifier	 j
+	TokenNamePLUS	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/* remove the -r ending */	TokenNameCOMMENT_BLOCK	 remove the -r ending 
k	TokenNameIdentifier	 k
=	TokenNameEQUAL	
j	TokenNameIdentifier	 j
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
lookup	TokenNameIdentifier	 lookup
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
word	TokenNameIdentifier	 word
.	TokenNameDOT	
setLength	TokenNameIdentifier	 set Length
(	TokenNameLPAREN	
j	TokenNameIdentifier	 j
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/* try removing -er/-or */	TokenNameCOMMENT_BLOCK	 try removing -er/-or 
k	TokenNameIdentifier	 k
=	TokenNameEQUAL	
j	TokenNameIdentifier	 j
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
lookup	TokenNameIdentifier	 lookup
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
word	TokenNameIdentifier	 word
.	TokenNameDOT	
unsafeWrite	TokenNameIdentifier	 unsafe Write
(	TokenNameLPAREN	
'e'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/* try removing -or and adding -e */	TokenNameCOMMENT_BLOCK	 try removing -or and adding -e 
k	TokenNameIdentifier	 k
=	TokenNameEQUAL	
j	TokenNameIdentifier	 j
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
lookup	TokenNameIdentifier	 lookup
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
word	TokenNameIdentifier	 word
.	TokenNameDOT	
setLength	TokenNameIdentifier	 set Length
(	TokenNameLPAREN	
j	TokenNameIdentifier	 j
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
word	TokenNameIdentifier	 word
.	TokenNameDOT	
unsafeWrite	TokenNameIdentifier	 unsafe Write
(	TokenNameLPAREN	
word_char	TokenNameIdentifier	 word char
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
word	TokenNameIdentifier	 word
.	TokenNameDOT	
unsafeWrite	TokenNameIdentifier	 unsafe Write
(	TokenNameLPAREN	
'r'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/* restore the word to the way it was */	TokenNameCOMMENT_BLOCK	 restore the word to the way it was 
k	TokenNameIdentifier	 k
=	TokenNameEQUAL	
old_k	TokenNameIdentifier	 old k
;	TokenNameSEMICOLON	
// nolookup() 	TokenNameCOMMENT_LINE	nolookup() 
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/* * this routine deals with -ly endings. The -ally ending is always converted * to -al Sometimes this will temporarily leave us with a non-word (e.g., * heuristically maps to heuristical), but then the -al is removed in the next * step. */	TokenNameCOMMENT_BLOCK	 this routine deals with -ly endings. The -ally ending is always converted to -al Sometimes this will temporarily leave us with a non-word (e.g., heuristically maps to heuristical), but then the -al is removed in the next step. 
private	TokenNameprivate	
void	TokenNamevoid	
lyEndings	TokenNameIdentifier	 ly Endings
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
old_k	TokenNameIdentifier	 old k
=	TokenNameEQUAL	
k	TokenNameIdentifier	 k
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
endsIn	TokenNameIdentifier	 ends In
(	TokenNameLPAREN	
'l'	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
'y'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
word	TokenNameIdentifier	 word
.	TokenNameDOT	
setCharAt	TokenNameIdentifier	 set Char At
(	TokenNameLPAREN	
j	TokenNameIdentifier	 j
+	TokenNamePLUS	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
'e'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/* try converting -ly to -le */	TokenNameCOMMENT_BLOCK	 try converting -ly to -le 
if	TokenNameif	
(	TokenNameLPAREN	
lookup	TokenNameIdentifier	 lookup
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
word	TokenNameIdentifier	 word
.	TokenNameDOT	
setCharAt	TokenNameIdentifier	 set Char At
(	TokenNameLPAREN	
j	TokenNameIdentifier	 j
+	TokenNamePLUS	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
'y'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
word	TokenNameIdentifier	 word
.	TokenNameDOT	
setLength	TokenNameIdentifier	 set Length
(	TokenNameLPAREN	
j	TokenNameIdentifier	 j
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/* try just removing the -ly */	TokenNameCOMMENT_BLOCK	 try just removing the -ly 
k	TokenNameIdentifier	 k
=	TokenNameEQUAL	
j	TokenNameIdentifier	 j
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
lookup	TokenNameIdentifier	 lookup
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
j	TokenNameIdentifier	 j
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
word	TokenNameIdentifier	 word
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
j	TokenNameIdentifier	 j
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
'a'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
word	TokenNameIdentifier	 word
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
j	TokenNameIdentifier	 j
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
'l'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
/* * always * convert * - * ally * to * - * al */	TokenNameCOMMENT_BLOCK	 always convert - ally to - al 
return	TokenNamereturn	
;	TokenNameSEMICOLON	
word	TokenNameIdentifier	 word
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"ly"	TokenNameStringLiteral	ly
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
k	TokenNameIdentifier	 k
=	TokenNameEQUAL	
old_k	TokenNameIdentifier	 old k
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
j	TokenNameIdentifier	 j
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
word	TokenNameIdentifier	 word
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
j	TokenNameIdentifier	 j
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
'a'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
word	TokenNameIdentifier	 word
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
j	TokenNameIdentifier	 j
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
'b'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
/* * always * convert * - * ably * to * - * able */	TokenNameCOMMENT_BLOCK	 always convert - ably to - able 
word	TokenNameIdentifier	 word
.	TokenNameDOT	
setCharAt	TokenNameIdentifier	 set Char At
(	TokenNameLPAREN	
j	TokenNameIdentifier	 j
+	TokenNamePLUS	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
'e'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
k	TokenNameIdentifier	 k
=	TokenNameEQUAL	
j	TokenNameIdentifier	 j
+	TokenNamePLUS	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
word	TokenNameIdentifier	 word
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
j	TokenNameIdentifier	 j
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
'i'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
/* e.g., militarily -> military */	TokenNameCOMMENT_BLOCK	 e.g., militarily -> military 
word	TokenNameIdentifier	 word
.	TokenNameDOT	
setLength	TokenNameIdentifier	 set Length
(	TokenNameLPAREN	
j	TokenNameIdentifier	 j
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
word	TokenNameIdentifier	 word
.	TokenNameDOT	
unsafeWrite	TokenNameIdentifier	 unsafe Write
(	TokenNameLPAREN	
'y'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
k	TokenNameIdentifier	 k
=	TokenNameEQUAL	
j	TokenNameIdentifier	 j
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
lookup	TokenNameIdentifier	 lookup
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
word	TokenNameIdentifier	 word
.	TokenNameDOT	
setLength	TokenNameIdentifier	 set Length
(	TokenNameLPAREN	
j	TokenNameIdentifier	 j
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
word	TokenNameIdentifier	 word
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"ily"	TokenNameStringLiteral	ily
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
k	TokenNameIdentifier	 k
=	TokenNameEQUAL	
old_k	TokenNameIdentifier	 old k
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
word	TokenNameIdentifier	 word
.	TokenNameDOT	
setLength	TokenNameIdentifier	 set Length
(	TokenNameLPAREN	
j	TokenNameIdentifier	 j
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/* the default is to remove -ly */	TokenNameCOMMENT_BLOCK	 the default is to remove -ly 
k	TokenNameIdentifier	 k
=	TokenNameEQUAL	
j	TokenNameIdentifier	 j
;	TokenNameSEMICOLON	
// nolookup()... we already tried removing the "ly" variant 	TokenNameCOMMENT_LINE	nolookup()... we already tried removing the "ly" variant 
}	TokenNameRBRACE	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/* * this routine deals with -al endings. Some of the endings from the previous * routine are finished up here. */	TokenNameCOMMENT_BLOCK	 this routine deals with -al endings. Some of the endings from the previous routine are finished up here. 
private	TokenNameprivate	
void	TokenNamevoid	
alEndings	TokenNameIdentifier	 al Endings
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
old_k	TokenNameIdentifier	 old k
=	TokenNameEQUAL	
k	TokenNameIdentifier	 k
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
word	TokenNameIdentifier	 word
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
<	TokenNameLESS	
4	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
endsIn	TokenNameIdentifier	 ends In
(	TokenNameLPAREN	
'a'	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
'l'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
word	TokenNameIdentifier	 word
.	TokenNameDOT	
setLength	TokenNameIdentifier	 set Length
(	TokenNameLPAREN	
j	TokenNameIdentifier	 j
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
k	TokenNameIdentifier	 k
=	TokenNameEQUAL	
j	TokenNameIdentifier	 j
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
lookup	TokenNameIdentifier	 lookup
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
/* try just removing the -al */	TokenNameCOMMENT_BLOCK	 try just removing the -al 
return	TokenNamereturn	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
doubleC	TokenNameIdentifier	 double C
(	TokenNameLPAREN	
j	TokenNameIdentifier	 j
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
/* allow for a doubled consonant */	TokenNameCOMMENT_BLOCK	 allow for a doubled consonant 
word	TokenNameIdentifier	 word
.	TokenNameDOT	
setLength	TokenNameIdentifier	 set Length
(	TokenNameLPAREN	
j	TokenNameIdentifier	 j
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
k	TokenNameIdentifier	 k
=	TokenNameEQUAL	
j	TokenNameIdentifier	 j
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
lookup	TokenNameIdentifier	 lookup
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
word	TokenNameIdentifier	 word
.	TokenNameDOT	
unsafeWrite	TokenNameIdentifier	 unsafe Write
(	TokenNameLPAREN	
word	TokenNameIdentifier	 word
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
j	TokenNameIdentifier	 j
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
word	TokenNameIdentifier	 word
.	TokenNameDOT	
setLength	TokenNameIdentifier	 set Length
(	TokenNameLPAREN	
j	TokenNameIdentifier	 j
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
word	TokenNameIdentifier	 word
.	TokenNameDOT	
unsafeWrite	TokenNameIdentifier	 unsafe Write
(	TokenNameLPAREN	
'e'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/* try removing the -al and adding -e */	TokenNameCOMMENT_BLOCK	 try removing the -al and adding -e 
k	TokenNameIdentifier	 k
=	TokenNameEQUAL	
j	TokenNameIdentifier	 j
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
lookup	TokenNameIdentifier	 lookup
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
word	TokenNameIdentifier	 word
.	TokenNameDOT	
setLength	TokenNameIdentifier	 set Length
(	TokenNameLPAREN	
j	TokenNameIdentifier	 j
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
word	TokenNameIdentifier	 word
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"um"	TokenNameStringLiteral	um
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/* try converting -al to -um */	TokenNameCOMMENT_BLOCK	 try converting -al to -um 
/* (e.g., optimal - > optimum ) */	TokenNameCOMMENT_BLOCK	 (e.g., optimal - > optimum ) 
k	TokenNameIdentifier	 k
=	TokenNameEQUAL	
j	TokenNameIdentifier	 j
+	TokenNamePLUS	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
lookup	TokenNameIdentifier	 lookup
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
word	TokenNameIdentifier	 word
.	TokenNameDOT	
setLength	TokenNameIdentifier	 set Length
(	TokenNameLPAREN	
j	TokenNameIdentifier	 j
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
word	TokenNameIdentifier	 word
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"al"	TokenNameStringLiteral	al
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/* restore the ending to the way it was */	TokenNameCOMMENT_BLOCK	 restore the ending to the way it was 
k	TokenNameIdentifier	 k
=	TokenNameEQUAL	
old_k	TokenNameIdentifier	 old k
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
j	TokenNameIdentifier	 j
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
word	TokenNameIdentifier	 word
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
j	TokenNameIdentifier	 j
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
'i'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
word	TokenNameIdentifier	 word
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
j	TokenNameIdentifier	 j
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
'c'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
word	TokenNameIdentifier	 word
.	TokenNameDOT	
setLength	TokenNameIdentifier	 set Length
(	TokenNameLPAREN	
j	TokenNameIdentifier	 j
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/* try removing -ical */	TokenNameCOMMENT_BLOCK	 try removing -ical 
k	TokenNameIdentifier	 k
=	TokenNameEQUAL	
j	TokenNameIdentifier	 j
-	TokenNameMINUS	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
lookup	TokenNameIdentifier	 lookup
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
word	TokenNameIdentifier	 word
.	TokenNameDOT	
setLength	TokenNameIdentifier	 set Length
(	TokenNameLPAREN	
j	TokenNameIdentifier	 j
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
word	TokenNameIdentifier	 word
.	TokenNameDOT	
unsafeWrite	TokenNameIdentifier	 unsafe Write
(	TokenNameLPAREN	
'y'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/* try turning -ical to -y (e.g., bibliographical) */	TokenNameCOMMENT_BLOCK	 try turning -ical to -y (e.g., bibliographical) 
k	TokenNameIdentifier	 k
=	TokenNameEQUAL	
j	TokenNameIdentifier	 j
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
lookup	TokenNameIdentifier	 lookup
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
word	TokenNameIdentifier	 word
.	TokenNameDOT	
setLength	TokenNameIdentifier	 set Length
(	TokenNameLPAREN	
j	TokenNameIdentifier	 j
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
word	TokenNameIdentifier	 word
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"ic"	TokenNameStringLiteral	ic
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/* the default is to convert -ical to -ic */	TokenNameCOMMENT_BLOCK	 the default is to convert -ical to -ic 
k	TokenNameIdentifier	 k
=	TokenNameEQUAL	
j	TokenNameIdentifier	 j
;	TokenNameSEMICOLON	
// nolookup() ... converting ical to ic means removing "al" which we 	TokenNameCOMMENT_LINE	nolookup() ... converting ical to ic means removing "al" which we 
// already tried 	TokenNameCOMMENT_LINE	already tried 
// ERROR 	TokenNameCOMMENT_LINE	ERROR 
lookup	TokenNameIdentifier	 lookup
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
word	TokenNameIdentifier	 word
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
j	TokenNameIdentifier	 j
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
'i'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
/* sometimes -ial endings should be removed */	TokenNameCOMMENT_BLOCK	 sometimes -ial endings should be removed 
word	TokenNameIdentifier	 word
.	TokenNameDOT	
setLength	TokenNameIdentifier	 set Length
(	TokenNameLPAREN	
j	TokenNameIdentifier	 j
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/* (sometimes it gets turned into -y, but we */	TokenNameCOMMENT_BLOCK	 (sometimes it gets turned into -y, but we 
k	TokenNameIdentifier	 k
=	TokenNameEQUAL	
j	TokenNameIdentifier	 j
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/* aren't dealing with that case for now) */	TokenNameCOMMENT_BLOCK	 aren't dealing with that case for now) 
if	TokenNameif	
(	TokenNameLPAREN	
lookup	TokenNameIdentifier	 lookup
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
word	TokenNameIdentifier	 word
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"ial"	TokenNameStringLiteral	ial
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
k	TokenNameIdentifier	 k
=	TokenNameEQUAL	
old_k	TokenNameIdentifier	 old k
;	TokenNameSEMICOLON	
lookup	TokenNameIdentifier	 lookup
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/* * this routine deals with -ive endings. It normalizes some of the -ative * endings directly, and also maps some -ive endings to -ion. */	TokenNameCOMMENT_BLOCK	 this routine deals with -ive endings. It normalizes some of the -ative endings directly, and also maps some -ive endings to -ion. 
private	TokenNameprivate	
void	TokenNamevoid	
iveEndings	TokenNameIdentifier	 ive Endings
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
old_k	TokenNameIdentifier	 old k
=	TokenNameEQUAL	
k	TokenNameIdentifier	 k
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
endsIn	TokenNameIdentifier	 ends In
(	TokenNameLPAREN	
'i'	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
'v'	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
'e'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
word	TokenNameIdentifier	 word
.	TokenNameDOT	
setLength	TokenNameIdentifier	 set Length
(	TokenNameLPAREN	
j	TokenNameIdentifier	 j
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/* try removing -ive entirely */	TokenNameCOMMENT_BLOCK	 try removing -ive entirely 
k	TokenNameIdentifier	 k
=	TokenNameEQUAL	
j	TokenNameIdentifier	 j
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
lookup	TokenNameIdentifier	 lookup
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
word	TokenNameIdentifier	 word
.	TokenNameDOT	
unsafeWrite	TokenNameIdentifier	 unsafe Write
(	TokenNameLPAREN	
'e'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/* try removing -ive and adding -e */	TokenNameCOMMENT_BLOCK	 try removing -ive and adding -e 
k	TokenNameIdentifier	 k
=	TokenNameEQUAL	
j	TokenNameIdentifier	 j
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
lookup	TokenNameIdentifier	 lookup
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
word	TokenNameIdentifier	 word
.	TokenNameDOT	
setLength	TokenNameIdentifier	 set Length
(	TokenNameLPAREN	
j	TokenNameIdentifier	 j
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
word	TokenNameIdentifier	 word
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"ive"	TokenNameStringLiteral	ive
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
j	TokenNameIdentifier	 j
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
word	TokenNameIdentifier	 word
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
j	TokenNameIdentifier	 j
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
'a'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
word	TokenNameIdentifier	 word
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
j	TokenNameIdentifier	 j
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
't'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
word	TokenNameIdentifier	 word
.	TokenNameDOT	
setCharAt	TokenNameIdentifier	 set Char At
(	TokenNameLPAREN	
j	TokenNameIdentifier	 j
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
'e'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/* try removing -ative and adding -e */	TokenNameCOMMENT_BLOCK	 try removing -ative and adding -e 
word	TokenNameIdentifier	 word
.	TokenNameDOT	
setLength	TokenNameIdentifier	 set Length
(	TokenNameLPAREN	
j	TokenNameIdentifier	 j
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/* (e.g., determinative -> determine) */	TokenNameCOMMENT_BLOCK	 (e.g., determinative -> determine) 
k	TokenNameIdentifier	 k
=	TokenNameEQUAL	
j	TokenNameIdentifier	 j
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
lookup	TokenNameIdentifier	 lookup
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
word	TokenNameIdentifier	 word
.	TokenNameDOT	
setLength	TokenNameIdentifier	 set Length
(	TokenNameLPAREN	
j	TokenNameIdentifier	 j
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/* try just removing -ative */	TokenNameCOMMENT_BLOCK	 try just removing -ative 
if	TokenNameif	
(	TokenNameLPAREN	
lookup	TokenNameIdentifier	 lookup
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
word	TokenNameIdentifier	 word
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"ative"	TokenNameStringLiteral	ative
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
k	TokenNameIdentifier	 k
=	TokenNameEQUAL	
old_k	TokenNameIdentifier	 old k
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/* try mapping -ive to -ion (e.g., injunctive/injunction) */	TokenNameCOMMENT_BLOCK	 try mapping -ive to -ion (e.g., injunctive/injunction) 
word	TokenNameIdentifier	 word
.	TokenNameDOT	
setCharAt	TokenNameIdentifier	 set Char At
(	TokenNameLPAREN	
j	TokenNameIdentifier	 j
+	TokenNamePLUS	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
'o'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
word	TokenNameIdentifier	 word
.	TokenNameDOT	
setCharAt	TokenNameIdentifier	 set Char At
(	TokenNameLPAREN	
j	TokenNameIdentifier	 j
+	TokenNamePLUS	
3	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
'n'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
lookup	TokenNameIdentifier	 lookup
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
word	TokenNameIdentifier	 word
.	TokenNameDOT	
setCharAt	TokenNameIdentifier	 set Char At
(	TokenNameLPAREN	
j	TokenNameIdentifier	 j
+	TokenNamePLUS	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
'v'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/* restore the original values */	TokenNameCOMMENT_BLOCK	 restore the original values 
word	TokenNameIdentifier	 word
.	TokenNameDOT	
setCharAt	TokenNameIdentifier	 set Char At
(	TokenNameLPAREN	
j	TokenNameIdentifier	 j
+	TokenNamePLUS	
3	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
'e'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
k	TokenNameIdentifier	 k
=	TokenNameEQUAL	
old_k	TokenNameIdentifier	 old k
;	TokenNameSEMICOLON	
// nolookup() 	TokenNameCOMMENT_LINE	nolookup() 
}	TokenNameRBRACE	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
KStemmer	TokenNameIdentifier	 K Stemmer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
String	TokenNameIdentifier	 String
stem	TokenNameIdentifier	 stem
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
term	TokenNameIdentifier	 term
)	TokenNameRPAREN	
{	TokenNameLBRACE	
boolean	TokenNameboolean	
changed	TokenNameIdentifier	 changed
=	TokenNameEQUAL	
stem	TokenNameIdentifier	 stem
(	TokenNameLPAREN	
term	TokenNameIdentifier	 term
.	TokenNameDOT	
toCharArray	TokenNameIdentifier	 to Char Array
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
term	TokenNameIdentifier	 term
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
changed	TokenNameIdentifier	 changed
)	TokenNameRPAREN	
return	TokenNamereturn	
term	TokenNameIdentifier	 term
;	TokenNameSEMICOLON	
return	TokenNamereturn	
asString	TokenNameIdentifier	 as String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the result of the stem (assuming the word was changed) as a String. */	TokenNameCOMMENT_JAVADOC	 Returns the result of the stem (assuming the word was changed) as a String. 
String	TokenNameIdentifier	 String
asString	TokenNameIdentifier	 as String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
s	TokenNameIdentifier	 s
=	TokenNameEQUAL	
getString	TokenNameIdentifier	 get String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
return	TokenNamereturn	
s	TokenNameIdentifier	 s
;	TokenNameSEMICOLON	
return	TokenNamereturn	
word	TokenNameIdentifier	 word
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
CharSequence	TokenNameIdentifier	 Char Sequence
asCharSequence	TokenNameIdentifier	 as Char Sequence
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
result	TokenNameIdentifier	 result
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
?	TokenNameQUESTION	
result	TokenNameIdentifier	 result
:	TokenNameCOLON	
word	TokenNameIdentifier	 word
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
String	TokenNameIdentifier	 String
getString	TokenNameIdentifier	 get String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
result	TokenNameIdentifier	 result
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
getChars	TokenNameIdentifier	 get Chars
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
word	TokenNameIdentifier	 word
.	TokenNameDOT	
getArray	TokenNameIdentifier	 get Array
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
int	TokenNameint	
getLength	TokenNameIdentifier	 get Length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
word	TokenNameIdentifier	 word
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
String	TokenNameIdentifier	 String
result	TokenNameIdentifier	 result
;	TokenNameSEMICOLON	
private	TokenNameprivate	
boolean	TokenNameboolean	
matched	TokenNameIdentifier	 matched
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
/*** * if (!lookups.contains(word.toString())) { throw new * RuntimeException("didn't look up "+word.toString()+" prev="+prevLookup); * } ***/	TokenNameCOMMENT_JAVADOC	* if (!lookups.contains(word.toString())) { throw new RuntimeException("didn't look up "+word.toString()+" prev="+prevLookup); } **
// lookup(); 	TokenNameCOMMENT_LINE	lookup(); 
return	TokenNamereturn	
matchedEntry	TokenNameIdentifier	 matched Entry
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Stems the text in the token. Returns true if changed. */	TokenNameCOMMENT_JAVADOC	 Stems the text in the token. Returns true if changed. 
boolean	TokenNameboolean	
stem	TokenNameIdentifier	 stem
(	TokenNameLPAREN	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
term	TokenNameIdentifier	 term
,	TokenNameCOMMA	
int	TokenNameint	
len	TokenNameIdentifier	 len
)	TokenNameRPAREN	
{	TokenNameLBRACE	
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
k	TokenNameIdentifier	 k
=	TokenNameEQUAL	
len	TokenNameIdentifier	 len
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
k	TokenNameIdentifier	 k
<=	TokenNameLESS_EQUAL	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
k	TokenNameIdentifier	 k
>=	TokenNameGREATER_EQUAL	
MaxWordLen	TokenNameIdentifier	 Max Word Len
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
// don't stem 	TokenNameCOMMENT_LINE	don't stem 
}	TokenNameRBRACE	
// first check the stemmer dictionaries, and avoid using the 	TokenNameCOMMENT_LINE	first check the stemmer dictionaries, and avoid using the 
// cache if it's in there. 	TokenNameCOMMENT_LINE	cache if it's in there. 
DictEntry	TokenNameIdentifier	 Dict Entry
entry	TokenNameIdentifier	 entry
=	TokenNameEQUAL	
dict_ht	TokenNameIdentifier	 dict ht
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
term	TokenNameIdentifier	 term
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
len	TokenNameIdentifier	 len
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
entry	TokenNameIdentifier	 entry
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
entry	TokenNameIdentifier	 entry
.	TokenNameDOT	
root	TokenNameIdentifier	 root
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
entry	TokenNameIdentifier	 entry
.	TokenNameDOT	
root	TokenNameIdentifier	 root
;	TokenNameSEMICOLON	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/*** * caching off is normally faster if (cache == null) initializeStemHash(); * * // now check the cache, before we copy chars to "word" if (cache != null) * { String val = cache.get(term, 0, len); if (val != null) { if (val != * SAME) { result = val; return true; } return false; } } ***/	TokenNameCOMMENT_JAVADOC	* caching off is normally faster if (cache == null) initializeStemHash(); * // now check the cache, before we copy chars to "word" if (cache != null) { String val = cache.get(term, 0, len); if (val != null) { if (val != SAME) { result = val; return true; } return false; } } **
word	TokenNameIdentifier	 word
.	TokenNameDOT	
reset	TokenNameIdentifier	 reset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// allocate enough space so that an expansion is never needed 	TokenNameCOMMENT_LINE	allocate enough space so that an expansion is never needed 
word	TokenNameIdentifier	 word
.	TokenNameDOT	
reserve	TokenNameIdentifier	 reserve
(	TokenNameLPAREN	
len	TokenNameIdentifier	 len
+	TokenNamePLUS	
10	TokenNameIntegerLiteral	
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
len	TokenNameIdentifier	 len
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
char	TokenNamechar	
ch	TokenNameIdentifier	 ch
=	TokenNameEQUAL	
term	TokenNameIdentifier	 term
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
isAlpha	TokenNameIdentifier	 is Alpha
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
// don't stem 	TokenNameCOMMENT_LINE	don't stem 
// don't lowercase... it's a requirement that lowercase filter be 	TokenNameCOMMENT_LINE	don't lowercase... it's a requirement that lowercase filter be 
// used before this stemmer. 	TokenNameCOMMENT_LINE	used before this stemmer. 
word	TokenNameIdentifier	 word
.	TokenNameDOT	
unsafeWrite	TokenNameIdentifier	 unsafe Write
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
matchedEntry	TokenNameIdentifier	 matched Entry
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
/*** * lookups.clear(); lookups.add(word.toString()); ***/	TokenNameCOMMENT_JAVADOC	* lookups.clear(); lookups.add(word.toString()); **
/* * This while loop will never be executed more than one time; it is here * only to allow the break statement to be used to escape as soon as a word * is recognized */	TokenNameCOMMENT_BLOCK	 This while loop will never be executed more than one time; it is here only to allow the break statement to be used to escape as soon as a word is recognized 
while	TokenNamewhile	
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// YCS: extra lookup()s were inserted so we don't need to 	TokenNameCOMMENT_LINE	YCS: extra lookup()s were inserted so we don't need to 
// do an extra wordInDict() here. 	TokenNameCOMMENT_LINE	do an extra wordInDict() here. 
plural	TokenNameIdentifier	 plural
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
matched	TokenNameIdentifier	 matched
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
pastTense	TokenNameIdentifier	 past Tense
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
matched	TokenNameIdentifier	 matched
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
aspect	TokenNameIdentifier	 aspect
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
matched	TokenNameIdentifier	 matched
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
ityEndings	TokenNameIdentifier	 ity Endings
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
matched	TokenNameIdentifier	 matched
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
nessEndings	TokenNameIdentifier	 ness Endings
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
matched	TokenNameIdentifier	 matched
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
ionEndings	TokenNameIdentifier	 ion Endings
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
matched	TokenNameIdentifier	 matched
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
erAndOrEndings	TokenNameIdentifier	 er And Or Endings
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
matched	TokenNameIdentifier	 matched
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
lyEndings	TokenNameIdentifier	 ly Endings
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
matched	TokenNameIdentifier	 matched
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
alEndings	TokenNameIdentifier	 al Endings
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
matched	TokenNameIdentifier	 matched
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
entry	TokenNameIdentifier	 entry
=	TokenNameEQUAL	
wordInDict	TokenNameIdentifier	 word In Dict
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
iveEndings	TokenNameIdentifier	 ive Endings
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
matched	TokenNameIdentifier	 matched
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
izeEndings	TokenNameIdentifier	 ize Endings
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
matched	TokenNameIdentifier	 matched
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
mentEndings	TokenNameIdentifier	 ment Endings
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
matched	TokenNameIdentifier	 matched
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
bleEndings	TokenNameIdentifier	 ble Endings
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
matched	TokenNameIdentifier	 matched
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
ismEndings	TokenNameIdentifier	 ism Endings
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
matched	TokenNameIdentifier	 matched
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
icEndings	TokenNameIdentifier	 ic Endings
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
matched	TokenNameIdentifier	 matched
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
ncyEndings	TokenNameIdentifier	 ncy Endings
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
matched	TokenNameIdentifier	 matched
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
nceEndings	TokenNameIdentifier	 nce Endings
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
matched	TokenNameIdentifier	 matched
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/* * try for a direct mapping (allows for cases like `Italian'->`Italy' and * `Italians'->`Italy') */	TokenNameCOMMENT_BLOCK	 try for a direct mapping (allows for cases like `Italian'->`Italy' and `Italians'->`Italy') 
entry	TokenNameIdentifier	 entry
=	TokenNameEQUAL	
matchedEntry	TokenNameIdentifier	 matched Entry
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
entry	TokenNameIdentifier	 entry
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
entry	TokenNameIdentifier	 entry
.	TokenNameDOT	
root	TokenNameIdentifier	 root
;	TokenNameSEMICOLON	
// may be null, which means that "word" is the stem 	TokenNameCOMMENT_LINE	may be null, which means that "word" is the stem 
}	TokenNameRBRACE	
/*** * caching off is normally faster if (cache != null && cache.size() < * maxCacheSize) { char[] key = new char[len]; System.arraycopy(term, 0, * key, 0, len); if (result != null) { cache.put(key, result); } else { * cache.put(key, word.toString()); } } ***/	TokenNameCOMMENT_JAVADOC	* caching off is normally faster if (cache != null && cache.size() < maxCacheSize) { char[] key = new char[len]; System.arraycopy(term, 0, key, 0, len); if (result != null) { cache.put(key, result); } else { cache.put(key, word.toString()); } } **
/*** * if (entry == null) { if (!word.toString().equals(new String(term,0,len))) * { System.out.println("CASE:" + word.toString() + "," + new * String(term,0,len)); * * } } ***/	TokenNameCOMMENT_JAVADOC	* if (entry == null) { if (!word.toString().equals(new String(term,0,len))) { System.out.println("CASE:" + word.toString() + "," + new String(term,0,len)); * } } **
// no entry matched means result is "word" 	TokenNameCOMMENT_LINE	no entry matched means result is "word" 
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
