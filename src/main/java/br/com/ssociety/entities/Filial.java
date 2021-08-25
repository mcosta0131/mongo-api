package br.com.ssociety.entities;

import java.time.LocalDate;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import br.com.ssociety.entities.pk.FilialPk;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Document(collection = "filial_via_trk")
public class Filial {

	private String operacaoKafka;
	private String dataIidr;

	@Id
	private FilialPk pk;	
	private String cnpjRaiz;
	private String cnpjFilial;
	private String codigoDigitoVerificador;
	private String cnpjCompleto;
	private LocalDate dataFilialEncerramentoVenda;
}
