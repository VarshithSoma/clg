#include<stdio.h>
int main(){
    int ms,ps,np,remPages,s[20],ft[20][20];
    printf("Enter The Memory Size : ");
    scanf("%d",&ms);
    printf("Enter the Pages Size : ");
    scanf("%d",&ps);
    int nop=ms/ps;
    printf("Number of Pages Available are : %d\n",nop);
    printf("Enter Number of processes: ");
    scanf("%d",&np);
    remPages=nop;
    for(int i=0;i<np;i++){
        printf("Enter Pages Required for P[%d]: ",i+1);
        scanf("%d",&s[i]);
        if(s[i]>remPages){
            printf("\n Memery Is Full\n");
            break;
        }
        remPages-=s[i];
        printf("Enter Page Table for P[%d]: \n",i+1);
        for(int j=0;j<s[i];j++){
            scanf("%d",&ft[i][j]);
        }
    }
    printf("\nEnter The Logical Adderess to find Physical Addersss\n");
    printf("enter procsss no and page no and offset\n");
    int x,y,z;
    scanf("%d %d %d",&x,&y,&z);
    if(x>nop||y>=s[x]||z>=ps){
        printf("Invalid");
    }else{
        int ans=ft[x][y]*ps+z;
        printf("the physical adderss is : ");
        printf("%d",ans);
    }
    

    return 0;
}