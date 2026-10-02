class Twod {
    public static void main(String[] args) {

        Demo t = new Demo(3, 3);

        t.insert(0, 0, 10);
        t.insert(0, 1, 15);
        t.insert(0, 2, 16);

        t.insert(1, 0, 20);
        t.insert(1, 1, 10);
        t.insert(1, 2, 86);

        t.insert(2, 0, 905);
        t.insert(2, 1, 905);
        t.insert(2, 2, 165);

        System.out.println();

        t.traverse();

        System.out.println();

        t.searchbyvalue(905);

        System.out.println();

        t.searchbyindex(1, 2);

        System.out.println();

        t.deletebyvalue(10);

        System.out.println();

        t.traverse();

        System.out.println();

        t.delete();
    }
}
class Demo {

    int[][] a;

    public Demo(int r, int c) {
        a = new int[r][c];

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                a[i][j] = Integer.MIN_VALUE;
            }
        }

        System.out.println("Array is created");
    }

    // Insert
    void insert(int r, int c, int value) {
        try {
            if (a[r][c] == Integer.MIN_VALUE) {
                a[r][c] = value;
                System.out.println("The value " + value + " is inserted at [" + r + "][" + c + "]");
            } else {
                System.out.println("Cell already occupied");
            }
        } catch (Exception e) {
            System.out.println("Invalid index");
        }
    }

    // Traverse
    void traverse() {
        System.out.println("Array Elements:");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }

    // Search by Value
    void searchbyvalue(int value) {
        boolean found = false;

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (a[i][j] == value) {
                    System.out.println("The value " + value +
                            " is present at [" + i + "][" + j + "]");
                    found = true;
                }
            }
        }

        if (!found) {
            System.out.println("Value not found");
        }
    }

    // Search by Index
    void searchbyindex(int row, int col) {
        try {
            if (a[row][col] == Integer.MIN_VALUE) {
                System.out.println("Array position is empty");
            } else {
                System.out.println("The value is " + a[row][col]);
            }
        } catch (Exception e) {
            System.out.println("Invalid index entered");
        }
    }

    // Delete by Value
    void deletebyvalue(int value) {
        boolean found = false;

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (a[i][j] == value) {
                    a[i][j] = Integer.MIN_VALUE;
                    found = true;
                }
            }
        }

        if (found) {
            System.out.println("Deleted successfully");
        } else {
            System.out.println("Value not found");
        }
    }

    // Delete Entire Array
    void delete() {
        a = null;
        System.out.println("Complete array deleted");
    }
}