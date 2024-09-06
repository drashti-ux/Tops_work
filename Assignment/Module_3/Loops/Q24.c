// 1 + 2 + 3 + 4 + 5 + ... + n

#include <stdio.h>

int main() {
    int n;

    printf("Enter a number n: ");
    scanf("%d", &n);
int sum = 0;
    for (int i = 1; i <= n; i++) {
        if(i==n){
            printf("%d =",i);
            sum += i;
        }
        else{
        printf("%d + ",i);
        sum += i;
        }
    }
    printf("%d",sum);
}