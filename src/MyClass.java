public class MyClass {
    public static void main(String[] args) {
        /*
        インスタンスの生成。
        クラスからオブジェクトを作り出します。
        クラスのコンストラクタを呼び出してオブジェクトの初期化を行います。
         */
        Person person = new Person("山田", 30);
        // メソッドを呼び出します。
        person.display();
    }
}
