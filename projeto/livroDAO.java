package negocio;

import java.util.List;

public interface LivroDAO {
	List<Livro> buscarTodos() throws DAOLivroException;
        Livro buscarPorTitulo(String titulo) throws DAOLivroException;
	Livro buscarPorAvaliacao(double avaliacao) throws DAOLivroException;
        Livro buscarPorAutor(String autor) throws DAOLivroException;
        Livro buscarPorValor(double valor) throws DAOLivroException;
        Livro buscarPorCapa(String capa) throws DAOLivroException;
        void inserir(Livro livro) throws DAOLivroException;
	void alterar(Livro livro) throws DAOLivroException;
}
