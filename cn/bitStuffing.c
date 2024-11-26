#include<stdio.h>
#include<string.h>
int main(){
    int n;
    int j=0;
    int a[20];
    int b[20];
    int count=0;
    printf("Enter the Frame Length: ");
    scanf("%d",&n);
    printf("Enter the binary frame 0s and 1s: \n");
    for(int i=0;i<n;i++){
        scanf("%d",&a[i]);
    }
    for(int i=0;i<n;i++){
        b[j++]=a[i];
        if(a[i]==1){
            count++;
            if(count==5){
                b[j++]=0;
                count=0;
            }
        }else{
            count=0;
        }
    }
    printf("\n After Character Stuffing The Frame is : \n");
    for(int i=0;i<j;i++){
        printf("%d ",b[i]);
    }
    printf("\n");
}