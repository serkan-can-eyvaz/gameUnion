package com.example.gameunion.Servis;

import com.example.gameunion.DAO.FriendshipDao;
import com.example.gameunion.Entity.Friendship;
import com.example.gameunion.Entity.Kullanıcı;
import com.example.gameunion.Entity.Oyun;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FriendshipServis implements IFriendshipServis
{
    private final FriendshipDao friendshipDao;

    public FriendshipServis(FriendshipDao friendshipDao) {
        this.friendshipDao = friendshipDao;
    }


    public Friendship createFriendship(Friendship friendship) {
        return friendshipDao.save(friendship);
    }

    public Friendship getFriendship(Integer friendshipId) {
        return friendshipDao.findById(friendshipId).orElse(null);
    }

    public Friendship updateFriendship(Friendship friendship) {
        return friendshipDao.save(friendship);
    }

    public void deleteFriendship(Integer friendshipId) {
        friendshipDao.deleteById(friendshipId);
    }

    public List<Friendship> getAllFriendships() {
        return friendshipDao.findAll();
    }

    @Override
    public Oyun createGame(Oyun oyun) {
        return null;
    }

    @Override
    public Oyun getGame(Integer gameId) {
        return null;
    }

    @Override
    public Oyun updateGame(Oyun oyun) {
        return null;
    }

    @Override
    public void deleteGame(Integer oyunAdı) {

    }

    @Override
    public List<Oyun> getAllGames() {
        return null;
    }

    /*public List<Friendship> getAllFriendshipsByUser(Kullanıcı kullanici) {
        return friendshipDao.findAllByKullanici1OrKullanici2(kullanici, kullanici);
    }

    public boolean isFriend(Kullanıcı kullanici1, Kullanıcı kullanici2) {
        return friendshipDao.existsByKullanici1AndKullanici2(kullanici1, kullanici2)
                || friendshipDao.existsByKullanici1AndKullanici2(kullanici2, kullanici1);
    }*/
}
