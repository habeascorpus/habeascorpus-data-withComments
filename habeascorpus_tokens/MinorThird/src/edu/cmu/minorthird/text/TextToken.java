package	TokenNamepackage	
edu	TokenNameIdentifier	 edu
.	TokenNameDOT	
cmu	TokenNameIdentifier	 cmu
.	TokenNameDOT	
minorthird	TokenNameIdentifier	 minorthird
.	TokenNameDOT	
text	TokenNameIdentifier	 text
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
Serializable	TokenNameIdentifier	 Serializable
;	TokenNameSEMICOLON	
/** * Identifies a particular substring of a particular document. * * @author William Cohen */	TokenNameCOMMENT_JAVADOC	 Identifies a particular substring of a particular document. * @author William Cohen 
public	TokenNamepublic	
class	TokenNameclass	
TextToken	TokenNameIdentifier	 Text Token
implements	TokenNameimplements	
Comparable	TokenNameIdentifier	 Comparable
<	TokenNameLESS	
TextToken	TokenNameIdentifier	 Text Token
>	TokenNameGREATER	
,	TokenNameCOMMA	
Serializable	TokenNameIdentifier	 Serializable
,	TokenNameCOMMA	
Token	TokenNameIdentifier	 Token
{	TokenNameLBRACE	
static	TokenNamestatic	
private	TokenNameprivate	
final	TokenNamefinal	
long	TokenNamelong	
serialVersionUID	TokenNameIdentifier	 serial Version UID
=	TokenNameEQUAL	
20080305L	TokenNameLongLiteral	
;	TokenNameSEMICOLON	
// private final String documentId; 	TokenNameCOMMENT_LINE	private final String documentId; 
private	TokenNameprivate	
final	TokenNamefinal	
Document	TokenNameIdentifier	 Document
document	TokenNameIdentifier	 document
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
int	TokenNameint	
lo	TokenNameIdentifier	 lo
,	TokenNameCOMMA	
len	TokenNameIdentifier	 len
;	TokenNameSEMICOLON	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
value	TokenNameIdentifier	 value
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
TextToken	TokenNameIdentifier	 Text Token
(	TokenNameLPAREN	
Document	TokenNameIdentifier	 Document
document	TokenNameIdentifier	 document
,	TokenNameCOMMA	
int	TokenNameint	
lo	TokenNameIdentifier	 lo
,	TokenNameCOMMA	
int	TokenNameint	
len	TokenNameIdentifier	 len
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
document	TokenNameIdentifier	 document
=	TokenNameEQUAL	
document	TokenNameIdentifier	 document
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
lo	TokenNameIdentifier	 lo
=	TokenNameEQUAL	
lo	TokenNameIdentifier	 lo
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
len	TokenNameIdentifier	 len
=	TokenNameEQUAL	
len	TokenNameIdentifier	 len
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getDocumentId	TokenNameIdentifier	 get Document Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
document	TokenNameIdentifier	 document
.	TokenNameDOT	
getId	TokenNameIdentifier	 get Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getDocument	TokenNameIdentifier	 get Document
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
document	TokenNameIdentifier	 document
.	TokenNameDOT	
getText	TokenNameIdentifier	 get Text
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
int	TokenNameint	
getLo	TokenNameIdentifier	 get Lo
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
lo	TokenNameIdentifier	 lo
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
int	TokenNameint	
getLength	TokenNameIdentifier	 get Length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
len	TokenNameIdentifier	 len
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
int	TokenNameint	
getHi	TokenNameIdentifier	 get Hi
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
lo	TokenNameIdentifier	 lo
+	TokenNamePLUS	
len	TokenNameIdentifier	 len
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
value	TokenNameIdentifier	 value
=	TokenNameEQUAL	
document	TokenNameIdentifier	 document
.	TokenNameDOT	
getText	TokenNameIdentifier	 get Text
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
lo	TokenNameIdentifier	 lo
,	TokenNameCOMMA	
lo	TokenNameIdentifier	 lo
+	TokenNamePLUS	
len	TokenNameIdentifier	 len
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
value	TokenNameIdentifier	 value
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// 	TokenNameCOMMENT_LINE	 
// implements Comparable 	TokenNameCOMMENT_LINE	implements Comparable 
// 	TokenNameCOMMENT_LINE	 
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
int	TokenNameint	
compareTo	TokenNameIdentifier	 compare To
(	TokenNameLPAREN	
TextToken	TokenNameIdentifier	 Text Token
other	TokenNameIdentifier	 other
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
cmp1	TokenNameIdentifier	 cmp1
=	TokenNameEQUAL	
this	TokenNamethis	
.	TokenNameDOT	
getDocumentId	TokenNameIdentifier	 get Document Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
compareTo	TokenNameIdentifier	 compare To
(	TokenNameLPAREN	
other	TokenNameIdentifier	 other
.	TokenNameDOT	
getDocumentId	TokenNameIdentifier	 get Document Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
cmp1	TokenNameIdentifier	 cmp1
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
return	TokenNamereturn	
cmp1	TokenNameIdentifier	 cmp1
;	TokenNameSEMICOLON	
int	TokenNameint	
cmp2	TokenNameIdentifier	 cmp2
=	TokenNameEQUAL	
lo	TokenNameIdentifier	 lo
-	TokenNameMINUS	
other	TokenNameIdentifier	 other
.	TokenNameDOT	
lo	TokenNameIdentifier	 lo
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
cmp2	TokenNameIdentifier	 cmp2
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
return	TokenNamereturn	
cmp2	TokenNameIdentifier	 cmp2
;	TokenNameSEMICOLON	
return	TokenNamereturn	
len	TokenNameIdentifier	 len
-	TokenNameMINUS	
other	TokenNameIdentifier	 other
.	TokenNameDOT	
len	TokenNameIdentifier	 len
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// 	TokenNameCOMMENT_LINE	 
// for safe hashing 	TokenNameCOMMENT_LINE	for safe hashing 
// 	TokenNameCOMMENT_LINE	 
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
int	TokenNameint	
hashCode	TokenNameIdentifier	 hash Code
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
getDocumentId	TokenNameIdentifier	 get Document Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
hashCode	TokenNameIdentifier	 hash Code
(	TokenNameLPAREN	
)	TokenNameRPAREN	
^	TokenNameXOR	
lo	TokenNameIdentifier	 lo
^	TokenNameXOR	
len	TokenNameIdentifier	 len
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
boolean	TokenNameboolean	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
o	TokenNameIdentifier	 o
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
o	TokenNameIdentifier	 o
instanceof	TokenNameinstanceof	
TextToken	TokenNameIdentifier	 Text Token
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
compareTo	TokenNameIdentifier	 compare To
(	TokenNameLPAREN	
(	TokenNameLPAREN	
TextToken	TokenNameIdentifier	 Text Token
)	TokenNameRPAREN	
o	TokenNameIdentifier	 o
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
asString	TokenNameIdentifier	 as String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
getDocumentId	TokenNameIdentifier	 get Document Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
"$Substr/"	TokenNameStringLiteral	$Substr/
+	TokenNamePLUS	
lo	TokenNameIdentifier	 lo
+	TokenNamePLUS	
","	TokenNameStringLiteral	,
+	TokenNamePLUS	
len	TokenNameIdentifier	 len
+	TokenNamePLUS	
":'"	TokenNameStringLiteral	:'
+	TokenNamePLUS	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
"'"	TokenNameStringLiteral	'
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
String	TokenNameIdentifier	 String
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
"[token '"	TokenNameStringLiteral	[token '
+	TokenNamePLUS	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
"']"	TokenNameStringLiteral	']
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
