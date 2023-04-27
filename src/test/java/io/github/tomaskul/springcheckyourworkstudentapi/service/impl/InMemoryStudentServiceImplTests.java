package io.github.tomaskul.springcheckyourworkstudentapi.service.impl;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Collection;
import java.util.UUID;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
@RunWith(SpringRunner.class)
public class InMemoryStudentServiceImplTests {
    @Autowired
    InMemoryStudentServiceImpl studentService;

    @Test
    public void returns_4_unique_identifiers(){
        Collection<UUID> actual = studentService.getAllIds();

        assertThat(actual).isNotNull();
        assertThat(actual).hasSize(4);
    }
}
