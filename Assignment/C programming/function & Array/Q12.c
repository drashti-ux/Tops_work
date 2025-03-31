// WAP to accept 5 students name and store it in array 
#include <stdio.h>
int main(){
    char std_name[5][100];
    for(int i = 0; i<5; i++){
        printf("Enter Name %d:",i+1);
        scanf("%s",&std_name[i]);
    }
    for(int i = 0;i<5;i++){
        printf("%d %s\n",i+1,std_name[i]);
    }
}