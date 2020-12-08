package com.jrdutra.crud.saladereuniao.salareuniao.repository;

import com.jrdutra.crud.saladereuniao.salareuniao.model.Room;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoomRepository extends JpaRepository<Room, Long>{

}
