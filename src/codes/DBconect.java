
package codes;

import com.sun.jdi.connect.spi.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author paXindu
 */
public class DBconect {
    
    public static Connection connect() throws SQLException{
        
        Connection conn = null;
        
        try{
        Class.forName("com.mysql.jdbc.Driver");
        conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","root");
        
        
        
        }
        
        catch(ClassNotFoundException e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
        
        
        return conn;
        
        
    }
    
}
