public class forEach {
    public static void main(String[] args) {
        // Tanpa forEach
        String[] array = {
            "A","B","D","E","F"
        };

        for (int i = 0; i < array.length; i++){
            System.out.println(array[i]);
        }

        // forEach
        String[] names = {
            "Gustut", "Yoghantara", "Ricky", "Galang", "Krisdit"
        };

        for (var name : names){
            System.out.println(name);
        }
    }
}
