#include<stdio.h>


void Display(int iRow ,int iCol)
{
    int i = 0 , j = 0;
    for(i = 1 ; i <= 4 ;i++)
    {
        for(j = 1 ; j <=4 ;j++)
        {
            if (i % 2 != 0)
            {
                printf("*\t");
            }

            else
            {
                printf("%d\t",i);
            }
        }
        printf("\n");
    }
}

int main()
{
    int iValue1 = 0 , iValue2 = 0;
    printf("Enter no of row:\n");
    scanf("%d",&iValue1);

    printf("Enter no of Column:\n");
    scanf("%d",&iValue2);

    Display(iValue1,iValue2);
    return 0;
}