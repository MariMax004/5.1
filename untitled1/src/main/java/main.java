import sun.misc.FloatingDecimal;

import java.sql.SQLOutput;
import java.util.Scanner;

public class main {


    public static void main(String args[]) {
        
        float a = in_number("a");
        float b = in_number("b");
        float c = in_number("c");
        float d = in_number("d");

        float answer = (a+b)/(c+d);
        if((c+d)==0)
            System.out.println("Функция не может быть посчитана так как знаменатель равен 0");
        System.out.println("A(a,b,c,d) = "+answer);

    }


    public static float in_number(String string) {
        Scanner in = new Scanner(System.in);
        while (true) {
            System.out.println("Введите " + string);
            try {
                float num=Float.parseFloat(in.next().trim().replaceAll(",", "\\."));
                if((num <=Float.MAX_VALUE)&&(num>=Float.MIN_VALUE))
                return num;
                else System.out.println("Число вышло за границы допустимого");
            } catch (NumberFormatException ignored) {
                System.out.println("Число должно быть вещественного типа");
            }
            }
        }

}
