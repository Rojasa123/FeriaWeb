package Modelos;

import Modelos.PostulacionesTransporte;
import Modelos.VentaExterna;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.6.1.v20150605-rNA", date="2019-09-22T17:49:32")
@StaticMetamodel(SubastaTransporte.class)
public class SubastaTransporte_ { 

    public static volatile SingularAttribute<SubastaTransporte, VentaExterna> ventaExternaFk;
    public static volatile SingularAttribute<SubastaTransporte, BigDecimal> idSubastaTransporte;
    public static volatile SingularAttribute<SubastaTransporte, BigInteger> distancia;
    public static volatile SingularAttribute<SubastaTransporte, Date> fechaEntrega;
    public static volatile SingularAttribute<SubastaTransporte, String> direcciónEntrega;
    public static volatile ListAttribute<SubastaTransporte, PostulacionesTransporte> postulacionesTransporteList;

}