package main2;

import java.util.Date;

import cls.Course;
import cls.Professor;
import cls.Register;
import cls.Student;

public class Main4 {

	public static void main(String[] args) {
		
		// 1. 학생 등록
		Student student = new Student(10, "송주현", 4, new Date());
		
		
		// 2. 교수 등록
		Professor professor = new Professor(1000, "최민서", "101호", new Date());
		
		
		// 3. 과목 등록
		Course course = new Course();
		course.setCode(4000);
		course.setCredit(3);
		course.setName("java 배우기");
		course.setDate(new Date());
		course.setProfessor(professor);
		 
		// 4. 수강 신청(1개만)
		Register register = new Register();
		register.setCode(2000);
		register.setCourse(course);		//위에 작성한거 가져오려면 ()안에 넣으면 된다.
		register.setStudent(student);
		register.setDate(new Date());
		
	
		// 5. 수강신청 내역 출력	
		
		System.out.println(register.toString());
		
		

	}

}
