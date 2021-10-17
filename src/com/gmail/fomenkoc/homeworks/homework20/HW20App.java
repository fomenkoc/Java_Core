package com.gmail.fomenkoc.homeworks.homework20;

import com.gmail.fomenkoc.homeworks.homework20.classes.MyThread;
import com.gmail.fomenkoc.homeworks.homework20.classes.RunnableThread;

public class HW20App {

	public static void main(String[] args) throws InterruptedException {

		MyThread myThread = new MyThread();

		RunnableThread runnableThread = new RunnableThread();
		Thread thread = new Thread(runnableThread);
		
		myThread.start();
		myThread.join();
		thread.start();
		thread.join();

	}

}
