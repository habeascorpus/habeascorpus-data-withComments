package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
analysis	TokenNameIdentifier	 analysis
.	TokenNameDOT	
tokenattributes	TokenNameIdentifier	 tokenattributes
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
Attribute	TokenNameIdentifier	 Attribute
;	TokenNameSEMICOLON	
/** * The term text of a Token. * @deprecated Use {@link CharTermAttribute} instead. */	TokenNameCOMMENT_JAVADOC	 The term text of a Token. @deprecated Use {@link CharTermAttribute} instead. 
@	TokenNameAT	
Deprecated	TokenNameIdentifier	 Deprecated
public	TokenNamepublic	
interface	TokenNameinterface	
TermAttribute	TokenNameIdentifier	 Term Attribute
extends	TokenNameextends	
Attribute	TokenNameIdentifier	 Attribute
{	TokenNameLBRACE	
/** Returns the Token's term text. * * This method has a performance penalty * because the text is stored internally in a char[]. If * possible, use {@link #termBuffer()} and {@link * #termLength()} directly instead. If you really need a * String, use this method, which is nothing more than * a convenience call to <b>new String(token.termBuffer(), 0, token.termLength())</b> */	TokenNameCOMMENT_JAVADOC	 Returns the Token's term text. * This method has a performance penalty because the text is stored internally in a char[]. If possible, use {@link #termBuffer()} and {@link #termLength()} directly instead. If you really need a String, use this method, which is nothing more than a convenience call to <b>new String(token.termBuffer(), 0, token.termLength())</b> 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
term	TokenNameIdentifier	 term
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** Copies the contents of buffer, starting at offset for * length characters, into the termBuffer array. * @param buffer the buffer to copy * @param offset the index in the buffer of the first character to copy * @param length the number of characters to copy */	TokenNameCOMMENT_JAVADOC	 Copies the contents of buffer, starting at offset for length characters, into the termBuffer array. @param buffer the buffer to copy @param offset the index in the buffer of the first character to copy @param length the number of characters to copy 
public	TokenNamepublic	
void	TokenNamevoid	
setTermBuffer	TokenNameIdentifier	 set Term Buffer
(	TokenNameLPAREN	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
buffer	TokenNameIdentifier	 buffer
,	TokenNameCOMMA	
int	TokenNameint	
offset	TokenNameIdentifier	 offset
,	TokenNameCOMMA	
int	TokenNameint	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** Copies the contents of buffer into the termBuffer array. * @param buffer the buffer to copy */	TokenNameCOMMENT_JAVADOC	 Copies the contents of buffer into the termBuffer array. @param buffer the buffer to copy 
public	TokenNamepublic	
void	TokenNamevoid	
setTermBuffer	TokenNameIdentifier	 set Term Buffer
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
buffer	TokenNameIdentifier	 buffer
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** Copies the contents of buffer, starting at offset and continuing * for length characters, into the termBuffer array. * @param buffer the buffer to copy * @param offset the index in the buffer of the first character to copy * @param length the number of characters to copy */	TokenNameCOMMENT_JAVADOC	 Copies the contents of buffer, starting at offset and continuing for length characters, into the termBuffer array. @param buffer the buffer to copy @param offset the index in the buffer of the first character to copy @param length the number of characters to copy 
public	TokenNamepublic	
void	TokenNamevoid	
setTermBuffer	TokenNameIdentifier	 set Term Buffer
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
buffer	TokenNameIdentifier	 buffer
,	TokenNameCOMMA	
int	TokenNameint	
offset	TokenNameIdentifier	 offset
,	TokenNameCOMMA	
int	TokenNameint	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** Returns the internal termBuffer character array which * you can then directly alter. If the array is too * small for your token, use {@link * #resizeTermBuffer(int)} to increase it. After * altering the buffer be sure to call {@link * #setTermLength} to record the number of valid * characters that were placed into the termBuffer. */	TokenNameCOMMENT_JAVADOC	 Returns the internal termBuffer character array which you can then directly alter. If the array is too small for your token, use {@link #resizeTermBuffer(int)} to increase it. After altering the buffer be sure to call {@link #setTermLength} to record the number of valid characters that were placed into the termBuffer. 
public	TokenNamepublic	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
termBuffer	TokenNameIdentifier	 term Buffer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** Grows the termBuffer to at least size newSize, preserving the * existing content. Note: If the next operation is to change * the contents of the term buffer use * {@link #setTermBuffer(char[], int, int)}, * {@link #setTermBuffer(String)}, or * {@link #setTermBuffer(String, int, int)} * to optimally combine the resize with the setting of the termBuffer. * @param newSize minimum size of the new termBuffer * @return newly created termBuffer with length >= newSize */	TokenNameCOMMENT_JAVADOC	 Grows the termBuffer to at least size newSize, preserving the existing content. Note: If the next operation is to change the contents of the term buffer use {@link #setTermBuffer(char[], int, int)}, {@link #setTermBuffer(String)}, or {@link #setTermBuffer(String, int, int)} to optimally combine the resize with the setting of the termBuffer. @param newSize minimum size of the new termBuffer @return newly created termBuffer with length >= newSize 
public	TokenNamepublic	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
resizeTermBuffer	TokenNameIdentifier	 resize Term Buffer
(	TokenNameLPAREN	
int	TokenNameint	
newSize	TokenNameIdentifier	 new Size
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** Return number of valid characters (length of the term) * in the termBuffer array. */	TokenNameCOMMENT_JAVADOC	 Return number of valid characters (length of the term) in the termBuffer array. 
public	TokenNamepublic	
int	TokenNameint	
termLength	TokenNameIdentifier	 term Length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** Set number of valid characters (length of the term) in * the termBuffer array. Use this to truncate the termBuffer * or to synchronize with external manipulation of the termBuffer. * Note: to grow the size of the array, * use {@link #resizeTermBuffer(int)} first. * @param length the truncated length */	TokenNameCOMMENT_JAVADOC	 Set number of valid characters (length of the term) in the termBuffer array. Use this to truncate the termBuffer or to synchronize with external manipulation of the termBuffer. Note: to grow the size of the array, use {@link #resizeTermBuffer(int)} first. @param length the truncated length 
public	TokenNamepublic	
void	TokenNamevoid	
setTermLength	TokenNameIdentifier	 set Term Length
(	TokenNameLPAREN	
int	TokenNameint	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
