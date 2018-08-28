import java.util.Scanner;
public class MaxOfTwo {
	private static Scanner sc = new Scanner(System.in);
	public static void main(String args[]) {
		String s1 = sc.nextLine();
		String s2 = sc.nextLine();
		if (Integer.parseInt(s1) > Integer.parseInt(s2))
			System.out.println(s1+" is greater than "+s2);
		else if (Integer.parseInt(s1) < Integer.parseInt(s2))
			System.out.println(s2+" is greater than "+s1);
		else 
			System.out.println(s1+" == "+s2);
	}
}