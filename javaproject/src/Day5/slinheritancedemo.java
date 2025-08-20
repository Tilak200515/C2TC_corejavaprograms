package Day5;

public class slinheritancedemo {
    public static void main(String[] args) {
        Trainer t = new Trainer(112, "Thamizhselvan", "Puducherry", 501, "Trainer", "Chennai");
        System.out.println(t);

        personentities p = new personentities(113, "Lingesh", "Puducherry");
        System.out.println(p);
    }
}
