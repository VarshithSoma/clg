#include<stdio.h>
#include<unistd.h>
#include<sys/wait.h>
int main(){
    int pid;
    pid=fork();
    if(pid==0){
        printf("child process %d\n",getpid());
        _exit(0);
    }
    wait(0);
    sleep(10);
    printf("parent process");
    return 0;
}