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
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите текст на английском языке: ");
        String text = new String(scan.nextLine());
        char[] str = new char[text.length()];
//        String text = "The quick brown fox jumps over the lazy dog"; //Переменная строка text, только состоящая из символов, неизменяемая.
        int count = 0; //Переменная для хранения числа букв алфавита
       
        //Преобразование строки в массив символов.
        char[] letters = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y', 'z'};
       
        for (int x = 0; x < letters.length; x++){ //Индекс массива - x, обьектов в массиве 26. Идёт по значением массива и программа начинает следующий цикл for.
           
            for(int i = 0; i < text.length();i++){ //Цикл проверяет содержится ли данный символ из массива letters в строке text
                if(letters[x] == text.charAt(i)){ //Значение массива (символ) совпадает со символом в текстe, то возвращает символ, находящийся по указанному индексу в строке.
                    count++; //Если всё по условию соблюдается, то к переменной прибавляется 1. (И так до того как ячейки в массиве не закончатся их 26)
                    i = text.length();
                }
                else{
                    str[i] = letters[x];
                    if(str[str.length-1] == letters[x]){
                        System.out.printf("%s", str[str.length-1]);
                        System.out.println();
                    }
                }
            }
           
        }
        //Если переменная имеет значение 26, тоесть в строке есть все буквы алфавита, выполняется следующее.
        if (count == 26){
            System.out.println("Строка содержит все буквы Английского алфавита");
        }
        else{
            System.out.println("Строка не содержит все буквы Английского алфавита ");
           
        }
       
    }
   
}
