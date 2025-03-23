#include<stdio.h>
#include<stdlib.h>
void merge(int arr[],int l,int m,int r){
    int i,j,k;
    int n1=m-l+1;
    int n2=r-m;
    int L[n1],R[n2];
    for(i=0;i<n1;i++){
        L[i]=arr[l+i];
    }
    for(i=0;i<n2;i++){
        R[i]=arr[m+1+i];
    }
    i=0,j=0,k=l;
    while(i<n1&&j<n2){
        if(L[i]<R[j]){
            arr[k]=L[i];
            i++;
        }else{
            arr[k]=R[j];
            j++;
        }
        k++;
    }
    while(i<n1){
        arr[k++]=L[i++];
    }
    while(j<n2){
       arr[k++]= R[j++];
    }
}
void ms(int arr[],int l,int r){
    if(l<r){
        int m=(l+r)/2;
        ms(arr,l,m);
        ms(arr,m+1,r);
        merge(arr,l,m,r);
    }
}
int main(){
    int arr[]={6,5,4,3,2,1};
    int size=sizeof(arr)/sizeof(int);
    ms(arr,0,size-1);
    for(int i=0;i<size;i++){
        printf("%d ",arr[i]);
    }
    return 0;
}