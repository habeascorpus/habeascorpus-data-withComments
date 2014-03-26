package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
analysis	TokenNameIdentifier	 analysis
.	TokenNameDOT	
ja	TokenNameIdentifier	 ja
.	TokenNameDOT	
util	TokenNameIdentifier	 util
;	TokenNameSEMICOLON	
/** * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_JAVADOC	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
LuceneTestCase	TokenNameIdentifier	 Lucene Test Case
;	TokenNameSEMICOLON	
public	TokenNamepublic	
class	TokenNameclass	
TestToStringUtil	TokenNameIdentifier	 Test To String Util
extends	TokenNameextends	
LuceneTestCase	TokenNameIdentifier	 Lucene Test Case
{	TokenNameLBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testPOS	TokenNameIdentifier	 test POS
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"noun-suffix-verbal"	TokenNameStringLiteral	noun-suffix-verbal
,	TokenNameCOMMA	
ToStringUtil	TokenNameIdentifier	 To String Util
.	TokenNameDOT	
getPOSTranslation	TokenNameIdentifier	 get POS Translation
(	TokenNameLPAREN	
"名詞-接尾-サ変接続"	TokenNameStringLiteral	名詞-接尾-サ変接続
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testHepburn	TokenNameIdentifier	 test Hepburn
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"majan"	TokenNameStringLiteral	majan
,	TokenNameCOMMA	
ToStringUtil	TokenNameIdentifier	 To String Util
.	TokenNameDOT	
getRomanization	TokenNameIdentifier	 get Romanization
(	TokenNameLPAREN	
"マージャン"	TokenNameStringLiteral	マージャン
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"uroncha"	TokenNameStringLiteral	uroncha
,	TokenNameCOMMA	
ToStringUtil	TokenNameIdentifier	 To String Util
.	TokenNameDOT	
getRomanization	TokenNameIdentifier	 get Romanization
(	TokenNameLPAREN	
"ウーロンチャ"	TokenNameStringLiteral	ウーロンチャ
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"chahan"	TokenNameStringLiteral	chahan
,	TokenNameCOMMA	
ToStringUtil	TokenNameIdentifier	 To String Util
.	TokenNameDOT	
getRomanization	TokenNameIdentifier	 get Romanization
(	TokenNameLPAREN	
"チャーハン"	TokenNameStringLiteral	チャーハン
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"chashu"	TokenNameStringLiteral	chashu
,	TokenNameCOMMA	
ToStringUtil	TokenNameIdentifier	 To String Util
.	TokenNameDOT	
getRomanization	TokenNameIdentifier	 get Romanization
(	TokenNameLPAREN	
"チャーシュー"	TokenNameStringLiteral	チャーシュー
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"shumai"	TokenNameStringLiteral	shumai
,	TokenNameCOMMA	
ToStringUtil	TokenNameIdentifier	 To String Util
.	TokenNameDOT	
getRomanization	TokenNameIdentifier	 get Romanization
(	TokenNameLPAREN	
"シューマイ"	TokenNameStringLiteral	シューマイ
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
