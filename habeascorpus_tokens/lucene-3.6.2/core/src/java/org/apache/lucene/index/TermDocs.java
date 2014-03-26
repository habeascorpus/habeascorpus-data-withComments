package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
index	TokenNameIdentifier	 index
;	TokenNameSEMICOLON	
/** * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_JAVADOC	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
IOException	TokenNameIdentifier	 IO Exception
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
Closeable	TokenNameIdentifier	 Closeable
;	TokenNameSEMICOLON	
/** TermDocs provides an interface for enumerating &lt;document, frequency&gt; pairs for a term. <p> The document portion names each document containing the term. Documents are indicated by number. The frequency portion gives the number of times the term occurred in each document. <p> The pairs are ordered by document number. @see IndexReader#termDocs() */	TokenNameCOMMENT_JAVADOC	 TermDocs provides an interface for enumerating &lt;document, frequency&gt; pairs for a term. <p> The document portion names each document containing the term. Documents are indicated by number. The frequency portion gives the number of times the term occurred in each document. <p> The pairs are ordered by document number. @see IndexReader#termDocs() 
public	TokenNamepublic	
interface	TokenNameinterface	
TermDocs	TokenNameIdentifier	 Term Docs
extends	TokenNameextends	
Closeable	TokenNameIdentifier	 Closeable
{	TokenNameLBRACE	
/** Sets this to the data for a term. * The enumeration is reset to the start of the data for this term. */	TokenNameCOMMENT_JAVADOC	 Sets this to the data for a term. The enumeration is reset to the start of the data for this term. 
void	TokenNamevoid	
seek	TokenNameIdentifier	 seek
(	TokenNameLPAREN	
Term	TokenNameIdentifier	 Term
term	TokenNameIdentifier	 term
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
;	TokenNameSEMICOLON	
/** Sets this to the data for the current term in a {@link TermEnum}. * This may be optimized in some implementations. */	TokenNameCOMMENT_JAVADOC	 Sets this to the data for the current term in a {@link TermEnum}. This may be optimized in some implementations. 
void	TokenNamevoid	
seek	TokenNameIdentifier	 seek
(	TokenNameLPAREN	
TermEnum	TokenNameIdentifier	 Term Enum
termEnum	TokenNameIdentifier	 term Enum
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
;	TokenNameSEMICOLON	
/** Returns the current document number. <p> This is invalid until {@link #next()} is called for the first time.*/	TokenNameCOMMENT_JAVADOC	 Returns the current document number. <p> This is invalid until {@link #next()} is called for the first time.
int	TokenNameint	
doc	TokenNameIdentifier	 doc
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** Returns the frequency of the term within the current document. <p> This is invalid until {@link #next()} is called for the first time.*/	TokenNameCOMMENT_JAVADOC	 Returns the frequency of the term within the current document. <p> This is invalid until {@link #next()} is called for the first time.
int	TokenNameint	
freq	TokenNameIdentifier	 freq
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** Moves to the next pair in the enumeration. <p> Returns true iff there is such a next pair in the enumeration. Once this returns false you should not call any of the other methods. */	TokenNameCOMMENT_JAVADOC	 Moves to the next pair in the enumeration. <p> Returns true iff there is such a next pair in the enumeration. Once this returns false you should not call any of the other methods. 
boolean	TokenNameboolean	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
;	TokenNameSEMICOLON	
/** Attempts to read multiple entries from the enumeration, up to length of * <i>docs</i>. Document numbers are stored in <i>docs</i>, and term * frequencies are stored in <i>freqs</i>. The <i>freqs</i> array must be as * long as the <i>docs</i> array. * * <p>Returns the number of entries read. Zero is only returned when the * stream has been exhausted. */	TokenNameCOMMENT_JAVADOC	 Attempts to read multiple entries from the enumeration, up to length of <i>docs</i>. Document numbers are stored in <i>docs</i>, and term frequencies are stored in <i>freqs</i>. The <i>freqs</i> array must be as long as the <i>docs</i> array. * <p>Returns the number of entries read. Zero is only returned when the stream has been exhausted. 
int	TokenNameint	
read	TokenNameIdentifier	 read
(	TokenNameLPAREN	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
docs	TokenNameIdentifier	 docs
,	TokenNameCOMMA	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
freqs	TokenNameIdentifier	 freqs
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
;	TokenNameSEMICOLON	
/** Skips entries to the first beyond the current whose document number is * greater than or equal to <i>target</i>. <p>Returns true iff there is such * an entry. <p>Behaves as if written: <pre> * boolean skipTo(int target) { * do { * if (!next()) * return false; * } while (target > doc()); * return true; * } * </pre> * Some implementations are considerably more efficient than that. */	TokenNameCOMMENT_JAVADOC	 Skips entries to the first beyond the current whose document number is greater than or equal to <i>target</i>. <p>Returns true iff there is such an entry. <p>Behaves as if written: <pre> boolean skipTo(int target) { do { if (!next()) return false; } while (target > doc()); return true; } </pre> Some implementations are considerably more efficient than that. 
boolean	TokenNameboolean	
skipTo	TokenNameIdentifier	 skip To
(	TokenNameLPAREN	
int	TokenNameint	
target	TokenNameIdentifier	 target
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
;	TokenNameSEMICOLON	
/** Frees associated resources. */	TokenNameCOMMENT_JAVADOC	 Frees associated resources. 
void	TokenNamevoid	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
