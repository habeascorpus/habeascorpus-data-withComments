/* Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
batik	TokenNameIdentifier	 batik
.	TokenNameDOT	
gvt	TokenNameIdentifier	 gvt
.	TokenNameDOT	
text	TokenNameIdentifier	 text
;	TokenNameSEMICOLON	
/** * Class that encapsulates information returned from hit testing * a <tt>TextSpanLayout</tt> instance. * @see org.apache.batik.gvt.text.TextSpanLayout * * @author <a href="mailto:bill.haneman@ireland.sun.com">Bill Haneman</a> * @version $Id: TextHit.java 475477 2006-11-15 22:44:28Z cam $ */	TokenNameCOMMENT_JAVADOC	 Class that encapsulates information returned from hit testing a <tt>TextSpanLayout</tt> instance. @see org.apache.batik.gvt.text.TextSpanLayout * @author <a href="mailto:bill.haneman@ireland.sun.com">Bill Haneman</a> @version $Id: TextHit.java 475477 2006-11-15 22:44:28Z cam $ 
public	TokenNamepublic	
class	TokenNameclass	
TextHit	TokenNameIdentifier	 Text Hit
{	TokenNameLBRACE	
private	TokenNameprivate	
int	TokenNameint	
charIndex	TokenNameIdentifier	 char Index
;	TokenNameSEMICOLON	
private	TokenNameprivate	
boolean	TokenNameboolean	
leadingEdge	TokenNameIdentifier	 leading Edge
;	TokenNameSEMICOLON	
/** * Constructs a TextHit with the specified values. * * @param charIndex The index of the character that has been * hit. In the case of bidirectional text this will be the logical * character index not the visual index. The index is relative to * whole text within the selected TextNode. * @param leadingEdge Indicates which side of the character has * been hit. */	TokenNameCOMMENT_JAVADOC	 Constructs a TextHit with the specified values. * @param charIndex The index of the character that has been hit. In the case of bidirectional text this will be the logical character index not the visual index. The index is relative to whole text within the selected TextNode. @param leadingEdge Indicates which side of the character has been hit. 
public	TokenNamepublic	
TextHit	TokenNameIdentifier	 Text Hit
(	TokenNameLPAREN	
int	TokenNameint	
charIndex	TokenNameIdentifier	 char Index
,	TokenNameCOMMA	
boolean	TokenNameboolean	
leadingEdge	TokenNameIdentifier	 leading Edge
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
charIndex	TokenNameIdentifier	 char Index
=	TokenNameEQUAL	
charIndex	TokenNameIdentifier	 char Index
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
leadingEdge	TokenNameIdentifier	 leading Edge
=	TokenNameEQUAL	
leadingEdge	TokenNameIdentifier	 leading Edge
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the index of the character that has been hit. * * @return The character index. */	TokenNameCOMMENT_JAVADOC	 Returns the index of the character that has been hit. * @return The character index. 
public	TokenNamepublic	
int	TokenNameint	
getCharIndex	TokenNameIdentifier	 get Char Index
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
charIndex	TokenNameIdentifier	 char Index
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns whether on not the character has been hit on its leading edge. * * @return Whether on not the character has been hit on its leading edge. */	TokenNameCOMMENT_JAVADOC	 Returns whether on not the character has been hit on its leading edge. * @return Whether on not the character has been hit on its leading edge. 
public	TokenNamepublic	
boolean	TokenNameboolean	
isLeadingEdge	TokenNameIdentifier	 is Leading Edge
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
leadingEdge	TokenNameIdentifier	 leading Edge
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
