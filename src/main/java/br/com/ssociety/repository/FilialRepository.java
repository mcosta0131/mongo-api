package br.com.ssociety.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.repository.MongoRepository;

import br.com.ssociety.entities.Filial;
import br.com.ssociety.entities.pk.FilialPk;

public interface FilialRepository extends MongoRepository<Filial, FilialPk> {
	/** Query que retorna filiais por empresa de forma paginada **/
	Page<Filial> findByPkCodigoEmpresa(String empresa, Pageable pageable);

}
