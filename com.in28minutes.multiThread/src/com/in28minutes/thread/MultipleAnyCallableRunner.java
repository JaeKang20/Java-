package com.in28minutes.thread;

import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class CallableTask3 implements Callable<String> {

	String name;

	public CallableTask3(String name) {
		this.name = name;
	}

	@Override
	public String call() throws Exception {
		Thread.sleep(1000);
		return "Hello, " + name;
	}

}

public class MultipleAnyCallableRunner {

	public static void main(String[] args) throws InterruptedException, ExecutionException {

		List<CallableTask3> tasks = List.of(new CallableTask3("Keyboard"), new CallableTask3("Jean"),
				new CallableTask3("Daniel"));
		ExecutorService executorService = Executors.newFixedThreadPool(tasks.size());
		String invokeAny = executorService.invokeAny(tasks);
		System.out.println(invokeAny);
		executorService.shutdown();

	}

}
