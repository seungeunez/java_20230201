package cls;

import java.util.Date;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


@Getter
@Setter
@ToString

//수강신청
public class Register {

	private int code = 0;
	private Course course = null;	//신청과목
	private Student student = null; //학생
	private Date date = new Date();
	
	
	
}
