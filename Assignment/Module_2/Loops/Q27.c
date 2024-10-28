// 27. 1/2 - 2/3 + 3/4 - 4/5 + 5/6 .......... n  
  
#include <stdio.h>
int main(){
    int num;
    printf("Enter Number in Length of series:");
    scanf("%d",&num);
    for(int i = 1;i<=num;i++){
        if(i==num){
            printf("%d/%d ",i,i+1);
        }
        else if(i%2==0){
            printf("%d/%d + ",i,i+1);
        }
        else{
            printf("%d/%d - ",i,i+1);
        }
    }
}