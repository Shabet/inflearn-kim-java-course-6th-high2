package section04.io.text;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import static java.nio.charset.StandardCharsets.*;

public class ReaderWriterMainV3 {

    public static void main(String[] args) throws IOException {
        String writeString = "ABC";
        System.out.println("write String = " + writeString);

        // 파일에 쓰기
        FileWriter fw = new FileWriter(TextConst.FILE_NAME, UTF_8);
        fw.write(writeString);
        fw.close();

        // 파일에서 읽기
        StringBuffer content = new StringBuffer();
        FileReader fr = new FileReader(TextConst.FILE_NAME, UTF_8);
        int ch;
        while ((ch = fr.read()) != -1) {
            content.append((char) ch);
        }
        fr.close();

        System.out.println("read String = " + content);

    }
}
