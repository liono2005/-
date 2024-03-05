package bip.online.biplio2024.service;

import bip.online.biplio2024.entity.AuthorEntity;
import bip.online.biplio2024.repository.AuthorRepo;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
@Service
@AllArgsConstructor
public class AuthorService {
    private final AuthorRepo repo;



//    public List<AuthorEntity> {
//        return repo.findAll();
//    }
//    public Optional<AuthorEntity> findById(){
//        return repo.findById(id);
//    }

    public AuthorEntity save(AuthorEntity data) {
       return repo.save(data);
    }
    public void update(AuthorEntity data){
        repo.save(data);
    }
}
