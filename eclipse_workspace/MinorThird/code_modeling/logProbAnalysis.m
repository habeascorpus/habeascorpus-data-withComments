% log probability analysis
cd '/Users/dmovshov/Documents/Elwood1/Data/minor_third/MinorThird/code_modeling';

prefix = 'word';
prefix = 'prob';

data = importdata([prefix 'Count.lu.LDA.1']);
plot(data(:,2), data(:,1), '*r');
hold on
data = importdata([prefix 'Count.lu.LDA.10']);
plot(data(:,2), data(:,1), '*g');
data = importdata([prefix 'Count.lu.LDA.20']);
plot(data(:,2), data(:,1), '*b');
data = importdata([prefix 'Count.lu.LDA.5']);
plot(data(:,2), data(:,1), '*k');

data = importdata([prefix 'Count.lu.lda.LDA.1']);
plot(data(:,2), data(:,1), '*r');
hold on
data = importdata([prefix 'Count.lu.lda.LDA.10']);
plot(data(:,2), data(:,1), '*g');
data = importdata([prefix 'Count.lu.lda.LDA.20']);
plot(data(:,2), data(:,1), '*b');
data = importdata([prefix 'Count.lu.lda.LDA.5']);
plot(data(:,2), data(:,1), '*k');

data = importdata('wordCount.lu.unigram');
plot(data(:,2), data(:,1), '*r');
hold on
data = importdata('wordCount.lu.unigram.code');
plot(data(:,2), data(:,1), '*g');
data = importdata('wordCount.lu.unigram.noParsing');
plot(data(:,2), data(:,1), '*b');
data = importdata('wordCount.lu.unigram.words');
plot(data(:,2), data(:,1), '*k');

data = importdata('wordCount.mt.LDA.1');
data = importdata('wordCount.mt.LDA.10');
data = importdata('wordCount.mt.LDA.20');
data = importdata('wordCount.mt.LDA.5');
data = importdata('wordCount.mt.lda.LDA.1');
data = importdata('wordCount.mt.lda.LDA.10');
data = importdata('wordCount.mt.lda.LDA.20');
data = importdata('wordCount.mt.lda.LDA.5');
data = importdata('wordCount.mt.unigram');
data = importdata('wordCount.mt.unigram.code');
data = importdata('wordCount.mt.unigram.noParsing');
data = importdata('wordCount.mt.unigram.words');
data = importdata('wordCount.so.LDA.1');
data = importdata('wordCount.so.LDA.10');
data = importdata('wordCount.so.LDA.20');
data = importdata('wordCount.so.LDA.5');
data = importdata('wordCount.so.unigram');
data = importdata('wordCount.so.unigram.noParsing');

data = importdata([prefix 'Count.so.LDA.10']);
plot(data(:,2), data(:,1), '*r');
hold on
data = importdata([prefix 'Count.lu.LDA.10']);
plot(data(:,2), data(:,1), '*b');
data = importdata([prefix 'Count.mt.LDA.10']);
plot(data(:,2), data(:,1), '*g');
data = importdata([prefix 'Count.so.unigram']);
plot(data(:,2), data(:,1), '*k');
data = importdata([prefix 'Count.mt.unigram']);
plot(data(:,2), data(:,1), '*c');
data = importdata([prefix 'Count.lu.unigram']);
plot(data(:,2), data(:,1), '*m');
legend({'so.LDA.10', 'lu.LDA.10', 'mt.LDA.10', 'so.unigram', 'mt.unigram', 'lu.unigram'})
xlabel('log p(word)')

ylabel('count of word')
ylabel('count of log p(word)')