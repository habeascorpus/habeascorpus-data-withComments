/* Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
batik	TokenNameIdentifier	 batik
.	TokenNameDOT	
svggen	TokenNameIdentifier	 svggen
.	TokenNameDOT	
font	TokenNameIdentifier	 font
.	TokenNameDOT	
table	TokenNameIdentifier	 table
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
RandomAccessFile	TokenNameIdentifier	 Random Access File
;	TokenNameSEMICOLON	
/** * * @author <a href="mailto:david@steadystate.co.uk">David Schweinsberg</a> * @version $Id: PostTable.java 475685 2006-11-16 11:16:05Z cam $ */	TokenNameCOMMENT_JAVADOC	 * @author <a href="mailto:david@steadystate.co.uk">David Schweinsberg</a> @version $Id: PostTable.java 475685 2006-11-16 11:16:05Z cam $ 
public	TokenNamepublic	
class	TokenNameclass	
PostTable	TokenNameIdentifier	 Post Table
implements	TokenNameimplements	
Table	TokenNameIdentifier	 Table
{	TokenNameLBRACE	
/** * TODO: Mac Glyph names for 210 & 257 */	TokenNameCOMMENT_JAVADOC	 TODO: Mac Glyph names for 210 & 257 
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
macGlyphName	TokenNameIdentifier	 mac Glyph Name
=	TokenNameEQUAL	
{	TokenNameLBRACE	
".notdef"	TokenNameStringLiteral	.notdef
,	TokenNameCOMMA	
// 0 	TokenNameCOMMENT_LINE	0 
"null"	TokenNameStringLiteral	null
,	TokenNameCOMMA	
// 1 	TokenNameCOMMENT_LINE	1 
"CR"	TokenNameStringLiteral	CR
,	TokenNameCOMMA	
// 2 	TokenNameCOMMENT_LINE	2 
"space"	TokenNameStringLiteral	space
,	TokenNameCOMMA	
// 3 	TokenNameCOMMENT_LINE	3 
"exclam"	TokenNameStringLiteral	exclam
,	TokenNameCOMMA	
// 4 	TokenNameCOMMENT_LINE	4 
"quotedbl"	TokenNameStringLiteral	quotedbl
,	TokenNameCOMMA	
// 5 	TokenNameCOMMENT_LINE	5 
"numbersign"	TokenNameStringLiteral	numbersign
,	TokenNameCOMMA	
// 6 	TokenNameCOMMENT_LINE	6 
"dollar"	TokenNameStringLiteral	dollar
,	TokenNameCOMMA	
// 7 	TokenNameCOMMENT_LINE	7 
"percent"	TokenNameStringLiteral	percent
,	TokenNameCOMMA	
// 8 	TokenNameCOMMENT_LINE	8 
"ampersand"	TokenNameStringLiteral	ampersand
,	TokenNameCOMMA	
// 9 	TokenNameCOMMENT_LINE	9 
"quotesingle"	TokenNameStringLiteral	quotesingle
,	TokenNameCOMMA	
// 10 	TokenNameCOMMENT_LINE	10 
"parenleft"	TokenNameStringLiteral	parenleft
,	TokenNameCOMMA	
// 11 	TokenNameCOMMENT_LINE	11 
"parenright"	TokenNameStringLiteral	parenright
,	TokenNameCOMMA	
// 12 	TokenNameCOMMENT_LINE	12 
"asterisk"	TokenNameStringLiteral	asterisk
,	TokenNameCOMMA	
// 13 	TokenNameCOMMENT_LINE	13 
"plus"	TokenNameStringLiteral	plus
,	TokenNameCOMMA	
// 14 	TokenNameCOMMENT_LINE	14 
"comma"	TokenNameStringLiteral	comma
,	TokenNameCOMMA	
// 15 	TokenNameCOMMENT_LINE	15 
"hyphen"	TokenNameStringLiteral	hyphen
,	TokenNameCOMMA	
// 16 	TokenNameCOMMENT_LINE	16 
"period"	TokenNameStringLiteral	period
,	TokenNameCOMMA	
// 17 	TokenNameCOMMENT_LINE	17 
"slash"	TokenNameStringLiteral	slash
,	TokenNameCOMMA	
// 18 	TokenNameCOMMENT_LINE	18 
"zero"	TokenNameStringLiteral	zero
,	TokenNameCOMMA	
// 19 	TokenNameCOMMENT_LINE	19 
"one"	TokenNameStringLiteral	one
,	TokenNameCOMMA	
// 20 	TokenNameCOMMENT_LINE	20 
"two"	TokenNameStringLiteral	two
,	TokenNameCOMMA	
// 21 	TokenNameCOMMENT_LINE	21 
"three"	TokenNameStringLiteral	three
,	TokenNameCOMMA	
// 22 	TokenNameCOMMENT_LINE	22 
"four"	TokenNameStringLiteral	four
,	TokenNameCOMMA	
// 23 	TokenNameCOMMENT_LINE	23 
"five"	TokenNameStringLiteral	five
,	TokenNameCOMMA	
// 24 	TokenNameCOMMENT_LINE	24 
"six"	TokenNameStringLiteral	six
,	TokenNameCOMMA	
// 25 	TokenNameCOMMENT_LINE	25 
"seven"	TokenNameStringLiteral	seven
,	TokenNameCOMMA	
// 26 	TokenNameCOMMENT_LINE	26 
"eight"	TokenNameStringLiteral	eight
,	TokenNameCOMMA	
// 27 	TokenNameCOMMENT_LINE	27 
"nine"	TokenNameStringLiteral	nine
,	TokenNameCOMMA	
// 28 	TokenNameCOMMENT_LINE	28 
"colon"	TokenNameStringLiteral	colon
,	TokenNameCOMMA	
// 29 	TokenNameCOMMENT_LINE	29 
"semicolon"	TokenNameStringLiteral	semicolon
,	TokenNameCOMMA	
// 30 	TokenNameCOMMENT_LINE	30 
"less"	TokenNameStringLiteral	less
,	TokenNameCOMMA	
// 31 	TokenNameCOMMENT_LINE	31 
"equal"	TokenNameStringLiteral	equal
,	TokenNameCOMMA	
// 32 	TokenNameCOMMENT_LINE	32 
"greater"	TokenNameStringLiteral	greater
,	TokenNameCOMMA	
// 33 	TokenNameCOMMENT_LINE	33 
"question"	TokenNameStringLiteral	question
,	TokenNameCOMMA	
// 34 	TokenNameCOMMENT_LINE	34 
"at"	TokenNameStringLiteral	at
,	TokenNameCOMMA	
// 35 	TokenNameCOMMENT_LINE	35 
"A"	TokenNameStringLiteral	A
,	TokenNameCOMMA	
// 36 	TokenNameCOMMENT_LINE	36 
"B"	TokenNameStringLiteral	B
,	TokenNameCOMMA	
// 37 	TokenNameCOMMENT_LINE	37 
"C"	TokenNameStringLiteral	C
,	TokenNameCOMMA	
// 38 	TokenNameCOMMENT_LINE	38 
"D"	TokenNameStringLiteral	D
,	TokenNameCOMMA	
// 39 	TokenNameCOMMENT_LINE	39 
"E"	TokenNameStringLiteral	E
,	TokenNameCOMMA	
// 40 	TokenNameCOMMENT_LINE	40 
"F"	TokenNameStringLiteral	F
,	TokenNameCOMMA	
// 41 	TokenNameCOMMENT_LINE	41 
"G"	TokenNameStringLiteral	G
,	TokenNameCOMMA	
// 42 	TokenNameCOMMENT_LINE	42 
"H"	TokenNameStringLiteral	H
,	TokenNameCOMMA	
// 43 	TokenNameCOMMENT_LINE	43 
"I"	TokenNameStringLiteral	I
,	TokenNameCOMMA	
// 44 	TokenNameCOMMENT_LINE	44 
"J"	TokenNameStringLiteral	J
,	TokenNameCOMMA	
// 45 	TokenNameCOMMENT_LINE	45 
"K"	TokenNameStringLiteral	K
,	TokenNameCOMMA	
// 46 	TokenNameCOMMENT_LINE	46 
"L"	TokenNameStringLiteral	L
,	TokenNameCOMMA	
// 47 	TokenNameCOMMENT_LINE	47 
"M"	TokenNameStringLiteral	M
,	TokenNameCOMMA	
// 48 	TokenNameCOMMENT_LINE	48 
"N"	TokenNameStringLiteral	N
,	TokenNameCOMMA	
// 49 	TokenNameCOMMENT_LINE	49 
"O"	TokenNameStringLiteral	O
,	TokenNameCOMMA	
// 50 	TokenNameCOMMENT_LINE	50 
"P"	TokenNameStringLiteral	P
,	TokenNameCOMMA	
// 51 	TokenNameCOMMENT_LINE	51 
"Q"	TokenNameStringLiteral	Q
,	TokenNameCOMMA	
// 52 	TokenNameCOMMENT_LINE	52 
"R"	TokenNameStringLiteral	R
,	TokenNameCOMMA	
// 53 	TokenNameCOMMENT_LINE	53 
"S"	TokenNameStringLiteral	S
,	TokenNameCOMMA	
// 54 	TokenNameCOMMENT_LINE	54 
"T"	TokenNameStringLiteral	T
,	TokenNameCOMMA	
// 55 	TokenNameCOMMENT_LINE	55 
"U"	TokenNameStringLiteral	U
,	TokenNameCOMMA	
// 56 	TokenNameCOMMENT_LINE	56 
"V"	TokenNameStringLiteral	V
,	TokenNameCOMMA	
// 57 	TokenNameCOMMENT_LINE	57 
"W"	TokenNameStringLiteral	W
,	TokenNameCOMMA	
// 58 	TokenNameCOMMENT_LINE	58 
"X"	TokenNameStringLiteral	X
,	TokenNameCOMMA	
// 59 	TokenNameCOMMENT_LINE	59 
"Y"	TokenNameStringLiteral	Y
,	TokenNameCOMMA	
// 60 	TokenNameCOMMENT_LINE	60 
"Z"	TokenNameStringLiteral	Z
,	TokenNameCOMMA	
// 61 	TokenNameCOMMENT_LINE	61 
"bracketleft"	TokenNameStringLiteral	bracketleft
,	TokenNameCOMMA	
// 62 	TokenNameCOMMENT_LINE	62 
"backslash"	TokenNameStringLiteral	backslash
,	TokenNameCOMMA	
// 63 	TokenNameCOMMENT_LINE	63 
"bracketright"	TokenNameStringLiteral	bracketright
,	TokenNameCOMMA	
// 64 	TokenNameCOMMENT_LINE	64 
"asciicircum"	TokenNameStringLiteral	asciicircum
,	TokenNameCOMMA	
// 65 	TokenNameCOMMENT_LINE	65 
"underscore"	TokenNameStringLiteral	underscore
,	TokenNameCOMMA	
// 66 	TokenNameCOMMENT_LINE	66 
"grave"	TokenNameStringLiteral	grave
,	TokenNameCOMMA	
// 67 	TokenNameCOMMENT_LINE	67 
"a"	TokenNameStringLiteral	a
,	TokenNameCOMMA	
// 68 	TokenNameCOMMENT_LINE	68 
"b"	TokenNameStringLiteral	b
,	TokenNameCOMMA	
// 69 	TokenNameCOMMENT_LINE	69 
"c"	TokenNameStringLiteral	c
,	TokenNameCOMMA	
// 70 	TokenNameCOMMENT_LINE	70 
"d"	TokenNameStringLiteral	d
,	TokenNameCOMMA	
// 71 	TokenNameCOMMENT_LINE	71 
"e"	TokenNameStringLiteral	e
,	TokenNameCOMMA	
// 72 	TokenNameCOMMENT_LINE	72 
"f"	TokenNameStringLiteral	f
,	TokenNameCOMMA	
// 73 	TokenNameCOMMENT_LINE	73 
"g"	TokenNameStringLiteral	g
,	TokenNameCOMMA	
// 74 	TokenNameCOMMENT_LINE	74 
"h"	TokenNameStringLiteral	h
,	TokenNameCOMMA	
// 75 	TokenNameCOMMENT_LINE	75 
"i"	TokenNameStringLiteral	i
,	TokenNameCOMMA	
// 76 	TokenNameCOMMENT_LINE	76 
"j"	TokenNameStringLiteral	j
,	TokenNameCOMMA	
// 77 	TokenNameCOMMENT_LINE	77 
"k"	TokenNameStringLiteral	k
,	TokenNameCOMMA	
// 78 	TokenNameCOMMENT_LINE	78 
"l"	TokenNameStringLiteral	l
,	TokenNameCOMMA	
// 79 	TokenNameCOMMENT_LINE	79 
"m"	TokenNameStringLiteral	m
,	TokenNameCOMMA	
// 80 	TokenNameCOMMENT_LINE	80 
"n"	TokenNameStringLiteral	n
,	TokenNameCOMMA	
// 81 	TokenNameCOMMENT_LINE	81 
"o"	TokenNameStringLiteral	o
,	TokenNameCOMMA	
// 82 	TokenNameCOMMENT_LINE	82 
"p"	TokenNameStringLiteral	p
,	TokenNameCOMMA	
// 83 	TokenNameCOMMENT_LINE	83 
"q"	TokenNameStringLiteral	q
,	TokenNameCOMMA	
// 84 	TokenNameCOMMENT_LINE	84 
"r"	TokenNameStringLiteral	r
,	TokenNameCOMMA	
// 85 	TokenNameCOMMENT_LINE	85 
"s"	TokenNameStringLiteral	s
,	TokenNameCOMMA	
// 86 	TokenNameCOMMENT_LINE	86 
"t"	TokenNameStringLiteral	t
,	TokenNameCOMMA	
// 87 	TokenNameCOMMENT_LINE	87 
"u"	TokenNameStringLiteral	u
,	TokenNameCOMMA	
// 88 	TokenNameCOMMENT_LINE	88 
"v"	TokenNameStringLiteral	v
,	TokenNameCOMMA	
// 89 	TokenNameCOMMENT_LINE	89 
"w"	TokenNameStringLiteral	w
,	TokenNameCOMMA	
// 90 	TokenNameCOMMENT_LINE	90 
"x"	TokenNameStringLiteral	x
,	TokenNameCOMMA	
// 91 	TokenNameCOMMENT_LINE	91 
"y"	TokenNameStringLiteral	y
,	TokenNameCOMMA	
// 92 	TokenNameCOMMENT_LINE	92 
"z"	TokenNameStringLiteral	z
,	TokenNameCOMMA	
// 93 	TokenNameCOMMENT_LINE	93 
"braceleft"	TokenNameStringLiteral	braceleft
,	TokenNameCOMMA	
// 94 	TokenNameCOMMENT_LINE	94 
"bar"	TokenNameStringLiteral	bar
,	TokenNameCOMMA	
// 95 	TokenNameCOMMENT_LINE	95 
"braceright"	TokenNameStringLiteral	braceright
,	TokenNameCOMMA	
// 96 	TokenNameCOMMENT_LINE	96 
"asciitilde"	TokenNameStringLiteral	asciitilde
,	TokenNameCOMMA	
// 97 	TokenNameCOMMENT_LINE	97 
"Adieresis"	TokenNameStringLiteral	Adieresis
,	TokenNameCOMMA	
// 98 	TokenNameCOMMENT_LINE	98 
"Aring"	TokenNameStringLiteral	Aring
,	TokenNameCOMMA	
// 99 	TokenNameCOMMENT_LINE	99 
"Ccedilla"	TokenNameStringLiteral	Ccedilla
,	TokenNameCOMMA	
// 100 	TokenNameCOMMENT_LINE	100 
"Eacute"	TokenNameStringLiteral	Eacute
,	TokenNameCOMMA	
// 101 	TokenNameCOMMENT_LINE	101 
"Ntilde"	TokenNameStringLiteral	Ntilde
,	TokenNameCOMMA	
// 102 	TokenNameCOMMENT_LINE	102 
"Odieresis"	TokenNameStringLiteral	Odieresis
,	TokenNameCOMMA	
// 103 	TokenNameCOMMENT_LINE	103 
"Udieresis"	TokenNameStringLiteral	Udieresis
,	TokenNameCOMMA	
// 104 	TokenNameCOMMENT_LINE	104 
"aacute"	TokenNameStringLiteral	aacute
,	TokenNameCOMMA	
// 105 	TokenNameCOMMENT_LINE	105 
"agrave"	TokenNameStringLiteral	agrave
,	TokenNameCOMMA	
// 106 	TokenNameCOMMENT_LINE	106 
"acircumflex"	TokenNameStringLiteral	acircumflex
,	TokenNameCOMMA	
// 107 	TokenNameCOMMENT_LINE	107 
"adieresis"	TokenNameStringLiteral	adieresis
,	TokenNameCOMMA	
// 108 	TokenNameCOMMENT_LINE	108 
"atilde"	TokenNameStringLiteral	atilde
,	TokenNameCOMMA	
// 109 	TokenNameCOMMENT_LINE	109 
"aring"	TokenNameStringLiteral	aring
,	TokenNameCOMMA	
// 110 	TokenNameCOMMENT_LINE	110 
"ccedilla"	TokenNameStringLiteral	ccedilla
,	TokenNameCOMMA	
// 111 	TokenNameCOMMENT_LINE	111 
"eacute"	TokenNameStringLiteral	eacute
,	TokenNameCOMMA	
// 112 	TokenNameCOMMENT_LINE	112 
"egrave"	TokenNameStringLiteral	egrave
,	TokenNameCOMMA	
// 113 	TokenNameCOMMENT_LINE	113 
"ecircumflex"	TokenNameStringLiteral	ecircumflex
,	TokenNameCOMMA	
// 114 	TokenNameCOMMENT_LINE	114 
"edieresis"	TokenNameStringLiteral	edieresis
,	TokenNameCOMMA	
// 115 	TokenNameCOMMENT_LINE	115 
"iacute"	TokenNameStringLiteral	iacute
,	TokenNameCOMMA	
// 116 	TokenNameCOMMENT_LINE	116 
"igrave"	TokenNameStringLiteral	igrave
,	TokenNameCOMMA	
// 117 	TokenNameCOMMENT_LINE	117 
"icircumflex"	TokenNameStringLiteral	icircumflex
,	TokenNameCOMMA	
// 118 	TokenNameCOMMENT_LINE	118 
"idieresis"	TokenNameStringLiteral	idieresis
,	TokenNameCOMMA	
// 119 	TokenNameCOMMENT_LINE	119 
"ntilde"	TokenNameStringLiteral	ntilde
,	TokenNameCOMMA	
// 120 	TokenNameCOMMENT_LINE	120 
"oacute"	TokenNameStringLiteral	oacute
,	TokenNameCOMMA	
// 121 	TokenNameCOMMENT_LINE	121 
"ograve"	TokenNameStringLiteral	ograve
,	TokenNameCOMMA	
// 122 	TokenNameCOMMENT_LINE	122 
"ocircumflex"	TokenNameStringLiteral	ocircumflex
,	TokenNameCOMMA	
// 123 	TokenNameCOMMENT_LINE	123 
"odieresis"	TokenNameStringLiteral	odieresis
,	TokenNameCOMMA	
// 124 	TokenNameCOMMENT_LINE	124 
"otilde"	TokenNameStringLiteral	otilde
,	TokenNameCOMMA	
// 125 	TokenNameCOMMENT_LINE	125 
"uacute"	TokenNameStringLiteral	uacute
,	TokenNameCOMMA	
// 126 	TokenNameCOMMENT_LINE	126 
"ugrave"	TokenNameStringLiteral	ugrave
,	TokenNameCOMMA	
// 127 	TokenNameCOMMENT_LINE	127 
"ucircumflex"	TokenNameStringLiteral	ucircumflex
,	TokenNameCOMMA	
// 128 	TokenNameCOMMENT_LINE	128 
"udieresis"	TokenNameStringLiteral	udieresis
,	TokenNameCOMMA	
// 129 	TokenNameCOMMENT_LINE	129 
"dagger"	TokenNameStringLiteral	dagger
,	TokenNameCOMMA	
// 130 	TokenNameCOMMENT_LINE	130 
"degree"	TokenNameStringLiteral	degree
,	TokenNameCOMMA	
// 131 	TokenNameCOMMENT_LINE	131 
"cent"	TokenNameStringLiteral	cent
,	TokenNameCOMMA	
// 132 	TokenNameCOMMENT_LINE	132 
"sterling"	TokenNameStringLiteral	sterling
,	TokenNameCOMMA	
// 133 	TokenNameCOMMENT_LINE	133 
"section"	TokenNameStringLiteral	section
,	TokenNameCOMMA	
// 134 	TokenNameCOMMENT_LINE	134 
"bullet"	TokenNameStringLiteral	bullet
,	TokenNameCOMMA	
// 135 	TokenNameCOMMENT_LINE	135 
"paragraph"	TokenNameStringLiteral	paragraph
,	TokenNameCOMMA	
// 136 	TokenNameCOMMENT_LINE	136 
"germandbls"	TokenNameStringLiteral	germandbls
,	TokenNameCOMMA	
// 137 	TokenNameCOMMENT_LINE	137 
"registered"	TokenNameStringLiteral	registered
,	TokenNameCOMMA	
// 138 	TokenNameCOMMENT_LINE	138 
"copyright"	TokenNameStringLiteral	copyright
,	TokenNameCOMMA	
// 139 	TokenNameCOMMENT_LINE	139 
"trademark"	TokenNameStringLiteral	trademark
,	TokenNameCOMMA	
// 140 	TokenNameCOMMENT_LINE	140 
"acute"	TokenNameStringLiteral	acute
,	TokenNameCOMMA	
// 141 	TokenNameCOMMENT_LINE	141 
"dieresis"	TokenNameStringLiteral	dieresis
,	TokenNameCOMMA	
// 142 	TokenNameCOMMENT_LINE	142 
"notequal"	TokenNameStringLiteral	notequal
,	TokenNameCOMMA	
// 143 	TokenNameCOMMENT_LINE	143 
"AE"	TokenNameStringLiteral	AE
,	TokenNameCOMMA	
// 144 	TokenNameCOMMENT_LINE	144 
"Oslash"	TokenNameStringLiteral	Oslash
,	TokenNameCOMMA	
// 145 	TokenNameCOMMENT_LINE	145 
"infinity"	TokenNameStringLiteral	infinity
,	TokenNameCOMMA	
// 146 	TokenNameCOMMENT_LINE	146 
"plusminus"	TokenNameStringLiteral	plusminus
,	TokenNameCOMMA	
// 147 	TokenNameCOMMENT_LINE	147 
"lessequal"	TokenNameStringLiteral	lessequal
,	TokenNameCOMMA	
// 148 	TokenNameCOMMENT_LINE	148 
"greaterequal"	TokenNameStringLiteral	greaterequal
,	TokenNameCOMMA	
// 149 	TokenNameCOMMENT_LINE	149 
"yen"	TokenNameStringLiteral	yen
,	TokenNameCOMMA	
// 150 	TokenNameCOMMENT_LINE	150 
"mu"	TokenNameStringLiteral	mu
,	TokenNameCOMMA	
// 151 	TokenNameCOMMENT_LINE	151 
"partialdiff"	TokenNameStringLiteral	partialdiff
,	TokenNameCOMMA	
// 152 	TokenNameCOMMENT_LINE	152 
"summation"	TokenNameStringLiteral	summation
,	TokenNameCOMMA	
// 153 	TokenNameCOMMENT_LINE	153 
"product"	TokenNameStringLiteral	product
,	TokenNameCOMMA	
// 154 	TokenNameCOMMENT_LINE	154 
"pi"	TokenNameStringLiteral	pi
,	TokenNameCOMMA	
// 155 	TokenNameCOMMENT_LINE	155 
"integral'"	TokenNameStringLiteral	integral'
,	TokenNameCOMMA	
// 156 	TokenNameCOMMENT_LINE	156 
"ordfeminine"	TokenNameStringLiteral	ordfeminine
,	TokenNameCOMMA	
// 157 	TokenNameCOMMENT_LINE	157 
"ordmasculine"	TokenNameStringLiteral	ordmasculine
,	TokenNameCOMMA	
// 158 	TokenNameCOMMENT_LINE	158 
"Omega"	TokenNameStringLiteral	Omega
,	TokenNameCOMMA	
// 159 	TokenNameCOMMENT_LINE	159 
"ae"	TokenNameStringLiteral	ae
,	TokenNameCOMMA	
// 160 	TokenNameCOMMENT_LINE	160 
"oslash"	TokenNameStringLiteral	oslash
,	TokenNameCOMMA	
// 161 	TokenNameCOMMENT_LINE	161 
"questiondown"	TokenNameStringLiteral	questiondown
,	TokenNameCOMMA	
// 162 	TokenNameCOMMENT_LINE	162 
"exclamdown"	TokenNameStringLiteral	exclamdown
,	TokenNameCOMMA	
// 163 	TokenNameCOMMENT_LINE	163 
"logicalnot"	TokenNameStringLiteral	logicalnot
,	TokenNameCOMMA	
// 164 	TokenNameCOMMENT_LINE	164 
"radical"	TokenNameStringLiteral	radical
,	TokenNameCOMMA	
// 165 	TokenNameCOMMENT_LINE	165 
"florin"	TokenNameStringLiteral	florin
,	TokenNameCOMMA	
// 166 	TokenNameCOMMENT_LINE	166 
"approxequal"	TokenNameStringLiteral	approxequal
,	TokenNameCOMMA	
// 167 	TokenNameCOMMENT_LINE	167 
"increment"	TokenNameStringLiteral	increment
,	TokenNameCOMMA	
// 168 	TokenNameCOMMENT_LINE	168 
"guillemotleft"	TokenNameStringLiteral	guillemotleft
,	TokenNameCOMMA	
// 169 	TokenNameCOMMENT_LINE	169 
"guillemotright"	TokenNameStringLiteral	guillemotright
,	TokenNameCOMMA	
//170 	TokenNameCOMMENT_LINE	170 
"ellipsis"	TokenNameStringLiteral	ellipsis
,	TokenNameCOMMA	
// 171 	TokenNameCOMMENT_LINE	171 
"nbspace"	TokenNameStringLiteral	nbspace
,	TokenNameCOMMA	
// 172 	TokenNameCOMMENT_LINE	172 
"Agrave"	TokenNameStringLiteral	Agrave
,	TokenNameCOMMA	
// 173 	TokenNameCOMMENT_LINE	173 
"Atilde"	TokenNameStringLiteral	Atilde
,	TokenNameCOMMA	
// 174 	TokenNameCOMMENT_LINE	174 
"Otilde"	TokenNameStringLiteral	Otilde
,	TokenNameCOMMA	
// 175 	TokenNameCOMMENT_LINE	175 
"OE"	TokenNameStringLiteral	OE
,	TokenNameCOMMA	
// 176 	TokenNameCOMMENT_LINE	176 
"oe"	TokenNameStringLiteral	oe
,	TokenNameCOMMA	
// 177 	TokenNameCOMMENT_LINE	177 
"endash"	TokenNameStringLiteral	endash
,	TokenNameCOMMA	
// 178 	TokenNameCOMMENT_LINE	178 
"emdash"	TokenNameStringLiteral	emdash
,	TokenNameCOMMA	
// 179 	TokenNameCOMMENT_LINE	179 
"quotedblleft"	TokenNameStringLiteral	quotedblleft
,	TokenNameCOMMA	
// 180 	TokenNameCOMMENT_LINE	180 
"quotedblright"	TokenNameStringLiteral	quotedblright
,	TokenNameCOMMA	
// 181 	TokenNameCOMMENT_LINE	181 
"quoteleft"	TokenNameStringLiteral	quoteleft
,	TokenNameCOMMA	
// 182 	TokenNameCOMMENT_LINE	182 
"quoteright"	TokenNameStringLiteral	quoteright
,	TokenNameCOMMA	
// 183 	TokenNameCOMMENT_LINE	183 
"divide"	TokenNameStringLiteral	divide
,	TokenNameCOMMA	
// 184 	TokenNameCOMMENT_LINE	184 
"lozenge"	TokenNameStringLiteral	lozenge
,	TokenNameCOMMA	
// 185 	TokenNameCOMMENT_LINE	185 
"ydieresis"	TokenNameStringLiteral	ydieresis
,	TokenNameCOMMA	
// 186 	TokenNameCOMMENT_LINE	186 
"Ydieresis"	TokenNameStringLiteral	Ydieresis
,	TokenNameCOMMA	
// 187 	TokenNameCOMMENT_LINE	187 
"fraction"	TokenNameStringLiteral	fraction
,	TokenNameCOMMA	
// 188 	TokenNameCOMMENT_LINE	188 
"currency"	TokenNameStringLiteral	currency
,	TokenNameCOMMA	
// 189 	TokenNameCOMMENT_LINE	189 
"guilsinglleft"	TokenNameStringLiteral	guilsinglleft
,	TokenNameCOMMA	
// 190 	TokenNameCOMMENT_LINE	190 
"guilsinglright"	TokenNameStringLiteral	guilsinglright
,	TokenNameCOMMA	
//191 	TokenNameCOMMENT_LINE	191 
"fi"	TokenNameStringLiteral	fi
,	TokenNameCOMMA	
// 192 	TokenNameCOMMENT_LINE	192 
"fl"	TokenNameStringLiteral	fl
,	TokenNameCOMMA	
// 193 	TokenNameCOMMENT_LINE	193 
"daggerdbl"	TokenNameStringLiteral	daggerdbl
,	TokenNameCOMMA	
// 194 	TokenNameCOMMENT_LINE	194 
"middot"	TokenNameStringLiteral	middot
,	TokenNameCOMMA	
// 195 	TokenNameCOMMENT_LINE	195 
"quotesinglbase"	TokenNameStringLiteral	quotesinglbase
,	TokenNameCOMMA	
//196 	TokenNameCOMMENT_LINE	196 
"quotedblbase"	TokenNameStringLiteral	quotedblbase
,	TokenNameCOMMA	
// 197 	TokenNameCOMMENT_LINE	197 
"perthousand"	TokenNameStringLiteral	perthousand
,	TokenNameCOMMA	
// 198 	TokenNameCOMMENT_LINE	198 
"Acircumflex"	TokenNameStringLiteral	Acircumflex
,	TokenNameCOMMA	
// 199 	TokenNameCOMMENT_LINE	199 
"Ecircumflex"	TokenNameStringLiteral	Ecircumflex
,	TokenNameCOMMA	
// 200 	TokenNameCOMMENT_LINE	200 
"Aacute"	TokenNameStringLiteral	Aacute
,	TokenNameCOMMA	
// 201 	TokenNameCOMMENT_LINE	201 
"Edieresis"	TokenNameStringLiteral	Edieresis
,	TokenNameCOMMA	
// 202 	TokenNameCOMMENT_LINE	202 
"Egrave"	TokenNameStringLiteral	Egrave
,	TokenNameCOMMA	
// 203 	TokenNameCOMMENT_LINE	203 
"Iacute"	TokenNameStringLiteral	Iacute
,	TokenNameCOMMA	
// 204 	TokenNameCOMMENT_LINE	204 
"Icircumflex"	TokenNameStringLiteral	Icircumflex
,	TokenNameCOMMA	
// 205 	TokenNameCOMMENT_LINE	205 
"Idieresis"	TokenNameStringLiteral	Idieresis
,	TokenNameCOMMA	
// 206 	TokenNameCOMMENT_LINE	206 
"Igrave"	TokenNameStringLiteral	Igrave
,	TokenNameCOMMA	
// 207 	TokenNameCOMMENT_LINE	207 
"Oacute"	TokenNameStringLiteral	Oacute
,	TokenNameCOMMA	
// 208 	TokenNameCOMMENT_LINE	208 
"Ocircumflex"	TokenNameStringLiteral	Ocircumflex
,	TokenNameCOMMA	
// 209 	TokenNameCOMMENT_LINE	209 
""	TokenNameStringLiteral	 
,	TokenNameCOMMA	
// 210 	TokenNameCOMMENT_LINE	210 
"Ograve"	TokenNameStringLiteral	Ograve
,	TokenNameCOMMA	
// 211 	TokenNameCOMMENT_LINE	211 
"Uacute"	TokenNameStringLiteral	Uacute
,	TokenNameCOMMA	
// 212 	TokenNameCOMMENT_LINE	212 
"Ucircumflex"	TokenNameStringLiteral	Ucircumflex
,	TokenNameCOMMA	
// 213 	TokenNameCOMMENT_LINE	213 
"Ugrave"	TokenNameStringLiteral	Ugrave
,	TokenNameCOMMA	
// 214 	TokenNameCOMMENT_LINE	214 
"dotlessi"	TokenNameStringLiteral	dotlessi
,	TokenNameCOMMA	
// 215 	TokenNameCOMMENT_LINE	215 
"circumflex"	TokenNameStringLiteral	circumflex
,	TokenNameCOMMA	
// 216 	TokenNameCOMMENT_LINE	216 
"tilde"	TokenNameStringLiteral	tilde
,	TokenNameCOMMA	
// 217 	TokenNameCOMMENT_LINE	217 
"overscore"	TokenNameStringLiteral	overscore
,	TokenNameCOMMA	
// 218 	TokenNameCOMMENT_LINE	218 
"breve"	TokenNameStringLiteral	breve
,	TokenNameCOMMA	
// 219 	TokenNameCOMMENT_LINE	219 
"dotaccent"	TokenNameStringLiteral	dotaccent
,	TokenNameCOMMA	
// 220 	TokenNameCOMMENT_LINE	220 
"ring"	TokenNameStringLiteral	ring
,	TokenNameCOMMA	
// 221 	TokenNameCOMMENT_LINE	221 
"cedilla"	TokenNameStringLiteral	cedilla
,	TokenNameCOMMA	
// 222 	TokenNameCOMMENT_LINE	222 
"hungarumlaut"	TokenNameStringLiteral	hungarumlaut
,	TokenNameCOMMA	
// 223 	TokenNameCOMMENT_LINE	223 
"ogonek"	TokenNameStringLiteral	ogonek
,	TokenNameCOMMA	
// 224 	TokenNameCOMMENT_LINE	224 
"caron"	TokenNameStringLiteral	caron
,	TokenNameCOMMA	
// 225 	TokenNameCOMMENT_LINE	225 
"Lslash"	TokenNameStringLiteral	Lslash
,	TokenNameCOMMA	
// 226 	TokenNameCOMMENT_LINE	226 
"lslash"	TokenNameStringLiteral	lslash
,	TokenNameCOMMA	
// 227 	TokenNameCOMMENT_LINE	227 
"Scaron"	TokenNameStringLiteral	Scaron
,	TokenNameCOMMA	
// 228 	TokenNameCOMMENT_LINE	228 
"scaron"	TokenNameStringLiteral	scaron
,	TokenNameCOMMA	
// 229 	TokenNameCOMMENT_LINE	229 
"Zcaron"	TokenNameStringLiteral	Zcaron
,	TokenNameCOMMA	
// 230 	TokenNameCOMMENT_LINE	230 
"zcaron"	TokenNameStringLiteral	zcaron
,	TokenNameCOMMA	
// 231 	TokenNameCOMMENT_LINE	231 
"brokenbar"	TokenNameStringLiteral	brokenbar
,	TokenNameCOMMA	
// 232 	TokenNameCOMMENT_LINE	232 
"Eth"	TokenNameStringLiteral	Eth
,	TokenNameCOMMA	
// 233 	TokenNameCOMMENT_LINE	233 
"eth"	TokenNameStringLiteral	eth
,	TokenNameCOMMA	
// 234 	TokenNameCOMMENT_LINE	234 
"Yacute"	TokenNameStringLiteral	Yacute
,	TokenNameCOMMA	
// 235 	TokenNameCOMMENT_LINE	235 
"yacute"	TokenNameStringLiteral	yacute
,	TokenNameCOMMA	
// 236 	TokenNameCOMMENT_LINE	236 
"Thorn"	TokenNameStringLiteral	Thorn
,	TokenNameCOMMA	
// 237 	TokenNameCOMMENT_LINE	237 
"thorn"	TokenNameStringLiteral	thorn
,	TokenNameCOMMA	
// 238 	TokenNameCOMMENT_LINE	238 
"minus"	TokenNameStringLiteral	minus
,	TokenNameCOMMA	
// 239 	TokenNameCOMMENT_LINE	239 
"multiply"	TokenNameStringLiteral	multiply
,	TokenNameCOMMA	
// 240 	TokenNameCOMMENT_LINE	240 
"onesuperior"	TokenNameStringLiteral	onesuperior
,	TokenNameCOMMA	
// 241 	TokenNameCOMMENT_LINE	241 
"twosuperior"	TokenNameStringLiteral	twosuperior
,	TokenNameCOMMA	
// 242 	TokenNameCOMMENT_LINE	242 
"threesuperior"	TokenNameStringLiteral	threesuperior
,	TokenNameCOMMA	
// 243 	TokenNameCOMMENT_LINE	243 
"onehalf"	TokenNameStringLiteral	onehalf
,	TokenNameCOMMA	
// 244 	TokenNameCOMMENT_LINE	244 
"onequarter"	TokenNameStringLiteral	onequarter
,	TokenNameCOMMA	
// 245 	TokenNameCOMMENT_LINE	245 
"threequarters"	TokenNameStringLiteral	threequarters
,	TokenNameCOMMA	
// 246 	TokenNameCOMMENT_LINE	246 
"franc"	TokenNameStringLiteral	franc
,	TokenNameCOMMA	
// 247 	TokenNameCOMMENT_LINE	247 
"Gbreve"	TokenNameStringLiteral	Gbreve
,	TokenNameCOMMA	
// 248 	TokenNameCOMMENT_LINE	248 
"gbreve"	TokenNameStringLiteral	gbreve
,	TokenNameCOMMA	
// 249 	TokenNameCOMMENT_LINE	249 
"Idot"	TokenNameStringLiteral	Idot
,	TokenNameCOMMA	
// 250 	TokenNameCOMMENT_LINE	250 
"Scedilla"	TokenNameStringLiteral	Scedilla
,	TokenNameCOMMA	
// 251 	TokenNameCOMMENT_LINE	251 
"scedilla"	TokenNameStringLiteral	scedilla
,	TokenNameCOMMA	
// 252 	TokenNameCOMMENT_LINE	252 
"Cacute"	TokenNameStringLiteral	Cacute
,	TokenNameCOMMA	
// 253 	TokenNameCOMMENT_LINE	253 
"cacute"	TokenNameStringLiteral	cacute
,	TokenNameCOMMA	
// 254 	TokenNameCOMMENT_LINE	254 
"Ccaron"	TokenNameStringLiteral	Ccaron
,	TokenNameCOMMA	
// 255 	TokenNameCOMMENT_LINE	255 
"ccaron"	TokenNameStringLiteral	ccaron
,	TokenNameCOMMA	
// 256 	TokenNameCOMMENT_LINE	256 
""	TokenNameStringLiteral	 
// 257 	TokenNameCOMMENT_LINE	257 
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
version	TokenNameIdentifier	 version
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
italicAngle	TokenNameIdentifier	 italic Angle
;	TokenNameSEMICOLON	
private	TokenNameprivate	
short	TokenNameshort	
underlinePosition	TokenNameIdentifier	 underline Position
;	TokenNameSEMICOLON	
private	TokenNameprivate	
short	TokenNameshort	
underlineThickness	TokenNameIdentifier	 underline Thickness
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
isFixedPitch	TokenNameIdentifier	 is Fixed Pitch
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
minMemType42	TokenNameIdentifier	 min Mem Type42
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
maxMemType42	TokenNameIdentifier	 max Mem Type42
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
minMemType1	TokenNameIdentifier	 min Mem Type1
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
maxMemType1	TokenNameIdentifier	 max Mem Type1
;	TokenNameSEMICOLON	
// v2 	TokenNameCOMMENT_LINE	v2 
private	TokenNameprivate	
int	TokenNameint	
numGlyphs	TokenNameIdentifier	 num Glyphs
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
glyphNameIndex	TokenNameIdentifier	 glyph Name Index
;	TokenNameSEMICOLON	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
psGlyphName	TokenNameIdentifier	 ps Glyph Name
;	TokenNameSEMICOLON	
/** Creates new PostTable */	TokenNameCOMMENT_JAVADOC	 Creates new PostTable 
protected	TokenNameprotected	
PostTable	TokenNameIdentifier	 Post Table
(	TokenNameLPAREN	
DirectoryEntry	TokenNameIdentifier	 Directory Entry
de	TokenNameIdentifier	 de
,	TokenNameCOMMA	
RandomAccessFile	TokenNameIdentifier	 Random Access File
raf	TokenNameIdentifier	 raf
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
raf	TokenNameIdentifier	 raf
.	TokenNameDOT	
seek	TokenNameIdentifier	 seek
(	TokenNameLPAREN	
de	TokenNameIdentifier	 de
.	TokenNameDOT	
getOffset	TokenNameIdentifier	 get Offset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
version	TokenNameIdentifier	 version
=	TokenNameEQUAL	
raf	TokenNameIdentifier	 raf
.	TokenNameDOT	
readInt	TokenNameIdentifier	 read Int
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
italicAngle	TokenNameIdentifier	 italic Angle
=	TokenNameEQUAL	
raf	TokenNameIdentifier	 raf
.	TokenNameDOT	
readInt	TokenNameIdentifier	 read Int
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
underlinePosition	TokenNameIdentifier	 underline Position
=	TokenNameEQUAL	
raf	TokenNameIdentifier	 raf
.	TokenNameDOT	
readShort	TokenNameIdentifier	 read Short
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
underlineThickness	TokenNameIdentifier	 underline Thickness
=	TokenNameEQUAL	
raf	TokenNameIdentifier	 raf
.	TokenNameDOT	
readShort	TokenNameIdentifier	 read Short
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
isFixedPitch	TokenNameIdentifier	 is Fixed Pitch
=	TokenNameEQUAL	
raf	TokenNameIdentifier	 raf
.	TokenNameDOT	
readInt	TokenNameIdentifier	 read Int
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
minMemType42	TokenNameIdentifier	 min Mem Type42
=	TokenNameEQUAL	
raf	TokenNameIdentifier	 raf
.	TokenNameDOT	
readInt	TokenNameIdentifier	 read Int
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
maxMemType42	TokenNameIdentifier	 max Mem Type42
=	TokenNameEQUAL	
raf	TokenNameIdentifier	 raf
.	TokenNameDOT	
readInt	TokenNameIdentifier	 read Int
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
minMemType1	TokenNameIdentifier	 min Mem Type1
=	TokenNameEQUAL	
raf	TokenNameIdentifier	 raf
.	TokenNameDOT	
readInt	TokenNameIdentifier	 read Int
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
maxMemType1	TokenNameIdentifier	 max Mem Type1
=	TokenNameEQUAL	
raf	TokenNameIdentifier	 raf
.	TokenNameDOT	
readInt	TokenNameIdentifier	 read Int
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
version	TokenNameIdentifier	 version
==	TokenNameEQUAL_EQUAL	
0x00020000	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
numGlyphs	TokenNameIdentifier	 num Glyphs
=	TokenNameEQUAL	
raf	TokenNameIdentifier	 raf
.	TokenNameDOT	
readUnsignedShort	TokenNameIdentifier	 read Unsigned Short
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
glyphNameIndex	TokenNameIdentifier	 glyph Name Index
=	TokenNameEQUAL	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
numGlyphs	TokenNameIdentifier	 num Glyphs
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
numGlyphs	TokenNameIdentifier	 num Glyphs
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
glyphNameIndex	TokenNameIdentifier	 glyph Name Index
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
raf	TokenNameIdentifier	 raf
.	TokenNameDOT	
readUnsignedShort	TokenNameIdentifier	 read Unsigned Short
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
int	TokenNameint	
h	TokenNameIdentifier	 h
=	TokenNameEQUAL	
highestGlyphNameIndex	TokenNameIdentifier	 highest Glyph Name Index
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
h	TokenNameIdentifier	 h
>	TokenNameGREATER	
257	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
h	TokenNameIdentifier	 h
-=	TokenNameMINUS_EQUAL	
257	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
psGlyphName	TokenNameIdentifier	 ps Glyph Name
=	TokenNameEQUAL	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
h	TokenNameIdentifier	 h
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
h	TokenNameIdentifier	 h
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
len	TokenNameIdentifier	 len
=	TokenNameEQUAL	
raf	TokenNameIdentifier	 raf
.	TokenNameDOT	
readUnsignedByte	TokenNameIdentifier	 read Unsigned Byte
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
buf	TokenNameIdentifier	 buf
=	TokenNameEQUAL	
new	TokenNamenew	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
len	TokenNameIdentifier	 len
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
raf	TokenNameIdentifier	 raf
.	TokenNameDOT	
readFully	TokenNameIdentifier	 read Fully
(	TokenNameLPAREN	
buf	TokenNameIdentifier	 buf
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
psGlyphName	TokenNameIdentifier	 ps Glyph Name
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
new	TokenNamenew	
String	TokenNameIdentifier	 String
(	TokenNameLPAREN	
buf	TokenNameIdentifier	 buf
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
version	TokenNameIdentifier	 version
==	TokenNameEQUAL_EQUAL	
0x00020005	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
private	TokenNameprivate	
int	TokenNameint	
highestGlyphNameIndex	TokenNameIdentifier	 highest Glyph Name Index
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
high	TokenNameIdentifier	 high
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
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
numGlyphs	TokenNameIdentifier	 num Glyphs
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
high	TokenNameIdentifier	 high
<	TokenNameLESS	
glyphNameIndex	TokenNameIdentifier	 glyph Name Index
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
high	TokenNameIdentifier	 high
=	TokenNameEQUAL	
glyphNameIndex	TokenNameIdentifier	 glyph Name Index
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
high	TokenNameIdentifier	 high
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getGlyphName	TokenNameIdentifier	 get Glyph Name
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
version	TokenNameIdentifier	 version
==	TokenNameEQUAL_EQUAL	
0x00020000	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
glyphNameIndex	TokenNameIdentifier	 glyph Name Index
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
>	TokenNameGREATER	
257	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
psGlyphName	TokenNameIdentifier	 ps Glyph Name
[	TokenNameLBRACKET	
glyphNameIndex	TokenNameIdentifier	 glyph Name Index
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
-	TokenNameMINUS	
258	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
:	TokenNameCOLON	
macGlyphName	TokenNameIdentifier	 mac Glyph Name
[	TokenNameLBRACKET	
glyphNameIndex	TokenNameIdentifier	 glyph Name Index
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** Get the table type, as a table directory value. * @return The table type */	TokenNameCOMMENT_JAVADOC	 Get the table type, as a table directory value. @return The table type 
public	TokenNamepublic	
int	TokenNameint	
getType	TokenNameIdentifier	 get Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
post	TokenNameIdentifier	 post
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
