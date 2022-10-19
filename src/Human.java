public class Human {
    private final int yearOfBirth;
    private final String name;
    private final String town;

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public String getName() {
        return (String) name;
    }

    public String getTown() {
        return town;
    }

    public Human(String name,int yearOfBirth, String town) {
        this.yearOfBirth = yearOfBirth;
        this.name = name;
        this.town = town;
    }
}
