/* * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. * */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
tools	TokenNameIdentifier	 tools
.	TokenNameDOT	
zip	TokenNameIdentifier	 zip
;	TokenNameSEMICOLON	
/** * Constants from stat.h on Unix systems. * */	TokenNameCOMMENT_JAVADOC	 Constants from stat.h on Unix systems. 
// CheckStyle:InterfaceIsTypeCheck OFF - backward compatible 	TokenNameCOMMENT_LINE	CheckStyle:InterfaceIsTypeCheck OFF - backward compatible 
public	TokenNamepublic	
interface	TokenNameinterface	
UnixStat	TokenNameIdentifier	 Unix Stat
{	TokenNameLBRACE	
/** * Bits used for permissions (and sticky bit) * * @since 1.1 */	TokenNameCOMMENT_JAVADOC	 Bits used for permissions (and sticky bit) * @since 1.1 
int	TokenNameint	
PERM_MASK	TokenNameIdentifier	 PERM  MASK
=	TokenNameEQUAL	
07777	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * Indicates symbolic links. * * @since 1.1 */	TokenNameCOMMENT_JAVADOC	 Indicates symbolic links. * @since 1.1 
int	TokenNameint	
LINK_FLAG	TokenNameIdentifier	 LINK  FLAG
=	TokenNameEQUAL	
0120000	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * Indicates plain files. * * @since 1.1 */	TokenNameCOMMENT_JAVADOC	 Indicates plain files. * @since 1.1 
int	TokenNameint	
FILE_FLAG	TokenNameIdentifier	 FILE  FLAG
=	TokenNameEQUAL	
0100000	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * Indicates directories. * * @since 1.1 */	TokenNameCOMMENT_JAVADOC	 Indicates directories. * @since 1.1 
int	TokenNameint	
DIR_FLAG	TokenNameIdentifier	 DIR  FLAG
=	TokenNameEQUAL	
040000	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// ---------------------------------------------------------- 	TokenNameCOMMENT_LINE	---------------------------------------------------------- 
// somewhat arbitrary choices that are quite common for shared 	TokenNameCOMMENT_LINE	somewhat arbitrary choices that are quite common for shared 
// installations 	TokenNameCOMMENT_LINE	installations 
// ----------------------------------------------------------- 	TokenNameCOMMENT_LINE	----------------------------------------------------------- 
/** * Default permissions for symbolic links. * * @since 1.1 */	TokenNameCOMMENT_JAVADOC	 Default permissions for symbolic links. * @since 1.1 
int	TokenNameint	
DEFAULT_LINK_PERM	TokenNameIdentifier	 DEFAULT  LINK  PERM
=	TokenNameEQUAL	
0777	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * Default permissions for directories. * * @since 1.1 */	TokenNameCOMMENT_JAVADOC	 Default permissions for directories. * @since 1.1 
int	TokenNameint	
DEFAULT_DIR_PERM	TokenNameIdentifier	 DEFAULT  DIR  PERM
=	TokenNameEQUAL	
0755	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * Default permissions for plain files. * * @since 1.1 */	TokenNameCOMMENT_JAVADOC	 Default permissions for plain files. * @since 1.1 
int	TokenNameint	
DEFAULT_FILE_PERM	TokenNameIdentifier	 DEFAULT  FILE  PERM
=	TokenNameEQUAL	
0644	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
