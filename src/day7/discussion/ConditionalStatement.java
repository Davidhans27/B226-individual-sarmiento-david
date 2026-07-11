
package day7.discussion;

public class ConditionalStatement {
    public static void main(String[] args) {
         float temp = 38.5f;

        if (temp >= 38.5) {
            System.out.println("Fever");
        } else {
            System.out.println("Normal Temp");
        }
    }
}
    /*
        float temp = 38.5f;
        
        String tempResult = temp >= 38.5 ? "Fever" : "Normal Temp";
        System.out.println(tempResult);

    }
    
       
        int num = 0;
        
        String numberType;
        
        // Simple-if / if-else / if-else-if ladder
        if (num > 0) {
            numberType = "Positive";
        } else if  (num < 0){
            numberType = "Negative";
        } else {
            numberType = "Neutral";
        }
        System.out.println(numberType);*/
