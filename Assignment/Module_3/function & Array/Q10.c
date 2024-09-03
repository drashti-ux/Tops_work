// WAP to perform Palindrome number using for loop and function

// Online C compiler to run C program online
// WAP to perform Palindrome number using for loop and function

#include <stdio.h>

int main(){
    int num;
    printf("Enter number of which you want to check palindrom or not:");
    scanf("%d",&num);
    int origenal_num = num;
    int rev = 0;
    while(num != 0){
        int reminder = num%10;
        rev = rev*10+reminder;
        num = num/10;
    }
    printf("%d\n",rev);
    if(origenal_num == rev){
        printf("The Number is Palindrom");
    }
    else{
        printf("The Number is Not Palindrom");
    }
}