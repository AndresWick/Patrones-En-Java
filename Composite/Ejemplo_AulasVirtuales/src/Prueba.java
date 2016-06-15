import javax.swing.JOptionPane;
/**
 *  Prueba del patrón Composite.
 * @author Carlos
 *
 */
public class Prueba {
	/**
	 *  Metodo principal.
	 * @param args
	 */
	public static void main(String[] args) {
		AulaVirtual modelos1 = new AulaVirtual("Modelos 1","JULIO BARON","SYLLABUS");

		Administracion administracion = new Administracion();
		
		//Creamos las categorias propias de administracion.
		SubCategoria admDeCurso = new SubCategoria("Administración del curso");
		SubCategoria ajustesPerfil = new SubCategoria("Ajustes del perfil");
		// Las agregamos.
		administracion.agregarCategoria(admDeCurso);
		administracion.agregarCategoria(ajustesPerfil);
		
		Navegacion navegacion = new Navegacion();
		
		//Creamos las categorias propias de navegacion.
		SubCategoria areaPersonal = new SubCategoria("Área personal");
		SubCategoria paginaSitio = new SubCategoria("Páginas del sitio");
		SubCategoria miPerfil = new SubCategoria("Mi perfil");
		SubCategoria cursoActual = new SubCategoria("Curso actual");
		SubCategoria misCursos = new SubCategoria("Mis cursos");
		// Las agregamos.
		navegacion.agregarCategoria(areaPersonal);
		navegacion.agregarCategoria(paginaSitio);
		navegacion.agregarCategoria(miPerfil);
		navegacion.agregarCategoria(cursoActual);
		navegacion.agregarCategoria(misCursos);
		
		UltimasNoticias noticias = new UltimasNoticias();
		
		//Creamos las categorias propias de ultimas noticias.
		SubCategoria noticia = new SubCategoria("Sin novedades aún");
		// Las agregamos.
		noticias.agregarCategoria(noticia);
		
		
		// Por ultimo agregamos Administracion, Navegacion y Noticas al Aula virtual.
		modelos1.agregarCategoria(administracion);
		modelos1.agregarCategoria(navegacion);
		modelos1.agregarCategoria(noticias);
		
		
		//Ahora solo visualizamos el aula.
		JOptionPane.showMessageDialog(null,modelos1.visualizar());
	}
}
