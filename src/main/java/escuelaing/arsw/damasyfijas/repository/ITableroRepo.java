package escuelaing.arsw.damasyfijas.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import escuelaing.arsw.damasyfijas.model.Tablero;

/**
 * Interface que estiende de JpaRepository donde le enviamos nuestro modelo y tipo de llave primaria
 * @author Jose María Castro Ortega
 *
 */
public interface ITableroRepo extends JpaRepository<Tablero,Integer>{

}
