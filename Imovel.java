import javax.swing.JOptionPane;
public class Imovel {
//Atributos
    protected String endereco;
    protected double preco;

 // Contrutor (sem parâmetros) da classe Imovel  
    public Imovel(){
        endereco = "Nenhum endereço informado";
        preco = 0;
    }
//Contrutor com parâmetro    
    public Imovel(String end, double pr){
        endereco = end;
        preco = pr;
    }
//Contrutor cópia
    public Imovel(Imovel im){
        endereco = im.endereco;
        preco = im.preco;
    }
    public void imprimiEndereco(){
        JOptionPane.showMessageDialog(null, "Endereco: "+ this.endereco);
    }
//Getters e Setters
    public void setEndereco(String end){
        endereco = end;
    }
    public String getEndereco(){
        return endereco;
    }
    public void setPreco(double pr){
        preco = pr;
    }
    public double getPreco(){
        return preco;
    }
}
