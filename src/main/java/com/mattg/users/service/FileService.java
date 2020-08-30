package com.mattg.users.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.mattg.users.dto.UserFileDto;
import org.apache.commons.io.FileUtils;
import org.springframework.stereotype.Service;
import org.springframework.util.ResourceUtils;

import java.io.*;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.List;

@Service
public class FileService {

    public static final String FILE_PATH = "";

    public List<UserFileDto> loadFromFile() throws IOException {
        String fileData = readDataFromFile();
        UserFileDto[] userFileDtosArray = mapJsonStringToUser(fileData);
        List<UserFileDto> list = Arrays.asList(userFileDtosArray);
        return list;
    }

    public String readDataFromFile() throws IOException {
        File file = ResourceUtils.getFile("classpath:static/sampleData.json");
        String data = FileUtils.readFileToString(file,
                Charset.defaultCharset());
        return data;
    }

    private UserFileDto[] mapJsonStringToUser(String json) throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();
        UserFileDto[] users = mapper.readValue(json, UserFileDto[].class);
        return users;
    }

    private String readFromInputStream(InputStream inputStream)
            throws IOException {
        StringBuilder resultStringBuilder = new StringBuilder();
        try (BufferedReader br
                     = new BufferedReader(new InputStreamReader(inputStream))) {
            String line;
            while ((line = br.readLine()) != null) {
                resultStringBuilder.append(line).append("\n");
            }
        }
        return resultStringBuilder.toString();
    }
}
