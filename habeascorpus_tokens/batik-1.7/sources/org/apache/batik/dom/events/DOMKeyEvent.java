/* Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
batik	TokenNameIdentifier	 batik
.	TokenNameDOT	
dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
events	TokenNameIdentifier	 events
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
w3c	TokenNameIdentifier	 w3c
.	TokenNameDOT	
dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
views	TokenNameIdentifier	 views
.	TokenNameDOT	
AbstractView	TokenNameIdentifier	 Abstract View
;	TokenNameSEMICOLON	
/** * The <code>KeyEvent</code> interface provides specific contextual * information associated with Key events. * * @author <a href="mailto:tkormann@ilog.fr">Thierry Kormann</a> * @version $Id: DOMKeyEvent.java 475477 2006-11-15 22:44:28Z cam $ * @since DOM Level 2 (Working Draft) */	TokenNameCOMMENT_JAVADOC	 The <code>KeyEvent</code> interface provides specific contextual information associated with Key events. * @author <a href="mailto:tkormann@ilog.fr">Thierry Kormann</a> @version $Id: DOMKeyEvent.java 475477 2006-11-15 22:44:28Z cam $ @since DOM Level 2 (Working Draft) 
public	TokenNamepublic	
class	TokenNameclass	
DOMKeyEvent	TokenNameIdentifier	 DOM Key Event
extends	TokenNameextends	
DOMUIEvent	TokenNameIdentifier	 DOMUI Event
{	TokenNameLBRACE	
// VirtualKeyCode 	TokenNameCOMMENT_LINE	VirtualKeyCode 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
CHAR_UNDEFINED	TokenNameIdentifier	 CHAR  UNDEFINED
=	TokenNameEQUAL	
0x0FFFF	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
DOM_VK_0	TokenNameIdentifier	 DOM  VK 0
=	TokenNameEQUAL	
0x30	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
DOM_VK_1	TokenNameIdentifier	 DOM  VK 1
=	TokenNameEQUAL	
0x31	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
DOM_VK_2	TokenNameIdentifier	 DOM  VK 2
=	TokenNameEQUAL	
0x32	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
DOM_VK_3	TokenNameIdentifier	 DOM  VK 3
=	TokenNameEQUAL	
0x33	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
DOM_VK_4	TokenNameIdentifier	 DOM  VK 4
=	TokenNameEQUAL	
0x34	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
DOM_VK_5	TokenNameIdentifier	 DOM  VK 5
=	TokenNameEQUAL	
0x35	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
DOM_VK_6	TokenNameIdentifier	 DOM  VK 6
=	TokenNameEQUAL	
0x36	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
DOM_VK_7	TokenNameIdentifier	 DOM  VK 7
=	TokenNameEQUAL	
0x37	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
DOM_VK_8	TokenNameIdentifier	 DOM  VK 8
=	TokenNameEQUAL	
0x38	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
DOM_VK_9	TokenNameIdentifier	 DOM  VK 9
=	TokenNameEQUAL	
0x39	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
DOM_VK_A	TokenNameIdentifier	 DOM  VK  A
=	TokenNameEQUAL	
0x41	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
DOM_VK_ACCEPT	TokenNameIdentifier	 DOM  VK  ACCEPT
=	TokenNameEQUAL	
0x1E	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
DOM_VK_ADD	TokenNameIdentifier	 DOM  VK  ADD
=	TokenNameEQUAL	
0x6B	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
DOM_VK_AGAIN	TokenNameIdentifier	 DOM  VK  AGAIN
=	TokenNameEQUAL	
0xFFC9	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
DOM_VK_ALL_CANDIDATES	TokenNameIdentifier	 DOM  VK  ALL  CANDIDATES
=	TokenNameEQUAL	
0x0100	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
DOM_VK_ALPHANUMERIC	TokenNameIdentifier	 DOM  VK  ALPHANUMERIC
=	TokenNameEQUAL	
0x00F0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
DOM_VK_ALT	TokenNameIdentifier	 DOM  VK  ALT
=	TokenNameEQUAL	
0x12	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
DOM_VK_ALT_GRAPH	TokenNameIdentifier	 DOM  VK  ALT  GRAPH
=	TokenNameEQUAL	
0xFF7E	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
DOM_VK_AMPERSAND	TokenNameIdentifier	 DOM  VK  AMPERSAND
=	TokenNameEQUAL	
0x96	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
DOM_VK_ASTERISK	TokenNameIdentifier	 DOM  VK  ASTERISK
=	TokenNameEQUAL	
0x97	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
DOM_VK_AT	TokenNameIdentifier	 DOM  VK  AT
=	TokenNameEQUAL	
0x0200	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
DOM_VK_B	TokenNameIdentifier	 DOM  VK  B
=	TokenNameEQUAL	
0x42	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
DOM_VK_BACK_QUOTE	TokenNameIdentifier	 DOM  VK  BACK  QUOTE
=	TokenNameEQUAL	
0xC0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
DOM_VK_BACK_SLASH	TokenNameIdentifier	 DOM  VK  BACK  SLASH
=	TokenNameEQUAL	
0x5C	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
DOM_VK_BACK_SPACE	TokenNameIdentifier	 DOM  VK  BACK  SPACE
=	TokenNameEQUAL	
0x08	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
DOM_VK_BRACELEFT	TokenNameIdentifier	 DOM  VK  BRACELEFT
=	TokenNameEQUAL	
0xA1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
DOM_VK_BRACERIGHT	TokenNameIdentifier	 DOM  VK  BRACERIGHT
=	TokenNameEQUAL	
0xA2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
DOM_VK_C	TokenNameIdentifier	 DOM  VK  C
=	TokenNameEQUAL	
0x43	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
DOM_VK_CANCEL	TokenNameIdentifier	 DOM  VK  CANCEL
=	TokenNameEQUAL	
0x03	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
DOM_VK_CAPS_LOCK	TokenNameIdentifier	 DOM  VK  CAPS  LOCK
=	TokenNameEQUAL	
0x14	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
DOM_VK_CIRCUMFLEX	TokenNameIdentifier	 DOM  VK  CIRCUMFLEX
=	TokenNameEQUAL	
0x0202	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
DOM_VK_CLEAR	TokenNameIdentifier	 DOM  VK  CLEAR
=	TokenNameEQUAL	
0x0C	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
DOM_VK_CLOSE_BRACKET	TokenNameIdentifier	 DOM  VK  CLOSE  BRACKET
=	TokenNameEQUAL	
0x5D	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
DOM_VK_CODE_INPUT	TokenNameIdentifier	 DOM  VK  CODE  INPUT
=	TokenNameEQUAL	
0x0102	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
DOM_VK_COLON	TokenNameIdentifier	 DOM  VK  COLON
=	TokenNameEQUAL	
0x0201	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
DOM_VK_COMMA	TokenNameIdentifier	 DOM  VK  COMMA
=	TokenNameEQUAL	
0x2C	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
DOM_VK_COMPOSE	TokenNameIdentifier	 DOM  VK  COMPOSE
=	TokenNameEQUAL	
0xFF20	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
DOM_VK_CONTROL	TokenNameIdentifier	 DOM  VK  CONTROL
=	TokenNameEQUAL	
0x11	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
DOM_VK_CONVERT	TokenNameIdentifier	 DOM  VK  CONVERT
=	TokenNameEQUAL	
0x1C	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
DOM_VK_COPY	TokenNameIdentifier	 DOM  VK  COPY
=	TokenNameEQUAL	
0xFFCD	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
DOM_VK_CUT	TokenNameIdentifier	 DOM  VK  CUT
=	TokenNameEQUAL	
0xFFD1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
DOM_VK_D	TokenNameIdentifier	 DOM  VK  D
=	TokenNameEQUAL	
0x44	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
DOM_VK_DEAD_ABOVEDOT	TokenNameIdentifier	 DOM  VK  DEAD  ABOVEDOT
=	TokenNameEQUAL	
0x86	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
DOM_VK_DEAD_ABOVERING	TokenNameIdentifier	 DOM  VK  DEAD  ABOVERING
=	TokenNameEQUAL	
0x88	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
DOM_VK_DEAD_ACUTE	TokenNameIdentifier	 DOM  VK  DEAD  ACUTE
=	TokenNameEQUAL	
0x81	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
DOM_VK_DEAD_BREVE	TokenNameIdentifier	 DOM  VK  DEAD  BREVE
=	TokenNameEQUAL	
0x85	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
DOM_VK_DEAD_CARON	TokenNameIdentifier	 DOM  VK  DEAD  CARON
=	TokenNameEQUAL	
0x8A	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
DOM_VK_DEAD_CEDILLA	TokenNameIdentifier	 DOM  VK  DEAD  CEDILLA
=	TokenNameEQUAL	
0x8B	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
DOM_VK_DEAD_CIRCUMFLEX	TokenNameIdentifier	 DOM  VK  DEAD  CIRCUMFLEX
=	TokenNameEQUAL	
0x82	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
DOM_VK_DEAD_DIAERESIS	TokenNameIdentifier	 DOM  VK  DEAD  DIAERESIS
=	TokenNameEQUAL	
0x87	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
DOM_VK_DEAD_DOUBLEACUTE	TokenNameIdentifier	 DOM  VK  DEAD  DOUBLEACUTE
=	TokenNameEQUAL	
0x89	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
DOM_VK_DEAD_GRAVE	TokenNameIdentifier	 DOM  VK  DEAD  GRAVE
=	TokenNameEQUAL	
0x80	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
DOM_VK_DEAD_IOTA	TokenNameIdentifier	 DOM  VK  DEAD  IOTA
=	TokenNameEQUAL	
0x8D	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
DOM_VK_DEAD_MACRON	TokenNameIdentifier	 DOM  VK  DEAD  MACRON
=	TokenNameEQUAL	
0x84	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
DOM_VK_DEAD_OGONEK	TokenNameIdentifier	 DOM  VK  DEAD  OGONEK
=	TokenNameEQUAL	
0x8C	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
DOM_VK_DEAD_SEMIVOICED_SOUND	TokenNameIdentifier	 DOM  VK  DEAD  SEMIVOICED  SOUND
=	TokenNameEQUAL	
0x8F	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
DOM_VK_DEAD_TILDE	TokenNameIdentifier	 DOM  VK  DEAD  TILDE
=	TokenNameEQUAL	
0x83	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
DOM_VK_DEAD_VOICED_SOUND	TokenNameIdentifier	 DOM  VK  DEAD  VOICED  SOUND
=	TokenNameEQUAL	
0x8E	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
DOM_VK_DECIMAL	TokenNameIdentifier	 DOM  VK  DECIMAL
=	TokenNameEQUAL	
0x6E	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
DOM_VK_DELETE	TokenNameIdentifier	 DOM  VK  DELETE
=	TokenNameEQUAL	
0x7F	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
DOM_VK_DIVIDE	TokenNameIdentifier	 DOM  VK  DIVIDE
=	TokenNameEQUAL	
0x6F	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
DOM_VK_DOLLAR	TokenNameIdentifier	 DOM  VK  DOLLAR
=	TokenNameEQUAL	
0x0203	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
DOM_VK_DOWN	TokenNameIdentifier	 DOM  VK  DOWN
=	TokenNameEQUAL	
0x28	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
DOM_VK_E	TokenNameIdentifier	 DOM  VK  E
=	TokenNameEQUAL	
0x45	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
DOM_VK_END	TokenNameIdentifier	 DOM  VK  END
=	TokenNameEQUAL	
0x23	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
DOM_VK_ENTER	TokenNameIdentifier	 DOM  VK  ENTER
=	TokenNameEQUAL	
0x0D	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
DOM_VK_EQUALS	TokenNameIdentifier	 DOM  VK  EQUALS
=	TokenNameEQUAL	
0x3D	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
DOM_VK_ESCAPE	TokenNameIdentifier	 DOM  VK  ESCAPE
=	TokenNameEQUAL	
0x1B	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
DOM_VK_EURO_SIGN	TokenNameIdentifier	 DOM  VK  EURO  SIGN
=	TokenNameEQUAL	
0x0204	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
DOM_VK_EXCLAMATION_MARK	TokenNameIdentifier	 DOM  VK  EXCLAMATION  MARK
=	TokenNameEQUAL	
0x0205	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
DOM_VK_F	TokenNameIdentifier	 DOM  VK  F
=	TokenNameEQUAL	
0x46	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
DOM_VK_F1	TokenNameIdentifier	 DOM  VK  F1
=	TokenNameEQUAL	
0x70	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
DOM_VK_F10	TokenNameIdentifier	 DOM  VK  F10
=	TokenNameEQUAL	
0x79	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
DOM_VK_F11	TokenNameIdentifier	 DOM  VK  F11
=	TokenNameEQUAL	
0x7A	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
DOM_VK_F12	TokenNameIdentifier	 DOM  VK  F12
=	TokenNameEQUAL	
0x7B	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
DOM_VK_F13	TokenNameIdentifier	 DOM  VK  F13
=	TokenNameEQUAL	
0xF000	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
DOM_VK_F14	TokenNameIdentifier	 DOM  VK  F14
=	TokenNameEQUAL	
0xF001	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
DOM_VK_F15	TokenNameIdentifier	 DOM  VK  F15
=	TokenNameEQUAL	
0xF002	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
DOM_VK_F16	TokenNameIdentifier	 DOM  VK  F16
=	TokenNameEQUAL	
0xF003	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
DOM_VK_F17	TokenNameIdentifier	 DOM  VK  F17
=	TokenNameEQUAL	
0xF004	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
DOM_VK_F18	TokenNameIdentifier	 DOM  VK  F18
=	TokenNameEQUAL	
0xF005	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
DOM_VK_F19	TokenNameIdentifier	 DOM  VK  F19
=	TokenNameEQUAL	
0xF006	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
DOM_VK_F2	TokenNameIdentifier	 DOM  VK  F2
=	TokenNameEQUAL	
0x71	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
DOM_VK_F20	TokenNameIdentifier	 DOM  VK  F20
=	TokenNameEQUAL	
0xF007	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
DOM_VK_F21	TokenNameIdentifier	 DOM  VK  F21
=	TokenNameEQUAL	
0xF008	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
DOM_VK_F22	TokenNameIdentifier	 DOM  VK  F22
=	TokenNameEQUAL	
0xF009	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
DOM_VK_F23	TokenNameIdentifier	 DOM  VK  F23
=	TokenNameEQUAL	
0xF00A	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
DOM_VK_F24	TokenNameIdentifier	 DOM  VK  F24
=	TokenNameEQUAL	
0xF00B	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
DOM_VK_F3	TokenNameIdentifier	 DOM  VK  F3
=	TokenNameEQUAL	
0x72	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
DOM_VK_F4	TokenNameIdentifier	 DOM  VK  F4
=	TokenNameEQUAL	
0x73	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
DOM_VK_F5	TokenNameIdentifier	 DOM  VK  F5
=	TokenNameEQUAL	
0x74	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
DOM_VK_F6	TokenNameIdentifier	 DOM  VK  F6
=	TokenNameEQUAL	
0x75	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
DOM_VK_F7	TokenNameIdentifier	 DOM  VK  F7
=	TokenNameEQUAL	
0x76	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
DOM_VK_F8	TokenNameIdentifier	 DOM  VK  F8
=	TokenNameEQUAL	
0x77	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
DOM_VK_F9	TokenNameIdentifier	 DOM  VK  F9
=	TokenNameEQUAL	
0x78	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
DOM_VK_FINAL	TokenNameIdentifier	 DOM  VK  FINAL
=	TokenNameEQUAL	
0x18	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
DOM_VK_FIND	TokenNameIdentifier	 DOM  VK  FIND
=	TokenNameEQUAL	
0xFFD0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
DOM_VK_FULL_WIDTH	TokenNameIdentifier	 DOM  VK  FULL  WIDTH
=	TokenNameEQUAL	
0x00F3	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
DOM_VK_G	TokenNameIdentifier	 DOM  VK  G
=	TokenNameEQUAL	
0x47	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
DOM_VK_GREATER	TokenNameIdentifier	 DOM  VK  GREATER
=	TokenNameEQUAL	
0xA0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
DOM_VK_H	TokenNameIdentifier	 DOM  VK  H
=	TokenNameEQUAL	
0x48	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
DOM_VK_HALF_WIDTH	TokenNameIdentifier	 DOM  VK  HALF  WIDTH
=	TokenNameEQUAL	
0x00F4	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
DOM_VK_HELP	TokenNameIdentifier	 DOM  VK  HELP
=	TokenNameEQUAL	
0x9C	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
DOM_VK_HIRAGANA	TokenNameIdentifier	 DOM  VK  HIRAGANA
=	TokenNameEQUAL	
0x00F2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
DOM_VK_HOME	TokenNameIdentifier	 DOM  VK  HOME
=	TokenNameEQUAL	
0x24	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
DOM_VK_I	TokenNameIdentifier	 DOM  VK  I
=	TokenNameEQUAL	
0x49	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
DOM_VK_INSERT	TokenNameIdentifier	 DOM  VK  INSERT
=	TokenNameEQUAL	
0x9B	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
DOM_VK_INVERTED_EXCLAMATION_MARK	TokenNameIdentifier	 DOM  VK  INVERTED  EXCLAMATION  MARK
=	TokenNameEQUAL	
0x0206	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
DOM_VK_J	TokenNameIdentifier	 DOM  VK  J
=	TokenNameEQUAL	
0x4A	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
DOM_VK_JAPANESE_HIRAGANA	TokenNameIdentifier	 DOM  VK  JAPANESE  HIRAGANA
=	TokenNameEQUAL	
0x0104	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
DOM_VK_JAPANESE_KATAKANA	TokenNameIdentifier	 DOM  VK  JAPANESE  KATAKANA
=	TokenNameEQUAL	
0x0103	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
DOM_VK_JAPANESE_ROMAN	TokenNameIdentifier	 DOM  VK  JAPANESE  ROMAN
=	TokenNameEQUAL	
0x0105	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
DOM_VK_K	TokenNameIdentifier	 DOM  VK  K
=	TokenNameEQUAL	
0x4B	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
DOM_VK_KANA	TokenNameIdentifier	 DOM  VK  KANA
=	TokenNameEQUAL	
0x15	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
DOM_VK_KANJI	TokenNameIdentifier	 DOM  VK  KANJI
=	TokenNameEQUAL	
0x19	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
DOM_VK_KATAKANA	TokenNameIdentifier	 DOM  VK  KATAKANA
=	TokenNameEQUAL	
0x00F1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
DOM_VK_KP_DOWN	TokenNameIdentifier	 DOM  VK  KP  DOWN
=	TokenNameEQUAL	
0xE1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
DOM_VK_KP_LEFT	TokenNameIdentifier	 DOM  VK  KP  LEFT
=	TokenNameEQUAL	
0xE2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
DOM_VK_KP_RIGHT	TokenNameIdentifier	 DOM  VK  KP  RIGHT
=	TokenNameEQUAL	
0xE3	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
DOM_VK_KP_UP	TokenNameIdentifier	 DOM  VK  KP  UP
=	TokenNameEQUAL	
0xE0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
DOM_VK_L	TokenNameIdentifier	 DOM  VK  L
=	TokenNameEQUAL	
0x4C	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
DOM_VK_LEFT	TokenNameIdentifier	 DOM  VK  LEFT
=	TokenNameEQUAL	
0x25	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
DOM_VK_LEFT_PARENTHESIS	TokenNameIdentifier	 DOM  VK  LEFT  PARENTHESIS
=	TokenNameEQUAL	
0x0207	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
DOM_VK_LESS	TokenNameIdentifier	 DOM  VK  LESS
=	TokenNameEQUAL	
0x99	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
DOM_VK_M	TokenNameIdentifier	 DOM  VK  M
=	TokenNameEQUAL	
0x4D	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
DOM_VK_META	TokenNameIdentifier	 DOM  VK  META
=	TokenNameEQUAL	
0x9D	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
DOM_VK_MINUS	TokenNameIdentifier	 DOM  VK  MINUS
=	TokenNameEQUAL	
0x2D	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
DOM_VK_MODECHANGE	TokenNameIdentifier	 DOM  VK  MODECHANGE
=	TokenNameEQUAL	
0x1F	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
DOM_VK_MULTIPLY	TokenNameIdentifier	 DOM  VK  MULTIPLY
=	TokenNameEQUAL	
0x6A	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
DOM_VK_N	TokenNameIdentifier	 DOM  VK  N
=	TokenNameEQUAL	
0x4E	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
DOM_VK_NONCONVERT	TokenNameIdentifier	 DOM  VK  NONCONVERT
=	TokenNameEQUAL	
0x1D	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
DOM_VK_NUM_LOCK	TokenNameIdentifier	 DOM  VK  NUM  LOCK
=	TokenNameEQUAL	
0x90	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
DOM_VK_NUMBER_SIGN	TokenNameIdentifier	 DOM  VK  NUMBER  SIGN
=	TokenNameEQUAL	
0x0208	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
DOM_VK_NUMPAD0	TokenNameIdentifier	 DOM  VK  NUMPA D0
=	TokenNameEQUAL	
0x60	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
DOM_VK_NUMPAD1	TokenNameIdentifier	 DOM  VK  NUMPA D1
=	TokenNameEQUAL	
0x61	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
DOM_VK_NUMPAD2	TokenNameIdentifier	 DOM  VK  NUMPA D2
=	TokenNameEQUAL	
0x62	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
DOM_VK_NUMPAD3	TokenNameIdentifier	 DOM  VK  NUMPA D3
=	TokenNameEQUAL	
0x63	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
DOM_VK_NUMPAD4	TokenNameIdentifier	 DOM  VK  NUMPA D4
=	TokenNameEQUAL	
0x64	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
DOM_VK_NUMPAD5	TokenNameIdentifier	 DOM  VK  NUMPA D5
=	TokenNameEQUAL	
0x65	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
DOM_VK_NUMPAD6	TokenNameIdentifier	 DOM  VK  NUMPA D6
=	TokenNameEQUAL	
0x66	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
DOM_VK_NUMPAD7	TokenNameIdentifier	 DOM  VK  NUMPA D7
=	TokenNameEQUAL	
0x67	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
DOM_VK_NUMPAD8	TokenNameIdentifier	 DOM  VK  NUMPA D8
=	TokenNameEQUAL	
0x68	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
DOM_VK_NUMPAD9	TokenNameIdentifier	 DOM  VK  NUMPA D9
=	TokenNameEQUAL	
0x69	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
DOM_VK_O	TokenNameIdentifier	 DOM  VK  O
=	TokenNameEQUAL	
0x4F	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
DOM_VK_OPEN_BRACKET	TokenNameIdentifier	 DOM  VK  OPEN  BRACKET
=	TokenNameEQUAL	
0x5B	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
DOM_VK_P	TokenNameIdentifier	 DOM  VK  P
=	TokenNameEQUAL	
0x50	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
DOM_VK_PAGE_DOWN	TokenNameIdentifier	 DOM  VK  PAGE  DOWN
=	TokenNameEQUAL	
0x22	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
DOM_VK_PAGE_UP	TokenNameIdentifier	 DOM  VK  PAGE  UP
=	TokenNameEQUAL	
0x21	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
DOM_VK_PASTE	TokenNameIdentifier	 DOM  VK  PASTE
=	TokenNameEQUAL	
0xFFCF	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
DOM_VK_PAUSE	TokenNameIdentifier	 DOM  VK  PAUSE
=	TokenNameEQUAL	
0x13	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
DOM_VK_PERIOD	TokenNameIdentifier	 DOM  VK  PERIOD
=	TokenNameEQUAL	
0x2E	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
DOM_VK_PLUS	TokenNameIdentifier	 DOM  VK  PLUS
=	TokenNameEQUAL	
0x0209	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
DOM_VK_PREVIOUS_CANDIDATE	TokenNameIdentifier	 DOM  VK  PREVIOUS  CANDIDATE
=	TokenNameEQUAL	
0x0101	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
DOM_VK_PRINTSCREEN	TokenNameIdentifier	 DOM  VK  PRINTSCREEN
=	TokenNameEQUAL	
0x9A	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
DOM_VK_PROPS	TokenNameIdentifier	 DOM  VK  PROPS
=	TokenNameEQUAL	
0xFFCA	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
DOM_VK_Q	TokenNameIdentifier	 DOM  VK  Q
=	TokenNameEQUAL	
0x51	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
DOM_VK_QUOTE	TokenNameIdentifier	 DOM  VK  QUOTE
=	TokenNameEQUAL	
0xDE	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
DOM_VK_QUOTEDBL	TokenNameIdentifier	 DOM  VK  QUOTEDBL
=	TokenNameEQUAL	
0x98	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
DOM_VK_R	TokenNameIdentifier	 DOM  VK  R
=	TokenNameEQUAL	
0x52	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
DOM_VK_RIGHT	TokenNameIdentifier	 DOM  VK  RIGHT
=	TokenNameEQUAL	
0x27	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
DOM_VK_RIGHT_PARENTHESIS	TokenNameIdentifier	 DOM  VK  RIGHT  PARENTHESIS
=	TokenNameEQUAL	
0x020A	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
DOM_VK_ROMAN_CHARACTERS	TokenNameIdentifier	 DOM  VK  ROMAN  CHARACTERS
=	TokenNameEQUAL	
0x00F5	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
DOM_VK_S	TokenNameIdentifier	 DOM  VK  S
=	TokenNameEQUAL	
0x53	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
DOM_VK_SCROLL_LOCK	TokenNameIdentifier	 DOM  VK  SCROLL  LOCK
=	TokenNameEQUAL	
0x91	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
DOM_VK_SEMICOLON	TokenNameIdentifier	 DOM  VK  SEMICOLON
=	TokenNameEQUAL	
0x3B	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
DOM_VK_SEPARATER	TokenNameIdentifier	 DOM  VK  SEPARATER
=	TokenNameEQUAL	
0x6C	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
DOM_VK_SHIFT	TokenNameIdentifier	 DOM  VK  SHIFT
=	TokenNameEQUAL	
0x10	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
DOM_VK_SLASH	TokenNameIdentifier	 DOM  VK  SLASH
=	TokenNameEQUAL	
0x2F	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
DOM_VK_SPACE	TokenNameIdentifier	 DOM  VK  SPACE
=	TokenNameEQUAL	
0x20	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
DOM_VK_STOP	TokenNameIdentifier	 DOM  VK  STOP
=	TokenNameEQUAL	
0xFFC8	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
DOM_VK_SUBTRACT	TokenNameIdentifier	 DOM  VK  SUBTRACT
=	TokenNameEQUAL	
0x6D	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
DOM_VK_T	TokenNameIdentifier	 DOM  VK  T
=	TokenNameEQUAL	
0x54	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
DOM_VK_TAB	TokenNameIdentifier	 DOM  VK  TAB
=	TokenNameEQUAL	
0x09	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
DOM_VK_U	TokenNameIdentifier	 DOM  VK  U
=	TokenNameEQUAL	
0x55	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
DOM_VK_UNDEFINED	TokenNameIdentifier	 DOM  VK  UNDEFINED
=	TokenNameEQUAL	
0x0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
DOM_VK_UNDERSCORE	TokenNameIdentifier	 DOM  VK  UNDERSCORE
=	TokenNameEQUAL	
0x020B	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
DOM_VK_UNDO	TokenNameIdentifier	 DOM  VK  UNDO
=	TokenNameEQUAL	
0xFFCB	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
DOM_VK_UP	TokenNameIdentifier	 DOM  VK  UP
=	TokenNameEQUAL	
0x26	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
DOM_VK_V	TokenNameIdentifier	 DOM  VK  V
=	TokenNameEQUAL	
0x56	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
DOM_VK_W	TokenNameIdentifier	 DOM  VK  W
=	TokenNameEQUAL	
0x57	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
DOM_VK_X	TokenNameIdentifier	 DOM  VK  X
=	TokenNameEQUAL	
0x58	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
DOM_VK_Y	TokenNameIdentifier	 DOM  VK  Y
=	TokenNameEQUAL	
0x59	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
DOM_VK_Z	TokenNameIdentifier	 DOM  VK  Z
=	TokenNameEQUAL	
0x5A	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
boolean	TokenNameboolean	
ctrlKey	TokenNameIdentifier	 ctrl Key
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
boolean	TokenNameboolean	
altKey	TokenNameIdentifier	 alt Key
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
boolean	TokenNameboolean	
shiftKey	TokenNameIdentifier	 shift Key
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
boolean	TokenNameboolean	
metaKey	TokenNameIdentifier	 meta Key
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
int	TokenNameint	
keyCode	TokenNameIdentifier	 key Code
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
int	TokenNameint	
charCode	TokenNameIdentifier	 char Code
;	TokenNameSEMICOLON	
/** * Returns whether the 'ctrl' key was depressed during the firing of the * event. */	TokenNameCOMMENT_JAVADOC	 Returns whether the 'ctrl' key was depressed during the firing of the event. 
public	TokenNamepublic	
boolean	TokenNameboolean	
getCtrlKey	TokenNameIdentifier	 get Ctrl Key
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
ctrlKey	TokenNameIdentifier	 ctrl Key
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns whether the 'shift' key was depressed during the firing of the * event. */	TokenNameCOMMENT_JAVADOC	 Returns whether the 'shift' key was depressed during the firing of the event. 
public	TokenNamepublic	
boolean	TokenNameboolean	
getShiftKey	TokenNameIdentifier	 get Shift Key
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
shiftKey	TokenNameIdentifier	 shift Key
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns whether the 'alt' key was depressed during the firing of the * event. On some platforms this key may map to an alternative key name. */	TokenNameCOMMENT_JAVADOC	 Returns whether the 'alt' key was depressed during the firing of the event. On some platforms this key may map to an alternative key name. 
public	TokenNamepublic	
boolean	TokenNameboolean	
getAltKey	TokenNameIdentifier	 get Alt Key
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
altKey	TokenNameIdentifier	 alt Key
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns whether the 'meta' key was depressed during the firing of * the event. On some platforms this key may map to an alternative * key name. */	TokenNameCOMMENT_JAVADOC	 Returns whether the 'meta' key was depressed during the firing of the event. On some platforms this key may map to an alternative key name. 
public	TokenNamepublic	
boolean	TokenNameboolean	
getMetaKey	TokenNameIdentifier	 get Meta Key
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
metaKey	TokenNameIdentifier	 meta Key
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the virtual key code value of the key which was depressed * if the event is a key event. Otherwise, the value returned is zero. */	TokenNameCOMMENT_JAVADOC	 Returns the virtual key code value of the key which was depressed if the event is a key event. Otherwise, the value returned is zero. 
public	TokenNamepublic	
int	TokenNameint	
getKeyCode	TokenNameIdentifier	 get Key Code
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
keyCode	TokenNameIdentifier	 key Code
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the value of the Unicode character associated with the * depressed key if the event is a key event. Otherwise, the value * returned is zero. */	TokenNameCOMMENT_JAVADOC	 Returns the value of the Unicode character associated with the depressed key if the event is a key event. Otherwise, the value returned is zero. 
public	TokenNamepublic	
int	TokenNameint	
getCharCode	TokenNameIdentifier	 get Char Code
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
charCode	TokenNameIdentifier	 char Code
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Initializes this KeyEvent. * @param typeArg Specifies the event type. * @param canBubbleArg Specifies whether or not the event can bubble. * @param cancelableArg Specifies whether or not the event's default action * can be prevent. * @param ctrlKeyArg Specifies whether or not control key was depressed * during the <code>Event</code>. * @param altKeyArg Specifies whether or not alt key was depressed during * the <code>Event</code>. * @param shiftKeyArg Specifies whether or not shift key was depressed * during the <code>Event</code>. * @param metaKeyArg Specifies whether or not meta key was depressed during * the <code>Event</code>. * @param keyCodeArg Specifies the <code>Event</code>'s <code>keyCode</code> * @param charCodeArg Specifies the <code>Event</code>'s * <code>charCode</code> * @param viewArg Specifies the <code>Event</code>'s * <code>AbstractView</code>. */	TokenNameCOMMENT_JAVADOC	 Initializes this KeyEvent. @param typeArg Specifies the event type. @param canBubbleArg Specifies whether or not the event can bubble. @param cancelableArg Specifies whether or not the event's default action can be prevent. @param ctrlKeyArg Specifies whether or not control key was depressed during the <code>Event</code>. @param altKeyArg Specifies whether or not alt key was depressed during the <code>Event</code>. @param shiftKeyArg Specifies whether or not shift key was depressed during the <code>Event</code>. @param metaKeyArg Specifies whether or not meta key was depressed during the <code>Event</code>. @param keyCodeArg Specifies the <code>Event</code>'s <code>keyCode</code> @param charCodeArg Specifies the <code>Event</code>'s <code>charCode</code> @param viewArg Specifies the <code>Event</code>'s <code>AbstractView</code>. 
public	TokenNamepublic	
void	TokenNamevoid	
initKeyEvent	TokenNameIdentifier	 init Key Event
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
typeArg	TokenNameIdentifier	 type Arg
,	TokenNameCOMMA	
boolean	TokenNameboolean	
canBubbleArg	TokenNameIdentifier	 can Bubble Arg
,	TokenNameCOMMA	
boolean	TokenNameboolean	
cancelableArg	TokenNameIdentifier	 cancelable Arg
,	TokenNameCOMMA	
boolean	TokenNameboolean	
ctrlKeyArg	TokenNameIdentifier	 ctrl Key Arg
,	TokenNameCOMMA	
boolean	TokenNameboolean	
altKeyArg	TokenNameIdentifier	 alt Key Arg
,	TokenNameCOMMA	
boolean	TokenNameboolean	
shiftKeyArg	TokenNameIdentifier	 shift Key Arg
,	TokenNameCOMMA	
boolean	TokenNameboolean	
metaKeyArg	TokenNameIdentifier	 meta Key Arg
,	TokenNameCOMMA	
int	TokenNameint	
keyCodeArg	TokenNameIdentifier	 key Code Arg
,	TokenNameCOMMA	
int	TokenNameint	
charCodeArg	TokenNameIdentifier	 char Code Arg
,	TokenNameCOMMA	
AbstractView	TokenNameIdentifier	 Abstract View
viewArg	TokenNameIdentifier	 view Arg
)	TokenNameRPAREN	
{	TokenNameLBRACE	
initUIEvent	TokenNameIdentifier	 init UI Event
(	TokenNameLPAREN	
typeArg	TokenNameIdentifier	 type Arg
,	TokenNameCOMMA	
canBubbleArg	TokenNameIdentifier	 can Bubble Arg
,	TokenNameCOMMA	
cancelableArg	TokenNameIdentifier	 cancelable Arg
,	TokenNameCOMMA	
viewArg	TokenNameIdentifier	 view Arg
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ctrlKey	TokenNameIdentifier	 ctrl Key
=	TokenNameEQUAL	
ctrlKeyArg	TokenNameIdentifier	 ctrl Key Arg
;	TokenNameSEMICOLON	
altKey	TokenNameIdentifier	 alt Key
=	TokenNameEQUAL	
altKeyArg	TokenNameIdentifier	 alt Key Arg
;	TokenNameSEMICOLON	
shiftKey	TokenNameIdentifier	 shift Key
=	TokenNameEQUAL	
shiftKeyArg	TokenNameIdentifier	 shift Key Arg
;	TokenNameSEMICOLON	
metaKey	TokenNameIdentifier	 meta Key
=	TokenNameEQUAL	
metaKeyArg	TokenNameIdentifier	 meta Key Arg
;	TokenNameSEMICOLON	
keyCode	TokenNameIdentifier	 key Code
=	TokenNameEQUAL	
keyCodeArg	TokenNameIdentifier	 key Code Arg
;	TokenNameSEMICOLON	
charCode	TokenNameIdentifier	 char Code
=	TokenNameEQUAL	
charCodeArg	TokenNameIdentifier	 char Code Arg
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
