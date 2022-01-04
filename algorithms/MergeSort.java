package algorithms;

public class MergeSort {

    private int array_index, compare_index;
    private int[] array;

    public MergeSort(int[] array) {

        this.array = array;
        array_index = 0;
        compare_index = Integer.MAX_VALUE;
    }

    public void merge(int arr[], int left, int mid, int right) {
        int i = left, j = mid + 1, k = left;
	    int[] temp = new int[right + 1];

	    while(i <= mid && j <= right) {
		    if(arr[i] < arr[j]) {
			    temp[k] = arr[i];
			    i++; k++;
		    }
		    else {
			    temp[k] = arr[j];
			    j++; k++;
		    }
	    }

	    while(i <= mid) {
	    	temp[k] = arr[i];
	    	i++; k++;
	    }
	    while(j <= right) {
	    	temp[k] = arr[j];
	    	j++; k++;
	    }

	    for(i=left; i<=right; i++) {
	    	arr[i] = temp[i];
	    }
    }

    public int[] mergesort(int left, int right) {

        if(left == right)
            return array;

        if (left < right) {
            int mid = (left + right) / 2;
            
            mergesort(left, mid);
            mergesort(mid + 1, right);
            merge(array, left, mid, right);
            return array;
        }
        return array;
    }

    public int[] sortOnlyOneItem() {

        array = mergesort(array_index, compare_index);

        return array;
    }

    public int[] getArray() {
        return array;
    }

    public void setArray(int[] array) {
        this.array = array;
    }

    public int getArrayIndex() {
        return array_index;
    }

    public void setArrayIndex(int array_index) {
        this.array_index = array_index;
    }

    public int getCompareIndex() {
        return compare_index;
    }

    public void setCompareIndex(int compare_index) {
        this.compare_index = compare_index;
    }
}