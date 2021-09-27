import javax.swing.JOptionPane;
public class Novo extends Imovel {

    private double precoAdicional;
    //Método para o adicional do preco
    public void setMudaPreco(){
        precoAdicional = getPreco() + (getPreco()*0.10);
    }
    //Método de acesso
    public double getPrecoAdicional(){
        return precoAdicional;
    }
    //Método de impressão
    public void imprimiAdicional(){
        JOptionPane.showMessageDialog(null, "Preco com o aditicional: "+ this.getPrecoAdicional());
    }

}
