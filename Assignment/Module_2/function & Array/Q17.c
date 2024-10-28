// WAP to show difference between Structure and Union.

#include <stdio.h>
#include <string.h>

struct student{
    int std_id;
    char std_name[20];
    float tot_marks;
}stud;

union u_student {
    int std_id;
    char std_name[20];
    float tot_marks;
}u_stud;

int main(){
    printf("Enter Student Id:");
    scanf("%d",&stud.std_id);
    u_stud.std_id = stud.std_id;
    printf("Enter Student Name:");
    scanf("%s",&stud.std_name);
    strcpy(u_stud.std_name, stud.std_name);

    printf("Enter Student Marks:");
    scanf("%f",&stud.tot_marks);
    u_stud.tot_marks = stud.tot_marks;

    printf("Student Details using Structure \n");
    printf("Student Id:%d\n",stud.std_id);
    printf("Student Name:%s\n",stud.std_name);
    printf("Student Marks:%.2f \n",stud.tot_marks);

    printf("\nStudent Details using Union\n");
    printf("Student Id:%d\n",u_stud.std_id);
    printf("Student Name:%s\n",u_stud.std_name);
    printf("Student Marks:%.2f \n",u_stud.tot_marks);
}