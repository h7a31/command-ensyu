import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("�g��:");
		double height = sc.nextDouble();
		System.out.print("�̏d:");
		double weight = sc.nextDouble();
		
		double bmi = ((double)Math.round(weight / (height * height)*100))/100;
		System.out.println(bmi);
	}
}

