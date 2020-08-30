package com.mattg.users.mapper;

import com.mattg.users.dto.UserApiResponseDto;
import com.mattg.users.dto.UserFileDto;
import com.mattg.users.entites.User;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class UserEntityToUserApiResponseDtoMapper {

    public List<UserApiResponseDto> mapObjects(List<User> userEntityList) {
        List<UserApiResponseDto> users = new ArrayList<>();
        for(User userEntity : userEntityList) {
            users.add(mapObject(userEntity));
        }
        return users;
    }

    public UserApiResponseDto mapObject(User userEntity) {
        ModelMapper modelMapper = new ModelMapper();
        UserApiResponseDto userApiResponseDto = modelMapper.map(userEntity, UserApiResponseDto.class);
        return userApiResponseDto;
    }
}
