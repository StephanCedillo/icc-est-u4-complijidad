public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        int number = 5;
        int[] array = new int[] {1, 2, 3, 4, 5};
        System.out.println("Numero: " + number);
        System.out.print("Arreglo:");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
        for (int i : array) {
            System.out.print(i + " ");
        }
        
    }
}
