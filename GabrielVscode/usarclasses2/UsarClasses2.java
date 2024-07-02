package usarclasses2;

public class UsarClasses2 {
    public static void main(String[] args) {
        Pessoa pessoa1;
        pessoa1 = new Pessoa("Gabriel", 17, 1112223335, 99988865);

        System.out.println("Nome: " + pessoa1.nome);
        System.out.println("Idade: " + pessoa1.idade);
        System.out.println("CPF: " + pessoa1.cpf);
        System.out.println("RG: " + pessoa1.rg);
        System.out.println("-------------------------------------------------------");

        Computador computador1;
        computador1 = new Computador("Pichau HX300M", "Mancer Thunder 500W", "Ryzen 5 5600gt", "B520M" );

        System.out.println("Gabinete: " + computador1.gabinete);
        System.out.println("Fonte:" + computador1.fonte);
        System.out.println("Processador" + computador1.processador);
        System.out.println("Placa Mãe: " + computador1.placamae);
        System.out.println("-------------------------------------------------------");


        Livro livro1;
        livro1 = new Livro("A sutil arte de ligar o Foda-se", "Mar Manson", 224, 2021);

        System.out.println("Título: " + livro1.titulo);
        System.out.println("Autor: " + livro1.autor);
        System.out.println("Páginas: " + livro1.paginas);
        System.out.println("Ano: " + livro1.ano);
        System.out.println("-------------------------------------------------------");
    }
}
