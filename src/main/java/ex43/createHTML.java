package ex43;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

class createHTML {

    //checks if the the file exists in the directory

    public static boolean websiteExists(File file) {

        boolean websiteCreated = !file.exists(); //create a boolean to check if the folder is in the directory

        if (websiteCreated) {

            return true; //if website doesn't exist
        }else
        {
            return false; ////if website does exist
        }
    }

    //creates the folder based on the user input

    public static void createFolder(String currentPath,String type)
    {
        File folder = new File(currentPath + "\\"+type);
        boolean folderCreated = folder.mkdir(); //creates the folder

        // checks if the folder exists
        if (folderCreated) {
            System.out.println("Created" + folder + "\\");
        }else {
            System.out.println(type+" folder not created");
        }

    }

    //creates the context of the HTML folder

    public static void createHTML(String author, String site, String currentPath)throws IOException
    {
        FileWriter writer = new FileWriter(new File(currentPath + "\\index.html"));
        writer.write("<!DOCTYPE html>\n<html lang=\"en\">\n<head>\n");

        writer.write("\t<meta author=\"" + author + "\">\n");

        writer.write("\t<title>" + site + "</title>\n");

        writer.write("</head>\n<body>\n\n</body>\n</html>");

        writer.close();

        System.out.println("Created " + currentPath + "\\index.html");
    }

    //prints the output

    public static void printOutput(String author,String site,String jsAns,String cssAns)
    {
        String currentPath = System.getProperty("user.dir"); //get the current directory
        currentPath += "\\" + site;  //create the path for the website folder
        File website = new File(currentPath);

        if (websiteExists(website)) {
//
            website.mkdir();
            System.out.println("Created " + currentPath);
            try {

                createHTML(author,site,currentPath);

                if (jsAns.matches("y")) {

                    createFolder(currentPath,"js"); //create the js folder
                }

                if (cssAns.matches("y")) {
                    createFolder(currentPath,"css"); //create the css folder

                }
            } catch (IOException e) {

                System.out.println("HTML folder was not created");

            }

        }else {
            System.out.print("Error");
        }


        }
    }

