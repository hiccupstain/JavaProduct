package subjectEnrolment;

public class SubjectEnrolment {
	private Subject subject;
	private Student list[];
	private int count;
	
	public SubjectEnrolment(Subject subject,int maxsize){
		list = new Student[maxsize];
		count = 0;
		this.subject = subject;
	}
	
	public boolean add(Student stu){
		if(stu==null || list.length<=count)
			return false;
		list[count]=stu;
		count++;
		return true;
	}
	
	public boolean remove(int index){
		if (index < 0 || index > list.length) {
			return false;
		}
		if (index != count-1) {
			for (int i = index; i < list.length - 1; i++) {
				list[i] = list[i + 1];
			}
		} else {
			list[index] = null;
		}
		count--;
		return true;
	}
	
	public Student get(int index){
		return list[index];
	}
	
	public int size(){
		return count;
	}
	
	public int maxSize() {
		return list.length;
	}
	
	public int indexOf(String id){
		for(int i=0;i<list.length;i++){
			if(list[i].getId().equals(id)){
				return i;
			}
		}
		return -1;
	}
	
	public String toString(){
		String info = "";
		for(int i = 0;i<count;i++){
			info = info+list[i].toString()+"\n";
		}
		return info;
	}
	
	public boolean isFull(){
		if(size()==list.length){
			return true;
		}else
			return false;
	}

	public Subject getSubject(){
		return subject;
	}
	
	public String getSubjectId() {
		return getSubject().getID();
	}
}
