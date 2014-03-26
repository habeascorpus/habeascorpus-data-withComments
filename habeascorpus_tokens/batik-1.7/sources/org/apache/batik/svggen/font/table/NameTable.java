/* Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
batik	TokenNameIdentifier	 batik
.	TokenNameDOT	
svggen	TokenNameIdentifier	 svggen
.	TokenNameDOT	
font	TokenNameIdentifier	 font
.	TokenNameDOT	
table	TokenNameIdentifier	 table
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
RandomAccessFile	TokenNameIdentifier	 Random Access File
;	TokenNameSEMICOLON	
/** * @version $Id: NameTable.java 475477 2006-11-15 22:44:28Z cam $ * @author <a href="mailto:david@steadystate.co.uk">David Schweinsberg</a> */	TokenNameCOMMENT_JAVADOC	 @version $Id: NameTable.java 475477 2006-11-15 22:44:28Z cam $ @author <a href="mailto:david@steadystate.co.uk">David Schweinsberg</a> 
public	TokenNamepublic	
class	TokenNameclass	
NameTable	TokenNameIdentifier	 Name Table
implements	TokenNameimplements	
Table	TokenNameIdentifier	 Table
{	TokenNameLBRACE	
private	TokenNameprivate	
short	TokenNameshort	
formatSelector	TokenNameIdentifier	 format Selector
;	TokenNameSEMICOLON	
private	TokenNameprivate	
short	TokenNameshort	
numberOfNameRecords	TokenNameIdentifier	 number Of Name Records
;	TokenNameSEMICOLON	
private	TokenNameprivate	
short	TokenNameshort	
stringStorageOffset	TokenNameIdentifier	 string Storage Offset
;	TokenNameSEMICOLON	
private	TokenNameprivate	
NameRecord	TokenNameIdentifier	 Name Record
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
records	TokenNameIdentifier	 records
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
NameTable	TokenNameIdentifier	 Name Table
(	TokenNameLPAREN	
DirectoryEntry	TokenNameIdentifier	 Directory Entry
de	TokenNameIdentifier	 de
,	TokenNameCOMMA	
RandomAccessFile	TokenNameIdentifier	 Random Access File
raf	TokenNameIdentifier	 raf
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
raf	TokenNameIdentifier	 raf
.	TokenNameDOT	
seek	TokenNameIdentifier	 seek
(	TokenNameLPAREN	
de	TokenNameIdentifier	 de
.	TokenNameDOT	
getOffset	TokenNameIdentifier	 get Offset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
formatSelector	TokenNameIdentifier	 format Selector
=	TokenNameEQUAL	
raf	TokenNameIdentifier	 raf
.	TokenNameDOT	
readShort	TokenNameIdentifier	 read Short
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
numberOfNameRecords	TokenNameIdentifier	 number Of Name Records
=	TokenNameEQUAL	
raf	TokenNameIdentifier	 raf
.	TokenNameDOT	
readShort	TokenNameIdentifier	 read Short
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
stringStorageOffset	TokenNameIdentifier	 string Storage Offset
=	TokenNameEQUAL	
raf	TokenNameIdentifier	 raf
.	TokenNameDOT	
readShort	TokenNameIdentifier	 read Short
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
records	TokenNameIdentifier	 records
=	TokenNameEQUAL	
new	TokenNamenew	
NameRecord	TokenNameIdentifier	 Name Record
[	TokenNameLBRACKET	
numberOfNameRecords	TokenNameIdentifier	 number Of Name Records
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
// Load the records, which contain the encoding information and string offsets 	TokenNameCOMMENT_LINE	Load the records, which contain the encoding information and string offsets 
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
numberOfNameRecords	TokenNameIdentifier	 number Of Name Records
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
records	TokenNameIdentifier	 records
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
new	TokenNamenew	
NameRecord	TokenNameIdentifier	 Name Record
(	TokenNameLPAREN	
raf	TokenNameIdentifier	 raf
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Now load the strings 	TokenNameCOMMENT_LINE	Now load the strings 
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
numberOfNameRecords	TokenNameIdentifier	 number Of Name Records
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
records	TokenNameIdentifier	 records
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
loadString	TokenNameIdentifier	 load String
(	TokenNameLPAREN	
raf	TokenNameIdentifier	 raf
,	TokenNameCOMMA	
de	TokenNameIdentifier	 de
.	TokenNameDOT	
getOffset	TokenNameIdentifier	 get Offset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
stringStorageOffset	TokenNameIdentifier	 string Storage Offset
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getRecord	TokenNameIdentifier	 get Record
(	TokenNameLPAREN	
short	TokenNameshort	
nameId	TokenNameIdentifier	 name Id
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Search for the first instance of this name ID 	TokenNameCOMMENT_LINE	Search for the first instance of this name ID 
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
numberOfNameRecords	TokenNameIdentifier	 number Of Name Records
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
records	TokenNameIdentifier	 records
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
getNameId	TokenNameIdentifier	 get Name Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
nameId	TokenNameIdentifier	 name Id
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
records	TokenNameIdentifier	 records
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
getRecordString	TokenNameIdentifier	 get Record String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
""	TokenNameStringLiteral	 
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
int	TokenNameint	
getType	TokenNameIdentifier	 get Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
name	TokenNameIdentifier	 name
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
