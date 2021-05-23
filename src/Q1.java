import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

import static java.lang.System.out;

public class Q1 {
    public static Scanner readFile(){
        File file = new File("data1.txt");
        Scanner fileReader = null;

        try {
            fileReader = new Scanner(file);
        } catch (Exception e){
            e.printStackTrace();
        }
        
        return fileReader;
    }

    public static void writeFile(String getResult){
        try {
            FileWriter fileWriter = new FileWriter("result1.txt");
            fileWriter.write(getResult);
            fileWriter.close();
        } catch (Exception e){
            e.printStackTrace();
        }
    }

    public static int randomRange(int n1, int n2){
        return (int)(Math.random() * (n2 - n1 + 1)) + n1;
    }

    public static String getData(Scanner fileReader){
        int readLine = Integer.parseInt(fileReader.nextLine());
        
        int storeRanNum = 0;
        
        double avg = 0; // 평균
        double sum = 0; // 분산 값을 더하기 위한 합
        double breakUp = 0; // 분산
        double standard = 0; // 표준편차

        String result = "";
        String loopResult = "";
        
        for(int i = 1; i <= readLine; i++){
            storeRanNum = randomRange(11, 99);
            avg += storeRanNum / readLine;
            sum += (storeRanNum - avg) * (storeRanNum - avg);
            breakUp = sum / storeRanNum;

            out.print(storeRanNum + " ");
            loopResult += storeRanNum + " ";
        }
        
        standard = Math.sqrt(breakUp);

        out.print("\n");
        out.printf("평균 : %.2f", avg);
        out.print("\n");

        out.printf("분산 : %.2f", breakUp);
        out.print("\n");

        out.printf("표준 편차 : %.2f", standard);
        out.print("\n");

        result = loopResult + "\n" + "평균 : " + String.format("%.2f", avg) + "\n" + "분산 : " + String.format("%.2f", breakUp) + "\n" + "표준 편차 : " + String.format("%.2f", standard);

        return result;
    }

    public static void main(String[] args) {
        Scanner mainMenuInput = new Scanner(System.in);
        System.out.println("선택하세요.\n1. File 입출력\n2. 직접 입력");
        int selectNum = mainMenuInput.nextInt();
        
        Scanner readFile = null;
        
        if(selectNum == 1){
            readFile = readFile();
            String getData = getData(readFile);
            writeFile(getData);
            mainMenuInput.close();
            
        } else if (selectNum == 2){
            readFile = new Scanner(System.in);
            String getData = getData(readFile);
            writeFile(getData);
            mainMenuInput.close();

        }
    }
}
