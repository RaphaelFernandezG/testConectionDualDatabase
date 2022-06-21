package mx.com.segurossura.testdatabasedual.structurecollections;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Document("policys")
public class PolicyStructure {
    private String numero;
    private String tipoProducto;
    private String ramo;
}
