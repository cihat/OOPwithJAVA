import java.io.*;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    readFile();
    writeFile();
    readFile();
  }

  public static void createFile() {
    File file = new File("C:\\javaDemos\\files\\students.txt");
    try {
      if (file.createNewFile()) {
        System.out.println("Dosya Oluşturuldu...");
      } else {
        System.out.println("Dosya zaten mevcut..");
      }

    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  public static void getFileInfo() {
    File file = new File("C:\\javaDemos\\files\\students.txt");
    if (file.exists()) {
      System.out.println("Dosya Adı: " + file.getName());
      System.out.println("Dosya Yolu: " + file.getPath());
      System.out.println("Dosya Yazılabilinir mi ?: " + file.canWrite());
      System.out.println("Dosya Okunabilinir mi ? " + file.canRead());
      System.out.println("Dosya Boyutu: " + file.length());
    }
  }

  public static void readFile() {
    File file = new File("C:\\javaDemos\\files\\students.txt");
    try {
      Scanner reader = new Scanner(file);
      while (reader.hasNextLine()) {
        String line = reader.nextLine();
        System.out.println(line);
      }
      reader.close();
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    }
  }
  public static void writeFile() {
    try {
      FileWriter file = new FileWriter("C:\\javaDemos\\files\\students.txt", true);
      BufferedWriter writer = new BufferedWriter(file);
      writer.newLine();
      writer.write("Ahmet Mehmet");
      System.out.println("Dosyaya Yazıldı...");
      writer.close();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
