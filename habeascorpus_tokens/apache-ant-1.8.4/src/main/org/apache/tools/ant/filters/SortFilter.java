/* * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. * */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
tools	TokenNameIdentifier	 tools
.	TokenNameDOT	
ant	TokenNameIdentifier	 ant
.	TokenNameDOT	
filters	TokenNameIdentifier	 filters
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
Reader	TokenNameIdentifier	 Reader
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
Collections	TokenNameIdentifier	 Collections
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Comparator	TokenNameIdentifier	 Comparator
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Iterator	TokenNameIdentifier	 Iterator
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
List	TokenNameIdentifier	 List
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
tools	TokenNameIdentifier	 tools
.	TokenNameDOT	
ant	TokenNameIdentifier	 ant
.	TokenNameDOT	
BuildException	TokenNameIdentifier	 Build Exception
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
tools	TokenNameIdentifier	 tools
.	TokenNameDOT	
ant	TokenNameIdentifier	 ant
.	TokenNameDOT	
types	TokenNameIdentifier	 types
.	TokenNameDOT	
Parameter	TokenNameIdentifier	 Parameter
;	TokenNameSEMICOLON	
/** * <p> * Sort a file before and/or after the file. * </p> * * <p> * Examples: * </p> * * <pre> * &lt;copy todir=&quot;build&quot;&gt; * &lt;fileset dir=&quot;input&quot; includes=&quot;*.txt&quot;/&gt; * &lt;filterchain&gt; * &lt;sortfilter/&gt; * &lt;/filterchain&gt; * &lt;/copy&gt; * </pre> * * <p> * Sort all files <code>*.txt</code> from <i>src</i> location and copy * them into <i>build</i> location. The lines of each file are sorted * in ascendant order comparing the lines via the * <code>String.compareTo(Object o)</code> method. * </p> * * <pre> * &lt;copy todir=&quot;build&quot;&gt; * &lt;fileset dir=&quot;input&quot; includes=&quot;*.txt&quot;/&gt; * &lt;filterchain&gt; * &lt;sortfilter reverse=&quot;true&quot;/&gt; * &lt;/filterchain&gt; * &lt;/copy&gt; * </pre> * * <p> * Sort all files <code>*.txt</code> from <i>src</i> location into reverse * order and copy them into <i>build</i> location. If reverse parameter has * value <code>true</code> (default value), then the output line of the files * will be in ascendant order. * </p> * * <pre> * &lt;copy todir=&quot;build&quot;&gt; * &lt;fileset dir=&quot;input&quot; includes=&quot;*.txt&quot;/&gt; * &lt;filterchain&gt; * &lt;filterreader classname=&quot;org.apache.tools.ant.filters.SortFilter&quot;&gt; * &lt;param name=&quot;comparator&quot; value=&quot;org.apache.tools.ant.filters.EvenFirstCmp&quot;/&gt; * &lt;/filterreader&gt; * &lt;/filterchain&gt; * &lt;/copy&gt; * </pre> * * <p> * Sort all files <code>*.txt</code> from <i>src</i> location using as * sorting criterium <code>EvenFirstCmp</code> class, that sorts the file * lines putting even lines first then odd lines for example. The modified files * are copied into <i>build</i> location. The <code>EventFirstCmp</code>, * has to an instanciable class via <code>Class.newInstance()</code>, * therefore in case of inner class has to be <em>static</em>. It also has to * implement <code>java.util.Comparator</code> interface, for example: * </p> * * <pre> * package org.apache.tools.ant.filters; * ...(omitted) * public final class EvenFirstCmp implements &lt;b&gt;Comparator&lt;/b&gt; { * public int compare(Object o1, Object o2) { * ...(omitted) * } * } * </pre> * * <p>The example above is equivalent to:</p> * * <blockquote><pre> * &lt;componentdef name="evenfirst" * classname="org.apache.tools.ant.filters.EvenFirstCmp&quot;/&gt; * &lt;copy todir=&quot;build&quot;&gt; * &lt;fileset dir=&quot;input&quot; includes=&quot;*.txt&quot;/&gt; * &lt;filterchain&gt; * &lt;sortfilter&gt; * &lt;evenfirst/&gt; * &lt;/sortfilter&gt; * &lt;/filterchain&gt; * &lt;/copy&gt; * </pre></blockquote> * * <p> If parameter <code>comparator</code> is present, then * <code>reverse</code> parameter will not be taken into account. </p> * * @since Ant 1.8.0 */	TokenNameCOMMENT_JAVADOC	 <p> Sort a file before and/or after the file. </p> * <p> Examples: </p> * <pre> &lt;copy todir=&quot;build&quot;&gt; &lt;fileset dir=&quot;input&quot; includes=&quot;*.txt&quot;/&gt; &lt;filterchain&gt; &lt;sortfilter/&gt; &lt;/filterchain&gt; &lt;/copy&gt; </pre> * <p> Sort all files <code>*.txt</code> from <i>src</i> location and copy them into <i>build</i> location. The lines of each file are sorted in ascendant order comparing the lines via the <code>String.compareTo(Object o)</code> method. </p> * <pre> &lt;copy todir=&quot;build&quot;&gt; &lt;fileset dir=&quot;input&quot; includes=&quot;*.txt&quot;/&gt; &lt;filterchain&gt; &lt;sortfilter reverse=&quot;true&quot;/&gt; &lt;/filterchain&gt; &lt;/copy&gt; </pre> * <p> Sort all files <code>*.txt</code> from <i>src</i> location into reverse order and copy them into <i>build</i> location. If reverse parameter has value <code>true</code> (default value), then the output line of the files will be in ascendant order. </p> * <pre> &lt;copy todir=&quot;build&quot;&gt; &lt;fileset dir=&quot;input&quot; includes=&quot;*.txt&quot;/&gt; &lt;filterchain&gt; &lt;filterreader classname=&quot;org.apache.tools.ant.filters.SortFilter&quot;&gt; &lt;param name=&quot;comparator&quot; value=&quot;org.apache.tools.ant.filters.EvenFirstCmp&quot;/&gt; &lt;/filterreader&gt; &lt;/filterchain&gt; &lt;/copy&gt; </pre> * <p> Sort all files <code>*.txt</code> from <i>src</i> location using as sorting criterium <code>EvenFirstCmp</code> class, that sorts the file lines putting even lines first then odd lines for example. The modified files are copied into <i>build</i> location. The <code>EventFirstCmp</code>, has to an instanciable class via <code>Class.newInstance()</code>, therefore in case of inner class has to be <em>static</em>. It also has to implement <code>java.util.Comparator</code> interface, for example: </p> * <pre> package org.apache.tools.ant.filters; ...(omitted) public final class EvenFirstCmp implements &lt;b&gt;Comparator&lt;/b&gt; { public int compare(Object o1, Object o2) { ...(omitted) } } </pre> * <p>The example above is equivalent to:</p> * <blockquote><pre> &lt;componentdef name="evenfirst" classname="org.apache.tools.ant.filters.EvenFirstCmp&quot;/&gt; &lt;copy todir=&quot;build&quot;&gt; &lt;fileset dir=&quot;input&quot; includes=&quot;*.txt&quot;/&gt; &lt;filterchain&gt; &lt;sortfilter&gt; &lt;evenfirst/&gt; &lt;/sortfilter&gt; &lt;/filterchain&gt; &lt;/copy&gt; </pre></blockquote> * <p> If parameter <code>comparator</code> is present, then <code>reverse</code> parameter will not be taken into account. </p> * @since Ant 1.8.0 
public	TokenNamepublic	
final	TokenNamefinal	
class	TokenNameclass	
SortFilter	TokenNameIdentifier	 Sort Filter
extends	TokenNameextends	
BaseParamFilterReader	TokenNameIdentifier	 Base Param Filter Reader
implements	TokenNameimplements	
ChainableReader	TokenNameIdentifier	 Chainable Reader
{	TokenNameLBRACE	
/** Parameter name for reverse order. */	TokenNameCOMMENT_JAVADOC	 Parameter name for reverse order. 
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
REVERSE_KEY	TokenNameIdentifier	 REVERSE  KEY
=	TokenNameEQUAL	
"reverse"	TokenNameStringLiteral	reverse
;	TokenNameSEMICOLON	
/** * Parameter name for specifying the comparator criteria via class that * implement <code>java.util.Comparator</code> interface. */	TokenNameCOMMENT_JAVADOC	 Parameter name for specifying the comparator criteria via class that implement <code>java.util.Comparator</code> interface. 
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
COMPARATOR_KEY	TokenNameIdentifier	 COMPARATOR  KEY
=	TokenNameEQUAL	
"comparator"	TokenNameStringLiteral	comparator
;	TokenNameSEMICOLON	
/** * Instance of comparator class to be used for sorting. */	TokenNameCOMMENT_JAVADOC	 Instance of comparator class to be used for sorting. 
private	TokenNameprivate	
Comparator	TokenNameIdentifier	 Comparator
comparator	TokenNameIdentifier	 comparator
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
/** * Controls if the sorting process will be in ascendant/descendant order. If * If has value <code>true</code>, then the line of the file will be * sorted on descendant order. Default value: <code>false</code>. It will * be considered only if <code>comparator</code> is <code>null</code>. */	TokenNameCOMMENT_JAVADOC	 Controls if the sorting process will be in ascendant/descendant order. If If has value <code>true</code>, then the line of the file will be sorted on descendant order. Default value: <code>false</code>. It will be considered only if <code>comparator</code> is <code>null</code>. 
private	TokenNameprivate	
boolean	TokenNameboolean	
reverse	TokenNameIdentifier	 reverse
;	TokenNameSEMICOLON	
/** * Stores the lines to be sorted. */	TokenNameCOMMENT_JAVADOC	 Stores the lines to be sorted. 
private	TokenNameprivate	
List	TokenNameIdentifier	 List
lines	TokenNameIdentifier	 lines
;	TokenNameSEMICOLON	
/** * Remaining line to be read from this filter, or <code>null</code> if the * next call to <code>read()</code> should read the original stream to * find the next matching line. */	TokenNameCOMMENT_JAVADOC	 Remaining line to be read from this filter, or <code>null</code> if the next call to <code>read()</code> should read the original stream to find the next matching line. 
private	TokenNameprivate	
String	TokenNameIdentifier	 String
line	TokenNameIdentifier	 line
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
Iterator	TokenNameIdentifier	 Iterator
iterator	TokenNameIdentifier	 iterator
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
/** * Constructor for "dummy" instances. * * @see BaseFilterReader#BaseFilterReader() */	TokenNameCOMMENT_JAVADOC	 Constructor for "dummy" instances. * @see BaseFilterReader#BaseFilterReader() 
public	TokenNamepublic	
SortFilter	TokenNameIdentifier	 Sort Filter
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Creates a new filtered reader. * * @param in * A Reader object providing the underlying stream. Must not be * <code>null</code>. */	TokenNameCOMMENT_JAVADOC	 Creates a new filtered reader. * @param in A Reader object providing the underlying stream. Must not be <code>null</code>. 
public	TokenNamepublic	
SortFilter	TokenNameIdentifier	 Sort Filter
(	TokenNameLPAREN	
final	TokenNamefinal	
Reader	TokenNameIdentifier	 Reader
in	TokenNameIdentifier	 in
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
in	TokenNameIdentifier	 in
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the next character in the filtered stream. If the desired number * of lines have already been read, the resulting stream is effectively at * an end. Otherwise, the next character from the underlying stream is read * and returned. * * @return the next character in the resulting stream, or -1 if the end of * the resulting stream has been reached * * @exception IOException * if the underlying stream throws an IOException during * reading */	TokenNameCOMMENT_JAVADOC	 Returns the next character in the filtered stream. If the desired number of lines have already been read, the resulting stream is effectively at an end. Otherwise, the next character from the underlying stream is read and returned. * @return the next character in the resulting stream, or -1 if the end of the resulting stream has been reached * @exception IOException if the underlying stream throws an IOException during reading 
public	TokenNamepublic	
int	TokenNameint	
read	TokenNameIdentifier	 read
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
getInitialized	TokenNameIdentifier	 get Initialized
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
initialize	TokenNameIdentifier	 initialize
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
setInitialized	TokenNameIdentifier	 set Initialized
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
int	TokenNameint	
ch	TokenNameIdentifier	 ch
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
line	TokenNameIdentifier	 line
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
/* * We are on the state: "reading the current line", lines are * already sorted */	TokenNameCOMMENT_BLOCK	 We are on the state: "reading the current line", lines are already sorted 
ch	TokenNameIdentifier	 ch
=	TokenNameEQUAL	
line	TokenNameIdentifier	 line
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
line	TokenNameIdentifier	 line
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
line	TokenNameIdentifier	 line
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
line	TokenNameIdentifier	 line
=	TokenNameEQUAL	
line	TokenNameIdentifier	 line
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
lines	TokenNameIdentifier	 lines
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// We read all lines and sort them 	TokenNameCOMMENT_LINE	We read all lines and sort them 
lines	TokenNameIdentifier	 lines
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
line	TokenNameIdentifier	 line
=	TokenNameEQUAL	
readLine	TokenNameIdentifier	 read Line
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
line	TokenNameIdentifier	 line
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
line	TokenNameIdentifier	 line
=	TokenNameEQUAL	
readLine	TokenNameIdentifier	 read Line
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
lines	TokenNameIdentifier	 lines
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
line	TokenNameIdentifier	 line
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
sort	TokenNameIdentifier	 sort
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
iterator	TokenNameIdentifier	 iterator
=	TokenNameEQUAL	
lines	TokenNameIdentifier	 lines
.	TokenNameDOT	
iterator	TokenNameIdentifier	 iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
iterator	TokenNameIdentifier	 iterator
.	TokenNameDOT	
hasNext	TokenNameIdentifier	 has Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
line	TokenNameIdentifier	 line
=	TokenNameEQUAL	
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
)	TokenNameRPAREN	
iterator	TokenNameIdentifier	 iterator
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
line	TokenNameIdentifier	 line
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
lines	TokenNameIdentifier	 lines
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
iterator	TokenNameIdentifier	 iterator
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
line	TokenNameIdentifier	 line
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
read	TokenNameIdentifier	 read
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
ch	TokenNameIdentifier	 ch
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Creates a new SortReader using the passed in Reader for instantiation. * * @param rdr * A Reader object providing the underlying stream. Must not be * <code>null</code>. * * @return a new filter based on this configuration, but filtering the * specified reader */	TokenNameCOMMENT_JAVADOC	 Creates a new SortReader using the passed in Reader for instantiation. * @param rdr A Reader object providing the underlying stream. Must not be <code>null</code>. * @return a new filter based on this configuration, but filtering the specified reader 
public	TokenNamepublic	
Reader	TokenNameIdentifier	 Reader
chain	TokenNameIdentifier	 chain
(	TokenNameLPAREN	
final	TokenNamefinal	
Reader	TokenNameIdentifier	 Reader
rdr	TokenNameIdentifier	 rdr
)	TokenNameRPAREN	
{	TokenNameLBRACE	
SortFilter	TokenNameIdentifier	 Sort Filter
newFilter	TokenNameIdentifier	 new Filter
=	TokenNameEQUAL	
new	TokenNamenew	
SortFilter	TokenNameIdentifier	 Sort Filter
(	TokenNameLPAREN	
rdr	TokenNameIdentifier	 rdr
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
newFilter	TokenNameIdentifier	 new Filter
.	TokenNameDOT	
setReverse	TokenNameIdentifier	 set Reverse
(	TokenNameLPAREN	
isReverse	TokenNameIdentifier	 is Reverse
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
newFilter	TokenNameIdentifier	 new Filter
.	TokenNameDOT	
setComparator	TokenNameIdentifier	 set Comparator
(	TokenNameLPAREN	
getComparator	TokenNameIdentifier	 get Comparator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
newFilter	TokenNameIdentifier	 new Filter
.	TokenNameDOT	
setInitialized	TokenNameIdentifier	 set Initialized
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
newFilter	TokenNameIdentifier	 new Filter
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns <code>true</code> if the sorting process will be in reverse * order, otherwise the sorting process will be in ascendant order. * * @return <code>true</code> if the sorting process will be in reverse * order, otherwise the sorting process will be in ascendant order. */	TokenNameCOMMENT_JAVADOC	 Returns <code>true</code> if the sorting process will be in reverse order, otherwise the sorting process will be in ascendant order. * @return <code>true</code> if the sorting process will be in reverse order, otherwise the sorting process will be in ascendant order. 
public	TokenNamepublic	
boolean	TokenNameboolean	
isReverse	TokenNameIdentifier	 is Reverse
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
reverse	TokenNameIdentifier	 reverse
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sets the sorting process will be in ascendant (<code>reverse=false</code>) * or to descendant (<code>reverse=true</code>). * * @param reverse * Boolean representing reverse ordering process. */	TokenNameCOMMENT_JAVADOC	 Sets the sorting process will be in ascendant (<code>reverse=false</code>) or to descendant (<code>reverse=true</code>). * @param reverse Boolean representing reverse ordering process. 
public	TokenNamepublic	
void	TokenNamevoid	
setReverse	TokenNameIdentifier	 set Reverse
(	TokenNameLPAREN	
boolean	TokenNameboolean	
reverse	TokenNameIdentifier	 reverse
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
reverse	TokenNameIdentifier	 reverse
=	TokenNameEQUAL	
reverse	TokenNameIdentifier	 reverse
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the comparator to be used for sorting. * * @return the comparator */	TokenNameCOMMENT_JAVADOC	 Returns the comparator to be used for sorting. * @return the comparator 
public	TokenNamepublic	
Comparator	TokenNameIdentifier	 Comparator
getComparator	TokenNameIdentifier	 get Comparator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
comparator	TokenNameIdentifier	 comparator
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set the comparator to be used as sorting criterium. * * @param comparator * the comparator to set */	TokenNameCOMMENT_JAVADOC	 Set the comparator to be used as sorting criterium. * @param comparator the comparator to set 
public	TokenNamepublic	
void	TokenNamevoid	
setComparator	TokenNameIdentifier	 set Comparator
(	TokenNameLPAREN	
Comparator	TokenNameIdentifier	 Comparator
comparator	TokenNameIdentifier	 comparator
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
comparator	TokenNameIdentifier	 comparator
=	TokenNameEQUAL	
comparator	TokenNameIdentifier	 comparator
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set the comparator to be used as sorting criterium as nested element. * * @param comparator * the comparator to set */	TokenNameCOMMENT_JAVADOC	 Set the comparator to be used as sorting criterium as nested element. * @param comparator the comparator to set 
public	TokenNamepublic	
void	TokenNamevoid	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
Comparator	TokenNameIdentifier	 Comparator
comparator	TokenNameIdentifier	 comparator
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
comparator	TokenNameIdentifier	 comparator
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
comparator	TokenNameIdentifier	 comparator
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
"can't have more than one comparator"	TokenNameStringLiteral	can't have more than one comparator
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
setComparator	TokenNameIdentifier	 set Comparator
(	TokenNameLPAREN	
comparator	TokenNameIdentifier	 comparator
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Scans the parameters list */	TokenNameCOMMENT_JAVADOC	 Scans the parameters list 
private	TokenNameprivate	
void	TokenNamevoid	
initialize	TokenNameIdentifier	 initialize
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
// get parameters 	TokenNameCOMMENT_LINE	get parameters 
Parameter	TokenNameIdentifier	 Parameter
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
params	TokenNameIdentifier	 params
=	TokenNameEQUAL	
getParameters	TokenNameIdentifier	 get Parameters
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
params	TokenNameIdentifier	 params
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
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
params	TokenNameIdentifier	 params
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
paramName	TokenNameIdentifier	 param Name
=	TokenNameEQUAL	
params	TokenNameIdentifier	 params
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
REVERSE_KEY	TokenNameIdentifier	 REVERSE  KEY
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
paramName	TokenNameIdentifier	 param Name
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
setReverse	TokenNameIdentifier	 set Reverse
(	TokenNameLPAREN	
Boolean	TokenNameIdentifier	 Boolean
.	TokenNameDOT	
valueOf	TokenNameIdentifier	 value Of
(	TokenNameLPAREN	
params	TokenNameIdentifier	 params
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
booleanValue	TokenNameIdentifier	 boolean Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
continue	TokenNamecontinue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
COMPARATOR_KEY	TokenNameIdentifier	 COMPARATOR  KEY
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
paramName	TokenNameIdentifier	 param Name
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
className	TokenNameIdentifier	 class Name
=	TokenNameEQUAL	
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
)	TokenNameRPAREN	
params	TokenNameIdentifier	 params
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
setComparator	TokenNameIdentifier	 set Comparator
(	TokenNameLPAREN	
(	TokenNameLPAREN	
Comparator	TokenNameIdentifier	 Comparator
)	TokenNameRPAREN	
(	TokenNameLPAREN	
Class	TokenNameIdentifier	 Class
.	TokenNameDOT	
forName	TokenNameIdentifier	 for Name
(	TokenNameLPAREN	
className	TokenNameIdentifier	 class Name
)	TokenNameRPAREN	
.	TokenNameDOT	
newInstance	TokenNameIdentifier	 new Instance
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
continue	TokenNamecontinue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
InstantiationException	TokenNameIdentifier	 Instantiation Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
IllegalAccessException	TokenNameIdentifier	 Illegal Access Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
/* * Probably a inner non-static class, this this case is * not considered */	TokenNameCOMMENT_BLOCK	 Probably a inner non-static class, this this case is not considered 
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
ClassNotFoundException	TokenNameIdentifier	 Class Not Found Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
ClassCastException	TokenNameIdentifier	 Class Cast Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
"Value of comparator attribute"	TokenNameStringLiteral	Value of comparator attribute
+	TokenNamePLUS	
" should implement"	TokenNameStringLiteral	 should implement
+	TokenNamePLUS	
" java.util.Comparator"	TokenNameStringLiteral	 java.util.Comparator
+	TokenNamePLUS	
" interface"	TokenNameStringLiteral	 interface
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
Exception	TokenNameIdentifier	 Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Sorts the read lines (<code>lines</code>)acording to the sorting * criteria defined by the user. * */	TokenNameCOMMENT_JAVADOC	 Sorts the read lines (<code>lines</code>)acording to the sorting criteria defined by the user. 
private	TokenNameprivate	
void	TokenNamevoid	
sort	TokenNameIdentifier	 sort
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
comparator	TokenNameIdentifier	 comparator
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
reverse	TokenNameIdentifier	 reverse
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Collections	TokenNameIdentifier	 Collections
.	TokenNameDOT	
sort	TokenNameIdentifier	 sort
(	TokenNameLPAREN	
lines	TokenNameIdentifier	 lines
,	TokenNameCOMMA	
new	TokenNamenew	
Comparator	TokenNameIdentifier	 Comparator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
public	TokenNamepublic	
int	TokenNameint	
compare	TokenNameIdentifier	 compare
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
o1	TokenNameIdentifier	 o1
,	TokenNameCOMMA	
Object	TokenNameIdentifier	 Object
o2	TokenNameIdentifier	 o2
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
s1	TokenNameIdentifier	 s1
=	TokenNameEQUAL	
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
)	TokenNameRPAREN	
o1	TokenNameIdentifier	 o1
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
s2	TokenNameIdentifier	 s2
=	TokenNameEQUAL	
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
)	TokenNameRPAREN	
o2	TokenNameIdentifier	 o2
;	TokenNameSEMICOLON	
return	TokenNamereturn	
(	TokenNameLPAREN	
-	TokenNameMINUS	
s1	TokenNameIdentifier	 s1
.	TokenNameDOT	
compareTo	TokenNameIdentifier	 compare To
(	TokenNameLPAREN	
s2	TokenNameIdentifier	 s2
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
Collections	TokenNameIdentifier	 Collections
.	TokenNameDOT	
sort	TokenNameIdentifier	 sort
(	TokenNameLPAREN	
lines	TokenNameIdentifier	 lines
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
Collections	TokenNameIdentifier	 Collections
.	TokenNameDOT	
sort	TokenNameIdentifier	 sort
(	TokenNameLPAREN	
lines	TokenNameIdentifier	 lines
,	TokenNameCOMMA	
comparator	TokenNameIdentifier	 comparator
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
