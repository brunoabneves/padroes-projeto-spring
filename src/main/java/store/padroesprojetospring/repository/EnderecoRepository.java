package store.padroesprojetospring.repository;

import org.springframework.data.repository.CrudRepository;
import store.padroesprojetospring.domain.model.Endereco;

public interface EnderecoRepository extends CrudRepository<Endereco, String> {

}
