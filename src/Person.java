public class Person {
    /*
    インスタンス変数。
    オブジェクトごとに異なる値を持てる変数です。
    インスタンス変数をprivateにすることで、外部から直接アクセスできないようにします。
    これはオブジェクト指向のカプセル化の要素の１つです。
     */
    private String name;
    private int age;

    /*
    コンストラクタ。
    オブジェクトが生成される際に呼び出される特殊なメソッドです。
    クラス名と同じ名前で、戻り値の指定もありません。
    オブジェクト生成時の初期化処理に使用されます。
     */
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    /*
    ゲッターとセッター。
    インスタンス変数の値を読み書きするためのメソッドです。
    インスタンス変数はprivateで外部からアクセスできないため、
    このメソッドを通してアクセスすることになります。
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // メソッド
    public void display() {
        System.out.println("名前は " + name + " です。年齢は " + age + " 歳です。");
    }
}
