// (1*1) + (2*2) + (3*3) + (4*4) + (5*5) + ... + (n*n)

#include<stdio.h>
int main(){
    int n;
    printf("Enter Number n:");
    scanf("%d",&n);
    sum = 0;
    for(int i = 1;i <= n; i++){
        if(i == n){
            printf("(%d * %d) = ",i,i);
            sum += (i*i);
        }
        else{
            printf("(%d * %d) + ",i,i);
            sum += (i*i);
        }
    }
    printf("%d",sum);
}
