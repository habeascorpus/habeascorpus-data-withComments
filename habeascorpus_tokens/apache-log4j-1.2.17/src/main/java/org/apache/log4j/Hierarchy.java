/* * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
// WARNING This class MUST not have references to the Category or 	TokenNameCOMMENT_LINE	WARNING This class MUST not have references to the Category or 
// WARNING RootCategory classes in its static initiliazation neither 	TokenNameCOMMENT_LINE	WARNING RootCategory classes in its static initiliazation neither 
// WARNING directly nor indirectly. 	TokenNameCOMMENT_LINE	WARNING directly nor indirectly. 
// Contributors: 	TokenNameCOMMENT_LINE	Contributors: 
// Luke Blanshard <luke@quiq.com> 	TokenNameCOMMENT_LINE	Luke Blanshard <luke@quiq.com> 
// Mario Schomburg - IBM Global Services/Germany 	TokenNameCOMMENT_LINE	Mario Schomburg - IBM Global Services/Germany 
// Anders Kristensen 	TokenNameCOMMENT_LINE	Anders Kristensen 
// Igor Poteryaev 	TokenNameCOMMENT_LINE	Igor Poteryaev 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
log4j	TokenNameIdentifier	 log4j
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Hashtable	TokenNameIdentifier	 Hashtable
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Enumeration	TokenNameIdentifier	 Enumeration
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Vector	TokenNameIdentifier	 Vector
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
log4j	TokenNameIdentifier	 log4j
.	TokenNameDOT	
spi	TokenNameIdentifier	 spi
.	TokenNameDOT	
LoggerFactory	TokenNameIdentifier	 Logger Factory
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
log4j	TokenNameIdentifier	 log4j
.	TokenNameDOT	
spi	TokenNameIdentifier	 spi
.	TokenNameDOT	
HierarchyEventListener	TokenNameIdentifier	 Hierarchy Event Listener
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
log4j	TokenNameIdentifier	 log4j
.	TokenNameDOT	
spi	TokenNameIdentifier	 spi
.	TokenNameDOT	
LoggerRepository	TokenNameIdentifier	 Logger Repository
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
log4j	TokenNameIdentifier	 log4j
.	TokenNameDOT	
spi	TokenNameIdentifier	 spi
.	TokenNameDOT	
RendererSupport	TokenNameIdentifier	 Renderer Support
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
log4j	TokenNameIdentifier	 log4j
.	TokenNameDOT	
or	TokenNameIdentifier	 or
.	TokenNameDOT	
RendererMap	TokenNameIdentifier	 Renderer Map
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
log4j	TokenNameIdentifier	 log4j
.	TokenNameDOT	
or	TokenNameIdentifier	 or
.	TokenNameDOT	
ObjectRenderer	TokenNameIdentifier	 Object Renderer
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
log4j	TokenNameIdentifier	 log4j
.	TokenNameDOT	
helpers	TokenNameIdentifier	 helpers
.	TokenNameDOT	
LogLog	TokenNameIdentifier	 Log Log
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
log4j	TokenNameIdentifier	 log4j
.	TokenNameDOT	
spi	TokenNameIdentifier	 spi
.	TokenNameDOT	
ThrowableRendererSupport	TokenNameIdentifier	 Throwable Renderer Support
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
log4j	TokenNameIdentifier	 log4j
.	TokenNameDOT	
spi	TokenNameIdentifier	 spi
.	TokenNameDOT	
ThrowableRenderer	TokenNameIdentifier	 Throwable Renderer
;	TokenNameSEMICOLON	
/** This class is specialized in retrieving loggers by name and also maintaining the logger hierarchy. <p><em>The casual user does not have to deal with this class directly.</em> <p>The structure of the logger hierarchy is maintained by the {@link #getLogger} method. The hierarchy is such that children link to their parent but parents do not have any pointers to their children. Moreover, loggers can be instantiated in any order, in particular descendant before ancestor. <p>In case a descendant is created before a particular ancestor, then it creates a provision node for the ancestor and adds itself to the provision node. Other descendants of the same ancestor add themselves to the previously created provision node. @author Ceki G&uuml;lc&uuml; */	TokenNameCOMMENT_JAVADOC	 This class is specialized in retrieving loggers by name and also maintaining the logger hierarchy. <p><em>The casual user does not have to deal with this class directly.</em> <p>The structure of the logger hierarchy is maintained by the {@link #getLogger} method. The hierarchy is such that children link to their parent but parents do not have any pointers to their children. Moreover, loggers can be instantiated in any order, in particular descendant before ancestor. <p>In case a descendant is created before a particular ancestor, then it creates a provision node for the ancestor and adds itself to the provision node. Other descendants of the same ancestor add themselves to the previously created provision node. @author Ceki G&uuml;lc&uuml; 
public	TokenNamepublic	
class	TokenNameclass	
Hierarchy	TokenNameIdentifier	 Hierarchy
implements	TokenNameimplements	
LoggerRepository	TokenNameIdentifier	 Logger Repository
,	TokenNameCOMMA	
RendererSupport	TokenNameIdentifier	 Renderer Support
,	TokenNameCOMMA	
ThrowableRendererSupport	TokenNameIdentifier	 Throwable Renderer Support
{	TokenNameLBRACE	
private	TokenNameprivate	
LoggerFactory	TokenNameIdentifier	 Logger Factory
defaultFactory	TokenNameIdentifier	 default Factory
;	TokenNameSEMICOLON	
private	TokenNameprivate	
Vector	TokenNameIdentifier	 Vector
listeners	TokenNameIdentifier	 listeners
;	TokenNameSEMICOLON	
Hashtable	TokenNameIdentifier	 Hashtable
ht	TokenNameIdentifier	 ht
;	TokenNameSEMICOLON	
Logger	TokenNameIdentifier	 Logger
root	TokenNameIdentifier	 root
;	TokenNameSEMICOLON	
RendererMap	TokenNameIdentifier	 Renderer Map
rendererMap	TokenNameIdentifier	 renderer Map
;	TokenNameSEMICOLON	
int	TokenNameint	
thresholdInt	TokenNameIdentifier	 threshold Int
;	TokenNameSEMICOLON	
Level	TokenNameIdentifier	 Level
threshold	TokenNameIdentifier	 threshold
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
emittedNoAppenderWarning	TokenNameIdentifier	 emitted No Appender Warning
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
emittedNoResourceBundleWarning	TokenNameIdentifier	 emitted No Resource Bundle Warning
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
ThrowableRenderer	TokenNameIdentifier	 Throwable Renderer
throwableRenderer	TokenNameIdentifier	 throwable Renderer
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
/** Create a new logger hierarchy. @param root The root of the new hierarchy. */	TokenNameCOMMENT_JAVADOC	 Create a new logger hierarchy. @param root The root of the new hierarchy. 
public	TokenNamepublic	
Hierarchy	TokenNameIdentifier	 Hierarchy
(	TokenNameLPAREN	
Logger	TokenNameIdentifier	 Logger
root	TokenNameIdentifier	 root
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ht	TokenNameIdentifier	 ht
=	TokenNameEQUAL	
new	TokenNamenew	
Hashtable	TokenNameIdentifier	 Hashtable
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
listeners	TokenNameIdentifier	 listeners
=	TokenNameEQUAL	
new	TokenNamenew	
Vector	TokenNameIdentifier	 Vector
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
root	TokenNameIdentifier	 root
=	TokenNameEQUAL	
root	TokenNameIdentifier	 root
;	TokenNameSEMICOLON	
// Enable all level levels by default. 	TokenNameCOMMENT_LINE	Enable all level levels by default. 
setThreshold	TokenNameIdentifier	 set Threshold
(	TokenNameLPAREN	
Level	TokenNameIdentifier	 Level
.	TokenNameDOT	
ALL	TokenNameIdentifier	 ALL
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
root	TokenNameIdentifier	 root
.	TokenNameDOT	
setHierarchy	TokenNameIdentifier	 set Hierarchy
(	TokenNameLPAREN	
this	TokenNamethis	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
rendererMap	TokenNameIdentifier	 renderer Map
=	TokenNameEQUAL	
new	TokenNamenew	
RendererMap	TokenNameIdentifier	 Renderer Map
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
defaultFactory	TokenNameIdentifier	 default Factory
=	TokenNameEQUAL	
new	TokenNamenew	
DefaultCategoryFactory	TokenNameIdentifier	 Default Category Factory
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Add an object renderer for a specific class. */	TokenNameCOMMENT_JAVADOC	 Add an object renderer for a specific class. 
public	TokenNamepublic	
void	TokenNamevoid	
addRenderer	TokenNameIdentifier	 add Renderer
(	TokenNameLPAREN	
Class	TokenNameIdentifier	 Class
classToRender	TokenNameIdentifier	 class To Render
,	TokenNameCOMMA	
ObjectRenderer	TokenNameIdentifier	 Object Renderer
or	TokenNameIdentifier	 or
)	TokenNameRPAREN	
{	TokenNameLBRACE	
rendererMap	TokenNameIdentifier	 renderer Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
classToRender	TokenNameIdentifier	 class To Render
,	TokenNameCOMMA	
or	TokenNameIdentifier	 or
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
addHierarchyEventListener	TokenNameIdentifier	 add Hierarchy Event Listener
(	TokenNameLPAREN	
HierarchyEventListener	TokenNameIdentifier	 Hierarchy Event Listener
listener	TokenNameIdentifier	 listener
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
listeners	TokenNameIdentifier	 listeners
.	TokenNameDOT	
contains	TokenNameIdentifier	 contains
(	TokenNameLPAREN	
listener	TokenNameIdentifier	 listener
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
LogLog	TokenNameIdentifier	 Log Log
.	TokenNameDOT	
warn	TokenNameIdentifier	 warn
(	TokenNameLPAREN	
"Ignoring attempt to add an existent listener."	TokenNameStringLiteral	Ignoring attempt to add an existent listener.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
listeners	TokenNameIdentifier	 listeners
.	TokenNameDOT	
addElement	TokenNameIdentifier	 add Element
(	TokenNameLPAREN	
listener	TokenNameIdentifier	 listener
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** This call will clear all logger definitions from the internal hashtable. Invoking this method will irrevocably mess up the logger hierarchy. <p>You should <em>really</em> know what you are doing before invoking this method. @since 0.9.0 */	TokenNameCOMMENT_JAVADOC	 This call will clear all logger definitions from the internal hashtable. Invoking this method will irrevocably mess up the logger hierarchy. <p>You should <em>really</em> know what you are doing before invoking this method. @since 0.9.0 
public	TokenNamepublic	
void	TokenNamevoid	
clear	TokenNameIdentifier	 clear
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
//System.out.println("\n\nAbout to clear internal hash table."); 	TokenNameCOMMENT_LINE	System.out.println("\n\nAbout to clear internal hash table."); 
ht	TokenNameIdentifier	 ht
.	TokenNameDOT	
clear	TokenNameIdentifier	 clear
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
emitNoAppenderWarning	TokenNameIdentifier	 emit No Appender Warning
(	TokenNameLPAREN	
Category	TokenNameIdentifier	 Category
cat	TokenNameIdentifier	 cat
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// No appenders in hierarchy, warn user only once. 	TokenNameCOMMENT_LINE	No appenders in hierarchy, warn user only once. 
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
this	TokenNamethis	
.	TokenNameDOT	
emittedNoAppenderWarning	TokenNameIdentifier	 emitted No Appender Warning
)	TokenNameRPAREN	
{	TokenNameLBRACE	
LogLog	TokenNameIdentifier	 Log Log
.	TokenNameDOT	
warn	TokenNameIdentifier	 warn
(	TokenNameLPAREN	
"No appenders could be found for logger ("	TokenNameStringLiteral	No appenders could be found for logger (
+	TokenNamePLUS	
cat	TokenNameIdentifier	 cat
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
")."	TokenNameStringLiteral	).
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
LogLog	TokenNameIdentifier	 Log Log
.	TokenNameDOT	
warn	TokenNameIdentifier	 warn
(	TokenNameLPAREN	
"Please initialize the log4j system properly."	TokenNameStringLiteral	Please initialize the log4j system properly.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
LogLog	TokenNameIdentifier	 Log Log
.	TokenNameDOT	
warn	TokenNameIdentifier	 warn
(	TokenNameLPAREN	
"See http://logging.apache.org/log4j/1.2/faq.html#noconfig for more info."	TokenNameStringLiteral	See http://logging.apache.org/log4j/1.2/faq.html#noconfig for more info.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
emittedNoAppenderWarning	TokenNameIdentifier	 emitted No Appender Warning
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** Check if the named logger exists in the hierarchy. If so return its reference, otherwise returns <code>null</code>. @param name The name of the logger to search for. */	TokenNameCOMMENT_JAVADOC	 Check if the named logger exists in the hierarchy. If so return its reference, otherwise returns <code>null</code>. @param name The name of the logger to search for. 
public	TokenNamepublic	
Logger	TokenNameIdentifier	 Logger
exists	TokenNameIdentifier	 exists
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Object	TokenNameIdentifier	 Object
o	TokenNameIdentifier	 o
=	TokenNameEQUAL	
ht	TokenNameIdentifier	 ht
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
new	TokenNamenew	
CategoryKey	TokenNameIdentifier	 Category Key
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
o	TokenNameIdentifier	 o
instanceof	TokenNameinstanceof	
Logger	TokenNameIdentifier	 Logger
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
Logger	TokenNameIdentifier	 Logger
)	TokenNameRPAREN	
o	TokenNameIdentifier	 o
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** The string form of {@link #setThreshold(Level)}. */	TokenNameCOMMENT_JAVADOC	 The string form of {@link #setThreshold(Level)}. 
public	TokenNamepublic	
void	TokenNamevoid	
setThreshold	TokenNameIdentifier	 set Threshold
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
levelStr	TokenNameIdentifier	 level Str
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Level	TokenNameIdentifier	 Level
l	TokenNameIdentifier	 l
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Level	TokenNameIdentifier	 Level
)	TokenNameRPAREN	
Level	TokenNameIdentifier	 Level
.	TokenNameDOT	
toLevel	TokenNameIdentifier	 to Level
(	TokenNameLPAREN	
levelStr	TokenNameIdentifier	 level Str
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
l	TokenNameIdentifier	 l
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
setThreshold	TokenNameIdentifier	 set Threshold
(	TokenNameLPAREN	
l	TokenNameIdentifier	 l
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
LogLog	TokenNameIdentifier	 Log Log
.	TokenNameDOT	
warn	TokenNameIdentifier	 warn
(	TokenNameLPAREN	
"Could not convert ["	TokenNameStringLiteral	Could not convert [
+	TokenNamePLUS	
levelStr	TokenNameIdentifier	 level Str
+	TokenNamePLUS	
"] to Level."	TokenNameStringLiteral	] to Level.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** Enable logging for logging requests with level <code>l</code> or higher. By default all levels are enabled. @param l The minimum level for which logging requests are sent to their appenders. */	TokenNameCOMMENT_JAVADOC	 Enable logging for logging requests with level <code>l</code> or higher. By default all levels are enabled. @param l The minimum level for which logging requests are sent to their appenders. 
public	TokenNamepublic	
void	TokenNamevoid	
setThreshold	TokenNameIdentifier	 set Threshold
(	TokenNameLPAREN	
Level	TokenNameIdentifier	 Level
l	TokenNameIdentifier	 l
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
l	TokenNameIdentifier	 l
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
thresholdInt	TokenNameIdentifier	 threshold Int
=	TokenNameEQUAL	
l	TokenNameIdentifier	 l
.	TokenNameDOT	
level	TokenNameIdentifier	 level
;	TokenNameSEMICOLON	
threshold	TokenNameIdentifier	 threshold
=	TokenNameEQUAL	
l	TokenNameIdentifier	 l
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
fireAddAppenderEvent	TokenNameIdentifier	 fire Add Appender Event
(	TokenNameLPAREN	
Category	TokenNameIdentifier	 Category
logger	TokenNameIdentifier	 logger
,	TokenNameCOMMA	
Appender	TokenNameIdentifier	 Appender
appender	TokenNameIdentifier	 appender
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
listeners	TokenNameIdentifier	 listeners
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
size	TokenNameIdentifier	 size
=	TokenNameEQUAL	
listeners	TokenNameIdentifier	 listeners
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
HierarchyEventListener	TokenNameIdentifier	 Hierarchy Event Listener
listener	TokenNameIdentifier	 listener
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
size	TokenNameIdentifier	 size
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
listener	TokenNameIdentifier	 listener
=	TokenNameEQUAL	
(	TokenNameLPAREN	
HierarchyEventListener	TokenNameIdentifier	 Hierarchy Event Listener
)	TokenNameRPAREN	
listeners	TokenNameIdentifier	 listeners
.	TokenNameDOT	
elementAt	TokenNameIdentifier	 element At
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
listener	TokenNameIdentifier	 listener
.	TokenNameDOT	
addAppenderEvent	TokenNameIdentifier	 add Appender Event
(	TokenNameLPAREN	
logger	TokenNameIdentifier	 logger
,	TokenNameCOMMA	
appender	TokenNameIdentifier	 appender
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
void	TokenNamevoid	
fireRemoveAppenderEvent	TokenNameIdentifier	 fire Remove Appender Event
(	TokenNameLPAREN	
Category	TokenNameIdentifier	 Category
logger	TokenNameIdentifier	 logger
,	TokenNameCOMMA	
Appender	TokenNameIdentifier	 Appender
appender	TokenNameIdentifier	 appender
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
listeners	TokenNameIdentifier	 listeners
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
size	TokenNameIdentifier	 size
=	TokenNameEQUAL	
listeners	TokenNameIdentifier	 listeners
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
HierarchyEventListener	TokenNameIdentifier	 Hierarchy Event Listener
listener	TokenNameIdentifier	 listener
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
size	TokenNameIdentifier	 size
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
listener	TokenNameIdentifier	 listener
=	TokenNameEQUAL	
(	TokenNameLPAREN	
HierarchyEventListener	TokenNameIdentifier	 Hierarchy Event Listener
)	TokenNameRPAREN	
listeners	TokenNameIdentifier	 listeners
.	TokenNameDOT	
elementAt	TokenNameIdentifier	 element At
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
listener	TokenNameIdentifier	 listener
.	TokenNameDOT	
removeAppenderEvent	TokenNameIdentifier	 remove Appender Event
(	TokenNameLPAREN	
logger	TokenNameIdentifier	 logger
,	TokenNameCOMMA	
appender	TokenNameIdentifier	 appender
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** Returns a {@link Level} representation of the <code>enable</code> state. @since 1.2 */	TokenNameCOMMENT_JAVADOC	 Returns a {@link Level} representation of the <code>enable</code> state. @since 1.2 
public	TokenNamepublic	
Level	TokenNameIdentifier	 Level
getThreshold	TokenNameIdentifier	 get Threshold
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
threshold	TokenNameIdentifier	 threshold
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Returns an integer representation of the this repository's threshold. @since 1.2 */	TokenNameCOMMENT_JAVADOC	 Returns an integer representation of the this repository's threshold. @since 1.2 
//public 	TokenNameCOMMENT_LINE	public 
//int getThresholdInt() { 	TokenNameCOMMENT_LINE	int getThresholdInt() { 
// return thresholdInt; 	TokenNameCOMMENT_LINE	return thresholdInt; 
//} 	TokenNameCOMMENT_LINE	} 
/** Return a new logger instance named as the first parameter using the default factory. <p>If a logger of that name already exists, then it will be returned. Otherwise, a new logger will be instantiated and then linked with its existing ancestors as well as children. @param name The name of the logger to retrieve. */	TokenNameCOMMENT_JAVADOC	 Return a new logger instance named as the first parameter using the default factory. <p>If a logger of that name already exists, then it will be returned. Otherwise, a new logger will be instantiated and then linked with its existing ancestors as well as children. @param name The name of the logger to retrieve. 
public	TokenNamepublic	
Logger	TokenNameIdentifier	 Logger
getLogger	TokenNameIdentifier	 get Logger
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
getLogger	TokenNameIdentifier	 get Logger
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
defaultFactory	TokenNameIdentifier	 default Factory
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Return a new logger instance named as the first parameter using <code>factory</code>. <p>If a logger of that name already exists, then it will be returned. Otherwise, a new logger will be instantiated by the <code>factory</code> parameter and linked with its existing ancestors as well as children. @param name The name of the logger to retrieve. @param factory The factory that will make the new logger instance. */	TokenNameCOMMENT_JAVADOC	 Return a new logger instance named as the first parameter using <code>factory</code>. <p>If a logger of that name already exists, then it will be returned. Otherwise, a new logger will be instantiated by the <code>factory</code> parameter and linked with its existing ancestors as well as children. @param name The name of the logger to retrieve. @param factory The factory that will make the new logger instance. 
public	TokenNamepublic	
Logger	TokenNameIdentifier	 Logger
getLogger	TokenNameIdentifier	 get Logger
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
LoggerFactory	TokenNameIdentifier	 Logger Factory
factory	TokenNameIdentifier	 factory
)	TokenNameRPAREN	
{	TokenNameLBRACE	
//System.out.println("getInstance("+name+") called."); 	TokenNameCOMMENT_LINE	System.out.println("getInstance("+name+") called."); 
CategoryKey	TokenNameIdentifier	 Category Key
key	TokenNameIdentifier	 key
=	TokenNameEQUAL	
new	TokenNamenew	
CategoryKey	TokenNameIdentifier	 Category Key
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Synchronize to prevent write conflicts. Read conflicts (in 	TokenNameCOMMENT_LINE	Synchronize to prevent write conflicts. Read conflicts (in 
// getChainedLevel method) are possible only if variable 	TokenNameCOMMENT_LINE	getChainedLevel method) are possible only if variable 
// assignments are non-atomic. 	TokenNameCOMMENT_LINE	assignments are non-atomic. 
Logger	TokenNameIdentifier	 Logger
logger	TokenNameIdentifier	 logger
;	TokenNameSEMICOLON	
synchronized	TokenNamesynchronized	
(	TokenNameLPAREN	
ht	TokenNameIdentifier	 ht
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Object	TokenNameIdentifier	 Object
o	TokenNameIdentifier	 o
=	TokenNameEQUAL	
ht	TokenNameIdentifier	 ht
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
o	TokenNameIdentifier	 o
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
logger	TokenNameIdentifier	 logger
=	TokenNameEQUAL	
factory	TokenNameIdentifier	 factory
.	TokenNameDOT	
makeNewLoggerInstance	TokenNameIdentifier	 make New Logger Instance
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
logger	TokenNameIdentifier	 logger
.	TokenNameDOT	
setHierarchy	TokenNameIdentifier	 set Hierarchy
(	TokenNameLPAREN	
this	TokenNamethis	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ht	TokenNameIdentifier	 ht
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
,	TokenNameCOMMA	
logger	TokenNameIdentifier	 logger
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
updateParents	TokenNameIdentifier	 update Parents
(	TokenNameLPAREN	
logger	TokenNameIdentifier	 logger
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
logger	TokenNameIdentifier	 logger
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
o	TokenNameIdentifier	 o
instanceof	TokenNameinstanceof	
Logger	TokenNameIdentifier	 Logger
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
Logger	TokenNameIdentifier	 Logger
)	TokenNameRPAREN	
o	TokenNameIdentifier	 o
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
o	TokenNameIdentifier	 o
instanceof	TokenNameinstanceof	
ProvisionNode	TokenNameIdentifier	 Provision Node
)	TokenNameRPAREN	
{	TokenNameLBRACE	
//System.out.println("("+name+") ht.get(this) returned ProvisionNode"); 	TokenNameCOMMENT_LINE	System.out.println("("+name+") ht.get(this) returned ProvisionNode"); 
logger	TokenNameIdentifier	 logger
=	TokenNameEQUAL	
factory	TokenNameIdentifier	 factory
.	TokenNameDOT	
makeNewLoggerInstance	TokenNameIdentifier	 make New Logger Instance
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
logger	TokenNameIdentifier	 logger
.	TokenNameDOT	
setHierarchy	TokenNameIdentifier	 set Hierarchy
(	TokenNameLPAREN	
this	TokenNamethis	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ht	TokenNameIdentifier	 ht
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
,	TokenNameCOMMA	
logger	TokenNameIdentifier	 logger
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
updateChildren	TokenNameIdentifier	 update Children
(	TokenNameLPAREN	
(	TokenNameLPAREN	
ProvisionNode	TokenNameIdentifier	 Provision Node
)	TokenNameRPAREN	
o	TokenNameIdentifier	 o
,	TokenNameCOMMA	
logger	TokenNameIdentifier	 logger
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
updateParents	TokenNameIdentifier	 update Parents
(	TokenNameLPAREN	
logger	TokenNameIdentifier	 logger
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
logger	TokenNameIdentifier	 logger
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// It should be impossible to arrive here 	TokenNameCOMMENT_LINE	It should be impossible to arrive here 
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
// but let's keep the compiler happy. 	TokenNameCOMMENT_LINE	but let's keep the compiler happy. 
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** Returns all the currently defined categories in this hierarchy as an {@link java.util.Enumeration Enumeration}. <p>The root logger is <em>not</em> included in the returned {@link Enumeration}. */	TokenNameCOMMENT_JAVADOC	 Returns all the currently defined categories in this hierarchy as an {@link java.util.Enumeration Enumeration}. <p>The root logger is <em>not</em> included in the returned {@link Enumeration}. 
public	TokenNamepublic	
Enumeration	TokenNameIdentifier	 Enumeration
getCurrentLoggers	TokenNameIdentifier	 get Current Loggers
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// The accumlation in v is necessary because not all elements in 	TokenNameCOMMENT_LINE	The accumlation in v is necessary because not all elements in 
// ht are Logger objects as there might be some ProvisionNodes 	TokenNameCOMMENT_LINE	ht are Logger objects as there might be some ProvisionNodes 
// as well. 	TokenNameCOMMENT_LINE	as well. 
Vector	TokenNameIdentifier	 Vector
v	TokenNameIdentifier	 v
=	TokenNameEQUAL	
new	TokenNamenew	
Vector	TokenNameIdentifier	 Vector
(	TokenNameLPAREN	
ht	TokenNameIdentifier	 ht
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Enumeration	TokenNameIdentifier	 Enumeration
elems	TokenNameIdentifier	 elems
=	TokenNameEQUAL	
ht	TokenNameIdentifier	 ht
.	TokenNameDOT	
elements	TokenNameIdentifier	 elements
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
elems	TokenNameIdentifier	 elems
.	TokenNameDOT	
hasMoreElements	TokenNameIdentifier	 has More Elements
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Object	TokenNameIdentifier	 Object
o	TokenNameIdentifier	 o
=	TokenNameEQUAL	
elems	TokenNameIdentifier	 elems
.	TokenNameDOT	
nextElement	TokenNameIdentifier	 next Element
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
o	TokenNameIdentifier	 o
instanceof	TokenNameinstanceof	
Logger	TokenNameIdentifier	 Logger
)	TokenNameRPAREN	
{	TokenNameLBRACE	
v	TokenNameIdentifier	 v
.	TokenNameDOT	
addElement	TokenNameIdentifier	 add Element
(	TokenNameLPAREN	
o	TokenNameIdentifier	 o
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
v	TokenNameIdentifier	 v
.	TokenNameDOT	
elements	TokenNameIdentifier	 elements
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** @deprecated Please use {@link #getCurrentLoggers} instead. */	TokenNameCOMMENT_JAVADOC	 @deprecated Please use {@link #getCurrentLoggers} instead. 
public	TokenNamepublic	
Enumeration	TokenNameIdentifier	 Enumeration
getCurrentCategories	TokenNameIdentifier	 get Current Categories
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
getCurrentLoggers	TokenNameIdentifier	 get Current Loggers
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Get the renderer map for this hierarchy. */	TokenNameCOMMENT_JAVADOC	 Get the renderer map for this hierarchy. 
public	TokenNamepublic	
RendererMap	TokenNameIdentifier	 Renderer Map
getRendererMap	TokenNameIdentifier	 get Renderer Map
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
rendererMap	TokenNameIdentifier	 renderer Map
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Get the root of this hierarchy. @since 0.9.0 */	TokenNameCOMMENT_JAVADOC	 Get the root of this hierarchy. @since 0.9.0 
public	TokenNamepublic	
Logger	TokenNameIdentifier	 Logger
getRootLogger	TokenNameIdentifier	 get Root Logger
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
root	TokenNameIdentifier	 root
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** This method will return <code>true</code> if this repository is disabled for <code>level</code> object passed as parameter and <code>false</code> otherwise. See also the {@link #setThreshold(Level) threshold} emthod. */	TokenNameCOMMENT_JAVADOC	 This method will return <code>true</code> if this repository is disabled for <code>level</code> object passed as parameter and <code>false</code> otherwise. See also the {@link #setThreshold(Level) threshold} emthod. 
public	TokenNamepublic	
boolean	TokenNameboolean	
isDisabled	TokenNameIdentifier	 is Disabled
(	TokenNameLPAREN	
int	TokenNameint	
level	TokenNameIdentifier	 level
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
thresholdInt	TokenNameIdentifier	 threshold Int
>	TokenNameGREATER	
level	TokenNameIdentifier	 level
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** @deprecated Deprecated with no replacement. */	TokenNameCOMMENT_JAVADOC	 @deprecated Deprecated with no replacement. 
public	TokenNamepublic	
void	TokenNamevoid	
overrideAsNeeded	TokenNameIdentifier	 override As Needed
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
override	TokenNameIdentifier	 override
)	TokenNameRPAREN	
{	TokenNameLBRACE	
LogLog	TokenNameIdentifier	 Log Log
.	TokenNameDOT	
warn	TokenNameIdentifier	 warn
(	TokenNameLPAREN	
"The Hiearchy.overrideAsNeeded method has been deprecated."	TokenNameStringLiteral	The Hiearchy.overrideAsNeeded method has been deprecated.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Reset all values contained in this hierarchy instance to their default. This removes all appenders from all categories, sets the level of all non-root categories to <code>null</code>, sets their additivity flag to <code>true</code> and sets the level of the root logger to {@link Level#DEBUG DEBUG}. Moreover, message disabling is set its default "off" value. <p>Existing categories are not removed. They are just reset. <p>This method should be used sparingly and with care as it will block all logging until it is completed.</p> @since 0.8.5 */	TokenNameCOMMENT_JAVADOC	 Reset all values contained in this hierarchy instance to their default. This removes all appenders from all categories, sets the level of all non-root categories to <code>null</code>, sets their additivity flag to <code>true</code> and sets the level of the root logger to {@link Level#DEBUG DEBUG}. Moreover, message disabling is set its default "off" value. <p>Existing categories are not removed. They are just reset. <p>This method should be used sparingly and with care as it will block all logging until it is completed.</p> @since 0.8.5 
public	TokenNamepublic	
void	TokenNamevoid	
resetConfiguration	TokenNameIdentifier	 reset Configuration
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
getRootLogger	TokenNameIdentifier	 get Root Logger
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
setLevel	TokenNameIdentifier	 set Level
(	TokenNameLPAREN	
(	TokenNameLPAREN	
Level	TokenNameIdentifier	 Level
)	TokenNameRPAREN	
Level	TokenNameIdentifier	 Level
.	TokenNameDOT	
DEBUG	TokenNameIdentifier	 DEBUG
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
root	TokenNameIdentifier	 root
.	TokenNameDOT	
setResourceBundle	TokenNameIdentifier	 set Resource Bundle
(	TokenNameLPAREN	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
setThreshold	TokenNameIdentifier	 set Threshold
(	TokenNameLPAREN	
Level	TokenNameIdentifier	 Level
.	TokenNameDOT	
ALL	TokenNameIdentifier	 ALL
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// the synchronization is needed to prevent JDK 1.2.x hashtable 	TokenNameCOMMENT_LINE	the synchronization is needed to prevent JDK 1.2.x hashtable 
// surprises 	TokenNameCOMMENT_LINE	surprises 
synchronized	TokenNamesynchronized	
(	TokenNameLPAREN	
ht	TokenNameIdentifier	 ht
)	TokenNameRPAREN	
{	TokenNameLBRACE	
shutdown	TokenNameIdentifier	 shutdown
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// nested locks are OK 	TokenNameCOMMENT_LINE	nested locks are OK 
Enumeration	TokenNameIdentifier	 Enumeration
cats	TokenNameIdentifier	 cats
=	TokenNameEQUAL	
getCurrentLoggers	TokenNameIdentifier	 get Current Loggers
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
cats	TokenNameIdentifier	 cats
.	TokenNameDOT	
hasMoreElements	TokenNameIdentifier	 has More Elements
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Logger	TokenNameIdentifier	 Logger
c	TokenNameIdentifier	 c
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Logger	TokenNameIdentifier	 Logger
)	TokenNameRPAREN	
cats	TokenNameIdentifier	 cats
.	TokenNameDOT	
nextElement	TokenNameIdentifier	 next Element
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
c	TokenNameIdentifier	 c
.	TokenNameDOT	
setLevel	TokenNameIdentifier	 set Level
(	TokenNameLPAREN	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
c	TokenNameIdentifier	 c
.	TokenNameDOT	
setAdditivity	TokenNameIdentifier	 set Additivity
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
c	TokenNameIdentifier	 c
.	TokenNameDOT	
setResourceBundle	TokenNameIdentifier	 set Resource Bundle
(	TokenNameLPAREN	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
rendererMap	TokenNameIdentifier	 renderer Map
.	TokenNameDOT	
clear	TokenNameIdentifier	 clear
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
throwableRenderer	TokenNameIdentifier	 throwable Renderer
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Does nothing. @deprecated Deprecated with no replacement. */	TokenNameCOMMENT_JAVADOC	 Does nothing. @deprecated Deprecated with no replacement. 
public	TokenNamepublic	
void	TokenNamevoid	
setDisableOverride	TokenNameIdentifier	 set Disable Override
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
override	TokenNameIdentifier	 override
)	TokenNameRPAREN	
{	TokenNameLBRACE	
LogLog	TokenNameIdentifier	 Log Log
.	TokenNameDOT	
warn	TokenNameIdentifier	 warn
(	TokenNameLPAREN	
"The Hiearchy.setDisableOverride method has been deprecated."	TokenNameStringLiteral	The Hiearchy.setDisableOverride method has been deprecated.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Used by subclasses to add a renderer to the hierarchy passed as parameter. */	TokenNameCOMMENT_JAVADOC	 Used by subclasses to add a renderer to the hierarchy passed as parameter. 
public	TokenNamepublic	
void	TokenNamevoid	
setRenderer	TokenNameIdentifier	 set Renderer
(	TokenNameLPAREN	
Class	TokenNameIdentifier	 Class
renderedClass	TokenNameIdentifier	 rendered Class
,	TokenNameCOMMA	
ObjectRenderer	TokenNameIdentifier	 Object Renderer
renderer	TokenNameIdentifier	 renderer
)	TokenNameRPAREN	
{	TokenNameLBRACE	
rendererMap	TokenNameIdentifier	 renderer Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
renderedClass	TokenNameIdentifier	 rendered Class
,	TokenNameCOMMA	
renderer	TokenNameIdentifier	 renderer
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * {@inheritDoc} */	TokenNameCOMMENT_JAVADOC	 {@inheritDoc} 
public	TokenNamepublic	
void	TokenNamevoid	
setThrowableRenderer	TokenNameIdentifier	 set Throwable Renderer
(	TokenNameLPAREN	
final	TokenNamefinal	
ThrowableRenderer	TokenNameIdentifier	 Throwable Renderer
renderer	TokenNameIdentifier	 renderer
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throwableRenderer	TokenNameIdentifier	 throwable Renderer
=	TokenNameEQUAL	
renderer	TokenNameIdentifier	 renderer
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * {@inheritDoc} */	TokenNameCOMMENT_JAVADOC	 {@inheritDoc} 
public	TokenNamepublic	
ThrowableRenderer	TokenNameIdentifier	 Throwable Renderer
getThrowableRenderer	TokenNameIdentifier	 get Throwable Renderer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
throwableRenderer	TokenNameIdentifier	 throwable Renderer
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Shutting down a hierarchy will <em>safely</em> close and remove all appenders in all categories including the root logger. <p>Some appenders such as {@link org.apache.log4j.net.SocketAppender} and {@link AsyncAppender} need to be closed before the application exists. Otherwise, pending logging events might be lost. <p>The <code>shutdown</code> method is careful to close nested appenders before closing regular appenders. This is allows configurations where a regular appender is attached to a logger and again to a nested appender. @since 1.0 */	TokenNameCOMMENT_JAVADOC	 Shutting down a hierarchy will <em>safely</em> close and remove all appenders in all categories including the root logger. <p>Some appenders such as {@link org.apache.log4j.net.SocketAppender} and {@link AsyncAppender} need to be closed before the application exists. Otherwise, pending logging events might be lost. <p>The <code>shutdown</code> method is careful to close nested appenders before closing regular appenders. This is allows configurations where a regular appender is attached to a logger and again to a nested appender. @since 1.0 
public	TokenNamepublic	
void	TokenNamevoid	
shutdown	TokenNameIdentifier	 shutdown
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Logger	TokenNameIdentifier	 Logger
root	TokenNameIdentifier	 root
=	TokenNameEQUAL	
getRootLogger	TokenNameIdentifier	 get Root Logger
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// begin by closing nested appenders 	TokenNameCOMMENT_LINE	begin by closing nested appenders 
root	TokenNameIdentifier	 root
.	TokenNameDOT	
closeNestedAppenders	TokenNameIdentifier	 close Nested Appenders
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
synchronized	TokenNamesynchronized	
(	TokenNameLPAREN	
ht	TokenNameIdentifier	 ht
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Enumeration	TokenNameIdentifier	 Enumeration
cats	TokenNameIdentifier	 cats
=	TokenNameEQUAL	
this	TokenNamethis	
.	TokenNameDOT	
getCurrentLoggers	TokenNameIdentifier	 get Current Loggers
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
cats	TokenNameIdentifier	 cats
.	TokenNameDOT	
hasMoreElements	TokenNameIdentifier	 has More Elements
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Logger	TokenNameIdentifier	 Logger
c	TokenNameIdentifier	 c
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Logger	TokenNameIdentifier	 Logger
)	TokenNameRPAREN	
cats	TokenNameIdentifier	 cats
.	TokenNameDOT	
nextElement	TokenNameIdentifier	 next Element
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
c	TokenNameIdentifier	 c
.	TokenNameDOT	
closeNestedAppenders	TokenNameIdentifier	 close Nested Appenders
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// then, remove all appenders 	TokenNameCOMMENT_LINE	then, remove all appenders 
root	TokenNameIdentifier	 root
.	TokenNameDOT	
removeAllAppenders	TokenNameIdentifier	 remove All Appenders
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
cats	TokenNameIdentifier	 cats
=	TokenNameEQUAL	
this	TokenNamethis	
.	TokenNameDOT	
getCurrentLoggers	TokenNameIdentifier	 get Current Loggers
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
cats	TokenNameIdentifier	 cats
.	TokenNameDOT	
hasMoreElements	TokenNameIdentifier	 has More Elements
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Logger	TokenNameIdentifier	 Logger
c	TokenNameIdentifier	 c
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Logger	TokenNameIdentifier	 Logger
)	TokenNameRPAREN	
cats	TokenNameIdentifier	 cats
.	TokenNameDOT	
nextElement	TokenNameIdentifier	 next Element
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
c	TokenNameIdentifier	 c
.	TokenNameDOT	
removeAllAppenders	TokenNameIdentifier	 remove All Appenders
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** This method loops through all the *potential* parents of 'cat'. There 3 possible cases: 1) No entry for the potential parent of 'cat' exists We create a ProvisionNode for this potential parent and insert 'cat' in that provision node. 2) There entry is of type Logger for the potential parent. The entry is 'cat's nearest existing parent. We update cat's parent field with this entry. We also break from the loop because updating our parent's parent is our parent's responsibility. 3) There entry is of type ProvisionNode for this potential parent. We add 'cat' to the list of children for this potential parent. */	TokenNameCOMMENT_JAVADOC	 This method loops through all the *potential* parents of 'cat'. There 3 possible cases: 1) No entry for the potential parent of 'cat' exists We create a ProvisionNode for this potential parent and insert 'cat' in that provision node. 2) There entry is of type Logger for the potential parent. The entry is 'cat's nearest existing parent. We update cat's parent field with this entry. We also break from the loop because updating our parent's parent is our parent's responsibility. 3) There entry is of type ProvisionNode for this potential parent. We add 'cat' to the list of children for this potential parent. 
final	TokenNamefinal	
private	TokenNameprivate	
void	TokenNamevoid	
updateParents	TokenNameIdentifier	 update Parents
(	TokenNameLPAREN	
Logger	TokenNameIdentifier	 Logger
cat	TokenNameIdentifier	 cat
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
=	TokenNameEQUAL	
cat	TokenNameIdentifier	 cat
.	TokenNameDOT	
name	TokenNameIdentifier	 name
;	TokenNameSEMICOLON	
int	TokenNameint	
length	TokenNameIdentifier	 length
=	TokenNameEQUAL	
name	TokenNameIdentifier	 name
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
parentFound	TokenNameIdentifier	 parent Found
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
//System.out.println("UpdateParents called for " + name); 	TokenNameCOMMENT_LINE	System.out.println("UpdateParents called for " + name); 
// if name = "w.x.y.z", loop thourgh "w.x.y", "w.x" and "w", but not "w.x.y.z" 	TokenNameCOMMENT_LINE	if name = "w.x.y.z", loop thourgh "w.x.y", "w.x" and "w", but not "w.x.y.z" 
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
name	TokenNameIdentifier	 name
.	TokenNameDOT	
lastIndexOf	TokenNameIdentifier	 last Index Of
(	TokenNameLPAREN	
'.'	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
length	TokenNameIdentifier	 length
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
name	TokenNameIdentifier	 name
.	TokenNameDOT	
lastIndexOf	TokenNameIdentifier	 last Index Of
(	TokenNameLPAREN	
'.'	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
i	TokenNameIdentifier	 i
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
substr	TokenNameIdentifier	 substr
=	TokenNameEQUAL	
name	TokenNameIdentifier	 name
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//System.out.println("Updating parent : " + substr); 	TokenNameCOMMENT_LINE	System.out.println("Updating parent : " + substr); 
CategoryKey	TokenNameIdentifier	 Category Key
key	TokenNameIdentifier	 key
=	TokenNameEQUAL	
new	TokenNamenew	
CategoryKey	TokenNameIdentifier	 Category Key
(	TokenNameLPAREN	
substr	TokenNameIdentifier	 substr
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// simple constructor 	TokenNameCOMMENT_LINE	simple constructor 
Object	TokenNameIdentifier	 Object
o	TokenNameIdentifier	 o
=	TokenNameEQUAL	
ht	TokenNameIdentifier	 ht
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Create a provision node for a future parent. 	TokenNameCOMMENT_LINE	Create a provision node for a future parent. 
if	TokenNameif	
(	TokenNameLPAREN	
o	TokenNameIdentifier	 o
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
//System.out.println("No parent "+substr+" found. Creating ProvisionNode."); 	TokenNameCOMMENT_LINE	System.out.println("No parent "+substr+" found. Creating ProvisionNode."); 
ProvisionNode	TokenNameIdentifier	 Provision Node
pn	TokenNameIdentifier	 pn
=	TokenNameEQUAL	
new	TokenNamenew	
ProvisionNode	TokenNameIdentifier	 Provision Node
(	TokenNameLPAREN	
cat	TokenNameIdentifier	 cat
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ht	TokenNameIdentifier	 ht
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
,	TokenNameCOMMA	
pn	TokenNameIdentifier	 pn
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
o	TokenNameIdentifier	 o
instanceof	TokenNameinstanceof	
Category	TokenNameIdentifier	 Category
)	TokenNameRPAREN	
{	TokenNameLBRACE	
parentFound	TokenNameIdentifier	 parent Found
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
cat	TokenNameIdentifier	 cat
.	TokenNameDOT	
parent	TokenNameIdentifier	 parent
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Category	TokenNameIdentifier	 Category
)	TokenNameRPAREN	
o	TokenNameIdentifier	 o
;	TokenNameSEMICOLON	
//System.out.println("Linking " + cat.name + " -> " + ((Category) o).name); 	TokenNameCOMMENT_LINE	System.out.println("Linking " + cat.name + " -> " + ((Category) o).name); 
break	TokenNamebreak	
;	TokenNameSEMICOLON	
// no need to update the ancestors of the closest ancestor 	TokenNameCOMMENT_LINE	no need to update the ancestors of the closest ancestor 
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
o	TokenNameIdentifier	 o
instanceof	TokenNameinstanceof	
ProvisionNode	TokenNameIdentifier	 Provision Node
)	TokenNameRPAREN	
{	TokenNameLBRACE	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
ProvisionNode	TokenNameIdentifier	 Provision Node
)	TokenNameRPAREN	
o	TokenNameIdentifier	 o
)	TokenNameRPAREN	
.	TokenNameDOT	
addElement	TokenNameIdentifier	 add Element
(	TokenNameLPAREN	
cat	TokenNameIdentifier	 cat
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
Exception	TokenNameIdentifier	 Exception
e	TokenNameIdentifier	 e
=	TokenNameEQUAL	
new	TokenNamenew	
IllegalStateException	TokenNameIdentifier	 Illegal State Exception
(	TokenNameLPAREN	
"unexpected object type "	TokenNameStringLiteral	unexpected object type 
+	TokenNamePLUS	
o	TokenNameIdentifier	 o
.	TokenNameDOT	
getClass	TokenNameIdentifier	 get Class
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
" in ht."	TokenNameStringLiteral	 in ht.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
printStackTrace	TokenNameIdentifier	 print Stack Trace
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// If we could not find any existing parents, then link with root. 	TokenNameCOMMENT_LINE	If we could not find any existing parents, then link with root. 
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
parentFound	TokenNameIdentifier	 parent Found
)	TokenNameRPAREN	
cat	TokenNameIdentifier	 cat
.	TokenNameDOT	
parent	TokenNameIdentifier	 parent
=	TokenNameEQUAL	
root	TokenNameIdentifier	 root
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** We update the links for all the children that placed themselves in the provision node 'pn'. The second argument 'cat' is a reference for the newly created Logger, parent of all the children in 'pn' We loop on all the children 'c' in 'pn': If the child 'c' has been already linked to a child of 'cat' then there is no need to update 'c'. Otherwise, we set cat's parent field to c's parent and set c's parent field to cat. */	TokenNameCOMMENT_JAVADOC	 We update the links for all the children that placed themselves in the provision node 'pn'. The second argument 'cat' is a reference for the newly created Logger, parent of all the children in 'pn' We loop on all the children 'c' in 'pn': If the child 'c' has been already linked to a child of 'cat' then there is no need to update 'c'. Otherwise, we set cat's parent field to c's parent and set c's parent field to cat. 
final	TokenNamefinal	
private	TokenNameprivate	
void	TokenNamevoid	
updateChildren	TokenNameIdentifier	 update Children
(	TokenNameLPAREN	
ProvisionNode	TokenNameIdentifier	 Provision Node
pn	TokenNameIdentifier	 pn
,	TokenNameCOMMA	
Logger	TokenNameIdentifier	 Logger
logger	TokenNameIdentifier	 logger
)	TokenNameRPAREN	
{	TokenNameLBRACE	
//System.out.println("updateChildren called for " + logger.name); 	TokenNameCOMMENT_LINE	System.out.println("updateChildren called for " + logger.name); 
final	TokenNamefinal	
int	TokenNameint	
last	TokenNameIdentifier	 last
=	TokenNameEQUAL	
pn	TokenNameIdentifier	 pn
.	TokenNameDOT	
size	TokenNameIdentifier	 size
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
last	TokenNameIdentifier	 last
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Logger	TokenNameIdentifier	 Logger
l	TokenNameIdentifier	 l
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Logger	TokenNameIdentifier	 Logger
)	TokenNameRPAREN	
pn	TokenNameIdentifier	 pn
.	TokenNameDOT	
elementAt	TokenNameIdentifier	 element At
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//System.out.println("Updating child " +p.name); 	TokenNameCOMMENT_LINE	System.out.println("Updating child " +p.name); 
// Unless this child already points to a correct (lower) parent, 	TokenNameCOMMENT_LINE	Unless this child already points to a correct (lower) parent, 
// make cat.parent point to l.parent and l.parent to cat. 	TokenNameCOMMENT_LINE	make cat.parent point to l.parent and l.parent to cat. 
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
l	TokenNameIdentifier	 l
.	TokenNameDOT	
parent	TokenNameIdentifier	 parent
.	TokenNameDOT	
name	TokenNameIdentifier	 name
.	TokenNameDOT	
startsWith	TokenNameIdentifier	 starts With
(	TokenNameLPAREN	
logger	TokenNameIdentifier	 logger
.	TokenNameDOT	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
logger	TokenNameIdentifier	 logger
.	TokenNameDOT	
parent	TokenNameIdentifier	 parent
=	TokenNameEQUAL	
l	TokenNameIdentifier	 l
.	TokenNameDOT	
parent	TokenNameIdentifier	 parent
;	TokenNameSEMICOLON	
l	TokenNameIdentifier	 l
.	TokenNameDOT	
parent	TokenNameIdentifier	 parent
=	TokenNameEQUAL	
logger	TokenNameIdentifier	 logger
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
