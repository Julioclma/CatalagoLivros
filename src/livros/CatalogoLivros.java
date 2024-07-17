package livros;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {
    private List<Livro> catalago;

    public CatalogoLivros() {
        this.catalago = new ArrayList<>();
    }

    public void adicionarLivro(String titulo, String autor, int anoPublicacao) {
        this.catalago.add(new Livro(titulo, autor, anoPublicacao));
    }

    public List<Livro> pesquisarPorAutor(String autor) {
        List<Livro> livrosPorAutor = new ArrayList<>();
        if (!this.catalago.isEmpty()) {
            for (Livro livro : this.catalago) {
                if (livro.getAutor().equalsIgnoreCase(autor)) {
                    livrosPorAutor.add(livro);
                }
            }
        }

        return livrosPorAutor;
    }

    public List<Livro>  pesquisarPorIntervaloAnos(int anoInicial, int anoFinal) {
        List<Livro> livrosPorIntervaloDeAno = new ArrayList<>();

        if(!this.catalago.isEmpty()){
            for (Livro livro : this.catalago ) {
                if(livro.getAnoDePublicacao() >= anoInicial && livro.getAnoDePublicacao() <= anoFinal){
                    livrosPorIntervaloDeAno.add(livro);
                }
            }
        }

        return livrosPorIntervaloDeAno;
    }

    public Livro pesquisarPorTitulo(String titulo) {

        if(!this.catalago.isEmpty()){
            for (Livro livro : this.catalago) {
                if (livro.getTitulo().equalsIgnoreCase(titulo)){
                    return livro;
                }
            }
        }

        return null;
    }

}
