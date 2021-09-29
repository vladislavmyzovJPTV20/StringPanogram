/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stringpanogram;

import java.util.Scanner;

/**
 *
 * @author Влад
 */
public class StringPanogram {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Создаем строку с английской фразой, содержащей все буквы алфавита
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите фразу: ");
        String text = scanner.nextLine();
//        String text = "the quick brown fox jumps over the lazy dog";
        
        // Создаем переменную num типа интеджер и присваеваем ей значение нуля
        // Она нам нужна для того, чтобы мы смогли выяснить, есть ли в таксе все буквы алфавита
        int num = 0;
        
        // Далее мы переводим строку с данными буквами в элементы массива
        char[] letters = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
        
        // Запускаем цикл для того, чтобы проверить, имеются ли все буквы в английской фразе
        // Пробегаем по всем элементам текста и массива с буквами
        // Если буква в тексте и буква в переменной letters совпадают, то мы к переменной num прибавляем единичку
        // И так пока не пройдут все 26 букв
        for(int i = 0; i < letters.length; i++) {
            for(int j = 0; j < text.length(); j++) {
                if(letters[i] == text.charAt(j)) {
                    num++;
                    break;
                }
            }
        }
        
        // Если количество букв равно 26, то данная фраза содержит содержит все буквы английского алфавита
        // В противном случае - не содержит
        if(num == 26) {
            System.out.println("В данном тексте содержатся все буквы английского алфавита");
        }else{
            System.out.println("В данном тексте содержатся не все буквы английского алфавита");
        }
    }
}
