package Modelos;

import Modelos.PublicacionVentasLocal;
import Modelos.VentaExterna;
import java.math.BigDecimal;
import java.math.BigInteger;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.6.1.v20150605-rNA", date="2019-09-22T14:35:33")
@StaticMetamodel(Comision.class)
public class Comision_ { 

    public static volatile SingularAttribute<Comision, BigDecimal> idComision;
    public static volatile SingularAttribute<Comision, String> nombreComision;
    public static volatile ListAttribute<Comision, PublicacionVentasLocal> publicacionVentasLocalList;
    public static volatile SingularAttribute<Comision, String> descripcionComision;
    public static volatile ListAttribute<Comision, VentaExterna> ventaExternaList;
    public static volatile SingularAttribute<Comision, BigInteger> porcentajeComision;

}