package com.ferragnez.party;

import java.util.Scanner;

public class CheckGuest {
    public static void main(String[] args) {
        /*creare e inizializzare l’array contenente i nomi degli invitati
chiedere all’utente come si chiamaverificare che il nome sia presente nella lista
(:exclamation:ATTENZIONE: in Java per confrontare due stringhe non posso usare ==,
ma devo usare il metodo equals(): esempio qui)
lasciarlo entrare o rispedirlo cortesemente da dove è venuto :sunglasses:*/


        Scanner scan= new Scanner(System.in);
        // creazione dell'array
        String[] guestName= { "Dua Lipa", "Paris Hilton"," Manuel Agnelli", "J-Ax","Francesco Totti",
                "Ilary Blasi", "Bebe Vio", "Luis", "Pardis Zarei", "Martina Maccherone", "Rachel Zeilic" };
        String userName;//stringa per nome invitato
        //chiedo nome di chi si presenta
        System.out.print("what is your name?: " );
        userName=scan.nextLine();
        int count;
        boolean presentInList = false;

        //cerco se il nome è presente nella lista
        for (int i=0; i<=guestName.length-1; i++) {
            if(userName.equals(guestName[i])){
                presentInList=true;
                break;
            }
        }
        // decido se entra o no
        if(presentInList){
            System.out.println("welcome to the feast");
        }else{
            System.out.println("sorry ");
        }

    }



}
