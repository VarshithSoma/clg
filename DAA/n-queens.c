#include <stdio.h>
#include <stdlib.h>

int board[20]; // Store the column position of queens in each row
int count = 0; // Solution count

// Function to print the board configuration
void printBoard(int n) {
    printf("\nSolution %d:\n", ++count);
    for (int i = 0; i < n; i++) {
        for (int j = 0; j < n; j++) {
            if (board[i] == j) {
                printf("Q "); // Print 'Q' for the queen's position
            } else {
                printf("- "); // Empty slot
            }
        }
        printf("\n");
    }
}

// Function to check if it's safe to place a queen at row, column
int isSafe(int row, int col) {
    for (int i = 0; i < row; i++) {
        // Check column conflict or diagonal conflicts
        if (board[i] == col || abs(board[i] - col) == abs(i - row)) {
            return 0; // Conflict detected
        }
    }
    return 1; // No conflict
}

// Backtracking function to find all solutions
void solveNQueens(int row, int n) {
    if (row == n) {
        printBoard(n); // If all queens are placed, print the board
        return;
    }

    // Try placing the queen in every column of the current row
    for (int col = 0; col < n; col++) {
        if (isSafe(row, col)) {
            board[row] = col; // Place the queen
            solveNQueens(row + 1, n); // Move to the next row
            // No need to undo the board[row] as we are overwriting it in the next iteration
        }
    }
}

int main() {
    int n;

    printf("Enter number of Queens: ");
    scanf("%d", &n);

    // Call the backtracking function starting from the first row
    solveNQueens(0, n);
    return 0;
}
