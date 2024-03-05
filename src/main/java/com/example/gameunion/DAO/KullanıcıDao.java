package com.example.gameunion.DAO;

import com.example.gameunion.Entity.Kullanıcı;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface KullanıcıDao extends JpaRepository<Kullanıcı,Integer>
{

    Kullanıcı findByUsername(String username);

    void deleteByUsername(String username);

}
