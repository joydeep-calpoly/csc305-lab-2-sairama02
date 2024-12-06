package task2;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class Dignitary {
    private final String name;
    private final List<Award> awards;
    private final List<String> knownFor;

    @JsonCreator
    public Dignitary(@JsonProperty("awards") List<Award> awards, @JsonProperty("knownFor") List<String> knownFor, @JsonProperty("name") String name) {
        this.awards = awards;
        this.knownFor = knownFor;
        this.name = name;
    }

    @JsonProperty
    public List<Award> getAwards() {
        return awards;
    }

    @JsonProperty
    public List<String> getKnownFor() {
        return knownFor;
    }

    @JsonProperty
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();
        str.append(name).append("\n");
        str.append("\n");
        str.append("Known For:\n");
        for (String known : knownFor) {
            str.append("\t").append(known).append("\n");
        }
        str.append("\n");
        str.append("Awards:\n");
        for (Award award : awards) {
            str.append("\t").append(award.toString()).append("\n");
        }
        return str.toString();
    }
}