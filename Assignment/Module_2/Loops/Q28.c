//  1 2 3 6 9 18 27 54... 

#include <stdio.h>
int main(){
    int num;
    printf("Enter Number Of Terms You Want:");
    scanf("%d",&num);
    int first = 1,second = 2,next;
   for(int i=0;i<=num;i++){
       if(i==1){
           printf("%d ",first);
           continue;
       }
       if(i==2){
           printf("%d ",second);
           continue;
       }
       if(i>2){
           if(i%2==0){
               next = second * 2;
           }
           else{
               next = first + second;
           }
           printf("%d ",next);
           first = second;
           second = next;
       }
       }
}