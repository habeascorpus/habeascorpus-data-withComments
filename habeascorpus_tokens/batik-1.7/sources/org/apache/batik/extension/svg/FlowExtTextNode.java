/* Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
batik	TokenNameIdentifier	 batik
.	TokenNameDOT	
extension	TokenNameIdentifier	 extension
.	TokenNameDOT	
svg	TokenNameIdentifier	 svg
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
batik	TokenNameIdentifier	 batik
.	TokenNameDOT	
gvt	TokenNameIdentifier	 gvt
.	TokenNameDOT	
TextNode	TokenNameIdentifier	 Text Node
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
batik	TokenNameIdentifier	 batik
.	TokenNameDOT	
gvt	TokenNameIdentifier	 gvt
.	TokenNameDOT	
TextPainter	TokenNameIdentifier	 Text Painter
;	TokenNameSEMICOLON	
/** * One line Class Desc * * Complete Class Desc * * @author <a href="mailto:deweese@apache.org">deweese</a> * @version $Id: FlowExtTextNode.java 478276 2006-11-22 18:33:37Z dvholten $ */	TokenNameCOMMENT_JAVADOC	 One line Class Desc * Complete Class Desc * @author <a href="mailto:deweese@apache.org">deweese</a> @version $Id: FlowExtTextNode.java 478276 2006-11-22 18:33:37Z dvholten $ 
public	TokenNamepublic	
class	TokenNameclass	
FlowExtTextNode	TokenNameIdentifier	 Flow Ext Text Node
extends	TokenNameextends	
TextNode	TokenNameIdentifier	 Text Node
{	TokenNameLBRACE	
public	TokenNamepublic	
FlowExtTextNode	TokenNameIdentifier	 Flow Ext Text Node
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
textPainter	TokenNameIdentifier	 text Painter
=	TokenNameEQUAL	
FlowExtTextPainter	TokenNameIdentifier	 Flow Ext Text Painter
.	TokenNameDOT	
getInstance	TokenNameIdentifier	 get Instance
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setTextPainter	TokenNameIdentifier	 set Text Painter
(	TokenNameLPAREN	
TextPainter	TokenNameIdentifier	 Text Painter
textPainter	TokenNameIdentifier	 text Painter
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
textPainter	TokenNameIdentifier	 text Painter
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
this	TokenNamethis	
.	TokenNameDOT	
textPainter	TokenNameIdentifier	 text Painter
=	TokenNameEQUAL	
FlowExtTextPainter	TokenNameIdentifier	 Flow Ext Text Painter
.	TokenNameDOT	
getInstance	TokenNameIdentifier	 get Instance
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
this	TokenNamethis	
.	TokenNameDOT	
textPainter	TokenNameIdentifier	 text Painter
=	TokenNameEQUAL	
textPainter	TokenNameIdentifier	 text Painter
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
