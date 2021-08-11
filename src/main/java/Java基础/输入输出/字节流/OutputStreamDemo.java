package Java基础.输入输出.字节流;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class OutputStreamDemo {
    public static void main(String[] agrs) {
        FileOutputStream fileOutputStream = null;
        try {
            fileOutputStream = new FileOutputStream("d:/Demo/demo.txt");
            fileOutputStream.write("今天天气真好，我们去玩吧！".getBytes());
            //不需要刷新。
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fileOutputStream != null) {
                try {
                    fileOutputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
