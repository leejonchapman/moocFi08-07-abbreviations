import java.util.HashMap;
import java.util.Locale;

public class Abbreviations {

    HashMap<String, String> abbreviations;

    public Abbreviations() {
        abbreviations = new HashMap<>();
    }

    public void addAbbreviation(String abbreviation, String explanation) {
        abbreviations.put(getSantisedString(abbreviation), getSantisedString(explanation));
    }

    private static String getSantisedString(String santiseString) {
        santiseString = santiseString.toLowerCase(Locale.ROOT);
        santiseString = santiseString.trim();
        return santiseString;
    }

    public boolean hasAbbreviation(String abbreviation) {
        return abbreviations.containsKey(abbreviation);
    }

    public String findExplanationFor(String abbreviation) {
        abbreviation = getSantisedString(abbreviation);
        if (hasAbbreviation(abbreviation)) {
            return abbreviations.get(abbreviation);
        }
        return null;
    }
}
