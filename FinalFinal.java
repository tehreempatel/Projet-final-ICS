//////////////////
//
//Maria Kobilaski et Tehreem Patel
//6/22/2021
//Projet Final
//
//////////////////
//Planification - Maria et Tehreem
//Histoire - Maria et Tehreem
//Art ASCII - Tehreem
//Code - Maria
//Debuging - Tehreem et Maria
//Soutien moral - Tehreem
//Commentaires - Tehreem
//Blagues - Tehreem
import java.util.Scanner;
public class FinalFinal{
    public static void main( String[] args ) throws InterruptedException {
        //séquence d'écriture qui imprime l'ASCII
        System.out.println("            _____         _                                        ");
        System.out.println("            |____ \\     /_/ _                      (_)                ");
        System.out.println("             _   \\ \\  ____ | |_   ____  ____ | |_   _  _   _  ____ ");
        System.out.println("            | |   | |/ _  )|  _) / _  )/ ___)|  _) | || | | |/ _  )");
        System.out.println("            | |__/ /( (/ / | |__( (/ /( (___ | |__ | | \\ V /( (/ / ");
        System.out.println("            |_____/  \\____) \\___)\\____)\\____) \\___)|_|  \\_/  \\____)");
        System.out.println("                                RÉSOUS LE MYSTÈRE                  ");
        System.out.println("                                                                   ");
        System.out.println("                                              Par: Tehreem et Maria");

        System.out.println("Instructions : Entrez uniquement le numéro correspondant et appuyez sur la touche entrée. Bonne chance détective!");
    
        
        int option = 0; //permet l'utilisateur à sélectionner des options
        String nom; //écrire le nom du joueur
        Scanner cat = new Scanner (System.in); //imput des données
        System.out.println("Êtes-vous prêt? \n1. Oui"); 
        option = cat.nextInt();
        
        if (option==1){  //sélection éde l'option 1
            System.out.println("");

            System.out.print("Quel est votre nom? "); //demande une question
            nom = cat.next(); //permet au joueur d'entrer leur nom
            System.out.println("Bienvenue Detective "+nom); 
            
            System.out.println("                               __________           ");
            System.out.println("                              /          \\          ");
            System.out.println("                            ~~            ~~        ");
            System.out.println("                              | __   __ |           ");
            System.out.println("                              \\  o  o  /           ");
            System.out.println("                               \\  <   /            ");                               
            System.out.println("                                \\_O__/	            ");
            System.out.println("                      	   ;----~\\ ~ /- ~~---,     ");
            System.out.println("                          \\     |  o  |     /      ");
            System.out.println("                           |    |  o  |     |      ");
            System.out.println("                         __|________________|____  ");
                        

            System.out.println("Détective "+nom+", merci beaucoup de venir nous aider à résoudre cette enquête! \nAlors, voici la situation : Il y a eu un meurtre dans cette hotel ce soir et les deux principaux suspects attendent d'être interrogés.\n Votre tâche est de poser des questions et de voir qui a une histoire qui ne correspond pas.");
            System.out.println("Qui voulez-vous interroger en premier ?(1.La femme de ménage ou 2.Le chef)");
            option = cat.nextInt(); //permet au joueur de chosir une question

            if(option==1){//si le joueur à choisi option 1

                System.out.println("                    ________        ");
                System.out.println("                   /________ \\     ");
                System.out.println("                  //( ( ( ( \\ \\   ");
                System.out.println("                 || ( -  - ( ( |    ");
                System.out.println("                      o  o ) ( |    ");
                System.out.println("                 ||) )  <  ) )||    ");
                System.out.println("                 || (\\  _ ( ( ||   ");
                System.out.println("                 |) )   \\)_  |/    ");
                System.out.println("                 / ((\\_v_/   \\    ");
                System.out.println("                /  /)  o    \\ \\   ");
                System.out.println("                |  |   o    | |     ");
                System.out.println("                |  \\   o    /  |   ");
                System.out.println("           _____|_____________|_____");
                System.out.println("Choisissez une question à poser: \n 1. Que faisiez-vous le jour du meurtre? \n 2. Quand êtes-vous parti de l'hôtel?");
                option = cat.nextInt();

                if(option==1){
                    System.out.println("                    ________        ");
                    System.out.println("                   /________ \\     ");
                    System.out.println("                  //( ( ( ( \\ \\   ");
                    System.out.println("                 || ( -  - ( ( |    ");
                    System.out.println("                      o  o ) ( |    ");
                    System.out.println("                 ||) )  <  ) )||    ");
                    System.out.println("                 || (\\  O ( ( ||   ");
                    System.out.println("                 |) )   \\)_  |/    ");
                    System.out.println("                 / ((\\_v_/   \\     ");
                    System.out.println("                /  /)  o    \\ \\   ");
                    System.out.println("                |  |   o    | |     ");
                    System.out.println("                |  \\   o    / |     ");
                    System.out.println("           _____|_____________|_____");
                    System.out.println("J'ai travaillé vers 6 heures du matin et j'ai commencé à nettoyer les chambres du troisième étage.\n");

                    
                    System.out.println("Choisissez une question à poser: \n 1. Quand êtes-vous parti de l'hôtel?");
                    option = cat.nextInt();

                    if(option==1){
                        System.out.println("                    ________        ");
                        System.out.println("                   /________ \\     ");
                        System.out.println("                  //( ( ( ( \\ \\   ");
                        System.out.println("                 || ( -  - ( ( |    ");
                        System.out.println("                      o  o ) ( |    ");
                        System.out.println("                 ||) )  <  ) )||    ");
                        System.out.println("                 || (\\  O ( ( ||   ");
                        System.out.println("                 |) )   \\)_  |/    ");
                        System.out.println("                 / ((\\_v_/   \\     ");
                        System.out.println("                /  /)  o    \\ \\   ");
                        System.out.println("                |  |   o    | |     ");
                        System.out.println("                |  \\   o    / |     ");
                        System.out.println("           _____|_____________|_____");
                        System.out.println("Vers midi.");
                        System.out.println("Choisissez une question à poser: \n 1. Que pensez-vous des autres suspects ?");
                        option = cat.nextInt();
                        if(option==1){
                            System.out.println("                    ________        ");
                            System.out.println("                   /________ \\     ");
                            System.out.println("                  //( ( ( ( \\ \\   ");
                            System.out.println("                 || ( -  - ( ( |    ");
                            System.out.println("                      o  o ) ( |    ");
                            System.out.println("                 ||) )  <  ) )||    ");
                            System.out.println("                 || (\\  O ( ( ||   ");
                            System.out.println("                 |) )   \\)_  |/    ");
                            System.out.println("                 / ((\\_v_/   \\     ");
                            System.out.println("                /  /)  o    \\ \\   ");
                            System.out.println("                |  |   o    | |     ");
                            System.out.println("                |  \\   o    / |     ");
                            System.out.println("           _____|_____________|_____");
                            System.out.println("Le chef avait l'air un peu frustré ce jour-là et pensez à toutes les armes auxquelles il a accès.");
                            System.out.println("Je ne peux pas répondre à d'autres questions sans la présence de mon avocat.\n");
                            System.out.println("Qui voulez-vous interroger prochainement?(1.Le chef)");
                            option = cat.nextInt();
                            if(option==1){
                                System.out.println("                               _________            ");
                                System.out.println("                             /  |   |  \\           ");
                                System.out.println("                             \\__|___|__/            ");
                                System.out.println("                              |        |            ");
                                System.out.println("                              |________|            ");
                                System.out.println("                             | __    __ |           ");
                                System.out.println("                              \\ o   o  /            ");
                                System.out.println("                               \\  <   /             ");                                              
                                System.out.println("                                \\_-__/	            ");
                                System.out.println("                                |    |              ");
                                System.out.println("                             /' \\ _ / `\\          ");
                                System.out.println("                            |     O      |          ");
                                System.out.println("                            |     O      |          ");
                                System.out.println("                         ___|____________|________  ");
                                System.out.println("\nChoisissez une question à poser: \n 1. Où étiez-vous quand le meurtre a eu lieu?\n 2. La femme de ménage a mentionné que vous étiez frustrée...");
                                option = cat.nextInt();
                                if(option==1){
                                    System.out.println("                               _________            ");
                                    System.out.println("                             /  |   |  \\           ");
                                    System.out.println("                             \\__|___|__/            ");
                                    System.out.println("                              |        |            ");
                                    System.out.println("                              |________|            ");
                                    System.out.println("                             | __    __ |           ");
                                    System.out.println("                              \\ o   o  /            ");
                                    System.out.println("                               \\  <   /             ");                                              
                                    System.out.println("                                \\_O__/	            ");
                                    System.out.println("                                |    |              ");
                                    System.out.println("                             /' \\ _ / `\\          ");
                                    System.out.println("                            |     O      |          ");
                                    System.out.println("                            |     O      |          ");
                                    System.out.println("                         ___|____________|________  ");
                                    System.out.println("J'étais dans la cuisine en train d'essayer de préparer le déjeuner.\n");
                                    System.out.println("Choisissez une question à poser: \n 1. La femme de ménage a mentionné que vous étiez frustrée...");
                                    option = cat.nextInt();

                                    if(option==1){
                                        System.out.println("                               _________            ");
                                        System.out.println("                             /  |   |  \\           ");
                                        System.out.println("                             \\__|___|__/            ");
                                        System.out.println("                              |        |            ");
                                        System.out.println("                              |________|            ");
                                        System.out.println("                             | __    __ |           ");
                                        System.out.println("                              \\ o   o  /            ");
                                        System.out.println("                               \\  <   /             ");                                              
                                        System.out.println("                                \\_O__/	            ");
                                        System.out.println("                                |    |              ");
                                        System.out.println("                             /' \\ _ / `\\          ");
                                        System.out.println("                            |     O      |          ");
                                        System.out.println("                            |     O      |          ");
                                        System.out.println("                         ___|____________|________  \n");
                                        System.out.println("Oui, j'étais frustrée ce jour-là parce que tous mes couteaux étaient en train d'être aiguisés ce jour-là, donc je n'avais pas accès à mon équipement habituel.");
                                        System.out.println("Choisissez une question à poser: \n 1. Alors comment avez-vous fait pour préparer le déjeuner ?");
                                        option = cat.nextInt();

                                        if(option==1){
                                            System.out.println("                               _________            ");
                                            System.out.println("                             /  |   |  \\           ");
                                            System.out.println("                             \\__|___|__/            ");
                                            System.out.println("                              |        |            ");
                                            System.out.println("                              |________|            ");
                                            System.out.println("                             | __    __ |           ");
                                            System.out.println("                              \\ o   o  /            ");
                                            System.out.println("                               \\  <   /             ");                                              
                                            System.out.println("                                \\_O__/	            ");
                                            System.out.println("                                |    |              ");
                                            System.out.println("                             /' \\ _ / `\\          ");
                                            System.out.println("                            |     O      |          ");
                                            System.out.println("                            |     O      |          ");
                                            System.out.println("                         ___|____________|________  ");
                                            System.out.println("J'ai dû parler au directeur et nous avons fini par aller dans l'arrière-boutique pour trouver un peu de l'ancien matériel, ce qui nous a pris pas mal de temps.");
                                            System.out.println("Choisissez une question à poser: \n 1. Avez-vous un moyen de prouver cette affirmation?");
                                            option = cat.nextInt();
                                            if(option==1){
                                                System.out.println("                               _________            ");
                                                System.out.println("                             /  |   |  \\           ");
                                                System.out.println("                             \\__|___|__/            ");
                                                System.out.println("                              |        |            ");
                                                System.out.println("                              |________|            ");
                                                System.out.println("                             | __    __ |           ");
                                                System.out.println("                              \\ o   o  /            ");
                                                System.out.println("                               \\  <   /             ");                                              
                                                System.out.println("                                \\_O__/	            ");
                                                System.out.println("                                |    |              ");
                                                System.out.println("                             /' \\ _ / `\\          ");
                                                System.out.println("                            |     O      |          ");
                                                System.out.println("                            |     O      |          ");
                                                System.out.println("                         ___|____________|________  ");
                                                System.out.println("Oui, j’ai le directeur comme témoin.");
                                                System.out.println("Choisissez un action: \n 1. Parler au directeur");
                                                option = cat.nextInt();
                                                if(option==1){
                                                    System.out.println("             _____________          ");
                                                    System.out.println("            \\___________/          ");
                                                    System.out.println("          $$| __    __ |$$          ");
                                                    System.out.println("             \\ 0   0  /$           ");
                                                    System.out.println("              \\  <   /             ");                                     
                                                    System.out.println("               \\_-__/              ");
                                                    System.out.println("        ____.-''---''-._____        ");
                                                    System.out.println("        /  ,  \\      /  ,   \\      ");
                                                    System.out.println("       /\\  /\\     o      /\\  /\\     ");
                                                    System.out.println("       \\  |  |   o    | /.  /      ");
                                                    System.out.println("       ______|________|_________   ");
                                                    System.out.println("Choisissez une question à poser: \n 1. Parle-moi du chef\n2. Parle-moi du femme de ménage");
                                                    option = cat.nextInt();
                                                    if(option==1){
                                                        System.out.println("             _____________          ");
                                                        System.out.println("            \\___________/          ");
                                                        System.out.println("          $$| __    __ |$$          ");
                                                        System.out.println("             \\ 0   0  /$           ");
                                                        System.out.println("              \\  <   /             ");                                     
                                                        System.out.println("               \\_-__/              ");
                                                        System.out.println("        ____.-''---''-._____        ");
                                                        System.out.println("        /  ,  \\      /  ,   \\      ");
                                                        System.out.println("       /\\  /\\     o      /\\  /\\     ");
                                                        System.out.println("       \\  |  |   o    | /.  /      ");
                                                        System.out.println("       ______|________|_________   ");
                                                        System.out.println("Oui, il était avec moi la plupart de la journée. Il était très stressé à cause du fait qu'il ne pouvait pas trouver ses matériaux.");
                                                        System.out.println("Choisissez une question à poser: \n 1. Parle-moi du femme de ménage");
                                                        option = cat.nextInt();
                                                            if(option==1){
                                                                System.out.println("             _____________          ");
                                                                System.out.println("            \\___________/          ");
                                                                System.out.println("          $$| __    __ |$$          ");
                                                                System.out.println("             \\ 0   0  /$           ");
                                                                System.out.println("              \\  <   /             ");                                     
                                                                System.out.println("               \\_-__/              ");
                                                                System.out.println("        ____.-''---''-._____        ");
                                                                System.out.println("        /  ,  \\      /  ,   \\      ");
                                                                System.out.println("       /\\  /\\     o      /\\  /\\     ");
                                                                System.out.println("       \\  |  |   o    | /.  /      ");
                                                                System.out.println("       ______|________|_________   ");
                                                                System.out.println("Elle est nouvelle ici. De ce que je me rappelle, elle est arrivée vers 6h du matin et je ne suis pas sûre quand elle est partie mais selon son horaire elle était supposé partir envers 2h.");
                                                                System.out.println("                               __________           ");
                                                                System.out.println("                              /          \\          ");
                                                                System.out.println("                            ~~            ~~        ");
                                                                System.out.println("                              | __   __ |           ");
                                                                System.out.println("                              \\  o  o  /           ");
                                                                System.out.println("                               \\  <   /            ");                               
                                                                System.out.println("                                \\_O__/	            ");
                                                                System.out.println("                      	   ;----~\\ ~ /- ~~---,     ");
                                                                System.out.println("                          \\     |  o  |     /      ");
                                                                System.out.println("                           |    |  o  |     |      ");
                                                                System.out.println("                         __|________________|____  ");
                                                                System.out.println("C'est toutes les preuves que nous avons eu l'occasion de rassembler. Maintenant le choix est entre vos mains. Qui soupçonnez-vous d'être le meurtrier. Choisissez prudemment !");
                                                                System.out.println("Qui pensez-vous être le responsable de ce meurtre ?\n1. La femme de ménage\n2. Le chef");
                                                                option = cat.nextInt();
                                                                if(option==1){
                                                                    System.out.println("____  ____     ___     _____   _ ");
                                                                    System.out.println("| __ )|  _ \\   / \\ \\   / / _ \\| |");
                                                                    System.out.println("|  _ \\| |_) | / _ \\ \\ / | |   | |");
                                                                    System.out.println("| |_) |  _ < / ___ \\ V /| |_| |_|");
                                                                    System.out.println("|____/|_| \\_/_/   \\_\\_/  \\___/(_)");//si le joueur gagne le jeu
                                                                }else if(option==2){
                                                                    System.out.println(":("); //si le joueur perd le jeu
                                                                }else{
                                                                    System.out.println("Erreur: entrée invalide");
                                                                }
                                                            }else{
                                                                System.out.println("Erreur: entrée invalide");
                                                            }
                                                        
                                                    }else if(option==2){
                                                        System.out.println("             _____________          ");
                                                        System.out.println("            \\___________/          ");
                                                        System.out.println("          $$| __    __ |$$          ");
                                                        System.out.println("             \\ 0   0  /$           ");
                                                        System.out.println("              \\  <   /             ");                                     
                                                        System.out.println("               \\_-__/              ");
                                                        System.out.println("        ____.-''---''-._____        ");
                                                        System.out.println("        /  ,  \\      /  ,   \\      ");
                                                        System.out.println("       /\\  /\\     o      /\\  /\\     ");
                                                        System.out.println("       \\  |  |   o    | /.  /      ");
                                                        System.out.println("       ______|________|_________   ");
                                                        System.out.println("Elle est nouvelle ici. De ce que je me rappelle, elle est arrivée vers 6h du matin et je ne suis pas sûre quand elle est partie mais selon son horaire elle était supposé partir envers 2h.");        
                                                        System.out.println("Choisissez une question à poser: \n 1. Parle-moi du chef");
                                                        option = cat.nextInt();
                                                        if(option==1){
                                                            System.out.println("             _____________          ");
                                                            System.out.println("            \\___________/          ");
                                                            System.out.println("          $$| __    __ |$$          ");
                                                            System.out.println("             \\ 0   0  /$           ");
                                                            System.out.println("              \\  <   /             ");                                     
                                                            System.out.println("               \\_-__/              ");
                                                            System.out.println("        ____.-''---''-._____        ");
                                                            System.out.println("        /  ,  \\      /  ,   \\      ");
                                                            System.out.println("       /\\  /\\     o      /\\  /\\     ");
                                                            System.out.println("       \\  |  |   o    | /.  /      ");
                                                            System.out.println("       ______|________|_________   ");
                                                            System.out.println("Oui, il était avec moi la plupart de la journée. Il était très stressé à cause du fait qu'il ne pouvait pas trouver ses matériaux.");
                                                            System.out.println("                               __________           ");
                                                            System.out.println("                              /          \\          ");
                                                            System.out.println("                            ~~            ~~        ");
                                                            System.out.println("                              | __   __ |           ");
                                                            System.out.println("                              \\  o  o  /           ");
                                                            System.out.println("                               \\  <   /            ");                               
                                                            System.out.println("                                \\_O__/	            ");
                                                            System.out.println("                      	   ;----~\\ ~ /- ~~---,     ");
                                                            System.out.println("                          \\     |  o  |     /      ");
                                                            System.out.println("                           |    |  o  |     |      ");
                                                            System.out.println("                         __|________________|____  ");
                                                            System.out.println("C'est toutes les preuves que nous avons eu l'occasion de rassembler. Maintenant le choix est entre vos mains. Qui soupçonnez-vous d'être le meurtrier. Choisissez prudemment !");
                                                                System.out.println("Qui pensez-vous être le responsable de ce meurtre ?\n1. La femme de ménage\n2. Le chef");
                                                                option = cat.nextInt();
                                                                if(option==1){
                                                                    System.out.println("____  ____     ___     _____   _ ");
                                                                    System.out.println("| __ )|  _ \\   / \\ \\   / / _ \\| |");
                                                                    System.out.println("|  _ \\| |_) | / _ \\ \\ / | |   | |");
                                                                    System.out.println("| |_) |  _ < / ___ \\ V /| |_| |_|");
                                                                    System.out.println("|____/|_| \\_/_/   \\_\\_/  \\___/(_)");
                                                                }else if(option==2){
                                                                    System.out.println(":(");
                                                                }else{
                                                                    System.out.println("Erreur: entrée invalide"); //si le joueur entre un charactère invalide
                                                                }
                                                        }else{
                                                            System.out.println("Erreur: entrée invalide");
                                                        }
                                                    }else{
                                                        System.out.println("Erreur: entrée invalide");
                                                    }
                                                }else{
                                                    System.out.println("Erreur: entrée invalide");
                                                }

                                            }else{
                                                System.out.println("Erreur: entrée invalide");
                                            }
                                        }else{
                                            System.out.println("Erreur: entrée invalide");
                                        }
                                    }else{
                                        System.out.println("Erreur: entrée invalide");
                                    }
                        }else{
                            System.out.println("Erreur: entrée invalide");
                        }
                    }else{
                        System.out.println("Erreur: entrée invalide");
                    }
                }
                }
                }
                else if(option==2){
                    System.out.println("                    ________        ");
                    System.out.println("                   /________ \\     ");
                    System.out.println("                  //( ( ( ( \\ \\   ");
                    System.out.println("                 || ( -  - ( ( |    ");
                    System.out.println("                      o  o ) ( |    ");
                    System.out.println("                 ||) )  <  ) )||    ");
                    System.out.println("                 || (\\  O ( ( ||   ");
                    System.out.println("                 |) )   \\)_  |/    ");
                    System.out.println("                 / ((\\_v_/   \\    ");
                    System.out.println("                /  /)  o    \\ \\   ");
                    System.out.println("                |  |   o    | |     ");
                    System.out.println("                |  \\   o    /  |   ");
                    System.out.println("           _____|_____________|_____");

                    System.out.println("Vers midi.");

                    
                    System.out.println("Choisissez une question à poser: \n 1. Que faisiez-vous le jour du meurtre?");
                    option = cat.nextInt();

                    if(option==1){
                        System.out.println("                    ________        ");
                        System.out.println("                   /________ \\     ");
                        System.out.println("                  //( ( ( ( \\ \\   ");
                        System.out.println("                 || ( -  - ( ( |    ");
                        System.out.println("                      o  o ) ( |    ");
                        System.out.println("                 ||) )  <  ) )||    ");
                        System.out.println("                 || (\\  O ( ( ||   ");
                        System.out.println("                 |) )   \\)_  |/    ");
                        System.out.println("                 / ((\\_v_/   \\    ");
                        System.out.println("                /  /)  o    \\ \\   ");
                        System.out.println("                |  |   o    | |     ");
                        System.out.println("                |  \\   o    /  |   ");
                        System.out.println("           _____|_____________|_____");
                        System.out.println("J'ai travaillé vers 6 heures du matin et j'ai commencé à nettoyer les chambres du troisième étage.");
                        System.out.println("Choisissez une question à poser: \n 1. Que pensez-vous des autres suspects ?");
                        option = cat.nextInt();
                        if(option==1){
                            System.out.println("                    ________        ");
                            System.out.println("                   /________ \\     ");
                            System.out.println("                  //( ( ( ( \\ \\   ");
                            System.out.println("                 || ( -  - ( ( |    ");
                            System.out.println("                      o  o ) ( |    ");
                            System.out.println("                 ||) )  <  ) )||    ");
                            System.out.println("                 || (\\  O ( ( ||   ");
                            System.out.println("                 |) )   \\)_  |/    ");
                            System.out.println("                 / ((\\_v_/   \\    ");
                            System.out.println("                /  /)  o    \\ \\   ");
                            System.out.println("                |  |   o    | |     ");
                            System.out.println("                |  \\   o    /  |   ");
                            System.out.println("           _____|_____________|_____");
                            System.out.println("Le chef avait l'air un peu frustré ce jour-là et pensez à toutes les armes auxquelles il a accès.");
                            System.out.println("Je ne peux pas répondre à d'autres questions sans la présence de mon avocat.");
                            System.out.println("Qui voulez-vous interroger prochainement?(1.Le chef)");
                            if(option==1){
                                System.out.println("Choisissez une question à poser: \n 1. Où étiez-vous quand le meurtre a eu lieu?\n 2. La femme de ménage a mentionné que vous étiez frustrée...");
                                option = cat.nextInt();
                                if(option==1){
                                    System.out.println("                               _________            ");
                                    System.out.println("                             /  |   |  \\           ");
                                    System.out.println("                             \\__|___|__/            ");
                                    System.out.println("                              |        |            ");
                                    System.out.println("                              |________|            ");
                                    System.out.println("                             | __    __ |           ");
                                    System.out.println("                              \\ o   o  /            ");
                                    System.out.println("                               \\  <   /             ");                                              
                                    System.out.println("                                \\_O__/	            ");
                                    System.out.println("                                |    |              ");
                                    System.out.println("                             /' \\ _ / `\\          ");
                                    System.out.println("                            |     O      |          ");
                                    System.out.println("                            |     O      |          ");
                                    System.out.println("                         ___|____________|________  ");
                                    System.out.println("J'étais dans la cuisine en train d'essayer de préparer le déjeuner.");
                                    System.out.println("Choisissez une question à poser: \n 1. La femme de ménage a mentionné que vous étiez frustrée...");
                                    option = cat.nextInt();

                                    if(option==1){
                                        System.out.println("                               _________            ");
                                        System.out.println("                             /  |   |  \\           ");
                                        System.out.println("                             \\__|___|__/            ");
                                        System.out.println("                              |        |            ");
                                        System.out.println("                              |________|            ");
                                        System.out.println("                             | __    __ |           ");
                                        System.out.println("                              \\ o   o  /            ");
                                        System.out.println("                               \\  <   /             ");                                              
                                        System.out.println("                                \\_O__/	            ");
                                        System.out.println("                                |    |              ");
                                        System.out.println("                             /' \\ _ / `\\          ");
                                        System.out.println("                            |     O      |          ");
                                        System.out.println("                            |     O      |          ");
                                        System.out.println("                         ___|____________|________  ");
                                        System.out.println("Oui, j'étais frustrée ce jour-là parce que tous mes couteaux étaient en train d'être aiguisés ce jour-là, donc je n'avais pas accès à mon équipement habituel.");
                                        System.out.println("Choisissez une question à poser: \n 1. Alors comment avez-vous fait pour préparer le déjeuner ?");
                                        option = cat.nextInt();

                                        if(option==1){
                                            System.out.println("                               _________            ");
                                            System.out.println("                             /  |   |  \\           ");
                                            System.out.println("                             \\__|___|__/            ");
                                            System.out.println("                              |        |            ");
                                            System.out.println("                              |________|            ");
                                            System.out.println("                             | __    __ |           ");
                                            System.out.println("                              \\ o   o  /            ");
                                            System.out.println("                               \\  <   /             ");                                              
                                            System.out.println("                                \\_O__/	            ");
                                            System.out.println("                                |    |              ");
                                            System.out.println("                             /' \\ _ / `\\          ");
                                            System.out.println("                            |     O      |          ");
                                            System.out.println("                            |     O      |          ");
                                            System.out.println("                         ___|____________|________  ");
                                            System.out.println("J'ai dû parler au directeur et nous avons fini par aller dans l'arrière-boutique pour trouver un peu de l'ancien matériel, ce qui nous a pris pas mal de temps.");
                                            System.out.println("Choisissez une question à poser: \n 1. Avez-vous un moyen de prouver cette affirmation?");
                                            option = cat.nextInt();
                                            if(option==1){
                                                System.out.println("                               _________            ");
                                                System.out.println("                             /  |   |  \\           ");
                                                System.out.println("                             \\__|___|__/            ");
                                                System.out.println("                              |        |            ");
                                                System.out.println("                              |________|            ");
                                                System.out.println("                             | __    __ |           ");
                                                System.out.println("                              \\ o   o  /            ");
                                                System.out.println("                               \\  <   /             ");                                              
                                                System.out.println("                                \\_O__/	            ");
                                                System.out.println("                                |    |              ");
                                                System.out.println("                             /' \\ _ / `\\          ");
                                                System.out.println("                            |     O      |          ");
                                                System.out.println("                            |     O      |          ");
                                                System.out.println("                         ___|____________|________  ");
                                                System.out.println("Oui, j’ai le directeur comme témoin.");
                                                System.out.println("Choisissez un action: \n 1. Parler au directeur");
                                                option = cat.nextInt();
                                                if(option==1){
                                                    System.out.println("             _____________          ");
                                                    System.out.println("            \\___________/          ");
                                                    System.out.println("          $$| __    __ |$$          ");
                                                    System.out.println("             \\ 0   0  /$           ");
                                                    System.out.println("              \\  <   /             ");                                     
                                                    System.out.println("               \\_-__/              ");
                                                    System.out.println("        ____.-''---''-._____        ");
                                                    System.out.println("        /  ,  \\      /  ,   \\      ");
                                                    System.out.println("       /\\  /\\     o      /\\  /\\     ");
                                                    System.out.println("       \\  |  |   o    | /.  /      ");
                                                    System.out.println("       ______|________|_________   ");
                                                    System.out.println("Choisissez une question à poser: \n 1. Parle-moi du chef\n2. Parle-moi du femme de ménage");
                                                    option = cat.nextInt();
                                                    if(option==1){
                                                        System.out.println("             _____________          ");
                                                        System.out.println("            \\___________/          ");
                                                        System.out.println("          $$| __    __ |$$          ");
                                                        System.out.println("             \\ 0   0  /$           ");
                                                        System.out.println("              \\  <   /             ");                                     
                                                        System.out.println("               \\_o__/              ");
                                                        System.out.println("        ____.-''---''-._____        ");
                                                        System.out.println("        /  ,  \\      /  ,   \\      ");
                                                        System.out.println("       /\\  /\\     o      /\\  /\\     ");
                                                        System.out.println("       \\  |  |   o    | /.  /      ");
                                                        System.out.println("       ______|________|_________   ");
                                                        System.out.println("Oui, il était avec moi la plupart de la journée. Il était très stressé à cause du fait qu'il ne pouvait pas trouver ses matériaux.");
                                                        System.out.println("Choisissez une question à poser: \n 1. Parle-moi du femme de ménage");
                                                        option = cat.nextInt();
                                                            if(option==1){
                                                                System.out.println("             _____________          ");
                                                                System.out.println("            \\___________/          ");
                                                                System.out.println("          $$| __    __ |$$          ");
                                                                System.out.println("             \\ 0   0  /$           ");
                                                                System.out.println("              \\  <   /             ");                                     
                                                                System.out.println("               \\_o__/              ");
                                                                System.out.println("        ____.-''---''-._____        ");
                                                                System.out.println("        /  ,  \\      /  ,   \\      ");
                                                                System.out.println("       /\\  /\\     o      /\\  /\\     ");
                                                                System.out.println("       \\  |  |   o    | /.  /      ");
                                                                System.out.println("       ______|________|_________   ");
                                                                System.out.println("Elle est nouvelle ici. De ce que je me rappelle, elle est arrivée vers 6h du matin et je ne suis pas sûre quand elle est partie mais selon son horaire elle était supposé partir envers 2h.");
                                                                System.out.println("                               __________           ");
                                                                System.out.println("                              /          \\          ");
                                                                System.out.println("                            ~~            ~~        ");
                                                                System.out.println("                              | __   __ |           ");
                                                                System.out.println("                              \\  o  o  /           ");
                                                                System.out.println("                               \\  <   /            ");                               
                                                                System.out.println("                                \\_O__/	            ");
                                                                System.out.println("                      	   ;----~\\ ~ /- ~~---,     ");
                                                                System.out.println("                          \\     |  o  |     /      ");
                                                                System.out.println("                           |    |  o  |     |      ");
                                                                System.out.println("                         __|________________|____  ");
                                                                System.out.println("C'est toutes les preuves que nous avons eu l'occasion de rassembler. Maintenant le choix est entre vos mains. Qui soupçonnez-vous d'être le meurtrier. Choisissez prudemment !");
                                                                System.out.println("Qui pensez-vous être le responsable de ce meurtre ?\n1. La femme de ménage\n2. Le chef");
                                                                option = cat.nextInt();
                                                                if(option==1){
                                                                    System.out.println("____  ____     ___     _____   _ ");
                                                                    System.out.println("| __ )|  _ \\   / \\ \\   / / _ \\| |");
                                                                    System.out.println("|  _ \\| |_) | / _ \\ \\ / | |   | |");
                                                                    System.out.println("| |_) |  _ < / ___ \\ V /| |_| |_|");
                                                                    System.out.println("|____/|_| \\_/_/   \\_\\_/  \\___/(_)");
                                                                }else if(option==2){
                                                                    System.out.println(":(");
                                                                }else{
                                                                    System.out.println("Erreur: entrée invalide");
                                                                }
                                                            }else{
                                                                System.out.println("Erreur: entrée invalide");
                                                            }
                                                        
                                                    }else if(option==2){
                                                        System.out.println("             _____________          ");
                                                        System.out.println("            \\___________/          ");
                                                        System.out.println("          $$| __    __ |$$          ");
                                                        System.out.println("             \\ 0   0  /$           ");
                                                        System.out.println("              \\  <   /             ");                                     
                                                        System.out.println("               \\_o__/              ");
                                                        System.out.println("        ____.-''---''-._____        ");
                                                        System.out.println("        /  ,  \\      /  ,   \\      ");
                                                        System.out.println("       /\\  /\\     o      /\\  /\\     ");
                                                        System.out.println("       \\  |  |   o    | /.  /      ");
                                                        System.out.println("       ______|________|_________   ");
                                                        System.out.println("Elle est nouvelle ici. De ce que je me rappelle, elle est arrivée vers 6h du matin et je ne suis pas sûre quand elle est partie mais selon son horaire elle était supposé partir envers 2h.");        
                                                        System.out.println("Choisissez une question à poser: \n 1. Parle-moi du chef");
                                                        option = cat.nextInt();
                                                        if(option==1){
                                                            System.out.println("             _____________          ");
                                                            System.out.println("            \\___________/          ");
                                                            System.out.println("          $$| __    __ |$$          ");
                                                            System.out.println("             \\ 0   0  /$           ");
                                                            System.out.println("              \\  <   /             ");                                     
                                                            System.out.println("               \\_o__/              ");
                                                            System.out.println("        ____.-''---''-._____        ");
                                                            System.out.println("        /  ,  \\      /  ,   \\      ");
                                                            System.out.println("       /\\  /\\     o      /\\  /\\     ");
                                                            System.out.println("       \\  |  |   o    | /.  /      ");
                                                            System.out.println("       ______|________|_________   ");
                                                            System.out.println("Oui, il était avec moi la plupart de la journée. Il était très stressé à cause du fait qu'il ne pouvait pas trouver ses matériaux.");
                                                            System.out.println("                               __________           ");
                                                            System.out.println("                              /          \\          ");
                                                            System.out.println("                            ~~            ~~        ");
                                                            System.out.println("                              | __   __ |           ");
                                                            System.out.println("                              \\  o  o  /           ");
                                                            System.out.println("                               \\  <   /            ");                               
                                                            System.out.println("                                \\_O__/	            ");
                                                            System.out.println("                      	   ;----~\\ ~ /- ~~---,     ");
                                                            System.out.println("                          \\     |  o  |     /      ");
                                                            System.out.println("                           |    |  o  |     |      ");
                                                            System.out.println("                         __|________________|____  ");
                                                            System.out.println("C'est toutes les preuves que nous avons eu l'occasion de rassembler. Maintenant le choix est entre vos mains. Qui soupçonnez-vous d'être le meurtrier. Choisissez prudemment !");
                                                                System.out.println("Qui pensez-vous être le responsable de ce meurtre ?\n1. La femme de ménage\n2. Le chef");
                                                                option = cat.nextInt();
                                                                if(option==1){
                                                                    System.out.println("____  ____     ___     _____   _ ");
                                                                    System.out.println("| __ )|  _ \\   / \\ \\   / / _ \\| |");
                                                                    System.out.println("|  _ \\| |_) | / _ \\ \\ / | |   | |");
                                                                    System.out.println("| |_) |  _ < / ___ \\ V /| |_| |_|");
                                                                    System.out.println("|____/|_| \\_/_/   \\_\\_/  \\___/(_)");
                                                                }else if(option==2){
                                                                    System.out.println(":(");
                                                                }else{
                                                                    System.out.println("Erreur: entrée invalide");
                                                                }
                                                        }else{
                                                            System.out.println("Erreur: entrée invalide");
                                                        }
                                                    }else{
                                                        System.out.println("Erreur: entrée invalide");
                                                    }
                                                }else{
                                                    System.out.println("Erreur: entrée invalide");
                                                }

                                            }else{
                                                System.out.println("Erreur: entrée invalide");
                                            }
                                        }else{
                                            System.out.println("Erreur: entrée invalide");
                                        }
                                    }else{
                                        System.out.println("Erreur: entrée invalide");
                                    }

                                }else if(option==2){
                                    System.out.println("                               _________            ");
                                    System.out.println("                             /  |   |  \\           ");
                                    System.out.println("                             \\__|___|__/            ");
                                    System.out.println("                              |        |            ");
                                    System.out.println("                              |________|            ");
                                    System.out.println("                             | __    __ |           ");
                                    System.out.println("                              \\ o   o  /            ");
                                    System.out.println("                               \\  <   /             ");                                              
                                    System.out.println("                                \\_O__/	            ");
                                    System.out.println("                                |    |              ");
                                    System.out.println("                             /' \\ _ / `\\          ");
                                    System.out.println("                            |     O      |          ");
                                    System.out.println("                            |     O      |          ");
                                    System.out.println("                         ___|____________|________  ");
                                    System.out.println("Oui, j'étais frustrée ce jour-là parce que tous mes couteaux étaient en train d'être aiguisés ce jour-là, donc je n'avais pas accès à mon équipement habituel.");
                                        System.out.println("Choisissez une question à poser: \n 1. Alors comment avez-vous fait pour préparer le déjeuner ?");
                                        option = cat.nextInt();

                                        if(option==1){
                                            System.out.println("                               _________            ");
                                            System.out.println("                             /  |   |  \\           ");
                                            System.out.println("                             \\__|___|__/            ");
                                            System.out.println("                              |        |            ");
                                            System.out.println("                              |________|            ");
                                            System.out.println("                             | __    __ |           ");
                                            System.out.println("                              \\ o   o  /            ");
                                            System.out.println("                               \\  <   /             ");                                              
                                            System.out.println("                                \\_O__/	            ");
                                            System.out.println("                                |    |              ");
                                            System.out.println("                             /' \\ _ / `\\          ");
                                            System.out.println("                            |     O      |          ");
                                            System.out.println("                            |     O      |          ");
                                            System.out.println("                         ___|____________|________  ");
                                            System.out.println("J'ai dû parler au directeur et nous avons fini par aller dans l'arrière-boutique pour trouver un peu de l'ancien matériel, ce qui nous a pris pas mal de temps.");
                                            System.out.println("Choisissez une question à poser: \n 1. Avez-vous un moyen de prouver cette affirmation?");
                                            option = cat.nextInt();
                                            if(option==1){
                                                System.out.println("                               _________            ");
                                                System.out.println("                             /  |   |  \\           ");
                                                System.out.println("                             \\__|___|__/            ");
                                                System.out.println("                              |        |            ");
                                                System.out.println("                              |________|            ");
                                                System.out.println("                             | __    __ |           ");
                                                System.out.println("                              \\ o   o  /            ");
                                                System.out.println("                               \\  <   /             ");                                              
                                                System.out.println("                                \\_O__/	            ");
                                                System.out.println("                                |    |              ");
                                                System.out.println("                             /' \\ _ / `\\          ");
                                                System.out.println("                            |     O      |          ");
                                                System.out.println("                            |     O      |          ");
                                                System.out.println("                        ___|____________|________  ");
                                                System.out.println("Oui, j’ai le directeur comme témoin.");
                                                System.out.println("Choisissez un action: \n 1. Parler au directeur");
                                                option = cat.nextInt();
                                                if(option==1){
                                                    System.out.println("             _____________          ");
                                                    System.out.println("            \\___________/          ");
                                                    System.out.println("          $$| __    __ |$$          ");
                                                    System.out.println("             \\ 0   0  /$           ");
                                                    System.out.println("              \\  <   /             ");                                     
                                                    System.out.println("               \\_-__/              ");
                                                    System.out.println("        ____.-''---''-._____        ");
                                                    System.out.println("        /  ,  \\      /  ,   \\      ");
                                                    System.out.println("       /\\  /\\     o      /\\  /\\     ");
                                                    System.out.println("       \\  |  |   o    | /.  /      ");
                                                    System.out.println("       ______|________|_________   ");
                                                    System.out.println("Choisissez une question à poser: \n 1. Parle-moi du chef\n2. Parle-moi du femme de ménage");
                                                    option = cat.nextInt();
                                                    if(option==1){
                                                        System.out.println("             _____________          ");
                                                        System.out.println("            \\___________/          ");
                                                        System.out.println("          $$| __    __ |$$          ");
                                                        System.out.println("             \\ 0   0  /$           ");
                                                        System.out.println("              \\  <   /             ");                                     
                                                        System.out.println("               \\_o__/              ");
                                                        System.out.println("        ____.-''---''-._____        ");
                                                        System.out.println("        /  ,  \\      /  ,   \\      ");
                                                        System.out.println("       /\\  /\\     o      /\\  /\\     ");
                                                        System.out.println("       \\  |  |   o    | /.  /      ");
                                                        System.out.println("       ______|________|_________   ");
                                                        System.out.println("Oui, il était avec moi la plupart de la journée. Il était très stressé à cause du fait qu'il ne pouvait pas trouver ses matériaux.");
                                                        System.out.println("Choisissez une question à poser: \n 1. Parle-moi du femme de ménage");
                                                        option = cat.nextInt();
                                                            if(option==1){
                                                                System.out.println("             _____________          ");
                                                                System.out.println("            \\___________/          ");
                                                                System.out.println("          $$| __    __ |$$          ");
                                                                System.out.println("             \\ 0   0  /$           ");
                                                                System.out.println("              \\  <   /             ");                                     
                                                                System.out.println("               \\_o__/              ");
                                                                System.out.println("        ____.-''---''-._____        ");
                                                                System.out.println("        /  ,  \\      /  ,   \\      ");
                                                                System.out.println("       /\\  /\\     o      /\\  /\\     ");
                                                                System.out.println("       \\  |  |   o    | /.  /      ");
                                                                System.out.println("       ______|________|_________   ");
                                                                System.out.println("Elle est nouvelle ici. De ce que je me rappelle, elle est arrivée vers 6h du matin et je ne suis pas sûre quand elle est partie mais selon son horaire elle était supposé partir envers 2h.");
                                                                System.out.println("                               __________           ");
                                                                System.out.println("                              /          \\          ");
                                                                System.out.println("                            ~~            ~~        ");
                                                                System.out.println("                              | __   __ |           ");
                                                                System.out.println("                              \\  o  o  /           ");
                                                                System.out.println("                               \\  <   /            ");                               
                                                                System.out.println("                                \\_O__/	            ");
                                                                System.out.println("                      	   ;----~\\ ~ /- ~~---,     ");
                                                                System.out.println("                          \\     |  o  |     /      ");
                                                                System.out.println("                           |    |  o  |     |      ");
                                                                System.out.println("                         __|________________|____  ");
                                                                System.out.println("C'est toutes les preuves que nous avons eu l'occasion de rassembler. Maintenant le choix est entre vos mains. Qui soupçonnez-vous d'être le meurtrier. Choisissez prudemment !");
                                                                System.out.println("Qui pensez-vous être le responsable de ce meurtre ?\n1. La femme de ménage\n2. Le chef");
                                                                option = cat.nextInt();
                                                                if(option==1){
                                                                    System.out.println("____  ____     ___     _____   _ ");
                                                                    System.out.println("| __ )|  _ \\   / \\ \\   / / _ \\| |");
                                                                    System.out.println("|  _ \\| |_) | / _ \\ \\ / | |   | |");
                                                                    System.out.println("| |_) |  _ < / ___ \\ V /| |_| |_|");
                                                                    System.out.println("|____/|_| \\_/_/   \\_\\_/  \\___/(_)");
                                                                }else if(option==2){
                                                                    System.out.println(":(");
                                                                }else{
                                                                    System.out.println("Erreur: entrée invalide");
                                                                }
                                                            }else{
                                                                System.out.println("Erreur: entrée invalide");
                                                            }
                                                        
                                                    }else if(option==2){
                                                        System.out.println("             _____________          ");
                                                        System.out.println("            \\___________/          ");
                                                        System.out.println("          $$| __    __ |$$          ");
                                                        System.out.println("             \\ 0   0  /$           ");
                                                        System.out.println("              \\  <   /             ");                                     
                                                        System.out.println("               \\_o__/              ");
                                                        System.out.println("        ____.-''---''-._____        ");
                                                        System.out.println("        /  ,  \\      /  ,   \\      ");
                                                        System.out.println("       /\\  /\\     o      /\\  /\\     ");
                                                        System.out.println("       \\  |  |   o    | /.  /      ");
                                                        System.out.println("       ______|________|_________   ");
                                                        System.out.println("Elle est nouvelle ici. De ce que je me rappelle, elle est arrivée vers 6h du matin et je ne suis pas sûre quand elle est partie mais selon son horaire elle était supposé partir envers 2h.");        
                                                        System.out.println("Choisissez une question à poser: \n 1. Parle-moi du chef");
                                                        option = cat.nextInt();
                                                        if(option==1){
                                                            System.out.println("             _____________          ");
                                                            System.out.println("            \\___________/          ");
                                                            System.out.println("          $$| __    __ |$$          ");
                                                            System.out.println("             \\ 0   0  /$           ");
                                                            System.out.println("              \\  <   /             ");                                     
                                                            System.out.println("               \\_o__/              ");
                                                            System.out.println("        ____.-''---''-._____        ");
                                                            System.out.println("        /  ,  \\      /  ,   \\      ");
                                                            System.out.println("       /\\  /\\     o      /\\  /\\     ");
                                                            System.out.println("       \\  |  |   o    | /.  /      ");
                                                            System.out.println("       ______|________|_________   ");
                                                            System.out.println("Oui, il était avec moi la plupart de la journée. Il était très stressé à cause du fait qu'il ne pouvait pas trouver ses matériaux.");
                                                            System.out.println("                               __________           ");
                                                            System.out.println("                              /          \\          ");
                                                            System.out.println("                            ~~            ~~        ");
                                                            System.out.println("                              | __   __ |           ");
                                                            System.out.println("                              \\  o  o  /           ");
                                                            System.out.println("                               \\  <   /            ");                               
                                                            System.out.println("                                \\_O__/	            ");
                                                            System.out.println("                      	   ;----~\\ ~ /- ~~---,     ");
                                                            System.out.println("                          \\     |  o  |     /      ");
                                                            System.out.println("                           |    |  o  |     |      ");
                                                            System.out.println("                         __|________________|____  ");
                                                            System.out.println("C'est toutes les preuves que nous avons eu l'occasion de rassembler. Maintenant le choix est entre vos mains. Qui soupçonnez-vous d'être le meurtrier. Choisissez prudemment !");
                                                                System.out.println("Qui pensez-vous être le responsable de ce meurtre ?\n1. La femme de ménage\n2. Le chef");
                                                                option = cat.nextInt();
                                                                if(option==1){
                                                                    System.out.println("____  ____     ___     _____   _ ");
                                                                    System.out.println("| __ )|  _ \\   / \\ \\   / / _ \\| |");
                                                                    System.out.println("|  _ \\| |_) | / _ \\ \\ / | |   | |");
                                                                    System.out.println("| |_) |  _ < / ___ \\ V /| |_| |_|");
                                                                    System.out.println("|____/|_| \\_/_/   \\_\\_/  \\___/(_)");
                                                                }else if(option==2){
                                                                    System.out.println(":(");
                                                                }else{
                                                                    System.out.println("Erreur: entrée invalide");
                                                                }
                                                        }else{
                                                            System.out.println("Erreur: entrée invalide");
                                                        }
                                                    }else{
                                                        System.out.println("Erreur: entrée invalide");
                                                    }
                                                }else{
                                                    System.out.println("Erreur: entrée invalide");
                                                }

                                            }else{
                                                System.out.println("Erreur: entrée invalide");
                                            }
                                        }else{
                                            System.out.println("Erreur: entrée invalide");
                                        }
                    
                                }else{
                                    System.out.println("Erreur: entrée invalide");
                                }
                            }else{
                                System.out.println("Erreur: entrée invalide");
                            }

                        }else{
                            System.out.println("Erreur: entrée invalide");
                        }
                    }else{
                        System.out.println("Erreur: entrée invalide");
                    }

                }else{
                    System.out.println("Erreur: entrée invalide");
                }
            }
            else if(option==2){//si le joueur choisi l'option 2
                System.out.println("                               _________            ");
                System.out.println("                             /  |   |  \\           ");
                System.out.println("                             \\__|___|__/            ");
                System.out.println("                              |        |            ");
                System.out.println("                              |________|            ");
                System.out.println("                             | __    __ |           ");
                System.out.println("                              \\ o   o  /            ");
                System.out.println("                               \\  <   /             ");                                              
                System.out.println("                                \\_O__/	            ");
                System.out.println("                                |    |              ");
                System.out.println("                             /' \\ _ / `\\          ");
                System.out.println("                            |     O      |          ");
                System.out.println("                            |     O      |          ");
                System.out.println("                         ___|____________|________  ");
                System.out.println("Choisissez une question à poser: \n 1. Où étiez-vous quand le meurtre a eu lieu ?\n 2. Que rappelez-vous de ce jour?");
                option = cat.nextInt();
                if(option==1){
                    System.out.println("                               _________            ");
                    System.out.println("                             /  |   |  \\           ");
                    System.out.println("                             \\__|___|__/            ");
                    System.out.println("                              |        |            ");
                    System.out.println("                              |________|            ");
                    System.out.println("                             | __    __ |           ");
                    System.out.println("                              \\ o   o  /            ");
                    System.out.println("                               \\  <   /             ");                                              
                    System.out.println("                                \\_O__/	            ");
                    System.out.println("                                |    |              ");
                    System.out.println("                             /' \\ _ / `\\          ");
                    System.out.println("                            |     O      |          ");
                    System.out.println("                            |     O      |          ");
                    System.out.println("                         ___|____________|________  ");
                    System.out.println("J'étais dans la cuisine en train d'essayer de préparer le déjeuner.");
                    System.out.println("Choisissez une question à poser: \n 1. Que rappelez-vous de ce jour?");
                    option = cat.nextInt();
                    if(option==1){
                        System.out.println("                               _________            ");
                        System.out.println("                             /  |   |  \\           ");
                        System.out.println("                             \\__|___|__/            ");
                        System.out.println("                              |        |            ");
                        System.out.println("                              |________|            ");
                        System.out.println("                             | __    __ |           ");
                        System.out.println("                              \\ o   o  /            ");
                        System.out.println("                               \\  <   /             ");                                              
                        System.out.println("                                \\_O__/	            ");
                        System.out.println("                                |    |              ");
                        System.out.println("                             /' \\ _ / `\\          ");
                        System.out.println("                            |     O      |          ");
                        System.out.println("                            |     O      |          ");
                        System.out.println("                         ___|____________|________  ");
                        System.out.println("J'étais frustrée parce que tous mes couteaux étaient en train d'être aiguisés ce jour-là, donc je n'avais pas accès à mon équipement habituel.");
                        System.out.println("Choisissez une question à poser: \n 1. Alors comment avez-vous fait pour préparer le déjeuner ?");
                        option = cat.nextInt();
                        if(option==1){
                            System.out.println("                               _________            ");
                            System.out.println("                             /  |   |  \\           ");
                            System.out.println("                             \\__|___|__/            ");
                            System.out.println("                              |        |            ");
                            System.out.println("                              |________|            ");
                            System.out.println("                             | __    __ |           ");
                            System.out.println("                              \\ o   o  /            ");
                            System.out.println("                               \\  <   /             ");                                              
                            System.out.println("                                \\_O__/	            ");
                            System.out.println("                                |    |              ");
                            System.out.println("                             /' \\ _ / `\\          ");
                            System.out.println("                            |     O      |          ");
                            System.out.println("                            |     O      |          ");
                            System.out.println("                         ___|____________|________  ");
                            System.out.println("J'ai dû parler au directeur et nous avons fini par aller dans l'arrière-boutique pour trouver un peu de matériel ancien, ce qui nous a pris pas mal de temps.");
                            System.out.println("Je m'excuse mais je dois retourner à mon travail, le souper commence bientôt.");
                            System.out.println("Qui voulez-vous interroger prochainement?(1. La femme de ménage)");
                            option = cat.nextInt();
                            if(option==1){
                                System.out.println("                    ________        ");
                                System.out.println("                   /________ \\     ");
                                System.out.println("                  //( ( ( ( \\ \\   ");
                                System.out.println("                 || ( -  - ( ( |    ");
                                System.out.println("                      o  o ) ( |    ");
                                System.out.println("                 ||) )  <  ) )||    ");
                                System.out.println("                 || (\\  _ ( ( ||   ");
                                System.out.println("                 |) )   \\)_  |/    ");
                                System.out.println("                 / ((\\_v_/   \\    ");
                                System.out.println("                /  /)  o    \\ \\   ");
                                System.out.println("                |  |   o    | |     ");
                                System.out.println("                |  \\   o    /  |   ");
                                System.out.println("           _____|_____________|_____");
                                System.out.println("Choisissez une question à poser: \n 1. Que faisiez-vous le jour du meurtre? \n 2. Quand êtes-vous parti de l'hôtel?");
                                option = cat.nextInt();
                                if(option==1){
                                    System.out.println("                    ________        ");
                                    System.out.println("                   /________ \\     ");
                                    System.out.println("                  //( ( ( ( \\ \\   ");
                                    System.out.println("                 || ( -  - ( ( |    ");
                                    System.out.println("                      o  o ) ( |    ");
                                    System.out.println("                 ||) )  <  ) )||    ");
                                    System.out.println("                 || (\\  o ( ( ||   ");
                                    System.out.println("                 |) )   \\)_  |/    ");
                                    System.out.println("                 / ((\\_v_/   \\    ");
                                    System.out.println("                /  /)  o    \\ \\   ");
                                    System.out.println("                |  |   o    | |     ");
                                    System.out.println("                |  \\   o    /  |   ");
                                    System.out.println("           _____|_____________|_____");
                                    System.out.println("J'ai travaillé vers 6 heures du matin et j'ai commencé à nettoyer les chambres du troisième étage.");
                                    System.out.println("Choisissez une question à poser: \n 1. Quand êtes-vous parti de l'hôtel?");
                                    option = cat.nextInt();
                                    if(option==1){
                                        System.out.println("                    ________        ");
                                        System.out.println("                   /________ \\     ");
                                        System.out.println("                  //( ( ( ( \\ \\   ");
                                        System.out.println("                 || ( -  - ( ( |    ");
                                        System.out.println("                      o  o ) ( |    ");
                                        System.out.println("                 ||) )  <  ) )||    ");
                                        System.out.println("                 || (\\  o ( ( ||   ");
                                        System.out.println("                 |) )   \\)_  |/    ");
                                        System.out.println("                 / ((\\_v_/   \\    ");
                                        System.out.println("                /  /)  o    \\ \\   ");
                                        System.out.println("                |  |   o    | |     ");
                                        System.out.println("                |  \\   o    /  |   ");
                                        System.out.println("           _____|_____________|_____");
                                        System.out.println("Vers midi.");
                                        System.out.println("Choisissez une question à poser: \n 1. Avez-vous quelque chose d'autre à ajouter?");
                                        option = cat.nextInt();
                                        if(option==1){
                                            System.out.println("                    ________        ");
                                            System.out.println("                   /________ \\     ");
                                            System.out.println("                  //( ( ( ( \\ \\   ");
                                            System.out.println("                 || ( -  - ( ( |    ");
                                            System.out.println("                      o  o ) ( |    ");
                                            System.out.println("                 ||) )  <  ) )||    ");
                                            System.out.println("                 || (\\  o ( ( ||   ");
                                            System.out.println("                 |) )   \\)_  |/    ");
                                            System.out.println("                 / ((\\_v_/   \\    ");
                                            System.out.println("                /  /)  o    \\ \\   ");
                                            System.out.println("                |  |   o    | |     ");
                                            System.out.println("                |  \\   o    /  |   ");
                                            System.out.println("           _____|_____________|_____");
                                            System.out.println("imaginez le nombre d'armes auxquelles le chef a accès");
                                            System.out.println("Choisissez une question à poser: \n 1. Avez-vous un moyen de prouver cette affirmation?");
                                            option = cat.nextInt();
                                            if(option==1){
                                                System.out.println("                    ________        ");
                                                System.out.println("                   /________ \\     ");
                                                System.out.println("                  //( ( ( ( \\ \\   ");
                                                System.out.println("                 || ( -  - ( ( |    ");
                                                System.out.println("                      o  o ) ( |    ");
                                                System.out.println("                 ||) )  <  ) )||    ");
                                                System.out.println("                 || (\\  o ( ( ||   ");
                                                System.out.println("                 |) )   \\)_  |/    ");
                                                System.out.println("                 / ((\\_v_/   \\    ");
                                                System.out.println("                /  /)  o    \\ \\   ");
                                                System.out.println("                |  |   o    | |     ");
                                                System.out.println("                |  \\   o    /  |   ");
                                                System.out.println("           _____|_____________|_____");
                                                System.out.println("Oui, j’ai le directeur comme témoin.");
                                                System.out.println("Choisissez un action: \n 1. Parler au directeur");
                                                option = cat.nextInt();
                                                if(option==1){
                                                    System.out.println("             _____________          ");
                                                    System.out.println("            \\___________/          ");
                                                    System.out.println("          $$| __    __ |$$          ");
                                                    System.out.println("             \\ 0   0  /$           ");
                                                    System.out.println("              \\  <   /             ");                                     
                                                    System.out.println("               \\_o__/              ");
                                                    System.out.println("        ____.-''---''-._____        ");
                                                    System.out.println("        /  ,  \\      /  ,   \\      ");
                                                    System.out.println("       /\\  /\\     o      /\\  /\\     ");
                                                    System.out.println("       \\  |  |   o    | /.  /      ");
                                                    System.out.println("        ______|________|_________   ");
                                                    System.out.println("Choisissez une question à poser: \n 1. Parle-moi du chef\n2. Parle-moi du femme de ménage");
                                                    option = cat.nextInt();
                                                    if(option==1){
                                                        System.out.println("             _____________          ");
                                                        System.out.println("            \\___________/          ");
                                                        System.out.println("          $$| __    __ |$$          ");
                                                        System.out.println("             \\ 0   0  /$           ");
                                                        System.out.println("              \\  <   /             ");                                     
                                                        System.out.println("               \\_o__/              ");
                                                        System.out.println("        ____.-''---''-._____        ");
                                                        System.out.println("        /  ,  \\      /  ,   \\      ");
                                                        System.out.println("       /\\  /\\     o      /\\  /\\     ");
                                                        System.out.println("       \\  |  |   o    | /.  /      ");
                                                        System.out.println("       ______|________|_________   ");
                                                        System.out.println("Oui, il était avec moi la plupart de la journée. Il était très stressé à cause du fait qu'il ne pouvait pas trouver ses matériaux.");
                                                        System.out.println("Choisissez une question à poser: \n 1. Parle-moi du femme de ménage");
                                                        option = cat.nextInt();
                                                            if(option==1){
                                                                System.out.println("             _____________          ");
                                                                System.out.println("            \\___________/          ");
                                                                System.out.println("          $$| __    __ |$$          ");
                                                                System.out.println("             \\ 0   0  /$           ");
                                                                System.out.println("              \\  <   /             ");                                     
                                                                System.out.println("               \\_o__/              ");
                                                                System.out.println("        ____.-''---''-._____        ");
                                                                System.out.println("        /  ,  \\      /  ,   \\      ");
                                                                System.out.println("       /\\  /\\     o      /\\  /\\     ");
                                                                System.out.println("       \\  |  |   o    | /.  /      ");
                                                                System.out.println("       ______|________|_________   ");
                                                                System.out.println("Elle est nouvelle ici. De ce que je me rappelle, elle est arrivée vers 6h du matin et je ne suis pas sûre quand elle est partie mais selon son horaire elle était supposé partir envers 2h.");
                                                                System.out.println("                               __________           ");
                                                                System.out.println("                              /          \\          ");
                                                                System.out.println("                            ~~            ~~        ");
                                                                System.out.println("                              | __   __ |           ");
                                                                System.out.println("                              \\  o  o  /           ");
                                                                System.out.println("                               \\  <   /            ");                               
                                                                System.out.println("                                \\_O__/	            ");
                                                                System.out.println("                      	   ;----~\\ ~ /- ~~---,     ");
                                                                System.out.println("                          \\     |  o  |     /      ");
                                                                System.out.println("                           |    |  o  |     |      ");
                                                                System.out.println("                         __|________________|____  ");
                                                                System.out.println("C'est toutes les preuves que nous avons eu l'occasion de rassembler. Maintenant le choix est entre vos mains. Qui soupçonnez-vous d'être le meurtrier. Choisissez prudemment !");
                                                                System.out.println("Qui pensez-vous être le responsable de ce meurtre ?\n1. La femme de ménage\n2. Le chef");
                                                                option = cat.nextInt();
                                                                if(option==1){
                                                                    System.out.println("____  ____     ___     _____   _ ");
                                                                    System.out.println("| __ )|  _ \\   / \\ \\   / / _ \\| |");
                                                                    System.out.println("|  _ \\| |_) | / _ \\ \\ / | |   | |");
                                                                    System.out.println("| |_) |  _ < / ___ \\ V /| |_| |_|");
                                                                    System.out.println("|____/|_| \\_/_/   \\_\\_/  \\___/(_)");
                                                                }else if(option==2){
                                                                    System.out.println(":(");
                                                                }else{
                                                                    System.out.println("Erreur: entrée invalide");
                                                                }
                                                            }else{
                                                                System.out.println("Erreur: entrée invalide");
                                                            }
                                                        
                                                    }else if(option==2){
                                                        System.out.println("             _____________          ");
                                                        System.out.println("            \\___________/          ");
                                                        System.out.println("          $$| __    __ |$$          ");
                                                        System.out.println("             \\ 0   0  /$           ");
                                                        System.out.println("              \\  <   /             ");                                     
                                                        System.out.println("               \\_o__/              ");
                                                        System.out.println("        ____.-''---''-._____        ");
                                                        System.out.println("        /  ,  \\      /  ,   \\      ");
                                                        System.out.println("       /\\  /\\     o      /\\  /\\     ");
                                                        System.out.println("       \\  |  |   o    | /.  /      ");
                                                        System.out.println("       ______|________|_________   ");
                                                        System.out.println("Elle est nouvelle ici. De ce que je me rappelle, elle est arrivée vers 6h du matin et je ne suis pas sûre quand elle est partie mais selon son horaire elle était supposé partir envers 2h.");        
                                                        System.out.println("Choisissez une question à poser: \n 1. Parle-moi du chef");
                                                        option = cat.nextInt();
                                                        if(option==1){
                                                            System.out.println("             _____________          ");
                                                            System.out.println("            \\___________/          ");
                                                            System.out.println("          $$| __    __ |$$          ");
                                                            System.out.println("             \\ 0   0  /$           ");
                                                            System.out.println("              \\  <   /             ");                                     
                                                            System.out.println("               \\_o__/              ");
                                                            System.out.println("        ____.-''---''-._____        ");
                                                            System.out.println("        /  ,  \\      /  ,   \\      ");
                                                            System.out.println("       /\\  /\\     o      /\\  /\\     ");
                                                            System.out.println("       \\  |  |   o    | /.  /      ");
                                                            System.out.println("       ______|________|_________   ");
                                                            System.out.println("Oui, il était avec moi la plupart de la journée. Il était très stressé à cause du fait qu'il ne pouvait pas trouver ses matériaux.");
                                                            System.out.println("                               __________           ");
                                                            System.out.println("                              /          \\          ");
                                                            System.out.println("                            ~~            ~~        ");
                                                            System.out.println("                              | __   __ |           ");
                                                            System.out.println("                              \\  o  o  /           ");
                                                            System.out.println("                               \\  <   /            ");                               
                                                            System.out.println("                                \\_O__/	            ");
                                                            System.out.println("                      	   ;----~\\ ~ /- ~~---,     ");
                                                            System.out.println("                          \\     |  o  |     /      ");
                                                            System.out.println("                           |    |  o  |     |      ");
                                                            System.out.println("                         __|________________|____  ");
                                                            System.out.println("C'est toutes les preuves que nous avons eu l'occasion de rassembler. Maintenant le choix est entre vos mains. Qui soupçonnez-vous d'être le meurtrier. Choisissez prudemment !");
                                                                System.out.println("Qui pensez-vous être le responsable de ce meurtre ?\n1. La femme de ménage\n2. Le chef");
                                                                option = cat.nextInt();
                                                                if(option==1){
                                                                    System.out.println("____  ____     ___     _____   _ ");
                                                                    System.out.println("| __ )|  _ \\   / \\ \\   / / _ \\| |");
                                                                    System.out.println("|  _ \\| |_) | / _ \\ \\ / | |   | |");
                                                                    System.out.println("| |_) |  _ < / ___ \\ V /| |_| |_|");
                                                                    System.out.println("|____/|_| \\_/_/   \\_\\_/  \\___/(_)");
                                                                }else if(option==2){
                                                                    System.out.println(":(");
                                                                }else{
                                                                    System.out.println("Erreur: entrée invalide");
                                                                }
                                                        }else{
                                                            System.out.println("Erreur: entrée invalide");
                                                        }
                                                    }else{
                                                        System.out.println("Erreur: entrée invalide");
                                                    }
                                                }else{
                                                    System.out.println("Erreur: entrée invalide");
                                                }

                                            }else{
                                                System.out.println("Erreur: entrée invalide");
                                            }
                                            }
                                            else{
                                                System.out.println("Erreur: entrée invalide");
                                            }
                                        }else if(option==2){
                                            System.out.println("                    ________        ");
                                            System.out.println("                   /________ \\     ");
                                            System.out.println("                  //( ( ( ( \\ \\   ");
                                            System.out.println("                 || ( -  - ( ( |    ");
                                            System.out.println("                      o  o ) ( |    ");
                                            System.out.println("                 ||) )  <  ) )||    ");
                                            System.out.println("                 || (\\  o ( ( ||   ");
                                            System.out.println("                 |) )   \\)_  |/    ");
                                            System.out.println("                 / ((\\_v_/   \\    ");
                                            System.out.println("                /  /)  o    \\ \\   ");
                                            System.out.println("                |  |   o    | |     ");
                                            System.out.println("                |  \\   o    /  |   ");
                                            System.out.println("           _____|_____________|_____");
                                            System.out.println("Vers midi.");
                                            System.out.println("Choisissez une question à poser: \n 1. Que faisiez-vous le jour du meurtre?");
                                            option = cat.nextInt();
                                            if(option==1){
                                                System.out.println("                    ________        ");
                                                System.out.println("                   /________ \\     ");
                                                System.out.println("                  //( ( ( ( \\ \\   ");
                                                System.out.println("                 || ( -  - ( ( |    ");
                                                System.out.println("                      o  o ) ( |    ");
                                                System.out.println("                 ||) )  <  ) )||    ");
                                                System.out.println("                 || (\\  o ( ( ||   ");
                                                System.out.println("                 |) )   \\)_  |/    ");
                                                System.out.println("                 / ((\\_v_/   \\    ");
                                                System.out.println("                /  /)  o    \\ \\   ");
                                                System.out.println("                |  |   o    | |     ");
                                                System.out.println("                |  \\   o    /  |   ");
                                                System.out.println("           _____|_____________|_____");
                                                System.out.println("J'ai travaillé vers 6 heures du matin et j'ai commencé à nettoyer les chambres du troisième étage.");
                                                System.out.println("Choisissez une question à poser: \n 1. Avez-vous quelque chose d'autre à ajouter?");
                                                option = cat.nextInt();
                                                if(option==1){
                                                    System.out.println("                    ________        ");
                                                    System.out.println("                   /________ \\     ");
                                                    System.out.println("                  //( ( ( ( \\ \\   ");
                                                    System.out.println("                 || ( -  - ( ( |    ");
                                                    System.out.println("                      o  o ) ( |    ");
                                                    System.out.println("                 ||) )  <  ) )||    ");
                                                    System.out.println("                 || (\\  o ( ( ||   ");
                                                    System.out.println("                 |) )   \\)_  |/    ");
                                                    System.out.println("                 / ((\\_v_/   \\    ");
                                                    System.out.println("                /  /)  o    \\ \\   ");
                                                    System.out.println("                |  |   o    | |     ");
                                                    System.out.println("                |  \\   o    /  |   ");
                                                    System.out.println("           _____|_____________|_____");
                                                    System.out.println("imaginez le nombre d'armes auxquelles le chef a accès");
                                                    System.out.println("Choisissez une question à poser: \n 1. Avez-vous un moyen de prouver cette affirmation?");
                                                    option = cat.nextInt();
                                                    if(option==1){
                                                        System.out.println("                    ________        ");
                                                        System.out.println("                   /________ \\     ");
                                                        System.out.println("                  //( ( ( ( \\ \\   ");
                                                        System.out.println("                 || ( -  - ( ( |    ");
                                                        System.out.println("                      o  o ) ( |    ");
                                                        System.out.println("                 ||) )  <  ) )||    ");
                                                        System.out.println("                 || (\\  o ( ( ||   ");
                                                        System.out.println("                 |) )   \\)_  |/    ");
                                                        System.out.println("                 / ((\\_v_/   \\    ");
                                                        System.out.println("                /  /)  o    \\ \\   ");
                                                        System.out.println("                |  |   o    | |     ");
                                                        System.out.println("                |  \\   o    /  |   ");
                                                        System.out.println("           _____|_____________|_____");
                                                        System.out.println("Oui, j’ai le directeur comme témoin.");
                                                        System.out.println("Choisissez un action: \n 1. Parler au directeur");
                                                        option = cat.nextInt();
                                                        if(option==1){
                                                            System.out.println("             _____________          ");
                                                            System.out.println("            \\___________/          ");
                                                            System.out.println("          $$| __    __ |$$          ");
                                                            System.out.println("             \\ 0   0  /$           ");
                                                            System.out.println("              \\  <   /             ");                                     
                                                            System.out.println("               \\_o__/              ");
                                                            System.out.println("        ____.-''---''-._____        ");
                                                            System.out.println("        /  ,  \\      /  ,   \\      ");
                                                            System.out.println("       /\\  /\\     o      /\\  /\\     ");
                                                            System.out.println("       \\  |  |   o    | /.  /      ");
                                                            System.out.println("       ______|________|_________   ");
                                                            System.out.println("Choisissez une question à poser: \n 1. Parle-moi du chef\n2. Parle-moi du femme de ménage");
                                                            option = cat.nextInt();
                                                            if(option==1){
                                                                System.out.println("             _____________          ");
                                                                System.out.println("            \\___________/          ");
                                                                System.out.println("          $$| __    __ |$$          ");
                                                                System.out.println("             \\ 0   0  /$           ");
                                                                System.out.println("              \\  <   /             ");                                     
                                                                System.out.println("               \\_o__/              ");
                                                                System.out.println("        ____.-''---''-._____        ");
                                                                System.out.println("        /  ,  \\      /  ,   \\      ");
                                                                System.out.println("       /\\  /\\     o      /\\  /\\     ");
                                                                System.out.println("       \\  |  |   o    | /.  /      ");
                                                                System.out.println("       ______|________|_________   ");
                                                                System.out.println("Oui, il était avec moi la plupart de la journée. Il était très stressé à cause du fait qu'il ne pouvait pas trouver ses matériaux.");
                                                                System.out.println("Choisissez une question à poser: \n 1. Parle-moi du femme de ménage");
                                                                option = cat.nextInt();
                                                                    if(option==1){
                                                                        System.out.println("             _____________          ");
                                                                        System.out.println("            \\___________/          ");
                                                                        System.out.println("          $$| __    __ |$$          ");
                                                                        System.out.println("             \\ 0   0  /$           ");
                                                                        System.out.println("              \\  <   /             ");                                     
                                                                        System.out.println("               \\_o__/              ");
                                                                        System.out.println("        ____.-''---''-._____        ");
                                                                        System.out.println("        /  ,  \\      /  ,   \\      ");
                                                                        System.out.println("       /\\  /\\     o      /\\  /\\     ");
                                                                        System.out.println("       \\  |  |   o    | /.  /      ");
                                                                        System.out.println("       ______|________|_________   ");
                                                                        System.out.println("Elle est nouvelle ici. De ce que je me rappelle, elle est arrivée vers 6h du matin et je ne suis pas sûre quand elle est partie mais selon son horaire elle était supposé partir envers 2h.");
                                                                        System.out.println("                               __________           ");
                                                                        System.out.println("                              /          \\          ");
                                                                        System.out.println("                            ~~            ~~        ");
                                                                        System.out.println("                              | __   __ |           ");
                                                                        System.out.println("                              \\  o  o  /           ");
                                                                        System.out.println("                               \\  <   /            ");                               
                                                                        System.out.println("                                \\_O__/	            ");
                                                                        System.out.println("                      	   ;----~\\ ~ /- ~~---,     ");
                                                                        System.out.println("                          \\     |  o  |     /      ");
                                                                        System.out.println("                           |    |  o  |     |      ");
                                                                        System.out.println("                         __|________________|____  ");
                                                                        System.out.println("C'est toutes les preuves que nous avons eu l'occasion de rassembler. Maintenant le choix est entre vos mains. Qui soupçonnez-vous d'être le meurtrier. Choisissez prudemment !");
                                                                        System.out.println("Qui pensez-vous être le responsable de ce meurtre ?\n1. La femme de ménage\n2. Le chef");
                                                                        option = cat.nextInt();
                                                                        if(option==1){
                                                                            System.out.println("____  ____     ___     _____   _ ");
                                                                            System.out.println("| __ )|  _ \\   / \\ \\   / / _ \\| |");
                                                                            System.out.println("|  _ \\| |_) | / _ \\ \\ / | |   | |");
                                                                            System.out.println("| |_) |  _ < / ___ \\ V /| |_| |_|");
                                                                            System.out.println("|____/|_| \\_/_/   \\_\\_/  \\___/(_)");
                                                                        }else if(option==2){
                                                                            System.out.println(":(");
                                                                        }else{
                                                                            System.out.println("Erreur: entrée invalide");
                                                                        }
                                                                    }else{
                                                                        System.out.println("Erreur: entrée invalide");
                                                                    }
                                                                
                                                            }else if(option==2){
                                                                System.out.println("             _____________          ");
                                                                System.out.println("            \\___________/          ");
                                                                System.out.println("          $$| __    __ |$$          ");
                                                                System.out.println("             \\ 0   0  /$           ");
                                                                System.out.println("              \\  <   /             ");                                     
                                                                System.out.println("               \\_o__/              ");
                                                                System.out.println("        ____.-''---''-._____        ");
                                                                System.out.println("        /  ,  \\      /  ,   \\      ");
                                                                System.out.println("       /\\  /\\     o      /\\  /\\     ");
                                                                System.out.println("       \\  |  |   o    | /.  /      ");
                                                                System.out.println("       ______|________|_________   ");
                                                                System.out.println("Elle est nouvelle ici. De ce que je me rappelle, elle est arrivée vers 6h du matin et je ne suis pas sûre quand elle est partie mais selon son horaire elle était supposé partir envers 2h.");        
                                                                System.out.println("Choisissez une question à poser: \n 1. Parle-moi du chef");
                                                                option = cat.nextInt();
                                                                if(option==1){
                                                                    System.out.println("             _____________          ");
                                                                    System.out.println("            \\___________/          ");
                                                                    System.out.println("          $$| __    __ |$$          ");
                                                                    System.out.println("             \\ 0   0  /$           ");
                                                                    System.out.println("              \\  <   /             ");                                     
                                                                    System.out.println("               \\_o__/              ");
                                                                    System.out.println("        ____.-''---''-._____        ");
                                                                    System.out.println("        /  ,  \\      /  ,   \\      ");
                                                                    System.out.println("       /\\  /\\     o      /\\  /\\     ");
                                                                    System.out.println("       \\  |  |   o    | /.  /      ");
                                                                    System.out.println("       ______|________|_________   ");
                                                                    System.out.println("Oui, il était avec moi la plupart de la journée. Il était très stressé à cause du fait qu'il ne pouvait pas trouver ses matériaux.");
                                                                    System.out.println("                               __________           ");
                                                                    System.out.println("                              /          \\          ");
                                                                    System.out.println("                            ~~            ~~        ");
                                                                    System.out.println("                              | __   __ |           ");
                                                                    System.out.println("                              \\  o  o  /           ");
                                                                    System.out.println("                               \\  <   /            ");                               
                                                                    System.out.println("                                \\_O__/	            ");
                                                                    System.out.println("                      	   ;----~\\ ~ /- ~~---,     ");
                                                                    System.out.println("                          \\     |  o  |     /      ");
                                                                    System.out.println("                           |    |  o  |     |      ");
                                                                    System.out.println("                         __|________________|____  ");
                                                                    System.out.println("C'est toutes les preuves que nous avons eu l'occasion de rassembler. Maintenant le choix est entre vos mains. Qui soupçonnez-vous d'être le meurtrier. Choisissez prudemment !");
                                                                        System.out.println("Qui pensez-vous être le responsable de ce meurtre ?\n1. La femme de ménage\n2. Le chef");
                                                                        option = cat.nextInt();
                                                                        if(option==1){
                                                                            System.out.println("____  ____     ___     _____   _ ");
                                                                            System.out.println("| __ )|  _ \\   / \\ \\   / / _ \\| |");
                                                                            System.out.println("|  _ \\| |_) | / _ \\ \\ / | |   | |");
                                                                            System.out.println("| |_) |  _ < / ___ \\ V /| |_| |_|");
                                                                            System.out.println("|____/|_| \\_/_/   \\_\\_/  \\___/(_)");
                                                                        }else if(option==2){
                                                                            System.out.println(":(");
                                                                        }else{
                                                                            System.out.println("Erreur: entrée invalide");
                                                                        }
                                                                }else{
                                                                    System.out.println("Erreur: entrée invalide");
                                                                }
                                                            }else{
                                                                System.out.println("Erreur: entrée invalide");
                                                            }
                                                        }else{
                                                            System.out.println("Erreur: entrée invalide");
                                                        }
        
                                                    }else{
                                                        System.out.println("Erreur: entrée invalide");
                                                    }
                                                    }
                                            }else{
                                                System.out.println("Erreur: entrée invalide");
                                            }
                                        }else{
                                            System.out.println("Erreur: entrée invalide");
                                        }
                                    }
                                    else if(option==2){
                                        System.out.println("                    ________        ");
                                        System.out.println("                   /________ \\     ");
                                        System.out.println("                  //( ( ( ( \\ \\   ");
                                        System.out.println("                 || ( -  - ( ( |    ");
                                        System.out.println("                      o  o ) ( |    ");
                                        System.out.println("                 ||) )  <  ) )||    ");
                                        System.out.println("                 || (\\  o ( ( ||   ");
                                        System.out.println("                 |) )   \\)_  |/    ");
                                        System.out.println("                 / ((\\_v_/   \\    ");
                                        System.out.println("                /  /)  o    \\ \\   ");
                                        System.out.println("                |  |   o    | |     ");
                                        System.out.println("                |  \\   o    /  |   ");
                                        System.out.println("           _____|_____________|_____");
                                        System.out.println("Vers midi.");
                                        System.out.println("Choisissez une question à poser: \n 1. Que faisiez-vous le jour du meurtre?");
                                        option = cat.nextInt();
                                            if(option==1){
                                                System.out.println("                    ________        ");
                                                System.out.println("                   /________ \\     ");
                                                System.out.println("                  //( ( ( ( \\ \\   ");
                                                System.out.println("                 || ( -  - ( ( |    ");
                                                System.out.println("                      o  o ) ( |    ");
                                                System.out.println("                 ||) )  <  ) )||    ");
                                                System.out.println("                 || (\\  o ( ( ||   ");
                                                System.out.println("                 |) )   \\)_  |/    ");
                                                System.out.println("                 / ((\\_v_/   \\    ");
                                                System.out.println("                /  /)  o    \\ \\   ");
                                                System.out.println("                |  |   o    | |     ");
                                                System.out.println("                |  \\   o    /  |   ");
                                                System.out.println("           _____|_____________|_____");
                                                System.out.println("J'ai travaillé vers 6 heures du matin et j'ai commencé à nettoyer les chambres du troisième étage.");
                                                System.out.println("Choisissez une question à poser: \n 1. Avez-vous quelque chose d'autre à ajouter?");
                                                option = cat.nextInt();
                                                if(option==1){
                                                    System.out.println("                    ________        ");
                                                    System.out.println("                   /________ \\     ");
                                                    System.out.println("                  //( ( ( ( \\ \\   ");
                                                    System.out.println("                 || ( -  - ( ( |    ");
                                                    System.out.println("                      o  o ) ( |    ");
                                                    System.out.println("                 ||) )  <  ) )||    ");
                                                    System.out.println("                 || (\\  o ( ( ||   ");
                                                    System.out.println("                 |) )   \\)_  |/    ");
                                                    System.out.println("                 / ((\\_v_/   \\    ");
                                                    System.out.println("                /  /)  o    \\ \\   ");
                                                    System.out.println("                |  |   o    | |     ");
                                                    System.out.println("                |  \\   o    /  |   ");
                                                    System.out.println("           _____|_____________|_____");
                                                    System.out.println("imaginez le nombre d'armes auxquelles le chef a accès");
                                                    System.out.println("Choisissez une question à poser: \n 1. Avez-vous un moyen de prouver cette affirmation?");
                                                    option = cat.nextInt();
                                                    if(option==1){
                                                        System.out.println("                    ________        ");
                                                        System.out.println("                   /________ \\     ");
                                                        System.out.println("                  //( ( ( ( \\ \\   ");
                                                        System.out.println("                 || ( -  - ( ( |    ");
                                                        System.out.println("                      o  o ) ( |    ");
                                                        System.out.println("                 ||) )  <  ) )||    ");
                                                        System.out.println("                 || (\\  o ( ( ||   ");
                                                        System.out.println("                 |) )   \\)_  |/    ");
                                                        System.out.println("                 / ((\\_v_/   \\    ");
                                                        System.out.println("                /  /)  o    \\ \\   ");
                                                        System.out.println("                |  |   o    | |     ");
                                                        System.out.println("                |  \\   o    /  |   ");
                                                        System.out.println("           _____|_____________|_____");
                                                        System.out.println("Oui, j’ai le directeur comme témoin.");
                                                        System.out.println("Choisissez un action: \n 1. Parler au directeur");
                                                        option = cat.nextInt();
                                                        if(option==1){
                                                            System.out.println("             _____________          ");
                                                            System.out.println("            \\___________/          ");
                                                            System.out.println("          $$| __    __ |$$          ");
                                                            System.out.println("             \\ 0   0  /$           ");
                                                            System.out.println("              \\  <   /             ");                                     
                                                            System.out.println("               \\_o__/              ");
                                                            System.out.println("        ____.-''---''-._____        ");
                                                            System.out.println("        /  ,  \\      /  ,   \\      ");
                                                            System.out.println("       /\\  /\\     o      /\\  /\\     ");
                                                            System.out.println("       \\  |  |   o    | /.  /      ");
                                                            System.out.println("       ______|________|_________   ");
                                                            System.out.println("Choisissez une question à poser: \n 1. Parle-moi du chef\n2. Parle-moi du femme de ménage");
                                                            option = cat.nextInt();
                                                            if(option==1){
                                                                System.out.println("             _____________          ");
                                                                System.out.println("            \\___________/          ");
                                                                System.out.println("          $$| __    __ |$$          ");
                                                                System.out.println("             \\ 0   0  /$           ");
                                                                System.out.println("              \\  <   /             ");                                     
                                                                System.out.println("               \\_o__/              ");
                                                                System.out.println("        ____.-''---''-._____        ");
                                                                System.out.println("        /  ,  \\      /  ,   \\      ");
                                                                System.out.println("       /\\  /\\     o      /\\  /\\     ");
                                                                System.out.println("       \\  |  |   o    | /.  /      ");
                                                                System.out.println("       ______|________|_________   ");
                                                                System.out.println("Oui, il était avec moi la plupart de la journée. Il était très stressé à cause du fait qu'il ne pouvait pas trouver ses matériaux.");
                                                                System.out.println("Choisissez une question à poser: \n 1. Parle-moi du femme de ménage");
                                                                option = cat.nextInt();
                                                                    if(option==1){
                                                                        System.out.println("             _____________          ");
                                                                        System.out.println("            \\___________/          ");
                                                                        System.out.println("          $$| __    __ |$$          ");
                                                                        System.out.println("             \\ 0   0  /$           ");
                                                                        System.out.println("              \\  <   /             ");                                     
                                                                        System.out.println("               \\_o__/              ");
                                                                        System.out.println("        ____.-''---''-._____        ");
                                                                        System.out.println("        /  ,  \\      /  ,   \\      ");
                                                                        System.out.println("       /\\  /\\     o      /\\  /\\     ");
                                                                        System.out.println("       \\  |  |   o    | /.  /      ");
                                                                        System.out.println("       ______|________|_________   ");
                                                                        System.out.println("Elle est nouvelle ici. De ce que je me rappelle, elle est arrivée vers 6h du matin et je ne suis pas sûre quand elle est partie mais selon son horaire elle était supposé partir envers 2h.");
                                                                        System.out.println("                               __________           ");
                                                                        System.out.println("                              /          \\          ");
                                                                        System.out.println("                            ~~            ~~        ");
                                                                        System.out.println("                              | __   __ |           ");
                                                                        System.out.println("                              \\  o  o  /           ");
                                                                        System.out.println("                               \\  <   /            ");                               
                                                                        System.out.println("                                \\_O__/	            ");
                                                                        System.out.println("                      	   ;----~\\ ~ /- ~~---,     ");
                                                                        System.out.println("                          \\     |  o  |     /      ");
                                                                        System.out.println("                           |    |  o  |     |      ");
                                                                        System.out.println("                         __|________________|____  ");
                                                                        System.out.println("C'est toutes les preuves que nous avons eu l'occasion de rassembler. Maintenant le choix est entre vos mains. Qui soupçonnez-vous d'être le meurtrier. Choisissez prudemment !");
                                                                        System.out.println("Qui pensez-vous être le responsable de ce meurtre ?\n1. La femme de ménage\n2. Le chef");
                                                                        option = cat.nextInt();
                                                                        if(option==1){
                                                                            System.out.println("____  ____     ___     _____   _ ");
                                                                            System.out.println("| __ )|  _ \\   / \\ \\   / / _ \\| |");
                                                                            System.out.println("|  _ \\| |_) | / _ \\ \\ / | |   | |");
                                                                            System.out.println("| |_) |  _ < / ___ \\ V /| |_| |_|");
                                                                            System.out.println("|____/|_| \\_/_/   \\_\\_/  \\___/(_)");
                                                                        }else if(option==2){
                                                                            System.out.println(":(");
                                                                        }else{
                                                                            System.out.println("Erreur: entrée invalide");
                                                                        }
                                                                    }else{
                                                                        System.out.println("Erreur: entrée invalide");
                                                                    }
                                                                
                                                            }else if(option==2){
                                                                System.out.println("             _____________          ");
                                                                System.out.println("            \\___________/          ");
                                                                System.out.println("          $$| __    __ |$$          ");
                                                                System.out.println("             \\ 0   0  /$           ");
                                                                System.out.println("              \\  <   /             ");                                     
                                                                System.out.println("               \\_o__/              ");
                                                                System.out.println("        ____.-''---''-._____        ");
                                                                System.out.println("        /  ,  \\      /  ,   \\      ");
                                                                System.out.println("       /\\  /\\     o      /\\  /\\     ");
                                                                System.out.println("       \\  |  |   o    | /.  /      ");
                                                                System.out.println("       ______|________|_________   ");
                                                                System.out.println("Elle est nouvelle ici. De ce que je me rappelle, elle est arrivée vers 6h du matin et je ne suis pas sûre quand elle est partie mais selon son horaire elle était supposé partir envers 2h.");        
                                                                System.out.println("Choisissez une question à poser: \n 1. Parle-moi du chef");
                                                                option = cat.nextInt();
                                                                if(option==1){
                                                                    System.out.println("             _____________          ");
                                                                    System.out.println("            \\___________/          ");
                                                                    System.out.println("          $$| __    __ |$$          ");
                                                                    System.out.println("             \\ 0   0  /$           ");
                                                                    System.out.println("              \\  <   /             ");                                     
                                                                    System.out.println("               \\_o__/              ");
                                                                    System.out.println("        ____.-''---''-._____        ");
                                                                    System.out.println("        /  ,  \\      /  ,   \\      ");
                                                                    System.out.println("       /\\  /\\     o      /\\  /\\     ");
                                                                    System.out.println("       \\  |  |   o    | /.  /      ");
                                                                    System.out.println("       ______|________|_________   ");
                                                                    System.out.println("Oui, il était avec moi la plupart de la journée. Il était très stressé à cause du fait qu'il ne pouvait pas trouver ses matériaux.");
                                                                    System.out.println("                               __________           ");
                                                                    System.out.println("                              /          \\          ");
                                                                    System.out.println("                            ~~            ~~        ");
                                                                    System.out.println("                              | __   __ |           ");
                                                                    System.out.println("                              \\  o  o  /           ");
                                                                    System.out.println("                               \\  <   /            ");                               
                                                                    System.out.println("                                \\_O__/	            ");
                                                                    System.out.println("                      	   ;----~\\ ~ /- ~~---,     ");
                                                                    System.out.println("                          \\     |  o  |     /      ");
                                                                    System.out.println("                           |    |  o  |     |      ");
                                                                    System.out.println("                         __|________________|____  ");
                                                                    System.out.println("C'est toutes les preuves que nous avons eu l'occasion de rassembler. Maintenant le choix est entre vos mains. Qui soupçonnez-vous d'être le meurtrier. Choisissez prudemment !");
                                                                        System.out.println("Qui pensez-vous être le responsable de ce meurtre ?\n1. La femme de ménage\n2. Le chef");
                                                                        option = cat.nextInt();
                                                                        if(option==1){
                                                                            System.out.println("____  ____     ___     _____   _ ");
                                                                            System.out.println("| __ )|  _ \\   / \\ \\   / / _ \\| |");
                                                                            System.out.println("|  _ \\| |_) | / _ \\ \\ / | |   | |");
                                                                            System.out.println("| |_) |  _ < / ___ \\ V /| |_| |_|");
                                                                            System.out.println("|____/|_| \\_/_/   \\_\\_/  \\___/(_)");
                                                                        }else if(option==2){
                                                                            System.out.println(":(");
                                                                        }else{
                                                                            System.out.println("Erreur: entrée invalide");
                                                                        }
                                                                }else{
                                                                    System.out.println("Erreur: entrée invalide");
                                                                }
                                                            }else{
                                                                System.out.println("Erreur: entrée invalide");
                                                            }
                                                        }else{
                                                            System.out.println("Erreur: entrée invalide");
                                                        }
        
                                                    }else{
                                                        System.out.println("Erreur: entrée invalide");
                                                    }
                                                    }
                                }else{
                                    System.out.println("Erreur: entrée invalide");
                                }
                            }
                            }else{
                                System.out.println("Erreur: entrée invalide");
                            }

                        }else{
                            System.out.println("Erreur: entrée invalide");
                        }
                }      
                }else if(option==2){
                    System.out.println("                               _________            ");
                    System.out.println("                             /  |   |  \\           ");
                    System.out.println("                             \\__|___|__/            ");
                    System.out.println("                              |        |            ");
                    System.out.println("                              |________|            ");
                    System.out.println("                             | __    __ |           ");
                    System.out.println("                              \\ o   o  /            ");
                    System.out.println("                               \\  <   /             ");                                              
                    System.out.println("                                \\_O__/	            ");
                    System.out.println("                                |    |              ");
                    System.out.println("                             /' \\ _ / `\\          ");
                    System.out.println("                            |     O      |          ");
                    System.out.println("                            |     O      |          ");
                    System.out.println("                         ___|____________|________  ");
                    System.out.println("J'étais frustrée parce que tous mes couteaux étaient en train d'être aiguisés ce jour-là, donc je n'avais pas accès à mon équipement habituel.");
                    System.out.println("Choisissez une question à poser: \n 1. Où étiez-vous quand le meurtre a eu lieu ?");
                    option = cat.nextInt();
                    if(option==1){
                        System.out.println("                               _________            ");
                        System.out.println("                             /  |   |  \\           ");
                        System.out.println("                             \\__|___|__/            ");
                        System.out.println("                              |        |            ");
                        System.out.println("                              |________|            ");
                        System.out.println("                             | __    __ |           ");
                        System.out.println("                              \\ o   o  /            ");
                        System.out.println("                               \\  <   /             ");                                              
                        System.out.println("                                \\_O__/	            ");
                        System.out.println("                                |    |              ");
                        System.out.println("                             /' \\ _ / `\\          ");
                        System.out.println("                            |     O      |          ");
                        System.out.println("                            |     O      |          ");
                        System.out.println("                         ___|____________|________  ");
                        System.out.println("J'étais dans la cuisine en train d'essayer de préparer le déjeuner.");
                        System.out.println("Choisissez une question à poser: \n 1. Alors comment avez-vous fait pour préparer le déjeuner ?");
                        option = cat.nextInt();
                        if(option==1){
                            System.out.println("                               _________            ");
                            System.out.println("                             /  |   |  \\           ");
                            System.out.println("                             \\__|___|__/            ");
                            System.out.println("                              |        |            ");
                            System.out.println("                              |________|            ");
                            System.out.println("                             | __    __ |           ");
                            System.out.println("                              \\ o   o  /            ");
                            System.out.println("                               \\  <   /             ");                                              
                            System.out.println("                                \\_O__/	            ");
                            System.out.println("                                |    |              ");
                            System.out.println("                             /' \\ _ / `\\          ");
                            System.out.println("                            |     O      |          ");
                            System.out.println("                            |     O      |          ");
                            System.out.println("                         ___|____________|________  ");
                            System.out.println("J'ai dû parler au directeur et nous avons fini par aller dans l'arrière-boutique pour trouver un peu de matériel ancien, ce qui nous a pris pas mal de temps.");
                            System.out.println("Je m'excuse mais je dois retourner à mon travail, le souper commence bientôt.");
                            System.out.println("Qui voulez-vous interroger prochainement?(1. La femme de ménage)");
                            option = cat.nextInt();
                            if(option==1){
                                System.out.println("                    ________        ");
                                System.out.println("                   /________ \\     ");
                                System.out.println("                  //( ( ( ( \\ \\   ");
                                System.out.println("                 || ( -  - ( ( |    ");
                                System.out.println("                      o  o ) ( |    ");
                                System.out.println("                 ||) )  <  ) )||    ");
                                System.out.println("                 || (\\  o ( ( ||   ");
                                System.out.println("                 |) )   \\)_  |/    ");
                                System.out.println("                 / ((\\_v_/   \\    ");
                                System.out.println("                /  /)  o    \\ \\   ");
                                System.out.println("                |  |   o    | |     ");
                                System.out.println("                |  \\   o    /  |   ");
                                System.out.println("           _____|_____________|_____");
                                System.out.println("Choisissez une question à poser: \n 1. Que faisiez-vous le jour du meurtre? \n 2. Quand êtes-vous parti de l'hôtel?");
                                option = cat.nextInt();
                                if(option==1){
                                    System.out.println("                    ________        ");
                                    System.out.println("                   /________ \\     ");
                                    System.out.println("                  //( ( ( ( \\ \\   ");
                                    System.out.println("                 || ( -  - ( ( |    ");
                                    System.out.println("                      o  o ) ( |    ");
                                    System.out.println("                 ||) )  <  ) )||    ");
                                    System.out.println("                 || (\\  o ( ( ||   ");
                                    System.out.println("                 |) )   \\)_  |/    ");
                                    System.out.println("                 / ((\\_v_/   \\    ");
                                    System.out.println("                /  /)  o    \\ \\   ");
                                    System.out.println("                |  |   o    | |     ");
                                    System.out.println("                |  \\   o    /  |   ");
                                    System.out.println("           _____|_____________|_____");
                                    System.out.println("J'ai travaillé vers 6 heures du matin et j'ai commencé à nettoyer les chambres du troisième étage.");
                                    System.out.println("Choisissez une question à poser: \n 1. Quand êtes-vous parti de l'hôtel?");
                                    option = cat.nextInt();
                                    if(option==1){
                                        System.out.println("                    ________        ");
                                        System.out.println("                   /________ \\     ");
                                        System.out.println("                  //( ( ( ( \\ \\   ");
                                        System.out.println("                 || ( -  - ( ( |    ");
                                        System.out.println("                      o  o ) ( |    ");
                                        System.out.println("                 ||) )  <  ) )||    ");
                                        System.out.println("                 || (\\  o ( ( ||   ");
                                        System.out.println("                 |) )   \\)_  |/    ");
                                        System.out.println("                 / ((\\_v_/   \\    ");
                                        System.out.println("                /  /)  o    \\ \\   ");
                                        System.out.println("                |  |   o    | |     ");
                                        System.out.println("                |  \\   o    /  |   ");
                                        System.out.println("           _____|_____________|_____");
                                        System.out.println("Vers midi.");
                                        System.out.println("Choisissez une question à poser: \n 1. Avez-vous quelque chose d'autre à ajouter?");
                                        option = cat.nextInt();
                                        if(option==1){
                                            System.out.println("                    ________        ");
                                            System.out.println("                   /________ \\     ");
                                            System.out.println("                  //( ( ( ( \\ \\   ");
                                            System.out.println("                 || ( -  - ( ( |    ");
                                            System.out.println("                      o  o ) ( |    ");
                                            System.out.println("                 ||) )  <  ) )||    ");
                                            System.out.println("                 || (\\  o ( ( ||   ");
                                            System.out.println("                 |) )   \\)_  |/    ");
                                            System.out.println("                 / ((\\_v_/   \\    ");
                                            System.out.println("                /  /)  o    \\ \\   ");
                                            System.out.println("                |  |   o    | |     ");
                                            System.out.println("                |  \\   o    /  |   ");
                                            System.out.println("           _____|_____________|_____");
                                            System.out.println("imaginez le nombre d'armes auxquelles le chef a accès");
                                            System.out.println("Choisissez une question à poser: \n 1. Avez-vous un moyen de prouver cette affirmation?");
                                            option = cat.nextInt();
                                            if(option==1){
                                                System.out.println("                    ________        ");
                                                System.out.println("                   /________ \\     ");
                                                System.out.println("                  //( ( ( ( \\ \\   ");
                                                System.out.println("                 || ( -  - ( ( |    ");
                                                System.out.println("                      o  o ) ( |    ");
                                                System.out.println("                 ||) )  <  ) )||    ");
                                                System.out.println("                 || (\\  o ( ( ||   ");
                                                System.out.println("                 |) )   \\)_  |/    ");
                                                System.out.println("                 / ((\\_v_/   \\    ");
                                                System.out.println("                /  /)  o    \\ \\   ");
                                                System.out.println("                |  |   o    | |     ");
                                                System.out.println("                |  \\   o    /  |   ");
                                                System.out.println("           _____|_____________|_____");
                                                System.out.println("Oui, j’ai le directeur comme témoin.");
                                                System.out.println("Choisissez un action: \n 1. Parler au directeur");
                                                option = cat.nextInt();
                                                if(option==1){
                                                    System.out.println("             _____________          ");
                                                    System.out.println("            \\___________/          ");
                                                    System.out.println("          $$| __    __ |$$          ");
                                                    System.out.println("             \\ 0   0  /$           ");
                                                    System.out.println("              \\  <   /             ");                                     
                                                    System.out.println("               \\_o__/              ");
                                                    System.out.println("        ____.-''---''-._____        ");
                                                    System.out.println("        /  ,  \\      /  ,   \\      ");
                                                    System.out.println("       /\\  /\\     o      /\\  /\\     ");
                                                    System.out.println("       \\  |  |   o    | /.  /      ");
                                                    System.out.println("       ______|________|_________   ");
                                                    System.out.println("Choisissez une question à poser: \n 1. Parle-moi du chef\n2. Parle-moi du femme de ménage");
                                                    option = cat.nextInt();
                                                    if(option==1){
                                                        System.out.println("             _____________          ");
                                                        System.out.println("            \\___________/          ");
                                                        System.out.println("          $$| __    __ |$$          ");
                                                        System.out.println("             \\ 0   0  /$           ");
                                                        System.out.println("              \\  <   /             ");                                     
                                                        System.out.println("               \\_o__/              ");
                                                        System.out.println("        ____.-''---''-._____        ");
                                                        System.out.println("        /  ,  \\      /  ,   \\      ");
                                                        System.out.println("       /\\  /\\     o      /\\  /\\     ");
                                                        System.out.println("       \\  |  |   o    | /.  /      ");
                                                        System.out.println("       ______|________|_________   ");
                                                        System.out.println("Oui, il était avec moi la plupart de la journée. Il était très stressé à cause du fait qu'il ne pouvait pas trouver ses matériaux.");
                                                        System.out.println("Choisissez une question à poser: \n 1. Parle-moi du femme de ménage");
                                                        option = cat.nextInt();
                                                            if(option==1){
                                                                System.out.println("             _____________          ");
                                                                System.out.println("            \\___________/          ");
                                                                System.out.println("          $$| __    __ |$$          ");
                                                                System.out.println("             \\ 0   0  /$           ");
                                                                System.out.println("              \\  <   /             ");                                     
                                                                System.out.println("               \\_o__/              ");
                                                                System.out.println("        ____.-''---''-._____        ");
                                                                System.out.println("        /  ,  \\      /  ,   \\      ");
                                                                System.out.println("       /\\  /\\     o      /\\  /\\     ");
                                                                System.out.println("       \\  |  |   o    | /.  /      ");
                                                                System.out.println("       ______|________|_________   ");
                                                                System.out.println("Elle est nouvelle ici. De ce que je me rappelle, elle est arrivée vers 6h du matin et je ne suis pas sûre quand elle est partie mais selon son horaire elle était supposé partir envers 2h.");
                                                                System.out.println("                               __________           ");
                                                                System.out.println("                              /          \\          ");
                                                                System.out.println("                            ~~            ~~        ");
                                                                System.out.println("                              | __   __ |           ");
                                                                System.out.println("                              \\  o  o  /           ");
                                                                System.out.println("                               \\  <   /            ");                               
                                                                System.out.println("                                \\_O__/	            ");
                                                                System.out.println("                      	   ;----~\\ ~ /- ~~---,     ");
                                                                System.out.println("                          \\     |  o  |     /      ");
                                                                System.out.println("                           |    |  o  |     |      ");
                                                                System.out.println("                         __|________________|____  ");
                                                                System.out.println("C'est toutes les preuves que nous avons eu l'occasion de rassembler. Maintenant le choix est entre vos mains. Qui soupçonnez-vous d'être le meurtrier. Choisissez prudemment !");
                                                                System.out.println("Qui pensez-vous être le responsable de ce meurtre ?\n1. La femme de ménage\n2. Le chef");
                                                                option = cat.nextInt();
                                                                if(option==1){
                                                                    System.out.println("____  ____     ___     _____   _ ");
                                                                    System.out.println("| __ )|  _ \\   / \\ \\   / / _ \\| |");
                                                                    System.out.println("|  _ \\| |_) | / _ \\ \\ / | |   | |");
                                                                    System.out.println("| |_) |  _ < / ___ \\ V /| |_| |_|");
                                                                    System.out.println("|____/|_| \\_/_/   \\_\\_/  \\___/(_)");
                                                                }else if(option==2){
                                                                    System.out.println(":(");
                                                                }else{
                                                                    System.out.println("Erreur: entrée invalide");
                                                                }
                                                            }else{
                                                                System.out.println("Erreur: entrée invalide");
                                                            }
                                                        
                                                    }else if(option==2){
                                                        System.out.println("             _____________          ");
                                                        System.out.println("            \\___________/          ");
                                                        System.out.println("          $$| __    __ |$$          ");
                                                        System.out.println("             \\ 0   0  /$           ");
                                                        System.out.println("              \\  <   /             ");                                     
                                                        System.out.println("               \\_o__/              ");
                                                        System.out.println("        ____.-''---''-._____        ");
                                                        System.out.println("        /  ,  \\      /  ,   \\      ");
                                                        System.out.println("       /\\  /\\     o      /\\  /\\     ");
                                                        System.out.println("       \\  |  |   o    | /.  /      ");
                                                        System.out.println("       ______|________|_________   ");
                                                        System.out.println("Elle est nouvelle ici. De ce que je me rappelle, elle est arrivée vers 6h du matin et je ne suis pas sûre quand elle est partie mais selon son horaire elle était supposé partir envers 2h.");        
                                                        System.out.println("Choisissez une question à poser: \n 1. Parle-moi du chef");
                                                        option = cat.nextInt();
                                                        if(option==1){
                                                            System.out.println("             _____________          ");
                                                            System.out.println("            \\___________/          ");
                                                            System.out.println("          $$| __    __ |$$          ");
                                                            System.out.println("             \\ 0   0  /$           ");
                                                            System.out.println("              \\  <   /             ");                                     
                                                            System.out.println("               \\_o__/              ");
                                                            System.out.println("        ____.-''---''-._____        ");
                                                            System.out.println("        /  ,  \\      /  ,   \\      ");
                                                            System.out.println("       /\\  /\\     o      /\\  /\\     ");
                                                            System.out.println("       \\  |  |   o    | /.  /      ");
                                                            System.out.println("       ______|________|_________   ");
                                                            System.out.println("Oui, il était avec moi la plupart de la journée. Il était très stressé à cause du fait qu'il ne pouvait pas trouver ses matériaux.");
                                                            System.out.println("                               __________           ");
                                                            System.out.println("                              /          \\          ");
                                                            System.out.println("                            ~~            ~~        ");
                                                            System.out.println("                              | __   __ |           ");
                                                            System.out.println("                              \\  o  o  /           ");
                                                            System.out.println("                               \\  <   /            ");                               
                                                            System.out.println("                                \\_O__/	            ");
                                                            System.out.println("                      	   ;----~\\ ~ /- ~~---,     ");
                                                            System.out.println("                          \\     |  o  |     /      ");
                                                            System.out.println("                           |    |  o  |     |      ");
                                                            System.out.println("                         __|________________|____  ");
                                                            System.out.println("C'est toutes les preuves que nous avons eu l'occasion de rassembler. Maintenant le choix est entre vos mains. Qui soupçonnez-vous d'être le meurtrier. Choisissez prudemment !");
                                                                System.out.println("Qui pensez-vous être le responsable de ce meurtre ?\n1. La femme de ménage\n2. Le chef");
                                                                option = cat.nextInt();
                                                                if(option==1){
                                                                    System.out.println("____  ____     ___     _____   _ ");
                                                                    System.out.println("| __ )|  _ \\   / \\ \\   / / _ \\| |");
                                                                    System.out.println("|  _ \\| |_) | / _ \\ \\ / | |   | |");
                                                                    System.out.println("| |_) |  _ < / ___ \\ V /| |_| |_|");
                                                                    System.out.println("|____/|_| \\_/_/   \\_\\_/  \\___/(_)");
                                                                }else if(option==2){
                                                                    System.out.println(":(");
                                                                }else{
                                                                    System.out.println("Erreur: entrée invalide");
                                                                }
                                                        }else{
                                                            System.out.println("Erreur: entrée invalide");
                                                        }
                                                    }else{
                                                        System.out.println("Erreur: entrée invalide");
                                                    }
                                                }else{
                                                    System.out.println("Erreur: entrée invalide");
                                                }

                                            }else{
                                                System.out.println("Erreur: entrée invalide");
                                            }
                                        }else{
                                            System.out.println("Erreur: entrée invalide");
                                        }
                                    }else{
                                        System.out.println("Erreur: entrée invalide");
                                    }
                                }else if(option==2){
                                    System.out.println("                    ________        ");
                                    System.out.println("                   /________ \\     ");
                                    System.out.println("                  //( ( ( ( \\ \\   ");
                                    System.out.println("                 || ( -  - ( ( |    ");
                                    System.out.println("                      o  o ) ( |    ");
                                    System.out.println("                 ||) )  <  ) )||    ");
                                    System.out.println("                 || (\\  o ( ( ||   ");
                                    System.out.println("                 |) )   \\)_  |/    ");
                                    System.out.println("                 / ((\\_v_/   \\    ");
                                    System.out.println("                /  /)  o    \\ \\   ");
                                    System.out.println("                |  |   o    | |     ");
                                    System.out.println("                |  \\   o    /  |   ");
                                    System.out.println("           _____|_____________|_____");
                                    System.out.println("Vers midi.");
                                        System.out.println("Choisissez une question à poser: \n 1. Que faisiez-vous le jour du meurtre?");
                                        option = cat.nextInt();
                                            if(option==1){
                                                System.out.println("                    ________        ");
                                                System.out.println("                   /________ \\     ");
                                                System.out.println("                  //( ( ( ( \\ \\   ");
                                                System.out.println("                 || ( -  - ( ( |    ");
                                                System.out.println("                      o  o ) ( |    ");
                                                System.out.println("                 ||) )  <  ) )||    ");
                                                System.out.println("                 || (\\  o ( ( ||   ");
                                                System.out.println("                 |) )   \\)_  |/    ");
                                                System.out.println("                 / ((\\_v_/   \\    ");
                                                System.out.println("                /  /)  o    \\ \\   ");
                                                System.out.println("                |  |   o    | |     ");
                                                System.out.println("                |  \\   o    /  |   ");
                                                System.out.println("           _____|_____________|_____");
                                                System.out.println("J'ai travaillé vers 6 heures du matin et j'ai commencé à nettoyer les chambres du troisième étage.");
                                                System.out.println("Choisissez une question à poser: \n 1. Avez-vous quelque chose d'autre à ajouter?");
                                                option = cat.nextInt();
                                                if(option==1){
                                                    System.out.println("                    ________        ");
                                                    System.out.println("                   /________ \\     ");
                                                    System.out.println("                  //( ( ( ( \\ \\   ");
                                                    System.out.println("                 || ( -  - ( ( |    ");
                                                    System.out.println("                      o  o ) ( |    ");
                                                    System.out.println("                 ||) )  <  ) )||    ");
                                                    System.out.println("                 || (\\  o ( ( ||   ");
                                                    System.out.println("                 |) )   \\)_  |/    ");
                                                    System.out.println("                 / ((\\_v_/   \\    ");
                                                    System.out.println("                /  /)  o    \\ \\   ");
                                                    System.out.println("                |  |   o    | |     ");
                                                    System.out.println("                |  \\   o    /  |   ");
                                                    System.out.println("           _____|_____________|_____");
                                                    System.out.println("imaginez le nombre d'armes auxquelles le chef a accès");
                                                    System.out.println("Choisissez une question à poser: \n 1. Avez-vous un moyen de prouver cette affirmation?");
                                                    option = cat.nextInt();
                                                    if(option==1){
                                                        System.out.println("                    ________        ");
                                                        System.out.println("                   /________ \\     ");
                                                        System.out.println("                  //( ( ( ( \\ \\   ");
                                                        System.out.println("                 || ( -  - ( ( |    ");
                                                        System.out.println("                      o  o ) ( |    ");
                                                        System.out.println("                 ||) )  <  ) )||    ");
                                                        System.out.println("                 || (\\  o ( ( ||   ");
                                                        System.out.println("                 |) )   \\)_  |/    ");
                                                        System.out.println("                 / ((\\_v_/   \\    ");
                                                        System.out.println("                /  /)  o    \\ \\   ");
                                                        System.out.println("                |  |   o    | |     ");
                                                        System.out.println("                |  \\   o    /  |   ");
                                                        System.out.println("           _____|_____________|_____");
                                                        System.out.println("Oui, j’ai le directeur comme témoin.");
                                                        System.out.println("Choisissez un action: \n 1. Parler au directeur");
                                                        option = cat.nextInt();
                                                        if(option==1){
                                                            System.out.println("             _____________          ");
                                                            System.out.println("            \\___________/          ");
                                                            System.out.println("          $$| __    __ |$$          ");
                                                            System.out.println("             \\ 0   0  /$           ");
                                                            System.out.println("              \\  <   /             ");                                     
                                                            System.out.println("               \\_o__/              ");
                                                            System.out.println("        ____.-''---''-._____        ");
                                                            System.out.println("        /  ,  \\      /  ,   \\      ");
                                                            System.out.println("       /\\  /\\     o      /\\  /\\     ");
                                                            System.out.println("       \\  |  |   o    | /.  /      ");
                                                            System.out.println("        ______|________|_________   ");
                                                            System.out.println("Choisissez une question à poser: \n 1. Parle-moi du chef\n2. Parle-moi du femme de ménage");
                                                            option = cat.nextInt();
                                                            if(option==1){
                                                                System.out.println("             _____________          ");
                                                                System.out.println("            \\___________/          ");
                                                                System.out.println("          $$| __    __ |$$          ");
                                                                System.out.println("             \\ 0   0  /$           ");
                                                                System.out.println("              \\  <   /             ");                                     
                                                                System.out.println("               \\_o__/              ");
                                                                System.out.println("        ____.-''---''-._____        ");
                                                                System.out.println("        /  ,  \\      /  ,   \\      ");
                                                                System.out.println("       /\\  /\\     o      /\\  /\\     ");
                                                                System.out.println("       \\  |  |   o    | /.  /      ");
                                                                System.out.println("       ______|________|_________   ");
                                                                System.out.println("Oui, il était avec moi la plupart de la journée. Il était très stressé à cause du fait qu'il ne pouvait pas trouver ses matériaux.");
                                                                System.out.println("Choisissez une question à poser: \n 1. Parle-moi du femme de ménage");
                                                                option = cat.nextInt();
                                                                    if(option==1){
                                                                        System.out.println("             _____________          ");
                                                                        System.out.println("            \\___________/          ");
                                                                        System.out.println("          $$| __    __ |$$          ");
                                                                        System.out.println("             \\ 0   0  /$           ");
                                                                        System.out.println("              \\  <   /             ");                                     
                                                                        System.out.println("               \\_o__/              ");
                                                                        System.out.println("        ____.-''---''-._____        ");
                                                                        System.out.println("        /  ,  \\      /  ,   \\      ");
                                                                        System.out.println("       /\\  /\\     o      /\\  /\\     ");
                                                                        System.out.println("       \\  |  |   o    | /.  /      ");
                                                                        System.out.println("       ______|________|_________   ");
                                                                        System.out.println("Elle est nouvelle ici. De ce que je me rappelle, elle est arrivée vers 6h du matin et je ne suis pas sûre quand elle est partie mais selon son horaire elle était supposé partir envers 2h.");
                                                                        System.out.println("                               __________           ");
                                                                        System.out.println("                              /          \\          ");
                                                                        System.out.println("                            ~~            ~~        ");
                                                                        System.out.println("                              | __   __ |           ");
                                                                        System.out.println("                              \\  o  o  /           ");
                                                                        System.out.println("                               \\  <   /            ");                               
                                                                        System.out.println("                                \\_O__/	            ");
                                                                        System.out.println("                      	   ;----~\\ ~ /- ~~---,     ");
                                                                        System.out.println("                          \\     |  o  |     /      ");
                                                                        System.out.println("                           |    |  o  |     |      ");
                                                                        System.out.println("                         __|________________|____  ");
                                                                        System.out.println("C'est toutes les preuves que nous avons eu l'occasion de rassembler. Maintenant le choix est entre vos mains. Qui soupçonnez-vous d'être le meurtrier. Choisissez prudemment !");
                                                                        System.out.println("Qui pensez-vous être le responsable de ce meurtre ?\n1. La femme de ménage\n2. Le chef");
                                                                        option = cat.nextInt();
                                                                        if(option==1){
                                                                            System.out.println("____  ____     ___     _____   _ ");
                                                                            System.out.println("| __ )|  _ \\   / \\ \\   / / _ \\| |");
                                                                            System.out.println("|  _ \\| |_) | / _ \\ \\ / | |   | |");
                                                                            System.out.println("| |_) |  _ < / ___ \\ V /| |_| |_|");
                                                                            System.out.println("|____/|_| \\_/_/   \\_\\_/  \\___/(_)");
                                                                        }else if(option==2){
                                                                            System.out.println(":(");
                                                                        }else{
                                                                            System.out.println("Erreur: entrée invalide");
                                                                        }
                                                                    }else{
                                                                        System.out.println("Erreur: entrée invalide");
                                                                    }
                                                                
                                                            }else if(option==2){
                                                                System.out.println("             _____________          ");
                                                                System.out.println("            \\___________/          ");
                                                                System.out.println("          $$| __    __ |$$          ");
                                                                System.out.println("             \\ 0   0  /$           ");
                                                                System.out.println("              \\  <   /             ");                                     
                                                                System.out.println("               \\_o__/              ");
                                                                System.out.println("        ____.-''---''-._____        ");
                                                                System.out.println("        /  ,  \\      /  ,   \\      ");
                                                                System.out.println("       /\\  /\\     o      /\\  /\\     ");
                                                                System.out.println("       \\  |  |   o    | /.  /      ");
                                                                System.out.println("       ______|________|_________   ");
                                                                System.out.println("Elle est nouvelle ici. De ce que je me rappelle, elle est arrivée vers 6h du matin et je ne suis pas sûre quand elle est partie mais selon son horaire elle était supposé partir envers 2h.");        
                                                                System.out.println("Choisissez une question à poser: \n 1. Parle-moi du chef");
                                                                option = cat.nextInt();
                                                                if(option==1){
                                                                    System.out.println("             _____________          ");
                                                                    System.out.println("            \\___________/          ");
                                                                    System.out.println("          $$| __    __ |$$          ");
                                                                    System.out.println("             \\ 0   0  /$           ");
                                                                    System.out.println("              \\  <   /             ");                                     
                                                                    System.out.println("               \\_o__/              ");
                                                                    System.out.println("        ____.-''---''-._____        ");
                                                                    System.out.println("        /  ,  \\      /  ,   \\      ");
                                                                    System.out.println("       /\\  /\\     o      /\\  /\\     ");
                                                                    System.out.println("       \\  |  |   o    | /.  /      ");
                                                                    System.out.println("       ______|________|_________   ");
                                                                    System.out.println("Oui, il était avec moi la plupart de la journée. Il était très stressé à cause du fait qu'il ne pouvait pas trouver ses matériaux.");
                                                                    System.out.println("                               __________           ");
                                                                    System.out.println("                              /          \\          ");
                                                                    System.out.println("                            ~~            ~~        ");
                                                                    System.out.println("                              | __   __ |           ");
                                                                    System.out.println("                              \\  o  o  /           ");
                                                                    System.out.println("                               \\  <   /            ");                               
                                                                    System.out.println("                                \\_O__/	            ");
                                                                    System.out.println("                      	   ;----~\\ ~ /- ~~---,     ");
                                                                    System.out.println("                          \\     |  o  |     /      ");
                                                                    System.out.println("                           |    |  o  |     |      ");
                                                                    System.out.println("                         __|________________|____  ");
                                                                    System.out.println("C'est toutes les preuves que nous avons eu l'occasion de rassembler. Maintenant le choix est entre vos mains. Qui soupçonnez-vous d'être le meurtrier. Choisissez prudemment !");
                                                                        System.out.println("Qui pensez-vous être le responsable de ce meurtre ?\n1. La femme de ménage\n2. Le chef");
                                                                        option = cat.nextInt();
                                                                        if(option==1){
                                                                            System.out.println("____  ____     ___     _____   _ ");
                                                                            System.out.println("| __ )|  _ \\   / \\ \\   / / _ \\| |");
                                                                            System.out.println("|  _ \\| |_) | / _ \\ \\ / | |   | |");
                                                                            System.out.println("| |_) |  _ < / ___ \\ V /| |_| |_|");
                                                                            System.out.println("|____/|_| \\_/_/   \\_\\_/  \\___/(_)");
                                                                        }else if(option==2){
                                                                            System.out.println(":(");
                                                                        }else{
                                                                            System.out.println("Erreur: entrée invalide");
                                                                        }
                                                                }else{
                                                                    System.out.println("Erreur: entrée invalide");
                                                                }
                                                            }else{
                                                                System.out.println("Erreur: entrée invalide");
                                                            }
                                                        }else{
                                                            System.out.println("Erreur: entrée invalide");
                                                        }
        
                                                    }else{
                                                        System.out.println("Erreur: entrée invalide");
                                                    }
                                                    }
                                }else{
                                    System.out.println("Erreur: entrée invalide");
                                }
                            }
                                }else{
                                    System.out.println("Erreur: entrée invalide");
                                }
                            }else{
                                System.out.println("Erreur: entrée invalide");
                            }

                        }else{
                            System.out.println("Erreur: entrée invalide");
                        }
                    }else{
                        System.out.println("Erreur: entrée invalide");
                    }
                    option = cat.nextInt();
                }else{
                    System.out.println("Erreur: entrée invalide");
                }
            
            }
        }
    } 