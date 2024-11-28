public class Pagamentos {
    public static String tipo;
    public static int senha = 1223;
    public static String  Menupagamentos(){

        int op;
 do{
        System.out.println("  --- METODOS DE PAGAMENTO ---");
        System.out.print("1- Pix\n2- Cartão Debito\n3- Catrão Credito\n 4- Dinheiro\n5- Voltar ao Menu Principal\n");
        System.out.println("INFORME O METODO DE PAGAMENTO: ");
        op = Verificacao.verificaPamanto();
        switch (op){
            case 1:
                Pix();
                tipo = "Pagamento Efetuado Via PIX";
                return tipo;

            case 2:
                CartaoCredito();
                tipo = "Pagamente Efetuado Via CARTÃO DE CREDITO";
                return tipo;

            case 3:
                    CartaoDebito();
                    tipo = "Pagamente Efetuado Via  CARTÃO DE DEBITO";
                    return tipo;

            case 4:
                    Cedula();
                    tipo = "Pagamento Efetuado Via CEDULA";
                    return tipo;
            case 5:
                System.out.print("saindo...\n");
                SistemaTeatro.menu();

            default: 
                System.out.print("Metodo de pagamento invalido!\n");
                Erros.PagamentoInvalido("Metodo de pagamento invalido");
                break;
        }
 } while(op < 0 || op > 5);
        
        return "";
    }

    public static void Pix(){
       int op = 0;

        System.out.print("\nValor a Pagar:\n R$20,49\n");
        System.out.print("Abra seu APP de Pagamento e Insira o Codigo a Seguir na Opção 'PIX COPIA E COLA':\n");
        System.out.print("81050d1a-9e5d-43f8-a306-c933f0f84dc9\n");
        do {
            System.out.print("INSIRA A OPCAO DE ACORDO COM O OCORRIDO \n");
            System.out.print("1- Pagamento Efetuado!\n2 - Erro no pagamento!\n3- Cancelar Pagamento!");
            System.out.println("insira a opção: ");
            op = Verificacao.verificaop();

           switch (op){
               case 1:
                   System.out.print("Pagamento Efetuado com Sucesso!\n");
                   break;
               case 2:
                   System.out.print("Copie o Codigo novamente e em seguida Cole-o na opcao 'PIX COPIA E COLA'!");
                   break;
           }
        }while (op < 0 || op > 2);
    }

    public static void CartaoCredito(){
    int senha1;

        System.out.print("\nValor a Pagar:\n R$20,49\n");
        System.out.print("INSIRA O CARTÃO E AGUARDE...:\n");
        System.out.print("INSIRA SUA SENHA: ");
        senha1 = Verificacao.verificaSenha();

        if(senha1 == senha){
            System.out.print("PAGAMENTO EFETUADO COM SUCESSO!\nAGUARDE A IMPRESSAO DA NOTINHA!\n");

        }else{
            System.out.print("SENHA INVALIDA! RETIRE O CARTÃO E TENTE NOVAMENTE!\n");
            Erros.PagementoCreditoInvalido("Pagamento de Cartao de Credito Invalido");
            CartaoCredito();
        }

    }

    public static void CartaoDebito(){
        int senha1;

        System.out.print("\nValor a Pagar:\n R$20,49\n");
        System.out.print("INSIRA O CARTÃO E AGUARDE...:\n");
        System.out.print("INSIRA SUA SENHA: ");
        senha1 = Verificacao.verificaSenha();

        if(senha1 == senha){
            System.out.print("PAGAMENTO EFETUADO COM SUCESSO!\nAGUARDE A IMPRESSAO DA NOTINHA!\n");

        }else{
            System.out.print("SENHA INVALIDA! RETIRE O CARTÃO E TENTE NOVAMENTE!\n");
            Erros.PagamentoDebito.Invalido("Pagamento de Cartao de Debito Inválido");
            CartaoCredito();
        }
    }

    public static void Cedula(){
        double valor = 0.0;

        do {
            System.out.print("\nValor a Pagar:\n R$20,49\n");
            System.out.print("Insira o Valor da Nota que você usara para efetuar o pagamaento: ");
            valor = Verificacao.verificaValor();

            if(valor < 0.0){
             System.out.print("Valor invalido!\nPara a comprar ser efetuada, pague um valor igual ou acima do determinado!\n");
                Erros.PagamentoCedulaInvalido("Pagamento por Cedula Invalido");
            Cedula();
            }
        }while (valor < 0.0);
        System.out.print("PAGAMENTO EFETUADO COM SUCESSO!\nSEU TROCO É DE: R$"+(valor - 20.49));

    }
}
