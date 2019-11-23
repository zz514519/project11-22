
public class TestDemo {
    public static void main(String[] args) {
        DoubleList doubleList = new DoubleList();
        doubleList.addFirst(12);
        doubleList.addFirst(128);
        doubleList.addFirst(7);
        doubleList.addFirst(9);
        doubleList.addFirst(77);
        doubleList.addIndex(2,45);
        doubleList.display();
        doubleList.remove(12);
        doubleList.display();
    }
}
