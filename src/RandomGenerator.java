package Java8.deadlock;

import java.util.Random;

public class RandomGenerator {
  public static void main (String[] args) {
    Random random = new Random();///0 52
    final int[] rand1 = {0};
    
    Thread t1 = new Thread(() -> {
      rand1[0] = random.nextInt(51) + 1;
      for(int i=1;i<=10;i++){
        System.out.println(rand1[0]*i);
      }
    });
    Thread t2 = new Thread(() -> {
      rand1[0] = random.nextInt(51) + 1;
      for(int i=1;i<=10;i++){
        System.out.println(rand1[0]*i);
      }
    });
    Thread t3 = new Thread(() -> {
      rand1[0] = random.nextInt(51) + 1;
      for(int i=1;i<=10;i++){
        System.out.println(rand1[0]*i);
      }
    });
  
  
    System.out.println("--------------------------------------------------------");
    t1.start();
    try {
      Thread.sleep(1000);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
    System.out.println("--------------------------------------------------------");
    t2.start();
    try {
      Thread.sleep(1000);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
    System.out.println("--------------------------------------------------------");
    t3.start();
    
//    for (int i = 0; i < 10; i++) {
//      while (rand1[0] == rand2[0] || rand1[0] == rand3[0] || rand2[0] == rand3[0]) {
//
//      }
//    }
//    System.out.println(rand1 + "  " + rand2[0] + " " + rand3[0]);
    
  }
}
