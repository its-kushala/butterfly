public class slant_starts {
    public static void main(String[] args) {
        int n=5;

        for(int i=1; i<=n; i++){
            //space
            for(int j=1; j<=n-i; j++) {
                System.out.print(" ");
            }
                //starts
                for(int j=1; j<=5; j++){
                    System.out.print("*");
            }
            System.out.println();
        }
    }
}
