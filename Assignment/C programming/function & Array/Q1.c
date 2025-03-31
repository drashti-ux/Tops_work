// Write a program to find out the max number from given array using function

#include <stdio.h>
int max(int array[],int siz){
    int max = 0;
    for(int i = 0;i<siz;i++){
        if(array[i]>max){
            max = array[i];
        }
    }
    return max;
}
int main(){
    int size;
    printf("Enter the size of Array :");
    scanf("%d",&size);
    int arr[size];
    for(int i = 0 ;i<size;i++){
        printf("Enter the Element %d : ",i+1);
        scanf("%d",&arr[i]);
    }
    printf("The Array Element:");
    for(int i = 0 ;i<size;i++){
        printf("%d ",arr[i]);
    }
    printf("\nMax among All is %d ",max(arr,size));
}