package Modelos;

import Modelos.Producto;
import Modelos.Usuario;
import Modelos.VentaExterna;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.6.1.v20150605-rNA", date="2019-09-22T14:35:33")
@StaticMetamodel(SolicitudVentaExterna.class)
public class SolicitudVentaExterna_ { 

    public static volatile SingularAttribute<SolicitudVentaExterna, BigDecimal> idSolicitudVentaExterna;
    public static volatile SingularAttribute<SolicitudVentaExterna, String> estado;
    public static volatile SingularAttribute<SolicitudVentaExterna, Date> fechaSolicitud;
    public static volatile SingularAttribute<SolicitudVentaExterna, Usuario> usuarioFk;
    public static volatile CollectionAttribute<SolicitudVentaExterna, VentaExterna> ventaExternaCollection;
    public static volatile SingularAttribute<SolicitudVentaExterna, BigInteger> cantidadSolicitada;
    public static volatile SingularAttribute<SolicitudVentaExterna, String> direccion;
    public static volatile SingularAttribute<SolicitudVentaExterna, Producto> productoFk;

}