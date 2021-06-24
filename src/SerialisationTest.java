
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author sumit
 */
public class SerialisationTest {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        try {
            User user1 = new User("ss", "ss.@gmail.com");
            User user2 = new User("ss1", "ss1.@gmail.com");
            User user3 = new User("ss2", "ss2.@gmail.com");
            User user4 = new User("ss3", "ss3.@gmail.com");
            File file = new File("output.txt");
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(user1);
            objectOutputStream.writeObject(user2);
            objectOutputStream.writeObject(user3);
            objectOutputStream.writeObject(user4);
            fileOutputStream.flush();
            System.out.println("out done ...!");
            
            
            ObjectInputStream inputStream=new ObjectInputStream(new FileInputStream(file));
            User u1=(User)inputStream.readObject();
            User u2=(User)inputStream.readObject();
            User u3=(User)inputStream.readObject();
            User u4=(User)inputStream.readObject();
            System.out.println(u1.getName()+u1.getEmail());
            System.out.println(u2.getName()+u2.getEmail());
            System.out.println(u3.getName()+u3.getEmail());
            System.out.println(u4.getName()+u4.getEmail());
            inputStream.close();
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
    }
}
