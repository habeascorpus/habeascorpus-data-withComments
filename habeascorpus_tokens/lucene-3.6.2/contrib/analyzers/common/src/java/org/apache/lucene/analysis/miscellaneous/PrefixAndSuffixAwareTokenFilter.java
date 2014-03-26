package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
analysis	TokenNameIdentifier	 analysis
.	TokenNameDOT	
miscellaneous	TokenNameIdentifier	 miscellaneous
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
Token	TokenNameIdentifier	 Token
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
TokenStream	TokenNameIdentifier	 Token Stream
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
IOException	TokenNameIdentifier	 IO Exception
;	TokenNameSEMICOLON	
/** * Links two {@link PrefixAwareTokenFilter}. * <p/> * <b>NOTE:</b> This filter might not behave correctly if used with custom Attributes, i.e. Attributes other than * the ones located in org.apache.lucene.analysis.tokenattributes. */	TokenNameCOMMENT_JAVADOC	 Links two {@link PrefixAwareTokenFilter}. <p/> <b>NOTE:</b> This filter might not behave correctly if used with custom Attributes, i.e. Attributes other than the ones located in org.apache.lucene.analysis.tokenattributes. 
public	TokenNamepublic	
class	TokenNameclass	
PrefixAndSuffixAwareTokenFilter	TokenNameIdentifier	 Prefix And Suffix Aware Token Filter
extends	TokenNameextends	
TokenStream	TokenNameIdentifier	 Token Stream
{	TokenNameLBRACE	
private	TokenNameprivate	
PrefixAwareTokenFilter	TokenNameIdentifier	 Prefix Aware Token Filter
suffix	TokenNameIdentifier	 suffix
;	TokenNameSEMICOLON	
public	TokenNamepublic	
PrefixAndSuffixAwareTokenFilter	TokenNameIdentifier	 Prefix And Suffix Aware Token Filter
(	TokenNameLPAREN	
TokenStream	TokenNameIdentifier	 Token Stream
prefix	TokenNameIdentifier	 prefix
,	TokenNameCOMMA	
TokenStream	TokenNameIdentifier	 Token Stream
input	TokenNameIdentifier	 input
,	TokenNameCOMMA	
TokenStream	TokenNameIdentifier	 Token Stream
suffix	TokenNameIdentifier	 suffix
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
suffix	TokenNameIdentifier	 suffix
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
prefix	TokenNameIdentifier	 prefix
=	TokenNameEQUAL	
new	TokenNamenew	
PrefixAwareTokenFilter	TokenNameIdentifier	 Prefix Aware Token Filter
(	TokenNameLPAREN	
prefix	TokenNameIdentifier	 prefix
,	TokenNameCOMMA	
input	TokenNameIdentifier	 input
)	TokenNameRPAREN	
{	TokenNameLBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
Token	TokenNameIdentifier	 Token
updateSuffixToken	TokenNameIdentifier	 update Suffix Token
(	TokenNameLPAREN	
Token	TokenNameIdentifier	 Token
suffixToken	TokenNameIdentifier	 suffix Token
,	TokenNameCOMMA	
Token	TokenNameIdentifier	 Token
lastInputToken	TokenNameIdentifier	 last Input Token
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
PrefixAndSuffixAwareTokenFilter	TokenNameIdentifier	 Prefix And Suffix Aware Token Filter
.	TokenNameDOT	
this	TokenNamethis	
.	TokenNameDOT	
updateInputToken	TokenNameIdentifier	 update Input Token
(	TokenNameLPAREN	
suffixToken	TokenNameIdentifier	 suffix Token
,	TokenNameCOMMA	
lastInputToken	TokenNameIdentifier	 last Input Token
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
suffix	TokenNameIdentifier	 suffix
=	TokenNameEQUAL	
new	TokenNamenew	
PrefixAwareTokenFilter	TokenNameIdentifier	 Prefix Aware Token Filter
(	TokenNameLPAREN	
prefix	TokenNameIdentifier	 prefix
,	TokenNameCOMMA	
suffix	TokenNameIdentifier	 suffix
)	TokenNameRPAREN	
{	TokenNameLBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
Token	TokenNameIdentifier	 Token
updateSuffixToken	TokenNameIdentifier	 update Suffix Token
(	TokenNameLPAREN	
Token	TokenNameIdentifier	 Token
suffixToken	TokenNameIdentifier	 suffix Token
,	TokenNameCOMMA	
Token	TokenNameIdentifier	 Token
lastInputToken	TokenNameIdentifier	 last Input Token
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
PrefixAndSuffixAwareTokenFilter	TokenNameIdentifier	 Prefix And Suffix Aware Token Filter
.	TokenNameDOT	
this	TokenNamethis	
.	TokenNameDOT	
updateSuffixToken	TokenNameIdentifier	 update Suffix Token
(	TokenNameLPAREN	
suffixToken	TokenNameIdentifier	 suffix Token
,	TokenNameCOMMA	
lastInputToken	TokenNameIdentifier	 last Input Token
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
Token	TokenNameIdentifier	 Token
updateInputToken	TokenNameIdentifier	 update Input Token
(	TokenNameLPAREN	
Token	TokenNameIdentifier	 Token
inputToken	TokenNameIdentifier	 input Token
,	TokenNameCOMMA	
Token	TokenNameIdentifier	 Token
lastPrefixToken	TokenNameIdentifier	 last Prefix Token
)	TokenNameRPAREN	
{	TokenNameLBRACE	
inputToken	TokenNameIdentifier	 input Token
.	TokenNameDOT	
setStartOffset	TokenNameIdentifier	 set Start Offset
(	TokenNameLPAREN	
lastPrefixToken	TokenNameIdentifier	 last Prefix Token
.	TokenNameDOT	
endOffset	TokenNameIdentifier	 end Offset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
inputToken	TokenNameIdentifier	 input Token
.	TokenNameDOT	
startOffset	TokenNameIdentifier	 start Offset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
inputToken	TokenNameIdentifier	 input Token
.	TokenNameDOT	
setEndOffset	TokenNameIdentifier	 set End Offset
(	TokenNameLPAREN	
lastPrefixToken	TokenNameIdentifier	 last Prefix Token
.	TokenNameDOT	
endOffset	TokenNameIdentifier	 end Offset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
inputToken	TokenNameIdentifier	 input Token
.	TokenNameDOT	
endOffset	TokenNameIdentifier	 end Offset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
inputToken	TokenNameIdentifier	 input Token
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
Token	TokenNameIdentifier	 Token
updateSuffixToken	TokenNameIdentifier	 update Suffix Token
(	TokenNameLPAREN	
Token	TokenNameIdentifier	 Token
suffixToken	TokenNameIdentifier	 suffix Token
,	TokenNameCOMMA	
Token	TokenNameIdentifier	 Token
lastInputToken	TokenNameIdentifier	 last Input Token
)	TokenNameRPAREN	
{	TokenNameLBRACE	
suffixToken	TokenNameIdentifier	 suffix Token
.	TokenNameDOT	
setStartOffset	TokenNameIdentifier	 set Start Offset
(	TokenNameLPAREN	
lastInputToken	TokenNameIdentifier	 last Input Token
.	TokenNameDOT	
endOffset	TokenNameIdentifier	 end Offset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
suffixToken	TokenNameIdentifier	 suffix Token
.	TokenNameDOT	
startOffset	TokenNameIdentifier	 start Offset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
suffixToken	TokenNameIdentifier	 suffix Token
.	TokenNameDOT	
setEndOffset	TokenNameIdentifier	 set End Offset
(	TokenNameLPAREN	
lastInputToken	TokenNameIdentifier	 last Input Token
.	TokenNameDOT	
endOffset	TokenNameIdentifier	 end Offset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
suffixToken	TokenNameIdentifier	 suffix Token
.	TokenNameDOT	
endOffset	TokenNameIdentifier	 end Offset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
suffixToken	TokenNameIdentifier	 suffix Token
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
final	TokenNamefinal	
boolean	TokenNameboolean	
incrementToken	TokenNameIdentifier	 increment Token
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
return	TokenNamereturn	
suffix	TokenNameIdentifier	 suffix
.	TokenNameDOT	
incrementToken	TokenNameIdentifier	 increment Token
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
void	TokenNamevoid	
reset	TokenNameIdentifier	 reset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
suffix	TokenNameIdentifier	 suffix
.	TokenNameDOT	
reset	TokenNameIdentifier	 reset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
void	TokenNamevoid	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
suffix	TokenNameIdentifier	 suffix
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
void	TokenNamevoid	
end	TokenNameIdentifier	 end
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
suffix	TokenNameIdentifier	 suffix
.	TokenNameDOT	
end	TokenNameIdentifier	 end
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
