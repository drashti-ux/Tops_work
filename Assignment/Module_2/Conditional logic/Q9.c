// C Program to Check Uppercase or Lowercase or Digit or Special Character

#include<stdio.h>
int main(){
    char ch;
    printf("Enter Any Character:");
    scanf("%c",&ch);
    if(ch>='a' && ch<='z'){
        printf("The Charactor %c is in Lower Case",ch);
    }
    else if(ch>='A' && ch<='Z'){
        printf("The Charactor %c is in Upper Case",ch);
    }
    else if(ch>='0' && ch<='9'){
        printf("The Charactor %c is Digit",ch);
    }
    else{
        printf("The Charactor %c is Special Charactor",ch);
    }
}