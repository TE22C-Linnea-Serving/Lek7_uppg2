import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner tangentbord = new Scanner(System.in);
        //a)
        // Koden som jag skulle skriva av fungerar inte eftersom stortTal=1000 bara när litetTal är mindre än 1000. Så om litet tal är större än 1000, så har stortTal inget värde. 
        //Så här kan en fungerande kod se ut:
        int litetTal = 10;
        int stortTal = 1000;
        if(litetTal<stortTal){  //Om litetTal är mindre än stortTal
            System.out.println(litetTal +" är mindre än "+stortTal);    //Skriver ur
        }else{  //Annars
            System.out.println(litetTal +" är mindre än "+stortTal);    //Skriver ut
        }
        System.out.println("litetTal="+litetTal+",stortTal="+stortTal); //Skriver ut

        //b) och c)
        int tal1 = 10;
        int tal2 = 0;

        if(tal2>tal1){  //Om tal2 är större än tal1
            System.out.println(tal2+" är störrre än "+tal1);    //Skriver ut
        }else{  //Annars
            System.out.println(tal2+" är mindre än "+tal1); //Skriver ut
        }

        System.out.println(""); //Nytt stycke

        //d)
        System.out.println("Vad är klockan?");  //Skriver ut (Frågar vad klockan är)
        int klockan = tangentbord.nextInt(); 
        if(klockan>7 && klockan<8){ //Om klockan är större än 7 och mindre än 8
            System.out.println("Dags att gå upp");  //Skriver ut
        }else if(klockan==12){  //Annars, om klockan är 12
            System.out.println("Dags att äta"); //Skriver ut
        }else if(klockan>23){   //Annars, om klockan är mer än 23
            System.out.println("Dags att gå och lägga sig");    //Skriver ut
        }

        System.out.println(""); //Nytt stycke

        //e)
        System.out.println("Hur gammal är du?");    //Skriver ut (Frågar hur gammal man är)
        int ålder = tangentbord.nextInt();  //Tar in ett tal från användaren
        System.out.println("Är du medlem?");    //Skriver ut (Frågar om man är medlem)
        String Enter = tangentbord.nextLine();  //Tar bort "Enter" från "röret"
        String medlem = tangentbord.nextLine(); //tar in text från användaren

        if(ålder>=18 || medlem.equalsIgnoreCase("ja")){ //Om åldern är större eller lika med 18, eller om man är medlem
            System.out.println("Du får komma in");  //Skriver ut
        }else{  //Annars
            System.out.println("Du får inte komma in"); //Skriver ut
        }

        System.out.println(""); //Nytt stycke

        //f)
        System.out.println("Ange ditt användarnamn:");  //Skriver ut (Frågar om användarnamn)
        String anv = tangentbord.nextLine();    //Tar in text från användaren
        System.out.println("Ange ditt lösenord");   //Skriver ut (Frågar om lösenord)
        String lös = tangentbord.nextLine();    //Tar in text från användaren

        if(anv.equals("root") && lös.equals("passwd")){ //Om användarnamnet är "root" och lösenordet är "passwd"
            System.out.println("Rätt lösenord");    //Skriver ut
        }else if(anv.equals("root") || lös.equals("passwd")){   //Annars, om antingen användarnamn är root eller om lösenord är passwd
            System.out.println("Lösenordet eller användarnamnet stämmer inte"); //Skriver ut
        }else{  //Annars
            System.out.println("Lösenordet och användarnamnet stämmer inte");   //Skriver ut
        }

        System.out.println(""); //Nytt strycke

        //g)
        System.out.println("Meny Väderprogram");    //Skriver ut
        System.out.println("1. Skriv ut temperatur");   //Skriver ut
        System.out.println("2. Skriv ut Vind"); //Skriver ut
        System.out.println("3. Skriv ut luftfuktighet");    //Skriver ut
        System.out.print("Ange val:");  //Skriver ut (Frågar om val)
        int val = tangentbord.nextInt();    //Tar in tal från användaren

        switch(val){    //Om val är:
            case 1:     //1
            System.out.println("Temperaturen är 7 grader C");   //Skriver ut
            break;  //Slut

            case 2: //2
            System.out.println("Vinden är 2 m/s");  //Skriver ut
            break;  //Slut

            case 3: //3
            System.out.println("Luftfuktigheten är 95%");   //Skriver ut
            break;  //Slut

            default:    //Annars (Om inga andra stämmer)
            System.out.println("Fel val");  //Skriver ut
        }
    }
}
