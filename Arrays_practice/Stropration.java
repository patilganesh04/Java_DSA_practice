
public class Stropration {

    String[] str;

    Stropration(int size) {
        str = new String[size];
        System.out.println("String is created");
    }
//String insertion

    public void Insert(int index, String value) {

        try {
            if (str[index] == null) {
                str[index] = value;
                System.out.println("value is inserted");
            } else {
                System.out.println("Index is already have value");
            }
        } catch (Exception e) {
            System.out.println("invalid index");
        }

    }

    //String traverse
    public void Traverse() {
        System.out.println("___________________________Traverse____________________________");
        try {
            for (int i = 0; i < str.length; i++) {
                if (str[i] != null) {
                    System.out.println(str[i]);
                }
            }
        } catch (Exception e) {
            System.out.println("The Array is not created yet");
        }
    }

    //string search by index
    public void searchByindex(int index) {
        System.out.println("____________________________search by index_______________________");
        try {
            if (str[index] != null) {
                System.out.println("The index of " + index + " value is: " + str[index]);
            } else {
                System.out.println("Value is Empty");
            }
        } catch (Exception e) {

            System.out.println("The Value is not present");
        }
    }

    //search by value
    public void searchByValue(String value) {
        System.out.println("_____________________search by value________________________________");
        for (int i = 0; i < str.length; i++) {
            if (str[i] == value) {
                System.out.println("the value " + value + " present at the index " + i);
                return;
            }

        }
        System.out.println("value is not found");
    }

    //delete array
    public void deleteArray() {
        System.out.println("____________delete array______________________");
        str = null;
        System.out.println("Array is deleted");
    }

    //delete by value
    public void deleteByValue(String value) {
        System.out.println("____________________delete by value________________");
        for (int i = 0; i < str.length; i++) {
            if (str[i] == value) {
                str[i] = null;
                System.out.println("The Employee " + value + "  is deleted");
                return;
            }

        }
        System.out.println("Value not found!");
    }

    // 	//delete by index
    public void deleteByIndex(int index) {
        System.out.println("_______________________delete by index______________");
        try {
            if (str[index] != null) {
                System.out.println("The Employee " + str[index] + " is deleted");
                str[index] = null;
            } else {
                System.out.println("Value is Empty");
            }
        } catch (Exception e) {

            System.out.println("Invalid index");
        }
    }

    public static void main(String[] args) {
        Stropration s1 = new Stropration(5);

        s1.Insert(0, "Ganesh");
        s1.Insert(1, "KushalBenne");
        s1.Insert(2, "Pravin");
        s1.Insert(3, "dinga");
        s1.Insert(4, "dingi");
        s1.Traverse();
    }

}
