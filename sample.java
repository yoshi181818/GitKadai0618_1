import java.io.FileReader;
import java.io.IOException;

public class Sample {

    public static void main(String[] args) {
        FileReader fr = null;
        try {
            // ファイルを開く
            fr = new FileReader("aaa.txt");

            // ファイルから1文字読み込む
            int i = fr.read();

            // 末尾になるまで読み込んで画面出力
            while (i != -1) {
                char c = (char) i;
                System.out.print(c);
                i = fr.read();
            }

        } catch (IOException e) {
            // 例外が発生した場合はメッセージを出力
            System.out.println("ファイルの読み込み中にエラーが発生しました: " + e.getMessage());
        } finally {
            // ファイルを閉じる
            if (fr != null) {
                try {
                    fr.close();
                } catch (IOException e) {
                    System.out.println("ファイルのクローズ中にエラーが発生しました: " + e.getMessage());
                }
            }
        }
    }
}
