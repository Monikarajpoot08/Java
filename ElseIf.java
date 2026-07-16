// Elseif java program 
public class ElseIf {
    public static void main(String args[])
    {
        // must pass the argument after the class is created 
        int marks=Integer.parseInt(args[0]);
        if (marks>=90 && marks<=100)
        {System.out.println("Grade A(1st position)");

        }
         else if (marks>=80 && marks<=90)
        {System.out.println("Grade B");
            
        }
          else if (marks>=70 && marks<=80)
        {System.out.println("Grade C");
            
        }
          else if (marks>=60 && marks<=70)
        {System.out.println("Grade D");
            
        }
        else if (marks>=50 && marks<=60)
        {System.out.println("Grade E");
            
        }
        else {
            System.out.println("Fail");
        }

    }
    
}
