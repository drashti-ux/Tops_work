// Accept 3 numbers from user using while loop and check each numbers palindrome 

#include <stdio.h>
int main(){
    int num[3];
    int rev[3] = {0,0,0};
    for(int i = 0 ;i < 3 ; i++){
        printf("Enter Number %d : ",i+1);
        scanf("%d",&num[i]);
        for(int j = num[i];num[i]>0;num[i]/10){
            int reminder = num[i]%10;
            rev[i] = (rev[i]*10)+reminder;
        }
        printf("Reverse %d = %d",i+1,rev[i]);
    }
}