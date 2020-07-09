import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int[] points = new int[4];
		double[] weight = new double[5];
		boolean[] answers = new boolean[3];
		String[] names = new String[3];

		int[] moneyList = {121902, 8302, 55100};
		for(int value: moneyList) {
			System.out.println(value);
		}

		int[] numbers = {3, 4, 9};
		System.out.println("1桁の数字を入力してください");
		int input = new Scanner(System.in).nextInt();
		for(int value: numbers) {
			if(value == input) {
				System.out.println("あたり！");
			}
		}
	}
}
