// 1 + 2 + 3 + 4 + 5 + ... + n

#include <stdio.h>

int main() {
    int n;

    printf("Enter a number n: ");
    scanf("%d", &n);

    for (int i = 1; i <= n; i++) {
        if(i==n){
            printf("%d ",i);
        }
        else{
        printf("%d + ",i);
        }
    }
}