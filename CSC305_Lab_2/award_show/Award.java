package award_show;

public class Award {
    String name;
    int year;

    public Award(String name, int year) {
        this.name = name;
        this.year = year;
    }

    @Override
    public String toString() {
        return name + ", " + year;
    }

}
