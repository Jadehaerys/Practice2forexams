#include <stdio.h>

int main(){
int n;
int number;
int flag = 0;
int isPrime = 1;
do
{
 printf("Enter an integer: ");
scanf("%d", &number);
} while (number <= 0);

printf("-------------Menu---------\n 1. odd\n 2. even\n 3. prime\n 4. exit program");
printf("\n Enter your choice: ");
scanf("%d", &n);


switch (n)
{
case 1:
 printf("Odd Numbers of the integer are: ");
    for (int i = 0; i <= number; i++){
        if (i % 2 != 0){
            printf("%d ", i);
        }
    }
    break;
case 2:
 printf("EvenNumbers of the integer are: ");
    for (int i = 0; i <= number; i++){
        if (i % 2 == 0){
            printf("%d ", i);
        }
    }
    break;

    case 3:
 printf("Prime numbers of the integer are: ");
  if (number > 1){
    for (int i = 2; i <= number; i++){
        for (int j = 2; j < i; j++){
            if (i % j == 0){
                isPrime = 0;
                break;
            }
        }
        if (isPrime == 1){
            printf("%d ", i);
        }
        isPrime = 1;
    }
  }
  break;


case 4:
    printf("Exiting...");
    break;
}

}