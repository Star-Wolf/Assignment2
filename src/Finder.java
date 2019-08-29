class Finder {
    public static Integer getMax(int[] arr) {
        if (arr == null) {
            return null;
        }

        if (arr.length == 0) {
            return null;
        }

        int result = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > result)
                result = arr[i];
        }
        return result;
    }
    public static Integer getMin(int[] arr){

        if (arr == null) {
            return null;
        }
        if (arr.length == 0) {
            return null;
        }

        Integer result = arr[0];
        for (int i = 1; i < arr.length; i++) {

            if (arr[i] < result)
                result = arr[i];
        }
        return result;
    }

}

