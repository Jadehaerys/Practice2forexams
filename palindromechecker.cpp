#include <stdio.h>
void palindromechecker(int arr1[], int n);
int main(){
int arr1[100];
int n;

printf("Enter the number of elements: ");
scanf("%d", &n);

for (int i = 0; i < n; i++)
{
    printf("Fill the array with elements:");
    scanf("%d", &arr1[i]);
}

palindromechecker(arr1,n);
}
void palindromechecker(int arr1[], int n){

int checker = 0;

for(int i = 0; i <= n / 2; i++){

if (arr1[i] != arr1[n-i-1])
{
    checker = 1;
    break;
}

} 

if (checker == 1){

printf("The number is not a palindrome");
}

else {
printf("The number is a palindrome");
}




}