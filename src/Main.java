public class Main {
    public static void main(String[] args) {
        int initialAmount = 100; // начальная сумма на счёте
        int replenishmentAmount = 1100; //сумма пополнения
        int accountAmount;
        int numberOfBonuses = replenishmentAmount / 100; //количество бонусов
        if (replenishmentAmount > 1000) {
            accountAmount = initialAmount + replenishmentAmount + numberOfBonuses;//сумма на счёте, если пополнение больше 1000
        } else {
            accountAmount = initialAmount + replenishmentAmount;//сумма на счёте, если пополнение меньше или равно 1000
        }
        System.out.println("Сумма на счёте = " + initialAmount);
        System.out.println("Количество бонусов = " + numberOfBonuses);
        System.out.println("Сумма на счёте = " + accountAmount);

    }
}

