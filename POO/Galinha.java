class Galinha extends Aves implements Sons {
    public static final String somEmitido = "Cacarejo";

    public int Idade;
    public int Tamanho;
    public String CorPena;


    public Galinha(){
        super(0,0,somEmitido,"",0);
    }
    public Galinha(int idade, int tamanho, String pena){
        super(idade, tamanho, somEmitido, pena,0);
        Idade = idade;
        Tamanho = tamanho;
        CorPena = pena;
    }
    
    public void emitirSom(){
        System.out.println("Som emitido: "+getSomEmitido()+"\n"); 
    }

    @Override
    public String toString(){
        return "\nTipo: Ave\nAnimal: Morcego \nIdade: "+Idade+" anos\nTamanho: "+Tamanho+" centimetros\nCor da Pena: "+CorPena+"\nNao voa";
    }
}