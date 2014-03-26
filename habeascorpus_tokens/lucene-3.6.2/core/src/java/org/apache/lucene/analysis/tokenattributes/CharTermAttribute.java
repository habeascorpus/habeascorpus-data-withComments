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
/** * The term text of a Token. */	TokenNameCOMMENT_JAVADOC	 The term text of a Token. 
public	TokenNamepublic	
interface	TokenNameinterface	
CharTermAttribute	TokenNameIdentifier	 Char Term Attribute
extends	TokenNameextends	
Attribute	TokenNameIdentifier	 Attribute
,	TokenNameCOMMA	
CharSequence	TokenNameIdentifier	 Char Sequence
,	TokenNameCOMMA	
Appendable	TokenNameIdentifier	 Appendable
{	TokenNameLBRACE	
/** Copies the contents of buffer, starting at offset for * length characters, into the termBuffer array. * @param buffer the buffer to copy * @param offset the index in the buffer of the first character to copy * @param length the number of characters to copy */	TokenNameCOMMENT_JAVADOC	 Copies the contents of buffer, starting at offset for length characters, into the termBuffer array. @param buffer the buffer to copy @param offset the index in the buffer of the first character to copy @param length the number of characters to copy 
public	TokenNamepublic	
void	TokenNamevoid	
copyBuffer	TokenNameIdentifier	 copy Buffer
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
/** Returns the internal termBuffer character array which * you can then directly alter. If the array is too * small for your token, use {@link * #resizeBuffer(int)} to increase it. After * altering the buffer be sure to call {@link * #setLength} to record the number of valid * characters that were placed into the termBuffer. */	TokenNameCOMMENT_JAVADOC	 Returns the internal termBuffer character array which you can then directly alter. If the array is too small for your token, use {@link #resizeBuffer(int)} to increase it. After altering the buffer be sure to call {@link #setLength} to record the number of valid characters that were placed into the termBuffer. 
public	TokenNamepublic	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
buffer	TokenNameIdentifier	 buffer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** Grows the termBuffer to at least size newSize, preserving the * existing content. * @param newSize minimum size of the new termBuffer * @return newly created termBuffer with length >= newSize */	TokenNameCOMMENT_JAVADOC	 Grows the termBuffer to at least size newSize, preserving the existing content. @param newSize minimum size of the new termBuffer @return newly created termBuffer with length >= newSize 
public	TokenNamepublic	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
resizeBuffer	TokenNameIdentifier	 resize Buffer
(	TokenNameLPAREN	
int	TokenNameint	
newSize	TokenNameIdentifier	 new Size
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** Set number of valid characters (length of the term) in * the termBuffer array. Use this to truncate the termBuffer * or to synchronize with external manipulation of the termBuffer. * Note: to grow the size of the array, * use {@link #resizeBuffer(int)} first. * @param length the truncated length */	TokenNameCOMMENT_JAVADOC	 Set number of valid characters (length of the term) in the termBuffer array. Use this to truncate the termBuffer or to synchronize with external manipulation of the termBuffer. Note: to grow the size of the array, use {@link #resizeBuffer(int)} first. @param length the truncated length 
public	TokenNamepublic	
CharTermAttribute	TokenNameIdentifier	 Char Term Attribute
setLength	TokenNameIdentifier	 set Length
(	TokenNameLPAREN	
int	TokenNameint	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** Sets the length of the termBuffer to zero. * Use this method before appending contents * using the {@link Appendable} interface. */	TokenNameCOMMENT_JAVADOC	 Sets the length of the termBuffer to zero. Use this method before appending contents using the {@link Appendable} interface. 
public	TokenNamepublic	
CharTermAttribute	TokenNameIdentifier	 Char Term Attribute
setEmpty	TokenNameIdentifier	 set Empty
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// the following methods are redefined to get rid of IOException declaration: 	TokenNameCOMMENT_LINE	the following methods are redefined to get rid of IOException declaration: 
public	TokenNamepublic	
CharTermAttribute	TokenNameIdentifier	 Char Term Attribute
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
CharSequence	TokenNameIdentifier	 Char Sequence
csq	TokenNameIdentifier	 csq
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
CharTermAttribute	TokenNameIdentifier	 Char Term Attribute
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
CharSequence	TokenNameIdentifier	 Char Sequence
csq	TokenNameIdentifier	 csq
,	TokenNameCOMMA	
int	TokenNameint	
start	TokenNameIdentifier	 start
,	TokenNameCOMMA	
int	TokenNameint	
end	TokenNameIdentifier	 end
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
CharTermAttribute	TokenNameIdentifier	 Char Term Attribute
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
char	TokenNamechar	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** Appends the specified {@code String} to this character sequence. * <p>The characters of the {@code String} argument are appended, in order, increasing the length of * this sequence by the length of the argument. If argument is {@code null}, then the four * characters {@code "null"} are appended. */	TokenNameCOMMENT_JAVADOC	 Appends the specified {@code String} to this character sequence. <p>The characters of the {@code String} argument are appended, in order, increasing the length of this sequence by the length of the argument. If argument is {@code null}, then the four characters {@code "null"} are appended. 
public	TokenNamepublic	
CharTermAttribute	TokenNameIdentifier	 Char Term Attribute
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** Appends the specified {@code StringBuilder} to this character sequence. * <p>The characters of the {@code StringBuilder} argument are appended, in order, increasing the length of * this sequence by the length of the argument. If argument is {@code null}, then the four * characters {@code "null"} are appended. */	TokenNameCOMMENT_JAVADOC	 Appends the specified {@code StringBuilder} to this character sequence. <p>The characters of the {@code StringBuilder} argument are appended, in order, increasing the length of this sequence by the length of the argument. If argument is {@code null}, then the four characters {@code "null"} are appended. 
public	TokenNamepublic	
CharTermAttribute	TokenNameIdentifier	 Char Term Attribute
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
StringBuilder	TokenNameIdentifier	 String Builder
sb	TokenNameIdentifier	 sb
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** Appends the contents of the other {@code CharTermAttribute} to this character sequence. * <p>The characters of the {@code CharTermAttribute} argument are appended, in order, increasing the length of * this sequence by the length of the argument. If argument is {@code null}, then the four * characters {@code "null"} are appended. */	TokenNameCOMMENT_JAVADOC	 Appends the contents of the other {@code CharTermAttribute} to this character sequence. <p>The characters of the {@code CharTermAttribute} argument are appended, in order, increasing the length of this sequence by the length of the argument. If argument is {@code null}, then the four characters {@code "null"} are appended. 
public	TokenNamepublic	
CharTermAttribute	TokenNameIdentifier	 Char Term Attribute
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
CharTermAttribute	TokenNameIdentifier	 Char Term Attribute
termAtt	TokenNameIdentifier	 term Att
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
