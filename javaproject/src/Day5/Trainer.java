package Day5;

public class Trainer extends personentities {
    private int eid;
    private String designation;
    private String location;

    // Constructor
    public Trainer(int pid, String name, String city, int eid, String designation, String location) {
        super(pid, name, city);  // Call parent constructor
        this.eid = eid;
        this.designation = designation;
        this.location = location;
    }

    @Override
    public String toString() {
        return "Trainer [personId=" + super.getPid() +
                " Person name=" + super.getName() +
                " City=" + super.getCity() +
                ", eid=" + eid +
                ", designation=" + designation +
                ", location=" + location + "]";
    }
}
