import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    private final static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        System.out.print("Choose 1 read from file, choose 2 if read from console: ");
        int userSelect = scan.nextInt();

        if (userSelect == 1){
            System.out.println(greeding());
            String FILE = "src/number.txt";
            String getNumber = getNumberFromFile(FILE);
            int convertNumber = convertFromStringToInt(getNumber);
            System.out.printf("И так, мы ищем %d-е треугольное число\n", convertNumber);
            System.out.println("Происходит вычисление...");
            int resultNumber = TriangleDigit(convertNumber);
            System.out.printf("%d-e треугольное число = %d\n", convertNumber, resultNumber);
        } else if (userSelect == 2) {
            System.out.println(greeding());
            int resultNumber = getNumberTerminal();
            System.out.printf("И так, вы ввели число %d\n", resultNumber);
            System.out.println("Производится расчет...");
            System.out.printf("%d-e треугольное число = %d\n", resultNumber, TriangleDigit(resultNumber));
        } else System.out.println("entered uncorect data");
    }

    private static int TriangleDigit(int number) {
        return (number * (number + 1)) / 2;
    }


    private static int convertFromStringToInt(String stringNumber) {
        try {
            return Integer.parseInt(stringNumber.trim());
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
        return 0;
    }

    private static String getNumberFromFile(String fileName) throws FileNotFoundException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName));
        try {
            return bufferedReader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "СТРОКА ПУСТАЯ";
    }

    private static String greeding() {
        return "ПРИВЕТ, ЭТО ПРОГРАММА ВЫЧИСЛЕНИЯ Н-ГО ТРЕУГОЛЬНОГО ЧИСЛА";
    }

    private static int getNumberTerminal() {
        System.out.print("Введи число: ");
        return scan.nextInt();
    }
}