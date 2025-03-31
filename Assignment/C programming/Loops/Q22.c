// Accept 3 numbers from user using while loop and check each numbers palindrome 

#include <stdio.h>
int main(){
    int num[3];
    int rev[3] = {0,0,0};
    int i = 0;
    while(i<3){
        printf("Enter Number %d : ",i+1);
        scanf("%d",&num[i]);
        int j = num[i];
        while(j>0){
            int reminder = j%10;
            rev[i] = (rev[i]*10)+reminder;
            j /= 10; 
        }
        printf("Reverse %d = %d\n",i+1,rev[i]);
        i++;
    }
}