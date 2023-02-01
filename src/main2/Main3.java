package main2;

import java.util.Date;

import cls.Course;
import cls.CourseList;
import cls.Professor;

public class Main3 {

	public static void main(String[] args) {
		
		
		// 1. 교수 등록
		Professor professor = new Professor(3000,"가나","101호",new Date());
		
		
		// 2. 과목 생성		//()안에 입력안하는 이유는 인수 있는 생성자를 따로 안만들었기 때문에 따로 하나씩 만들어주는것
		Course course = new Course();
		course.setCode(4000);
		course.setCredit(3);
		course.setName("java 배우기");
		course.setDate(new Date());
		course.setProfessor(professor);
		
		// 3. 과목 등록
		
		CourseList courseList = new CourseList();
		courseList.insertCourse(course);
		
		// 4. 과목 조회 (출력)
		courseList.printCourse();
		
		
		
		// 5. 등록한 과목의 교수정보 조회
		
		

		
	}

}
