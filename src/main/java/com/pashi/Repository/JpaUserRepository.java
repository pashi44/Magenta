package com.pashi.Repository; // lowercase packages by convention

import com.pashi.Models.User;
import jakarta.persistence.EntityManager;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Repository
@Transactional(readOnly = true)
public class JpaUserRepository implements UserRepository {

    private final EntityManager em;

    // Single constructor → Spring injects automatically (no @Autowired required)
    public JpaUserRepository(EntityManager em) {
        this.em = em;
    }

    @Override
    public User findUserById(Long id) {
        return null;
    }
}