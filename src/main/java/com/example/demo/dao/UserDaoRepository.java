package com.example.demo.dao;

import com.example.demo.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDaoRepository extends JpaRepository<User,Integer> { //CrudRepository<Demo, Long>
    @Query(value = "insert into user(name,password) value(?1,?2)", nativeQuery = true)
    @Modifying
    void save1(String name,String password );

    @Query(value = "update user set name=?1 where id=?2 ", nativeQuery = true)
    @Modifying
    void update1(String name,int id);
}
