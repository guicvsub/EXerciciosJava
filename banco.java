 */
package com.mycompany.bancodedados;

/**
 *
 * @author labsfiap
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class OracleJDBC {
    // Configurações de conexão
    private static final String URL = "jdbc:oracle:thin:@//ORACLE.FIAP.COM.BR:1521/ORCL"; // Exemplo para Oracle XE
    private static final String USUARIO = "rm552321";
    private static final String SENHA = "120399";

    public static void main(String[] args) {
        Connection conexao = null;
        Statement stmt = null;
        ResultSet rs = null;

        try {
            // Carregar o driver (não necessário a partir do JDBC 4.0)
            Class.forName("oracle.jdbc.OracleDriver");

            // Estabelecer conexão
            conexao = DriverManager.getConnection(URL, USUARIO, SENHA);
            System.out.println("Conexão com Oracle estabelecida com sucesso!");

            // Criar um Statement
            stmt = conexao.createStatement();

            // Executar uma consulta simples
            String sql = "SELECT * FROM JOGOS";
            rs = stmt.executeQuery(sql);

            // Processar os resultados
            while (rs.next()) {
                System.out.println("ID: " + rs.getInt("id") + " - Nome: " + rs.getString("nome"));
            }

        } catch (ClassNotFoundException e) {
            System.err.println("Driver JDBC não encontrado: " + e.getMessage());
        } catch (SQLException e) {
            System.err.println("Erro ao conectar ao Oracle: " + e.getMessage());
        } finally {
            // Fechar recursos
            try {
                if (rs != null) rs.close();
                if (stmt != null) stmt.close();
                if (conexao != null) conexao.close();
            } catch (SQLException e) {
                System.err.println("Erro ao fechar conexão: " + e.getMessage());
            }
        }
    }
}
