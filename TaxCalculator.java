/**
 * TaxCalculator
 */
public class TaxCalculator {
    public static double calculateTax(double income) {
        double tax;

        if (income <= 237100) {
            tax = income * 0.18;
        } else if (income <= 370500) {
            tax = 42678 + (income - 237100) * 0.26;
        } else if (income <= 512800) {
            tax = 77362 + (income - 370500) * 0.31;
        } else if (income <= 673000) {
            tax = 121475 + (income - 512800) * 0.36;
        } else if (income <= 857900) {
            tax = 179147 + (income - 673000) * 0.39;
        } else if (income <= 1817000) {
            tax = 251258 + (income - 857900) * 0.41;
        } else {
            tax = 644489 + (income - 1817000) * 0.45;
        }

        return tax;
    }
}

/*
 * if (income <= 237100) {
 * tax = income * 0.18;
 * } else if (income <= 370500) {
 * tax = (income - 237100) * 0.26 + 42678;
 * } else if (income <= 512800) {
 * tax = (income - 370500) * 0.31 + 77362;
 * } else if (income <= 673000) {
 * tax = (income - 512800) * 0.36 + 121475;
 * } else if (income <= 857900) {
 * tax = (income - 673000) * 0.39 + 179147;
 * } else if (income <= 1817000) {
 * tax = (income - 857900) * 0.41 + 251258;
 * } else {
 * tax = (income - 1817000) * 0.45 + 644489;
 * }
 */