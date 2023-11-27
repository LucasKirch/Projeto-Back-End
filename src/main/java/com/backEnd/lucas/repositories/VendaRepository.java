package com.backEnd.lucas.repositories;

import com.backEnd.lucas.models.Venda;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface VendaRepository extends JpaRepository<Venda,Long> {
    List<Venda> findByDocumentoContainsIgnoreCase (String documento);
}
