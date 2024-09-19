package edu.campus.campusLeopoldoMarechal.repository;

import edu.campus.campusLeopoldoMarechal.model.Materias;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IMateriasRepository extends JpaRepository<Materias, Long> {

}
