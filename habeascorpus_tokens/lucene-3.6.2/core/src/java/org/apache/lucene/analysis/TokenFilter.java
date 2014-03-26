package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
analysis	TokenNameIdentifier	 analysis
;	TokenNameSEMICOLON	
/** * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_JAVADOC	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
IOException	TokenNameIdentifier	 IO Exception
;	TokenNameSEMICOLON	
/** A TokenFilter is a TokenStream whose input is another TokenStream. <p> This is an abstract class; subclasses must override {@link #incrementToken()}. @see TokenStream */	TokenNameCOMMENT_JAVADOC	 A TokenFilter is a TokenStream whose input is another TokenStream. <p> This is an abstract class; subclasses must override {@link #incrementToken()}. @see TokenStream 
public	TokenNamepublic	
abstract	TokenNameabstract	
class	TokenNameclass	
TokenFilter	TokenNameIdentifier	 Token Filter
extends	TokenNameextends	
TokenStream	TokenNameIdentifier	 Token Stream
{	TokenNameLBRACE	
/** The source of tokens for this filter. */	TokenNameCOMMENT_JAVADOC	 The source of tokens for this filter. 
protected	TokenNameprotected	
final	TokenNamefinal	
TokenStream	TokenNameIdentifier	 Token Stream
input	TokenNameIdentifier	 input
;	TokenNameSEMICOLON	
/** Construct a token stream filtering the given input. */	TokenNameCOMMENT_JAVADOC	 Construct a token stream filtering the given input. 
protected	TokenNameprotected	
TokenFilter	TokenNameIdentifier	 Token Filter
(	TokenNameLPAREN	
TokenStream	TokenNameIdentifier	 Token Stream
input	TokenNameIdentifier	 input
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
input	TokenNameIdentifier	 input
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
input	TokenNameIdentifier	 input
=	TokenNameEQUAL	
input	TokenNameIdentifier	 input
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Performs end-of-stream operations, if any, and calls then <code>end()</code> on the * input TokenStream.<p/> * <b>NOTE:</b> Be sure to call <code>super.end()</code> first when overriding this method.*/	TokenNameCOMMENT_JAVADOC	 Performs end-of-stream operations, if any, and calls then <code>end()</code> on the input TokenStream.<p/> <b>NOTE:</b> Be sure to call <code>super.end()</code> first when overriding this method.
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
input	TokenNameIdentifier	 input
.	TokenNameDOT	
end	TokenNameIdentifier	 end
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Close the input TokenStream. */	TokenNameCOMMENT_JAVADOC	 Close the input TokenStream. 
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
input	TokenNameIdentifier	 input
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Reset the filter as well as the input TokenStream. */	TokenNameCOMMENT_JAVADOC	 Reset the filter as well as the input TokenStream. 
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
input	TokenNameIdentifier	 input
.	TokenNameDOT	
reset	TokenNameIdentifier	 reset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
