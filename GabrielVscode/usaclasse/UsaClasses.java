package usaclasses;



public class UsaClasses {
    public static void main(String[] args) {
        Pessoa p;
        p = new Pessoa();

        p.nome = "Gabriel";
        p.idade = 17;
        p.cpf = 1234567891;
        p.rg = 838233850;
        p.renda = 1412;
        p.cep = 03567746;
        p.telefone =  "(11)984876348";
        p.email = "gabrielribeiroalves789@gmail.com";
        p.matricula = 31987654;
        p.ra = "0001117554375sp";

        System.out.println("BioGrafia:");
        System.out.println("Nome:" + p.nome);
        System.out.println("Idade:" + p.idade);
        System.out.println("CPF:" + p.cpf);
        System.out.println("RG:" + p.rg);
        System.out.println("Renda:" + p.renda);
        System.out.println("CEP:" + p.cep);
        System.out.println("Telefone:" + p.telefone);
        System.out.println("Email:" + p.email);
        System.out.println("Matricula:" + p.matricula);
        System.out.println("RA:" + p.ra);
        System.out.println("--------------------------------------------------------------------");
        


        Computador c;
        c = new Computador();
        
        c.gabinete = "Pichau HX300M";
        c.fonte = "Mancer Thunder 500w 80plus";
        c.processador = "Ryzen 5 5600gt";
        c.placamae = "B520M";
        c.gpu = "RX 580";
        c.ram = "2x 8gb corsair";
        c.rom = "SSD nvme 1tb Kingstom";
        c.teclado = "TKL K500 switch brown";
        c.mouse = "Redragon Storm pro";
        c.monitor = "Mancer Horizon 75hz 21p";

        System.out.println("Computador:");
        System.out.println("gabinete: " + c.gabinete);
        System.out.println("fonte: " + c.fonte);
        System.out.println("processador: " + c.processador);
        System.out.println("placa Mãe: " + c.placamae);
        System.out.println("gpu: " + c.gpu);
        System.out.println("Memória Ram: " + c.ram);
        System.out.println("Memória rom: " + c.rom);
        System.out.println("Teclado: " + c.teclado);
        System.out.println("Mouse: " + c.mouse);
        System.out.println("Monitor: " + c.monitor);
        System.out.println("--------------------------------------------------------------------");


        Livro l;
        l = new Livro();
        l.titulo = "A Sutil Arte de Ligar o Foda-se ";
        l.subtitulo = "Uma estratégia inusitada para uma vida melhor.";
        l.autor = "Mark Manson";
        l.paginas = 224;
        l.ano = 2016;
        l.preço = 45;
        l.editora = "Intrínseca";
        l.localdevenda = "Amazon, Shoppe";
        l.assunto = "Como ter uma vida melhor.";
        l.genero = "Auto-Ajuda";

        System.out.println("Livro:");
        System.out.println("Título: " + l.titulo);
        System.out.println("Páginas: " + l.paginas);
        System.out.println("Autor: " + l.autor);
        System.out.println("Subtitulo: " + l.subtitulo);
        System.out.println("Ano de Lançamento: " + l.ano);
        System.out.println("Preço: " + l.preço);
        System.out.println("Editora: " + l.editora);
        System.out.println("Local de venda: " + l.localdevenda);
        System.out.println("Assunto: " + l.assunto);
        System.out.println("Gênero: " + l.genero);
        System.out.println("--------------------------------------------------------------------");
}
}