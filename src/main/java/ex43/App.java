/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Zarin Tasnim
 */

package ex43;


import java.io.IOException;

class websiteGenerator {

    public static void main(String args[]) throws IOException {

        askUser user = new askUser();
        String site = user.getSiteName();
        String author = user.getAuthorName();
        String jsAns = user.getjsAnswer();
        String cssAns = user.getcssAnswer();

        createHTML create = new createHTML();
        create.printOutput(author, site, jsAns, cssAns);


    }
}



