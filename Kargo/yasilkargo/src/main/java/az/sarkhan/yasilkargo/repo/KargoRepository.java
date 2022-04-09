package az.sarkhan.yasilkargo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import az.sarkhan.yasilkargo.model.Kargo;

public interface KargoRepository extends JpaRepository<Kargo,Integer> {
    
}
