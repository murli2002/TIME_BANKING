package net.javaguides.tb.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import net.javaguides.tb.domain.Customer;


@Repository
public interface CustomerRepository extends JpaRepository <Customer, Long> {
}
