import java.util.HashMap;

public class HashMapExample {
    public static void main(String[] args) {
        // Mapの宣言。キーがString、値がInteger(int)。
        HashMap<String, Integer> map = new HashMap<>();
        // Mapに値を追加する。キーと値。
        map.put("Apple", 1);
        map.put("Banana", 2);
        map.put("Cherry", 3);

        // Mapから値を取得する。
        System.out.println(map.get("Apple"));
    }
}
