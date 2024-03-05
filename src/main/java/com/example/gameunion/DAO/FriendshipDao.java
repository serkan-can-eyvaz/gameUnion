package com.example.gameunion.DAO;

import com.example.gameunion.Entity.Friendship;
import com.example.gameunion.Entity.Kullanıcı;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface FriendshipDao extends JpaRepository<Friendship,Integer> {
  //  boolean existsByKullanici1AndKullanici2(Kullanıcı kullanici1, Kullanıcı kullanici2);

   // List<Friendship> findAllByKullanici1OrKullanici2(Kullanıcı kullanici, Kullanıcı kullanici1);
}
