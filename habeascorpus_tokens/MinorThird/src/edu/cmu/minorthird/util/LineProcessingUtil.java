package	TokenNamepackage	
edu	TokenNameIdentifier	 edu
.	TokenNameDOT	
cmu	TokenNameIdentifier	 cmu
.	TokenNameDOT	
minorthird	TokenNameIdentifier	 minorthird
.	TokenNameDOT	
util	TokenNameIdentifier	 util
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
*	TokenNameMULTIPLY	
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
regex	TokenNameIdentifier	 regex
.	TokenNameDOT	
*	TokenNameMULTIPLY	
;	TokenNameSEMICOLON	
import	TokenNameimport	
edu	TokenNameIdentifier	 edu
.	TokenNameDOT	
cmu	TokenNameIdentifier	 cmu
.	TokenNameDOT	
minorthird	TokenNameIdentifier	 minorthird
.	TokenNameDOT	
text	TokenNameIdentifier	 text
.	TokenNameDOT	
*	TokenNameMULTIPLY	
;	TokenNameSEMICOLON	
/** * Line processing utilities. * Matcher for regular expressions, * adding features to stringBuffer in svmformat, etc * * @author Vitor R. Carvalho (vitor [at] cs..cmu...) */	TokenNameCOMMENT_JAVADOC	 Line processing utilities. Matcher for regular expressions, adding features to stringBuffer in svmformat, etc * @author Vitor R. Carvalho (vitor [at] cs..cmu...) 
public	TokenNamepublic	
class	TokenNameclass	
LineProcessingUtil	TokenNameIdentifier	 Line Processing Util
{	TokenNameLBRACE	
/** Returns true if substring in input (or part of it) matches the pattern. * @param patternStr regexp (in String format) * @param tmpstr line to be matched to regexp (in String format) * @return true (if pattern is matched) or false (otherwise) * * */	TokenNameCOMMENT_JAVADOC	 Returns true if substring in input (or part of it) matches the pattern. @param patternStr regexp (in String format) @param tmpstr line to be matched to regexp (in String format) @return true (if pattern is matched) or false (otherwise) * 
public	TokenNamepublic	
static	TokenNamestatic	
boolean	TokenNameboolean	
lineMatcher	TokenNameIdentifier	 line Matcher
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
patternStr	TokenNameIdentifier	 pattern Str
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
tmpstr	TokenNameIdentifier	 tmpstr
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
strsize	TokenNameIdentifier	 strsize
=	TokenNameEQUAL	
tmpstr	TokenNameIdentifier	 tmpstr
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
CharSequence	TokenNameIdentifier	 Char Sequence
tmp	TokenNameIdentifier	 tmp
=	TokenNameEQUAL	
tmpstr	TokenNameIdentifier	 tmpstr
.	TokenNameDOT	
subSequence	TokenNameIdentifier	 sub Sequence
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
strsize	TokenNameIdentifier	 strsize
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Pattern	TokenNameIdentifier	 Pattern
pattern	TokenNameIdentifier	 pattern
=	TokenNameEQUAL	
Pattern	TokenNameIdentifier	 Pattern
.	TokenNameDOT	
compile	TokenNameIdentifier	 compile
(	TokenNameLPAREN	
patternStr	TokenNameIdentifier	 pattern Str
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Matcher	TokenNameIdentifier	 Matcher
matcher	TokenNameIdentifier	 matcher
=	TokenNameEQUAL	
pattern	TokenNameIdentifier	 pattern
.	TokenNameDOT	
matcher	TokenNameIdentifier	 matcher
(	TokenNameLPAREN	
tmp	TokenNameIdentifier	 tmp
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
matcher	TokenNameIdentifier	 matcher
.	TokenNameDOT	
find	TokenNameIdentifier	 find
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * If the line substring matches the regexp, * it adds a " featurename=1" to the string buffer * * It is useful for producing external datasets in Minorthird format * * @param line in String format * @param regexp in String format * @param featureName feature name to be added, in case the regexp matches the line substring * @param features_out StringBuffer to which the feature should be added * **/	TokenNameCOMMENT_JAVADOC	 If the line substring matches the regexp, it adds a " featurename=1" to the string buffer * It is useful for producing external datasets in Minorthird format * @param line in String format @param regexp in String format @param featureName feature name to be added, in case the regexp matches the line substring @param features_out StringBuffer to which the feature should be added *
public	TokenNamepublic	
static	TokenNamestatic	
void	TokenNamevoid	
addFeature	TokenNameIdentifier	 add Feature
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
line	TokenNameIdentifier	 line
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
regexp	TokenNameIdentifier	 regexp
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
featureName	TokenNameIdentifier	 feature Name
,	TokenNameCOMMA	
StringBuffer	TokenNameIdentifier	 String Buffer
features_out	TokenNameIdentifier	 features out
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
lineMatcher	TokenNameIdentifier	 line Matcher
(	TokenNameLPAREN	
regexp	TokenNameIdentifier	 regexp
,	TokenNameCOMMA	
line	TokenNameIdentifier	 line
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
features_out	TokenNameIdentifier	 features out
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
" "	TokenNameStringLiteral	 
+	TokenNamePLUS	
featureName	TokenNameIdentifier	 feature Name
+	TokenNamePLUS	
"=1"	TokenNameStringLiteral	=1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Returns the percentage of punctuation (\p{punct}) characters in a line * * @param line in String format * @return a double with the percentage of characters **/	TokenNameCOMMENT_JAVADOC	 Returns the percentage of punctuation (\p{punct}) characters in a line * @param line in String format @return a double with the percentage of characters *
public	TokenNamepublic	
static	TokenNamestatic	
double	TokenNamedouble	
punctuationPercentage	TokenNameIdentifier	 punctuation Percentage
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
line	TokenNameIdentifier	 line
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
linelength	TokenNameIdentifier	 linelength
=	TokenNameEQUAL	
line	TokenNameIdentifier	 line
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
linelength	TokenNameIdentifier	 linelength
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
return	TokenNamereturn	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
punctCount	TokenNameIdentifier	 punct Count
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
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
linelength	TokenNameIdentifier	 linelength
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
lineMatcher	TokenNameIdentifier	 line Matcher
(	TokenNameLPAREN	
"\p{Punct}"	TokenNameStringLiteral	\p{Punct}
,	TokenNameCOMMA	
line	TokenNameIdentifier	 line
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
,	TokenNameCOMMA	
i	TokenNameIdentifier	 i
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
punctCount	TokenNameIdentifier	 punct Count
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
double	TokenNamedouble	
perc	TokenNameIdentifier	 perc
=	TokenNameEQUAL	
punctCount	TokenNameIdentifier	 punct Count
/	TokenNameDIVIDE	
(	TokenNameLPAREN	
double	TokenNamedouble	
)	TokenNameRPAREN	
linelength	TokenNameIdentifier	 linelength
;	TokenNameSEMICOLON	
return	TokenNamereturn	
perc	TokenNameIdentifier	 perc
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the percentage of A-Z or a-z characters in a line * * @param line in String format * @return the percentage of [a-z] or [A-Z] characters in the line **/	TokenNameCOMMENT_JAVADOC	 Returns the percentage of A-Z or a-z characters in a line * @param line in String format @return the percentage of [a-z] or [A-Z] characters in the line *
public	TokenNamepublic	
static	TokenNamestatic	
double	TokenNamedouble	
AtoZPercentage	TokenNameIdentifier	 Ato Z Percentage
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
line	TokenNameIdentifier	 line
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
linelength	TokenNameIdentifier	 linelength
=	TokenNameEQUAL	
line	TokenNameIdentifier	 line
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
linelength	TokenNameIdentifier	 linelength
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
return	TokenNamereturn	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
punctCount	TokenNameIdentifier	 punct Count
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
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
linelength	TokenNameIdentifier	 linelength
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
lineMatcher	TokenNameIdentifier	 line Matcher
(	TokenNameLPAREN	
"a-zA-Z"	TokenNameStringLiteral	a-zA-Z
,	TokenNameCOMMA	
line	TokenNameIdentifier	 line
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
,	TokenNameCOMMA	
i	TokenNameIdentifier	 i
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
punctCount	TokenNameIdentifier	 punct Count
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
double	TokenNamedouble	
perc	TokenNameIdentifier	 perc
=	TokenNameEQUAL	
punctCount	TokenNameIdentifier	 punct Count
/	TokenNameDIVIDE	
(	TokenNameLPAREN	
double	TokenNamedouble	
)	TokenNameRPAREN	
linelength	TokenNameIdentifier	 linelength
;	TokenNameSEMICOLON	
return	TokenNamereturn	
perc	TokenNameIdentifier	 perc
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the percentage characters [\w] in a line * * @param line in String format * @return the percentage of "\w" characters in the line **/	TokenNameCOMMENT_JAVADOC	 Returns the percentage characters [\w] in a line * @param line in String format @return the percentage of "\w" characters in the line *
public	TokenNamepublic	
static	TokenNamestatic	
double	TokenNamedouble	
wordCharactersPercentage	TokenNameIdentifier	 word Characters Percentage
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
line	TokenNameIdentifier	 line
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
linelength	TokenNameIdentifier	 linelength
=	TokenNameEQUAL	
line	TokenNameIdentifier	 line
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
linelength	TokenNameIdentifier	 linelength
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
return	TokenNamereturn	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
punctCount	TokenNameIdentifier	 punct Count
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
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
linelength	TokenNameIdentifier	 linelength
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
lineMatcher	TokenNameIdentifier	 line Matcher
(	TokenNameLPAREN	
"\w"	TokenNameStringLiteral	\w
,	TokenNameCOMMA	
line	TokenNameIdentifier	 line
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
,	TokenNameCOMMA	
i	TokenNameIdentifier	 i
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
punctCount	TokenNameIdentifier	 punct Count
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
double	TokenNamedouble	
perc	TokenNameIdentifier	 perc
=	TokenNameEQUAL	
punctCount	TokenNameIdentifier	 punct Count
/	TokenNameDIVIDE	
(	TokenNameLPAREN	
double	TokenNamedouble	
)	TokenNameRPAREN	
linelength	TokenNameIdentifier	 linelength
;	TokenNameSEMICOLON	
return	TokenNamereturn	
perc	TokenNameIdentifier	 perc
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * returns the percentage of tabs in a line * * @param line in String format * @return the percentage of "\t" characters in the line **/	TokenNameCOMMENT_JAVADOC	 returns the percentage of tabs in a line * @param line in String format @return the percentage of "\t" characters in the line *
public	TokenNamepublic	
static	TokenNamestatic	
double	TokenNamedouble	
indentPercentage	TokenNameIdentifier	 indent Percentage
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
line	TokenNameIdentifier	 line
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
linelength	TokenNameIdentifier	 linelength
=	TokenNameEQUAL	
line	TokenNameIdentifier	 line
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
linelength	TokenNameIdentifier	 linelength
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
return	TokenNamereturn	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
punctCount	TokenNameIdentifier	 punct Count
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
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
linelength	TokenNameIdentifier	 linelength
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
lineMatcher	TokenNameIdentifier	 line Matcher
(	TokenNameLPAREN	
"\t"	TokenNameStringLiteral	\t
,	TokenNameCOMMA	
line	TokenNameIdentifier	 line
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
,	TokenNameCOMMA	
i	TokenNameIdentifier	 i
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
punctCount	TokenNameIdentifier	 punct Count
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
double	TokenNamedouble	
perc	TokenNameIdentifier	 perc
=	TokenNameEQUAL	
punctCount	TokenNameIdentifier	 punct Count
/	TokenNameDIVIDE	
(	TokenNameLPAREN	
double	TokenNamedouble	
)	TokenNameRPAREN	
linelength	TokenNameIdentifier	 linelength
;	TokenNameSEMICOLON	
return	TokenNamereturn	
perc	TokenNameIdentifier	 perc
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/* * Returns the number of indentations or tabs ("\t") in a line * * @param line in String format * @return the number of "\t" characters in the line * **/	TokenNameCOMMENT_BLOCK	 Returns the number of indentations or tabs ("\t") in a line * @param line in String format @return the number of "\t" characters in the line *
public	TokenNamepublic	
static	TokenNamestatic	
int	TokenNameint	
indentNumber	TokenNameIdentifier	 indent Number
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
line	TokenNameIdentifier	 line
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
linelength	TokenNameIdentifier	 linelength
=	TokenNameEQUAL	
line	TokenNameIdentifier	 line
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
linelength	TokenNameIdentifier	 linelength
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
return	TokenNamereturn	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
punctCount	TokenNameIdentifier	 punct Count
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
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
linelength	TokenNameIdentifier	 linelength
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
lineMatcher	TokenNameIdentifier	 line Matcher
(	TokenNameLPAREN	
"\t"	TokenNameStringLiteral	\t
,	TokenNameCOMMA	
line	TokenNameIdentifier	 line
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
,	TokenNameCOMMA	
i	TokenNameIdentifier	 i
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
punctCount	TokenNameIdentifier	 punct Count
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
punctCount	TokenNameIdentifier	 punct Count
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/* * Returns the number of times a certain expression happened in a line * * @param - the expression to be counted (for instance: "Would you") * @param line in String format * @return the number of times the expression happened in the line * **/	TokenNameCOMMENT_BLOCK	 Returns the number of times a certain expression happened in a line * @param - the expression to be counted (for instance: "Would you") @param line in String format @return the number of times the expression happened in the line *
public	TokenNamepublic	
static	TokenNamestatic	
int	TokenNameint	
numberOfMatches	TokenNameIdentifier	 number Of Matches
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
expression	TokenNameIdentifier	 expression
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
line	TokenNameIdentifier	 line
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
linelength	TokenNameIdentifier	 linelength
=	TokenNameEQUAL	
line	TokenNameIdentifier	 line
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
exprelength	TokenNameIdentifier	 exprelength
=	TokenNameEQUAL	
expression	TokenNameIdentifier	 expression
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
linelength	TokenNameIdentifier	 linelength
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
exprelength	TokenNameIdentifier	 exprelength
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
theCount	TokenNameIdentifier	 the Count
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
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
(	TokenNameLPAREN	
linelength	TokenNameIdentifier	 linelength
-	TokenNameMINUS	
exprelength	TokenNameIdentifier	 exprelength
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
lineMatcher	TokenNameIdentifier	 line Matcher
(	TokenNameLPAREN	
expression	TokenNameIdentifier	 expression
,	TokenNameCOMMA	
line	TokenNameIdentifier	 line
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
,	TokenNameCOMMA	
i	TokenNameIdentifier	 i
+	TokenNamePLUS	
exprelength	TokenNameIdentifier	 exprelength
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
theCount	TokenNameIdentifier	 the Count
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
+=	TokenNamePLUS_EQUAL	
exprelength	TokenNameIdentifier	 exprelength
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
//System.out.println("count = "+theCount); 	TokenNameCOMMENT_LINE	System.out.println("count = "+theCount); 
return	TokenNamereturn	
theCount	TokenNameIdentifier	 the Count
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * detect a sequence of 2 lines starting with the same * punctuation (\p{Punct}) character * * @param tmp line1 in String format * @param tmp1 line2 in String format * @return true, if both lines start with same punctuation symbol * */	TokenNameCOMMENT_JAVADOC	 detect a sequence of 2 lines starting with the same punctuation (\p{Punct}) character * @param tmp line1 in String format @param tmp1 line2 in String format @return true, if both lines start with same punctuation symbol 
public	TokenNamepublic	
static	TokenNamestatic	
boolean	TokenNameboolean	
startWithSameInitialPunctCharacters	TokenNameIdentifier	 start With Same Initial Punct Characters
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
tmp	TokenNameIdentifier	 tmp
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
tmp1	TokenNameIdentifier	 tmp1
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
tmp	TokenNameIdentifier	 tmp
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
tmp1	TokenNameIdentifier	 tmp1
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
ind	TokenNameIdentifier	 ind
=	TokenNameEQUAL	
tmp	TokenNameIdentifier	 tmp
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//get first character 	TokenNameCOMMENT_LINE	get first character 
if	TokenNameif	
(	TokenNameLPAREN	
LineProcessingUtil	TokenNameIdentifier	 Line Processing Util
.	TokenNameDOT	
lineMatcher	TokenNameIdentifier	 line Matcher
(	TokenNameLPAREN	
"\p{Punct}"	TokenNameStringLiteral	\p{Punct}
,	TokenNameCOMMA	
ind	TokenNameIdentifier	 ind
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
ind2	TokenNameIdentifier	 ind2
=	TokenNameEQUAL	
tmp1	TokenNameIdentifier	 tmp1
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
ind2	TokenNameIdentifier	 ind2
.	TokenNameDOT	
compareTo	TokenNameIdentifier	 compare To
(	TokenNameLPAREN	
ind	TokenNameIdentifier	 ind
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Method to split a message (string format) into lines * @param tmp message as String * @return message lines in a String[] */	TokenNameCOMMENT_JAVADOC	 Method to split a message (string format) into lines @param tmp message as String @return message lines in a String[] 
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
getMessageLines	TokenNameIdentifier	 get Message Lines
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
tmp	TokenNameIdentifier	 tmp
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
outL	TokenNameIdentifier	 out L
=	TokenNameEQUAL	
tmp	TokenNameIdentifier	 tmp
.	TokenNameDOT	
split	TokenNameIdentifier	 split
(	TokenNameLPAREN	
" "	TokenNameStringLiteral	 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
outL	TokenNameIdentifier	 out L
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Method to read a file and turn it into a string - based on rcwang's code * * @param in String with the name of file * @return the original fine in a String format * */	TokenNameCOMMENT_JAVADOC	 Method to read a file and turn it into a string - based on rcwang's code * @param in String with the name of file @return the original fine in a String format 
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
readFile	TokenNameIdentifier	 read File
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
in	TokenNameIdentifier	 in
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
line	TokenNameIdentifier	 line
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
StringBuffer	TokenNameIdentifier	 String Buffer
content	TokenNameIdentifier	 content
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuffer	TokenNameIdentifier	 String Buffer
(	TokenNameLPAREN	
""	TokenNameStringLiteral	 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
BufferedReader	TokenNameIdentifier	 Buffered Reader
bReader	TokenNameIdentifier	 b Reader
=	TokenNameEQUAL	
new	TokenNamenew	
BufferedReader	TokenNameIdentifier	 Buffered Reader
(	TokenNameLPAREN	
new	TokenNamenew	
FileReader	TokenNameIdentifier	 File Reader
(	TokenNameLPAREN	
in	TokenNameIdentifier	 in
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
line	TokenNameIdentifier	 line
=	TokenNameEQUAL	
bReader	TokenNameIdentifier	 b Reader
.	TokenNameDOT	
readLine	TokenNameIdentifier	 read Line
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
content	TokenNameIdentifier	 content
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
line	TokenNameIdentifier	 line
+	TokenNamePLUS	
" "	TokenNameStringLiteral	 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
bReader	TokenNameIdentifier	 b Reader
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
content	TokenNameIdentifier	 content
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//return the contents of the file in a string format 	TokenNameCOMMENT_LINE	return the contents of the file in a string format 
}	TokenNameRBRACE	
/** Writes the contents of a String Buffer to an output file * * @param outputFileName output File name (as a String) * @param aux string buffer to be written to output file */	TokenNameCOMMENT_JAVADOC	 Writes the contents of a String Buffer to an output file * @param outputFileName output File name (as a String) @param aux string buffer to be written to output file 
public	TokenNamepublic	
static	TokenNamestatic	
void	TokenNamevoid	
writeToOutputFile	TokenNameIdentifier	 write To Output File
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
outputFileName	TokenNameIdentifier	 output File Name
,	TokenNameCOMMA	
StringBuffer	TokenNameIdentifier	 String Buffer
aux	TokenNameIdentifier	 aux
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
BufferedWriter	TokenNameIdentifier	 Buffered Writer
bWriter	TokenNameIdentifier	 b Writer
=	TokenNameEQUAL	
new	TokenNamenew	
BufferedWriter	TokenNameIdentifier	 Buffered Writer
(	TokenNameLPAREN	
new	TokenNamenew	
FileWriter	TokenNameIdentifier	 File Writer
(	TokenNameLPAREN	
outputFileName	TokenNameIdentifier	 output File Name
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
bWriter	TokenNameIdentifier	 b Writer
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
aux	TokenNameIdentifier	 aux
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
bWriter	TokenNameIdentifier	 b Writer
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
//don't use this 	TokenNameCOMMENT_LINE	don't use this 
public	TokenNamepublic	
static	TokenNamestatic	
TextLabels	TokenNameIdentifier	 Text Labels
readBsh	TokenNameIdentifier	 read Bsh
(	TokenNameLPAREN	
File	TokenNameIdentifier	 File
dir	TokenNameIdentifier	 dir
,	TokenNameCOMMA	
File	TokenNameIdentifier	 File
envfile	TokenNameIdentifier	 envfile
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"reading data files"	TokenNameStringLiteral	reading data files
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
TextBaseLoader	TokenNameIdentifier	 Text Base Loader
tbl	TokenNameIdentifier	 tbl
=	TokenNameEQUAL	
new	TokenNamenew	
TextBaseLoader	TokenNameIdentifier	 Text Base Loader
(	TokenNameLPAREN	
TextBaseLoader	TokenNameIdentifier	 Text Base Loader
.	TokenNameDOT	
DOC_PER_FILE	TokenNameIdentifier	 DOC  PER  FILE
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
tbl	TokenNameIdentifier	 tbl
.	TokenNameDOT	
load	TokenNameIdentifier	 load
(	TokenNameLPAREN	
dir	TokenNameIdentifier	 dir
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
TextLabels	TokenNameIdentifier	 Text Labels
lala	TokenNameIdentifier	 lala
=	TokenNameEQUAL	
tbl	TokenNameIdentifier	 tbl
.	TokenNameDOT	
getLabels	TokenNameIdentifier	 get Labels
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
TextBase	TokenNameIdentifier	 Text Base
basevitor	TokenNameIdentifier	 basevitor
=	TokenNameEQUAL	
lala	TokenNameIdentifier	 lala
.	TokenNameDOT	
getTextBase	TokenNameIdentifier	 get Text Base
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
TextLabelsLoader	TokenNameIdentifier	 Text Labels Loader
labelLoaderVitor	TokenNameIdentifier	 label Loader Vitor
=	TokenNameEQUAL	
new	TokenNamenew	
TextLabelsLoader	TokenNameIdentifier	 Text Labels Loader
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"reading env file..."	TokenNameStringLiteral	reading env file...
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
labelLoaderVitor	TokenNameIdentifier	 label Loader Vitor
.	TokenNameDOT	
importOps	TokenNameIdentifier	 import Ops
(	TokenNameLPAREN	
(	TokenNameLPAREN	
MutableTextLabels	TokenNameIdentifier	 Mutable Text Labels
)	TokenNameRPAREN	
lala	TokenNameIdentifier	 lala
,	TokenNameCOMMA	
basevitor	TokenNameIdentifier	 basevitor
,	TokenNameCOMMA	
envfile	TokenNameIdentifier	 envfile
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
lala	TokenNameIdentifier	 lala
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
