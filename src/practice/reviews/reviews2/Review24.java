package practice.reviews.reviews2;

public class Review24 {
    public static void main(String[] args) {
        int max = 9*9 ;
        int num = 0;
        for(int i=1;i<=9;i+=1) {
            for(int j=1;j<=9;j+=1) {
                System.out.print(i*j +"\t");
            }
            System.out.println("\n");
        }
    }
}
