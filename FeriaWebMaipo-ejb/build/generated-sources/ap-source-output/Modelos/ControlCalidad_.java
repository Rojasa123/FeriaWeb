package Modelos;

import Modelos.VentaExterna;
import java.math.BigDecimal;
import java.math.BigInteger;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.6.1.v20150605-rNA", date="2019-09-22T17:49:32")
@StaticMetamodel(ControlCalidad.class)
public class ControlCalidad_ { 

    public static volatile SingularAttribute<ControlCalidad, VentaExterna> ventaExternaFk;
    public static volatile SingularAttribute<ControlCalidad, BigInteger> tiempoDesdeRecoleccion;
    public static volatile SingularAttribute<ControlCalidad, String> temperaturaContainer;
    public static volatile SingularAttribute<ControlCalidad, BigInteger> temperatura;
    public static volatile SingularAttribute<ControlCalidad, String> nivelMaduracion;
    public static volatile SingularAttribute<ControlCalidad, String> comentario;
    public static volatile SingularAttribute<ControlCalidad, String> nivelDescomposicion;
    public static volatile SingularAttribute<ControlCalidad, BigDecimal> idControlCalidad;
    public static volatile SingularAttribute<ControlCalidad, String> categoriaProducto;

}