package org.behavioural.pattern.iterator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class StringArray {

	private String [] elements = {"A","B","C", "D", "E"};

	public StringArray() {
	}

	public StringArray(String[] elements) {
		this.elements = elements;
	}

	public String[] getArray(){
		return elements;
	}
	
	public void addString(String str){
		ArrayList<String> arrayList = new ArrayList<String>(Arrays.asList(elements));
		arrayList.add(str);
		elements = arrayList.toArray(new String[0]);
	}

	public Iterator<String> iterator() {
		return new ArrayIterator();
	}

	private class ArrayIterator implements Iterator<String>{

		private int currentIndex = 0;

		@Override
		public boolean hasNext() {
			if (currentIndex < elements.length){
				return true;
			}
			else{
				return false;
			}
		}

		@Override
		public String next() {
			if (this.hasNext()){
				return elements[currentIndex++];
			}
			else{
				return null;
			}
		}

		@Override
		public void remove() {
			ArrayList<String> arrayList = new ArrayList<String>(Arrays.asList(elements));
			arrayList.remove(--currentIndex);
			elements = arrayList.toArray(new String[0]);
		}

	}

}
