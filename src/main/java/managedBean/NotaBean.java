package managedBean;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import model.Nota;
import rest.NotaRest;

import java.util.List;

@ManagedBean
@SessionScoped
public class NotaBean {
	private List<Nota> notas;

	public List<Nota> getNotas() {
		return notas;
	}

	@PostConstruct
	public void init() {
		NotaRest notaREST = new NotaRest();
		notas = notaREST.listar();
	}

	public void setNotas(List<Nota> notas) {
		this.notas = notas;
	}

}
