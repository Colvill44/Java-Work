import java.util.Random;

public class arrayQuestion{
  public static void main(String[] args){
    Random rand = new Random();
    int[] a = new int[1000];
    for (int i = 0; i < 1000; i++){
      a[i] = rand.nextInt(10) + 1;
    }
    int num1 = 0;
    int num2 = 0;
    int num3 = 0;
    int num4 = 0;
    int num5 = 0;
    int num6 = 0;
    int num7 = 0;
    int num8 = 0;
    int num9 = 0;
    int num10 = 0;
      
    for (int i = 0; i < 1000; i++){
      if (a[i] == 1){
        num1++;
      }
      else if (a[i] == 2){
        num2++;
      }
      else if (a[i] == 3){
        num3++;
      }
      else if (a[i] == 4){
        num4++;
      }
      else if (a[i] == 5){
        num5++;
      }
      else if (a[i] == 6){
        num6++;
      }
      else if (a[i] == 7){
        num7++;
      }
      else if (a[i] == 8){
        num8++;
      }
      else if (a[i] == 9){
        num9++;
      }
      else if (a[i] == 10){
        num10++;
      }
    }
    System.out.println("Frequency of 1: " + num1);
    System.out.println("Frequency of 2: " + num2);
    System.out.println("Frequency of 3: " + num3);
    System.out.println("Frequency of 4: " + num4);
    System.out.println("Frequency of 5: " + num5);
    System.out.println("Frequency of 6: " + num6);
    System.out.println("Frequency of 7: " + num7);
    System.out.println("Frequency of 8: " + num8);
    System.out.println("Frequency of 9: " + num9);
    System.out.println("Frequency of 10: " + num10);
    
    int i = 0;
    int j = a.length - 1;
    for (i = 0; i < a.length / 2; i++, j--){
      int num = a[i];
      System.out.print(num + " -> ");
      a[i] = a[j];
      System.out.printf(a[i] + "\n");
      a[j] = num;
      
    }
  }
}
