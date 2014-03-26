/* Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
batik	TokenNameIdentifier	 batik
.	TokenNameDOT	
apps	TokenNameIdentifier	 apps
.	TokenNameDOT	
svgbrowser	TokenNameIdentifier	 svgbrowser
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
awt	TokenNameIdentifier	 awt
.	TokenNameDOT	
geom	TokenNameIdentifier	 geom
.	TokenNameDOT	
AffineTransform	TokenNameIdentifier	 Affine Transform
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
List	TokenNameIdentifier	 List
;	TokenNameSEMICOLON	
/** * This class implements a transform history mechanism. * * @author <a href="mailto:stephane@hillion.org">Stephane Hillion</a> * @version $Id: TransformHistory.java 475477 2006-11-15 22:44:28Z cam $ */	TokenNameCOMMENT_JAVADOC	 This class implements a transform history mechanism. * @author <a href="mailto:stephane@hillion.org">Stephane Hillion</a> @version $Id: TransformHistory.java 475477 2006-11-15 22:44:28Z cam $ 
public	TokenNamepublic	
class	TokenNameclass	
TransformHistory	TokenNameIdentifier	 Transform History
{	TokenNameLBRACE	
/** * The transform stack. */	TokenNameCOMMENT_JAVADOC	 The transform stack. 
protected	TokenNameprotected	
List	TokenNameIdentifier	 List
transforms	TokenNameIdentifier	 transforms
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * The current position in the stack. */	TokenNameCOMMENT_JAVADOC	 The current position in the stack. 
protected	TokenNameprotected	
int	TokenNameint	
position	TokenNameIdentifier	 position
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * Goes back of one position in the history. * Assumes that <tt>canGoBack()</tt> is true. */	TokenNameCOMMENT_JAVADOC	 Goes back of one position in the history. Assumes that <tt>canGoBack()</tt> is true. 
public	TokenNamepublic	
void	TokenNamevoid	
back	TokenNameIdentifier	 back
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
position	TokenNameIdentifier	 position
-=	TokenNameMINUS_EQUAL	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Whether it is possible to go back. */	TokenNameCOMMENT_JAVADOC	 Whether it is possible to go back. 
public	TokenNamepublic	
boolean	TokenNameboolean	
canGoBack	TokenNameIdentifier	 can Go Back
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
position	TokenNameIdentifier	 position
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Goes forward of one position in the history. * Assumes that <tt>canGoForward()</tt> is true. */	TokenNameCOMMENT_JAVADOC	 Goes forward of one position in the history. Assumes that <tt>canGoForward()</tt> is true. 
public	TokenNamepublic	
void	TokenNamevoid	
forward	TokenNameIdentifier	 forward
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** * Whether it is possible to go forward. */	TokenNameCOMMENT_JAVADOC	 Whether it is possible to go forward. 
public	TokenNamepublic	
boolean	TokenNameboolean	
canGoForward	TokenNameIdentifier	 can Go Forward
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
position	TokenNameIdentifier	 position
<	TokenNameLESS	
transforms	TokenNameIdentifier	 transforms
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the current transform. */	TokenNameCOMMENT_JAVADOC	 Returns the current transform. 
public	TokenNamepublic	
AffineTransform	TokenNameIdentifier	 Affine Transform
currentTransform	TokenNameIdentifier	 current Transform
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
AffineTransform	TokenNameIdentifier	 Affine Transform
)	TokenNameRPAREN	
transforms	TokenNameIdentifier	 transforms
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
position	TokenNameIdentifier	 position
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Adds a transform to the history. */	TokenNameCOMMENT_JAVADOC	 Adds a transform to the history. 
public	TokenNamepublic	
void	TokenNamevoid	
update	TokenNameIdentifier	 update
(	TokenNameLPAREN	
AffineTransform	TokenNameIdentifier	 Affine Transform
at	TokenNameIdentifier	 at
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
position	TokenNameIdentifier	 position
<	TokenNameLESS	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
position	TokenNameIdentifier	 position
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
++	TokenNamePLUS_PLUS	
position	TokenNameIdentifier	 position
<	TokenNameLESS	
transforms	TokenNameIdentifier	 transforms
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
transforms	TokenNameIdentifier	 transforms
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
position	TokenNameIdentifier	 position
)	TokenNameRPAREN	
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
at	TokenNameIdentifier	 at
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
transforms	TokenNameIdentifier	 transforms
=	TokenNameEQUAL	
transforms	TokenNameIdentifier	 transforms
.	TokenNameDOT	
subList	TokenNameIdentifier	 sub List
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
position	TokenNameIdentifier	 position
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
transforms	TokenNameIdentifier	 transforms
.	TokenNameDOT	
set	TokenNameIdentifier	 set
(	TokenNameLPAREN	
position	TokenNameIdentifier	 position
,	TokenNameCOMMA	
at	TokenNameIdentifier	 at
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
transforms	TokenNameIdentifier	 transforms
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
at	TokenNameIdentifier	 at
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
