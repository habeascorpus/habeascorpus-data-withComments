/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the "License"); * you may not use this file except in compliance with the License. * You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/* * $Id: DecimalToRoman.java 468645 2006-10-28 06:57:24Z minchau $ */	TokenNameCOMMENT_BLOCK	 $Id: DecimalToRoman.java 468645 2006-10-28 06:57:24Z minchau $ 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xalan	TokenNameIdentifier	 xalan
.	TokenNameDOT	
transformer	TokenNameIdentifier	 transformer
;	TokenNameSEMICOLON	
/** * Structure to help in converting integers to roman numerals * @xsl.usage internal */	TokenNameCOMMENT_JAVADOC	 Structure to help in converting integers to roman numerals @xsl.usage internal 
public	TokenNamepublic	
class	TokenNameclass	
DecimalToRoman	TokenNameIdentifier	 Decimal To Roman
{	TokenNameLBRACE	
/** * Constructor DecimalToRoman * * * @param postValue Minimum value for a given range of * roman numbers * @param postLetter Correspoding letter (roman) to postValue * @param preValue Value of last prefixed number within * that same range (i.e. IV if postval is 5 (V)) * @param preLetter Correspoding letter(roman) to preValue */	TokenNameCOMMENT_JAVADOC	 Constructor DecimalToRoman * @param postValue Minimum value for a given range of roman numbers @param postLetter Correspoding letter (roman) to postValue @param preValue Value of last prefixed number within that same range (i.e. IV if postval is 5 (V)) @param preLetter Correspoding letter(roman) to preValue 
public	TokenNamepublic	
DecimalToRoman	TokenNameIdentifier	 Decimal To Roman
(	TokenNameLPAREN	
long	TokenNamelong	
postValue	TokenNameIdentifier	 post Value
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
postLetter	TokenNameIdentifier	 post Letter
,	TokenNameCOMMA	
long	TokenNamelong	
preValue	TokenNameIdentifier	 pre Value
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
preLetter	TokenNameIdentifier	 pre Letter
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
m_postValue	TokenNameIdentifier	 m post Value
=	TokenNameEQUAL	
postValue	TokenNameIdentifier	 post Value
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
m_postLetter	TokenNameIdentifier	 m post Letter
=	TokenNameEQUAL	
postLetter	TokenNameIdentifier	 post Letter
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
m_preValue	TokenNameIdentifier	 m pre Value
=	TokenNameEQUAL	
preValue	TokenNameIdentifier	 pre Value
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
m_preLetter	TokenNameIdentifier	 m pre Letter
=	TokenNameEQUAL	
preLetter	TokenNameIdentifier	 pre Letter
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Minimum value for a given range of roman numbers */	TokenNameCOMMENT_JAVADOC	 Minimum value for a given range of roman numbers 
public	TokenNamepublic	
long	TokenNamelong	
m_postValue	TokenNameIdentifier	 m post Value
;	TokenNameSEMICOLON	
/** Correspoding letter (roman) to m_postValue */	TokenNameCOMMENT_JAVADOC	 Correspoding letter (roman) to m_postValue 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
m_postLetter	TokenNameIdentifier	 m post Letter
;	TokenNameSEMICOLON	
/** Value of last prefixed number within that same range */	TokenNameCOMMENT_JAVADOC	 Value of last prefixed number within that same range 
public	TokenNamepublic	
long	TokenNamelong	
m_preValue	TokenNameIdentifier	 m pre Value
;	TokenNameSEMICOLON	
/** Correspoding letter (roman) to m_preValue */	TokenNameCOMMENT_JAVADOC	 Correspoding letter (roman) to m_preValue 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
m_preLetter	TokenNameIdentifier	 m pre Letter
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
