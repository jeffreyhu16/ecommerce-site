package projects.ecommercesite.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import projects.ecommercesite.model.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
