package com.backEnd.lucas.repositories;

import com.backEnd.lucas.models.ProdutoDetalhe;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProdutoDetalheRepository extends JpaRepository<ProdutoDetalhe,Long> {
}
