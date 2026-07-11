package sctask2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Person {
	@Autowired
	Scanner sc;
	
	@Autowired
	ArrayList<Integer> al;
	
	@Autowired
	HashSet<Integer> hs;
	
	@Autowired
	HashMap<Integer,String> hm;
}
