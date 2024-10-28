// WAP to print Fibonacci series up to given numbers

#include <stdio.h>
int main(){
    int first =0;
    int second = 1;
    int num;
    printf("Enter The Number of terms you wish to calculate in the Fibonacci sequence:");
    scanf("%d",&num);
    if(num<0){
        printf("factorial is defined only for non-negative integers\n");
    }
        for(int i = 1 ;i <= num ; i++){
            if(i==1){
            printf("%d ",first);
            continue;
            }
            if(i == 2){
            printf("%d ", second);
            continue;
            }
            if(i > 2){
                int next = first + second;
                printf("%d ",next);
                first = second;
                second = next;
            }
        }
}