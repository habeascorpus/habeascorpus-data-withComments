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
PropertyConfigurator	TokenNameIdentifier	 Property Configurator
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
/** Example code for log4j to viewed in conjunction with the {@link examples.SortAlgo SortAlgo} class. <p>This program expects a configuration file name as its first argument, and the size of the array to sort as the second and last argument. See its <b><a href="doc-files/Sort.java">source code</a></b> for more details. <p>Play around with different values in the configuration file and watch the changing behavior. <p>Example configuration files can be found in <a href="doc-files/sort1.properties">sort1.properties</a>, <a href="doc-files/sort2.properties">sort2.properties</a>, <a href="doc-files/sort3.properties">sort3.properties</a> and <a href="doc-files/sort4.properties">sort4.properties</a> are supplied with the package. <p>If you are also interested in logging performance, then have look at the {@link org.apache.log4j.performance.Logging} class. @author Ceki G&uuml;lc&uuml; */	TokenNameCOMMENT_JAVADOC	 Example code for log4j to viewed in conjunction with the {@link examples.SortAlgo SortAlgo} class. <p>This program expects a configuration file name as its first argument, and the size of the array to sort as the second and last argument. See its <b><a href="doc-files/Sort.java">source code</a></b> for more details. <p>Play around with different values in the configuration file and watch the changing behavior. <p>Example configuration files can be found in <a href="doc-files/sort1.properties">sort1.properties</a>, <a href="doc-files/sort2.properties">sort2.properties</a>, <a href="doc-files/sort3.properties">sort3.properties</a> and <a href="doc-files/sort4.properties">sort4.properties</a> are supplied with the package. <p>If you are also interested in logging performance, then have look at the {@link org.apache.log4j.performance.Logging} class. @author Ceki G&uuml;lc&uuml; 
public	TokenNamepublic	
class	TokenNameclass	
Sort	TokenNameIdentifier	 Sort
{	TokenNameLBRACE	
static	TokenNamestatic	
Logger	TokenNameIdentifier	 Logger
logger	TokenNameIdentifier	 logger
=	TokenNameEQUAL	
Logger	TokenNameIdentifier	 Logger
.	TokenNameDOT	
getLogger	TokenNameIdentifier	 get Logger
(	TokenNameLPAREN	
Sort	TokenNameIdentifier	 Sort
.	TokenNameDOT	
class	TokenNameclass	
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
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
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
args	TokenNameIdentifier	 args
.	TokenNameDOT	
length	TokenNameIdentifier	 length
!=	TokenNameNOT_EQUAL	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
usage	TokenNameIdentifier	 usage
(	TokenNameLPAREN	
"Incorrect number of parameters."	TokenNameStringLiteral	Incorrect number of parameters.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
int	TokenNameint	
arraySize	TokenNameIdentifier	 array Size
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
arraySize	TokenNameIdentifier	 array Size
=	TokenNameEQUAL	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
valueOf	TokenNameIdentifier	 value Of
(	TokenNameLPAREN	
args	TokenNameIdentifier	 args
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
.	TokenNameDOT	
intValue	TokenNameIdentifier	 int Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
arraySize	TokenNameIdentifier	 array Size
<=	TokenNameLESS_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
usage	TokenNameIdentifier	 usage
(	TokenNameLPAREN	
"Negative array size."	TokenNameStringLiteral	Negative array size.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
lang	TokenNameIdentifier	 lang
.	TokenNameDOT	
NumberFormatException	TokenNameIdentifier	 Number Format Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
usage	TokenNameIdentifier	 usage
(	TokenNameLPAREN	
"Could not number format ["	TokenNameStringLiteral	Could not number format [
+	TokenNamePLUS	
args	TokenNameIdentifier	 args
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
+	TokenNamePLUS	
"]."	TokenNameStringLiteral	].
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
PropertyConfigurator	TokenNameIdentifier	 Property Configurator
.	TokenNameDOT	
configure	TokenNameIdentifier	 configure
(	TokenNameLPAREN	
args	TokenNameIdentifier	 args
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
intArray	TokenNameIdentifier	 int Array
=	TokenNameEQUAL	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
arraySize	TokenNameIdentifier	 array Size
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
logger	TokenNameIdentifier	 logger
.	TokenNameDOT	
info	TokenNameIdentifier	 info
(	TokenNameLPAREN	
"Populating an array of "	TokenNameStringLiteral	Populating an array of 
+	TokenNamePLUS	
arraySize	TokenNameIdentifier	 array Size
+	TokenNamePLUS	
" elements in"	TokenNameStringLiteral	 elements in
+	TokenNamePLUS	
" reverse order."	TokenNameStringLiteral	 reverse order.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
arraySize	TokenNameIdentifier	 array Size
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
intArray	TokenNameIdentifier	 int Array
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
arraySize	TokenNameIdentifier	 array Size
-	TokenNameMINUS	
i	TokenNameIdentifier	 i
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
SortAlgo	TokenNameIdentifier	 Sort Algo
sa1	TokenNameIdentifier	 sa1
=	TokenNameEQUAL	
new	TokenNamenew	
SortAlgo	TokenNameIdentifier	 Sort Algo
(	TokenNameLPAREN	
intArray	TokenNameIdentifier	 int Array
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sa1	TokenNameIdentifier	 sa1
.	TokenNameDOT	
bubbleSort	TokenNameIdentifier	 bubble Sort
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sa1	TokenNameIdentifier	 sa1
.	TokenNameDOT	
dump	TokenNameIdentifier	 dump
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// We intentionally initilize sa2 with null. 	TokenNameCOMMENT_LINE	We intentionally initilize sa2 with null. 
SortAlgo	TokenNameIdentifier	 Sort Algo
sa2	TokenNameIdentifier	 sa2
=	TokenNameEQUAL	
new	TokenNamenew	
SortAlgo	TokenNameIdentifier	 Sort Algo
(	TokenNameLPAREN	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
logger	TokenNameIdentifier	 logger
.	TokenNameDOT	
info	TokenNameIdentifier	 info
(	TokenNameLPAREN	
"The next log statement should be an error message."	TokenNameStringLiteral	The next log statement should be an error message.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sa2	TokenNameIdentifier	 sa2
.	TokenNameDOT	
dump	TokenNameIdentifier	 dump
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
logger	TokenNameIdentifier	 logger
.	TokenNameDOT	
info	TokenNameIdentifier	 info
(	TokenNameLPAREN	
"Exiting main method."	TokenNameStringLiteral	Exiting main method.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
static	TokenNamestatic	
void	TokenNamevoid	
usage	TokenNameIdentifier	 usage
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
errMsg	TokenNameIdentifier	 err Msg
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
err	TokenNameIdentifier	 err
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
errMsg	TokenNameIdentifier	 err Msg
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
err	TokenNameIdentifier	 err
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
" Usage: java org.apache.examples.Sort "	TokenNameStringLiteral	 Usage: java org.apache.examples.Sort 
+	TokenNamePLUS	
"configFile ARRAY_SIZE "	TokenNameStringLiteral	configFile ARRAY_SIZE 
+	TokenNamePLUS	
"where configFile is a configuration file "	TokenNameStringLiteral	where configFile is a configuration file 
+	TokenNamePLUS	
" ARRAY_SIZE is a positive integer. "	TokenNameStringLiteral	 ARRAY_SIZE is a positive integer. 
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
