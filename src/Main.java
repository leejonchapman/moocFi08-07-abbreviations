public class Main {
    public static void main(String[] args) {
        Abbreviations test = new Abbreviations();
        test.addAbbreviation("NASA", "National Auto Space Administration");
        System.out.println(test.findExplanationFor("NASA"));
    }
}