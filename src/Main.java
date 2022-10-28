import static java.lang.Integer.MAX_VALUE;

public class Main {
    public static void main(String[] args) {
        Human human = new Human("Максим", 35, "Минск", "бренд-менеджер");
        Human human1 = new Human("Аня", 29, "Москва", "методист образовательных программ");
        Human human2 = new Human("Катя", 28, "Калининград", "продакт-менеджер");
        Human human3 = new Human("Артём", 27, "Москва", "директор по развитию бизнеса");
        Human human4 = new Human("Владимир", 21, "Казань", "временно не работаю");
        System.out.println(human + "\n" + human1 + "\n" + human2 + "\n" + human3 + "\n" + human4);
        human4.setYearOfBirth(26);
        human4.setTown("Сочи");
        System.out.println(human4);
        Flower rose = new Flower("Роза обыкновенная", "", "Голландия", 35.59, 0);
        Flower hrisanteme = new Flower("Хризантема", "", "", 15.0, 5);
        Flower pion = new Flower("Пион", "", "Англия", 69.9, 1);
        Flower gipsofile = new Flower("Гипсофила", "", "Турция", 19.5, 10);
        System.out.println(rose);
        System.out.println(hrisanteme);
        System.out.println(pion);
        System.out.println(gipsofile);
        Flower[] flower = new Flower[]{rose, rose, rose,
                hrisanteme, hrisanteme, hrisanteme, hrisanteme, hrisanteme, gipsofile};
        getSumCost(flower);
        getLifeDays(flower);

    }
    public static void getSumCost(Flower... flowers) {
        double sum = 0;
        for (Flower value : flowers) {
            if (value.getCost() > 0) {
                sum += value.getCost();
            }
        }
        System.out.printf("Стоимость букета %.2f рублей." + "\n", sum + (sum / 100 * 10));
    }
    public static void getLifeDays(Flower... flower) {
        int daysMin = MAX_VALUE;
        for (Flower value : flower) {
            if (value.lifeSpan < daysMin ) {
                daysMin = value.lifeSpan;
            }
        }
        System.out.println("Букет простоит " + daysMin + " дней.");
    }
}