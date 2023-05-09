package com.in28minutes.thread;

import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class CallableTask2 implements Callable<String> {
	String name;
	
	public CallableTask2(String name) {
		this.name = name;
	}

	@Override
	public String call() throws Exception {
		Thread.sleep(3000);
		return "Hello, " + name;
	}
	
}

public class MultipleCallableRunner {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
//		ExecutorService executorService = Executors.newFixedThreadPool(3);
//		List<CallableTask2> tasks = List.of(new CallableTask2("Michael"),
//											new CallableTask2("John"),
//											new CallableTask2("Jonathan"));
//		List<Future<String>> results = executorService.invokeAll(tasks);
//		
//		for (Future<String> welcomeFuture : results) {
//			System.out.println(welcomeFuture.get());
//		}
//		executorService.shutdown();
		ExecutorService executorService = Executors.newFixedThreadPool(3);
		List<CallableTask2> tasks = List.of(new CallableTask2("Marster"), new CallableTask2("Keyboard"));
		List<Future<String>> results = executorService.invokeAll(tasks);
		for (Future<String> welcome : results) {
			System.out.println(welcome.get());
		}
		executorService.shutdown();
	}


}
