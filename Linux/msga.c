#include <stdio.h>
#include <stdlib.h>
#include <sys/msg.h>
#include <sys/ipc.h>
#include <string.h>
#include <sys/types.h>

struct msgbuf {
    long mtype;
    char mtext[40];
};

int main() {
    int msgq;
    struct msgbuf msgsend = {0, "\0"};

    msgq = msgget((key_t)7, IPC_CREAT | 0666);
    if (msgq == -1) {
        perror("msgget");
        exit(1);
    }

    printf("Enter the message type: ");
    scanf("%ld", &msgsend.mtype);

    printf("Enter the message: ");
    scanf("%s", msgsend.mtext);  // or use fgets() for full lines

    int len = strlen(msgsend.mtext);
    int ret = msgsnd(msgq, &msgsend, len, 0);

    if (ret == -1) {
        perror("msgsnd");
        exit(1);
    }

    printf("Message sent successfully.\n");
    return 0;
}
