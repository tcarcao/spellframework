#!/usr/bin/perl -w

use strict;
use warnings;
use 5.010;
use Cwd 'abs_path';
use File::Copy;

my $path = shift || '.';

my $absoluteDirPath = abs_path($path);

my @folder_split = split('\/',$absoluteDirPath);
my $name_dir = $folder_split[-1];

my $target_dir =  $absoluteDirPath . "/../". $name_dir . "_copy";

$target_dir = abs_path($target_dir);

mkdir($target_dir) or die "Could not mkdir $target_dir: $!";

copy_recursively($absoluteDirPath, $target_dir);

traverse($absoluteDirPath);
 
sub traverse {
    my $thing = shift @_;
	my $filename = shift @_;

	#say $thing;
	if (defined($filename) and not -d $thing) {
		my $firstChar = substr($filename, 0, 1);
		my @stringSplitted = grep { /.+\.c$/ } $filename;

		if ((not $firstChar eq ".") and (scalar @stringSplitted) > 0) {
			#file it is not an hidden file and is a C language file
			my $absolutePath = abs_path($thing);
			my $command = "/Users/tac/Dropbox/MEI/Tese/CInstrumentation/CInstrumentation " . $absolutePath;
			system($command);
		}
	}

    return if not -d $thing;
    opendir my $dh, $thing or die;
    while (my $sub = readdir $dh) {
        next if $sub eq '.' or $sub eq '..';
		#say "$thing/$sub";
        traverse("$thing/$sub", $sub);
    }
    close $dh;
    return;
}

sub copy_recursively {
    my ($from_dir, $to_dir) = @_;
    opendir my($dhh), $from_dir or die "Could not open dir '$from_dir': $!";
    for my $entry (readdir $dhh) {
		next if ($entry eq '.' or $entry eq '..');
        my $source = "$from_dir/$entry";
        my $destination = "$to_dir/$entry";
        if (-d $source) {
            mkdir $destination or die "mkpath '$destination' failed: $!" if not -e $destination;
            copy_recursively($source, $destination);
        }
        else {
            copy($source, $destination) or die "copy failed: $!";
        }
    }
    closedir $dhh;
    return;
}
