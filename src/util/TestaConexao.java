package util;
import java.sql.*;
/**
 *
 * @author USER Master
 */
public class TestaConexao {
    
    public static void main(String[] args) throws ClassNotFoundException {
        
        try {
            Connection conn = ConexaoSQL.conectar();
            if (conn != null && !conn.isClosed()) {
                System.out.println("Conexao OK!");       
            }
            ConexaoSQL conexao = new ConexaoSQL();
            conexao.conn = conn;
            boolean desconectou = conexao.desconectar();
            if (desconectou && conn.isClosed()) {
                System.out.println("Conexao Fechada.");  
            }else{
                System.out.println("Falha ao Fechar.");
            }
        } catch (Exception e) {
            e.printStackTrace();
        } 
        
    }
    
}