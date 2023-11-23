import java.io.Reader;
import java.io.StringReader;
import java.util.Arrays;
import java.io.IOException;

public class StreamPrinter {
    void print(Reader reader) throws IOException {
		/*int code = reader.read();
		while (code != -1) {
			System.out.print((char) code);
			code = reader.read();
		}*/
        char[] charArray = new char[5];
        reader.read(charArray);
        System.out.print(new String(charArray));

        reader.close();
    }
}
