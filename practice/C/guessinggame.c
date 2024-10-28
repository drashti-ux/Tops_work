// Guessing Game:

#include <stdio.h>
#include <stdlib.h>
#include <time.h>

int main(){
    
    int gussing_number;
    
    int play_again = 0;
    int flag = 1;
    int is_first_time = 1;
    int count = 0;
    int winning_number;
    srand(time(0));
     
        while(flag){
            if(is_first_time){
                count = 0;
                winning_number = rand() % 100;
                printf("%d\n",winning_number);
                printf("Guess Number:");
                scanf("%d",&gussing_number);
                is_first_time = 0;
                count++;
            }
            else{
                printf("Guess Again:");
                scanf("%d",&gussing_number);
            }
        
            if(gussing_number==winning_number){
                printf("Congratulations!!.You Win in %d try\n\n",count);

                flag = 0 ;

                printf("do you want to play again\n\n");
                printf("if yes press 1 else press 0: ");
                scanf("%d",&play_again);
            
                if(play_again){
                    flag = 1;
                    is_first_time = 1;
                
                }
            }
            else{
                if(gussing_number > winning_number){
                    printf("Too High..!\n\n");
                }
                else{
                    printf("too Low..!\n\n");
                }

                count++;
            }
        
        }
}