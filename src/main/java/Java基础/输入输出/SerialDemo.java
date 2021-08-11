package Java基础.输入输出;

import java.io.*;
//序列化and反序列化
//被transient修饰的变量将不再是对象持久化的一部分，该变量内容在序列化后无法被访问
public class SerialDemo {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        User user = new User();
        user.setUsername("Alex");
        user.setPasswd("123");

        File file = new File("D:/Demo/test.txt");
        System.out.println("===序列化前");
        System.out.println(user.getUsername());
        System.out.println(user.getPasswd());
        ObjectOutputStream out= null;
        try {
            out = new ObjectOutputStream(new FileOutputStream(file));
        } catch (IOException e) {
            e.printStackTrace();
        }
        out.writeObject(user);
        out.flush();
        out.close();
        System.out.println("===序列化后");
        ObjectInputStream in = null;
        in = new ObjectInputStream(new FileInputStream(file));
        user = (User)in.readObject();
        in.close();
        System.out.println(user.getUsername());
        System.out.println(user.getPasswd());

    }
}
class User implements Serializable{
    public static String username ;
    //被transient修饰的变量将不再是对象持久化的一部分，该变量内容在序列化后无法被访问
    public transient String passwd ;

    public static String getUsername() {
        return username;
    }

    public static void setUsername(String username) {
        User.username = username;
    }

    public String getPasswd() {
        return passwd;
    }

    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }
}
