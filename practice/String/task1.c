//  get string from the user: "PythON CodE"

// Create a functions for:
// - convert the string to lowercase: "python code"                 ---done
// - convert the string to uppercase: "PYTHON CODE"                 ---done
// - Convert the string to swapcase: "pYTHon cODe"                  ---done 
// - Convert the string to titlecase: "Python Code"                 
// - Convert the string to capitalizeCase: "Python code"            ---done
// - count the number of vowels in the string: _                    ---done
// - count the number of consonates in the string: _                ---done
// - count the number of digits in the string: _                    ---done
// - count the number of spaces in the string: _                    ---done
// - count the number of punctuation(special character) in the string: _        ---done      
// - count the number of words in the string: _                    ---done             
// - count the number of characters in the string: _               ---done


#include <stdio.h>
#include <string.h>
void lowercase(char string[]){
    int len = strlen(string);
    printf("Lowercase:");
    for(int i = 0 ;i<len-1;i++){
        if(string[i] >= 'A' && string[i] <='Z' ){
            printf("%c",string[i]+ 32);
            continue;
        }
        else{
            printf("%c",string[i]);
            
        }
    }
    printf("\n\n");
}

void uppercase(char string[]){
    int len = strlen(string);
    printf("Uppercase:");
    for(int i = 0 ;i<len-1;i++){
        if(string[i] >= 'a' && string[i] <='z' ){
            printf("%c",string[i]- 32);
            continue;
        }
        else{
            printf("%c",string[i]);
        }
    }
    printf("\n\n");
}
void swapcase(char string[]){
    int len = strlen(string);
    printf("Swapcase:");
    for(int i = 0 ;i<len-1;i++){
        if(string[i] >= 'A' && string[i] <='Z' ){
            printf("%c",string[i]+ 32);
            continue;
        }
        else if(string[i] >= 'a' && string[i] <='z'){
            printf("%c",string[i]- 32);
        }
        else{
            printf("%c",string[i]);
        }
    }
    printf("\n\n");
}
void titlecase(char string[]) {
    int is_new_word = 1;
    printf("titlecase:");
    for (int i = 0; string[i] != '\0'; i++) {
        if (string[i] == ' ') {
            is_new_word = 1;
        } 
        if (is_new_word) {
            if (string[i] >= 'a' && string[i] <= 'z') {
                string[i] = string[i] - 32;
            }
            is_new_word = 0;
        } else {
            if (string[i] >= 'A' && string[i] <= 'Z') {
                string[i] = string[i] + 32;
            }
        }
    }
    printf("%s\n", string);
}
void capitalizecase(char string[]){
    int len = strlen(string);
    printf("capitalizecase:");
    for(int i = 0 ;i<len-1;i++){
       if(i==0){
           if(string[i] >= 'A' && string[i] <= 'Z'){
               printf("%c",string[i]);
           }
           else{
               printf("%c",string[i]- 32);
           }
       }
       else{
           if(string[i] >= 'A' && string[i] <= 'Z'){
               printf("%c",string[i]+ 32);
           }
           else{
               printf("%c",string[i]);
           }
       }
    }
    printf("\n\n");
}
int vowels(char string[]){
   int len = strlen(string); 
   int count = 0;
    for(int i = 0 ;i<len-1;i++){
        if(string[i] == 'A'|| string[i] == 'E' || string[i] == 'I' || string[i] == 'O' || string[i] == 'U' || string[i] == 'a' || string[i] == 'e' || string[i] == 'i' || string[i] == 'o' || string[i] == 'u'){
        count++;       
        }
    }
    return count;
}
int consonates(char string[]){
   int len = strlen(string); 
   int count = 0;
    for(int i = 0 ;i<len-1;i++){
        if(string[i] == 'A'|| string[i] == 'E' || string[i] == 'I' || string[i] == 'O' || string[i] == 'U' || string[i] == 'a' || string[i] == 'e' || string[i] == 'i' || string[i] == 'o' || string[i] == 'u' || string[i] == ' '){
        continue;       
        }
        else if(string[i] >= '0' && string[i] <= '9'){
            continue;
        }
        else{
            count++;
        }
    }
    return count;
}
int digits(char string[]){
    int len = strlen(string);
    int count;
    for(int i = 0 ;i<len-1;i++){
        if(string[i] >= '0' && string[i] <='9' ){
            count++;
        }
    }
    return count;
}
int space(char string[]){
    int len = strlen(string);
    int count;
    for(int i = 0 ;i<len-1;i++){
        if(string[i] == ' '){
            count++;
        }
    }
    return count;
}
int specialchar(char string[]){
   int len = strlen(string); 
   int count = 0;
    for(int i = 0 ;i<len-1;i++){
        if((string[i] >= 'a' && string[i] <= 'z') || (string[i] >= 'A' && string[i] <= 'Z' )){
            continue;
        }
        else if (string[i] >= '0' && string[i] <= '9'){
            continue;
        }
        else if(string[i] == ' '){
            continue;
        }
        else{
            count ++;
        }
    }
    return count;
}
int character(char string[]){
    int len = strlen(string);
    int count;
    for(int i = 0 ;i<len-1;i++){
        if(string[i] >= 'A' && string[i] <= 'Z' || string[i] >= 'a' && string[i] <= 'z'){
            count++;
        }
    }
    return count;
}

int words(char string[]) {
    int count = 0, in_word = 0;
    int len = strlen(string);
    for (int i = 0; i <len-1; i++) {
        if (string[i] == ' ') {
            in_word = 0;
        } else if (!in_word) {
            in_word = 1;
            count++;
        }
    }
    return count;
}

int main(){
    char str[50];
    printf("Enter Any String:");
    fgets(str,sizeof(str),stdin);
    printf("%s",str);
    int act;
    
    printf("1.convert the string to lowercase\n");
    printf("2.convert the string to uppercase\n");
    printf("3.Convert the string to swapcase\n");
    printf("4.Convert the string to titlecase\n");
    printf("5.Convert the string to capitalizeCase\n");
    printf("6.count the number of vowels in the string\n");
    printf("7.count the number of consonates in the string\n");
    printf("8.count the number of digits in the string\n");
    printf("9.count the number of spaces in the string\n");
    printf("10.count the number of punctuation(special character) in the string\n");
    printf("11.count the number of words in the string\n");
    printf("12.count the number of characters in the string\n");
 
printf("Enter Which Action You Want To Perform With This String:");
    scanf("%d",&act);
    switch(act){
        case 1:{
            lowercase(str);
            break;
        }
        case 2:{
            uppercase(str);
            break;
        }
        case 3:{
            swapcase(str);
            break;
        }
        case 4:{
            titlecase(str);
            break;
        }
        case 5:{
            capitalizecase(str);
            break;
        }
        case 6:{
            printf("vowels: %d",vowels(str));
            break;
        }
        case 7:{
            printf("consonates: %d",consonates(str));
            break;
        }
        case 8:{
            printf("digits : %d" ,digits(str));
            break;
        }
        case 9:{
            printf("space : %d" ,space(str));
            break;
        }
        case 10:{
            printf("special charactor : %d" ,specialchar(str));
            break;
        }
        case 11:{
            printf("character:%d",character(str));
            break;
        }
        case 12:{
            printf("words:%d",words(str));
            break;
        }
    }
}

