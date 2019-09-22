package Modelos;

import Modelos.Usuario;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.6.1.v20150605-rNA", date="2019-09-22T17:49:32")
@StaticMetamodel(TipoUsuario.class)
public class TipoUsuario_ { 

    public static volatile SingularAttribute<TipoUsuario, Integer> idTipoUsuario;
    public static volatile ListAttribute<TipoUsuario, Usuario> usuarioList;
    public static volatile SingularAttribute<TipoUsuario, String> nombreTipoUsuario;
    public static volatile SingularAttribute<TipoUsuario, String> descripcionTipoUsuario;

}