package Modelos;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.6.1.v20150605-rNA", date="2019-09-22T04:52:26")
@StaticMetamodel(InformeEstadistico.class)
public class InformeEstadistico_ { 

    public static volatile SingularAttribute<InformeEstadistico, BigInteger> cantidadTotalVentaExterna;
    public static volatile SingularAttribute<InformeEstadistico, Date> fecha;
    public static volatile SingularAttribute<InformeEstadistico, BigInteger> totalSumaComision;
    public static volatile SingularAttribute<InformeEstadistico, BigInteger> comisionVentaExternaMensual;
    public static volatile SingularAttribute<InformeEstadistico, BigInteger> cantidadVentasMensual;
    public static volatile SingularAttribute<InformeEstadistico, BigInteger> comisionMensual;
    public static volatile SingularAttribute<InformeEstadistico, BigInteger> cantidadVentaExternaMensual;
    public static volatile SingularAttribute<InformeEstadistico, BigDecimal> idInformeEstadistico;
    public static volatile SingularAttribute<InformeEstadistico, BigInteger> cantidadVentaLocalMensual;
    public static volatile SingularAttribute<InformeEstadistico, BigInteger> comisionVentaLocalMensual;
    public static volatile SingularAttribute<InformeEstadistico, BigInteger> cantidadTotalVentas;

}