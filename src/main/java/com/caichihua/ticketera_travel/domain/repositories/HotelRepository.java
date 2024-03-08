package com.caichihua.ticketera_travel.domain.repositories;
import com.caichihua.ticketera_travel.domain.entities.HotelEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HotelRepository extends JpaRepository<HotelEntity,Long> {
}
