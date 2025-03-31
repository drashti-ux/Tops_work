// Write a program in C to find the largest and smallest words in a string.

#include <stdio.h>
#include <string.h>
int main(){
    char sentence[100];
    char words[10][20];
    int i = 0,k=0,j=0;
    int min,max;
    int m=0,n=0;
    printf("Enter any Sentence:");
    gets(sentence);
   
    for( i = 0; sentence[i] != '\0';i++){
        if(sentence[i] != ' '){
            words[k][j] = sentence[i];
            j++;
        }
        else{
            words[k][j] ='\0';
            k++;
            j=0;
        }
    }
    words[k][j] = '\0';
    
    min =strlen(words[0]);
    max = strlen(words[0]);
    
    for(i = 0;i<=k;i++){
        if(min>strlen(words[i])){
            min = words[i];
            m = i;
        }
        if(max<strlen(words[i])){
            max = words[i];
            n = i;
        }
    }
    printf("The Largest Word In The Given Sentence is : %s",sentence[n]);
    printf("The Smallest Word In The Given Sentence is : %s",sentence[m]);
}