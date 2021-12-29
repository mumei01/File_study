import java.io.IOException;

public class main {
    public static void main(String[] args) {

        //指定のフォルダにファイルを作るだけのプログラム
        try {
            new fileClass();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
