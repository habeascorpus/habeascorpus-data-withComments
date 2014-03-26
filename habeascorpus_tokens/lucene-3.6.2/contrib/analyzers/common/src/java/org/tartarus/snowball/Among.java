/* Copyright (c) 2001, Dr Martin Porter Copyright (c) 2002, Richard Boulton All rights reserved. Redistribution and use in source and binary forms, with or without modification, are permitted provided that the following conditions are met: * Redistributions of source code must retain the above copyright notice, * this list of conditions and the following disclaimer. * Redistributions in binary form must reproduce the above copyright * notice, this list of conditions and the following disclaimer in the * documentation and/or other materials provided with the distribution. * Neither the name of the copyright holders nor the names of its contributors * may be used to endorse or promote products derived from this software * without specific prior written permission. THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE. */	TokenNameCOMMENT_BLOCK	 Copyright (c) 2001, Dr Martin Porter Copyright (c) 2002, Richard Boulton All rights reserved. Redistribution and use in source and binary forms, with or without modification, are permitted provided that the following conditions are met: Redistributions of source code must retain the above copyright notice, this list of conditions and the following disclaimer. Redistributions in binary form must reproduce the above copyright notice, this list of conditions and the following disclaimer in the documentation and/or other materials provided with the distribution. Neither the name of the copyright holders nor the names of its contributors may be used to endorse or promote products derived from this software without specific prior written permission. THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
tartarus	TokenNameIdentifier	 tartarus
.	TokenNameDOT	
snowball	TokenNameIdentifier	 snowball
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
lang	TokenNameIdentifier	 lang
.	TokenNameDOT	
reflect	TokenNameIdentifier	 reflect
.	TokenNameDOT	
Method	TokenNameIdentifier	 Method
;	TokenNameSEMICOLON	
public	TokenNamepublic	
class	TokenNameclass	
Among	TokenNameIdentifier	 Among
{	TokenNameLBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
Class	TokenNameIdentifier	 Class
<	TokenNameLESS	
?	TokenNameQUESTION	
>	TokenNameGREATER	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
EMPTY_PARAMS	TokenNameIdentifier	 EMPTY  PARAMS
=	TokenNameEQUAL	
new	TokenNamenew	
Class	TokenNameIdentifier	 Class
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
Among	TokenNameIdentifier	 Among
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
s	TokenNameIdentifier	 s
,	TokenNameCOMMA	
int	TokenNameint	
substring_i	TokenNameIdentifier	 substring i
,	TokenNameCOMMA	
int	TokenNameint	
result	TokenNameIdentifier	 result
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
methodname	TokenNameIdentifier	 methodname
,	TokenNameCOMMA	
SnowballProgram	TokenNameIdentifier	 Snowball Program
methodobject	TokenNameIdentifier	 methodobject
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
s_size	TokenNameIdentifier	 s size
=	TokenNameEQUAL	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
s	TokenNameIdentifier	 s
=	TokenNameEQUAL	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
toCharArray	TokenNameIdentifier	 to Char Array
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
substring_i	TokenNameIdentifier	 substring i
=	TokenNameEQUAL	
substring_i	TokenNameIdentifier	 substring i
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
result	TokenNameIdentifier	 result
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
methodobject	TokenNameIdentifier	 methodobject
=	TokenNameEQUAL	
methodobject	TokenNameIdentifier	 methodobject
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
methodname	TokenNameIdentifier	 methodname
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
method	TokenNameIdentifier	 method
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
method	TokenNameIdentifier	 method
=	TokenNameEQUAL	
methodobject	TokenNameIdentifier	 methodobject
.	TokenNameDOT	
getClass	TokenNameIdentifier	 get Class
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getDeclaredMethod	TokenNameIdentifier	 get Declared Method
(	TokenNameLPAREN	
methodname	TokenNameIdentifier	 methodname
,	TokenNameCOMMA	
EMPTY_PARAMS	TokenNameIdentifier	 EMPTY  PARAMS
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
NoSuchMethodException	TokenNameIdentifier	 No Such Method Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
RuntimeException	TokenNameIdentifier	 Runtime Exception
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
final	TokenNamefinal	
int	TokenNameint	
s_size	TokenNameIdentifier	 s size
;	TokenNameSEMICOLON	
/* search string */	TokenNameCOMMENT_BLOCK	 search string 
public	TokenNamepublic	
final	TokenNamefinal	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
s	TokenNameIdentifier	 s
;	TokenNameSEMICOLON	
/* search string */	TokenNameCOMMENT_BLOCK	 search string 
public	TokenNamepublic	
final	TokenNamefinal	
int	TokenNameint	
substring_i	TokenNameIdentifier	 substring i
;	TokenNameSEMICOLON	
/* index to longest matching substring */	TokenNameCOMMENT_BLOCK	 index to longest matching substring 
public	TokenNamepublic	
final	TokenNamefinal	
int	TokenNameint	
result	TokenNameIdentifier	 result
;	TokenNameSEMICOLON	
/* result of the lookup */	TokenNameCOMMENT_BLOCK	 result of the lookup 
public	TokenNamepublic	
final	TokenNamefinal	
Method	TokenNameIdentifier	 Method
method	TokenNameIdentifier	 method
;	TokenNameSEMICOLON	
/* method to use if substring matches */	TokenNameCOMMENT_BLOCK	 method to use if substring matches 
public	TokenNamepublic	
final	TokenNamefinal	
SnowballProgram	TokenNameIdentifier	 Snowball Program
methodobject	TokenNameIdentifier	 methodobject
;	TokenNameSEMICOLON	
/* object to invoke method on */	TokenNameCOMMENT_BLOCK	 object to invoke method on 
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
