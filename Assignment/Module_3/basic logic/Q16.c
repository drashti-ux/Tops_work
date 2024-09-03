// Convert country’s name in abbreviate form

#include <stdio.h>
#include <string.h>

void abbrevation(char str[50]){
    int len = strlen(str);
    int word_first_later = 1;
    for(int i = 0 ; i<=len-1;i++){
        if(word_first_later){
            if(str[i]>='A' && str[i]<='Z'){
                printf("%c.",str[i]);
            }
            else if(str[i]>='a' && str[i]<='z'){
                printf("%c.",str[i]-32);
            }else{
                continue;
            }
            word_first_later = 0;
        }
        else if(str[i]==' '){
            word_first_later = 1;
        }
        else{
            continue;
        }
    }
}
 int main(){
     char sch_name[50];
     printf("Enter Country Name:");
     fgets(sch_name,sizeof(sch_name),stdin);
     abbrevation(sch_name);
 }