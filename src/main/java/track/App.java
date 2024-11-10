package track;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        // Scannerを使って標準入力を取得
        Scanner scanner = new Scanner(System.in);

        // exitが入力されるまで繰り返し処理
        while (true) {
            System.out.print("Please enter a word (type 'exit' to quit):");
            String input = scanner.nextLine();

            // "exit"と入力されたらプログラム終了
            if (input.equals("exit")) {
                System.out.println("Goodbye!");
                break;
            }

            // 入力された文字列に対して "Hello {input}!" を出力
            System.out.println("Hello " + input + "!");
        }
    }
}
