#include<stdio.h>
#include<sys/types.h>
#include<sys/ipc.h>
#include<sys/msg.h>
#include<string.h>
#include<stdlib.h>
struct msgbuf{
long mtype;
char mtext[40];
};
int main()
{
int msqid,len,ret;
struct msgbuf msgsend={0,"\0"};
msqid=msgget((key_t)7,IPC_CREAT|0666);
if(-1==msqid)
{
perror("msgget:");
exit(1);
}
printf("enter msgtype:\n");
scanf("%ld",&msgsend.mtype);
printf("enter msgtext:\n");
scanf("%s",msgsend.mtext);
len=strlen(msgsend.mtext);
ret=msgsnd(msqid,&msgsend,len,0);
if(-1==ret)
{
perror("msgsnd:");
exit(1);
}
else
printf("msgsent:\n");
}

