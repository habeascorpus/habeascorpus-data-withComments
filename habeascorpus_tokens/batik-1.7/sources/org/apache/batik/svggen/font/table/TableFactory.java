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
/** * * @version $Id: TableFactory.java 475477 2006-11-15 22:44:28Z cam $ * @author <a href="mailto:david@steadystate.co.uk">David Schweinsberg</a> */	TokenNameCOMMENT_JAVADOC	 * @version $Id: TableFactory.java 475477 2006-11-15 22:44:28Z cam $ @author <a href="mailto:david@steadystate.co.uk">David Schweinsberg</a> 
public	TokenNamepublic	
class	TokenNameclass	
TableFactory	TokenNameIdentifier	 Table Factory
{	TokenNameLBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
Table	TokenNameIdentifier	 Table
create	TokenNameIdentifier	 create
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
Table	TokenNameIdentifier	 Table
t	TokenNameIdentifier	 t
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
switch	TokenNameswitch	
(	TokenNameLPAREN	
de	TokenNameIdentifier	 de
.	TokenNameDOT	
getTag	TokenNameIdentifier	 get Tag
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
Table	TokenNameIdentifier	 Table
.	TokenNameDOT	
BASE	TokenNameIdentifier	 BASE
:	TokenNameCOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
Table	TokenNameIdentifier	 Table
.	TokenNameDOT	
CFF	TokenNameIdentifier	 CFF
:	TokenNameCOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
Table	TokenNameIdentifier	 Table
.	TokenNameDOT	
DSIG	TokenNameIdentifier	 DSIG
:	TokenNameCOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
Table	TokenNameIdentifier	 Table
.	TokenNameDOT	
EBDT	TokenNameIdentifier	 EBDT
:	TokenNameCOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
Table	TokenNameIdentifier	 Table
.	TokenNameDOT	
EBLC	TokenNameIdentifier	 EBLC
:	TokenNameCOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
Table	TokenNameIdentifier	 Table
.	TokenNameDOT	
EBSC	TokenNameIdentifier	 EBSC
:	TokenNameCOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
Table	TokenNameIdentifier	 Table
.	TokenNameDOT	
GDEF	TokenNameIdentifier	 GDEF
:	TokenNameCOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
Table	TokenNameIdentifier	 Table
.	TokenNameDOT	
GPOS	TokenNameIdentifier	 GPOS
:	TokenNameCOLON	
t	TokenNameIdentifier	 t
=	TokenNameEQUAL	
new	TokenNamenew	
GposTable	TokenNameIdentifier	 Gpos Table
(	TokenNameLPAREN	
de	TokenNameIdentifier	 de
,	TokenNameCOMMA	
raf	TokenNameIdentifier	 raf
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
Table	TokenNameIdentifier	 Table
.	TokenNameDOT	
GSUB	TokenNameIdentifier	 GSUB
:	TokenNameCOLON	
t	TokenNameIdentifier	 t
=	TokenNameEQUAL	
new	TokenNamenew	
GsubTable	TokenNameIdentifier	 Gsub Table
(	TokenNameLPAREN	
de	TokenNameIdentifier	 de
,	TokenNameCOMMA	
raf	TokenNameIdentifier	 raf
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
Table	TokenNameIdentifier	 Table
.	TokenNameDOT	
JSTF	TokenNameIdentifier	 JSTF
:	TokenNameCOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
Table	TokenNameIdentifier	 Table
.	TokenNameDOT	
LTSH	TokenNameIdentifier	 LTSH
:	TokenNameCOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
Table	TokenNameIdentifier	 Table
.	TokenNameDOT	
MMFX	TokenNameIdentifier	 MMFX
:	TokenNameCOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
Table	TokenNameIdentifier	 Table
.	TokenNameDOT	
MMSD	TokenNameIdentifier	 MMSD
:	TokenNameCOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
Table	TokenNameIdentifier	 Table
.	TokenNameDOT	
OS_2	TokenNameIdentifier	 OS 2
:	TokenNameCOLON	
t	TokenNameIdentifier	 t
=	TokenNameEQUAL	
new	TokenNamenew	
Os2Table	TokenNameIdentifier	 Os2 Table
(	TokenNameLPAREN	
de	TokenNameIdentifier	 de
,	TokenNameCOMMA	
raf	TokenNameIdentifier	 raf
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
Table	TokenNameIdentifier	 Table
.	TokenNameDOT	
PCLT	TokenNameIdentifier	 PCLT
:	TokenNameCOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
Table	TokenNameIdentifier	 Table
.	TokenNameDOT	
VDMX	TokenNameIdentifier	 VDMX
:	TokenNameCOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
Table	TokenNameIdentifier	 Table
.	TokenNameDOT	
cmap	TokenNameIdentifier	 cmap
:	TokenNameCOLON	
t	TokenNameIdentifier	 t
=	TokenNameEQUAL	
new	TokenNamenew	
CmapTable	TokenNameIdentifier	 Cmap Table
(	TokenNameLPAREN	
de	TokenNameIdentifier	 de
,	TokenNameCOMMA	
raf	TokenNameIdentifier	 raf
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
Table	TokenNameIdentifier	 Table
.	TokenNameDOT	
cvt	TokenNameIdentifier	 cvt
:	TokenNameCOLON	
t	TokenNameIdentifier	 t
=	TokenNameEQUAL	
new	TokenNamenew	
CvtTable	TokenNameIdentifier	 Cvt Table
(	TokenNameLPAREN	
de	TokenNameIdentifier	 de
,	TokenNameCOMMA	
raf	TokenNameIdentifier	 raf
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
Table	TokenNameIdentifier	 Table
.	TokenNameDOT	
fpgm	TokenNameIdentifier	 fpgm
:	TokenNameCOLON	
t	TokenNameIdentifier	 t
=	TokenNameEQUAL	
new	TokenNamenew	
FpgmTable	TokenNameIdentifier	 Fpgm Table
(	TokenNameLPAREN	
de	TokenNameIdentifier	 de
,	TokenNameCOMMA	
raf	TokenNameIdentifier	 raf
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
Table	TokenNameIdentifier	 Table
.	TokenNameDOT	
fvar	TokenNameIdentifier	 fvar
:	TokenNameCOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
Table	TokenNameIdentifier	 Table
.	TokenNameDOT	
gasp	TokenNameIdentifier	 gasp
:	TokenNameCOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
Table	TokenNameIdentifier	 Table
.	TokenNameDOT	
glyf	TokenNameIdentifier	 glyf
:	TokenNameCOLON	
t	TokenNameIdentifier	 t
=	TokenNameEQUAL	
new	TokenNamenew	
GlyfTable	TokenNameIdentifier	 Glyf Table
(	TokenNameLPAREN	
de	TokenNameIdentifier	 de
,	TokenNameCOMMA	
raf	TokenNameIdentifier	 raf
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
Table	TokenNameIdentifier	 Table
.	TokenNameDOT	
hdmx	TokenNameIdentifier	 hdmx
:	TokenNameCOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
Table	TokenNameIdentifier	 Table
.	TokenNameDOT	
head	TokenNameIdentifier	 head
:	TokenNameCOLON	
t	TokenNameIdentifier	 t
=	TokenNameEQUAL	
new	TokenNamenew	
HeadTable	TokenNameIdentifier	 Head Table
(	TokenNameLPAREN	
de	TokenNameIdentifier	 de
,	TokenNameCOMMA	
raf	TokenNameIdentifier	 raf
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
Table	TokenNameIdentifier	 Table
.	TokenNameDOT	
hhea	TokenNameIdentifier	 hhea
:	TokenNameCOLON	
t	TokenNameIdentifier	 t
=	TokenNameEQUAL	
new	TokenNamenew	
HheaTable	TokenNameIdentifier	 Hhea Table
(	TokenNameLPAREN	
de	TokenNameIdentifier	 de
,	TokenNameCOMMA	
raf	TokenNameIdentifier	 raf
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
Table	TokenNameIdentifier	 Table
.	TokenNameDOT	
hmtx	TokenNameIdentifier	 hmtx
:	TokenNameCOLON	
t	TokenNameIdentifier	 t
=	TokenNameEQUAL	
new	TokenNamenew	
HmtxTable	TokenNameIdentifier	 Hmtx Table
(	TokenNameLPAREN	
de	TokenNameIdentifier	 de
,	TokenNameCOMMA	
raf	TokenNameIdentifier	 raf
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
Table	TokenNameIdentifier	 Table
.	TokenNameDOT	
kern	TokenNameIdentifier	 kern
:	TokenNameCOLON	
t	TokenNameIdentifier	 t
=	TokenNameEQUAL	
new	TokenNamenew	
KernTable	TokenNameIdentifier	 Kern Table
(	TokenNameLPAREN	
de	TokenNameIdentifier	 de
,	TokenNameCOMMA	
raf	TokenNameIdentifier	 raf
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
Table	TokenNameIdentifier	 Table
.	TokenNameDOT	
loca	TokenNameIdentifier	 loca
:	TokenNameCOLON	
t	TokenNameIdentifier	 t
=	TokenNameEQUAL	
new	TokenNamenew	
LocaTable	TokenNameIdentifier	 Loca Table
(	TokenNameLPAREN	
de	TokenNameIdentifier	 de
,	TokenNameCOMMA	
raf	TokenNameIdentifier	 raf
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
Table	TokenNameIdentifier	 Table
.	TokenNameDOT	
maxp	TokenNameIdentifier	 maxp
:	TokenNameCOLON	
t	TokenNameIdentifier	 t
=	TokenNameEQUAL	
new	TokenNamenew	
MaxpTable	TokenNameIdentifier	 Maxp Table
(	TokenNameLPAREN	
de	TokenNameIdentifier	 de
,	TokenNameCOMMA	
raf	TokenNameIdentifier	 raf
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
Table	TokenNameIdentifier	 Table
.	TokenNameDOT	
name	TokenNameIdentifier	 name
:	TokenNameCOLON	
t	TokenNameIdentifier	 t
=	TokenNameEQUAL	
new	TokenNamenew	
NameTable	TokenNameIdentifier	 Name Table
(	TokenNameLPAREN	
de	TokenNameIdentifier	 de
,	TokenNameCOMMA	
raf	TokenNameIdentifier	 raf
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
Table	TokenNameIdentifier	 Table
.	TokenNameDOT	
prep	TokenNameIdentifier	 prep
:	TokenNameCOLON	
t	TokenNameIdentifier	 t
=	TokenNameEQUAL	
new	TokenNamenew	
PrepTable	TokenNameIdentifier	 Prep Table
(	TokenNameLPAREN	
de	TokenNameIdentifier	 de
,	TokenNameCOMMA	
raf	TokenNameIdentifier	 raf
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
Table	TokenNameIdentifier	 Table
.	TokenNameDOT	
post	TokenNameIdentifier	 post
:	TokenNameCOLON	
t	TokenNameIdentifier	 t
=	TokenNameEQUAL	
new	TokenNamenew	
PostTable	TokenNameIdentifier	 Post Table
(	TokenNameLPAREN	
de	TokenNameIdentifier	 de
,	TokenNameCOMMA	
raf	TokenNameIdentifier	 raf
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
Table	TokenNameIdentifier	 Table
.	TokenNameDOT	
vhea	TokenNameIdentifier	 vhea
:	TokenNameCOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
Table	TokenNameIdentifier	 Table
.	TokenNameDOT	
vmtx	TokenNameIdentifier	 vmtx
:	TokenNameCOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
t	TokenNameIdentifier	 t
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
