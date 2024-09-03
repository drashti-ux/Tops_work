// Write a program in C to read a sentence and replace lowercase characters with uppercase and vice versa.

#include <stdio.h>
#include <string.h>
int main(){
    char str[50];
    printf("Enter String:");
    fgets(str,sizeof(str),stdin);
    int len = strlen(str);
    for(int i = 0;i<len;i++){
        if(str[i] >= 'A' && str[i] <= 'Z'){
            str[i] = str[i] + 32;
        }
        else if(str[i] >= 'a' && str[i] <= 'z'){
            str[i] = str[i] - 32;
        }
        else{
            continue;
        }
    }
    printf("%s",str);
}