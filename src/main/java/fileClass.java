import java.io.File;
import java.io.IOException;

public class fileClass {
    public fileClass() throws IOException{



        for (int i=1;i<=10;i++){

            File file = new File("./"+i+"javaprograms.txt");

            if (file.createNewFile()){
                System.out.println(i+"ファイルの作成成功");
            }else{
                System.out.println((i+"ファイルの作成失敗"));
            }
        }

    }
}
