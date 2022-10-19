import java.time.LocalDate;
public class Main {
    public static int currentYear(){
        LocalDate current_date = LocalDate.now();
        return current_date.getYear();
    }
    public static void printHuman(Human human){
        System.out.println("Привет! Меня зовут: " + human.getName() + ". Мой год рождения: "
                + (currentYear() - human.getYearOfBirth()) + "й. Я живу в городе: " + human.getTown());
    }
    public static void main(String[] args) {
        Human human = new Human( "Максим", 35,"Минск");
        Human human1 = new Human( "Аня", 29,"Москва");
        Human human2 = new Human( "Катя", 28,"Калининград");
        Human human3 = new Human( "Артём", 27,"Москва");
        printHuman(human);
        printHuman(human1);
        printHuman(human2);
        printHuman(human3);
    }
}