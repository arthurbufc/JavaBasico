package aula9;

public class Aluno {
    private String nome;
    private String email;
    private double salario;
    private String cpf;

    //#region

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public double getSalario() {
        return salario;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Aluno(String nome, String email, double salario, String cpf) {
        super();
        this.nome = nome;
        this.email = email;
        this.salario = salario;
        this.cpf = cpf;
    }

    public Aluno() {
        super();
    }

    @Override
    public String toString() {
        return "Aluno [cpf=" + cpf + ", email=" + email + ", nome=" + nome + ", salario=" + salario + "]";
    }
    
    //#endregion
    /*
         * Construir método de separação de inteiros do CPF
         * 1. Coletar a String do CPF
         * 2. Separe o CPF em grupos de numros e digito.
         * 3. Imprima a separação destes numeros.
         * 4. Converta em variaveis inteiras com nomes de c1, c2, c3 e d1.
    */

    //#region
    public void guardaAluno(String valor){
        String[] valorSeparado = valor.split(";");
        setNome(valorSeparado[0]);
        setEmail(valorSeparado[1]);
        setSalario(Double.parseDouble(valorSeparado[2]));
    }

    public void validaCpf(){
        String cpf = getCpf();
        String[] valorCpf = cpf.split("-");
        System.out.println("Primeira impressão: ");
        System.out.println(valorCpf[0]);
        System.out.println(valorCpf[1]); 

        String campos = valorCpf[0];
        String troca = campos.replace(".", ";");
        String[] campoSep = troca.split(";");
        System.out.println(campoSep);
        int c1 = Integer.parseInt(campoSep[0]);
        int c2 = Integer.parseInt(campoSep[1]);
        int c3 = Integer.parseInt(campoSep[2]);
        int d1 = Integer.parseInt(valorCpf[1]);

        System.out.println("Inteiro c1: "+c1+" Inteiro c2: "+c2+"Inteiro c3: "+c3+"Inteiro d1: "+d1+".");
    }
    //#endregion
}
