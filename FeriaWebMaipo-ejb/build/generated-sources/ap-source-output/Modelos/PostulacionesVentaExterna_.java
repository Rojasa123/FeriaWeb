package Modelos;

import Modelos.Producto;
import Modelos.Usuario;
import Modelos.VentaExterna;
import java.math.BigDecimal;
import java.math.BigInteger;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.6.1.v20150605-rNA", date="2019-09-22T17:49:32")
@StaticMetamodel(PostulacionesVentaExterna.class)
public class PostulacionesVentaExterna_ { 

    public static volatile SingularAttribute<PostulacionesVentaExterna, BigDecimal> idPostulacionVentaExterna;
    public static volatile SingularAttribute<PostulacionesVentaExterna, VentaExterna> ventaExternaFk;
    public static volatile SingularAttribute<PostulacionesVentaExterna, String> estado;
    public static volatile SingularAttribute<PostulacionesVentaExterna, BigInteger> valorProducto;
    public static volatile SingularAttribute<PostulacionesVentaExterna, Usuario> usuarioFk;
    public static volatile SingularAttribute<PostulacionesVentaExterna, Producto> productoFk;
    public static volatile SingularAttribute<PostulacionesVentaExterna, BigInteger> cantidad;

}