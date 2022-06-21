package mx.com.segurossura.testdatabasedual.repositories.repository2;

import mx.com.segurossura.testdatabasedual.structurecollections.PolicyStructure;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PolicyStructureRepository extends MongoRepository<PolicyStructure, String> {
    PolicyStructure findByTipoProducto(String tipoProduct);
}
