package com.example.springboot.repositories;

import com.example.springboot.models.ProductModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

//essa interface será um bean(do tipo Repository), então os métodos da classe JPArepoository
//serão gerenciados pelo Spring(até onde eu entendi)
//por estender JpaRepository ela tem acesso aos seus métodos, que são métodos de operação com o banco de dados
@Repository
public interface ProductRepository extends JpaRepository<ProductModel, UUID> {
}
