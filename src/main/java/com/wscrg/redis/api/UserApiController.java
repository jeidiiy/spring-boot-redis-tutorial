//package com.wscrg.redis.api;
//
//import com.wscrg.redis.entity.User;
//import com.wscrg.redis.repository.UserRedisRepository;
//import lombok.RequiredArgsConstructor;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.Map;
//
//@RequiredArgsConstructor
//@RequestMapping("/api/users")
//@RestController
//public class UserApiController {
//
//    private final UserRedisRepository userRedisRepository;
//
//    @GetMapping
//    public Map<String, User> getAllUsers() {
//        return userRedisRepository.findAll();
//    }
//
//    @GetMapping("/{id}")
//    public User getUserById(@PathVariable String id) {
//        return userRedisRepository.findById(id);
//    }
//
//    @PostMapping("/{id}/{name}")
//    public User add(@PathVariable final String id, @PathVariable final String name) {
//        userRedisRepository.save(new User(id, name, 1000L));
//        return userRedisRepository.findById(id);
//    }
//
//    @PatchMapping("/{id}")
//    public User update(@PathVariable final String id) {
//        User user = userRedisRepository.findById(id);
//        user.setSalary(user.getSalary() * 2);
//        userRedisRepository.update(user);
//        return user;
//    }
//
//    @DeleteMapping("/{id}")
//    public String delete(@PathVariable final String id) {
//        userRedisRepository.delete(id);
//        return id;
//    }
//}
