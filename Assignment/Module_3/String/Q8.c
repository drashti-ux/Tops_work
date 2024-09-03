// Write a program in C to count the total number of vowels or consonants in a string

#include <stdio.h>
int main(){
    char str[20];
    printf("Enter String:");
    fgets(str,sizeof(str),stdin);
    int vowel = 0;
    int consonantes = 0;
    for(int i = 0;str[i]!='\0';i++){
        if(str[i] == 'A' || str[i] == 'a' ||
        str[i] == 'E' || str[i] == 'e' ||
        str[i] == 'I' || str[i] == 'i' ||
        str[i] == 'O' || str[i] == 'o' ||
        str[i] == 'U' || str[i] == 'u'){
            vowel++;
        }
        else{
            consonantes++;
        }
    }
    printf("Vowels: %d \nConsonantes: %d",vowel,consonantes);
}