// Write a C program to check whether a triangle can be formed with the given values for the angles.

int main(){
    int angle1,angle2,angle3;
    printf("Enter the value of angle 1:");
    scanf("%d",&angle1);
    printf("Enter the value of angle 2:");
    scanf("%d",&angle2);
    printf("Enter the value of angle 3:");
    scanf("%d",&angle3);
    int triangle = angle1 + angle2 + angle3 ;
    if(triangle == 180){
        printf("The angles form a triangle.");
    }
    else{
        printf("The angles Not form a triangle.");
    }
}