//Notes from Class 03/28/2023
import java.util.ArrayList;
import java.util.List;

public class Collections {
  public static void main(String[] args) {
    String[] names =new String[] {
        "George", "Ava"
    };
    
    String[] tempNames = new String[names.length + 1];
    for(int index = 0; index < names.length; index++) {
      tempNames[index] = names[index];
    }
    tempNames[tempNames.length - 1] = "Deanna";
    
    ArrayList<String> lastNames = new ArrayList<String>();
    lastNames.add("Smith");
    lastNames.add("Thompson");
    for(String lastName : lastNames) {
      System.out.println(lastName);
    }
    
    for(int index = 0; index < lastNames.size(); index++) {
      System.out.println(lastNames.get(index));
    }
    
    int thisIsAPrimitive = 0;
    List<Integer> temperatures = new ArrayList<Integer>();
    temperatures.add(90);
    temperatures.add(32);
    //temperatures.add(new (75));
  }

}
