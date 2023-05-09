package com.in28minutes.thread;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

//Callable인터페이스를 구현한 클래스로와, ExecutorService 인터페이스를 구현한 코드
class CallableTask implements Callable<String> {
	private String name;

	public CallableTask(String name) {
		this.name = name;
	}
	// memeber변수 String name와, 생성자 가지고 있음.

	@Override
	public String call() throws Exception {
		Thread.sleep(1000);
		return "Hello" + name;
	}
}

public class CallableRunner {

	public static void main(String[] args) throws InterruptedException, ExecutionException {

		ExecutorService executorService = Executors.newFixedThreadPool(1);
		Future<String> welcomeFuture = executorService.submit(new CallableTask("Keyboard"));

		System.out.println("new CallableTask (\"Keyboard\") executed");
		String welcomeMessage = welcomeFuture.get();

		System.out.println(welcomeFuture.get());

		executorService.shutdown();

		System.out.println("\nMain completed");
	}

}
