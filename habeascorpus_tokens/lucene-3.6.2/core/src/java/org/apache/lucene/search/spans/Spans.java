package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
search	TokenNameIdentifier	 search
.	TokenNameDOT	
spans	TokenNameIdentifier	 spans
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
Collection	TokenNameIdentifier	 Collection
;	TokenNameSEMICOLON	
/** Expert: an enumeration of span matches. Used to implement span searching. * Each span represents a range of term positions within a document. Matches * are enumerated in order, by increasing document number, within that by * increasing start position and finally by increasing end position. */	TokenNameCOMMENT_JAVADOC	 Expert: an enumeration of span matches. Used to implement span searching. Each span represents a range of term positions within a document. Matches are enumerated in order, by increasing document number, within that by increasing start position and finally by increasing end position. 
public	TokenNamepublic	
abstract	TokenNameabstract	
class	TokenNameclass	
Spans	TokenNameIdentifier	 Spans
{	TokenNameLBRACE	
/** Move to the next match, returning true iff any such exists. */	TokenNameCOMMENT_JAVADOC	 Move to the next match, returning true iff any such exists. 
public	TokenNamepublic	
abstract	TokenNameabstract	
boolean	TokenNameboolean	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
;	TokenNameSEMICOLON	
/** Skips to the first match beyond the current, whose document number is * greater than or equal to <i>target</i>. <p>Returns true iff there is such * a match. <p>Behaves as if written: <pre> * boolean skipTo(int target) { * do { * if (!next()) * return false; * } while (target > doc()); * return true; * } * </pre> * Most implementations are considerably more efficient than that. */	TokenNameCOMMENT_JAVADOC	 Skips to the first match beyond the current, whose document number is greater than or equal to <i>target</i>. <p>Returns true iff there is such a match. <p>Behaves as if written: <pre> boolean skipTo(int target) { do { if (!next()) return false; } while (target > doc()); return true; } </pre> Most implementations are considerably more efficient than that. 
public	TokenNamepublic	
abstract	TokenNameabstract	
boolean	TokenNameboolean	
skipTo	TokenNameIdentifier	 skip To
(	TokenNameLPAREN	
int	TokenNameint	
target	TokenNameIdentifier	 target
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
;	TokenNameSEMICOLON	
/** Returns the document number of the current match. Initially invalid. */	TokenNameCOMMENT_JAVADOC	 Returns the document number of the current match. Initially invalid. 
public	TokenNamepublic	
abstract	TokenNameabstract	
int	TokenNameint	
doc	TokenNameIdentifier	 doc
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** Returns the start position of the current match. Initially invalid. */	TokenNameCOMMENT_JAVADOC	 Returns the start position of the current match. Initially invalid. 
public	TokenNamepublic	
abstract	TokenNameabstract	
int	TokenNameint	
start	TokenNameIdentifier	 start
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** Returns the end position of the current match. Initially invalid. */	TokenNameCOMMENT_JAVADOC	 Returns the end position of the current match. Initially invalid. 
public	TokenNamepublic	
abstract	TokenNameabstract	
int	TokenNameint	
end	TokenNameIdentifier	 end
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Returns the payload data for the current span. * This is invalid until {@link #next()} is called for * the first time. * This method must not be called more than once after each call * of {@link #next()}. However, most payloads are loaded lazily, * so if the payload data for the current position is not needed, * this method may not be called at all for performance reasons. An ordered * SpanQuery does not lazy load, so if you have payloads in your index and * you do not want ordered SpanNearQuerys to collect payloads, you can * disable collection with a constructor option.<br> * <br> * Note that the return type is a collection, thus the ordering should not be relied upon. * <br/> * @lucene.experimental * * @return a List of byte arrays containing the data of this payload, otherwise null if isPayloadAvailable is false * @throws java.io.IOException */	TokenNameCOMMENT_JAVADOC	 Returns the payload data for the current span. This is invalid until {@link #next()} is called for the first time. This method must not be called more than once after each call of {@link #next()}. However, most payloads are loaded lazily, so if the payload data for the current position is not needed, this method may not be called at all for performance reasons. An ordered SpanQuery does not lazy load, so if you have payloads in your index and you do not want ordered SpanNearQuerys to collect payloads, you can disable collection with a constructor option.<br> <br> Note that the return type is a collection, thus the ordering should not be relied upon. <br/> @lucene.experimental * @return a List of byte arrays containing the data of this payload, otherwise null if isPayloadAvailable is false @throws java.io.IOException 
// TODO: Remove warning after API has been finalized 	TokenNameCOMMENT_LINE	TODO: Remove warning after API has been finalized 
public	TokenNamepublic	
abstract	TokenNameabstract	
Collection	TokenNameIdentifier	 Collection
<	TokenNameLESS	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
>	TokenNameGREATER	
getPayload	TokenNameIdentifier	 get Payload
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
;	TokenNameSEMICOLON	
/** * Checks if a payload can be loaded at this position. * <p/> * Payloads can only be loaded once per call to * {@link #next()}. * * @return true if there is a payload available at this position that can be loaded */	TokenNameCOMMENT_JAVADOC	 Checks if a payload can be loaded at this position. <p/> Payloads can only be loaded once per call to {@link #next()}. * @return true if there is a payload available at this position that can be loaded 
public	TokenNamepublic	
abstract	TokenNameabstract	
boolean	TokenNameboolean	
isPayloadAvailable	TokenNameIdentifier	 is Payload Available
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
