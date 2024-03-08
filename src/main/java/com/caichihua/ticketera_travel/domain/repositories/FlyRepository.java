package com.caichihua.ticketera_travel.domain.repositories;

import com.caichihua.ticketera_travel.domain.entities.FlyEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FlyRepository extends JpaRepository<FlyEntity,Long> {


}
