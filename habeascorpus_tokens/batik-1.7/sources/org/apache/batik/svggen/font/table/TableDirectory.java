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
/** * @version $Id: TableDirectory.java 475477 2006-11-15 22:44:28Z cam $ * @author <a href="mailto:david@steadystate.co.uk">David Schweinsberg</a> */	TokenNameCOMMENT_JAVADOC	 @version $Id: TableDirectory.java 475477 2006-11-15 22:44:28Z cam $ @author <a href="mailto:david@steadystate.co.uk">David Schweinsberg</a> 
public	TokenNamepublic	
class	TokenNameclass	
TableDirectory	TokenNameIdentifier	 Table Directory
{	TokenNameLBRACE	
private	TokenNameprivate	
int	TokenNameint	
version	TokenNameIdentifier	 version
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
short	TokenNameshort	
numTables	TokenNameIdentifier	 num Tables
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
short	TokenNameshort	
searchRange	TokenNameIdentifier	 search Range
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
short	TokenNameshort	
entrySelector	TokenNameIdentifier	 entry Selector
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
short	TokenNameshort	
rangeShift	TokenNameIdentifier	 range Shift
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
DirectoryEntry	TokenNameIdentifier	 Directory Entry
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
entries	TokenNameIdentifier	 entries
;	TokenNameSEMICOLON	
public	TokenNamepublic	
TableDirectory	TokenNameIdentifier	 Table Directory
(	TokenNameLPAREN	
RandomAccessFile	TokenNameIdentifier	 Random Access File
raf	TokenNameIdentifier	 raf
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
version	TokenNameIdentifier	 version
=	TokenNameEQUAL	
raf	TokenNameIdentifier	 raf
.	TokenNameDOT	
readInt	TokenNameIdentifier	 read Int
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
numTables	TokenNameIdentifier	 num Tables
=	TokenNameEQUAL	
raf	TokenNameIdentifier	 raf
.	TokenNameDOT	
readShort	TokenNameIdentifier	 read Short
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
searchRange	TokenNameIdentifier	 search Range
=	TokenNameEQUAL	
raf	TokenNameIdentifier	 raf
.	TokenNameDOT	
readShort	TokenNameIdentifier	 read Short
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
entrySelector	TokenNameIdentifier	 entry Selector
=	TokenNameEQUAL	
raf	TokenNameIdentifier	 raf
.	TokenNameDOT	
readShort	TokenNameIdentifier	 read Short
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
rangeShift	TokenNameIdentifier	 range Shift
=	TokenNameEQUAL	
raf	TokenNameIdentifier	 raf
.	TokenNameDOT	
readShort	TokenNameIdentifier	 read Short
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
entries	TokenNameIdentifier	 entries
=	TokenNameEQUAL	
new	TokenNamenew	
DirectoryEntry	TokenNameIdentifier	 Directory Entry
[	TokenNameLBRACKET	
numTables	TokenNameIdentifier	 num Tables
]	TokenNameRBRACKET	
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
numTables	TokenNameIdentifier	 num Tables
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
entries	TokenNameIdentifier	 entries
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
new	TokenNamenew	
DirectoryEntry	TokenNameIdentifier	 Directory Entry
(	TokenNameLPAREN	
raf	TokenNameIdentifier	 raf
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Sort them into file order (simple bubble sort) 	TokenNameCOMMENT_LINE	Sort them into file order (simple bubble sort) 
boolean	TokenNameboolean	
modified	TokenNameIdentifier	 modified
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
modified	TokenNameIdentifier	 modified
)	TokenNameRPAREN	
{	TokenNameLBRACE	
modified	TokenNameIdentifier	 modified
=	TokenNameEQUAL	
false	TokenNamefalse	
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
numTables	TokenNameIdentifier	 num Tables
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
entries	TokenNameIdentifier	 entries
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
getOffset	TokenNameIdentifier	 get Offset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>	TokenNameGREATER	
entries	TokenNameIdentifier	 entries
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
.	TokenNameDOT	
getOffset	TokenNameIdentifier	 get Offset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
DirectoryEntry	TokenNameIdentifier	 Directory Entry
temp	TokenNameIdentifier	 temp
=	TokenNameEQUAL	
entries	TokenNameIdentifier	 entries
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
entries	TokenNameIdentifier	 entries
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
entries	TokenNameIdentifier	 entries
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
entries	TokenNameIdentifier	 entries
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
temp	TokenNameIdentifier	 temp
;	TokenNameSEMICOLON	
modified	TokenNameIdentifier	 modified
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
DirectoryEntry	TokenNameIdentifier	 Directory Entry
getEntry	TokenNameIdentifier	 get Entry
(	TokenNameLPAREN	
int	TokenNameint	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
entries	TokenNameIdentifier	 entries
[	TokenNameLBRACKET	
index	TokenNameIdentifier	 index
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
DirectoryEntry	TokenNameIdentifier	 Directory Entry
getEntryByTag	TokenNameIdentifier	 get Entry By Tag
(	TokenNameLPAREN	
int	TokenNameint	
tag	TokenNameIdentifier	 tag
)	TokenNameRPAREN	
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
numTables	TokenNameIdentifier	 num Tables
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
entries	TokenNameIdentifier	 entries
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
getTag	TokenNameIdentifier	 get Tag
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
tag	TokenNameIdentifier	 tag
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
entries	TokenNameIdentifier	 entries
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
short	TokenNameshort	
getEntrySelector	TokenNameIdentifier	 get Entry Selector
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
entrySelector	TokenNameIdentifier	 entry Selector
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
short	TokenNameshort	
getNumTables	TokenNameIdentifier	 get Num Tables
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
numTables	TokenNameIdentifier	 num Tables
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
short	TokenNameshort	
getRangeShift	TokenNameIdentifier	 get Range Shift
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
rangeShift	TokenNameIdentifier	 range Shift
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
short	TokenNameshort	
getSearchRange	TokenNameIdentifier	 get Search Range
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
searchRange	TokenNameIdentifier	 search Range
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
int	TokenNameint	
getVersion	TokenNameIdentifier	 get Version
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
version	TokenNameIdentifier	 version
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
