/**
 * Clase Producto
 */
public class Producto {
    // Identificador del producto
    private String idProducto;
    // Descripción del producto
    private String descripcion;
    // Unidades del producto
    private int uds;

    /**
     * Constructor de la clase Producto
     * @param idProducto Identificador del producto
     * @param descripcion Descripción del producto
     * @param uds Unidades del producto
     */
    public Producto(String idProducto, String descripcion, int uds) {
        this.idProducto = idProducto;
        this.descripcion = descripcion;
        this.uds = uds;
    }

    // Métodos getter y setter para los atributos de la clase

    public String getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(String idProducto) {
        this.idProducto = idProducto;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getUds() {
        return uds;
    }

    public void setUds(int uds) {
        this.uds = uds;
    }
    public static void main(String[] args) {
     // Crear un nuevo producto
     Producto producto = new Producto("TARJ08112022", "TP-Link-TG 3468 Gigabit", 30);
     // Imprimir los detalles del producto
     
     System.out.println("ID del Producto: " + producto.getIdProducto());
     System.out.println("Descripción: " + producto.getDescripcion());
     System.out.println("Unidades: " + producto.getUds());
     // Cambiar la descripción y las unidades del producto
     producto.setDescripcion("Nueva descripción");
     producto.setUds(50);
     // Imprimir los detalles del producto después de los cambios
     System.out.println("ID del Producto: " + producto.getIdProducto());
     System.out.println("Descripción: " + producto.getDescripcion());
     System.out.println("Unidades: " + producto.getUds());
    }
    
    
}
