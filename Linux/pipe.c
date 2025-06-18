#include <stdio.h>
#include <stdlib.h>
#include <errno.h>
#include <unistd.h>  // for pipe(), read(), write()

int main() {
    int pfds[2];        // Array to store pipe file descriptors: pfds[0] - read end, pfds[1] - write end
    char buf[30];       // Buffer to store the read data

    // Create a pipe
    if (pipe(pfds) == -1) {
        perror("pipe"); // If pipe creation fails
        exit(1);
    }

    // Write to the write-end of the pipe (pfds[1])
    printf("Writing to file descriptor #%d\n", pfds[1]);
    write(pfds[1], "test", 5);  // Writing 5 bytes: includes '\0' terminator for safety

    // Read from the read-end of the pipe (pfds[0])
    printf("Reading from file descriptor #%d\n", pfds[0]);
    read(pfds[0], buf, 5);      // Read 5 bytes into buffer

    // Print what was read
    printf("Read \"%s\"\n", buf);

    return 0;
}
