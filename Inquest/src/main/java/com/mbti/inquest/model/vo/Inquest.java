package com.mbti.inquest.model.vo;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Inquest {
	// 번호, 질문, 답변, 타입, 선택 결과, 최종 결과
	private int iNo;
	private String question;
	private String[] answer;
	private char[] type;
	private char[] select;
	private String mbti;
}
