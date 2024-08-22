get string from the user : ToPS

Example: 
ToPS - 0010000
TeCh - 001001

#include<stdio.h>
#include <string.h>

int main(){
    char str[50];
    printf("Enter String:");
    fgets(str,sizeof(str),stdin);
    int len = strlen(str);
    // printf("%d",len);
    
    for(int i=0;i<len-1;i++){
        if(str[i]>='A' && str[i] <= 'Z'){
            printf("00");
        }
        else{
          if(str[i] >='a' && str[i] <= 'z'){
            printf("1");
            }
           else{
               printf("%c",str[i]);
           }
        } 
    }
}