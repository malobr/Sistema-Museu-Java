import java.util.ArrayList;

public abstract class GerenciadorObrasArte {//extends ObraArte{
    
    private static ArrayList<ObraArte> listaObras = new ArrayList<>();

    public static void salvarObra(ObraArte obra){
        listaObras.add(obra);
    }

    public static ArrayList<ObraArte> getListaObras(){
        return listaObras;
    }

    public static ObraArte buscarObra(String titulo) throws Exception{

        for (ObraArte tempObraArte : listaObras) {
            if (tempObraArte.getTitulo().contains(titulo)) {
                return tempObraArte;
            }
        }
        throw new Exception("\nObra " + titulo + "não encontrada!");//teste + titulo +
    }
}
