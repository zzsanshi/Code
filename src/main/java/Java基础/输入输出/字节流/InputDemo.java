package Java基础.输入输出.字节流;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class InputDemo {
    public static void main(String[] args) {
        FileInputStream fileInputStream = null;
        try {
            fileInputStream = new FileInputStream("d:/Demo/demo.txt");
            int ch =0;
            byte[] arr = new byte[fileInputStream.available()];  //正式写代码不要使用fileInputStream.available()，因为文件比较大的时候内存会不够用。
            while((ch = fileInputStream.read(arr)) != -1){
                System.out.println(new String(arr,0,ch));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if(fileInputStream != null){
                try {
                    fileInputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
