import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        int n1, n2;

        n1 = Integer.parseInt(JOptionPane.showInputDialog("Insert the Number one"));
        n2 = Integer.parseInt(JOptionPane.showInputDialog("Insert the Number two"));

        Operation op = new Operation();
        op.SUMA(n1, n2);
        op.MULTI(n1, n2);
        op.printResult();

    }
}
