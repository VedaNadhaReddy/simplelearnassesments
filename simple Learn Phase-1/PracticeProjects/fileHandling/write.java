package write;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class mainA{
    public static void main(String[] args) throws IOException {
    System.out.println("enter the data to write");
    Scanner sc=new Scanner(System.in);
     String input= sc.next();
   	 FileWriter fw=new FileWriter("c.txt",true);
   	 fw.write(input);
   	 System.out.println("Data Written");   	 
   	 fw.close();
   	 
    }

}