class Vaca extends Mamifero implements Sons {
    public static final String somEmitido = "Mugido";

    public int Idade;
    public int Tamanho;
    public String CorPelo;


    public Vaca(){
        super(0,0,somEmitido,"",0);
    }
    public Vaca(int idade, int tamanho, String pelo){
        super(idade, tamanho, somEmitido, pelo, 0);
        Idade = idade;
        Tamanho = tamanho;
        CorPelo = pelo;
    }

    public void emitirSom(){
        System.out.println("Som emitido: "+getSomEmitido()+"\n"); 
    }

    @Override
    public String toString(){
        return "\nTipo: Mamifero\nAnimal: Morcego \nIdade: "+Idade+" anos\nTamanho: "+Tamanho+" centimetros\nCor da Pena: "+CorPelo+"\nNao voa";
    }
}