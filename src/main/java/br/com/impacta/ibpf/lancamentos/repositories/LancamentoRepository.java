package br.com.impacta.ibpf.lancamentos.repositories;

import java.util.List;

import br.com.impacta.ibpf.lancamentos.entities.Lancamento;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface LancamentoRepository extends JpaRepository<Lancamento, Long> {

	@Query("select a from Lancamento a where a.contaId = :contaId order by a.contaId Asc, a.data Asc")
	List<Lancamento> findByContaId(@Param("contaId") Long contaId);


}
