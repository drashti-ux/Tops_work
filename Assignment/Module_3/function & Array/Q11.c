// WAP to accept 5 numbers from user and display in reverse order using for loop and array 

#include <stdio.h>
int main(){
    int arr[5];
    int i;
    int j = 0;
    for( i = 0 ; i<5 ; i++){
        printf("Enter Number %d : ",i+1);
        scanf("%d",&arr[i]);
    }
    int reverse[5];
    for( i = 4 ; i >= 0 ; i--){
            reverse[j] = arr[i];
            j++;
        }
    printf("In Reverse:");
    for( i = 0; i<5; i++){
        printf("%d ",reverse[i]);
    }
}