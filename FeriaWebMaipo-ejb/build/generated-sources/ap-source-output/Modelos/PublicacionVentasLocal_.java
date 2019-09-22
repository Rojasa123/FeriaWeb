package Modelos;

import Modelos.Comision;
import Modelos.CompraLocal;
import Modelos.Producto;
import Modelos.Usuario;
import java.math.BigDecimal;
import java.math.BigInteger;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.6.1.v20150605-rNA", date="2019-09-22T04:52:26")
@StaticMetamodel(PublicacionVentasLocal.class)
public class PublicacionVentasLocal_ { 

    public static volatile SingularAttribute<PublicacionVentasLocal, String> descripcion;
    public static volatile ListAttribute<PublicacionVentasLocal, CompraLocal> compraLocalList;
    public static volatile SingularAttribute<PublicacionVentasLocal, String> ubicacion;
    public static volatile SingularAttribute<PublicacionVentasLocal, BigInteger> precio;
    public static volatile SingularAttribute<PublicacionVentasLocal, Usuario> usuarioFk;
    public static volatile SingularAttribute<PublicacionVentasLocal, Comision> comisionFk;
    public static volatile SingularAttribute<PublicacionVentasLocal, Producto> productoFk;
    public static volatile SingularAttribute<PublicacionVentasLocal, BigInteger> cantidad;
    public static volatile SingularAttribute<PublicacionVentasLocal, BigDecimal> idPublicacionVentaLocal;
    public static volatile SingularAttribute<PublicacionVentasLocal, String> tipoDespacho;

}