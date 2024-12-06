package task2;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Award {
    private final String name;
    private final int year;

    @JsonCreator
    private Award(@JsonProperty("name") String name,
                  @JsonProperty("year") int year) {
        this.name = name;
        this.year = year;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("year")
    public int getYear() {
        return year;
    }

    @Override
    public String toString() {
        return name + ", " + year;
    }
}