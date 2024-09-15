import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //Задание 1
        int[] pay = {3000, 2000, 1500, 2280, 800,};
        int payments = 0;
        for (int index = 0; index < pay.length; index++) {
            payments = payments + pay[index];
        }
        System.out.println("Сумма трат за месяц составила " + payments + " рублей");
        System.out.println();

        //Задание 2
        int[] wastes = {700, 600, 800, 1000, 900,};
        Arrays.sort(wastes);
        System.out.println(Arrays.toString(wastes));
        System.out.println("Минимальная сумма трат" +
                " за неделю составила " + wastes[0] + " рублей");
        System.out.println(" Максимальная сумма трат за неделю " +
                "составила " + wastes[wastes.length - 1] + " рублей");


        //Задача 3
        double averageWastes = 0;
        for (int i = 0; i < pay.length; i++) {
            averageWastes = payments / pay.length;
        }
        System.out.println("Средняя сумма трат" +
                " за месяц составила " + averageWastes + " рублей");
        System.out.println();

        //Задание 4
        char[] reversFullName = {'n', 'a', 'v', 'I', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reversFullName.length - 1; i >= 0; i--) {
            System.out.print(reversFullName[i]);
        }

    }
}