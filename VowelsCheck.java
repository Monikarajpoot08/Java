class VowelsCheck {
    public static void main(String[] args)
    {   //when taking input from command-line arguments
        //For char method is different from the other primitive datatypes
        //This is because there is no Char.parseChar() method in Java.
        char alphabet= args[0].charAt(0);
        if((alphabet>='A' && alphabet<='Z') || (alphabet>='a' && alphabet<='z'))
        {
          System.out.println("The alphabet is: " + alphabet );
          switch(alphabet)
            { case 'a':
              case 'e':
              case 'i':
              case 'o':
              case 'u':
              case 'A':
              case 'E':
              case 'I':
              case 'O':
              case 'U':
              System.out.println( alphabet + " is vowel");
              break;
              default:
              System.out.println( alphabet + " is consonant");
              break;
           
           }

        }
        else
        {
            System.out.println("Invalid input ");
        }

    }

}
