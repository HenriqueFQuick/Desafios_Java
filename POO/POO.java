import java.util.Scanner;

public class POO {
    public static Scanner read = new Scanner(System.in);
    public static int idade;
    public static int tamanho;
    public static String cor;
    public static int alturaVoo;
    public static void main(String[] args){
        boolean stop = false;
        boolean erro = false;
        String animal = "";
        while(!stop){
            do{
                erro = false;
                System.out.print("Digite qual animal deseja adicionar:   ");
                animal = read.nextLine();
                switch(animal.trim().toUpperCase()){
                    case "PATO":
                        createPato();
                        break;
                    case "GALINHA":
                        createGalinha();
                        break;
                    case "VACA":
                        createVaca();
                        break;
                    case "MORCEGO":
                        createMorcego();
                        break;
                    default:
                        System.out.print("Animal nao cadastrado!\nAnimais cadastrados: pato, galinha, vaca e morcego\n");
                        erro = true;
                        break;
                }
            }while(erro);
            System.out.print("Deseja adicionar outro animal? (S/N)   ");
            stop = (!read.nextLine().trim().toUpperCase().toString().equals("S")) ? true : false;
        }
    }
    public static void createPato(){
        System.out.print("Digite a idade do Pato: ");
        idade = read.nextInt();
        System.out.print("Digite o tamanho do Pato(cm): ");
        tamanho = read.nextInt();
        System.out.print("Digite a altura do voo do Pato(cm): ");
        alturaVoo = read.nextInt();
        System.out.print("Digite a cor da pena do Pato: ");
        cor = read.nextLine();
        cor = read.nextLine();

        Pato pato = new Pato(idade, tamanho, cor, alturaVoo);
        System.out.println(pato);
        pato.emitirSom();
    }
    public static void createGalinha(){
        System.out.print("Digite a idade da Galinha: ");
        idade = read.nextInt();
        System.out.print("Digite o tamanho da Galinha(cm): ");
        tamanho = read.nextInt();
        System.out.print("Digite a cor da pena da Galinha: ");
        cor = read.nextLine();
        cor = read.nextLine();

        Galinha galinha = new Galinha(idade, tamanho, cor);
        System.out.println(galinha);
        galinha.emitirSom();
    }
    public static void createVaca(){
        System.out.print("Digite a idade da Vaca: ");
        idade = read.nextInt();
        System.out.print("Digite o tamanho da Vaca(cm): ");
        tamanho = read.nextInt();
        System.out.print("Digite a cor do pelo da Vaca: ");
        cor = read.nextLine();
        cor = read.nextLine();

        Vaca vaca = new Vaca(idade, tamanho, cor);
        System.out.println(vaca);
        vaca.emitirSom();
    }
    public static void createMorcego(){
        System.out.print("Digite a idade do Morcego: ");
        idade = read.nextInt();
        System.out.print("Digite o tamanho do Morcego(cm): ");
        tamanho = read.nextInt();
        System.out.print("Digite a altura do voo do Morcego(cm): ");
        alturaVoo = read.nextInt();
        System.out.print("Digite a cor do pelo do Morcego: ");
        cor = read.nextLine();
        cor = read.nextLine();

        Morcego morcego = new Morcego(idade, tamanho, cor, alturaVoo);
        System.out.println(morcego);
        morcego.emitirSom();
    }
}