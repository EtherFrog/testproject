package edu.iut.app;

import java.util.LinkedList;

/**
 * 
 * @author Joe&Jonhatan
 *
 */
public class Agenda extends LinkedList<ExamEvent> {
	public Agenda() {		
	}
	
	public void addCheckedEvent(ExamEvent examEvent) {
		this.add(examEvent);
	}
	
}
