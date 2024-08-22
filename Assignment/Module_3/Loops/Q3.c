// WAP to take 10 no. Input from user find out below values 
// a.  How many Even numbers are there 
// b.  How many odd numbers are there 
// c.  Sum of even numbers 
// d.  Sum of odd numbers

#include <stdio.h>
int main(){
    int even = 0 , odd = 0 ;
    int sum_even = 0,sum_odd = 0;
    int num;
    for(int i = 0 ; i <10 ; i++ ){
        printf("Enter Number %d: ", i+1);
        scanf("%d",&num);

        if(num%2 == 0){
            even++;
            sum_even += num; 
        }
        else{
            odd++;
            sum_odd += num;
        }
    }
    printf("\n\n\neven numbers are %d \n",even);
    printf("sum of even numbers %d \n",sum_even);
    printf("odd numbers are %d \n",odd);
    printf("sum of odd numbers %d \n",sum_odd);
}