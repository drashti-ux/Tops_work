//      1
//     1 1
//    1 2 1
//   1 3 3 1
//  1 4 6 4 1

#include <stdio.h>
int main(){
    int rows = 5;
    for (int i = 0; i < rows; i++) {
        // Printing leading spaces
        for (int j = 0; j < rows - i - 1; j++) {
            printf(" ");
        }
 
        int coefficient = 1; // Reset coefficient for each row

        for (int j = 0; j <= i; j++) {
            printf("%d ", coefficient);
            coefficient = coefficient * (i - j) / (j + 1); // Calculate the next coefficient
        } 
        printf("\n"); // Move to the next line after each row
    }
}