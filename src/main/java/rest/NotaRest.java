package rest;

import java.util.List;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.GenericType;
import com.sun.jersey.api.client.WebResource;

import model.Nota;

public class NotaRest {

	public List<Nota> listar() {
		Client client = Client.create();
		WebResource webResource = client.resource("http://www.deveup.com.br/notas/api/");
		return webResource.path("notes").get(new GenericType<List<Nota>>() {
		});
	}

	public static void main(String[] args) {
		NotaRest notaREST = new NotaRest();
		List<Nota> list = notaREST.listar();
		for (Nota nota : list) {
			System.out.println(nota.getTitle());
		}
	}
}
