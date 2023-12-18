package ma.enset.customerthymeleafapp.repository;

import ma.enset.customerthymeleafapp.entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer,Long> {
}
