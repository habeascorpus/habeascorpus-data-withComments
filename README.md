habeascorpus-data-withComments
==============================

This dataset includes 9 open-source projects, including original source files and tokenizations of the code and comments. Below is a list of directories and their content.

1. eclipse_workspace/ 
 - Source code files for 9 open source projects: apache-ant-1.8.4, apache-cassandra-1.2.0, apache-log4j-1.2.17, apache-maven-3.0.4, batik-1.7, lucene-3.6.2, MinorThird, xalan-j-2.7.1, xerces-2.11.0
 - filelist.txt, a list of all source files with local paths

2. habeascorpus_tokens/
 - A tokenized version of the source files, code and comments, under 'eclipse_workspace' (following the same directory structure). Tokenization done with the Eclipse JDT compiler tools. For each token we give the token, token type, and a breakdown of the token by camel-case. For comments, we extract the comment text.

Papers
======

The following paper has used this dataset:

Natural language models for predicting programming comments.
Dana Movshovitz-Attias and William W. Cohen.  
In Association for Computational Linguistics (ACL). 2013

Associated Software
===================

An eclipse plugin based on the ACL paper above and enables comment word-completion can be found in:
http://www.cs.cmu.edu/~dmovshov#commentcompletion

Acknowledgment
==============

This data is based on an earlier version compiled by Peter Schulam, which can be found in https://github.com/habeascorpus/habeascorpus-data

If you use this dataset in any publication, please acknowledge the ACL paper above, and send us a quick note so that we can update the papers list.

Contact
=======

If you have any question about this dataset, please contact Dana Movshovitz-Attias (dma@cs.cmu.edu).
