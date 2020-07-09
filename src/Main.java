public class Main {
	public static void main(String[] args) {
		// 2次元(多次元)配列
		int[][] scores = new int[2][3];
		scores[0][0] = 40;
		scores[0][1] = 50;
		scores[0][2] = 60;
		scores[1][0] = 70;
		scores[1][1] = 80;
		scores[1][2] = 90;
		System.out.println(scores[0][1]);

		int[][] scores2 = {{40, 50, 60}, {70, 80, 90}};
		System.out.println(scores.length);
		System.out.println(scores[0].length);
		System.out.println(scores[0][1]);
		System.out.println(scores[1][2]);
	}
}
