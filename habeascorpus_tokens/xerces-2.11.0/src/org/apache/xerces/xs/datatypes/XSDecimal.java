/* * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xerces	TokenNameIdentifier	 xerces
.	TokenNameDOT	
xs	TokenNameIdentifier	 xs
.	TokenNameDOT	
datatypes	TokenNameIdentifier	 datatypes
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
math	TokenNameIdentifier	 math
.	TokenNameDOT	
BigDecimal	TokenNameIdentifier	 Big Decimal
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
math	TokenNameIdentifier	 math
.	TokenNameDOT	
BigInteger	TokenNameIdentifier	 Big Integer
;	TokenNameSEMICOLON	
/** * <p>Interface to expose the value of 'decimal' and related datatypes.</p> * * @author Naela Nissar, IBM * * @version $Id: XSDecimal.java 447250 2006-09-18 05:27:17Z mrglavas $ */	TokenNameCOMMENT_JAVADOC	 <p>Interface to expose the value of 'decimal' and related datatypes.</p> * @author Naela Nissar, IBM * @version $Id: XSDecimal.java 447250 2006-09-18 05:27:17Z mrglavas $ 
public	TokenNamepublic	
interface	TokenNameinterface	
XSDecimal	TokenNameIdentifier	 XS Decimal
{	TokenNameLBRACE	
/** * @return the <code>BigDecimal</code> representation of this object */	TokenNameCOMMENT_JAVADOC	 @return the <code>BigDecimal</code> representation of this object 
public	TokenNamepublic	
BigDecimal	TokenNameIdentifier	 Big Decimal
getBigDecimal	TokenNameIdentifier	 get Big Decimal
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * @return the <code>BigInteger</code> representation of this object * @exception NumberFormatException if the value cannot be represented as a <code>BigInteger</code> */	TokenNameCOMMENT_JAVADOC	 @return the <code>BigInteger</code> representation of this object @exception NumberFormatException if the value cannot be represented as a <code>BigInteger</code> 
public	TokenNamepublic	
BigInteger	TokenNameIdentifier	 Big Integer
getBigInteger	TokenNameIdentifier	 get Big Integer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
NumberFormatException	TokenNameIdentifier	 Number Format Exception
;	TokenNameSEMICOLON	
/** * @return the long value representation of this object * @exception NumberFormatException if the value cannot be represented as a <code>long</code> */	TokenNameCOMMENT_JAVADOC	 @return the long value representation of this object @exception NumberFormatException if the value cannot be represented as a <code>long</code> 
public	TokenNamepublic	
long	TokenNamelong	
getLong	TokenNameIdentifier	 get Long
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
NumberFormatException	TokenNameIdentifier	 Number Format Exception
;	TokenNameSEMICOLON	
/** * @return the int value representation of this object * @exception NumberFormatException if the value cannot be represented as a <code>int</code> */	TokenNameCOMMENT_JAVADOC	 @return the int value representation of this object @exception NumberFormatException if the value cannot be represented as a <code>int</code> 
public	TokenNamepublic	
int	TokenNameint	
getInt	TokenNameIdentifier	 get Int
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
NumberFormatException	TokenNameIdentifier	 Number Format Exception
;	TokenNameSEMICOLON	
/** * @return the short value representation of this object * @exception NumberFormatException if the value cannot be represented as a <code>short</code> */	TokenNameCOMMENT_JAVADOC	 @return the short value representation of this object @exception NumberFormatException if the value cannot be represented as a <code>short</code> 
public	TokenNamepublic	
short	TokenNameshort	
getShort	TokenNameIdentifier	 get Short
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
NumberFormatException	TokenNameIdentifier	 Number Format Exception
;	TokenNameSEMICOLON	
/** * @return the byte value representation of this object * @exception NumberFormatException if the value cannot be represented as a <code>byte</code> */	TokenNameCOMMENT_JAVADOC	 @return the byte value representation of this object @exception NumberFormatException if the value cannot be represented as a <code>byte</code> 
public	TokenNamepublic	
byte	TokenNamebyte	
getByte	TokenNameIdentifier	 get Byte
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
NumberFormatException	TokenNameIdentifier	 Number Format Exception
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
