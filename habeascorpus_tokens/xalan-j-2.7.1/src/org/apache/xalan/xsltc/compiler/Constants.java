/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the "License"); * you may not use this file except in compliance with the License. * You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/* * $Id: Constants.java 468650 2006-10-28 07:03:30Z minchau $ */	TokenNameCOMMENT_BLOCK	 $Id: Constants.java 468650 2006-10-28 07:03:30Z minchau $ 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xalan	TokenNameIdentifier	 xalan
.	TokenNameDOT	
xsltc	TokenNameIdentifier	 xsltc
.	TokenNameDOT	
compiler	TokenNameIdentifier	 compiler
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
bcel	TokenNameIdentifier	 bcel
.	TokenNameDOT	
generic	TokenNameIdentifier	 generic
.	TokenNameDOT	
InstructionConstants	TokenNameIdentifier	 Instruction Constants
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
serializer	TokenNameIdentifier	 serializer
.	TokenNameDOT	
SerializerBase	TokenNameIdentifier	 Serializer Base
;	TokenNameSEMICOLON	
/** * @author Jacek Ambroziak * @author Santiago Pericas-Geertsen */	TokenNameCOMMENT_JAVADOC	 @author Jacek Ambroziak @author Santiago Pericas-Geertsen 
public	TokenNamepublic	
interface	TokenNameinterface	
Constants	TokenNameIdentifier	 Constants
extends	TokenNameextends	
InstructionConstants	TokenNameIdentifier	 Instruction Constants
{	TokenNameLBRACE	
// Error categories used to report errors to Parser.reportError() 	TokenNameCOMMENT_LINE	Error categories used to report errors to Parser.reportError() 
// Unexpected internal errors, such as null-ptr exceptions, etc. 	TokenNameCOMMENT_LINE	Unexpected internal errors, such as null-ptr exceptions, etc. 
// Immediately terminates compilation, no translet produced 	TokenNameCOMMENT_LINE	Immediately terminates compilation, no translet produced 
public	TokenNamepublic	
final	TokenNamefinal	
int	TokenNameint	
INTERNAL	TokenNameIdentifier	 INTERNAL
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// XSLT elements that are not implemented and unsupported ext. 	TokenNameCOMMENT_LINE	XSLT elements that are not implemented and unsupported ext. 
// Immediately terminates compilation, no translet produced 	TokenNameCOMMENT_LINE	Immediately terminates compilation, no translet produced 
public	TokenNamepublic	
final	TokenNamefinal	
int	TokenNameint	
UNSUPPORTED	TokenNameIdentifier	 UNSUPPORTED
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// Fatal error in the stylesheet input (parsing or content) 	TokenNameCOMMENT_LINE	Fatal error in the stylesheet input (parsing or content) 
// Immediately terminates compilation, no translet produced 	TokenNameCOMMENT_LINE	Immediately terminates compilation, no translet produced 
public	TokenNamepublic	
final	TokenNamefinal	
int	TokenNameint	
FATAL	TokenNameIdentifier	 FATAL
=	TokenNameEQUAL	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// Other error in the stylesheet input (parsing or content) 	TokenNameCOMMENT_LINE	Other error in the stylesheet input (parsing or content) 
// Does not terminate compilation, no translet produced 	TokenNameCOMMENT_LINE	Does not terminate compilation, no translet produced 
public	TokenNamepublic	
final	TokenNamefinal	
int	TokenNameint	
ERROR	TokenNameIdentifier	 ERROR
=	TokenNameEQUAL	
3	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// Other error in the stylesheet input (content errors only) 	TokenNameCOMMENT_LINE	Other error in the stylesheet input (content errors only) 
// Does not terminate compilation, a translet is produced 	TokenNameCOMMENT_LINE	Does not terminate compilation, a translet is produced 
public	TokenNamepublic	
final	TokenNamefinal	
int	TokenNameint	
WARNING	TokenNameIdentifier	 WARNING
=	TokenNameEQUAL	
4	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
EMPTYSTRING	TokenNameIdentifier	 EMPTYSTRING
=	TokenNameEQUAL	
""	TokenNameStringLiteral	 
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
NAMESPACE_FEATURE	TokenNameIdentifier	 NAMESPACE  FEATURE
=	TokenNameEQUAL	
"http://xml.org/sax/features/namespaces"	TokenNameStringLiteral	http://xml.org/sax/features/namespaces
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
TRANSLET_INTF	TokenNameIdentifier	 TRANSLET  INTF
=	TokenNameEQUAL	
"org.apache.xalan.xsltc.Translet"	TokenNameStringLiteral	org.apache.xalan.xsltc.Translet
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
TRANSLET_INTF_SIG	TokenNameIdentifier	 TRANSLET  INTF  SIG
=	TokenNameEQUAL	
"Lorg/apache/xalan/xsltc/Translet;"	TokenNameStringLiteral	Lorg/apache/xalan/xsltc/Translet;
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ATTRIBUTES_SIG	TokenNameIdentifier	 ATTRIBUTES  SIG
=	TokenNameEQUAL	
"Lorg/apache/xalan/xsltc/runtime/Attributes;"	TokenNameStringLiteral	Lorg/apache/xalan/xsltc/runtime/Attributes;
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
NODE_ITERATOR_SIG	TokenNameIdentifier	 NODE  ITERATOR  SIG
=	TokenNameEQUAL	
"Lorg/apache/xml/dtm/DTMAxisIterator;"	TokenNameStringLiteral	Lorg/apache/xml/dtm/DTMAxisIterator;
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
DOM_INTF_SIG	TokenNameIdentifier	 DOM  INTF  SIG
=	TokenNameEQUAL	
"Lorg/apache/xalan/xsltc/DOM;"	TokenNameStringLiteral	Lorg/apache/xalan/xsltc/DOM;
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
DOM_IMPL_CLASS	TokenNameIdentifier	 DOM  IMPL  CLASS
=	TokenNameEQUAL	
"org/apache/xalan/xsltc/DOM"	TokenNameStringLiteral	org/apache/xalan/xsltc/DOM
;	TokenNameSEMICOLON	
// xml/dtm/ref/DTMDefaultBaseIterators"; //xalan/xsltc/dom/DOMImpl"; 	TokenNameCOMMENT_LINE	xml/dtm/ref/DTMDefaultBaseIterators"; //xalan/xsltc/dom/DOMImpl"; 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
SAX_IMPL_CLASS	TokenNameIdentifier	 SAX  IMPL  CLASS
=	TokenNameEQUAL	
"org/apache/xalan/xsltc/DOM/SAXImpl"	TokenNameStringLiteral	org/apache/xalan/xsltc/DOM/SAXImpl
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
DOM_IMPL_SIG	TokenNameIdentifier	 DOM  IMPL  SIG
=	TokenNameEQUAL	
"Lorg/apache/xalan/xsltc/dom/SAXImpl;"	TokenNameStringLiteral	Lorg/apache/xalan/xsltc/dom/SAXImpl;
;	TokenNameSEMICOLON	
//xml/dtm/ref/DTMDefaultBaseIterators"; //xalan/xsltc/dom/DOMImpl;"; 	TokenNameCOMMENT_LINE	xml/dtm/ref/DTMDefaultBaseIterators"; //xalan/xsltc/dom/DOMImpl;"; 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
SAX_IMPL_SIG	TokenNameIdentifier	 SAX  IMPL  SIG
=	TokenNameEQUAL	
"Lorg/apache/xalan/xsltc/dom/SAXImpl;"	TokenNameStringLiteral	Lorg/apache/xalan/xsltc/dom/SAXImpl;
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
DOM_ADAPTER_CLASS	TokenNameIdentifier	 DOM  ADAPTER  CLASS
=	TokenNameEQUAL	
"org/apache/xalan/xsltc/dom/DOMAdapter"	TokenNameStringLiteral	org/apache/xalan/xsltc/dom/DOMAdapter
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
DOM_ADAPTER_SIG	TokenNameIdentifier	 DOM  ADAPTER  SIG
=	TokenNameEQUAL	
"Lorg/apache/xalan/xsltc/dom/DOMAdapter;"	TokenNameStringLiteral	Lorg/apache/xalan/xsltc/dom/DOMAdapter;
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
MULTI_DOM_CLASS	TokenNameIdentifier	 MULTI  DOM  CLASS
=	TokenNameEQUAL	
"org.apache.xalan.xsltc.dom.MultiDOM"	TokenNameStringLiteral	org.apache.xalan.xsltc.dom.MultiDOM
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
MULTI_DOM_SIG	TokenNameIdentifier	 MULTI  DOM  SIG
=	TokenNameEQUAL	
"Lorg/apache/xalan/xsltc/dom/MultiDOM;"	TokenNameStringLiteral	Lorg/apache/xalan/xsltc/dom/MultiDOM;
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
STRING	TokenNameIdentifier	 STRING
=	TokenNameEQUAL	
"java.lang.String"	TokenNameStringLiteral	java.lang.String
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
ACC_PUBLIC	TokenNameIdentifier	 ACC  PUBLIC
=	TokenNameEQUAL	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
bcel	TokenNameIdentifier	 bcel
.	TokenNameDOT	
Constants	TokenNameIdentifier	 Constants
.	TokenNameDOT	
ACC_PUBLIC	TokenNameIdentifier	 ACC  PUBLIC
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
ACC_SUPER	TokenNameIdentifier	 ACC  SUPER
=	TokenNameEQUAL	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
bcel	TokenNameIdentifier	 bcel
.	TokenNameDOT	
Constants	TokenNameIdentifier	 Constants
.	TokenNameDOT	
ACC_SUPER	TokenNameIdentifier	 ACC  SUPER
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
ACC_FINAL	TokenNameIdentifier	 ACC  FINAL
=	TokenNameEQUAL	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
bcel	TokenNameIdentifier	 bcel
.	TokenNameDOT	
Constants	TokenNameIdentifier	 Constants
.	TokenNameDOT	
ACC_FINAL	TokenNameIdentifier	 ACC  FINAL
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
ACC_PRIVATE	TokenNameIdentifier	 ACC  PRIVATE
=	TokenNameEQUAL	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
bcel	TokenNameIdentifier	 bcel
.	TokenNameDOT	
Constants	TokenNameIdentifier	 Constants
.	TokenNameDOT	
ACC_PRIVATE	TokenNameIdentifier	 ACC  PRIVATE
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
ACC_PROTECTED	TokenNameIdentifier	 ACC  PROTECTED
=	TokenNameEQUAL	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
bcel	TokenNameIdentifier	 bcel
.	TokenNameDOT	
Constants	TokenNameIdentifier	 Constants
.	TokenNameDOT	
ACC_PROTECTED	TokenNameIdentifier	 ACC  PROTECTED
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
ACC_STATIC	TokenNameIdentifier	 ACC  STATIC
=	TokenNameEQUAL	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
bcel	TokenNameIdentifier	 bcel
.	TokenNameDOT	
Constants	TokenNameIdentifier	 Constants
.	TokenNameDOT	
ACC_STATIC	TokenNameIdentifier	 ACC  STATIC
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
STRING_SIG	TokenNameIdentifier	 STRING  SIG
=	TokenNameEQUAL	
"Ljava/lang/String;"	TokenNameStringLiteral	Ljava/lang/String;
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
STRING_BUFFER_SIG	TokenNameIdentifier	 STRING  BUFFER  SIG
=	TokenNameEQUAL	
"Ljava/lang/StringBuffer;"	TokenNameStringLiteral	Ljava/lang/StringBuffer;
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
OBJECT_SIG	TokenNameIdentifier	 OBJECT  SIG
=	TokenNameEQUAL	
"Ljava/lang/Object;"	TokenNameStringLiteral	Ljava/lang/Object;
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
DOUBLE_SIG	TokenNameIdentifier	 DOUBLE  SIG
=	TokenNameEQUAL	
"Ljava/lang/Double;"	TokenNameStringLiteral	Ljava/lang/Double;
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
INTEGER_SIG	TokenNameIdentifier	 INTEGER  SIG
=	TokenNameEQUAL	
"Ljava/lang/Integer;"	TokenNameStringLiteral	Ljava/lang/Integer;
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
COLLATOR_CLASS	TokenNameIdentifier	 COLLATOR  CLASS
=	TokenNameEQUAL	
"java/text/Collator"	TokenNameStringLiteral	java/text/Collator
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
COLLATOR_SIG	TokenNameIdentifier	 COLLATOR  SIG
=	TokenNameEQUAL	
"Ljava/text/Collator;"	TokenNameStringLiteral	Ljava/text/Collator;
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
NODE	TokenNameIdentifier	 NODE
=	TokenNameEQUAL	
"int"	TokenNameStringLiteral	int
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
NODE_ITERATOR	TokenNameIdentifier	 NODE  ITERATOR
=	TokenNameEQUAL	
"org.apache.xml.dtm.DTMAxisIterator"	TokenNameStringLiteral	org.apache.xml.dtm.DTMAxisIterator
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
NODE_ITERATOR_BASE	TokenNameIdentifier	 NODE  ITERATOR  BASE
=	TokenNameEQUAL	
"org.apache.xml.dtm.ref.DTMAxisIteratorBase"	TokenNameStringLiteral	org.apache.xml.dtm.ref.DTMAxisIteratorBase
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
SORT_ITERATOR	TokenNameIdentifier	 SORT  ITERATOR
=	TokenNameEQUAL	
"org.apache.xalan.xsltc.dom.SortingIterator"	TokenNameStringLiteral	org.apache.xalan.xsltc.dom.SortingIterator
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
SORT_ITERATOR_SIG	TokenNameIdentifier	 SORT  ITERATOR  SIG
=	TokenNameEQUAL	
"Lorg.apache.xalan.xsltc.dom.SortingIterator;"	TokenNameStringLiteral	Lorg.apache.xalan.xsltc.dom.SortingIterator;
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
NODE_SORT_RECORD	TokenNameIdentifier	 NODE  SORT  RECORD
=	TokenNameEQUAL	
"org.apache.xalan.xsltc.dom.NodeSortRecord"	TokenNameStringLiteral	org.apache.xalan.xsltc.dom.NodeSortRecord
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
NODE_SORT_FACTORY	TokenNameIdentifier	 NODE  SORT  FACTORY
=	TokenNameEQUAL	
"org/apache/xalan/xsltc/dom/NodeSortRecordFactory"	TokenNameStringLiteral	org/apache/xalan/xsltc/dom/NodeSortRecordFactory
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
NODE_SORT_RECORD_SIG	TokenNameIdentifier	 NODE  SORT  RECORD  SIG
=	TokenNameEQUAL	
"Lorg/apache/xalan/xsltc/dom/NodeSortRecord;"	TokenNameStringLiteral	Lorg/apache/xalan/xsltc/dom/NodeSortRecord;
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
NODE_SORT_FACTORY_SIG	TokenNameIdentifier	 NODE  SORT  FACTORY  SIG
=	TokenNameEQUAL	
"Lorg/apache/xalan/xsltc/dom/NodeSortRecordFactory;"	TokenNameStringLiteral	Lorg/apache/xalan/xsltc/dom/NodeSortRecordFactory;
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
LOCALE_CLASS	TokenNameIdentifier	 LOCALE  CLASS
=	TokenNameEQUAL	
"java.util.Locale"	TokenNameStringLiteral	java.util.Locale
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
LOCALE_SIG	TokenNameIdentifier	 LOCALE  SIG
=	TokenNameEQUAL	
"Ljava/util/Locale;"	TokenNameStringLiteral	Ljava/util/Locale;
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
STRING_VALUE_HANDLER	TokenNameIdentifier	 STRING  VALUE  HANDLER
=	TokenNameEQUAL	
"org.apache.xalan.xsltc.runtime.StringValueHandler"	TokenNameStringLiteral	org.apache.xalan.xsltc.runtime.StringValueHandler
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
STRING_VALUE_HANDLER_SIG	TokenNameIdentifier	 STRING  VALUE  HANDLER  SIG
=	TokenNameEQUAL	
"Lorg/apache/xalan/xsltc/runtime/StringValueHandler;"	TokenNameStringLiteral	Lorg/apache/xalan/xsltc/runtime/StringValueHandler;
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
OUTPUT_HANDLER	TokenNameIdentifier	 OUTPUT  HANDLER
=	TokenNameEQUAL	
SerializerBase	TokenNameIdentifier	 Serializer Base
.	TokenNameDOT	
PKG_PATH	TokenNameIdentifier	 PKG  PATH
+	TokenNamePLUS	
"/SerializationHandler"	TokenNameStringLiteral	/SerializationHandler
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
OUTPUT_HANDLER_SIG	TokenNameIdentifier	 OUTPUT  HANDLER  SIG
=	TokenNameEQUAL	
"L"	TokenNameStringLiteral	L
+	TokenNamePLUS	
SerializerBase	TokenNameIdentifier	 Serializer Base
.	TokenNameDOT	
PKG_PATH	TokenNameIdentifier	 PKG  PATH
+	TokenNamePLUS	
"/SerializationHandler;"	TokenNameStringLiteral	/SerializationHandler;
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
FILTER_INTERFACE	TokenNameIdentifier	 FILTER  INTERFACE
=	TokenNameEQUAL	
"org.apache.xalan.xsltc.dom.Filter"	TokenNameStringLiteral	org.apache.xalan.xsltc.dom.Filter
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
FILTER_INTERFACE_SIG	TokenNameIdentifier	 FILTER  INTERFACE  SIG
=	TokenNameEQUAL	
"Lorg/apache/xalan/xsltc/dom/Filter;"	TokenNameStringLiteral	Lorg/apache/xalan/xsltc/dom/Filter;
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
UNION_ITERATOR_CLASS	TokenNameIdentifier	 UNION  ITERATOR  CLASS
=	TokenNameEQUAL	
"org.apache.xalan.xsltc.dom.UnionIterator"	TokenNameStringLiteral	org.apache.xalan.xsltc.dom.UnionIterator
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
STEP_ITERATOR_CLASS	TokenNameIdentifier	 STEP  ITERATOR  CLASS
=	TokenNameEQUAL	
"org.apache.xalan.xsltc.dom.StepIterator"	TokenNameStringLiteral	org.apache.xalan.xsltc.dom.StepIterator
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
CACHED_NODE_LIST_ITERATOR_CLASS	TokenNameIdentifier	 CACHED  NODE  LIST  ITERATOR  CLASS
=	TokenNameEQUAL	
"org.apache.xalan.xsltc.dom.CachedNodeListIterator"	TokenNameStringLiteral	org.apache.xalan.xsltc.dom.CachedNodeListIterator
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
NTH_ITERATOR_CLASS	TokenNameIdentifier	 NTH  ITERATOR  CLASS
=	TokenNameEQUAL	
"org.apache.xalan.xsltc.dom.NthIterator"	TokenNameStringLiteral	org.apache.xalan.xsltc.dom.NthIterator
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ABSOLUTE_ITERATOR	TokenNameIdentifier	 ABSOLUTE  ITERATOR
=	TokenNameEQUAL	
"org.apache.xalan.xsltc.dom.AbsoluteIterator"	TokenNameStringLiteral	org.apache.xalan.xsltc.dom.AbsoluteIterator
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
DUP_FILTERED_ITERATOR	TokenNameIdentifier	 DUP  FILTERED  ITERATOR
=	TokenNameEQUAL	
"org.apache.xalan.xsltc.dom.DupFilterIterator"	TokenNameStringLiteral	org.apache.xalan.xsltc.dom.DupFilterIterator
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
CURRENT_NODE_LIST_ITERATOR	TokenNameIdentifier	 CURRENT  NODE  LIST  ITERATOR
=	TokenNameEQUAL	
"org.apache.xalan.xsltc.dom.CurrentNodeListIterator"	TokenNameStringLiteral	org.apache.xalan.xsltc.dom.CurrentNodeListIterator
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
CURRENT_NODE_LIST_FILTER	TokenNameIdentifier	 CURRENT  NODE  LIST  FILTER
=	TokenNameEQUAL	
"org.apache.xalan.xsltc.dom.CurrentNodeListFilter"	TokenNameStringLiteral	org.apache.xalan.xsltc.dom.CurrentNodeListFilter
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
CURRENT_NODE_LIST_ITERATOR_SIG	TokenNameIdentifier	 CURRENT  NODE  LIST  ITERATOR  SIG
=	TokenNameEQUAL	
"Lorg/apache/xalan/xsltc/dom/CurrentNodeListIterator;"	TokenNameStringLiteral	Lorg/apache/xalan/xsltc/dom/CurrentNodeListIterator;
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
CURRENT_NODE_LIST_FILTER_SIG	TokenNameIdentifier	 CURRENT  NODE  LIST  FILTER  SIG
=	TokenNameEQUAL	
"Lorg/apache/xalan/xsltc/dom/CurrentNodeListFilter;"	TokenNameStringLiteral	Lorg/apache/xalan/xsltc/dom/CurrentNodeListFilter;
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
FILTER_STEP_ITERATOR	TokenNameIdentifier	 FILTER  STEP  ITERATOR
=	TokenNameEQUAL	
"org.apache.xalan.xsltc.dom.FilteredStepIterator"	TokenNameStringLiteral	org.apache.xalan.xsltc.dom.FilteredStepIterator
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
FILTER_ITERATOR	TokenNameIdentifier	 FILTER  ITERATOR
=	TokenNameEQUAL	
"org.apache.xalan.xsltc.dom.FilterIterator"	TokenNameStringLiteral	org.apache.xalan.xsltc.dom.FilterIterator
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
SINGLETON_ITERATOR	TokenNameIdentifier	 SINGLETON  ITERATOR
=	TokenNameEQUAL	
"org.apache.xalan.xsltc.dom.SingletonIterator"	TokenNameStringLiteral	org.apache.xalan.xsltc.dom.SingletonIterator
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
MATCHING_ITERATOR	TokenNameIdentifier	 MATCHING  ITERATOR
=	TokenNameEQUAL	
"org.apache.xalan.xsltc.dom.MatchingIterator"	TokenNameStringLiteral	org.apache.xalan.xsltc.dom.MatchingIterator
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
NODE_SIG	TokenNameIdentifier	 NODE  SIG
=	TokenNameEQUAL	
"I"	TokenNameStringLiteral	I
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
GET_PARENT	TokenNameIdentifier	 GET  PARENT
=	TokenNameEQUAL	
"getParent"	TokenNameStringLiteral	getParent
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
GET_PARENT_SIG	TokenNameIdentifier	 GET  PARENT  SIG
=	TokenNameEQUAL	
"("	TokenNameStringLiteral	(
+	TokenNamePLUS	
NODE_SIG	TokenNameIdentifier	 NODE  SIG
+	TokenNamePLUS	
")"	TokenNameStringLiteral	)
+	TokenNamePLUS	
NODE_SIG	TokenNameIdentifier	 NODE  SIG
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
NEXT_SIG	TokenNameIdentifier	 NEXT  SIG
=	TokenNameEQUAL	
"()"	TokenNameStringLiteral	()
+	TokenNamePLUS	
NODE_SIG	TokenNameIdentifier	 NODE  SIG
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
NEXT	TokenNameIdentifier	 NEXT
=	TokenNameEQUAL	
"next"	TokenNameStringLiteral	next
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
NEXTID	TokenNameIdentifier	 NEXTID
=	TokenNameEQUAL	
"nextNodeID"	TokenNameStringLiteral	nextNodeID
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
MAKE_NODE	TokenNameIdentifier	 MAKE  NODE
=	TokenNameEQUAL	
"makeNode"	TokenNameStringLiteral	makeNode
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
MAKE_NODE_LIST	TokenNameIdentifier	 MAKE  NODE  LIST
=	TokenNameEQUAL	
"makeNodeList"	TokenNameStringLiteral	makeNodeList
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
GET_UNPARSED_ENTITY_URI	TokenNameIdentifier	 GET  UNPARSED  ENTITY  URI
=	TokenNameEQUAL	
"getUnparsedEntityURI"	TokenNameStringLiteral	getUnparsedEntityURI
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
STRING_TO_REAL	TokenNameIdentifier	 STRING  TO  REAL
=	TokenNameEQUAL	
"stringToReal"	TokenNameStringLiteral	stringToReal
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
STRING_TO_REAL_SIG	TokenNameIdentifier	 STRING  TO  REAL  SIG
=	TokenNameEQUAL	
"("	TokenNameStringLiteral	(
+	TokenNamePLUS	
STRING_SIG	TokenNameIdentifier	 STRING  SIG
+	TokenNamePLUS	
")D"	TokenNameStringLiteral	)D
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
STRING_TO_INT	TokenNameIdentifier	 STRING  TO  INT
=	TokenNameEQUAL	
"stringToInt"	TokenNameStringLiteral	stringToInt
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
STRING_TO_INT_SIG	TokenNameIdentifier	 STRING  TO  INT  SIG
=	TokenNameEQUAL	
"("	TokenNameStringLiteral	(
+	TokenNamePLUS	
STRING_SIG	TokenNameIdentifier	 STRING  SIG
+	TokenNamePLUS	
")I"	TokenNameStringLiteral	)I
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
XSLT_PACKAGE	TokenNameIdentifier	 XSLT  PACKAGE
=	TokenNameEQUAL	
"org.apache.xalan.xsltc"	TokenNameStringLiteral	org.apache.xalan.xsltc
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
COMPILER_PACKAGE	TokenNameIdentifier	 COMPILER  PACKAGE
=	TokenNameEQUAL	
XSLT_PACKAGE	TokenNameIdentifier	 XSLT  PACKAGE
+	TokenNamePLUS	
".compiler"	TokenNameStringLiteral	.compiler
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
RUNTIME_PACKAGE	TokenNameIdentifier	 RUNTIME  PACKAGE
=	TokenNameEQUAL	
XSLT_PACKAGE	TokenNameIdentifier	 XSLT  PACKAGE
+	TokenNamePLUS	
".runtime"	TokenNameStringLiteral	.runtime
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
TRANSLET_CLASS	TokenNameIdentifier	 TRANSLET  CLASS
=	TokenNameEQUAL	
RUNTIME_PACKAGE	TokenNameIdentifier	 RUNTIME  PACKAGE
+	TokenNamePLUS	
".AbstractTranslet"	TokenNameStringLiteral	.AbstractTranslet
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
TRANSLET_SIG	TokenNameIdentifier	 TRANSLET  SIG
=	TokenNameEQUAL	
"Lorg/apache/xalan/xsltc/runtime/AbstractTranslet;"	TokenNameStringLiteral	Lorg/apache/xalan/xsltc/runtime/AbstractTranslet;
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
UNION_ITERATOR_SIG	TokenNameIdentifier	 UNION  ITERATOR  SIG
=	TokenNameEQUAL	
"Lorg/apache/xalan/xsltc/dom/UnionIterator;"	TokenNameStringLiteral	Lorg/apache/xalan/xsltc/dom/UnionIterator;
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
TRANSLET_OUTPUT_SIG	TokenNameIdentifier	 TRANSLET  OUTPUT  SIG
=	TokenNameEQUAL	
"L"	TokenNameStringLiteral	L
+	TokenNamePLUS	
SerializerBase	TokenNameIdentifier	 Serializer Base
.	TokenNameDOT	
PKG_PATH	TokenNameIdentifier	 PKG  PATH
+	TokenNamePLUS	
"/SerializationHandler;"	TokenNameStringLiteral	/SerializationHandler;
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
MAKE_NODE_SIG	TokenNameIdentifier	 MAKE  NODE  SIG
=	TokenNameEQUAL	
"(I)Lorg/w3c/dom/Node;"	TokenNameStringLiteral	(I)Lorg/w3c/dom/Node;
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
MAKE_NODE_SIG2	TokenNameIdentifier	 MAKE  NODE  SI G2
=	TokenNameEQUAL	
"("	TokenNameStringLiteral	(
+	TokenNamePLUS	
NODE_ITERATOR_SIG	TokenNameIdentifier	 NODE  ITERATOR  SIG
+	TokenNamePLUS	
")Lorg/w3c/dom/Node;"	TokenNameStringLiteral	)Lorg/w3c/dom/Node;
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
MAKE_NODE_LIST_SIG	TokenNameIdentifier	 MAKE  NODE  LIST  SIG
=	TokenNameEQUAL	
"(I)Lorg/w3c/dom/NodeList;"	TokenNameStringLiteral	(I)Lorg/w3c/dom/NodeList;
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
MAKE_NODE_LIST_SIG2	TokenNameIdentifier	 MAKE  NODE  LIST  SI G2
=	TokenNameEQUAL	
"("	TokenNameStringLiteral	(
+	TokenNamePLUS	
NODE_ITERATOR_SIG	TokenNameIdentifier	 NODE  ITERATOR  SIG
+	TokenNamePLUS	
")Lorg/w3c/dom/NodeList;"	TokenNameStringLiteral	)Lorg/w3c/dom/NodeList;
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
STREAM_XML_OUTPUT	TokenNameIdentifier	 STREAM  XML  OUTPUT
=	TokenNameEQUAL	
SerializerBase	TokenNameIdentifier	 Serializer Base
.	TokenNameDOT	
PKG_NAME	TokenNameIdentifier	 PKG  NAME
+	TokenNamePLUS	
".ToXMLStream"	TokenNameStringLiteral	.ToXMLStream
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
OUTPUT_BASE	TokenNameIdentifier	 OUTPUT  BASE
=	TokenNameEQUAL	
SerializerBase	TokenNameIdentifier	 Serializer Base
.	TokenNameDOT	
PKG_NAME	TokenNameIdentifier	 PKG  NAME
+	TokenNamePLUS	
".SerializerBase"	TokenNameStringLiteral	.SerializerBase
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
LOAD_DOCUMENT_CLASS	TokenNameIdentifier	 LOAD  DOCUMENT  CLASS
=	TokenNameEQUAL	
"org.apache.xalan.xsltc.dom.LoadDocument"	TokenNameStringLiteral	org.apache.xalan.xsltc.dom.LoadDocument
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
KEY_INDEX_CLASS	TokenNameIdentifier	 KEY  INDEX  CLASS
=	TokenNameEQUAL	
"org/apache/xalan/xsltc/dom/KeyIndex"	TokenNameStringLiteral	org/apache/xalan/xsltc/dom/KeyIndex
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
KEY_INDEX_SIG	TokenNameIdentifier	 KEY  INDEX  SIG
=	TokenNameEQUAL	
"Lorg/apache/xalan/xsltc/dom/KeyIndex;"	TokenNameStringLiteral	Lorg/apache/xalan/xsltc/dom/KeyIndex;
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
KEY_INDEX_ITERATOR_SIG	TokenNameIdentifier	 KEY  INDEX  ITERATOR  SIG
=	TokenNameEQUAL	
"Lorg/apache/xalan/xsltc/dom/KeyIndex$KeyIndexIterator;"	TokenNameStringLiteral	Lorg/apache/xalan/xsltc/dom/KeyIndex$KeyIndexIterator;
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
DOM_INTF	TokenNameIdentifier	 DOM  INTF
=	TokenNameEQUAL	
"org.apache.xalan.xsltc.DOM"	TokenNameStringLiteral	org.apache.xalan.xsltc.DOM
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
DOM_IMPL	TokenNameIdentifier	 DOM  IMPL
=	TokenNameEQUAL	
"org.apache.xalan.xsltc.dom.SAXImpl"	TokenNameStringLiteral	org.apache.xalan.xsltc.dom.SAXImpl
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
SAX_IMPL	TokenNameIdentifier	 SAX  IMPL
=	TokenNameEQUAL	
"org.apache.xalan.xsltc.dom.SAXImpl"	TokenNameStringLiteral	org.apache.xalan.xsltc.dom.SAXImpl
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
STRING_CLASS	TokenNameIdentifier	 STRING  CLASS
=	TokenNameEQUAL	
"java.lang.String"	TokenNameStringLiteral	java.lang.String
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
OBJECT_CLASS	TokenNameIdentifier	 OBJECT  CLASS
=	TokenNameEQUAL	
"java.lang.Object"	TokenNameStringLiteral	java.lang.Object
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
BOOLEAN_CLASS	TokenNameIdentifier	 BOOLEAN  CLASS
=	TokenNameEQUAL	
"java.lang.Boolean"	TokenNameStringLiteral	java.lang.Boolean
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
STRING_BUFFER_CLASS	TokenNameIdentifier	 STRING  BUFFER  CLASS
=	TokenNameEQUAL	
"java.lang.StringBuffer"	TokenNameStringLiteral	java.lang.StringBuffer
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
STRING_WRITER	TokenNameIdentifier	 STRING  WRITER
=	TokenNameEQUAL	
"java.io.StringWriter"	TokenNameStringLiteral	java.io.StringWriter
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
WRITER_SIG	TokenNameIdentifier	 WRITER  SIG
=	TokenNameEQUAL	
"Ljava/io/Writer;"	TokenNameStringLiteral	Ljava/io/Writer;
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
TRANSLET_OUTPUT_BASE	TokenNameIdentifier	 TRANSLET  OUTPUT  BASE
=	TokenNameEQUAL	
"org.apache.xalan.xsltc.TransletOutputBase"	TokenNameStringLiteral	org.apache.xalan.xsltc.TransletOutputBase
;	TokenNameSEMICOLON	
// output interface 	TokenNameCOMMENT_LINE	output interface 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
TRANSLET_OUTPUT_INTERFACE	TokenNameIdentifier	 TRANSLET  OUTPUT  INTERFACE
=	TokenNameEQUAL	
SerializerBase	TokenNameIdentifier	 Serializer Base
.	TokenNameDOT	
PKG_NAME	TokenNameIdentifier	 PKG  NAME
+	TokenNamePLUS	
".SerializationHandler"	TokenNameStringLiteral	.SerializationHandler
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
BASIS_LIBRARY_CLASS	TokenNameIdentifier	 BASIS  LIBRARY  CLASS
=	TokenNameEQUAL	
"org.apache.xalan.xsltc.runtime.BasisLibrary"	TokenNameStringLiteral	org.apache.xalan.xsltc.runtime.BasisLibrary
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ATTRIBUTE_LIST_IMPL_CLASS	TokenNameIdentifier	 ATTRIBUTE  LIST  IMPL  CLASS
=	TokenNameEQUAL	
"org.apache.xalan.xsltc.runtime.AttributeListImpl"	TokenNameStringLiteral	org.apache.xalan.xsltc.runtime.AttributeListImpl
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
DOUBLE_CLASS	TokenNameIdentifier	 DOUBLE  CLASS
=	TokenNameEQUAL	
"java.lang.Double"	TokenNameStringLiteral	java.lang.Double
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
INTEGER_CLASS	TokenNameIdentifier	 INTEGER  CLASS
=	TokenNameEQUAL	
"java.lang.Integer"	TokenNameStringLiteral	java.lang.Integer
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
RUNTIME_NODE_CLASS	TokenNameIdentifier	 RUNTIME  NODE  CLASS
=	TokenNameEQUAL	
"org.apache.xalan.xsltc.runtime.Node"	TokenNameStringLiteral	org.apache.xalan.xsltc.runtime.Node
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
MATH_CLASS	TokenNameIdentifier	 MATH  CLASS
=	TokenNameEQUAL	
"java.lang.Math"	TokenNameStringLiteral	java.lang.Math
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
BOOLEAN_VALUE	TokenNameIdentifier	 BOOLEAN  VALUE
=	TokenNameEQUAL	
"booleanValue"	TokenNameStringLiteral	booleanValue
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
BOOLEAN_VALUE_SIG	TokenNameIdentifier	 BOOLEAN  VALUE  SIG
=	TokenNameEQUAL	
"()Z"	TokenNameStringLiteral	()Z
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
INT_VALUE	TokenNameIdentifier	 INT  VALUE
=	TokenNameEQUAL	
"intValue"	TokenNameStringLiteral	intValue
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
INT_VALUE_SIG	TokenNameIdentifier	 INT  VALUE  SIG
=	TokenNameEQUAL	
"()I"	TokenNameStringLiteral	()I
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
DOUBLE_VALUE	TokenNameIdentifier	 DOUBLE  VALUE
=	TokenNameEQUAL	
"doubleValue"	TokenNameStringLiteral	doubleValue
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
DOUBLE_VALUE_SIG	TokenNameIdentifier	 DOUBLE  VALUE  SIG
=	TokenNameEQUAL	
"()D"	TokenNameStringLiteral	()D
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
DOM_PNAME	TokenNameIdentifier	 DOM  PNAME
=	TokenNameEQUAL	
"dom"	TokenNameStringLiteral	dom
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
NODE_PNAME	TokenNameIdentifier	 NODE  PNAME
=	TokenNameEQUAL	
"node"	TokenNameStringLiteral	node
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
TRANSLET_OUTPUT_PNAME	TokenNameIdentifier	 TRANSLET  OUTPUT  PNAME
=	TokenNameEQUAL	
"handler"	TokenNameStringLiteral	handler
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ITERATOR_PNAME	TokenNameIdentifier	 ITERATOR  PNAME
=	TokenNameEQUAL	
"iterator"	TokenNameStringLiteral	iterator
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
DOCUMENT_PNAME	TokenNameIdentifier	 DOCUMENT  PNAME
=	TokenNameEQUAL	
"document"	TokenNameStringLiteral	document
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
TRANSLET_PNAME	TokenNameIdentifier	 TRANSLET  PNAME
=	TokenNameEQUAL	
"translet"	TokenNameStringLiteral	translet
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
INVOKE_METHOD	TokenNameIdentifier	 INVOKE  METHOD
=	TokenNameEQUAL	
"invokeMethod"	TokenNameStringLiteral	invokeMethod
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
GET_NODE_NAME	TokenNameIdentifier	 GET  NODE  NAME
=	TokenNameEQUAL	
"getNodeNameX"	TokenNameStringLiteral	getNodeNameX
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
CHARACTERSW	TokenNameIdentifier	 CHARACTERSW
=	TokenNameEQUAL	
"characters"	TokenNameStringLiteral	characters
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
GET_CHILDREN	TokenNameIdentifier	 GET  CHILDREN
=	TokenNameEQUAL	
"getChildren"	TokenNameStringLiteral	getChildren
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
GET_TYPED_CHILDREN	TokenNameIdentifier	 GET  TYPED  CHILDREN
=	TokenNameEQUAL	
"getTypedChildren"	TokenNameStringLiteral	getTypedChildren
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
CHARACTERS	TokenNameIdentifier	 CHARACTERS
=	TokenNameEQUAL	
"characters"	TokenNameStringLiteral	characters
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
APPLY_TEMPLATES	TokenNameIdentifier	 APPLY  TEMPLATES
=	TokenNameEQUAL	
"applyTemplates"	TokenNameStringLiteral	applyTemplates
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
GET_NODE_TYPE	TokenNameIdentifier	 GET  NODE  TYPE
=	TokenNameEQUAL	
"getNodeType"	TokenNameStringLiteral	getNodeType
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
GET_NODE_VALUE	TokenNameIdentifier	 GET  NODE  VALUE
=	TokenNameEQUAL	
"getStringValueX"	TokenNameStringLiteral	getStringValueX
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
GET_ELEMENT_VALUE	TokenNameIdentifier	 GET  ELEMENT  VALUE
=	TokenNameEQUAL	
"getElementValue"	TokenNameStringLiteral	getElementValue
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
GET_ATTRIBUTE_VALUE	TokenNameIdentifier	 GET  ATTRIBUTE  VALUE
=	TokenNameEQUAL	
"getAttributeValue"	TokenNameStringLiteral	getAttributeValue
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
HAS_ATTRIBUTE	TokenNameIdentifier	 HAS  ATTRIBUTE
=	TokenNameEQUAL	
"hasAttribute"	TokenNameStringLiteral	hasAttribute
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ADD_ITERATOR	TokenNameIdentifier	 ADD  ITERATOR
=	TokenNameEQUAL	
"addIterator"	TokenNameStringLiteral	addIterator
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
SET_START_NODE	TokenNameIdentifier	 SET  START  NODE
=	TokenNameEQUAL	
"setStartNode"	TokenNameStringLiteral	setStartNode
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
RESET	TokenNameIdentifier	 RESET
=	TokenNameEQUAL	
"reset"	TokenNameStringLiteral	reset
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ATTR_SET_SIG	TokenNameIdentifier	 ATTR  SET  SIG
=	TokenNameEQUAL	
"("	TokenNameStringLiteral	(
+	TokenNamePLUS	
DOM_INTF_SIG	TokenNameIdentifier	 DOM  INTF  SIG
+	TokenNamePLUS	
NODE_ITERATOR_SIG	TokenNameIdentifier	 NODE  ITERATOR  SIG
+	TokenNamePLUS	
TRANSLET_OUTPUT_SIG	TokenNameIdentifier	 TRANSLET  OUTPUT  SIG
+	TokenNamePLUS	
")V"	TokenNameStringLiteral	)V
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
GET_NODE_NAME_SIG	TokenNameIdentifier	 GET  NODE  NAME  SIG
=	TokenNameEQUAL	
"("	TokenNameStringLiteral	(
+	TokenNamePLUS	
NODE_SIG	TokenNameIdentifier	 NODE  SIG
+	TokenNamePLUS	
")"	TokenNameStringLiteral	)
+	TokenNamePLUS	
STRING_SIG	TokenNameIdentifier	 STRING  SIG
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
CHARACTERSW_SIG	TokenNameIdentifier	 CHARACTERSW  SIG
=	TokenNameEQUAL	
"("	TokenNameStringLiteral	(
+	TokenNamePLUS	
STRING_SIG	TokenNameIdentifier	 STRING  SIG
+	TokenNamePLUS	
TRANSLET_OUTPUT_SIG	TokenNameIdentifier	 TRANSLET  OUTPUT  SIG
+	TokenNamePLUS	
")V"	TokenNameStringLiteral	)V
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
CHARACTERS_SIG	TokenNameIdentifier	 CHARACTERS  SIG
=	TokenNameEQUAL	
"("	TokenNameStringLiteral	(
+	TokenNamePLUS	
NODE_SIG	TokenNameIdentifier	 NODE  SIG
+	TokenNamePLUS	
TRANSLET_OUTPUT_SIG	TokenNameIdentifier	 TRANSLET  OUTPUT  SIG
+	TokenNamePLUS	
")V"	TokenNameStringLiteral	)V
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
GET_CHILDREN_SIG	TokenNameIdentifier	 GET  CHILDREN  SIG
=	TokenNameEQUAL	
"("	TokenNameStringLiteral	(
+	TokenNamePLUS	
NODE_SIG	TokenNameIdentifier	 NODE  SIG
+	TokenNamePLUS	
")"	TokenNameStringLiteral	)
+	TokenNamePLUS	
NODE_ITERATOR_SIG	TokenNameIdentifier	 NODE  ITERATOR  SIG
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
GET_TYPED_CHILDREN_SIG	TokenNameIdentifier	 GET  TYPED  CHILDREN  SIG
=	TokenNameEQUAL	
"(I)"	TokenNameStringLiteral	(I)
+	TokenNamePLUS	
NODE_ITERATOR_SIG	TokenNameIdentifier	 NODE  ITERATOR  SIG
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
GET_NODE_TYPE_SIG	TokenNameIdentifier	 GET  NODE  TYPE  SIG
=	TokenNameEQUAL	
"()S"	TokenNameStringLiteral	()S
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
GET_NODE_VALUE_SIG	TokenNameIdentifier	 GET  NODE  VALUE  SIG
=	TokenNameEQUAL	
"(I)"	TokenNameStringLiteral	(I)
+	TokenNamePLUS	
STRING_SIG	TokenNameIdentifier	 STRING  SIG
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
GET_ELEMENT_VALUE_SIG	TokenNameIdentifier	 GET  ELEMENT  VALUE  SIG
=	TokenNameEQUAL	
"(I)"	TokenNameStringLiteral	(I)
+	TokenNamePLUS	
STRING_SIG	TokenNameIdentifier	 STRING  SIG
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
GET_ATTRIBUTE_VALUE_SIG	TokenNameIdentifier	 GET  ATTRIBUTE  VALUE  SIG
=	TokenNameEQUAL	
"(II)"	TokenNameStringLiteral	(II)
+	TokenNamePLUS	
STRING_SIG	TokenNameIdentifier	 STRING  SIG
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
HAS_ATTRIBUTE_SIG	TokenNameIdentifier	 HAS  ATTRIBUTE  SIG
=	TokenNameEQUAL	
"(II)Z"	TokenNameStringLiteral	(II)Z
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
GET_ITERATOR_SIG	TokenNameIdentifier	 GET  ITERATOR  SIG
=	TokenNameEQUAL	
"()"	TokenNameStringLiteral	()
+	TokenNamePLUS	
NODE_ITERATOR_SIG	TokenNameIdentifier	 NODE  ITERATOR  SIG
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
NAMES_INDEX	TokenNameIdentifier	 NAMES  INDEX
=	TokenNameEQUAL	
"namesArray"	TokenNameStringLiteral	namesArray
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
NAMES_INDEX_SIG	TokenNameIdentifier	 NAMES  INDEX  SIG
=	TokenNameEQUAL	
"["	TokenNameStringLiteral	[
+	TokenNamePLUS	
STRING_SIG	TokenNameIdentifier	 STRING  SIG
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
URIS_INDEX	TokenNameIdentifier	 URIS  INDEX
=	TokenNameEQUAL	
"urisArray"	TokenNameStringLiteral	urisArray
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
URIS_INDEX_SIG	TokenNameIdentifier	 URIS  INDEX  SIG
=	TokenNameEQUAL	
"["	TokenNameStringLiteral	[
+	TokenNamePLUS	
STRING_SIG	TokenNameIdentifier	 STRING  SIG
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
TYPES_INDEX	TokenNameIdentifier	 TYPES  INDEX
=	TokenNameEQUAL	
"typesArray"	TokenNameStringLiteral	typesArray
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
TYPES_INDEX_SIG	TokenNameIdentifier	 TYPES  INDEX  SIG
=	TokenNameEQUAL	
"[I"	TokenNameStringLiteral	[I
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
NAMESPACE_INDEX	TokenNameIdentifier	 NAMESPACE  INDEX
=	TokenNameEQUAL	
"namespaceArray"	TokenNameStringLiteral	namespaceArray
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
NAMESPACE_INDEX_SIG	TokenNameIdentifier	 NAMESPACE  INDEX  SIG
=	TokenNameEQUAL	
"["	TokenNameStringLiteral	[
+	TokenNamePLUS	
STRING_SIG	TokenNameIdentifier	 STRING  SIG
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
NS_ANCESTORS_INDEX_SIG	TokenNameIdentifier	 NS  ANCESTORS  INDEX  SIG
=	TokenNameEQUAL	
"[I"	TokenNameStringLiteral	[I
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
PREFIX_URIS_IDX_SIG	TokenNameIdentifier	 PREFIX  URIS  IDX  SIG
=	TokenNameEQUAL	
"[I"	TokenNameStringLiteral	[I
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
PREFIX_URIS_ARRAY_SIG	TokenNameIdentifier	 PREFIX  URIS  ARRAY  SIG
=	TokenNameEQUAL	
"["	TokenNameStringLiteral	[
+	TokenNamePLUS	
STRING_SIG	TokenNameIdentifier	 STRING  SIG
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
HASIDCALL_INDEX	TokenNameIdentifier	 HASIDCALL  INDEX
=	TokenNameEQUAL	
"_hasIdCall"	TokenNameStringLiteral	_hasIdCall
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
HASIDCALL_INDEX_SIG	TokenNameIdentifier	 HASIDCALL  INDEX  SIG
=	TokenNameEQUAL	
"Z"	TokenNameStringLiteral	Z
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
TRANSLET_VERSION_INDEX	TokenNameIdentifier	 TRANSLET  VERSION  INDEX
=	TokenNameEQUAL	
"transletVersion"	TokenNameStringLiteral	transletVersion
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
TRANSLET_VERSION_INDEX_SIG	TokenNameIdentifier	 TRANSLET  VERSION  INDEX  SIG
=	TokenNameEQUAL	
"I"	TokenNameStringLiteral	I
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
LOOKUP_STYLESHEET_QNAME_NS_REF	TokenNameIdentifier	 LOOKUP  STYLESHEET  QNAME  NS  REF
=	TokenNameEQUAL	
"lookupStylesheetQNameNamespace"	TokenNameStringLiteral	lookupStylesheetQNameNamespace
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
LOOKUP_STYLESHEET_QNAME_NS_SIG	TokenNameIdentifier	 LOOKUP  STYLESHEET  QNAME  NS  SIG
=	TokenNameEQUAL	
"("	TokenNameStringLiteral	(
+	TokenNamePLUS	
STRING_SIG	TokenNameIdentifier	 STRING  SIG
+	TokenNamePLUS	
"I"	TokenNameStringLiteral	I
+	TokenNamePLUS	
NS_ANCESTORS_INDEX_SIG	TokenNameIdentifier	 NS  ANCESTORS  INDEX  SIG
+	TokenNamePLUS	
PREFIX_URIS_IDX_SIG	TokenNameIdentifier	 PREFIX  URIS  IDX  SIG
+	TokenNamePLUS	
PREFIX_URIS_ARRAY_SIG	TokenNameIdentifier	 PREFIX  URIS  ARRAY  SIG
+	TokenNamePLUS	
"Z)"	TokenNameStringLiteral	Z)
+	TokenNamePLUS	
STRING_SIG	TokenNameIdentifier	 STRING  SIG
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
EXPAND_STYLESHEET_QNAME_REF	TokenNameIdentifier	 EXPAND  STYLESHEET  QNAME  REF
=	TokenNameEQUAL	
"expandStylesheetQNameRef"	TokenNameStringLiteral	expandStylesheetQNameRef
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
EXPAND_STYLESHEET_QNAME_SIG	TokenNameIdentifier	 EXPAND  STYLESHEET  QNAME  SIG
=	TokenNameEQUAL	
"("	TokenNameStringLiteral	(
+	TokenNamePLUS	
STRING_SIG	TokenNameIdentifier	 STRING  SIG
+	TokenNamePLUS	
"I"	TokenNameStringLiteral	I
+	TokenNamePLUS	
NS_ANCESTORS_INDEX_SIG	TokenNameIdentifier	 NS  ANCESTORS  INDEX  SIG
+	TokenNamePLUS	
PREFIX_URIS_IDX_SIG	TokenNameIdentifier	 PREFIX  URIS  IDX  SIG
+	TokenNamePLUS	
PREFIX_URIS_ARRAY_SIG	TokenNameIdentifier	 PREFIX  URIS  ARRAY  SIG
+	TokenNamePLUS	
"Z)"	TokenNameStringLiteral	Z)
+	TokenNamePLUS	
STRING_SIG	TokenNameIdentifier	 STRING  SIG
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
DOM_FIELD	TokenNameIdentifier	 DOM  FIELD
=	TokenNameEQUAL	
"_dom"	TokenNameStringLiteral	_dom
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
STATIC_NAMES_ARRAY_FIELD	TokenNameIdentifier	 STATIC  NAMES  ARRAY  FIELD
=	TokenNameEQUAL	
"_sNamesArray"	TokenNameStringLiteral	_sNamesArray
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
STATIC_URIS_ARRAY_FIELD	TokenNameIdentifier	 STATIC  URIS  ARRAY  FIELD
=	TokenNameEQUAL	
"_sUrisArray"	TokenNameStringLiteral	_sUrisArray
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
STATIC_TYPES_ARRAY_FIELD	TokenNameIdentifier	 STATIC  TYPES  ARRAY  FIELD
=	TokenNameEQUAL	
"_sTypesArray"	TokenNameStringLiteral	_sTypesArray
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
STATIC_NAMESPACE_ARRAY_FIELD	TokenNameIdentifier	 STATIC  NAMESPACE  ARRAY  FIELD
=	TokenNameEQUAL	
"_sNamespaceArray"	TokenNameStringLiteral	_sNamespaceArray
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
STATIC_NS_ANCESTORS_ARRAY_FIELD	TokenNameIdentifier	 STATIC  NS  ANCESTORS  ARRAY  FIELD
=	TokenNameEQUAL	
"_sNamespaceAncestorsArray"	TokenNameStringLiteral	_sNamespaceAncestorsArray
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
STATIC_PREFIX_URIS_IDX_ARRAY_FIELD	TokenNameIdentifier	 STATIC  PREFIX  URIS  IDX  ARRAY  FIELD
=	TokenNameEQUAL	
"_sPrefixURIsIdxArray"	TokenNameStringLiteral	_sPrefixURIsIdxArray
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
STATIC_PREFIX_URIS_ARRAY_FIELD	TokenNameIdentifier	 STATIC  PREFIX  URIS  ARRAY  FIELD
=	TokenNameEQUAL	
"_sPrefixURIPairsArray"	TokenNameStringLiteral	_sPrefixURIPairsArray
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
STATIC_CHAR_DATA_FIELD	TokenNameIdentifier	 STATIC  CHAR  DATA  FIELD
=	TokenNameEQUAL	
"_scharData"	TokenNameStringLiteral	_scharData
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
STATIC_CHAR_DATA_FIELD_SIG	TokenNameIdentifier	 STATIC  CHAR  DATA  FIELD  SIG
=	TokenNameEQUAL	
"[C"	TokenNameStringLiteral	[C
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
FORMAT_SYMBOLS_FIELD	TokenNameIdentifier	 FORMAT  SYMBOLS  FIELD
=	TokenNameEQUAL	
"format_symbols"	TokenNameStringLiteral	format_symbols
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ITERATOR_FIELD_SIG	TokenNameIdentifier	 ITERATOR  FIELD  SIG
=	TokenNameEQUAL	
NODE_ITERATOR_SIG	TokenNameIdentifier	 NODE  ITERATOR  SIG
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
NODE_FIELD	TokenNameIdentifier	 NODE  FIELD
=	TokenNameEQUAL	
"node"	TokenNameStringLiteral	node
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
NODE_FIELD_SIG	TokenNameIdentifier	 NODE  FIELD  SIG
=	TokenNameEQUAL	
"I"	TokenNameStringLiteral	I
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
EMPTYATTR_FIELD	TokenNameIdentifier	 EMPTYATTR  FIELD
=	TokenNameEQUAL	
"EmptyAttributes"	TokenNameStringLiteral	EmptyAttributes
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ATTRIBUTE_LIST_FIELD	TokenNameIdentifier	 ATTRIBUTE  LIST  FIELD
=	TokenNameEQUAL	
"attributeList"	TokenNameStringLiteral	attributeList
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
CLEAR_ATTRIBUTES	TokenNameIdentifier	 CLEAR  ATTRIBUTES
=	TokenNameEQUAL	
"clear"	TokenNameStringLiteral	clear
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ADD_ATTRIBUTE	TokenNameIdentifier	 ADD  ATTRIBUTE
=	TokenNameEQUAL	
"addAttribute"	TokenNameStringLiteral	addAttribute
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ATTRIBUTE_LIST_IMPL_SIG	TokenNameIdentifier	 ATTRIBUTE  LIST  IMPL  SIG
=	TokenNameEQUAL	
"Lorg/apache/xalan/xsltc/runtime/AttributeListImpl;"	TokenNameStringLiteral	Lorg/apache/xalan/xsltc/runtime/AttributeListImpl;
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
CLEAR_ATTRIBUTES_SIG	TokenNameIdentifier	 CLEAR  ATTRIBUTES  SIG
=	TokenNameEQUAL	
"()"	TokenNameStringLiteral	()
+	TokenNamePLUS	
ATTRIBUTE_LIST_IMPL_SIG	TokenNameIdentifier	 ATTRIBUTE  LIST  IMPL  SIG
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ADD_ATTRIBUTE_SIG	TokenNameIdentifier	 ADD  ATTRIBUTE  SIG
=	TokenNameEQUAL	
"("	TokenNameStringLiteral	(
+	TokenNamePLUS	
STRING_SIG	TokenNameIdentifier	 STRING  SIG
+	TokenNamePLUS	
STRING_SIG	TokenNameIdentifier	 STRING  SIG
+	TokenNamePLUS	
")"	TokenNameStringLiteral	)
+	TokenNamePLUS	
ATTRIBUTE_LIST_IMPL_SIG	TokenNameIdentifier	 ATTRIBUTE  LIST  IMPL  SIG
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ADD_ITERATOR_SIG	TokenNameIdentifier	 ADD  ITERATOR  SIG
=	TokenNameEQUAL	
"("	TokenNameStringLiteral	(
+	TokenNamePLUS	
NODE_ITERATOR_SIG	TokenNameIdentifier	 NODE  ITERATOR  SIG
+	TokenNamePLUS	
")"	TokenNameStringLiteral	)
+	TokenNamePLUS	
UNION_ITERATOR_SIG	TokenNameIdentifier	 UNION  ITERATOR  SIG
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ORDER_ITERATOR	TokenNameIdentifier	 ORDER  ITERATOR
=	TokenNameEQUAL	
"orderNodes"	TokenNameStringLiteral	orderNodes
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ORDER_ITERATOR_SIG	TokenNameIdentifier	 ORDER  ITERATOR  SIG
=	TokenNameEQUAL	
"("	TokenNameStringLiteral	(
+	TokenNamePLUS	
NODE_ITERATOR_SIG	TokenNameIdentifier	 NODE  ITERATOR  SIG
+	TokenNamePLUS	
"I)"	TokenNameStringLiteral	I)
+	TokenNamePLUS	
NODE_ITERATOR_SIG	TokenNameIdentifier	 NODE  ITERATOR  SIG
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
SET_START_NODE_SIG	TokenNameIdentifier	 SET  START  NODE  SIG
=	TokenNameEQUAL	
"("	TokenNameStringLiteral	(
+	TokenNamePLUS	
NODE_SIG	TokenNameIdentifier	 NODE  SIG
+	TokenNamePLUS	
")"	TokenNameStringLiteral	)
+	TokenNamePLUS	
NODE_ITERATOR_SIG	TokenNameIdentifier	 NODE  ITERATOR  SIG
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
NODE_COUNTER	TokenNameIdentifier	 NODE  COUNTER
=	TokenNameEQUAL	
"org.apache.xalan.xsltc.dom.NodeCounter"	TokenNameStringLiteral	org.apache.xalan.xsltc.dom.NodeCounter
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
NODE_COUNTER_SIG	TokenNameIdentifier	 NODE  COUNTER  SIG
=	TokenNameEQUAL	
"Lorg/apache/xalan/xsltc/dom/NodeCounter;"	TokenNameStringLiteral	Lorg/apache/xalan/xsltc/dom/NodeCounter;
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
DEFAULT_NODE_COUNTER	TokenNameIdentifier	 DEFAULT  NODE  COUNTER
=	TokenNameEQUAL	
"org.apache.xalan.xsltc.dom.DefaultNodeCounter"	TokenNameStringLiteral	org.apache.xalan.xsltc.dom.DefaultNodeCounter
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
DEFAULT_NODE_COUNTER_SIG	TokenNameIdentifier	 DEFAULT  NODE  COUNTER  SIG
=	TokenNameEQUAL	
"Lorg/apache/xalan/xsltc/dom/DefaultNodeCounter;"	TokenNameStringLiteral	Lorg/apache/xalan/xsltc/dom/DefaultNodeCounter;
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
TRANSLET_FIELD	TokenNameIdentifier	 TRANSLET  FIELD
=	TokenNameEQUAL	
"translet"	TokenNameStringLiteral	translet
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
TRANSLET_FIELD_SIG	TokenNameIdentifier	 TRANSLET  FIELD  SIG
=	TokenNameEQUAL	
TRANSLET_SIG	TokenNameIdentifier	 TRANSLET  SIG
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
RESET_SIG	TokenNameIdentifier	 RESET  SIG
=	TokenNameEQUAL	
"()"	TokenNameStringLiteral	()
+	TokenNamePLUS	
NODE_ITERATOR_SIG	TokenNameIdentifier	 NODE  ITERATOR  SIG
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
GET_PARAMETER	TokenNameIdentifier	 GET  PARAMETER
=	TokenNameEQUAL	
"getParameter"	TokenNameStringLiteral	getParameter
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ADD_PARAMETER	TokenNameIdentifier	 ADD  PARAMETER
=	TokenNameEQUAL	
"addParameter"	TokenNameStringLiteral	addParameter
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
PUSH_PARAM_FRAME	TokenNameIdentifier	 PUSH  PARAM  FRAME
=	TokenNameEQUAL	
"pushParamFrame"	TokenNameStringLiteral	pushParamFrame
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
PUSH_PARAM_FRAME_SIG	TokenNameIdentifier	 PUSH  PARAM  FRAME  SIG
=	TokenNameEQUAL	
"()V"	TokenNameStringLiteral	()V
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
POP_PARAM_FRAME	TokenNameIdentifier	 POP  PARAM  FRAME
=	TokenNameEQUAL	
"popParamFrame"	TokenNameStringLiteral	popParamFrame
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
POP_PARAM_FRAME_SIG	TokenNameIdentifier	 POP  PARAM  FRAME  SIG
=	TokenNameEQUAL	
"()V"	TokenNameStringLiteral	()V
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
GET_PARAMETER_SIG	TokenNameIdentifier	 GET  PARAMETER  SIG
=	TokenNameEQUAL	
"("	TokenNameStringLiteral	(
+	TokenNamePLUS	
STRING_SIG	TokenNameIdentifier	 STRING  SIG
+	TokenNamePLUS	
")"	TokenNameStringLiteral	)
+	TokenNamePLUS	
OBJECT_SIG	TokenNameIdentifier	 OBJECT  SIG
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ADD_PARAMETER_SIG	TokenNameIdentifier	 ADD  PARAMETER  SIG
=	TokenNameEQUAL	
"("	TokenNameStringLiteral	(
+	TokenNamePLUS	
STRING_SIG	TokenNameIdentifier	 STRING  SIG
+	TokenNamePLUS	
OBJECT_SIG	TokenNameIdentifier	 OBJECT  SIG
+	TokenNamePLUS	
"Z)"	TokenNameStringLiteral	Z)
+	TokenNamePLUS	
OBJECT_SIG	TokenNameIdentifier	 OBJECT  SIG
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
STRIP_SPACE	TokenNameIdentifier	 STRIP  SPACE
=	TokenNameEQUAL	
"stripSpace"	TokenNameStringLiteral	stripSpace
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
STRIP_SPACE_INTF	TokenNameIdentifier	 STRIP  SPACE  INTF
=	TokenNameEQUAL	
"org/apache/xalan/xsltc/StripFilter"	TokenNameStringLiteral	org/apache/xalan/xsltc/StripFilter
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
STRIP_SPACE_SIG	TokenNameIdentifier	 STRIP  SPACE  SIG
=	TokenNameEQUAL	
"Lorg/apache/xalan/xsltc/StripFilter;"	TokenNameStringLiteral	Lorg/apache/xalan/xsltc/StripFilter;
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
STRIP_SPACE_PARAMS	TokenNameIdentifier	 STRIP  SPACE  PARAMS
=	TokenNameEQUAL	
"(Lorg/apache/xalan/xsltc/DOM;II)Z"	TokenNameStringLiteral	(Lorg/apache/xalan/xsltc/DOM;II)Z
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
GET_NODE_VALUE_ITERATOR	TokenNameIdentifier	 GET  NODE  VALUE  ITERATOR
=	TokenNameEQUAL	
"getNodeValueIterator"	TokenNameStringLiteral	getNodeValueIterator
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
GET_NODE_VALUE_ITERATOR_SIG	TokenNameIdentifier	 GET  NODE  VALUE  ITERATOR  SIG
=	TokenNameEQUAL	
"("	TokenNameStringLiteral	(
+	TokenNamePLUS	
NODE_ITERATOR_SIG	TokenNameIdentifier	 NODE  ITERATOR  SIG
+	TokenNamePLUS	
"I"	TokenNameStringLiteral	I
+	TokenNamePLUS	
STRING_SIG	TokenNameIdentifier	 STRING  SIG
+	TokenNamePLUS	
"Z)"	TokenNameStringLiteral	Z)
+	TokenNamePLUS	
NODE_ITERATOR_SIG	TokenNameIdentifier	 NODE  ITERATOR  SIG
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
GET_UNPARSED_ENTITY_URI_SIG	TokenNameIdentifier	 GET  UNPARSED  ENTITY  URI  SIG
=	TokenNameEQUAL	
"("	TokenNameStringLiteral	(
+	TokenNamePLUS	
STRING_SIG	TokenNameIdentifier	 STRING  SIG
+	TokenNamePLUS	
")"	TokenNameStringLiteral	)
+	TokenNamePLUS	
STRING_SIG	TokenNameIdentifier	 STRING  SIG
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
POSITION_INDEX	TokenNameIdentifier	 POSITION  INDEX
=	TokenNameEQUAL	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
LAST_INDEX	TokenNameIdentifier	 LAST  INDEX
=	TokenNameEQUAL	
3	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
XMLNS_PREFIX	TokenNameIdentifier	 XMLNS  PREFIX
=	TokenNameEQUAL	
"xmlns"	TokenNameStringLiteral	xmlns
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
XMLNS_STRING	TokenNameIdentifier	 XMLNS  STRING
=	TokenNameEQUAL	
"xmlns:"	TokenNameStringLiteral	xmlns:
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
XMLNS_URI	TokenNameIdentifier	 XMLNS  URI
=	TokenNameEQUAL	
"http://www.w3.org/2000/xmlns/"	TokenNameStringLiteral	http://www.w3.org/2000/xmlns/
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
XSLT_URI	TokenNameIdentifier	 XSLT  URI
=	TokenNameEQUAL	
"http://www.w3.org/1999/XSL/Transform"	TokenNameStringLiteral	http://www.w3.org/1999/XSL/Transform
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
XHTML_URI	TokenNameIdentifier	 XHTML  URI
=	TokenNameEQUAL	
"http://www.w3.org/1999/xhtml"	TokenNameStringLiteral	http://www.w3.org/1999/xhtml
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
TRANSLET_URI	TokenNameIdentifier	 TRANSLET  URI
=	TokenNameEQUAL	
"http://xml.apache.org/xalan/xsltc"	TokenNameStringLiteral	http://xml.apache.org/xalan/xsltc
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
REDIRECT_URI	TokenNameIdentifier	 REDIRECT  URI
=	TokenNameEQUAL	
"http://xml.apache.org/xalan/redirect"	TokenNameStringLiteral	http://xml.apache.org/xalan/redirect
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
FALLBACK_CLASS	TokenNameIdentifier	 FALLBACK  CLASS
=	TokenNameEQUAL	
"org.apache.xalan.xsltc.compiler.Fallback"	TokenNameStringLiteral	org.apache.xalan.xsltc.compiler.Fallback
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
RTF_INITIAL_SIZE	TokenNameIdentifier	 RTF  INITIAL  SIZE
=	TokenNameEQUAL	
32	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
