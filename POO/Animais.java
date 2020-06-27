//Classe mais generica contendo atributos comuns a todos os animais
class Animais {

    private int _idade;
    private int _tamanho;
    private String _somEmitido;

    private int _voo;

    public int getIdade(){
        return this._idade;
    };
    public void setIdade(int idade){
        this._idade = idade;
    };
    public int getTamanho(){
        return this._tamanho;
    };
    public void setTamanho(int tamanho){
        this._tamanho = tamanho;
    };
    public String getSomEmitido(){
        return this._somEmitido;
    };
    public void setSomEmitido(String somEmitido){
        this._somEmitido = somEmitido;
    };

    public int getVoo(){
        return this._voo;
    };
    public void setVoo(int voo){
        this._voo = voo;
    };

    public Animais(int idade, int tamanho, String somEmitido, int voo){
        setIdade(idade);
        setTamanho(tamanho);
        setSomEmitido(somEmitido);
        setVoo(voo);
    }
}