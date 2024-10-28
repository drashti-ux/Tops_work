// Accept 3 numbers from user using while loop and check each numbers palindrome 

#include <stdio.h>
int main(){
    int num[3];
    int or_num[3];
    int rev[3] = {0,0,0};
    for(int i = 0 ;i < 3 ; i++){
        printf("Enter Number %d : ",i+1);
        scanf("%d",&num[i]);
        or_num[i] = num[i];
        for(num[i];num[i]>0;num[i]=num[i]/10){
        int reminder = num[i]%10;
        rev[i] = (rev[i] * 10 ) + reminder;
    }
    printf("Rev %d =%d\n",i+1,rev[i]);
    if(or_num[i] == rev[i]){
        printf("Palindrom.\n");
    }
    else{
        printf("Not Palindrom.\n");
    }
    }
    
}