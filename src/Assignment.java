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

		task = a.new Task("Test", "First note ever made, yahoo!", GregorianCalendar.getInstance().getTime());
		System.out.println(task);

	}

	static String getElement(String [] values, int index){

		// validation
		if(index < 0) return null;
		if(values == null) return null;
		if(index > values.length) return null;

		return values[index];

	}
	
	/*
	 * Abstract Note
	 * Note FlashCardNote ClassNote, Abstract Task
	 * Task, DueDateTask, CalendarTask, InterviewTask
	 * Shopping Task, Phone Task, Waiting Task
	 * MultiTask, FollowUpTask, Chore Task, NestedTask
	 */

	private class Task{

		private String name = null;
		private String note = null;
		private boolean completed = false;

		private Date dueDate = null;
		private Date lastModifiedDate = null;
		private Date createDate = null;
		private Date completedDate = null;
		
		
		public Task(String name, String note, Date dueDate) {
			this.name = name;
			this.note = note;
			this.dueDate = dueDate;
			this.createDate = GregorianCalendar.getInstance().getTime();
			this.lastModifiedDate = createDate;
		}

		public Task() {
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
