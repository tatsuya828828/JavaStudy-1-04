public class Main {
	public static void main(String[] args) {
		int[] array = {1, 2, 3};
		// nullを代入することで参照を切ることができる
		array = null;
		// 参照が切られているためエラーが表示される
		array[0] = 10;
	}
}
