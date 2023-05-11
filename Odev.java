import java.util.Scanner;

public class Odev {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Dairenin Yarıçapını girin: ");
		int yaricap = scanner.nextInt();
		
		System.out.print("Daire Diliminin merkez açısını girin: ");
		double alpha = scanner.nextDouble();
		
		double pi = 3.14;
		double alan = ( pi * (yaricap * yaricap) * alpha) / 360;
		
		System.out.println("Daire Diliminin Alanı: " + alan);
		
		
	}
}
