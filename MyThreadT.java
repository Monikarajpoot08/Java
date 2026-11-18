 // sleep() method in thread
 class MyThreadT extends Thread 
 {
    @Override 
    public void run() 
    {
       for (int i=1; i<=5 ; i++)
        {
          try{
              Thread.sleep(1000);
            }
          catch (InterruptedException e)  
             {
               throw new RuntimeException(e) ;
             }
          System.out.println(i);
        }
    }

  public static void main(String[] args){
    MyThreadT t1= new MyThreadT();
    t1.start();   
 }
}

