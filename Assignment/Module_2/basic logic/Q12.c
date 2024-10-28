// Accept number of students from user. I need to give 5 apples to each student. How many apples are required?

#include <stdio.h>
int main(){
    int students;
    printf("Enter the number of students: ");
    scanf("%d",&students);
    int apples = 5;
    int req_apples = apples*students;
    printf("Apples are Required to give %d students are : %d",students,req_apples); 
}
