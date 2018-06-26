package banco;
import javax.swing.*;

//Classe conta
public class Conta {
    private double saldo;
    private double limite;
    private String titular;
    private JFrame frame = new JFrame("dialogo");
    
    //construtor padrão
    public Conta(String titular){
        this.titular=titular;
        saldo=0;
        limite=0;
    }
    //construtor completo
    public Conta(String titular, double saldo, double limite){
        this.saldo=saldo;
        this.limite=limite;
        this.titular=titular;
    }
    //metodo de checar o saldo
    void setTitular(String titular){
        this.titular=titular;
    }
    //retorna o nome do titular da conta
    String getTitular(){
        return this.titular;
    }
    //retorna o saldo em conta
    double getSaldo(){
        return this.saldo;
    }
    //metodo de deposito de valores
    void deposita(double valor){
        this.saldo = valor;
    }
    //metodo de saque de valores
    void saca(double valor){
        
        if (valor<this.saldo){
            this.saldo-=valor;
        }
        else if((this.limite+this.saldo)>valor){
            this.limite=(this.limite+this.saldo)-valor;
            this.saldo=0;
            JOptionPane.showMessageDialog(frame, "Valor retirado do limite!"
                    + "\nLimite atual: "+this.limite);
        }
        else{
            JOptionPane.showMessageDialog(frame, "Valor excede o limite!");
        }
    }
    //retorna o limite da conta
    double getLimite(){
        return this.limite;
    }
    
    void setLimite(double limite){
        this.limite=limite;
    }
}
