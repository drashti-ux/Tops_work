//  Find character value from ascii

#include <stdio.h>
int main(){
    int ascii;
    printf("Enter Any Ascii Value:");
    scanf("%d",&ascii);

    if(ascii < 0 || ascii >255 ){
        printf("Enter Valid Ascii Value");
    }
    else{
        printf("%c",ascii);
    }
}