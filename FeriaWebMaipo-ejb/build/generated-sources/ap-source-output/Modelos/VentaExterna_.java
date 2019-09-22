package Modelos;

import Modelos.Comision;
import Modelos.ComisionAduana;
import Modelos.ControlCalidad;
import Modelos.EstadoVentaExterna;
import Modelos.PostulacionesVentaExterna;
import Modelos.SolicitudVentaExterna;
import Modelos.SubastaTransporte;
import java.math.BigDecimal;
import java.math.BigInteger;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.6.1.v20150605-rNA", date="2019-09-22T02:34:28")
@StaticMetamodel(VentaExterna.class)
public class VentaExterna_ { 

    public static volatile ListAttribute<VentaExterna, PostulacionesVentaExterna> postulacionesVentaExternaList;
    public static volatile ListAttribute<VentaExterna, SubastaTransporte> subastaTransporteList;
    public static volatile SingularAttribute<VentaExterna, BigDecimal> idVentaExterna;
    public static volatile SingularAttribute<VentaExterna, BigInteger> idPostulacionVenta;
    public static volatile SingularAttribute<VentaExterna, Comision> comisionFk;
    public static volatile SingularAttribute<VentaExterna, ComisionAduana> comisionAduanaFk;
    public static volatile SingularAttribute<VentaExterna, EstadoVentaExterna> estadoVentaExternaFk;
    public static volatile SingularAttribute<VentaExterna, BigInteger> idPostulacionTransporte;
    public static volatile ListAttribute<VentaExterna, ControlCalidad> controlCalidadList;
    public static volatile SingularAttribute<VentaExterna, SolicitudVentaExterna> solicitudVentaExternaFk;

}