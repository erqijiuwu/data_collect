package com.neat.data.house;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
interface PropertyListRepository extends JpaRepository<PropertyListEntity, String> {
//    PropertyListEntity getOne(String id);
}