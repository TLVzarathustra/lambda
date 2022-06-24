import javax.sql.rowset.serial.SerialJavaObject;
import java.io.*;
import java.lang.Object;

public class Main {

  public static void main(String[] args) {
    //
    Person mendi = new Person(22, "mendi");
    Person avi = new Person(25, "avi");
    String practiceDirectory = "C:\\Users\\mendiFroomer\\Desktop\\practiceFiles";
    File newPath = new File(practiceDirectory);
   // if (newPath.mkdirs()) {
    //  System.out.println("path created");
    //} else {
     // System.out.println("path creation failed");
    //}

    try (ObjectInputStream objectInputStream =
                 new ObjectInputStream(
                    new BufferedInputStream(
                       new FileInputStream(practiceDirectory + "\\source.dat")));) {
            Person newMendi = (Person) objectInputStream.readObject();
            Person newAvi   =  (Person) objectInputStream.readObject();
            System.out.println(newMendi.age);
            System.out.println(newAvi.age);
            System.out.println(newMendi.name);
            System.out.println(newAvi.name);
    } catch (Exception e) {
      System.out.println(e);
    }
  }
}
