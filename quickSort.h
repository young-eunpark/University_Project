#ifndef _QUICKSORT
#define _QUICKSORT

int partition(int A[],int p, int r)
{
    int x,i,j;
    x=A[r];
    i=p-1;
    for(j=p;j<=r-1;j++)
    {
        if(A[j]<=x)
        {
           i++;
           swap(&A[i],&A[j]);
        }
    }
    swap(&A[i+1],&A[r]);
    return i+1;
}
void quickSort(int A[], int p, int r)
{
    if(p<r)
    {
        int q = partition(A,p,r);
        quickSort(A,p,q-1);
        quickSort(A,q+1,r);
    }
}
#endif