#include<stdio.h>
#include<string.h>
struct Filetable
{
    char name[20];
    int nob;
    int blocks[20];
}ft[20];

int main(){
    int n;
    printf("Enter Number of Files: ");
    scanf("%d",&n);
    for(int i=0;i<n;i++){
        printf("Enter the name of %d: ",i+1);
        scanf("%s",ft[i].name);
        printf("enter the number of blocks of %d : \n",i+1);
        scanf("%d",&ft[i].nob);
        printf("Enter the blocks: \n");
        for(int j=0;j<ft[i].nob;j++){
            scanf("%d",&ft[i].blocks[j]);
        }
    }
    char s[20];
    printf("Enter file to be searched : \n");
    scanf("%s",s);
    int i=0;
    for(i=0;i<n;i++){
        if(strcmp(ft[i].name,s)==0){
            break;
        }
    }
    if(i==n){
        printf("file not found");
    }else{
        printf("NAME   NO OF BLOCKS    BLOCKS   \n");
        printf("%s\t\t%d\t",ft[i].name,ft[i].nob);
        for(int j=0;j<ft[i].nob;i=j++){
            printf("%d ",ft[i].blocks[j]);
        }
    }
    return 0;
}