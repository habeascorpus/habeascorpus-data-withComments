package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
maven	TokenNameIdentifier	 maven
.	TokenNameDOT	
embedder	TokenNameIdentifier	 embedder
;	TokenNameSEMICOLON	
import	TokenNameimport	
junit	TokenNameIdentifier	 junit
.	TokenNameDOT	
framework	TokenNameIdentifier	 framework
.	TokenNameDOT	
Test	TokenNameIdentifier	 Test
;	TokenNameSEMICOLON	
import	TokenNameimport	
junit	TokenNameIdentifier	 junit
.	TokenNameDOT	
framework	TokenNameIdentifier	 framework
.	TokenNameDOT	
TestCase	TokenNameIdentifier	 Test Case
;	TokenNameSEMICOLON	
import	TokenNameimport	
junit	TokenNameIdentifier	 junit
.	TokenNameDOT	
framework	TokenNameIdentifier	 framework
.	TokenNameDOT	
TestSuite	TokenNameIdentifier	 Test Suite
;	TokenNameSEMICOLON	
/** * Unit test for simple App. */	TokenNameCOMMENT_JAVADOC	 Unit test for simple App. 
public	TokenNamepublic	
class	TokenNameclass	
AppTest	TokenNameIdentifier	 App Test
extends	TokenNameextends	
TestCase	TokenNameIdentifier	 Test Case
{	TokenNameLBRACE	
/** * Create the test case * * @param testName name of the test case */	TokenNameCOMMENT_JAVADOC	 Create the test case * @param testName name of the test case 
public	TokenNamepublic	
AppTest	TokenNameIdentifier	 App Test
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
testName	TokenNameIdentifier	 test Name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
testName	TokenNameIdentifier	 test Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @return the suite of tests being tested */	TokenNameCOMMENT_JAVADOC	 @return the suite of tests being tested 
public	TokenNamepublic	
static	TokenNamestatic	
Test	TokenNameIdentifier	 Test
suite	TokenNameIdentifier	 suite
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
TestSuite	TokenNameIdentifier	 Test Suite
(	TokenNameLPAREN	
AppTest	TokenNameIdentifier	 App Test
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Rigourous Test :-) */	TokenNameCOMMENT_JAVADOC	 Rigourous Test :-) 
public	TokenNamepublic	
void	TokenNamevoid	
testApp	TokenNameIdentifier	 test App
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
