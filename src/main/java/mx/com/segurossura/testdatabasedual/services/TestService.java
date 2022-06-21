package mx.com.segurossura.testdatabasedual.services;

import mx.com.segurossura.testdatabasedual.repositories.repository2.PolicyStructureRepository;
import mx.com.segurossura.testdatabasedual.repositories.repository1.UsersStructureRepository;
import mx.com.segurossura.testdatabasedual.structurecollections.PolicyStructure;
import mx.com.segurossura.testdatabasedual.structurecollections.UsersStructure;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestService {

    @Autowired
    PolicyStructureRepository policyStructureRepository;

    @Autowired
    UsersStructureRepository usersStructureRepository;

    public PolicyStructure testPolicy(){
        return policyStructureRepository.findByTipoProducto("AlaAzul");
    }

    public UsersStructure testUsers(){

        return usersStructureRepository.findByNombre("Raphael");
    }
}
