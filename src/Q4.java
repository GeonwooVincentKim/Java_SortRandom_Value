import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

import static java.lang.System.out;

public class Q4{
    public static Scanner readFile(){
        File file = new File("data4.txt");
        Scanner fileReader = null;

        try {
            fileReader = new Scanner(file);
        } catch (Exception e){
            e.printStackTrace();
        }

        return fileReader;
    }

    public static void writeFile(String getResult){
        FileWriter fileWriter = null;

        try {
            fileWriter = new FileWriter("result4.txt");
            fileWriter.write(getResult);
            fileWriter.close();
        } catch (Exception e){
            e.printStackTrace();
        }
    }

    public static String getData(Scanner fileReader){
        int readLine = Integer.parseInt(fileReader.nextLine());
        
        String getData = "";
        char splitData[] = null;
        String splitLine[] = null;
        int []splitValue = null;

        char cnt = 'A';

        for(int i = 1; i <= readLine; i++){
            // System.out.println(readLine);
            getData = fileReader.next();
            // splitLine = getData.split("");
            for(int j = 0; j < 10; j++){
                for(int k = 0; k < 10; k++){
                    System.out.print(getData.charAt(k) + " ");
                }
                // out.print(getData + " : " + j + " ");
            }
            // System.out.println(getData + " : 현재 줄 : " + i);
        }

        String result = "";
        return result;
    }

    public static void mainGetData(Scanner readData){
        String getResult = getData(readData);
        writeFile(getResult);
    }
    
    public static void main(String[] args) {
        Scanner selectMainMenu = new Scanner(System.in);
        out.println("선택하세요\n1. File 입출력\n2. 직접 입력");
        int selectNum = selectMainMenu.nextInt();
        
        Scanner fileReader = null;

        if(selectNum == 1){
            fileReader = readFile();
            mainGetData(fileReader);
            selectMainMenu.close();

        } else if(selectNum == 2){
            fileReader = new Scanner(System.in);
            mainGetData(fileReader);
            selectMainMenu.close();
        }
    }
}