package org.sitoolkit.ad.mw;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        System.out.println("インストールするミドルウェアを選択してください。");
        System.out.println("1:Application Server");
        System.out.println("2:Database Management System");
        System.out.print("?> ");

        Scanner scanner = new Scanner(System.in);
        String in = scanner.nextLine();

        System.out.println(in + "をインストールします。");
        scanner.close();
    }
}
