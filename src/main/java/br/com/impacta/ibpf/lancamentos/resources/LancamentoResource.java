package br.com.impacta.ibpf.lancamentos.resources;

import java.util.List;

import br.com.impacta.ibpf.lancamentos.entities.Lancamento;
import br.com.impacta.ibpf.lancamentos.repositories.LancamentoRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/lancamentos")
public class LancamentoResource {

	@Autowired
	private LancamentoRepository lancamentoRepository;

	@GetMapping(value = "/{id}")
	public ResponseEntity<Lancamento> findById(@PathVariable Long id) {

		Lancamento lancamento = lancamentoRepository.findById(id).get();
		return ResponseEntity.ok(lancamento);
	}

	@GetMapping(value = "/search")
	public ResponseEntity<List<Lancamento>> findByContaId(@RequestParam("contaId") Long contaId) {
		List<Lancamento> lancamentos = lancamentoRepository.findByContaId(contaId);
		return ResponseEntity.ok(lancamentos);
	}

}
