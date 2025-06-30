#include<stdio.h>
#include<stdlib.h>
int g[100][100],spanning[100][100],n;
int prims(){
    int cost[100][100];
    int u,v,min_distance,distance[100],from[100];
    int visisted[100],count,i,min_cost,j;
    for(i=0;i<n;i++){
        for(j=0;j<n;j++){
            if(g[i][j]==0){
                cost[i][j]=9999;
            }else{
                cost[i][j]=g[i][j];
                spanning[i][j]=0;
            }
        }
    }
    distance[0]=0;
    for(i=0;i<n;i++){
        visisted[i]=0;
        from[i]=0;
        distance[i]=cost[0][i];
    }
    visisted[0]=1;
    min_cost=0;
    count=n-1;
    while(count>0){
        min_distance=9999;
        for(i=0;i<n;i++){
            if(!visisted[i]&&distance[i]<min_distance){
                min_distance=distance[i];
                v=i;
            }
        }
        u=from[v];
        spanning[u][v]=distance[v];
        spanning[v][u]=distance[v];
        count--;
        visisted[v]=1;
        for(int i=1;i<n;i++){
            if(visisted[i]==0&&cost[i][v]<distance[i]){
                distance[i]=cost[i][v];
                from[i]=v;
            }
        }
        min_cost=min_cost+cost[u][v];
    }
    return min_cost;

}
int main(){
    int i,j,total_cost;
    printf("Enter the number of vertices");
    scanf("%d",&n);
    printf("Enter the adjacency matrix: ");
    for(i=0;i<n;i++){
        for(j=0;j<n;j++){
            scanf("%d",&g[i][j]);
        }
    }
    total_cost=prims();
    printf("spanning tree matrix: ");
    for(i=0;i<n;i++){
        printf("\n");
        for(j=0;j<n;j++){
            printf("%d\t",spanning[i][j]);
        }
    }
}