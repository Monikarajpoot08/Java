//Program to calculate total no. of odd and even numbers in an array
class OddEven{
    public static void main(String [] args)
    {
        int num[]={13,45,66,99,34,29,20,56,65,37};
        int count_even = 0;
        int count_odd =0;
        int i;
        for(i=0;i<num.length;i++)
        {
            if (num[i]%2==0)
            {
                count_even+=1;
            }
            else{
                count_odd+=1;
            }
        }
        System.out.println("total no. of even numbersb are: " + count_even);
        System.out.println("total no. of odd numbersb are: " +  count_odd);
    }
}