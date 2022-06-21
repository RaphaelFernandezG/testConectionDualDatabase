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
@Document("users")
public class UsersStructure {
    private String nombre;
    private String apellido;
    private String identificacion;
}
