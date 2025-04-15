#include<fcntl.h>
#include<stdio.h>
#include<unistd.h>
#include<sys/stat.h>
#define MAX 500
int main(){
    int fd1,n;
    char buffer[MAX],fname[20];

    printf("Enter filename : ");
    scanf("%s",fname);

    fd1=open(fname,O_RDONLY);


    if(fd1==-1){
        printf("file does not exists");
        return 1;
    }

    printf("contents of file are : ");
    n=read(fd1,buffer,MAX);
    write(1,buffer,n);
    return 0;
}