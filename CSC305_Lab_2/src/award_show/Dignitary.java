package award_show;
import java.util.List;

public class Dignitary {
    String name;
    List<Award> awards;
    List<String> knownFor;

    public Dignitary() {
    }

    public Dignitary(List<Award> awards, List<String> knownFor, String name) {
        this.awards = awards;
        this.knownFor = knownFor;
        this.name = name;
    }

    public List<Award> getAwards() {
        return awards;
    }

    public void setAwards(List<Award> awards) {
        this.awards = awards;
    }

    public List<String> getKnownFor() {
        return knownFor;
    }

    public void setKnownFor(List<String> knownFor) {
        this.knownFor = knownFor;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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