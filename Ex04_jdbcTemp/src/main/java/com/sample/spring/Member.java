package com.sample.spring;

import lombok.Data;

// lombok을 사용하면 이렇게 어노테이션만 달아줘도 아래에 따로 getter, setter를 작성하지 않아도 된다.
// -> 빠른 개발이 가능
@Data
public class Member {
	String id;
	String name;
}
