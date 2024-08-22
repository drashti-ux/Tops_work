// WAP program to print below output using for loop   
// 01 02 03 04 05 06 07 08 09 10   
// 11 12 13 14 15 16 17 18 19 20   
// ..............   
// ..............   
// 41 42 43 44 45 46 47 48 49 50

#include <stdio.h>
int main(){
    int num = 01;
    for(int row =1 ; row <=5 ; row++){
        for(int col =1 ; col <=10 ; col++){
        printf("%.2d ",num);
        num++;
    }
    printf("\n");
    }
}