package com.thread;


public class ThreadDemo {
	  public static void main(String args[]){
		  ThreadCount thread1=new ThreadCount("thread1");
		  ThreadCount thread2=new ThreadCount("thread2");
		  thread1.start();
		  thread2.start();
		  
	  }
	}

/**
 * 通过继承Thread，新建线程类。
 */
	class ThreadCount extends Thread{
		private String name;
		public ThreadCount(String name){
			this.name=name;
		}
		@Override
		public void run(){
			for(int i=0;i<10;i++)
			   System.out.println(name+"计数："+i);
		}
		
		
	}