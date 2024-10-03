package controladores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import daos.SombrerosDAO;
import modelo.*;
import java.util.*;
import daosImpl.SombrerosDAOImpl;

@Controller
public class ControladorSombreros {

	/**
	 * una forma muy comoda que nos da spring para pedir una bean es esta:
	 * 
	 */
	@Autowired
	private SombrerosDAO sombrerosDAO;

	/*
	 * basicamente asi le hemos dicho a spring que nos de la unica bean que tenga de
	 * la unica clase que este implementando el interfaz SombrerosDAO
	 */
// lo que pongamos en @RequestMapping es la ruta que atiende el siguiente metodo
	@RequestMapping("admin/sombreros")
	public String obtenerLibros(Model model) {
		List<Sombrero> sombreros = sombrerosDAO.obtenerSombrero();
		model.addAttribute("sombreros", sombreros);
		return "admin/sombreros";
	}
}
