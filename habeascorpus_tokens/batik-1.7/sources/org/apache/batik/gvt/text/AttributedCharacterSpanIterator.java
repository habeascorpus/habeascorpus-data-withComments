/* Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
batik	TokenNameIdentifier	 batik
.	TokenNameDOT	
gvt	TokenNameIdentifier	 gvt
.	TokenNameDOT	
text	TokenNameIdentifier	 text
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
text	TokenNameIdentifier	 text
.	TokenNameDOT	
AttributedCharacterIterator	TokenNameIdentifier	 Attributed Character Iterator
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
text	TokenNameIdentifier	 text
.	TokenNameDOT	
CharacterIterator	TokenNameIdentifier	 Character Iterator
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Map	TokenNameIdentifier	 Map
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Set	TokenNameIdentifier	 Set
;	TokenNameSEMICOLON	
/** * AttributedCharacterSpanIterator * * Used to provide ACI functionality to a "substring" of an AttributedString. * In this way a TextLayout can be created which only uses a substring of * AttributedString. * * @author <a href="mailto:bill.haneman@ireland.sun.com">Bill Haneman</a> * @version $Id: AttributedCharacterSpanIterator.java 475477 2006-11-15 22:44:28Z cam $ */	TokenNameCOMMENT_JAVADOC	 AttributedCharacterSpanIterator * Used to provide ACI functionality to a "substring" of an AttributedString. In this way a TextLayout can be created which only uses a substring of AttributedString. * @author <a href="mailto:bill.haneman@ireland.sun.com">Bill Haneman</a> @version $Id: AttributedCharacterSpanIterator.java 475477 2006-11-15 22:44:28Z cam $ 
public	TokenNamepublic	
class	TokenNameclass	
AttributedCharacterSpanIterator	TokenNameIdentifier	 Attributed Character Span Iterator
implements	TokenNameimplements	
AttributedCharacterIterator	TokenNameIdentifier	 Attributed Character Iterator
{	TokenNameLBRACE	
private	TokenNameprivate	
AttributedCharacterIterator	TokenNameIdentifier	 Attributed Character Iterator
aci	TokenNameIdentifier	 aci
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
begin	TokenNameIdentifier	 begin
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
end	TokenNameIdentifier	 end
;	TokenNameSEMICOLON	
/** * Construct a AttributedCharacterSpanIterator from a subinterval of * an existing AttributedCharacterIterator. * @param aci The source AttributedCharacterIterator * @param start the first index of the subinterval * @param stop the index of the first character after the subinterval */	TokenNameCOMMENT_JAVADOC	 Construct a AttributedCharacterSpanIterator from a subinterval of an existing AttributedCharacterIterator. @param aci The source AttributedCharacterIterator @param start the first index of the subinterval @param stop the index of the first character after the subinterval 
public	TokenNamepublic	
AttributedCharacterSpanIterator	TokenNameIdentifier	 Attributed Character Span Iterator
(	TokenNameLPAREN	
AttributedCharacterIterator	TokenNameIdentifier	 Attributed Character Iterator
aci	TokenNameIdentifier	 aci
,	TokenNameCOMMA	
int	TokenNameint	
start	TokenNameIdentifier	 start
,	TokenNameCOMMA	
int	TokenNameint	
stop	TokenNameIdentifier	 stop
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
aci	TokenNameIdentifier	 aci
=	TokenNameEQUAL	
aci	TokenNameIdentifier	 aci
;	TokenNameSEMICOLON	
end	TokenNameIdentifier	 end
=	TokenNameEQUAL	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
min	TokenNameIdentifier	 min
(	TokenNameLPAREN	
aci	TokenNameIdentifier	 aci
.	TokenNameDOT	
getEndIndex	TokenNameIdentifier	 get End Index
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
stop	TokenNameIdentifier	 stop
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
begin	TokenNameIdentifier	 begin
=	TokenNameEQUAL	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
max	TokenNameIdentifier	 max
(	TokenNameLPAREN	
aci	TokenNameIdentifier	 aci
.	TokenNameDOT	
getBeginIndex	TokenNameIdentifier	 get Begin Index
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
start	TokenNameIdentifier	 start
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
aci	TokenNameIdentifier	 aci
.	TokenNameDOT	
setIndex	TokenNameIdentifier	 set Index
(	TokenNameLPAREN	
begin	TokenNameIdentifier	 begin
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
//From java.text.AttributedCharacterIterator 	TokenNameCOMMENT_LINE	From java.text.AttributedCharacterIterator 
/** * Get the keys of all attributes defined on the iterator's text range. */	TokenNameCOMMENT_JAVADOC	 Get the keys of all attributes defined on the iterator's text range. 
public	TokenNamepublic	
Set	TokenNameIdentifier	 Set
getAllAttributeKeys	TokenNameIdentifier	 get All Attribute Keys
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
aci	TokenNameIdentifier	 aci
.	TokenNameDOT	
getAllAttributeKeys	TokenNameIdentifier	 get All Attribute Keys
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// FIXME: not if there are atts outside the substring! 	TokenNameCOMMENT_LINE	FIXME: not if there are atts outside the substring! 
}	TokenNameRBRACE	
/** * Get the value of the named attribute for the current * character. */	TokenNameCOMMENT_JAVADOC	 Get the value of the named attribute for the current character. 
public	TokenNamepublic	
Object	TokenNameIdentifier	 Object
getAttribute	TokenNameIdentifier	 get Attribute
(	TokenNameLPAREN	
AttributedCharacterIterator	TokenNameIdentifier	 Attributed Character Iterator
.	TokenNameDOT	
Attribute	TokenNameIdentifier	 Attribute
attribute	TokenNameIdentifier	 attribute
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
aci	TokenNameIdentifier	 aci
.	TokenNameDOT	
getAttribute	TokenNameIdentifier	 get Attribute
(	TokenNameLPAREN	
attribute	TokenNameIdentifier	 attribute
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns a map with the attributes defined on the current * character. */	TokenNameCOMMENT_JAVADOC	 Returns a map with the attributes defined on the current character. 
public	TokenNamepublic	
Map	TokenNameIdentifier	 Map
getAttributes	TokenNameIdentifier	 get Attributes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
aci	TokenNameIdentifier	 aci
.	TokenNameDOT	
getAttributes	TokenNameIdentifier	 get Attributes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the index of the first character following the * run with respect to all attributes containing the current * character. */	TokenNameCOMMENT_JAVADOC	 Get the index of the first character following the run with respect to all attributes containing the current character. 
public	TokenNamepublic	
int	TokenNameint	
getRunLimit	TokenNameIdentifier	 get Run Limit
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
min	TokenNameIdentifier	 min
(	TokenNameLPAREN	
aci	TokenNameIdentifier	 aci
.	TokenNameDOT	
getRunLimit	TokenNameIdentifier	 get Run Limit
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
end	TokenNameIdentifier	 end
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the index of the first character following the * run with respect to the given attribute containing the current * character. */	TokenNameCOMMENT_JAVADOC	 Get the index of the first character following the run with respect to the given attribute containing the current character. 
public	TokenNamepublic	
int	TokenNameint	
getRunLimit	TokenNameIdentifier	 get Run Limit
(	TokenNameLPAREN	
AttributedCharacterIterator	TokenNameIdentifier	 Attributed Character Iterator
.	TokenNameDOT	
Attribute	TokenNameIdentifier	 Attribute
attribute	TokenNameIdentifier	 attribute
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
min	TokenNameIdentifier	 min
(	TokenNameLPAREN	
aci	TokenNameIdentifier	 aci
.	TokenNameDOT	
getRunLimit	TokenNameIdentifier	 get Run Limit
(	TokenNameLPAREN	
attribute	TokenNameIdentifier	 attribute
)	TokenNameRPAREN	
,	TokenNameCOMMA	
end	TokenNameIdentifier	 end
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the index of the first character following the * run with respect to the given attributes containing the current * character. */	TokenNameCOMMENT_JAVADOC	 Get the index of the first character following the run with respect to the given attributes containing the current character. 
public	TokenNamepublic	
int	TokenNameint	
getRunLimit	TokenNameIdentifier	 get Run Limit
(	TokenNameLPAREN	
Set	TokenNameIdentifier	 Set
attributes	TokenNameIdentifier	 attributes
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
min	TokenNameIdentifier	 min
(	TokenNameLPAREN	
aci	TokenNameIdentifier	 aci
.	TokenNameDOT	
getRunLimit	TokenNameIdentifier	 get Run Limit
(	TokenNameLPAREN	
attributes	TokenNameIdentifier	 attributes
)	TokenNameRPAREN	
,	TokenNameCOMMA	
end	TokenNameIdentifier	 end
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the index of the first character of the run with * respect to all attributes containing the current character. */	TokenNameCOMMENT_JAVADOC	 Get the index of the first character of the run with respect to all attributes containing the current character. 
public	TokenNamepublic	
int	TokenNameint	
getRunStart	TokenNameIdentifier	 get Run Start
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
max	TokenNameIdentifier	 max
(	TokenNameLPAREN	
aci	TokenNameIdentifier	 aci
.	TokenNameDOT	
getRunStart	TokenNameIdentifier	 get Run Start
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
begin	TokenNameIdentifier	 begin
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the index of the first character of the run with * respect to the given attribute containing the current character. * @param attribute The attribute for whose appearance the first offset * is requested. */	TokenNameCOMMENT_JAVADOC	 Get the index of the first character of the run with respect to the given attribute containing the current character. @param attribute The attribute for whose appearance the first offset is requested. 
public	TokenNamepublic	
int	TokenNameint	
getRunStart	TokenNameIdentifier	 get Run Start
(	TokenNameLPAREN	
AttributedCharacterIterator	TokenNameIdentifier	 Attributed Character Iterator
.	TokenNameDOT	
Attribute	TokenNameIdentifier	 Attribute
attribute	TokenNameIdentifier	 attribute
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
max	TokenNameIdentifier	 max
(	TokenNameLPAREN	
aci	TokenNameIdentifier	 aci
.	TokenNameDOT	
getRunStart	TokenNameIdentifier	 get Run Start
(	TokenNameLPAREN	
attribute	TokenNameIdentifier	 attribute
)	TokenNameRPAREN	
,	TokenNameCOMMA	
begin	TokenNameIdentifier	 begin
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the index of the first character of the run with respect to * the given attributes containing the current character. * @param attributes the Set of attributes which begins at the * returned index. */	TokenNameCOMMENT_JAVADOC	 Get the index of the first character of the run with respect to the given attributes containing the current character. @param attributes the Set of attributes which begins at the returned index. 
public	TokenNamepublic	
int	TokenNameint	
getRunStart	TokenNameIdentifier	 get Run Start
(	TokenNameLPAREN	
Set	TokenNameIdentifier	 Set
attributes	TokenNameIdentifier	 attributes
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
max	TokenNameIdentifier	 max
(	TokenNameLPAREN	
aci	TokenNameIdentifier	 aci
.	TokenNameDOT	
getRunStart	TokenNameIdentifier	 get Run Start
(	TokenNameLPAREN	
attributes	TokenNameIdentifier	 attributes
)	TokenNameRPAREN	
,	TokenNameCOMMA	
begin	TokenNameIdentifier	 begin
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
//From CharacterIterator 	TokenNameCOMMENT_LINE	From CharacterIterator 
/** * Create a copy of this iterator */	TokenNameCOMMENT_JAVADOC	 Create a copy of this iterator 
public	TokenNamepublic	
Object	TokenNameIdentifier	 Object
clone	TokenNameIdentifier	 clone
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
AttributedCharacterSpanIterator	TokenNameIdentifier	 Attributed Character Span Iterator
(	TokenNameLPAREN	
(	TokenNameLPAREN	
AttributedCharacterIterator	TokenNameIdentifier	 Attributed Character Iterator
)	TokenNameRPAREN	
aci	TokenNameIdentifier	 aci
.	TokenNameDOT	
clone	TokenNameIdentifier	 clone
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
begin	TokenNameIdentifier	 begin
,	TokenNameCOMMA	
end	TokenNameIdentifier	 end
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the character at the current position (as returned * by getIndex()). * <br><b>Specified by:</b> java.text.CharacterIterator. */	TokenNameCOMMENT_JAVADOC	 Get the character at the current position (as returned by getIndex()). <br><b>Specified by:</b> java.text.CharacterIterator. 
public	TokenNamepublic	
char	TokenNamechar	
current	TokenNameIdentifier	 current
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
aci	TokenNameIdentifier	 aci
.	TokenNameDOT	
current	TokenNameIdentifier	 current
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sets the position to getBeginIndex(). * @return the character at the start index of the text. * <br><b>Specified by:</b> java.text.CharacterIterator. */	TokenNameCOMMENT_JAVADOC	 Sets the position to getBeginIndex(). @return the character at the start index of the text. <br><b>Specified by:</b> java.text.CharacterIterator. 
public	TokenNamepublic	
char	TokenNamechar	
first	TokenNameIdentifier	 first
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
aci	TokenNameIdentifier	 aci
.	TokenNameDOT	
setIndex	TokenNameIdentifier	 set Index
(	TokenNameLPAREN	
begin	TokenNameIdentifier	 begin
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the start index of the text. * <br><b>Specified by:</b> java.text.CharacterIterator. */	TokenNameCOMMENT_JAVADOC	 Get the start index of the text. <br><b>Specified by:</b> java.text.CharacterIterator. 
public	TokenNamepublic	
int	TokenNameint	
getBeginIndex	TokenNameIdentifier	 get Begin Index
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
begin	TokenNameIdentifier	 begin
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the end index of the text. * <br><b>Specified by:</b> java.text.CharacterIterator. */	TokenNameCOMMENT_JAVADOC	 Get the end index of the text. <br><b>Specified by:</b> java.text.CharacterIterator. 
public	TokenNamepublic	
int	TokenNameint	
getEndIndex	TokenNameIdentifier	 get End Index
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
end	TokenNameIdentifier	 end
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the current index. * <br><b>Specified by:</b> java.text.CharacterIterator. */	TokenNameCOMMENT_JAVADOC	 Get the current index. <br><b>Specified by:</b> java.text.CharacterIterator. 
public	TokenNamepublic	
int	TokenNameint	
getIndex	TokenNameIdentifier	 get Index
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
aci	TokenNameIdentifier	 aci
.	TokenNameDOT	
getIndex	TokenNameIdentifier	 get Index
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sets the position to getEndIndex()-1 (getEndIndex() if * the text is empty) and returns the character at that position. * <br><b>Specified by:</b> java.text.CharacterIterator. */	TokenNameCOMMENT_JAVADOC	 Sets the position to getEndIndex()-1 (getEndIndex() if the text is empty) and returns the character at that position. <br><b>Specified by:</b> java.text.CharacterIterator. 
public	TokenNamepublic	
char	TokenNamechar	
last	TokenNameIdentifier	 last
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
setIndex	TokenNameIdentifier	 set Index
(	TokenNameLPAREN	
end	TokenNameIdentifier	 end
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Increments the iterator's index by one, returning the next character. * @return the character at the new index. * <br><b>Specified by:</b> java.text.CharacterIterator. */	TokenNameCOMMENT_JAVADOC	 Increments the iterator's index by one, returning the next character. @return the character at the new index. <br><b>Specified by:</b> java.text.CharacterIterator. 
public	TokenNamepublic	
char	TokenNamechar	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
getIndex	TokenNameIdentifier	 get Index
(	TokenNameLPAREN	
)	TokenNameRPAREN	
<	TokenNameLESS	
end	TokenNameIdentifier	 end
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
aci	TokenNameIdentifier	 aci
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
return	TokenNamereturn	
setIndex	TokenNameIdentifier	 set Index
(	TokenNameLPAREN	
end	TokenNameIdentifier	 end
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Decrements the iterator's index by one and returns * the character at the new index. * <br><b>Specified by:</b> java.text.CharacterIterator. */	TokenNameCOMMENT_JAVADOC	 Decrements the iterator's index by one and returns the character at the new index. <br><b>Specified by:</b> java.text.CharacterIterator. 
public	TokenNamepublic	
char	TokenNamechar	
previous	TokenNameIdentifier	 previous
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
getIndex	TokenNameIdentifier	 get Index
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>	TokenNameGREATER	
begin	TokenNameIdentifier	 begin
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
aci	TokenNameIdentifier	 aci
.	TokenNameDOT	
previous	TokenNameIdentifier	 previous
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
return	TokenNamereturn	
CharacterIterator	TokenNameIdentifier	 Character Iterator
.	TokenNameDOT	
DONE	TokenNameIdentifier	 DONE
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Sets the position to the specified position in the text. * @param position The new (current) index into the text. * @return the character at new index <em>position</em>. * <br><b>Specified by:</b> java.text.CharacterIterator. */	TokenNameCOMMENT_JAVADOC	 Sets the position to the specified position in the text. @param position The new (current) index into the text. @return the character at new index <em>position</em>. <br><b>Specified by:</b> java.text.CharacterIterator. 
public	TokenNamepublic	
char	TokenNamechar	
setIndex	TokenNameIdentifier	 set Index
(	TokenNameLPAREN	
int	TokenNameint	
position	TokenNameIdentifier	 position
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
ndx	TokenNameIdentifier	 ndx
=	TokenNameEQUAL	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
max	TokenNameIdentifier	 max
(	TokenNameLPAREN	
position	TokenNameIdentifier	 position
,	TokenNameCOMMA	
begin	TokenNameIdentifier	 begin
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ndx	TokenNameIdentifier	 ndx
=	TokenNameEQUAL	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
min	TokenNameIdentifier	 min
(	TokenNameLPAREN	
ndx	TokenNameIdentifier	 ndx
,	TokenNameCOMMA	
end	TokenNameIdentifier	 end
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
char	TokenNamechar	
c	TokenNameIdentifier	 c
=	TokenNameEQUAL	
aci	TokenNameIdentifier	 aci
.	TokenNameDOT	
setIndex	TokenNameIdentifier	 set Index
(	TokenNameLPAREN	
ndx	TokenNameIdentifier	 ndx
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
ndx	TokenNameIdentifier	 ndx
==	TokenNameEQUAL_EQUAL	
end	TokenNameIdentifier	 end
)	TokenNameRPAREN	
{	TokenNameLBRACE	
c	TokenNameIdentifier	 c
=	TokenNameEQUAL	
CharacterIterator	TokenNameIdentifier	 Character Iterator
.	TokenNameDOT	
DONE	TokenNameIdentifier	 DONE
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
c	TokenNameIdentifier	 c
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
