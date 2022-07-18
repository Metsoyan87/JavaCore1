package renameFiles;

import java.io.File;

public class RenameFiles {

    public static final String PATH = "E:\\Heraxos Vika\\Nkar";

    public static void main(String[] args) {
        
        File file = new File(PATH);
        File[] files = file.listFiles();

        for (int i = 0; i < files.length; i++) {

            if (files[i].isFile()) {
                File f = new File("E:\\Heraxos Vika\\Nkar\\" + files[i].getName());
                f.renameTo(new File("E:\\Heraxos Vika\\Nkar\\" + "IMG_" + i + ".jpg"));
            }
        }
    }
}
