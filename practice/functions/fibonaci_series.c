// fibonaci series :0 1 1 2 3 5 8 13 ...

#include<stdio.h>
int fibonaci(int num){
   if(num == 0){
    int first = 0;
    return first;
   }
   else if (num == 1){
    int second = 1;
    return second;
   }
   else {
    int next;
    next = fibonaci(num - 1) + fibonaci(num - 2);
    return next;
   }
}
int main(){
    int n;
    printf(" the number of terms you wish to calculate in the Fibonacci sequence:");
    scanf("%d",n);
    for(int i = 0;i<n;i++){
        printf("%d ",fibonaci(i));
    }
}