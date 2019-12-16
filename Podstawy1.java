public class Podstawy1 {
    public static void main(String[] args) {
        int firstNumber = 27, secondNumber = 59, thirdNumber = 41;
        if (firstNumber > secondNumber && firstNumber > thirdNumber) {
            System.out.println("Pierwsza liczba (" + firstNumber + ") jest największa");
        } else if (secondNumber > thirdNumber) {
            System.out.println("Druga liczba (" + secondNumber + ") jest największa.");
        } else {
            System.out.println("Trzecia liczba (" + thirdNumber + ") jest największa.");
        }
    }
}
