/* Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
batik	TokenNameIdentifier	 batik
.	TokenNameDOT	
util	TokenNameIdentifier	 util
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
awt	TokenNameIdentifier	 awt
.	TokenNameDOT	
Color	TokenNameIdentifier	 Color
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
awt	TokenNameIdentifier	 awt
.	TokenNameDOT	
Dimension	TokenNameIdentifier	 Dimension
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
awt	TokenNameIdentifier	 awt
.	TokenNameDOT	
Font	TokenNameIdentifier	 Font
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
awt	TokenNameIdentifier	 awt
.	TokenNameDOT	
Point	TokenNameIdentifier	 Point
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
awt	TokenNameIdentifier	 awt
.	TokenNameDOT	
Rectangle	TokenNameIdentifier	 Rectangle
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
File	TokenNameIdentifier	 File
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
FileInputStream	TokenNameIdentifier	 File Input Stream
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
FileOutputStream	TokenNameIdentifier	 File Output Stream
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
net	TokenNameIdentifier	 net
.	TokenNameDOT	
MalformedURLException	TokenNameIdentifier	 Malformed URL Exception
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
net	TokenNameIdentifier	 net
.	TokenNameDOT	
URL	TokenNameIdentifier	 URL
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
security	TokenNameIdentifier	 security
.	TokenNameDOT	
AccessControlException	TokenNameIdentifier	 Access Control Exception
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
Map	TokenNameIdentifier	 Map
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Properties	TokenNameIdentifier	 Properties
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
StringTokenizer	TokenNameIdentifier	 String Tokenizer
;	TokenNameSEMICOLON	
/** * This class allows to manage users preferences. * <p> * Here is a short usage example: * <p> * <blockquote><pre> * // at application intialization * HashMap defaults = new HashMap(); * defaults.put("windowSize", new Dimension(640, 480)); * defaults.put("antialias", Boolean.TRUE); * PreferenceManager prefs = new PreferenceManager("application.ini", defaults); * try { * prefs.load(); * } catch (IOException e) { * // * } * myApplication.setSize(prefs.getDimension("windowSize")); * myApplication.setAntialiasingOn(prefs.getBoolean("antialias")); * * // later a dialog box may customize preferences * myApplication.setAntialiasingOn(antialiasCheckBox.getState()); * prefs.setBoolean("antialias", antialiasCheckBox.getState()); * * // when leaving the application we need to save the preferences * prefs.setDimension("windowSize", myApplication.getSize()); * prefs.setFiles("history", lastVisitedFileArray); * try { * prefs.save() * } catch (IOException e) { * // * } * </pre></blockquote> * <p> * @author <a href="mailto:cjolif@ilog.fr">Christophe Jolif</a> * @version $Id: PreferenceManager.java 478169 2006-11-22 14:23:24Z dvholten $ */	TokenNameCOMMENT_JAVADOC	 This class allows to manage users preferences. <p> Here is a short usage example: <p> <blockquote><pre> // at application intialization HashMap defaults = new HashMap(); defaults.put("windowSize", new Dimension(640, 480)); defaults.put("antialias", Boolean.TRUE); PreferenceManager prefs = new PreferenceManager("application.ini", defaults); try { prefs.load(); } catch (IOException e) { // } myApplication.setSize(prefs.getDimension("windowSize")); myApplication.setAntialiasingOn(prefs.getBoolean("antialias")); * // later a dialog box may customize preferences myApplication.setAntialiasingOn(antialiasCheckBox.getState()); prefs.setBoolean("antialias", antialiasCheckBox.getState()); * // when leaving the application we need to save the preferences prefs.setDimension("windowSize", myApplication.getSize()); prefs.setFiles("history", lastVisitedFileArray); try { prefs.save() } catch (IOException e) { // } </pre></blockquote> <p> @author <a href="mailto:cjolif@ilog.fr">Christophe Jolif</a> @version $Id: PreferenceManager.java 478169 2006-11-22 14:23:24Z dvholten $ 
public	TokenNamepublic	
class	TokenNameclass	
PreferenceManager	TokenNameIdentifier	 Preference Manager
{	TokenNameLBRACE	
protected	TokenNameprotected	
Properties	TokenNameIdentifier	 Properties
internal	TokenNameIdentifier	 internal
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
Map	TokenNameIdentifier	 Map
defaults	TokenNameIdentifier	 defaults
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
String	TokenNameIdentifier	 String
prefFileName	TokenNameIdentifier	 pref File Name
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
String	TokenNameIdentifier	 String
fullName	TokenNameIdentifier	 full Name
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
USER_HOME	TokenNameIdentifier	 USER  HOME
=	TokenNameEQUAL	
getSystemProperty	TokenNameIdentifier	 get System Property
(	TokenNameLPAREN	
"user.home"	TokenNameStringLiteral	user.home
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
USER_DIR	TokenNameIdentifier	 USER  DIR
=	TokenNameEQUAL	
getSystemProperty	TokenNameIdentifier	 get System Property
(	TokenNameLPAREN	
"user.dir"	TokenNameStringLiteral	user.dir
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
FILE_SEP	TokenNameIdentifier	 FILE  SEP
=	TokenNameEQUAL	
getSystemProperty	TokenNameIdentifier	 get System Property
(	TokenNameLPAREN	
"file.separator"	TokenNameStringLiteral	file.separator
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
PREF_DIR	TokenNameIdentifier	 PREF  DIR
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
/** * Gets a System property if accessible. Returns an empty string * otherwise */	TokenNameCOMMENT_JAVADOC	 Gets a System property if accessible. Returns an empty string otherwise 
protected	TokenNameprotected	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
getSystemProperty	TokenNameIdentifier	 get System Property
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
prop	TokenNameIdentifier	 prop
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
return	TokenNamereturn	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
getProperty	TokenNameIdentifier	 get Property
(	TokenNameLPAREN	
prop	TokenNameIdentifier	 prop
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
AccessControlException	TokenNameIdentifier	 Access Control Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
""	TokenNameStringLiteral	 
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Creates a preference manager. * @param prefFileName the name of the preference file. */	TokenNameCOMMENT_JAVADOC	 Creates a preference manager. @param prefFileName the name of the preference file. 
public	TokenNamepublic	
PreferenceManager	TokenNameIdentifier	 Preference Manager
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
prefFileName	TokenNameIdentifier	 pref File Name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
prefFileName	TokenNameIdentifier	 pref File Name
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Creates a preference manager with a default values * initialization map. * @param prefFileName the name of the preference file. * @param defaults where to get defaults value if the value is * not specified in the file. */	TokenNameCOMMENT_JAVADOC	 Creates a preference manager with a default values initialization map. @param prefFileName the name of the preference file. @param defaults where to get defaults value if the value is not specified in the file. 
public	TokenNamepublic	
PreferenceManager	TokenNameIdentifier	 Preference Manager
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
prefFileName	TokenNameIdentifier	 pref File Name
,	TokenNameCOMMA	
Map	TokenNameIdentifier	 Map
defaults	TokenNameIdentifier	 defaults
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
prefFileName	TokenNameIdentifier	 pref File Name
=	TokenNameEQUAL	
prefFileName	TokenNameIdentifier	 pref File Name
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
defaults	TokenNameIdentifier	 defaults
=	TokenNameEQUAL	
defaults	TokenNameIdentifier	 defaults
;	TokenNameSEMICOLON	
internal	TokenNameIdentifier	 internal
=	TokenNameEQUAL	
new	TokenNamenew	
Properties	TokenNameIdentifier	 Properties
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sets a <code>String</code> representing the directory * where <code>PreferenceManager</code> instances should look * for preferences files. The default value is <code>null</code> * which means the automatic mechanism for looking for preferences * is used. * @see #load */	TokenNameCOMMENT_JAVADOC	 Sets a <code>String</code> representing the directory where <code>PreferenceManager</code> instances should look for preferences files. The default value is <code>null</code> which means the automatic mechanism for looking for preferences is used. @see #load 
public	TokenNamepublic	
static	TokenNamestatic	
void	TokenNamevoid	
setPreferenceDirectory	TokenNameIdentifier	 set Preference Directory
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
dir	TokenNameIdentifier	 dir
)	TokenNameRPAREN	
{	TokenNameLBRACE	
PREF_DIR	TokenNameIdentifier	 PREF  DIR
=	TokenNameEQUAL	
dir	TokenNameIdentifier	 dir
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns a <code>String</code> representing the directory * where <code>PreferenceManager</code> instances should look * for preferences. * @see #load * @see #setPreferenceDirectory */	TokenNameCOMMENT_JAVADOC	 Returns a <code>String</code> representing the directory where <code>PreferenceManager</code> instances should look for preferences. @see #load @see #setPreferenceDirectory 
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
getPreferenceDirectory	TokenNameIdentifier	 get Preference Directory
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
PREF_DIR	TokenNameIdentifier	 PREF  DIR
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Loads the preference file. If the file has already been previously * sucessfuly loaded or saved, it will first try to reaload it from * this location. Otherwise, it will try to find the file * in the following order: in the directory set by * {@link #setPreferenceDirectory} if it exists, in the user * home directory and then in the current user directory. * @exception IOException if an error occured when reading the file. * @see #save */	TokenNameCOMMENT_JAVADOC	 Loads the preference file. If the file has already been previously sucessfuly loaded or saved, it will first try to reaload it from this location. Otherwise, it will try to find the file in the following order: in the directory set by {@link #setPreferenceDirectory} if it exists, in the user home directory and then in the current user directory. @exception IOException if an error occured when reading the file. @see #save 
public	TokenNamepublic	
void	TokenNamevoid	
load	TokenNameIdentifier	 load
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
FileInputStream	TokenNameIdentifier	 File Input Stream
fis	TokenNameIdentifier	 fis
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
fullName	TokenNameIdentifier	 full Name
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
try	TokenNametry	
{	TokenNameLBRACE	
fis	TokenNameIdentifier	 fis
=	TokenNameEQUAL	
new	TokenNamenew	
FileInputStream	TokenNameIdentifier	 File Input Stream
(	TokenNameLPAREN	
fullName	TokenNameIdentifier	 full Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
IOException	TokenNameIdentifier	 IO Exception
e1	TokenNameIdentifier	 e1
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fullName	TokenNameIdentifier	 full Name
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
fullName	TokenNameIdentifier	 full Name
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
PREF_DIR	TokenNameIdentifier	 PREF  DIR
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
fis	TokenNameIdentifier	 fis
=	TokenNameEQUAL	
new	TokenNamenew	
FileInputStream	TokenNameIdentifier	 File Input Stream
(	TokenNameLPAREN	
fullName	TokenNameIdentifier	 full Name
=	TokenNameEQUAL	
PREF_DIR	TokenNameIdentifier	 PREF  DIR
+	TokenNamePLUS	
FILE_SEP	TokenNameIdentifier	 FILE  SEP
+	TokenNamePLUS	
prefFileName	TokenNameIdentifier	 pref File Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
IOException	TokenNameIdentifier	 IO Exception
e2	TokenNameIdentifier	 e2
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fullName	TokenNameIdentifier	 full Name
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
fullName	TokenNameIdentifier	 full Name
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
fis	TokenNameIdentifier	 fis
=	TokenNameEQUAL	
new	TokenNamenew	
FileInputStream	TokenNameIdentifier	 File Input Stream
(	TokenNameLPAREN	
fullName	TokenNameIdentifier	 full Name
=	TokenNameEQUAL	
USER_HOME	TokenNameIdentifier	 USER  HOME
+	TokenNamePLUS	
FILE_SEP	TokenNameIdentifier	 FILE  SEP
+	TokenNamePLUS	
prefFileName	TokenNameIdentifier	 pref File Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
IOException	TokenNameIdentifier	 IO Exception
e3	TokenNameIdentifier	 e3
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
fis	TokenNameIdentifier	 fis
=	TokenNameEQUAL	
new	TokenNamenew	
FileInputStream	TokenNameIdentifier	 File Input Stream
(	TokenNameLPAREN	
fullName	TokenNameIdentifier	 full Name
=	TokenNameEQUAL	
USER_DIR	TokenNameIdentifier	 USER  DIR
+	TokenNamePLUS	
FILE_SEP	TokenNameIdentifier	 FILE  SEP
+	TokenNamePLUS	
prefFileName	TokenNameIdentifier	 pref File Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
IOException	TokenNameIdentifier	 IO Exception
e4	TokenNameIdentifier	 e4
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fullName	TokenNameIdentifier	 full Name
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
fullName	TokenNameIdentifier	 full Name
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
internal	TokenNameIdentifier	 internal
.	TokenNameDOT	
load	TokenNameIdentifier	 load
(	TokenNameLPAREN	
fis	TokenNameIdentifier	 fis
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
finally	TokenNamefinally	
{	TokenNameLBRACE	
fis	TokenNameIdentifier	 fis
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Saves the preference file. If it has previously sucessfuly been * loaded or save it will save it at the same location. In other cases * it will save it in the directory set by {@link #setPreferenceDirectory} * if has been set and exists, otherwise in the user home directory. * @exception IOException if an error occured when writing the file or * if is impossible to write the file at all available locations. * @see #load */	TokenNameCOMMENT_JAVADOC	 Saves the preference file. If it has previously sucessfuly been loaded or save it will save it at the same location. In other cases it will save it in the directory set by {@link #setPreferenceDirectory} if has been set and exists, otherwise in the user home directory. @exception IOException if an error occured when writing the file or if is impossible to write the file at all available locations. @see #load 
public	TokenNamepublic	
void	TokenNamevoid	
save	TokenNameIdentifier	 save
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
FileOutputStream	TokenNameIdentifier	 File Output Stream
fos	TokenNameIdentifier	 fos
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
fullName	TokenNameIdentifier	 full Name
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
try	TokenNametry	
{	TokenNameLBRACE	
fos	TokenNameIdentifier	 fos
=	TokenNameEQUAL	
new	TokenNamenew	
FileOutputStream	TokenNameIdentifier	 File Output Stream
(	TokenNameLPAREN	
fullName	TokenNameIdentifier	 full Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
IOException	TokenNameIdentifier	 IO Exception
e1	TokenNameIdentifier	 e1
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fullName	TokenNameIdentifier	 full Name
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
fullName	TokenNameIdentifier	 full Name
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
PREF_DIR	TokenNameIdentifier	 PREF  DIR
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
fos	TokenNameIdentifier	 fos
=	TokenNameEQUAL	
new	TokenNamenew	
FileOutputStream	TokenNameIdentifier	 File Output Stream
(	TokenNameLPAREN	
fullName	TokenNameIdentifier	 full Name
=	TokenNameEQUAL	
PREF_DIR	TokenNameIdentifier	 PREF  DIR
+	TokenNamePLUS	
FILE_SEP	TokenNameIdentifier	 FILE  SEP
+	TokenNamePLUS	
prefFileName	TokenNameIdentifier	 pref File Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
IOException	TokenNameIdentifier	 IO Exception
e2	TokenNameIdentifier	 e2
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fullName	TokenNameIdentifier	 full Name
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
fullName	TokenNameIdentifier	 full Name
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
fos	TokenNameIdentifier	 fos
=	TokenNameEQUAL	
new	TokenNamenew	
FileOutputStream	TokenNameIdentifier	 File Output Stream
(	TokenNameLPAREN	
fullName	TokenNameIdentifier	 full Name
=	TokenNameEQUAL	
USER_HOME	TokenNameIdentifier	 USER  HOME
+	TokenNamePLUS	
FILE_SEP	TokenNameIdentifier	 FILE  SEP
+	TokenNamePLUS	
prefFileName	TokenNameIdentifier	 pref File Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
IOException	TokenNameIdentifier	 IO Exception
e3	TokenNameIdentifier	 e3
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fullName	TokenNameIdentifier	 full Name
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
throw	TokenNamethrow	
e3	TokenNameIdentifier	 e3
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
internal	TokenNameIdentifier	 internal
.	TokenNameDOT	
store	TokenNameIdentifier	 store
(	TokenNameLPAREN	
fos	TokenNameIdentifier	 fos
,	TokenNameCOMMA	
prefFileName	TokenNameIdentifier	 pref File Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
finally	TokenNamefinally	
{	TokenNameLBRACE	
fos	TokenNameIdentifier	 fos
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
private	TokenNameprivate	
Object	TokenNameIdentifier	 Object
getDefault	TokenNameIdentifier	 get Default
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
defaults	TokenNameIdentifier	 defaults
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
return	TokenNamereturn	
defaults	TokenNameIdentifier	 defaults
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns a Rectangle preference. */	TokenNameCOMMENT_JAVADOC	 Returns a Rectangle preference. 
public	TokenNamepublic	
Rectangle	TokenNameIdentifier	 Rectangle
getRectangle	TokenNameIdentifier	 get Rectangle
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Rectangle	TokenNameIdentifier	 Rectangle
defaultValue	TokenNameIdentifier	 default Value
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Rectangle	TokenNameIdentifier	 Rectangle
)	TokenNameRPAREN	
getDefault	TokenNameIdentifier	 get Default
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
sp	TokenNameIdentifier	 sp
=	TokenNameEQUAL	
internal	TokenNameIdentifier	 internal
.	TokenNameDOT	
getProperty	TokenNameIdentifier	 get Property
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
sp	TokenNameIdentifier	 sp
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
defaultValue	TokenNameIdentifier	 default Value
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
Rectangle	TokenNameIdentifier	 Rectangle
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
new	TokenNamenew	
Rectangle	TokenNameIdentifier	 Rectangle
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
int	TokenNameint	
x	TokenNameIdentifier	 x
,	TokenNameCOMMA	
y	TokenNameIdentifier	 y
,	TokenNameCOMMA	
w	TokenNameIdentifier	 w
,	TokenNameCOMMA	
h	TokenNameIdentifier	 h
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
token	TokenNameIdentifier	 token
;	TokenNameSEMICOLON	
StringTokenizer	TokenNameIdentifier	 String Tokenizer
st	TokenNameIdentifier	 st
=	TokenNameEQUAL	
new	TokenNamenew	
StringTokenizer	TokenNameIdentifier	 String Tokenizer
(	TokenNameLPAREN	
sp	TokenNameIdentifier	 sp
,	TokenNameCOMMA	
" "	TokenNameStringLiteral	 
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
st	TokenNameIdentifier	 st
.	TokenNameDOT	
hasMoreTokens	TokenNameIdentifier	 has More Tokens
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// the value is not correctly formated => remove it 	TokenNameCOMMENT_LINE	the value is not correctly formated => remove it 
internal	TokenNameIdentifier	 internal
.	TokenNameDOT	
remove	TokenNameIdentifier	 remove
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
defaultValue	TokenNameIdentifier	 default Value
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
token	TokenNameIdentifier	 token
=	TokenNameEQUAL	
st	TokenNameIdentifier	 st
.	TokenNameDOT	
nextToken	TokenNameIdentifier	 next Token
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
x	TokenNameIdentifier	 x
=	TokenNameEQUAL	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
parseInt	TokenNameIdentifier	 parse Int
(	TokenNameLPAREN	
token	TokenNameIdentifier	 token
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
st	TokenNameIdentifier	 st
.	TokenNameDOT	
hasMoreTokens	TokenNameIdentifier	 has More Tokens
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
internal	TokenNameIdentifier	 internal
.	TokenNameDOT	
remove	TokenNameIdentifier	 remove
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
defaultValue	TokenNameIdentifier	 default Value
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
token	TokenNameIdentifier	 token
=	TokenNameEQUAL	
st	TokenNameIdentifier	 st
.	TokenNameDOT	
nextToken	TokenNameIdentifier	 next Token
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
y	TokenNameIdentifier	 y
=	TokenNameEQUAL	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
parseInt	TokenNameIdentifier	 parse Int
(	TokenNameLPAREN	
token	TokenNameIdentifier	 token
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
st	TokenNameIdentifier	 st
.	TokenNameDOT	
hasMoreTokens	TokenNameIdentifier	 has More Tokens
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
internal	TokenNameIdentifier	 internal
.	TokenNameDOT	
remove	TokenNameIdentifier	 remove
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
defaultValue	TokenNameIdentifier	 default Value
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
token	TokenNameIdentifier	 token
=	TokenNameEQUAL	
st	TokenNameIdentifier	 st
.	TokenNameDOT	
nextToken	TokenNameIdentifier	 next Token
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
w	TokenNameIdentifier	 w
=	TokenNameEQUAL	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
parseInt	TokenNameIdentifier	 parse Int
(	TokenNameLPAREN	
token	TokenNameIdentifier	 token
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
st	TokenNameIdentifier	 st
.	TokenNameDOT	
hasMoreTokens	TokenNameIdentifier	 has More Tokens
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
internal	TokenNameIdentifier	 internal
.	TokenNameDOT	
remove	TokenNameIdentifier	 remove
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
defaultValue	TokenNameIdentifier	 default Value
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
token	TokenNameIdentifier	 token
=	TokenNameEQUAL	
st	TokenNameIdentifier	 st
.	TokenNameDOT	
nextToken	TokenNameIdentifier	 next Token
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
h	TokenNameIdentifier	 h
=	TokenNameEQUAL	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
parseInt	TokenNameIdentifier	 parse Int
(	TokenNameLPAREN	
token	TokenNameIdentifier	 token
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
setBounds	TokenNameIdentifier	 set Bounds
(	TokenNameLPAREN	
x	TokenNameIdentifier	 x
,	TokenNameCOMMA	
y	TokenNameIdentifier	 y
,	TokenNameCOMMA	
w	TokenNameIdentifier	 w
,	TokenNameCOMMA	
h	TokenNameIdentifier	 h
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
result	TokenNameIdentifier	 result
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
NumberFormatException	TokenNameIdentifier	 Number Format Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
internal	TokenNameIdentifier	 internal
.	TokenNameDOT	
remove	TokenNameIdentifier	 remove
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
defaultValue	TokenNameIdentifier	 default Value
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Returns a Dimension preference. */	TokenNameCOMMENT_JAVADOC	 Returns a Dimension preference. 
public	TokenNamepublic	
Dimension	TokenNameIdentifier	 Dimension
getDimension	TokenNameIdentifier	 get Dimension
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Dimension	TokenNameIdentifier	 Dimension
defaultValue	TokenNameIdentifier	 default Value
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Dimension	TokenNameIdentifier	 Dimension
)	TokenNameRPAREN	
getDefault	TokenNameIdentifier	 get Default
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
sp	TokenNameIdentifier	 sp
=	TokenNameEQUAL	
internal	TokenNameIdentifier	 internal
.	TokenNameDOT	
getProperty	TokenNameIdentifier	 get Property
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
sp	TokenNameIdentifier	 sp
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
return	TokenNamereturn	
defaultValue	TokenNameIdentifier	 default Value
;	TokenNameSEMICOLON	
Dimension	TokenNameIdentifier	 Dimension
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
new	TokenNamenew	
Dimension	TokenNameIdentifier	 Dimension
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
int	TokenNameint	
w	TokenNameIdentifier	 w
,	TokenNameCOMMA	
h	TokenNameIdentifier	 h
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
token	TokenNameIdentifier	 token
;	TokenNameSEMICOLON	
StringTokenizer	TokenNameIdentifier	 String Tokenizer
st	TokenNameIdentifier	 st
=	TokenNameEQUAL	
new	TokenNamenew	
StringTokenizer	TokenNameIdentifier	 String Tokenizer
(	TokenNameLPAREN	
sp	TokenNameIdentifier	 sp
,	TokenNameCOMMA	
" "	TokenNameStringLiteral	 
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
st	TokenNameIdentifier	 st
.	TokenNameDOT	
hasMoreTokens	TokenNameIdentifier	 has More Tokens
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// the value is not correctly formated => remove it 	TokenNameCOMMENT_LINE	the value is not correctly formated => remove it 
internal	TokenNameIdentifier	 internal
.	TokenNameDOT	
remove	TokenNameIdentifier	 remove
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
defaultValue	TokenNameIdentifier	 default Value
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
token	TokenNameIdentifier	 token
=	TokenNameEQUAL	
st	TokenNameIdentifier	 st
.	TokenNameDOT	
nextToken	TokenNameIdentifier	 next Token
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
w	TokenNameIdentifier	 w
=	TokenNameEQUAL	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
parseInt	TokenNameIdentifier	 parse Int
(	TokenNameLPAREN	
token	TokenNameIdentifier	 token
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
st	TokenNameIdentifier	 st
.	TokenNameDOT	
hasMoreTokens	TokenNameIdentifier	 has More Tokens
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
internal	TokenNameIdentifier	 internal
.	TokenNameDOT	
remove	TokenNameIdentifier	 remove
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
defaultValue	TokenNameIdentifier	 default Value
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
token	TokenNameIdentifier	 token
=	TokenNameEQUAL	
st	TokenNameIdentifier	 st
.	TokenNameDOT	
nextToken	TokenNameIdentifier	 next Token
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
h	TokenNameIdentifier	 h
=	TokenNameEQUAL	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
parseInt	TokenNameIdentifier	 parse Int
(	TokenNameLPAREN	
token	TokenNameIdentifier	 token
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
setSize	TokenNameIdentifier	 set Size
(	TokenNameLPAREN	
w	TokenNameIdentifier	 w
,	TokenNameCOMMA	
h	TokenNameIdentifier	 h
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
result	TokenNameIdentifier	 result
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
NumberFormatException	TokenNameIdentifier	 Number Format Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
internal	TokenNameIdentifier	 internal
.	TokenNameDOT	
remove	TokenNameIdentifier	 remove
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
defaultValue	TokenNameIdentifier	 default Value
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Returns a point preference. */	TokenNameCOMMENT_JAVADOC	 Returns a point preference. 
public	TokenNamepublic	
Point	TokenNameIdentifier	 Point
getPoint	TokenNameIdentifier	 get Point
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Point	TokenNameIdentifier	 Point
defaultValue	TokenNameIdentifier	 default Value
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Point	TokenNameIdentifier	 Point
)	TokenNameRPAREN	
getDefault	TokenNameIdentifier	 get Default
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
sp	TokenNameIdentifier	 sp
=	TokenNameEQUAL	
internal	TokenNameIdentifier	 internal
.	TokenNameDOT	
getProperty	TokenNameIdentifier	 get Property
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
sp	TokenNameIdentifier	 sp
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
defaultValue	TokenNameIdentifier	 default Value
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
Point	TokenNameIdentifier	 Point
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
new	TokenNamenew	
Point	TokenNameIdentifier	 Point
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
int	TokenNameint	
x	TokenNameIdentifier	 x
,	TokenNameCOMMA	
y	TokenNameIdentifier	 y
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
token	TokenNameIdentifier	 token
;	TokenNameSEMICOLON	
StringTokenizer	TokenNameIdentifier	 String Tokenizer
st	TokenNameIdentifier	 st
=	TokenNameEQUAL	
new	TokenNamenew	
StringTokenizer	TokenNameIdentifier	 String Tokenizer
(	TokenNameLPAREN	
sp	TokenNameIdentifier	 sp
,	TokenNameCOMMA	
" "	TokenNameStringLiteral	 
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
st	TokenNameIdentifier	 st
.	TokenNameDOT	
hasMoreTokens	TokenNameIdentifier	 has More Tokens
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// the value is not correctly formated => remove it 	TokenNameCOMMENT_LINE	the value is not correctly formated => remove it 
internal	TokenNameIdentifier	 internal
.	TokenNameDOT	
remove	TokenNameIdentifier	 remove
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
defaultValue	TokenNameIdentifier	 default Value
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
token	TokenNameIdentifier	 token
=	TokenNameEQUAL	
st	TokenNameIdentifier	 st
.	TokenNameDOT	
nextToken	TokenNameIdentifier	 next Token
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
x	TokenNameIdentifier	 x
=	TokenNameEQUAL	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
parseInt	TokenNameIdentifier	 parse Int
(	TokenNameLPAREN	
token	TokenNameIdentifier	 token
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
st	TokenNameIdentifier	 st
.	TokenNameDOT	
hasMoreTokens	TokenNameIdentifier	 has More Tokens
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
internal	TokenNameIdentifier	 internal
.	TokenNameDOT	
remove	TokenNameIdentifier	 remove
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
defaultValue	TokenNameIdentifier	 default Value
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
token	TokenNameIdentifier	 token
=	TokenNameEQUAL	
st	TokenNameIdentifier	 st
.	TokenNameDOT	
nextToken	TokenNameIdentifier	 next Token
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
y	TokenNameIdentifier	 y
=	TokenNameEQUAL	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
parseInt	TokenNameIdentifier	 parse Int
(	TokenNameLPAREN	
token	TokenNameIdentifier	 token
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
st	TokenNameIdentifier	 st
.	TokenNameDOT	
hasMoreTokens	TokenNameIdentifier	 has More Tokens
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
internal	TokenNameIdentifier	 internal
.	TokenNameDOT	
remove	TokenNameIdentifier	 remove
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
defaultValue	TokenNameIdentifier	 default Value
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
setLocation	TokenNameIdentifier	 set Location
(	TokenNameLPAREN	
x	TokenNameIdentifier	 x
,	TokenNameCOMMA	
y	TokenNameIdentifier	 y
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
result	TokenNameIdentifier	 result
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
NumberFormatException	TokenNameIdentifier	 Number Format Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
internal	TokenNameIdentifier	 internal
.	TokenNameDOT	
remove	TokenNameIdentifier	 remove
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
defaultValue	TokenNameIdentifier	 default Value
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Retruns a Color preference. */	TokenNameCOMMENT_JAVADOC	 Retruns a Color preference. 
public	TokenNamepublic	
Color	TokenNameIdentifier	 Color
getColor	TokenNameIdentifier	 get Color
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Color	TokenNameIdentifier	 Color
defaultValue	TokenNameIdentifier	 default Value
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Color	TokenNameIdentifier	 Color
)	TokenNameRPAREN	
getDefault	TokenNameIdentifier	 get Default
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
sp	TokenNameIdentifier	 sp
=	TokenNameEQUAL	
internal	TokenNameIdentifier	 internal
.	TokenNameDOT	
getProperty	TokenNameIdentifier	 get Property
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
sp	TokenNameIdentifier	 sp
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
defaultValue	TokenNameIdentifier	 default Value
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
int	TokenNameint	
r	TokenNameIdentifier	 r
,	TokenNameCOMMA	
g	TokenNameIdentifier	 g
,	TokenNameCOMMA	
b	TokenNameIdentifier	 b
,	TokenNameCOMMA	
a	TokenNameIdentifier	 a
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
token	TokenNameIdentifier	 token
;	TokenNameSEMICOLON	
StringTokenizer	TokenNameIdentifier	 String Tokenizer
st	TokenNameIdentifier	 st
=	TokenNameEQUAL	
new	TokenNamenew	
StringTokenizer	TokenNameIdentifier	 String Tokenizer
(	TokenNameLPAREN	
sp	TokenNameIdentifier	 sp
,	TokenNameCOMMA	
" "	TokenNameStringLiteral	 
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
st	TokenNameIdentifier	 st
.	TokenNameDOT	
hasMoreTokens	TokenNameIdentifier	 has More Tokens
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// the value is not correctly formated => remove it 	TokenNameCOMMENT_LINE	the value is not correctly formated => remove it 
internal	TokenNameIdentifier	 internal
.	TokenNameDOT	
remove	TokenNameIdentifier	 remove
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
defaultValue	TokenNameIdentifier	 default Value
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
token	TokenNameIdentifier	 token
=	TokenNameEQUAL	
st	TokenNameIdentifier	 st
.	TokenNameDOT	
nextToken	TokenNameIdentifier	 next Token
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
r	TokenNameIdentifier	 r
=	TokenNameEQUAL	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
parseInt	TokenNameIdentifier	 parse Int
(	TokenNameLPAREN	
token	TokenNameIdentifier	 token
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
st	TokenNameIdentifier	 st
.	TokenNameDOT	
hasMoreTokens	TokenNameIdentifier	 has More Tokens
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
internal	TokenNameIdentifier	 internal
.	TokenNameDOT	
remove	TokenNameIdentifier	 remove
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
defaultValue	TokenNameIdentifier	 default Value
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
token	TokenNameIdentifier	 token
=	TokenNameEQUAL	
st	TokenNameIdentifier	 st
.	TokenNameDOT	
nextToken	TokenNameIdentifier	 next Token
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
g	TokenNameIdentifier	 g
=	TokenNameEQUAL	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
parseInt	TokenNameIdentifier	 parse Int
(	TokenNameLPAREN	
token	TokenNameIdentifier	 token
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
st	TokenNameIdentifier	 st
.	TokenNameDOT	
hasMoreTokens	TokenNameIdentifier	 has More Tokens
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
internal	TokenNameIdentifier	 internal
.	TokenNameDOT	
remove	TokenNameIdentifier	 remove
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
defaultValue	TokenNameIdentifier	 default Value
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
token	TokenNameIdentifier	 token
=	TokenNameEQUAL	
st	TokenNameIdentifier	 st
.	TokenNameDOT	
nextToken	TokenNameIdentifier	 next Token
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
b	TokenNameIdentifier	 b
=	TokenNameEQUAL	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
parseInt	TokenNameIdentifier	 parse Int
(	TokenNameLPAREN	
token	TokenNameIdentifier	 token
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
st	TokenNameIdentifier	 st
.	TokenNameDOT	
hasMoreTokens	TokenNameIdentifier	 has More Tokens
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
internal	TokenNameIdentifier	 internal
.	TokenNameDOT	
remove	TokenNameIdentifier	 remove
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
defaultValue	TokenNameIdentifier	 default Value
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
token	TokenNameIdentifier	 token
=	TokenNameEQUAL	
st	TokenNameIdentifier	 st
.	TokenNameDOT	
nextToken	TokenNameIdentifier	 next Token
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
a	TokenNameIdentifier	 a
=	TokenNameEQUAL	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
parseInt	TokenNameIdentifier	 parse Int
(	TokenNameLPAREN	
token	TokenNameIdentifier	 token
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
new	TokenNamenew	
Color	TokenNameIdentifier	 Color
(	TokenNameLPAREN	
r	TokenNameIdentifier	 r
,	TokenNameCOMMA	
g	TokenNameIdentifier	 g
,	TokenNameCOMMA	
b	TokenNameIdentifier	 b
,	TokenNameCOMMA	
a	TokenNameIdentifier	 a
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
NumberFormatException	TokenNameIdentifier	 Number Format Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
internal	TokenNameIdentifier	 internal
.	TokenNameDOT	
remove	TokenNameIdentifier	 remove
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
defaultValue	TokenNameIdentifier	 default Value
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Returns a font preference. */	TokenNameCOMMENT_JAVADOC	 Returns a font preference. 
public	TokenNamepublic	
Font	TokenNameIdentifier	 Font
getFont	TokenNameIdentifier	 get Font
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Font	TokenNameIdentifier	 Font
defaultValue	TokenNameIdentifier	 default Value
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Font	TokenNameIdentifier	 Font
)	TokenNameRPAREN	
getDefault	TokenNameIdentifier	 get Default
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
sp	TokenNameIdentifier	 sp
=	TokenNameEQUAL	
internal	TokenNameIdentifier	 internal
.	TokenNameDOT	
getProperty	TokenNameIdentifier	 get Property
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
sp	TokenNameIdentifier	 sp
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
defaultValue	TokenNameIdentifier	 default Value
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
int	TokenNameint	
size	TokenNameIdentifier	 size
,	TokenNameCOMMA	
type	TokenNameIdentifier	 type
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
token	TokenNameIdentifier	 token
;	TokenNameSEMICOLON	
StringTokenizer	TokenNameIdentifier	 String Tokenizer
st	TokenNameIdentifier	 st
=	TokenNameEQUAL	
new	TokenNamenew	
StringTokenizer	TokenNameIdentifier	 String Tokenizer
(	TokenNameLPAREN	
sp	TokenNameIdentifier	 sp
,	TokenNameCOMMA	
" "	TokenNameStringLiteral	 
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
st	TokenNameIdentifier	 st
.	TokenNameDOT	
hasMoreTokens	TokenNameIdentifier	 has More Tokens
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// the value is not correctly formated => remove it 	TokenNameCOMMENT_LINE	the value is not correctly formated => remove it 
internal	TokenNameIdentifier	 internal
.	TokenNameDOT	
remove	TokenNameIdentifier	 remove
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
defaultValue	TokenNameIdentifier	 default Value
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
name	TokenNameIdentifier	 name
=	TokenNameEQUAL	
st	TokenNameIdentifier	 st
.	TokenNameDOT	
nextToken	TokenNameIdentifier	 next Token
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
st	TokenNameIdentifier	 st
.	TokenNameDOT	
hasMoreTokens	TokenNameIdentifier	 has More Tokens
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
internal	TokenNameIdentifier	 internal
.	TokenNameDOT	
remove	TokenNameIdentifier	 remove
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
defaultValue	TokenNameIdentifier	 default Value
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
token	TokenNameIdentifier	 token
=	TokenNameEQUAL	
st	TokenNameIdentifier	 st
.	TokenNameDOT	
nextToken	TokenNameIdentifier	 next Token
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
size	TokenNameIdentifier	 size
=	TokenNameEQUAL	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
parseInt	TokenNameIdentifier	 parse Int
(	TokenNameLPAREN	
token	TokenNameIdentifier	 token
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
st	TokenNameIdentifier	 st
.	TokenNameDOT	
hasMoreTokens	TokenNameIdentifier	 has More Tokens
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
internal	TokenNameIdentifier	 internal
.	TokenNameDOT	
remove	TokenNameIdentifier	 remove
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
defaultValue	TokenNameIdentifier	 default Value
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
token	TokenNameIdentifier	 token
=	TokenNameEQUAL	
st	TokenNameIdentifier	 st
.	TokenNameDOT	
nextToken	TokenNameIdentifier	 next Token
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
parseInt	TokenNameIdentifier	 parse Int
(	TokenNameLPAREN	
token	TokenNameIdentifier	 token
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
new	TokenNamenew	
Font	TokenNameIdentifier	 Font
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
type	TokenNameIdentifier	 type
,	TokenNameCOMMA	
size	TokenNameIdentifier	 size
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
NumberFormatException	TokenNameIdentifier	 Number Format Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
internal	TokenNameIdentifier	 internal
.	TokenNameDOT	
remove	TokenNameIdentifier	 remove
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
defaultValue	TokenNameIdentifier	 default Value
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Returns a String preference. */	TokenNameCOMMENT_JAVADOC	 Returns a String preference. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getString	TokenNameIdentifier	 get String
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
sp	TokenNameIdentifier	 sp
=	TokenNameEQUAL	
internal	TokenNameIdentifier	 internal
.	TokenNameDOT	
getProperty	TokenNameIdentifier	 get Property
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
sp	TokenNameIdentifier	 sp
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
sp	TokenNameIdentifier	 sp
=	TokenNameEQUAL	
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
)	TokenNameRPAREN	
getDefault	TokenNameIdentifier	 get Default
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
sp	TokenNameIdentifier	 sp
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns an array of String preference. */	TokenNameCOMMENT_JAVADOC	 Returns an array of String preference. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
getStrings	TokenNameIdentifier	 get Strings
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
mkey	TokenNameIdentifier	 mkey
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
last	TokenNameIdentifier	 last
;	TokenNameSEMICOLON	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
ArrayList	TokenNameIdentifier	 Array List
v	TokenNameIdentifier	 v
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
last	TokenNameIdentifier	 last
=	TokenNameEQUAL	
getString	TokenNameIdentifier	 get String
(	TokenNameLPAREN	
mkey	TokenNameIdentifier	 mkey
+	TokenNamePLUS	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
last	TokenNameIdentifier	 last
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
v	TokenNameIdentifier	 v
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
last	TokenNameIdentifier	 last
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
v	TokenNameIdentifier	 v
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
str	TokenNameIdentifier	 str
=	TokenNameEQUAL	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
v	TokenNameIdentifier	 v
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
v	TokenNameIdentifier	 v
.	TokenNameDOT	
toArray	TokenNameIdentifier	 to Array
(	TokenNameLPAREN	
str	TokenNameIdentifier	 str
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
getDefault	TokenNameIdentifier	 get Default
(	TokenNameLPAREN	
mkey	TokenNameIdentifier	 mkey
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Returns an URL preference. */	TokenNameCOMMENT_JAVADOC	 Returns an URL preference. 
public	TokenNamepublic	
URL	TokenNameIdentifier	 URL
getURL	TokenNameIdentifier	 get URL
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
{	TokenNameLBRACE	
URL	TokenNameIdentifier	 URL
defaultValue	TokenNameIdentifier	 default Value
=	TokenNameEQUAL	
(	TokenNameLPAREN	
URL	TokenNameIdentifier	 URL
)	TokenNameRPAREN	
getDefault	TokenNameIdentifier	 get Default
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
sp	TokenNameIdentifier	 sp
=	TokenNameEQUAL	
internal	TokenNameIdentifier	 internal
.	TokenNameDOT	
getProperty	TokenNameIdentifier	 get Property
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
sp	TokenNameIdentifier	 sp
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
defaultValue	TokenNameIdentifier	 default Value
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
URL	TokenNameIdentifier	 URL
url	TokenNameIdentifier	 url
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
url	TokenNameIdentifier	 url
=	TokenNameEQUAL	
new	TokenNamenew	
URL	TokenNameIdentifier	 URL
(	TokenNameLPAREN	
sp	TokenNameIdentifier	 sp
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
MalformedURLException	TokenNameIdentifier	 Malformed URL Exception
ex	TokenNameIdentifier	 ex
)	TokenNameRPAREN	
{	TokenNameLBRACE	
internal	TokenNameIdentifier	 internal
.	TokenNameDOT	
remove	TokenNameIdentifier	 remove
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
defaultValue	TokenNameIdentifier	 default Value
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
url	TokenNameIdentifier	 url
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns an array of URLs preference. */	TokenNameCOMMENT_JAVADOC	 Returns an array of URLs preference. 
public	TokenNamepublic	
URL	TokenNameIdentifier	 URL
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
getURLs	TokenNameIdentifier	 get UR Ls
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
mkey	TokenNameIdentifier	 mkey
)	TokenNameRPAREN	
{	TokenNameLBRACE	
URL	TokenNameIdentifier	 URL
last	TokenNameIdentifier	 last
;	TokenNameSEMICOLON	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
ArrayList	TokenNameIdentifier	 Array List
v	TokenNameIdentifier	 v
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
last	TokenNameIdentifier	 last
=	TokenNameEQUAL	
getURL	TokenNameIdentifier	 get URL
(	TokenNameLPAREN	
mkey	TokenNameIdentifier	 mkey
+	TokenNamePLUS	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
last	TokenNameIdentifier	 last
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
v	TokenNameIdentifier	 v
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
last	TokenNameIdentifier	 last
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
v	TokenNameIdentifier	 v
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
URL	TokenNameIdentifier	 URL
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
path	TokenNameIdentifier	 path
=	TokenNameEQUAL	
new	TokenNamenew	
URL	TokenNameIdentifier	 URL
[	TokenNameLBRACKET	
v	TokenNameIdentifier	 v
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
(	TokenNameLPAREN	
URL	TokenNameIdentifier	 URL
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
v	TokenNameIdentifier	 v
.	TokenNameDOT	
toArray	TokenNameIdentifier	 to Array
(	TokenNameLPAREN	
path	TokenNameIdentifier	 path
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
URL	TokenNameIdentifier	 URL
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
getDefault	TokenNameIdentifier	 get Default
(	TokenNameLPAREN	
mkey	TokenNameIdentifier	 mkey
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Returns a File preference. */	TokenNameCOMMENT_JAVADOC	 Returns a File preference. 
public	TokenNamepublic	
File	TokenNameIdentifier	 File
getFile	TokenNameIdentifier	 get File
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
{	TokenNameLBRACE	
File	TokenNameIdentifier	 File
defaultValue	TokenNameIdentifier	 default Value
=	TokenNameEQUAL	
(	TokenNameLPAREN	
File	TokenNameIdentifier	 File
)	TokenNameRPAREN	
getDefault	TokenNameIdentifier	 get Default
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
sp	TokenNameIdentifier	 sp
=	TokenNameEQUAL	
internal	TokenNameIdentifier	 internal
.	TokenNameDOT	
getProperty	TokenNameIdentifier	 get Property
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
sp	TokenNameIdentifier	 sp
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
defaultValue	TokenNameIdentifier	 default Value
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
File	TokenNameIdentifier	 File
file	TokenNameIdentifier	 file
=	TokenNameEQUAL	
new	TokenNamenew	
File	TokenNameIdentifier	 File
(	TokenNameLPAREN	
sp	TokenNameIdentifier	 sp
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
file	TokenNameIdentifier	 file
.	TokenNameDOT	
exists	TokenNameIdentifier	 exists
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
file	TokenNameIdentifier	 file
;	TokenNameSEMICOLON	
else	TokenNameelse	
{	TokenNameLBRACE	
internal	TokenNameIdentifier	 internal
.	TokenNameDOT	
remove	TokenNameIdentifier	 remove
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
defaultValue	TokenNameIdentifier	 default Value
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Returns an array of Files preference. */	TokenNameCOMMENT_JAVADOC	 Returns an array of Files preference. 
public	TokenNamepublic	
File	TokenNameIdentifier	 File
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
getFiles	TokenNameIdentifier	 get Files
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
mkey	TokenNameIdentifier	 mkey
)	TokenNameRPAREN	
{	TokenNameLBRACE	
File	TokenNameIdentifier	 File
last	TokenNameIdentifier	 last
;	TokenNameSEMICOLON	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
ArrayList	TokenNameIdentifier	 Array List
v	TokenNameIdentifier	 v
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
last	TokenNameIdentifier	 last
=	TokenNameEQUAL	
getFile	TokenNameIdentifier	 get File
(	TokenNameLPAREN	
mkey	TokenNameIdentifier	 mkey
+	TokenNamePLUS	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
last	TokenNameIdentifier	 last
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
v	TokenNameIdentifier	 v
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
last	TokenNameIdentifier	 last
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
v	TokenNameIdentifier	 v
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
File	TokenNameIdentifier	 File
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
path	TokenNameIdentifier	 path
=	TokenNameEQUAL	
new	TokenNamenew	
File	TokenNameIdentifier	 File
[	TokenNameLBRACKET	
v	TokenNameIdentifier	 v
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
(	TokenNameLPAREN	
File	TokenNameIdentifier	 File
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
v	TokenNameIdentifier	 v
.	TokenNameDOT	
toArray	TokenNameIdentifier	 to Array
(	TokenNameLPAREN	
path	TokenNameIdentifier	 path
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
File	TokenNameIdentifier	 File
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
getDefault	TokenNameIdentifier	 get Default
(	TokenNameLPAREN	
mkey	TokenNameIdentifier	 mkey
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Gets an int preference. */	TokenNameCOMMENT_JAVADOC	 Gets an int preference. 
public	TokenNamepublic	
int	TokenNameint	
getInteger	TokenNameIdentifier	 get Integer
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
defaultValue	TokenNameIdentifier	 default Value
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
getDefault	TokenNameIdentifier	 get Default
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
defaultValue	TokenNameIdentifier	 default Value
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
Integer	TokenNameIdentifier	 Integer
)	TokenNameRPAREN	
getDefault	TokenNameIdentifier	 get Default
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
intValue	TokenNameIdentifier	 int Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
sp	TokenNameIdentifier	 sp
=	TokenNameEQUAL	
internal	TokenNameIdentifier	 internal
.	TokenNameDOT	
getProperty	TokenNameIdentifier	 get Property
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
sp	TokenNameIdentifier	 sp
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
defaultValue	TokenNameIdentifier	 default Value
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
int	TokenNameint	
value	TokenNameIdentifier	 value
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
value	TokenNameIdentifier	 value
=	TokenNameEQUAL	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
parseInt	TokenNameIdentifier	 parse Int
(	TokenNameLPAREN	
sp	TokenNameIdentifier	 sp
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
NumberFormatException	TokenNameIdentifier	 Number Format Exception
ex	TokenNameIdentifier	 ex
)	TokenNameRPAREN	
{	TokenNameLBRACE	
internal	TokenNameIdentifier	 internal
.	TokenNameDOT	
remove	TokenNameIdentifier	 remove
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
defaultValue	TokenNameIdentifier	 default Value
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
value	TokenNameIdentifier	 value
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Gets a float preference. */	TokenNameCOMMENT_JAVADOC	 Gets a float preference. 
public	TokenNamepublic	
float	TokenNamefloat	
getFloat	TokenNameIdentifier	 get Float
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
{	TokenNameLBRACE	
float	TokenNamefloat	
defaultValue	TokenNameIdentifier	 default Value
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
getDefault	TokenNameIdentifier	 get Default
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
defaultValue	TokenNameIdentifier	 default Value
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
Float	TokenNameIdentifier	 Float
)	TokenNameRPAREN	
getDefault	TokenNameIdentifier	 get Default
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
floatValue	TokenNameIdentifier	 float Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
sp	TokenNameIdentifier	 sp
=	TokenNameEQUAL	
internal	TokenNameIdentifier	 internal
.	TokenNameDOT	
getProperty	TokenNameIdentifier	 get Property
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
sp	TokenNameIdentifier	 sp
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
defaultValue	TokenNameIdentifier	 default Value
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
float	TokenNamefloat	
value	TokenNameIdentifier	 value
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
value	TokenNameIdentifier	 value
=	TokenNameEQUAL	
Float	TokenNameIdentifier	 Float
.	TokenNameDOT	
parseFloat	TokenNameIdentifier	 parse Float
(	TokenNameLPAREN	
sp	TokenNameIdentifier	 sp
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
NumberFormatException	TokenNameIdentifier	 Number Format Exception
ex	TokenNameIdentifier	 ex
)	TokenNameRPAREN	
{	TokenNameLBRACE	
setFloat	TokenNameIdentifier	 set Float
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
,	TokenNameCOMMA	
defaultValue	TokenNameIdentifier	 default Value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
defaultValue	TokenNameIdentifier	 default Value
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
value	TokenNameIdentifier	 value
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Gets a boolean preference. If not found and no default returns false. */	TokenNameCOMMENT_JAVADOC	 Gets a boolean preference. If not found and no default returns false. 
public	TokenNamepublic	
boolean	TokenNameboolean	
getBoolean	TokenNameIdentifier	 get Boolean
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
internal	TokenNameIdentifier	 internal
.	TokenNameDOT	
getProperty	TokenNameIdentifier	 get Property
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
return	TokenNamereturn	
internal	TokenNameIdentifier	 internal
.	TokenNameDOT	
getProperty	TokenNameIdentifier	 get Property
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
"true"	TokenNameStringLiteral	true
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
getDefault	TokenNameIdentifier	 get Default
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
return	TokenNamereturn	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
Boolean	TokenNameIdentifier	 Boolean
)	TokenNameRPAREN	
getDefault	TokenNameIdentifier	 get Default
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
booleanValue	TokenNameIdentifier	 boolean Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sets a Rectangle preference. If null removes it. */	TokenNameCOMMENT_JAVADOC	 Sets a Rectangle preference. If null removes it. 
public	TokenNamepublic	
void	TokenNamevoid	
setRectangle	TokenNameIdentifier	 set Rectangle
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
key	TokenNameIdentifier	 key
,	TokenNameCOMMA	
Rectangle	TokenNameIdentifier	 Rectangle
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
!	TokenNameNOT	
value	TokenNameIdentifier	 value
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
getDefault	TokenNameIdentifier	 get Default
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
internal	TokenNameIdentifier	 internal
.	TokenNameDOT	
setProperty	TokenNameIdentifier	 set Property
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
,	TokenNameCOMMA	
value	TokenNameIdentifier	 value
.	TokenNameDOT	
x	TokenNameIdentifier	 x
+	TokenNamePLUS	
" "	TokenNameStringLiteral	 
+	TokenNamePLUS	
value	TokenNameIdentifier	 value
.	TokenNameDOT	
y	TokenNameIdentifier	 y
+	TokenNamePLUS	
" "	TokenNameStringLiteral	 
+	TokenNamePLUS	
value	TokenNameIdentifier	 value
.	TokenNameDOT	
width	TokenNameIdentifier	 width
+	TokenNamePLUS	
' '	TokenNameCharacterLiteral	
+	TokenNamePLUS	
value	TokenNameIdentifier	 value
.	TokenNameDOT	
height	TokenNameIdentifier	 height
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
internal	TokenNameIdentifier	 internal
.	TokenNameDOT	
remove	TokenNameIdentifier	 remove
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sets a Dimension preference. If null removes it. */	TokenNameCOMMENT_JAVADOC	 Sets a Dimension preference. If null removes it. 
public	TokenNamepublic	
void	TokenNamevoid	
setDimension	TokenNameIdentifier	 set Dimension
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
key	TokenNameIdentifier	 key
,	TokenNameCOMMA	
Dimension	TokenNameIdentifier	 Dimension
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
!	TokenNameNOT	
value	TokenNameIdentifier	 value
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
getDefault	TokenNameIdentifier	 get Default
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
internal	TokenNameIdentifier	 internal
.	TokenNameDOT	
setProperty	TokenNameIdentifier	 set Property
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
,	TokenNameCOMMA	
value	TokenNameIdentifier	 value
.	TokenNameDOT	
width	TokenNameIdentifier	 width
+	TokenNamePLUS	
" "	TokenNameStringLiteral	 
+	TokenNamePLUS	
value	TokenNameIdentifier	 value
.	TokenNameDOT	
height	TokenNameIdentifier	 height
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
internal	TokenNameIdentifier	 internal
.	TokenNameDOT	
remove	TokenNameIdentifier	 remove
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sets a Point preference. If null removes it. */	TokenNameCOMMENT_JAVADOC	 Sets a Point preference. If null removes it. 
public	TokenNamepublic	
void	TokenNamevoid	
setPoint	TokenNameIdentifier	 set Point
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
key	TokenNameIdentifier	 key
,	TokenNameCOMMA	
Point	TokenNameIdentifier	 Point
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
!	TokenNameNOT	
value	TokenNameIdentifier	 value
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
getDefault	TokenNameIdentifier	 get Default
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
internal	TokenNameIdentifier	 internal
.	TokenNameDOT	
setProperty	TokenNameIdentifier	 set Property
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
,	TokenNameCOMMA	
value	TokenNameIdentifier	 value
.	TokenNameDOT	
x	TokenNameIdentifier	 x
+	TokenNamePLUS	
" "	TokenNameStringLiteral	 
+	TokenNamePLUS	
value	TokenNameIdentifier	 value
.	TokenNameDOT	
y	TokenNameIdentifier	 y
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
internal	TokenNameIdentifier	 internal
.	TokenNameDOT	
remove	TokenNameIdentifier	 remove
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sets a Color preference. If null removes it. */	TokenNameCOMMENT_JAVADOC	 Sets a Color preference. If null removes it. 
public	TokenNamepublic	
void	TokenNamevoid	
setColor	TokenNameIdentifier	 set Color
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
key	TokenNameIdentifier	 key
,	TokenNameCOMMA	
Color	TokenNameIdentifier	 Color
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
!	TokenNameNOT	
value	TokenNameIdentifier	 value
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
getDefault	TokenNameIdentifier	 get Default
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
internal	TokenNameIdentifier	 internal
.	TokenNameDOT	
setProperty	TokenNameIdentifier	 set Property
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
,	TokenNameCOMMA	
value	TokenNameIdentifier	 value
.	TokenNameDOT	
getRed	TokenNameIdentifier	 get Red
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
" "	TokenNameStringLiteral	 
+	TokenNamePLUS	
value	TokenNameIdentifier	 value
.	TokenNameDOT	
getGreen	TokenNameIdentifier	 get Green
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
" "	TokenNameStringLiteral	 
+	TokenNamePLUS	
value	TokenNameIdentifier	 value
.	TokenNameDOT	
getBlue	TokenNameIdentifier	 get Blue
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
" "	TokenNameStringLiteral	 
+	TokenNamePLUS	
value	TokenNameIdentifier	 value
.	TokenNameDOT	
getAlpha	TokenNameIdentifier	 get Alpha
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
internal	TokenNameIdentifier	 internal
.	TokenNameDOT	
remove	TokenNameIdentifier	 remove
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sets a Font preference. If null removes it. */	TokenNameCOMMENT_JAVADOC	 Sets a Font preference. If null removes it. 
public	TokenNamepublic	
void	TokenNamevoid	
setFont	TokenNameIdentifier	 set Font
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
key	TokenNameIdentifier	 key
,	TokenNameCOMMA	
Font	TokenNameIdentifier	 Font
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
!	TokenNameNOT	
value	TokenNameIdentifier	 value
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
getDefault	TokenNameIdentifier	 get Default
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
internal	TokenNameIdentifier	 internal
.	TokenNameDOT	
setProperty	TokenNameIdentifier	 set Property
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
,	TokenNameCOMMA	
value	TokenNameIdentifier	 value
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
" "	TokenNameStringLiteral	 
+	TokenNamePLUS	
value	TokenNameIdentifier	 value
.	TokenNameDOT	
getSize	TokenNameIdentifier	 get Size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
" "	TokenNameStringLiteral	 
+	TokenNamePLUS	
value	TokenNameIdentifier	 value
.	TokenNameDOT	
getStyle	TokenNameIdentifier	 get Style
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
internal	TokenNameIdentifier	 internal
.	TokenNameDOT	
remove	TokenNameIdentifier	 remove
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sets a String preference. If null removes it. */	TokenNameCOMMENT_JAVADOC	 Sets a String preference. If null removes it. 
public	TokenNamepublic	
void	TokenNamevoid	
setString	TokenNameIdentifier	 set String
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
key	TokenNameIdentifier	 key
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
!	TokenNameNOT	
value	TokenNameIdentifier	 value
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
getDefault	TokenNameIdentifier	 get Default
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
internal	TokenNameIdentifier	 internal
.	TokenNameDOT	
setProperty	TokenNameIdentifier	 set Property
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
,	TokenNameCOMMA	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
internal	TokenNameIdentifier	 internal
.	TokenNameDOT	
remove	TokenNameIdentifier	 remove
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sets a String array preference. If null or size null removes * previous preference. */	TokenNameCOMMENT_JAVADOC	 Sets a String array preference. If null or size null removes previous preference. 
public	TokenNamepublic	
void	TokenNamevoid	
setStrings	TokenNameIdentifier	 set Strings
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
mkey	TokenNameIdentifier	 mkey
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
values	TokenNameIdentifier	 values
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
j	TokenNameIdentifier	 j
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
values	TokenNameIdentifier	 values
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
values	TokenNameIdentifier	 values
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
values	TokenNameIdentifier	 values
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
setString	TokenNameIdentifier	 set String
(	TokenNameLPAREN	
mkey	TokenNameIdentifier	 mkey
+	TokenNamePLUS	
j	TokenNameIdentifier	 j
,	TokenNameCOMMA	
values	TokenNameIdentifier	 values
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// erase other elements 	TokenNameCOMMENT_LINE	erase other elements 
String	TokenNameIdentifier	 String
last	TokenNameIdentifier	 last
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
last	TokenNameIdentifier	 last
=	TokenNameEQUAL	
getString	TokenNameIdentifier	 get String
(	TokenNameLPAREN	
mkey	TokenNameIdentifier	 mkey
+	TokenNamePLUS	
j	TokenNameIdentifier	 j
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
last	TokenNameIdentifier	 last
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
setString	TokenNameIdentifier	 set String
(	TokenNameLPAREN	
mkey	TokenNameIdentifier	 mkey
+	TokenNamePLUS	
j	TokenNameIdentifier	 j
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Sets an URL property. If null removes it. */	TokenNameCOMMENT_JAVADOC	 Sets an URL property. If null removes it. 
public	TokenNamepublic	
void	TokenNamevoid	
setURL	TokenNameIdentifier	 set URL
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
key	TokenNameIdentifier	 key
,	TokenNameCOMMA	
URL	TokenNameIdentifier	 URL
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
!	TokenNameNOT	
value	TokenNameIdentifier	 value
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
getDefault	TokenNameIdentifier	 get Default
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
internal	TokenNameIdentifier	 internal
.	TokenNameDOT	
setProperty	TokenNameIdentifier	 set Property
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
,	TokenNameCOMMA	
value	TokenNameIdentifier	 value
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
internal	TokenNameIdentifier	 internal
.	TokenNameDOT	
remove	TokenNameIdentifier	 remove
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sets an array of URLs property. If null or size null removes * previous preference. */	TokenNameCOMMENT_JAVADOC	 Sets an array of URLs property. If null or size null removes previous preference. 
public	TokenNamepublic	
void	TokenNamevoid	
setURLs	TokenNameIdentifier	 set UR Ls
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
mkey	TokenNameIdentifier	 mkey
,	TokenNameCOMMA	
URL	TokenNameIdentifier	 URL
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
values	TokenNameIdentifier	 values
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
j	TokenNameIdentifier	 j
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
values	TokenNameIdentifier	 values
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
values	TokenNameIdentifier	 values
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
values	TokenNameIdentifier	 values
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
setURL	TokenNameIdentifier	 set URL
(	TokenNameLPAREN	
mkey	TokenNameIdentifier	 mkey
+	TokenNamePLUS	
j	TokenNameIdentifier	 j
,	TokenNameCOMMA	
values	TokenNameIdentifier	 values
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// erase other elements 	TokenNameCOMMENT_LINE	erase other elements 
String	TokenNameIdentifier	 String
last	TokenNameIdentifier	 last
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
last	TokenNameIdentifier	 last
=	TokenNameEQUAL	
getString	TokenNameIdentifier	 get String
(	TokenNameLPAREN	
mkey	TokenNameIdentifier	 mkey
+	TokenNamePLUS	
j	TokenNameIdentifier	 j
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
last	TokenNameIdentifier	 last
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
setString	TokenNameIdentifier	 set String
(	TokenNameLPAREN	
mkey	TokenNameIdentifier	 mkey
+	TokenNamePLUS	
j	TokenNameIdentifier	 j
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Sets a File property. If null removes it. */	TokenNameCOMMENT_JAVADOC	 Sets a File property. If null removes it. 
public	TokenNamepublic	
void	TokenNamevoid	
setFile	TokenNameIdentifier	 set File
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
key	TokenNameIdentifier	 key
,	TokenNameCOMMA	
File	TokenNameIdentifier	 File
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
!	TokenNameNOT	
value	TokenNameIdentifier	 value
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
getDefault	TokenNameIdentifier	 get Default
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
internal	TokenNameIdentifier	 internal
.	TokenNameDOT	
setProperty	TokenNameIdentifier	 set Property
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
,	TokenNameCOMMA	
value	TokenNameIdentifier	 value
.	TokenNameDOT	
getAbsolutePath	TokenNameIdentifier	 get Absolute Path
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
internal	TokenNameIdentifier	 internal
.	TokenNameDOT	
remove	TokenNameIdentifier	 remove
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sets an array of Files property. If null or size null removes * previous preference. */	TokenNameCOMMENT_JAVADOC	 Sets an array of Files property. If null or size null removes previous preference. 
public	TokenNamepublic	
void	TokenNamevoid	
setFiles	TokenNameIdentifier	 set Files
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
mkey	TokenNameIdentifier	 mkey
,	TokenNameCOMMA	
File	TokenNameIdentifier	 File
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
values	TokenNameIdentifier	 values
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
j	TokenNameIdentifier	 j
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
values	TokenNameIdentifier	 values
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
values	TokenNameIdentifier	 values
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
values	TokenNameIdentifier	 values
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
setFile	TokenNameIdentifier	 set File
(	TokenNameLPAREN	
mkey	TokenNameIdentifier	 mkey
+	TokenNamePLUS	
j	TokenNameIdentifier	 j
,	TokenNameCOMMA	
values	TokenNameIdentifier	 values
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// erase other elements 	TokenNameCOMMENT_LINE	erase other elements 
String	TokenNameIdentifier	 String
last	TokenNameIdentifier	 last
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
last	TokenNameIdentifier	 last
=	TokenNameEQUAL	
getString	TokenNameIdentifier	 get String
(	TokenNameLPAREN	
mkey	TokenNameIdentifier	 mkey
+	TokenNamePLUS	
j	TokenNameIdentifier	 j
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
last	TokenNameIdentifier	 last
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
setString	TokenNameIdentifier	 set String
(	TokenNameLPAREN	
mkey	TokenNameIdentifier	 mkey
+	TokenNamePLUS	
j	TokenNameIdentifier	 j
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Sets an int property. */	TokenNameCOMMENT_JAVADOC	 Sets an int property. 
public	TokenNamepublic	
void	TokenNamevoid	
setInteger	TokenNameIdentifier	 set Integer
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
key	TokenNameIdentifier	 key
,	TokenNameCOMMA	
int	TokenNameint	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
getDefault	TokenNameIdentifier	 get Default
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
Integer	TokenNameIdentifier	 Integer
)	TokenNameRPAREN	
getDefault	TokenNameIdentifier	 get Default
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
intValue	TokenNameIdentifier	 int Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
internal	TokenNameIdentifier	 internal
.	TokenNameDOT	
setProperty	TokenNameIdentifier	 set Property
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
,	TokenNameCOMMA	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
internal	TokenNameIdentifier	 internal
.	TokenNameDOT	
remove	TokenNameIdentifier	 remove
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sets a float property. */	TokenNameCOMMENT_JAVADOC	 Sets a float property. 
public	TokenNamepublic	
void	TokenNamevoid	
setFloat	TokenNameIdentifier	 set Float
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
key	TokenNameIdentifier	 key
,	TokenNameCOMMA	
float	TokenNamefloat	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
getDefault	TokenNameIdentifier	 get Default
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
Float	TokenNameIdentifier	 Float
)	TokenNameRPAREN	
getDefault	TokenNameIdentifier	 get Default
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
floatValue	TokenNameIdentifier	 float Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
internal	TokenNameIdentifier	 internal
.	TokenNameDOT	
setProperty	TokenNameIdentifier	 set Property
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
,	TokenNameCOMMA	
Float	TokenNameIdentifier	 Float
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
internal	TokenNameIdentifier	 internal
.	TokenNameDOT	
remove	TokenNameIdentifier	 remove
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sets a boolean property. */	TokenNameCOMMENT_JAVADOC	 Sets a boolean property. 
public	TokenNamepublic	
void	TokenNamevoid	
setBoolean	TokenNameIdentifier	 set Boolean
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
key	TokenNameIdentifier	 key
,	TokenNameCOMMA	
boolean	TokenNameboolean	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
getDefault	TokenNameIdentifier	 get Default
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
Boolean	TokenNameIdentifier	 Boolean
)	TokenNameRPAREN	
getDefault	TokenNameIdentifier	 get Default
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
booleanValue	TokenNameIdentifier	 boolean Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
{	TokenNameLBRACE	
internal	TokenNameIdentifier	 internal
.	TokenNameDOT	
setProperty	TokenNameIdentifier	 set Property
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
,	TokenNameCOMMA	
value	TokenNameIdentifier	 value
?	TokenNameQUESTION	
"true"	TokenNameStringLiteral	true
:	TokenNameCOLON	
"false"	TokenNameStringLiteral	false
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
internal	TokenNameIdentifier	 internal
.	TokenNameDOT	
remove	TokenNameIdentifier	 remove
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
