/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Tool;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.text.SimpleDateFormat;
import java.util.Timer;
import java.util.zip.DeflaterOutputStream;
import java.util.zip.InflaterInputStream;

/**
 *
 * @author jdelgado
 */
public class JDBCUtils {
    /**
     * private constructor for static class
     */
    
String driver;
String dbURL;
String User;
String Password;
String driverSHE;
String dbURLSHE;
String UserSHE;
String PasswordSHE;
String xclub;
String AplicaSemilla;
String ice;

 SimpleDateFormat fhoraII =  new SimpleDateFormat("HH:mm");
 SimpleDateFormat fhora = new SimpleDateFormat("HH:mm:ss");
 SimpleDateFormat sd = new SimpleDateFormat("HH:mm");
 SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd");

private static Timer timer = null; 

public JDBCUtils(){
}

public Connection connectDatabase() {
    
    Connection connection = null;
    
    try {
        // We register the MySQL (MariaDB) driver
        // Registramos el driver de MySQL (MariaDB)
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
            System.out.println("Error al registrar el driver de MySQL: " + ex);
        }

        // Database connect
        // Conectamos con la base de datos
        connection = DriverManager.getConnection(
                "jdbc:mysql://173.243.120.250:3306/spcsyst1_jesmar?zeroDateTimeBehavior=convertToNull",
                "spcsyst1", "36zqd6g");
        boolean valid = connection.isValid(50000);
        System.out.println(valid ? "TEST OK" : "TEST FAIL");
        
    } catch (java.sql.SQLException sqle) {
        System.out.println("Error: " + sqle);
    }
        return connection;
    }      

    public static byte[] compress(String text) {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        try {
            OutputStream out = new DeflaterOutputStream(baos);
            out.write(text.getBytes("UTF-8"));
            out.close();
        } catch (IOException e) {
            throw new AssertionError(e);
        }
        return baos.toByteArray();
    }

    public static String decompress(byte[] bytes) {
        InputStream in = new InflaterInputStream(new ByteArrayInputStream(bytes));
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        try {
            byte[] buffer = new byte[8192];
            int len;
            while((len = in.read(buffer))>0)
                baos.write(buffer, 0, len);
            return new String(baos.toByteArray(), "UTF-8");
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    } 

}
