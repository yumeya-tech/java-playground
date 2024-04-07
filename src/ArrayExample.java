import java.util.ArrayList;
import java.util.List;

public class ArrayExample {
    public static void main(String[] args) {
        // 配列を宣言する
        int[] numbers = {1, 2, 3, 4, 5};
        // 配列を1つずつ取り出して繰り返す
        for (int number : numbers) {
            System.out.println(number);
        }

        // Listを宣言する。
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i <= 5; i++) {
            // Listに値を設定する
            list.add(i);
        }
        for (int element : list) {
            // リストを1つずつ取り出して繰り返す
            System.out.println(element);
        }
    }
}
