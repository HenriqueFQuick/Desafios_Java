class Pato extends Aves implements Sons {
    public static final String somEmitido = "Grasnido";

    public int Idade;
    public int Tamanho;
    public String CorPena;
    public int AlturaVoo;


    public Pato(){
        super(0,0,somEmitido,"",0);
    }
    public Pato(int idade, int tamanho, String pena, int voo){
        super(idade, tamanho, somEmitido, pena, voo);
        Idade = idade;
        Tamanho = tamanho;
        CorPena = pena;
        AlturaVoo = voo;
    }
    
    //implementacao da interface Sons
    public void emitirSom(){
       System.out.println("Som emitido: "+getSomEmitido()+"\n"); 
    }

    @Override
    public String toString(){
        return "\nTipo: Ave\nAnimal: Morcego \nIdade: "+Idade+" anos\nTamanho: "+Tamanho+" centimetros\nCor da Pena: "+CorPena+"\nAltura do voo: "+ AlturaVoo+ " centimetros";
    }
}