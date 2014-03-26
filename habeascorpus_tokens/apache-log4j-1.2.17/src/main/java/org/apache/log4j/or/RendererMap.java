/* * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
log4j	TokenNameIdentifier	 log4j
.	TokenNameDOT	
or	TokenNameIdentifier	 or
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
helpers	TokenNameIdentifier	 helpers
.	TokenNameDOT	
Loader	TokenNameIdentifier	 Loader
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
OptionConverter	TokenNameIdentifier	 Option Converter
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Hashtable	TokenNameIdentifier	 Hashtable
;	TokenNameSEMICOLON	
/** Map class objects to an {@link ObjectRenderer}. @author Ceki G&uuml;lc&uuml; @since version 1.0 */	TokenNameCOMMENT_JAVADOC	 Map class objects to an {@link ObjectRenderer}. @author Ceki G&uuml;lc&uuml; @since version 1.0 
public	TokenNamepublic	
class	TokenNameclass	
RendererMap	TokenNameIdentifier	 Renderer Map
{	TokenNameLBRACE	
Hashtable	TokenNameIdentifier	 Hashtable
map	TokenNameIdentifier	 map
;	TokenNameSEMICOLON	
static	TokenNamestatic	
ObjectRenderer	TokenNameIdentifier	 Object Renderer
defaultRenderer	TokenNameIdentifier	 default Renderer
=	TokenNameEQUAL	
new	TokenNamenew	
DefaultRenderer	TokenNameIdentifier	 Default Renderer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
RendererMap	TokenNameIdentifier	 Renderer Map
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
map	TokenNameIdentifier	 map
=	TokenNameEQUAL	
new	TokenNamenew	
Hashtable	TokenNameIdentifier	 Hashtable
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Add a renderer to a hierarchy passed as parameter. */	TokenNameCOMMENT_JAVADOC	 Add a renderer to a hierarchy passed as parameter. 
static	TokenNamestatic	
public	TokenNamepublic	
void	TokenNamevoid	
addRenderer	TokenNameIdentifier	 add Renderer
(	TokenNameLPAREN	
RendererSupport	TokenNameIdentifier	 Renderer Support
repository	TokenNameIdentifier	 repository
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
renderedClassName	TokenNameIdentifier	 rendered Class Name
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
renderingClassName	TokenNameIdentifier	 rendering Class Name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
LogLog	TokenNameIdentifier	 Log Log
.	TokenNameDOT	
debug	TokenNameIdentifier	 debug
(	TokenNameLPAREN	
"Rendering class: ["	TokenNameStringLiteral	Rendering class: [
+	TokenNamePLUS	
renderingClassName	TokenNameIdentifier	 rendering Class Name
+	TokenNamePLUS	
"], Rendered class: ["	TokenNameStringLiteral	], Rendered class: [
+	TokenNamePLUS	
renderedClassName	TokenNameIdentifier	 rendered Class Name
+	TokenNamePLUS	
"]."	TokenNameStringLiteral	].
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ObjectRenderer	TokenNameIdentifier	 Object Renderer
renderer	TokenNameIdentifier	 renderer
=	TokenNameEQUAL	
(	TokenNameLPAREN	
ObjectRenderer	TokenNameIdentifier	 Object Renderer
)	TokenNameRPAREN	
OptionConverter	TokenNameIdentifier	 Option Converter
.	TokenNameDOT	
instantiateByClassName	TokenNameIdentifier	 instantiate By Class Name
(	TokenNameLPAREN	
renderingClassName	TokenNameIdentifier	 rendering Class Name
,	TokenNameCOMMA	
ObjectRenderer	TokenNameIdentifier	 Object Renderer
.	TokenNameDOT	
class	TokenNameclass	
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
renderer	TokenNameIdentifier	 renderer
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
LogLog	TokenNameIdentifier	 Log Log
.	TokenNameDOT	
error	TokenNameIdentifier	 error
(	TokenNameLPAREN	
"Could not instantiate renderer ["	TokenNameStringLiteral	Could not instantiate renderer [
+	TokenNamePLUS	
renderingClassName	TokenNameIdentifier	 rendering Class Name
+	TokenNamePLUS	
"]."	TokenNameStringLiteral	].
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
Class	TokenNameIdentifier	 Class
renderedClass	TokenNameIdentifier	 rendered Class
=	TokenNameEQUAL	
Loader	TokenNameIdentifier	 Loader
.	TokenNameDOT	
loadClass	TokenNameIdentifier	 load Class
(	TokenNameLPAREN	
renderedClassName	TokenNameIdentifier	 rendered Class Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
repository	TokenNameIdentifier	 repository
.	TokenNameDOT	
setRenderer	TokenNameIdentifier	 set Renderer
(	TokenNameLPAREN	
renderedClass	TokenNameIdentifier	 rendered Class
,	TokenNameCOMMA	
renderer	TokenNameIdentifier	 renderer
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
ClassNotFoundException	TokenNameIdentifier	 Class Not Found Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
LogLog	TokenNameIdentifier	 Log Log
.	TokenNameDOT	
error	TokenNameIdentifier	 error
(	TokenNameLPAREN	
"Could not find class ["	TokenNameStringLiteral	Could not find class [
+	TokenNamePLUS	
renderedClassName	TokenNameIdentifier	 rendered Class Name
+	TokenNamePLUS	
"]."	TokenNameStringLiteral	].
,	TokenNameCOMMA	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** Find the appropriate renderer for the class type of the <code>o</code> parameter. This is accomplished by calling the {@link #get(Class)} method. Once a renderer is found, it is applied on the object <code>o</code> and the result is returned as a {@link String}. */	TokenNameCOMMENT_JAVADOC	 Find the appropriate renderer for the class type of the <code>o</code> parameter. This is accomplished by calling the {@link #get(Class)} method. Once a renderer is found, it is applied on the object <code>o</code> and the result is returned as a {@link String}. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
findAndRender	TokenNameIdentifier	 find And Render
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
o	TokenNameIdentifier	 o
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
o	TokenNameIdentifier	 o
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
else	TokenNameelse	
return	TokenNamereturn	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
o	TokenNameIdentifier	 o
.	TokenNameDOT	
getClass	TokenNameIdentifier	 get Class
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
doRender	TokenNameIdentifier	 do Render
(	TokenNameLPAREN	
o	TokenNameIdentifier	 o
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Syntactic sugar method that calls {@link #get(Class)} with the class of the object parameter. */	TokenNameCOMMENT_JAVADOC	 Syntactic sugar method that calls {@link #get(Class)} with the class of the object parameter. 
public	TokenNamepublic	
ObjectRenderer	TokenNameIdentifier	 Object Renderer
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
o	TokenNameIdentifier	 o
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
o	TokenNameIdentifier	 o
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
else	TokenNameelse	
return	TokenNamereturn	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
o	TokenNameIdentifier	 o
.	TokenNameDOT	
getClass	TokenNameIdentifier	 get Class
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Search the parents of <code>clazz</code> for a renderer. The renderer closest in the hierarchy will be returned. If no renderers could be found, then the default renderer is returned. <p>The search first looks for a renderer configured for <code>clazz</code>. If a renderer could not be found, then the search continues by looking at all the interfaces implemented by <code>clazz</code> including the super-interfaces of each interface. If a renderer cannot be found, then the search looks for a renderer defined for the parent (superclass) of <code>clazz</code>. If that fails, then all the interfaces implemented by the parent of <code>clazz</code> are searched and so on. <p>For example, if A0, A1, A2 are classes and X0, X1, X2, Y0, Y1 are interfaces where A2 extends A1 which in turn extends A0 and similarly X2 extends X1 which extends X0 and Y1 extends Y0. Let us also assume that A1 implements the Y0 interface and that A2 implements the X2 interface. <p>The table below shows the results returned by the <code>get(A2.class)</code> method depending on the renderers added to the map. <p><table border="1"> <tr><th>Added renderers</th><th>Value returned by <code>get(A2.class)</code></th> <tr><td><code>A0Renderer</code> <td align="center"><code>A0Renderer</code> <tr><td><code>A0Renderer, A1Renderer</code> <td align="center"><code>A1Renderer</code> <tr><td><code>X0Renderer</code> <td align="center"><code>X0Renderer</code> <tr><td><code>A1Renderer, X0Renderer</code> <td align="center"><code>X0Renderer</code> </table> <p>This search algorithm is not the most natural, although it is particularly easy to implement. Future log4j versions <em>may</em> implement a more intuitive search algorithm. However, the present algorithm should be acceptable in the vast majority of circumstances. */	TokenNameCOMMENT_JAVADOC	 Search the parents of <code>clazz</code> for a renderer. The renderer closest in the hierarchy will be returned. If no renderers could be found, then the default renderer is returned. <p>The search first looks for a renderer configured for <code>clazz</code>. If a renderer could not be found, then the search continues by looking at all the interfaces implemented by <code>clazz</code> including the super-interfaces of each interface. If a renderer cannot be found, then the search looks for a renderer defined for the parent (superclass) of <code>clazz</code>. If that fails, then all the interfaces implemented by the parent of <code>clazz</code> are searched and so on. <p>For example, if A0, A1, A2 are classes and X0, X1, X2, Y0, Y1 are interfaces where A2 extends A1 which in turn extends A0 and similarly X2 extends X1 which extends X0 and Y1 extends Y0. Let us also assume that A1 implements the Y0 interface and that A2 implements the X2 interface. <p>The table below shows the results returned by the <code>get(A2.class)</code> method depending on the renderers added to the map. <p><table border="1"> <tr><th>Added renderers</th><th>Value returned by <code>get(A2.class)</code></th> <tr><td><code>A0Renderer</code> <td align="center"><code>A0Renderer</code> <tr><td><code>A0Renderer, A1Renderer</code> <td align="center"><code>A1Renderer</code> <tr><td><code>X0Renderer</code> <td align="center"><code>X0Renderer</code> <tr><td><code>A1Renderer, X0Renderer</code> <td align="center"><code>X0Renderer</code> </table> <p>This search algorithm is not the most natural, although it is particularly easy to implement. Future log4j versions <em>may</em> implement a more intuitive search algorithm. However, the present algorithm should be acceptable in the vast majority of circumstances. 
public	TokenNamepublic	
ObjectRenderer	TokenNameIdentifier	 Object Renderer
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
Class	TokenNameIdentifier	 Class
clazz	TokenNameIdentifier	 clazz
)	TokenNameRPAREN	
{	TokenNameLBRACE	
//System.out.println("\nget: "+clazz); 	TokenNameCOMMENT_LINE	System.out.println("\nget: "+clazz); 
ObjectRenderer	TokenNameIdentifier	 Object Renderer
r	TokenNameIdentifier	 r
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
Class	TokenNameIdentifier	 Class
c	TokenNameIdentifier	 c
=	TokenNameEQUAL	
clazz	TokenNameIdentifier	 clazz
;	TokenNameSEMICOLON	
c	TokenNameIdentifier	 c
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
c	TokenNameIdentifier	 c
=	TokenNameEQUAL	
c	TokenNameIdentifier	 c
.	TokenNameDOT	
getSuperclass	TokenNameIdentifier	 get Superclass
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
//System.out.println("Searching for class: "+c); 	TokenNameCOMMENT_LINE	System.out.println("Searching for class: "+c); 
r	TokenNameIdentifier	 r
=	TokenNameEQUAL	
(	TokenNameLPAREN	
ObjectRenderer	TokenNameIdentifier	 Object Renderer
)	TokenNameRPAREN	
map	TokenNameIdentifier	 map
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
r	TokenNameIdentifier	 r
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
r	TokenNameIdentifier	 r
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
r	TokenNameIdentifier	 r
=	TokenNameEQUAL	
searchInterfaces	TokenNameIdentifier	 search Interfaces
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
r	TokenNameIdentifier	 r
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
return	TokenNamereturn	
r	TokenNameIdentifier	 r
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
defaultRenderer	TokenNameIdentifier	 default Renderer
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
ObjectRenderer	TokenNameIdentifier	 Object Renderer
searchInterfaces	TokenNameIdentifier	 search Interfaces
(	TokenNameLPAREN	
Class	TokenNameIdentifier	 Class
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
{	TokenNameLBRACE	
//System.out.println("Searching interfaces of class: "+c); 	TokenNameCOMMENT_LINE	System.out.println("Searching interfaces of class: "+c); 
ObjectRenderer	TokenNameIdentifier	 Object Renderer
r	TokenNameIdentifier	 r
=	TokenNameEQUAL	
(	TokenNameLPAREN	
ObjectRenderer	TokenNameIdentifier	 Object Renderer
)	TokenNameRPAREN	
map	TokenNameIdentifier	 map
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
r	TokenNameIdentifier	 r
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
r	TokenNameIdentifier	 r
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
Class	TokenNameIdentifier	 Class
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
ia	TokenNameIdentifier	 ia
=	TokenNameEQUAL	
c	TokenNameIdentifier	 c
.	TokenNameDOT	
getInterfaces	TokenNameIdentifier	 get Interfaces
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
ia	TokenNameIdentifier	 ia
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
r	TokenNameIdentifier	 r
=	TokenNameEQUAL	
searchInterfaces	TokenNameIdentifier	 search Interfaces
(	TokenNameLPAREN	
ia	TokenNameIdentifier	 ia
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
r	TokenNameIdentifier	 r
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
return	TokenNamereturn	
r	TokenNameIdentifier	 r
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
ObjectRenderer	TokenNameIdentifier	 Object Renderer
getDefaultRenderer	TokenNameIdentifier	 get Default Renderer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
defaultRenderer	TokenNameIdentifier	 default Renderer
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
clear	TokenNameIdentifier	 clear
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
map	TokenNameIdentifier	 map
.	TokenNameDOT	
clear	TokenNameIdentifier	 clear
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Register an {@link ObjectRenderer} for <code>clazz</code>. */	TokenNameCOMMENT_JAVADOC	 Register an {@link ObjectRenderer} for <code>clazz</code>. 
public	TokenNamepublic	
void	TokenNamevoid	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
Class	TokenNameIdentifier	 Class
clazz	TokenNameIdentifier	 clazz
,	TokenNameCOMMA	
ObjectRenderer	TokenNameIdentifier	 Object Renderer
or	TokenNameIdentifier	 or
)	TokenNameRPAREN	
{	TokenNameLBRACE	
map	TokenNameIdentifier	 map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
clazz	TokenNameIdentifier	 clazz
,	TokenNameCOMMA	
or	TokenNameIdentifier	 or
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
