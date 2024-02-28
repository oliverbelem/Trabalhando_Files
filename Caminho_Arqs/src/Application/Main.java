package Application;

import java.io.File;
import java.sql.Struct;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String strPath = "E:\\Arqs\\out.txt";

        File path = new File(strPath);

        System.out.println("getName: " + path.getName());
        System.out.println("getParent: " + path.getParent());
        System.out.println("getPath: " + path.getPath());
        System.out.println("Testes: " + path.hashCode());


        sc.close();
    }
}
