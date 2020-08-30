package com.mattg.users.mapper;

import com.mattg.users.dto.UserFileDto;
import com.mattg.users.entites.User;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class UserFileDtoToUserEntityMapper {

    public List<User> mapObjects(List<UserFileDto> userFileDtoList) {
        List<User> users = new ArrayList<>();
        for(UserFileDto userFileDto : userFileDtoList) {
            users.add(mapObject(userFileDto));
        }
        return users;
    }

    public User mapObject(UserFileDto userFileDto) {
        ModelMapper modelMapper = new ModelMapper();
        User user = modelMapper.map(userFileDto, User.class);
        return user;
    }
}
