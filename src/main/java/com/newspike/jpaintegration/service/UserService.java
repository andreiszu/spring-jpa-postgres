package com.newspike.jpaintegration.service;

import com.newspike.jpaintegration.domain.repository.UserRepository;
import com.newspike.jpaintegration.dto.UserDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepository;

    public List<UserDto> getAllUsers() {
        return userRepository.findAll().stream()
                .map(user -> UserDto.builder()
                        .id(user.getId())
                        .email(user.getEmail())
                        .build())
                .collect(Collectors.toList());
    }
}
