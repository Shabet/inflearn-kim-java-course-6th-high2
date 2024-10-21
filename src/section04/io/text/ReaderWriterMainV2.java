package section04.io.text;

import java.io.*;

import static java.nio.charset.StandardCharsets.UTF_8;
import static section04.io.text.TextConst.FILE_NAME;

public class ReaderWriterMainV2 {

    public static void main(String[] args) throws IOException {
        String writeString = "ABC";
        System.out.println("write String = " + writeString);

        // 파일에 쓰기
        FileOutputStream fos = new FileOutputStream(FILE_NAME);
        OutputStreamWriter osw = new OutputStreamWriter(fos, UTF_8);

        osw.write(writeString);
        osw.close();

        // 파일에서 읽기
        FileInputStream fis = new FileInputStream(FILE_NAME);
        InputStreamReader isr = new InputStreamReader(fis, UTF_8);

        StringBuffer content = new StringBuffer();
        int ch;
        while ((ch = isr.read()) != -1) {
            content.append((char) ch);
        }
        isr.close();

        System.out.println("read String = " + content);

    }
}
