// (1)+ (1+2) + (1+2+3) + (1+2+3+4) + ... + (1+2+3+4+...+n) 

#include <stdio.h>

int main() {
    int n, sum = 0;
    printf("Enter the value of n: ");
    scanf("%d", &n);
    for (int i = 1; i <= n; i++) {
        printf("(");
        
        for (int j = 1; j <= i; j++) {
            sum += j;
            printf("%d", j);
            if (j < i) {
                printf("+");
            }
        }
        printf(")");
        if (i < n) {
            printf(" + ");
        }
    }
    printf("= %d\n", sum);
    return 0;
}
