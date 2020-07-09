import java.util.Random;

public class Main {
	public static void main(String[] args) {
		int[] scores = {20, 30, 40, 50, 80};
		// forループで配列を回す
		int sum = 0;
		for(int i=0; i<scores.length; i++) {
			sum += scores[i];
		}
		System.out.println(scores.length +"教科");
		System.out.println("合計点:"+ sum);
		int avg = sum/scores.length;
		System.out.println("平均点:"+ avg);
		int count = 0;
		for(int value: scores) {
			if(value>=50) {
				count++;
			}
		}
		System.out.println("50点以上の科目:"+ count);


		int[] seq = new int[10];
		for(int value: seq) {
			seq[value] = new Random().nextInt(4);
		}

		char[] base = {'A', 'T', 'G', 'C'};
		for(int value: seq) {
			System.out.print(base[seq[value]]+" ");
		}
	}
}
