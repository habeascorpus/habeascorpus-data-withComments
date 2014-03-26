/* * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
log4j	TokenNameIdentifier	 log4j
.	TokenNameDOT	
performance	TokenNameIdentifier	 performance
;	TokenNameSEMICOLON	
/** This program compares the cost of creating a new StringBuffer and converting it to a String versus keeping the same StringBuffer, setting its size to zero and then converting it to String. <p>The table below gives some figures. <p> <table border="1" cellpadding="4"> <tr BGCOLOR="#33CCFF"> <th BGCOLOR="#CCCCCC" rowspan="2">Total Message length <th colspan="2" align="center">0 <th colspan="2" align="center">1 <th colspan="2" align="center">2 <th colspan="2" align="center">4 <th colspan="2" align="center">8 </tr> <tr BGCOLOR="#3366FF"> <td>New Buffer</td> <td>setLength</td> <td>New Buffer</td> <td>setLength</td> <td>New Buffer</td> <td>setLength</td> <td>New Buffer</td> <td>setLength</td> <td>New Buffer</td> <td>setLength</td> </tr> <tr align="right"> <td BGCOLOR="#CCCCCC">256 <td>33 <td>22 <td>34 <td>22 <td>34 <td>22 <td>34 <td>22 <td>33 <td>23 </tr> <tr align="right"> <td BGCOLOR="#CCCCCC">1024 <td>58 <td>41 <td>59 <td>45 <td>59 <td>48 <td>59 <td>51 <td>60 <td>44 </tr> <tr align="right"> <td BGCOLOR="#CCCCCC">4096 <td>146 <td>132 <td>138 <td>132 <td>144 <td>126 <td>142 <td>132 <td>136 <td>132 </tr> <tr align="right"> <td BGCOLOR="#CCCCCC">16384 <td>617 <td>593 <td>593 <td>609 <td>601 <td>617 <td>601 <td>632 <td>593 <td>632 </tr> <tr align="right"> <td BGCOLOR="#CCCCCC">65536 <td>3218 <td>3281 <td>3093 <td>3125 <td>3125 <td>3156 <td>3125 <td>3281 <td>3062 <td>3562 </tr> <tr align="right"> <td BGCOLOR="#CCCCCC">262144 <td>14750 <td>15125 <td>14000 <td>15500 <td>14000 <td>16125 <td>14000 <td>18000 <td>14000 <td>21375 </tr> <tr align="right"> <td BGCOLOR="#CCCCCC">1048576 <td>87500 <td>80000 <td>60500 <td>82000 <td>57000 <td>93000 <td>57500 <td>118500 <td>57500 <td>168500 </tr> <caption ALIGN="BOTTOM">Performance comparisons of new buffer creation versus setLength(0) approach for various message sizes and secondary loop lengths. </caption> </table> <p>The tests copy a message to a destination string buffer and then copy a 256 character buffer to another buffer the number of times as specified by the secondary loop length. <p>The <code>setLength(0)</code> method is usually faster. However, after copying a large string it becomes slow even when copying small strings. <p>This is due to a peculiarity in the <code>copy</code> method in StringBuffer class which creates a character array of the same length as the old buffer even if the vast majority of those characters are unused. <p>The tests were performed on Linux using IBM's JDK 1.1.8. <p>The test script is a crude model of what might happen in reality. If you remain unconvinced of its results, then please send your alternative measurement scenario. */	TokenNameCOMMENT_JAVADOC	 This program compares the cost of creating a new StringBuffer and converting it to a String versus keeping the same StringBuffer, setting its size to zero and then converting it to String. <p>The table below gives some figures. <p> <table border="1" cellpadding="4"> <tr BGCOLOR="#33CCFF"> <th BGCOLOR="#CCCCCC" rowspan="2">Total Message length <th colspan="2" align="center">0 <th colspan="2" align="center">1 <th colspan="2" align="center">2 <th colspan="2" align="center">4 <th colspan="2" align="center">8 </tr> <tr BGCOLOR="#3366FF"> <td>New Buffer</td> <td>setLength</td> <td>New Buffer</td> <td>setLength</td> <td>New Buffer</td> <td>setLength</td> <td>New Buffer</td> <td>setLength</td> <td>New Buffer</td> <td>setLength</td> </tr> <tr align="right"> <td BGCOLOR="#CCCCCC">256 <td>33 <td>22 <td>34 <td>22 <td>34 <td>22 <td>34 <td>22 <td>33 <td>23 </tr> <tr align="right"> <td BGCOLOR="#CCCCCC">1024 <td>58 <td>41 <td>59 <td>45 <td>59 <td>48 <td>59 <td>51 <td>60 <td>44 </tr> <tr align="right"> <td BGCOLOR="#CCCCCC">4096 <td>146 <td>132 <td>138 <td>132 <td>144 <td>126 <td>142 <td>132 <td>136 <td>132 </tr> <tr align="right"> <td BGCOLOR="#CCCCCC">16384 <td>617 <td>593 <td>593 <td>609 <td>601 <td>617 <td>601 <td>632 <td>593 <td>632 </tr> <tr align="right"> <td BGCOLOR="#CCCCCC">65536 <td>3218 <td>3281 <td>3093 <td>3125 <td>3125 <td>3156 <td>3125 <td>3281 <td>3062 <td>3562 </tr> <tr align="right"> <td BGCOLOR="#CCCCCC">262144 <td>14750 <td>15125 <td>14000 <td>15500 <td>14000 <td>16125 <td>14000 <td>18000 <td>14000 <td>21375 </tr> <tr align="right"> <td BGCOLOR="#CCCCCC">1048576 <td>87500 <td>80000 <td>60500 <td>82000 <td>57000 <td>93000 <td>57500 <td>118500 <td>57500 <td>168500 </tr> <caption ALIGN="BOTTOM">Performance comparisons of new buffer creation versus setLength(0) approach for various message sizes and secondary loop lengths. </caption> </table> <p>The tests copy a message to a destination string buffer and then copy a 256 character buffer to another buffer the number of times as specified by the secondary loop length. <p>The <code>setLength(0)</code> method is usually faster. However, after copying a large string it becomes slow even when copying small strings. <p>This is due to a peculiarity in the <code>copy</code> method in StringBuffer class which creates a character array of the same length as the old buffer even if the vast majority of those characters are unused. <p>The tests were performed on Linux using IBM's JDK 1.1.8. <p>The test script is a crude model of what might happen in reality. If you remain unconvinced of its results, then please send your alternative measurement scenario. 
public	TokenNamepublic	
class	TokenNameclass	
NewVsSetLen	TokenNameIdentifier	 New Vs Set Len
{	TokenNameLBRACE	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
s	TokenNameIdentifier	 s
;	TokenNameSEMICOLON	
static	TokenNamestatic	
int	TokenNameint	
BIGBUF_LEN	TokenNameIdentifier	 BIGBUF  LEN
=	TokenNameEQUAL	
1048576	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
static	TokenNamestatic	
int	TokenNameint	
SBUF_LEN	TokenNameIdentifier	 SBUF  LEN
=	TokenNameEQUAL	
256	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
static	TokenNamestatic	
int	TokenNameint	
RUN_LENGTH	TokenNameIdentifier	 RUN  LENGTH
=	TokenNameEQUAL	
BIGBUF_LEN	TokenNameIdentifier	 BIGBUF  LEN
/	TokenNameDIVIDE	
4	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
static	TokenNamestatic	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
sbuf	TokenNameIdentifier	 sbuf
=	TokenNameEQUAL	
new	TokenNamenew	
char	TokenNamechar	
[	TokenNameLBRACKET	
SBUF_LEN	TokenNameIdentifier	 SBUF  LEN
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
static	TokenNamestatic	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
bigbuf	TokenNameIdentifier	 bigbuf
=	TokenNameEQUAL	
new	TokenNamenew	
char	TokenNamechar	
[	TokenNameLBRACKET	
BIGBUF_LEN	TokenNameIdentifier	 BIGBUF  LEN
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
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
SBUF_LEN	TokenNameIdentifier	 SBUF  LEN
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
sbuf	TokenNameIdentifier	 sbuf
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
char	TokenNamechar	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
BIGBUF_LEN	TokenNameIdentifier	 BIGBUF  LEN
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
bigbuf	TokenNameIdentifier	 bigbuf
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
char	TokenNamechar	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
static	TokenNamestatic	
public	TokenNamepublic	
void	TokenNamevoid	
main	TokenNameIdentifier	 main
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
args	TokenNameIdentifier	 args
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
t	TokenNameIdentifier	 t
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
len	TokenNameIdentifier	 len
=	TokenNameEQUAL	
SBUF_LEN	TokenNameIdentifier	 SBUF  LEN
;	TokenNameSEMICOLON	
len	TokenNameIdentifier	 len
<=	TokenNameLESS_EQUAL	
BIGBUF_LEN	TokenNameIdentifier	 BIGBUF  LEN
;	TokenNameSEMICOLON	
len	TokenNameIdentifier	 len
*=	TokenNameMULTIPLY_EQUAL	
4	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
RUN_LENGTH	TokenNameIdentifier	 RUN  LENGTH
/=	TokenNameDIVIDE_EQUAL	
4	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"<td>"	TokenNameStringLiteral	<td>
+	TokenNamePLUS	
len	TokenNameIdentifier	 len
+	TokenNamePLUS	
" "	TokenNameStringLiteral	 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
second	TokenNameIdentifier	 second
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
second	TokenNameIdentifier	 second
<	TokenNameLESS	
16	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"SECOND loop="	TokenNameStringLiteral	SECOND loop=
+	TokenNamePLUS	
second	TokenNameIdentifier	 second
+	TokenNamePLUS	
", RUN_LENGTH="	TokenNameStringLiteral	, RUN_LENGTH=
+	TokenNamePLUS	
RUN_LENGTH	TokenNameIdentifier	 RUN  LENGTH
+	TokenNamePLUS	
", len="	TokenNameStringLiteral	, len=
+	TokenNamePLUS	
len	TokenNameIdentifier	 len
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
t	TokenNameIdentifier	 t
=	TokenNameEQUAL	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
newBuffer	TokenNameIdentifier	 new Buffer
(	TokenNameLPAREN	
len	TokenNameIdentifier	 len
,	TokenNameCOMMA	
second	TokenNameIdentifier	 second
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
"<td>"	TokenNameStringLiteral	<td>
+	TokenNamePLUS	
t	TokenNameIdentifier	 t
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
t	TokenNameIdentifier	 t
=	TokenNameEQUAL	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
setLen	TokenNameIdentifier	 set Len
(	TokenNameLPAREN	
len	TokenNameIdentifier	 len
,	TokenNameCOMMA	
second	TokenNameIdentifier	 second
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
" <td>"	TokenNameStringLiteral	 <td>
+	TokenNamePLUS	
t	TokenNameIdentifier	 t
+	TokenNamePLUS	
" "	TokenNameStringLiteral	 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
second	TokenNameIdentifier	 second
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
second	TokenNameIdentifier	 second
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
second	TokenNameIdentifier	 second
*=	TokenNameMULTIPLY_EQUAL	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
static	TokenNamestatic	
double	TokenNamedouble	
newBuffer	TokenNameIdentifier	 new Buffer
(	TokenNameLPAREN	
int	TokenNameint	
size	TokenNameIdentifier	 size
,	TokenNameCOMMA	
int	TokenNameint	
second	TokenNameIdentifier	 second
)	TokenNameRPAREN	
{	TokenNameLBRACE	
long	TokenNamelong	
before	TokenNameIdentifier	 before
=	TokenNameEQUAL	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
currentTimeMillis	TokenNameIdentifier	 current Time Millis
(	TokenNameLPAREN	
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
RUN_LENGTH	TokenNameIdentifier	 RUN  LENGTH
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
StringBuffer	TokenNameIdentifier	 String Buffer
buf	TokenNameIdentifier	 buf
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuffer	TokenNameIdentifier	 String Buffer
(	TokenNameLPAREN	
SBUF_LEN	TokenNameIdentifier	 SBUF  LEN
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
sbuf	TokenNameIdentifier	 sbuf
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
sbuf	TokenNameIdentifier	 sbuf
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
bigbuf	TokenNameIdentifier	 bigbuf
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
size	TokenNameIdentifier	 size
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
s	TokenNameIdentifier	 s
=	TokenNameEQUAL	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
x	TokenNameIdentifier	 x
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
x	TokenNameIdentifier	 x
<	TokenNameLESS	
second	TokenNameIdentifier	 second
;	TokenNameSEMICOLON	
x	TokenNameIdentifier	 x
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
StringBuffer	TokenNameIdentifier	 String Buffer
buf	TokenNameIdentifier	 buf
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuffer	TokenNameIdentifier	 String Buffer
(	TokenNameLPAREN	
SBUF_LEN	TokenNameIdentifier	 SBUF  LEN
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
sbuf	TokenNameIdentifier	 sbuf
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
SBUF_LEN	TokenNameIdentifier	 SBUF  LEN
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
s	TokenNameIdentifier	 s
=	TokenNameEQUAL	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
currentTimeMillis	TokenNameIdentifier	 current Time Millis
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
before	TokenNameIdentifier	 before
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
1000.0	TokenNameDoubleLiteral	
/	TokenNameDIVIDE	
RUN_LENGTH	TokenNameIdentifier	 RUN  LENGTH
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
static	TokenNamestatic	
double	TokenNamedouble	
setLen	TokenNameIdentifier	 set Len
(	TokenNameLPAREN	
int	TokenNameint	
size	TokenNameIdentifier	 size
,	TokenNameCOMMA	
int	TokenNameint	
second	TokenNameIdentifier	 second
)	TokenNameRPAREN	
{	TokenNameLBRACE	
long	TokenNamelong	
before	TokenNameIdentifier	 before
=	TokenNameEQUAL	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
currentTimeMillis	TokenNameIdentifier	 current Time Millis
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
StringBuffer	TokenNameIdentifier	 String Buffer
buf	TokenNameIdentifier	 buf
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuffer	TokenNameIdentifier	 String Buffer
(	TokenNameLPAREN	
SBUF_LEN	TokenNameIdentifier	 SBUF  LEN
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
RUN_LENGTH	TokenNameIdentifier	 RUN  LENGTH
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
sbuf	TokenNameIdentifier	 sbuf
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
sbuf	TokenNameIdentifier	 sbuf
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
bigbuf	TokenNameIdentifier	 bigbuf
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
size	TokenNameIdentifier	 size
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
s	TokenNameIdentifier	 s
=	TokenNameEQUAL	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
setLength	TokenNameIdentifier	 set Length
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
x	TokenNameIdentifier	 x
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
x	TokenNameIdentifier	 x
<	TokenNameLESS	
second	TokenNameIdentifier	 second
;	TokenNameSEMICOLON	
x	TokenNameIdentifier	 x
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
sbuf	TokenNameIdentifier	 sbuf
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
SBUF_LEN	TokenNameIdentifier	 SBUF  LEN
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
s	TokenNameIdentifier	 s
=	TokenNameEQUAL	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
setLength	TokenNameIdentifier	 set Length
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
currentTimeMillis	TokenNameIdentifier	 current Time Millis
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
before	TokenNameIdentifier	 before
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
1000.0	TokenNameDoubleLiteral	
/	TokenNameDIVIDE	
RUN_LENGTH	TokenNameIdentifier	 RUN  LENGTH
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
