package com.company;

import java.util.Scanner;

public class menu {
    Scanner scanner = new Scanner(System.in);
    Dane dane = new Dane();
    private String imie;
    private String nazwisko;
    private double sredniaOcen;
    private int indeks;
    private int switchyk;
    private static final String MENU =
            "    M E N U   G Ł Ó W N E  \n" +
                    "1 - Podaj dane nowej osoby \n" +
                    "2 - Usuń dane osoby        \n" +
                    "3 - Pokaz liste studentow   \n" +
                    "0 - Zakończ program        \n";
    public void menu()
    {
        for(;true;)
        {
            System.out.println(MENU);
            switchyk=scanner.nextInt();
            scanner.nextLine();
            switch (switchyk)
            {
                case 1:
                {
                    System.out.println("Podaj imie: ");
                    imie=scanner.nextLine();
                    System.out.println("Podaj nazwisko: ");
                    nazwisko=scanner.nextLine();
                    System.out.println("Podaj srednia ocen: ");
                    sredniaOcen=scanner.nextDouble();
                    scanner.nextLine();
                    System.out.println("Podaj indeks: ");
                    indeks=scanner.nextInt();
                    scanner.nextLine();
                    dane.dodanieOsoby(new Student(imie,nazwisko,sredniaOcen,indeks));
                    break;
                }
                case 2:
                {
                    System.out.println("Podaj imie osoby ktora chcesz usunac: ");
                    imie= scanner.nextLine();
                    System.out.println("Podaj nazwisko osoby ktora chcesz usunac: ");
                    nazwisko= scanner.nextLine();
                    System.out.println("Podaj studencki indeks osoby ktora chcesz usunac: ");
                    indeks= scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Podaj srednia ocen osoby ktora chcesz usunac: ");
                    sredniaOcen= scanner.nextDouble();
                    scanner.nextLine();
                    dane.usuniecieOsoby(new Student(this.imie,this.nazwisko,this.sredniaOcen,this.indeks));
                    break;
                }
                case 3:
                {
                    System.out.println("Za pomocą jakiej kolekcji chcesz wyświrtlić danee? \n" +
                                    "1 - ArrayLsit\n"+
                                    "2 - LinkedList\n"+
                                    "3 - HashSet\n"+
                                    "4 - TreeSet\n"+
                                    "5 - HashMap\n"+
                                    "6 - TreeMap\n");
                    switchyk=scanner.nextInt();
                    scanner.nextLine();
                    switch (switchyk)
                    {
                        case 1:
                        {
                            dane.wypiszArrayList();
                            break;
                        }
                        case 2:
                        {
                            dane.wypiszLinkedList();
                            break;
                        }
                        case 3:
                        {
                            dane.wypiszHashSet();
                            break;
                        }
                        case 4:
                        {
                            dane.wypiszTreeSet();
                            break;
                        }
                        case 5:
                        {
                            dane.wypiszHashMap();
                            break;
                        }
                        case 6:
                        {
                            dane.wypiszTreeMap();
                            break;
                        }
                    }
                    break;
                }
                case 0:
                {
                    System.exit(0);
                }

            }
        }
    }
}
