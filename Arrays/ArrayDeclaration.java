public class ArrayDeclaration
{
    // declares an array of integers
    int[] anArray;

    byte[] anArrayOfBytes;
    short[] anArrayOfShorts;
    long[] anArrayOfLongs;
    float[] anArrayOfFloats;
    double[] anArrayOfDoubles;
    boolean[] anArrayOfBooleans;
    char[] anArrayOfChars;
    String[] anArrayOfStrings;

    // You can also place the brackets after the arrays name:
    // this form is discouraged
    float arrayOfFloats[];

    public void initArrays ()
    {
        // create an array of integers
        anArray = new int[10];

        //The next few lines assign values to each element of the array:
        anArray[0] = 100; // initialize first element
        anArray[1] = 200; // initialize second element
        anArray[2] = 300; // and so forth


        //Each array element is accessed by its numerical index:
        System.out.println("Element 1 at index 0: " + anArray[0]);
        System.out.println("Element 2 at index 1: " + anArray[1]);
        System.out.println("Element 3 at index 2: " + anArray[2]);

        //Alternatively, you can use the shortcut syntax to create and initialize an array:
        int[] array = { 
            100, 200, 300,
            400, 500, 600, 
            700, 800, 900, 1000
        };
    }

    public static void main (String[] args)
    {
        ArrayDeclaration arrayDeclaration = new ArrayDeclaration();
        arrayDeclaration.initArrays();
    }
}