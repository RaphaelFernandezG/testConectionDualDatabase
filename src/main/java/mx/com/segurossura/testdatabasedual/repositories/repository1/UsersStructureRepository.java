package mx.com.segurossura.testdatabasedual.repositories.repository1;

import mx.com.segurossura.testdatabasedual.structurecollections.UsersStructure;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UsersStructureRepository extends MongoRepository<UsersStructure, String> {
    UsersStructure findByNombre(String name);
}
