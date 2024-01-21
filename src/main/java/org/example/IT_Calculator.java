package org.example;




import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Scanner;
public class IT_Calculator {





    public static void main(String[] args)  throws Exception{
        InputStream inputStream = new FileInputStream("C:\\filename.txt");
        //Creating a Scanner object
        Scanner sc = new Scanner(inputStream);
        //StringBuffer to store the contents
        StringBuffer sb = new StringBuffer();
        //Appending each line to the buffer
        while(sc.hasNext()) {
            sb.append(" "+sc.nextLine());
        }
        System.out.println(sb.toString());

        int taxableIncome=Integer.parseInt(sb.toString().trim());
        float taxrate=10;
        if(taxableIncome<=25000)
            taxrate=10;
        else if (taxableIncome >=25000 && taxableIncome <=50000) {
         taxrate=20;
        } else if (taxableIncome>50000) {
            taxrate=30;
                    }
        float taxperyear=taxableIncome/taxrate;
        float taxpermonth=taxperyear/12;

        System.out.println("Tax per year"+taxperyear);
        System.out.print("Tax per month"+taxpermonth);


    }
}