package Modelos;

import Modelos.VentaExterna;
import java.math.BigDecimal;
import java.math.BigInteger;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.6.1.v20150605-rNA", date="2019-09-22T14:35:33")
@StaticMetamodel(ComisionAduana.class)
public class ComisionAduana_ { 

    public static volatile SingularAttribute<ComisionAduana, BigInteger> porcentajeComisionAduana;
    public static volatile SingularAttribute<ComisionAduana, String> descripcionComisionAduana;
    public static volatile SingularAttribute<ComisionAduana, String> nombreComision;
    public static volatile ListAttribute<ComisionAduana, VentaExterna> ventaExternaList;
    public static volatile SingularAttribute<ComisionAduana, BigDecimal> idComisionAduana;

}