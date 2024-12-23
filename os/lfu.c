#include<stdio.h>
int main(){
    int m,rs[30],f,cntr[20],a[20],pf=0;
    printf("Enter the number of page references: ");
    scanf("%d",&m);
    printf("Enter the reference string: ");
    for(int i=0;i<m;i++){
        scanf("%d",&rs[i]);
    }
    printf("Enter the number of frames: ");
    scanf("%d",&f);
    for(int i=0;i<f;i++){
        cntr[i]=0;
        a[i]=-1;
    }
    printf("page replacement process is : ");
    for(int i=0;i<m;i++){
        int found=0;
        for(int j=0;j<f;j++){
            if(rs[i]==a[j]){
                cntr[i]++;
                found=1;
                break;
            }
        }
        if(!found){
            pf++;
            int min=0;
            for(int k=0;k<f;k++){
                if(cntr[k]<cntr[min]){
                    min=k;
                }
            }
            a[min]=rs[i];
            cntr[min]=1;
        }
        for (int j = 0; j < f; j++) {
                printf("%d\t", a[j]);
        }
        if (!found) {
            printf("PF No. %d", pf);
        }
    }
    printf("\nTotal number of page faults: %d\n", pf);
    return 0;
}