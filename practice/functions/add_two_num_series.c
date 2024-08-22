// (1 + 2) + (2 + 3) + ..... + (n + n+1);

##include<stdio.h>
int addition(int num){
    int sum;
    if(num==1){
        printf("(%d+%d)=",num,num+1);
        sum = (num + (num+1));
        return sum;
    }
    else{
        printf("(%d+%d)+",num,num+1);
        sum = addition(num-1)+(num+(num+1));
        return sum;
    }
}
int main(){
    int number;
    printf("Enter number :");
    scanf("%d",&number);
    printf("%d",addition(number));
}