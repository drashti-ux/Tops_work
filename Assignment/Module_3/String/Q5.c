// Write a program in C to compare two strings without using string library functions.
#include <stdio.h>
#include <string.h>
int main(){
    char str1[50];
    char str2[50];
    printf("Enter String 1:");
    fgets(str1,sizeof(str1),stdin);
    printf("Enter String 2:");
    fgets(str2,sizeof(str2),stdin);
    int len1 = strlen(str1);
    int len2 = strlen(str2);
    int minLen = len1 < len2 ? len1 : len2;
    str1[strcspn(str1, "\n")] = '\0';
    str2[strcspn(str2, "\n")] = '\0';
    int res;
    for(int i = 0;i<minLen;i++){
        if(str1[i] == str2[i]){
            res = str1[i] - str2[i];
            continue;
        }
        else{
            res = str1[i] - str2[i];
            break;
        }
    }
    
    printf("%d",res);
}


// // Write a program in C to compare two strings without using string library functions.
// #include <stdio.h>

// int main(){
//     char str1[50];
//     char str2[50];
//     printf("Enter String 1:");
//     fgets(str1,sizeof(str1),stdin);
//     printf("Enter String 2:");
//     fgets(str2,sizeof(str2),stdin);
//     int len1 =0;
//     while(str1[len1] != '\0'){
//         if(str1[len1] != '\n'){
//             str1[len1] = '\0';
//         break;
//         }
//         len1++;
//     }
//     int len2 =0 ;
//     while(str1[len2] != '\0'){
//         if(str1[len2] != '\n'){
//             str1[len2] = '\0';
//             break;
//         }
//         len2++;
//     }
    
//     int minLen = len1 < len2 ? len1 : len2;
//     int res;
//     for(int i = 0;i<minLen;i++){
//         if(str1[i] == str2[i]){
//             res = str1[i] - str2[i];
//             continue;
//         }
//         else{
//             res = str1[i] - str2[i];
//             break;
//         }
//     }
    
//     printf("%d",res);
// }