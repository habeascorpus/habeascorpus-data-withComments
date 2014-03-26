% Load hmmlda toolbox
addpath('/Users/dmovshov/Documents/Software/MATLAB_LDA_toolbox/topictoolbox/')

% Load minorthird
cd '/Users/dmovshov/Documents/Elwood1/Data/minor_third/MinorThird/code_modeling';

% WS = importdata('matlabTokenSequense.txt')';
% DS = importdata('matlabDocumentSequense.txt')';
% fid = fopen('matlabVocab.txt');
% WS = importdata('matlabTokenSequense.tokenized.txt')';
% DS = importdata('matlabDocumentSequense.tokenized.txt')';
% fid = fopen('matlabVocab.tokenized.txt');
WS = importdata('matlabTokenSequense.sentence.txt')';
DS = importdata('matlabDocumentSequense.sentence.txt')';
fid = fopen('matlabVocab.sentence.txt');

C = textscan(fid, '%d\t%s');
fclose(fid);
[B,IX] = sort(C{1,1});
WO = C{1,2};
WO = WO(IX);

% Set the parameters for the model
T      = 10;     % number of topics
NS     = 120;     % number of syntactic states
N      = 1500;    % number of iterations
ALPHA  = 50 / T; % ALPHA hyperparameter
BETA   = 0.01;   % BETA hyperparameter
GAMMA  = 0.1;    % GAMMA hyperparameter
SEED    = 2;     % random SEED

filename1 = 'topics_minorthird_hmmlda.txt'; % text file showing topic-word distributions
filename2 = 'states_minorthird_hmmlda.txt'; % text file showing hmm state-word distributions
    
% What output to show (0=no output; 1=iterations; 2=all output)

OUTPUT = 1;

% Run the HMM-LDA Gibbs sampler

tic
[WP,DP,MP,Z,X]=GibbsSamplerHMMLDA( WS,DS,T,NS,N,ALPHA,BETA,GAMMA,SEED,OUTPUT);

fprintf( 'Elapsed time = %5.0f seconds\n' , toc );

% Save the results to a file

save 'hmmldasingle_minorthird' WP DP MP Z X ALPHA BETA GAMMA N;

% Calculate the most likely words in each topic and write to a cell array of strings

[S] = WriteTopics( WP , BETA , WO , 7 , 0.8 , 4 , filename1 );
% [S] = WriteTopics( WP , BETA , WO , 7 , 1 , 4 , filename1 );

% Show the most likely words in the topics

fprintf( '\n\nMost likely words in the topics:\n' );
S( 1:T )

% Calculate the most likely words in each syntactic state and write to a cell array of strings

[S] = WriteTopics( MP , BETA , WO , 7 , 0.8 , 4 , filename2 );
% [S] = WriteTopics( MP , BETA , WO , 7 , 1 , 4 , filename2 );

% Show the most likely words in the syntactic states

fprintf( '\n\nMost likely words in the syntactic states:\n' );
S( 1:NS )
