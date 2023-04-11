package com.electricitysystem.repository;

import com.electricitysystem.entity.InvoiceEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface InvoiceRepository extends JpaRepository<InvoiceEntity, Integer> {
    List<InvoiceEntity> findAllByCustomerId(Integer customerId);

    InvoiceEntity findByToken(String token);
}
