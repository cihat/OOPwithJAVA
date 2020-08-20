public class KronometreThread implements Runnable {

  private Thread thread;
  private String threadName;

  public KronometreThread(String threadName) {
    this.threadName = threadName;
    System.out.println("Oluşturuluyor : " + threadName);
  }

  @Override
  public void run() {
    System.out.println("Çalıştırılıyor : " + threadName);

    for (int i = 1; i <= 10; i++) {
      System.out.println(threadName + " : " + i);
      try {
        Thread.sleep(1000);
      } catch (InterruptedException e) {
        System.out.println("Kesildi: " + threadName);
        e.printStackTrace();
      }
    }
    System.out.println("Thread Bitti : " + threadName);
  }
  public void start() {
    System.out.println("Thread Nesnesi Oluşturuluyor...");
    thread = new Thread(this, threadName);
    thread.start();
  }
}
