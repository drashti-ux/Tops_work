// Accept marks from user and check pass or fail

#include <stdio.h>
int main(){
    int marks;
    printf("Enter Your Marks:");
    scanf("%d",&marks);
   if(marks<0 || marks >100) {
        printf("Enter Valid Marks..");
    }else if(marks>=35) {
        printf("Congratulations!..You Pass the Exam!!!");
    }
    else{
        printf("Sorry!..You Failed in Exam!!");
    }
}