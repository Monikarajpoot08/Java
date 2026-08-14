// Increasing Number Triangle Pattern
class Pattern {
    static void printNums(int n) {
        for (int i = 0; i < n; i++) {
            int num = 1;
            for (int j = 0; j <= i; j++) {
                System.out.print(num + " ");
                num++;
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        printNums(5);
    }
}