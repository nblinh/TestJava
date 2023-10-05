
// Java program to demonstrate
// Reader read(char[]) method

import java.io.*;
        import java.util.*;

class testReader {
    public static void main(String[] args)
    {

        try {

            String str = " GeeksForGeeks";

            // Create a Reader instance
            Reader reader = new StringReader(str);

            // Get the character array
            // to be read from the stream
            char[] charArray = new char[5];

            // Read the charArray
            // to this reader using read() method
            // This will put the str in the stream
            // till it is read by the reader
            reader.read(charArray);

            // Print the read charArray
            System.out.println(Arrays.toString(charArray));

            reader.close();
        }
        catch (Exception e) {
            System.out.println(e);
        }
    }
}
