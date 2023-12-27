#include <stdio.h>
int area (int a, int b, int c);
int perimeter (int a, int b);
void display(int a, int b);
int main(void){
    int a,b,c;


    printf("Enter a number Sir: ");
    scanf("%d", &a);
    printf("Enter a number Sir: ");
    scanf("%d", &b);
    printf("Enter a number Sir: ");
    scanf("%d", &c);
    int x = area (a,b,c);
    int y = perimeter (a,b);
    printf("The Area is: %d\n", area (a,b,c));
    printf("The Perimeter is: %d\n", perimeter (a,b));
    display(x, y);

}


int area (int a, int b, int c ){

    return a + b + c;
}

int perimeter (int a, int b){

    return  0.5 * (a * b);
}

void display(int a, int b){
int sum = a + b;
printf("Displayed: ");
for(int i = sum; i >= 1; i--){
    if (i % 5 == 0){
    printf("%d ", i);
    }
}
}
