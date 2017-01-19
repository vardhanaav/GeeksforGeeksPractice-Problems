/*
Given a Integer array A[] of n elements. Your task is to complete the function PalinArray. Which will return 1 if all the elements of the Array are palindrome otherwise it will return 0.

Input:
The first line of input contains an integer denoting the no of test cases. Then T test cases follow. Each test case contains two lines. The first line of input contains an integer n denoting the size of the arrays. In the second line are N space separated values of the array A[].

Output:
For each test case in a new line print the required result.

Constraints:
1<=T<=50
1<=n<=20
1<=A[]<=10000
*/
/*Complete the function below*/
int PalinArray(int a[], int n)
{  //add code here.
    for (int i=0; i<n; i++) {
        int copy = a[i];
    int ctr = 0;
    while (copy != 0){
        copy/=10;
        ctr++;
    }
    int arr[ctr];
    copy = a[i];
    int x = 0;
    while(copy != 0){
        arr[x] = copy%10;
        copy/=10;
        x=x+1;
    }
    for (int j=0; j<=ctr/2; j++) {
        if (arr[j] != arr[ctr-1-j]){
            return 0;
        }
    }
    
    }
    return 1;
}
