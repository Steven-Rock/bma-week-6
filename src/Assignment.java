import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.UUID;

/**
 *  Class #6 Homework
 * @author srockny05
 */
public class Assignment {

	 private static SimpleDateFormat formatter = new SimpleDateFormat("yyyy/MM/dd");
	 private static SimpleDateFormat fullFormatter = new SimpleDateFormat("yyyy/MM/dd HH:MM");
	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Assignment a = new Assignment();
		
		
		Note note = a.new Note();
		Assignment.printTask(note);
		
		note = a.new Note("Test Note", "This is a test");
		Assignment.printTask(note);
		
		Task task = a.new Task();
		Assignment.printTask(task);
		
		String date = "2012/11/25";
	    try {
			task = a.new Task("Test Task", "This is a task", formatter.parse(date));
			Assignment.printTask(task);
		} catch (ParseException e) {
			System.out.print("Unable to format the data: " + date);
			e.printStackTrace();
		}
		
		InterviewTask interviewTask = a.new InterviewTask();
		Assignment.printTask(interviewTask);
	    
		try {
			
	    	interviewTask = a.new InterviewTask("Test Task", "This is a task", 
	    			fullFormatter.parse("2012/11/28 07:30"),
	    			true, "914-914-0914",
					"Frank Silvadore"
	    			);
			Assignment.printTask(interviewTask);
		} catch (ParseException e) {
			System.out.print("Unable to format the data: " + "2012/11/28 07:30");
			e.printStackTrace();
		}
		
	}
	
	private static void printTask(ANote note){
		if(note != null){
			System.out.println(note);
		}
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
		private UUID guid = null;
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
		public UUID getGuid() {
			return guid;
		}
		
		public void setGuid(UUID guid) {
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
		
		public Note(String name, String note) {
			super();
			setName(name);
			setNote(note);
			setGuid(UUID.randomUUID());
			setLastModifiedDate(GregorianCalendar.getInstance().getTime());
			setCreateDate(GregorianCalendar.getInstance().getTime());
			setDirty(true);
			
		}

		public Note() {
			super();
			setGuid(UUID.randomUUID());
			setLastModifiedDate(GregorianCalendar.getInstance().getTime());
			setCreateDate(GregorianCalendar.getInstance().getTime());
			setDirty(true);			
		}

		@Override
		public String toString() {
			return "Note [aNote()=" + super.toString() + ", isDirty()="
					+ isDirty() + ", getGuid()=" + getGuid() + ", getName()="
					+ getName() + ", getNote()=" + getNote()
					+ ", getLastModifiedDate()=" + getLastModifiedDate()
					+ ", getCreateDate()=" + getCreateDate() + ", getClass()="
					+ getClass() + ", hashCode()=" + hashCode() + "]";
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
					+ completedDate + ", dueDate=" + dueDate + ", Note()="
					+ super.toString() + ", isDirty()=" + isDirty()
					+ ", getGuid()=" + getGuid() + ", getName()=" + getName()
					+ ", getNote()=" + getNote() + ", getLastModifiedDate()="
					+ getLastModifiedDate() + ", getCreateDate()="
					+ getCreateDate() + ", getClass()=" + getClass()
					+ ", hashCode()=" + hashCode() + "]";
		}
		
	}
	
	public class Task extends ATask{
		
		public Task(String name, String note, Date dueDate) {
			super();
			setName(name);
			setNote(note);
			setGuid(UUID.randomUUID());
			setLastModifiedDate(GregorianCalendar.getInstance().getTime());
			setCreateDate(GregorianCalendar.getInstance().getTime());
			setCompleted(false);
			setDirty(true);
			setDueDate(dueDate);
		}

		public Task() {
			super();
			setGuid(UUID.randomUUID());
			setLastModifiedDate(GregorianCalendar.getInstance().getTime());
			setCreateDate(GregorianCalendar.getInstance().getTime());
			setCompleted(false);
			setDirty(true);
		}

		@Override
		public String toString() {
			return "Task [getDueDate()=" + getDueDate() + ", isCompleted()="
					+ isCompleted() + ", getCompletedDate()="
					+ getCompletedDate() + ", aNote()=" + super.toString()
					+ ", isDirty()=" + isDirty() + ", getGuid()=" + getGuid()
					+ ", getName()=" + getName() + ", getNote()=" + getNote()
					+ ", getLastModifiedDate()=" + getLastModifiedDate()
					+ ", getCreateDate()=" + getCreateDate() + ", getClass()="
					+ getClass() + ", hashCode()=" + hashCode() + "]";
		}
		
		
	}
	
	public class InterviewTask extends Task{
		
		boolean phoneInterview = false;
		String contactNumber = null;
		String interviewerName = null;
		
		public InterviewTask() {
			super();
		}

		public InterviewTask(String name, String note, 
				Date dueDate, boolean phoneInterview, String contactNumber,
				String interviewerName) {
			super(name, note, dueDate);
			this.phoneInterview = phoneInterview;
			this.contactNumber = contactNumber;
			this.interviewerName = interviewerName;
		}
		
		
		

		@Override
		public String toString() {
			return "InterviewTask [phoneInterview=" + phoneInterview
					+ ", contactNumber=" + contactNumber + ", interviewerName="
					+ interviewerName + ", Task=" + super.toString()
					+ ", getDueDate()=" + getDueDate() + ", isCompleted()="
					+ isCompleted() + ", getCompletedDate()="
					+ getCompletedDate() + ", isDirty()=" + isDirty()
					+ ", getGuid()=" + getGuid() + ", getName()=" + getName()
					+ ", getNote()=" + getNote() + ", getLastModifiedDate()="
					+ getLastModifiedDate() + ", getCreateDate()="
					+ getCreateDate() + ", getClass()=" + getClass()
					+ ", hashCode()=" + hashCode() + "]";
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
