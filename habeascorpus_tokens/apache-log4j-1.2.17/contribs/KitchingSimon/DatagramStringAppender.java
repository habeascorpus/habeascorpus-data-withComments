/* * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
log4j	TokenNameIdentifier	 log4j
.	TokenNameDOT	
net	TokenNameIdentifier	 net
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
net	TokenNameIdentifier	 net
.	TokenNameDOT	
DatagramSocket	TokenNameIdentifier	 Datagram Socket
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
net	TokenNameIdentifier	 net
.	TokenNameDOT	
InetAddress	TokenNameIdentifier	 Inet Address
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
net	TokenNameIdentifier	 net
.	TokenNameDOT	
DatagramPacket	TokenNameIdentifier	 Datagram Packet
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
net	TokenNameIdentifier	 net
.	TokenNameDOT	
UnknownHostException	TokenNameIdentifier	 Unknown Host Exception
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
net	TokenNameIdentifier	 net
.	TokenNameDOT	
SocketException	TokenNameIdentifier	 Socket Exception
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
log4j	TokenNameIdentifier	 log4j
.	TokenNameDOT	
helpers	TokenNameIdentifier	 helpers
.	TokenNameDOT	
OptionConverter	TokenNameIdentifier	 Option Converter
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
log4j	TokenNameIdentifier	 log4j
.	TokenNameDOT	
AppenderSkeleton	TokenNameIdentifier	 Appender Skeleton
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
log4j	TokenNameIdentifier	 log4j
.	TokenNameDOT	
spi	TokenNameIdentifier	 spi
.	TokenNameDOT	
LoggingEvent	TokenNameIdentifier	 Logging Event
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
log4j	TokenNameIdentifier	 log4j
.	TokenNameDOT	
Category	TokenNameIdentifier	 Category
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
log4j	TokenNameIdentifier	 log4j
.	TokenNameDOT	
Priority	TokenNameIdentifier	 Priority
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
log4j	TokenNameIdentifier	 log4j
.	TokenNameDOT	
Layout	TokenNameIdentifier	 Layout
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
log4j	TokenNameIdentifier	 log4j
.	TokenNameDOT	
helpers	TokenNameIdentifier	 helpers
.	TokenNameDOT	
SingleLineTracerPrintWriter	TokenNameIdentifier	 Single Line Tracer Print Writer
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
log4j	TokenNameIdentifier	 log4j
.	TokenNameDOT	
helpers	TokenNameIdentifier	 helpers
.	TokenNameDOT	
LogLog	TokenNameIdentifier	 Log Log
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
log4j	TokenNameIdentifier	 log4j
.	TokenNameDOT	
helpers	TokenNameIdentifier	 helpers
.	TokenNameDOT	
QuietWriter	TokenNameIdentifier	 Quiet Writer
;	TokenNameSEMICOLON	
/** Use DatagramStringAppender to send log messages to a remote daemon which accepts Datagram (UDP) messages. <p> The benefits of UDP are that the client is guarunteed not to slow down if the network or remote log daemon is slow, and that no permanent TCP connection between client and server exists. <p> The disadvantages are that log messages can be lost if the network or remote daemon are under excessive load. <p> This class builts the final message string <b>before</b> sending the UDP packet, hence the "string" component in the class name. This means that the receiving application can be written in any language. The data is transmitted in whatever encoding is specified in the configuration file; this may be an 8-bit encoding (eg ISO-8859-1, also known as LATIN-1) or a larger encoding, eg UTF-16. <p> An alternative to building the message string within DatagramStringAppender would be to serialize & send the complete logging event object (perhaps such a class could be called a DatagramSerialAppender??). The receiving end could then be configured with appropriate Layout objects to generate the actual logged messages. This would ensure that the logging of messages from different sources is done in a consistent format, and give a central place to configure that format. It would ensure (by transmitting messages as unicode) that the receiving end could control the encoding in which the output is generated. It also would possibly allow he receiving end to use the full log4j flexibility to pass the event to different appenders at the receiving end, as the category information is retained, etc. However, this does require that the receiving end is in java, and that all clients of the logging daemon are java applications. In contrast, this DatagramStringAppender can send mesages to a log daemon that accepts messages from a variety of sources. @author Simon Kitching */	TokenNameCOMMENT_JAVADOC	 Use DatagramStringAppender to send log messages to a remote daemon which accepts Datagram (UDP) messages. <p> The benefits of UDP are that the client is guarunteed not to slow down if the network or remote log daemon is slow, and that no permanent TCP connection between client and server exists. <p> The disadvantages are that log messages can be lost if the network or remote daemon are under excessive load. <p> This class builts the final message string <b>before</b> sending the UDP packet, hence the "string" component in the class name. This means that the receiving application can be written in any language. The data is transmitted in whatever encoding is specified in the configuration file; this may be an 8-bit encoding (eg ISO-8859-1, also known as LATIN-1) or a larger encoding, eg UTF-16. <p> An alternative to building the message string within DatagramStringAppender would be to serialize & send the complete logging event object (perhaps such a class could be called a DatagramSerialAppender??). The receiving end could then be configured with appropriate Layout objects to generate the actual logged messages. This would ensure that the logging of messages from different sources is done in a consistent format, and give a central place to configure that format. It would ensure (by transmitting messages as unicode) that the receiving end could control the encoding in which the output is generated. It also would possibly allow he receiving end to use the full log4j flexibility to pass the event to different appenders at the receiving end, as the category information is retained, etc. However, this does require that the receiving end is in java, and that all clients of the logging daemon are java applications. In contrast, this DatagramStringAppender can send mesages to a log daemon that accepts messages from a variety of sources. @author Simon Kitching 
public	TokenNamepublic	
class	TokenNameclass	
DatagramStringAppender	TokenNameIdentifier	 Datagram String Appender
extends	TokenNameextends	
AppenderSkeleton	TokenNameIdentifier	 Appender Skeleton
{	TokenNameLBRACE	
/** A string constant used in naming the option for setting the destination server for messages. Current value of this string constant is <b>DatagramHost</b>. */	TokenNameCOMMENT_JAVADOC	 A string constant used in naming the option for setting the destination server for messages. Current value of this string constant is <b>DatagramHost</b>. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
DATAGRAM_HOST_OPTION	TokenNameIdentifier	 DATAGRAM  HOST  OPTION
=	TokenNameEQUAL	
"DatagramHost"	TokenNameStringLiteral	DatagramHost
;	TokenNameSEMICOLON	
/** A string constant used in naming the option for setting the destination port for messages. Current value of this string constant is <b>DatagramPort</b>. */	TokenNameCOMMENT_JAVADOC	 A string constant used in naming the option for setting the destination port for messages. Current value of this string constant is <b>DatagramPort</b>. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
DATAGRAM_PORT_OPTION	TokenNameIdentifier	 DATAGRAM  PORT  OPTION
=	TokenNameEQUAL	
"DatagramPort"	TokenNameStringLiteral	DatagramPort
;	TokenNameSEMICOLON	
/** A string constant used in naming the option for setting the character encoding used when generating the log message. Current value of this string constant is <b>DatagramEncoding</b>. */	TokenNameCOMMENT_JAVADOC	 A string constant used in naming the option for setting the character encoding used when generating the log message. Current value of this string constant is <b>DatagramEncoding</b>. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
DATAGRAM_ENCODING_OPTION	TokenNameIdentifier	 DATAGRAM  ENCODING  OPTION
=	TokenNameEQUAL	
"DatagramEncoding"	TokenNameStringLiteral	DatagramEncoding
;	TokenNameSEMICOLON	
/** The default value for the "host" attribute, ie the machine to which messages are sent. Current value of this string constant is <b>localhost</b>. */	TokenNameCOMMENT_JAVADOC	 The default value for the "host" attribute, ie the machine to which messages are sent. Current value of this string constant is <b>localhost</b>. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
DEFAULT_HOST	TokenNameIdentifier	 DEFAULT  HOST
=	TokenNameEQUAL	
"localhost"	TokenNameStringLiteral	localhost
;	TokenNameSEMICOLON	
/** The default value for the "port" attribute, ie the UDP port to which messages are sent. Current value of this integer constant is <b>8200</b>. This value was chosen for no particular reason. */	TokenNameCOMMENT_JAVADOC	 The default value for the "port" attribute, ie the UDP port to which messages are sent. Current value of this integer constant is <b>8200</b>. This value was chosen for no particular reason. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
DEFAULT_PORT	TokenNameIdentifier	 DEFAULT  PORT
=	TokenNameEQUAL	
8200	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** The default value for the "encoding" attribute, ie the way in which unicode message strings are converted into a stream of bytes before their transmission as a UDP packet. The current value of this constant is <b>null</b>, which means that the default platform encoding will be used. */	TokenNameCOMMENT_JAVADOC	 The default value for the "encoding" attribute, ie the way in which unicode message strings are converted into a stream of bytes before their transmission as a UDP packet. The current value of this constant is <b>null</b>, which means that the default platform encoding will be used. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
DEFAULT_ENCODING	TokenNameIdentifier	 DEFAULT  ENCODING
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
host	TokenNameIdentifier	 host
=	TokenNameEQUAL	
DEFAULT_HOST	TokenNameIdentifier	 DEFAULT  HOST
;	TokenNameSEMICOLON	
int	TokenNameint	
port	TokenNameIdentifier	 port
=	TokenNameEQUAL	
DEFAULT_PORT	TokenNameIdentifier	 DEFAULT  PORT
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
encoding	TokenNameIdentifier	 encoding
=	TokenNameEQUAL	
DEFAULT_ENCODING	TokenNameIdentifier	 DEFAULT  ENCODING
;	TokenNameSEMICOLON	
SingleLineTracerPrintWriter	TokenNameIdentifier	 Single Line Tracer Print Writer
stp	TokenNameIdentifier	 stp
;	TokenNameSEMICOLON	
QuietWriter	TokenNameIdentifier	 Quiet Writer
qw	TokenNameIdentifier	 qw
;	TokenNameSEMICOLON	
public	TokenNamepublic	
DatagramStringAppender	TokenNameIdentifier	 Datagram String Appender
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
setDestination	TokenNameIdentifier	 set Destination
(	TokenNameLPAREN	
DEFAULT_HOST	TokenNameIdentifier	 DEFAULT  HOST
,	TokenNameCOMMA	
DEFAULT_PORT	TokenNameIdentifier	 DEFAULT  PORT
,	TokenNameCOMMA	
DEFAULT_ENCODING	TokenNameIdentifier	 DEFAULT  ENCODING
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
DatagramStringAppender	TokenNameIdentifier	 Datagram String Appender
(	TokenNameLPAREN	
Layout	TokenNameIdentifier	 Layout
layout	TokenNameIdentifier	 layout
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
setLayout	TokenNameIdentifier	 set Layout
(	TokenNameLPAREN	
layout	TokenNameIdentifier	 layout
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
setDestination	TokenNameIdentifier	 set Destination
(	TokenNameLPAREN	
DEFAULT_HOST	TokenNameIdentifier	 DEFAULT  HOST
,	TokenNameCOMMA	
DEFAULT_PORT	TokenNameIdentifier	 DEFAULT  PORT
,	TokenNameCOMMA	
DEFAULT_ENCODING	TokenNameIdentifier	 DEFAULT  ENCODING
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
DatagramStringAppender	TokenNameIdentifier	 Datagram String Appender
(	TokenNameLPAREN	
Layout	TokenNameIdentifier	 Layout
layout	TokenNameIdentifier	 layout
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
host	TokenNameIdentifier	 host
,	TokenNameCOMMA	
int	TokenNameint	
port	TokenNameIdentifier	 port
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
setLayout	TokenNameIdentifier	 set Layout
(	TokenNameLPAREN	
layout	TokenNameIdentifier	 layout
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
setDestination	TokenNameIdentifier	 set Destination
(	TokenNameLPAREN	
host	TokenNameIdentifier	 host
,	TokenNameCOMMA	
port	TokenNameIdentifier	 port
,	TokenNameCOMMA	
DEFAULT_ENCODING	TokenNameIdentifier	 DEFAULT  ENCODING
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
DatagramStringAppender	TokenNameIdentifier	 Datagram String Appender
(	TokenNameLPAREN	
Layout	TokenNameIdentifier	 Layout
layout	TokenNameIdentifier	 layout
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
host	TokenNameIdentifier	 host
,	TokenNameCOMMA	
int	TokenNameint	
port	TokenNameIdentifier	 port
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
encoding	TokenNameIdentifier	 encoding
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
setLayout	TokenNameIdentifier	 set Layout
(	TokenNameLPAREN	
layout	TokenNameIdentifier	 layout
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
setDestination	TokenNameIdentifier	 set Destination
(	TokenNameLPAREN	
host	TokenNameIdentifier	 host
,	TokenNameCOMMA	
port	TokenNameIdentifier	 port
,	TokenNameCOMMA	
encoding	TokenNameIdentifier	 encoding
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Release any resources held by this Appender */	TokenNameCOMMENT_JAVADOC	 Release any resources held by this Appender 
public	TokenNamepublic	
void	TokenNamevoid	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
closed	TokenNameIdentifier	 closed
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
// A DatagramWriter is UDP based and needs no opening. Hence, it 	TokenNameCOMMENT_LINE	A DatagramWriter is UDP based and needs no opening. Hence, it 
// can't be closed. We just unset the variables here. 	TokenNameCOMMENT_LINE	can't be closed. We just unset the variables here. 
qw	TokenNameIdentifier	 qw
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
stp	TokenNameIdentifier	 stp
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
LoggingEvent	TokenNameIdentifier	 Logging Event
event	TokenNameIdentifier	 event
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
isAsSevereAsThreshold	TokenNameIdentifier	 is As Severe As Threshold
(	TokenNameLPAREN	
event	TokenNameIdentifier	 event
.	TokenNameDOT	
priority	TokenNameIdentifier	 priority
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
// We must not attempt to append if qw is null. 	TokenNameCOMMENT_LINE	We must not attempt to append if qw is null. 
if	TokenNameif	
(	TokenNameLPAREN	
qw	TokenNameIdentifier	 qw
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
errorHandler	TokenNameIdentifier	 error Handler
.	TokenNameDOT	
error	TokenNameIdentifier	 error
(	TokenNameLPAREN	
"No host is set for DatagramStringAppender named ""	TokenNameStringLiteral	No host is set for DatagramStringAppender named "
+	TokenNamePLUS	
this	TokenNamethis	
.	TokenNameDOT	
name	TokenNameIdentifier	 name
+	TokenNamePLUS	
""."	TokenNameStringLiteral	".
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
String	TokenNameIdentifier	 String
buffer	TokenNameIdentifier	 buffer
=	TokenNameEQUAL	
layout	TokenNameIdentifier	 layout
.	TokenNameDOT	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
event	TokenNameIdentifier	 event
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
qw	TokenNameIdentifier	 qw
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
buffer	TokenNameIdentifier	 buffer
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
event	TokenNameIdentifier	 event
.	TokenNameDOT	
throwable	TokenNameIdentifier	 throwable
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
event	TokenNameIdentifier	 event
.	TokenNameDOT	
throwable	TokenNameIdentifier	 throwable
.	TokenNameDOT	
printStackTrace	TokenNameIdentifier	 print Stack Trace
(	TokenNameLPAREN	
stp	TokenNameIdentifier	 stp
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
event	TokenNameIdentifier	 event
.	TokenNameDOT	
throwableInformation	TokenNameIdentifier	 throwable Information
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// we must be the receiver of a serialized/deserialized LoggingEvent; 	TokenNameCOMMENT_LINE	we must be the receiver of a serialized/deserialized LoggingEvent; 
// the event's throwable member is transient, ie becomes null when 	TokenNameCOMMENT_LINE	the event's throwable member is transient, ie becomes null when 
// deserialized, but that's ok because throwableInformation should 	TokenNameCOMMENT_LINE	deserialized, but that's ok because throwableInformation should 
// have the string equivalent of the same info (ie stack trace) 	TokenNameCOMMENT_LINE	have the string equivalent of the same info (ie stack trace) 
qw	TokenNameIdentifier	 qw
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
event	TokenNameIdentifier	 event
.	TokenNameDOT	
throwableInformation	TokenNameIdentifier	 throwable Information
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** Activate the options set via the setOption method. @see #setOption */	TokenNameCOMMENT_JAVADOC	 Activate the options set via the setOption method. @see #setOption 
public	TokenNamepublic	
void	TokenNamevoid	
activateOptions	TokenNameIdentifier	 activate Options
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
setDestination	TokenNameIdentifier	 set Destination
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
host	TokenNameIdentifier	 host
,	TokenNameCOMMA	
this	TokenNamethis	
.	TokenNameDOT	
port	TokenNameIdentifier	 port
,	TokenNameCOMMA	
this	TokenNamethis	
.	TokenNameDOT	
encoding	TokenNameIdentifier	 encoding
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Returns the option names for this component, namely the string array consisting of {{@link #DATAGRAM_HOST_OPTION}, {@link #DATAGRAM_PORT_OPTION}, {@link #DATAGRAM_ENCODING_OPTION} */	TokenNameCOMMENT_JAVADOC	 Returns the option names for this component, namely the string array consisting of {{@link #DATAGRAM_HOST_OPTION}, {@link #DATAGRAM_PORT_OPTION}, {@link #DATAGRAM_ENCODING_OPTION} 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
getOptionStrings	TokenNameIdentifier	 get Option Strings
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
OptionConverter	TokenNameIdentifier	 Option Converter
.	TokenNameDOT	
concatanateArrays	TokenNameIdentifier	 concatanate Arrays
(	TokenNameLPAREN	
super	TokenNamesuper	
.	TokenNameDOT	
getOptionStrings	TokenNameIdentifier	 get Option Strings
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
DATAGRAM_HOST_OPTION	TokenNameIdentifier	 DATAGRAM  HOST  OPTION
,	TokenNameCOMMA	
DATAGRAM_PORT_OPTION	TokenNameIdentifier	 DATAGRAM  PORT  OPTION
,	TokenNameCOMMA	
DATAGRAM_ENCODING_OPTION	TokenNameIdentifier	 DATAGRAM  ENCODING  OPTION
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** The DatagramStringAppender requires a layout. Hence, this method return <code>true</code>. @since 0.8.4 */	TokenNameCOMMENT_JAVADOC	 The DatagramStringAppender requires a layout. Hence, this method return <code>true</code>. @since 0.8.4 
public	TokenNamepublic	
boolean	TokenNameboolean	
requiresLayout	TokenNameIdentifier	 requires Layout
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Set DatagramStringAppender specific parameters. <p> The recognized options are <b>DatagramHost</b>, <b>DatagramPort</b> and <b>DatagramEncoding</b>, i.e. the values of the string constants {@link #DATAGRAM_HOST_OPTION}, {@link #DATAGRAM_PORT_OPTION} and {@link #DATAGRAM_ENCODING_OPTION} respectively. <p> <dl> <p> <dt><b>DatagramHost</b> <dd> The name (or ip address) of the host machine where log output should go. If the DatagramHost is not set, then this appender will default to {@link #DEFAULT_HOST}. <p> <dt><b>DatagramPort</b> <dd> The UDP port number where log output should go. See {@link #DEFAULT_PORT} <p> <dt><b>DatagramEncoding</b> <dd> The ISO character encoding to be used when converting the Unicode message to a sequence of bytes within a UDP packet. If not defined, then the encoding defaults to the default platform encoding. </dl> */	TokenNameCOMMENT_JAVADOC	 Set DatagramStringAppender specific parameters. <p> The recognized options are <b>DatagramHost</b>, <b>DatagramPort</b> and <b>DatagramEncoding</b>, i.e. the values of the string constants {@link #DATAGRAM_HOST_OPTION}, {@link #DATAGRAM_PORT_OPTION} and {@link #DATAGRAM_ENCODING_OPTION} respectively. <p> <dl> <p> <dt><b>DatagramHost</b> <dd> The name (or ip address) of the host machine where log output should go. If the DatagramHost is not set, then this appender will default to {@link #DEFAULT_HOST}. <p> <dt><b>DatagramPort</b> <dd> The UDP port number where log output should go. See {@link #DEFAULT_PORT} <p> <dt><b>DatagramEncoding</b> <dd> The ISO character encoding to be used when converting the Unicode message to a sequence of bytes within a UDP packet. If not defined, then the encoding defaults to the default platform encoding. </dl> 
public	TokenNamepublic	
void	TokenNamevoid	
setOption	TokenNameIdentifier	 set Option
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
option	TokenNameIdentifier	 option
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
super	TokenNamesuper	
.	TokenNameDOT	
setOption	TokenNameIdentifier	 set Option
(	TokenNameLPAREN	
option	TokenNameIdentifier	 option
,	TokenNameCOMMA	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
option	TokenNameIdentifier	 option
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
DATAGRAM_HOST_OPTION	TokenNameIdentifier	 DATAGRAM  HOST  OPTION
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
host	TokenNameIdentifier	 host
=	TokenNameEQUAL	
value	TokenNameIdentifier	 value
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
option	TokenNameIdentifier	 option
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
DATAGRAM_PORT_OPTION	TokenNameIdentifier	 DATAGRAM  PORT  OPTION
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
port	TokenNameIdentifier	 port
=	TokenNameEQUAL	
OptionConverter	TokenNameIdentifier	 Option Converter
.	TokenNameDOT	
toInt	TokenNameIdentifier	 to Int
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
,	TokenNameCOMMA	
DEFAULT_PORT	TokenNameIdentifier	 DEFAULT  PORT
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
option	TokenNameIdentifier	 option
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
DATAGRAM_ENCODING_OPTION	TokenNameIdentifier	 DATAGRAM  ENCODING  OPTION
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
encoding	TokenNameIdentifier	 encoding
=	TokenNameEQUAL	
value	TokenNameIdentifier	 value
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setDestination	TokenNameIdentifier	 set Destination
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
host	TokenNameIdentifier	 host
,	TokenNameCOMMA	
int	TokenNameint	
port	TokenNameIdentifier	 port
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
encoding	TokenNameIdentifier	 encoding
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
host	TokenNameIdentifier	 host
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
LogLog	TokenNameIdentifier	 Log Log
.	TokenNameDOT	
error	TokenNameIdentifier	 error
(	TokenNameLPAREN	
"setDestination: host is null"	TokenNameStringLiteral	setDestination: host is null
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
host	TokenNameIdentifier	 host
=	TokenNameEQUAL	
DEFAULT_HOST	TokenNameIdentifier	 DEFAULT  HOST
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
this	TokenNamethis	
.	TokenNameDOT	
host	TokenNameIdentifier	 host
=	TokenNameEQUAL	
host	TokenNameIdentifier	 host
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
port	TokenNameIdentifier	 port
=	TokenNameEQUAL	
port	TokenNameIdentifier	 port
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
encoding	TokenNameIdentifier	 encoding
=	TokenNameEQUAL	
encoding	TokenNameIdentifier	 encoding
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
qw	TokenNameIdentifier	 qw
=	TokenNameEQUAL	
new	TokenNamenew	
QuietWriter	TokenNameIdentifier	 Quiet Writer
(	TokenNameLPAREN	
new	TokenNamenew	
DatagramStringWriter	TokenNameIdentifier	 Datagram String Writer
(	TokenNameLPAREN	
host	TokenNameIdentifier	 host
,	TokenNameCOMMA	
port	TokenNameIdentifier	 port
,	TokenNameCOMMA	
encoding	TokenNameIdentifier	 encoding
)	TokenNameRPAREN	
,	TokenNameCOMMA	
errorHandler	TokenNameIdentifier	 error Handler
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
stp	TokenNameIdentifier	 stp
=	TokenNameEQUAL	
new	TokenNamenew	
SingleLineTracerPrintWriter	TokenNameIdentifier	 Single Line Tracer Print Writer
(	TokenNameLPAREN	
qw	TokenNameIdentifier	 qw
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setLayout	TokenNameIdentifier	 set Layout
(	TokenNameLPAREN	
Layout	TokenNameIdentifier	 Layout
layout	TokenNameIdentifier	 layout
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
layout	TokenNameIdentifier	 layout
=	TokenNameEQUAL	
layout	TokenNameIdentifier	 layout
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
