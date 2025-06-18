#include<stdio.h>
#include<stdlib.h>
#include<unistd.h>
#include<errno.h>

int main(){
    int pfds[2];
    char buf[30];
    if(pipe(pfds)==-1){
        perror("pipe");
        exit(1);
    }
    printf("writing to the file #%d\n",pfds[1]);
    write(pfds[1],"test",5);

    printf("reading from the file #%d\n",pfds[0]);
    read(pfds[0],buf,5);

    printf("Read");
    printf("%s",buf);;
    printf("\n");
    return 0;
}