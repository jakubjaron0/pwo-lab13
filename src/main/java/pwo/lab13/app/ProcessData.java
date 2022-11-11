/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pwo.lab13.app;

import java.util.Arrays;


/**
 *
 * @author Kuba
 */
public class ProcessData {

    public enum Action {
        UNDEFINE, SUM, MAX
    }

    public Double process(Action action, double[] numbers) {
        switch (action) {
            case SUM:
                return sum(numbers);
            case MAX:
                return max(numbers);
            default:
                return null;
        }
    }

    /*
 Sumuje liczby przekazane jako tablica i zwraca wynik.
 Jeżeli tablica jest pusta, to zwraca null.
     */
    private Double sum(double[] numbers) {
        return Arrays.stream(numbers).sum();
    }

    /*
 Przeszukuje przekazaną tablicę liczb i zwraca
 maksymalną. Jeżeli tablica jest pusta, to zwraca null.
     */
    private Double max(double[] numbers) {
        return Arrays.stream(numbers).max().getAsDouble();    
    }
}
