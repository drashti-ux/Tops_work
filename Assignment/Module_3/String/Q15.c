// Write a program in C to find the largest and smallest words in a string.

#include<stdio.h>
#include<string.h>
int  main(){
    char str[100],sna[10][20];
    int i,j=0,k=0,m=0,n=0,max,min;
    printf("Enter any sentence:");
    gets(str);
    for(i=0;str[i]!='\0';i++){
        if(str[i]==' '){
            sna[k][j]='\0';
            k++;
            j=0;
        }
        else{
            sna[k][j]=str[i];
            j++;
        }
    }
    sna[k][j]='\0';
    max=strlen(sna[0]);
    min=strlen(sna[0]);
    for(i=0;i<=k;i++)
    {
        if(max<strlen(sna[i]))
        {
            m=i;
        }
        if(min>strlen(sna[i]))
        {
            n=i;
        }
    }
    printf("\nLargest word : %s \nsmallest word : %s",sna[m],sna[n]);
}