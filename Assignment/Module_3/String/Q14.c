// Write a program in C to combine two strings manually

#include <stdio.h>

int main(){
    char str1[50],str2[50];
    printf("Enter First String:");
    fgets(str1,sizeof(str1),stdin);
    printf("Enter Second String:");
    fgets(str2,sizeof(str2),stdin);
    while (str1[i] != '\0' || str1[i] != '\n') {
        i++;
    }
    for(int j = 0 ; str2[j] != '\0';j++){
        str1[i]=str2[j];
        i++
    }
    printf("%s",str1);

}