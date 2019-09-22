package Modelos;

import Modelos.VentaExterna;
import java.math.BigDecimal;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.6.1.v20150605-rNA", date="2019-09-22T04:52:26")
@StaticMetamodel(EstadoVentaExterna.class)
public class EstadoVentaExterna_ { 

    public static volatile SingularAttribute<EstadoVentaExterna, String> descripcionEstado;
    public static volatile SingularAttribute<EstadoVentaExterna, String> nombreEstado;
    public static volatile SingularAttribute<EstadoVentaExterna, BigDecimal> idEstadoVentaExterna;
    public static volatile ListAttribute<EstadoVentaExterna, VentaExterna> ventaExternaList;

}