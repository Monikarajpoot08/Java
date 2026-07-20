// Program to check eligibility of a person
public class NestedIf {
    public static void main (String [] args){ 
    int age =23;
    boolean aadhar= true;
    boolean voting_card= false;
    if (age>=18)
    {
        if (aadhar== true)
        {
            if (voting_card== true)

                {System.out.println("Person is eligible to vote");
                }
            else
                {
                 System.out.println("Person is not eligible to vote");
                }
        }
        else 
        {
        System.out.println("Make aadhar card first");
        }
       
    }
    else
    {
     System.out.println("Person is under 18 and can't vote");
    }
  }
}