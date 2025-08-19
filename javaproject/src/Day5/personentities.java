package Day5;

public class personentities {
    private int pid;
    private String name;
    private String city;

    // Constructor
    public personentities(int pid, String name, String city) {
        this.pid = pid;
        this.name = name;
        this.city = city;
    }

    // Getters
    public int getPid() {
        return pid;
    }

    public String getName() {
        return name;
    }

    public String getCity() {
        return city;
    }

    @Override
    public String toString() {
        return "Person [pid=" + pid + ", name=" + name + ", city=" + city + "]";
    }
}
