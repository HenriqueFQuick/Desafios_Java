//Classe menos generica contendo propriedades comuns aos animais ( extends Animais ) e especificas de aves.
public class Aves extends Animais {
   private boolean _poeOvo = true;
   private String _pena;

   public String getPena(){
        return this._pena;
    };
    public void setPena(String pena){
        this._pena = pena;
    };

    public boolean poeOvo(){
        return this._poeOvo;
    };


    public Aves(int idade, int tamanho, String somEmitido, String pena, int voo){
        super(idade, tamanho, somEmitido, voo);
        setPena(pena);
    }
}