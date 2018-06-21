/*
Software: Banco.java
Funcionalidade: software que simula movimentações bancárias para treino
de orientação a objetos com java
 */
package banco;
import javax.swing.*;
/**
 *
 * @author Anderson Souza
 */
public class Banco {
    public static void main(String[] args) {
        JFrame bc= new JFrame("Tela do Banco");
        Conta c1 = new Conta("Anderson",0,200);
        c1.deposita(434.21);
        c1.saca(500.00);
        JOptionPane.showMessageDialog(bc, "Dados da conta:\n Titular: "+c1.getTitular()+
                "\n Saldo: "+c1.getSaldo()+"\n Limite: "+c1.getLimite());
    }
    
}
