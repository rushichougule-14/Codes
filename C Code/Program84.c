#include<stdio.h>
#include<stdlib.h>

void DispalyReverse(int Arr[], int iSize)   // 5
{
    int iCnt = 0;
    for (iCnt = iSize -1 ;iCnt >=0 ;iCnt--)
    {
        printf("%d\t",Arr[iCnt]);
    }
}

int main()
{
    int *ptr = NULL;
    int iLength = 0, i = 0;

    printf("Enter number of elements : \n");    // 1
    scanf("%d",&iLength);

    ptr = (int *)malloc(sizeof(int) * iLength); // 2

    printf("Enter the elements : \n");      // 3
    for(i = 0; i < iLength; i++)
    {
       scanf("%d",&ptr[i]); 
    }


    printf("Elements in Reverese order\n");
    
    DispalyReverse(ptr,iLength);   // 4

    //printf("Maximum number is : %d\n",iRet);

    free(ptr);      // 6

    return 0;
}