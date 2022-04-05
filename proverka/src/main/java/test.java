import org.apache.commons.lang3.math.NumberUtils;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число:");
        String s1 = sc.nextLine();

        if (NumberUtils.isParsable(s1) && s1.length() == 6) {
            System.out.println("Ваша строка верна");
        } else {
            System.out.println("Попробуйте другое число");
        }
    }
}

