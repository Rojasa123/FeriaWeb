package Modelos;

import Modelos.Producto;
import java.math.BigDecimal;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.6.1.v20150605-rNA", date="2019-09-15T23:26:22")
@StaticMetamodel(Categoria.class)
public class Categoria_ { 

    public static volatile ListAttribute<Categoria, Producto> productoList;
    public static volatile SingularAttribute<Categoria, String> descripcionCategoria;
    public static volatile SingularAttribute<Categoria, BigDecimal> idCategoria;
    public static volatile SingularAttribute<Categoria, String> nombreCategoria;

}