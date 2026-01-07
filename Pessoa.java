public abstract class Pessoa {
    private String nome;
    private String telefone;
    private String email;

    public Pessoa(String nome, String telefone, String email){
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
    }

    public String getNome(){
        return this.nome;
    }

    public void setNome( String novoNome){
        this.nome = novoNome;
    }

    public String getTelefone(){
        return this.telefone;
    }

    public void setTelefone( String novoTelefone){
        this.telefone = novoTelefone;
    }

    public String getEmail(){
        return this.email;
    }

    public void setEmail( String novoEmail){
        this.email = novoEmail;
    }

    public abstract void show();

    public abstract String getId();
}
