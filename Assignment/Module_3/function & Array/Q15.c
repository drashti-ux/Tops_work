// Store 5 numbers in array and sort it in ascending order

#include <stdio.h>

int main() {
    int size;
    printf("enter size of array:");
    scanf("%d",&size);
    int arr[size];
for(int i =0;i<size;i++){
    printf("enter number %d ",i+1);
    scanf("%d",&arr[i]);
}
for(int i=0;i<size-1;i++){
    for(int j =0;j<size-1;j++){
        if(arr[j]>arr[j+1]){
            int temp = arr[j];
            arr[j]=arr[j+1];
            arr[j+1]=temp;
        }
    }
}
    printf("Sorted Array:");

for(int i = 0;i<size;i++){
    printf("%d ",arr[i]);
}
    return 0;
}

