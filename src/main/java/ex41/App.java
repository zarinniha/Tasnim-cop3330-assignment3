/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Zarin Tasnim
 */

package ex41;

import java.util.*;
import java.io.File;
import java.io.*;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;

class nameShorter {


    public static void main(String[] args) throws IOException{

        createList list = new createList();
        ArrayList<String> arrList = list.get_Arraylist();

        printAnswer print= new printAnswer();
        print.printList(arrList);

    }


}
