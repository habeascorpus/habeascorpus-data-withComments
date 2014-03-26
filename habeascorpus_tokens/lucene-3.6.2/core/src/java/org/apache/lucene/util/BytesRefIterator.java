package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
util	TokenNameIdentifier	 util
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
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Comparator	TokenNameIdentifier	 Comparator
;	TokenNameSEMICOLON	
/** * A simple iterator interface for {@link BytesRef} iteration. */	TokenNameCOMMENT_JAVADOC	 A simple iterator interface for {@link BytesRef} iteration. 
public	TokenNamepublic	
interface	TokenNameinterface	
BytesRefIterator	TokenNameIdentifier	 Bytes Ref Iterator
{	TokenNameLBRACE	
/** * Increments the iteration to the next {@link BytesRef} in the iterator. * Returns the resulting {@link BytesRef} or <code>null</code> if the end of * the iterator is reached. The returned BytesRef may be re-used across calls * to next. After this method returns null, do not call it again: the results * are undefined. * * @return the next {@link BytesRef} in the iterator or <code>null</code> if * the end of the iterator is reached. * @throws IOException */	TokenNameCOMMENT_JAVADOC	 Increments the iteration to the next {@link BytesRef} in the iterator. Returns the resulting {@link BytesRef} or <code>null</code> if the end of the iterator is reached. The returned BytesRef may be re-used across calls to next. After this method returns null, do not call it again: the results are undefined. * @return the next {@link BytesRef} in the iterator or <code>null</code> if the end of the iterator is reached. @throws IOException 
public	TokenNamepublic	
BytesRef	TokenNameIdentifier	 Bytes Ref
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
;	TokenNameSEMICOLON	
/** * Return the {@link BytesRef} Comparator used to sort terms provided by the * iterator. This may return null if there are no items or the iterator is not * sorted. Callers may invoke this method many times, so it's best to cache a * single instance & reuse it. */	TokenNameCOMMENT_JAVADOC	 Return the {@link BytesRef} Comparator used to sort terms provided by the iterator. This may return null if there are no items or the iterator is not sorted. Callers may invoke this method many times, so it's best to cache a single instance & reuse it. 
public	TokenNamepublic	
Comparator	TokenNameIdentifier	 Comparator
<	TokenNameLESS	
BytesRef	TokenNameIdentifier	 Bytes Ref
>	TokenNameGREATER	
getComparator	TokenNameIdentifier	 get Comparator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** Singleton BytesRefIterator that iterates over 0 BytesRefs. */	TokenNameCOMMENT_JAVADOC	 Singleton BytesRefIterator that iterates over 0 BytesRefs. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
BytesRefIterator	TokenNameIdentifier	 Bytes Ref Iterator
EMPTY	TokenNameIdentifier	 EMPTY
=	TokenNameEQUAL	
new	TokenNamenew	
BytesRefIterator	TokenNameIdentifier	 Bytes Ref Iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
//@Override - not until Java 6 	TokenNameCOMMENT_LINE	@Override - not until Java 6 
public	TokenNamepublic	
BytesRef	TokenNameIdentifier	 Bytes Ref
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
Comparator	TokenNameIdentifier	 Comparator
<	TokenNameLESS	
BytesRef	TokenNameIdentifier	 Bytes Ref
>	TokenNameGREATER	
getComparator	TokenNameIdentifier	 get Comparator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
