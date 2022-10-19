public class Main {

    public static void main(String[] args) {
        int[] arr = generateRandomArray();
        int minCashe = 5;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < arr[i] + 1) {
                minCashe = arr[i];
            }
        }
        System.out.println(minCashe);
        System.out.println("сделал 3 задание");

    }

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }
}