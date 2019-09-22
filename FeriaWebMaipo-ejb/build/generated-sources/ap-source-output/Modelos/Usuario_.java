package Modelos;

import Modelos.CompraLocal;
import Modelos.Contratos;
import Modelos.Direccion;
import Modelos.PostulacionesTransporte;
import Modelos.PostulacionesVentaExterna;
import Modelos.PublicacionVentasLocal;
import Modelos.SolicitudVentaExterna;
import Modelos.Sugerencias;
import Modelos.TipoUsuario;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.6.1.v20150605-rNA", date="2019-09-22T17:49:32")
@StaticMetamodel(Usuario.class)
public class Usuario_ { 

    public static volatile SingularAttribute<Usuario, Contratos> contratosFk;
    public static volatile ListAttribute<Usuario, SolicitudVentaExterna> solicitudVentaExternaList;
    public static volatile ListAttribute<Usuario, CompraLocal> compraLocalList;
    public static volatile SingularAttribute<Usuario, String> estado;
    public static volatile SingularAttribute<Usuario, Date> fechaRegistro;
    public static volatile SingularAttribute<Usuario, TipoUsuario> tipoUsuarioFk;
    public static volatile SingularAttribute<Usuario, BigDecimal> idUsuario;
    public static volatile SingularAttribute<Usuario, String> apellidoP;
    public static volatile ListAttribute<Usuario, Sugerencias> sugerenciasList;
    public static volatile ListAttribute<Usuario, PublicacionVentasLocal> publicacionVentasLocalList;
    public static volatile SingularAttribute<Usuario, String> nombre;
    public static volatile SingularAttribute<Usuario, BigInteger> rut;
    public static volatile ListAttribute<Usuario, PostulacionesVentaExterna> postulacionesVentaExternaList;
    public static volatile SingularAttribute<Usuario, BigInteger> numeroTelefonico;
    public static volatile SingularAttribute<Usuario, String> apellidoM;
    public static volatile SingularAttribute<Usuario, String> contrasena;
    public static volatile ListAttribute<Usuario, Direccion> direccionList;
    public static volatile SingularAttribute<Usuario, String> email;
    public static volatile ListAttribute<Usuario, PostulacionesTransporte> postulacionesTransporteList;

}