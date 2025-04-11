# Coleção de Códigos Java

## 1. Programa Bancário

```java
public class Programa {
    private static final Scanner ENTRADA = new Scanner(System.in);

    public static void main(String[] args) {
        int opcao = 0;
        boolean wait = true;
        while (opcao != 9) {
            System.out.println("\nSistema Bancário Tabajara\n");
            System.out.println("Digite a sua opção:");
            System.out.println("1 - Cadastrar Conta");
            System.out.println("2 - Consultar Conta");
            System.out.println("3 - Alterar Conta");
            System.out.println("4 - Remover Conta");
            System.out.println("5 - Exibe todas as contas");
            System.out.println("9 - Sair do sistema");
            System.out.print("Sua opção: ");
            opcao = ENTRADA.nextInt();

            switch (opcao) {
                case 1: // cadastrar conta
                    // inserirConta();
                    break;
                case 2: // consultar conta
                    // consultarConta();
                    break;
                case 3: // alterar conta
                    // alterarConta();
                    break;
                case 4: // remover conta
                    // removerConta();
                    break;
                case 5: // exibe todas as contas
                    // exibirTodasAsContas();
                    break;
                case 9: // encerra
                    wait = false;
            }

            if (wait) {
                try { Thread.sleep(3000); }
                catch(Exception e) { e.printStackTrace(); }
            }
        }
        System.out.println("Tchau...");
    }
}
```

## 2. Classe Círculo

```java
public class Circulo {
    private double raio;
    
    public Circulo(double raio) {
        this.raio = raio;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }
    
    public double getArea() {
        return Math.PI*raio*raio;
    }
    
    public double getComprimento() {
        return 2*Math.PI*raio;
    }

    @Override
    public String toString() {
        return "Circulo [raio=" + raio + 
               ", Area=" + getArea() + 
               ", Comprimento=" + getComprimento() + "]";
    }
}
```

## 3. Hierarquia Produto-Livro

### Classe Produto

```java
class Produto {
    private int codigo;
    private String nome;
    private double preco;
    private double desconto;
    
    public Produto(int codigo, String nome, double preco, double desc) {
        super();
        this.codigo = codigo;
        this.nome = nome;
        this.preco = preco;
        this.desconto = desc;
    }
    
    public String toString() {
        return "Eu sou um produto de código " + getCodigo() + 
               ", nome = " + getNome() + 
               ", preço = " + getPreco() +
               " e desconto para pagamento a vista = " + getDesconto() + " %";
    }
    
    // Métodos getters e setters omitidos
}
```

### Classe Livro (herda de Produto)

```java
class Livro extends Produto {
    private String autor;
    private String editora;
    
    public Livro(int codigo, String nome, double preco, double desc, 
                 String autor, String editora) {
        super(codigo, nome, preco, desc);
        this.autor = autor;
        this.editora = editora;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public String toString() {
        return "Eu sou um livro de código " + getCodigo() + 
               ", nome = " + getNome() + 
               ", preço = " + getPreco() + 
               ", desconto para pagamento a vista = " + getDesconto() + " %" + 
               ", autor = " + autor + 
               " e editora = " + editora;
    }
}
```

## 4. Classe Pessoa

```java
public class Pessoa {
    private String nome;
    private int idade;
    private double altura;
    private double peso;
    
    public Pessoa(String nome, int idade, double altura, double peso) {
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
        this.peso = peso;
    }
    
    // Getters e Setters
    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }
    public int getIdade() { return idade; }
    public void setIdade(int idade) { this.idade = idade; }
    public double getAltura() { return altura; }
    public void setAltura(double altura) { this.altura = altura; }
    public double getPeso() { return peso; }
    public void setPeso(double peso) { this.peso = peso; }
    
    public double getIMC() {
        return peso/(altura*altura);
    }
    
    public String toString() {
        double imc = getIMC();
        String imc_pessoa = "";
        
        if (imc <= 18.5)
            imc_pessoa = "Abaixo do peso normal";
        else if (imc <= 25)
            imc_pessoa = "Peso normal";
        else if (imc <= 30)
            imc_pessoa = "Acima do peso normal";
        else
            imc_pessoa = "Obeso(a).";
            
        return "dados da pessoa:\n" +
               "Nome: " + getNome() +
               "\nidade: " + getIdade() +
               "\naltura: " + getAltura() +
               "\npeso: " + getPeso() +
               "\nIMC: " + getIMC() +
               "\nCategoria IMC: " + imc_pessoa;
    }
}
```

## 5. Classe Número Complexo

```java
public class NumeroComplexo {
    private double real;
    private double img;

    public NumeroComplexo(double real, double img) {
        this.real = real;
        this.img = img;
    }

    // Getters e Setters
    public double getReal() { return real; }
    public void setReal(double real) { this.real = real; }
    public double getImg() { return img; }
    public void setImg(double img) { this.img = img; }

    // Operações
    public NumeroComplexo adicionar(NumeroComplexo c) {
        return new NumeroComplexo(this.real + c.real, this.img + c.img);
    }

    public NumeroComplexo subtrair(NumeroComplexo c) {
        return new NumeroComplexo(this.real - c.real, this.img - c.img);
    }

    public NumeroComplexo multiplicar(NumeroComplexo c) {
        double multReal = this.real*c.real - this.img*c.img;
        double multImg = this.real*c.img + this.img*c.real;
        return new NumeroComplexo(multReal, multImg);
    }
}
```

## 6. Hierarquia Animal-Gato

### Classe Animal

```java
public class Animal {
    private String dono;
    private String data_vacinacao;
    private String data_nascimento;
    
    public Animal(String dono, String data_vacinacao, String data_nascimento) {
        this.dono = dono;
        this.data_vacinacao = data_vacinacao;
        this.data_nascimento = data_nascimento;
    }

    // Getters e Setters
    public String getDono() { return dono; }
    public void setDono(String dono) { this.dono = dono; }
    public String getData_vacinacao() { return data_vacinacao; }
    public void setData_vacinacao(String data_vacinacao) { this.data_vacinacao = data_vacinacao; }
    public String getData_nascimento() { return data_nascimento; }
    public void setData_nascimento(String data_nascimento) { this.data_nascimento = data_nascimento; }
}
```

### Classe Gato (herda de Animal)

```java
public class Gato extends Animal {
    private boolean vacinado;
    private String aspecto;
    
    public Gato(String dono, String data_vacinacao, String data_nascimento, 
               boolean vacinado, String aspecto) {
        super(dono, data_vacinacao, data_nascimento);
        this.vacinado = vacinado;
        this.aspecto = aspecto;
    }

    // Getters e Setters
    public boolean isVacinado() { return vacinado; }
    public void setVacinado(boolean vacinado) { this.vacinado = vacinado; }
    public String getAspecto() { return aspecto; }
    public void setAspecto(String aspecto) { this.aspecto = aspecto; }
}
```
