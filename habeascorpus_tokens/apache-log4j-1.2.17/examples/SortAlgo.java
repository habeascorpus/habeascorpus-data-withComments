/* * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
examples	TokenNameIdentifier	 examples
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
log4j	TokenNameIdentifier	 log4j
.	TokenNameDOT	
Logger	TokenNameIdentifier	 Logger
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
log4j	TokenNameIdentifier	 log4j
.	TokenNameDOT	
NDC	TokenNameIdentifier	 NDC
;	TokenNameSEMICOLON	
/** Example code for log4j to viewed in conjunction with the {@link examples.Sort Sort} class. <p>SortAlgo uses the bubble sort algorithm to sort an integer array. See also its <b><a href="doc-files/SortAlgo.java">source code</a></b>. @author Ceki G&uuml;lc&uuml; */	TokenNameCOMMENT_JAVADOC	 Example code for log4j to viewed in conjunction with the {@link examples.Sort Sort} class. <p>SortAlgo uses the bubble sort algorithm to sort an integer array. See also its <b><a href="doc-files/SortAlgo.java">source code</a></b>. @author Ceki G&uuml;lc&uuml; 
public	TokenNamepublic	
class	TokenNameclass	
SortAlgo	TokenNameIdentifier	 Sort Algo
{	TokenNameLBRACE	
final	TokenNamefinal	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
className	TokenNameIdentifier	 class Name
=	TokenNameEQUAL	
SortAlgo	TokenNameIdentifier	 Sort Algo
.	TokenNameDOT	
class	TokenNameclass	
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
static	TokenNamestatic	
Logger	TokenNameIdentifier	 Logger
LOG	TokenNameIdentifier	 LOG
=	TokenNameEQUAL	
Logger	TokenNameIdentifier	 Logger
.	TokenNameDOT	
getLogger	TokenNameIdentifier	 get Logger
(	TokenNameLPAREN	
className	TokenNameIdentifier	 class Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
static	TokenNamestatic	
Logger	TokenNameIdentifier	 Logger
OUTER	TokenNameIdentifier	 OUTER
=	TokenNameEQUAL	
Logger	TokenNameIdentifier	 Logger
.	TokenNameDOT	
getLogger	TokenNameIdentifier	 get Logger
(	TokenNameLPAREN	
className	TokenNameIdentifier	 class Name
+	TokenNamePLUS	
".OUTER"	TokenNameStringLiteral	.OUTER
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
static	TokenNamestatic	
Logger	TokenNameIdentifier	 Logger
INNER	TokenNameIdentifier	 INNER
=	TokenNameEQUAL	
Logger	TokenNameIdentifier	 Logger
.	TokenNameDOT	
getLogger	TokenNameIdentifier	 get Logger
(	TokenNameLPAREN	
className	TokenNameIdentifier	 class Name
+	TokenNamePLUS	
".INNER"	TokenNameStringLiteral	.INNER
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
static	TokenNamestatic	
Logger	TokenNameIdentifier	 Logger
DUMP	TokenNameIdentifier	 DUMP
=	TokenNameEQUAL	
Logger	TokenNameIdentifier	 Logger
.	TokenNameDOT	
getLogger	TokenNameIdentifier	 get Logger
(	TokenNameLPAREN	
className	TokenNameIdentifier	 class Name
+	TokenNamePLUS	
".DUMP"	TokenNameStringLiteral	.DUMP
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
static	TokenNamestatic	
Logger	TokenNameIdentifier	 Logger
SWAP	TokenNameIdentifier	 SWAP
=	TokenNameEQUAL	
Logger	TokenNameIdentifier	 Logger
.	TokenNameDOT	
getLogger	TokenNameIdentifier	 get Logger
(	TokenNameLPAREN	
className	TokenNameIdentifier	 class Name
+	TokenNamePLUS	
".SWAP"	TokenNameStringLiteral	.SWAP
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
intArray	TokenNameIdentifier	 int Array
;	TokenNameSEMICOLON	
SortAlgo	TokenNameIdentifier	 Sort Algo
(	TokenNameLPAREN	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
intArray	TokenNameIdentifier	 int Array
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
intArray	TokenNameIdentifier	 int Array
=	TokenNameEQUAL	
intArray	TokenNameIdentifier	 int Array
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
void	TokenNamevoid	
bubbleSort	TokenNameIdentifier	 bubble Sort
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
LOG	TokenNameIdentifier	 LOG
.	TokenNameDOT	
info	TokenNameIdentifier	 info
(	TokenNameLPAREN	
"Entered the sort method."	TokenNameStringLiteral	Entered the sort method.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
intArray	TokenNameIdentifier	 int Array
.	TokenNameDOT	
length	TokenNameIdentifier	 length
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
--	TokenNameMINUS_MINUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
NDC	TokenNameIdentifier	 NDC
.	TokenNameDOT	
push	TokenNameIdentifier	 push
(	TokenNameLPAREN	
"i="	TokenNameStringLiteral	i=
+	TokenNamePLUS	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
OUTER	TokenNameIdentifier	 OUTER
.	TokenNameDOT	
debug	TokenNameIdentifier	 debug
(	TokenNameLPAREN	
"in outer loop."	TokenNameStringLiteral	in outer loop.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
j	TokenNameIdentifier	 j
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
<	TokenNameLESS	
i	TokenNameIdentifier	 i
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
NDC	TokenNameIdentifier	 NDC
.	TokenNameDOT	
push	TokenNameIdentifier	 push
(	TokenNameLPAREN	
"j="	TokenNameStringLiteral	j=
+	TokenNamePLUS	
j	TokenNameIdentifier	 j
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// It is poor practice to ship code with log staments in tight loops. 	TokenNameCOMMENT_LINE	It is poor practice to ship code with log staments in tight loops. 
// We do it anyway in this example. 	TokenNameCOMMENT_LINE	We do it anyway in this example. 
INNER	TokenNameIdentifier	 INNER
.	TokenNameDOT	
debug	TokenNameIdentifier	 debug
(	TokenNameLPAREN	
"in inner loop."	TokenNameStringLiteral	in inner loop.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
intArray	TokenNameIdentifier	 int Array
[	TokenNameLBRACKET	
j	TokenNameIdentifier	 j
]	TokenNameRBRACKET	
>	TokenNameGREATER	
intArray	TokenNameIdentifier	 int Array
[	TokenNameLBRACKET	
j	TokenNameIdentifier	 j
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
swap	TokenNameIdentifier	 swap
(	TokenNameLPAREN	
j	TokenNameIdentifier	 j
,	TokenNameCOMMA	
j	TokenNameIdentifier	 j
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
NDC	TokenNameIdentifier	 NDC
.	TokenNameDOT	
pop	TokenNameIdentifier	 pop
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
NDC	TokenNameIdentifier	 NDC
.	TokenNameDOT	
pop	TokenNameIdentifier	 pop
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
void	TokenNamevoid	
dump	TokenNameIdentifier	 dump
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
intArray	TokenNameIdentifier	 int Array
instanceof	TokenNameinstanceof	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
DUMP	TokenNameIdentifier	 DUMP
.	TokenNameDOT	
error	TokenNameIdentifier	 error
(	TokenNameLPAREN	
"Tried to dump an uninitialized array."	TokenNameStringLiteral	Tried to dump an uninitialized array.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
DUMP	TokenNameIdentifier	 DUMP
.	TokenNameDOT	
info	TokenNameIdentifier	 info
(	TokenNameLPAREN	
"Dump of integer array:"	TokenNameStringLiteral	Dump of integer array:
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
this	TokenNamethis	
.	TokenNameDOT	
intArray	TokenNameIdentifier	 int Array
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
DUMP	TokenNameIdentifier	 DUMP
.	TokenNameDOT	
info	TokenNameIdentifier	 info
(	TokenNameLPAREN	
"Element ["	TokenNameStringLiteral	Element [
+	TokenNamePLUS	
i	TokenNameIdentifier	 i
+	TokenNamePLUS	
"]="	TokenNameStringLiteral	]=
+	TokenNamePLUS	
this	TokenNamethis	
.	TokenNameDOT	
intArray	TokenNameIdentifier	 int Array
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
void	TokenNamevoid	
swap	TokenNameIdentifier	 swap
(	TokenNameLPAREN	
int	TokenNameint	
l	TokenNameIdentifier	 l
,	TokenNameCOMMA	
int	TokenNameint	
r	TokenNameIdentifier	 r
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// It is poor practice to ship code with log staments in tight 	TokenNameCOMMENT_LINE	It is poor practice to ship code with log staments in tight 
// loops or code called potentially millions of times. 	TokenNameCOMMENT_LINE	loops or code called potentially millions of times. 
SWAP	TokenNameIdentifier	 SWAP
.	TokenNameDOT	
debug	TokenNameIdentifier	 debug
(	TokenNameLPAREN	
"Swapping intArray["	TokenNameStringLiteral	Swapping intArray[
+	TokenNamePLUS	
l	TokenNameIdentifier	 l
+	TokenNamePLUS	
"]="	TokenNameStringLiteral	]=
+	TokenNamePLUS	
intArray	TokenNameIdentifier	 int Array
[	TokenNameLBRACKET	
l	TokenNameIdentifier	 l
]	TokenNameRBRACKET	
+	TokenNamePLUS	
" and intArray["	TokenNameStringLiteral	 and intArray[
+	TokenNamePLUS	
r	TokenNameIdentifier	 r
+	TokenNamePLUS	
"]="	TokenNameStringLiteral	]=
+	TokenNamePLUS	
intArray	TokenNameIdentifier	 int Array
[	TokenNameLBRACKET	
r	TokenNameIdentifier	 r
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
temp	TokenNameIdentifier	 temp
=	TokenNameEQUAL	
this	TokenNamethis	
.	TokenNameDOT	
intArray	TokenNameIdentifier	 int Array
[	TokenNameLBRACKET	
l	TokenNameIdentifier	 l
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
intArray	TokenNameIdentifier	 int Array
[	TokenNameLBRACKET	
l	TokenNameIdentifier	 l
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
this	TokenNamethis	
.	TokenNameDOT	
intArray	TokenNameIdentifier	 int Array
[	TokenNameLBRACKET	
r	TokenNameIdentifier	 r
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
intArray	TokenNameIdentifier	 int Array
[	TokenNameLBRACKET	
r	TokenNameIdentifier	 r
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
temp	TokenNameIdentifier	 temp
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
