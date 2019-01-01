package com.neat.data.house;

//import org.springframework.data.domain.Page;
//import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@SuppressWarnings("unused")
@Repository
interface PropertyDetailsImageRepository extends JpaRepository<PropertyDetailsImageEntity, String> {
//    Page<PropertyDetailsImageEntity> findByPropertyId(String propertyId, Pageable pageable);
}
