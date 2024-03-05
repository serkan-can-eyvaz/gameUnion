package com.example.gameunion.Servis;

import com.example.gameunion.Entity.Friendship;

import java.util.List;

public interface IFriendshipServis extends IOrtakServis
{
    Friendship createFriendship(Friendship friendship);

    Friendship getFriendship(Integer friendshipId);

    Friendship updateFriendship(Friendship friendship);

    void deleteFriendship(Integer friendshipId);

    List<Friendship> getAllFriendships();
}
