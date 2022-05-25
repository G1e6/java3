public class Main {
    public static void main(String[] args) {
        int nachsumm = 100; // начальная сумма на счёте
        int summpopolneniya = 1100; //сумма пополнения
        int sumNaSchete;
        int kolichestvobonusov = summpopolneniya / 100; //количество бонусов
        if (summpopolneniya > 1000) {
            sumNaSchete = nachsumm + summpopolneniya + kolichestvobonusov;//сумма на счёте, если пополнение больше 1000
        } else {
            sumNaSchete = nachsumm+ summpopolneniya;//сумма на счёте, если пополнение меньше или равно 1000
        }
        System.out.println("Сумма на счёте = " + nachsumm);
        System.out.println("Количество бонусов = " + kolichestvobonusov);
        System.out.println("Сумма на счёте = " + sumNaSchete);

    }
}

