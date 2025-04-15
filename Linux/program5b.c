#include<stdio.h>
#include<unistd.h>
#include<fcntl.h>
#include<sys/stat.h>
int main(int argc,char *argv[]){
    open(argv[1],O_RDONLY);
    creat(argv[2],S_IWUSR);
    rename(argv[1],argv[2]);
    unlink(argv[1]);
}