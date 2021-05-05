package br.com.impacta.ibpf.lancamentos.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tb_lancamentos")
public class Lancamento implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "data", nullable = false)
	private Date data;

	@Column(name = "tipo", nullable = false, length = 1)
	private String tipo;

	@Column(name = "operacao", nullable = false, length = 3)
	private String operacao;

	@Column(name = "descricao", nullable = false, length = 45)
	private String descricao;

	@Column(name = "valor", nullable = false)
	private Double valor;

	@Column(name = "status", nullable = false)
	private boolean status;

	@Column(name = "conta_id", nullable = false)
	private Long contaId;

	public Lancamento() {
	}

	public Lancamento(Long id, Date data, String tipo, String operacao, String descricao, Double valor, boolean status, Long contaId) {
		this.id = id;
		this.data = data;
		this.tipo = tipo;
		this.operacao = operacao;
		this.descricao = descricao;
		this.valor = valor;
		this.status = status;
		this.contaId = contaId;
	}

	public Lancamento(Date data, String tipo, String operacao, String descricao, Double valor, boolean status, Long contaId) {
		this.id = id;
		this.data = data;
		this.tipo = tipo;
		this.operacao = operacao;
		this.descricao = descricao;
		this.valor = valor;
		this.status = status;
		this.contaId = contaId;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getOperacao() {
		return operacao;
	}

	public void setOperacao(String operacao) {
		this.operacao = operacao;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public Long getContaId() {
		return contaId;
	}

	public void setContaId(Long contaId) {
		this.contaId = contaId;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;

		Lancamento that = (Lancamento) o;

		if (!data.equals(that.data)) return false;
		if (!tipo.equals(that.tipo)) return false;
		if (!operacao.equals(that.operacao)) return false;
		if (!valor.equals(that.valor)) return false;
		return contaId.equals(that.contaId);
	}

	@Override
	public int hashCode() {
		int result = data.hashCode();
		result = 31 * result + tipo.hashCode();
		result = 31 * result + operacao.hashCode();
		result = 31 * result + valor.hashCode();
		result = 31 * result + contaId.hashCode();
		return result;
	}

	@Override
	public String toString() {
		return "Lancamento{" +
				"id=" + id +
				", data=" + data +
				", tipo='" + tipo + '\'' +
				", operacao='" + operacao + '\'' +
				", descricao='" + descricao + '\'' +
				", valor=" + valor +
				", status=" + status +
				", conta_id=" + contaId +
				'}';
	}
}
