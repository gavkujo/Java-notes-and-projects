import java.util.Scanner;

public class racism{
  public static void main(String[] args){
    String country1 = "nigeria";
    String country2 = "gyesermany";
    try (Scanner racist = new Scanner(System.in)) {
        String decision = racist.next();
        String a = country1.substring(0,3);
        String b = country2.substring(0,3);
        System.out.println(decision);
        if (decision.equals("yes"))
          System.out.println(a+b);
        else
          System.out.println("ok libtard");
    }
  }
}