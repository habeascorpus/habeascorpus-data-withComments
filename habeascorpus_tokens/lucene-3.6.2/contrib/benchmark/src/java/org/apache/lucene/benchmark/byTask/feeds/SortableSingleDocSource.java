package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
benchmark	TokenNameIdentifier	 benchmark
.	TokenNameDOT	
byTask	TokenNameIdentifier	 by Task
.	TokenNameDOT	
feeds	TokenNameIdentifier	 feeds
;	TokenNameSEMICOLON	
/** * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_JAVADOC	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
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
Random	TokenNameIdentifier	 Random
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
benchmark	TokenNameIdentifier	 benchmark
.	TokenNameDOT	
byTask	TokenNameIdentifier	 by Task
.	TokenNameDOT	
utils	TokenNameIdentifier	 utils
.	TokenNameDOT	
Config	TokenNameIdentifier	 Config
;	TokenNameSEMICOLON	
/** * Adds fields appropriate for sorting: country, random_string and sort_field * (int). Supports the following parameters: * <ul> * <li><b>sort.rng</b> - defines the range for sort-by-int field (default * <b>20000</b>). * <li><b>rand.seed</b> - defines the seed to initialize Random with (default * <b>13</b>). * </ul> */	TokenNameCOMMENT_JAVADOC	 Adds fields appropriate for sorting: country, random_string and sort_field (int). Supports the following parameters: <ul> <li><b>sort.rng</b> - defines the range for sort-by-int field (default <b>20000</b>). <li><b>rand.seed</b> - defines the seed to initialize Random with (default <b>13</b>). </ul> 
public	TokenNamepublic	
class	TokenNameclass	
SortableSingleDocSource	TokenNameIdentifier	 Sortable Single Doc Source
extends	TokenNameextends	
SingleDocSource	TokenNameIdentifier	 Single Doc Source
{	TokenNameLBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
COUNTRIES	TokenNameIdentifier	 COUNTRIES
=	TokenNameEQUAL	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"European Union"	TokenNameStringLiteral	European Union
,	TokenNameCOMMA	
"United States"	TokenNameStringLiteral	United States
,	TokenNameCOMMA	
"Japan"	TokenNameStringLiteral	Japan
,	TokenNameCOMMA	
"Germany"	TokenNameStringLiteral	Germany
,	TokenNameCOMMA	
"China (PRC)"	TokenNameStringLiteral	China (PRC)
,	TokenNameCOMMA	
"United Kingdom"	TokenNameStringLiteral	United Kingdom
,	TokenNameCOMMA	
"France"	TokenNameStringLiteral	France
,	TokenNameCOMMA	
"Italy"	TokenNameStringLiteral	Italy
,	TokenNameCOMMA	
"Spain"	TokenNameStringLiteral	Spain
,	TokenNameCOMMA	
"Canada"	TokenNameStringLiteral	Canada
,	TokenNameCOMMA	
"Brazil"	TokenNameStringLiteral	Brazil
,	TokenNameCOMMA	
"Russia"	TokenNameStringLiteral	Russia
,	TokenNameCOMMA	
"India"	TokenNameStringLiteral	India
,	TokenNameCOMMA	
"South Korea"	TokenNameStringLiteral	South Korea
,	TokenNameCOMMA	
"Australia"	TokenNameStringLiteral	Australia
,	TokenNameCOMMA	
"Mexico"	TokenNameStringLiteral	Mexico
,	TokenNameCOMMA	
"Netherlands"	TokenNameStringLiteral	Netherlands
,	TokenNameCOMMA	
"Turkey"	TokenNameStringLiteral	Turkey
,	TokenNameCOMMA	
"Sweden"	TokenNameStringLiteral	Sweden
,	TokenNameCOMMA	
"Belgium"	TokenNameStringLiteral	Belgium
,	TokenNameCOMMA	
"Indonesia"	TokenNameStringLiteral	Indonesia
,	TokenNameCOMMA	
"Switzerland"	TokenNameStringLiteral	Switzerland
,	TokenNameCOMMA	
"Poland"	TokenNameStringLiteral	Poland
,	TokenNameCOMMA	
"Norway"	TokenNameStringLiteral	Norway
,	TokenNameCOMMA	
"Republic of China"	TokenNameStringLiteral	Republic of China
,	TokenNameCOMMA	
"Saudi Arabia"	TokenNameStringLiteral	Saudi Arabia
,	TokenNameCOMMA	
"Austria"	TokenNameStringLiteral	Austria
,	TokenNameCOMMA	
"Greece"	TokenNameStringLiteral	Greece
,	TokenNameCOMMA	
"Denmark"	TokenNameStringLiteral	Denmark
,	TokenNameCOMMA	
"Iran"	TokenNameStringLiteral	Iran
,	TokenNameCOMMA	
"South Africa"	TokenNameStringLiteral	South Africa
,	TokenNameCOMMA	
"Argentina"	TokenNameStringLiteral	Argentina
,	TokenNameCOMMA	
"Ireland"	TokenNameStringLiteral	Ireland
,	TokenNameCOMMA	
"Thailand"	TokenNameStringLiteral	Thailand
,	TokenNameCOMMA	
"Finland"	TokenNameStringLiteral	Finland
,	TokenNameCOMMA	
"Venezuela"	TokenNameStringLiteral	Venezuela
,	TokenNameCOMMA	
"Portugal"	TokenNameStringLiteral	Portugal
,	TokenNameCOMMA	
"Hong Kong"	TokenNameStringLiteral	Hong Kong
,	TokenNameCOMMA	
"United Arab Emirates"	TokenNameStringLiteral	United Arab Emirates
,	TokenNameCOMMA	
"Malaysia"	TokenNameStringLiteral	Malaysia
,	TokenNameCOMMA	
"Czech Republic"	TokenNameStringLiteral	Czech Republic
,	TokenNameCOMMA	
"Colombia"	TokenNameStringLiteral	Colombia
,	TokenNameCOMMA	
"Nigeria"	TokenNameStringLiteral	Nigeria
,	TokenNameCOMMA	
"Romania"	TokenNameStringLiteral	Romania
,	TokenNameCOMMA	
"Chile"	TokenNameStringLiteral	Chile
,	TokenNameCOMMA	
"Israel"	TokenNameStringLiteral	Israel
,	TokenNameCOMMA	
"Singapore"	TokenNameStringLiteral	Singapore
,	TokenNameCOMMA	
"Philippines"	TokenNameStringLiteral	Philippines
,	TokenNameCOMMA	
"Pakistan"	TokenNameStringLiteral	Pakistan
,	TokenNameCOMMA	
"Ukraine"	TokenNameStringLiteral	Ukraine
,	TokenNameCOMMA	
"Hungary"	TokenNameStringLiteral	Hungary
,	TokenNameCOMMA	
"Algeria"	TokenNameStringLiteral	Algeria
,	TokenNameCOMMA	
"New Zealand"	TokenNameStringLiteral	New Zealand
,	TokenNameCOMMA	
"Egypt"	TokenNameStringLiteral	Egypt
,	TokenNameCOMMA	
"Kuwait"	TokenNameStringLiteral	Kuwait
,	TokenNameCOMMA	
"Peru"	TokenNameStringLiteral	Peru
,	TokenNameCOMMA	
"Kazakhstan"	TokenNameStringLiteral	Kazakhstan
,	TokenNameCOMMA	
"Slovakia"	TokenNameStringLiteral	Slovakia
,	TokenNameCOMMA	
"Morocco"	TokenNameStringLiteral	Morocco
,	TokenNameCOMMA	
"Bangladesh"	TokenNameStringLiteral	Bangladesh
,	TokenNameCOMMA	
"Vietnam"	TokenNameStringLiteral	Vietnam
,	TokenNameCOMMA	
"Qatar"	TokenNameStringLiteral	Qatar
,	TokenNameCOMMA	
"Angola"	TokenNameStringLiteral	Angola
,	TokenNameCOMMA	
"Libya"	TokenNameStringLiteral	Libya
,	TokenNameCOMMA	
"Iraq"	TokenNameStringLiteral	Iraq
,	TokenNameCOMMA	
"Croatia"	TokenNameStringLiteral	Croatia
,	TokenNameCOMMA	
"Luxembourg"	TokenNameStringLiteral	Luxembourg
,	TokenNameCOMMA	
"Sudan"	TokenNameStringLiteral	Sudan
,	TokenNameCOMMA	
"Slovenia"	TokenNameStringLiteral	Slovenia
,	TokenNameCOMMA	
"Cuba"	TokenNameStringLiteral	Cuba
,	TokenNameCOMMA	
"Belarus"	TokenNameStringLiteral	Belarus
,	TokenNameCOMMA	
"Ecuador"	TokenNameStringLiteral	Ecuador
,	TokenNameCOMMA	
"Serbia"	TokenNameStringLiteral	Serbia
,	TokenNameCOMMA	
"Oman"	TokenNameStringLiteral	Oman
,	TokenNameCOMMA	
"Bulgaria"	TokenNameStringLiteral	Bulgaria
,	TokenNameCOMMA	
"Lithuania"	TokenNameStringLiteral	Lithuania
,	TokenNameCOMMA	
"Syria"	TokenNameStringLiteral	Syria
,	TokenNameCOMMA	
"Dominican Republic"	TokenNameStringLiteral	Dominican Republic
,	TokenNameCOMMA	
"Tunisia"	TokenNameStringLiteral	Tunisia
,	TokenNameCOMMA	
"Guatemala"	TokenNameStringLiteral	Guatemala
,	TokenNameCOMMA	
"Azerbaijan"	TokenNameStringLiteral	Azerbaijan
,	TokenNameCOMMA	
"Sri Lanka"	TokenNameStringLiteral	Sri Lanka
,	TokenNameCOMMA	
"Kenya"	TokenNameStringLiteral	Kenya
,	TokenNameCOMMA	
"Latvia"	TokenNameStringLiteral	Latvia
,	TokenNameCOMMA	
"Turkmenistan"	TokenNameStringLiteral	Turkmenistan
,	TokenNameCOMMA	
"Costa Rica"	TokenNameStringLiteral	Costa Rica
,	TokenNameCOMMA	
"Lebanon"	TokenNameStringLiteral	Lebanon
,	TokenNameCOMMA	
"Uruguay"	TokenNameStringLiteral	Uruguay
,	TokenNameCOMMA	
"Uzbekistan"	TokenNameStringLiteral	Uzbekistan
,	TokenNameCOMMA	
"Yemen"	TokenNameStringLiteral	Yemen
,	TokenNameCOMMA	
"Cyprus"	TokenNameStringLiteral	Cyprus
,	TokenNameCOMMA	
"Estonia"	TokenNameStringLiteral	Estonia
,	TokenNameCOMMA	
"Trinidad and Tobago"	TokenNameStringLiteral	Trinidad and Tobago
,	TokenNameCOMMA	
"Cameroon"	TokenNameStringLiteral	Cameroon
,	TokenNameCOMMA	
"El Salvador"	TokenNameStringLiteral	El Salvador
,	TokenNameCOMMA	
"Iceland"	TokenNameStringLiteral	Iceland
,	TokenNameCOMMA	
"Panama"	TokenNameStringLiteral	Panama
,	TokenNameCOMMA	
"Bahrain"	TokenNameStringLiteral	Bahrain
,	TokenNameCOMMA	
"Ivory Coast"	TokenNameStringLiteral	Ivory Coast
,	TokenNameCOMMA	
"Ethiopia"	TokenNameStringLiteral	Ethiopia
,	TokenNameCOMMA	
"Tanzania"	TokenNameStringLiteral	Tanzania
,	TokenNameCOMMA	
"Jordan"	TokenNameStringLiteral	Jordan
,	TokenNameCOMMA	
"Ghana"	TokenNameStringLiteral	Ghana
,	TokenNameCOMMA	
"Bosnia and Herzegovina"	TokenNameStringLiteral	Bosnia and Herzegovina
,	TokenNameCOMMA	
"Macau"	TokenNameStringLiteral	Macau
,	TokenNameCOMMA	
"Burma"	TokenNameStringLiteral	Burma
,	TokenNameCOMMA	
"Bolivia"	TokenNameStringLiteral	Bolivia
,	TokenNameCOMMA	
"Brunei"	TokenNameStringLiteral	Brunei
,	TokenNameCOMMA	
"Botswana"	TokenNameStringLiteral	Botswana
,	TokenNameCOMMA	
"Honduras"	TokenNameStringLiteral	Honduras
,	TokenNameCOMMA	
"Gabon"	TokenNameStringLiteral	Gabon
,	TokenNameCOMMA	
"Uganda"	TokenNameStringLiteral	Uganda
,	TokenNameCOMMA	
"Jamaica"	TokenNameStringLiteral	Jamaica
,	TokenNameCOMMA	
"Zambia"	TokenNameStringLiteral	Zambia
,	TokenNameCOMMA	
"Senegal"	TokenNameStringLiteral	Senegal
,	TokenNameCOMMA	
"Paraguay"	TokenNameStringLiteral	Paraguay
,	TokenNameCOMMA	
"Albania"	TokenNameStringLiteral	Albania
,	TokenNameCOMMA	
"Equatorial Guinea"	TokenNameStringLiteral	Equatorial Guinea
,	TokenNameCOMMA	
"Georgia"	TokenNameStringLiteral	Georgia
,	TokenNameCOMMA	
"Democratic Republic of the Congo"	TokenNameStringLiteral	Democratic Republic of the Congo
,	TokenNameCOMMA	
"Nepal"	TokenNameStringLiteral	Nepal
,	TokenNameCOMMA	
"Afghanistan"	TokenNameStringLiteral	Afghanistan
,	TokenNameCOMMA	
"Cambodia"	TokenNameStringLiteral	Cambodia
,	TokenNameCOMMA	
"Armenia"	TokenNameStringLiteral	Armenia
,	TokenNameCOMMA	
"Republic of the Congo"	TokenNameStringLiteral	Republic of the Congo
,	TokenNameCOMMA	
"Mozambique"	TokenNameStringLiteral	Mozambique
,	TokenNameCOMMA	
"Republic of Macedonia"	TokenNameStringLiteral	Republic of Macedonia
,	TokenNameCOMMA	
"Malta"	TokenNameStringLiteral	Malta
,	TokenNameCOMMA	
"Namibia"	TokenNameStringLiteral	Namibia
,	TokenNameCOMMA	
"Madagascar"	TokenNameStringLiteral	Madagascar
,	TokenNameCOMMA	
"Chad"	TokenNameStringLiteral	Chad
,	TokenNameCOMMA	
"Burkina Faso"	TokenNameStringLiteral	Burkina Faso
,	TokenNameCOMMA	
"Mauritius"	TokenNameStringLiteral	Mauritius
,	TokenNameCOMMA	
"Mali"	TokenNameStringLiteral	Mali
,	TokenNameCOMMA	
"The Bahamas"	TokenNameStringLiteral	The Bahamas
,	TokenNameCOMMA	
"Papua New Guinea"	TokenNameStringLiteral	Papua New Guinea
,	TokenNameCOMMA	
"Nicaragua"	TokenNameStringLiteral	Nicaragua
,	TokenNameCOMMA	
"Haiti"	TokenNameStringLiteral	Haiti
,	TokenNameCOMMA	
"Benin"	TokenNameStringLiteral	Benin
,	TokenNameCOMMA	
"alestinian flag West Bank and Gaza"	TokenNameStringLiteral	alestinian flag West Bank and Gaza
,	TokenNameCOMMA	
"Jersey"	TokenNameStringLiteral	Jersey
,	TokenNameCOMMA	
"Fiji"	TokenNameStringLiteral	Fiji
,	TokenNameCOMMA	
"Guinea"	TokenNameStringLiteral	Guinea
,	TokenNameCOMMA	
"Moldova"	TokenNameStringLiteral	Moldova
,	TokenNameCOMMA	
"Niger"	TokenNameStringLiteral	Niger
,	TokenNameCOMMA	
"Laos"	TokenNameStringLiteral	Laos
,	TokenNameCOMMA	
"Mongolia"	TokenNameStringLiteral	Mongolia
,	TokenNameCOMMA	
"French Polynesia"	TokenNameStringLiteral	French Polynesia
,	TokenNameCOMMA	
"Kyrgyzstan"	TokenNameStringLiteral	Kyrgyzstan
,	TokenNameCOMMA	
"Barbados"	TokenNameStringLiteral	Barbados
,	TokenNameCOMMA	
"Tajikistan"	TokenNameStringLiteral	Tajikistan
,	TokenNameCOMMA	
"Malawi"	TokenNameStringLiteral	Malawi
,	TokenNameCOMMA	
"Liechtenstein"	TokenNameStringLiteral	Liechtenstein
,	TokenNameCOMMA	
"New Caledonia"	TokenNameStringLiteral	New Caledonia
,	TokenNameCOMMA	
"Kosovo"	TokenNameStringLiteral	Kosovo
,	TokenNameCOMMA	
"Rwanda"	TokenNameStringLiteral	Rwanda
,	TokenNameCOMMA	
"Montenegro"	TokenNameStringLiteral	Montenegro
,	TokenNameCOMMA	
"Swaziland"	TokenNameStringLiteral	Swaziland
,	TokenNameCOMMA	
"Guam"	TokenNameStringLiteral	Guam
,	TokenNameCOMMA	
"Mauritania"	TokenNameStringLiteral	Mauritania
,	TokenNameCOMMA	
"Guernsey"	TokenNameStringLiteral	Guernsey
,	TokenNameCOMMA	
"Isle of Man"	TokenNameStringLiteral	Isle of Man
,	TokenNameCOMMA	
"Togo"	TokenNameStringLiteral	Togo
,	TokenNameCOMMA	
"Somalia"	TokenNameStringLiteral	Somalia
,	TokenNameCOMMA	
"Suriname"	TokenNameStringLiteral	Suriname
,	TokenNameCOMMA	
"Aruba"	TokenNameStringLiteral	Aruba
,	TokenNameCOMMA	
"North Korea"	TokenNameStringLiteral	North Korea
,	TokenNameCOMMA	
"Zimbabwe"	TokenNameStringLiteral	Zimbabwe
,	TokenNameCOMMA	
"Central African Republic"	TokenNameStringLiteral	Central African Republic
,	TokenNameCOMMA	
"Faroe Islands"	TokenNameStringLiteral	Faroe Islands
,	TokenNameCOMMA	
"Greenland"	TokenNameStringLiteral	Greenland
,	TokenNameCOMMA	
"Sierra Leone"	TokenNameStringLiteral	Sierra Leone
,	TokenNameCOMMA	
"Lesotho"	TokenNameStringLiteral	Lesotho
,	TokenNameCOMMA	
"Cape Verde"	TokenNameStringLiteral	Cape Verde
,	TokenNameCOMMA	
"Eritrea"	TokenNameStringLiteral	Eritrea
,	TokenNameCOMMA	
"Bhutan"	TokenNameStringLiteral	Bhutan
,	TokenNameCOMMA	
"Belize"	TokenNameStringLiteral	Belize
,	TokenNameCOMMA	
"Antigua and Barbuda"	TokenNameStringLiteral	Antigua and Barbuda
,	TokenNameCOMMA	
"Gibraltar"	TokenNameStringLiteral	Gibraltar
,	TokenNameCOMMA	
"Maldives"	TokenNameStringLiteral	Maldives
,	TokenNameCOMMA	
"San Marino"	TokenNameStringLiteral	San Marino
,	TokenNameCOMMA	
"Guyana"	TokenNameStringLiteral	Guyana
,	TokenNameCOMMA	
"Burundi"	TokenNameStringLiteral	Burundi
,	TokenNameCOMMA	
"Saint Lucia"	TokenNameStringLiteral	Saint Lucia
,	TokenNameCOMMA	
"Djibouti"	TokenNameStringLiteral	Djibouti
,	TokenNameCOMMA	
"British Virgin Islands"	TokenNameStringLiteral	British Virgin Islands
,	TokenNameCOMMA	
"Liberia"	TokenNameStringLiteral	Liberia
,	TokenNameCOMMA	
"Seychelles"	TokenNameStringLiteral	Seychelles
,	TokenNameCOMMA	
"The Gambia"	TokenNameStringLiteral	The Gambia
,	TokenNameCOMMA	
"Northern Mariana Islands"	TokenNameStringLiteral	Northern Mariana Islands
,	TokenNameCOMMA	
"Grenada"	TokenNameStringLiteral	Grenada
,	TokenNameCOMMA	
"Saint Vincent and the Grenadines"	TokenNameStringLiteral	Saint Vincent and the Grenadines
,	TokenNameCOMMA	
"Saint Kitts and Nevis"	TokenNameStringLiteral	Saint Kitts and Nevis
,	TokenNameCOMMA	
"East Timor"	TokenNameStringLiteral	East Timor
,	TokenNameCOMMA	
"Vanuatu"	TokenNameStringLiteral	Vanuatu
,	TokenNameCOMMA	
"Comoros"	TokenNameStringLiteral	Comoros
,	TokenNameCOMMA	
"Samoa"	TokenNameStringLiteral	Samoa
,	TokenNameCOMMA	
"Solomon Islands"	TokenNameStringLiteral	Solomon Islands
,	TokenNameCOMMA	
"Guinea-Bissau"	TokenNameStringLiteral	Guinea-Bissau
,	TokenNameCOMMA	
"American Samoa"	TokenNameStringLiteral	American Samoa
,	TokenNameCOMMA	
"Dominica"	TokenNameStringLiteral	Dominica
,	TokenNameCOMMA	
"Micronesia"	TokenNameStringLiteral	Micronesia
,	TokenNameCOMMA	
"Tonga"	TokenNameStringLiteral	Tonga
,	TokenNameCOMMA	
"Cook Islands"	TokenNameStringLiteral	Cook Islands
,	TokenNameCOMMA	
"Palau"	TokenNameStringLiteral	Palau
,	TokenNameCOMMA	
"Marshall Islands"	TokenNameStringLiteral	Marshall Islands
,	TokenNameCOMMA	
"S�o Tom� and Pr�ncipe"	TokenNameStringLiteral	S�o Tom� and Pr�ncipe
,	TokenNameCOMMA	
"Anguilla"	TokenNameStringLiteral	Anguilla
,	TokenNameCOMMA	
"Kiribati"	TokenNameStringLiteral	Kiribati
,	TokenNameCOMMA	
"Tuvalu"	TokenNameStringLiteral	Tuvalu
,	TokenNameCOMMA	
"Niue"	TokenNameStringLiteral	Niue
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
sortRange	TokenNameIdentifier	 sort Range
;	TokenNameSEMICOLON	
private	TokenNameprivate	
Random	TokenNameIdentifier	 Random
r	TokenNameIdentifier	 r
;	TokenNameSEMICOLON	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
DocData	TokenNameIdentifier	 Doc Data
getNextDocData	TokenNameIdentifier	 get Next Doc Data
(	TokenNameLPAREN	
DocData	TokenNameIdentifier	 Doc Data
docData	TokenNameIdentifier	 doc Data
)	TokenNameRPAREN	
throws	TokenNamethrows	
NoMoreDataException	TokenNameIdentifier	 No More Data Exception
{	TokenNameLBRACE	
docData	TokenNameIdentifier	 doc Data
=	TokenNameEQUAL	
super	TokenNamesuper	
.	TokenNameDOT	
getNextDocData	TokenNameIdentifier	 get Next Doc Data
(	TokenNameLPAREN	
docData	TokenNameIdentifier	 doc Data
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Properties	TokenNameIdentifier	 Properties
props	TokenNameIdentifier	 props
=	TokenNameEQUAL	
new	TokenNamenew	
Properties	TokenNameIdentifier	 Properties
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// random int 	TokenNameCOMMENT_LINE	random int 
props	TokenNameIdentifier	 props
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"sort_field"	TokenNameStringLiteral	sort_field
,	TokenNameCOMMA	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
r	TokenNameIdentifier	 r
.	TokenNameDOT	
nextInt	TokenNameIdentifier	 next Int
(	TokenNameLPAREN	
sortRange	TokenNameIdentifier	 sort Range
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// random string 	TokenNameCOMMENT_LINE	random string 
int	TokenNameint	
len	TokenNameIdentifier	 len
=	TokenNameEQUAL	
nextInt	TokenNameIdentifier	 next Int
(	TokenNameLPAREN	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
20	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
buffer	TokenNameIdentifier	 buffer
=	TokenNameEQUAL	
new	TokenNamenew	
char	TokenNamechar	
[	TokenNameLBRACKET	
len	TokenNameIdentifier	 len
]	TokenNameRBRACKET	
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
len	TokenNameIdentifier	 len
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
buffer	TokenNameIdentifier	 buffer
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
char	TokenNamechar	
)	TokenNameRPAREN	
r	TokenNameIdentifier	 r
.	TokenNameDOT	
nextInt	TokenNameIdentifier	 next Int
(	TokenNameLPAREN	
0x80	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
props	TokenNameIdentifier	 props
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"random_string"	TokenNameStringLiteral	random_string
,	TokenNameCOMMA	
new	TokenNamenew	
String	TokenNameIdentifier	 String
(	TokenNameLPAREN	
buffer	TokenNameIdentifier	 buffer
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// random country 	TokenNameCOMMENT_LINE	random country 
props	TokenNameIdentifier	 props
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"country"	TokenNameStringLiteral	country
,	TokenNameCOMMA	
COUNTRIES	TokenNameIdentifier	 COUNTRIES
[	TokenNameLBRACKET	
r	TokenNameIdentifier	 r
.	TokenNameDOT	
nextInt	TokenNameIdentifier	 next Int
(	TokenNameLPAREN	
COUNTRIES	TokenNameIdentifier	 COUNTRIES
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
docData	TokenNameIdentifier	 doc Data
.	TokenNameDOT	
setProps	TokenNameIdentifier	 set Props
(	TokenNameLPAREN	
props	TokenNameIdentifier	 props
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
docData	TokenNameIdentifier	 doc Data
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
int	TokenNameint	
nextInt	TokenNameIdentifier	 next Int
(	TokenNameLPAREN	
int	TokenNameint	
start	TokenNameIdentifier	 start
,	TokenNameCOMMA	
int	TokenNameint	
end	TokenNameIdentifier	 end
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
start	TokenNameIdentifier	 start
+	TokenNamePLUS	
r	TokenNameIdentifier	 r
.	TokenNameDOT	
nextInt	TokenNameIdentifier	 next Int
(	TokenNameLPAREN	
end	TokenNameIdentifier	 end
-	TokenNameMINUS	
start	TokenNameIdentifier	 start
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
void	TokenNamevoid	
setConfig	TokenNameIdentifier	 set Config
(	TokenNameLPAREN	
Config	TokenNameIdentifier	 Config
config	TokenNameIdentifier	 config
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
.	TokenNameDOT	
setConfig	TokenNameIdentifier	 set Config
(	TokenNameLPAREN	
config	TokenNameIdentifier	 config
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sortRange	TokenNameIdentifier	 sort Range
=	TokenNameEQUAL	
config	TokenNameIdentifier	 config
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
"sort.rng"	TokenNameStringLiteral	sort.rng
,	TokenNameCOMMA	
20000	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
r	TokenNameIdentifier	 r
=	TokenNameEQUAL	
new	TokenNamenew	
Random	TokenNameIdentifier	 Random
(	TokenNameLPAREN	
config	TokenNameIdentifier	 config
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
"rand.seed"	TokenNameStringLiteral	rand.seed
,	TokenNameCOMMA	
13	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
