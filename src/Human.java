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

    public Human(String name,int yearOfBirth, String town, String job) {
        this.yearOfBirth = yearOfBirth;
        this.name = name;
        this.town = town;
        this.job = job;
    }
}
