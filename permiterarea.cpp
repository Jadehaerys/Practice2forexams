#include <stdio.h>

int peremiter (int a);
int area (int a, int b);
void sumofperemeterarea  (int a, int b);    
int main(){
    int sides;
    int height;
    int base;
    printf("Enter the value of the sides: ");
    scanf("%d", &sides);
    printf("Enter the height: ");
    scanf("%d", &height);
    printf("Enter the base: ");
    scanf("%d", &base);
   int x = peremiter (sides);
   int y = area (base, height);
   printf("The Perimeter is: %d\n", peremiter (sides));
   printf("The Area is: %d\n", area (base, height));
   sumofperemeterarea (x, y);

}
int peremiter (int a){
    return a * 3;
}
int area (int a, int b){
    return 0.5 * (a * b);
}
void sumofperemeterarea (int a, int b){
    int sum = a + b;
    printf("The sum of area and peremiter divisible by 5 are: ");
    for (int i = 1; i < sum; i++)
    {
        if(i % 5 == 0){
            printf("%d ", i);
        }
    }
    
}
