// WAP to accept 5 students name and store it in array 
#include <stdio.h>
int main(){
    char std_name[100];
    for( i = 0; i<5; i++){
        printf("Enter Name %d:",i+1);
        scanf("%s",&std_name[i]);
    }
}