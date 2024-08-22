// Task - 3]
//  - get two string from the user :
//     - insert
//     - delete
//     - update
// Example:
// 1 Python
// 2 PHP
// 1 + 1 + 3 = 5

// Example:
// 1 java
// 2 python
// 1+1+1+1+2 = 6

#include <stdio.h>
#include <string.h>

int main(){
    char str1[50],str2[50];
    int steps;
    int insert = 0,update =0,delte =0;
        printf("Enetr String 1:");
        fgets(str1,sizeof(str1),stdin);
        printf("%s",str1);
        int str1_len = strlen(str1)-1;
        printf("str1_len :%d\n",str1_len);
        printf("Enetr String 2:");
        fgets(str2,sizeof(str2),stdin);
        printf("%s",str2);
        int str2_len = strlen(str2)-1;
        printf("str2_len :%d \n",str2_len);
        
        if(str1_len == str2_len){
            delte = 0;
            insert = 0;
        }
        else {
            if(str1_len > str2_len){
                delte = str1_len - str2_len;
                printf("delete:%d\n",delte);
            }
            else{
                insert = str2_len - str1_len;
                printf("insert:%d\n",insert);
            }
            
        }
       for(int i = 0;i < str1_len;i++){
           if(str1[i] != str2[i]){
               update++;
               printf("update: %d \n",update);
           }
       }
       
       steps = update + insert + delte;
       printf("steps:%d",steps);
}
