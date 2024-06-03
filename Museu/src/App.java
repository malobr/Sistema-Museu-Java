public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Nova Obra de Arte: \n");
        String titulo = Console.lerString("Titulo da Obra: ");
        String artista = Console.lerString("Artista: ");
        int anoCriacao = Console.lerInt("Ano de Criacao: ");
        String tipoObra = Console.lerString("Tipo da Obra: (Pintura, Escultura, Fotografia, Etc...)");
        String localizacao = Console.lerString("Localizacao no Museu: ");

        ObraArte obraArte = new ObraArte(titulo, artista, anoCriacao, tipoObra, localizacao);

        System.out.println("\nObra Cadastrada" + obraArte.exibirDados());
    }
}
