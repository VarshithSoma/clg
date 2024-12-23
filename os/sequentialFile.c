#include<stdio.h>
#include<string.h>
struct fileTable{
    char name[20];
    int nob;
    int sb;
}ft[20];
int main(){
    int n;
    printf("Enter the no of files: ");
    scanf("%d",&n);
    for(int i=0;i<n;i++){
        printf("Enter the name if Block  %d: ",i+1);
        scanf("%s",ft[i].name);
        printf("Enter the starting Block of %d: ",i+1);
        scanf("%d",&ft[i].sb);
        printf("Enter the no of Block of %d: ",i+1);
        scanf("%d",&ft[i].nob);
    }
    printf("Enter file to be searched :");
    char s[20];
    scanf("%s",s);
    int i=0;
    for(i=0;i<n;i++){
        if(strcmp(ft[i].name,s)==0){
            break;
        }
    }
    if(i==n){
        printf("File not found");
    }else{
        printf("NAME    NO OF BLOCKS    BLOCKS\n");
        printf("%s\t\t%d\t\t",ft[i].name,ft[i].sb);
        for(int j=0;j<ft[i].nob;j++){
            printf("%d ",ft[i].sb+j);
        }
    }
    return 0;
}