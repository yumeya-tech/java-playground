public class Functions {
    public static void main(String[] args) {
        printMessage("Hello, Java!");
    }

    // mainがstaticなのでメソッドもstaticとする必要がある。
    public static void printMessage(String message) {
        System.out.println(message);
    }
}
