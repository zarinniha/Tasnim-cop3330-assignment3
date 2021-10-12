package ex44;

import org.json.simple.JSONObject;

class Product {

    //gets the product name

    public static String getName(JSONObject json)
    {
        String name = (String)json.get("name");
        return name;
    }

    //prints the associated information of the product

    public static void print(JSONObject json,Integer check,String name)
    {

         String answer=(check==1)?("Name: "+name+"\nPrice: "+String.format("%.2f",json.get("price"))+
                                  "\nQuantity: "+json.get("quantity")):
                 ("Sorry, that product was not found in our inventory\n");

         System.out.print(answer);
    }


}
