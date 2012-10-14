import java.util.Date;
import java.util.GregorianCalendar;

/**
 *  Class #6 Homework
 * @author srockny05
 */
public class Assignment {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Assignment a = new Assignment();

		Task task = null;
		task = a.new Task();
		System.out.println(task);

		//task = a.new Task("Test", "First note ever made, yahoo!", GregorianCalendar.getInstance().getTime());
		//System.out.println(task);

	}

	static String getElement(String [] values, int index){

		// validation
		if(index < 0) return null;
		if(values == null) return null;
		if(index > values.length) return null;

		return values[index];

	}
	
	/*
	 * 
	 * Abstract Note
	 * Note FlashCardNote ClassNote, Abstract Task
	 * Task, DueDateTask, CalendarTask, InterviewTask. LocationTask
	 * Shopping Task, Phone Task, Waiting Task
	 * MultiTask, FollowUpTask, Chore Task, NestedTask
	 */
	
	public abstract class ANote{

		private String name = null;
		private String note = null;
		private Date lastModifiedDate = null;
		private Date createDate = null;
		private String guid = null;
		private boolean dirty = true;
		
		@Override
		public String toString() {
			return "ANote [name=" + name + ", note=" + note
					+ ", lastModifiedDate=" + lastModifiedDate
					+ ", createDate=" + createDate + ", guid=" + guid
					+ ", dirty=" + dirty + "]";
		}
		
		public boolean isDirty() {
			return dirty;
		}
		public void setDirty(boolean dirty) {
			this.dirty = dirty;
		}
		public String getGuid() {
			return guid;
		}
		public void setGuid(String guid) {
			this.guid = guid;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getNote() {
			return note;
		}
		public void setNote(String note) {
			this.note = note;
		}
		public Date getLastModifiedDate() {
			return lastModifiedDate;
		}
		public void setLastModifiedDate(Date lastModifiedDate) {
			this.lastModifiedDate = lastModifiedDate;
		}
		public Date getCreateDate() {
			return createDate;
		}
		public void setCreateDate(Date createDate) {
			this.createDate = createDate;
		}
		
		
	}
	
	public class Note extends ANote {
		
		public Note(String name, String note, String guid) {
			super();
			setName(name);
			setNote(note);
			setGuid(guid);
			setLastModifiedDate(GregorianCalendar.getInstance().getTime());
			setCreateDate(GregorianCalendar.getInstance().getTime());
			setDirty(true);
			
		}

		public Note() {
			super();
		}
		
	}
	public abstract class ATask extends Note{
		
		private boolean completed = false;
		private Date completedDate = null;
		private Date dueDate = null;
		
		public Date getDueDate() {
			return dueDate;
		}

		public void setDueDate(Date dueDate) {
			this.dueDate = dueDate;
		}

		public boolean isCompleted() {
			return completed;
		}

		public void setCompleted(boolean completed) {
			this.completed = completed;
			this.completedDate = GregorianCalendar.getInstance().getTime();
		}

		
		public Date getCompletedDate() {
			return completedDate;
		}

		public void setCompletedDate(Date completedDate) {
			this.completedDate = completedDate;
		}

		@Override
		public String toString() {
			return "ATask [completed=" + completed + ", completedDate="
					+ completedDate + ", dueDate=" + dueDate + ", toString()="
					+ super.toString() + ", isDirty()=" + isDirty()
					+ ", getGuid()=" + getGuid() + ", getName()=" + getName()
					+ ", getNote()=" + getNote() + ", getLastModifiedDate()="
					+ getLastModifiedDate() + ", getCreateDate()="
					+ getCreateDate() + ", getClass()=" + getClass()
					+ ", hashCode()=" + hashCode() + "]";
		}
		
	}
	
	public class Task extends ATask{
		
		public Task(String name, String note, String guid, Date dueDate) {
			super();
			setName(name);
			setNote(note);
			setGuid(guid);
			setLastModifiedDate(GregorianCalendar.getInstance().getTime());
			setCreateDate(GregorianCalendar.getInstance().getTime());
			setCompleted(false);
			setDirty(true);
			setDueDate(dueDate);
		}

		public Task() {
			super();
		}
		
		
	}
	
	public class InterviewTask extends Task{
		
		boolean phoneInterview = false;
		String contactNumber = null;
		String interviewerName = null;
		
		public InterviewTask() {
			super();
		}

		public InterviewTask(String name, String note, String guid,
				Date dueDate, boolean phoneInterview, String contactNumber,
				String interviewerName) {
			super(name, note, guid, dueDate);
			this.phoneInterview = phoneInterview;
			this.contactNumber = contactNumber;
			this.interviewerName = interviewerName;
		}
		
		
		@Override
		public String toString() {
			return "InterviewTask [phoneInterview=" + phoneInterview
					+ ", contactNumber=" + contactNumber + ", interviewerName="
					+ interviewerName + ", getDueDate()=" + getDueDate()
					+ ", isCompleted()=" + isCompleted()
					+ ", getCompletedDate()=" + getCompletedDate()
					+ ", toString()=" + super.toString() + ", isDirty()="
					+ isDirty() + ", getGuid()=" + getGuid() + ", getName()="
					+ getName() + ", getNote()=" + getNote()
					+ ", getLastModifiedDate()=" + getLastModifiedDate()
					+ ", getCreateDate()=" + getCreateDate() + ", getClass()="
					+ getClass() + ", hashCode()=" + hashCode() + "]";
		}

		public boolean isPhoneInterview() {
			return phoneInterview;
		}

		public void setPhoneInterview(boolean phoneInterview) {
			this.phoneInterview = phoneInterview;
		}

		public String getContactNumber() {
			return contactNumber;
		}

		public void setContactNumber(String contactNumber) {
			this.contactNumber = contactNumber;
		}

		public String getInterviewerName() {
			return interviewerName;
		}

		public void setInterviewerName(String interviewerName) {
			this.interviewerName = interviewerName;
		}
		
		
	}
	

}
