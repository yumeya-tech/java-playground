public class Branching {
    public static void main(String[] args) {
        int number = 10;
        // if文
        if (number > 0) {
            System.out.println("数字は正数です。");
        } else if (number < 0) {
            System.out.println("数字は負数です。");
        } else {
            System.out.println("数字はゼロです。");
        }
        // switch文
        switch (number) {
            case 10:
                System.out.println("数字は10です。");
                break; // switch文を抜ける。これがないと次の「数字は10以外です。」が表示されてしまう。
            default:
                System.out.println("数字は10以外です。");
                break;
        }
    }
}
