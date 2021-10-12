/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Zarin Tasnim
 */

package ex45;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.List;

class wordFinder {

    public static void main(String args[])  throws IOException
    {
        String currentPath="src/main/java/ex45/";
        ReadIn read = new ReadIn();
        String st = read.createString(currentPath);

        newWord finder = new newWord();
        String newString = finder.replaceWords(st);


      finder.printFile(currentPath,newString);







    }


    }



