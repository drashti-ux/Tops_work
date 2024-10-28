/*patterns:
1
1 0
1 0 1
1 0 1 0
1 0 1 0 1  */

#include<stdio.h>
int main(){
    for(int i = 1;i<=5;i++){
        for(int j = 1;j<=i;j++){
           if(j%2==0){
            printf("0 ");
           }
           else{
            printf("1 ");
           }
        }
        printf("\n");
    }
}

// A 
// B C 
// D E F 
// G H I J 
// K L M N O

#include<stdio.h>
int main(){
    char ch = 'A';
    for(int i = 1;i<=5;i++){
        for(int j = 1;j<=i;j++){
           printf("%c ",ch);
           ch++;
        }
        printf("\n");
    }
}

//         *
//       * * *
//     * * * * *
//   * * * * * * * 
// * * * * * * * * *

#include <stdio.h>
int main(){
    for(int row = 1 ; row <=5;row++ ){
        for(int col = 4 ; col >= row;col--){
            printf("  ");
        }
        for(int col=1;col<=row;col++){
            printf("* ");
        }
        for(int col = 1 ; col <= row-1;col++){
            printf("* ");
        }
        printf("\n");
    }
}

// *
// * *
// * * *
// * * * *
// * * * * *
// * * * *
// * * *
// * *
// *

#include <stdio.h>
int main(){
    for(int row = 1;row <= 5 ; row ++){
        for(int col = 1 ; col <= row ; col++){
            printf("* ");
        }
        printf("\n");
    }
    for(int row = 4;row >= 1 ; row --){
        for(int col = 1 ; col <= row ; col++){
            printf("* ");
        }
        printf("\n");
    }
}

// 1 
// 2 3 
// 4 5 6
// 7 8 9 10
// 11 12 13 14 15

#include<stdio.h>
int main(){
    int n = 1;
    for(int i = 1;i<=5;i++){
        for(int j = 1;j<=i;j++){
           printf("%d ",n);
           n++;
        }
        printf("\n");
    }
}


// A 
// A B
// A B C 
// A B C D 
// A B C D E 


#include <stdio.h>
int main(){
    for(int row = 1;row <= 5; row++){
        char ch = 'A';
        for(int col = 1;col <= row; col++){
            printf("%c",ch); 
            ch++; 
        }  
	    printf("\n"); 
    }
}

// 1  2  3  4  5  6  7  8  9  10
// 36 37 38 39 40 41 42 43 44 11
// 35 64 65 66 67 68 69 70 45 12
// 34 63 84 85 86 87 88 71 46 13
// 33 62 83 96 97 98 89 72 47 14
// 32 61 82 95 90 100 99 73 48 15
// 31 60 81 94 93 92 91 74 49 16
// 30 59 80 79 78 77 76 75 50 17
// 29 58 57 56 55 54 53 52 51 18
// 28 27 26 25 24 23 22 21 20 19
 

#include <stdio.h>
int main(){
    int size;
    int col = 0,row = 0;
    printf("Enter Size:");
    scanf("%d",&size);
    int end = size -1;
    int num = 1;
    int arr[size][size];
    for(row=0;row<=size/2;row++,end--){
    //for left to right
    for(col = row;col<=end;col++){
        arr[row][col] = num;
        num++;
    }
    // for top to bottom
    for(col = row+1;col<=end;col++){
        arr[col][end] = num;
        num++;
    }
    // for right to left
    for(col = end-1;col>=row;col--){
        arr[end][col] = num;
        num++;
    }
    // for bottom to top
    for(col = end -1;col>row;col--){
        arr[col][row] = num;
        num++;
    }
    }
    
    // for(col=end-1;col)
    for(row = 0;row < size ; row++){
        for(col = 0;col<size ; col++){
            printf("%d\t",arr[row][col]);
        }
        printf("\n");
    }
}