//Program to calculate the area of rectangle
public class AreaRectangle {
    public static void main(String[] args)
    {
        int len = Integer.parseInt(args[0]);
        int width=Integer.parseInt(args[1]);
        int area= len*width;
        System.out.println("Area of rectangle is "+ area);
    }
    
}
