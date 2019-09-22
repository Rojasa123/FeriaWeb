package Modelos;

import Modelos.SubastaTransporte;
import Modelos.Usuario;
import java.math.BigDecimal;
import java.math.BigInteger;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.6.1.v20150605-rNA", date="2019-09-22T02:34:28")
@StaticMetamodel(PostulacionesTransporte.class)
public class PostulacionesTransporte_ { 

    public static volatile SingularAttribute<PostulacionesTransporte, String> estado;
    public static volatile SingularAttribute<PostulacionesTransporte, String> patenteCamion;
    public static volatile SingularAttribute<PostulacionesTransporte, Usuario> usuarioFk;
    public static volatile SingularAttribute<PostulacionesTransporte, BigDecimal> idPostulanteTransporte;
    public static volatile SingularAttribute<PostulacionesTransporte, String> comentario;
    public static volatile SingularAttribute<PostulacionesTransporte, String> patenteAcople;
    public static volatile SingularAttribute<PostulacionesTransporte, SubastaTransporte> subastaTransporteFk;
    public static volatile SingularAttribute<PostulacionesTransporte, BigInteger> valorTransporte;

}