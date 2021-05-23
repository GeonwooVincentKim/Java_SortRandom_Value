import java.util.*;

import static java.lang.System.out;

public class Solution{
    // public static void main(String[] args){
    //     Scanner sc = new Scanner(System.in);
    //     int T = sc.nextInt();
        
    //     for(int i = 1; i<= T; i++)
    //     {
    //         int tc = sc.nextInt();
    //         int maxScore = 0;		
    //         int scores[] = new int[1000];		//점수
    //         int count[]  = new int[101];		//0~100 카운트
       
    //         for(int j =0; j< 1000; j++) 
    //         {
    //             scores[j] = sc.nextInt();		//점수입력
    //             count[scores[j]] ++ ;			//해당 점수 cnt ++
    //         }
            
    //         for(int j =0; j<count.length -1 ; j++)
    //         {
    //             if(count[maxScore] <= count[j]) 
    //             { maxScore = j; }
    //         }
    //         System.out.println("#" + tc + " " + maxScore);
    //     }
    // }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        for(int i =0;i<10;i++) {
            arr[i] = sc.nextInt();
            // out.print(i + " i 값\n");
        }
        int[] cnt = new int[10];
        for(int i =0;i<10;i++) {
            cnt[arr[i]]++;
        }
        int chi = 0;
        int chicnt = 0;
        for(int i =0;i<10;i++) {
            if(chicnt< cnt[i]) {
                chicnt = cnt[i];
                chi = i; 
            }
        }
        System.out.println("최빈수는 "+ chi+ "최빈수가 나온 횟수는 "+ chicnt);
    }
}