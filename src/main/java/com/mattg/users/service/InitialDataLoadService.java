package com.mattg.users.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.mattg.users.dto.UserFileDto;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

@Service
public class InitialDataLoadService {

    public List<UserFileDto> loadFromStaticString() throws IOException {
        String data = getInitialDataAsJsonString();
        UserFileDto[] userFileDtosArray = mapJsonStringToUser(data);
        List<UserFileDto> list = Arrays.asList(userFileDtosArray);
        return list;
    }

    private UserFileDto[] mapJsonStringToUser(String json) throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();
        UserFileDto[] users = mapper.readValue(json, UserFileDto[].class);
        return users;
    }

    public String getInitialDataAsJsonString() {
        return "[\n" +
                "  {\n" +
                "    \"id\": 1,\n" +
                "    \"first_name\": \"Maurise\",\n" +
                "    \"last_name\": \"Shieldon\",\n" +
                "    \"email\": \"mshieldon0@squidoo.com\",\n" +
                "    \"ip_address\": \"192.57.232.111\",\n" +
                "    \"latitude\": 34.003135,\n" +
                "    \"longitude\": -117.7228641\n" +
                "  },\n" +
                " {\n" +
                "    \"id\": 977,\n" +
                "    \"first_name\": \"Devi\",\n" +
                "    \"last_name\": \"Overthrow\",\n" +
                "    \"email\": \"doverthrowr4@blinklist.com\",\n" +
                "    \"ip_address\": \"72.96.196.148\",\n" +
                "    \"latitude\": 40.4938437,\n" +
                "    \"longitude\": -8.4743511\n" +
                "  },\n" +
                "  {\n" +
                "    \"id\": 978,\n" +
                "    \"first_name\": \"Rochell\",\n" +
                "    \"last_name\": \"Guilford\",\n" +
                "    \"email\": \"rguilfordr5@craigslist.org\",\n" +
                "    \"ip_address\": \"114.87.113.38\",\n" +
                "    \"latitude\": 38.1283,\n" +
                "    \"longitude\": 46.678551\n" +
                "  },\n" +
                "  {\n" +
                "    \"id\": 979,\n" +
                "    \"first_name\": \"Chickie\",\n" +
                "    \"last_name\": \"Lille\",\n" +
                "    \"email\": \"cliller6@ed.gov\",\n" +
                "    \"ip_address\": \"227.9.121.86\",\n" +
                "    \"latitude\": -6.9092185,\n" +
                "    \"longitude\": 107.6426797\n" +
                "  },\n" +
                "  {\n" +
                "    \"id\": 980,\n" +
                "    \"first_name\": \"Marcus\",\n" +
                "    \"last_name\": \"Elton\",\n" +
                "    \"email\": \"meltonr7@princeton.edu\",\n" +
                "    \"ip_address\": \"252.170.67.137\",\n" +
                "    \"latitude\": 43.5141037,\n" +
                "    \"longitude\": 16.1076867\n" +
                "  },\n" +
                "  {\n" +
                "    \"id\": 981,\n" +
                "    \"first_name\": \"Blaire\",\n" +
                "    \"last_name\": \"Bonsey\",\n" +
                "    \"email\": \"bbonseyr8@redcross.org\",\n" +
                "    \"ip_address\": \"208.93.116.166\",\n" +
                "    \"latitude\": 52.3576375,\n" +
                "    \"longitude\": 4.7901227\n" +
                "  },\n" +
                "  {\n" +
                "    \"id\": 982,\n" +
                "    \"first_name\": \"Shellie\",\n" +
                "    \"last_name\": \"Tutchings\",\n" +
                "    \"email\": \"stutchingsr9@cnbc.com\",\n" +
                "    \"ip_address\": \"63.24.90.185\",\n" +
                "    \"latitude\": 31.875572,\n" +
                "    \"longitude\": 120.556005\n" +
                "  },\n" +
                "  {\n" +
                "    \"id\": 983,\n" +
                "    \"first_name\": \"Noella\",\n" +
                "    \"last_name\": \"Banaszczyk\",\n" +
                "    \"email\": \"nbanaszczykra@wired.com\",\n" +
                "    \"ip_address\": \"248.76.195.242\",\n" +
                "    \"latitude\": -26.99776,\n" +
                "    \"longitude\": 26.67672\n" +
                "  },\n" +
                "  {\n" +
                "    \"id\": 984,\n" +
                "    \"first_name\": \"Emory\",\n" +
                "    \"last_name\": \"Pyser\",\n" +
                "    \"email\": \"epyserrb@opensource.org\",\n" +
                "    \"ip_address\": \"70.161.198.18\",\n" +
                "    \"latitude\": 49.5288417,\n" +
                "    \"longitude\": 19.0293816\n" +
                "  },\n" +
                "  {\n" +
                "    \"id\": 985,\n" +
                "    \"first_name\": \"Weider\",\n" +
                "    \"last_name\": \"Zupa\",\n" +
                "    \"email\": \"wzuparc@vimeo.com\",\n" +
                "    \"ip_address\": \"127.13.145.224\",\n" +
                "    \"latitude\": 38.7831391,\n" +
                "    \"longitude\": -9.3478294\n" +
                "  },\n" +
                "  {\n" +
                "    \"id\": 986,\n" +
                "    \"first_name\": \"Nickey\",\n" +
                "    \"last_name\": \"Whebell\",\n" +
                "    \"email\": \"nwhebellrd@bloglines.com\",\n" +
                "    \"ip_address\": \"186.241.21.64\",\n" +
                "    \"latitude\": -7.1221059,\n" +
                "    \"longitude\": 106.5701927\n" +
                "  },\n" +
                "  {\n" +
                "    \"id\": 987,\n" +
                "    \"first_name\": \"Dewain\",\n" +
                "    \"last_name\": \"Aldie\",\n" +
                "    \"email\": \"daldiere@hc360.com\",\n" +
                "    \"ip_address\": \"12.108.48.96\",\n" +
                "    \"latitude\": \"37.1691\",\n" +
                "    \"longitude\": \"10.03478\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"id\": 988,\n" +
                "    \"first_name\": \"Aldis\",\n" +
                "    \"last_name\": \"Gallienne\",\n" +
                "    \"email\": \"agalliennerf@hubpages.com\",\n" +
                "    \"ip_address\": \"160.93.248.253\",\n" +
                "    \"latitude\": 44.6956711,\n" +
                "    \"longitude\": 20.2671882\n" +
                "  },\n" +
                "  {\n" +
                "    \"id\": 989,\n" +
                "    \"first_name\": \"Fitz\",\n" +
                "    \"last_name\": \"O'Doohaine\",\n" +
                "    \"email\": \"fodoohainerg@bloomberg.com\",\n" +
                "    \"ip_address\": \"191.40.175.91\",\n" +
                "    \"latitude\": 2.8426922,\n" +
                "    \"longitude\": 117.2911248\n" +
                "  },\n" +
                "  {\n" +
                "    \"id\": 990,\n" +
                "    \"first_name\": \"Harriett\",\n" +
                "    \"last_name\": \"Mundow\",\n" +
                "    \"email\": \"hmundowrh@domainmarket.com\",\n" +
                "    \"ip_address\": \"55.98.88.124\",\n" +
                "    \"latitude\": 36.6950261,\n" +
                "    \"longitude\": 45.1445695\n" +
                "  },\n" +
                "  {\n" +
                "    \"id\": 991,\n" +
                "    \"first_name\": \"Silvie\",\n" +
                "    \"last_name\": \"Oluwatoyin\",\n" +
                "    \"email\": \"soluwatoyinri@senate.gov\",\n" +
                "    \"ip_address\": \"165.227.141.24\",\n" +
                "    \"latitude\": 3.0782922,\n" +
                "    \"longitude\": 101.5931076\n" +
                "  },\n" +
                "  {\n" +
                "    \"id\": 992,\n" +
                "    \"first_name\": \"Maddalena\",\n" +
                "    \"last_name\": \"Offner\",\n" +
                "    \"email\": \"moffnerrj@jimdo.com\",\n" +
                "    \"ip_address\": \"168.3.210.19\",\n" +
                "    \"latitude\": 16.7275474,\n" +
                "    \"longitude\": 103.7358277\n" +
                "  },\n" +
                "  {\n" +
                "    \"id\": 993,\n" +
                "    \"first_name\": \"Holmes\",\n" +
                "    \"last_name\": \"Ielden\",\n" +
                "    \"email\": \"hieldenrk@stanford.edu\",\n" +
                "    \"ip_address\": \"69.3.23.66\",\n" +
                "    \"latitude\": 48.659828,\n" +
                "    \"longitude\": 102.625198\n" +
                "  },\n" +
                "  {\n" +
                "    \"id\": 994,\n" +
                "    \"first_name\": \"Gregor\",\n" +
                "    \"last_name\": \"Colquite\",\n" +
                "    \"email\": \"gcolquiterl@mozilla.org\",\n" +
                "    \"ip_address\": \"9.190.64.100\",\n" +
                "    \"latitude\": 64.8157528,\n" +
                "    \"longitude\": 25.433892\n" +
                "  },\n" +
                "  {\n" +
                "    \"id\": 995,\n" +
                "    \"first_name\": \"Alyce\",\n" +
                "    \"last_name\": \"Sofe\",\n" +
                "    \"email\": \"asoferm@instagram.com\",\n" +
                "    \"ip_address\": \"47.184.65.247\",\n" +
                "    \"latitude\": 50.7792181,\n" +
                "    \"longitude\": 18.0035757\n" +
                "  },\n" +
                "  {\n" +
                "    \"id\": 996,\n" +
                "    \"first_name\": \"Caresa\",\n" +
                "    \"last_name\": \"Loche\",\n" +
                "    \"email\": \"clochern@wp.com\",\n" +
                "    \"ip_address\": \"231.76.33.74\",\n" +
                "    \"latitude\": \"-10.2413\",\n" +
                "    \"longitude\": \"123.699\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"id\": 997,\n" +
                "    \"first_name\": \"Sammie\",\n" +
                "    \"last_name\": \"Dullingham\",\n" +
                "    \"email\": \"sdullinghamro@hao123.com\",\n" +
                "    \"ip_address\": \"170.2.224.156\",\n" +
                "    \"latitude\": 16.503112,\n" +
                "    \"longitude\": 107.3375791\n" +
                "  },\n" +
                "  {\n" +
                "    \"id\": 998,\n" +
                "    \"first_name\": \"Thelma\",\n" +
                "    \"last_name\": \"McSweeney\",\n" +
                "    \"email\": \"tmcsweeneyrp@deliciousdays.com\",\n" +
                "    \"ip_address\": \"214.81.12.163\",\n" +
                "    \"latitude\": 14.6099284,\n" +
                "    \"longitude\": 121.0348405\n" +
                "  },\n" +
                "  {\n" +
                "    \"id\": 999,\n" +
                "    \"first_name\": \"Celisse\",\n" +
                "    \"last_name\": \"Haug\",\n" +
                "    \"email\": \"chaugrq@stumbleupon.com\",\n" +
                "    \"ip_address\": \"18.224.170.176\",\n" +
                "    \"latitude\": 59.2830988,\n" +
                "    \"longitude\": 18.033347\n" +
                "  },\n" +
                "  {\n" +
                "    \"id\": 1000,\n" +
                "    \"first_name\": \"Ches\",\n" +
                "    \"last_name\": \"Ertelt\",\n" +
                "    \"email\": \"certeltrr@comsenz.com\",\n" +
                "    \"ip_address\": \"214.255.59.57\",\n" +
                "    \"latitude\": 28.685244,\n" +
                "    \"longitude\": 80.621591\n" +
                "  }\n" +
                "]";
    }
}
