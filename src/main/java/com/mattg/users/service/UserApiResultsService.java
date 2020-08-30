package com.mattg.users.service;

import com.mattg.users.dto.UserApiResponseDto;
import com.mattg.users.entites.User;
import com.mattg.users.mapper.UserEntityToUserApiResponseDtoMapper;
import com.mattg.users.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserApiResultsService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private UserEntityToUserApiResponseDtoMapper mapper;

    public UserApiResponseDto findUserById(String id) {
        Optional<User> user = userRepository.findById(Long.valueOf(id));
        if(user.isPresent()) {
            UserApiResponseDto responseDto = mapper.mapObject(user.get());
            return responseDto;
        }
        return null;
    }

    public List<UserApiResponseDto> findAllUsers() {
        List<User> user = userRepository.findAll();
        List<UserApiResponseDto> responseDtoList = mapper.mapObjects(user);
        return responseDtoList;
    }


}
