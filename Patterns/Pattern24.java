public class Pattern24 {
    public static void main(String args[]) {
        int n=5;
        for(int i=1;i<=n;i++) {
            for(int j=0;j<n-i;j++) {
                System.out.print(" ");
            }
            for(int j=0;j<i;j++) {
                System.out.print((char)('A'+j)+" ");
            }
            System.out.println();
        }
        for(int i=n-1;i>=1;i--) {
            for(int j=0;j<n-i;j++) {
                System.out.print(" ");
            }
            for(int j=0;j<i;j++) {
                System.out.print((char)('A'+j)+" ");
            }
            System.out.println();
        }
    }
}
