package com.user.service.UserService.repositories;

import ch.qos.logback.core.net.SyslogOutputStream;
import com.user.service.UserService.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository  extends JpaRepository<User, String> {

}
