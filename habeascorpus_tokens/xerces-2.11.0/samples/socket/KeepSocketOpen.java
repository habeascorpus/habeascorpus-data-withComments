/* * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
socket	TokenNameIdentifier	 socket
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
EOFException	TokenNameIdentifier	 EOF Exception
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
FileInputStream	TokenNameIdentifier	 File Input Stream
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
FilterInputStream	TokenNameIdentifier	 Filter Input Stream
;	TokenNameSEMICOLON	
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
io	TokenNameIdentifier	 io
.	TokenNameDOT	
InputStream	TokenNameIdentifier	 Input Stream
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
OutputStream	TokenNameIdentifier	 Output Stream
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
net	TokenNameIdentifier	 net
.	TokenNameDOT	
ServerSocket	TokenNameIdentifier	 Server Socket
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
net	TokenNameIdentifier	 net
.	TokenNameDOT	
Socket	TokenNameIdentifier	 Socket
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Random	TokenNameIdentifier	 Random
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xerces	TokenNameIdentifier	 xerces
.	TokenNameDOT	
parsers	TokenNameIdentifier	 parsers
.	TokenNameDOT	
SAXParser	TokenNameIdentifier	 SAX Parser
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
sax	TokenNameIdentifier	 sax
.	TokenNameDOT	
AttributeList	TokenNameIdentifier	 Attribute List
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
sax	TokenNameIdentifier	 sax
.	TokenNameDOT	
HandlerBase	TokenNameIdentifier	 Handler Base
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
sax	TokenNameIdentifier	 sax
.	TokenNameDOT	
InputSource	TokenNameIdentifier	 Input Source
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
sax	TokenNameIdentifier	 sax
.	TokenNameDOT	
SAXException	TokenNameIdentifier	 SAX Exception
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
sax	TokenNameIdentifier	 sax
.	TokenNameDOT	
SAXParseException	TokenNameIdentifier	 SAX Parse Exception
;	TokenNameSEMICOLON	
import	TokenNameimport	
socket	TokenNameIdentifier	 socket
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
WrappedInputStream	TokenNameIdentifier	 Wrapped Input Stream
;	TokenNameSEMICOLON	
import	TokenNameimport	
socket	TokenNameIdentifier	 socket
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
WrappedOutputStream	TokenNameIdentifier	 Wrapped Output Stream
;	TokenNameSEMICOLON	
/** * This sample provides a solution to the problem of 1) sending multiple * XML documents over a single socket connection or 2) sending other types * of data after the XML document without closing the socket connection. * <p> * The first situation is a problem because the XML specification does * not allow a document to contain multiple root elements. Therefore a * document stream must end (or at least appear to end) for the XML * parser to accept it as the end of the document. * <p> * The second situation is a problem because the XML parser buffers the * input stream in specified block sizes for performance reasons. This * could cause the parser to accidentally read additional bytes of data * beyond the end of the document. This actually relates to the first * problem if the documents are encoding in two different international * encodings. * <p> * The solution that this sample introduces wraps both the input and * output stream on both ends of the socket. The stream wrappers * introduce a protocol that allows arbitrary length data to be sent * as separate, localized input streams. While the socket stream * remains open, a separate input stream is created to "wrap" an * incoming document and make it appear as if it were a standalone * input stream. * <p> * To use this sample, enter any number of filenames of XML documents * as parameters to the program. For example: * <pre> * java socket.KeepSocketOpen doc1.xml doc2.xml doc3.xml * </pre> * <p> * This program will create a server and client thread that communicate * on a specified port number on the "localhost" address. When the client * connects to the server, the server sends each XML document specified * on the command line to the client in sequence, wrapping each document * in a WrappedOutputStream. The client uses a WrappedInputStream to * read the data and pass it to the parser. * <p> * <strong>Note:</strong> Do not send any XML documents with associated * grammars to the client. In other words, don't send any documents * that contain a DOCTYPE line that references an external DTD because * the client will not be able to resolve the location of the DTD and * an error will be issued by the client. * * @see socket.io.WrappedInputStream * @see socket.io.WrappedOutputStream * * @author Andy Clark, IBM * * @version $Id: KeepSocketOpen.java 699895 2008-09-28 21:21:24Z mrglavas $ */	TokenNameCOMMENT_JAVADOC	 This sample provides a solution to the problem of 1) sending multiple XML documents over a single socket connection or 2) sending other types of data after the XML document without closing the socket connection. <p> The first situation is a problem because the XML specification does not allow a document to contain multiple root elements. Therefore a document stream must end (or at least appear to end) for the XML parser to accept it as the end of the document. <p> The second situation is a problem because the XML parser buffers the input stream in specified block sizes for performance reasons. This could cause the parser to accidentally read additional bytes of data beyond the end of the document. This actually relates to the first problem if the documents are encoding in two different international encodings. <p> The solution that this sample introduces wraps both the input and output stream on both ends of the socket. The stream wrappers introduce a protocol that allows arbitrary length data to be sent as separate, localized input streams. While the socket stream remains open, a separate input stream is created to "wrap" an incoming document and make it appear as if it were a standalone input stream. <p> To use this sample, enter any number of filenames of XML documents as parameters to the program. For example: <pre> java socket.KeepSocketOpen doc1.xml doc2.xml doc3.xml </pre> <p> This program will create a server and client thread that communicate on a specified port number on the "localhost" address. When the client connects to the server, the server sends each XML document specified on the command line to the client in sequence, wrapping each document in a WrappedOutputStream. The client uses a WrappedInputStream to read the data and pass it to the parser. <p> <strong>Note:</strong> Do not send any XML documents with associated grammars to the client. In other words, don't send any documents that contain a DOCTYPE line that references an external DTD because the client will not be able to resolve the location of the DTD and an error will be issued by the client. * @see socket.io.WrappedInputStream @see socket.io.WrappedOutputStream * @author Andy Clark, IBM * @version $Id: KeepSocketOpen.java 699895 2008-09-28 21:21:24Z mrglavas $ 
public	TokenNamepublic	
class	TokenNameclass	
KeepSocketOpen	TokenNameIdentifier	 Keep Socket Open
{	TokenNameLBRACE	
// 	TokenNameCOMMENT_LINE	 
// MAIN 	TokenNameCOMMENT_LINE	MAIN 
// 	TokenNameCOMMENT_LINE	 
/** Main program entry. */	TokenNameCOMMENT_JAVADOC	 Main program entry. 
public	TokenNamepublic	
static	TokenNamestatic	
void	TokenNamevoid	
main	TokenNameIdentifier	 main
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
argv	TokenNameIdentifier	 argv
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
// constants 	TokenNameCOMMENT_LINE	constants 
final	TokenNamefinal	
int	TokenNameint	
port	TokenNameIdentifier	 port
=	TokenNameEQUAL	
6789	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// check args 	TokenNameCOMMENT_LINE	check args 
if	TokenNameif	
(	TokenNameLPAREN	
argv	TokenNameIdentifier	 argv
.	TokenNameDOT	
length	TokenNameIdentifier	 length
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"usage: java socket.KeepSocketOpen file(s)"	TokenNameStringLiteral	usage: java socket.KeepSocketOpen file(s)
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
exit	TokenNameIdentifier	 exit
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// create server and client 	TokenNameCOMMENT_LINE	create server and client 
Server	TokenNameIdentifier	 Server
server	TokenNameIdentifier	 server
=	TokenNameEQUAL	
new	TokenNamenew	
Server	TokenNameIdentifier	 Server
(	TokenNameLPAREN	
port	TokenNameIdentifier	 port
,	TokenNameCOMMA	
argv	TokenNameIdentifier	 argv
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Client	TokenNameIdentifier	 Client
client	TokenNameIdentifier	 client
=	TokenNameEQUAL	
new	TokenNamenew	
Client	TokenNameIdentifier	 Client
(	TokenNameLPAREN	
"localhost"	TokenNameStringLiteral	localhost
,	TokenNameCOMMA	
port	TokenNameIdentifier	 port
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// start it running 	TokenNameCOMMENT_LINE	start it running 
new	TokenNamenew	
Thread	TokenNameIdentifier	 Thread
(	TokenNameLPAREN	
server	TokenNameIdentifier	 server
)	TokenNameRPAREN	
.	TokenNameDOT	
start	TokenNameIdentifier	 start
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
new	TokenNamenew	
Thread	TokenNameIdentifier	 Thread
(	TokenNameLPAREN	
client	TokenNameIdentifier	 client
)	TokenNameRPAREN	
.	TokenNameDOT	
start	TokenNameIdentifier	 start
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// main(String[]) 	TokenNameCOMMENT_LINE	main(String[]) 
// 	TokenNameCOMMENT_LINE	 
// Classes 	TokenNameCOMMENT_LINE	Classes 
// 	TokenNameCOMMENT_LINE	 
/** * Server. * * @author Andy Clark, IBM */	TokenNameCOMMENT_JAVADOC	 Server. * @author Andy Clark, IBM 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
class	TokenNameclass	
Server	TokenNameIdentifier	 Server
extends	TokenNameextends	
ServerSocket	TokenNameIdentifier	 Server Socket
implements	TokenNameimplements	
Runnable	TokenNameIdentifier	 Runnable
{	TokenNameLBRACE	
// 	TokenNameCOMMENT_LINE	 
// Data 	TokenNameCOMMENT_LINE	Data 
// 	TokenNameCOMMENT_LINE	 
/** Files to send. */	TokenNameCOMMENT_JAVADOC	 Files to send. 
private	TokenNameprivate	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
fFilenames	TokenNameIdentifier	 f Filenames
;	TokenNameSEMICOLON	
/** Verbose mode. */	TokenNameCOMMENT_JAVADOC	 Verbose mode. 
private	TokenNameprivate	
boolean	TokenNameboolean	
fVerbose	TokenNameIdentifier	 f Verbose
;	TokenNameSEMICOLON	
/** Buffer. */	TokenNameCOMMENT_JAVADOC	 Buffer. 
private	TokenNameprivate	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
fBuffer	TokenNameIdentifier	 f Buffer
;	TokenNameSEMICOLON	
// 	TokenNameCOMMENT_LINE	 
// Constructors 	TokenNameCOMMENT_LINE	Constructors 
// 	TokenNameCOMMENT_LINE	 
/** * Constructs a server on the specified port and with the given * file list in terse mode. */	TokenNameCOMMENT_JAVADOC	 Constructs a server on the specified port and with the given file list in terse mode. 
public	TokenNamepublic	
Server	TokenNameIdentifier	 Server
(	TokenNameLPAREN	
int	TokenNameint	
port	TokenNameIdentifier	 port
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
filenames	TokenNameIdentifier	 filenames
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
port	TokenNameIdentifier	 port
,	TokenNameCOMMA	
filenames	TokenNameIdentifier	 filenames
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Constructs a server on the specified port and with the given * file list and verbosity. */	TokenNameCOMMENT_JAVADOC	 Constructs a server on the specified port and with the given file list and verbosity. 
public	TokenNamepublic	
Server	TokenNameIdentifier	 Server
(	TokenNameLPAREN	
int	TokenNameint	
port	TokenNameIdentifier	 port
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
filenames	TokenNameIdentifier	 filenames
,	TokenNameCOMMA	
boolean	TokenNameboolean	
verbose	TokenNameIdentifier	 verbose
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
port	TokenNameIdentifier	 port
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"Server: Created."	TokenNameStringLiteral	Server: Created.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fFilenames	TokenNameIdentifier	 f Filenames
=	TokenNameEQUAL	
filenames	TokenNameIdentifier	 filenames
;	TokenNameSEMICOLON	
fVerbose	TokenNameIdentifier	 f Verbose
=	TokenNameEQUAL	
verbose	TokenNameIdentifier	 verbose
;	TokenNameSEMICOLON	
//fBuffer = new byte[1024]; 	TokenNameCOMMENT_LINE	fBuffer = new byte[1024]; 
fBuffer	TokenNameIdentifier	 f Buffer
=	TokenNameEQUAL	
new	TokenNamenew	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
4096	TokenNameIntegerLiteral	
<<	TokenNameLEFT_SHIFT	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// <init>(int,String[]) 	TokenNameCOMMENT_LINE	<init>(int,String[]) 
// 	TokenNameCOMMENT_LINE	 
// Runnable methods 	TokenNameCOMMENT_LINE	Runnable methods 
// 	TokenNameCOMMENT_LINE	 
/** Runs the server. */	TokenNameCOMMENT_JAVADOC	 Runs the server. 
public	TokenNamepublic	
void	TokenNamevoid	
run	TokenNameIdentifier	 run
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"Server: Running."	TokenNameStringLiteral	Server: Running.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
Random	TokenNameIdentifier	 Random
random	TokenNameIdentifier	 random
=	TokenNameEQUAL	
new	TokenNamenew	
Random	TokenNameIdentifier	 Random
(	TokenNameLPAREN	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
currentTimeMillis	TokenNameIdentifier	 current Time Millis
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
// accept connection 	TokenNameCOMMENT_LINE	accept connection 
if	TokenNameif	
(	TokenNameLPAREN	
fVerbose	TokenNameIdentifier	 f Verbose
)	TokenNameRPAREN	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"Server: Waiting for Client connection..."	TokenNameStringLiteral	Server: Waiting for Client connection...
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
Socket	TokenNameIdentifier	 Socket
clientSocket	TokenNameIdentifier	 client Socket
=	TokenNameEQUAL	
accept	TokenNameIdentifier	 accept
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
OutputStream	TokenNameIdentifier	 Output Stream
clientStream	TokenNameIdentifier	 client Stream
=	TokenNameEQUAL	
clientSocket	TokenNameIdentifier	 client Socket
.	TokenNameDOT	
getOutputStream	TokenNameIdentifier	 get Output Stream
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"Server: Client connected."	TokenNameStringLiteral	Server: Client connected.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// send files, one at a time 	TokenNameCOMMENT_LINE	send files, one at a time 
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
fFilenames	TokenNameIdentifier	 f Filenames
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// open file 	TokenNameCOMMENT_LINE	open file 
String	TokenNameIdentifier	 String
filename	TokenNameIdentifier	 filename
=	TokenNameEQUAL	
fFilenames	TokenNameIdentifier	 f Filenames
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"Server: Opening file ""	TokenNameStringLiteral	Server: Opening file "
+	TokenNamePLUS	
filename	TokenNameIdentifier	 filename
+	TokenNamePLUS	
'"'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
FileInputStream	TokenNameIdentifier	 File Input Stream
fileIn	TokenNameIdentifier	 file In
=	TokenNameEQUAL	
new	TokenNamenew	
FileInputStream	TokenNameIdentifier	 File Input Stream
(	TokenNameLPAREN	
filename	TokenNameIdentifier	 filename
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// wrap stream 	TokenNameCOMMENT_LINE	wrap stream 
if	TokenNameif	
(	TokenNameLPAREN	
fVerbose	TokenNameIdentifier	 f Verbose
)	TokenNameRPAREN	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"Server: Wrapping output stream."	TokenNameStringLiteral	Server: Wrapping output stream.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
WrappedOutputStream	TokenNameIdentifier	 Wrapped Output Stream
wrappedOut	TokenNameIdentifier	 wrapped Out
=	TokenNameEQUAL	
new	TokenNamenew	
WrappedOutputStream	TokenNameIdentifier	 Wrapped Output Stream
(	TokenNameLPAREN	
clientStream	TokenNameIdentifier	 client Stream
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// read file, writing to output 	TokenNameCOMMENT_LINE	read file, writing to output 
int	TokenNameint	
total	TokenNameIdentifier	 total
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// read random amount 	TokenNameCOMMENT_LINE	read random amount 
//int length = (Math.abs(random.nextInt()) % fBuffer.length) + 1; 	TokenNameCOMMENT_LINE	int length = (Math.abs(random.nextInt()) % fBuffer.length) + 1; 
int	TokenNameint	
length	TokenNameIdentifier	 length
=	TokenNameEQUAL	
fBuffer	TokenNameIdentifier	 f Buffer
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
fVerbose	TokenNameIdentifier	 f Verbose
)	TokenNameRPAREN	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"Server: Attempting to read "	TokenNameStringLiteral	Server: Attempting to read 
+	TokenNamePLUS	
length	TokenNameIdentifier	 length
+	TokenNamePLUS	
" byte(s)."	TokenNameStringLiteral	 byte(s).
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
count	TokenNameIdentifier	 count
=	TokenNameEQUAL	
fileIn	TokenNameIdentifier	 file In
.	TokenNameDOT	
read	TokenNameIdentifier	 read
(	TokenNameLPAREN	
fBuffer	TokenNameIdentifier	 f Buffer
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
count	TokenNameIdentifier	 count
==	TokenNameEQUAL_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
fVerbose	TokenNameIdentifier	 f Verbose
)	TokenNameRPAREN	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"Server: EOF."	TokenNameStringLiteral	Server: EOF.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
fVerbose	TokenNameIdentifier	 f Verbose
)	TokenNameRPAREN	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"Server: Writing "	TokenNameStringLiteral	Server: Writing 
+	TokenNamePLUS	
count	TokenNameIdentifier	 count
+	TokenNamePLUS	
" byte(s) to wrapped output stream."	TokenNameStringLiteral	 byte(s) to wrapped output stream.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
wrappedOut	TokenNameIdentifier	 wrapped Out
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
fBuffer	TokenNameIdentifier	 f Buffer
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
count	TokenNameIdentifier	 count
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
total	TokenNameIdentifier	 total
+=	TokenNamePLUS_EQUAL	
count	TokenNameIdentifier	 count
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"Server: Wrote "	TokenNameStringLiteral	Server: Wrote 
+	TokenNamePLUS	
total	TokenNameIdentifier	 total
+	TokenNamePLUS	
" byte(s) total."	TokenNameStringLiteral	 byte(s) total.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// close stream 	TokenNameCOMMENT_LINE	close stream 
if	TokenNameif	
(	TokenNameLPAREN	
fVerbose	TokenNameIdentifier	 f Verbose
)	TokenNameRPAREN	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"Server: Closing output stream."	TokenNameStringLiteral	Server: Closing output stream.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
wrappedOut	TokenNameIdentifier	 wrapped Out
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// close file 	TokenNameCOMMENT_LINE	close file 
if	TokenNameif	
(	TokenNameLPAREN	
fVerbose	TokenNameIdentifier	 f Verbose
)	TokenNameRPAREN	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"Server: Closing file."	TokenNameStringLiteral	Server: Closing file.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fileIn	TokenNameIdentifier	 file In
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// close connection to client 	TokenNameCOMMENT_LINE	close connection to client 
if	TokenNameif	
(	TokenNameLPAREN	
fVerbose	TokenNameIdentifier	 f Verbose
)	TokenNameRPAREN	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"Server: Closing socket."	TokenNameStringLiteral	Server: Closing socket.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
clientSocket	TokenNameIdentifier	 client Socket
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
IOException	TokenNameIdentifier	 IO Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"Server ERROR: "	TokenNameStringLiteral	Server ERROR: 
+	TokenNamePLUS	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
getMessage	TokenNameIdentifier	 get Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"Server: Exiting."	TokenNameStringLiteral	Server: Exiting.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// run() 	TokenNameCOMMENT_LINE	run() 
}	TokenNameRBRACE	
// class Server 	TokenNameCOMMENT_LINE	class Server 
/** * Client. * * @author Andy Clark, IBM */	TokenNameCOMMENT_JAVADOC	 Client. * @author Andy Clark, IBM 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
class	TokenNameclass	
Client	TokenNameIdentifier	 Client
extends	TokenNameextends	
HandlerBase	TokenNameIdentifier	 Handler Base
implements	TokenNameimplements	
Runnable	TokenNameIdentifier	 Runnable
{	TokenNameLBRACE	
// 	TokenNameCOMMENT_LINE	 
// Data 	TokenNameCOMMENT_LINE	Data 
// 	TokenNameCOMMENT_LINE	 
/** Socket. */	TokenNameCOMMENT_JAVADOC	 Socket. 
private	TokenNameprivate	
Socket	TokenNameIdentifier	 Socket
fServerSocket	TokenNameIdentifier	 f Server Socket
;	TokenNameSEMICOLON	
/** Wrapped input stream. */	TokenNameCOMMENT_JAVADOC	 Wrapped input stream. 
private	TokenNameprivate	
WrappedInputStream	TokenNameIdentifier	 Wrapped Input Stream
fWrappedInputStream	TokenNameIdentifier	 f Wrapped Input Stream
;	TokenNameSEMICOLON	
/** Verbose mode. */	TokenNameCOMMENT_JAVADOC	 Verbose mode. 
private	TokenNameprivate	
boolean	TokenNameboolean	
fVerbose	TokenNameIdentifier	 f Verbose
;	TokenNameSEMICOLON	
/** Buffer. */	TokenNameCOMMENT_JAVADOC	 Buffer. 
private	TokenNameprivate	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
fBuffer	TokenNameIdentifier	 f Buffer
;	TokenNameSEMICOLON	
/** Parser. */	TokenNameCOMMENT_JAVADOC	 Parser. 
private	TokenNameprivate	
SAXParser	TokenNameIdentifier	 SAX Parser
fParser	TokenNameIdentifier	 f Parser
;	TokenNameSEMICOLON	
// parse data 	TokenNameCOMMENT_LINE	parse data 
/** Number of elements. */	TokenNameCOMMENT_JAVADOC	 Number of elements. 
private	TokenNameprivate	
int	TokenNameint	
fElementCount	TokenNameIdentifier	 f Element Count
;	TokenNameSEMICOLON	
/** Number of attributes. */	TokenNameCOMMENT_JAVADOC	 Number of attributes. 
private	TokenNameprivate	
int	TokenNameint	
fAttributeCount	TokenNameIdentifier	 f Attribute Count
;	TokenNameSEMICOLON	
/** Number of ignorable whitespace. */	TokenNameCOMMENT_JAVADOC	 Number of ignorable whitespace. 
private	TokenNameprivate	
int	TokenNameint	
fIgnorableWhitespaceCount	TokenNameIdentifier	 f Ignorable Whitespace Count
;	TokenNameSEMICOLON	
/** Number of characters. */	TokenNameCOMMENT_JAVADOC	 Number of characters. 
private	TokenNameprivate	
int	TokenNameint	
fCharactersCount	TokenNameIdentifier	 f Characters Count
;	TokenNameSEMICOLON	
/** Time at start of parse. */	TokenNameCOMMENT_JAVADOC	 Time at start of parse. 
private	TokenNameprivate	
long	TokenNamelong	
fTimeBefore	TokenNameIdentifier	 f Time Before
;	TokenNameSEMICOLON	
// 	TokenNameCOMMENT_LINE	 
// Constructors 	TokenNameCOMMENT_LINE	Constructors 
// 	TokenNameCOMMENT_LINE	 
/** * Constructs a Client that connects to the given port in terse * output mode. */	TokenNameCOMMENT_JAVADOC	 Constructs a Client that connects to the given port in terse output mode. 
public	TokenNamepublic	
Client	TokenNameIdentifier	 Client
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
address	TokenNameIdentifier	 address
,	TokenNameCOMMA	
int	TokenNameint	
port	TokenNameIdentifier	 port
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
address	TokenNameIdentifier	 address
,	TokenNameCOMMA	
port	TokenNameIdentifier	 port
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fParser	TokenNameIdentifier	 f Parser
=	TokenNameEQUAL	
new	TokenNamenew	
SAXParser	TokenNameIdentifier	 SAX Parser
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fParser	TokenNameIdentifier	 f Parser
.	TokenNameDOT	
setDocumentHandler	TokenNameIdentifier	 set Document Handler
(	TokenNameLPAREN	
this	TokenNamethis	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fParser	TokenNameIdentifier	 f Parser
.	TokenNameDOT	
setErrorHandler	TokenNameIdentifier	 set Error Handler
(	TokenNameLPAREN	
this	TokenNamethis	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Constructs a Client that connects to the given address:port and * with the specified verbosity. */	TokenNameCOMMENT_JAVADOC	 Constructs a Client that connects to the given address:port and with the specified verbosity. 
public	TokenNamepublic	
Client	TokenNameIdentifier	 Client
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
address	TokenNameIdentifier	 address
,	TokenNameCOMMA	
int	TokenNameint	
port	TokenNameIdentifier	 port
,	TokenNameCOMMA	
boolean	TokenNameboolean	
verbose	TokenNameIdentifier	 verbose
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"Client: Created."	TokenNameStringLiteral	Client: Created.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fServerSocket	TokenNameIdentifier	 f Server Socket
=	TokenNameEQUAL	
new	TokenNamenew	
Socket	TokenNameIdentifier	 Socket
(	TokenNameLPAREN	
address	TokenNameIdentifier	 address
,	TokenNameCOMMA	
port	TokenNameIdentifier	 port
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fVerbose	TokenNameIdentifier	 f Verbose
=	TokenNameEQUAL	
verbose	TokenNameIdentifier	 verbose
;	TokenNameSEMICOLON	
fBuffer	TokenNameIdentifier	 f Buffer
=	TokenNameEQUAL	
new	TokenNamenew	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
1024	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// <init>(String,int) 	TokenNameCOMMENT_LINE	<init>(String,int) 
// 	TokenNameCOMMENT_LINE	 
// Runnable methods 	TokenNameCOMMENT_LINE	Runnable methods 
// 	TokenNameCOMMENT_LINE	 
/** Runs the client. */	TokenNameCOMMENT_JAVADOC	 Runs the client. 
public	TokenNamepublic	
void	TokenNamevoid	
run	TokenNameIdentifier	 run
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"Client: Running."	TokenNameStringLiteral	Client: Running.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
// get input stream 	TokenNameCOMMENT_LINE	get input stream 
final	TokenNamefinal	
InputStream	TokenNameIdentifier	 Input Stream
serverStream	TokenNameIdentifier	 server Stream
=	TokenNameEQUAL	
fServerSocket	TokenNameIdentifier	 f Server Socket
.	TokenNameDOT	
getInputStream	TokenNameIdentifier	 get Input Stream
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// read files from server 	TokenNameCOMMENT_LINE	read files from server 
while	TokenNamewhile	
(	TokenNameLPAREN	
!	TokenNameNOT	
Thread	TokenNameIdentifier	 Thread
.	TokenNameDOT	
interrupted	TokenNameIdentifier	 interrupted
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// wrap input stream 	TokenNameCOMMENT_LINE	wrap input stream 
if	TokenNameif	
(	TokenNameLPAREN	
fVerbose	TokenNameIdentifier	 f Verbose
)	TokenNameRPAREN	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"Client: Wrapping input stream."	TokenNameStringLiteral	Client: Wrapping input stream.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fWrappedInputStream	TokenNameIdentifier	 f Wrapped Input Stream
=	TokenNameEQUAL	
new	TokenNamenew	
WrappedInputStream	TokenNameIdentifier	 Wrapped Input Stream
(	TokenNameLPAREN	
serverStream	TokenNameIdentifier	 server Stream
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
InputStream	TokenNameIdentifier	 Input Stream
in	TokenNameIdentifier	 in
=	TokenNameEQUAL	
new	TokenNamenew	
InputStreamReporter	TokenNameIdentifier	 Input Stream Reporter
(	TokenNameLPAREN	
fWrappedInputStream	TokenNameIdentifier	 f Wrapped Input Stream
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// parse file 	TokenNameCOMMENT_LINE	parse file 
if	TokenNameif	
(	TokenNameLPAREN	
fVerbose	TokenNameIdentifier	 f Verbose
)	TokenNameRPAREN	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"Client: Parsing XML document."	TokenNameStringLiteral	Client: Parsing XML document.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
InputSource	TokenNameIdentifier	 Input Source
source	TokenNameIdentifier	 source
=	TokenNameEQUAL	
new	TokenNamenew	
InputSource	TokenNameIdentifier	 Input Source
(	TokenNameLPAREN	
in	TokenNameIdentifier	 in
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fParser	TokenNameIdentifier	 f Parser
.	TokenNameDOT	
parse	TokenNameIdentifier	 parse
(	TokenNameLPAREN	
source	TokenNameIdentifier	 source
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fWrappedInputStream	TokenNameIdentifier	 f Wrapped Input Stream
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
// close stream 	TokenNameCOMMENT_LINE	close stream 
if	TokenNameif	
(	TokenNameLPAREN	
fVerbose	TokenNameIdentifier	 f Verbose
)	TokenNameRPAREN	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"Client: Closing input stream."	TokenNameStringLiteral	Client: Closing input stream.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
in	TokenNameIdentifier	 in
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// close socket 	TokenNameCOMMENT_LINE	close socket 
if	TokenNameif	
(	TokenNameLPAREN	
fVerbose	TokenNameIdentifier	 f Verbose
)	TokenNameRPAREN	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"Client: Closing socket."	TokenNameStringLiteral	Client: Closing socket.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fServerSocket	TokenNameIdentifier	 f Server Socket
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
EOFException	TokenNameIdentifier	 EOF Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// server closed connection; ignore 	TokenNameCOMMENT_LINE	server closed connection; ignore 
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
Exception	TokenNameIdentifier	 Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"Client ERROR: "	TokenNameStringLiteral	Client ERROR: 
+	TokenNamePLUS	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
getMessage	TokenNameIdentifier	 get Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"Client: Exiting."	TokenNameStringLiteral	Client: Exiting.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// run() 	TokenNameCOMMENT_LINE	run() 
// 	TokenNameCOMMENT_LINE	 
// DocumentHandler methods 	TokenNameCOMMENT_LINE	DocumentHandler methods 
// 	TokenNameCOMMENT_LINE	 
/** Start document. */	TokenNameCOMMENT_JAVADOC	 Start document. 
public	TokenNamepublic	
void	TokenNamevoid	
startDocument	TokenNameIdentifier	 start Document
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fElementCount	TokenNameIdentifier	 f Element Count
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
fAttributeCount	TokenNameIdentifier	 f Attribute Count
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
fIgnorableWhitespaceCount	TokenNameIdentifier	 f Ignorable Whitespace Count
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
fCharactersCount	TokenNameIdentifier	 f Characters Count
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
fTimeBefore	TokenNameIdentifier	 f Time Before
=	TokenNameEQUAL	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
currentTimeMillis	TokenNameIdentifier	 current Time Millis
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// startDocument() 	TokenNameCOMMENT_LINE	startDocument() 
/** Start element. */	TokenNameCOMMENT_JAVADOC	 Start element. 
public	TokenNamepublic	
void	TokenNamevoid	
startElement	TokenNameIdentifier	 start Element
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
AttributeList	TokenNameIdentifier	 Attribute List
attrs	TokenNameIdentifier	 attrs
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fElementCount	TokenNameIdentifier	 f Element Count
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
fAttributeCount	TokenNameIdentifier	 f Attribute Count
+=	TokenNamePLUS_EQUAL	
attrs	TokenNameIdentifier	 attrs
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
?	TokenNameQUESTION	
attrs	TokenNameIdentifier	 attrs
.	TokenNameDOT	
getLength	TokenNameIdentifier	 get Length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
:	TokenNameCOLON	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// startElement(String,AttributeList) 	TokenNameCOMMENT_LINE	startElement(String,AttributeList) 
/** Ignorable whitespace. */	TokenNameCOMMENT_JAVADOC	 Ignorable whitespace. 
public	TokenNamepublic	
void	TokenNamevoid	
ignorableWhitespace	TokenNameIdentifier	 ignorable Whitespace
(	TokenNameLPAREN	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
ch	TokenNameIdentifier	 ch
,	TokenNameCOMMA	
int	TokenNameint	
offset	TokenNameIdentifier	 offset
,	TokenNameCOMMA	
int	TokenNameint	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fIgnorableWhitespaceCount	TokenNameIdentifier	 f Ignorable Whitespace Count
+=	TokenNamePLUS_EQUAL	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// ignorableWhitespace(char[],int,int) 	TokenNameCOMMENT_LINE	ignorableWhitespace(char[],int,int) 
/** Characters. */	TokenNameCOMMENT_JAVADOC	 Characters. 
public	TokenNamepublic	
void	TokenNamevoid	
characters	TokenNameIdentifier	 characters
(	TokenNameLPAREN	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
ch	TokenNameIdentifier	 ch
,	TokenNameCOMMA	
int	TokenNameint	
offset	TokenNameIdentifier	 offset
,	TokenNameCOMMA	
int	TokenNameint	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fCharactersCount	TokenNameIdentifier	 f Characters Count
+=	TokenNamePLUS_EQUAL	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// characters(char[],int,int) 	TokenNameCOMMENT_LINE	characters(char[],int,int) 
/** End document. */	TokenNameCOMMENT_JAVADOC	 End document. 
public	TokenNamepublic	
void	TokenNamevoid	
endDocument	TokenNameIdentifier	 end Document
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
long	TokenNamelong	
timeAfter	TokenNameIdentifier	 time After
=	TokenNameEQUAL	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
currentTimeMillis	TokenNameIdentifier	 current Time Millis
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
"Client: "	TokenNameStringLiteral	Client: 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
timeAfter	TokenNameIdentifier	 time After
-	TokenNameMINUS	
fTimeBefore	TokenNameIdentifier	 f Time Before
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
" ms ("	TokenNameStringLiteral	 ms (
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
fElementCount	TokenNameIdentifier	 f Element Count
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
" elems, "	TokenNameStringLiteral	 elems, 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
fAttributeCount	TokenNameIdentifier	 f Attribute Count
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
" attrs, "	TokenNameStringLiteral	 attrs, 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
fIgnorableWhitespaceCount	TokenNameIdentifier	 f Ignorable Whitespace Count
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
" spaces, "	TokenNameStringLiteral	 spaces, 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
fCharactersCount	TokenNameIdentifier	 f Characters Count
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
" chars)"	TokenNameStringLiteral	 chars)
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// endDocument() 	TokenNameCOMMENT_LINE	endDocument() 
// 	TokenNameCOMMENT_LINE	 
// ErrorHandler methods 	TokenNameCOMMENT_LINE	ErrorHandler methods 
// 	TokenNameCOMMENT_LINE	 
/** Warning. */	TokenNameCOMMENT_JAVADOC	 Warning. 
public	TokenNamepublic	
void	TokenNamevoid	
warning	TokenNameIdentifier	 warning
(	TokenNameLPAREN	
SAXParseException	TokenNameIdentifier	 SAX Parse Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
throws	TokenNamethrows	
SAXException	TokenNameIdentifier	 SAX Exception
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"Client: [warning] "	TokenNameStringLiteral	Client: [warning] 
+	TokenNamePLUS	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
getMessage	TokenNameIdentifier	 get Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// warning(SAXParseException) 	TokenNameCOMMENT_LINE	warning(SAXParseException) 
/** Error. */	TokenNameCOMMENT_JAVADOC	 Error. 
public	TokenNamepublic	
void	TokenNamevoid	
error	TokenNameIdentifier	 error
(	TokenNameLPAREN	
SAXParseException	TokenNameIdentifier	 SAX Parse Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
throws	TokenNamethrows	
SAXException	TokenNameIdentifier	 SAX Exception
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"Client: [error] "	TokenNameStringLiteral	Client: [error] 
+	TokenNamePLUS	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
getMessage	TokenNameIdentifier	 get Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// error(SAXParseException) 	TokenNameCOMMENT_LINE	error(SAXParseException) 
/** Fatal error. */	TokenNameCOMMENT_JAVADOC	 Fatal error. 
public	TokenNamepublic	
void	TokenNamevoid	
fatalError	TokenNameIdentifier	 fatal Error
(	TokenNameLPAREN	
SAXParseException	TokenNameIdentifier	 SAX Parse Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
throws	TokenNamethrows	
SAXException	TokenNameIdentifier	 SAX Exception
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"Client: [fatal error] "	TokenNameStringLiteral	Client: [fatal error] 
+	TokenNamePLUS	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
getMessage	TokenNameIdentifier	 get Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// on fatal error, skip to end of stream and end parse 	TokenNameCOMMENT_LINE	on fatal error, skip to end of stream and end parse 
try	TokenNametry	
{	TokenNameLBRACE	
fWrappedInputStream	TokenNameIdentifier	 f Wrapped Input Stream
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
IOException	TokenNameIdentifier	 IO Exception
ioe	TokenNameIdentifier	 ioe
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// ignore 	TokenNameCOMMENT_LINE	ignore 
}	TokenNameRBRACE	
throw	TokenNamethrow	
e	TokenNameIdentifier	 e
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// fatalError(SAXParseException) 	TokenNameCOMMENT_LINE	fatalError(SAXParseException) 
// 	TokenNameCOMMENT_LINE	 
// Classes 	TokenNameCOMMENT_LINE	Classes 
// 	TokenNameCOMMENT_LINE	 
/** * This class reports the actual number of bytes read at the * end of "stream". * * @author Andy Clark, IBM */	TokenNameCOMMENT_JAVADOC	 This class reports the actual number of bytes read at the end of "stream". * @author Andy Clark, IBM 
class	TokenNameclass	
InputStreamReporter	TokenNameIdentifier	 Input Stream Reporter
extends	TokenNameextends	
FilterInputStream	TokenNameIdentifier	 Filter Input Stream
{	TokenNameLBRACE	
// 	TokenNameCOMMENT_LINE	 
// Data 	TokenNameCOMMENT_LINE	Data 
// 	TokenNameCOMMENT_LINE	 
/** Total bytes read. */	TokenNameCOMMENT_JAVADOC	 Total bytes read. 
private	TokenNameprivate	
long	TokenNamelong	
fTotal	TokenNameIdentifier	 f Total
;	TokenNameSEMICOLON	
// 	TokenNameCOMMENT_LINE	 
// Constructors 	TokenNameCOMMENT_LINE	Constructors 
// 	TokenNameCOMMENT_LINE	 
/** Constructs a reporter from the specified input stream. */	TokenNameCOMMENT_JAVADOC	 Constructs a reporter from the specified input stream. 
public	TokenNamepublic	
InputStreamReporter	TokenNameIdentifier	 Input Stream Reporter
(	TokenNameLPAREN	
InputStream	TokenNameIdentifier	 Input Stream
stream	TokenNameIdentifier	 stream
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
stream	TokenNameIdentifier	 stream
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// <init>(InputStream) 	TokenNameCOMMENT_LINE	<init>(InputStream) 
// 	TokenNameCOMMENT_LINE	 
// InputStream methods 	TokenNameCOMMENT_LINE	InputStream methods 
// 	TokenNameCOMMENT_LINE	 
/** Reads a single byte. */	TokenNameCOMMENT_JAVADOC	 Reads a single byte. 
public	TokenNamepublic	
int	TokenNameint	
read	TokenNameIdentifier	 read
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
int	TokenNameint	
b	TokenNameIdentifier	 b
=	TokenNameEQUAL	
super	TokenNamesuper	
.	TokenNameDOT	
in	TokenNameIdentifier	 in
.	TokenNameDOT	
read	TokenNameIdentifier	 read
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
b	TokenNameIdentifier	 b
==	TokenNameEQUAL_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"Client: Read "	TokenNameStringLiteral	Client: Read 
+	TokenNamePLUS	
fTotal	TokenNameIdentifier	 f Total
+	TokenNamePLUS	
" byte(s) total."	TokenNameStringLiteral	 byte(s) total.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
fTotal	TokenNameIdentifier	 f Total
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
b	TokenNameIdentifier	 b
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// read():int 	TokenNameCOMMENT_LINE	read():int 
/** Reads a block of bytes. */	TokenNameCOMMENT_JAVADOC	 Reads a block of bytes. 
public	TokenNamepublic	
int	TokenNameint	
read	TokenNameIdentifier	 read
(	TokenNameLPAREN	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
b	TokenNameIdentifier	 b
,	TokenNameCOMMA	
int	TokenNameint	
offset	TokenNameIdentifier	 offset
,	TokenNameCOMMA	
int	TokenNameint	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
int	TokenNameint	
count	TokenNameIdentifier	 count
=	TokenNameEQUAL	
super	TokenNamesuper	
.	TokenNameDOT	
in	TokenNameIdentifier	 in
.	TokenNameDOT	
read	TokenNameIdentifier	 read
(	TokenNameLPAREN	
b	TokenNameIdentifier	 b
,	TokenNameCOMMA	
offset	TokenNameIdentifier	 offset
,	TokenNameCOMMA	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
count	TokenNameIdentifier	 count
==	TokenNameEQUAL_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"Client: Read "	TokenNameStringLiteral	Client: Read 
+	TokenNamePLUS	
fTotal	TokenNameIdentifier	 f Total
+	TokenNamePLUS	
" byte(s) total."	TokenNameStringLiteral	 byte(s) total.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
fTotal	TokenNameIdentifier	 f Total
+=	TokenNamePLUS_EQUAL	
count	TokenNameIdentifier	 count
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
Client	TokenNameIdentifier	 Client
.	TokenNameDOT	
this	TokenNamethis	
.	TokenNameDOT	
fVerbose	TokenNameIdentifier	 f Verbose
)	TokenNameRPAREN	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"Client: Actually read "	TokenNameStringLiteral	Client: Actually read 
+	TokenNamePLUS	
count	TokenNameIdentifier	 count
+	TokenNamePLUS	
" byte(s)."	TokenNameStringLiteral	 byte(s).
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
count	TokenNameIdentifier	 count
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// read(byte[],int,int):int 	TokenNameCOMMENT_LINE	read(byte[],int,int):int 
}	TokenNameRBRACE	
// class InputStreamReporter 	TokenNameCOMMENT_LINE	class InputStreamReporter 
}	TokenNameRBRACE	
// class Client 	TokenNameCOMMENT_LINE	class Client 
}	TokenNameRBRACE	
// class KeepSocketOpen 	TokenNameCOMMENT_LINE	class KeepSocketOpen 
