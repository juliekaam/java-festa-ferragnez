package com.ferragnez.party;

import java.util.Scanner;

public class CheckGuest {
    public static void main(String[] args) {
        /*creare e inizializzare l’array contenente i nomi degli invitati
chiedere all’utente come si chiamaverificare che il nome sia presente nella lista
(:exclamation:ATTENZIONE: in Java per confrontare due stringhe non posso usare ==,
ma devo usare il metodo equals(): esempio qui)
lasciarlo entrare o rispedirlo cortesemente da dove è venuto :sunglasses:*/

        // creazione dell'array
        Scanner scan= new Scanner(System.in);
        String[] guestName= { "Dua Lipa", "Paris Hilton"," Manuel Agnelli", "J-Ax","Francesco Totti",
                "Ilary Blasi", "Bebe Vio", "Luis", "Pardis Zarei", "Martina Maccherone", "Rachel Zeilic" };
        String userName;
        System.out.print("what is your name?: " );
        userName=scan.nextLine();
        int count;
        boolean present;

        for (int i=0; i<=guestName.length-1; i++) {
            present= guestName[i].equals(userName);


            if(present){
                System.out.println("you can acess");
            }else{
                System.out.println("sorry");
            }
        }

    }



}
