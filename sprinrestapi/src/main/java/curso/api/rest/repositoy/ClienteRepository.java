package curso.api.rest.repositoy;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import curso.api.rest.model.Cliente;


@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long> {

}
