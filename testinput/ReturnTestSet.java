public class ReturnTestSet {

    /* ap << contents:
     * 1. primitives
     *      .1. byte
     *      .2. short
     *      .3. int
     *      .4. long
     *      .5. float
     *      .6. double
     *      .7. boolean
     *      .8. char
     * 2. objects
     *      .1. string
     *      .2. array
     */

    public static void main(String[] args)
    {
        System.out.println(returnByte());
        System.out.println(returnShort());
        System.out.println(returnInt());
        System.out.println(returnLong());
        System.out.println(returnFloat());
        System.out.println(returnDouble());
        System.out.println(returnChar());

        System.out.println(returnString());
        System.out.println(returnArrayInt()[1]);
        System.out.println(returnArrayChar());
    }

    // 1. primitives
    // 1.1 byte
    public static byte returnByte()
    {
        byte b = Byte.MAX_VALUE;
        return b;
    }

    // 1.2 short
    public static short returnShort()
    {
        short s = Short.MAX_VALUE;
        return s;
    }

    // 1.3 int
    public static int returnInt()
    {
        int i = Integer.MAX_VALUE;
        return i;
    }

    // 1.4 long
    public static long returnLong()
    {
        long L = Long.MAX_VALUE;
        return L;
    }

    // 1.5 float
    public static float returnFloat()
    {
        float f = Float.MAX_VALUE;
        return f;
    }

    // 1.6 double
    public static double returnDouble()
    {
        double d = Double.MAX_VALUE;
        return d;
    }

    // 1.7 boolean
    public static boolean returnBoolean()
    {
        boolean b = true;
        return b;
    }

    // 1.8 char
    public static char returnChar()
    {
        char c = 'A';
        return c;
    }

    // 2. objects
    // 2.1 string
    public static String returnString()
    {
        String s = "String";
        return s;
    }

    // 2.2 array
    public static int[] returnArrayInt()
    {
        int[] i = {2, 3};
        return i;
    }

    public static char[] returnArrayChar()
    {
        char[] c = {'a', 'b'};
        return c;
    }
}