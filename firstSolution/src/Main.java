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

        // variables naming: variable names cannot be start with a number
        // we can start them like these:
        int variable = 123;
        int _variable = 144;
        int $variable = 7766;

        // Constants
        int VALOR = 100;
        byte VALOR_MAXIMO = 6;

        // lower camel case
        int minValue = 5;
        // upper cammel case = usually to write class names
        // class DataType

        // CASTING -----------------------
        System.out.println("[WORKING WITH CASTINGS]");
        // Implicit casting
        byte myByte = 35;
        short shorty = myByte;
        System.out.println(shorty);

        // explicit casting -> when data to be casted is a data type that supports more information than the
        // value to be casted.
        double d = 86.43;
        // data casting may cause data lost -> trunctated data
        int i = (int) d;
        System.out.println(i);

        int codigoASCI1 = 65;
        char ASCI = (char) codigoASCI1;
        System.out.println(ASCI);

        short myShort = 3263;
        byte myb = (byte) myShort;
        System.out.println(myb);

        // ARRAYS --------------------------
        System.out.println("[ LESSON: ARRAYS ]");
        // Arrays are objects
        String[] myArray1 = {"a", "b", "c", "d"};
        byte[] myBytes1 = new byte[15];

        for(int j = 0; j < myArray1.length; ++j)
        {
            System.out.println(myArray1[j]);
        }
        System.out.println("byte array value addition.");
        for (int j = 0; j < myBytes1.length;++j)
        {
            // adding values into byte array
            myBytes1[j] = (byte)(j+1);
        }

        System.out.println("byte array values: ");
        // foreach loop
        // printing all values inside byte array
        for(byte num : myBytes1)
        {
            System.out.print(num);
            System.out.print(" ");
        }
        System.out.println(" ");

        // declaring a integer array
        // do not have to import a library to use new special word as c++ does.
        int[] myIntegers = new int[10];
        // arays in java start at zero as every language but matlab
        myIntegers[0] = 100;
        System.out.println(myIntegers[0]);

        String[] galletas = {"Chokies", "Lors", "Emperador"};
        for(String galleta : galletas)
        {
            // printing all the cockies
            System.out.println(galleta);
        }
        // ARRAYS IN 2D -----------------
        int[][] array2D = new int[2][4];
        for(int j = 0;j < array2D.length;++j)
        {
            for(int k = 0; k < array2D[0].length;++k)
            {
                array2D[j][k] = ((j+1) * (k+1));
            }
        }

        for(int[] j : array2D)
        {
            for(int k : j)
            {
                System.out.print(k);
                System.out.print(" ");
            }
            System.out.println("");
        }

        // ARRAYS IN 3D
        System.out.println("[ARRAYS IN 3D]");

        char[][][] words = new char[2][2][2];

        // addding values to array
        for(int j = 0; j < words.length; ++j)
        {
            for(int k = 0; k < words[0].length; ++k)
            {
                for (int q = 0; q < words[0][0].length; ++q)
                {
                    words[j][k][q] = (char)(80 +((j+1) * (k+1) * (q+1)));
                }
            }
        }

        for(char[][] k : words)
        {
            for(char[]q : k)
            {
                System.out.print("[");
                for(char j : q)
                {
                    System.out.print(j);
                    System.out.print(" ");
                }
                System.out.print("]");
            }
            System.out.println("");
        }

        // declaring and defining multidimensinal arrays
        int[][] matrix = {
                {14, 63, 46, 45, 67, 56},
                {56, 23, 11, 22, 58, 66},
                {123, 532, 534, 765, 74}
        };

        System.out.println(matrix.length);
        System.out.println(matrix[0].length);

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