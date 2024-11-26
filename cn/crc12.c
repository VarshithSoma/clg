#include <stdio.h>
#include <string.h>

// Length of the generator polynomial
#define N strlen(gen_poly)

// Variables
char data[28], check_value[28], gen_poly[10];
int data_length;

// Function to perform XOR operation
void XOR() {
    for (int j = 1; j < N; j++) {
        check_value[j] = (check_value[j] == gen_poly[j]) ? '0' : '1';
    }
}

// Function to compute CRC
void crc() {
    // Initialize the check_value array
    for (int i = 0; i < N; i++) {
        check_value[i] = data[i];
    }

    int i = N;
    do {
        // Perform XOR if the first bit is 1
        if (check_value[0] == '1') {
            XOR();
        }

        // Shift the bits left by one position
        for (int j = 0; j < N - 1; j++) {
            check_value[j] = check_value[j + 1];
        }

        // Append the next bit from data
        check_value[N - 1] = data[i++];
    } while (i <= data_length + N - 1); // Loop until the end of data
}

// Function to check for errors on the receiver side
void receiver() {
    printf("\nEnter the received data: ");
    scanf("%s", data);

    printf("\n-----------------------------\n");
    printf("Data received: %s\n", data);

    // Compute CRC for the received data
    crc();

    // Check for errors
    for (int i = 0; i < N - 1; i++) {
        if (check_value[i] != '0') {
            printf("\nError detected in received data\n");
            return;
        }
    }
    printf("\nNo error detected in received data\n");
}

int main() {
    // Get the data to be transmitted
    printf("\nEnter data to be transmitted: ");
    scanf("%s", data);

    // Get the generator polynomial
    printf("\nEnter the generating polynomial: ");
    scanf("%s", gen_poly);

    // Find the length of the data
    data_length = strlen(data);

    // Append n-1 zeros to the data
    for (int i = data_length; i < data_length + N - 1; i++) {
        data[i] = '0';
    }
    data[data_length + N - 1] = '\0'; // Null-terminate the string

    printf("\n----------------------------------------");
    printf("\nData padded with n-1 zeros: %s", data);
    printf("\n----------------------------------------");

    // Compute CRC
    crc();

    printf("\nCRC or Check value: %s", check_value);

    // Append CRC to the original data
    for (int i = data_length; i < data_length + N - 1; i++) {
        data[i] = check_value[i - data_length];
    }
    data[data_length + N - 1] = '\0'; // Null-terminate the string

    printf("\n----------------------------------------");
    printf("\nFinal data to be sent: %s", data);
    printf("\n----------------------------------------\n");

    // Receiver side error checking
    receiver();

    return 0;
}
