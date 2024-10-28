// WAP to take two Array input from user and sort them in ascending or descending order as per user’s choice

#include <stdio.h>
void ascending(int arr[],int size){
    for(int j = 0;j<size;j++){
    for(int i = 0;i<size-1;i++){
        if(arr[i]>arr[i+1]){
            int temp = arr[i];
            arr[i]=arr[i+1];
            arr[i+1]=temp;
        }
    }
    }
    printf("In Ascending Order:");
    for(int i = 0;i<size;i++){
        printf("%d ",arr[i]);
    }
}
void descending(int arr[],int size){
    for(int j = 0;j<size;j++){
    for(int i = 0;i<size-1;i++){
        if(arr[i]<arr[i+1]){
            int temp = arr[i];
            arr[i]=arr[i+1];
            arr[i+1]=temp;
        }
    }
    }
    printf("In Descending Order:");
    for(int i = 0;i<size;i++){
        printf("%d ",arr[i]);
    }
}

int main(){
    int size1,size2;
    printf("Enter The Size Of First Array:");
    scanf("%d",&size1);
    int arr1[size1];

      printf("Enter The First Array Elements\n");
            for(int i=0;i<size1;i++){
                printf("Element %d:",i+1);
                scanf("%d",&arr1[i]);
            }
    printf("Enter The Size Of Second Array:");
    scanf("%d",&size2);
    int arr2[size2];
    
      printf("Enter The Second Array Elements\n");
        for(int i=0;i<size2;i++){
            printf("Element %d:",i+1);
            scanf("%d",&arr2[i]);
        }
        printf("First Array:");
            for(int i=0;i<size1;i++){
                printf("%d ",arr1[i]);
            }
        printf("\nSecond Array:");
            for(int i=0;i<size2;i++){
                printf("%d ",arr2[i]);
            }
            int choice;
    printf("\n1.Ascending Order\n2.Descending Order \nEnter What You Want To Perform With The Array:");
    scanf("%d",&choice);
switch(choice){
    case 1:{
        int array;
        printf("Which Array You Want to Convert In Ascending Order? ");
        scanf("%d",&array);
        switch(array){
            case 1:{
                ascending(arr1,size1);
                break;
            }
            case 2:{
                ascending(arr2,size2);
                break;
            }
        }
        break;
    }
    case 2 :{
        int array;
        printf("Which Array You Want to Convert In Descending Order? ");
        scanf("%d",&array);
        switch(array){
            case 1:{
                descending(arr1,size1);
                break;
            }
            case 2:{
                descending(arr2,size2);
                break;
            }
        }
        break;
    }
    default: {
        printf("Enter Valid Choice..");
    }
}
}