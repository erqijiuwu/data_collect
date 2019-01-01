package com.neat.data.house;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@SuppressWarnings("unused")
@Repository
interface PropertyDetailsBasicRepository extends JpaRepository<PropertyDetailsBasicEntity, Long> {
}