// WAP Find out length of string without using inbuilt function

#include <stdio.h>

int main() {
   char string[50];
   printf("enter any string:");
   fgets(string,sizeof(string),stdin);
   int i =0;
   while(string[i] != '\0'){
       i++;
   }
   printf("length of string : %d",i-1);
}