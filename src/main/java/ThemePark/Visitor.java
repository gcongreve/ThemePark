package ThemePark;

public class Visitor {

    private int age;
    private Double height;
    private Double money;

    public Visitor(int age, Double height, Double money) {
        this.age = age;
        this.height = height;
        this.money = money;
    }

    public int getAge() {
        return age;
    }

    public Double getHeight() {
        return height;
    }

    public Double getMoney() {
        return money;
    }
}
