package home;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ScoreTest {

   public static void main(String[] args) {
      // TODO Auto-generated method stub
      Scanner sc = new Scanner(System.in);
      ArrayList<Double> score = new ArrayList<Double>();
      
      for(int i = 0; i < 10; i++) {
         System.out.print((i+1)+"번째 점수: ");
         score.add(sc.nextDouble());
      }
      
      score.sort(null);
      
      score.remove(score.size()-1);
      score.remove(0);
      
      System.out.println("**받은 점수**");
      System.out.println(score);
   }

}