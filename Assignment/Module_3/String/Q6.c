// Write a program in C to count the total number of alphabets, digits and special characters in a string.

#include <stdio.h>
#include <string.h>
int main(){
    char str[100];
    printf("Enter String:");
    fgets(str,sizeof(str),stdin);
    int len = strlen(str);
    int alphabets = 0;
    int digits = 0;
    int spe_char = 0;
    for(int i = 0 ; str[i] != '\0' ;i++){
        if(str[i]>='a' && str[i]<='z' || str[i]>='A' && str[i]<='Z'){
            alphabets++;
        }
        else if(str[i] >= '0' && str[i] <= '9'){
            digits++;
        }
        else{
            spe_char++;
        }
    }
        printf("Alphabets : %d \nDigits : %d \nSpecial Character :%d ",alphabets,digits,spe_char);
}