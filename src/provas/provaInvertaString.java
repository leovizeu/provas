package provas;
import java.util.Scanner;

public class provaInvertaString {

	   public static void main(String[] args) {
	      Scanner sc = new Scanner(System.in);
	      System.out.print("Digite uma string: ");
	      String original = sc.nextLine();
	      
	      String invertida = "";
	      for (int i = original.length() - 1; i >= 0; i--) {
	         invertida += original.charAt(i);
	      }
	      
	      System.out.println("String original: " + original);
	      System.out.println("String invertida: " + invertida);
	   }
}
