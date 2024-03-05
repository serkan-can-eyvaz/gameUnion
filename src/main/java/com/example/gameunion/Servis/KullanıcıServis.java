package com.example.gameunion.Servis;

import com.example.gameunion.DAO.GrupDao;
import com.example.gameunion.DAO.KullanıcıDao;
import com.example.gameunion.DAO.OyunDao;
import com.example.gameunion.DAO.TournamentDao;
import com.example.gameunion.Entity.Kullanıcı;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class KullanıcıServis implements IKullanıcıServis{

    private final KullanıcıDao kullanıcıDao;//constr ijection
    private  final GrupDao grupDao;
    private final TournamentDao tournamentDao;
    private final OyunDao oyunDao;

    public KullanıcıServis(KullanıcıDao kullanıcıDao, GrupDao grupDao, TournamentDao tournamentDao, OyunDao oyunDao) {

        this.kullanıcıDao = kullanıcıDao;
        this.grupDao = grupDao;
        this.tournamentDao = tournamentDao;
        this.oyunDao = oyunDao;
    }

        /* singletion da kullanılabilirdi.
    public static KullanıcıServis getInstance(KullanıcıDao kullanıcıDao)
    {
        if(instance == null)
        {
            instance = new KullanıcıServis(kullanıcıDao);
        }
        return instance;
    }*/
    public Kullanıcı createKullanici(Kullanıcı request)
    {
        Kullanıcı kullanici =new Kullanıcı();
        kullanici.setKullanıcıAdı(request.getKullanıcıAdı());
        kullanici.setEposta(request.getEposta());
        kullanici.setPassword(request.getPassword());
        return kullanıcıDao.save(kullanici);
    }
    public Kullanıcı findUser(String username)
    {
        return  kullanıcıDao.findByUsername(username);
    }


    public Kullanıcı updatedUser(Kullanıcı kullanici)
    {
        return kullanıcıDao.save(kullanici);
    }
    public void deleteUser(String username)
    {
        kullanıcıDao.deleteByUsername(username);
    }
    public List<Kullanıcı>getAllKullanici()
    {
        return kullanıcıDao.findAll();
    }
}
