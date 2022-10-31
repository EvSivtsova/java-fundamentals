import java.util.ArrayList;

public class NameSearch {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<String>();

        names.add("Kyle");
        names.add("Sophie");
        names.add("Graeme");

        String nameToFind = "Lisa";

        NameSearch app = new NameSearch();
        Boolean result = app.isInArray(names, nameToFind);

        if (result) {
            System.out.println("The name is in the array. Yay!");
        } else {
            System.out.println("The name couldn't be found in the array - sorry...");
        }
    }
    
    public boolean isInArray( ArrayList<String> names, String nameToFind) {
        for (String name : names) {
            if (name == nameToFind) {
                return true;
            }
        } 

        return false;
    }  
}