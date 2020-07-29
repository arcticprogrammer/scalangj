public class LoopsTestSet {

    /* ap << contents:
     * 1. while-loop -int
     * 2. do-while-loop -int
     * 3. for-loop -int
     * 4. for-loop without initializer -int
     * 5. for-loop without incr/decr -int
     * 6. for-loop only test condition -int
     * 7. for-each -int
     */

    public static void main(String[] args)
    {
        System.out.println(whileLoop());
        System.out.println(doWhileLoop());
        System.out.println(forLoop());
        System.out.println(forLoopNoInit());
        System.out.println(forLoopNoIncrDecr());
        System.out.println(forLoopOnlyTestCond());
        System.out.println(forLoopEnhanced());

    }

    // 1. while-loop -int
    public static int whileLoop()
    {
        int i = 10;
        while (i > 5) { i--; }

        return i;
    }

    // 2. do-while-loop -int
    public static int doWhileLoop()
    {
        int i = 10;
        do { i--; } while (i > 5);

        return i;
    }

    // 3. for-loop -int
    public static int forLoop()
    {
        int a = 0;
        for (int i = 10; i > 5; i--)
        {
            a++;
        }

        return a;
    }

    // 4. for-loop without initializer -int
    public static int forLoopNoInit()
    {
        int a = 10;
        for (; a > 5; a--) {}
        return a;
    }

    // 5. for-loop without incr/decr -int
    public static int forLoopNoIncrDecr()
    {
        int a = 0;
        for (int i = 10; i > 5;) 
        {   
            i--;
            a++;
        }

        return a;
    }

    // 6. for-loop only test condition -int
    public static int forLoopOnlyTestCond()
    {
        int i = 10;
        for (;i > 5;)
        {
            i--;
        }

        return i;
    }

    // 7. for-each -int
    public static int forLoopEnhanced()
    {
        int array[] = {2, 3};
        int sum = 0;
        for (int i:array) { sum = sum + i; }

        return sum;
    }

}