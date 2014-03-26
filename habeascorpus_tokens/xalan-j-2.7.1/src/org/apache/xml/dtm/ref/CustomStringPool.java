/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the "License"); * you may not use this file except in compliance with the License. * You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/* * $Id: CustomStringPool.java 475904 2006-11-16 20:09:39Z minchau $ */	TokenNameCOMMENT_BLOCK	 $Id: CustomStringPool.java 475904 2006-11-16 20:09:39Z minchau $ 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
dtm	TokenNameIdentifier	 dtm
.	TokenNameDOT	
ref	TokenNameIdentifier	 ref
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Hashtable	TokenNameIdentifier	 Hashtable
;	TokenNameSEMICOLON	
/** <p>CustomStringPool is an example of appliction provided data structure * for a DTM implementation to hold symbol references, e.g. elelment names. * It will follow the DTMDStringPool interface and use two simple methods * indexToString(int i) and stringToIndex(Sring s) to map between a set of * string values and a set of integer index values. Therefore, an application * may improve DTM processing speed by substituting the DTM symbol resolution * tables with application specific quick symbol resolution tables.</p> * * %REVIEW% The only difference between this an DTMStringPool seems to be that * it uses a java.lang.Hashtable full of Integers rather than implementing its * own hashing. Joe deliberately avoided that approach when writing * DTMStringPool, since it is both much more memory-hungry and probably slower * -- especially in JDK 1.1.x, where Hashtable is synchronized. We need to * either justify this implementation or discard it. * * %REVIEW% Xalan-J has dropped support for 1.1.x and we can now use * the colletion classes in 1.2, such as java.util.HashMap which is * similar to java.util.Hashtable but not synchronized. For performance reasons * one could change m_stringToInt to be a HashMap, but is it OK to do that? * Are such CustomStringPool objects already used in a thread-safe way? * * <p>Status: In progress, under discussion.</p> * */	TokenNameCOMMENT_JAVADOC	 <p>CustomStringPool is an example of appliction provided data structure for a DTM implementation to hold symbol references, e.g. elelment names. It will follow the DTMDStringPool interface and use two simple methods indexToString(int i) and stringToIndex(Sring s) to map between a set of string values and a set of integer index values. Therefore, an application may improve DTM processing speed by substituting the DTM symbol resolution tables with application specific quick symbol resolution tables.</p> * %REVIEW% The only difference between this an DTMStringPool seems to be that it uses a java.lang.Hashtable full of Integers rather than implementing its own hashing. Joe deliberately avoided that approach when writing DTMStringPool, since it is both much more memory-hungry and probably slower -- especially in JDK 1.1.x, where Hashtable is synchronized. We need to either justify this implementation or discard it. * %REVIEW% Xalan-J has dropped support for 1.1.x and we can now use the colletion classes in 1.2, such as java.util.HashMap which is similar to java.util.Hashtable but not synchronized. For performance reasons one could change m_stringToInt to be a HashMap, but is it OK to do that? Are such CustomStringPool objects already used in a thread-safe way? * <p>Status: In progress, under discussion.</p> 
public	TokenNamepublic	
class	TokenNameclass	
CustomStringPool	TokenNameIdentifier	 Custom String Pool
extends	TokenNameextends	
DTMStringPool	TokenNameIdentifier	 DTM String Pool
{	TokenNameLBRACE	
//final Vector m_intToString; 	TokenNameCOMMENT_LINE	final Vector m_intToString; 
//static final int HASHPRIME=101; 	TokenNameCOMMENT_LINE	static final int HASHPRIME=101; 
//int[] m_hashStart=new int[HASHPRIME]; 	TokenNameCOMMENT_LINE	int[] m_hashStart=new int[HASHPRIME]; 
final	TokenNamefinal	
Hashtable	TokenNameIdentifier	 Hashtable
m_stringToInt	TokenNameIdentifier	 m string To Int
=	TokenNameEQUAL	
new	TokenNamenew	
Hashtable	TokenNameIdentifier	 Hashtable
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// can this be a HashMap instead? 	TokenNameCOMMENT_LINE	can this be a HashMap instead? 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
NULL	TokenNameIdentifier	 NULL
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
CustomStringPool	TokenNameIdentifier	 Custom String Pool
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/*m_intToString=new Vector(); System.out.println("In constructor m_intToString is " + ((null == m_intToString) ? "null" : "not null"));*/	TokenNameCOMMENT_BLOCK	m_intToString=new Vector(); System.out.println("In constructor m_intToString is " + ((null == m_intToString) ? "null" : "not null"));
//m_stringToInt=new Hashtable(); 	TokenNameCOMMENT_LINE	m_stringToInt=new Hashtable(); 
//removeAllElements(); 	TokenNameCOMMENT_LINE	removeAllElements(); 
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
removeAllElements	TokenNameIdentifier	 remove All Elements
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_intToString	TokenNameIdentifier	 m int To String
.	TokenNameDOT	
removeAllElements	TokenNameIdentifier	 remove All Elements
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
m_stringToInt	TokenNameIdentifier	 m string To Int
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
m_stringToInt	TokenNameIdentifier	 m string To Int
.	TokenNameDOT	
clear	TokenNameIdentifier	 clear
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** @return string whose value is uniquely identified by this integer index. * @throws java.lang.ArrayIndexOutOfBoundsException * if index doesn't map to a string. * */	TokenNameCOMMENT_JAVADOC	 @return string whose value is uniquely identified by this integer index. @throws java.lang.ArrayIndexOutOfBoundsException if index doesn't map to a string. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
indexToString	TokenNameIdentifier	 index To String
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
throws	TokenNamethrows	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
lang	TokenNameIdentifier	 lang
.	TokenNameDOT	
ArrayIndexOutOfBoundsException	TokenNameIdentifier	 Array Index Out Of Bounds Exception
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
)	TokenNameRPAREN	
m_intToString	TokenNameIdentifier	 m int To String
.	TokenNameDOT	
elementAt	TokenNameIdentifier	 element At
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** @return integer index uniquely identifying the value of this string. */	TokenNameCOMMENT_JAVADOC	 @return integer index uniquely identifying the value of this string. 
public	TokenNamepublic	
int	TokenNameint	
stringToIndex	TokenNameIdentifier	 string To Index
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
return	TokenNamereturn	
NULL	TokenNameIdentifier	 NULL
;	TokenNameSEMICOLON	
Integer	TokenNameIdentifier	 Integer
iobj	TokenNameIdentifier	 iobj
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Integer	TokenNameIdentifier	 Integer
)	TokenNameRPAREN	
m_stringToInt	TokenNameIdentifier	 m string To Int
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
iobj	TokenNameIdentifier	 iobj
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_intToString	TokenNameIdentifier	 m int To String
.	TokenNameDOT	
addElement	TokenNameIdentifier	 add Element
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
iobj	TokenNameIdentifier	 iobj
=	TokenNameEQUAL	
new	TokenNamenew	
Integer	TokenNameIdentifier	 Integer
(	TokenNameLPAREN	
m_intToString	TokenNameIdentifier	 m int To String
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_stringToInt	TokenNameIdentifier	 m string To Int
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
,	TokenNameCOMMA	
iobj	TokenNameIdentifier	 iobj
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
iobj	TokenNameIdentifier	 iobj
.	TokenNameDOT	
intValue	TokenNameIdentifier	 int Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
