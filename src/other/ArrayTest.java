package other;

public class ArrayTest {
    public static void main(String[] args) {
        CArray array = new CArray(3);
        array.insert(1);
        array.insert(2);
        array.insert(3);
        array.insert(4);
        array.removeAt(1);
        System.out.println("array.indexOf(2) = " + array.indexOf(2));
        System.out.println("array.max() = " + array.max());
        array.print();
    }
}
