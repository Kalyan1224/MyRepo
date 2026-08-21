public class Pattern17 {
    public static  void main(String args[]) {
        int n=4;
        int num=1;
        for(int i=1;i<=n;i++) {
            for(int j=1;j<=n;j++) {
                System.out.print(num++);
                if(j<n) {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }//16 13 12 11
}
