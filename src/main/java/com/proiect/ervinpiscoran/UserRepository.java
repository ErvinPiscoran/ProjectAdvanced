package com.proiect.ervinpiscoran;

import com.proiect.ervinpiscoran.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

interface UserRepository extends JpaRepository<User, Long> {

}
