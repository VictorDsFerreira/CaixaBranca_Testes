package login;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class User {
    public Connection conectarBD() {
        /* 1 */ Connection conn = null;
        /* 2 */try {
            /* 2 */Class.forName("com.mysql.Driver.Manager").newInstance();
            /* 2 */String url = "jdbc:mysql://127.0.0.1/test?user=lopes&password=123";
            /* 2 */conn = DriverManager.getConnection(url);
            /* 3 */} catch (Exception e) {
        }
        /* 4 */return conn;
    }

    public String nome = "";
    public boolean result = false;

    public boolean verificarUsuario(String login, String senha) {
        String sql = "";
        /* 5 */Connection conn = conectarBD();
        // INSTRUÇÃO SQL
        /* 5 */sql = "select nome from usuarios ";
        /* 5 */sql += "Where login = '" + login + "'";
        /* 5 */sql += " and senha = '" + senha + "';";
        /* 6 */try {
            /* 7 */ Statement st = conn.createStatement();
            /* 7 */ ResultSet rs = st.executeQuery(sql);
            /* 8 */ if (rs.next()) {
                /* 9 */ result = true;
                /* 9 */ nome = rs.getString("nome");
            }
            /* 10 */} catch (Exception e) {
        }
        /* 11 */return result;
    }
}// fim da class