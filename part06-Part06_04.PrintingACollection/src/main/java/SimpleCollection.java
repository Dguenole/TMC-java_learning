
import java.util.ArrayList;

public class SimpleCollection {

    private String name;
    private ArrayList<String> element;

    public SimpleCollection(String name) {
        this.name = name;
        this.element = new ArrayList<>();
    }

    public void add(String element) {
        this.element.add(element);
    }

    public ArrayList<String> getElements() {
        return this.element;
    }

   @Override
    public String toString() {
    if (this.element.isEmpty()) {
        return "The collection " + this.name + " is empty.";
    }
    
    String printOutput = "The collection " + this.name + " has " + this.element.size();
    String members = "";
    
    for (String element : this.element) {
        members += element + "\n";
    }
    
    if (this.element.size() == 1) {
        return printOutput + " element:\n" + members.trim();
    } else {
        return printOutput + " elements:\n" + members.trim();
    }
}
}
