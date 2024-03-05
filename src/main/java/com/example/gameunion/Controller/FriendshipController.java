package com.example.gameunion.Controller;
import com.example.gameunion.Servis.FriendshipServis;
import com.example.gameunion.Entity.Friendship;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/FriendShip")
public class FriendshipController
{
    private final FriendshipServis friendshipServis;

    public FriendshipController(FriendshipServis friendshipServis) {
        this.friendshipServis = friendshipServis;
    }

    @PostMapping
    public ResponseEntity<Friendship> createFriendship(@RequestBody Friendship friendship) {
        Friendship savedFriendship = friendshipServis.createFriendship(friendship);
        return new ResponseEntity<>(savedFriendship, HttpStatus.CREATED);
    }

    @GetMapping("/{friendshipId}")
    public ResponseEntity<Friendship> getFriendship(@PathVariable Integer friendshipId) {
        Friendship friendship = friendshipServis.getFriendship(friendshipId);
        return friendship != null ? ResponseEntity.ok(friendship) : ResponseEntity.notFound().build();
    }

    @PutMapping("/{friendshipId}")
    public ResponseEntity<Friendship> updateFriendship(@PathVariable Integer friendshipId, @RequestBody Friendship friendship) {
        Friendship updatedFriendship = friendshipServis.updateFriendship(friendship);
        return updatedFriendship != null ? ResponseEntity.ok(updatedFriendship) : ResponseEntity.notFound().build();
    }

    @DeleteMapping("/{friendshipId}")
    public ResponseEntity<Void> deleteFriendship(@PathVariable Integer friendshipId) {
        friendshipServis.deleteFriendship(friendshipId);
        return ResponseEntity.noContent().build();
    }

    @GetMapping
    public ResponseEntity<List<Friendship>> getAllFriendships() {
        List<Friendship> friendships = friendshipServis.getAllFriendships();
        return ResponseEntity.ok(friendships);
    }
}
