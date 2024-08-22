// WAP to print table up to given numbers 

#include <stdio.h>
int main(){
    int number;
    printf("Enter the number up to which you want the multiplication tables:");
    scanf("%d",&number);
    for(int i = 1; i<= number ; i++){
        printf("multiplication table for %d:\n",i);
        for(int j = 1;j<=10;j++){
            printf("%d * %d = %d\n",i,j,i*j);
        }
        printf("\n\n");
    }
}