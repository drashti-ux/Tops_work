/* Write a C program to determine eligibility for admission to a professional course based on the following criteria
Eligibility Criteria : 
Marks in Maths >=65 and 
Marks in Phy >=55 and 
Marks in Chem>=50 and 
Total in all three subject >=190 or Total in Maths and Physics >=140 
--------------------------------------
Input the marks obtained in Physics :65 
Input the marks obtained in Chemistry :51 
Input the marks obtained in Mathematics :72 
Total marks of Maths, Physics and Chemistry :188 
Total marks of Maths and Physics : 137 
The candidate is not eligible.   */

#include<stdio.h>
int main(){
    float maths,physics,chemistry;
    printf("Enter Your Marks In Maths:");
    scanf("%f",&maths);
    printf("Enter Your Marks In Physics:");
    scanf("%f",&physics);
    printf("Enter Your Marks In Chemistry:");
    scanf("%f",&chemistry);
    float sum_all = maths + physics + chemistry;
    printf("Your Totle in All Subject is %.2f\n",sum_all);
    float sum_math_phy = maths + physics ;
    printf("Your Totle in Maths and Physics Subject is %.2f\n",sum_math_phy);
    if(maths >= 65 && physics >= 55 && chemistry >= 50 && (sum_all >= 190 || sum_math_phy >= 140)){
        printf("Congratulation!!..You Are Eligibile For Professional Cource Admission");
    }
    else{
        printf("Sorry!!..You Are Not Eligibile For Professional Cource Admission");
    }
}