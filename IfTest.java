// if test program
class IfTest{
 public static void main(String[] args)
 {  int count1=0; 
    int count2=0; 
    int count=0; // counts the total no. of persons
    float[] weight={45.0f,55.0f,47.0f,41.0f,52.0f}; // array of float values
    float[] height={160.5f,173.0f,182.0f,165.0f,160.8f};
    for(int i=0;i<=4;i++)
    {
        if (weight[i]<50.0f && height[i]>160.0f)
        {count1+=1;
        }
        count+=1;
    }
    count2=count-count1;
    System.out.println("Total no. of persons " +(count));
    System.out.println("No. of persons with weight <50 and height >160 : " +(count1));
    System.out.println("left persons" +(count2));


 }


}