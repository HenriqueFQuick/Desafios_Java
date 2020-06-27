class Morcego extends Mamifero implements Sons{
    public static final String somEmitido = "Farfalho";

    public int Idade;
    public int Tamanho;
    public String CorPelo;
    public int AlturaVoo;

    public Morcego(){
        super(0,0,somEmitido,"",0);
    }
    public Morcego(int idade, int tamanho, String pelo, int voo){
        super(idade, tamanho, somEmitido, pelo, voo);
        Idade = idade;
        Tamanho = tamanho;
        CorPelo = pelo;
        AlturaVoo = voo;
    }

    //implementacao da interface Sons
    public void emitirSom(){
        System.out.println("Som emitido: "+getSomEmitido()+"\n"); 
    }

    @Override
    public String toString(){
        return "\nTipo: Mamifero\nAnimal: Morcego \nIdade: "+Idade+" anos\nTamanho: "+Tamanho+" centimetros\nCor da Pena: "+CorPelo+"\nAltura do voo: " + AlturaVoo+" centimetros";
    }
}