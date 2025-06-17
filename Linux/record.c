#include <stdio.h>
#include <stdlib.h>
#include <errno.h>
#include <fcntl.h>
#include <unistd.h>

int main(int argc, char *argv[]) {
    /* Initialize a write lock on the entire file */
    struct flock fl = { F_WRLCK, SEEK_SET, 0, 0, 0 };
    int fd;
    fl.l_pid = getpid();  // Set process ID
    if (argc > 1)
        fl.l_type = F_RDLCK;  // Use read lock if there's a command-line argument
    // Open the file "test.c" in read-write mode
    if ((fd = open("test.c", O_RDWR)) == -1) {
        perror("open");
        exit(1);
    }
    printf("Press <RETURN> to try to get lock: ");
    getchar();
    printf("Trying to get lock...\n");

    // Try to acquire the lock (blocking)
    if (fcntl(fd, F_SETLKW, &fl) == -1) {
        perror("fcntl");
        exit(1);
    }

    printf("Got lock\n");

    // Unlock the region
    fl.l_type = F_UNLCK;

    if (fcntl(fd, F_SETLK, &fl) == -1) {
        perror("fcntl");
        exit(1);
    }

    printf("Unlocked.\n");

    close(fd);
    return 0;
}