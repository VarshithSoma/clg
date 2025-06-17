#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <sys/msg.h>
#include <errno.h>
#include <sys/ipc.h>
#include <sys/types.h>

struct msgbuf {
    long mtype;
    char mtext[20];
};

int main() {
    int msgq, type;
    struct msgbuf msgread;

    msgq = msgget((key_t)5, IPC_CREAT | 0666);
    if (msgq == -1) {
        perror("msgget:");
        exit(1);
    }

    printf("Enter the message type to receive: ");
    scanf("%d", &type);

    int len = sizeof(msgread.mtext); // ✅ fixed: read full size of mtext
    int ret = msgrcv(msgq, &msgread, len, type, 0);

    if (ret == -1) {
        perror("msgrcv:");
        exit(1);
    }

    printf("Message received successfully.\n");
    printf("Message type: %ld\n", msgread.mtype);
    printf("Message text: %s\n", msgread.mtext);

    return 0;
}
