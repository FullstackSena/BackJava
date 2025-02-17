package com.api.ColegioSena.Repositories;

import com.api.ColegioSena.Models.UserModels;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IUserRepository extends JpaRepository<UserModels, Long> {
}
