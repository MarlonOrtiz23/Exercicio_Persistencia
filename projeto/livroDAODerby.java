package persistencia;
;
import negocio.LivroDAO;
import negocio.DAOLivroException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import negocio.Livro;

/**
 *
 * @author bernardo
 */
public class LivroDAOderby implements LivroDAO {

    @Override
    public List<Livro> buscarTodos() throws DAOLivroException {
        List<Livro> livros = new ArrayList<>();
        String sqlLivros = "select * from livros";
        try (Connection conexao = InicializadorBancoDadosDataSource.conectarBd()) {
            try (Statement comandoLivros = conexao.createStatement()) {
                try (ResultSet resultadoLivros = comandoLivros.executeQuery(sqlLivros)) {
                    // Para cada linha da tabela livros
                    while (resultadoLivros.next()) {
                        // Instancia o livro
                        Livro livro = new Livro(resultadoLivros.getInt("codigo"),
                                resultadoLivros.getString("autor"),
                                resultadoLivros.getString("titulo"),
                                resultadoLivros.getString("capa"),
                                resultadoLivros.getDouble("avaliacao"),
                                resultadoLivros.getDouble("valor")
                        );
                        livros.add(livro);
                    }
                    return livros;
                }
            }
        } catch (Exception e) {
            throw new DAOLivroException("Falha na busca: " + e.getMessage(), e);
        }
    }
}
