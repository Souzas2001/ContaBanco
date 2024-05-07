import java.util.Scanner;
public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Por favor, digite o número da conta! ");
        int numero = entrada.nextInt();

        System.out.println("Por favor, digite o número da agencia! ");
        String agencia = entrada.nextLine();

        System.err.println("Por favor, digite o seu nome! ");
        String nome = entrada.nextLine();

        System.out.println("Por favor, digite o saldo ");
        Float saldo = entrada.nextFloat();    
        
        System.out.println("Olá" + nome + "obrigado por criar uma conta em nosso banco, sua agência é " + agencia + 
        " , conta " + numero + " e seu saldo " + saldo + " já está disponível para saque! " );
    }
}
