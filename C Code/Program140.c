#include<stdio.h>

int CountSmall(char *str)
{
    int iCnt = 0;

    while(*str != '\0')
    {
        if ((*str >= 'A') && (*str <= 'Z'))
        {
            iCnt++;
        }
        str++;
    }

    return iCnt;

}


int main()
{
    char Arr[10];
    int iRet = 0;

    printf("Please enter the string:\n");
    scanf("%[^'\n']s",Arr);

    iRet = CountSmall(Arr);

    printf("Frequency of Captial letters :%d\n",iRet);
    
    return 0;
}