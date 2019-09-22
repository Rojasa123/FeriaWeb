/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controladores;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean (name = "productoController")
@SessionScoped
public class ProductoController {

    private String producto;
    
    private List<String> producto_list = new ArrayList();
    
    public List<String> rescatar_productos(){
        try {
            Connection conn = null;
            Class.forName("oracle.jdbc.driver.OracleDriver");
            conn = DriverManager.getConnection("jdbc:oracle:thin:@feriadb.cmk2niy1uwyv.us-east-1.rds.amazonaws.com:1521:FERIADB","feriaadmin","feriaduoc");
            
            PreparedStatement ps = null;
            ps = conn.prepareStatement("select * from producto");
            ResultSet rs = ps.executeQuery();
            
            while(rs.next()){
            producto_list.add(rs.getString("nombre_producto"));
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return producto_list;
    }
    
    public ProductoController() {
    }

    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public List<String> getProducto_list() {
        return producto_list;
    }

    public void setProducto_list(List<String> producto_list) {
        this.producto_list = producto_list;
    }
    
}
