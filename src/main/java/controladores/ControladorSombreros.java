package controladores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
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
	private SombrerosDAOImpl sombrerosDAO;

	@RequestMapping("admin/sombreros")
	public String obtenerLibros(Model model) {
		List<Sombrero> sombreros = sombrerosDAO.obtenerSombrero();
		model.addAttribute("sombreros",sombreros);
		return "admin/sombreros";
	}
}
