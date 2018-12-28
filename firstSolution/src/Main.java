public class Main {

    public static void main(String[] args)
    {
        // data types
        int x = 1003433464;
        short y = 10553;
        long z = 235252523233253252L; // we need to tell the compiler
                                    // it is a long data with L at the end
        double e = 65632632.2325252;
        // from -128 to 127
        byte a = 125;

        String phrase = "Esta es mi primera linea de codigo de java";
        System.out.println(phrase);
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        System.out.println(e);
        System.out.println(a);

        int data1 = 5;
        int data2 = 10;

        int suma = Addition(data1, data2);
        System.out.println(suma);

        float ex1 = 124.442F; // we need to tell the compiler we are
                            // using a float by putting F at the end of the number
        float ex2 = 12322.42124F;
        float f_result = Addition(ex1, ex2);
        System.out.println(f_result);

        // characters
        char genre = 'M';
        System.out.println(genre);

        boolean isVisible = true;
        boolean ifworks = false;
        if(isVisible != ifworks)
        {
            System.out.println("They are not the same");
        }
    }

    private static int Addition(int a, int b)
    {
        return a + b;
    }

    // overloaded
    private static float Addition(float a, float b)
    {
        return a + b;
    }
}