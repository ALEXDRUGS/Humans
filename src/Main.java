import java.time.LocalDate;
public class Main {
    public static int currentYear(){
        LocalDate current_date = LocalDate.now();
        return current_date.getYear();
    }
    public static void printHuman(Human human){
        System.out.println("Привет! Меня зовут " + human.getName() + ". Мой год рождения "
                + (currentYear() - human.getYearOfBirth()) + "й. Я живу в городе " + human.getTown()
                + ". Я работаю на должности " + human.getJob() + ". Будем знакомы!");
    }
    public static void main(String[] args) {
        Human human = new Human( "Максим", 35,"Минск", "бренд-менеджер");
        Human human1 = new Human( "Аня", 29,"Москва", "методист образовательных программ");
        Human human2 = new Human( "Катя", 28,"Калининград", "продакт-менеджер");
        Human human3 = new Human( "Артём", 27,"Москва", "директор по развитию бизнеса");
        printHuman(human);
        printHuman(human1);
        printHuman(human2);
        printHuman(human3);
    }
}