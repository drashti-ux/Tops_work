// Accept 5 numbers from user and find those numbers factorials


#include <stdio.h>
int main(){
    int num;
    for(int i = 1;i <= 5;i++){
        printf("Enter Num %d:",i);
        scanf("%d",&num);
        int factorial = 1;
        int j =1;
        while(j<= num){
            factorial *= j;
            j++;
        }
        printf("%d Factorial = %d\n",num,factorial);
    }
}