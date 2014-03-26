/* Copyright 1999 CERN - European Organization for Nuclear Research. Permission to use, copy, modify, distribute and sell this software and its documentation for any purpose is hereby granted without fee, provided that the above copyright notice appear in all copies and that both that copyright notice and this permission notice appear in supporting documentation. CERN makes no representations about the suitability of this software for any purpose. It is provided "as is" without expressed or implied warranty. */	TokenNameCOMMENT_BLOCK	 Copyright 1999 CERN - European Organization for Nuclear Research. Permission to use, copy, modify, distribute and sell this software and its documentation for any purpose is hereby granted without fee, provided that the above copyright notice appear in all copies and that both that copyright notice and this permission notice appear in supporting documentation. CERN makes no representations about the suitability of this software for any purpose. It is provided "as is" without expressed or implied warranty. 
package	TokenNamepackage	
edu	TokenNameIdentifier	 edu
.	TokenNameDOT	
cmu	TokenNameIdentifier	 cmu
.	TokenNameDOT	
minorthird	TokenNameIdentifier	 minorthird
.	TokenNameDOT	
classify	TokenNameIdentifier	 classify
.	TokenNameDOT	
algorithms	TokenNameIdentifier	 algorithms
.	TokenNameDOT	
random	TokenNameIdentifier	 random
;	TokenNameSEMICOLON	
/*= * Arithmetic functions. */	TokenNameCOMMENT_BLOCK	= Arithmetic functions. 
public	TokenNamepublic	
class	TokenNameclass	
Arithmetic	TokenNameIdentifier	 Arithmetic
extends	TokenNameextends	
Constants	TokenNameIdentifier	 Constants
{	TokenNameLBRACE	
// for method stirlingCorrection(...) 	TokenNameCOMMENT_LINE	for method stirlingCorrection(...) 
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
double	TokenNamedouble	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
stirlingCorrection	TokenNameIdentifier	 stirling Correction
=	TokenNameEQUAL	
{	TokenNameLBRACE	
0.0	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
8.106146679532726e-02	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
4.134069595540929e-02	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
2.767792568499834e-02	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
2.079067210376509e-02	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
1.664469118982119e-02	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
1.387612882307075e-02	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
1.189670994589177e-02	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
1.041126526197209e-02	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
9.255462182712733e-03	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
8.330563433362871e-03	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
7.573675487951841e-03	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
6.942840107209530e-03	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
6.408994188004207e-03	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
5.951370112758848e-03	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
5.554733551962801e-03	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
5.207655919609640e-03	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
4.901395948434738e-03	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
4.629153749334029e-03	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
4.385560249232324e-03	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
4.166319691996922e-03	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
3.967954218640860e-03	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
3.787618068444430e-03	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
3.622960224683090e-03	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
3.472021382978770e-03	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
3.333155636728090e-03	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
3.204970228055040e-03	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
3.086278682608780e-03	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
2.976063983550410e-03	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
2.873449362352470e-03	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
2.777674929752690e-03	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
// for method logFactorial(...) 	TokenNameCOMMENT_LINE	for method logFactorial(...) 
// log(k!) for k = 0, ..., 29 	TokenNameCOMMENT_LINE	log(k!) for k = 0, ..., 29 
protected	TokenNameprotected	
static	TokenNamestatic	
final	TokenNamefinal	
double	TokenNamedouble	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
logFactorials	TokenNameIdentifier	 log Factorials
=	TokenNameEQUAL	
{	TokenNameLBRACE	
0.00000000000000000	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
0.00000000000000000	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
0.69314718055994531	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
1.79175946922805500	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
3.17805383034794562	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
4.78749174278204599	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
6.57925121201010100	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
8.52516136106541430	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
10.60460290274525023	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
12.80182748008146961	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
15.10441257307551530	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
17.50230784587388584	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
19.98721449566188615	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
22.55216385312342289	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
25.19122118273868150	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
27.89927138384089157	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
30.67186010608067280	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
33.50507345013688888	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
36.39544520803305358	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
39.33988418719949404	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
42.33561646075348503	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
45.38013889847690803	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
48.47118135183522388	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
51.60667556776437357	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
54.78472939811231919	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
58.00360522298051994	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
61.26170176100200198	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
64.55753862700633106	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
67.88974313718153498	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
71.25703896716800901	TokenNameDoubleLiteral	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
// k! for k = 0, ..., 20 	TokenNameCOMMENT_LINE	k! for k = 0, ..., 20 
protected	TokenNameprotected	
static	TokenNamestatic	
final	TokenNamefinal	
long	TokenNamelong	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
longFactorials	TokenNameIdentifier	 long Factorials
=	TokenNameEQUAL	
{	TokenNameLBRACE	
1L	TokenNameLongLiteral	
,	TokenNameCOMMA	
1L	TokenNameLongLiteral	
,	TokenNameCOMMA	
2L	TokenNameLongLiteral	
,	TokenNameCOMMA	
6L	TokenNameLongLiteral	
,	TokenNameCOMMA	
24L	TokenNameLongLiteral	
,	TokenNameCOMMA	
120L	TokenNameLongLiteral	
,	TokenNameCOMMA	
720L	TokenNameLongLiteral	
,	TokenNameCOMMA	
5040L	TokenNameLongLiteral	
,	TokenNameCOMMA	
40320L	TokenNameLongLiteral	
,	TokenNameCOMMA	
362880L	TokenNameLongLiteral	
,	TokenNameCOMMA	
3628800L	TokenNameLongLiteral	
,	TokenNameCOMMA	
39916800L	TokenNameLongLiteral	
,	TokenNameCOMMA	
479001600L	TokenNameLongLiteral	
,	TokenNameCOMMA	
6227020800L	TokenNameLongLiteral	
,	TokenNameCOMMA	
87178291200L	TokenNameLongLiteral	
,	TokenNameCOMMA	
1307674368000L	TokenNameLongLiteral	
,	TokenNameCOMMA	
20922789888000L	TokenNameLongLiteral	
,	TokenNameCOMMA	
355687428096000L	TokenNameLongLiteral	
,	TokenNameCOMMA	
6402373705728000L	TokenNameLongLiteral	
,	TokenNameCOMMA	
121645100408832000L	TokenNameLongLiteral	
,	TokenNameCOMMA	
2432902008176640000L	TokenNameLongLiteral	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
// k! for k = 21, ..., 170 	TokenNameCOMMENT_LINE	k! for k = 21, ..., 170 
protected	TokenNameprotected	
static	TokenNamestatic	
final	TokenNamefinal	
double	TokenNamedouble	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
doubleFactorials	TokenNameIdentifier	 double Factorials
=	TokenNameEQUAL	
{	TokenNameLBRACE	
5.109094217170944E19	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
1.1240007277776077E21	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
2.585201673888498E22	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
6.204484017332394E23	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
1.5511210043330984E25	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
4.032914611266057E26	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
1.0888869450418352E28	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
3.048883446117138E29	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
8.841761993739701E30	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
2.652528598121911E32	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
8.222838654177924E33	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
2.6313083693369355E35	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
8.68331761881189E36	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
2.952327990396041E38	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
1.0333147966386144E40	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
3.719933267899013E41	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
1.3763753091226346E43	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
5.23022617466601E44	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
2.0397882081197447E46	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
8.15915283247898E47	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
3.34525266131638E49	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
1.4050061177528801E51	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
6.041526306337384E52	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
2.6582715747884495E54	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
1.196222208654802E56	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
5.502622159812089E57	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
2.5862324151116827E59	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
1.2413915592536068E61	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
6.082818640342679E62	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
3.0414093201713376E64	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
1.5511187532873816E66	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
8.06581751709439E67	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
4.274883284060024E69	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
2.308436973392413E71	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
1.2696403353658264E73	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
7.109985878048632E74	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
4.052691950487723E76	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
2.350561331282879E78	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
1.386831185456898E80	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
8.32098711274139E81	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
5.075802138772246E83	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
3.146997326038794E85	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
1.9826083154044396E87	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
1.2688693218588414E89	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
8.247650592082472E90	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
5.443449390774432E92	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
3.6471110918188705E94	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
2.48003554243683E96	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
1.7112245242814127E98	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
1.1978571669969892E100	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
8.504785885678624E101	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
6.123445837688612E103	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
4.470115461512686E105	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
3.307885441519387E107	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
2.4809140811395404E109	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
1.8854947016660506E111	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
1.451830920282859E113	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
1.1324281178206295E115	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
8.94618213078298E116	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
7.15694570462638E118	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
5.797126020747369E120	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
4.7536433370128435E122	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
3.94552396972066E124	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
3.314240134565354E126	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
2.8171041143805494E128	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
2.4227095383672744E130	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
2.107757298379527E132	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
1.854826422573984E134	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
1.6507955160908465E136	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
1.4857159644817605E138	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
1.3520015276784033E140	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
1.2438414054641305E142	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
1.156772507081641E144	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
1.0873661566567426E146	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
1.0329978488239061E148	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
9.916779348709491E149	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
9.619275968248216E151	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
9.426890448883248E153	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
9.332621544394415E155	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
9.332621544394418E157	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
9.42594775983836E159	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
9.614466715035125E161	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
9.902900716486178E163	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
1.0299016745145631E166	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
1.0813967582402912E168	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
1.1462805637347086E170	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
1.2265202031961373E172	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
1.324641819451829E174	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
1.4438595832024942E176	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
1.5882455415227423E178	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
1.7629525510902457E180	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
1.974506857221075E182	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
2.2311927486598138E184	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
2.543559733472186E186	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
2.925093693493014E188	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
3.393108684451899E190	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
3.96993716080872E192	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
4.6845258497542896E194	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
5.574585761207606E196	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
6.689502913449135E198	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
8.094298525273444E200	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
9.875044200833601E202	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
1.2146304367025332E205	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
1.506141741511141E207	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
1.882677176888926E209	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
2.3721732428800483E211	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
3.0126600184576624E213	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
3.856204823625808E215	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
4.974504222477287E217	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
6.466855489220473E219	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
8.471580690878813E221	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
1.1182486511960037E224	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
1.4872707060906847E226	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
1.99294274616152E228	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
2.690472707318049E230	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
3.6590428819525483E232	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
5.0128887482749884E234	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
6.917786472619482E236	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
9.615723196941089E238	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
1.3462012475717523E241	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
1.8981437590761713E243	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
2.6953641378881633E245	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
3.8543707171800694E247	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
5.550293832739308E249	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
8.047926057471989E251	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
1.1749972043909107E254	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
1.72724589045464E256	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
2.5563239178728637E258	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
3.8089226376305687E260	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
5.7133839564458575E262	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
8.627209774233244E264	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
1.3113358856834527E267	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
2.0063439050956838E269	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
3.0897696138473515E271	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
4.789142901463393E273	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
7.471062926282892E275	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
1.1729568794264134E278	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
1.8532718694937346E280	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
2.946702272495036E282	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
4.714723635992061E284	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
7.590705053947223E286	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
1.2296942187394494E289	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
2.0044015765453032E291	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
3.287218585534299E293	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
5.423910666131583E295	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
9.003691705778434E297	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
1.5036165148649983E300	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
2.5260757449731988E302	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
4.2690680090047056E304	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
7.257415615308004E306	TokenNameDoubleLiteral	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
/*= * Makes this class non instantiable, but still let's others inherit from it. */	TokenNameCOMMENT_BLOCK	= Makes this class non instantiable, but still let's others inherit from it. 
protected	TokenNameprotected	
Arithmetic	TokenNameIdentifier	 Arithmetic
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/*= * Efficiently returns the binomial coefficient, often also referred to as "n over k" or "n choose k". * The binomial coefficient is defined as <tt>(n * n-1 * ... * n-k+1 ) / ( 1 * 2 * ... * k )</tt>. * <ul> * <li>k<0<tt>: <tt>0</tt>. * <li>k==0<tt>: <tt>1</tt>. * <li>k==1<tt>: <tt>n</tt>. * <li>else: <tt>(n * n-1 * ... * n-k+1 ) / ( 1 * 2 * ... * k )</tt>. * </ul> * @return the binomial coefficient. */	TokenNameCOMMENT_BLOCK	= Efficiently returns the binomial coefficient, often also referred to as "n over k" or "n choose k". The binomial coefficient is defined as <tt>(n n-1 ... n-k+1 ) / ( 1 2 ... k )</tt>. <ul> <li>k<0<tt>: <tt>0</tt>. <li>k==0<tt>: <tt>1</tt>. <li>k==1<tt>: <tt>n</tt>. <li>else: <tt>(n n-1 ... n-k+1 ) / ( 1 2 ... k )</tt>. </ul> @return the binomial coefficient. 
public	TokenNamepublic	
static	TokenNamestatic	
double	TokenNamedouble	
binomial	TokenNameIdentifier	 binomial
(	TokenNameLPAREN	
double	TokenNamedouble	
n	TokenNameIdentifier	 n
,	TokenNameCOMMA	
long	TokenNamelong	
k	TokenNameIdentifier	 k
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
k	TokenNameIdentifier	 k
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
return	TokenNamereturn	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
k	TokenNameIdentifier	 k
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
return	TokenNamereturn	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
k	TokenNameIdentifier	 k
==	TokenNameEQUAL_EQUAL	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
return	TokenNamereturn	
n	TokenNameIdentifier	 n
;	TokenNameSEMICOLON	
// binomial(n,k) = (n * n-1 * ... * n-k+1 ) / ( 1 * 2 * ... * k ) 	TokenNameCOMMENT_LINE	binomial(n,k) = (n * n-1 * ... * n-k+1 ) / ( 1 * 2 * ... * k ) 
double	TokenNamedouble	
a	TokenNameIdentifier	 a
=	TokenNameEQUAL	
n	TokenNameIdentifier	 n
-	TokenNameMINUS	
k	TokenNameIdentifier	 k
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
double	TokenNamedouble	
b	TokenNameIdentifier	 b
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
double	TokenNamedouble	
binomial	TokenNameIdentifier	 binomial
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
long	TokenNamelong	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
k	TokenNameIdentifier	 k
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
--	TokenNameMINUS_MINUS	
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
binomial	TokenNameIdentifier	 binomial
*=	TokenNameMULTIPLY_EQUAL	
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
/	TokenNameDIVIDE	
(	TokenNameLPAREN	
b	TokenNameIdentifier	 b
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
binomial	TokenNameIdentifier	 binomial
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/*= * Efficiently returns the binomial coefficient, often also referred to as "n over k" or "n choose k". * The binomial coefficient is defined as * <ul> * <li>k<0<tt>: <tt>0</tt>. * <li>k==0 || k==n<tt>: <tt>1</tt>. * <li>k==1 || k==n-1<tt>: <tt>n</tt>. * <li>else: <tt>(n * n-1 * ... * n-k+1 ) / ( 1 * 2 * ... * k )</tt>. * </ul> * @return the binomial coefficient. */	TokenNameCOMMENT_BLOCK	= Efficiently returns the binomial coefficient, often also referred to as "n over k" or "n choose k". The binomial coefficient is defined as <ul> <li>k<0<tt>: <tt>0</tt>. <li>k==0 || k==n<tt>: <tt>1</tt>. <li>k==1 || k==n-1<tt>: <tt>n</tt>. <li>else: <tt>(n n-1 ... n-k+1 ) / ( 1 2 ... k )</tt>. </ul> @return the binomial coefficient. 
public	TokenNamepublic	
static	TokenNamestatic	
double	TokenNamedouble	
binomial	TokenNameIdentifier	 binomial
(	TokenNameLPAREN	
long	TokenNamelong	
n	TokenNameIdentifier	 n
,	TokenNameCOMMA	
long	TokenNamelong	
k	TokenNameIdentifier	 k
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
k	TokenNameIdentifier	 k
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
return	TokenNamereturn	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
k	TokenNameIdentifier	 k
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
||	TokenNameOR_OR	
k	TokenNameIdentifier	 k
==	TokenNameEQUAL_EQUAL	
n	TokenNameIdentifier	 n
)	TokenNameRPAREN	
return	TokenNamereturn	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
k	TokenNameIdentifier	 k
==	TokenNameEQUAL_EQUAL	
1	TokenNameIntegerLiteral	
||	TokenNameOR_OR	
k	TokenNameIdentifier	 k
==	TokenNameEQUAL_EQUAL	
n	TokenNameIdentifier	 n
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
return	TokenNamereturn	
n	TokenNameIdentifier	 n
;	TokenNameSEMICOLON	
// try quick version and see whether we get numeric overflows. 	TokenNameCOMMENT_LINE	try quick version and see whether we get numeric overflows. 
// factorial(..) is O(1); requires no loop; only a table lookup. 	TokenNameCOMMENT_LINE	factorial(..) is O(1); requires no loop; only a table lookup. 
if	TokenNameif	
(	TokenNameLPAREN	
n	TokenNameIdentifier	 n
>	TokenNameGREATER	
k	TokenNameIdentifier	 k
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
max	TokenNameIdentifier	 max
=	TokenNameEQUAL	
longFactorials	TokenNameIdentifier	 long Factorials
.	TokenNameDOT	
length	TokenNameIdentifier	 length
+	TokenNamePLUS	
doubleFactorials	TokenNameIdentifier	 double Factorials
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
n	TokenNameIdentifier	 n
<	TokenNameLESS	
max	TokenNameIdentifier	 max
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// if (n! < inf && k! < inf) 	TokenNameCOMMENT_LINE	if (n! < inf && k! < inf) 
double	TokenNamedouble	
n_fac	TokenNameIdentifier	 n fac
=	TokenNameEQUAL	
factorial	TokenNameIdentifier	 factorial
(	TokenNameLPAREN	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
n	TokenNameIdentifier	 n
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
double	TokenNamedouble	
k_fac	TokenNameIdentifier	 k fac
=	TokenNameEQUAL	
factorial	TokenNameIdentifier	 factorial
(	TokenNameLPAREN	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
k	TokenNameIdentifier	 k
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
double	TokenNamedouble	
n_minus_k_fac	TokenNameIdentifier	 n minus k fac
=	TokenNameEQUAL	
factorial	TokenNameIdentifier	 factorial
(	TokenNameLPAREN	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
n	TokenNameIdentifier	 n
-	TokenNameMINUS	
k	TokenNameIdentifier	 k
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
double	TokenNamedouble	
nk	TokenNameIdentifier	 nk
=	TokenNameEQUAL	
n_minus_k_fac	TokenNameIdentifier	 n minus k fac
*	TokenNameMULTIPLY	
k_fac	TokenNameIdentifier	 k fac
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
nk	TokenNameIdentifier	 nk
!=	TokenNameNOT_EQUAL	
Double	TokenNameIdentifier	 Double
.	TokenNameDOT	
POSITIVE_INFINITY	TokenNameIdentifier	 POSITIVE  INFINITY
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// no numeric overflow? 	TokenNameCOMMENT_LINE	no numeric overflow? 
// now this is completely safe and accurate 	TokenNameCOMMENT_LINE	now this is completely safe and accurate 
return	TokenNamereturn	
n_fac	TokenNameIdentifier	 n fac
/	TokenNameDIVIDE	
nk	TokenNameIdentifier	 nk
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
k	TokenNameIdentifier	 k
>	TokenNameGREATER	
n	TokenNameIdentifier	 n
/	TokenNameDIVIDE	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
k	TokenNameIdentifier	 k
=	TokenNameEQUAL	
n	TokenNameIdentifier	 n
-	TokenNameMINUS	
k	TokenNameIdentifier	 k
;	TokenNameSEMICOLON	
// quicker 	TokenNameCOMMENT_LINE	quicker 
}	TokenNameRBRACE	
// binomial(n,k) = (n * n-1 * ... * n-k+1 ) / ( 1 * 2 * ... * k ) 	TokenNameCOMMENT_LINE	binomial(n,k) = (n * n-1 * ... * n-k+1 ) / ( 1 * 2 * ... * k ) 
long	TokenNamelong	
a	TokenNameIdentifier	 a
=	TokenNameEQUAL	
n	TokenNameIdentifier	 n
-	TokenNameMINUS	
k	TokenNameIdentifier	 k
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
long	TokenNamelong	
b	TokenNameIdentifier	 b
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
double	TokenNamedouble	
binomial	TokenNameIdentifier	 binomial
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
long	TokenNamelong	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
k	TokenNameIdentifier	 k
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
--	TokenNameMINUS_MINUS	
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
binomial	TokenNameIdentifier	 binomial
*=	TokenNameMULTIPLY_EQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
double	TokenNamedouble	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
/	TokenNameDIVIDE	
(	TokenNameLPAREN	
b	TokenNameIdentifier	 b
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
binomial	TokenNameIdentifier	 binomial
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/*= * Returns the smallest <code>long &gt;= value</code>. * <dt>Examples: <code>1.0 -> 1, 1.2 -> 2, 1.9 -> 2</code>. * This method is safer than using (long) Math.ceil(value), because of possible rounding error. */	TokenNameCOMMENT_BLOCK	= Returns the smallest <code>long &gt;= value</code>. <dt>Examples: <code>1.0 -> 1, 1.2 -> 2, 1.9 -> 2</code>. This method is safer than using (long) Math.ceil(value), because of possible rounding error. 
public	TokenNamepublic	
static	TokenNamestatic	
long	TokenNamelong	
ceil	TokenNameIdentifier	 ceil
(	TokenNameLPAREN	
double	TokenNamedouble	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
round	TokenNameIdentifier	 round
(	TokenNameLPAREN	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
ceil	TokenNameIdentifier	 ceil
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/*= * Evaluates the series of Chebyshev polynomials Ti at argument x/2. * The series is given by * <pre> * N-1 * - ' * y = > coef[i] T (x/2) * - i * i=0 * </pre> * Coefficients are stored in reverse order, i.e. the zero * order term is last in the array. Note N is the number of * coefficients, not the order. * <p> * If coefficients are for the interval a to b, x must * have been transformed to x -> 2(2x - b - a)/(b-a) before * entering the routine. This maps x from (a, b) to (-1, 1), * over which the Chebyshev polynomials are defined. * <p> * If the coefficients are for the inverted interval, in * which (a, b) is mapped to (1/b, 1/a), the transformation * required is x -> 2(2ab/x - b - a)/(b-a). If b is infinity, * this becomes x -> 4a/x - 1. * <p> * SPEED: * <p> * Taking advantage of the recurrence properties of the * Chebyshev polynomials, the routine requires one more * addition per loop than evaluating a nested polynomial of * the same degree. * * @param x argument to the polynomial. * @param coef the coefficients of the polynomial. * @param N the number of coefficients. */	TokenNameCOMMENT_BLOCK	= Evaluates the series of Chebyshev polynomials Ti at argument x/2. The series is given by <pre> N-1 - ' y = > coef[i] T (x/2) - i i=0 </pre> Coefficients are stored in reverse order, i.e. the zero order term is last in the array. Note N is the number of coefficients, not the order. <p> If coefficients are for the interval a to b, x must have been transformed to x -> 2(2x - b - a)/(b-a) before entering the routine. This maps x from (a, b) to (-1, 1), over which the Chebyshev polynomials are defined. <p> If the coefficients are for the inverted interval, in which (a, b) is mapped to (1/b, 1/a), the transformation required is x -> 2(2ab/x - b - a)/(b-a). If b is infinity, this becomes x -> 4a/x - 1. <p> SPEED: <p> Taking advantage of the recurrence properties of the Chebyshev polynomials, the routine requires one more addition per loop than evaluating a nested polynomial of the same degree. * @param x argument to the polynomial. @param coef the coefficients of the polynomial. @param N the number of coefficients. 
public	TokenNamepublic	
static	TokenNamestatic	
double	TokenNamedouble	
chbevl	TokenNameIdentifier	 chbevl
(	TokenNameLPAREN	
double	TokenNamedouble	
x	TokenNameIdentifier	 x
,	TokenNameCOMMA	
double	TokenNamedouble	
coef	TokenNameIdentifier	 coef
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
int	TokenNameint	
N	TokenNameIdentifier	 N
)	TokenNameRPAREN	
throws	TokenNamethrows	
ArithmeticException	TokenNameIdentifier	 Arithmetic Exception
{	TokenNameLBRACE	
double	TokenNamedouble	
b0	TokenNameIdentifier	 b0
,	TokenNameCOMMA	
b1	TokenNameIdentifier	 b1
,	TokenNameCOMMA	
b2	TokenNameIdentifier	 b2
;	TokenNameSEMICOLON	
int	TokenNameint	
p	TokenNameIdentifier	 p
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
i	TokenNameIdentifier	 i
;	TokenNameSEMICOLON	
b0	TokenNameIdentifier	 b0
=	TokenNameEQUAL	
coef	TokenNameIdentifier	 coef
[	TokenNameLBRACKET	
p	TokenNameIdentifier	 p
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
b1	TokenNameIdentifier	 b1
=	TokenNameEQUAL	
0.0	TokenNameDoubleLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
N	TokenNameIdentifier	 N
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
do	TokenNamedo	
{	TokenNameLBRACE	
b2	TokenNameIdentifier	 b2
=	TokenNameEQUAL	
b1	TokenNameIdentifier	 b1
;	TokenNameSEMICOLON	
b1	TokenNameIdentifier	 b1
=	TokenNameEQUAL	
b0	TokenNameIdentifier	 b0
;	TokenNameSEMICOLON	
b0	TokenNameIdentifier	 b0
=	TokenNameEQUAL	
x	TokenNameIdentifier	 x
*	TokenNameMULTIPLY	
b1	TokenNameIdentifier	 b1
-	TokenNameMINUS	
b2	TokenNameIdentifier	 b2
+	TokenNamePLUS	
coef	TokenNameIdentifier	 coef
[	TokenNameLBRACKET	
p	TokenNameIdentifier	 p
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
while	TokenNamewhile	
(	TokenNameLPAREN	
--	TokenNameMINUS_MINUS	
i	TokenNameIdentifier	 i
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
(	TokenNameLPAREN	
0.5	TokenNameDoubleLiteral	
*	TokenNameMULTIPLY	
(	TokenNameLPAREN	
b0	TokenNameIdentifier	 b0
-	TokenNameMINUS	
b2	TokenNameIdentifier	 b2
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/*= * Returns the factorial of the argument. */	TokenNameCOMMENT_BLOCK	= Returns the factorial of the argument. 
// static private long fac1(int j) { 	TokenNameCOMMENT_LINE	static private long fac1(int j) { 
// long i = j; 	TokenNameCOMMENT_LINE	long i = j; 
// if(j < 0) i = Math.abs(j); 	TokenNameCOMMENT_LINE	if(j < 0) i = Math.abs(j); 
// if (i>longFactorials.length) throw new IllegalArgumentException("Overflow"); 	TokenNameCOMMENT_LINE	if (i>longFactorials.length) throw new IllegalArgumentException("Overflow"); 
// 	TokenNameCOMMENT_LINE	 
// long d = 1; 	TokenNameCOMMENT_LINE	long d = 1; 
// while (i > 1) d *= i--; 	TokenNameCOMMENT_LINE	while (i > 1) d *= i--; 
// 	TokenNameCOMMENT_LINE	 
// if (j < 0) return -d; 	TokenNameCOMMENT_LINE	if (j < 0) return -d; 
// else return d; 	TokenNameCOMMENT_LINE	else return d; 
// } 	TokenNameCOMMENT_LINE	} 
/*= * Returns the factorial of the argument. */	TokenNameCOMMENT_BLOCK	= Returns the factorial of the argument. 
// static private double fac2(int j) { 	TokenNameCOMMENT_LINE	static private double fac2(int j) { 
// long i = j; 	TokenNameCOMMENT_LINE	long i = j; 
// if (j < 0) i = Math.abs(j); 	TokenNameCOMMENT_LINE	if (j < 0) i = Math.abs(j); 
// 	TokenNameCOMMENT_LINE	 
// double d = 1.0; 	TokenNameCOMMENT_LINE	double d = 1.0; 
// while (i > 1) d *= i--; 	TokenNameCOMMENT_LINE	while (i > 1) d *= i--; 
// 	TokenNameCOMMENT_LINE	 
// if (j < 0) return -d; 	TokenNameCOMMENT_LINE	if (j < 0) return -d; 
// else return d; 	TokenNameCOMMENT_LINE	else return d; 
// } 	TokenNameCOMMENT_LINE	} 
/*= * Instantly returns the factorial <tt>k!</tt>. * @param k must hold <tt>k &gt;= 0</tt>. */	TokenNameCOMMENT_BLOCK	= Instantly returns the factorial <tt>k!</tt>. @param k must hold <tt>k &gt;= 0</tt>. 
static	TokenNamestatic	
public	TokenNamepublic	
double	TokenNamedouble	
factorial	TokenNameIdentifier	 factorial
(	TokenNameLPAREN	
int	TokenNameint	
k	TokenNameIdentifier	 k
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
k	TokenNameIdentifier	 k
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
length1	TokenNameIdentifier	 length1
=	TokenNameEQUAL	
longFactorials	TokenNameIdentifier	 long Factorials
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
k	TokenNameIdentifier	 k
<	TokenNameLESS	
length1	TokenNameIdentifier	 length1
)	TokenNameRPAREN	
return	TokenNamereturn	
longFactorials	TokenNameIdentifier	 long Factorials
[	TokenNameLBRACKET	
k	TokenNameIdentifier	 k
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
int	TokenNameint	
length2	TokenNameIdentifier	 length2
=	TokenNameEQUAL	
doubleFactorials	TokenNameIdentifier	 double Factorials
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
k	TokenNameIdentifier	 k
<	TokenNameLESS	
length1	TokenNameIdentifier	 length1
+	TokenNamePLUS	
length2	TokenNameIdentifier	 length2
)	TokenNameRPAREN	
return	TokenNamereturn	
doubleFactorials	TokenNameIdentifier	 double Factorials
[	TokenNameLBRACKET	
k	TokenNameIdentifier	 k
-	TokenNameMINUS	
length1	TokenNameIdentifier	 length1
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
else	TokenNameelse	
return	TokenNamereturn	
Double	TokenNameIdentifier	 Double
.	TokenNameDOT	
POSITIVE_INFINITY	TokenNameIdentifier	 POSITIVE  INFINITY
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/*= * Returns the largest <code>long &lt;= value</code>. * <dt>Examples: <code> * 1.0 -> 1, 1.2 -> 1, 1.9 -> 1 <dt> * 2.0 -> 2, 2.2 -> 2, 2.9 -> 2 </code><dt> * This method is safer than using (long) Math.floor(value), because of possible rounding error. */	TokenNameCOMMENT_BLOCK	= Returns the largest <code>long &lt;= value</code>. <dt>Examples: <code> 1.0 -> 1, 1.2 -> 1, 1.9 -> 1 <dt> 2.0 -> 2, 2.2 -> 2, 2.9 -> 2 </code><dt> This method is safer than using (long) Math.floor(value), because of possible rounding error. 
public	TokenNamepublic	
static	TokenNamestatic	
long	TokenNamelong	
floor	TokenNameIdentifier	 floor
(	TokenNameLPAREN	
double	TokenNamedouble	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
round	TokenNameIdentifier	 round
(	TokenNameLPAREN	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
floor	TokenNameIdentifier	 floor
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/*= * Returns <tt>log<sub>base</sub>value</tt>. */	TokenNameCOMMENT_BLOCK	= Returns <tt>log<sub>base</sub>value</tt>. 
public	TokenNamepublic	
static	TokenNamestatic	
double	TokenNamedouble	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
double	TokenNamedouble	
base	TokenNameIdentifier	 base
,	TokenNameCOMMA	
double	TokenNamedouble	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
/	TokenNameDIVIDE	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
base	TokenNameIdentifier	 base
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/*= * Returns <tt>log<sub>10</sub>value</tt>. */	TokenNameCOMMENT_BLOCK	= Returns <tt>log<sub>10</sub>value</tt>. 
static	TokenNamestatic	
public	TokenNamepublic	
double	TokenNamedouble	
log10	TokenNameIdentifier	 log10
(	TokenNameLPAREN	
double	TokenNamedouble	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// 1.0 / Math.log(10) == 0.43429448190325176 	TokenNameCOMMENT_LINE	1.0 / Math.log(10) == 0.43429448190325176 
return	TokenNamereturn	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
0.43429448190325176	TokenNameDoubleLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/*= * Returns <tt>log<sub>2</sub>value</tt>. */	TokenNameCOMMENT_BLOCK	= Returns <tt>log<sub>2</sub>value</tt>. 
static	TokenNamestatic	
public	TokenNamepublic	
double	TokenNamedouble	
log2	TokenNameIdentifier	 log2
(	TokenNameLPAREN	
double	TokenNamedouble	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// 1.0 / Math.log(2) == 1.4426950408889634 	TokenNameCOMMENT_LINE	1.0 / Math.log(2) == 1.4426950408889634 
return	TokenNamereturn	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
1.4426950408889634	TokenNameDoubleLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/*= * Returns <tt>log(k!)</tt>. * Tries to avoid overflows. * For <tt>k<30</tt> simply looks up a table in O(1). * For <tt>k>=30</tt> uses stirlings approximation. * @param k must hold <tt>k &gt;= 0</tt>. */	TokenNameCOMMENT_BLOCK	= Returns <tt>log(k!)</tt>. Tries to avoid overflows. For <tt>k<30</tt> simply looks up a table in O(1). For <tt>k>=30</tt> uses stirlings approximation. @param k must hold <tt>k &gt;= 0</tt>. 
public	TokenNamepublic	
static	TokenNamestatic	
double	TokenNamedouble	
logFactorial	TokenNameIdentifier	 log Factorial
(	TokenNameLPAREN	
int	TokenNameint	
k	TokenNameIdentifier	 k
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
k	TokenNameIdentifier	 k
>=	TokenNameGREATER_EQUAL	
30	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
double	TokenNamedouble	
r	TokenNameIdentifier	 r
,	TokenNameCOMMA	
rr	TokenNameIdentifier	 rr
;	TokenNameSEMICOLON	
final	TokenNamefinal	
double	TokenNamedouble	
C0	TokenNameIdentifier	 C0
=	TokenNameEQUAL	
9.18938533204672742e-01	TokenNameDoubleLiteral	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
double	TokenNamedouble	
C1	TokenNameIdentifier	 C1
=	TokenNameEQUAL	
8.33333333333333333e-02	TokenNameDoubleLiteral	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
double	TokenNamedouble	
C3	TokenNameIdentifier	 C3
=	TokenNameEQUAL	
-	TokenNameMINUS	
2.77777777777777778e-03	TokenNameDoubleLiteral	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
double	TokenNamedouble	
C5	TokenNameIdentifier	 C5
=	TokenNameEQUAL	
7.93650793650793651e-04	TokenNameDoubleLiteral	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
double	TokenNamedouble	
C7	TokenNameIdentifier	 C7
=	TokenNameEQUAL	
-	TokenNameMINUS	
5.95238095238095238e-04	TokenNameDoubleLiteral	
;	TokenNameSEMICOLON	
r	TokenNameIdentifier	 r
=	TokenNameEQUAL	
1.0	TokenNameDoubleLiteral	
/	TokenNameDIVIDE	
k	TokenNameIdentifier	 k
;	TokenNameSEMICOLON	
rr	TokenNameIdentifier	 rr
=	TokenNameEQUAL	
r	TokenNameIdentifier	 r
*	TokenNameMULTIPLY	
r	TokenNameIdentifier	 r
;	TokenNameSEMICOLON	
return	TokenNamereturn	
(	TokenNameLPAREN	
k	TokenNameIdentifier	 k
+	TokenNamePLUS	
0.5	TokenNameDoubleLiteral	
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
k	TokenNameIdentifier	 k
)	TokenNameRPAREN	
-	TokenNameMINUS	
k	TokenNameIdentifier	 k
+	TokenNamePLUS	
C0	TokenNameIdentifier	 C0
+	TokenNamePLUS	
r	TokenNameIdentifier	 r
*	TokenNameMULTIPLY	
(	TokenNameLPAREN	
C1	TokenNameIdentifier	 C1
+	TokenNamePLUS	
rr	TokenNameIdentifier	 rr
*	TokenNameMULTIPLY	
(	TokenNameLPAREN	
C3	TokenNameIdentifier	 C3
+	TokenNamePLUS	
rr	TokenNameIdentifier	 rr
*	TokenNameMULTIPLY	
(	TokenNameLPAREN	
C5	TokenNameIdentifier	 C5
+	TokenNamePLUS	
rr	TokenNameIdentifier	 rr
*	TokenNameMULTIPLY	
C7	TokenNameIdentifier	 C7
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
return	TokenNamereturn	
logFactorials	TokenNameIdentifier	 log Factorials
[	TokenNameLBRACKET	
k	TokenNameIdentifier	 k
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/*= * Instantly returns the factorial <tt>k!</tt>. * @param k must hold <tt>k &gt;= 0 && k &lt; 21</tt>. */	TokenNameCOMMENT_BLOCK	= Instantly returns the factorial <tt>k!</tt>. @param k must hold <tt>k &gt;= 0 && k &lt; 21</tt>. 
static	TokenNamestatic	
public	TokenNamepublic	
long	TokenNamelong	
longFactorial	TokenNameIdentifier	 long Factorial
(	TokenNameLPAREN	
int	TokenNameint	
k	TokenNameIdentifier	 k
)	TokenNameRPAREN	
throws	TokenNamethrows	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
k	TokenNameIdentifier	 k
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
"Negative k"	TokenNameStringLiteral	Negative k
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
k	TokenNameIdentifier	 k
<	TokenNameLESS	
longFactorials	TokenNameIdentifier	 long Factorials
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
return	TokenNamereturn	
longFactorials	TokenNameIdentifier	 long Factorials
[	TokenNameLBRACKET	
k	TokenNameIdentifier	 k
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
"Overflow"	TokenNameStringLiteral	Overflow
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/*= * Returns the StirlingCorrection. * <p> * Correction term of the Stirling approximation for <tt>log(k!)</tt> * (series in 1/k, or table values for small k) * with int parameter k. * <p> * <tt> * log k! = (k + 1/2)log(k + 1) - (k + 1) + (1/2)log(2Pi) + * stirlingCorrection(k + 1) * <p> * log k! = (k + 1/2)log(k) - k + (1/2)log(2Pi) + * stirlingCorrection(k) * </tt> */	TokenNameCOMMENT_BLOCK	= Returns the StirlingCorrection. <p> Correction term of the Stirling approximation for <tt>log(k!)</tt> (series in 1/k, or table values for small k) with int parameter k. <p> <tt> log k! = (k + 1/2)log(k + 1) - (k + 1) + (1/2)log(2Pi) + stirlingCorrection(k + 1) <p> log k! = (k + 1/2)log(k) - k + (1/2)log(2Pi) + stirlingCorrection(k) </tt> 
public	TokenNamepublic	
static	TokenNamestatic	
double	TokenNamedouble	
stirlingCorrection	TokenNameIdentifier	 stirling Correction
(	TokenNameLPAREN	
int	TokenNameint	
k	TokenNameIdentifier	 k
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
double	TokenNamedouble	
C1	TokenNameIdentifier	 C1
=	TokenNameEQUAL	
8.33333333333333333e-02	TokenNameDoubleLiteral	
;	TokenNameSEMICOLON	
// +1/12 	TokenNameCOMMENT_LINE	+1/12 
final	TokenNamefinal	
double	TokenNamedouble	
C3	TokenNameIdentifier	 C3
=	TokenNameEQUAL	
-	TokenNameMINUS	
2.77777777777777778e-03	TokenNameDoubleLiteral	
;	TokenNameSEMICOLON	
// -1/360 	TokenNameCOMMENT_LINE	-1/360 
final	TokenNamefinal	
double	TokenNamedouble	
C5	TokenNameIdentifier	 C5
=	TokenNameEQUAL	
7.93650793650793651e-04	TokenNameDoubleLiteral	
;	TokenNameSEMICOLON	
// +1/1260 	TokenNameCOMMENT_LINE	+1/1260 
final	TokenNamefinal	
double	TokenNamedouble	
C7	TokenNameIdentifier	 C7
=	TokenNameEQUAL	
-	TokenNameMINUS	
5.95238095238095238e-04	TokenNameDoubleLiteral	
;	TokenNameSEMICOLON	
// -1/1680 	TokenNameCOMMENT_LINE	-1/1680 
double	TokenNamedouble	
r	TokenNameIdentifier	 r
,	TokenNameCOMMA	
rr	TokenNameIdentifier	 rr
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
k	TokenNameIdentifier	 k
>	TokenNameGREATER	
30	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
r	TokenNameIdentifier	 r
=	TokenNameEQUAL	
1.0	TokenNameDoubleLiteral	
/	TokenNameDIVIDE	
k	TokenNameIdentifier	 k
;	TokenNameSEMICOLON	
rr	TokenNameIdentifier	 rr
=	TokenNameEQUAL	
r	TokenNameIdentifier	 r
*	TokenNameMULTIPLY	
r	TokenNameIdentifier	 r
;	TokenNameSEMICOLON	
return	TokenNamereturn	
r	TokenNameIdentifier	 r
*	TokenNameMULTIPLY	
(	TokenNameLPAREN	
C1	TokenNameIdentifier	 C1
+	TokenNamePLUS	
rr	TokenNameIdentifier	 rr
*	TokenNameMULTIPLY	
(	TokenNameLPAREN	
C3	TokenNameIdentifier	 C3
+	TokenNamePLUS	
rr	TokenNameIdentifier	 rr
*	TokenNameMULTIPLY	
(	TokenNameLPAREN	
C5	TokenNameIdentifier	 C5
+	TokenNamePLUS	
rr	TokenNameIdentifier	 rr
*	TokenNameMULTIPLY	
C7	TokenNameIdentifier	 C7
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
return	TokenNamereturn	
stirlingCorrection	TokenNameIdentifier	 stirling Correction
[	TokenNameLBRACKET	
k	TokenNameIdentifier	 k
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the log of Gamma(double x), using Algorithm 291. Pike and Hill (1966) * Uses StirlingCorrection for (double) x >= 7. */	TokenNameCOMMENT_JAVADOC	 Returns the log of Gamma(double x), using Algorithm 291. Pike and Hill (1966) Uses StirlingCorrection for (double) x >= 7. 
public	TokenNamepublic	
static	TokenNamestatic	
double	TokenNamedouble	
logGamma	TokenNameIdentifier	 log Gamma
(	TokenNameLPAREN	
double	TokenNamedouble	
x	TokenNameIdentifier	 x
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
double	TokenNamedouble	
C0	TokenNameIdentifier	 C0
=	TokenNameEQUAL	
0.918938533204673	TokenNameDoubleLiteral	
;	TokenNameSEMICOLON	
// 	TokenNameCOMMENT_LINE	 
final	TokenNamefinal	
double	TokenNamedouble	
C1	TokenNameIdentifier	 C1
=	TokenNameEQUAL	
8.33333333333333333e-02	TokenNameDoubleLiteral	
;	TokenNameSEMICOLON	
// +1/12 	TokenNameCOMMENT_LINE	+1/12 
final	TokenNamefinal	
double	TokenNamedouble	
C3	TokenNameIdentifier	 C3
=	TokenNameEQUAL	
-	TokenNameMINUS	
2.77777777777777778e-03	TokenNameDoubleLiteral	
;	TokenNameSEMICOLON	
// -1/360 	TokenNameCOMMENT_LINE	-1/360 
final	TokenNamefinal	
double	TokenNamedouble	
C5	TokenNameIdentifier	 C5
=	TokenNameEQUAL	
7.93650793650793651e-04	TokenNameDoubleLiteral	
;	TokenNameSEMICOLON	
// +1/1260 	TokenNameCOMMENT_LINE	+1/1260 
final	TokenNamefinal	
double	TokenNamedouble	
C7	TokenNameIdentifier	 C7
=	TokenNameEQUAL	
-	TokenNameMINUS	
5.95238095238095238e-04	TokenNameDoubleLiteral	
;	TokenNameSEMICOLON	
// -1/1680 	TokenNameCOMMENT_LINE	-1/1680 
double	TokenNamedouble	
f	TokenNameIdentifier	 f
,	TokenNameCOMMA	
z	TokenNameIdentifier	 z
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
x	TokenNameIdentifier	 x
<	TokenNameLESS	
7.0	TokenNameDoubleLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
f	TokenNameIdentifier	 f
=	TokenNameEQUAL	
1.0	TokenNameDoubleLiteral	
;	TokenNameSEMICOLON	
z	TokenNameIdentifier	 z
=	TokenNameEQUAL	
x	TokenNameIdentifier	 x
-	TokenNameMINUS	
1.0	TokenNameDoubleLiteral	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
z	TokenNameIdentifier	 z
=	TokenNameEQUAL	
z	TokenNameIdentifier	 z
+	TokenNamePLUS	
1.0	TokenNameDoubleLiteral	
;	TokenNameSEMICOLON	
z	TokenNameIdentifier	 z
<	TokenNameLESS	
7	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
z	TokenNameIdentifier	 z
+=	TokenNamePLUS_EQUAL	
1.0	TokenNameDoubleLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
x	TokenNameIdentifier	 x
=	TokenNameEQUAL	
z	TokenNameIdentifier	 z
;	TokenNameSEMICOLON	
f	TokenNameIdentifier	 f
=	TokenNameEQUAL	
f	TokenNameIdentifier	 f
*	TokenNameMULTIPLY	
z	TokenNameIdentifier	 z
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
x	TokenNameIdentifier	 x
=	TokenNameEQUAL	
x	TokenNameIdentifier	 x
+	TokenNamePLUS	
1.0	TokenNameDoubleLiteral	
;	TokenNameSEMICOLON	
f	TokenNameIdentifier	 f
=	TokenNameEQUAL	
-	TokenNameMINUS	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
f	TokenNameIdentifier	 f
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
f	TokenNameIdentifier	 f
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
z	TokenNameIdentifier	 z
=	TokenNameEQUAL	
(	TokenNameLPAREN	
1.0	TokenNameDoubleLiteral	
/	TokenNameDIVIDE	
x	TokenNameIdentifier	 x
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
(	TokenNameLPAREN	
1.0	TokenNameDoubleLiteral	
/	TokenNameDIVIDE	
x	TokenNameIdentifier	 x
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
(	TokenNameLPAREN	
f	TokenNameIdentifier	 f
+	TokenNamePLUS	
(	TokenNameLPAREN	
x	TokenNameIdentifier	 x
-	TokenNameMINUS	
0.5	TokenNameDoubleLiteral	
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
x	TokenNameIdentifier	 x
)	TokenNameRPAREN	
-	TokenNameMINUS	
x	TokenNameIdentifier	 x
+	TokenNamePLUS	
C0	TokenNameIdentifier	 C0
+	TokenNamePLUS	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
C7	TokenNameIdentifier	 C7
*	TokenNameMULTIPLY	
z	TokenNameIdentifier	 z
+	TokenNamePLUS	
C5	TokenNameIdentifier	 C5
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
z	TokenNameIdentifier	 z
+	TokenNamePLUS	
C3	TokenNameIdentifier	 C3
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
z	TokenNameIdentifier	 z
+	TokenNamePLUS	
C1	TokenNameIdentifier	 C1
)	TokenNameRPAREN	
/	TokenNameDIVIDE	
x	TokenNameIdentifier	 x
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/*= * Equivalent to <tt>Math.round(binomial(n,k))</tt>. */	TokenNameCOMMENT_BLOCK	= Equivalent to <tt>Math.round(binomial(n,k))</tt>. 
// private static long xlongBinomial(long n, long k) { 	TokenNameCOMMENT_LINE	private static long xlongBinomial(long n, long k) { 
// return Math.round(binomial(n,k)); 	TokenNameCOMMENT_LINE	return Math.round(binomial(n,k)); 
// } 	TokenNameCOMMENT_LINE	} 
}	TokenNameRBRACE	
