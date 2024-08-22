// Program of Armstrong Number in C Using For Loop & While Loop


// using for loop
#include <stdio.h>

int main() {
    int num;
    int real_num;
    printf("Enter The Number :");
    scanf("%d",&num);
    real_num= num;
    int cube;
    int summation = 0;
    for(num;num != 0;num=num/10){
       int reminder = num%10;
        cube = reminder * reminder * reminder; 
        summation += cube; 
    }
    if(summation == real_num){
        printf("%d is Armstrong Number\n",real_num);
    }
    else{
        printf("%d is Not Armstrong Number\n",real_num);
    }
    
    printf("%d",summation);
    return 0;
}



// using while loop

#include <stdio.h>

int main() {
    int num;
    int real_num;
    printf("Enter The Number :");
    scanf("%d",&num);
    real_num= num;
    int cube;
    int summation = 0;
    while(num != 0){
        int reminder = num%10;
        cube = reminder * reminder * reminder; 
        summation += cube;
        num = num/10;
    }
    if(summation == real_num){
        printf("%d is Armstrong Number\n",real_num);
    }
    else{
        printf("%d is Not Armstrong Number\n",real_num);
    }
    
    printf("%d",summation);
    return 0;
}

