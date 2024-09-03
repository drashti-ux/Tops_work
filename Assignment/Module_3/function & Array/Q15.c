// Store 5 numbers in array and sort it in ascending order

#include <stdio.h>
int main(){
    int num[5];
    for(int i = 0; i< 5 ;i++){
        printf("Enter Number %d : ",i+1);
        scanf("%d",&num[i]);
    }
    for(int i = 0;i<4;i++){
        for(int j =0 ; j <5 ; j++){
            if(num[i] > num[i+1]){
                int temp = num[i];
                num[i]= num[i+1];
                num[i+1]=temp;
            }
        }
    }
    printf("Sorted Array:");
    for(int i = 0 ; i<5 ; i++){
        printf("%d ",&num[i]);
    }
}