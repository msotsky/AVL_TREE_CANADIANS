import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class test {
    public static void main(String[] args)throws FileNotFoundException{
        //Francoise,Rautenstrauch,2335 Canton Hwy #6,Windsor,ON,N8N 3N2,519-569-8399,francoise.rautenstrauch@rautenstrauch.com
        Scanner sc = new Scanner(new File("canadians.csv"));
        ArrayList<Resident> resList = new ArrayList<>();
        while(sc.hasNextLine()){
            String line = sc.nextLine();
            String[] arrLine = line.split(",");
            //Resident(String fName, String lName, String street, String city, String prov, String postal, String phone, String email)
            resList.add(new Resident(arrLine[0], arrLine[1], arrLine[2], arrLine[3], arrLine[4], arrLine[5], arrLine[6], arrLine[7]));
        }
        System.out.println(resList.get(0).getFirstName());
    }
}
