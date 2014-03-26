/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the "License"); * you may not use this file except in compliance with the License. * You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/* * $Id: ProcessorUnknown.java 468640 2006-10-28 06:53:53Z minchau $ */	TokenNameCOMMENT_BLOCK	 $Id: ProcessorUnknown.java 468640 2006-10-28 06:53:53Z minchau $ 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xalan	TokenNameIdentifier	 xalan
.	TokenNameDOT	
processor	TokenNameIdentifier	 processor
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
sax	TokenNameIdentifier	 sax
.	TokenNameDOT	
Attributes	TokenNameIdentifier	 Attributes
;	TokenNameSEMICOLON	
/** * This class processes an unknown template element. It is used both * for unknown top-level elements, and for elements in the * xslt namespace when the version is higher than the version * of XSLT that we are set up to process. * @xsl.usage internal */	TokenNameCOMMENT_JAVADOC	 This class processes an unknown template element. It is used both for unknown top-level elements, and for elements in the xslt namespace when the version is higher than the version of XSLT that we are set up to process. @xsl.usage internal 
public	TokenNamepublic	
class	TokenNameclass	
ProcessorUnknown	TokenNameIdentifier	 Processor Unknown
extends	TokenNameextends	
ProcessorLRE	TokenNameIdentifier	 Processor LRE
{	TokenNameLBRACE	
static	TokenNamestatic	
final	TokenNamefinal	
long	TokenNamelong	
serialVersionUID	TokenNameIdentifier	 serial Version UID
=	TokenNameEQUAL	
600521151487682248L	TokenNameLongLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
