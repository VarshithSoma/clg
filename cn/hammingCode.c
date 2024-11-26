#include <stdio.h>

void main() {
    int data[7], rec[7], i, c1, c2, c3, error_position;

    printf("This works for a message of 4 bits.\nEnter the message bits one by one: ");
    scanf("%d %d %d %d", &data[0], &data[1], &data[2], &data[4]);

    // Calculate parity bits
    data[6] = data[0] ^ data[2] ^ data[4]; // P1
    data[5] = data[0] ^ data[1] ^ data[4]; // P2
    data[3] = data[0] ^ data[1] ^ data[2]; // P4

    printf("\nThe encoded bits are: ");
    for (i = 0; i < 7; i++) {
        printf("%d ", data[i]);
    }

    printf("\n\nEnter the received data bits one by one: ");
    for (i = 0; i < 7; i++) {
        scanf("%d", &rec[i]);
    }

    // Check parity bits for error detection
    c1 = rec[6] ^ rec[4] ^ rec[2] ^ rec[0]; // P1 check
    c2 = rec[5] ^ rec[4] ^ rec[1] ^ rec[0]; // P2 check
    c3 = rec[3] ^ rec[2] ^ rec[1] ^ rec[0]; // P4 check

    error_position = c3 * 4 + c2 * 2 + c1; // Determine error position

    if (error_position == 0) {
        printf("\nNo error detected. The received message is correct.\n");
    } else {
        printf("\nError detected at position: %d\n", error_position);

        // Correct the error
        rec[7 - error_position] = rec[7 - error_position] ^ 1;

        printf("The corrected message is: ");
        for (i = 0; i < 7; i++) {
            printf("%d ", rec[i]);
        }
        printf("\n");
    }
}
