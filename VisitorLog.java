import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;
public class VisitorLog{
    public static void main(String[] args) throws FileNotFoundException,IOException{
        BufferedReader br = new BufferedReader(new FileReader("Visitor.txt"));
        int days[] = {31, 29, 30, 31, 30, 31, 30, 31, 30, 31, 30, 31};
        int visitors[][][];
        visitors = new int[12][][];
        for(int i = 0;i < days.length; i++)
            visitors[i] = new int[ days[i] ][24]; 
        for(int i =0; i < visitors.length;i++)
            for(int j = 0;j< visitors[i].length;j++)
                for(int k = 0;k < visitors[i][j].length;k++)
                    visitors[i][j][k] = Integer.valueOf(br.readLine());
        while(true){
            System.out.println("1.");
            System.out.println("2.");
            System.out.println("3.");
            System.out.println("4.");
            System.out.println("5.");
            System.out.println("6.");
            System.out.println("7.");
            System.out.println("8.");
            System.out.println("9.");
            System.out.println("10.");
            System.out.println("11.To Exit");
            System.out.print("Please select your option = ");
            int option  = Integer.valueOf(br.readLine());
            
        }
    }
}