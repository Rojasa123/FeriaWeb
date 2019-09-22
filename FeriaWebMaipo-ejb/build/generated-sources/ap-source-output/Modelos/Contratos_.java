package Modelos;

import Modelos.Usuario;
import java.math.BigDecimal;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.6.1.v20150605-rNA", date="2019-09-22T14:35:33")
@StaticMetamodel(Contratos.class)
public class Contratos_ { 

    public static volatile ListAttribute<Contratos, Usuario> usuarioList;
    public static volatile SingularAttribute<Contratos, String> condicionesContrato;
    public static volatile SingularAttribute<Contratos, String> tipoContrato;
    public static volatile SingularAttribute<Contratos, String> nombreContrato;
    public static volatile SingularAttribute<Contratos, String> descripcionContrato;
    public static volatile SingularAttribute<Contratos, BigDecimal> idContrato;
    public static volatile SingularAttribute<Contratos, String> terminosContrato;

}