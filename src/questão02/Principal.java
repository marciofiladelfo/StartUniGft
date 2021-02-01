package questão02;

public class Principal {
    public static void main(String[] args) {
        Livro livro = new Livro("Aprendendo Java", 125.50, 1, "José Ribeiro", "Informática",255);
        VideoGame videoGame = new VideoGame("PlayStation", 4500, 1, "Sony", "5", false);

        System.out.println(" ### Livro ###");
        System.out.println(livro.getNome());
        System.out.print("Valor: " + livro.getPreco());
        System.out.print(" - Quantidade: " + livro.getQtd());
        System.out.println(" - Páginas: " + livro.getQtdPag());
        System.out.print(livro.getAutor());
        System.out.println(" - " + livro.getTema());

        livro.setNome("Aprendendo Java POO");
        livro.setPreco(175.2);
        livro.setQtd(2);
        livro.setAutor("Dário de Souza");
        livro.setTema("Desenvolvimento de software");
        livro.setQtdPag(302);

        System.out.println(" ### Livro ###");
        System.out.println(livro.getNome());
        System.out.print("Valor: " + livro.getPreco());
        System.out.print(" - Quantidade: " + livro.getQtd());
        System.out.println(" - Páginas: " + livro.getQtdPag());
        System.out.print(livro.getAutor());
        System.out.println(" - " + livro.getTema());

        System.out.println();

        System.out.println(" ### Video Game ###");
        System.out.println(videoGame.getNome());
        System.out.print("Valor: " + videoGame.getPreco());
        System.out.println(" - Quantidade: " + videoGame.getQtd());
        System.out.print("Marca: " + videoGame.getMarca());
        System.out.print(" - Modelo: " + videoGame.getModelo());
        System.out.println(" - " + videoGame.isUsado());

        videoGame.setNome("Aprendendo Java POO");
        videoGame.setPreco(1850.00);
        videoGame.setQtd(2);
        videoGame.setMarca("Sony Computer Entertainment\n");
        videoGame.setModelo("versão 4");
        videoGame.setUsado(true);

        System.out.println(" ### Video Game ###");
        System.out.println(videoGame.getNome());
        System.out.print("Valor: " + videoGame.getPreco());
        System.out.println(" - Quantidade: " + videoGame.getQtd());
        System.out.print("Marca: " + videoGame.getMarca());
        System.out.print("Modelo: " + videoGame.getModelo());
        System.out.println(" - " + videoGame.isUsado());

        Livro livro2 = new Livro("Alfabetizando", 80, 1, "Maria Aparecida Morais", "educativo",100);
        System.out.println(livro.calculaImposto(livro.getPreco()));
        System.out.println(livro2.calculaImposto(livro2.getPreco()));

        VideoGame videoGame2 = new VideoGame("One", 4000, 1, "Nintendo", "Start", false);
        System.out.println(videoGame.calculaImposto(videoGame.getPreco()));
        System.out.println(videoGame2.calculaImposto(videoGame2.getPreco()));
    }
}
