package fr.uml2java;

import java.io.FileNotFoundException;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import fr.java2uml.*;

public class Main {
	/*
	//UML -> Java
    public static void main(String[] args) throws IOException {
        UMLToCode translator = new UMLToCode();
        translator.translate();
        System.out.println(translator);
    }
    */
    
	//Java -> UML
    public static void main(String[] args) throws IOException {
		JavaAnalyser j = new JavaAnalyser();
		j.startAnalyse();
    }
}
