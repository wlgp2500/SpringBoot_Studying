package com.org.example.springboot.domain;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;
import java.util.Optional;


@Repository
public interface MyDataRepository extends JpaRepository<MyData,Long> {

}
