package Modelos;

import Modelos.Producto;
import java.math.BigDecimal;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.6.1.v20150605-rNA", date="2019-09-22T17:49:32")
@StaticMetamodel(UnidadMedida.class)
public class UnidadMedida_ { 

    public static volatile SingularAttribute<UnidadMedida, String> descripcionUnidad;
    public static volatile ListAttribute<UnidadMedida, Producto> productoList;
    public static volatile SingularAttribute<UnidadMedida, BigDecimal> idUnidadMedida;
    public static volatile SingularAttribute<UnidadMedida, String> nombreUnidadMedida;

}