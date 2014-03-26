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
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
HashSet	TokenNameIdentifier	 Hash Set
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
w3c	TokenNameIdentifier	 w3c
.	TokenNameDOT	
dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
events	TokenNameIdentifier	 events
.	TokenNameDOT	
KeyboardEvent	TokenNameIdentifier	 Keyboard Event
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
/** * DOM 3 Keyboard event class. * * @author <a href="mailto:cam%40mcc%2eid%2eau">Cameron McCormack</a> * @version $Id: DOMKeyboardEvent.java 598494 2007-11-27 02:46:33Z cam $ */	TokenNameCOMMENT_JAVADOC	 DOM 3 Keyboard event class. * @author <a href="mailto:cam%40mcc%2eid%2eau">Cameron McCormack</a> @version $Id: DOMKeyboardEvent.java 598494 2007-11-27 02:46:33Z cam $ 
public	TokenNamepublic	
class	TokenNameclass	
DOMKeyboardEvent	TokenNameIdentifier	 DOM Keyboard Event
extends	TokenNameextends	
DOMUIEvent	TokenNameIdentifier	 DOMUI Event
implements	TokenNameimplements	
KeyboardEvent	TokenNameIdentifier	 Keyboard Event
{	TokenNameLBRACE	
// Key identifiers 	TokenNameCOMMENT_LINE	Key identifiers 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
KEY_UNIDENTIFIED	TokenNameIdentifier	 KEY  UNIDENTIFIED
=	TokenNameEQUAL	
"Unidentified"	TokenNameStringLiteral	Unidentified
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
KEY_ACCEPT	TokenNameIdentifier	 KEY  ACCEPT
=	TokenNameEQUAL	
"Accept"	TokenNameStringLiteral	Accept
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
KEY_AGAIN	TokenNameIdentifier	 KEY  AGAIN
=	TokenNameEQUAL	
"Again"	TokenNameStringLiteral	Again
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
KEY_ALL_CANDIDATES	TokenNameIdentifier	 KEY  ALL  CANDIDATES
=	TokenNameEQUAL	
"AllCandidates"	TokenNameStringLiteral	AllCandidates
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
KEY_ALPHANUMERIC	TokenNameIdentifier	 KEY  ALPHANUMERIC
=	TokenNameEQUAL	
"Alphanumeric"	TokenNameStringLiteral	Alphanumeric
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
KEY_ALT	TokenNameIdentifier	 KEY  ALT
=	TokenNameEQUAL	
"Alt"	TokenNameStringLiteral	Alt
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
KEY_ALT_GRAPH	TokenNameIdentifier	 KEY  ALT  GRAPH
=	TokenNameEQUAL	
"AltGraph"	TokenNameStringLiteral	AltGraph
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
KEY_APPS	TokenNameIdentifier	 KEY  APPS
=	TokenNameEQUAL	
"Apps"	TokenNameStringLiteral	Apps
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
KEY_ATTN	TokenNameIdentifier	 KEY  ATTN
=	TokenNameEQUAL	
"Attn"	TokenNameStringLiteral	Attn
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
KEY_BROWSER_BACK	TokenNameIdentifier	 KEY  BROWSER  BACK
=	TokenNameEQUAL	
"BrowserBack"	TokenNameStringLiteral	BrowserBack
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
KEY_BROWSER_FAVORITES	TokenNameIdentifier	 KEY  BROWSER  FAVORITES
=	TokenNameEQUAL	
"BrowserFavorites"	TokenNameStringLiteral	BrowserFavorites
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
KEY_BROWSER_FORWARD	TokenNameIdentifier	 KEY  BROWSER  FORWARD
=	TokenNameEQUAL	
"BrowserForward"	TokenNameStringLiteral	BrowserForward
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
KEY_BROWSER_HOME	TokenNameIdentifier	 KEY  BROWSER  HOME
=	TokenNameEQUAL	
"BrowserHome"	TokenNameStringLiteral	BrowserHome
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
KEY_BROWSER_REFRESH	TokenNameIdentifier	 KEY  BROWSER  REFRESH
=	TokenNameEQUAL	
"BrowserRefresh"	TokenNameStringLiteral	BrowserRefresh
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
KEY_BROWSER_SEARCH	TokenNameIdentifier	 KEY  BROWSER  SEARCH
=	TokenNameEQUAL	
"BrowserSearch"	TokenNameStringLiteral	BrowserSearch
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
KEY_BROWSER_STOP	TokenNameIdentifier	 KEY  BROWSER  STOP
=	TokenNameEQUAL	
"BrowserStop"	TokenNameStringLiteral	BrowserStop
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
KEY_CAPS_LOCK	TokenNameIdentifier	 KEY  CAPS  LOCK
=	TokenNameEQUAL	
"CapsLock"	TokenNameStringLiteral	CapsLock
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
KEY_CLEAR	TokenNameIdentifier	 KEY  CLEAR
=	TokenNameEQUAL	
"Clear"	TokenNameStringLiteral	Clear
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
KEY_CODE_INPUT	TokenNameIdentifier	 KEY  CODE  INPUT
=	TokenNameEQUAL	
"CodeInput"	TokenNameStringLiteral	CodeInput
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
KEY_COMPOSE	TokenNameIdentifier	 KEY  COMPOSE
=	TokenNameEQUAL	
"Compose"	TokenNameStringLiteral	Compose
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
KEY_CONTROL	TokenNameIdentifier	 KEY  CONTROL
=	TokenNameEQUAL	
"Control"	TokenNameStringLiteral	Control
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
KEY_CRSEL	TokenNameIdentifier	 KEY  CRSEL
=	TokenNameEQUAL	
"Crsel"	TokenNameStringLiteral	Crsel
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
KEY_CONVERT	TokenNameIdentifier	 KEY  CONVERT
=	TokenNameEQUAL	
"Convert"	TokenNameStringLiteral	Convert
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
KEY_COPY	TokenNameIdentifier	 KEY  COPY
=	TokenNameEQUAL	
"Copy"	TokenNameStringLiteral	Copy
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
KEY_CUT	TokenNameIdentifier	 KEY  CUT
=	TokenNameEQUAL	
"Cut"	TokenNameStringLiteral	Cut
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
KEY_DOWN	TokenNameIdentifier	 KEY  DOWN
=	TokenNameEQUAL	
"Down"	TokenNameStringLiteral	Down
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
KEY_END	TokenNameIdentifier	 KEY  END
=	TokenNameEQUAL	
"End"	TokenNameStringLiteral	End
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
KEY_ENTER	TokenNameIdentifier	 KEY  ENTER
=	TokenNameEQUAL	
"Enter"	TokenNameStringLiteral	Enter
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
KEY_ERASE_EOF	TokenNameIdentifier	 KEY  ERASE  EOF
=	TokenNameEQUAL	
"EraseEof"	TokenNameStringLiteral	EraseEof
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
KEY_EXECUTE	TokenNameIdentifier	 KEY  EXECUTE
=	TokenNameEQUAL	
"Execute"	TokenNameStringLiteral	Execute
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
KEY_EXSEL	TokenNameIdentifier	 KEY  EXSEL
=	TokenNameEQUAL	
"Exsel"	TokenNameStringLiteral	Exsel
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
KEY_F1	TokenNameIdentifier	 KEY  F1
=	TokenNameEQUAL	
"F1"	TokenNameStringLiteral	F1
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
KEY_F2	TokenNameIdentifier	 KEY  F2
=	TokenNameEQUAL	
"F2"	TokenNameStringLiteral	F2
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
KEY_F3	TokenNameIdentifier	 KEY  F3
=	TokenNameEQUAL	
"F3"	TokenNameStringLiteral	F3
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
KEY_F4	TokenNameIdentifier	 KEY  F4
=	TokenNameEQUAL	
"F4"	TokenNameStringLiteral	F4
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
KEY_F5	TokenNameIdentifier	 KEY  F5
=	TokenNameEQUAL	
"F5"	TokenNameStringLiteral	F5
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
KEY_F6	TokenNameIdentifier	 KEY  F6
=	TokenNameEQUAL	
"F6"	TokenNameStringLiteral	F6
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
KEY_F7	TokenNameIdentifier	 KEY  F7
=	TokenNameEQUAL	
"F7"	TokenNameStringLiteral	F7
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
KEY_F8	TokenNameIdentifier	 KEY  F8
=	TokenNameEQUAL	
"F8"	TokenNameStringLiteral	F8
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
KEY_F9	TokenNameIdentifier	 KEY  F9
=	TokenNameEQUAL	
"F9"	TokenNameStringLiteral	F9
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
KEY_F10	TokenNameIdentifier	 KEY  F10
=	TokenNameEQUAL	
"F10"	TokenNameStringLiteral	F10
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
KEY_F11	TokenNameIdentifier	 KEY  F11
=	TokenNameEQUAL	
"F11"	TokenNameStringLiteral	F11
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
KEY_F12	TokenNameIdentifier	 KEY  F12
=	TokenNameEQUAL	
"F12"	TokenNameStringLiteral	F12
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
KEY_F13	TokenNameIdentifier	 KEY  F13
=	TokenNameEQUAL	
"F13"	TokenNameStringLiteral	F13
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
KEY_F14	TokenNameIdentifier	 KEY  F14
=	TokenNameEQUAL	
"F14"	TokenNameStringLiteral	F14
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
KEY_F15	TokenNameIdentifier	 KEY  F15
=	TokenNameEQUAL	
"F15"	TokenNameStringLiteral	F15
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
KEY_F16	TokenNameIdentifier	 KEY  F16
=	TokenNameEQUAL	
"F16"	TokenNameStringLiteral	F16
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
KEY_F17	TokenNameIdentifier	 KEY  F17
=	TokenNameEQUAL	
"F17"	TokenNameStringLiteral	F17
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
KEY_F18	TokenNameIdentifier	 KEY  F18
=	TokenNameEQUAL	
"F18"	TokenNameStringLiteral	F18
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
KEY_F19	TokenNameIdentifier	 KEY  F19
=	TokenNameEQUAL	
"F19"	TokenNameStringLiteral	F19
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
KEY_F20	TokenNameIdentifier	 KEY  F20
=	TokenNameEQUAL	
"F20"	TokenNameStringLiteral	F20
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
KEY_F21	TokenNameIdentifier	 KEY  F21
=	TokenNameEQUAL	
"F21"	TokenNameStringLiteral	F21
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
KEY_BACKSPACE	TokenNameIdentifier	 KEY  BACKSPACE
=	TokenNameEQUAL	
"U+0008"	TokenNameStringLiteral	U+0008
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
KEY_TAB	TokenNameIdentifier	 KEY  TAB
=	TokenNameEQUAL	
"U+0009"	TokenNameStringLiteral	U+0009
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
KEY_CANCEL	TokenNameIdentifier	 KEY  CANCEL
=	TokenNameEQUAL	
"U+0018"	TokenNameStringLiteral	U+0018
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
KEY_ESCAPE	TokenNameIdentifier	 KEY  ESCAPE
=	TokenNameEQUAL	
"U+001B"	TokenNameStringLiteral	U+001B
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
KEY_SPACE	TokenNameIdentifier	 KEY  SPACE
=	TokenNameEQUAL	
"U+0020"	TokenNameStringLiteral	U+0020
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
KEY_EXCLAMATION	TokenNameIdentifier	 KEY  EXCLAMATION
=	TokenNameEQUAL	
"U+0021"	TokenNameStringLiteral	U+0021
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
KEY_QUOTE	TokenNameIdentifier	 KEY  QUOTE
=	TokenNameEQUAL	
"U+0022"	TokenNameStringLiteral	U+0022
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
KEY_HASH	TokenNameIdentifier	 KEY  HASH
=	TokenNameEQUAL	
"U+0023"	TokenNameStringLiteral	U+0023
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
KEY_DOLLAR	TokenNameIdentifier	 KEY  DOLLAR
=	TokenNameEQUAL	
"U+0024"	TokenNameStringLiteral	U+0024
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
KEY_AMPERSAND	TokenNameIdentifier	 KEY  AMPERSAND
=	TokenNameEQUAL	
"U+0026"	TokenNameStringLiteral	U+0026
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
KEY_APOSTROPHE	TokenNameIdentifier	 KEY  APOSTROPHE
=	TokenNameEQUAL	
"U+0027"	TokenNameStringLiteral	U+0027
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
KEY_LEFT_PARENTHESIS	TokenNameIdentifier	 KEY  LEFT  PARENTHESIS
=	TokenNameEQUAL	
"U+0028"	TokenNameStringLiteral	U+0028
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
KEY_RIGHT_PARENTHESIS	TokenNameIdentifier	 KEY  RIGHT  PARENTHESIS
=	TokenNameEQUAL	
"U+0029"	TokenNameStringLiteral	U+0029
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
KEY_ASTERISK	TokenNameIdentifier	 KEY  ASTERISK
=	TokenNameEQUAL	
"U+002A"	TokenNameStringLiteral	U+002A
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
KEY_PLUS	TokenNameIdentifier	 KEY  PLUS
=	TokenNameEQUAL	
"U+002B"	TokenNameStringLiteral	U+002B
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
KEY_COMMA	TokenNameIdentifier	 KEY  COMMA
=	TokenNameEQUAL	
"U+002C"	TokenNameStringLiteral	U+002C
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
KEY_MINUS	TokenNameIdentifier	 KEY  MINUS
=	TokenNameEQUAL	
"U+002D"	TokenNameStringLiteral	U+002D
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
KEY_FULL_STOP	TokenNameIdentifier	 KEY  FULL  STOP
=	TokenNameEQUAL	
"U+002E"	TokenNameStringLiteral	U+002E
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
KEY_SLASH	TokenNameIdentifier	 KEY  SLASH
=	TokenNameEQUAL	
"U+002F"	TokenNameStringLiteral	U+002F
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
KEY_0	TokenNameIdentifier	 KEY 0
=	TokenNameEQUAL	
"U+0030"	TokenNameStringLiteral	U+0030
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
KEY_1	TokenNameIdentifier	 KEY 1
=	TokenNameEQUAL	
"U+0031"	TokenNameStringLiteral	U+0031
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
KEY_2	TokenNameIdentifier	 KEY 2
=	TokenNameEQUAL	
"U+0032"	TokenNameStringLiteral	U+0032
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
KEY_3	TokenNameIdentifier	 KEY 3
=	TokenNameEQUAL	
"U+0033"	TokenNameStringLiteral	U+0033
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
KEY_4	TokenNameIdentifier	 KEY 4
=	TokenNameEQUAL	
"U+0034"	TokenNameStringLiteral	U+0034
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
KEY_5	TokenNameIdentifier	 KEY 5
=	TokenNameEQUAL	
"U+0035"	TokenNameStringLiteral	U+0035
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
KEY_6	TokenNameIdentifier	 KEY 6
=	TokenNameEQUAL	
"U+0036"	TokenNameStringLiteral	U+0036
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
KEY_7	TokenNameIdentifier	 KEY 7
=	TokenNameEQUAL	
"U+0037"	TokenNameStringLiteral	U+0037
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
KEY_8	TokenNameIdentifier	 KEY 8
=	TokenNameEQUAL	
"U+0038"	TokenNameStringLiteral	U+0038
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
KEY_9	TokenNameIdentifier	 KEY 9
=	TokenNameEQUAL	
"U+0039"	TokenNameStringLiteral	U+0039
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
KEY_COLON	TokenNameIdentifier	 KEY  COLON
=	TokenNameEQUAL	
"U+003A"	TokenNameStringLiteral	U+003A
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
KEY_SEMICOLON	TokenNameIdentifier	 KEY  SEMICOLON
=	TokenNameEQUAL	
"U+003B"	TokenNameStringLiteral	U+003B
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
KEY_LESS_THAN	TokenNameIdentifier	 KEY  LESS  THAN
=	TokenNameEQUAL	
"U+003C"	TokenNameStringLiteral	U+003C
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
KEY_EQUALS	TokenNameIdentifier	 KEY  EQUALS
=	TokenNameEQUAL	
"U+003D"	TokenNameStringLiteral	U+003D
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
KEY_GREATER_THAN	TokenNameIdentifier	 KEY  GREATER  THAN
=	TokenNameEQUAL	
"U+003E"	TokenNameStringLiteral	U+003E
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
KEY_QUESTION	TokenNameIdentifier	 KEY  QUESTION
=	TokenNameEQUAL	
"U+003F"	TokenNameStringLiteral	U+003F
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
KEY_AT	TokenNameIdentifier	 KEY  AT
=	TokenNameEQUAL	
"U+0040"	TokenNameStringLiteral	U+0040
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
KEY_A	TokenNameIdentifier	 KEY  A
=	TokenNameEQUAL	
"U+0041"	TokenNameStringLiteral	U+0041
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
KEY_B	TokenNameIdentifier	 KEY  B
=	TokenNameEQUAL	
"U+0042"	TokenNameStringLiteral	U+0042
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
KEY_C	TokenNameIdentifier	 KEY  C
=	TokenNameEQUAL	
"U+0043"	TokenNameStringLiteral	U+0043
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
KEY_D	TokenNameIdentifier	 KEY  D
=	TokenNameEQUAL	
"U+0044"	TokenNameStringLiteral	U+0044
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
KEY_E	TokenNameIdentifier	 KEY  E
=	TokenNameEQUAL	
"U+0045"	TokenNameStringLiteral	U+0045
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
KEY_F	TokenNameIdentifier	 KEY  F
=	TokenNameEQUAL	
"U+0046"	TokenNameStringLiteral	U+0046
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
KEY_G	TokenNameIdentifier	 KEY  G
=	TokenNameEQUAL	
"U+0047"	TokenNameStringLiteral	U+0047
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
KEY_H	TokenNameIdentifier	 KEY  H
=	TokenNameEQUAL	
"U+0048"	TokenNameStringLiteral	U+0048
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
KEY_I	TokenNameIdentifier	 KEY  I
=	TokenNameEQUAL	
"U+0049"	TokenNameStringLiteral	U+0049
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
KEY_J	TokenNameIdentifier	 KEY  J
=	TokenNameEQUAL	
"U+004A"	TokenNameStringLiteral	U+004A
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
KEY_K	TokenNameIdentifier	 KEY  K
=	TokenNameEQUAL	
"U+004B"	TokenNameStringLiteral	U+004B
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
KEY_L	TokenNameIdentifier	 KEY  L
=	TokenNameEQUAL	
"U+004C"	TokenNameStringLiteral	U+004C
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
KEY_M	TokenNameIdentifier	 KEY  M
=	TokenNameEQUAL	
"U+004D"	TokenNameStringLiteral	U+004D
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
KEY_N	TokenNameIdentifier	 KEY  N
=	TokenNameEQUAL	
"U+004E"	TokenNameStringLiteral	U+004E
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
KEY_O	TokenNameIdentifier	 KEY  O
=	TokenNameEQUAL	
"U+004F"	TokenNameStringLiteral	U+004F
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
KEY_P	TokenNameIdentifier	 KEY  P
=	TokenNameEQUAL	
"U+0050"	TokenNameStringLiteral	U+0050
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
KEY_Q	TokenNameIdentifier	 KEY  Q
=	TokenNameEQUAL	
"U+0051"	TokenNameStringLiteral	U+0051
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
KEY_R	TokenNameIdentifier	 KEY  R
=	TokenNameEQUAL	
"U+0052"	TokenNameStringLiteral	U+0052
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
KEY_S	TokenNameIdentifier	 KEY  S
=	TokenNameEQUAL	
"U+0053"	TokenNameStringLiteral	U+0053
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
KEY_T	TokenNameIdentifier	 KEY  T
=	TokenNameEQUAL	
"U+0054"	TokenNameStringLiteral	U+0054
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
KEY_U	TokenNameIdentifier	 KEY  U
=	TokenNameEQUAL	
"U+0055"	TokenNameStringLiteral	U+0055
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
KEY_V	TokenNameIdentifier	 KEY  V
=	TokenNameEQUAL	
"U+0056"	TokenNameStringLiteral	U+0056
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
KEY_W	TokenNameIdentifier	 KEY  W
=	TokenNameEQUAL	
"U+0057"	TokenNameStringLiteral	U+0057
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
KEY_X	TokenNameIdentifier	 KEY  X
=	TokenNameEQUAL	
"U+0058"	TokenNameStringLiteral	U+0058
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
KEY_Y	TokenNameIdentifier	 KEY  Y
=	TokenNameEQUAL	
"U+0059"	TokenNameStringLiteral	U+0059
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
KEY_Z	TokenNameIdentifier	 KEY  Z
=	TokenNameEQUAL	
"U+005A"	TokenNameStringLiteral	U+005A
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
KEY_LEFT_SQUARE_BRACKET	TokenNameIdentifier	 KEY  LEFT  SQUARE  BRACKET
=	TokenNameEQUAL	
"U+005B"	TokenNameStringLiteral	U+005B
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
KEY_BACKSLASH	TokenNameIdentifier	 KEY  BACKSLASH
=	TokenNameEQUAL	
"U+005C"	TokenNameStringLiteral	U+005C
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
KEY_RIGHT_SQUARE_BRACKET	TokenNameIdentifier	 KEY  RIGHT  SQUARE  BRACKET
=	TokenNameEQUAL	
"U+005D"	TokenNameStringLiteral	U+005D
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
KEY_CIRCUMFLEX	TokenNameIdentifier	 KEY  CIRCUMFLEX
=	TokenNameEQUAL	
"U+005E"	TokenNameStringLiteral	U+005E
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
KEY_UNDERSCORE	TokenNameIdentifier	 KEY  UNDERSCORE
=	TokenNameEQUAL	
"U+005F"	TokenNameStringLiteral	U+005F
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
KEY_GRAVE	TokenNameIdentifier	 KEY  GRAVE
=	TokenNameEQUAL	
"U+0060"	TokenNameStringLiteral	U+0060
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
KEY_LEFT_BRACE	TokenNameIdentifier	 KEY  LEFT  BRACE
=	TokenNameEQUAL	
"U+007B"	TokenNameStringLiteral	U+007B
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
KEY_VERTICAL_BAR	TokenNameIdentifier	 KEY  VERTICAL  BAR
=	TokenNameEQUAL	
"U+007C"	TokenNameStringLiteral	U+007C
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
KEY_RIGHT_BRACE	TokenNameIdentifier	 KEY  RIGHT  BRACE
=	TokenNameEQUAL	
"U+007D"	TokenNameStringLiteral	U+007D
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
KEY_DELETE	TokenNameIdentifier	 KEY  DELETE
=	TokenNameEQUAL	
"U+007F"	TokenNameStringLiteral	U+007F
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
KEY_INVERTED_EXCLAMATION	TokenNameIdentifier	 KEY  INVERTED  EXCLAMATION
=	TokenNameEQUAL	
"U+00A1"	TokenNameStringLiteral	U+00A1
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
KEY_COMBINING_GRAVE	TokenNameIdentifier	 KEY  COMBINING  GRAVE
=	TokenNameEQUAL	
"U+0300"	TokenNameStringLiteral	U+0300
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
KEY_COMBINING_ACUTE	TokenNameIdentifier	 KEY  COMBINING  ACUTE
=	TokenNameEQUAL	
"U+0301"	TokenNameStringLiteral	U+0301
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
KEY_COMBINING_CIRCUMFLEX	TokenNameIdentifier	 KEY  COMBINING  CIRCUMFLEX
=	TokenNameEQUAL	
"U+0302"	TokenNameStringLiteral	U+0302
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
KEY_COMBINING_TILDE	TokenNameIdentifier	 KEY  COMBINING  TILDE
=	TokenNameEQUAL	
"U+0303"	TokenNameStringLiteral	U+0303
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
KEY_COMBINING_MACRON	TokenNameIdentifier	 KEY  COMBINING  MACRON
=	TokenNameEQUAL	
"U+0304"	TokenNameStringLiteral	U+0304
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
KEY_COMBINING_BREVE	TokenNameIdentifier	 KEY  COMBINING  BREVE
=	TokenNameEQUAL	
"U+0306"	TokenNameStringLiteral	U+0306
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
KEY_COMBINING_DOT_ABOVE	TokenNameIdentifier	 KEY  COMBINING  DOT  ABOVE
=	TokenNameEQUAL	
"U+0307"	TokenNameStringLiteral	U+0307
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
KEY_COMBINING_DIERESIS	TokenNameIdentifier	 KEY  COMBINING  DIERESIS
=	TokenNameEQUAL	
"U+0308"	TokenNameStringLiteral	U+0308
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
KEY_COMBINING_RING_ABOVE	TokenNameIdentifier	 KEY  COMBINING  RING  ABOVE
=	TokenNameEQUAL	
"U+030A"	TokenNameStringLiteral	U+030A
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
KEY_COMBINING_DOUBLE_ACUTE	TokenNameIdentifier	 KEY  COMBINING  DOUBLE  ACUTE
=	TokenNameEQUAL	
"U+030B"	TokenNameStringLiteral	U+030B
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
KEY_COMBINING_CARON	TokenNameIdentifier	 KEY  COMBINING  CARON
=	TokenNameEQUAL	
"U+030C"	TokenNameStringLiteral	U+030C
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
KEY_COMBINING_CEDILLA	TokenNameIdentifier	 KEY  COMBINING  CEDILLA
=	TokenNameEQUAL	
"U+0327"	TokenNameStringLiteral	U+0327
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
KEY_COMBINING_OGONEK	TokenNameIdentifier	 KEY  COMBINING  OGONEK
=	TokenNameEQUAL	
"U+0328"	TokenNameStringLiteral	U+0328
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
KEY_COMBINING_IOTA	TokenNameIdentifier	 KEY  COMBINING  IOTA
=	TokenNameEQUAL	
"U+0345"	TokenNameStringLiteral	U+0345
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
KEY_EURO	TokenNameIdentifier	 KEY  EURO
=	TokenNameEQUAL	
"U+20AC"	TokenNameStringLiteral	U+20AC
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
KEY_VOICED_SOUND	TokenNameIdentifier	 KEY  VOICED  SOUND
=	TokenNameEQUAL	
"U+3099"	TokenNameStringLiteral	U+3099
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
KEY_SEMIVOICED_SOUND	TokenNameIdentifier	 KEY  SEMIVOICED  SOUND
=	TokenNameEQUAL	
"U+309A"	TokenNameStringLiteral	U+309A
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
KEY_F22	TokenNameIdentifier	 KEY  F22
=	TokenNameEQUAL	
"F22"	TokenNameStringLiteral	F22
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
KEY_F23	TokenNameIdentifier	 KEY  F23
=	TokenNameEQUAL	
"F23"	TokenNameStringLiteral	F23
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
KEY_F24	TokenNameIdentifier	 KEY  F24
=	TokenNameEQUAL	
"F24"	TokenNameStringLiteral	F24
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
KEY_FINAL_MODE	TokenNameIdentifier	 KEY  FINAL  MODE
=	TokenNameEQUAL	
"FinalMode"	TokenNameStringLiteral	FinalMode
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
KEY_FIND	TokenNameIdentifier	 KEY  FIND
=	TokenNameEQUAL	
"Find"	TokenNameStringLiteral	Find
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
KEY_FULL_WIDTH	TokenNameIdentifier	 KEY  FULL  WIDTH
=	TokenNameEQUAL	
"FullWidth"	TokenNameStringLiteral	FullWidth
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
KEY_HALF_WIDTH	TokenNameIdentifier	 KEY  HALF  WIDTH
=	TokenNameEQUAL	
"HalfWidth"	TokenNameStringLiteral	HalfWidth
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
KEY_HANGUL_MODE	TokenNameIdentifier	 KEY  HANGUL  MODE
=	TokenNameEQUAL	
"HangulMode"	TokenNameStringLiteral	HangulMode
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
KEY_HANJA_MODE	TokenNameIdentifier	 KEY  HANJA  MODE
=	TokenNameEQUAL	
"HanjaMode"	TokenNameStringLiteral	HanjaMode
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
KEY_HELP	TokenNameIdentifier	 KEY  HELP
=	TokenNameEQUAL	
"Help"	TokenNameStringLiteral	Help
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
KEY_HIRAGANA	TokenNameIdentifier	 KEY  HIRAGANA
=	TokenNameEQUAL	
"Hiragana"	TokenNameStringLiteral	Hiragana
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
KEY_HOME	TokenNameIdentifier	 KEY  HOME
=	TokenNameEQUAL	
"Home"	TokenNameStringLiteral	Home
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
KEY_INSERT	TokenNameIdentifier	 KEY  INSERT
=	TokenNameEQUAL	
"Insert"	TokenNameStringLiteral	Insert
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
KEY_JAPANESE_HIRAGANA	TokenNameIdentifier	 KEY  JAPANESE  HIRAGANA
=	TokenNameEQUAL	
"JapaneseHiragana"	TokenNameStringLiteral	JapaneseHiragana
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
KEY_JAPANESE_KATAKANA	TokenNameIdentifier	 KEY  JAPANESE  KATAKANA
=	TokenNameEQUAL	
"JapaneseKatakana"	TokenNameStringLiteral	JapaneseKatakana
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
KEY_JAPANESE_ROMAJI	TokenNameIdentifier	 KEY  JAPANESE  ROMAJI
=	TokenNameEQUAL	
"JapaneseRomaji"	TokenNameStringLiteral	JapaneseRomaji
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
KEY_JUNJA_MODE	TokenNameIdentifier	 KEY  JUNJA  MODE
=	TokenNameEQUAL	
"JunjaMode"	TokenNameStringLiteral	JunjaMode
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
KEY_KANA_MODE	TokenNameIdentifier	 KEY  KANA  MODE
=	TokenNameEQUAL	
"KanaMode"	TokenNameStringLiteral	KanaMode
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
KEY_KANJI_MODE	TokenNameIdentifier	 KEY  KANJI  MODE
=	TokenNameEQUAL	
"KanjiMode"	TokenNameStringLiteral	KanjiMode
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
KEY_KATAKANA	TokenNameIdentifier	 KEY  KATAKANA
=	TokenNameEQUAL	
"Katakana"	TokenNameStringLiteral	Katakana
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
KEY_LAUNCH_APPLICATION1	TokenNameIdentifier	 KEY  LAUNCH  APPLICATIO N1
=	TokenNameEQUAL	
"LaunchApplication1"	TokenNameStringLiteral	LaunchApplication1
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
KEY_LAUNCH_APPLICATION2	TokenNameIdentifier	 KEY  LAUNCH  APPLICATIO N2
=	TokenNameEQUAL	
"LaunchApplication2"	TokenNameStringLiteral	LaunchApplication2
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
KEY_LAUNCH_MAIL	TokenNameIdentifier	 KEY  LAUNCH  MAIL
=	TokenNameEQUAL	
"LaunchMail"	TokenNameStringLiteral	LaunchMail
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
KEY_LEFT	TokenNameIdentifier	 KEY  LEFT
=	TokenNameEQUAL	
"Left"	TokenNameStringLiteral	Left
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
KEY_META	TokenNameIdentifier	 KEY  META
=	TokenNameEQUAL	
"Meta"	TokenNameStringLiteral	Meta
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
KEY_MEDIA_NEXT_TRACK	TokenNameIdentifier	 KEY  MEDIA  NEXT  TRACK
=	TokenNameEQUAL	
"MediaNextTrack"	TokenNameStringLiteral	MediaNextTrack
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
KEY_MEDIA_PLAY_PAUSE	TokenNameIdentifier	 KEY  MEDIA  PLAY  PAUSE
=	TokenNameEQUAL	
"MediaPlayPause"	TokenNameStringLiteral	MediaPlayPause
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
KEY_MEDIA_PREVIOUS_TRACK	TokenNameIdentifier	 KEY  MEDIA  PREVIOUS  TRACK
=	TokenNameEQUAL	
"MediaPreviousTrack"	TokenNameStringLiteral	MediaPreviousTrack
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
KEY_MEDIA_STOP	TokenNameIdentifier	 KEY  MEDIA  STOP
=	TokenNameEQUAL	
"MediaStop"	TokenNameStringLiteral	MediaStop
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
KEY_MODE_CHANGE	TokenNameIdentifier	 KEY  MODE  CHANGE
=	TokenNameEQUAL	
"ModeChange"	TokenNameStringLiteral	ModeChange
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
KEY_NONCONVERT	TokenNameIdentifier	 KEY  NONCONVERT
=	TokenNameEQUAL	
"Nonconvert"	TokenNameStringLiteral	Nonconvert
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
KEY_NUM_LOCK	TokenNameIdentifier	 KEY  NUM  LOCK
=	TokenNameEQUAL	
"NumLock"	TokenNameStringLiteral	NumLock
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
KEY_PAGE_DOWN	TokenNameIdentifier	 KEY  PAGE  DOWN
=	TokenNameEQUAL	
"PageDown"	TokenNameStringLiteral	PageDown
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
KEY_PAGE_UP	TokenNameIdentifier	 KEY  PAGE  UP
=	TokenNameEQUAL	
"PageUp"	TokenNameStringLiteral	PageUp
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
KEY_PASTE	TokenNameIdentifier	 KEY  PASTE
=	TokenNameEQUAL	
"Paste"	TokenNameStringLiteral	Paste
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
KEY_PAUSE	TokenNameIdentifier	 KEY  PAUSE
=	TokenNameEQUAL	
"Pause"	TokenNameStringLiteral	Pause
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
KEY_PLAY	TokenNameIdentifier	 KEY  PLAY
=	TokenNameEQUAL	
"Play"	TokenNameStringLiteral	Play
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
KEY_PREVIOUS_CANDIDATE	TokenNameIdentifier	 KEY  PREVIOUS  CANDIDATE
=	TokenNameEQUAL	
"PreviousCandidate"	TokenNameStringLiteral	PreviousCandidate
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
KEY_PRINT_SCREEN	TokenNameIdentifier	 KEY  PRINT  SCREEN
=	TokenNameEQUAL	
"PrintScreen"	TokenNameStringLiteral	PrintScreen
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
KEY_PROCESS	TokenNameIdentifier	 KEY  PROCESS
=	TokenNameEQUAL	
"Process"	TokenNameStringLiteral	Process
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
KEY_PROPS	TokenNameIdentifier	 KEY  PROPS
=	TokenNameEQUAL	
"Props"	TokenNameStringLiteral	Props
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
KEY_RIGHT	TokenNameIdentifier	 KEY  RIGHT
=	TokenNameEQUAL	
"Right"	TokenNameStringLiteral	Right
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
KEY_ROMAN_CHARACTERS	TokenNameIdentifier	 KEY  ROMAN  CHARACTERS
=	TokenNameEQUAL	
"RomanCharacters"	TokenNameStringLiteral	RomanCharacters
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
KEY_SCROLL	TokenNameIdentifier	 KEY  SCROLL
=	TokenNameEQUAL	
"Scroll"	TokenNameStringLiteral	Scroll
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
KEY_SELECT	TokenNameIdentifier	 KEY  SELECT
=	TokenNameEQUAL	
"Select"	TokenNameStringLiteral	Select
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
KEY_SELECT_MEDIA	TokenNameIdentifier	 KEY  SELECT  MEDIA
=	TokenNameEQUAL	
"SelectMedia"	TokenNameStringLiteral	SelectMedia
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
KEY_SHIFT	TokenNameIdentifier	 KEY  SHIFT
=	TokenNameEQUAL	
"Shift"	TokenNameStringLiteral	Shift
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
KEY_STOP	TokenNameIdentifier	 KEY  STOP
=	TokenNameEQUAL	
"Stop"	TokenNameStringLiteral	Stop
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
KEY_UP	TokenNameIdentifier	 KEY  UP
=	TokenNameEQUAL	
"Up"	TokenNameStringLiteral	Up
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
KEY_UNDO	TokenNameIdentifier	 KEY  UNDO
=	TokenNameEQUAL	
"Undo"	TokenNameStringLiteral	Undo
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
KEY_VOLUME_DOWN	TokenNameIdentifier	 KEY  VOLUME  DOWN
=	TokenNameEQUAL	
"VolumeDown"	TokenNameStringLiteral	VolumeDown
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
KEY_VOLUME_MUTE	TokenNameIdentifier	 KEY  VOLUME  MUTE
=	TokenNameEQUAL	
"VolumeMute"	TokenNameStringLiteral	VolumeMute
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
KEY_VOLUME_UP	TokenNameIdentifier	 KEY  VOLUME  UP
=	TokenNameEQUAL	
"VolumeUp"	TokenNameStringLiteral	VolumeUp
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
KEY_WIN	TokenNameIdentifier	 KEY  WIN
=	TokenNameEQUAL	
"Win"	TokenNameStringLiteral	Win
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
KEY_ZOOM	TokenNameIdentifier	 KEY  ZOOM
=	TokenNameEQUAL	
"Zoom"	TokenNameStringLiteral	Zoom
;	TokenNameSEMICOLON	
/** * The modifier keys in effect at the time of the event. */	TokenNameCOMMENT_JAVADOC	 The modifier keys in effect at the time of the event. 
protected	TokenNameprotected	
HashSet	TokenNameIdentifier	 Hash Set
modifierKeys	TokenNameIdentifier	 modifier Keys
=	TokenNameEQUAL	
new	TokenNamenew	
HashSet	TokenNameIdentifier	 Hash Set
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * The identifier string for the key. */	TokenNameCOMMENT_JAVADOC	 The identifier string for the key. 
protected	TokenNameprotected	
String	TokenNameIdentifier	 String
keyIdentifier	TokenNameIdentifier	 key Identifier
;	TokenNameSEMICOLON	
/** * The location of the key. */	TokenNameCOMMENT_JAVADOC	 The location of the key. 
protected	TokenNameprotected	
int	TokenNameint	
keyLocation	TokenNameIdentifier	 key Location
;	TokenNameSEMICOLON	
/** * <b>DOM</b>: Get whether the Control key was pressed at the time of the event. */	TokenNameCOMMENT_JAVADOC	 <b>DOM</b>: Get whether the Control key was pressed at the time of the event. 
public	TokenNamepublic	
boolean	TokenNameboolean	
getCtrlKey	TokenNameIdentifier	 get Ctrl Key
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
modifierKeys	TokenNameIdentifier	 modifier Keys
.	TokenNameDOT	
contains	TokenNameIdentifier	 contains
(	TokenNameLPAREN	
KEY_CONTROL	TokenNameIdentifier	 KEY  CONTROL
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * <b>DOM</b>: Get whether the Shift key was pressed at the time of the event. */	TokenNameCOMMENT_JAVADOC	 <b>DOM</b>: Get whether the Shift key was pressed at the time of the event. 
public	TokenNamepublic	
boolean	TokenNameboolean	
getShiftKey	TokenNameIdentifier	 get Shift Key
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
modifierKeys	TokenNameIdentifier	 modifier Keys
.	TokenNameDOT	
contains	TokenNameIdentifier	 contains
(	TokenNameLPAREN	
KEY_SHIFT	TokenNameIdentifier	 KEY  SHIFT
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * <b>DOM</b>: Get whether the Alt key was pressed at the time of the event. */	TokenNameCOMMENT_JAVADOC	 <b>DOM</b>: Get whether the Alt key was pressed at the time of the event. 
public	TokenNamepublic	
boolean	TokenNameboolean	
getAltKey	TokenNameIdentifier	 get Alt Key
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
modifierKeys	TokenNameIdentifier	 modifier Keys
.	TokenNameDOT	
contains	TokenNameIdentifier	 contains
(	TokenNameLPAREN	
KEY_ALT	TokenNameIdentifier	 KEY  ALT
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * <b>DOM</b>: Get whether the Meta key was pressed at the time of the * event. */	TokenNameCOMMENT_JAVADOC	 <b>DOM</b>: Get whether the Meta key was pressed at the time of the event. 
public	TokenNamepublic	
boolean	TokenNameboolean	
getMetaKey	TokenNameIdentifier	 get Meta Key
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
modifierKeys	TokenNameIdentifier	 modifier Keys
.	TokenNameDOT	
contains	TokenNameIdentifier	 contains
(	TokenNameLPAREN	
KEY_META	TokenNameIdentifier	 KEY  META
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * <b>DOM</b>: Get the key identifier. */	TokenNameCOMMENT_JAVADOC	 <b>DOM</b>: Get the key identifier. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getKeyIdentifier	TokenNameIdentifier	 get Key Identifier
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
keyIdentifier	TokenNameIdentifier	 key Identifier
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * <b>DOM</b>: Get the key location. */	TokenNameCOMMENT_JAVADOC	 <b>DOM</b>: Get the key location. 
public	TokenNamepublic	
int	TokenNameint	
getKeyLocation	TokenNameIdentifier	 get Key Location
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
keyLocation	TokenNameIdentifier	 key Location
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * <b>DOM</b>: Returns whether the given modifier key was pressed at the * time of the event. */	TokenNameCOMMENT_JAVADOC	 <b>DOM</b>: Returns whether the given modifier key was pressed at the time of the event. 
public	TokenNamepublic	
boolean	TokenNameboolean	
getModifierState	TokenNameIdentifier	 get Modifier State
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
keyIdentifierArg	TokenNameIdentifier	 key Identifier Arg
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
modifierKeys	TokenNameIdentifier	 modifier Keys
.	TokenNameDOT	
contains	TokenNameIdentifier	 contains
(	TokenNameLPAREN	
keyIdentifierArg	TokenNameIdentifier	 key Identifier Arg
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * <b>DOM</b>: Initializes this KeyboardEvent object. * @param typeArg Specifies the event type. * @param canBubbleArg Specifies whether or not the event can bubble. * @param cancelableArg Specifies whether or not the event's default action * can be prevented. * @param viewArg Specifies the <code>Event</code>'s * <code>AbstractView</code>. * @param keyIdentifierArg Specifies the <code>Event</code>'s * <code>keyIdentifier</code>. * @param keyLocationArg Specifies the <code>Event</code>'s * <code>keyLocation</code>. * @param modifiersList Specifies which modifiers were in effect for this * <code>Event</code>. */	TokenNameCOMMENT_JAVADOC	 <b>DOM</b>: Initializes this KeyboardEvent object. @param typeArg Specifies the event type. @param canBubbleArg Specifies whether or not the event can bubble. @param cancelableArg Specifies whether or not the event's default action can be prevented. @param viewArg Specifies the <code>Event</code>'s <code>AbstractView</code>. @param keyIdentifierArg Specifies the <code>Event</code>'s <code>keyIdentifier</code>. @param keyLocationArg Specifies the <code>Event</code>'s <code>keyLocation</code>. @param modifiersList Specifies which modifiers were in effect for this <code>Event</code>. 
public	TokenNamepublic	
void	TokenNamevoid	
initKeyboardEvent	TokenNameIdentifier	 init Keyboard Event
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
AbstractView	TokenNameIdentifier	 Abstract View
viewArg	TokenNameIdentifier	 view Arg
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
keyIdentifierArg	TokenNameIdentifier	 key Identifier Arg
,	TokenNameCOMMA	
int	TokenNameint	
keyLocationArg	TokenNameIdentifier	 key Location Arg
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
modifiersList	TokenNameIdentifier	 modifiers List
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
keyIdentifier	TokenNameIdentifier	 key Identifier
=	TokenNameEQUAL	
keyIdentifierArg	TokenNameIdentifier	 key Identifier Arg
;	TokenNameSEMICOLON	
keyLocation	TokenNameIdentifier	 key Location
=	TokenNameEQUAL	
keyLocationArg	TokenNameIdentifier	 key Location Arg
;	TokenNameSEMICOLON	
modifierKeys	TokenNameIdentifier	 modifier Keys
.	TokenNameDOT	
clear	TokenNameIdentifier	 clear
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
modifiers	TokenNameIdentifier	 modifiers
=	TokenNameEQUAL	
split	TokenNameIdentifier	 split
(	TokenNameLPAREN	
modifiersList	TokenNameIdentifier	 modifiers List
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
modifiers	TokenNameIdentifier	 modifiers
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
modifierKeys	TokenNameIdentifier	 modifier Keys
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
modifiers	TokenNameIdentifier	 modifiers
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * <b>DOM</b: Initializes this KeyboardEvent object. * @param namespaceURIArg Specifies the event namespace URI. * @param typeArg Specifies the event type. * @param canBubbleArg Specifies whether or not the event can bubble. * @param cancelableArg Specifies whether or not the event's default action * can be prevented. * @param viewArg Specifies the <code>Event</code>'s * <code>AbstractView</code>. * @param keyIdentifierArg Specifies the <code>Event</code>'s * <code>keyIdentifier</code>. * @param keyLocationArg Specifies the <code>Event</code>'s * <code>keyLocation</code>. * @param modifiersList Specifies which modifiers were in effect for this * <code>Event</code>. */	TokenNameCOMMENT_JAVADOC	 <b>DOM</b: Initializes this KeyboardEvent object. @param namespaceURIArg Specifies the event namespace URI. @param typeArg Specifies the event type. @param canBubbleArg Specifies whether or not the event can bubble. @param cancelableArg Specifies whether or not the event's default action can be prevented. @param viewArg Specifies the <code>Event</code>'s <code>AbstractView</code>. @param keyIdentifierArg Specifies the <code>Event</code>'s <code>keyIdentifier</code>. @param keyLocationArg Specifies the <code>Event</code>'s <code>keyLocation</code>. @param modifiersList Specifies which modifiers were in effect for this <code>Event</code>. 
public	TokenNamepublic	
void	TokenNamevoid	
initKeyboardEventNS	TokenNameIdentifier	 init Keyboard Event NS
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
namespaceURIArg	TokenNameIdentifier	 namespace URI Arg
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
typeArg	TokenNameIdentifier	 type Arg
,	TokenNameCOMMA	
boolean	TokenNameboolean	
canBubbleArg	TokenNameIdentifier	 can Bubble Arg
,	TokenNameCOMMA	
boolean	TokenNameboolean	
cancelableArg	TokenNameIdentifier	 cancelable Arg
,	TokenNameCOMMA	
AbstractView	TokenNameIdentifier	 Abstract View
viewArg	TokenNameIdentifier	 view Arg
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
keyIdentifierArg	TokenNameIdentifier	 key Identifier Arg
,	TokenNameCOMMA	
int	TokenNameint	
keyLocationArg	TokenNameIdentifier	 key Location Arg
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
modifiersList	TokenNameIdentifier	 modifiers List
)	TokenNameRPAREN	
{	TokenNameLBRACE	
initUIEventNS	TokenNameIdentifier	 init UI Event NS
(	TokenNameLPAREN	
namespaceURIArg	TokenNameIdentifier	 namespace URI Arg
,	TokenNameCOMMA	
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
keyIdentifier	TokenNameIdentifier	 key Identifier
=	TokenNameEQUAL	
keyIdentifierArg	TokenNameIdentifier	 key Identifier Arg
;	TokenNameSEMICOLON	
keyLocation	TokenNameIdentifier	 key Location
=	TokenNameEQUAL	
keyLocationArg	TokenNameIdentifier	 key Location Arg
;	TokenNameSEMICOLON	
modifierKeys	TokenNameIdentifier	 modifier Keys
.	TokenNameDOT	
clear	TokenNameIdentifier	 clear
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
modifiers	TokenNameIdentifier	 modifiers
=	TokenNameEQUAL	
split	TokenNameIdentifier	 split
(	TokenNameLPAREN	
modifiersList	TokenNameIdentifier	 modifiers List
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
modifiers	TokenNameIdentifier	 modifiers
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
modifierKeys	TokenNameIdentifier	 modifier Keys
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
modifiers	TokenNameIdentifier	 modifiers
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
