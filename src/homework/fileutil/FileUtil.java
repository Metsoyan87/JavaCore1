package homework.fileutil;

import java.io.*;

import java.util.Scanner;

public class FileUtil {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

//        fileSearch();

//        contentSearch();

//        findLines();

//        printSizeOfPackage();

        createFileWithContent();


    }

    //այս մեթոդը պետք է սքաններով վերցնի երկու string.
    // 1 - path թե որ ֆոլդերում ենք փնտրելու
    // 2 - fileName - ֆայլի անունը, որը փնտրում ենք։
    //Որպես արդյունք պտի ծրագիրը տպի true եթե կա էդ ֆայլը էդ պապկի մեջ, false եթե չկա։
    static void fileSearch() {
        int flag = 0;
        System.out.println("please input path");
        String path = scanner.nextLine();
        System.out.println("please input file name");
        String fileName = scanner.nextLine();
        File file = new File(path);
        if (!file.isDirectory() || file.isFile()) {
            System.out.println(false);
        }
        File[] files = file.listFiles();
        if (files == null || files.length == 0) {
            System.out.println(false);
        }
        for (File file1 : files) {
            if (file1.getName().equals(fileName)) {
                System.out.println(true);
                flag = 1;
            }
        }
        if (flag == 0) {
            System.out.println(false);
        }
    }


    //այս մեթոդը պետք է սքաններով վերցնի երկու string.
    // 1 - path թե որ ֆոլդերում ենք փնտրելու
    // 2 - keyword - ինչ որ բառ
    // Մեթոդը պետք է նշված path-ում գտնի բոլոր .txt ֆայլերը, և իրենց մեջ փնտրի
    // մեր տված keyword-ը, եթե գտնի, պետք է տպի տվյալ ֆայլի անունը։

    static void contentSearch() {
        System.out.println("please input file directory");
        String path = scanner.nextLine();
        System.out.println("please input text");
        String text = scanner.nextLine();

        File file = new File(path);
        if (!file.exists() || file.isFile()) {
            System.out.println("Directory not found");
        } else {
            File[] files = file.listFiles();
            for (File file1 : files) {
                if (file1.getName().endsWith(".txt")) {
                    try (BufferedReader inputStream = new BufferedReader(new FileReader(file1))) {
                        String line = "";
                        while ((line = inputStream.readLine()) != null) {
                            if (line.contains(text)) {
                                System.out.println(file1.getName());
                            }
                        }
                    } catch (IOException e) {
                        System.out.println(e);
                    }
                }
            }

        }
    }

    //այս մեթոդը պետք է սքաններով վերցնի երկու string.
    // 1 - txtPath txt ֆայլի փաթը
    // 2 - keyword - ինչ որ բառ
    // տալու ենք txt ֆայլի տեղը, ու ինչ որ բառ, ինքը տպելու է էն տողերը, որտեղ գտնի էդ բառը։
    static void findLines() {

        System.out.println("please input file path");
        String path = scanner.nextLine();
        System.out.println("please input text");
        String text = scanner.nextLine();

        File file = new File(path);
        if (!file.exists() || file.isFile()) {
            System.out.println("Directory not found");
        } else {
            File[] files = file.listFiles();
            for (File file1 : files) {
                if (file1.isDirectory() && file1.list().length > 0) {
                    contentSearch();
                }

                try (BufferedReader inputStream = new BufferedReader(new FileReader(file1))) {
                    String line = "";
                    int num = 1;
                    while ((line = inputStream.readLine()) != null) {
                        if (line.contains(text)) {
                            System.out.println(file1.getName() + " " + num);
                        }
                        num++;
                    }
                } catch (IOException e) {
                    System.out.println(e);
                }
            }
        }
    }


    //այս մեթոդը պետք է սքաններով վերցնի մեկ string.
    // 1 - path թե որ ֆոլդերի չափն ենք ուզում հաշվել
    // ֆոլդերի բոլոր ֆայլերի չափսերը գումարում ենք իրար, ու տպում
    static void printSizeOfPackage() {

        System.out.println("please input file path");
        String path = scanner.nextLine();
        File file = new File(path);
        if (file.exists() || file.isDirectory()) {
            long num = 0;
            for (File listFile : file.listFiles()) {
                num += listFile.length();
            }
            System.out.println("length = " + path + " " + (num / 1024 / 1024) + "mb");
        }

    }

    //այս մեթոդը պետք է սքաններով վերցնի երեք string.
    // 1 - path պապկի տեղը, թե որտեղ է սարքելու նոր ֆայլը
    // 2 - fileName ֆայլի անունը, թե ինչ անունով ֆայլ է սարքելու
    // 3 - content ֆայլի պարունակությունը։ Այսինքն ստեղծված ֆայլի մեջ ինչ է գրելու
    // որպես արդյունք պապկի մեջ սարքելու է նոր ֆայլ, իրա մեջ էլ լինելու է content-ով տվածը
    static void createFileWithContent() {

        System.out.println("please input path");
        String path = scanner.nextLine();
        System.out.println("please input file name \\896523.txt");
        String fileName = scanner.nextLine();
        System.out.println("please input content");
        String content = scanner.nextLine();
        String s = path + fileName;
        File file = new File(s);
        if (!file.exists()) {
            try {
                file.createNewFile();
                BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file));
                bufferedWriter.write(content);
                bufferedWriter.close();
            } catch (IOException e) {
                System.out.println(e);
            }
        }
    }
}

