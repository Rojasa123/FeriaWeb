package Modelos;

import Modelos.Usuario;
import java.math.BigDecimal;
import java.math.BigInteger;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.6.1.v20150605-rNA", date="2019-09-15T23:26:22")
@StaticMetamodel(Direccion.class)
public class Direccion_ { 

    public static volatile SingularAttribute<Direccion, BigDecimal> idDireccion;
    public static volatile SingularAttribute<Direccion, String> estado;
    public static volatile SingularAttribute<Direccion, String> codigoPostal;
    public static volatile SingularAttribute<Direccion, BigInteger> numero;
    public static volatile SingularAttribute<Direccion, String> ciudad;
    public static volatile SingularAttribute<Direccion, Usuario> usuarioFk;
    public static volatile SingularAttribute<Direccion, String> depto;
    public static volatile SingularAttribute<Direccion, String> pais;

}