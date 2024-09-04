package com.aprendendo.usuario.infrascture.reposity;

import com.aprendendo.usuario.infrascture.entity.EnderecoEntity;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface EnderecoRepository extends MongoRepository<EnderecoEntity,String> {
}
