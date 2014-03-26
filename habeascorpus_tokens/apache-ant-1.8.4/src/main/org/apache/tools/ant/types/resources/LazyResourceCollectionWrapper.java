package	TokenNamepackage	
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
resources	TokenNameIdentifier	 resources
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
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
NoSuchElementException	TokenNameIdentifier	 No Such Element Exception
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
Resource	TokenNameIdentifier	 Resource
;	TokenNameSEMICOLON	
/** * Resource collection which load underlying resource collection only on demand * with support for caching */	TokenNameCOMMENT_JAVADOC	 Resource collection which load underlying resource collection only on demand with support for caching 
public	TokenNamepublic	
class	TokenNameclass	
LazyResourceCollectionWrapper	TokenNameIdentifier	 Lazy Resource Collection Wrapper
extends	TokenNameextends	
AbstractResourceCollectionWrapper	TokenNameIdentifier	 Abstract Resource Collection Wrapper
{	TokenNameLBRACE	
/** List of cached resources */	TokenNameCOMMENT_JAVADOC	 List of cached resources 
private	TokenNameprivate	
List	TokenNameIdentifier	 List
cachedResources	TokenNameIdentifier	 cached Resources
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
FilteringIterator	TokenNameIdentifier	 Filtering Iterator
filteringIterator	TokenNameIdentifier	 filtering Iterator
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
Iterator	TokenNameIdentifier	 Iterator
createIterator	TokenNameIdentifier	 create Iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Iterator	TokenNameIdentifier	 Iterator
iterator	TokenNameIdentifier	 iterator
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
isCache	TokenNameIdentifier	 is Cache
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
filteringIterator	TokenNameIdentifier	 filtering Iterator
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// no worry of thread safety here, see function's contract 	TokenNameCOMMENT_LINE	no worry of thread safety here, see function's contract 
filteringIterator	TokenNameIdentifier	 filtering Iterator
=	TokenNameEQUAL	
new	TokenNamenew	
FilteringIterator	TokenNameIdentifier	 Filtering Iterator
(	TokenNameLPAREN	
getResourceCollection	TokenNameIdentifier	 get Resource Collection
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
iterator	TokenNameIdentifier	 iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
iterator	TokenNameIdentifier	 iterator
=	TokenNameEQUAL	
new	TokenNamenew	
CachedIterator	TokenNameIdentifier	 Cached Iterator
(	TokenNameLPAREN	
filteringIterator	TokenNameIdentifier	 filtering Iterator
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
iterator	TokenNameIdentifier	 iterator
=	TokenNameEQUAL	
new	TokenNamenew	
FilteringIterator	TokenNameIdentifier	 Filtering Iterator
(	TokenNameLPAREN	
getResourceCollection	TokenNameIdentifier	 get Resource Collection
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
iterator	TokenNameIdentifier	 iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
iterator	TokenNameIdentifier	 iterator
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
protected	TokenNameprotected	
int	TokenNameint	
getSize	TokenNameIdentifier	 get Size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// to compute the size, just iterate: the iterator will take care of 	TokenNameCOMMENT_LINE	to compute the size, just iterate: the iterator will take care of 
// caching 	TokenNameCOMMENT_LINE	caching 
Iterator	TokenNameIdentifier	 Iterator
it	TokenNameIdentifier	 it
=	TokenNameEQUAL	
createIterator	TokenNameIdentifier	 create Iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
size	TokenNameIdentifier	 size
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
it	TokenNameIdentifier	 it
.	TokenNameDOT	
hasNext	TokenNameIdentifier	 has Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
it	TokenNameIdentifier	 it
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
size	TokenNameIdentifier	 size
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
size	TokenNameIdentifier	 size
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Specify if the resource should be filtered or not. This function should * be overrided in order to define the filtering algorithm * * @param r resource considered for filtration * @return whether the resource should be filtered or not */	TokenNameCOMMENT_JAVADOC	 Specify if the resource should be filtered or not. This function should be overrided in order to define the filtering algorithm * @param r resource considered for filtration @return whether the resource should be filtered or not 
protected	TokenNameprotected	
boolean	TokenNameboolean	
filterResource	TokenNameIdentifier	 filter Resource
(	TokenNameLPAREN	
Resource	TokenNameIdentifier	 Resource
r	TokenNameIdentifier	 r
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
class	TokenNameclass	
FilteringIterator	TokenNameIdentifier	 Filtering Iterator
implements	TokenNameimplements	
Iterator	TokenNameIdentifier	 Iterator
{	TokenNameLBRACE	
Resource	TokenNameIdentifier	 Resource
next	TokenNameIdentifier	 next
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
ended	TokenNameIdentifier	 ended
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
final	TokenNamefinal	
Iterator	TokenNameIdentifier	 Iterator
it	TokenNameIdentifier	 it
;	TokenNameSEMICOLON	
public	TokenNamepublic	
FilteringIterator	TokenNameIdentifier	 Filtering Iterator
(	TokenNameLPAREN	
Iterator	TokenNameIdentifier	 Iterator
it	TokenNameIdentifier	 it
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
it	TokenNameIdentifier	 it
=	TokenNameEQUAL	
it	TokenNameIdentifier	 it
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
boolean	TokenNameboolean	
hasNext	TokenNameIdentifier	 has Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
ended	TokenNameIdentifier	 ended
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
while	TokenNamewhile	
(	TokenNameLPAREN	
next	TokenNameIdentifier	 next
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
it	TokenNameIdentifier	 it
.	TokenNameDOT	
hasNext	TokenNameIdentifier	 has Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ended	TokenNameIdentifier	 ended
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
next	TokenNameIdentifier	 next
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Resource	TokenNameIdentifier	 Resource
)	TokenNameRPAREN	
it	TokenNameIdentifier	 it
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
filterResource	TokenNameIdentifier	 filter Resource
(	TokenNameLPAREN	
next	TokenNameIdentifier	 next
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
next	TokenNameIdentifier	 next
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
Object	TokenNameIdentifier	 Object
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
hasNext	TokenNameIdentifier	 has Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
UnsupportedOperationException	TokenNameIdentifier	 Unsupported Operation Exception
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
Resource	TokenNameIdentifier	 Resource
r	TokenNameIdentifier	 r
=	TokenNameEQUAL	
next	TokenNameIdentifier	 next
;	TokenNameSEMICOLON	
next	TokenNameIdentifier	 next
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
r	TokenNameIdentifier	 r
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
remove	TokenNameIdentifier	 remove
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
UnsupportedOperationException	TokenNameIdentifier	 Unsupported Operation Exception
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Iterator that will put in the shared cache array list the selected * resources */	TokenNameCOMMENT_JAVADOC	 Iterator that will put in the shared cache array list the selected resources 
private	TokenNameprivate	
class	TokenNameclass	
CachedIterator	TokenNameIdentifier	 Cached Iterator
implements	TokenNameimplements	
Iterator	TokenNameIdentifier	 Iterator
{	TokenNameLBRACE	
int	TokenNameint	
cusrsor	TokenNameIdentifier	 cusrsor
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
Iterator	TokenNameIdentifier	 Iterator
it	TokenNameIdentifier	 it
;	TokenNameSEMICOLON	
/** * Default constructor * * @param it * the iterator which will provide the resources to put in * cache */	TokenNameCOMMENT_JAVADOC	 Default constructor * @param it the iterator which will provide the resources to put in cache 
public	TokenNamepublic	
CachedIterator	TokenNameIdentifier	 Cached Iterator
(	TokenNameLPAREN	
Iterator	TokenNameIdentifier	 Iterator
it	TokenNameIdentifier	 it
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
it	TokenNameIdentifier	 it
=	TokenNameEQUAL	
it	TokenNameIdentifier	 it
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
boolean	TokenNameboolean	
hasNext	TokenNameIdentifier	 has Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
synchronized	TokenNamesynchronized	
(	TokenNameLPAREN	
cachedResources	TokenNameIdentifier	 cached Resources
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// have we already cached the next entry ? 	TokenNameCOMMENT_LINE	have we already cached the next entry ? 
if	TokenNameif	
(	TokenNameLPAREN	
cachedResources	TokenNameIdentifier	 cached Resources
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>	TokenNameGREATER	
cusrsor	TokenNameIdentifier	 cusrsor
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// does the wrapped iterator any more resource ? 	TokenNameCOMMENT_LINE	does the wrapped iterator any more resource ? 
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
it	TokenNameIdentifier	 it
.	TokenNameDOT	
hasNext	TokenNameIdentifier	 has Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// put in cache the next resource 	TokenNameCOMMENT_LINE	put in cache the next resource 
Resource	TokenNameIdentifier	 Resource
r	TokenNameIdentifier	 r
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Resource	TokenNameIdentifier	 Resource
)	TokenNameRPAREN	
it	TokenNameIdentifier	 it
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
cachedResources	TokenNameIdentifier	 cached Resources
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
r	TokenNameIdentifier	 r
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
Object	TokenNameIdentifier	 Object
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// first check that we have some to deliver 	TokenNameCOMMENT_LINE	first check that we have some to deliver 
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
hasNext	TokenNameIdentifier	 has Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
NoSuchElementException	TokenNameIdentifier	 No Such Element Exception
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
synchronized	TokenNamesynchronized	
(	TokenNameLPAREN	
cachedResources	TokenNameIdentifier	 cached Resources
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// return the cached entry as hasNext should have put one for 	TokenNameCOMMENT_LINE	return the cached entry as hasNext should have put one for 
// this iterator 	TokenNameCOMMENT_LINE	this iterator 
return	TokenNamereturn	
cachedResources	TokenNameIdentifier	 cached Resources
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
cusrsor	TokenNameIdentifier	 cusrsor
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
remove	TokenNameIdentifier	 remove
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
UnsupportedOperationException	TokenNameIdentifier	 Unsupported Operation Exception
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
