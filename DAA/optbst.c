// A naive recursive implementation of Optimal Binary Search Tree problem
#include <stdio.h>
#include <limits.h>

// A utility function to get sum of array elements freq[i] to freq[j]
int sum(int freq[], int i, int j) {
    int s = 0;
    for (int k = i; k <= j; k++) {
        s += freq[k];
    }
    return s;
}

// A recursive function to calculate cost of Optimal Binary Search Tree
int optCost(int freq[], int i, int j) {
    // Base cases
    if (j < i)     // No elements in this subarray
        return 0;
    if (j == i)     // One element in this subarray
        return freq[i];

    // Get sum of freq[i], freq[i+1], ..., freq[j]
    int fsum = sum(freq, i, j);

    // Initialize minimum value
    int min = INT_MAX;

    // Try making all keys in interval keys[i..j] as root
    for (int r = i; r <= j; r++) {
        // Cost when r is root = cost of left + cost of right subtrees
        int cost = optCost(freq, i, r - 1) + optCost(freq, r + 1, j);
        if (cost < min)
            min = cost;
    }

    // Return minimum cost including current root
    return min + fsum;
}

// The main function that calculates minimum cost of a Binary Search Tree
int optimalSearchTree(int keys[], int freq[], int n) {
    // Keys[] is assumed to be sorted. If not, sort it and adjust freq[].
    return optCost(freq, 0, n - 1);
}

// Driver program to test above functions
int main() {
    int keys[] = {10, 12, 20};
    int freq[] = {34, 8, 50};
    int n = sizeof(keys) / sizeof(keys[0]);

    printf("Cost of Optimal BST is %d\n", optimalSearchTree(keys, freq, n));

    return 0;
}
