// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        int startScore = 500; // Начальный счёт
        int amount = 2500; // Сумма пополнения
        int bonus; // Начисляемый бонус
        if (amount > 1000) {
            bonus = amount / 100;
        } else {
            bonus = 0;
        }

        int TotalScore = startScore + amount + bonus;

        System.out.println("Бонус = " + bonus);
        System.out.println("Итоговый счёт = " + TotalScore);

    }
}
