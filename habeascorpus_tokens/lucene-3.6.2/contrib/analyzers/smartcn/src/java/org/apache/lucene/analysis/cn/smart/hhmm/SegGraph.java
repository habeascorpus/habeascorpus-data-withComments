/** * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_JAVADOC	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
analysis	TokenNameIdentifier	 analysis
.	TokenNameDOT	
cn	TokenNameIdentifier	 cn
.	TokenNameDOT	
smart	TokenNameIdentifier	 smart
.	TokenNameDOT	
hhmm	TokenNameIdentifier	 hhmm
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
ArrayList	TokenNameIdentifier	 Array List
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
HashMap	TokenNameIdentifier	 Hash Map
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
List	TokenNameIdentifier	 List
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Map	TokenNameIdentifier	 Map
;	TokenNameSEMICOLON	
/** * Graph representing possible tokens at each start offset in the sentence. * <p> * For each start offset, a list of possible tokens is stored. * </p> * @lucene.experimental */	TokenNameCOMMENT_JAVADOC	 Graph representing possible tokens at each start offset in the sentence. <p> For each start offset, a list of possible tokens is stored. </p> @lucene.experimental 
class	TokenNameclass	
SegGraph	TokenNameIdentifier	 Seg Graph
{	TokenNameLBRACE	
/** * Map of start offsets to ArrayList of tokens at that position */	TokenNameCOMMENT_JAVADOC	 Map of start offsets to ArrayList of tokens at that position 
private	TokenNameprivate	
Map	TokenNameIdentifier	 Map
<	TokenNameLESS	
Integer	TokenNameIdentifier	 Integer
,	TokenNameCOMMA	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
SegToken	TokenNameIdentifier	 Seg Token
>>	TokenNameRIGHT_SHIFT	
tokenListTable	TokenNameIdentifier	 token List Table
=	TokenNameEQUAL	
new	TokenNamenew	
HashMap	TokenNameIdentifier	 Hash Map
<	TokenNameLESS	
Integer	TokenNameIdentifier	 Integer
,	TokenNameCOMMA	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
SegToken	TokenNameIdentifier	 Seg Token
>>	TokenNameRIGHT_SHIFT	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
maxStart	TokenNameIdentifier	 max Start
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * Returns true if a mapping for the specified start offset exists * * @param s startOffset * @return true if there are tokens for the startOffset */	TokenNameCOMMENT_JAVADOC	 Returns true if a mapping for the specified start offset exists * @param s startOffset @return true if there are tokens for the startOffset 
public	TokenNamepublic	
boolean	TokenNameboolean	
isStartExist	TokenNameIdentifier	 is Start Exist
(	TokenNameLPAREN	
int	TokenNameint	
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
tokenListTable	TokenNameIdentifier	 token List Table
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the list of tokens at the specified start offset * * @param s startOffset * @return List of tokens at the specified start offset. */	TokenNameCOMMENT_JAVADOC	 Get the list of tokens at the specified start offset * @param s startOffset @return List of tokens at the specified start offset. 
public	TokenNamepublic	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
SegToken	TokenNameIdentifier	 Seg Token
>	TokenNameGREATER	
getStartList	TokenNameIdentifier	 get Start List
(	TokenNameLPAREN	
int	TokenNameint	
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
tokenListTable	TokenNameIdentifier	 token List Table
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the highest start offset in the map * * @return maximum start offset, or -1 if the map is empty. */	TokenNameCOMMENT_JAVADOC	 Get the highest start offset in the map * @return maximum start offset, or -1 if the map is empty. 
public	TokenNamepublic	
int	TokenNameint	
getMaxStart	TokenNameIdentifier	 get Max Start
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
maxStart	TokenNameIdentifier	 max Start
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set the {@link SegToken#index} for each token, based upon its order by startOffset. * @return a {@link List} of these ordered tokens. */	TokenNameCOMMENT_JAVADOC	 Set the {@link SegToken#index} for each token, based upon its order by startOffset. @return a {@link List} of these ordered tokens. 
public	TokenNamepublic	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
SegToken	TokenNameIdentifier	 Seg Token
>	TokenNameGREATER	
makeIndex	TokenNameIdentifier	 make Index
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
SegToken	TokenNameIdentifier	 Seg Token
>	TokenNameGREATER	
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
SegToken	TokenNameIdentifier	 Seg Token
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
s	TokenNameIdentifier	 s
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
count	TokenNameIdentifier	 count
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
size	TokenNameIdentifier	 size
=	TokenNameEQUAL	
tokenListTable	TokenNameIdentifier	 token List Table
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
SegToken	TokenNameIdentifier	 Seg Token
>	TokenNameGREATER	
tokenList	TokenNameIdentifier	 token List
;	TokenNameSEMICOLON	
int	TokenNameint	
index	TokenNameIdentifier	 index
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
count	TokenNameIdentifier	 count
<	TokenNameLESS	
size	TokenNameIdentifier	 size
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
isStartExist	TokenNameIdentifier	 is Start Exist
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
tokenList	TokenNameIdentifier	 token List
=	TokenNameEQUAL	
tokenListTable	TokenNameIdentifier	 token List Table
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
SegToken	TokenNameIdentifier	 Seg Token
st	TokenNameIdentifier	 st
:	TokenNameCOLON	
tokenList	TokenNameIdentifier	 token List
)	TokenNameRPAREN	
{	TokenNameLBRACE	
st	TokenNameIdentifier	 st
.	TokenNameDOT	
index	TokenNameIdentifier	 index
=	TokenNameEQUAL	
index	TokenNameIdentifier	 index
;	TokenNameSEMICOLON	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
st	TokenNameIdentifier	 st
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
index	TokenNameIdentifier	 index
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
count	TokenNameIdentifier	 count
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
s	TokenNameIdentifier	 s
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
result	TokenNameIdentifier	 result
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Add a {@link SegToken} to the mapping, creating a new mapping at the token's startOffset if one does not exist. * @param token {@link SegToken} */	TokenNameCOMMENT_JAVADOC	 Add a {@link SegToken} to the mapping, creating a new mapping at the token's startOffset if one does not exist. @param token {@link SegToken} 
public	TokenNamepublic	
void	TokenNamevoid	
addToken	TokenNameIdentifier	 add Token
(	TokenNameLPAREN	
SegToken	TokenNameIdentifier	 Seg Token
token	TokenNameIdentifier	 token
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
s	TokenNameIdentifier	 s
=	TokenNameEQUAL	
token	TokenNameIdentifier	 token
.	TokenNameDOT	
startOffset	TokenNameIdentifier	 start Offset
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
isStartExist	TokenNameIdentifier	 is Start Exist
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
SegToken	TokenNameIdentifier	 Seg Token
>	TokenNameGREATER	
newlist	TokenNameIdentifier	 newlist
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
SegToken	TokenNameIdentifier	 Seg Token
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
newlist	TokenNameIdentifier	 newlist
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
token	TokenNameIdentifier	 token
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
tokenListTable	TokenNameIdentifier	 token List Table
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
,	TokenNameCOMMA	
newlist	TokenNameIdentifier	 newlist
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
SegToken	TokenNameIdentifier	 Seg Token
>	TokenNameGREATER	
tokenList	TokenNameIdentifier	 token List
=	TokenNameEQUAL	
tokenListTable	TokenNameIdentifier	 token List Table
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
tokenList	TokenNameIdentifier	 token List
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
token	TokenNameIdentifier	 token
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
>	TokenNameGREATER	
maxStart	TokenNameIdentifier	 max Start
)	TokenNameRPAREN	
maxStart	TokenNameIdentifier	 max Start
=	TokenNameEQUAL	
s	TokenNameIdentifier	 s
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Return a {@link List} of all tokens in the map, ordered by startOffset. * * @return {@link List} of all tokens in the map. */	TokenNameCOMMENT_JAVADOC	 Return a {@link List} of all tokens in the map, ordered by startOffset. * @return {@link List} of all tokens in the map. 
public	TokenNamepublic	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
SegToken	TokenNameIdentifier	 Seg Token
>	TokenNameGREATER	
toTokenList	TokenNameIdentifier	 to Token List
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
SegToken	TokenNameIdentifier	 Seg Token
>	TokenNameGREATER	
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
SegToken	TokenNameIdentifier	 Seg Token
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
s	TokenNameIdentifier	 s
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
count	TokenNameIdentifier	 count
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
size	TokenNameIdentifier	 size
=	TokenNameEQUAL	
tokenListTable	TokenNameIdentifier	 token List Table
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
SegToken	TokenNameIdentifier	 Seg Token
>	TokenNameGREATER	
tokenList	TokenNameIdentifier	 token List
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
count	TokenNameIdentifier	 count
<	TokenNameLESS	
size	TokenNameIdentifier	 size
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
isStartExist	TokenNameIdentifier	 is Start Exist
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
tokenList	TokenNameIdentifier	 token List
=	TokenNameEQUAL	
tokenListTable	TokenNameIdentifier	 token List Table
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
SegToken	TokenNameIdentifier	 Seg Token
st	TokenNameIdentifier	 st
:	TokenNameCOLON	
tokenList	TokenNameIdentifier	 token List
)	TokenNameRPAREN	
{	TokenNameLBRACE	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
st	TokenNameIdentifier	 st
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
count	TokenNameIdentifier	 count
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
s	TokenNameIdentifier	 s
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
result	TokenNameIdentifier	 result
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
List	TokenNameIdentifier	 List
<	TokenNameLESS	
SegToken	TokenNameIdentifier	 Seg Token
>	TokenNameGREATER	
tokenList	TokenNameIdentifier	 token List
=	TokenNameEQUAL	
this	TokenNamethis	
.	TokenNameDOT	
toTokenList	TokenNameIdentifier	 to Token List
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
StringBuilder	TokenNameIdentifier	 String Builder
sb	TokenNameIdentifier	 sb
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuilder	TokenNameIdentifier	 String Builder
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
SegToken	TokenNameIdentifier	 Seg Token
t	TokenNameIdentifier	 t
:	TokenNameCOLON	
tokenList	TokenNameIdentifier	 token List
)	TokenNameRPAREN	
{	TokenNameLBRACE	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
t	TokenNameIdentifier	 t
+	TokenNamePLUS	
" "	TokenNameStringLiteral	 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
