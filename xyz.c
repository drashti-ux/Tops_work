#include<stdio.h>
#include<math.h>
int main(){
    int num;
    printf("enter number:");
    scanf("%d",&num);
    int n_power2 = pow(num,2);
    int n_power3 = pow(num,3);
    printf("first three powers of %d is %d,%d,%d",num,num,n_power2,n_power3);
}
