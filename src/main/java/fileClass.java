import java.io.*;

public class fileClass {
    public static void filecreate(){

        for (int i=1;i<=10;i++){
            File file = new File("./"+i+"javaprograms.txt");
            try {
                if (file.createNewFile()){
                    System.out.println(i+"ファイルの作成成功");
                }else{
                    System.out.println((i+"ファイルの作成失敗"));
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    public static void foldercreate(){

        for (int i=1;i<=10;i++){
            File dir = new File("./"+i+"folderｓ");
            if (dir.mkdir()){
                System.out.println(i+"フォルダの作成成功");
            }else {
                System.out.println(i+"フォルダの作成失敗");
            }
        }
    }
    public static void search(){

        for (int i=1;i<=10;i++){
            File file = new File("./"+i+"javaprograms.txt");
            if (file.exists()){
                System.out.println(i+"ファイルが見つかりました。");
            }else {
                System.out.println(i+"ファイルが見つかりませんでした。");
            }
        }
    }
    public static void write(){
        // FileWriterクラスを使用する
        FileWriter file = null;
        try {
            file = new FileWriter("./write.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }
        // PrintWriterクラスを使用する
        PrintWriter pw = new PrintWriter(new BufferedWriter(file));

        //ファイルに書き込む
        pw.println("apple");
        pw.println("orange");
        pw.println("melon");
        //ファイルを閉じる
        pw.close();
    }
}
