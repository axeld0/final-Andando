package SistemaDeControl.DocumentosComerciales;

import SistemaDeControl.ClienteProveedor.Proveedor;
import SistemaDeControl.Producto.SetProductos;

import java.io.Serializable;

public class Documento implements Serializable {

  private int numero;
  private SetProductos listadoProductos;


  /**
   * CONSTRUCTORES
   * @param numero EL NUMERO DEL DOCUMENTO.
   * @param listadoProductos  EL LISTADO DE PRODUCTOS DE CADA UNO DE LOS DOCUMENTOS.
   *                          EN LA FACTURA TENDRA DINERO, EN EL REMITO NO.
   */
  public Documento(int numero, SetProductos listadoProductos) {
    this.numero = numero;
    this.listadoProductos = listadoProductos;
  }

  public Documento() {
    numero = 0;
    listadoProductos = new SetProductos();
  }

  /**getters and setters
   */
  public int getNumero() {
    return numero;
  }

  public void setNumero(int numero) {
    this.numero = numero;
  }

  public SetProductos getListadoProductos() {
    return listadoProductos;
  }

  public void setListadoProductos(SetProductos listadoProductos) {
    this.listadoProductos = listadoProductos;
  }

  /**
   * equals and hashcode
   */

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (!(o instanceof Documento documento)) return false;

    if (getNumero() != documento.getNumero()) return false;
    return getListadoProductos() != null ? getListadoProductos().equals(documento.getListadoProductos()) : documento.getListadoProductos() == null;
  }

  @Override
  public int hashCode() {
    int result = getNumero();
    result = 31 * result + (getListadoProductos() != null ? getListadoProductos().hashCode() : 0);
    return result;
  }


  /**
   * to string
   * @return
   */
  @Override
  public String toString() {
    return  "\nDocumento" + "\n" +
            "\nNumero: " + numero + "\n" +
            "\n" + listadoProductos ;
  }
}
