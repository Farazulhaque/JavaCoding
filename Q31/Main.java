package Q31;

public class Main {
  public static void friendlyNumbers(int n1, int n2) {
    char firstOfn1 = (Integer.toString(n1)).charAt(0);
    char firstOfn2 = (Integer.toString(n2)).charAt(0);

    int lastOfn1 = n1 % (Integer.toString(n1)).length();
    int lastOfn2 = n1 % (Integer.toString(n2)).length();

    if (firstOfn1 == firstOfn2 && lastOfn1 == lastOfn2)
      System.out.println(n1 + " and " + n2 + " are friendly numbers.");
    else
      System.out.println(n1 + " and " + n2 + " are not friendly numbers.");
  }

  public static void main(String[] args) {
    int n1 = 3451;
    int n2 = 3981;
    friendlyNumbers(n1, n2);
  }
}
