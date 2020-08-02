package day12_Switch_Scanner;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Scanner;

public class Scanner_Practice1 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your number : ");
        double num1 = scan.nextDouble();

        String result = (num1 % 2 ==0)? num1 +  " : It is a EVEN number" : num1 + " : It is a ODD number";

        System.out.println(result);

    }

}
