// WAP to show 

// i. Monday to Sunday using switch case 

#include <stdio.h>
int main(){
    int week_number;
    printf("Enter The Week Number:");
    scanf("%d",&week_number);
    switch(week_number){
        case 1:{
            printf("%d.Monday",week_number);
            break;
        }
        case 2:{
            printf("%d.Tuesday",week_number);
            break;
        }
        case 3:{
            printf("%d.Wednesday",week_number);
            break;
        }
        case 4:{
            printf("%d.Thursday",week_number);
            break;
        }
        case 5:{
            printf("%d.Friday",week_number);
            break;
        }
        case 6:{
            printf("%d.Saturday",week_number);
            break;
        }
        case 7:{
            printf("%d.Sunday",week_number);
            break;
        }
        default:{
            printf("Enter Valid Week Number");
            break;
        }
    }

}

// ii. Vowel or Consonant using switch case

#include <stdio.h>
int main(){
    char ch;
    int cse = 0;
    printf("Enter Any Character:");
    scanf("%c",&ch);
    if(ch=='a'||ch=='A'||
    ch=='e'||ch=='E' ||
    ch=='i'||ch=='I' ||
    ch=='o'||ch=='O' ||
    ch=='u'||ch=='U'){
         cse = 1;
    }
    else{
        cse = 0;
    }
    switch(cse){
        case 1:{
            printf("%c is Vowel",ch);
            break;
        }
        default:{
            printf("%c is Consonant",ch);
            break;
        }
    }

}