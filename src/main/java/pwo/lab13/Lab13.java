/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package pwo.lab13;

/**
 *
 * @author Kuba
 */
public class Lab13 {

    public static void main(String[] args) {
        int cnt = 0;
        String s = "asf12gsag45";
        boolean containsDigit = false;
        
       if (s != null && !s.isEmpty()) {
        for (char c : s.toCharArray()) {
            if (containsDigit = Character.isDigit(c)) {
                cnt+=1;
            }
        }
    }
        
        System.out.println("liczba cyfr: " + cnt);
    }
}
