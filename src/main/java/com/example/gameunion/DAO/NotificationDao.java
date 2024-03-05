package com.example.gameunion.DAO;

import com.example.gameunion.Entity.Notification;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NotificationDao extends JpaRepository<Notification,Integer> {
}
