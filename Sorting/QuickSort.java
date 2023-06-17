public class QuickSort {
    public static void main(String[] args) {

    }

    }
    ///
    // Online C++ compiler to run C++ program online
    #include<iostream>

using namespace std;

    int part(int arr[], int start, int end) {
        int pivot = arr[start];
        int count = 0;
        for (int i = start + 1; i <= end; i++) {
            if (arr[i] <= pivot) {
                count++;
            }
        }
        int finalIndex = start + count;
        int temp = arr[start];
        arr[start] = arr[finalIndex];
        arr[finalIndex] = temp;

        int i = start, j = end;
        while (i < finalIndex && j > finalIndex) {
            while (arr[i] <= pivot) {
                i++;
            }
            while (arr[j] > pivot) {
                j--;
            }
            if (i < finalIndex && j > finalIndex) {
                int temp1 = arr[i];
                arr[i] = arr[j];
                arr[j] = temp1;
                i++;
                j--;
            }

        }
        return finalIndex;
    }

    void quickSort(int arr[], int start, int end) {
        if (start >= end) {
            return;
        }

        int Pindex = part(arr, start, end);

        // left part
        quickSort(arr, start, Pindex - 1);
        // right part
        quickSort(arr, Pindex + 1, end);
    }

int main() {
    int arr[] = {1,4,6,23,56,76,98,34,3,56,77,87,90};
    quickSort(arr,0,12);
    for(int i=0; i<13;i++){
        cout<<arr[i]<<" ";
    }

    return 0;
}