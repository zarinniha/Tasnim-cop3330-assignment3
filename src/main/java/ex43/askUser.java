package ex43;

import java.util.Scanner;

//ask user class to get the site and author name and
//to get the answer of creating the js and css folder

public class askUser {

    static Scanner sc = new Scanner(System.in);

    public static String getSiteName() {

        System.out.print("Site name: ");
        String site = sc.nextLine();
        return site;
    }

    public static String getAuthorName() {

        System.out.print("Author: ");
        String author = sc.nextLine();
        return author;

    }

    public static String getjsAnswer() {

        System.out.print("Do you want a folder for JavaScript? ");
        String jsAns = sc.nextLine();
        return jsAns;

    }

    public static String getcssAnswer() {

        System.out.print("Do you want a folder for CSS? ");
        String cssAns = sc.nextLine();
        return cssAns;

    }


}




