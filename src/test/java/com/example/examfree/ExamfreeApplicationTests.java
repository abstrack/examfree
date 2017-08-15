package com.example.examfree;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Random;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ExamfreeApplicationTests {
	final Random random = new Random();

	@Test
	public void contextLoads() {
		ArrayList<Integer> steps = new ArrayList<>();
		for (int i = 0; i < 10; i++) {
		steps.add(i);
		}
		System.out.println(steps);
		Collections.shuffle(steps);
		System.out.println("CSH"+steps);
	}

}
