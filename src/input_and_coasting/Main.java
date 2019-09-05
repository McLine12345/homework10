package input_and_coasting;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Вкажить вартисть оливця");
        int x = input.nextInt();
        System.out.print("Вкажить килькисть оливця");
        int y = input.nextInt();
        System.out.println("Вартисть " + y +""+ "оливцив = " + x*y +"гривень");
        double z = 5.4;
                z = input.nextDouble();
                int d = (int)input.nextLong();
        System.out.println(d);
        System.out.println("Спасибо за покупку ");
        System.out.println(x);

    }
}
