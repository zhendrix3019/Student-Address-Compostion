package composition;

public class Student {

    private Address address;
    private String name;
    private int age;

    public Student(Address address, String name, int age) {
        this.address = address;
        this.name = name;
        this.age = age;
    }

    public Student(String s, int i, String wisconsin, String s1, String sueShoe, int i1) {
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getState() {
        return ":)";
    }
}