/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the "License"); * you may not use this file except in compliance with the License. * You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/* * $Id: TransformThread.java 470245 2006-11-02 06:34:33Z minchau $ */	TokenNameCOMMENT_BLOCK	 $Id: TransformThread.java 470245 2006-11-02 06:34:33Z minchau $ 
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
File	TokenNameIdentifier	 File
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
FileOutputStream	TokenNameIdentifier	 File Output Stream
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
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Properties	TokenNameIdentifier	 Properties
;	TokenNameSEMICOLON	
import	TokenNameimport	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
parsers	TokenNameIdentifier	 parsers
.	TokenNameDOT	
DocumentBuilderFactory	TokenNameIdentifier	 Document Builder Factory
;	TokenNameSEMICOLON	
import	TokenNameimport	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
transform	TokenNameIdentifier	 transform
.	TokenNameDOT	
Result	TokenNameIdentifier	 Result
;	TokenNameSEMICOLON	
import	TokenNameimport	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
transform	TokenNameIdentifier	 transform
.	TokenNameDOT	
Source	TokenNameIdentifier	 Source
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
TransformerFactory	TokenNameIdentifier	 Transformer Factory
;	TokenNameSEMICOLON	
import	TokenNameimport	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
transform	TokenNameIdentifier	 transform
.	TokenNameDOT	
dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
DOMResult	TokenNameIdentifier	 DOM Result
;	TokenNameSEMICOLON	
import	TokenNameimport	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
transform	TokenNameIdentifier	 transform
.	TokenNameDOT	
dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
DOMSource	TokenNameIdentifier	 DOM Source
;	TokenNameSEMICOLON	
import	TokenNameimport	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
transform	TokenNameIdentifier	 transform
.	TokenNameDOT	
sax	TokenNameIdentifier	 sax
.	TokenNameDOT	
SAXResult	TokenNameIdentifier	 SAX Result
;	TokenNameSEMICOLON	
import	TokenNameimport	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
transform	TokenNameIdentifier	 transform
.	TokenNameDOT	
sax	TokenNameIdentifier	 sax
.	TokenNameDOT	
SAXSource	TokenNameIdentifier	 SAX Source
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
stream	TokenNameIdentifier	 stream
.	TokenNameDOT	
StreamSource	TokenNameIdentifier	 Stream Source
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
helpers	TokenNameIdentifier	 helpers
.	TokenNameDOT	
DefaultHandler	TokenNameIdentifier	 Default Handler
;	TokenNameSEMICOLON	
/** * What it does: this sample creates multiple threads * and runs them. Each thread will be assigned a particular * stylesheet. Each thread will run multiple transformations on * various xml files using its own transformer. * * Note: the flavors used by the transformations can be * configured below by changing SOURCE_FLAVOR and * RESULT_FLAVOR. XSLTC can also be used by changing * USE_XSLTC. * * Description of files included with the sample: * * foo0.xsl and foo1.xsl: foo0.xsl is the stylesheet used * for transformations by thread #0, foo1.xsl is the stylesheet * used by thread #1. * * foo0.xml and foo1.xml: foo0.xml and foo1.xml are the XML * files used for the first and second transformations done * by each thread. * * Output will go to *.out files in the TransformThread directory. * * @author <a href="mailto:richcao@ca.ibm.com">Richard Cao</a> */	TokenNameCOMMENT_JAVADOC	 What it does: this sample creates multiple threads and runs them. Each thread will be assigned a particular stylesheet. Each thread will run multiple transformations on various xml files using its own transformer. * Note: the flavors used by the transformations can be configured below by changing SOURCE_FLAVOR and RESULT_FLAVOR. XSLTC can also be used by changing USE_XSLTC. * Description of files included with the sample: * foo0.xsl and foo1.xsl: foo0.xsl is the stylesheet used for transformations by thread #0, foo1.xsl is the stylesheet used by thread #1. * foo0.xml and foo1.xml: foo0.xml and foo1.xml are the XML files used for the first and second transformations done by each thread. * Output will go to *.out files in the TransformThread directory. * @author <a href="mailto:richcao@ca.ibm.com">Richard Cao</a> 
public	TokenNamepublic	
class	TokenNameclass	
TransformThread	TokenNameIdentifier	 Transform Thread
implements	TokenNameimplements	
Runnable	TokenNameIdentifier	 Runnable
{	TokenNameLBRACE	
// Flavors 	TokenNameCOMMENT_LINE	Flavors 
public	TokenNamepublic	
final	TokenNamefinal	
static	TokenNamestatic	
int	TokenNameint	
STREAM	TokenNameIdentifier	 STREAM
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
final	TokenNamefinal	
static	TokenNamestatic	
int	TokenNameint	
SAX	TokenNameIdentifier	 SAX
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
final	TokenNamefinal	
static	TokenNamestatic	
int	TokenNameint	
DOM	TokenNameIdentifier	 DOM
=	TokenNameEQUAL	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
final	TokenNamefinal	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
flavorNames	TokenNameIdentifier	 flavor Names
=	TokenNameEQUAL	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"Stream"	TokenNameStringLiteral	Stream
,	TokenNameCOMMA	
"SAX"	TokenNameStringLiteral	SAX
,	TokenNameCOMMA	
"DOM"	TokenNameStringLiteral	DOM
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
// Configurable options 	TokenNameCOMMENT_LINE	Configurable options 
private	TokenNameprivate	
static	TokenNamestatic	
int	TokenNameint	
SOURCE_FLAVOR	TokenNameIdentifier	 SOURCE  FLAVOR
=	TokenNameEQUAL	
STREAM	TokenNameIdentifier	 STREAM
;	TokenNameSEMICOLON	
// private static int SOURCE_FLAVOR = SAX; 	TokenNameCOMMENT_LINE	private static int SOURCE_FLAVOR = SAX; 
// private static int SOURCE_FLAVOR = DOM; 	TokenNameCOMMENT_LINE	private static int SOURCE_FLAVOR = DOM; 
private	TokenNameprivate	
static	TokenNamestatic	
int	TokenNameint	
RESULT_FLAVOR	TokenNameIdentifier	 RESULT  FLAVOR
=	TokenNameEQUAL	
STREAM	TokenNameIdentifier	 STREAM
;	TokenNameSEMICOLON	
// private static int RESULT_FLAVOR = SAX; 	TokenNameCOMMENT_LINE	private static int RESULT_FLAVOR = SAX; 
// private static int RESULT_FLAVOR = DOM; 	TokenNameCOMMENT_LINE	private static int RESULT_FLAVOR = DOM; 
private	TokenNameprivate	
static	TokenNamestatic	
boolean	TokenNameboolean	
USE_XSLTC	TokenNameIdentifier	 USE  XSLTC
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
// private static boolean useXSLTC = true; 	TokenNameCOMMENT_LINE	private static boolean useXSLTC = true; 
// Threads 	TokenNameCOMMENT_LINE	Threads 
private	TokenNameprivate	
final	TokenNamefinal	
static	TokenNamestatic	
int	TokenNameint	
NUM_THREADS	TokenNameIdentifier	 NUM  THREADS
=	TokenNameEQUAL	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
TransformThread	TokenNameIdentifier	 Transform Thread
INSTANCES	TokenNameIdentifier	 INSTANCES
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
Thread	TokenNameIdentifier	 Thread
m_thread	TokenNameIdentifier	 m thread
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
// Number of transformations per thread 	TokenNameCOMMENT_LINE	Number of transformations per thread 
private	TokenNameprivate	
final	TokenNamefinal	
static	TokenNamestatic	
int	TokenNameint	
NUM_TRANSFORMATIONS	TokenNameIdentifier	 NUM  TRANSFORMATIONS
=	TokenNameEQUAL	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// Files names and extensions 	TokenNameCOMMENT_LINE	Files names and extensions 
private	TokenNameprivate	
final	TokenNamefinal	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
XML_IN_BASE	TokenNameIdentifier	 XML  IN  BASE
=	TokenNameEQUAL	
"foo"	TokenNameStringLiteral	foo
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
XML_EXT	TokenNameIdentifier	 XML  EXT
=	TokenNameEQUAL	
".xml"	TokenNameStringLiteral	.xml
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
XSL_IN_BASE	TokenNameIdentifier	 XSL  IN  BASE
=	TokenNameEQUAL	
"foo"	TokenNameStringLiteral	foo
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
XSL_EXT	TokenNameIdentifier	 XSL  EXT
=	TokenNameEQUAL	
".xsl"	TokenNameStringLiteral	.xsl
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
FILE_OUT_BASE	TokenNameIdentifier	 FILE  OUT  BASE
=	TokenNameEQUAL	
"foo_"	TokenNameStringLiteral	foo_
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
FILE_OUT_EXT	TokenNameIdentifier	 FILE  OUT  EXT
=	TokenNameEQUAL	
".out"	TokenNameStringLiteral	.out
;	TokenNameSEMICOLON	
// Thread identifier 	TokenNameCOMMENT_LINE	Thread identifier 
private	TokenNameprivate	
int	TokenNameint	
m_thrdNum	TokenNameIdentifier	 m thrd Num
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
InputStream	TokenNameIdentifier	 Input Stream
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
m_inStream	TokenNameIdentifier	 m in Stream
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
Source	TokenNameIdentifier	 Source
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
m_inSource	TokenNameIdentifier	 m in Source
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
Result	TokenNameIdentifier	 Result
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
m_outResult	TokenNameIdentifier	 m out Result
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
// One Transformer per thread since Transformers 	TokenNameCOMMENT_LINE	One Transformer per thread since Transformers 
// are _NOT_ thread-safe 	TokenNameCOMMENT_LINE	are _NOT_ thread-safe 
private	TokenNameprivate	
Transformer	TokenNameIdentifier	 Transformer
m_transformer	TokenNameIdentifier	 m transformer
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
/** Constructs the TransformThread object * @param thrdNum a unique identifier for this object */	TokenNameCOMMENT_JAVADOC	 Constructs the TransformThread object @param thrdNum a unique identifier for this object 
public	TokenNamepublic	
TransformThread	TokenNameIdentifier	 Transform Thread
(	TokenNameLPAREN	
int	TokenNameint	
thrdNum	TokenNameIdentifier	 thrd Num
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_thrdNum	TokenNameIdentifier	 m thrd Num
=	TokenNameEQUAL	
thrdNum	TokenNameIdentifier	 thrd Num
;	TokenNameSEMICOLON	
m_inStream	TokenNameIdentifier	 m in Stream
=	TokenNameEQUAL	
new	TokenNamenew	
InputStream	TokenNameIdentifier	 Input Stream
[	TokenNameLBRACKET	
NUM_TRANSFORMATIONS	TokenNameIdentifier	 NUM  TRANSFORMATIONS
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
m_inSource	TokenNameIdentifier	 m in Source
=	TokenNameEQUAL	
new	TokenNamenew	
Source	TokenNameIdentifier	 Source
[	TokenNameLBRACKET	
NUM_TRANSFORMATIONS	TokenNameIdentifier	 NUM  TRANSFORMATIONS
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
m_outResult	TokenNameIdentifier	 m out Result
=	TokenNameEQUAL	
new	TokenNamenew	
Result	TokenNameIdentifier	 Result
[	TokenNameLBRACKET	
NUM_TRANSFORMATIONS	TokenNameIdentifier	 NUM  TRANSFORMATIONS
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
initSource	TokenNameIdentifier	 init Source
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
initResult	TokenNameIdentifier	 init Result
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// ensure xslSourceURI is a valid URI 	TokenNameCOMMENT_LINE	ensure xslSourceURI is a valid URI 
final	TokenNamefinal	
String	TokenNameIdentifier	 String
xslSourceFileName	TokenNameIdentifier	 xsl Source File Name
=	TokenNameEQUAL	
XSL_IN_BASE	TokenNameIdentifier	 XSL  IN  BASE
+	TokenNamePLUS	
m_thrdNum	TokenNameIdentifier	 m thrd Num
+	TokenNamePLUS	
XSL_EXT	TokenNameIdentifier	 XSL  EXT
;	TokenNameSEMICOLON	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
xslSourceURI	TokenNameIdentifier	 xsl Source URI
=	TokenNameEQUAL	
(	TokenNameLPAREN	
new	TokenNamenew	
File	TokenNameIdentifier	 File
(	TokenNameLPAREN	
xslSourceFileName	TokenNameIdentifier	 xsl Source File Name
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
toURL	TokenNameIdentifier	 to URL
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
StreamSource	TokenNameIdentifier	 Stream Source
xslSource	TokenNameIdentifier	 xsl Source
=	TokenNameEQUAL	
new	TokenNamenew	
StreamSource	TokenNameIdentifier	 Stream Source
(	TokenNameLPAREN	
xslSourceFileName	TokenNameIdentifier	 xsl Source File Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
xslSource	TokenNameIdentifier	 xsl Source
.	TokenNameDOT	
setSystemId	TokenNameIdentifier	 set System Id
(	TokenNameLPAREN	
xslSourceURI	TokenNameIdentifier	 xsl Source URI
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Initialize the tranformer 	TokenNameCOMMENT_LINE	Initialize the tranformer 
m_transformer	TokenNameIdentifier	 m transformer
=	TokenNameEQUAL	
TransformerFactory	TokenNameIdentifier	 Transformer Factory
.	TokenNameDOT	
newInstance	TokenNameIdentifier	 new Instance
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
newTransformer	TokenNameIdentifier	 new Transformer
(	TokenNameLPAREN	
xslSource	TokenNameIdentifier	 xsl Source
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_thread	TokenNameIdentifier	 m thread
=	TokenNameEQUAL	
new	TokenNamenew	
Thread	TokenNameIdentifier	 Thread
(	TokenNameLPAREN	
this	TokenNamethis	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
Throwable	TokenNameIdentifier	 Throwable
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
printStackTrace	TokenNameIdentifier	 print Stack Trace
(	TokenNameLPAREN	
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
}	TokenNameRBRACE	
/** Initialize the results (m_outResult) according * to RESULT_FLAVOR */	TokenNameCOMMENT_JAVADOC	 Initialize the results (m_outResult) according to RESULT_FLAVOR 
private	TokenNameprivate	
void	TokenNamevoid	
initResult	TokenNameIdentifier	 init Result
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
NUM_TRANSFORMATIONS	TokenNameIdentifier	 NUM  TRANSFORMATIONS
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
switch	TokenNameswitch	
(	TokenNameLPAREN	
RESULT_FLAVOR	TokenNameIdentifier	 RESULT  FLAVOR
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
STREAM	TokenNameIdentifier	 STREAM
:	TokenNameCOLON	
OutputStream	TokenNameIdentifier	 Output Stream
outStream	TokenNameIdentifier	 out Stream
=	TokenNameEQUAL	
new	TokenNamenew	
FileOutputStream	TokenNameIdentifier	 File Output Stream
(	TokenNameLPAREN	
FILE_OUT_BASE	TokenNameIdentifier	 FILE  OUT  BASE
+	TokenNamePLUS	
"thread_"	TokenNameStringLiteral	thread_
+	TokenNamePLUS	
m_thrdNum	TokenNameIdentifier	 m thrd Num
+	TokenNamePLUS	
"_transformation_"	TokenNameStringLiteral	_transformation_
+	TokenNamePLUS	
i	TokenNameIdentifier	 i
+	TokenNamePLUS	
FILE_OUT_EXT	TokenNameIdentifier	 FILE  OUT  EXT
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_outResult	TokenNameIdentifier	 m out Result
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
new	TokenNamenew	
StreamResult	TokenNameIdentifier	 Stream Result
(	TokenNameLPAREN	
outStream	TokenNameIdentifier	 out Stream
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
SAX	TokenNameIdentifier	 SAX
:	TokenNameCOLON	
DefaultHandler	TokenNameIdentifier	 Default Handler
defaultHandler	TokenNameIdentifier	 default Handler
=	TokenNameEQUAL	
new	TokenNamenew	
DefaultHandler	TokenNameIdentifier	 Default Handler
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_outResult	TokenNameIdentifier	 m out Result
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
new	TokenNamenew	
SAXResult	TokenNameIdentifier	 SAX Result
(	TokenNameLPAREN	
defaultHandler	TokenNameIdentifier	 default Handler
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
DOM	TokenNameIdentifier	 DOM
:	TokenNameCOLON	
m_outResult	TokenNameIdentifier	 m out Result
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
new	TokenNamenew	
DOMResult	TokenNameIdentifier	 DOM Result
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
Exception	TokenNameIdentifier	 Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
printStackTrace	TokenNameIdentifier	 print Stack Trace
(	TokenNameLPAREN	
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
}	TokenNameRBRACE	
/** Initialize the sources (m_inSource) according * to SOURCE_FLAVOR */	TokenNameCOMMENT_JAVADOC	 Initialize the sources (m_inSource) according to SOURCE_FLAVOR 
private	TokenNameprivate	
void	TokenNamevoid	
initSource	TokenNameIdentifier	 init Source
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
NUM_TRANSFORMATIONS	TokenNameIdentifier	 NUM  TRANSFORMATIONS
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Ensure we get a valid URI 	TokenNameCOMMENT_LINE	Ensure we get a valid URI 
final	TokenNamefinal	
String	TokenNameIdentifier	 String
sourceXMLURI	TokenNameIdentifier	 source XMLURI
=	TokenNameEQUAL	
(	TokenNameLPAREN	
new	TokenNamenew	
File	TokenNameIdentifier	 File
(	TokenNameLPAREN	
XML_IN_BASE	TokenNameIdentifier	 XML  IN  BASE
+	TokenNamePLUS	
i	TokenNameIdentifier	 i
+	TokenNamePLUS	
XML_EXT	TokenNameIdentifier	 XML  EXT
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
toURL	TokenNameIdentifier	 to URL
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Open for input 	TokenNameCOMMENT_LINE	Open for input 
m_inStream	TokenNameIdentifier	 m in Stream
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
new	TokenNamenew	
FileInputStream	TokenNameIdentifier	 File Input Stream
(	TokenNameLPAREN	
XML_IN_BASE	TokenNameIdentifier	 XML  IN  BASE
+	TokenNamePLUS	
i	TokenNameIdentifier	 i
+	TokenNamePLUS	
XML_EXT	TokenNameIdentifier	 XML  EXT
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
switch	TokenNameswitch	
(	TokenNameLPAREN	
SOURCE_FLAVOR	TokenNameIdentifier	 SOURCE  FLAVOR
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
STREAM	TokenNameIdentifier	 STREAM
:	TokenNameCOLON	
m_inSource	TokenNameIdentifier	 m in Source
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
new	TokenNamenew	
StreamSource	TokenNameIdentifier	 Stream Source
(	TokenNameLPAREN	
m_inStream	TokenNameIdentifier	 m in Stream
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
SAX	TokenNameIdentifier	 SAX
:	TokenNameCOLON	
m_inSource	TokenNameIdentifier	 m in Source
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
new	TokenNamenew	
SAXSource	TokenNameIdentifier	 SAX Source
(	TokenNameLPAREN	
new	TokenNamenew	
InputSource	TokenNameIdentifier	 Input Source
(	TokenNameLPAREN	
m_inStream	TokenNameIdentifier	 m in Stream
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
DOM	TokenNameIdentifier	 DOM
:	TokenNameCOLON	
try	TokenNametry	
{	TokenNameLBRACE	
DocumentBuilderFactory	TokenNameIdentifier	 Document Builder Factory
dfactory	TokenNameIdentifier	 dfactory
=	TokenNameEQUAL	
DocumentBuilderFactory	TokenNameIdentifier	 Document Builder Factory
.	TokenNameDOT	
newInstance	TokenNameIdentifier	 new Instance
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Must always setNamespaceAware when 	TokenNameCOMMENT_LINE	Must always setNamespaceAware when 
// building xsl stylesheets 	TokenNameCOMMENT_LINE	building xsl stylesheets 
dfactory	TokenNameIdentifier	 dfactory
.	TokenNameDOT	
setNamespaceAware	TokenNameIdentifier	 set Namespace Aware
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_inSource	TokenNameIdentifier	 m in Source
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
new	TokenNamenew	
DOMSource	TokenNameIdentifier	 DOM Source
(	TokenNameLPAREN	
dfactory	TokenNameIdentifier	 dfactory
.	TokenNameDOT	
newDocumentBuilder	TokenNameIdentifier	 new Document Builder
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
parse	TokenNameIdentifier	 parse
(	TokenNameLPAREN	
m_inStream	TokenNameIdentifier	 m in Stream
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
Exception	TokenNameIdentifier	 Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
printStackTrace	TokenNameIdentifier	 print Stack Trace
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
m_inSource	TokenNameIdentifier	 m in Source
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// If we don't do this, the transformer 	TokenNameCOMMENT_LINE	If we don't do this, the transformer 
// won't know how to resolve relative URLs 	TokenNameCOMMENT_LINE	won't know how to resolve relative URLs 
// in the stylesheet. 	TokenNameCOMMENT_LINE	in the stylesheet. 
m_inSource	TokenNameIdentifier	 m in Source
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
setSystemId	TokenNameIdentifier	 set System Id
(	TokenNameLPAREN	
sourceXMLURI	TokenNameIdentifier	 source XMLURI
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
Exception	TokenNameIdentifier	 Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
printStackTrace	TokenNameIdentifier	 print Stack Trace
(	TokenNameLPAREN	
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
}	TokenNameRBRACE	
/** * @see java.lang.Runnable#run() */	TokenNameCOMMENT_JAVADOC	 @see java.lang.Runnable#run() 
public	TokenNamepublic	
void	TokenNamevoid	
run	TokenNameIdentifier	 run
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
// Perform multiple transformations with the same 	TokenNameCOMMENT_LINE	Perform multiple transformations with the same 
// transformer 	TokenNameCOMMENT_LINE	transformer 
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
NUM_TRANSFORMATIONS	TokenNameIdentifier	 NUM  TRANSFORMATIONS
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_transformer	TokenNameIdentifier	 m transformer
.	TokenNameDOT	
transform	TokenNameIdentifier	 transform
(	TokenNameLPAREN	
m_inSource	TokenNameIdentifier	 m in Source
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
m_outResult	TokenNameIdentifier	 m out Result
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
Exception	TokenNameIdentifier	 Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
printStackTrace	TokenNameIdentifier	 print Stack Trace
(	TokenNameLPAREN	
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
}	TokenNameRBRACE	
/** Creates thread instances */	TokenNameCOMMENT_JAVADOC	 Creates thread instances 
private	TokenNameprivate	
static	TokenNamestatic	
void	TokenNamevoid	
initThreads	TokenNameIdentifier	 init Threads
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
INSTANCES	TokenNameIdentifier	 INSTANCES
=	TokenNameEQUAL	
new	TokenNamenew	
TransformThread	TokenNameIdentifier	 Transform Thread
[	TokenNameLBRACKET	
NUM_THREADS	TokenNameIdentifier	 NUM  THREADS
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
count	TokenNameIdentifier	 count
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
count	TokenNameIdentifier	 count
<	TokenNameLESS	
NUM_THREADS	TokenNameIdentifier	 NUM  THREADS
;	TokenNameSEMICOLON	
count	TokenNameIdentifier	 count
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
INSTANCES	TokenNameIdentifier	 INSTANCES
[	TokenNameLBRACKET	
count	TokenNameIdentifier	 count
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
new	TokenNamenew	
TransformThread	TokenNameIdentifier	 Transform Thread
(	TokenNameLPAREN	
count	TokenNameIdentifier	 count
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** Sets the appropriate system properties if XSLTC is * to be used (according to USE_XSLTC) */	TokenNameCOMMENT_JAVADOC	 Sets the appropriate system properties if XSLTC is to be used (according to USE_XSLTC) 
private	TokenNameprivate	
static	TokenNamestatic	
void	TokenNamevoid	
initSystemProperties	TokenNameIdentifier	 init System Properties
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
USE_XSLTC	TokenNameIdentifier	 USE  XSLTC
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Set the TransformerFactory system property if XSLTC is required 	TokenNameCOMMENT_LINE	Set the TransformerFactory system property if XSLTC is required 
// Note: To make this sample more flexible, load properties from a properties file. 	TokenNameCOMMENT_LINE	Note: To make this sample more flexible, load properties from a properties file. 
// The setting for the Xalan Transformer is "org.apache.xalan.processor.TransformerFactoryImpl" 	TokenNameCOMMENT_LINE	The setting for the Xalan Transformer is "org.apache.xalan.processor.TransformerFactoryImpl" 
String	TokenNameIdentifier	 String
key	TokenNameIdentifier	 key
=	TokenNameEQUAL	
"javax.xml.transform.TransformerFactory"	TokenNameStringLiteral	javax.xml.transform.TransformerFactory
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
value	TokenNameIdentifier	 value
=	TokenNameEQUAL	
"org.apache.xalan.xsltc.trax.TransformerFactoryImpl"	TokenNameStringLiteral	org.apache.xalan.xsltc.trax.TransformerFactoryImpl
;	TokenNameSEMICOLON	
Properties	TokenNameIdentifier	 Properties
props	TokenNameIdentifier	 props
=	TokenNameEQUAL	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
getProperties	TokenNameIdentifier	 get Properties
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
props	TokenNameIdentifier	 props
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
,	TokenNameCOMMA	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
setProperties	TokenNameIdentifier	 set Properties
(	TokenNameLPAREN	
props	TokenNameIdentifier	 props
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Usage: * java TransformThread */	TokenNameCOMMENT_JAVADOC	 Usage: java TransformThread 
public	TokenNamepublic	
static	TokenNamestatic	
void	TokenNamevoid	
main	TokenNameIdentifier	 main
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
argv	TokenNameIdentifier	 argv
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
initSystemProperties	TokenNameIdentifier	 init System Properties
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
initThreads	TokenNameIdentifier	 init Threads
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
count	TokenNameIdentifier	 count
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
count	TokenNameIdentifier	 count
<	TokenNameLESS	
NUM_THREADS	TokenNameIdentifier	 NUM  THREADS
;	TokenNameSEMICOLON	
count	TokenNameIdentifier	 count
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
INSTANCES	TokenNameIdentifier	 INSTANCES
[	TokenNameLBRACKET	
count	TokenNameIdentifier	 count
]	TokenNameRBRACKET	
.	TokenNameDOT	
m_thread	TokenNameIdentifier	 m thread
.	TokenNameDOT	
start	TokenNameIdentifier	 start
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
Throwable	TokenNameIdentifier	 Throwable
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
printStackTrace	TokenNameIdentifier	 print Stack Trace
(	TokenNameLPAREN	
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
}	TokenNameRBRACE	
}	TokenNameRBRACE	
