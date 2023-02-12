import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    private final static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) throws IOException {

    }

    // Конвертация только возможных значений, строку конвертировать в число невозможно
    private static int convertFromStringToInt(String stringNumber){
        try {
            int resultConvert = Integer.parseInt(stringNumber.trim());
            return resultConvert;
        } catch (NumberFormatException e){
            e.printStackTrace();
        }
        return 0;
    }

    private static String getNumberFromFile(String fileName) throws FileNotFoundException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName));
        try {
            String currentLine = bufferedReader.readLine();
            return currentLine;
        } catch (IOException e){
            e.printStackTrace();
        }
        return "LINE IS EMPTY";
    }

    private static String greeding(){
        return "HI, IS A PROGRAM FOR CALCULATING THE NTH TRIANGULAR NUMBER";
    }

    private static int getNumberTerminal(){
        System.out.print("Enter number: ");
        return scan.nextInt();
    }
}