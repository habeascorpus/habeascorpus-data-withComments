#!/usr/bin/perl

# read file and output random split of lines

# usage: random_split <file_name> <train> <validation> <test>

use strict;
use List::Util qw( shuffle min max );
use POSIX;

my $file_name=$ARGV[0];
my $train_cut=$ARGV[1];
my $val_cut=$ARGV[2];
my $test_cut=$ARGV[3];

open FILE, "<", $file_name or die $!;
my @lines = <FILE>;
close (FILE);

my $num_lines = scalar @lines;
print "num_lines: ".$num_lines."\n";

my @line_numbers = shuffle (1..$num_lines);

my $start = 0;
my $end = ceil($train_cut*$num_lines-1);
print "train [".($end - $start + 1)."]\n";
print "$start --> $end\n";
open FILE, ">", $file_name.".train" or die $!;
print FILE @lines[@line_numbers[$start .. $end]];
close (FILE);

my $start = $end + 1;
my $end = min ($num_lines, ceil(($train_cut+$val_cut)*$num_lines)-1);
print "validation [".($end - $start + 1)."]\n";
print "$start --> $end\n";
open FILE, ">", $file_name.".validation" or die $!;
print FILE @lines[@line_numbers[$start .. $end]];
close (FILE);

my $start = $end + 1;
my $end = min ($num_lines, ceil(($train_cut+$val_cut+$test_cut)*$num_lines)-1);
print "test [".($end - $start + 1)."]\n";
print "$start --> $end\n";
open FILE, ">", $file_name.".test" or die $!;
print FILE @lines[@line_numbers[$start .. $end]];
close (FILE);

