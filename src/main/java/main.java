import java.io.IOException;

public class main {
    public static void main(String[] args) {

        //指定のフォルダにファイルを作るだけのプログラム
        fileClass.filecreate();
        //指定のフォルダにフォルダを作成するだけのプログラム
        fileClass.foldercreate();
        //指定のファイルを探すだけのプログラムｓ
        fileClass.search();
        //指定のファイルに書き込みをするだけのプログラム
        fileClass.write();
    }
}
