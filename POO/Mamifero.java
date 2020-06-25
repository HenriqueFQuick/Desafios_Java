class Mamifero extends Animais {
    private boolean _amamenta = true;
    private String _pelo;
 
    public String getPelo(){
        return this._pelo;
    };
    public void setPelo(String pelo){
        this._pelo = pelo;
    };
 
    public boolean amamenta(){
        return this._amamenta;
    };
    public Mamifero(int idade, int tamanho, String somEmitido, String pelo, int voo){
        super(idade, tamanho, somEmitido, voo);
        setPelo(pelo);
    }
}