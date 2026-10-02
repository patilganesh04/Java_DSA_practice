public class Studentdet1 {
    String std_name;
    int std_id;
    double marks;
    Studentdet1(String std_name, int std_id, double marks) {
        this.std_name = std_name;
        this.std_id = std_id;
        this.marks = marks;
    }

    public String toString() {
        return "Student ID: " + std_id +
               " Name: " + std_name +
               " Marks: " + marks;
    }
}

class Studentdet12 {

    Studentdet1[] s;

    Studentdet12(int size) {
        s = new Studentdet1[size];
    }

    // Insert
    public void insert(int index, Studentdet1 value) {
        try {
            if (s[index] == null) {
                s[index] = value;
                System.out.println("Value inserted");
            } else {
                System.out.println("Index already occupied");
            }
        } catch (Exception e) {
            System.out.println("Invalid index");
        }
    }

    // Traverse
    public void traverse() {
        System.out.println("------ Students ------");

        for (int i = 0; i < s.length; i++) {
            if (s[i] != null) {
                System.out.println(s[i]);
            }
        }
    }

    // Search by Index
    public void searchByIndex(int index) {
        try {
            if (s[index] != null) {
                System.out.println("Found: " + s[index]);
            } else {
                System.out.println("No student at this index");
            }
        } catch (Exception e) {
            System.out.println("Invalid index");
        }
    }

    // Search by Reference
    public void searchByValue(Studentdet1 value) {
        for (int i = 0; i < s.length; i++) {
            if (s[i] == value) {   // reference comparison
                System.out.println("Student found at index " + i);
                return;
            }
        }
        System.out.println("Student not found");
    }

    // Delete by Reference
    public void deleteByValue(Studentdet1 value) {
        for (int i = 0; i < s.length; i++) {
            if (s[i] == value) {   // reference comparison
                s[i] = null;
                System.out.println("Student deleted");
                return;
            }
        }
        System.out.println("Student not found");
    }

    // Delete by Index
    public void deleteByIndex(int index) {
        try {
            if (s[index] != null) {
                System.out.println("Deleted: " + s[index]);
                s[index] = null;
            } else {
                System.out.println("No student at this index");
            }
        } catch (Exception e) {
            System.out.println("Invalid index");
        }
    }

    // Delete Whole Array
    public void deleteArray() {
        s = null;
        System.out.println("Array deleted");
    }

    public static void main(String[] args) {

        Studentdet12 obj = new Studentdet12(5);

       
        obj.insert(0, new Studentdet1("Ganesh", 101, 85.5));
        obj.insert(1, new Studentdet1("Rahul", 102, 90.0));
        obj.insert(2, new Studentdet1("Kiran", 103, 95.0));

        obj.traverse();
        

             

        
    }
}