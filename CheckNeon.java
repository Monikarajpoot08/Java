// Program to check whether a number is neon or not
// eg: 9 , if sum of the digits of square of nine is equal to 9 then it will be a neon number
// square of [9]= 81 , 8+1= [9] 
// Neon numbers from 0-999 : 0,1,9
class CheckNeon{
    static boolean isNeon(int n){
        int sum=0, square=n*n;
        while(square>0)
        {
            sum = sum + square %10;
            square= square/10;
        }
        return sum==n;
    }

    public static void main(String[] args) {
        int n=7;
        if (isNeon(n))  
        {System.out.println("number is neon");

        }
        else{
            System.out.println("not a neon number");
        }
    }
}
