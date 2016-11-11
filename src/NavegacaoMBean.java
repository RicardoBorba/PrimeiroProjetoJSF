import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean (name="navegacao")
@RequestScoped
public class NavegacaoMBean implements Serializable{
	private static final long serialVersionUID = 1L;
	
	public String abrirPagina2(){
		return "/pages/pagina2.xhtml";
	}
	
	public String abrirPagina1(){
		return "/pages/pagina1.xhtml";
	}
}
