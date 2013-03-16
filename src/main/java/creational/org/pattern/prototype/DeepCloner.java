package org.pattern.prototype;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 * This class and all of classes it contains should implement the Serializable interface
 */
public class DeepCloner  implements Cloneable,Serializable{

	private static final long serialVersionUID = 1L;

	private String name;
	private Helper helper;

	public DeepCloner(String name, Helper helper) {
		this.name = name;
		this.helper = helper;
	}

	public String getName() {
		return name;
	}

	public Helper getHelper() {
		return helper;
	}

	public DeepCloner createShallowCopy() throws CloneNotSupportedException{
		return (DeepCloner)super.clone();
	}

	public DeepCloner createDeepCopy(){
		try {
			ByteArrayOutputStream baos = new ByteArrayOutputStream();
			ObjectOutputStream oos = new ObjectOutputStream(baos);
			oos.writeObject(this);

			ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
			ObjectInputStream ois = new ObjectInputStream(bais);
			return (DeepCloner) ois.readObject();
		} catch (Exception e) {
			throw new RuntimeException("Deep Cloning failed",e);
		}
	}

	/**
	 * This class implements Serializable so that it will have it's new copy created 
	 * when it's containing class is cloned.
	 * */
	public static class Helper implements Serializable{

		private String whatToHelp;

		public Helper(String whatToHelp) {
			this.whatToHelp = whatToHelp;
		}

		public String getWhatToHelp() {
			return whatToHelp;
		}
	}
}

