package aula5;

public class Pessoa {
    private String nome;
    private String endereco;
    private String telefone;
    private String cpf;

    //#region
    public void setNome(String nome){
        this.nome = nome;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public String getEndereco() {
        return endereco;
    }
    public String getTelefone() {
        return telefone;
    }
    public String getCpf() {
        return cpf;
    }
    public String getNome(){
        return nome;
    }
    //#endregion
}
