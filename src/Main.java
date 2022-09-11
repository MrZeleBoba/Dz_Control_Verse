public class Main {

    public static void main(String[] args) {
        int[] arr = {100, 200, 300, 500, 400};
        SalesManager salesManager = new SalesManager(arr);

        int max = salesManager.max();

        System.out.println(max);

        System.out.println(salesManager.getAverage());

    }
}
