# :writing_hand: Project-IHM-Calculator 
## Introduction :camera_flash: :
Aujourd'hui , L'informatique est nécessaire dans notre  vie quotidienne et c'est grace à elle qu'on suivre nos études , traviller et faire des courses  à distance sans . Toutes c'est activités nécessitent  des applactions qui sont des  programmes programmées par une Language informatique spécifique . 

Ce Projet IHM est pour le but de réaliser une Calculatrice similaire de celle  qui existe dans tous les systémes d'exploiation .
<b> → </b> Une Calculatrice est une application ou plus tot une appareil qui permet de réaliser des opération mathématique .
## Technologies Utilisées  :flashlight: : 
   ### :one: Java :
   Java est un langage de programmation créé par James Gosling et Patrick Naughton, employés de Sun Microsystems (entreprise aujourd'hui rachetée par Oracle Corporation), lancé le 23 mai 1995. Java est un langage dédié à la programmation orientée objet et l'un des deux langages de programmation les plus employés. À l'heure actuelle, il est très utilisé pour des programmes de moyenne envergure, dans la gestion des entreprises notamment. Du fait du développement de l’informatique qui est aujourd’hui de plus en plus omniprésent dans notre monde, ce langage est de plus en plus utilisé par les entreprises, entrainant une augmentation d’emplois et de métiers dans ce domaine et un intérêt de plus grand pour ce langage qui peut être appris aujourd’hui dans de nombreuses écoles, ou encore sur internet à l’aide de plusieurs plateformes comme YouTube
ou OpenClassRoom.
   ### :two: Swing : 
   Swing propose de nombreux composants dont certains possèdent des fonctions étendues, une utilisation des mécanismes de gestion d'événements performants (ceux introduits par le JDK 1.1) et une apparence modifiable à la volée (une interface graphique qui emploie le style du système d'exploitation Windows ou Motif ou un nouveau style spécifique à Java nommé Metal).

Tous les éléments de Swing font partie d'un package qui a changé plusieurs fois de nom : le nom du package dépend de la version du J.D.K. utilisée :

    com.sun.java.swing : jusqu'à la version 1.1 beta 2 de Swing, de la version 1.1 des JFC et de la version 1.2 beta 4 du J.D.K.
    java.awt.swing : utilisé par le J.D.K. 1.2 beta 2 et 3
    javax.swing : à partir des versions de Swing 1.1 beta 3 et J.D.K. 1.2 RC1

Les composants Swing forment un nouvelle hiérarchie parallèle à celle de l'AWT. L'ancêtre de cette hiérarchie est le composant JComponent. Presque tous ses composants sont écrits en pur Java : ils ne possèdent aucune partie native sauf ceux qui assurent l'interface avec le système d'exploitation : JApplet, JDialog, JFrame, et JWindow. Cela permet aux composants de toujours avoir la même apparence quelque soit le système sur lequel l'application s'exécute.

Tous les composants Swing possèdent les caractéristiques suivantes :

    ce sont des beans
    ce sont des composants légers (pas de partie native) hormis quelques exceptions.
    leurs bords peuvent être changés

La procédure à suivre pour utiliser un composant Swing est identique à celle des composants de la bibliothèque AWT : créer le composant en appelant son constructeur, appeler les méthodes du composant si nécessaire pour le personnaliser et l'ajouter dans un conteneur.

Swing utilise la même infrastructure de classes qu'AWT, ce qui permet de mélanger des composants Swing et AWT dans la même interface. Il est toutefois recommandé d'éviter de les utiliser simultanément car certains peuvent ne pas être restitués correctement.

Les composants Swing utilisent des modèles pour contenir leurs états ou leurs données. Ces modèles sont des classes particulières qui possèdent toutes un comportement par défaut.
   ### :three: Eclipse:
   Eclipse est un IDE, Integrated Development Environment (EDI environnement de développement intégré en français), c'est-à-
dire un logiciel qui simplifie la programmation en proposant un certain nombre de raccourcis et d'aide à la programmation. Il
est développé par IBM, est gratuit et disponible pour la plupart des systèmes d'exploitation.
## Cahier des charges :books: : 
  Ce projet doit avoir ces fonctionnalités suivantes :
   *   Conversions entre Binaires , Octales et Hexadécimales.
   *   Basculer entre le monde Standard et le monde scientifique en clique sur button sci .
   *   Les Fonctionalités de deux Modes :<br/>
        ##### :one: Mode standard :
        * Des Buttons définies les nombres et les opérations de calcul <br/>
                            →  La Multiplication .<br/>
                            →  L'Addition .<br/>
                            →  La Soustraction .<br/>
                            →  La Divistion <br/>
        * Un button de pourcentage .
        * Un boutton de signe négatif.<br/>
        ##### :two: Mode Scientifique :
     Concernat ce mode d'utilisation , on ajoute des functions les plus utilisés par exemple : 
        - Le Logarithmes .
        - Les Sin , Cos , Tan . 
        - L'inverse 1/x .
        - Un button de pourcentage .
        - Un boutton de ségine  négatif . 
     et aussi le codage des chiffres dans  les différentes bases comme  : 
        - Binaire
        - Octale 
        - Hexadécimale  
 ## :red_circle: Calculatrice : 
  la calculatrice qu'on va programmer , sera avec une interface graphique , c'est-à-dire qu'on sera besoin une fénetre qui presente l'interface graphique , Menu Bar  et buttons .
Pour organiser mon code j'ai séparé chaque partie dans un seul programme , c'est-à-dire que je vais  créer une fonction pour présenter le menu de bar qui s'appelle MenuBar() et une autre pour l'affichage nommée Text() et ausi une function pour fenetre qui s'appelle UI() et pour les Buttons on a le Button() . <br/>
   ###### :arrow_right_hook: Variable Déclarée :
   * Menu Bar content : 
       -  Un Ficher qui contient Quitter .
       -  L'Aide qui contient Apropos 
   * Button : 
       - log 
       - Racine 
       - exp 
       - sin 
       - les chiffres 
       - ..... <br/>
  
###### :arrow_right: Dans le Constructeur on va faire l'apples du tous ces Functions . 
## :film_strip: Screen du L'application : 
  ### :pushpin: Mode Standard :
<img src="https://github.com/sokainadaabal/Project-IHM-Calculator/blob/master/img/Screenshot%20from%202020-04-02%2007-16-54.jpg"></img>
  ### :pushpin:  Mode Scientifique :
  pour passer :arrow_right: vers le mode Scientifique on :computer_mouse: clique sur SCI
  <img src="https://github.com/sokainadaabal/Project-IHM-Calculator/blob/master/img/Screenshot%20from%202020-04-02%2007-19-00.jpg"></img>
  ### :pushpin:  Menu Bar:
   Sur le menu bar existe de button ficher et aide . 
   * Ficher :arrow_right: Quitter  → pour fermer l'application  on peut aussi cliquer sur Off .
    <img src="https://github.com/sokainadaabal/Project-IHM-Calculator/blob/master/img/WhatsApp%20Image%202020-04-02%20at%2007.33.47.jpg" ></img>
   * Aide : apropos .<br/>
   <img src="https://github.com/sokainadaabal/Project-IHM-Calculator/blob/master/img/WhatsApp%20Image%202020-04-02%20at%2007.34.00.jpg"></img>  
   * En clique :computer_mouse:  sur apropos va afficher un message box pour me contacer si il ya  une erreur ou problème . 
   <img src="https://github.com/sokainadaabal/Project-IHM-Calculator/blob/master/img/Screenshot from 2020-04-02 07-38-15.jpg"></img>
  ## Conclusion  :bangbang::
Je tenais à remercier Mon chére Professeur Mr Baddi Youssef , Doctorant et Professeur assistant à L'école supérieure de téchnologie de Sidi Bennour, pour son soutien et son encadrant anisi le partage de l'inforamtion , et grace à lui on a cette opportunité d'améliorer et tester  mes compétences et de connaître les nouvelles technologies comme ces géantes que elle j'ai travaillée    :pray: :pray: :pray: :pray: .
             
 
   
Plus sur MR [Baddi Youssef](https://https://www.linkedin.com/in/youssefbaddi/?locale=fr_FR).

Crée Par : Sokaina Daabal
