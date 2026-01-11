public class TestGenericStorage {
    public static void main(String[] args) {
        GenericStorage<Integer> intStorage = new GenericStorage<>();
        intStorage.addElement(10);
        intStorage.addElement(20);
        intStorage.addElement(30);
        System.out.println("Integer List:");
        intStorage.displayAll();
        System.out.println("Element at index 1: " + intStorage.getElement(1));
        intStorage.removeElement(1);
        System.out.println("After removing index 1:");
        intStorage.displayAll();

        GenericStorage<String> stringStorage = new GenericStorage<>();
        stringStorage.addElement("Java");
        stringStorage.addElement("Python");
        stringStorage.addElement("C++");
        System.out.println("\nString List:");
        stringStorage.displayAll();

        GenericStorage<Double> doubleStorage = new GenericStorage<>();
        doubleStorage.addElement(1.5);
        doubleStorage.addElement(2.5);
        doubleStorage.addElement(3.5);
        System.out.println("\nDouble List:");
        doubleStorage.displayAll();
    }
}
