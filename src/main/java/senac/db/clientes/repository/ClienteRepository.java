package senac.db.clientes.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import senac.db.clientes.model.Cliente;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long> {
}