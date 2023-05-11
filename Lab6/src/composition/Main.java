package composition;

public class Main {

    public static void main(String[] args) {
        composition.Student student1 = new composition.Student("750 Main St.", 55555, "Wisconsin", "414-262-5555", "Sue Shoe", 23);
        composition.Student student2 = new composition.Student("555 1st North St.", 51515, "Illinois", "262-414-5555", "Bob Fredrickson", 32);

        System.out.println(student1.getName() + " is from " + student1.getState());
        System.out.println(student2.getName() + " is from " + student2.getState());
    }
}