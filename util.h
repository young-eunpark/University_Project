#ifndef _UTIL
#define _UTIL

#include <stdio.h>
#include <stdlib.h>
#include <time.h>

void makeRandom(int array[],int n)
{
    srand(time(NULL));
    for(int i=1;i<=n;i++)
    {
        array[i]=rand()%10000;
    }
}
void printArray(int array[],int n)
{
    for(int i=1;i<=n;i++)   printf("%4d, ",array[i]);
    printf("\n\n");
}
#endif