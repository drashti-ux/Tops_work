// Accept 5 names from user at run time.

#include <stdio.h>
int main(){
	int i;
	char name[50];
    for(i = 1;i<=5;i++){
        printf("Enter Name %d :",i);
        scanf("%s",name);
        printf("Name %d : %s \n",i,name);
    }
}