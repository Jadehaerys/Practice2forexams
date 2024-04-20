// Source code is decompiled from a .class file using FernFlower decompiler.
import java.util.Scanner;

public class practicearrayb {
   private int[][] arr;
   private int[][] arr2;
   private int[][] arr3;
   private int size;

   public practicearrayb(int[][] arr, int[][] arr2, int[][] arr3, int size) {
      this.arr = arr;
      this.size = size;
      this.arr2 = arr2;
      this.arr3 = arr3;
   }

   public int[][] getArr() {
      return this.arr;
   }

   public int getSize() {
      return this.size;
   }

   public int[][] getArr2() {
      return this.arr2;
   }

   public int[][] getArr3() {
      return this.arr3;
   }

   public void Display(Scanner sc) {
      int i;
      int j;
      for(i = 0; i < this.size; ++i) {
         for(j = 0; j < this.size; ++j) {
            System.out.print("[" + i + "][" + j + "]= ");
            this.getArr()[i][j] = sc.nextInt();
         }
      }

      for(i = 0; i < this.size; ++i) {
         for(j = 0; j < this.size; ++j) {
            this.getArr2()[i][j] = this.getArr()[i][j] * 2;
         }
      }

      for(i = 0; i < this.size; ++i) {
         for(j = 0; j < this.size; ++j) {
            this.getArr3()[i][j] = this.getArr()[i][j] * this.getArr2()[i][j];
         }
      }

      for(i = 0; i < this.size; ++i) {
         System.out.print("|");

         for(j = 0; j < this.size; ++j) {
            System.out.print(this.getArr()[i][j] + " ");
         }

         System.out.print("|");

         for(j = 0; j < this.size; ++j) {
            System.out.print(this.getArr2()[i][j] + " ");
         }

         System.out.println();
      }

      System.out.println("=");

      for(i = 0; i < this.size; ++i) {
         System.out.print("|");

         for(j = 0; j < this.size; ++j) {
            System.out.print(this.getArr3()[i][j] + " ");
         }

         System.out.print("\n");
      }

   }
}
