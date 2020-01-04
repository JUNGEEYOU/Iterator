package dinermerger;

// Iterator 인터페이스: 반복 작업을 자료 구조 형태에 따라 캡슐화
public interface Iterator {
	boolean hasNext();
	MenuItem next();
}
