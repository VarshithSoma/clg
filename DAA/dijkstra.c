#include<stdio.h>
#define infinity 9999
#define max 10
void fun(int g[max][max],int n,int startnode){
    int cost[max][max],distance[max],pred[max];
    int visited[max],mindistance,nextnode,i,j,count;
    for(i=0;i<n;i++){
        for(j=0;j<n;j++){
            if(g[i][j]==0) cost[i][j]=infinity;
            else cost[i][j]=g[i][j];
        }
    }
    for(i=0;i<n;i++){
        distance[i]=cost[startnode][i];
        pred[i]=startnode;
        visited[i]=0;
    }
    distance[startnode]=0;
    visited[startnode]=0;
    count=1;
    while(count<n-1){
        mindistance=infinity;
        for(i=0;i<n;i++){
            if(distance[i]<mindistance&&!visited[i]){
                mindistance=distance[i];
                nextnode=i;
            }
        }
        visited[nextnode]=1;
        for(i=0;i<n;i++){
            if(!visited[i]&&mindistance+cost[nextnode][i]<distance[i]){
                distance[i]=mindistance+cost[nextnode][i];
                pred[i]=nextnode;
            }
        }
        count++;
        for(i=0;i<n;i++){
            if(i!=startnode){
                printf("distace of node %d=%d",i,distance[i]);
                int j=i;
                do{
                    j=pred[j];
                    printf("<-%d",i);
                }while(j!=startnode);
            }
        }
    }
}
int main(){
    int G[max][max],i,j,n,v;
    printf("Enter the number of vertices: ");
    scanf("%d",&n);
    for(i=0;i<n;i++){
        for(j=0;j<n;j++){
            scanf("%d",&G[i][j]);
        }
    }
    printf("Enter starting node : ");
    scanf("%d",&v);
    fun(G,n,v);
}
