/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day6.discussion;

public class TernaryOperator {
    public static void main(String[] args) {
       //syntax
       // (cond) ? true block : false block;
       int num = -1;
       
       String result = (num > 0) ? "Positive" : "Negative";
    //    System.out.println(result);
        
        
        float temp = 38.5f;
        
       String tempResult = temp >= 38.5 ? "Fever" : "Normal Temp";
       System.out.println(tempResult);
       
     //  String result = (num == 0) ? "Neutral"
       //        : (num >0) ? "Positive"
       //        : (num > 100) ? "Number is greather than 100"
        //       : "Negative";
    }
}
