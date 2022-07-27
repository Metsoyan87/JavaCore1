package classwork.findFile;

import java.io.*;
import java.util.Scanner;

public class FileUtil {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        fileSearch();
    }


    static void fileSearch() {

        System.out.println("please input path");
        String path = scanner.nextLine();
        System.out.println("please input file name");
        String fileName = scanner.nextLine();
        findFileRecursively(path, fileName);
    }

    private static void findFileRecursively(String path, String fileName) {
        boolean exists = false;
        File file = new File(path);
        File[] files = file.listFiles();
        if (!file.exists() || file.isFile() || (files == null || files.length == 0)) {
            System.out.println(false);
            return;
        }
        for (File file1 : files) {
            if (file1.getName().equals(fileName)) {
                System.out.println(file1.getAbsolutePath() + " " + true);
                exists = true;

            }
            if (file1.isDirectory()) {
                String absolutePath = file1.getAbsolutePath();
                findFileRecursively(absolutePath, fileName);
            }
        }
        if (!exists) {
            System.out.print(file.getName() + " " + false);
            System.out.println(" ");
        }
    }


    
    static void contentSearch() {
        System.out.println("please input path");
        String path = scanner.nextLine();
        System.out.println("please input file name");
        String keyword = scanner.nextLine();

        File file = new File(path);
        if (!file.exists() | file.isFile()) {
            System.out.println("Directory not found");
        } else {
            File[] files = file.listFiles();
            for (File file1 : files) {
                if (file1.getName().contains(".txt")) {
                    try {
                        BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
                        String line = "";
                        while ((line = bufferedReader.readLine()) != null) {
                            if (line.contains(keyword)) {
                                System.out.println(file.getName());
                            }
                        }

                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        }

    }
}
