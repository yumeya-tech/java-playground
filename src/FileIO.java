import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;

public class FileIO {
    public static void main(String[] args) {
        // output.txtを作成して内容を書き込む。
        // output.txtはルート直下に配置されます。
        try (PrintWriter writer = new PrintWriter(new FileWriter("output.txt"))) {
            writer.println("Hello, file!");
        } catch (Exception e) {
            e.printStackTrace();
        }

        // output.txtの内容を読み込んで内容を表示する。
        try (BufferedReader reader = new BufferedReader(new FileReader("output.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
