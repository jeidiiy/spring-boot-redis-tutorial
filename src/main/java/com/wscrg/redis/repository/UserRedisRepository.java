package com.wscrg.redis.repository;

import com.wscrg.redis.entity.User;

import java.util.Map;

public interface UserRedisRepository {

    void save(User user);

    Map<String, User> findAll();

    User findById(String id);

    void update(User user);

    void delete(String id);
}
