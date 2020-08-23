import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) throws IOException {
    CreateVector vector1 = new CreateVector();
    CreateVector vector2 = new CreateVector();
    VectorSum vector = new VectorSum(vector1, vector2);
  }
}

class VectorSum {
  public VectorSum(CreateVector vector1, CreateVector vector2) {
    int toplamI = vector1.i + vector2.i;
    int toplamJ = vector1.j + vector2.j;
    System.out.println(toplamI + "i" + " + " + toplamJ + "j");
  }
}

class CreateVector {
  public int i;
  public int j;

  public int CreateVector() {
    Scanner scanner = new Scanner(System.in);
    int i = scanner.nextInt();
    int j = scanner.nextInt();
    return i;
  }
}

/*
//Soru1
  public static void asal(File file) throws IOException {
    int numberCounter = 0;
    Scanner scanner = new Scanner(System.in);
    PrintWriter writer = new PrintWriter(file);
    int inputNumber;
    boolean isAsal = true;
    do {
      inputNumber = scanner.nextInt();
      for (int i = 2; i < inputNumber; i++) {
        if (inputNumber % i == 0) {
          isAsal = false;
          break;
        } else {
          isAsal = true;
        }
      }
      if (isAsal == true) {
        System.out.println("Asaldır");
        writer.println(inputNumber);
      }
      numberCounter++;
    } while (numberCounter != 10);
    writer.close();
  }
*/
/*    File file = new File("ASAL.DAT");
    if (!file.exists())
      file.createNewFile();
    asal(file);*/
