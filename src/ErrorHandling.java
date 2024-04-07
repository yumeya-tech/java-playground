public class ErrorHandling {
    public static void main(String[] args) {
        try {
            // 0で割ってエラーを発生させる。
            int result = 10 / 0;
        } catch (ArithmeticException e) {
            // 算術計算で例外的条件が発生した場合にスローされます。
            System.out.println("エラーが発生しました: " + e.getMessage());
        } finally {
            System.out.println("このブロックは常に実行されます。");
        }
    }
}
