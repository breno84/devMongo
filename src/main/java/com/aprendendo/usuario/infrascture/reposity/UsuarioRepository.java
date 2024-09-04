package com.aprendendo.usuario.infrascture.reposity;

import com.aprendendo.usuario.infrascture.entity.UsuarioEntity;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UsuarioRepository extends MongoRepository<UsuarioEntity, String> {
}
