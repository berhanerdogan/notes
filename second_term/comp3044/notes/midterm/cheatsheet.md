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
more --------> ude "/" to start  a search 
less --------> ude "/" to start  a search 
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
arch --> To see which family the CPU of the current system belongs to
lscpu --> info about cpu
--------------
free  --> shows ram info also swap too
free -m --> megabyte flag
free -g -- gigabyte flag
--------------
lspci  --> Peripheral devices (PCI Peripheral Component Interconnect)
--------------
lsusb --> same thing with usb devices
--------------
fdisk --> MBR partitions/ smaller than terabyte
cfdisk
sfdisk
gdisk --> GPT partitions 
cgdsik
sgisk
gparted --> suppprt both MBR and GPT
--------------
top
htop
--------------
mount
unmount
--------------
pstree --> process tree
ps --> processes only in current shell
ps --forest
ps -aux --> all processes in the system
ps -ef --> all processes in the system
ps -aux | head
ps -aux | grep firefox
------------
dmesg --> kernel messages
-------------
ifconfig -->  display network configuration information
ip addr show
route
arp
ping
ping -c 4 --> limited with 4 packages
netstat
netstat -i --> network interfaces
netsat -r --> samewith route
netstat -tln tcp listen names/ can see active ports
ss --> socket statistics
ss -s --> types of sockets, statistics about their existence and numbers of actual packets sent and received via each socket type
dig --> queries the IP address or other DNS records of a domain name/ ip adress found here
host --> shows ip or dns directly
host -t CNAME
ssh
-------------
su [options] [username] --> switch users
su - --> root
getent
getent passwd
id --> gives current id
who --> shows current users
who -b --> system boot
who -r --> runlevel
systemctl get-default --> new systems changed runlevels to targets
last --> view login history
-------------
groupadd <group_name>
groupadd -g <group_id> <group_name>\
groupadd -r --> create group ids less than 1000/ system
groupmod
groupmod -n --> change name
groupmode -g --> change id
groupdel
------------
useradd
useradd -D --> allows you to change default useradd options
useradd -g --> group
useradd -b --> different default base (home)
useradd -f <days> --> changes the inactive days
useradd -e --> expire
useradd -s --> different shell
useradd -k --> different skeleton dir
useradd -G sales,research jane --> supplementary group
useradd -d --> specify an existing directory for new user's home
------------
passwd <user> --> change password
------------
usermmod
usermod -c --> comment (that field)
usermod -d --> change home dir
usermod -e --> set account expiration date
usermod -f --> inactive days
usermod -g --> set primary group
usermod -G --> supplementary groups
usermod -a --> Append the user's supplemental groups with those specified by the -G option
usermod -h --> help
usermod -l --> change user's login name
usermod -L --> lock the user
usermod -s --> specify user shell
usermod -u --> specify uid
usermod -U --> unlock
------------
userdel
------------
newgrp <GROUP_NAME> --> opens a new shell changes current group to create a file
------------
chgrp group_name file
chgrp -R group_name dir
------------
chown user /path/to/file
chown user:group /path/to/file --> user and group change at the same time
chown user.group /path/to/file
chown :group /path/to/file --> only change group
chown .group /path/to/file 
-----------
chmod new_permission file_name
-----------
/var/boot.log --> Messages generated as services are started during the startup of the system.
/var/cron --> Messages generated by the crond daemon for jobs to be executed on a recurring basis.
/var/dmesg --> Messages generated by the kernel during system boot up.
/var/maillog
/var/syslog --> Messages from the kernel and other processes that don't belong elsewhere. Sometimes named messages instead (Redhat/CentOS)
/var/secure --> Messages from processes that required authorization or authentication (such as the login process).
/var/journal --> Messages from the default configuration of the systemd-journald.service; can be configured in the /etc/journald.conf file amongst other places.
/var/Xorg.0.log --> Messages from the X Windows (GUI) server.
/etc/sysconfig/network-scripts/ifcfg-eth0 --> ip config
/etc/resolv.conf --> IP adress of the dns server redhat etc.
/etc/netplan/*.yaml --> debian/ubuntu
/etc/hosts 	This file contains a table of hostnames to IP addresses
/etc/nsswitch.conf --> It contains a particular entry that describes in what order name resolution sources are consulted.
/etc/passwd --> users
/etc/login.defs --> user config files/etc/login.defs
------------
```
