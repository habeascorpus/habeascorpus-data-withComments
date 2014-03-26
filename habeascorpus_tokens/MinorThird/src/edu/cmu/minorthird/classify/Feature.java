/* Copyright 2003, Carnegie Mellon, All Rights Reserved */	TokenNameCOMMENT_BLOCK	 Copyright 2003, Carnegie Mellon, All Rights Reserved 
package	TokenNamepackage	
edu	TokenNameIdentifier	 edu
.	TokenNameDOT	
cmu	TokenNameIdentifier	 cmu
.	TokenNameDOT	
minorthird	TokenNameIdentifier	 minorthird
.	TokenNameDOT	
classify	TokenNameIdentifier	 classify
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
Serializable	TokenNameIdentifier	 Serializable
;	TokenNameSEMICOLON	
/** * A name for a feature. Features are hierarchical, so names are * structured: each name is an array of names from the heirarchy. * * @author William Cohen */	TokenNameCOMMENT_JAVADOC	 A name for a feature. Features are hierarchical, so names are structured: each name is an array of names from the heirarchy. * @author William Cohen 
public	TokenNamepublic	
class	TokenNameclass	
Feature	TokenNameIdentifier	 Feature
implements	TokenNameimplements	
Comparable	TokenNameIdentifier	 Comparable
<	TokenNameLESS	
Feature	TokenNameIdentifier	 Feature
>	TokenNameGREATER	
,	TokenNameCOMMA	
Serializable	TokenNameIdentifier	 Serializable
{	TokenNameLBRACE	
static	TokenNamestatic	
public	TokenNamepublic	
final	TokenNamefinal	
long	TokenNamelong	
serialVersionUID	TokenNameIdentifier	 serial Version UID
=	TokenNameEQUAL	
20080115L	TokenNameLongLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
name	TokenNameIdentifier	 name
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
id	TokenNameIdentifier	 id
;	TokenNameSEMICOLON	
/** Create a feature with its feature ID. */	TokenNameCOMMENT_JAVADOC	 Create a feature with its feature ID. 
public	TokenNamepublic	
Feature	TokenNameIdentifier	 Feature
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
int	TokenNameint	
id	TokenNameIdentifier	 id
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
name	TokenNameIdentifier	 name
=	TokenNameEQUAL	
name	TokenNameIdentifier	 name
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
id	TokenNameIdentifier	 id
=	TokenNameEQUAL	
id	TokenNameIdentifier	 id
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Create a feature. */	TokenNameCOMMENT_JAVADOC	 Create a feature. 
public	TokenNamepublic	
Feature	TokenNameIdentifier	 Feature
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Create a feature. The parts of this name are delimited by periods. */	TokenNameCOMMENT_JAVADOC	 Create a feature. The parts of this name are delimited by periods. 
public	TokenNamepublic	
Feature	TokenNameIdentifier	 Feature
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
int	TokenNameint	
id	TokenNameIdentifier	 id
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
.	TokenNameDOT	
trim	TokenNameIdentifier	 trim
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
split	TokenNameIdentifier	 split
(	TokenNameLPAREN	
"\."	TokenNameStringLiteral	\.
)	TokenNameRPAREN	
,	TokenNameCOMMA	
id	TokenNameIdentifier	 id
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Create a feature. The parts of this name are delimited by periods. */	TokenNameCOMMENT_JAVADOC	 Create a feature. The parts of this name are delimited by periods. 
public	TokenNamepublic	
Feature	TokenNameIdentifier	 Feature
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Implements Comparable */	TokenNameCOMMENT_JAVADOC	 Implements Comparable 
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
int	TokenNameint	
compareTo	TokenNameIdentifier	 compare To
(	TokenNameLPAREN	
Feature	TokenNameIdentifier	 Feature
other	TokenNameIdentifier	 other
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
cmp	TokenNameIdentifier	 cmp
=	TokenNameEQUAL	
name	TokenNameIdentifier	 name
.	TokenNameDOT	
length	TokenNameIdentifier	 length
-	TokenNameMINUS	
other	TokenNameIdentifier	 other
.	TokenNameDOT	
name	TokenNameIdentifier	 name
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
cmp	TokenNameIdentifier	 cmp
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
cmp	TokenNameIdentifier	 cmp
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
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
name	TokenNameIdentifier	 name
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
cmp	TokenNameIdentifier	 cmp
=	TokenNameEQUAL	
name	TokenNameIdentifier	 name
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
compareTo	TokenNameIdentifier	 compare To
(	TokenNameLPAREN	
other	TokenNameIdentifier	 other
.	TokenNameDOT	
name	TokenNameIdentifier	 name
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
cmp	TokenNameIdentifier	 cmp
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
cmp	TokenNameIdentifier	 cmp
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** Overrides equals */	TokenNameCOMMENT_JAVADOC	 Overrides equals 
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
boolean	TokenNameboolean	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
object	TokenNameIdentifier	 object
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
object	TokenNameIdentifier	 object
instanceof	TokenNameinstanceof	
Feature	TokenNameIdentifier	 Feature
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
compareTo	TokenNameIdentifier	 compare To
(	TokenNameLPAREN	
(	TokenNameLPAREN	
Feature	TokenNameIdentifier	 Feature
)	TokenNameRPAREN	
object	TokenNameIdentifier	 object
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
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
int	TokenNameint	
hashCode	TokenNameIdentifier	 hash Code
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
h	TokenNameIdentifier	 h
=	TokenNameEQUAL	
783233	TokenNameIntegerLiteral	
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
name	TokenNameIdentifier	 name
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
h	TokenNameIdentifier	 h
=	TokenNameEQUAL	
h	TokenNameIdentifier	 h
^	TokenNameXOR	
name	TokenNameIdentifier	 name
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
hashCode	TokenNameIdentifier	 hash Code
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
h	TokenNameIdentifier	 h
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
if	TokenNameif	
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
.	TokenNameDOT	
length	TokenNameIdentifier	 length
==	TokenNameEQUAL_EQUAL	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
name	TokenNameIdentifier	 name
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
StringBuilder	TokenNameIdentifier	 String Builder
b	TokenNameIdentifier	 b
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuilder	TokenNameIdentifier	 String Builder
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
name	TokenNameIdentifier	 name
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
b	TokenNameIdentifier	 b
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
b	TokenNameIdentifier	 b
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
'.'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
b	TokenNameIdentifier	 b
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
b	TokenNameIdentifier	 b
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
int	TokenNameint	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
name	TokenNameIdentifier	 name
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getPart	TokenNameIdentifier	 get Part
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
name	TokenNameIdentifier	 name
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
name	TokenNameIdentifier	 name
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
int	TokenNameint	
getID	TokenNameIdentifier	 get ID
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
id	TokenNameIdentifier	 id
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * This is used for algorithms which only support a vector of features (such as SVM). * The Factory is used to map each feature to a integer in an increasing by 1 sequence. * The Factory ensures that the same feature name gets the same number within a single run. * * @return id integer for the feature */	TokenNameCOMMENT_JAVADOC	 This is used for algorithms which only support a vector of features (such as SVM). The Factory is used to map each feature to a integer in an increasing by 1 sequence. The Factory ensures that the same feature name gets the same number within a single run. * @return id integer for the feature 
public	TokenNamepublic	
int	TokenNameint	
numericName	TokenNameIdentifier	 numeric Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
id	TokenNameIdentifier	 id
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// static public class Looper extends AbstractLooper<Feature>{ 	TokenNameCOMMENT_LINE	static public class Looper extends AbstractLooper<Feature>{ 
// public Looper(Iterator<Feature> i){super(i);} 	TokenNameCOMMENT_LINE	public Looper(Iterator<Feature> i){super(i);} 
// public Looper(Collection<Feature> c){super(c);} 	TokenNameCOMMENT_LINE	public Looper(Collection<Feature> c){super(c);} 
// public Feature nextFeature(){return next();} 	TokenNameCOMMENT_LINE	public Feature nextFeature(){return next();} 
// } 	TokenNameCOMMENT_LINE	} 
// /** 	TokenNameCOMMENT_LINE	/** 
// * Creates Features. 	TokenNameCOMMENT_LINE	* Creates Features. 
// * This ensures that only a single feature instance exists with a particular name. 	TokenNameCOMMENT_LINE	* This ensures that only a single feature instance exists with a particular name. 
// * 	TokenNameCOMMENT_LINE	* 
// * It also maintains feature->id mappings for numeric feature based learners 	TokenNameCOMMENT_LINE	* It also maintains feature->id mappings for numeric feature based learners 
// * 	TokenNameCOMMENT_LINE	* 
// * @deprecated Use {@link edu.cmu.minorthird.classify.FeatureFactory} instead 	TokenNameCOMMENT_LINE	* @deprecated Use {@link edu.cmu.minorthird.classify.FeatureFactory} instead 
// */ 	TokenNameCOMMENT_LINE	*/ 
// public static class Factory 	TokenNameCOMMENT_LINE	public static class Factory 
// { 	TokenNameCOMMENT_LINE	{ 
// private static THashMap featureSet = new THashMap(); 	TokenNameCOMMENT_LINE	private static THashMap featureSet = new THashMap(); 
// private static TObjectIntHashMap featureIds = new TObjectIntHashMap(); 	TokenNameCOMMENT_LINE	private static TObjectIntHashMap featureIds = new TObjectIntHashMap(); 
// private static int nextID = 1; 	TokenNameCOMMENT_LINE	private static int nextID = 1; 
// public static int getMaxFeatureIndex() { return nextID-1; } 	TokenNameCOMMENT_LINE	public static int getMaxFeatureIndex() { return nextID-1; } 
// /** kludge to keep factory from growing w/o bound for multiple learning problems. */ 	TokenNameCOMMENT_LINE	/** kludge to keep factory from growing w/o bound for multiple learning problems. */ 
// public static void reset() 	TokenNameCOMMENT_LINE	public static void reset() 
// { 	TokenNameCOMMENT_LINE	{ 
// featureSet = new THashMap(); 	TokenNameCOMMENT_LINE	featureSet = new THashMap(); 
// featureIds = new TObjectIntHashMap(); 	TokenNameCOMMENT_LINE	featureIds = new TObjectIntHashMap(); 
// nextID = 1; 	TokenNameCOMMENT_LINE	nextID = 1; 
// } 	TokenNameCOMMENT_LINE	} 
// public static boolean contains(Feature f) 	TokenNameCOMMENT_LINE	public static boolean contains(Feature f) 
// { return featureSet.contains(f); } 	TokenNameCOMMENT_LINE	{ return featureSet.contains(f); } 
// public static Feature getFeature(String fullName) 	TokenNameCOMMENT_LINE	public static Feature getFeature(String fullName) 
// { 	TokenNameCOMMENT_LINE	{ 
// Feature f = new Feature(fullName); 	TokenNameCOMMENT_LINE	Feature f = new Feature(fullName); 
// return getFeature(f); 	TokenNameCOMMENT_LINE	return getFeature(f); 
// } 	TokenNameCOMMENT_LINE	} 
// public static Feature getFeature(String[] name) 	TokenNameCOMMENT_LINE	public static Feature getFeature(String[] name) 
// { 	TokenNameCOMMENT_LINE	{ 
// Feature f = new Feature(name); 	TokenNameCOMMENT_LINE	Feature f = new Feature(name); 
// return getFeature(f); 	TokenNameCOMMENT_LINE	return getFeature(f); 
// } 	TokenNameCOMMENT_LINE	} 
// private static Feature getFeature(Feature f) 	TokenNameCOMMENT_LINE	private static Feature getFeature(Feature f) 
// { 	TokenNameCOMMENT_LINE	{ 
// Feature mapped = (Feature)featureSet.get(f); 	TokenNameCOMMENT_LINE	Feature mapped = (Feature)featureSet.get(f); 
// if (mapped != null) 	TokenNameCOMMENT_LINE	if (mapped != null) 
// return mapped; 	TokenNameCOMMENT_LINE	return mapped; 
// else 	TokenNameCOMMENT_LINE	else 
// { 	TokenNameCOMMENT_LINE	{ 
// featureSet.put(f, f); 	TokenNameCOMMENT_LINE	featureSet.put(f, f); 
// return f; 	TokenNameCOMMENT_LINE	return f; 
// } 	TokenNameCOMMENT_LINE	} 
// } 	TokenNameCOMMENT_LINE	} 
// /** 	TokenNameCOMMENT_LINE	/** 
// * @deprecated Use {@link edu.cmu.minorthird.classify.FeatureIdFactory} instead. 	TokenNameCOMMENT_LINE	* @deprecated Use {@link edu.cmu.minorthird.classify.FeatureIdFactory} instead. 
// */ 	TokenNameCOMMENT_LINE	*/ 
// public static int getID(Feature feature) 	TokenNameCOMMENT_LINE	public static int getID(Feature feature) 
// { 	TokenNameCOMMENT_LINE	{ 
// int id = featureIds.get(feature); 	TokenNameCOMMENT_LINE	int id = featureIds.get(feature); 
// if (id <= 0) 	TokenNameCOMMENT_LINE	if (id <= 0) 
// { 	TokenNameCOMMENT_LINE	{ 
// featureIds.put(feature, nextID); 	TokenNameCOMMENT_LINE	featureIds.put(feature, nextID); 
// id = nextID++; 	TokenNameCOMMENT_LINE	id = nextID++; 
// } 	TokenNameCOMMENT_LINE	} 
// return id; 	TokenNameCOMMENT_LINE	return id; 
// } 	TokenNameCOMMENT_LINE	} 
// } 	TokenNameCOMMENT_LINE	} 
}	TokenNameRBRACE	
