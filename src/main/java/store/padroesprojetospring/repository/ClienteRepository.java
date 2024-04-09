package store.padroesprojetospring.repository;

import org.springframework.data.repository.CrudRepository;
import store.padroesprojetospring.domain.model.Cliente;

public interface ClienteRepository extends CrudRepository<Cliente, Long> {

}
