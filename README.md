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