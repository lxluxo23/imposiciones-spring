package lxdeveloper.monsalvecespedes.imposiciones.repositories;

import lxdeveloper.monsalvecespedes.imposiciones.models.Cliente;
import org.springframework.data.repository.CrudRepository;

public interface ClienteRepository extends CrudRepository<Cliente,Long> {
}
