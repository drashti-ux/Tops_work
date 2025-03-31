// Write a program of structure employee that provides the following 
// a. information -print and display empno, empname, address and age 

#include <stdio.h>
struct employee{
    int empno;
    char empname[50];
    char address[50];
    int age;
};
int main(){
    struct employee emp;
    printf("Enter Employee Id:");
    scanf("%d",&emp.empno);
    printf("Enter Employee Name:");
    scanf("%s",&emp.empname);
    printf("Enter Employee Address :");
    scanf("%s",&emp.address);
    printf("Enter Employee Age:");
    scanf("%d",&emp.age);
    
    printf("Employee Details \n");
    printf("Employee Id :%d",emp.empno);
    printf("Employee Name :%s",emp.empname);
    printf("Employee Address :%s",emp.address);
    printf("Employee Age :%d",emp.age);

}

// b. Write a program of structure for five employee that provides the following information -print and display empno, empname, address andage .

#include <stdio.h>
struct employee{
    int empno;
    char empname[50];
    char address[50];
    int age;
};
int main(){
    struct employee emp[5];
    for(int i = 0; i<5;i++){
        printf("Employee %d\n",i+1);
        printf("Enter Employee Id:");
        scanf("%d",&emp[i].empno);
        printf("Enter Employee Name:");
        scanf("%s",&emp[i].empname);
        printf("Enter Employee Address :");
        scanf("%s",&emp[i].address);
        printf("Enter Employee Age:");
        scanf("%d",&emp[i].age);
    }
    for(int i = 0; i<5;i++){
        printf("\nEmployee Details %d\n",i+1);
        printf("Employee Id :%d\n",emp[i].empno);
        printf("Employee Name :%s\n",emp[i].empname);
        printf("Employee Address :%s\n",emp[i].address);
        printf("Employee Age :%d\n",emp[i].age);
    }  

}


