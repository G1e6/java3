public class Main {
    public static void main(String[] args) {
        int x = 100; // начальная сумма на счёте
        int y = 1100; //сумма пополнения
        //int k; //количество бонусов
        int sum;
        int kb = y / 100; //количество бонусов
        if (y > 1000) {
            sum = x + y + kb;//сумма на счёте, если пополнение больше 1000
        } else {
            sum = x + y;//сумма на счёте, если пополнение меньше или равно 1000
        }
        System.out.println("Сумма на счёте = " + x);
        System.out.println("Количество бонусов = " + kb);
        System.out.println("Сумма на счёте = " + sum);

    }
}

