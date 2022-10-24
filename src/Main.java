public class Main {
    public static void main(String[] args) {
        Human human = new Human( "Максим", 35,"Минск", "бренд-менеджер");
        Human human1 = new Human( "Аня", 29,"Москва", "методист образовательных программ");
        Human human2 = new Human( "Катя", 28,"Калининград", "продакт-менеджер");
        Human human3 = new Human( "Артём", 27,"Москва", "директор по развитию бизнеса");
        Human human4 = new Human( "Владимир", 21,"Казань", "временно не работаю");
        System.out.println(human + "\n" + human1 + "\n" +human2 + "\n" +human3 + "\n" +human4);
        human4.setYearOfBirth(26);
        human4.setTown("Сочи");
        System.out.println(human4);
        Flower flower1 = new Flower("Роза обыкновенная", "", "Голландия", 35.59, 0);
        Flower flower2 = new Flower("Хризантема", "", "", 15.0, 5);
        Flower flower3 = new Flower("Пион", "", "Англия", 69.9, 1);
        Flower flower4 = new Flower("Гипсофила", "", "Турция", 19.5, 10);
        System.out.println(flower1);
        System.out.println(flower2);
        System.out.println(flower3);
        System.out.println(flower4);

    }
}