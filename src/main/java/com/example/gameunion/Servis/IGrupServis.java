package com.example.gameunion.Servis;

import com.example.gameunion.Entity.Grup;

import java.util.List;

public interface IGrupServis extends IOrtakServis
{
    Grup createGrup(Grup grup);

    Grup getGrup(Integer grupId);

    Grup updateGrup(Grup grup);

    void deleteGrup(Integer grupId);
    List<Grup> getAllGruplar();
}
