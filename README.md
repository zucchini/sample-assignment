CS 1337 Homework 1: Zucchini Sample JUnit Assignment
==============================

This is a sample Zucchini assignment that makes use of the JUnit backend. It is used as part of the Sample Workflow in https://zucchini.readthedocs.io/en/latest/usage.html

Assignment Details
----
The assignment requires students to use a stock LinkedList to write two classes, LLQueue and LLStack, that conform to two interfaces shipped with the assignment, QueueInterface and StackInterface. JUnit tests for the classes are used for grading.

The setup of the Gradle config in `grading-files/build.gradle` allows for students to submit only the `LLQueue.java` and `LLStack.java` files at the root of their submission. Gradle moves these files to the correct positions before running the compiler.

The zucchini assignment is set up in such a way that the Stack and Queue tests are completely separate. This allows for grading for one component to run regardless of whether or not the other file is submitted (and regardless of whether or not both files compile). This can be seen in action in the Sample Workflow linked above.

Note that the grading-files directory contains the full solution of the assignment, and the `build.gradle` setup does not prevent this instructor solution from being run without touching zucchini: 

  $ cd grading-files
  $ ./gradlew test
  
However, since the `grading-files` directive in the zucchini config does not contain the actual solution files, these files will not be copied to the temporary grading directories during grading, and as a result, cannot possibly be mistaken for a student submission when a student hasn't made such a submission.
