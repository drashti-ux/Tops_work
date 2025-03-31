// Find the Character Is Vowel or Not

#include <stdio.h>
int main(){
    char ch;
    printf("Enter Any Character in  A-Z:");
    scanf("%c",&ch);
    if(ch=='A' ||ch=='a' ||ch=='E'|| ch=='e'|| ch=='I'||ch=='i' || ch=='O'|| ch=='o' || ch=='U' || ch=='u'){
        printf("the Charactor %c is Vowel",ch);
    }
    else{
        printf("the Charactor %c is Not Vowel",ch);
    }
}