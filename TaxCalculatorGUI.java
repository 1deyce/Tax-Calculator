import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TaxCalculatorGUI {
    public static void main(String[] args) {
        JFrame frame = new JFrame("SARS Tax Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 200);

        JPanel panel = new JPanel();
        frame.add(panel);
        placeComponents(panel);

        frame.setVisible(true);
    }

    private static void placeComponents(JPanel panel) {
        panel.setLayout(null);

        JLabel incomeLabel = new JLabel("Annual Income (R):");
        incomeLabel.setBounds(10, 20, 150, 25);
        panel.add(incomeLabel);

        JTextField incomeField = new JTextField(20);
        incomeField.setBounds(160, 20, 200, 25);
        panel.add(incomeField);

        JButton calculateButton = new JButton("Calculate Tax");
        calculateButton.setBounds(10, 60, 150, 25);
        panel.add(calculateButton);

        JLabel taxLabel = new JLabel("Tax Obligation (R):");
        taxLabel.setBounds(10, 100, 150, 25);
        panel.add(taxLabel);

        JTextField taxField = new JTextField(20);
        taxField.setBounds(160, 100, 200, 25);
        taxField.setEditable(false);
        panel.add(taxField);

        calculateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double income = Double.parseDouble(incomeField.getText());
                    double tax = TaxCalculator.calculateTax(income);
                    taxField.setText(String.format("%.2f", tax));
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(panel, "Please enter a valid income.", "Error",
                            JOptionPane.ERROR_MESSAGE);
                }
            }
        });
    }
}
