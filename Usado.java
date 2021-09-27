import javax.swing.JOptionPane;

public class Usado extends Imovel{
        
    private double precoDesconto;

    //Método para o desconto do preco
    public void setMudaUsado(){
        precoDesconto = getPreco() - (getPreco()*0.20);
    }
    //Método de acesso
    public double getPrecoUsado(){
        return precoDesconto;
    }
    //Método de impressão
    public void imprimiUsado(){
        JOptionPane.showMessageDialog(null, "Preco com desconto: "+ this.getPrecoUsado());
    }

}
