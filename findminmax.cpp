#include <stdio.h>
void getminmax(int arr1[], int n);
int main (){

int arr1[100];
int n;

printf("Enter the number of elements Sir: ");
scanf("%d", &n);

for (int i = 0; i < n; i++)
{
    printf("Elements%d: ", i+1);
    scanf("%d", &arr1[i]);
}

 getminmax(arr1,n);



}
void getminmax(int arr1[], int n){
int locatormin  = 0;
int locatormax = 0;
int max = arr1[0];
int min = arr1[0];

for (int i = 0; i < n; i++)
{
    if (arr1[i] > max){
        max = arr1[i];
        locatormax = i + 1;
    }
    if(arr1[i] < min){
        min = arr1[i];
        locatormin = i + 1;
    }

}
printf("The maximum number is: %d\n", max);
printf("The location of the max number is at index: %d\n", locatormax);
printf("The minimum number is: %d\n", min);
printf("The location of the min number is at index: %d", locatormin);

}
