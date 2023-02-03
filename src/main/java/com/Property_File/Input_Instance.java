package com.Property_File;

import java.io.IOException;

public class Input_Instance {
	
	//Private Constructor
	private Input_Instance() {
		//We can't create object in other class
	}

	//Static method
	public static Input_Reader getInstanceInput() throws IOException {
		
		Input_Reader ir = new Input_Reader();
		return ir;
	}
		
		
	
}
