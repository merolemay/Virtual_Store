package icesi.VirtualStore.repository;

import icesi.VirtualStore.model.Order;
import org.springframework.data.repository.CrudRepository;

import java.util.UUID;

public interface OrderRepository extends CrudRepository<Order, UUID> {
}