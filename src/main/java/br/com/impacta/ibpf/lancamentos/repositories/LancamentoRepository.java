package br.com.impacta.ibpf.lancamentos.repositories;

import java.util.List;

import br.com.impacta.ibpf.lancamentos.entities.Lancamento;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface LancamentoRepository extends CrudRepository<Lancamento, Long> {

	@Query("select a from Lancamento a where a.contaId = :contaId order by a.contaId Asc, a.data Asc")
	List<Lancamento> findByContaId(@Param("contaId") Long contaId);

}
