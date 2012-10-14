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

		Task1 task = null;
		task = a.new Task1();
		System.out.println(task);

		task = a.new Task1("Test", "First note ever made, yahoo!", GregorianCalendar.getInstance().getTime());
		System.out.println(task);

	}

	static String getElement(String [] values, int index){

		// validation
		if(index < 0) return null;
		if(values == null) return null;
		if(index > values.length) return null;

		return values[index];

	}
	
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
			// TODO Auto-generated constructor stub
		}
		
		
		
	}
	public abstract class ATask extends Note{
		
		private boolean completed = false;
		private Date completedDate = null;
		
		public boolean isCompleted() {
			return completed;
		}

		public void setCompleted(boolean completed) {
			this.completed = completed;
			this.completedDate = GregorianCalendar.getInstance().getTime();
		}
		
	}
	
	public class Task extends ATask{
		
	}
	/*
	 * 
	 * Abstract Note
	 * Note FlashCardNote ClassNote, Abstract Task
	 * Task, DueDateTask, CalendarTask, InterviewTask
	 * Shopping Task, Phone Task, Waiting Task
	 * MultiTask, FollowUpTask, Chore Task, NestedTask
	 */

	private class Task1{

		private String name = null;
		private String note = null;
		private boolean completed = false;

		private Date dueDate = null;
		private Date lastModifiedDate = null;
		private Date createDate = null;
		private Date completedDate = null;
		
		
		public Task1(String name, String note, Date dueDate) {
			this.name = name;
			this.note = note;
			this.dueDate = dueDate;
			this.createDate = GregorianCalendar.getInstance().getTime();
			this.lastModifiedDate = createDate;
		}

		public Task1() {
			this.createDate = GregorianCalendar.getInstance().getTime();
			this.lastModifiedDate = createDate;
		}

		@Override
		public String toString() {
			return "Task [name=" + name + ", note=" + note + ", completed="
					+ completed + ", dueDate=" + dueDate
					+ ", lastModifiedDate=" + lastModifiedDate
					+ ", createDate=" + createDate + ", completedDate="
					+ completedDate + "]";
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
		public Date getDueDate() {
			return dueDate;
		}
		public void setDueDate(Date dueDate) {
			this.dueDate = dueDate;
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

}
