
package Sarmal_Kare_Olusturma;          //SARMAL SAYILARLA KARE OLUSTURMA
import java.util.Scanner;
 
public class Sarmal_Kare_Olusturma {

    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Kare matrisin boyutunu girin (N): ");
        int n = scanner.nextInt();
        
        int[][] matrix = new int[n][n];
        
        int left = 0, right = n - 1;
        int top = 0, bottom = n - 1;
        int num = 1;

        while (left <= right && top <= bottom) {
            // Üst satırı soldan sağa doldur
            for (int i = left; i <= right; i++) {
                matrix[top][i] = num++;
            }
            top++;

            // Sağ sütunu yukarıdan aşağıya doldur
            for (int i = top; i <= bottom; i++) {
                matrix[i][right] = num++;
            }
            right--;

            // Alt satırı sağdan sola doldur
            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    matrix[bottom][i] = num++;
                }
                bottom--;
            }

            // Sol sütunu aşağıdan yukarıya doldur
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    matrix[i][left] = num++;
                }
                left++;
            }
        }

        // Matrisi ekrana yazdır
        System.out.println("Sarmal matris:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }

        scanner.close();
        
    }
    
}
