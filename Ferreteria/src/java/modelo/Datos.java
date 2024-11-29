package modelo;
import java.sql.*;


public class Datos {
    
    Connection cn;
    PreparedStatement z;
    ResultSet rs;
    
    public Datos(){
    
            try {
                Class.forName("com.mysql.jdbc.Driver");
                cn=DriverManager.getConnection("jdbc:mysql://localhost:3309/ferreteria","root","root");
            } catch (Exception e) {
                System.out.println("ERROR NO SE CONECTO A BD"+e);
            }
}
      public String registrarProducto(String id, String nombre, String marca, int cantidad, Date fecha_ingreso,double precio ){
    String x="";
       
        try {
            
            z=cn.prepareStatement("insert into materiales(id,nombre,marca,cantidad,fecha_ingreso,precio) values(?,?,?,?,?,?)");
            z.setString(1, id);
            z.setString(2, nombre);
            z.setString(3, marca);
            z.setInt(4, cantidad);
            z.setDate(5, fecha_ingreso);
            z.setDouble(6, precio);
            
          int  y = z.executeUpdate();
            
            if (y==1) {
                x="se registro correctamente";
            } else {
                x="ERROR NO SE REGISTRO";
            }
           
            
        } catch (Exception e) {
            System.out.println("NO SE REGISTRO LA CITA "+e);
        }
     
    return x;    
    }
       public String borrarproducto(String id){
    String x="";
       
        try {
            
            z=cn.prepareStatement("delete from materiales where id=?");
            z.setString(1, id);
            
            
          int  y = z.executeUpdate();
            
            if (y==1) {
                x="SE BORRO CORRECTAMENTE";
            } else {
                x="ERROR NO SE ELIMINO";
            }
           
            
        } catch (Exception e) {
            System.out.println("NO SE ELIMINO EL PRODUCTO "+e);
        }
     
    return x;    
    }

}