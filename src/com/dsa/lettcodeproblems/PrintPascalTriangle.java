package com.dsa.lettcodeproblems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PrintPascalTriangle {

	public static void main(String[] args) {
	
     System.out.println(generate(3));
	}
	
	 public static List<Integer> generate(int numRows) {
		 List<Integer> r = new ArrayList<>();
         List<List<Integer>>  result =new ArrayList<>();
         if(numRows==0){
             return r;
         }
         result.add(Arrays.asList(1));
         List<Integer> resultSet ;
         for(int i=1;i<=numRows;i++){
             resultSet = new ArrayList<>();
              resultSet.add(1);
            List<Integer> prevRow=result.get(i-1);  
             for(int j=1;j<i;j++){
               resultSet.add(prevRow.get(j-1)+prevRow.get(j));
             }
             resultSet.add(1);
              result.add(resultSet);
         }
         r.addAll(result.get(numRows));
        return r;
    }

}
