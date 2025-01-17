package ru.itlearn.MyUiRestDbServise.dao;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.itlearn.MyUiRestDbServise.entity.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {
}
