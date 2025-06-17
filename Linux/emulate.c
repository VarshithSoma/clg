#include<stdio.h>
#include<fcntl.h>
#include<unistd.h>
#include<stdlib.h>
int main(int argc,char *argv[]){
    int fd,i;
    char ch[1];
    if(argc<2){
        printf("usage: mycat filename\n");
        exit(0);
    }
    fd=open(argv[1],O_RDONLY);
    if(fd==-1){
        printf("file doest exists");
        exit(0);
    }
    while(read(fd,ch,1)>0){
        printf("%c",ch[0]);
    }
    close(fd);
    return 0;
}