// 1 + 2 + 3 + 4 +.....+n

#include <stdio.h>
int addition(int num){
    int add;
    if(num == 1){
        printf("%d = ",num);
        add = num;
        return add;
    }
    else{
printf("%d + ",num);
add = num + addition(num-1);
    }
}
int main(){
    int n;
    printf("Enter Value of N:");
    scanf("%d",&n);
    printf("%d",addition(n));
}