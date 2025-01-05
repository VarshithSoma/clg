#include <stdio.h>
#include <string.h>
#include <stdlib.h>
struct block {
    int bno;               // Block number
    struct block *next;    // Pointer to the next block
};
struct fileTable {
    char name[20];         // File name
    int nob;               // Number of blocks
    struct block *sb;      // Pointer to the start block
} ft[30];
void main() {
    int i, j, n;
    char s[20];
    struct block *temp;
    printf("Enter the number of files: ");
    scanf("%d", &n);
    for (i = 0; i < n; i++) {
        printf("\nEnter file name %d: ", i + 1);
        scanf("%s", ft[i].name);
        printf("Enter the number of blocks in file %d: ", i + 1);
        scanf("%d", &ft[i].nob);
        ft[i].sb = (struct block *)malloc(sizeof(struct block));
        temp = ft[i].sb;
        printf("Enter the blocks of the file: ");
        scanf("%d", &temp->bno);
        temp->next = NULL;
        for (j = 1; j < ft[i].nob; j++) {
            temp->next = (struct block *)malloc(sizeof(struct block));
            temp = temp->next;
            scanf("%d", &temp->bno);
            temp->next = NULL;
        }
    }
    printf("\nEnter the file name to be searched: ");
    scanf("%s", s);
    for (i = 0; i < n; i++) {
        if (strcmp(s, ft[i].name) == 0) {
            break;
        }
    }
    if (i == n) {
        printf("\nFile Not Found\n");
    } else {
        printf("\nFILE NAME     NO OF BLOCKS     BLOCKS OCCUPIED");
        printf("\n%s\t\t%d\t\t", ft[i].name, ft[i].nob);

        temp = ft[i].sb;
        for (j = 0; j < ft[i].nob; j++) {
            printf("%d ", temp->bno);
            temp = temp->next;
        }
        printf("\n");
    }
}