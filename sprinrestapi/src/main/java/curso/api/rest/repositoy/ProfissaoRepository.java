package curso.api.rest.repositoy;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import curso.api.rest.model.Profissao;

@Repository
public interface ProfissaoRepository extends CrudRepository<Profissao, Long>{

}
