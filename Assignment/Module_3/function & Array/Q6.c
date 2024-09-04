// WAP to make addition, Subtraction and multiplication of two matrix using 2-D Array

#include<stdio.h>
void addition(int r_size,int c_size,int mat1[r_size][c_size],int mat2[r_size][c_size]){
    int result[r_size][c_size];
    for(int r = 0 ;r <r_size;r++){
        for(int c = 0;c<c_size;c++){
            result[r][c]=mat1[r][c]+mat2[r][c];
        }
    }
    printf("Addition of matrix:\n");
    for(int r = 0 ;r <r_size;r++){
        for(int c = 0;c<c_size;c++){
           printf("%d ",result[r][c]);
        }
        printf("\n");
    }
}
void substraction(int r_size,int c_size,int mat1[r_size][c_size],int mat2[r_size][c_size]){
    int result[r_size][c_size];
    for(int r = 0 ;r <r_size;r++){
        for(int c = 0;c<c_size;c++){
            result[r][c]=mat1[r][c]-mat2[r][c];
        }
    }
    printf("Substraction of matrix:\n");
    for(int r = 0 ;r <r_size;r++){
        for(int c = 0;c<c_size;c++){
           printf("%d ",result[r][c]);
        }
        printf("\n");
    }
}
void multiplication(int r_size,int c_size1,int c_size2,int mat1[r_size][c_size1],int mat2[c_size1][c_size2]){
    int result_matrix[r_size][c_size2];
        
            for(int i = 0;i<r_size;i++){
                for(int j = 0;j<c_size2;j++){
                    result_matrix[i][j] = 0;
                    for(int k = 0;k<c_size1;k++){
                        result_matrix[i][j] += mat1[i][k]*mat2[k][j];
                    }
                } 
            }
            printf("Multiplication Matrix:\n");
            for(int i = 0;i<r_size;i++){
                for(int j = 0;j<c_size2;j++){
                    printf("%d ",result_matrix[i][j]);
                } 
                printf("\n");
            }
}

int main(){
    int ch;
    printf("1.Addition \n2.Substraction \n3.Multiplication \n");
    printf("Enter Your Choice:");
    scanf("%d",&ch);
    if(ch==1 || ch ==2){
        if(ch == 1){
            printf("For Addition The size of both matrix is same\n");
        }
        else{
            printf("For Substraction The size of both matrix is same\n");
        }
    int rows,cols;
     printf("Enter The size of row:");
     scanf("%d",&rows);
     printf("Enter The size of cols:");
     scanf("%d",&cols);
     int mat1[rows][cols],mat2[rows][cols];
     printf("Enter First Array Elements\n");
     for(int row = 0;row<rows;row++){
         for(int col = 0;col<cols;col++){
             printf("Enter %d %d element: ",row+1,col+1);
             scanf("%d",&mat1[row][col]);
         }
     }
     for(int row = 0;row<rows;row++){
         for(int col = 0;col<cols;col++){
             printf("%d ",mat1[row][col]);
         }
         printf("\n");
     }
     printf("Enter Second Array Elements\n");
     for(int row = 0;row<rows;row++){
         for(int col = 0;col<cols;col++){
             printf("Enter %d %d element: ",row+1,col+1);
             scanf("%d",&mat2[row][col]);
         }
     }
     for(int row = 0;row<rows;row++){
         for(int col = 0;col<cols;col++){
             printf("%d ",mat2[row][col]);
         }
         printf("\n");
     }
     switch(ch){
        case 1:{
            addition(rows, cols, mat1, mat2);
            break;
        }
        case 2:{
            substraction(rows, cols, mat1, mat2);
            break;
        }
    }
    }
    else if(ch==3){
        printf("For Multiplication The column size of Matrix1 & row size of matrix2 is same\n");
        int rows,col1,col2;
     printf("Enter The size of row:");
     scanf("%d",&rows);
     printf("Enter The size of cols in matrix1:");
     scanf("%d",&col1);
     printf("Enter The size of cols in matrix2:");
     scanf("%d",&col2);
     int mat1[rows][col1],mat2[col1][col2];
          printf("Enter First Array Elements\n");
     for(int row = 0;row<rows;row++){
         for(int col = 0;col<col1;col++){
             printf("Enter %d %d element: ",row+1,col+1);
             scanf("%d",&mat1[row][col]);
         }
     }
     for(int row = 0;row<rows;row++){
         for(int col = 0;col<col1;col++){
             printf("%d ",mat1[row][col]);
         }
         printf("\n");
     }
     printf("Enter Second Array Elements\n");
     for(int row = 0;row<col1;row++){
         for(int col = 0;col<col2;col++){
             printf("Enter %d %d element: ",row+1,col+1);
             scanf("%d",&mat2[row][col]);
         }
     }
     for(int row = 0;row<col1;row++){
         for(int col = 0;col<col2;col++){
             printf("%d ",mat2[row][col]);
         }
         printf("\n");
     }
     multiplication(rows, col1,col2, mat1, mat2);
    }   
}