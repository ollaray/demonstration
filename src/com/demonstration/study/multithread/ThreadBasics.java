package com.demonstration.study.multithread;

/*Two ways of creating Threads:
 * 1. By extending the class called Thread
 * 2. By implementing the interface called Runnable
 */

public class ThreadBasics {
	/*DIFFERENT STATES OF A THREAD
	 * -NEW: Ready to run
	 * -RUNNABLE: Ready to run waiting for a chance for execution but another thread currently being executed
	 * -RUNNING: Thread is executing
	 * -BLOCKED/WAITING: A thread state is blocked if it is for example waiting for a third party service to respond or expecting an I/O service to respond
	 * 					 or if one thread is waiting for another thread for data
	 * -TERMINATED/DEAD: After thread is executed or completed
	 * Runnable, Running and Blocked are starts a thread can be after calling the start()
	 * 
	 * SETTING PRIORITY:
	 * -Default Priority is 5, Min_Priority is 1 and Max_Priority is 10. 
	 * -Setting Priority is actually a request, it might or might not be honored
	 * 
	 * EXECUTOR SERVICE
	 * -Helps in the controlling of the exectution of threads
	 * -We can monitor the state of each threads 
	 */
}
