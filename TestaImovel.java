import javax.swing.JOptionPane;
public class TestaImovel {
    public static void main(String[] args) {

        String opcao;
        int opc;
        //caixa de dialogo que recebe a informação
        opcao = JOptionPane.showInputDialog("Informe um numero \n(1 para imovel novo e 2 para imovel usado)");
        opc = Integer.parseInt(opcao);
        //Se a opção for 1 entrará na categoria do imóvel novo
        if (opc == 1) {
            Novo imovelNovo = new Novo();
            imovelNovo.setEndereco("Rua Olivio");
            imovelNovo.setPreco(250.500);
            imovelNovo.setMudaPreco();
            imovelNovo.imprimiEndereco();
            imovelNovo.imprimiAdicional();
        }
        //Caso seja a opção 2 entrará em imóvel usado
        else{
            if (opc == 2) {
            Usado imovelUsado = new Usado();
            imovelUsado.setEndereco("Rua Olivio");
            imovelUsado.setPreco(250.500);
            imovelUsado.setMudaUsado();
            imovelUsado.imprimiEndereco();
            imovelUsado.imprimiUsado();
            }
        //Se o usuário digitar qualquer outra tecla diferente de 1 ou 2 o programa se encerra
            else{
                JOptionPane.showMessageDialog(null, "Por favor digite somente 1 ou 2 \n O Programa sera encerrado");
            }
        }
        System.exit( 0 );
    }
    
}
