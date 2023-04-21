// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        int starting_score = 500; // Начальный счёт
        int y = starting_score;
        int replenishment_amount = 2500; // Сумма пополнения
        int x = replenishment_amount;

        int bonus; // Начисляемый бонус
        if (x > 1000) {
            bonus = x / 100;
        } else {
            bonus = 0;
        }

        int Total_score = y + x + bonus;

        System.out.println("Бонус = " + bonus);
        System.out.println("Итоговый счёт = " + Total_score);

    }
}
