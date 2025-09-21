import java.util.Scanner;
public class TrianglePattern {
    static void triangleStarPattern(int n){
        for(int i=1;i<=n;i++){//for spaces
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=2*i-1;j++){//for stars
                System.out.print("*");
            }
            System.out.println();


        }
        


    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value of n:");
        int n=sc.nextInt();
        triangleStarPattern(n);
    }
}
