package aaa.model;

import lombok.Data;

@Data
public class StudentProduct {
   
   String pname, class1 ;
   int kor, eng, math, sum, avg;
   
   public int getSum() {
      sum = kor + eng + math;
      return sum;
   }
   
   public int getAvg() {
      avg = sum / 3;
      return avg;
   }
   
   
}
