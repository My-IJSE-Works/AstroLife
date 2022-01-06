/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package astrolife.IJSE.Controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import astrolife.IJSE.DBConnection.DBConnection;
import astrolife.IJSE.Modal.DetailsModal;


public class DetailsController {

    public boolean uploadCustomerDetails(DetailsModal p1) throws ClassNotFoundException, SQLException {
        Connection con= DBConnection.getInstance().getConnection();
        PreparedStatement stm= con.prepareStatement("INSERT INTO Customer VALUES(?,?,?,?,?)");
        stm.setString(1, p1.getNic());
        stm.setString(2, p1.getName());
        stm.setString(3, p1.getBirthday());
        stm.setString(4, p1.getBirthtime());
        stm.setString(5, p1.getBirthplace());
        
        return stm.executeUpdate()>0;
    }

    public DetailsModal getDetailsModal(String text) throws ClassNotFoundException, SQLException {
         Connection con= DBConnection.getInstance().getConnection();
        PreparedStatement stm = con.prepareStatement("SELECT * FROM Customer WHERE CID=?");
        PreparedStatement stm1 = con.prepareStatement("SELECT * FROM Place WHERE Town=? and Stan_Leaptime=?");
        stm.setString(1, text);
        ResultSet set = stm.executeQuery();
        
        if(set.next()){
            return new DetailsModal(
                    set.getString(1),
                    set.getString(2),
                    set.getString(3),
                    set.getString(4),
                    set.getString(5));
        }
        
        return null;
    }
    

    public boolean removeCustomer(String text) throws ClassNotFoundException, SQLException {
        Connection con= DBConnection.getInstance().getConnection();
        PreparedStatement stm = con.prepareStatement("DELETE FROM Customer WHERE CID=?");
        stm.setString(1, text);
        return stm.executeUpdate()>0;
        
    }

  

        
}
