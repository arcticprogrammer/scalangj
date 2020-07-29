public class ArrayTestSet {

    /* ap << contents:
     * 1. declaration (int) -int
     * 2. declaration (String) -int
     * 3. assignment -int
     * 4. manipulation -int
     * 5. arithmetic -int
     */

    public static void main (String[] args)
    {
        System.out.println(ArrayDeclInt1());
        System.out.println(ArrayDeclInt2());
        System.out.println(ArrayDeclStr1());
        System.out.println(ArrayDeclStr2());
        System.out.println(ArrayTestAssignment());
        System.out.println(ArrayTestManip());
        System.out.println(ArrayTestArithmetic());
    }

    // 1. declaration (int) -noreturn
    public static int ArrayDeclInt1()
    {
        int[] a = new int[2];
        return a.length;
    }

    public static int ArrayDeclInt2()
    {
        int[] a = {5, 10};
        return a.length;
    }

    // 2. declaration (String) -noreturn
    public static int ArrayDeclStr1()
    {
        String[] s = new String[2];
        return s.length;
    }

    public static int ArrayDeclStr2()
    {
        String[] s = {"test1", "test2"};
        return s.length;
    }

    // 3. assignment -int
    public static int ArrayTestAssignment()
    {
        int[] a = new int[1];
        a[0] = 5;

        return a[0];
    }

    // 4. manipulation -int
    public static int ArrayTestManip()
    {
        int[] a = {5, 10};
        a[1] = a[0];

        return a[1];
    }

    // 5. arithmetic -int
    public static int ArrayTestArithmetic()
    {
        int[] a = {5, 10};
        
        return a[0] + a[1];
    }

}