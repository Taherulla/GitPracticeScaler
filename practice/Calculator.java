public class Calculator {
    public static void main(String[] args) {
        System.out.println("calculator class");
        System.out.println("adding new line in the new feature ");
        System.out.println("Compound Interest " + CompoundInterestCalculator.calculate(100000, 8, 5));
        System.out.println("SIP return : " + SIPCalculator.calculate(10000,12,12, 20));
    }
}
