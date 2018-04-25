
public class Main {

    public static void main(String[] args) {
        Child child = new Child();
        child.setName("my-name");
        System.out.println(child.getName()); // prints my-name
        System.out.println(child.getNameParent()); // prints null
    }

}
