
public class InsertInHeap {

    public static final int arr[] = new int[100];
    int s;

    InsertInHeap() {
        s = 0;
    }

    public void insert(int ele) {
        s++;
        arr[s] = ele;
        int index = s;
        while (index > 1) {
            int parent = index / 2;
            if (arr[parent] < arr[index]) {
                // swap
                int temp = arr[parent];
                arr[parent] = arr[index];
                arr[index] = temp;
            }
            index = parent;
        }

    }

    public void delete() {
        arr[1] = arr[s];
        s--;
        while (1 < s) {

        }
    }

    public void print() {
        for (int i = 1; i <= s; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        InsertInHeap h = new InsertInHeap();
        int input[] = { 3, 5, 7, 8, 1, 2, 45, 23, 2 };
        for (int i = 0; i < input.length; i++) {
            h.insert(input[i]);
        }
        h.print();

        h.delete();

    }

}
