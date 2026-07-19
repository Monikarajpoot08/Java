class DataTypes{
    // All primitive datatypes using Command Line Arguments
    public static void main(String args[]) {

        byte b = Byte.parseByte(args[0]);
        short s = Short.parseShort(args[1]);
        int i = Integer.parseInt(args[2]);
        long l = Long.parseLong(args[3]);
        float f = Float.parseFloat(args[4]);
        double d = Double.parseDouble(args[5]);
        char c = args[6].charAt(0);
        boolean bool = Boolean.parseBoolean(args[7]);

        System.out.println("Byte    : " + b);
        System.out.println("Short   : " + s);
        System.out.println("Int     : " + i);
        System.out.println("Long    : " + l);
        System.out.println("Float   : " + f);
        System.out.println("Double  : " + d);
        System.out.println("Char    : " + c);
        System.out.println("Boolean : " + bool);
    }
}
