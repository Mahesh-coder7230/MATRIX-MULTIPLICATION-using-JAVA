import java.util.Scanner;
public class matrix{
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("ENTER ROW OF FIRST MATRIX");
    int rowA= sc.nextInt();
     System.out.print("ENTER cols OF FIRST MATRIX");
    int colsA= sc.nextInt();

    System.out.print("ENTER ROW OF SECOND MATRIX");
    int rowB= sc.nextInt();
     System.out.print("ENTER cols OF SECOND MATRIX");
    int colsB= sc.nextInt();

    int[][] A= new int[rowA][colsA];
    for(int i=0;i<rowA;i++){
        for(int j=0;j<colsA;j++){
            System.out.print("Enter The elements:");
            A[i][j]=sc.nextInt();
        }
    }


    int[][] B= new int[rowB][colsB];
    for(int i=0;i<rowB;i++){
        for(int j=0;j<colsB;j++){
            System.out.println("Enter The elements:");
            B[i][j]=sc.nextInt();
        }
    }
    int[][] C= new int[rowA][colsB];
    for(int i=0;i<rowA;i++){
        for(int j=0;j<colsB;j++){
       for(int k=0;k<colsA;k++){
        C[i][j]=C[i][j]+A[i][k]*B[k][j];
       }
        }
   }
   for(int i=0;i<rowA;i++){
        for(int j=0;j<colsB;j++){
   System.out.print(C[i][j] +" ");
   }
   System.out.println();
}
   }
}