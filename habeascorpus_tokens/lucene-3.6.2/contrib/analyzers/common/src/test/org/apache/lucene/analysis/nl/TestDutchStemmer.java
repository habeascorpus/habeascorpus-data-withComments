package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
analysis	TokenNameIdentifier	 analysis
.	TokenNameDOT	
nl	TokenNameIdentifier	 nl
;	TokenNameSEMICOLON	
/** * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_JAVADOC	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
File	TokenNameIdentifier	 File
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
IOException	TokenNameIdentifier	 IO Exception
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
BaseTokenStreamTestCase	TokenNameIdentifier	 Base Token Stream Test Case
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
Analyzer	TokenNameIdentifier	 Analyzer
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
CharArraySet	TokenNameIdentifier	 Char Array Set
;	TokenNameSEMICOLON	
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
/** * Test the Dutch Stem Filter, which only modifies the term text. * * The code states that it uses the snowball algorithm, but tests reveal some differences. * */	TokenNameCOMMENT_JAVADOC	 Test the Dutch Stem Filter, which only modifies the term text. * The code states that it uses the snowball algorithm, but tests reveal some differences. 
public	TokenNamepublic	
class	TokenNameclass	
TestDutchStemmer	TokenNameIdentifier	 Test Dutch Stemmer
extends	TokenNameextends	
BaseTokenStreamTestCase	TokenNameIdentifier	 Base Token Stream Test Case
{	TokenNameLBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testWithSnowballExamples	TokenNameIdentifier	 test With Snowball Examples
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
check	TokenNameIdentifier	 check
(	TokenNameLPAREN	
"lichaamsziek"	TokenNameStringLiteral	lichaamsziek
,	TokenNameCOMMA	
"lichaamsziek"	TokenNameStringLiteral	lichaamsziek
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
check	TokenNameIdentifier	 check
(	TokenNameLPAREN	
"lichamelijk"	TokenNameStringLiteral	lichamelijk
,	TokenNameCOMMA	
"licham"	TokenNameStringLiteral	licham
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
check	TokenNameIdentifier	 check
(	TokenNameLPAREN	
"lichamelijke"	TokenNameStringLiteral	lichamelijke
,	TokenNameCOMMA	
"licham"	TokenNameStringLiteral	licham
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
check	TokenNameIdentifier	 check
(	TokenNameLPAREN	
"lichamelijkheden"	TokenNameStringLiteral	lichamelijkheden
,	TokenNameCOMMA	
"licham"	TokenNameStringLiteral	licham
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
check	TokenNameIdentifier	 check
(	TokenNameLPAREN	
"lichamen"	TokenNameStringLiteral	lichamen
,	TokenNameCOMMA	
"licham"	TokenNameStringLiteral	licham
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
check	TokenNameIdentifier	 check
(	TokenNameLPAREN	
"lichere"	TokenNameStringLiteral	lichere
,	TokenNameCOMMA	
"licher"	TokenNameStringLiteral	licher
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
check	TokenNameIdentifier	 check
(	TokenNameLPAREN	
"licht"	TokenNameStringLiteral	licht
,	TokenNameCOMMA	
"licht"	TokenNameStringLiteral	licht
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
check	TokenNameIdentifier	 check
(	TokenNameLPAREN	
"lichtbeeld"	TokenNameStringLiteral	lichtbeeld
,	TokenNameCOMMA	
"lichtbeeld"	TokenNameStringLiteral	lichtbeeld
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
check	TokenNameIdentifier	 check
(	TokenNameLPAREN	
"lichtbruin"	TokenNameStringLiteral	lichtbruin
,	TokenNameCOMMA	
"lichtbruin"	TokenNameStringLiteral	lichtbruin
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
check	TokenNameIdentifier	 check
(	TokenNameLPAREN	
"lichtdoorlatende"	TokenNameStringLiteral	lichtdoorlatende
,	TokenNameCOMMA	
"lichtdoorlat"	TokenNameStringLiteral	lichtdoorlat
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
check	TokenNameIdentifier	 check
(	TokenNameLPAREN	
"lichte"	TokenNameStringLiteral	lichte
,	TokenNameCOMMA	
"licht"	TokenNameStringLiteral	licht
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
check	TokenNameIdentifier	 check
(	TokenNameLPAREN	
"lichten"	TokenNameStringLiteral	lichten
,	TokenNameCOMMA	
"licht"	TokenNameStringLiteral	licht
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
check	TokenNameIdentifier	 check
(	TokenNameLPAREN	
"lichtende"	TokenNameStringLiteral	lichtende
,	TokenNameCOMMA	
"lichtend"	TokenNameStringLiteral	lichtend
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
check	TokenNameIdentifier	 check
(	TokenNameLPAREN	
"lichtenvoorde"	TokenNameStringLiteral	lichtenvoorde
,	TokenNameCOMMA	
"lichtenvoord"	TokenNameStringLiteral	lichtenvoord
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
check	TokenNameIdentifier	 check
(	TokenNameLPAREN	
"lichter"	TokenNameStringLiteral	lichter
,	TokenNameCOMMA	
"lichter"	TokenNameStringLiteral	lichter
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
check	TokenNameIdentifier	 check
(	TokenNameLPAREN	
"lichtere"	TokenNameStringLiteral	lichtere
,	TokenNameCOMMA	
"lichter"	TokenNameStringLiteral	lichter
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
check	TokenNameIdentifier	 check
(	TokenNameLPAREN	
"lichters"	TokenNameStringLiteral	lichters
,	TokenNameCOMMA	
"lichter"	TokenNameStringLiteral	lichter
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
check	TokenNameIdentifier	 check
(	TokenNameLPAREN	
"lichtgevoeligheid"	TokenNameStringLiteral	lichtgevoeligheid
,	TokenNameCOMMA	
"lichtgevoel"	TokenNameStringLiteral	lichtgevoel
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
check	TokenNameIdentifier	 check
(	TokenNameLPAREN	
"lichtgewicht"	TokenNameStringLiteral	lichtgewicht
,	TokenNameCOMMA	
"lichtgewicht"	TokenNameStringLiteral	lichtgewicht
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
check	TokenNameIdentifier	 check
(	TokenNameLPAREN	
"lichtgrijs"	TokenNameStringLiteral	lichtgrijs
,	TokenNameCOMMA	
"lichtgrijs"	TokenNameStringLiteral	lichtgrijs
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
check	TokenNameIdentifier	 check
(	TokenNameLPAREN	
"lichthoeveelheid"	TokenNameStringLiteral	lichthoeveelheid
,	TokenNameCOMMA	
"lichthoevel"	TokenNameStringLiteral	lichthoevel
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
check	TokenNameIdentifier	 check
(	TokenNameLPAREN	
"lichtintensiteit"	TokenNameStringLiteral	lichtintensiteit
,	TokenNameCOMMA	
"lichtintensiteit"	TokenNameStringLiteral	lichtintensiteit
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
check	TokenNameIdentifier	 check
(	TokenNameLPAREN	
"lichtje"	TokenNameStringLiteral	lichtje
,	TokenNameCOMMA	
"lichtj"	TokenNameStringLiteral	lichtj
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
check	TokenNameIdentifier	 check
(	TokenNameLPAREN	
"lichtjes"	TokenNameStringLiteral	lichtjes
,	TokenNameCOMMA	
"lichtjes"	TokenNameStringLiteral	lichtjes
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
check	TokenNameIdentifier	 check
(	TokenNameLPAREN	
"lichtkranten"	TokenNameStringLiteral	lichtkranten
,	TokenNameCOMMA	
"lichtkrant"	TokenNameStringLiteral	lichtkrant
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
check	TokenNameIdentifier	 check
(	TokenNameLPAREN	
"lichtkring"	TokenNameStringLiteral	lichtkring
,	TokenNameCOMMA	
"lichtkring"	TokenNameStringLiteral	lichtkring
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
check	TokenNameIdentifier	 check
(	TokenNameLPAREN	
"lichtkringen"	TokenNameStringLiteral	lichtkringen
,	TokenNameCOMMA	
"lichtkring"	TokenNameStringLiteral	lichtkring
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
check	TokenNameIdentifier	 check
(	TokenNameLPAREN	
"lichtregelsystemen"	TokenNameStringLiteral	lichtregelsystemen
,	TokenNameCOMMA	
"lichtregelsystem"	TokenNameStringLiteral	lichtregelsystem
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
check	TokenNameIdentifier	 check
(	TokenNameLPAREN	
"lichtste"	TokenNameStringLiteral	lichtste
,	TokenNameCOMMA	
"lichtst"	TokenNameStringLiteral	lichtst
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
check	TokenNameIdentifier	 check
(	TokenNameLPAREN	
"lichtstromende"	TokenNameStringLiteral	lichtstromende
,	TokenNameCOMMA	
"lichtstrom"	TokenNameStringLiteral	lichtstrom
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
check	TokenNameIdentifier	 check
(	TokenNameLPAREN	
"lichtte"	TokenNameStringLiteral	lichtte
,	TokenNameCOMMA	
"licht"	TokenNameStringLiteral	licht
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
check	TokenNameIdentifier	 check
(	TokenNameLPAREN	
"lichtten"	TokenNameStringLiteral	lichtten
,	TokenNameCOMMA	
"licht"	TokenNameStringLiteral	licht
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
check	TokenNameIdentifier	 check
(	TokenNameLPAREN	
"lichttoetreding"	TokenNameStringLiteral	lichttoetreding
,	TokenNameCOMMA	
"lichttoetred"	TokenNameStringLiteral	lichttoetred
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
check	TokenNameIdentifier	 check
(	TokenNameLPAREN	
"lichtverontreinigde"	TokenNameStringLiteral	lichtverontreinigde
,	TokenNameCOMMA	
"lichtverontreinigd"	TokenNameStringLiteral	lichtverontreinigd
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
check	TokenNameIdentifier	 check
(	TokenNameLPAREN	
"lichtzinnige"	TokenNameStringLiteral	lichtzinnige
,	TokenNameCOMMA	
"lichtzinn"	TokenNameStringLiteral	lichtzinn
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
check	TokenNameIdentifier	 check
(	TokenNameLPAREN	
"lid"	TokenNameStringLiteral	lid
,	TokenNameCOMMA	
"lid"	TokenNameStringLiteral	lid
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
check	TokenNameIdentifier	 check
(	TokenNameLPAREN	
"lidia"	TokenNameStringLiteral	lidia
,	TokenNameCOMMA	
"lidia"	TokenNameStringLiteral	lidia
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
check	TokenNameIdentifier	 check
(	TokenNameLPAREN	
"lidmaatschap"	TokenNameStringLiteral	lidmaatschap
,	TokenNameCOMMA	
"lidmaatschap"	TokenNameStringLiteral	lidmaatschap
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
check	TokenNameIdentifier	 check
(	TokenNameLPAREN	
"lidstaten"	TokenNameStringLiteral	lidstaten
,	TokenNameCOMMA	
"lidstat"	TokenNameStringLiteral	lidstat
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
check	TokenNameIdentifier	 check
(	TokenNameLPAREN	
"lidvereniging"	TokenNameStringLiteral	lidvereniging
,	TokenNameCOMMA	
"lidveren"	TokenNameStringLiteral	lidveren
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
check	TokenNameIdentifier	 check
(	TokenNameLPAREN	
"opgingen"	TokenNameStringLiteral	opgingen
,	TokenNameCOMMA	
"opging"	TokenNameStringLiteral	opging
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
check	TokenNameIdentifier	 check
(	TokenNameLPAREN	
"opglanzing"	TokenNameStringLiteral	opglanzing
,	TokenNameCOMMA	
"opglanz"	TokenNameStringLiteral	opglanz
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
check	TokenNameIdentifier	 check
(	TokenNameLPAREN	
"opglanzingen"	TokenNameStringLiteral	opglanzingen
,	TokenNameCOMMA	
"opglanz"	TokenNameStringLiteral	opglanz
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
check	TokenNameIdentifier	 check
(	TokenNameLPAREN	
"opglimlachten"	TokenNameStringLiteral	opglimlachten
,	TokenNameCOMMA	
"opglimlacht"	TokenNameStringLiteral	opglimlacht
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
check	TokenNameIdentifier	 check
(	TokenNameLPAREN	
"opglimpen"	TokenNameStringLiteral	opglimpen
,	TokenNameCOMMA	
"opglimp"	TokenNameStringLiteral	opglimp
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
check	TokenNameIdentifier	 check
(	TokenNameLPAREN	
"opglimpende"	TokenNameStringLiteral	opglimpende
,	TokenNameCOMMA	
"opglimp"	TokenNameStringLiteral	opglimp
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
check	TokenNameIdentifier	 check
(	TokenNameLPAREN	
"opglimping"	TokenNameStringLiteral	opglimping
,	TokenNameCOMMA	
"opglimp"	TokenNameStringLiteral	opglimp
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
check	TokenNameIdentifier	 check
(	TokenNameLPAREN	
"opglimpingen"	TokenNameStringLiteral	opglimpingen
,	TokenNameCOMMA	
"opglimp"	TokenNameStringLiteral	opglimp
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
check	TokenNameIdentifier	 check
(	TokenNameLPAREN	
"opgraven"	TokenNameStringLiteral	opgraven
,	TokenNameCOMMA	
"opgrav"	TokenNameStringLiteral	opgrav
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
check	TokenNameIdentifier	 check
(	TokenNameLPAREN	
"opgrijnzen"	TokenNameStringLiteral	opgrijnzen
,	TokenNameCOMMA	
"opgrijnz"	TokenNameStringLiteral	opgrijnz
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
check	TokenNameIdentifier	 check
(	TokenNameLPAREN	
"opgrijzende"	TokenNameStringLiteral	opgrijzende
,	TokenNameCOMMA	
"opgrijz"	TokenNameStringLiteral	opgrijz
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
check	TokenNameIdentifier	 check
(	TokenNameLPAREN	
"opgroeien"	TokenNameStringLiteral	opgroeien
,	TokenNameCOMMA	
"opgroei"	TokenNameStringLiteral	opgroei
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
check	TokenNameIdentifier	 check
(	TokenNameLPAREN	
"opgroeiende"	TokenNameStringLiteral	opgroeiende
,	TokenNameCOMMA	
"opgroei"	TokenNameStringLiteral	opgroei
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
check	TokenNameIdentifier	 check
(	TokenNameLPAREN	
"opgroeiplaats"	TokenNameStringLiteral	opgroeiplaats
,	TokenNameCOMMA	
"opgroeiplat"	TokenNameStringLiteral	opgroeiplat
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
check	TokenNameIdentifier	 check
(	TokenNameLPAREN	
"ophaal"	TokenNameStringLiteral	ophaal
,	TokenNameCOMMA	
"ophal"	TokenNameStringLiteral	ophal
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
check	TokenNameIdentifier	 check
(	TokenNameLPAREN	
"ophaaldienst"	TokenNameStringLiteral	ophaaldienst
,	TokenNameCOMMA	
"ophaaldienst"	TokenNameStringLiteral	ophaaldienst
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
check	TokenNameIdentifier	 check
(	TokenNameLPAREN	
"ophaalkosten"	TokenNameStringLiteral	ophaalkosten
,	TokenNameCOMMA	
"ophaalkost"	TokenNameStringLiteral	ophaalkost
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
check	TokenNameIdentifier	 check
(	TokenNameLPAREN	
"ophaalsystemen"	TokenNameStringLiteral	ophaalsystemen
,	TokenNameCOMMA	
"ophaalsystem"	TokenNameStringLiteral	ophaalsystem
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
check	TokenNameIdentifier	 check
(	TokenNameLPAREN	
"ophaalt"	TokenNameStringLiteral	ophaalt
,	TokenNameCOMMA	
"ophaalt"	TokenNameStringLiteral	ophaalt
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
check	TokenNameIdentifier	 check
(	TokenNameLPAREN	
"ophaaltruck"	TokenNameStringLiteral	ophaaltruck
,	TokenNameCOMMA	
"ophaaltruck"	TokenNameStringLiteral	ophaaltruck
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
check	TokenNameIdentifier	 check
(	TokenNameLPAREN	
"ophalen"	TokenNameStringLiteral	ophalen
,	TokenNameCOMMA	
"ophal"	TokenNameStringLiteral	ophal
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
check	TokenNameIdentifier	 check
(	TokenNameLPAREN	
"ophalend"	TokenNameStringLiteral	ophalend
,	TokenNameCOMMA	
"ophal"	TokenNameStringLiteral	ophal
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
check	TokenNameIdentifier	 check
(	TokenNameLPAREN	
"ophalers"	TokenNameStringLiteral	ophalers
,	TokenNameCOMMA	
"ophaler"	TokenNameStringLiteral	ophaler
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
check	TokenNameIdentifier	 check
(	TokenNameLPAREN	
"ophef"	TokenNameStringLiteral	ophef
,	TokenNameCOMMA	
"ophef"	TokenNameStringLiteral	ophef
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
check	TokenNameIdentifier	 check
(	TokenNameLPAREN	
"opheldering"	TokenNameStringLiteral	opheldering
,	TokenNameCOMMA	
"ophelder"	TokenNameStringLiteral	ophelder
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
check	TokenNameIdentifier	 check
(	TokenNameLPAREN	
"ophemelde"	TokenNameStringLiteral	ophemelde
,	TokenNameCOMMA	
"ophemeld"	TokenNameStringLiteral	ophemeld
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
check	TokenNameIdentifier	 check
(	TokenNameLPAREN	
"ophemelen"	TokenNameStringLiteral	ophemelen
,	TokenNameCOMMA	
"ophemel"	TokenNameStringLiteral	ophemel
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
check	TokenNameIdentifier	 check
(	TokenNameLPAREN	
"opheusden"	TokenNameStringLiteral	opheusden
,	TokenNameCOMMA	
"opheusd"	TokenNameStringLiteral	opheusd
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
check	TokenNameIdentifier	 check
(	TokenNameLPAREN	
"ophief"	TokenNameStringLiteral	ophief
,	TokenNameCOMMA	
"ophief"	TokenNameStringLiteral	ophief
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
check	TokenNameIdentifier	 check
(	TokenNameLPAREN	
"ophield"	TokenNameStringLiteral	ophield
,	TokenNameCOMMA	
"ophield"	TokenNameStringLiteral	ophield
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
check	TokenNameIdentifier	 check
(	TokenNameLPAREN	
"ophieven"	TokenNameStringLiteral	ophieven
,	TokenNameCOMMA	
"ophiev"	TokenNameStringLiteral	ophiev
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
check	TokenNameIdentifier	 check
(	TokenNameLPAREN	
"ophoepelt"	TokenNameStringLiteral	ophoepelt
,	TokenNameCOMMA	
"ophoepelt"	TokenNameStringLiteral	ophoepelt
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
check	TokenNameIdentifier	 check
(	TokenNameLPAREN	
"ophoog"	TokenNameStringLiteral	ophoog
,	TokenNameCOMMA	
"ophog"	TokenNameStringLiteral	ophog
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
check	TokenNameIdentifier	 check
(	TokenNameLPAREN	
"ophoogzand"	TokenNameStringLiteral	ophoogzand
,	TokenNameCOMMA	
"ophoogzand"	TokenNameStringLiteral	ophoogzand
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
check	TokenNameIdentifier	 check
(	TokenNameLPAREN	
"ophopen"	TokenNameStringLiteral	ophopen
,	TokenNameCOMMA	
"ophop"	TokenNameStringLiteral	ophop
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
check	TokenNameIdentifier	 check
(	TokenNameLPAREN	
"ophoping"	TokenNameStringLiteral	ophoping
,	TokenNameCOMMA	
"ophop"	TokenNameStringLiteral	ophop
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
check	TokenNameIdentifier	 check
(	TokenNameLPAREN	
"ophouden"	TokenNameStringLiteral	ophouden
,	TokenNameCOMMA	
"ophoud"	TokenNameStringLiteral	ophoud
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @deprecated remove this test in Lucene 4.0 */	TokenNameCOMMENT_JAVADOC	 @deprecated remove this test in Lucene 4.0 
@	TokenNameAT	
Deprecated	TokenNameIdentifier	 Deprecated
public	TokenNamepublic	
void	TokenNamevoid	
testOldBuggyStemmer	TokenNameIdentifier	 test Old Buggy Stemmer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
Analyzer	TokenNameIdentifier	 Analyzer
a	TokenNameIdentifier	 a
=	TokenNameEQUAL	
new	TokenNamenew	
DutchAnalyzer	TokenNameIdentifier	 Dutch Analyzer
(	TokenNameLPAREN	
Version	TokenNameIdentifier	 Version
.	TokenNameDOT	
LUCENE_30	TokenNameIdentifier	 LUCENE 30
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkOneTermReuse	TokenNameIdentifier	 check One Term Reuse
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"opheffen"	TokenNameStringLiteral	opheffen
,	TokenNameCOMMA	
"ophef"	TokenNameStringLiteral	ophef
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// versus snowball 'opheff' 	TokenNameCOMMENT_LINE	versus snowball 'opheff' 
checkOneTermReuse	TokenNameIdentifier	 check One Term Reuse
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"opheffende"	TokenNameStringLiteral	opheffende
,	TokenNameCOMMA	
"ophef"	TokenNameStringLiteral	ophef
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// versus snowball 'opheff' 	TokenNameCOMMENT_LINE	versus snowball 'opheff' 
checkOneTermReuse	TokenNameIdentifier	 check One Term Reuse
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"opheffing"	TokenNameStringLiteral	opheffing
,	TokenNameCOMMA	
"ophef"	TokenNameStringLiteral	ophef
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// versus snowball 'opheff' 	TokenNameCOMMENT_LINE	versus snowball 'opheff' 
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testSnowballCorrectness	TokenNameIdentifier	 test Snowball Correctness
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
Analyzer	TokenNameIdentifier	 Analyzer
a	TokenNameIdentifier	 a
=	TokenNameEQUAL	
new	TokenNamenew	
DutchAnalyzer	TokenNameIdentifier	 Dutch Analyzer
(	TokenNameLPAREN	
TEST_VERSION_CURRENT	TokenNameIdentifier	 TEST  VERSION  CURRENT
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkOneTermReuse	TokenNameIdentifier	 check One Term Reuse
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"opheffen"	TokenNameStringLiteral	opheffen
,	TokenNameCOMMA	
"opheff"	TokenNameStringLiteral	opheff
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkOneTermReuse	TokenNameIdentifier	 check One Term Reuse
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"opheffende"	TokenNameStringLiteral	opheffende
,	TokenNameCOMMA	
"opheff"	TokenNameStringLiteral	opheff
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkOneTermReuse	TokenNameIdentifier	 check One Term Reuse
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"opheffing"	TokenNameStringLiteral	opheffing
,	TokenNameCOMMA	
"opheff"	TokenNameStringLiteral	opheff
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testReusableTokenStream	TokenNameIdentifier	 test Reusable Token Stream
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
Analyzer	TokenNameIdentifier	 Analyzer
a	TokenNameIdentifier	 a
=	TokenNameEQUAL	
new	TokenNamenew	
DutchAnalyzer	TokenNameIdentifier	 Dutch Analyzer
(	TokenNameLPAREN	
TEST_VERSION_CURRENT	TokenNameIdentifier	 TEST  VERSION  CURRENT
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkOneTermReuse	TokenNameIdentifier	 check One Term Reuse
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"lichaamsziek"	TokenNameStringLiteral	lichaamsziek
,	TokenNameCOMMA	
"lichaamsziek"	TokenNameStringLiteral	lichaamsziek
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkOneTermReuse	TokenNameIdentifier	 check One Term Reuse
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"lichamelijk"	TokenNameStringLiteral	lichamelijk
,	TokenNameCOMMA	
"licham"	TokenNameStringLiteral	licham
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkOneTermReuse	TokenNameIdentifier	 check One Term Reuse
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"lichamelijke"	TokenNameStringLiteral	lichamelijke
,	TokenNameCOMMA	
"licham"	TokenNameStringLiteral	licham
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkOneTermReuse	TokenNameIdentifier	 check One Term Reuse
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"lichamelijkheden"	TokenNameStringLiteral	lichamelijkheden
,	TokenNameCOMMA	
"licham"	TokenNameStringLiteral	licham
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/* * Test that changes to the exclusion table are applied immediately * when using reusable token streams. */	TokenNameCOMMENT_BLOCK	 Test that changes to the exclusion table are applied immediately when using reusable token streams. 
public	TokenNamepublic	
void	TokenNamevoid	
testExclusionTableReuse	TokenNameIdentifier	 test Exclusion Table Reuse
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
DutchAnalyzer	TokenNameIdentifier	 Dutch Analyzer
a	TokenNameIdentifier	 a
=	TokenNameEQUAL	
new	TokenNamenew	
DutchAnalyzer	TokenNameIdentifier	 Dutch Analyzer
(	TokenNameLPAREN	
TEST_VERSION_CURRENT	TokenNameIdentifier	 TEST  VERSION  CURRENT
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkOneTermReuse	TokenNameIdentifier	 check One Term Reuse
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"lichamelijk"	TokenNameStringLiteral	lichamelijk
,	TokenNameCOMMA	
"licham"	TokenNameStringLiteral	licham
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
a	TokenNameIdentifier	 a
.	TokenNameDOT	
setStemExclusionTable	TokenNameIdentifier	 set Stem Exclusion Table
(	TokenNameLPAREN	
"lichamelijk"	TokenNameStringLiteral	lichamelijk
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkOneTermReuse	TokenNameIdentifier	 check One Term Reuse
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"lichamelijk"	TokenNameStringLiteral	lichamelijk
,	TokenNameCOMMA	
"lichamelijk"	TokenNameStringLiteral	lichamelijk
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testExclusionTableViaCtor	TokenNameIdentifier	 test Exclusion Table Via Ctor
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
CharArraySet	TokenNameIdentifier	 Char Array Set
set	TokenNameIdentifier	 set
=	TokenNameEQUAL	
new	TokenNamenew	
CharArraySet	TokenNameIdentifier	 Char Array Set
(	TokenNameLPAREN	
Version	TokenNameIdentifier	 Version
.	TokenNameDOT	
LUCENE_30	TokenNameIdentifier	 LUCENE 30
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
set	TokenNameIdentifier	 set
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
"lichamelijk"	TokenNameStringLiteral	lichamelijk
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
DutchAnalyzer	TokenNameIdentifier	 Dutch Analyzer
a	TokenNameIdentifier	 a
=	TokenNameEQUAL	
new	TokenNamenew	
DutchAnalyzer	TokenNameIdentifier	 Dutch Analyzer
(	TokenNameLPAREN	
TEST_VERSION_CURRENT	TokenNameIdentifier	 TEST  VERSION  CURRENT
,	TokenNameCOMMA	
CharArraySet	TokenNameIdentifier	 Char Array Set
.	TokenNameDOT	
EMPTY_SET	TokenNameIdentifier	 EMPTY  SET
,	TokenNameCOMMA	
set	TokenNameIdentifier	 set
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertAnalyzesToReuse	TokenNameIdentifier	 assert Analyzes To Reuse
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"lichamelijk lichamelijke"	TokenNameStringLiteral	lichamelijk lichamelijke
,	TokenNameCOMMA	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"lichamelijk"	TokenNameStringLiteral	lichamelijk
,	TokenNameCOMMA	
"licham"	TokenNameStringLiteral	licham
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
a	TokenNameIdentifier	 a
=	TokenNameEQUAL	
new	TokenNamenew	
DutchAnalyzer	TokenNameIdentifier	 Dutch Analyzer
(	TokenNameLPAREN	
TEST_VERSION_CURRENT	TokenNameIdentifier	 TEST  VERSION  CURRENT
,	TokenNameCOMMA	
CharArraySet	TokenNameIdentifier	 Char Array Set
.	TokenNameDOT	
EMPTY_SET	TokenNameIdentifier	 EMPTY  SET
,	TokenNameCOMMA	
set	TokenNameIdentifier	 set
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertAnalyzesTo	TokenNameIdentifier	 assert Analyzes To
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"lichamelijk lichamelijke"	TokenNameStringLiteral	lichamelijk lichamelijke
,	TokenNameCOMMA	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"lichamelijk"	TokenNameStringLiteral	lichamelijk
,	TokenNameCOMMA	
"licham"	TokenNameStringLiteral	licham
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/* * Test that changes to the dictionary stemming table are applied immediately * when using reusable token streams. */	TokenNameCOMMENT_BLOCK	 Test that changes to the dictionary stemming table are applied immediately when using reusable token streams. 
public	TokenNamepublic	
void	TokenNamevoid	
testStemDictionaryReuse	TokenNameIdentifier	 test Stem Dictionary Reuse
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
DutchAnalyzer	TokenNameIdentifier	 Dutch Analyzer
a	TokenNameIdentifier	 a
=	TokenNameEQUAL	
new	TokenNamenew	
DutchAnalyzer	TokenNameIdentifier	 Dutch Analyzer
(	TokenNameLPAREN	
TEST_VERSION_CURRENT	TokenNameIdentifier	 TEST  VERSION  CURRENT
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkOneTermReuse	TokenNameIdentifier	 check One Term Reuse
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"lichamelijk"	TokenNameStringLiteral	lichamelijk
,	TokenNameCOMMA	
"licham"	TokenNameStringLiteral	licham
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
File	TokenNameIdentifier	 File
customDictFile	TokenNameIdentifier	 custom Dict File
=	TokenNameEQUAL	
getDataFile	TokenNameIdentifier	 get Data File
(	TokenNameLPAREN	
"customStemDict.txt"	TokenNameStringLiteral	customStemDict.txt
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
a	TokenNameIdentifier	 a
.	TokenNameDOT	
setStemDictionary	TokenNameIdentifier	 set Stem Dictionary
(	TokenNameLPAREN	
customDictFile	TokenNameIdentifier	 custom Dict File
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkOneTermReuse	TokenNameIdentifier	 check One Term Reuse
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"lichamelijk"	TokenNameStringLiteral	lichamelijk
,	TokenNameCOMMA	
"somethingentirelydifferent"	TokenNameStringLiteral	somethingentirelydifferent
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * check that the default stem overrides are used * even if you use a non-default ctor. */	TokenNameCOMMENT_JAVADOC	 check that the default stem overrides are used even if you use a non-default ctor. 
public	TokenNamepublic	
void	TokenNamevoid	
testStemOverrides	TokenNameIdentifier	 test Stem Overrides
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
DutchAnalyzer	TokenNameIdentifier	 Dutch Analyzer
a	TokenNameIdentifier	 a
=	TokenNameEQUAL	
new	TokenNamenew	
DutchAnalyzer	TokenNameIdentifier	 Dutch Analyzer
(	TokenNameLPAREN	
TEST_VERSION_CURRENT	TokenNameIdentifier	 TEST  VERSION  CURRENT
,	TokenNameCOMMA	
CharArraySet	TokenNameIdentifier	 Char Array Set
.	TokenNameDOT	
EMPTY_SET	TokenNameIdentifier	 EMPTY  SET
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"fiets"	TokenNameStringLiteral	fiets
,	TokenNameCOMMA	
"fiets"	TokenNameStringLiteral	fiets
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * prior to 3.6, this confusingly did not happen if * you specified your own stoplist!!!! * @deprecated (3.6) Remove this test in Lucene 5.0 */	TokenNameCOMMENT_JAVADOC	 prior to 3.6, this confusingly did not happen if you specified your own stoplist!!!! @deprecated (3.6) Remove this test in Lucene 5.0 
@	TokenNameAT	
Deprecated	TokenNameIdentifier	 Deprecated
public	TokenNamepublic	
void	TokenNamevoid	
testBuggyStemOverrides	TokenNameIdentifier	 test Buggy Stem Overrides
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
DutchAnalyzer	TokenNameIdentifier	 Dutch Analyzer
a	TokenNameIdentifier	 a
=	TokenNameEQUAL	
new	TokenNamenew	
DutchAnalyzer	TokenNameIdentifier	 Dutch Analyzer
(	TokenNameLPAREN	
Version	TokenNameIdentifier	 Version
.	TokenNameDOT	
LUCENE_35	TokenNameIdentifier	 LUCENE 35
,	TokenNameCOMMA	
CharArraySet	TokenNameIdentifier	 Char Array Set
.	TokenNameDOT	
EMPTY_SET	TokenNameIdentifier	 EMPTY  SET
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"fiets"	TokenNameStringLiteral	fiets
,	TokenNameCOMMA	
"fiet"	TokenNameStringLiteral	fiet
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Prior to 3.1, this analyzer had no lowercase filter. * stopwords were case sensitive. Preserve this for back compat. * @deprecated Remove this test in Lucene 4.0 */	TokenNameCOMMENT_JAVADOC	 Prior to 3.1, this analyzer had no lowercase filter. stopwords were case sensitive. Preserve this for back compat. @deprecated Remove this test in Lucene 4.0 
@	TokenNameAT	
Deprecated	TokenNameIdentifier	 Deprecated
public	TokenNamepublic	
void	TokenNamevoid	
testBuggyStopwordsCasing	TokenNameIdentifier	 test Buggy Stopwords Casing
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
DutchAnalyzer	TokenNameIdentifier	 Dutch Analyzer
a	TokenNameIdentifier	 a
=	TokenNameEQUAL	
new	TokenNamenew	
DutchAnalyzer	TokenNameIdentifier	 Dutch Analyzer
(	TokenNameLPAREN	
Version	TokenNameIdentifier	 Version
.	TokenNameDOT	
LUCENE_30	TokenNameIdentifier	 LUCENE 30
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertAnalyzesTo	TokenNameIdentifier	 assert Analyzes To
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"Zelf"	TokenNameStringLiteral	Zelf
,	TokenNameCOMMA	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"zelf"	TokenNameStringLiteral	zelf
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Test that stopwords are not case sensitive */	TokenNameCOMMENT_JAVADOC	 Test that stopwords are not case sensitive 
public	TokenNamepublic	
void	TokenNamevoid	
testStopwordsCasing	TokenNameIdentifier	 test Stopwords Casing
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
DutchAnalyzer	TokenNameIdentifier	 Dutch Analyzer
a	TokenNameIdentifier	 a
=	TokenNameEQUAL	
new	TokenNamenew	
DutchAnalyzer	TokenNameIdentifier	 Dutch Analyzer
(	TokenNameLPAREN	
Version	TokenNameIdentifier	 Version
.	TokenNameDOT	
LUCENE_31	TokenNameIdentifier	 LUCENE 31
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertAnalyzesTo	TokenNameIdentifier	 assert Analyzes To
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"Zelf"	TokenNameStringLiteral	Zelf
,	TokenNameCOMMA	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
void	TokenNamevoid	
check	TokenNameIdentifier	 check
(	TokenNameLPAREN	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
input	TokenNameIdentifier	 input
,	TokenNameCOMMA	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
expected	TokenNameIdentifier	 expected
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
checkOneTerm	TokenNameIdentifier	 check One Term
(	TokenNameLPAREN	
new	TokenNamenew	
DutchAnalyzer	TokenNameIdentifier	 Dutch Analyzer
(	TokenNameLPAREN	
TEST_VERSION_CURRENT	TokenNameIdentifier	 TEST  VERSION  CURRENT
)	TokenNameRPAREN	
,	TokenNameCOMMA	
input	TokenNameIdentifier	 input
,	TokenNameCOMMA	
expected	TokenNameIdentifier	 expected
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** blast some random strings through the analyzer */	TokenNameCOMMENT_JAVADOC	 blast some random strings through the analyzer 
public	TokenNamepublic	
void	TokenNamevoid	
testRandomStrings	TokenNameIdentifier	 test Random Strings
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
checkRandomData	TokenNameIdentifier	 check Random Data
(	TokenNameLPAREN	
random	TokenNameIdentifier	 random
,	TokenNameCOMMA	
new	TokenNamenew	
DutchAnalyzer	TokenNameIdentifier	 Dutch Analyzer
(	TokenNameLPAREN	
TEST_VERSION_CURRENT	TokenNameIdentifier	 TEST  VERSION  CURRENT
)	TokenNameRPAREN	
,	TokenNameCOMMA	
10000	TokenNameIntegerLiteral	
*	TokenNameMULTIPLY	
RANDOM_MULTIPLIER	TokenNameIdentifier	 RANDOM  MULTIPLIER
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
