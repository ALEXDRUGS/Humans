import java.time.LocalDate;

public class Human {
    private int yearOfBirth;
    private final String name;
    private String town;

    private final String job;
    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public String getName() {
        return name;
    }

    public String getTown() {
        return town;
    }

    public String getJob() {
        return job;
    }

    public void setYearOfBirth(int yearOfBirth) {
        if (yearOfBirth > 0) {
            this.yearOfBirth = LocalDate.now().getYear() - yearOfBirth;
        } else {
            this.yearOfBirth = 0;
        }
    }

    private static final String str = "Информация отсутствует";

    public void setTown(String town) {
        if (town != null && !town.isEmpty() && !town.isBlank()) {
            this.town = town;
        } else {
            this.town = str;
        }
    }

    public Human(String name, int yearOfBirth, String town, String job) {
        if (yearOfBirth <= 0) {
            this.yearOfBirth = getYearOfBirth() + LocalDate.now().getYear();
        }
        this.yearOfBirth = LocalDate.now().getYear() - yearOfBirth;

        if (name != null && !name.isEmpty() && !name.isBlank()) {
            this.name = name;
        } else {
            this.name = str;
        }
        if (town != null && !town.isEmpty() && !town.isBlank()) {
            this.town = town;
        } else {
            this.town = str;
        }
        if (job != null && !job.isEmpty() && !job.isBlank()) {
            this.job = job;
        } else {
            this.job = str;
        }
    }

    @Override
    public String toString() {
        return "Привет! Меня зовут " + name + ". Мой год рождения "
                + yearOfBirth + "й. Я живу в городе " + town
                + ". Я работаю на должности " + job + ". Будем знакомы!";
    }
}

