import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Driver {
    public static void main(String[] args) throws FileNotFoundException ,IOException,ArithmeticException{
        ArrayList<ElectronicDevices> myList =new ArrayList<ElectronicDevices>();
        File file;
        Scanner in;

        try {
            file = new File("myFile.txt");
            in = new Scanner(file);
            while (in.hasNextLine()) {
                String line = in.nextLine();
                String[] arrayLine = line.split(" ");
                if (arrayLine[0].equals("Smartphones")) {
                    myList.add(new Smartphones(Double.parseDouble(arrayLine[1]), arrayLine[2]
                            ,Double.parseDouble(arrayLine[3]),Double.parseDouble(arrayLine[4])));
                } else if (arrayLine[0].equals("CoffeeMachines")) {
                    myList.add(new CoffeeMachines(Double.parseDouble(arrayLine[1]), arrayLine[2]));
                }else if (arrayLine[0].equals("MemoryFlash")) {
                    myList.add(new MemoryFlash(Double.parseDouble(arrayLine[1]), arrayLine[2]));
                }

            }
            in.close();


        }  catch (IOException e) {
            e.printStackTrace();
        }
        for (ElectronicDevices tmp : myList) {
            System.out.println("====================");

            tmp.printReport();
            System.out.println("====================");

        }



    }
}
