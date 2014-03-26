package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
facet	TokenNameIdentifier	 facet
.	TokenNameDOT	
search	TokenNameIdentifier	 search
.	TokenNameDOT	
sampling	TokenNameIdentifier	 sampling
;	TokenNameSEMICOLON	
/** * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_JAVADOC	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/** * Parameters for sampling, dictating whether sampling is to take place and how. * * @lucene.experimental */	TokenNameCOMMENT_JAVADOC	 Parameters for sampling, dictating whether sampling is to take place and how. * @lucene.experimental 
public	TokenNamepublic	
class	TokenNameclass	
SamplingParams	TokenNameIdentifier	 Sampling Params
{	TokenNameLBRACE	
/** * Default factor by which more results are requested over the sample set. * @see SamplingParams#getOversampleFactor() */	TokenNameCOMMENT_JAVADOC	 Default factor by which more results are requested over the sample set. @see SamplingParams#getOversampleFactor() 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
double	TokenNamedouble	
DEFAULT_OVERSAMPLE_FACTOR	TokenNameIdentifier	 DEFAULT  OVERSAMPLE  FACTOR
=	TokenNameEQUAL	
2d	TokenNameDoubleLiteral	
;	TokenNameSEMICOLON	
/** * Default ratio between size of sample to original size of document set. * @see Sampler#getSampleSet(org.apache.lucene.facet.search.ScoredDocIDs) */	TokenNameCOMMENT_JAVADOC	 Default ratio between size of sample to original size of document set. @see Sampler#getSampleSet(org.apache.lucene.facet.search.ScoredDocIDs) 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
double	TokenNamedouble	
DEFAULT_SAMPLE_RATIO	TokenNameIdentifier	 DEFAULT  SAMPLE  RATIO
=	TokenNameEQUAL	
0.01	TokenNameDoubleLiteral	
;	TokenNameSEMICOLON	
/** * Default maximum size of sample. * @see Sampler#getSampleSet(org.apache.lucene.facet.search.ScoredDocIDs) */	TokenNameCOMMENT_JAVADOC	 Default maximum size of sample. @see Sampler#getSampleSet(org.apache.lucene.facet.search.ScoredDocIDs) 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
DEFAULT_MAX_SAMPLE_SIZE	TokenNameIdentifier	 DEFAULT  MAX  SAMPLE  SIZE
=	TokenNameEQUAL	
10000	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * Default minimum size of sample. * @see Sampler#getSampleSet(org.apache.lucene.facet.search.ScoredDocIDs) */	TokenNameCOMMENT_JAVADOC	 Default minimum size of sample. @see Sampler#getSampleSet(org.apache.lucene.facet.search.ScoredDocIDs) 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
DEFAULT_MIN_SAMPLE_SIZE	TokenNameIdentifier	 DEFAULT  MIN  SAMPLE  SIZE
=	TokenNameEQUAL	
100	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * Default sampling threshold, if number of results is less than this number - no sampling will take place * @see SamplingParams#getSampleRatio() */	TokenNameCOMMENT_JAVADOC	 Default sampling threshold, if number of results is less than this number - no sampling will take place @see SamplingParams#getSampleRatio() 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
DEFAULT_SAMPLING_THRESHOLD	TokenNameIdentifier	 DEFAULT  SAMPLING  THRESHOLD
=	TokenNameEQUAL	
75000	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
maxSampleSize	TokenNameIdentifier	 max Sample Size
=	TokenNameEQUAL	
DEFAULT_MAX_SAMPLE_SIZE	TokenNameIdentifier	 DEFAULT  MAX  SAMPLE  SIZE
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
minSampleSize	TokenNameIdentifier	 min Sample Size
=	TokenNameEQUAL	
DEFAULT_MIN_SAMPLE_SIZE	TokenNameIdentifier	 DEFAULT  MIN  SAMPLE  SIZE
;	TokenNameSEMICOLON	
private	TokenNameprivate	
double	TokenNamedouble	
sampleRatio	TokenNameIdentifier	 sample Ratio
=	TokenNameEQUAL	
DEFAULT_SAMPLE_RATIO	TokenNameIdentifier	 DEFAULT  SAMPLE  RATIO
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
samplingThreshold	TokenNameIdentifier	 sampling Threshold
=	TokenNameEQUAL	
DEFAULT_SAMPLING_THRESHOLD	TokenNameIdentifier	 DEFAULT  SAMPLING  THRESHOLD
;	TokenNameSEMICOLON	
private	TokenNameprivate	
double	TokenNamedouble	
oversampleFactor	TokenNameIdentifier	 oversample Factor
=	TokenNameEQUAL	
DEFAULT_OVERSAMPLE_FACTOR	TokenNameIdentifier	 DEFAULT  OVERSAMPLE  FACTOR
;	TokenNameSEMICOLON	
/** * Return the maxSampleSize. * In no case should the resulting sample size exceed this value. * @see Sampler#getSampleSet(org.apache.lucene.facet.search.ScoredDocIDs) */	TokenNameCOMMENT_JAVADOC	 Return the maxSampleSize. In no case should the resulting sample size exceed this value. @see Sampler#getSampleSet(org.apache.lucene.facet.search.ScoredDocIDs) 
public	TokenNamepublic	
final	TokenNamefinal	
int	TokenNameint	
getMaxSampleSize	TokenNameIdentifier	 get Max Sample Size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
maxSampleSize	TokenNameIdentifier	 max Sample Size
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Return the minSampleSize. * In no case should the resulting sample size be smaller than this value. * @see Sampler#getSampleSet(org.apache.lucene.facet.search.ScoredDocIDs) */	TokenNameCOMMENT_JAVADOC	 Return the minSampleSize. In no case should the resulting sample size be smaller than this value. @see Sampler#getSampleSet(org.apache.lucene.facet.search.ScoredDocIDs) 
public	TokenNamepublic	
final	TokenNamefinal	
int	TokenNameint	
getMinSampleSize	TokenNameIdentifier	 get Min Sample Size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
minSampleSize	TokenNameIdentifier	 min Sample Size
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @return the sampleRatio * @see Sampler#getSampleSet(org.apache.lucene.facet.search.ScoredDocIDs) */	TokenNameCOMMENT_JAVADOC	 @return the sampleRatio @see Sampler#getSampleSet(org.apache.lucene.facet.search.ScoredDocIDs) 
public	TokenNamepublic	
final	TokenNamefinal	
double	TokenNamedouble	
getSampleRatio	TokenNameIdentifier	 get Sample Ratio
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
sampleRatio	TokenNameIdentifier	 sample Ratio
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Return the samplingThreshold. * Sampling would be performed only for document sets larger than this. */	TokenNameCOMMENT_JAVADOC	 Return the samplingThreshold. Sampling would be performed only for document sets larger than this. 
public	TokenNamepublic	
final	TokenNamefinal	
int	TokenNameint	
getSamplingThreshold	TokenNameIdentifier	 get Sampling Threshold
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
samplingThreshold	TokenNameIdentifier	 sampling Threshold
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @param maxSampleSize * the maxSampleSize to set * @see #getMaxSampleSize() */	TokenNameCOMMENT_JAVADOC	 @param maxSampleSize the maxSampleSize to set @see #getMaxSampleSize() 
public	TokenNamepublic	
void	TokenNamevoid	
setMaxSampleSize	TokenNameIdentifier	 set Max Sample Size
(	TokenNameLPAREN	
int	TokenNameint	
maxSampleSize	TokenNameIdentifier	 max Sample Size
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
maxSampleSize	TokenNameIdentifier	 max Sample Size
=	TokenNameEQUAL	
maxSampleSize	TokenNameIdentifier	 max Sample Size
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @param minSampleSize * the minSampleSize to set * @see #getMinSampleSize() */	TokenNameCOMMENT_JAVADOC	 @param minSampleSize the minSampleSize to set @see #getMinSampleSize() 
public	TokenNamepublic	
void	TokenNamevoid	
setMinSampleSize	TokenNameIdentifier	 set Min Sample Size
(	TokenNameLPAREN	
int	TokenNameint	
minSampleSize	TokenNameIdentifier	 min Sample Size
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
minSampleSize	TokenNameIdentifier	 min Sample Size
=	TokenNameEQUAL	
minSampleSize	TokenNameIdentifier	 min Sample Size
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @param sampleRatio * the sampleRatio to set * @see #getSampleRatio() */	TokenNameCOMMENT_JAVADOC	 @param sampleRatio the sampleRatio to set @see #getSampleRatio() 
public	TokenNamepublic	
void	TokenNamevoid	
setSampleRatio	TokenNameIdentifier	 set Sample Ratio
(	TokenNameLPAREN	
double	TokenNamedouble	
sampleRatio	TokenNameIdentifier	 sample Ratio
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
sampleRatio	TokenNameIdentifier	 sample Ratio
=	TokenNameEQUAL	
sampleRatio	TokenNameIdentifier	 sample Ratio
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set a sampling-threshold * @see #getSamplingThreshold() */	TokenNameCOMMENT_JAVADOC	 Set a sampling-threshold @see #getSamplingThreshold() 
public	TokenNamepublic	
void	TokenNamevoid	
setSampingThreshold	TokenNameIdentifier	 set Samping Threshold
(	TokenNameLPAREN	
int	TokenNameint	
sampingThreshold	TokenNameIdentifier	 samping Threshold
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
samplingThreshold	TokenNameIdentifier	 sampling Threshold
=	TokenNameEQUAL	
sampingThreshold	TokenNameIdentifier	 samping Threshold
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Check validity of sampling settings, making sure that * <ul> * <li> <code>minSampleSize <= maxSampleSize <= samplingThreshold </code></li> * <li> <code>0 < samplingRatio <= 1 </code></li> * </ul> * * @return true if valid, false otherwise */	TokenNameCOMMENT_JAVADOC	 Check validity of sampling settings, making sure that <ul> <li> <code>minSampleSize <= maxSampleSize <= samplingThreshold </code></li> <li> <code>0 < samplingRatio <= 1 </code></li> </ul> * @return true if valid, false otherwise 
public	TokenNamepublic	
boolean	TokenNameboolean	
validate	TokenNameIdentifier	 validate
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
samplingThreshold	TokenNameIdentifier	 sampling Threshold
>=	TokenNameGREATER_EQUAL	
maxSampleSize	TokenNameIdentifier	 max Sample Size
&&	TokenNameAND_AND	
maxSampleSize	TokenNameIdentifier	 max Sample Size
>=	TokenNameGREATER_EQUAL	
minSampleSize	TokenNameIdentifier	 min Sample Size
&&	TokenNameAND_AND	
sampleRatio	TokenNameIdentifier	 sample Ratio
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
sampleRatio	TokenNameIdentifier	 sample Ratio
<	TokenNameLESS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Return the oversampleFactor. When sampling, we would collect that much more * results, so that later, when selecting top out of these, chances are higher * to get actual best results. Note that having this value larger than 1 only * makes sense when using a SampleFixer which finds accurate results, such as * <code>TakmiSampleFixer</code>. When this value is smaller than 1, it is * ignored and no oversampling takes place. */	TokenNameCOMMENT_JAVADOC	 Return the oversampleFactor. When sampling, we would collect that much more results, so that later, when selecting top out of these, chances are higher to get actual best results. Note that having this value larger than 1 only makes sense when using a SampleFixer which finds accurate results, such as <code>TakmiSampleFixer</code>. When this value is smaller than 1, it is ignored and no oversampling takes place. 
public	TokenNamepublic	
final	TokenNamefinal	
double	TokenNamedouble	
getOversampleFactor	TokenNameIdentifier	 get Oversample Factor
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
oversampleFactor	TokenNameIdentifier	 oversample Factor
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @param oversampleFactor the oversampleFactor to set * @see #getOversampleFactor() */	TokenNameCOMMENT_JAVADOC	 @param oversampleFactor the oversampleFactor to set @see #getOversampleFactor() 
public	TokenNamepublic	
void	TokenNamevoid	
setOversampleFactor	TokenNameIdentifier	 set Oversample Factor
(	TokenNameLPAREN	
double	TokenNamedouble	
oversampleFactor	TokenNameIdentifier	 oversample Factor
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
oversampleFactor	TokenNameIdentifier	 oversample Factor
=	TokenNameEQUAL	
oversampleFactor	TokenNameIdentifier	 oversample Factor
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
