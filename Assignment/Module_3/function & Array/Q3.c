// WAP to find reverse of string using recursion

#include <stdio.h>
#include<string.h>
void reverse(char str[],int start_idx,int end_idx){
    if(start_idx>=end_idx){
        return;
    }
    else{
        char temp = str[start_idx];
         str[start_idx] = str[end_idx];
         str[end_idx] = temp;
         reverse(str,start_idx+1,end_idx-1);
    }
}
int main(){
    char str[50];
    printf("Enter String:");
    fgets(str,sizeof(str),stdin);
    int len = strlen(str);
    reverse(str,0,len-1);
    printf("%s",str);
    return 0;
}