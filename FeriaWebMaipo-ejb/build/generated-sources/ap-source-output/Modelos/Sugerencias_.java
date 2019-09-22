package Modelos;

import Modelos.Usuario;
import java.math.BigDecimal;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.6.1.v20150605-rNA", date="2019-09-15T23:26:22")
@StaticMetamodel(Sugerencias.class)
public class Sugerencias_ { 

    public static volatile SingularAttribute<Sugerencias, String> nombreSugerencia;
    public static volatile SingularAttribute<Sugerencias, Usuario> usuarioFk;
    public static volatile SingularAttribute<Sugerencias, BigDecimal> idSugerencia;
    public static volatile SingularAttribute<Sugerencias, String> descripcionSugerencia;

}