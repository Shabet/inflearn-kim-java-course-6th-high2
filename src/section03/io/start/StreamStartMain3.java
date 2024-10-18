package section03.io.start;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class StreamStartMain3 {

    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("temp/hello.dat");
        byte[] input = {65, 66, 67, 68, -1, 127, -2, -3};
        fos.write(input);
        fos.close();

        FileInputStream fis = new FileInputStream("temp/hello.dat");
        byte[] buffer = new byte[10];
        int readCount = fis.read(buffer, 0, 10);
        System.out.println("readCount = " + readCount);
        System.out.println(Arrays.toString(buffer));
        System.out.println((char)buffer[0]);
        System.out.println((char)buffer[1]);
        System.out.println((char)buffer[2]);
        System.out.println((char)buffer[3]);
        System.out.println((char)buffer[4]);
        System.out.println((char)buffer[5]);
        System.out.println((char)buffer[6]);
        System.out.println((char)buffer[7]);
        fis.close();
    }
}
