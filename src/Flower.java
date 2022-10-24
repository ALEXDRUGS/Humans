public class Flower {
    private String name;
    private String flowerColor;
    private String country;
    private double cost;
    int lifeSpan;

    public String getName() {
        return name;
    }

    public String getFlowerColor() {
        return flowerColor;
    }

    public String getCountry() {
        return country;
    }

    public double getCost() {
        return cost;
    }

    public void setName(String name) {
        if (name != null && !name.isEmpty() && !name.isBlank()) {
            this.name = name;
        }
    }

    public void setFlowerColor(String flowerColor) {
        if (flowerColor == null || flowerColor.isEmpty() || flowerColor.isBlank()) {
            flowerColor = "белый";
        }
        this.flowerColor = flowerColor;
    }

    public void setCountry(String country) {
        if (country == null || country.isEmpty() || country.isBlank()) {
            country = "Россия";
        }
        this.country = country;
    }

    public void setCost(double cost) {
        if (cost <= 0) {
            cost = 1.0;
        }
        this.cost = cost;
    }

    public Flower(String name, String flowerColor, String country, double cost, int lifeSpan) {
        this.name = name;

        if (flowerColor == null || flowerColor.isEmpty() || flowerColor.isBlank()) {
            flowerColor = "белый";
        }
        this.flowerColor = flowerColor;

        if (country == null || country.isEmpty() || country.isBlank()) {
            country = "Россия";
        }
        this.country = country;

        if (cost <= 0) {
            cost = 1.0;
        }
        this.cost = cost;

        if (lifeSpan <= 0) {
            lifeSpan = 3;
        }
        this.lifeSpan = lifeSpan;
    }

    @Override
    public String toString() {
        return String.format("Название " + name + ". " + "Цвет " + flowerColor + ". " +
                "Страна " + country + ". " + "Цена %.2f. " +
                "Простоит " + lifeSpan + " дней.", cost);
    }
}
