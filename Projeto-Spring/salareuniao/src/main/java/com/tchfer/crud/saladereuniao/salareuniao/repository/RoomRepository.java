package com.tchfer.crud.saladereuniao.salareuniao.repository;

import com.tchfer.crud.saladereuniao.salareuniao.model.Room;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoomRepository extends JpaRepository<Room, Long>{

}
