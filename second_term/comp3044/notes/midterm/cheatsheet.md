```

#!bin/bash

chmod
chmod u+x
---------
echo
----------
cd
----------
cat
----------
ls
----------
ls -l -->long listing
ls -r -->reverse alphabetic order
ls -lh/-h -->human readable
ls -a --> list hidden files
ls -R --> recursive
ls -S --> sort
ls -tl --> sort by timestamp
ls -t --fulltime
----------
pwd [OPTIONS]
----------
cp --> copy
cp source destination
cp -v --> verbose mode
cp -i --> interactive
cp -n --> no clobber no overwrite
cp -r --> recursive //for directories mostly
----------
mv --> move
mv [source] [destination]
mv -v --> verbose mode
mv -i --> interactive
mv -n --> no clobber no overwrite
----------
rm --> remove
rm -r
----------
mkdir
----------
touch
----------
gzip
gzip -l --> provide info on already zipped file
gzip -d
gunzip or gzip -d --> decompress
bzip
bunzip
xz
unxz
zip
unzip
----------
tar --> Tape Archive
tar -c [-f ARCHIVE] [OPTIONS] [FILE...]
    -c means create
    -f file name must be at the end
    -t list the file names
    -v verbose
tar -czf alpha_files.tar.gz alpha* --> create, zip with gzip, filename
tar -cjf alpha_files.tar.gz alpha* --> create, zip with bzip, filename
tar -x --> extract files from archive
----------
man--> man pages
----------
grep --> search
grep -c --> shows how many lines match
grep -n --> shows line numbers
grep -v --> inverts the match, outputting all lines that do not contain the pattern
grep -i --> ignores case distinctions retrieve both small and capital letter results
grep -w --> only full word results
grep -E --> extended regex
----------
history
!2 !3 -->gets the nth command in the history
----------
cal
-----------
HISTSIZE
PATH --> where commands are
PATH=/usr/bin/custom:$PATH -->/usr/bin/custom directory to PATH variable
HOME
------------
env --> used alone lists all environmental variables
------------
export
export variable1
unset variable1
-------------
type command
-------------
which --> searches the path of the command
-------------
alias name=command
alias mycal="cal 2019"
-------------
more
less
head
tail
--------------
man 
--------------
whereis --> for command
--------------
locate -->for file and directory
locate -c --> how many match strings
locate -c -b how many match only filename
--------------
info
--------------
wc --> gives back number of lines-words-bytes
wc -l --> only lines
wc -w --> only number of words
--------------
cut --> can extract columns of text from a file or standard input.
cut -d --> delimiter
    cut -d: --> : is delimiter here
cut -c --> char based
    cut -c1-5 --> chars between 1 and 5
cut -f --> filed based
    cut -d: f1 --> : is delimiter only shows until firs delimiter filed 1
    cut -d: f1,3 --> : is delimiter only shows until firs delimiter filed 1 and 2
--------------
read --> user input
--------------
```