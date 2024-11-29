package controlador;
import java.beans.*;
import java.io.Serializable;
import java.sql.Date;
import modelo.Datos;
public class Control implements Serializable {
    Datos dat;
    public static final String PROP_SAMPLE_PROPERTY = "sampleProperty";
    
    private String sampleProperty;
    
    private PropertyChangeSupport propertySupport;
    
    public Control() {
        dat=new Datos();
        propertySupport = new PropertyChangeSupport(this);
    }
    
    public String getSampleProperty() {
        return sampleProperty;
    }
    
    public void setSampleProperty(String value) {
        String oldValue = sampleProperty;
        sampleProperty = value;
        propertySupport.firePropertyChange(PROP_SAMPLE_PROPERTY, oldValue, sampleProperty);
    }
    
    public void addPropertyChangeListener(PropertyChangeListener listener) {
        propertySupport.addPropertyChangeListener(listener);
    }
    
    public void removePropertyChangeListener(PropertyChangeListener listener) {
        propertySupport.removePropertyChangeListener(listener);
    }
    public String registrarProducto (String id, String nombre, String marca, int cantidad, Date fecha_ingreso,double precio ){
        return dat.registrarProducto(id, nombre, marca, cantidad, fecha_ingreso, precio);
    }
    public String anula(String z){
        return dat.borrarproducto(z);
    }}
