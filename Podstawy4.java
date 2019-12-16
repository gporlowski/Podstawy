public class Podstawy4 {
    public static void main(String[] args) {
        int firstNumber = 27, secondNumber = 59, thirdNumber = 41, fourthNumber = 94;
        if (firstNumber > secondNumber && firstNumber > thirdNumber && firstNumber > fourthNumber) {
            System.out.println("Pierwsza liczba (" + firstNumber + ") jest największa");
        } else if (secondNumber > thirdNumber && secondNumber > fourthNumber) {
            System.out.println("Druga liczba (" + secondNumber + ") jest największa.");
        } else if (thirdNumber > fourthNumber){
            System.out.println("Trzecia liczba (" + thirdNumber + ") jest największa.");
        } else {
            System.out.println("Czwarta liczba (" + fourthNumber + ") jest największa.");
        }
    }
}
