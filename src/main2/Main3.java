package main2;

import java.util.Date;

import cls.Course;
import cls.CourseList;
import cls.Professor;

public class Main3 {

	public static void main(String[] args) {
		
		CourseList courselist = new CourseList();
		
		
		//교수 등록
		Professor professor = new Professor(1,"가나","101호",new Date());
		
		//과목 등록
	//	Course course = new Course(100, "Java", 3,   ,new Date());
		
		// 마지막 등록 과목 삭제
		courselist.deleteCourse();
	}

}
