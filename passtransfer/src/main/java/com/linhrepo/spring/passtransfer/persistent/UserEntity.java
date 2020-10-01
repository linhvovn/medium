package com.linhrepo.spring.passtransfer.persistent;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

/**
 * 
 * @author linhvo
 *
 * https://github.com/linhvovn/medium
 */
@Getter
@Setter
@Builder
@AllArgsConstructor
@Entity
@Table(name = "user")
public class UserEntity {
	
	@Id
	private Integer id;
	
	private String username;
	
	private String password;
	
	private String displayname;

}
