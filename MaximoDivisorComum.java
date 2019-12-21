import java.util.*;
public class MaximoDivisonComum {

  public static void processInput(int[] input) {
    int length = input.length;
    int i = 0;
    
    while(i < length) {
      int valueA = input[i];
      int valueB = input[++i];
    
      int minor = Math.min(valueA, valueB);
    
      if (minor == 0) {
        System.out.println(Math.max(valueA, valueB)+"");
      }
    
      int mdc = minor;
      while (mdc > 1) {
        if (valueA % mdc == 0 &&
            valueB % mdc == 0) {
              break;
            } else {
              mdc--;
            }
      }
    
      System.out.println(mdc+"");
      i++;
    }
  }

  
  public static void main(String args[]) {
    Scanner scanner = new Scanner (System.in);
    
    int loopSize = scanner.nextInt();
    int[] input = new int[loopSize];
    int i = 0;

    while (i < loopSize) {
      input[i] = scanner.nextInt();
      i++;
    }

    scanner.close();
    
    processInput(input);

    System.exit(1);
  }
}
