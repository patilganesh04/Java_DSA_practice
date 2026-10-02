
class Opration {

    int[] a;

    Opration(int size) {
        a = new int[size];
        for (int i = 0; i < a.length; i++) {
            a[i] = Integer.MIN_VALUE;
        }
        System.out.println("Array is Created");
    }

    public void insert(int index, int v) {
        try {
            if (a[index] == Integer.MIN_VALUE) {
                a[index] = v;
            } else {
                System.out.println("array of indexs alreay filled");
            }
        } catch (Exception e) {
            System.out.println("invalid index");
        }
    }

    public void traverse() {
        try {
            System.out.println("______________________Traverse of array________________________________");
            for (int i = 0; i < a.length; i++) {
                if (a[i] != Integer.MIN_VALUE) {
                    System.out.println("The array index is: " + i + "The value is: " + a[i]);
                }
            }
        } catch (Exception e) {
            System.out.println("The Array is not created yet");
        }
    }

    public void searchByindex(int index) {
        try {
            System.out.println("___________________search by index__________________________");
            if (a[index] != Integer.MIN_VALUE) {
                System.out.println("The index of " + index + " value is: " + a[index]);
            } else {
                System.out.println("Value is Empty");
            }
        } catch (Exception e) {

            System.out.println("The Value is not present");
        }
    }

    public void searchByValue(int value) {
        System.out.println("_________________searh by value___________________");
        for (int i = 0; i < a.length; i++) {
            if (a[i] == Integer.MIN_VALUE) {
                System.out.println("the value " + value + " present at the index " + i);
                return;
            }

        }
        System.out.println("value is not found");
    }

    public void deleteArray() {
        a = null;
        System.out.println("Array is deleted");
    }

    public void deleteByValue(int value) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] == value) {
                a[i] = Integer.MIN_VALUE;
                System.out.println("In Array value:  " + value + "  is deleted");
                return;
            }

        }
        System.out.println("Value not found!");
    }

    // 	//delete by index
    public void deleteByIndex(int index) {
        try {
            if (a[index] != Integer.MIN_VALUE) {
                System.out.println("The Array of Index: " + a[index] + " is deleted");
                a[index] = Integer.MIN_VALUE;
            } else {
                System.out.println("Value is Empty");
            }
        } catch (Exception e) {

            System.out.println("Invalid index");
        }
    }

    public static void main(String[] args) {

        Opration o1 = new Opration(10);
        o1.insert(0, 10);
        o1.insert(1, 30);
        o1.insert(2, 300);
        o1.insert(3, 34);
        o1.insert(4, 34434);
        o1.insert(5, 248434);
        o1.insert(6, 14854);
        o1.insert(7, 48484);
        o1.insert(8, 58484);
        o1.insert(9, 68484);

        o1.traverse();

        o1.searchByindex(3);

        o1.searchByindex(8);
        o1.deleteByIndex(4);
        o1.deleteByValue(300);

    }
}
