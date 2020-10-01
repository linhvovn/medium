package com.linhrepo.spring.passtransfer;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 
 * @author linhvo
 *
 * https://github.com/linhvovn/medium
 */
@SpringBootApplication
public class SafePasswordTransferApplication implements CommandLineRunner {

	public static void main(String[] args) throws Exception {
		SpringApplication.run(SafePasswordTransferApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
	}
}
