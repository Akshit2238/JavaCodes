public class GenericMethod {
    public static <E> void printArray(E[] elements) {
        for (E element : elements) {
            System.out.println(element);
        }
    }
    public static void main(String args[]) {
        Integer[] intArray = {10, 20, 30, 40, 50};
        Character[] charArray = {'J', 'A', 'V', 'A'};
        printArray(intArray);
        printArray(charArray);
    }
}
