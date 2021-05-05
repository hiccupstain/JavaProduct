package subjectEnrolment;

public class SubjectList {
	private SubjectEnrolment se[];
	private int count;
	
	public SubjectList(int maxsize) {
		se = new SubjectEnrolment[maxsize];
	}
	
	public boolean add(SubjectEnrolment sbj){
		if(sbj==null || se.length<=count)
			return false;
		se[count]=sbj;
		count++;
		return true;
	}
	
	public boolean remove(int index){
		if (index < 0 || index > se.length) {
			return false;
		}
		if (index != count-1) {
			for (int i = index; i < se.length - 1; i++) {
				se[i] = se[i + 1];
			}
		} else {
			se[index] = null;
		}
		count--;
		return true;
	}
	
	public SubjectEnrolment get(int index){
		return se[index];
	}
	
	public int size(){
		return count;
	}
	
	public int maxSize() {
		return se.length;
	}
	
	public int indexOf(String id){
		for(int i=0;i<se.length;i++){
			if(se[i].getSubjectId().equals(id)){
				return i;
			}
		}
		return -1;
	}
	
	public String toString(){
		String info = "";
		for(int i = 0;i<count;i++){
			info = info+se[i].toString()+"\n";
		}
		return info;
	}
	
	public boolean isFull(){
		if(size()==se.length){
			return true;
		}else
			return false;
	}

}
