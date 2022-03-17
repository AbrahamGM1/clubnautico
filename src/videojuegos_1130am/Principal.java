package videojuegos_1130am;

import entidades.Jugador;
import entidades.Logro;
import entidades.RelacionJugadorLogro;
import entidades.Videojuego;
import enumeradores.Sexo;
import implementaciones.DAOSFactory;
import interfaces.IJugadoresDAO;
import java.util.Arrays;
import java.util.GregorianCalendar;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Principal {

    public static void main(String[] args) {
        IJugadoresDAO jugadoresDAO = DAOSFactory.crearJugadoresDAO();
        Jugador jugador = new Jugador("Batman","batman@gmail.com", new GregorianCalendar(), Sexo.MASCULINO);
        jugadoresDAO.agregar(jugador);
        
    }
    
}
