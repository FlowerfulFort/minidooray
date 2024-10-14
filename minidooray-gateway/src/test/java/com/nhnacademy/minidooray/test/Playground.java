package com.nhnacademy.minidooray.test;

import com.nhnacademy.minidooray.util.RestUtil;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponents;
import org.springframework.web.util.UriComponentsBuilder;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

@Slf4j
public class Playground {
    @Test
    void Test() {
        UriComponentsBuilder builder = UriComponentsBuilder.newInstance();
        UriComponents components = builder.scheme("http").host("localhost").port(3434)
                .path("/projects/{projectId}/tasks/{taskId}").encode()
                .buildAndExpand(1231L, 34234L);

        log.info("{}", components.toString());
    }

}
