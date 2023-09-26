package com.min.edu.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

//TODO 04 myBatis에서 사용할 vo 객체 선언
/*
 * application.properties에 의해서 TypeAlias가 자동으로 클래스 이름인 EdoVo로 선
 */
@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class EduVo {
	private int seq;
	private String id;
	private String title;
	private String content;
	private String delflag;
	private String regdate;
}
