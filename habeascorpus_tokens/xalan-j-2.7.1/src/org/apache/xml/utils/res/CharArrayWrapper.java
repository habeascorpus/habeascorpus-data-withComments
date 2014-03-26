/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the "License"); * you may not use this file except in compliance with the License. * You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/* * $Id: CharArrayWrapper.java 468655 2006-10-28 07:12:06Z minchau $ */	TokenNameCOMMENT_BLOCK	 $Id: CharArrayWrapper.java 468655 2006-10-28 07:12:06Z minchau $ 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
utils	TokenNameIdentifier	 utils
.	TokenNameDOT	
res	TokenNameIdentifier	 res
;	TokenNameSEMICOLON	
/** * * It is a mutable object to wrap the char[] used in * the contents of the XResourceBundle class */	TokenNameCOMMENT_JAVADOC	 * It is a mutable object to wrap the char[] used in the contents of the XResourceBundle class 
public	TokenNamepublic	
class	TokenNameclass	
CharArrayWrapper	TokenNameIdentifier	 Char Array Wrapper
{	TokenNameLBRACE	
private	TokenNameprivate	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
m_char	TokenNameIdentifier	 m char
;	TokenNameSEMICOLON	
public	TokenNamepublic	
CharArrayWrapper	TokenNameIdentifier	 Char Array Wrapper
(	TokenNameLPAREN	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
arg	TokenNameIdentifier	 arg
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_char	TokenNameIdentifier	 m char
=	TokenNameEQUAL	
arg	TokenNameIdentifier	 arg
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
char	TokenNamechar	
getChar	TokenNameIdentifier	 get Char
(	TokenNameLPAREN	
int	TokenNameint	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
m_char	TokenNameIdentifier	 m char
[	TokenNameLBRACKET	
index	TokenNameIdentifier	 index
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
int	TokenNameint	
getLength	TokenNameIdentifier	 get Length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
m_char	TokenNameIdentifier	 m char
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
