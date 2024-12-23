#include<stdio.h>
int main(){
    int ms,mp[10],temp,n=0;
    printf("Enter the memory size: ");
    scanf("%d",&ms);
    temp=ms;
    char ch='y';
    for(int i=0;ch=='y';i++){
        printf("Enter the memory req for process : %d ",i+1);
        scanf("%d",&mp[i]);
        if(mp[i]<=temp){
            printf("Memry allocated for process %d \n",i+1);
            temp-=mp[i];
        }else{
            printf("memory if full");
            break;
        }
        printf("do yo want to cont: (y/n ): \n");
        scanf(" %c",&ch);
        n++;
    }
    printf("\nPROCESS   MEMORY ALLOCATED\n");
    for(int i=0;i<n;i++){
        printf("%d   %d\n",i+1,mp[i]);
    }
    printf("\ntotal memry allocatred: %d",ms-temp);
    printf("\nTotal extrnal fragmentatuion : %d",temp);
}