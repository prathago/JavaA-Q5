import java.util.*;

class Main {
  public static void main(String[] args) {
    int n = 0, temp = 0;
    double sum = 0.0;
    Scanner sc = new Scanner(System.in);
    System.out.println("1. Print the series 0, 3, 8, 15, 24 ……. n terms");
    System.out.println("2. Find the sum of the series: S = 1/2+ 3/4 + 5/6 + 7/8 … 19/20");
    int ch = sc.nextInt();
    if(ch == 1) {
      System.out.println("Enter a number:");
      n = sc.nextInt();
    }
    switch (ch) {
    case 1:
      for (int i = 1; i <= n; i++) {
        temp = (i * i) - 1;
        System.out.println(temp);
      }
      break;
    case 2:
      for (int i = 1, j = 2; i < 20; i += 2, j += 2) {
        sum = ((i) / (double) (j)) + sum;
        System.out.println(sum);
      }
      break;
    default: System.out.println("Wrong Choice, Please enter 1 or 2!");
    }

  }
}