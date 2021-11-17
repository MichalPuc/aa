package com.company;

import java.util.*;

public class Dane {
    private ArrayList<Student> arraylsit = new ArrayList<Student>();
    private LinkedList<Student> linkedlist = new LinkedList<Student>();
    private HashSet<Student> hashset = new HashSet<Student>();
    private TreeSet<Student> treeset = new TreeSet<Student>();
    private HashMap<Student, Student> hashmap = new HashMap<Student,Student>();
    private TreeMap<Student, Student> treemap = new TreeMap<Student, Student>();

    public Dane()
    {
        this.arraylsit = new ArrayList<Student>();
        this.linkedlist = new LinkedList<Student>();
        this.hashset = new HashSet<Student>();
        this.treeset = new TreeSet<Student>();
        this.hashmap = new HashMap<Student,Student>();
        this.treemap = new TreeMap<Student, Student>();

    }
    public void dodanieOsoby(Student osoba)
    {
        arraylsit.add(osoba);
        linkedlist.add(osoba);
        hashset.add(osoba);
        treeset.add(osoba);
        hashmap.put(osoba,osoba);
        treemap.put(osoba,osoba);
    }
    public void usuniecieOsoby(Student osoba)
    {
        arraylsit.remove(osoba);
        linkedlist.remove(osoba);
        hashset.remove(osoba);
        treeset.remove(osoba);
        hashmap.remove(osoba,osoba);
        treemap.remove(osoba,osoba);
    }
    public void wypiszArrayList()
    {
        System.out.println(arraylsit);
    }
    public void wypiszLinkedList()
    {
        System.out.println(linkedlist);
    }
    public void wypiszHashSet()
    {
        System.out.println(hashset);
    }
    public void wypiszTreeSet()
    {
        System.out.println(treeset);
    }
    public void wypiszHashMap()
    {
        System.out.println(hashmap);
    }
    public void wypiszTreeMap()
    {
        System.out.println(treemap);
    }
}
