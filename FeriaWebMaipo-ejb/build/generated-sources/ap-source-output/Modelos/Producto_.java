package Modelos;

import Modelos.Categoria;
import Modelos.PostulacionesVentaExterna;
import Modelos.PublicacionVentasLocal;
import Modelos.SolicitudVentaExterna;
import Modelos.UnidadMedida;
import java.math.BigDecimal;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.6.1.v20150605-rNA", date="2019-09-15T23:26:22")
@StaticMetamodel(Producto.class)
public class Producto_ { 

    public static volatile SingularAttribute<Producto, UnidadMedida> unidadMedidaFk;
    public static volatile ListAttribute<Producto, SolicitudVentaExterna> solicitudVentaExternaList;
    public static volatile ListAttribute<Producto, PostulacionesVentaExterna> postulacionesVentaExternaList;
    public static volatile SingularAttribute<Producto, String> descripcionProducto;
    public static volatile SingularAttribute<Producto, String> temporada;
    public static volatile ListAttribute<Producto, PublicacionVentasLocal> publicacionVentasLocalList;
    public static volatile SingularAttribute<Producto, Categoria> categoriaFk;
    public static volatile SingularAttribute<Producto, BigDecimal> idProducto;
    public static volatile SingularAttribute<Producto, String> nombreProducto;

}