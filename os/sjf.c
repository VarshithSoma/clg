#include<stdio.h>
int main(){
    int wt[20],tat[20],bt[20],n;
    float awt=0,atat=0;
    printf("Enter the Number of Processes: ");
    scanf("%d",&n);
    for(int i=0;i<n;i++){
        printf("Enter the burst Time of %d  :",i);
        scanf("%d",&bt[i]);
    }
    for(int i=0;i<n;i++){
        for(int j=0;j<n-i-1;j++){
            if(bt[j]>bt[j+1]){
                int temp=bt[j];
                bt[j]=bt[j+1];
                bt[j+1]=temp;
            }
        }
    }
    wt[0]=0;
    for(int i=0;i<n;i++){
        if(i>0){
            wt[i]=wt[i-1]+bt[i-1];
        }
        tat[i]=wt[i]+bt[i];
        atat+=tat[i];
        awt+=wt[i];
    }
    printf("\nPROCESS\tBURST TIME\tWAITING TIME\tTURNAROUND TIME\n");
    for (int i = 0; i < n; i++) {
        printf("P%d\t\t%d\t\t%d\t\t%d\n", i + 1, bt[i], wt[i], tat[i]);
    }

    printf("\nAverage Waiting Time: %.2f", awt / n);
    printf("\nAverage Turnaround Time: %.2f\n", atat / n);

    return 0;

}