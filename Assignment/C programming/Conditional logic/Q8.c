// WAP to accept the height of a person in centimeters and categorize the person according to their height.

#include <stdio.h>
int main(){
    int height;
    printf("Enter your Height:");
    scanf("%d",&height);
    if(height<0){
        printf("Enter valid height!!");
    }
    else if(height<=150){
        printf("You Are Too Sort..");
    }
    else if(height >150 && height <= 160){
        printf("You Are Sort..");
    }
    else if(height >160 && height <= 170){
        printf("You Are Average..");
    }
    else if(height >170 && height <= 180){
        printf("You Are Tall..");
    }
    else{
        printf("You Are very Tall..");
    }
}