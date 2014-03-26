/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the "License"); * you may not use this file except in compliance with the License. * You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/* * $Id: ExternalConnection.java 470245 2006-11-02 06:34:33Z minchau $ */	TokenNameCOMMENT_BLOCK	 $Id: ExternalConnection.java 470245 2006-11-02 06:34:33Z minchau $ 
// Imported TraX classes 	TokenNameCOMMENT_LINE	Imported TraX classes 
import	TokenNameimport	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
transform	TokenNameIdentifier	 transform
.	TokenNameDOT	
TransformerFactory	TokenNameIdentifier	 Transformer Factory
;	TokenNameSEMICOLON	
import	TokenNameimport	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
transform	TokenNameIdentifier	 transform
.	TokenNameDOT	
Transformer	TokenNameIdentifier	 Transformer
;	TokenNameSEMICOLON	
import	TokenNameimport	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
transform	TokenNameIdentifier	 transform
.	TokenNameDOT	
stream	TokenNameIdentifier	 stream
.	TokenNameDOT	
StreamSource	TokenNameIdentifier	 Stream Source
;	TokenNameSEMICOLON	
import	TokenNameimport	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
transform	TokenNameIdentifier	 transform
.	TokenNameDOT	
stream	TokenNameIdentifier	 stream
.	TokenNameDOT	
StreamResult	TokenNameIdentifier	 Stream Result
;	TokenNameSEMICOLON	
import	TokenNameimport	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
transform	TokenNameIdentifier	 transform
.	TokenNameDOT	
TransformerException	TokenNameIdentifier	 Transformer Exception
;	TokenNameSEMICOLON	
import	TokenNameimport	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
transform	TokenNameIdentifier	 transform
.	TokenNameDOT	
TransformerConfigurationException	TokenNameIdentifier	 Transformer Configuration Exception
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xalan	TokenNameIdentifier	 xalan
.	TokenNameDOT	
lib	TokenNameIdentifier	 lib
.	TokenNameDOT	
sql	TokenNameIdentifier	 sql
.	TokenNameDOT	
DefaultConnectionPool	TokenNameIdentifier	 Default Connection Pool
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xalan	TokenNameIdentifier	 xalan
.	TokenNameDOT	
lib	TokenNameIdentifier	 lib
.	TokenNameDOT	
sql	TokenNameIdentifier	 sql
.	TokenNameDOT	
ConnectionPoolManager	TokenNameIdentifier	 Connection Pool Manager
;	TokenNameSEMICOLON	
// Imported java classes 	TokenNameCOMMENT_LINE	Imported java classes 
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
StringReader	TokenNameIdentifier	 String Reader
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
FileOutputStream	TokenNameIdentifier	 File Output Stream
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
FileNotFoundException	TokenNameIdentifier	 File Not Found Exception
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
IOException	TokenNameIdentifier	 IO Exception
;	TokenNameSEMICOLON	
/** * Use the TraX interface to perform a transformation in the simplest manner possible * (3 statements). */	TokenNameCOMMENT_JAVADOC	 Use the TraX interface to perform a transformation in the simplest manner possible (3 statements). 
public	TokenNamepublic	
class	TokenNameclass	
ExternalConnection	TokenNameIdentifier	 External Connection
{	TokenNameLBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
void	TokenNamevoid	
main	TokenNameIdentifier	 main
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
args	TokenNameIdentifier	 args
)	TokenNameRPAREN	
throws	TokenNamethrows	
TransformerException	TokenNameIdentifier	 Transformer Exception
,	TokenNameCOMMA	
TransformerConfigurationException	TokenNameIdentifier	 Transformer Configuration Exception
,	TokenNameCOMMA	
FileNotFoundException	TokenNameIdentifier	 File Not Found Exception
,	TokenNameCOMMA	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
// Create a connection to the database server 	TokenNameCOMMENT_LINE	Create a connection to the database server 
// Up the connection pool count for testing 	TokenNameCOMMENT_LINE	Up the connection pool count for testing 
DefaultConnectionPool	TokenNameIdentifier	 Default Connection Pool
cp	TokenNameIdentifier	 cp
=	TokenNameEQUAL	
new	TokenNamenew	
DefaultConnectionPool	TokenNameIdentifier	 Default Connection Pool
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
cp	TokenNameIdentifier	 cp
.	TokenNameDOT	
setDriver	TokenNameIdentifier	 set Driver
(	TokenNameLPAREN	
"org.apache.derby.jdbc.EmbeddedDriver"	TokenNameStringLiteral	org.apache.derby.jdbc.EmbeddedDriver
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
cp	TokenNameIdentifier	 cp
.	TokenNameDOT	
setURL	TokenNameIdentifier	 set URL
(	TokenNameLPAREN	
"jdbc:derby:sampleDB"	TokenNameStringLiteral	jdbc:derby:sampleDB
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//cp.setUser("sa"); 	TokenNameCOMMENT_LINE	cp.setUser("sa"); 
//cp.setPassword(""); 	TokenNameCOMMENT_LINE	cp.setPassword(""); 
cp	TokenNameIdentifier	 cp
.	TokenNameDOT	
setMinConnections	TokenNameIdentifier	 set Min Connections
(	TokenNameLPAREN	
10	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
cp	TokenNameIdentifier	 cp
.	TokenNameDOT	
setPoolEnabled	TokenNameIdentifier	 set Pool Enabled
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Now let's register our connection pool so we can use 	TokenNameCOMMENT_LINE	Now let's register our connection pool so we can use 
// in a stylesheet 	TokenNameCOMMENT_LINE	in a stylesheet 
ConnectionPoolManager	TokenNameIdentifier	 Connection Pool Manager
pm	TokenNameIdentifier	 pm
=	TokenNameEQUAL	
new	TokenNamenew	
ConnectionPoolManager	TokenNameIdentifier	 Connection Pool Manager
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
pm	TokenNameIdentifier	 pm
.	TokenNameDOT	
registerPool	TokenNameIdentifier	 register Pool
(	TokenNameLPAREN	
"extpool"	TokenNameStringLiteral	extpool
,	TokenNameCOMMA	
cp	TokenNameIdentifier	 cp
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Use the static TransformerFactory.newInstance() method to instantiate 	TokenNameCOMMENT_LINE	Use the static TransformerFactory.newInstance() method to instantiate 
// a TransformerFactory. The javax.xml.transform.TransformerFactory 	TokenNameCOMMENT_LINE	a TransformerFactory. The javax.xml.transform.TransformerFactory 
// system property setting determines the actual class to instantiate -- 	TokenNameCOMMENT_LINE	system property setting determines the actual class to instantiate -- 
// org.apache.xalan.transformer.TransformerImpl. 	TokenNameCOMMENT_LINE	org.apache.xalan.transformer.TransformerImpl. 
TransformerFactory	TokenNameIdentifier	 Transformer Factory
tFactory	TokenNameIdentifier	 t Factory
=	TokenNameEQUAL	
TransformerFactory	TokenNameIdentifier	 Transformer Factory
.	TokenNameDOT	
newInstance	TokenNameIdentifier	 new Instance
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Grab the Name of the Stylesheet from the commad line 	TokenNameCOMMENT_LINE	Grab the Name of the Stylesheet from the commad line 
if	TokenNameif	
(	TokenNameLPAREN	
args	TokenNameIdentifier	 args
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
"You must provide the path and name to a stylesheet to process"	TokenNameStringLiteral	You must provide the path and name to a stylesheet to process
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
exit	TokenNameIdentifier	 exit
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
String	TokenNameIdentifier	 String
stylesheet	TokenNameIdentifier	 stylesheet
=	TokenNameEQUAL	
args	TokenNameIdentifier	 args
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"Transforming Stylesheet "	TokenNameStringLiteral	Transforming Stylesheet 
+	TokenNamePLUS	
stylesheet	TokenNameIdentifier	 stylesheet
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Use the TransformerFactory to instantiate a Transformer that will work with 	TokenNameCOMMENT_LINE	Use the TransformerFactory to instantiate a Transformer that will work with 
// the stylesheet you specify. This method call also processes the stylesheet 	TokenNameCOMMENT_LINE	the stylesheet you specify. This method call also processes the stylesheet 
// into a compiled Templates object. 	TokenNameCOMMENT_LINE	into a compiled Templates object. 
Transformer	TokenNameIdentifier	 Transformer
transformer	TokenNameIdentifier	 transformer
=	TokenNameEQUAL	
tFactory	TokenNameIdentifier	 t Factory
.	TokenNameDOT	
newTransformer	TokenNameIdentifier	 new Transformer
(	TokenNameLPAREN	
new	TokenNamenew	
StreamSource	TokenNameIdentifier	 Stream Source
(	TokenNameLPAREN	
stylesheet	TokenNameIdentifier	 stylesheet
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// For this transformation, all the required information is in the stylesheet, so generate 	TokenNameCOMMENT_LINE	For this transformation, all the required information is in the stylesheet, so generate 
// a minimal XML source document for the input. 	TokenNameCOMMENT_LINE	a minimal XML source document for the input. 
// Note: the command-line processor (org.apache.xalan.xslt.Process) uses this strategy when 	TokenNameCOMMENT_LINE	Note: the command-line processor (org.apache.xalan.xslt.Process) uses this strategy when 
// the user does not provide an -IN parameter. 	TokenNameCOMMENT_LINE	the user does not provide an -IN parameter. 
StringReader	TokenNameIdentifier	 String Reader
reader	TokenNameIdentifier	 reader
=	TokenNameEQUAL	
new	TokenNamenew	
StringReader	TokenNameIdentifier	 String Reader
(	TokenNameLPAREN	
"<?xml version="1.0"?> <doc/>"	TokenNameStringLiteral	<?xml version="1.0"?> <doc/>
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Use the Transformer to apply the associated Templates object to an XML document 	TokenNameCOMMENT_LINE	Use the Transformer to apply the associated Templates object to an XML document 
// and write the output to a file. 	TokenNameCOMMENT_LINE	and write the output to a file. 
transformer	TokenNameIdentifier	 transformer
.	TokenNameDOT	
transform	TokenNameIdentifier	 transform
(	TokenNameLPAREN	
new	TokenNamenew	
StreamSource	TokenNameIdentifier	 Stream Source
(	TokenNameLPAREN	
reader	TokenNameIdentifier	 reader
)	TokenNameRPAREN	
,	TokenNameCOMMA	
new	TokenNamenew	
StreamResult	TokenNameIdentifier	 Stream Result
(	TokenNameLPAREN	
new	TokenNamenew	
FileOutputStream	TokenNameIdentifier	 File Output Stream
(	TokenNameLPAREN	
"dbtest-out.html"	TokenNameStringLiteral	dbtest-out.html
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"************* The result is in dbtest-out.html *************"	TokenNameStringLiteral	************* The result is in dbtest-out.html *************
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
cp	TokenNameIdentifier	 cp
.	TokenNameDOT	
setPoolEnabled	TokenNameIdentifier	 set Pool Enabled
(	TokenNameLPAREN	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
