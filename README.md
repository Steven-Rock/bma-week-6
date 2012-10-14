bma-week-6
==========

Apologies for the timing, but here is the Java segment of the homework

    Reading
        Chapter 8 in Java A Beginner's Guide - Interfaces and Packages
    Assignment
        Create a github repository to hold homework named bma-week-6 containing a class, Assignment
        Copy the Task class you created last week into the Assignment.java file
            The previous two tasks could be achieved by cloning your week 5 repository
        Apply access modifiers to your Task class
            All instances variables should be made private
            Determine what functionality and data you want to make accessible to outside callers via methods
                Some examples could include the following but I'm not trying to design your solutions.  These are just ideas
                    isComplete(): bool
                    getCompletionDate(): Calendar
                    getTitle(): String
                    getDescription(): String
                    hasPrerequisite(): bool
                    getPrerequisite(): Task
            Implement whatever functionality you come up with in the last step
        Create Task hierarchy 
            Consider different kinds of tasks (todo items) your todo list could have. 
                What extra functionality or behavior would they have?
            Consider what functionality and data would be common to all tasks
            Refactor your Task class
                Make the base Task class abstract
                Hide all instance variables with private modifiers if you didn't already
                Implement the common functionality from above as methods
                Add accessors (getters and/or setters) for any member variables you think need them
                    You don't necessarily need both
                    Its easier to add one later if you need it than to take one away
            Override methods in Task children when necessary
                At a bare minimum override toString for each child Task class
        Test new Task hierarchy
            In the Assignment class, create a method "private static void printTask(Task)" that prints out Task objects
            In Assignment's main() method, create at least one of each type of Task created earlier.
            Send each task to printTask()
            [bonus]: test the rest of your Task parent class' public interface.

This assignment is aimed at both giving a feeling for inheritance and for getting you thinking about implementation ideas for your project.  It might be that your solution doesn't have a need to inheritance hierarchies.  That's fine but there are two goals here.

-dave farley

Program Test Output:
Note [aNote()=ANote [name=null, note=null, lastModifiedDate=Sun Oct 14 00:40:03 EDT 2012, createDate=Sun Oct 14 00:40:03 EDT 2012, guid=32a656b4-ab51-43b9-9f38-c2ef6dd39bda, dirty=true], isDirty()=true, getGuid()=32a656b4-ab51-43b9-9f38-c2ef6dd39bda, getName()=null, getNote()=null, getLastModifiedDate()=Sun Oct 14 00:40:03 EDT 2012, getCreateDate()=Sun Oct 14 00:40:03 EDT 2012, getClass()=class Assignment$Note, hashCode()=207501684]
Note [aNote()=ANote [name=Test Note, note=This is a test, lastModifiedDate=Sun Oct 14 00:40:03 EDT 2012, createDate=Sun Oct 14 00:40:03 EDT 2012, guid=cc4f032f-e84d-4b02-9f82-b6fa0c71b063, dirty=true], isDirty()=true, getGuid()=cc4f032f-e84d-4b02-9f82-b6fa0c71b063, getName()=Test Note, getNote()=This is a test, getLastModifiedDate()=Sun Oct 14 00:40:03 EDT 2012, getCreateDate()=Sun Oct 14 00:40:03 EDT 2012, getClass()=class Assignment$Note, hashCode()=2114843907]
Task [getDueDate()=null, isCompleted()=false, getCompletedDate()=Sun Oct 14 00:40:03 EDT 2012, aNote()=ATask [completed=false, completedDate=Sun Oct 14 00:40:03 EDT 2012, dueDate=null, Note()=Note [aNote()=ANote [name=null, note=null, lastModifiedDate=Sun Oct 14 00:40:03 EDT 2012, createDate=Sun Oct 14 00:40:03 EDT 2012, guid=9c76ca9d-fdc4-47a5-b98d-ceef85d037f2, dirty=true], isDirty()=true, getGuid()=9c76ca9d-fdc4-47a5-b98d-ceef85d037f2, getName()=null, getNote()=null, getLastModifiedDate()=Sun Oct 14 00:40:03 EDT 2012, getCreateDate()=Sun Oct 14 00:40:03 EDT 2012, getClass()=class Assignment$Task, hashCode()=1179703452], isDirty()=true, getGuid()=9c76ca9d-fdc4-47a5-b98d-ceef85d037f2, getName()=null, getNote()=null, getLastModifiedDate()=Sun Oct 14 00:40:03 EDT 2012, getCreateDate()=Sun Oct 14 00:40:03 EDT 2012, getClass()=class Assignment$Task, hashCode()=1179703452], isDirty()=true, getGuid()=9c76ca9d-fdc4-47a5-b98d-ceef85d037f2, getName()=null, getNote()=null, getLastModifiedDate()=Sun Oct 14 00:40:03 EDT 2012, getCreateDate()=Sun Oct 14 00:40:03 EDT 2012, getClass()=class Assignment$Task, hashCode()=1179703452]
Task [getDueDate()=Sun Nov 25 00:00:00 EST 2012, isCompleted()=false, getCompletedDate()=Sun Oct 14 00:40:03 EDT 2012, aNote()=ATask [completed=false, completedDate=Sun Oct 14 00:40:03 EDT 2012, dueDate=Sun Nov 25 00:00:00 EST 2012, Note()=Note [aNote()=ANote [name=Test Task, note=This is a task, lastModifiedDate=Sun Oct 14 00:40:03 EDT 2012, createDate=Sun Oct 14 00:40:03 EDT 2012, guid=030fb8bf-df87-4a66-927a-a52706a3e35d, dirty=true], isDirty()=true, getGuid()=030fb8bf-df87-4a66-927a-a52706a3e35d, getName()=Test Task, getNote()=This is a task, getLastModifiedDate()=Sun Oct 14 00:40:03 EDT 2012, getCreateDate()=Sun Oct 14 00:40:03 EDT 2012, getClass()=class Assignment$Task, hashCode()=1591151994], isDirty()=true, getGuid()=030fb8bf-df87-4a66-927a-a52706a3e35d, getName()=Test Task, getNote()=This is a task, getLastModifiedDate()=Sun Oct 14 00:40:03 EDT 2012, getCreateDate()=Sun Oct 14 00:40:03 EDT 2012, getClass()=class Assignment$Task, hashCode()=1591151994], isDirty()=true, getGuid()=030fb8bf-df87-4a66-927a-a52706a3e35d, getName()=Test Task, getNote()=This is a task, getLastModifiedDate()=Sun Oct 14 00:40:03 EDT 2012, getCreateDate()=Sun Oct 14 00:40:03 EDT 2012, getClass()=class Assignment$Task, hashCode()=1591151994]
InterviewTask [phoneInterview=false, contactNumber=null, interviewerName=null, Task=Task [getDueDate()=null, isCompleted()=false, getCompletedDate()=Sun Oct 14 00:40:03 EDT 2012, aNote()=ATask [completed=false, completedDate=Sun Oct 14 00:40:03 EDT 2012, dueDate=null, Note()=Note [aNote()=ANote [name=null, note=null, lastModifiedDate=Sun Oct 14 00:40:03 EDT 2012, createDate=Sun Oct 14 00:40:03 EDT 2012, guid=9743ec9a-ea27-413d-a15f-6d27d5018bf6, dirty=true], isDirty()=true, getGuid()=9743ec9a-ea27-413d-a15f-6d27d5018bf6, getName()=null, getNote()=null, getLastModifiedDate()=Sun Oct 14 00:40:03 EDT 2012, getCreateDate()=Sun Oct 14 00:40:03 EDT 2012, getClass()=class Assignment$InterviewTask, hashCode()=2025190714], isDirty()=true, getGuid()=9743ec9a-ea27-413d-a15f-6d27d5018bf6, getName()=null, getNote()=null, getLastModifiedDate()=Sun Oct 14 00:40:03 EDT 2012, getCreateDate()=Sun Oct 14 00:40:03 EDT 2012, getClass()=class Assignment$InterviewTask, hashCode()=2025190714], isDirty()=true, getGuid()=9743ec9a-ea27-413d-a15f-6d27d5018bf6, getName()=null, getNote()=null, getLastModifiedDate()=Sun Oct 14 00:40:03 EDT 2012, getCreateDate()=Sun Oct 14 00:40:03 EDT 2012, getClass()=class Assignment$InterviewTask, hashCode()=2025190714], getDueDate()=null, isCompleted()=false, getCompletedDate()=Sun Oct 14 00:40:03 EDT 2012, isDirty()=true, getGuid()=9743ec9a-ea27-413d-a15f-6d27d5018bf6, getName()=null, getNote()=null, getLastModifiedDate()=Sun Oct 14 00:40:03 EDT 2012, getCreateDate()=Sun Oct 14 00:40:03 EDT 2012, getClass()=class Assignment$InterviewTask, hashCode()=2025190714]
InterviewTask [phoneInterview=true, contactNumber=914-914-0914, interviewerName=Frank Silvadore, Task=Task [getDueDate()=Sat Jun 28 07:00:00 EDT 2014, isCompleted()=false, getCompletedDate()=Sun Oct 14 00:40:03 EDT 2012, aNote()=ATask [completed=false, completedDate=Sun Oct 14 00:40:03 EDT 2012, dueDate=Sat Jun 28 07:00:00 EDT 2014, Note()=Note [aNote()=ANote [name=Test Task, note=This is a task, lastModifiedDate=Sun Oct 14 00:40:03 EDT 2012, createDate=Sun Oct 14 00:40:03 EDT 2012, guid=d894a2a9-d792-45a7-b3ff-87f2f8b6d536, dirty=true], isDirty()=true, getGuid()=d894a2a9-d792-45a7-b3ff-87f2f8b6d536, getName()=Test Task, getNote()=This is a task, getLastModifiedDate()=Sun Oct 14 00:40:03 EDT 2012, getCreateDate()=Sun Oct 14 00:40:03 EDT 2012, getClass()=class Assignment$InterviewTask, hashCode()=1912008895], isDirty()=true, getGuid()=d894a2a9-d792-45a7-b3ff-87f2f8b6d536, getName()=Test Task, getNote()=This is a task, getLastModifiedDate()=Sun Oct 14 00:40:03 EDT 2012, getCreateDate()=Sun Oct 14 00:40:03 EDT 2012, getClass()=class Assignment$InterviewTask, hashCode()=1912008895], isDirty()=true, getGuid()=d894a2a9-d792-45a7-b3ff-87f2f8b6d536, getName()=Test Task, getNote()=This is a task, getLastModifiedDate()=Sun Oct 14 00:40:03 EDT 2012, getCreateDate()=Sun Oct 14 00:40:03 EDT 2012, getClass()=class Assignment$InterviewTask, hashCode()=1912008895], getDueDate()=Sat Jun 28 07:00:00 EDT 2014, isCompleted()=false, getCompletedDate()=Sun Oct 14 00:40:03 EDT 2012, isDirty()=true, getGuid()=d894a2a9-d792-45a7-b3ff-87f2f8b6d536, getName()=Test Task, getNote()=This is a task, getLastModifiedDate()=Sun Oct 14 00:40:03 EDT 2012, getCreateDate()=Sun Oct 14 00:40:03 EDT 2012, getClass()=class Assignment$InterviewTask, hashCode()=1912008895]
