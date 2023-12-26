#include <stdio.h>

int main() {
    int column, row, j, i;
    int arr[100][100];

    printf("Enter the number of rows: ");
    scanf("%d", &row);
    printf("Enter the number of columns: ");
    scanf("%d", &column);

    for (int i = 1; i <= row; i++) {

        for (int j = 1; j <= column; j++) {
            arr[i][j] = i * j;
            printf("%d ", arr[i][j]);
        }

       printf("\n"); 
    }

    return 0;
}