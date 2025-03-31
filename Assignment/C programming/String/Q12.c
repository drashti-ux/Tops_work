//12.Write a program in C to find the number of times a given word 'is' appears in the given string.

#include <stdio.h>
#include <string.h>
int main() {
    char str[50];
    printf("Enter String :");
    fgets(str,sizeof(str),stdin);
int len = strlen(str);
int count = 0;
for(int i = 0; i<len;i++){
    if(str[i]=='i' && str[i+1] == 's'){
        count++;
    }
}
printf("%d",count);
    return 0;
}