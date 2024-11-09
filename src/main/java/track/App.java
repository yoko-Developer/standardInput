package track;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        // Scannerを使って標準入力を取得
        Scanner scanner = new Scanner(System.in);

        // 標準入力から1行を読み取る
        String input = scanner.nextLine();

        // "Hello {input}!"の形式で出力
        System.out.println("Hello " + input + "!");
    }
}
