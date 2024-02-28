package Application;

import java.io.File;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite uma pasta: ");
        String strPath = sc.nextLine();
        System.out.println();
        File path = new File(strPath);

        File[] folders = path.listFiles(File::isDirectory);
        System.out.println("Pastas: ");
        for(File folder:folders){
            System.out.println(folder);
        }
        System.out.println("--------------------------------");
        File[] files = path.listFiles(File::isFile);
        System.out.println("Arquivos:");
        for (File file : files){
            System.out.println(file);
        }
        System.out.println("--------------------------------");
        boolean success = new File(strPath + "\\subdiretorio").mkdir();
        System.out.println("Ditorio criado com sucesso: " + success);

        sc.close();
    }
}
