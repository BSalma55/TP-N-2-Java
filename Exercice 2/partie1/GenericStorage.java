import java.util.ArrayList;
import java.util.List;

public class GenericStorage<T> {
    private List<T> elements;

    public GenericStorage() {
        elements = new ArrayList<>();
    }

    public void addElement(T o) {
        elements.add(o);
    }

    public void removeElement(int index) {
        if (index >= 0 && index < elements.size()) {
            elements.remove(index);
        } else {
            System.out.println("Index invalide !");
        }
    }

    public T getElement(int index) {
        if (index >= 0 && index < elements.size()) {
            return elements.get(index);
        } else {
            System.out.println("Index invalide !");
            return null;
        }
    }

    public int getSize() {
        return elements.size();
    }

    public void displayAll() {
        for (T element : elements) {
            System.out.println(element);
        }
    }
}
