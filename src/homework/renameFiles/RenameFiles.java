package renameFiles;

import java.io.File;

public class RenameFiles {

    public static final String PATH = "E:\\";  //E:\\Պապկի անունը

    public static void main(String[] args) {
        
        File file = new File(PATH);
        File[] files = file.listFiles();

        for (int i = 0; i < files.length; i++) {

            if (files[i].isFile()) {
                File f = new File("E:\\" + files[i].getName());              //E:\\Պապկի անունը

                f.renameTo(new File("E:\\" + "IMG_" + i + ".jpg"));         //E:\\Պապկի անունը

            }
        }
    }
}
