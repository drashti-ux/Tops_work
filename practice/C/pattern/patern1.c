// * 
// *
// * * * 
// *
// * * * * * 
// *
// * * * * * * * 
// *
// * * * * * * * * * 





#include <stdio.h>
int main(){
    for(int i=1;i < 10 ;i++){
        if(i%2==0){
               printf("* ");
            }
            else{
                for(int  j = 1;j<=i;j++){
                printf("* ");
            }
        }
        printf("\n");
    }
}




// * * * * * * * * * 
// *   *   *   *   * 
// * * *   *   *   * 
// *       *   *   * 
// * * * * *   *   * 
// *           *   * 
// * * * * * * *   * 
// *               * 
// * * * * * * * * *




#include <stdio.h>
int main(){
    int num=9;
    for(int row = 1;row<=num;row++){
        for(int col = 1;col<=row;col++){
            if(col==1){
                printf("* ");
                continue;
            }
            if(row%2==0){
                printf("  ");
            }
            else{
                printf("* ");
            }
        }
        for(int col = num-row;col>=1;col--){
            if(row==1){
                printf("* ");
                continue;
            }
            if(col%2==0){
                printf("  ");
            }
            else{
                printf("* ");
            }
        }
        printf("\n");
    }
    
}

// *	*	*	*	*	
// 	    *	 	 	 	*	
// 		    *	 	 	 	*	
// 			    *	 	 	 	*	
// 				    *	*	*	*	*	

                
#include <stdio.h>
void printTabs(int n) {
    for(int i = 0; i < n; i++) {
        printf("\t");
    }
}
int main(){
    int size =5;
    for(int i=1;i <= size ;i++){
        for(int j =1 ; j<=size ; j++){
            if(i==1 || i==size|| j==1 || j==size ){
                printf("*\t");
            }
            else{
                printf(" \t");
            }
        }
        printf("\n");
        printTabs(i); 
    }
   
}