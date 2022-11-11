/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pwo.lab13;

/**
 *
 * @author Kuba
 */
public class Text {
    
    static Integer cnt = 0;
    static boolean containsDigit = false;
    static boolean cont5Dig(String str){
        return str.replaceAll("[^0-9]", "").length()==5;
       } 
    
     static int CountDig(String str){
       
         if (str != null && !str.isEmpty()) {
        for (char c : str.toCharArray()) {
            if (containsDigit = Character.isDigit(c)) {
                cnt+=1;
            }
        }
    }
        return cnt;
}
    
     static boolean isContainDigit(String str){
    
        return str.matches(".*\\d+.*");
        
    }
     
    static boolean isNumeric(String str) {
    
        return str.matches("-?\\d+(\\.\\d+)?");
    }
}
