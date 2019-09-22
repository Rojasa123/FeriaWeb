package Modelos;

import Modelos.PublicacionVentasLocal;
import Modelos.Usuario;
import java.math.BigDecimal;
import java.math.BigInteger;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.6.1.v20150605-rNA", date="2019-09-22T14:35:33")
@StaticMetamodel(CompraLocal.class)
public class CompraLocal_ { 

    public static volatile SingularAttribute<CompraLocal, BigInteger> total;
    public static volatile SingularAttribute<CompraLocal, Usuario> usuarioFk;
    public static volatile ListAttribute<CompraLocal, PublicacionVentasLocal> publicacionVentasLocalList;
    public static volatile SingularAttribute<CompraLocal, BigDecimal> idCompraLocal;
    public static volatile SingularAttribute<CompraLocal, BigInteger> cantidad;

}