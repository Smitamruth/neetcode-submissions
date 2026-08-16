class Solution {
    public int[] replaceElements(int[] arr) {
        int indx = 0;
        int[] fArr = new int[arr.length];
        for (int i = 0; i < arr.length - 1; i++) {
            indx = i + 1;
            for (int j = i + 1; j < arr.length; j++) {
                // compare arr[j] and max index
                if (arr[j] > arr[indx]) {
                    // indx had index of max element
                    indx = j;
                }
            }
            fArr[i] = arr[indx];
        }
        fArr[arr.length - 1] = -1;
        System.out.println(Arrays.toString(fArr));
        return fArr;
    }
}