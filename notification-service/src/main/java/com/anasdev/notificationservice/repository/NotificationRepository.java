package com.anasdev.notificationservice.repository;
import com.anasdev.notificationservice.model.Notification;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface NotificationRepository extends MongoRepository<Notification, String> {
    // Custom query methods can be added here if needed
}
