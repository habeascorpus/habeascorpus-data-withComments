package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
facet	TokenNameIdentifier	 facet
.	TokenNameDOT	
search	TokenNameIdentifier	 search
;	TokenNameSEMICOLON	
/** * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_JAVADOC	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/** * Declares an interface for heap (and heap alike) structures, * handling a given type T * * @lucene.experimental */	TokenNameCOMMENT_JAVADOC	 Declares an interface for heap (and heap alike) structures, handling a given type T * @lucene.experimental 
public	TokenNamepublic	
interface	TokenNameinterface	
Heap	TokenNameIdentifier	 Heap
<	TokenNameLESS	
T	TokenNameIdentifier	 T
>	TokenNameGREATER	
{	TokenNameLBRACE	
/** * Get and remove the top of the Heap <BR> * NOTE: Once {@link #pop()} is called no other {@link #add(Object)} or * {@link #insertWithOverflow(Object)} should be called. */	TokenNameCOMMENT_JAVADOC	 Get and remove the top of the Heap <BR> NOTE: Once {@link #pop()} is called no other {@link #add(Object)} or {@link #insertWithOverflow(Object)} should be called. 
public	TokenNamepublic	
T	TokenNameIdentifier	 T
pop	TokenNameIdentifier	 pop
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** Get (But not remove) the top of the Heap */	TokenNameCOMMENT_JAVADOC	 Get (But not remove) the top of the Heap 
public	TokenNamepublic	
T	TokenNameIdentifier	 T
top	TokenNameIdentifier	 top
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Insert a new value, returning the overflowen object <br> * NOTE: This method should not be called after invoking {@link #pop()} */	TokenNameCOMMENT_JAVADOC	 Insert a new value, returning the overflowen object <br> NOTE: This method should not be called after invoking {@link #pop()} 
public	TokenNamepublic	
T	TokenNameIdentifier	 T
insertWithOverflow	TokenNameIdentifier	 insert With Overflow
(	TokenNameLPAREN	
T	TokenNameIdentifier	 T
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Add a new value to the heap, return the new top(). <br> * Some implementations may choose to not implement this functionality. * In such a case <code>null</code> should be returned. <BR> * NOTE: This method should not be called after invoking {@link #pop()} */	TokenNameCOMMENT_JAVADOC	 Add a new value to the heap, return the new top(). <br> Some implementations may choose to not implement this functionality. In such a case <code>null</code> should be returned. <BR> NOTE: This method should not be called after invoking {@link #pop()} 
public	TokenNamepublic	
T	TokenNameIdentifier	 T
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
T	TokenNameIdentifier	 T
frn	TokenNameIdentifier	 frn
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** Clear the heap */	TokenNameCOMMENT_JAVADOC	 Clear the heap 
public	TokenNamepublic	
void	TokenNamevoid	
clear	TokenNameIdentifier	 clear
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** Return the amount of objects currently in the heap */	TokenNameCOMMENT_JAVADOC	 Return the amount of objects currently in the heap 
public	TokenNamepublic	
int	TokenNameint	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
