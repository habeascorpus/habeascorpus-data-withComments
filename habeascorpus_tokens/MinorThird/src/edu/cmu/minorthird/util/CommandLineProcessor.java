package	TokenNamepackage	
edu	TokenNameIdentifier	 edu
.	TokenNameDOT	
cmu	TokenNameIdentifier	 cmu
.	TokenNameDOT	
minorthird	TokenNameIdentifier	 minorthird
.	TokenNameDOT	
util	TokenNameIdentifier	 util
;	TokenNameSEMICOLON	
/** * A lightweight command-line processing tool. * * @author William Cohen */	TokenNameCOMMENT_JAVADOC	 A lightweight command-line processing tool. * @author William Cohen 
public	TokenNamepublic	
interface	TokenNameinterface	
CommandLineProcessor	TokenNameIdentifier	 Command Line Processor
{	TokenNameLBRACE	
/** Loop thru the command-line arguments. Option pairs like "-foo * bar" should cause a call to x.foo("bar"), where x is this * CommandLineProcessor. Options like "-gorp" cause a call to * x.gorp(). Options without corresponding methods are considered * errors. If an error occurs, then an IllegalArgumentException is * thrown. * * <p>If function like -foo happens to return a non-null * CommandLineProcessor, that processor is invoked on the * arguments immediately after foo. This allows one * CommandLineProcessor to pass command-line options to a second * one. For instance, if x and y are CommandLineProcessors, x has * an method colorOpts() that returns y, and y has methods * background(String s) and foreground(String t) then the command * line sequence <code>-colorOpts -background blue -foreground * red</code> would call the expected methods of y. * * <p>The optional "-config FILE" should cause a Properties object * to be loaded from FILE, and the property/value pairs in the * Properties object to be treated as if they were option/argument * pairs. The order of lines in the property file may not be * preserved, however, and duplicated keys will be ignored. * * <p>For instance, calling -config FILE for a FILE containing *<code><pre> *baz= *foo=bar *</pre></code> * would be the same as the command options <code>-foo bar -baz</code> * or possibly <code>-baz -foo bar</code> * */	TokenNameCOMMENT_JAVADOC	 Loop thru the command-line arguments. Option pairs like "-foo bar" should cause a call to x.foo("bar"), where x is this CommandLineProcessor. Options like "-gorp" cause a call to x.gorp(). Options without corresponding methods are considered errors. If an error occurs, then an IllegalArgumentException is thrown. * <p>If function like -foo happens to return a non-null CommandLineProcessor, that processor is invoked on the arguments immediately after foo. This allows one CommandLineProcessor to pass command-line options to a second one. For instance, if x and y are CommandLineProcessors, x has an method colorOpts() that returns y, and y has methods background(String s) and foreground(String t) then the command line sequence <code>-colorOpts -background blue -foreground red</code> would call the expected methods of y. * <p>The optional "-config FILE" should cause a Properties object to be loaded from FILE, and the property/value pairs in the Properties object to be treated as if they were option/argument pairs. The order of lines in the property file may not be preserved, however, and duplicated keys will be ignored. * <p>For instance, calling -config FILE for a FILE containing *<code><pre> *baz= *foo=bar *</pre></code> would be the same as the command options <code>-foo bar -baz</code> or possibly <code>-baz -foo bar</code> 
public	TokenNamepublic	
void	TokenNamevoid	
processArguments	TokenNameIdentifier	 process Arguments
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
args	TokenNameIdentifier	 args
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Try to consume a the command-line argument at position i. * Return the number of arguments successfully consumed. */	TokenNameCOMMENT_JAVADOC	 Try to consume a the command-line argument at position i. Return the number of arguments successfully consumed. 
public	TokenNamepublic	
int	TokenNameint	
consumeArguments	TokenNameIdentifier	 consume Arguments
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
args	TokenNameIdentifier	 args
,	TokenNameCOMMA	
int	TokenNameint	
startPos	TokenNameIdentifier	 start Pos
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Prints errorMessage and then calls usage(). */	TokenNameCOMMENT_JAVADOC	 Prints errorMessage and then calls usage(). 
public	TokenNamepublic	
void	TokenNamevoid	
usage	TokenNameIdentifier	 usage
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
errorMessage	TokenNameIdentifier	 error Message
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Give usage() information. */	TokenNameCOMMENT_JAVADOC	 Give usage() information. 
public	TokenNamepublic	
void	TokenNamevoid	
usage	TokenNameIdentifier	 usage
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Specifies whether the commandline processing should terminate. * For example, if the usage is to be displayed, we should ignore * other arguments and terminate. */	TokenNameCOMMENT_JAVADOC	 Specifies whether the commandline processing should terminate. For example, if the usage is to be displayed, we should ignore other arguments and terminate. 
public	TokenNamepublic	
boolean	TokenNameboolean	
shouldTerminate	TokenNameIdentifier	 should Terminate
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** Interface for objects that can be configured with command-line arguments. * Configuration for x is done by calling <code>x.getCLP().processArgs(ags).</code> */	TokenNameCOMMENT_JAVADOC	 Interface for objects that can be configured with command-line arguments. Configuration for x is done by calling <code>x.getCLP().processArgs(ags).</code> 
public	TokenNamepublic	
interface	TokenNameinterface	
Configurable	TokenNameIdentifier	 Configurable
{	TokenNameLBRACE	
/** Produce a command-line processor that configures this object. */	TokenNameCOMMENT_JAVADOC	 Produce a command-line processor that configures this object. 
public	TokenNamepublic	
CommandLineProcessor	TokenNameIdentifier	 Command Line Processor
getCLP	TokenNameIdentifier	 get CLP
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
