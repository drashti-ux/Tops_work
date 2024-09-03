// (1)+ (1+2) + (1+2+3) + (1+2+3+4) + ... + (1+2+3+4+...+n) 

#include <stdio.h>
void series(int num){
    if(num == 1){
        printf("(%d)+",num);
    }
    else{
        printf("(%d +)",series(num-1));
    }
}
int main(){
    int num;
    printf("Enter Number :");
    scanf("%d",&num);
    series(num);
}