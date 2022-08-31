package sk.lukas;

import java.util.Scanner;


public class Main {

  public static void main(String[] args) {


    String chodbaKuchyna = "E27/7W/4000K";
   String chodbaStoliky = "G45/E14/5W/410lm/3000K";
   String terasa = "175/250Vac/4W/420lm/3000K/320°";
   String gdBodovky = "Bodovka GU10/4W/270lm/3000K/120°";
   String gdLampy = "E27/6W/175/250Vac/560lm/3000K/160°";
   String gdLampyStred = "12W/E27/3000K";
   String gdLampyBar = "E27/6W/470lm/2700K";
   String lustre = "175/250Vac/4W/420lm/3000K/320°";
   String ghLampyOkno = "175/250Vac/4W/420lm/3000K/320°";
   String ghLampyNadStolmi = "E27/7W/580lm/3000K";
   String ghLampyObraz ="E27/7W/580lm/3000K";



    int chodbaKuchynaPocet = 100;
    int chodbaStolikyPocet = 100;
    int terasaPocet = 100;
    int gdBodovkyPocet = 100;
    int gdLampyPodGaleriouPocet = 100;
    int gdLampyStredPocet = 100;
    int gdLampyBarPocet = 100;
    int lustrePocet = 100;
    int ghLampyOknoPocet = 100;
    int ghLampyNadStolmiPocet = 100;
    int ghLampyObrazPocet = 100;
    Scanner sc = new Scanner(System.in);
    int volba;
    int volba2;
    int pocetZiaroviek;
    char znovu;

    do {
      System.out.println(
          "______________________________________________\n|            VYPÁLENÉ ŽIAROVKY               |\n|                                            |\n|             Vyber si z menu:               |\n| 1. -> vypálená žiarovka                    |\n| 2. -> sklad                                |\n|____________________________________________| ");

      System.out.println("\nZadaj tvoj výber 1 alebo 2 :");

      volba = sc.nextInt();

      if (volba == 1) {
        System.out.println(
            "\n1.Chodba,strana pri kuchyni\n2.Chodba,strana pri stolikoch\n3.Terasa\n4.Galeria dole bodovky\n5.GD lampy,pod galeriou\n6.GD lampy v strede\n7.GD lampy bar8.Galeria lustre\n9.GH lampy pri oknach\n10.GH lampy nad stolmi\n11.GH lampy pri obrazoch");
       
        System.out.println("Vyber si priestor a zadaj volbu:");
       
        volba2 = sc.nextInt();
       
        switch (volba2) {
          
          case 1:
          
            System.out.println("Zadaj počet vypálených žiaroviek:");

           
            pocetZiaroviek = sc.nextInt();
           
            chodbaKuchynaPocet = chodbaKuchynaPocet - pocetZiaroviek;
            
            System.out.println("\nZo skladu zober typ: " + chodbaKuchyna + "\nZostatok na sklade: " + chodbaKuchynaPocet);

            break;

          case 2:
           
            System.out.println("Zadaj počet vypálených žiaroviek:");

            pocetZiaroviek = sc.nextInt();
            
            chodbaStolikyPocet = chodbaStolikyPocet - pocetZiaroviek;
            
            System.out.println("\nZo skladu zober typ: " + chodbaStoliky + "\nZostatok na sklade: " + chodbaStolikyPocet);
            
            break;

          case 3:
          
            System.out.println("Zadaj počet vypálených žiaroviek:");

            pocetZiaroviek = sc.nextInt();
            
            terasaPocet = terasaPocet - pocetZiaroviek;
            
            System.out.println("\nZo skladu zober typ: " + terasa + "\nZostatok na sklade: " + terasaPocet);
            
            break;

          case 4:
          
            System.out.println("Zadaj počet vypálených žiaroviek:");

            pocetZiaroviek = sc.nextInt();
            
            gdBodovkyPocet = gdBodovkyPocet - pocetZiaroviek;
            
            System.out.println("\nZo skladu si zober typ: " + gdBodovky + "\nZostatok na sklade: " + gdBodovkyPocet);
            
            break;

          case 5:
          
            System.out.println("Zadaj počet vypálených žiaroviek:");

            pocetZiaroviek = sc.nextInt();
            
            gdLampyPodGaleriouPocet = gdLampyPodGaleriouPocet - pocetZiaroviek;
            
            System.out.println("\nZo skladu si zober typ: " + gdLampy + "\nZostatok na sklade: " + gdLampyPodGaleriouPocet);
            
            break;
            
          case 6:
          
            System.out.println("Zadaj počet vypálených žiaroviek:");

            pocetZiaroviek = sc.nextInt();
            
            gdLampyStredPocet = gdLampyStredPocet - pocetZiaroviek;
            
            System.out.println("\nZo skladu si zober typ: " + gdLampyStred + "\nZostatok na sklade: " + gdLampyStredPocet);
            
            break;

          case 7:
          
            System.out.println("Zadaj počet vypálených žiaroviek:");

            pocetZiaroviek = sc.nextInt();
            
            gdLampyBarPocet = gdLampyBarPocet - pocetZiaroviek;
            
            System.out.println("\nZo skladu zober typ: " + gdLampyBar + "\nZostatok na sklade: " + gdLampyBarPocet);
            
            break;

          case 8:
          
            System.out.println("Zadaj počet vypálených žiaroviek:");

            pocetZiaroviek = sc.nextInt();
            
            lustrePocet = lustrePocet - pocetZiaroviek;
            
            System.out.println("\nZo skladu zober typ: " + lustre + "\nZostatok na sklade: " + lustrePocet);
            
            break;

          case 9:
          
            System.out.println("Zadaj počet vypálených žiaroviek:");

            pocetZiaroviek = sc.nextInt();
            
            ghLampyOknoPocet = ghLampyOknoPocet - pocetZiaroviek;
            
            System.out.println("\nZo skladu zober typ: " + ghLampyOkno + "\nZostatok na sklade: " + ghLampyOknoPocet);
            
            break;

          case 10:
          
            System.out.println("Zadaj počet vypálených žiaroviek:");

            pocetZiaroviek = sc.nextInt();
            
            ghLampyNadStolmiPocet = ghLampyNadStolmiPocet - pocetZiaroviek;
            
            System.out.println("\nZo skladu si zober typ: " + ghLampyNadStolmi + "\nZostatok na sklade: " + ghLampyNadStolmiPocet);
            
            break;

          case 11:
          
            System.out.println("Zadaj počet vypálených žiaroviek:");
            
            pocetZiaroviek = sc.nextInt();

            ghLampyObrazPocet = ghLampyObrazPocet - pocetZiaroviek;
            
            System.out.println("\nZo skladu si zober typ: " + ghLampyObraz + "\nZostatok na sklade: " + ghLampyObrazPocet);
        }
       } else if (volba == 2) {

        System.out.println(
            "\nAktualny stav na sklade:\n\nChodba pri kuchyni     "
                + chodbaKuchynaPocet  + "\n Typ: " + chodbaKuchyna + "\n "
                + "\nChodba pri stolikoch   "
                + chodbaStolikyPocet + ("\n Typ: ") + chodbaStoliky + ("\n")
                + "\nTerasa                 "
                + terasaPocet + ("\n Typ: ") + terasa + ("\n")
                + "\nGD bodovky             "
                + gdBodovkyPocet + ("\n Typ: ") + gdBodovky
           + ("\n") + "\nGD lampy pod galeriou  "
                + gdLampyPodGaleriouPocet + ("\n Typ: ") + gdLampy
            + ("\n") + "\nGD lampy stred         "
                + gdLampyStredPocet + ("\n Typ: ") + gdLampyStred
             + ("\n") + "\nGD lampy bar           "
                + gdLampyBarPocet + ("\n Typ: ") + gdLampyBar
            + ("\n") + "\nGaleria lustre         "
                + lustrePocet + ("\n Typ: ") + lustre
            + ("\n") + "\nGH lampy pri oknach    "
                + ghLampyOknoPocet + ("\n Typ: ") + ghLampyOkno
           + ("\n") + "\nGHlampy nad stolmi     "
                + ghLampyNadStolmiPocet + ("\n Typ: ") + ghLampyNadStolmi            + ("\n") + "\nGH lampy pri obrazoch  "
                + ghLampyObrazPocet + ("\n Typ: ") + ghLampyObraz);

      } else {
        System.out.println("Nezadal si spravny vyber...");
      }

      System.out.println("\nPre návrat do menu zadaj a\n");

      znovu = sc.next().charAt(0);

    } while (znovu == 'a');

    sc.close();
  }
}
