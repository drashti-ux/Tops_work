// Perform 2D matrix array

#include <stdio.h>
int main(){
    int r_size,c_size;
    printf("Enter Number of Rows:");
    scanf("%d",&r_size);
    printf("Enter Number of Column :");
    scanf("%d",&c_size);
    int arr[r_size][c_size];
    for(int row = 0; row < r_size;row++){
        for(int col=0;col < c_size;col++){
            printf("Enter row %d col %d :",row+1,col+1);
            scanf("%d",&arr[row][col]);
        }
    }
    printf("2D Matrix:\n");
    for(int row = 0; row < r_size;row++){
        for(int col=0;col < c_size;col++){
            printf("%d ",arr[row][col]);
        }
        printf("\n");
    }
}