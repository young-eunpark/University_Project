#ifndef _SELECTIONSORT
#define _SELECTIONSORT
void swap(int *a, int *b)
{
    int temp;
    temp=*a;
    *a=*b;
    *b=temp;
}
int theLargest(int A[], int last)
{
    int largest = 1;
    for(int i=2; i<=last;i++)
    {
        if(A[i]>A[largest]) largest=i;
    }
    return largest;
}

void selectionSort(int A[], int n)
{
    int k;
    for(int last=n;last>1;last--)
    {
        k=theLargest(A, last);
        swap(&A[k],&A[last]);
    }
    
}
#endif
