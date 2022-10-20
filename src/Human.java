import java.time.LocalDate;
import java.util.Objects;

public class Human {
    private final int yearOfBirth;
    private final String name;
    private final String town;

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

    public Human(String name, int yearOfBirth, String town, String job) {
        if (yearOfBirth <= 0) {
            yearOfBirth = getYearOfBirth() + LocalDate.now().getYear();
        }
        this.yearOfBirth = yearOfBirth;
        String str = "Информация отсутствует";
        this.name = Objects.requireNonNullElse(name, str);
        this.town = Objects.requireNonNullElse(town, str);
        this.job = Objects.requireNonNullElse(job, str);
    }
}

