public class Main {
    public static void main(String[] args) {
        int firstSum = 100;
        int add = 1500;
        int bonus;
        if (add > 1000) {
            bonus = add / 100;
                    } else {
            bonus = 0;
        }
        int finalSum = firstSum + add + bonus;
        System.out.println("Итоговый счёт: " + finalSum);
        System.out.println("Бонус: " + bonus);
    }

}
